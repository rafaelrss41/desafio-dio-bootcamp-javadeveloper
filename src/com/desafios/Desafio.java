package com.desafios;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws IOException{

    }

    public static void contCedulas(){
        String val;
        int delete;
        int[] cedulas = new int[]{100,50,20,10,5,2,1};
        int[] tot = new int[7];

        Scanner read = new Scanner(System.in);
        val = read.nextLine();

        if(val != null && !"".equalsIgnoreCase(val) && !"0".equalsIgnoreCase(val)){
            delete = Integer.parseInt(val);

            for(int i =0; i < 7; i++){
                if(delete >= cedulas[i]){
                    tot[i] = delete/cedulas[i];
                    delete = delete - tot[i] * cedulas[i];
                }
            }

            System.out.println("" + Integer.parseInt(val));
            for(int i = 0; i < 7; i++){
                System.out.println(tot[i] + " nota(s) de R$ " + cedulas[i] + ",00");
            }
        }
    }


    public static void lerInteiros(){
        Scanner leitor = new Scanner(System.in);
        int[] valor = new int[5];
        int contPar = 0;
        int contImpar = 0;
        int contPositivos = 0;
        int contNegativos = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um valores: ");
            valor[i] = leitor.nextInt();
            if(valor[i]<0){
                contNegativos++;
                if(valor[i] %2 ==0){
                    contPar++;
                }else {
                    contImpar++;
                }
            }else if(valor[i] > 0){
                contPositivos++;
                if(valor[i] % 2 == 0){
                    contPar++;
                }else{
                    contImpar++;
                }
            }else {
                contPar++;
            }
        }

        System.out.println(contPar + " :par(es)");
        System.out.println(contImpar + " :impar(es)");
        System.out.println(contPositivos + " :positivo(s)");
        System.out.println(contNegativos + " :negativo(s)");

    }



    public static void mostraPares(){
        Scanner read = new Scanner(System.in);
        String valor;
        valor = read.nextLine();
        for(int i = 2; i <= Integer.parseInt(valor); i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }


    public static void exibirPositivos() throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        Double a =Double.parseDouble((br.readLine()));
        Double b =Double.parseDouble((br.readLine()));
        Double c =Double.parseDouble((br.readLine()));
        Double d =Double.parseDouble((br.readLine()));
        Double e =Double.parseDouble((br.readLine()));
        Double f =Double.parseDouble((br.readLine()));

        Double vetor[] = new Double[6];

        vetor[0]=a;
        vetor[1]=b;
        vetor[2]=c;
        vetor[3]=d;
        vetor[4]=e;
        vetor[5]=f;

        int re = 0;
        for(int ct = 0; ct < 6; ct++){
            if(vetor[ct] > 0){
                re++;
            }
        }

        System.out.println(re + " :Valores positivos: ");
    }

}