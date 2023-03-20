package batalhaNaval;

import java.util.Scanner;

public class Jogador{
    char[][] mapa = new char[5][5];
    String nome;
    final int MAX_COORD = 4;
    final int MIN_COORD = 0;
    public Jogador(int id){
        // variáveis e objetos
        short tempx, tempy;
        boolean existe;
        Scanner input = new Scanner(System.in);

        // inicializa o mapa
        this.inicializaMapa();
        
        // nome de player
        this.nome = "Player " + id;
        
        // pergunta as coordenadas
        System.out.println(this.nome + ", enter your ships' coordinates.");
        for (short x=0; x<5; ){
            System.out.println("Enter ship " + (x+1) + " location > x y <:");
            input.hasNext();
            tempx=input.nextShort();
            tempy=input.nextShort();
            
            // validar o máximo
            if (tempx > this.MAX_COORD || tempy > this.MAX_COORD || tempx < this.MIN_COORD || tempy < this.MIN_COORD){
                System.out.println("Invalid coordinates. Choose different coordinates.");
            } else {
                existe = false;
                // valida com as coordenadas anteriores
                for(short y=0; y<x; y++){
                    if (this.mapa[tempx][tempy] == '@'){
                        existe = true;
                        break;
                    }
                }
                if (existe) {
                    System.out.println("You already have a ship there. Choose different coordinates.");
                } else {
                    this.mapa[tempx][tempy]='@';
                    x++;
                }
            }
        }

        // exibe o mapa do jogador
        this.exibeMapa();  
        input.close();
    }

    public void inicializaMapa(){
        for (short x = 0; x <= this.MAX_COORD; x++)
            for (short y = 0; y<=this.MAX_COORD; y++) this.mapa[x][y] = '-';
    }

    public void exibeMapa(){
        System.out.println("\n\n  0  1  2  3  4");
        for (short x = 0; x <= this.MAX_COORD; x++){
            System.out.print(x);
            for (short y = 0; y<=this.MAX_COORD; y++){
                System.out.print(" "+this.mapa[x][y]+" ");
            }
            System.out.println();
        }
    }
 }
