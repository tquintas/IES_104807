# Lab 3

## Exercício 3.1

b) Neste ponto, alterei o nome da class User para Users, para garantir que não há colisão de nomes, assim como UsersControllers e UsersRepository. Nesta fase, de modo a completar também o ponto d), implementei logo mais um atributo da class Users, a idade, cujas restrições são um valor mínimo e um valor máximo. Além disso, adicionei outra restrição ao campo Email, pedindo que fosse um email válido.

c)

 - Usando ```@Autowired``` no construtor de UsersController, é possível injetar uma instância da class UsersRepository no construtor;
 - A class UsersController invoca os seguintes métodos da instância usersRepository: "save", "delete", "findById" e "findAll". A primeira serve para guardar no repositorio, a segunda para elimininar, a terceira para selecionar as linhas cujo Id seja igual ao especificado no argumento, e a última para selecionar todas as linhas. Estes métodos fazem parte da SuperClass CrudRepository.
 - Em vez de os dados ficarem guardados no disco, eles ficam guardados na memória interna do sistema, uma vez que é de fácil e rápido acesso e não há a necessidade de manter esses dados quando reiniciamos a aplicação.
 - A regra de ```@NotEmpty``` está "escondida" na regra ```@NotBlank``` uma vez que esta verifica se o campo está vazio ou se só contém whitespaces. No entanto, para o campo de Email é prudente utilizar a regra ```@Email``` para verificar se o que foi introduzido é um email válido (um campo vazio não é um email válido).

 d) Como referido acima, adicionei o campo Idade como novo atributo. Uma boa implementação seria o atributo de uma password, que seria encryptada e privada e que seria necessario introduzir quando o utilizador fosse editar ou apagar um utilizador da memória.

 ## Exercício 3.2

 