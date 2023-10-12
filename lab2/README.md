# Lab 2

## Exercicio 2.1

No exercício a) eu cheguei a fazer o ponto 3.4 para me familiarizar com o functionamento dos Handlers.
Para o exercício b) coloquei requestParams do tipo "msgN", onde N varia entre 1 e 6, que correpondem a diferentes <hN> tags de html.

## Exercicio 2.2

No exercício d), em vez de seguir o exemplo no link dado, tentei recriar o ponto 2.1 a partir do template que o IntelliJ criou.
Para o ficheiro `compose.yml` tive de fazer algumas alterações para correponder ao caminho do tomcat no macOS, juntamente com a mudança para o port 8081, visto que já tinha algo a ocupar os ports 8080 e 8888.
Corri o bash `$ docker-compose up` para utilizar o meu pacote `.war` da applicação num container a correr o tomcat. Usei `$ docker-compose down` para parar.

## Exercicio 2.3

Utilizar o Spring boot foi bastante intuitivo, e os exercícios b) e c) foram fáceis de implementar, pois ja estava familiarizado com Controllers e RestControllers. Utilizei `$ curl -v http://localhost:8081/greeting` e `$ curl -v http://localhost:8081/restgreeting` para testar os GET Requests.

## Exercicio 2.4

Para criar o API, defini Records para Quotes (com um id, o conteudo e o show a que pertencem), Shows (com um id, o nome do show e o ano), e para os GET Requests (com um id e uma lista de Quotes ou de Shows).
Criei também 2 classes que iniciavam as listas dos shows e das quotes (50 quotes foram utilizadas de 47 shows diferentes).

Após criar as classes, criei um RestController onde eram suportados os GET requests:
- /quote para devolver uma quote aleatoria (Com ajuda do pacote java.util.Random);
- /shows para devolver a lista de shows;
- /quotes?show=<show_id> para devolver todas as quotes cujo show tinha um id = <show_id>, filtrando a lista de todas as quotes.