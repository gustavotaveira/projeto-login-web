# projeto-login-web

Este projeto demonstra técnicas de comunicação entre uma página de login e o servidor em Java. 

Para isso são utilizadas as tecnologias SpringBoot para rápida execução do servidor, com todos os recursos do Spring Framework, 
HTML5 para criação da página de login e uso da biblioteca Thymeleaf, simples de ser usada para uma eficiente comunicação do servidor com a 
página web, enviando objetos que podem ter seus dados usados na página, uma alternativa ao verboso jsp. 

Importante: No SpringBoot, as classes devem estar no mesmo pacote ou em pacotes filhos da classe principal que contem a anotação @SpringBootApplication, caso
contrário não irá funcionar de forma alguma. Isso se deve ao fato da classe deve ser carregada primeiro pois mantem as configurações necessárias
para que tudo funcione.
Para enviar dados da página para o servidor não é necessário utilizar Thymeleaf, uma alternativa que o Spring disponibiliza é utilizar o objeto
ModelAndView. Agora enviar objetos para a página, e utilizar os dados contidos nele, apenas com o Thymeleaf, não encontrei outra forma usando 
ModelAndView.
