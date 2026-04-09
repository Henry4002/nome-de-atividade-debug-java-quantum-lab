🧪 Plano de Testes — Sistema de Operações Matemáticas
Descrição:
Testes realizados para validar o funcionamento do código e identificar erros de lógica e estrutura com base na versão correta.

⚠️ Teste 001 — Uso incorreto da operação de soma
Entrada: 1 (Soma), números: 5 e 3
Resultado esperado:
O sistema deve somar os valores (5 + 3 = 8).
Resultado obtido:
❌ Foi utilizada multiplicação (*) no lugar da soma (+), retornando resultado incorreto.

⚠️ Teste 002 — Uso incorreto da operação de subtração
Entrada: 2 (Subtração), números: 10 e 2
Resultado esperado:
O sistema deve subtrair os valores (10 - 2 = 8).
Resultado obtido:
❌ Foi utilizada divisão (/) no lugar da subtração (-), retornando resultado incorreto.

⚠️ Teste 003 — Estrutura de repetição inadequada
Entrada: Qualquer valor
Resultado esperado:
O sistema deve continuar exibindo o menu até o usuário escolher sair (loop com while).
Resultado obtido:
❌ O código utiliza for fixo que executa apenas 3 vezes e não controla a lógica do sistema corretamente.

⚠️ Teste 004 — Exibição incorreta do nome do usuário
Entrada: Nome digitado pelo usuário
Resultado esperado:
O sistema deve exibir o nome informado pelo usuário.
Resultado obtido:
❌ O código imprime um nome fixo ("Matheus") em vez de utilizar a variável nome.

⚠️ Teste 005 — Ausência de tratamento de erros
Entrada: Letra ao invés de número
Resultado esperado:
O sistema deve tratar erro e solicitar nova entrada.
Resultado obtido:
❌ O código não possui try/catch, causando possível quebra do programa.

⚠️ Teste 006 — Estrutura do menu não interativa
Entrada: Qualquer opção
Resultado esperado:
O sistema deve permitir múltiplas operações até o usuário escolher sair.
Resultado obtido:
❌ O menu é exibido apenas uma vez e o programa encerra após uma execução.

⚠️ Teste 007 — Uso desnecessário de laço no case 3
Entrada: Opção 3
Resultado esperado:
O sistema deve apenas encerrar o programa.
Resultado obtido:
❌ Foi utilizado um for desnecessário exibindo mensagens repetidas.

📌 Conclusão
O sistema apresenta falhas em:

Lógica das operações matemáticas
Estrutura de repetição
Uso correto de variáveis
Tratamento de erros
Organização do fluxo do programa

Esses problemas comprometem o funcionamento correto do sistema, sendo necessário ajustar a lógica para que o programa se comporte conforme esperado.