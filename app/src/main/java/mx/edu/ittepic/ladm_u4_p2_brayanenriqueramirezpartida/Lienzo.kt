package mx.edu.ittepic.ladm_u4_p2_brayanenriqueramirezpartida

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View


class Lienzo(p: MainActivity) : View(p) {
    var posX = 300f // pos x
    var dia = true  // control de escenario

    override fun onDraw(c: Canvas) {
        var p = Paint()

        if (dia) {
            //dibujar cielo
            c.drawColor(Color.rgb(61, 163, 188))

            //dibujar sol
            p.color = Color.YELLOW
            c.drawCircle(170f, 170f, 150f, p)



            //dibujar tierra
            p.color = Color.rgb(205, 190, 104)
            p.style = Paint.Style.FILL
            c.drawCircle(500f, 3000f, 1500f, p)
        } else {
            //dibujar cielo
            c.drawColor(Color.rgb(0, 0, 0))

            //dibujar luna
            p.color = Color.WHITE
            p.style = Paint.Style.FILL
            c.drawCircle(170f, 170f, 150f, p)

            // Nube
            p.color = Color.rgb(173, 183, 184)
            p.style = Paint.Style.FILL
            c.drawCircle(70f, 150f, 60f, p)
            c.drawCircle(120f, 152f, 60f, p)
            c.drawCircle(170f, 150f, 60f, p)

            p.color = Color.rgb(214, 222, 216)
            p.style = Paint.Style.FILL
            c.drawCircle(170f, 208f, 60f, p)
            c.drawCircle(220f, 208f, 60f, p)
            c.drawCircle(270f, 208f, 60f, p)
            c.drawCircle(310f, 208f, 60f, p)


            c.drawCircle(150f, 1370f, 80f, p)
            c.drawRect(160f, 1300f, 415f, 1450f, p)
            c.drawCircle(420f, 1390f, 60f, p)
            c.drawCircle(350f, 1320f, 75f, p)
            c.drawCircle(230f, 1290f, 95f, p)

            p.color = Color.rgb(214, 222, 216)
            p.style = Paint.Style.FILL
            c.drawCircle(650f, 1750f, 80f, p)
            c.drawCircle(720f, 1752f, 80f, p)
            c.drawCircle(720f, 1700f, 80f, p)
            c.drawCircle(720f, 1796f, 80f, p)
            c.drawCircle(790f, 1750f, 80f, p)
            c.drawCircle(790f, 1700f, 80f, p)
            c.drawCircle(790f, 1796f, 80f, p)
            c.drawCircle(860f, 1748f, 80f, p)
            c.drawCircle(860f, 1700f, 80f, p)
            c.drawCircle(860f, 1796f, 80f, p)
            c.drawCircle(930f, 1748f, 80f, p)

            p.color = Color.rgb(173, 183, 184)
            p.style = Paint.Style.FILL
            c.drawCircle(450f, 1720f, 80f, p)
            c.drawCircle(520f, 1722f, 80f, p)
            c.drawCircle(520f, 1670f, 80f, p)
            c.drawCircle(520f, 1766f, 80f, p)
            c.drawCircle(590f, 1720f, 80f, p)
            c.drawCircle(590f, 1670f, 80f, p)
            c.drawCircle(590f, 1766f, 80f, p)
            c.drawCircle(660f, 1718f, 80f, p)
            c.drawCircle(660f, 1670f, 80f, p)
            c.drawCircle(660f, 1766f, 80f, p)
            c.drawCircle(730f, 1718f, 80f, p)

            //dibujar estrellas
            p.color = Color.WHITE
            p.style = Paint.Style.FILL
            c.drawCircle(80f, 342f, 8f, p)
            c.drawCircle(180f, 490f, 8f, p)
            c.drawCircle(110f, 642f, 8f, p)
            c.drawCircle(260f, 350f, 8f, p)
            c.drawCircle(320f, 520f, 8f, p)
            c.drawCircle(430f, 280f, 8f, p)
            c.drawCircle(475f, 142f, 8f, p)
            c.drawCircle(675f, 262f, 8f, p)
            c.drawCircle(700f, 80f, 8f, p)
            c.drawCircle(930f, 120f, 8f, p)
            c.drawCircle(975f, 288f, 8f, p)
            c.drawCircle(1025f, 500f, 8f, p)


            //c.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.cohete), 400f, 200f, p)
        }


        c.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.proyecto), posX, 700f, p)
    }
}