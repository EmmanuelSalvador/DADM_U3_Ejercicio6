package mx.edu.ittepic.dadm_u3_ejercicio6;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

class Lienzo2 extends View {
    int opcion, conta, img1, img2, img3, img4, img5, img6, img7;
    Imagen logo,imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, puntero, seleccion;
    String titulo,mensaje1, mensaje2, mensaje3,mensage4, precio;
    public Lienzo2(Context context, int i) {
        super(context);
        opcion=i;
        logo=new Imagen(R.drawable.log,700,50,this);
        switch (opcion) {
            case 1:
                img1 = R.drawable.gu_a_uno;
                img2 = R.drawable.gu_a_dos;
                img3 = R.drawable.gu_a_tres;
                img4 = R.drawable.gu_a_cuatro;
                img5 = R.drawable.gu_a_cinco;
                img6 = R.drawable.gu_a_seis;
                img7 = R.drawable.gu_a_siete;
                break;
            case 2:
                img1 = R.drawable.g_uno;
                img2 = R.drawable.g_dos;
                img3 = R.drawable.g_tres;
                img4 = R.drawable.g_cuatro;
                img5 = R.drawable.g_cinco;
                img6 = R.drawable.g_seis;
                img7 = R.drawable.g_siete;
                break;
            case 3:
                img1 = R.drawable.bass_uno;
                img2 = R.drawable.bass_dos;
                img3 = R.drawable.bass_tres;
                img4 = R.drawable.bass_cuatro;
                img5 = R.drawable.bass_cinco;
                img6 = R.drawable.bass_seis;
                img7 = R.drawable.bass_siete;
                break;
            case 4:
                img1 = R.drawable.bat_uno;
                img2 = R.drawable.bat_dos;
                img3 = R.drawable.bat_tres;
                img4 = R.drawable.bat_cuatro;
                img5 = R.drawable.bat_cinco;
                img6 = R.drawable.bat_seis;
                img7 = R.drawable.bat_siete;
                break;
            case 5:
                img1 = R.drawable.pi_uno;
                img2 = R.drawable.pi_dos;
                img3 = R.drawable.pi_tres;
                img4 = R.drawable.pi_cuatro;
                img5 = R.drawable.pi_cinco;
                img6 = R.drawable.pi_seis;
                img7 = R.drawable.pi_siete;
                break;
            case 6:
                img1 = R.drawable.or_uno;
                img2 = R.drawable.or_dos;
                img3 = R.drawable.or_tres;
                img4 = R.drawable.or_cuatro;
                img5 = R.drawable.or_cinco;
                img6 = R.drawable.or_seis;
                img7 = R.drawable.or_siete;
                break;
            case 7:
                img1 = R.drawable.con_uno;
                img2 = R.drawable.con_dos;
                img3 = R.drawable.con_tres;
                img4 = R.drawable.con_cuatro;
                img5 = R.drawable.con_cinco;
                img6 = R.drawable.con_seis;
                img7 = R.drawable.con_siete;

                break;
        }
        imagen1=new Imagen(img1,75, 50,this);
        imagen2=new Imagen(img2,75,500,this);
        imagen3=new Imagen(img3,75,1000,this);
        imagen4=new Imagen(img4,75,1500,this);
        imagen5=new Imagen(img5,75,2000,this);
        imagen6=new Imagen(img6,75,2500,this);
        imagen7=new Imagen(img7,75,3000,this);
        titulo="";
        mensaje1="";
        mensaje2="";
        mensaje3="";
        mensage4="";
        precio="";
    }

