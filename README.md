
 

1. `package primeiroprograma;`: Esta linha declara que a classe está no pacote chamado `primeiroprograma`.

2. `import java.util.Scanner;`: Esta linha importa a classe `Scanner` do pacote `java.util`, que é usada para ler a entrada do usuário.

3. `public class Calculadora {`: Aqui começa a declaração da classe `Calculadora`.

4. `public static void main(String[] args) {`: Este é o método principal `main`, onde o programa começa a ser executado.

5. `Scanner sc = new Scanner(System.in);`: Cria um objeto Scanner chamado `sc` para ler a entrada do usuário a partir do console.

6. `double n1, n2, resultado;`: Declara três variáveis do tipo `double` para armazenar os números de entrada e o resultado da operação.

7. `int soma;`: Declara uma variável do tipo `int` para armazenar a escolha da operação.

8. `System.out.println("Digite o primeiro valor: ");`: Exibe uma mensagem solicitando ao usuário que digite o primeiro número.

9. `n1 = sc.nextInt();`: Lê o primeiro número digitado pelo usuário.

10. `System.out.println("Digite o segundo valor: ");`: Exibe uma mensagem solicitando ao usuário que digite o segundo número.

11. `n2 = sc.nextInt();`: Lê o segundo número digitado pelo usuário.

12. `System.out.println("escolha o operador");`: Exibe uma mensagem solicitando ao usuário que escolha a operação desejada.

13. As linhas seguintes (14 a 17) exibem as opções disponíveis para operações matemáticas.

14. `soma = sc.nextInt();`: Lê a escolha da operação feita pelo usuário.

15. `switch (soma) {`: Inicia uma estrutura de controle `switch` baseada no valor da variável `soma`.

16. `case 1:`: Caso `soma` seja igual a 1, executa o código dentro deste caso.

17. `resultado = (n1 + n2);`: Realiza a operação de soma e armazena o resultado na variável `resultado`.

18. `System.out.println(resultado);`: Exibe o resultado da operação.

19. `break;`: Sai do `switch`.

20. Os casos `2`, `3` e `4` fazem operações semelhantes para subtração, divisão e multiplicação, respectivamente.

Esse é um programa simples de calculadora que permite ao usuário escolher uma operação matemática básica e calcular o resultado usando os números fornecidos.
