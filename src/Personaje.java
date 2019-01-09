
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 *
 * @author Ricardo Andrés Calvo
 * @author Diego Felipe López
 */
public class Personaje {
    private int X;
    private int Y;
    private Image[][] image;
    private Shape shape;
    private int paso;
    private int pasoPrevio;
    private int sentido; //0 - arriba; 1 - derecha; 2 - abajo; 3 - Izquierda;
    private int contpasos;

    public Personaje(){
        this.X = 4*32;
        this.Y = 9*32;
        this.contpasos = 0;
        this.shape = new Rectangle(this.X,this.Y+27,30,13);
        this.paso = 1;
        this.pasoPrevio = 0;
        this.sentido = 2;
        this.image = new Image[4][3];
        this.image[0][0] = new Image("Imagenes/up0.png");
        this.image[0][1] = new Image("Imagenes/up1.png");
        this.image[0][2] = new Image("Imagenes/up2.png");
        this.image[1][0] = new Image("Imagenes/right0.png");
        this.image[1][1] = new Image("Imagenes/right1.png");
        this.image[1][2] = new Image("Imagenes/right2.png");
        this.image[2][0] = new Image("Imagenes/down0.png");
        this.image[2][1] = new Image("Imagenes/down1.png");
        this.image[2][2] = new Image("Imagenes/down2.png");
        this.image[3][0] = new Image("Imagenes/left0.png");
        this.image[3][1] = new Image("Imagenes/left1.png");
        this.image[3][2] = new Image("Imagenes/left2.png");
        
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public Image[][] getImage() {
        return image;
    }

    public void setImage(Image[][] image) {
        this.image = image;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public int getPaso() {
        return paso;
    }

    public void setPaso(int paso) {
        this.paso = paso;
    }

    public int getSentido() {
        return sentido;
    }

    public void setSentido(int sentido) {
        this.sentido = sentido;
    }

    public int getContpasos() {
        return contpasos;
    }

    public void setContpasos(int contpasos) {
        this.contpasos = contpasos;
    }
    
    public void AvanzarIzquierda(){
        this.setSentido(3);
        if(paso==2){
            this.setPaso(0);
        }else if(this.contpasos%10==0){
            AvanzarPaso();
        }
        this.contpasos++;
        this.X--;
        this.shape = new Rectangle(this.X,this.Y+27,30,13);
    }
    
    public void AvanzarDerecha(){
        this.setSentido(1);
       if(this.contpasos%10==0){
            AvanzarPaso();
        }
        this.contpasos++;
        this.X++;
        this.shape = new Rectangle(this.X,this.Y+27,30,13);
    }
    
    public void AvanzarArriba(){
        this.setSentido(0);
        if(this.contpasos%10==0){
            AvanzarPaso();
        }
        this.contpasos++;
        this.Y--;
        this.shape = new Rectangle(this.X,this.Y+27,30,13);
    }
    public void AvanzarAbajo(){
        this.setSentido(2);
        if(this.contpasos%10==0){
            AvanzarPaso();
        }
        this.contpasos++;
        this.Y++;
        this.shape = new Rectangle(this.X,this.Y+27,30,13);
    }
    
    public void AvanzarPaso(){
        switch (this.paso) {
            case 0:
                this.paso=1;
                this.pasoPrevio=0;
                break;
            case 2:
                this.paso=1;
                this.pasoPrevio=2;
                break;
            default:
                if(this.pasoPrevio==0){
                    this.paso=2;
                }else{
                    this.paso=0;
                }   
                break;
        }
        
    }
    
}
