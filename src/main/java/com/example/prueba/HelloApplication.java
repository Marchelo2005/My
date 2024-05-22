package com.example.prueba;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {

    public static void main(String[] args) {
        int matriz[][] = new int[4][3];
          for (int i=0 ; i<4;i++){
          for (int j=0;j<3;j++){
              if (j==2 | i==2){
                  matriz[i][j]=1;
              }else {
                  matriz[i][j]=0;
              }

          }
        }
          for (int i=0;i<4;i++){

              for (int j=0;j<3;j++){
          System.out.println(matriz[i][j]+"||");
          }

          }


     for (int k=0 ; k<=20;k++){
      if (k%2==0){
          System.out.println("Numeros pares: "+k);
      }else {
          System.out.println("Numeros impares: "+k);
      }
     }
        System.exit(0);
    }
}