/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittertest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author olivato
 */
public class Twittertest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ArrayList<String> ar = new ArrayList<String>();
        Scanner a = new Scanner(System.in);
        System.out.println("Digite quantas listas de exercício:");
        int qnt = a.nextInt();
        for(int i=0;i<qnt;i++)
        {
            System.out.println("Digite o nome da lista:");
            String nome = a.next();
            System.out.println("Digite a quantidade de exercícios:");
            int ex = a.nextInt();
            for(int u =1;u<ex;u++)
                ar.add(nome+":"+u);
        }
        ArrayList<String> p = new ArrayList<String>();
        System.out.println("Digite a quantidade de pessoas:");
        qnt = a.nextInt();
        String nome="";
        for(int i =0;i<qnt;i++)
        {
            p.add(a.next());
        }
        p.add("Sobra");
        Collections.shuffle(ar);
        int tam = (ar.size()/p.size())+1;
        int u =0;
        for(int i = 0;i<ar.size();i++)
        {
            if(i % tam==0)
            {
                try
                {
                System.out.println(""+p.get(u).toString());
                }catch(Exception e)
                {
                    
                }
               u++;
            }
            System.out.println(""+ar.get(i).toString());
        }
        
            
        */
        Visual a = new Visual();
        a.show();
    }
    
}
