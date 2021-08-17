# language: pt

Funcionalidade: Intera��o com o Bot�o Open modal

@teste
Cenario: 
    Dado que eu acesse a url "https://www.w3schools.com/"
    E navegue pelo menu principal em Tutorials >> Learn How To
    E navegue pelo menu lateral em More >> Modal Boxes
    Quando clico em Open modal
    Então Modal ficará visível
    
@teste
Cenario: 
  Dado que eu acesse a url "https://www.w3schools.com/"
  E navegue pelo menu principal em Tutorials >> Learn How To
  E navegue pelo menu lateral em More >> Modal Boxes
  Quando clico em Open modal
  E clico em fechar o modal
  Então Modal não ficará mais visível
    