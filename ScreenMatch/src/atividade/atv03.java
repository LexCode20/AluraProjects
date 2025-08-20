    package atividade;

    import com.sun.tools.jconsole.JConsoleContext;

    import java.io.IOException;
    import java.net.URI;
    import java.net.http.HttpClient;
    import java.net.http.HttpRequest;
    import java.net.http.HttpResponse;
    import java.util.Scanner;

    public class atv03 {
        public static void main(String[] args) throws IOException, InterruptedException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bem vindo a consulta de usuários da GitHub\nDigite o nome de um usuário: ");
            var usuario = sc.nextLine();
            String endereco = "https://api.github.com/users/" + usuario/*.replace(" ", "+")*/;
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco)).build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == 404) {
                    throw new ErroConsultaGitHubException("Usuário " + usuario + " Não existe no GitHub");
                }
                System.out.println(response.body());
            }catch (ErroConsultaGitHubException e){
                System.out.println("Erro de consulta: "+e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Erro de consulta, não pode haver espaçamentos entre os caracteres.");
            }finally {
                System.out.println("Programa finalizado!");
            }
        }
    }
