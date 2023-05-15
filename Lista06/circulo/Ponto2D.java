package Lista06.circulo;

import java.lang.Math;

public class Ponto2D {
    private float x, y;

    Ponto2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    Ponto2D(){
        this(0, 0);
    }

    public void imprimirPonto(){
        System.out.println("X: "+ x + "; Y: "+ y);
    }

    public boolean isEixoX(){
        return y==0? true:false;
    }
    
    public boolean isEixoY(){
        return x==0? true:false;
    }

    public boolean isEixos(){
        return isEixoX() || isEixoY();
    }

    public int quadrante(){
        boolean isPositiveX = x>0;
        boolean isPositiveY = y>0;

        if(isEixos()) return 0;
        else if(isPositiveX   &&  isPositiveY) return 1;
        else if(!isPositiveX  &&  isPositiveY) return 2;
        else if(!isPositiveX  && !isPositiveY) return 1;
        return 4;
    }

    public double distance(Ponto2D outro){
        double soma1 = outro.x - this.x;
        double soma2 = outro.y - this.y;
        return Math.sqrt(soma1*soma1 + soma2*soma2);
    }

    public double distance(){
        Ponto2D origem = new Ponto2D();
        return distance(origem);
    }

    public double distance(int x, int y){
        Ponto2D outro = new Ponto2D(x, y);
        return distance(outro);
    }
}