    @Override
    protected void onDraw(Canvas c) {
        super.onDraw(c);
        Paint p = new Paint();
        logo.pintar(c,p);
        p.setColor(Color.parseColor("#303640"));
        p.setTextSize(60);
        c.drawText("My Music Centre",1300,250,p);
        c.drawRect(0,0,600,getHeight(),p);
        if (conta!=0){
            seleccion.pintar(c,p);
        }
        imagen1.pintar(c,p);
        imagen2.pintar(c,p);
        imagen3.pintar(c,p);
        imagen4.pintar(c,p);
        imagen5.pintar(c,p);
        imagen6.pintar(c,p);
        imagen7.pintar(c,p);
        p.setTextSize(55);
        c.drawText(titulo,700,600,p);
        p.setTextSize(45);
        c.drawText(mensaje1,625,700,p);
        c.drawText(mensaje2,625,750,p);
        c.drawText(mensaje3,625,800,p);
        c.drawText(mensage4,625,850,p);
        c.drawText(precio,2300,1450,p);
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float xp = event.getX();
        float yp = event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                if (imagen1.estaEnArea(xp,yp)){
                    puntero=imagen1;
                    seleccion=new Imagen(R.drawable.selecciondos,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    switch (opcion){
                        case 1:
                            titulo="Guitarra Electroacústica Single Cutaway - Negro";
                            mensaje1="La guitarra electroacústica single cutaway de Gear4music es perfecta para cualquier";
                            mensaje2="guitarrista buscando un instrumento de confianza, buena calidad, versátil y con ";
                            mensaje3="estilo a muy buen precio.";
                            mensage4="";
                            precio="$75.70";
                            break;
                        case 2:
                            titulo="Guitarra Eléctrica LA de Gear4music - Sunburst";
                            mensaje1="¡Una guitarra elegante y versátil ideal para rockeros! Fácil de tocar y con una ";
                            mensaje2="amplia variedad de tonos, el modelo LA es ideal para principiantes. Con una funda ";
                            mensaje3="y un cable incluido, esta guitarra tiene todo lo necesario para que puedas ";
                            mensage4="transportar y conectar tu guitarra donde quiera que vayas.";
                            precio="$86.50";
                            break;
                        case 3:
                            titulo="Bajo LA de 3/4 de Gear4music - Negro";
                            mensaje1="El bajo LA de 3/4 de Gear4music tiene la apariencia clásica y tonos de un bajo ";
                            mensaje2="de 4/4 pero en un tamaño compacto diseñado para los bajistas más jóvenes.";
                            mensaje3="Hecho de paulownia ligera para máxima comodidad, este bajo viene con un cable ";
                            mensage4="jack y una funda. Ideal para niños de hasta 11 años.";
                            precio="$81.10";
                            break;
                        case 4:
                            titulo="Batería BDK-1 de Principiante de Tamaño Completo de Gear4music, Negro";
                            mensaje1="La batería BDK-1 de Gear4music es perfecta para casa o para el colegio, e incluye todo";
                            mensaje2=" lo que un principiante necesita para empezar a tocar la batería. Este set de cinco";
                            mensaje3="piezas con herraje y platillos hará que esté tocando la batería ya mismo. Los cascos ";
                            mensage4="de madera de seis capas ofrecen un sonido rico profundo y genial para un princpinate.";
                            precio="$216.00";
                            break;
                        case 5:
                            titulo="Piano Digital Junior JDP-1 de Gear4music - Blanco";
                            mensaje1="El piano digital JDP-1 es un instrumento rediseñado a escala pequeña por lo que es ideal";
                            mensaje2="para niños. Este piano es ideal para los más pequeños de la casa y como cuenta con";
                            mensaje3="conectividad USB puede usarse con un número de aplicaciones de música modernas. Simple, ";
                            mensage4="compacto y divertido, este piano les permite a los niños experimentar con la música.";
                            precio="$182.00";
                            break;
                        case 6:
                            titulo="Violín de Estudiante 1/4 de Gear4music";
                            mensaje1="El violín de 1/4 de Gear4music es un instrumento de confianza y asequible, diseñado";
                            mensaje2=" para principiantes y estudiantes. Mide 46cm y es ideal para niños y niñas entre 5";
                            mensaje3=" y 7 años. El cuerpo está hecho de abeto y arce con bordes ornamentados, produciendo";
                            mensage4="un tono cálido y suave, mientras que las 4 clavijas son útiles para ajustarlo con precisión.";
                            precio="$52.00";
                            break;
                        case 7:
                            titulo="Gemini MDJ-500 Professional USB Media Player";
                            mensaje1="El Gemini MDJ-500 profesional USB Media Player es un dispositivo compacto y potente.";
                            mensaje2="Con una pantalla grande, vibrante, 4.3'' a todo color, el MDJ-500 permite ver pista";
                            mensaje3="y reproducción de información en tiempo real.";
                            mensage4="";
                            precio="$180.50";
                            break;
                    }
                    conta=1;
                }
                if (imagen2.estaEnArea(xp, yp)) {
                    puntero=imagen2;
                    seleccion=new Imagen(R.drawable.selecciondos,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    switch (opcion){
                        case 1:
                            titulo="Guitarra Electroacústica de Concierto de Gear4music, Natural";
                            mensaje1="El concierto Electro acústico guitarra de Gear4music es ideal para quien busca una ";
                            mensaje2="guitarra acústica de electro integral que satisfaga sus necesidades de actuación en ";
                            mensaje3="vivo al mismo tiempo no romper el Banco. Esta guitarra es un instrumento sensible y muy ";
                            mensage4="jugable con un encantador tono acústico suave, equilibrado. Perfecto para estudiantes.";
                            precio="$75.70";
                            break;
                        case 2:
                            titulo="Guitarra Eléctrica LA II HSS de Gear4music - Sunburst";
                            mensaje1="Una nueva adición a la gama de guitarras eléctricas Gear4music, la guitarra eléctrica ";
                            mensaje2="LA II proporciona una riqueza de tonos deal para una amplia variedad de géneros musicales.";
                            mensaje3="Cuenta con un cuerpo de fresno sólido, configuración de pastillas HSS y un atractivo acabado ";
                            mensage4="Sunburst. Este conjunto viene con un cable jack y una funda GRATIS.";
                            precio="$97.30";
                            break;
                        case 3:
                            titulo="Bajo LA de Gear4music, Sunburst";
                            mensaje1="El Bajo LA de Gear4music combina un aspecto clásico con un tono nítido y potente. Hecho ";
                            mensaje2="de maderas ligeras para comodidad y facilidad de uso, el Bajo LA de Gear4music es ideal para ";
                            mensaje3="principiantes. Funda y Cables incluidos.";
                            mensage4="";
                            precio="$86.50";
                            break;
                        case 4:
                            titulo="Batería Electrónica Digital DD-400 + Accesorios";
                            mensaje1="Este es el lugar donde empezar a tocar la bateria. El DD400 Gear4music kit de batería";
                            mensaje2="electrónica le da todas las herramientasque necesita para convertirse en un baterista. ";
                            mensaje3="Es super silenciosa por lo que va a ser capaz de practicar más sin tener toda la";
                            mensage4="calle despierta simplemente usando audífonos.";
                            precio="$238.00";
                            break;
                        case 5:
                            titulo="SDP-2 Piano de Escenario de Gear4music + Soporte, Pedal y Auriculares";
                            mensaje1="El piano de escenario SPD-2 Stage de Gear4music es un piano compacto y ligero apto ";
                            mensaje2="para principiantes y para músicos que viajan, ideal para actuar y para casa. Cuenta ";
                            mensaje3="con 88 teclas semipesadas, ocho voces realistas y cuatro altavoces integrados.";
                            mensage4="El SPD-2 es una elección popular entre principiantes y pianistas";
                            precio="$235.50";
                            break;
                        case 6:
                            titulo="Saxofón Alto de Gear4music, Dorado";
                            mensaje1="El saxofón alto de Gear4music es un instrumento duradero y asequible ideal para ";
                            mensaje2="principiantes y estudiantes. Produce un tono suave con una fácil respuesta, ideal ";
                            mensaje3="para aquellos que están aprendiendo a tocar y desarrollar sus habilidades. El cuerpo";
                            mensage4="está hecho con refuerzo para soportar el transporte y la práctica regular.";
                            precio="$268.00";
                            break;
                        case 7:
                            titulo="Numark M101 Mezclador de DJ Compacto";
                            mensaje1="La Numark M101 mezclador de DJ compacto es un mezclador de 2 canales adaptable ";
                            mensaje2="para DJs. El M101 permite móviles levantarse y correr rápidamente sin importar ";
                            mensaje3="de qué cambios hacer el concierto. Ya sea para bodas, fiestas y todo lo intermedio, ";
                            mensage4="el M101 es un mezclador ideal para principiantes y experimentados DJs.";
                            precio="$102.00";
                            break;
                    }
                    conta=2;
                }
                if (imagen3.estaEnArea(xp,yp)){
                    puntero=imagen3;
                    seleccion=new Imagen(R.drawable.selecciondos,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    switch (opcion){
                        case 1:
                            titulo="Guitarra Electroacústica Con Dorso Redondeado de Gear4music - Negro";
                            mensaje1="La Guitarra con Dorso Redondeado de Gear4music proporciona un tono versátil de ";
                            mensaje2="excelente proyección gracias a su combinación de madera de pícea y ABS. Dispone ";
                            mensaje3="de un mástil de caoba de diseño delgado y un cuerpo single cutaway de fácil";
                            mensage4="acceso a todo el mástil para mayor comodidad.";
                            precio="$75.70";
                            break;
                        case 2:
                            titulo="LA Guitarra Eléctrica LA + Pack de Amplificador, Negro";
                            mensaje1="Con todo lo necesario para empezar a tocar, la guitarra eléctrica LA pone una amplia";
                            mensaje2="variedad de tonos a su alcance. Este conjunto dispone de la elegante y versátil";
                            mensaje3="guitarra LA, un amplificador portátil 15 de vatios y accesorios, incluyendo un afinador,";
                            mensage4="cable, funda, Cadenas, correa y púas. Ideal para prácticas, actuaciones y mucho más.";
                            precio="$108.00";
                            break;
                        case 3:
                            titulo="Bajo Electroacústico de Gear4music";
                            mensaje1="El bajo electroacústico de Gear4music es el instrumento perfecto para cualquier bajista ";
                            mensaje2="que esté buscando un bajo acústico atractivo. La tapa es de madera de abeto, el cuerpo de ";
                            mensaje3="sapele y el puente y diapasón de madera de álamo. Este bajo ofrece un tono perfecto para";
                            mensage4="practicar.";
                            precio="$108.00";
                            break;
                        case 4:
                            titulo="Batería Digital 430 de Gear4music";
                            mensaje1="La DD430 de Gear4music es una batería electrónica que puede acomodar a cualquier baterista.";
                            mensaje2=". La función choke en el crash y el ride añade una dimensión extra a este kit digital dando ";
                            mensaje3="a los percusionistas un mayor control sobre el sonido de sus platillos y la habilidad de ";
                            mensage4="usar técnicas de percusión más auténticas.";
                            precio="$281.00";
                            break;
                        case 5:
                            titulo="Piano de Escenario SDP-2 de Gear4music + Paquete de Accesorios, Blanco";
                            mensaje1="El piano de escenario SPD-2 Stage de Gear4music es un piano compacto y ligero de color blanco";
                            mensaje2="apto para principiantes ideal para actuar y para casa. Cuenta con 88 teclas semipesadas,";
                            mensaje3="ocho voces realistas y cuatro altavoces integrados. El SPD-2 es una elección popular entre";
                            mensage4=" principiantes y pianistas.";
                            precio="$268.00";
                            break;
                        case 6:
                            titulo="Violonchelo de Estudiante de 4/4 con Estuche de Gear4music";
                            mensaje1="Este violonchelo de 4/4 de Gear4music es un instrumento de confianza asequible e ideal para ";
                            mensaje2="principiantes. Con una tapa de pícea laminada y laterales de tilo, su cuerpo es resistente al ";
                            mensaje3="desgaste y produce un sonido rico y cálido. Con un diapasón y clavijas ebonizados junto con un ";
                            mensage4="puente de arce, este violonchelo es sencillo de tocar.";
                            precio="$192.75";
                            break;
                        case 7:
                            titulo="Behringer DDM4000 Digital Pro Mezclador";
                            mensaje1="La Mesa de mezclas para DJ Behringer DDM 4000 es un mezclador digital de 32 bits para DJs ";
                            mensaje2="cargado de herramientas creativas, y que cuenta con una distribución tan intuitiva que te";
                            mensaje3="tomará un instante dominarlo. Editar, almacenar y cargar tus ajustes es sencillo. Conecta tus";
                            mensage4="tocadiscos  y reproductores de CD/MP3 a los 4 canales de entrada con ecualizador programable.";
                            precio="$394.00";
                            break;
                    }
                    conta=3;
                }
                if (imagen4.estaEnArea(xp,yp)){
                    puntero=imagen4;
                    seleccion=new Imagen(R.drawable.selecciondos,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    switch (opcion){
                        case 1:
                            titulo="Luna Henna Oasis Electro Acoustic, Spruce";
                            mensaje1="La Luna Henna Oasis Electro guitarra acústica, abetos usos laser grabado para reproducir";
                            mensaje2="fielmente la obra de arte del Reino Unido reconocida artista de henna Alex Morgan, dando";
                            mensaje3="por resultado una visualmente impresionante guitarra cierta lucir hermosa en cualquier ";
                            mensage4="escenario.";
                            precio="$449.00";
                            break;
                        case 2:
                            titulo="Squier Bullet Mustang HH, Imperial Blue";
                            mensaje1="La Squier Bullet HH de Mustang en azul Imperial es una guitarra de escala corta de longitud";
                            mensaje2="basada en el Fender Mustang. El Mustang original se creó en los años 60 para los ";
                            mensaje3="instrumentistas de estudiantes con manos más pequeñas, pero más tarde encontró popularidad";
                            mensage4=" de culto en los años 90 y más adelante con guitarristas de rock y indie.";
                            precio="$149.99";
                            break;
                        case 3:
                            titulo="Bajo Chicago de Gear4music - Trans Red";
                            mensaje1="El Bajo Chicago de Gear4music en Trans Red ofrece un sonido de calidad, forma de cuerpo ";
                            mensaje2="elegante y facilidad de tocar a un precio increíble. Con su cuerpo de tilo sólido, este";
                            mensaje3=" instrumento produce un tono cálido con buen sostenimiento y potencial para ser un modelo ";
                            mensage4="a seguir. Funda y Cable GRATIS.";
                            precio="$108.00";
                            break;
                        case 4:
                            titulo="Mapex Tornado III 22\" Rock Fusion Batería, Negro";
                            mensaje1="Este set para principiantes Mapex Tornado tiene todo lo necesario para empezar a tocar hoy";
                            mensaje2="mismo. Este set rock/fusion posee carcasas de madera de tilo americano, platillos de alta ";
                            mensaje3="calidad y todo el herraje necesario. Perfecto para principiantes o para instrumentistas con";
                            mensage4=" experiencia con un presupuesto bajo.";
                            precio="$312.50";
                            break;
                        case 5:
                            titulo="DP-6 Digital Piano by Gear4music, White";
                            mensaje1="El sonido adecuado. En el tamaño correcto. El piano digital Gear4music DP-6 tiene las ";
                            mensaje2="posibilidades musicales de un full-size piano sin sus inconvenientes facturas tamaño y ";
                            mensaje3="mantenimiento. Construido con una teclado completo 88 nota y nota 64 polifonía obtendrá un";
                            mensage4=" piano muy capaz.";
                            precio="$321.50";
                            break;
                        case 6:
                            titulo="Clarinete de Estudiante de Gear4music";
                            mensaje1="Este clarinete de Gear4music es un instrumento fiable, duradero y económico, ideal para ";
                            mensaje2="principiantes y estudiantes. Produce un tono suave con una fácil respuesta, ideal para ";
                            mensaje3="aquellos que quieren avanzar en sus técnicas. Su cuerpo de resina está hecho para aguantar";
                            mensage4=" transporte y uso frecuente. En conjunto incluye un estuche, caña y utensilios de limpieza.";
                            precio="$107.00";
                            break;
                        case 7:
                            titulo="Hercules DJControl Jogvision Serato Controlador";
                            mensaje1="DJControl Jogvision es el primer controlador de DJ móvil de Hercules que incorpora una";
                            mensaje2="pantalla en el centro de cada jog wheel, que indica simultáneamente tanto la velocidad de";
                            mensaje3="reproducción como la posición en la pista, todo a un simple vistazo.";
                            mensage4="Una combinación perfecta entre hardware y software para lograr un control intuitivo.";
                            precio="$212.50";
                            break;
                    }
                    conta=4;
                }
                if (imagen5.estaEnArea(xp,yp)){
                    puntero=imagen5;
                    seleccion=new Imagen(R.drawable.selecciondos,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    switch (opcion){
                        case 1:
                            titulo="Guitarra Acústica Hartwood Primer Dreadnought, Natural";
                            mensaje1="Sea audaz con la guitarra acústica Hartwood Prime Dreadnought. La forma de la dreadnought se";
                            mensaje2="corresponde con la selectas maderas tonales para un sonido grande y poderoso. Este ";
                            mensaje3="instrumento de Hartwood de nivel principiante también cuenta con una tapa de abeto sólida ";
                            mensage4="para un tono equilibrado y versatil, ¡Directamente desde la caja!";
                            precio="108.00";
                            break;
                        case 2:
                            titulo="Guitarra Eléctrica New Jersey Zurda de Gear4music - Negro";
                            mensaje1="La guitarra eléctrica New Jersey de Gear4music te proporciona tonos de rock auténtico a un ";
                            mensaje2="precio nunca visto. Con un mástil de arce encolado y pastillas humbuckers cerradas dobles, la ";
                            mensaje3="New Jersey produce un tono cálido y sustain de alta calidad. Este modelo incluye cable y ";
                            mensage4="funda GRATIS.";
                            precio="$129.75";
                            break;
                        case 3:
                            titulo="Bajo LA + Pack de Ampli de 15W - Negro";
                            mensaje1="Este fantástico pack de Gear4music incluye nuestro Bajo LA en negro, nuestro amplificador ";
                            mensaje2="Gear4music de 15 vatios y un juego de accesorios incluyendo un cable, una funda de bajo ";
                            mensaje3="acolchada, correa, cable, Cadenas de repuesto y púa, haciendo que este conjunto sea ideal";
                            mensage4=" para bajistas de todos los niveles.";
                            precio="$124.25";
                            break;
                        case 4:
                            titulo="Natal EVO 22'' U.S. Kit de percusión con herraje y platillos, Negro";
                            mensaje1="La Natal EVO 22'' Estados Unidos fusión Drum Kit es un batería de gran principiante de Natal,";
                            mensaje2="que incluye todo lo necesario para comenzar su viaje tambor. Además de un conjunto de 5";
                            mensaje3=" piezas de corazas de tambor de tilo el paquete incluye tambor Herraje, platillos y";
                            mensage4="accesorios.";
                            precio="$323.50";
                            break;
                        case 5:
                            titulo="Piano Digital DP-6 de Gear4music + Paquete de Accesorios";
                            mensaje1="El piano digital DP-6 de Gear4music es un instrumento de alta calidad de 88 teclas";
                            mensaje2="semipesadas que replican el tono de un piano acústico real, pero sin tener que encargarse";
                            mensaje3="de afinación y mantenimiento. Para mayor versatilidad el DP-6 cuenta con 16 voces estéreo";
                            mensage4="y polifonía de 64 notas, para permitirles a los instrumentistas conseguir una variedad de sonidos.";
                            precio="$343.00";
                            break;
                        case 6:
                            titulo="Yamaha YTR2330 Trompeta de Estudiante";
                            mensaje1="La trompeta Yamaha YTR2330 es un instrumento ideal para principiantes y estudiantes por igual.";
                            mensaje2="Siendo más ligero y fácil de tocar, el instrumento todavía tiene un sonido centrado y preciso";
                            mensaje3="con gran entonación. Ya sea un paso hasta un gran instrumento de marca o un instrumento de ";
                            mensage4="arranque para el músico principiante de tiempo, el Yamaha YTR2330 siempre impresionará.";
                            precio="$649.00";
                            break;
                        case 7:
                            titulo="Native Instruments Traktor Kontrol S2 MK3 with AKG Headphones";
                            mensaje1="El paquete de arranque perfecto para cualquier aspirante a DJ. La Native Instruments Traktor";
                            mensaje2="Kontrol S2 MK3 utiliza nuevas ruedas de jog de precisión para arañar, empujar y ajustar";
                            mensaje3=" manualmente el beatgrid en Traktor. Remix de la marcha con el RGB pads y crear compilación";
                            mensage4="única ups con un rango de FX nuevo y fácil de usar.";
                            precio="$276.50";
                            break;
                    }
                    conta=5;
                }
                if (imagen6.estaEnArea(xp,yp)){
                    puntero=imagen6;
                    seleccion=new Imagen(R.drawable.selecciondos,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    switch (opcion){
                        case 1:
                            titulo="Guitarra clásica Renaissance de Hartwood";
                            mensaje1="Consiga una apariencia natural con la guitarra clásica Renaissance de Hartwood. Ideal para";
                            mensaje2="estudiantes y instrumentistas experimentados por igual, esta guitarra es igualmente adecuada";
                            mensaje3="para clases, práctica y conciertos. Utilizando materiales de alta calidad y una construcción ";
                            mensage4="maestra, la Hartwood Renaissance proyecta un tono claro y articulado.";
                            precio="$108.00";
                            break;
                        case 2:
                            titulo="Guitarra Eléctrica New Jersey II 3/4 + Pack de Ampli - Sunburst";
                            mensaje1="La guitarra New Jersey II de 3/4 de Gear4music, te proporciona los impresionantes tonos de";
                            mensaje2=" rock del modelo de tamaño completo, pero en un tamaño más compacto diseñado para los";
                            mensaje3=" guitarristas más jóvenes o con menos alcance. Con un mástil de arce atornillado la New ";
                            mensage4="Jersey II proporciona mayor resonancia y un tono más brillante.";
                            precio="$129.75";
                            break;
                        case 3:
                            titulo="Paquete de Bajo Harlem 4 + Amplificador de 15 W, Negro";
                            mensaje1="Pack de bajo eléctrico Miami con amplificador de 15 vatios de Gear4Music negro y un juego ";
                            mensaje2="de accesorios que proporcionan todo lo necesario para que el aspirante a bajista pueda ";
                            mensaje3="practicar y ensayar. Todo esto y más a un precio tremendamente asequible.";
                            mensage4="";
                            precio="$135.25";
                            break;
                        case 4:
                            titulo="Batería BDK-5 de Gear4music - Negro";
                            mensaje1="La batería BDK-5 de Gear4music es la introducción ideal al mundo de la batería y la percusión.";
                            mensaje2="Dispone de cascos de tilo laminado, platillos de latón de alta calidad y herrajes de cromo ";
                            mensaje3="robusto. Este conjunto viene con platillos, banqueta, baquetas, parches y una llave de tambor.";
                            mensage4="";
                            precio="$324.50";
                            break;
                        case 5:
                            titulo="Yamaha CLP625WH Piano Digital, Blanco Satinado";
                            mensaje1="El piano digital Yamaha CLP625WH ofrece una gran expresividad y una estética impactante pensadas ";
                            mensaje2="para el músico avanzado. El CLP625 cuenta con sampling CFX y sonido Bosendorfer, resultando en ";
                            mensaje3="un tono auténtico y orgánico. Este modelo cuenta con un teclado GH3 con sensibilidad ajustable ";
                            mensage4="y sensación contrapesada.";
                            precio="$999.00";
                            break;
                        case 6:
                            titulo="Contrabajo 3/4 de Estudiante + Funda y Arco, Gear4music";
                            mensaje1="El contrabajo de 3/4 de estudiante es un instrumento de confianza y asequible, ideal para los";
                            mensaje2="principiantes más jóvenes. La tapa de pícea laminada y laterales de tilo, forman un cuerpo ";
                            mensaje3="resistente que produce un sonido rico y cálido. Este contrabajo incluye un estuche ligero, resina ";
                            mensage4="y arco francés para que tenga todo lo necesario para empezar a tocar inmediatamente.";
                            precio="$482.00";
                            break;
                        case 7:
                            titulo="Novation LaunchPad Mini MK2 Grid Controlador de Software";
                            mensaje1="El controlador de software Novation LaunchPad Mini MK2 es la nueva versión del popular";
                            mensaje2="controlador MK2 con USB de Novation. Con 64 pads retroiluminados multicolor y 16 botones";
                            mensaje3="de función adicionales en un controlador extremadamente compacto y fácil de llevar, el ";
                            mensage4="LaunchPad Mini es perfecto para músicos y productores que viajan con frecuencia.";
                            precio="$90.80";
                            break;
                    }
                    conta=6;
                }
                if (imagen7.estaEnArea(xp,yp)){
                    puntero=imagen7;
                    seleccion=new Imagen(R.drawable.selecciondos,puntero.getX(),puntero.getY(),this);
                    seleccion.hacerVisible(true);
                    switch (opcion){
                        case 1:
                            titulo="Guitarra Electroacústica Single Cutaway + Pack de Ampli de 15W - Azul";
                            mensaje1="La guitarra electroacústica single cutaway de Gear4music es perfecta para cualquier";
                            mensaje2="guitarrista buscando una guitarra de confianza, buena calidad, versátil y con estilo,";
                            mensaje3=" a muy buen precio Este conjunto incluye un amplificador Gear4music de 15W, pila 9V, ";
                            mensage4="llave allen,funda, afinador, cable, correa, Cadenas, cejilla y púa.";
                            precio="$129.75";
                            break;
                        case 2:
                            titulo="Guitarra Hartwood Novella Hollowbody, Natural";
                            mensaje1="Con un tono hermoso y una excepcional proyección, la Hartwood Novella hollowbody llevará al ";
                            mensaje2="borde más clásico su sonido. El icónico estilo hollowbody se corresponde con su auténtico ";
                            mensaje3="tacto y un tono cálido y tradicional La guitarra de Hartwood Novella ha sido diseñada para ";
                            mensage4="hacer destacar sonido.";
                            precio="$129.75";
                            break;
                        case 3:
                            titulo="Dean Hillsboro Bajo Junior 3/4, Negro";
                            mensaje1="El bajo Dean Hillsboro Junior 3/4 ofrece el tono que caracteriza a las guitarras Dean en ";
                            mensaje2="un tamaño más compacto por lo que es ideal para los músicos más jóvenes. El cuerpo está";
                            mensaje3=" construido en madera de tilo americano con un cuello atornillable, mástil de 22 trastes ";
                            mensage4="de palisandro, pastilla de bobinado simple y es con todo el bajo perfecto para principiantes.";
                            precio="$199.00";
                            break;
                        case 4:
                            titulo="Batería WHD Rock Custom de 5 Cascos de Abedul, Green Burst";
                            mensaje1="La batería WHD Rock Custom por Gear4music consta de 5 cascos de tamaño Rock en Green Burst ";
                            mensaje2="y forma parte de la nueva serie de abedul. Con características que normalmente se encuentran ";
                            mensaje3="en productos más caros, esta batería consta de cascos laminados, aros de 1.5 mm de flange ";
                            mensage4="triple y parches Remo por un precio realmente asequible.";
                            precio="$432.00";
                            break;
                        case 5:
                            titulo="Piano Digital Vertical DP70U de Gear4music";
                            mensaje1="El pianos digital DP70U es una compra fantástica para cualquier principiante queriendo";
                            mensaje2="progresar hacia un instrumento con teclas de estilo acción macillo ponderada o para un niño ";
                            mensaje3="preparando sus exámenes de música. Este modelo Gear4music ofrece grandes voces junto con un";
                            mensage4=" número de funciones y efectos para traer un piano sofisticado a un precio imbatible";
                            precio="$589.00";
                            break;
                        case 6:
                            titulo="Arpa de 29 Cuerdas con Palancas de Gear4music";
                            mensaje1="El arpa irlandesa de 29 cuerdas de Gear4music es un instrumento hecho de maderas de ";
                            mensaje2="haya que combina la alta calidad de la madera y la artesanía para crear un arpa ligera e ";
                            mensaje3="increíble. Este instrumento ofrece una proyección de sonido excelente y puede afinarse ";
                            mensage4="gracias a los clavijeros.";
                            precio="$407.00";
                            break;
                        case 7:
                            titulo="Native Instruments Traktor Kontrol S8 Controlador de DJ Profesional";
                            mensaje1="El Traktor Kontrol S8 es el nuevo sistema de control para DJ todo en uno de Native";
                            mensaje2="Instrument. Las ruedas, faders y franjas sensibles al tacto ofrecen una experiencia única";
                            mensaje3="de DJ multisensorial con una configuración práctica y una respuesta rapidísima ideal ";
                            mensage4="para el rendimiento.";
                            precio="$928.00";
                            break;
                    }
                    conta=7;
                }
                break;
            case MotionEvent.ACTION_MOVE:
                if (puntero==imagen1 && puntero.estaEnArea(xp,yp)){
                    imagen1.movery(yp);
                    imagen2.movery(yp+500);
                    imagen3.movery(yp+1000);
                    imagen4.movery(yp+1500);
                    imagen5.movery(yp+2000);
                    imagen6.movery(yp+2500);
                    imagen7.movery(yp+3000);
                    seleccion.movery(yp);
                }
                if (puntero==imagen2 && puntero.estaEnArea(xp,yp)){
                    imagen1.movery(yp-500);
                    imagen2.movery(yp);
                    imagen3.movery(yp+500);
                    imagen4.movery(yp+1000);
                    imagen5.movery(yp+1500);
                    imagen6.movery(yp+2000);
                    imagen7.movery(yp+2500);
                    seleccion.movery(yp);
                }
                if (puntero==imagen3 && puntero.estaEnArea(xp,yp)){
                    imagen1.movery(yp-1000);
                    imagen2.movery(yp-500);
                    imagen3.movery(yp);
                    imagen4.movery(yp+500);
                    imagen5.movery(yp+1000);
                    imagen6.movery(yp+1500);
                    imagen7.movery(yp+2000);
                    seleccion.movery(yp);
                }
                if (puntero==imagen4 && puntero.estaEnArea(xp,yp)){
                    imagen1.movery(yp-1500);
                    imagen2.movery(yp-1000);
                    imagen3.movery(yp-500);
                    imagen4.movery(yp);
                    imagen5.movery(yp+500);
                    imagen6.movery(yp+1000);
                    imagen7.movery(yp+1500);
                    seleccion.movery(yp);
                }
                if (puntero==imagen5 && puntero.estaEnArea(xp,yp)){
                    imagen1.movery(yp-2000);
                    imagen2.movery(yp-1500);
                    imagen3.movery(yp-1000);
                    imagen4.movery(yp-500);
                    imagen5.movery(yp);
                    imagen6.movery(yp+500);
                    imagen7.movery(yp+1000);
                    seleccion.movery(yp);
                }
                if (puntero==imagen6 && puntero.estaEnArea(xp,yp)){
                    imagen1.movery(yp-2500);
                    imagen2.movery(yp-2000);
                    imagen3.movery(yp-1500);
                    imagen4.movery(yp-1000);
                    imagen5.movery(yp-500);
                    imagen6.movery(yp);
                    imagen7.movery(yp+500);
                    seleccion.movery(yp);
                }
                if (puntero==imagen7 && puntero.estaEnArea(xp,yp)){
                    //if (imagen7.regresarx() >= 2000) {
                    imagen1.movery(yp - 3000);
                    imagen2.movery(yp - 2500);
                    imagen3.movery(yp - 2000);
                    imagen4.movery(yp - 1500);
                    imagen5.movery(yp - 1000);
                    imagen6.movery(yp - 500);
                    imagen7.movery(yp);
                    seleccion.movery(yp);
                    //}
                }
        }
        invalidate();
        return true;
    }
}
