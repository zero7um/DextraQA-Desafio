<h1>Dextra - Desafio Técnico</h1>

<h2>Apresentação</h2>

Este projeto foi desenvolvido com o objetivo de entregar a resolução do desafio proposto pela <b>Dextra</b> para a posição de QA Engineer e conta com a resolução das perguntas propostas nos arquivos anexados:

[Arquivo com respostas 1](https://github.com/zero7um/DextraQA-Desafio/blob/main/attachments/Quest%C3%B5es_Dextra_-_v2.docx.pdf)

[Arquivo com respostas 2](https://github.com/zero7um/DextraQA-Desafio/blob/main/attachments/Quest%C3%B5es_Dextra_V3.pdf)

E [aqui](https://github.com/zero7um/DextraQA-Desafio/blob/main/src/test/java/com/dextra/DesafioDextra.java) é possível encontrar o script de automação de um cenário apresentado para o site http://www.lourencodemonaco.com.br/vvtest 

<h2>Execução do projeto</h2>

<h3>Pré condições</h3>

1. É necessário ter instalado a versão 8 ou superior do Java e ter as corretas variáveis de ambiente em seu computador
2. É necessário ter a versão mais atual do Chromedriver disponível em seu computador. Na pasta de anexos, você poderá encontrar a versão 89 do [chromedriver](https://github.com/zero7um/DextraQA-Desafio/blob/main/attachments/chromedriver.exe) 
3. Clone o repositório em uma pasta de sua preferência em seu computador 
4. Ter uma IDE de sua preferência para a execução do projeto. Recomendo utilizar o [IntelliJ IDEA Community Edition](https://www.jetbrains.com/pt-br/idea/download/#section=windows)

<h2>Plano de testes</h2>

Após a validação manual do cenário proposto foi verificado que seu fluxo atende ao solicitado e um teste baseado em sua descrição foi realizado de modo automatizado:


<h3>Testes não funcionais</h3>

<b>Verificação da performance do Front-end: </b>
Utilizando o Google Pagespeed Insights avaliei a performance do script do Front-end e obtive as seguintes análises:

1. Para desktop a aplicação alcançou a pontuação 70/100:

![](https://github.com/zero7um/DextraQA-Desafio/blob/main/attachments/img4.png)
![](https://github.com/zero7um/DextraQA-Desafio/blob/main/attachments/img5.png)
![](https://github.com/zero7um/DextraQA-Desafio/blob/main/attachments/img6.png)



2. Para acesso via dispositivos móveis a performance foi avaliada com uma pontuação 19/100. O que é considerado extremamente baixo, abaixo as análises e possiveis melhorias.

![](https://github.com/zero7um/DextraQA-Desafio/blob/main/attachments/img1.png)
![](https://github.com/zero7um/DextraQA-Desafio/blob/main/attachments/img2.png)
![](https://github.com/zero7um/DextraQA-Desafio/blob/main/attachments/img3.png)

<b>Verificação da acessibilidade:</b> 

Através do [Achecker](https://achecker.ca/checker/index.php) foi possível gerar os seguintes relatórios de problemas de acessbilidade com os respectivos erros:

Problemas possivelmente conhecidos: 21 encontrados
Potenciais problemas: 158 encontrados

[Aqui](https://github.com/zero7um/DextraQA-Desafio/blob/main/attachments/Relatorio_acessibilidade.pdf) é possível encontrar um relatório detalhado dos problemas indicados.
