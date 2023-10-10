package br.com.vlimass.todolist.user;

import lombok.Data;

@Data  // Adiciona os getters & setters pelo Lombok
public class UserModel {
  private String username;
  private String name;
  private String password;

  
}
