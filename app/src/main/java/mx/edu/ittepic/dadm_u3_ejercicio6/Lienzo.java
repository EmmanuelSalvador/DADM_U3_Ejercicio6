package mx.edu.ittepic.dadm_u3_ejercicio6;


import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View {
    Imagen logo, guitarraE, guitarraA, bajo, bateria, piano, orquesta,tornamesas, boton, seleccion, puntero;
    Context con;
    String mensaje1, mensaje2,mensaje3;
    int i=0;
    public Lienzo(Context context) {
        super(context);
        con=context;
        logo=new Imagen(R.drawable.log,150,50,this);
        guitarraA=new Imagen(R.drawable.guitarra_acustica,100, 535,this);
        guitarraE=new Imagen(R.drawable.guitarra,600,535,this);
        bajo=new Imagen(R.drawable.bajo,1100,535,this);
        bateria=new Imagen(R.drawable.bateria,1600,535,this);
        piano=new Imagen(R.drawable.piano,2100,535,this);
        orquesta=new Imagen(R.drawable.orquesta,2500,535,this);
        tornamesas=new Imagen(R.drawable.consola,3100,535,this);
        boton=new Imagen(2000,1150,2300,1250);
        mensaje1="";
        mensaje2="";
        mensaje3="";
    }

    @Override
    protected void onDraw(Canvas c) {
        super.onDraw(c);
        Paint p = new Paint();
        logo.pintar(c,p);
        p.setColor(Color.parseColor("#303640"));
        p.setTextSize(60);
        c.drawText("My Music Centre",1000,250,p);
        c.drawRect(0,500,2560,1000,p);
        if (i!=0){
            seleccion.pintar(c,p);
        }
        guitarraA.pintar(c,p);
        guitarraE.pintar(c,p);
        bajo.pintar(c,p);
        bateria.pintar(c,p);
        piano.pintar(c,p);
        orquesta.pintar(c,p);
        tornamesas.pintar(c,p);
        boton.pintarCuadro(c,p,1);
        p.setTextSize(45);
        p.setColor(Color.parseColor("#303640"));
        c.drawText(mensaje1,150,1150,p);
        c.drawText(mensaje2,150,1250,p);
        c.drawText(mensaje3,150,1350,p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float xp = event.getX();
        float yp=event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                if (guitarraA.estaEnArea(xp,yp)){
                    puntero=guitarraA;
                    boton.hacerVisible(true);
                    mensaje1="Las Guitarras siempre serán uno de los instrumentos favoritos entre los músicos";
                    mensaje2="Encuentre una guitarra de iniciación o su compañera para componer la canción de su vida";
                    mensaje3="Aquí puede conseguir guitarras acústicas y clásicas junto con los accesorios que usted necesita";
                    seleccion=new Imagen(R.drawable.seleccion,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    i=1;
                }
                if (guitarraE.estaEnArea(xp, yp)) {
                    puntero=guitarraE;
                    boton.hacerVisible(true);
                    mensaje1="Las Guitarras siempre serán uno de los instrumentos favoritos entre los músicos";
                    mensaje2="Compre online su nuevo equipo de guitarra. Puede elegir desde cuerpos solidos,";
                    mensaje3="semi-acusticos o cuerpos abiertos tipo Hollow para elegir su guitarra ideal";
                    seleccion=new Imagen(R.drawable.seleccion,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    i=2;
                }
                if (bajo.estaEnArea(xp,yp)){
                    puntero=bajo;
                    boton.hacerVisible(true);
                    mensaje1="Los bajos que le ofrecemos van desde packs para principiantes exclusivos";
                    mensaje2="Con una gama de bajos de ¾, bajos de cinco Cadenas, bajos acústicos y bajos sin trastes.";
                    mensaje3="estamos seguros de que podrá encontrar el bajo correcto que pueda satisfacer sus necesidades.";
                    seleccion=new Imagen(R.drawable.seleccion,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    i=3;
                }
                if (bateria.estaEnArea(xp,yp)){
                    puntero=bateria;
                    boton.hacerVisible(true);
                    mensaje1="Navegue por una amplia gama de baterías e instrumentos de percusión";
                    mensaje2="Desde las baterías acústicas tradicionales a baterías electrónicas.";
                    mensaje3="Encontrará preciosas baterías hechas a mano, baterías electrónicas, entre muchas otras cosas ";
                    seleccion=new Imagen(R.drawable.seleccion,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    i=4;
                }
                if (piano.estaEnArea(xp,yp)){
                    puntero=piano;
                    boton.hacerVisible(true);
                    mensaje1="Explore nuestra gama de pianos de las marcas más respetadas, como Yamaha y Casio";
                    mensaje2="También encontrará una gama muy diversa de pianos de la mejor calidad";
                    mensaje3="desde pianos acústicos , pianos de escenario, pianos digitales, teclados y pianos de cola.";
                    seleccion=new Imagen(R.drawable.seleccion,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    i=5;
                }
                if (orquesta.estaEnArea(xp,yp)){
                    puntero=orquesta;
                    boton.hacerVisible(true);
                    mensaje1="Descubra nuestra amplia gama de instrumentos de orquesta";
                    mensaje2="de las marcas más buscadas en el campo de cuerda, metal, madera y percusión.";
                    mensaje3="con instrumentos de orquesta entre los que se encuentran violines, violoncellos, trompetas, saxofones y mucho más.";
                    seleccion=new Imagen(R.drawable.seleccion,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    i=6;
                }
                if (tornamesas.estaEnArea(xp,yp)){
                    puntero=tornamesas;
                    boton.hacerVisible(true);
                    mensaje1="Las consolas de DJ permiten al DJ trabajar con fluidez y expresividad";
                    mensaje2="ya que podrán controlar sonidos en una actuación en vivo";
                    mensaje3="Tenemos una gama de consolas para todos,  ya sea que esté buscando remix, producir, o mezclar varias pistas.";
                    seleccion=new Imagen(R.drawable.seleccion,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    i=7;
                }
                if (boton.estaEnAreaCuadro(xp, yp)) {
                    Intent ventana = new Intent(con,Main2Activity.class);
                    ventana.putExtra("Opcion",i);
                    con.startActivity(ventana);
                }

                break;
            case MotionEvent.ACTION_MOVE:
                if (puntero==guitarraA && puntero.estaEnArea(xp,yp)){
                    guitarraA.mover(xp);
                    guitarraE.mover(xp+500);
                    bajo.mover(xp+1000);
                    bateria.mover(xp+1500);
                    piano.mover(xp+2000);
                    orquesta.mover(xp+2500);
                    tornamesas.mover(xp+3000);
                    seleccion.mover(xp);
                }
                if (puntero==guitarraE && puntero.estaEnArea(xp,yp)){
                    guitarraA.mover(xp-500);
                    guitarraE.mover(xp);
                    bajo.mover(xp+500);
                    bateria.mover(xp+1000);
                    piano.mover(xp+1500);
                    orquesta.mover(xp+2000);
                    tornamesas.mover(xp+2500);
                    seleccion.mover(xp);
                }
                if (puntero==bajo && puntero.estaEnArea(xp,yp)){
                    guitarraA.mover(xp-1000);
                    guitarraE.mover(xp-500);
                    bajo.mover(xp);
                    bateria.mover(xp+500);
                    piano.mover(xp+1000);
                    orquesta.mover(xp+1500);
                    tornamesas.mover(xp+2000);
                    seleccion.mover(xp);
                }
                if (puntero==bateria && puntero.estaEnArea(xp,yp)){
                    guitarraA.mover(xp-1500);
                    guitarraE.mover(xp-1000);
                    bajo.mover(xp-500);
                    bateria.mover(xp);
                    piano.mover(xp+500);
                    orquesta.mover(xp+1000);
                    tornamesas.mover(xp+1500);
                    seleccion.mover(xp);
                }
                if (puntero==piano && puntero.estaEnArea(xp,yp)){
                    guitarraA.mover(xp-2000);
                    guitarraE.mover(xp-1500);
                    bajo.mover(xp-1000);
                    bateria.mover(xp-500);
                    piano.mover(xp);
                    orquesta.mover(xp+500);
                    tornamesas.mover(xp+1000);
                    seleccion.mover(xp);
                }
                if (puntero==orquesta && puntero.estaEnArea(xp,yp)){
                    guitarraA.mover(xp-2500);
                    guitarraE.mover(xp-2000);
                    bajo.mover(xp-1500);
                    bateria.mover(xp-1000);
                    piano.mover(xp-500);
                    orquesta.mover(xp);
                    tornamesas.mover(xp+500);
                    seleccion.mover(xp);
                }
                if (puntero==tornamesas && puntero.estaEnArea(xp,yp)){
                    //if (tornamesas.regresarx() >= 2000) {
                    guitarraA.mover(xp - 3000);
                    guitarraE.mover(xp - 2500);
                    bajo.mover(xp - 2000);
                    bateria.mover(xp - 1500);
                    piano.mover(xp - 1000);
                    orquesta.mover(xp - 500);
                    tornamesas.mover(xp);
                    seleccion.mover(xp);
                    //}
                }
                break;
        }
        invalidate();
        return true;
    }
}