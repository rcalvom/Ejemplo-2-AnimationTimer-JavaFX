
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
    private int sentido; //0 - arriba; 1 - derecha; 2 - abajo; 3 - Izquierda;
    private int cont;

    public Personaje(){
        this.X = 4*32;
        this.Y = 9*32;
        this.cont = 0;
        this.shape = new Rectangle(this.X,this.Y,30,40);
        this.paso = 1;
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
    
    public void AvanzarIzquierda(){
        this.setSentido(3);
        if(paso==2){
            this.setPaso(0);
        }else if(this.cont%10==0){
            this.paso++;
        }
        this.cont++;
    }
    
    public void AvanzarDerecha(){
        this.setSentido(1);
        if(paso==2){
            this.setPaso(0);
        }else if(this.cont%10==0){
            this.paso++;
        }
        this.cont++;
    }
    
    public void AvanzarArriba(){
        this.setSentido(0);
        if(paso==2){
            this.setPaso(0);
        }else if(this.cont%10==0){
            this.paso++;
        }
        this.cont++;
    }
    public void AvanzarAbajo(){
        this.setSentido(2);
        if(paso==2){
            this.setPaso(0);
        }else if(this.cont%10==0){
            this.paso++;
        }
        this.cont++;
    }
    
    
}
