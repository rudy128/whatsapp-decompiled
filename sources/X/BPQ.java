package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

public class BPQ extends DA3 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public Bitmap A08;
    public final float A09;

    public BPQ(DAE dae) {
        super(dae);
        float f = this.A0B;
        float f2 = f * 12.0f;
        this.A03 = f2;
        this.A04 = 0.4f * f;
        float f3 = f * 16.0f;
        this.A02 = f3;
        this.A06 = f2;
        this.A07 = 4.8f * f;
        this.A05 = 1.6f * f;
        this.A09 = f * 44.0f;
        this.A03 = 5;
        this.A02 = 1.0f;
        int A032 = BE8.A03(f3 * 1.08f, 2.0f);
        Bitmap createBitmap = Bitmap.createBitmap(A032, A032, Bitmap.Config.ARGB_8888);
        this.A08 = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        float f4 = ((float) A032) / 2.0f;
        float f5 = this.A05;
        float f6 = f4 - f5;
        float f7 = f5 + f4;
        RectF rectF = new RectF(f6, f6, f7, f7);
        float f8 = 1.08f * this.A02;
        RadialGradient radialGradient = new RadialGradient(f4, f4, f8, new int[]{570425344, 570425344, 0}, new float[]{0.9259259f, 0.9259259f, 1.0f}, Shader.TileMode.CLAMP);
        Path A0L = C108945cZ.A0L();
        Paint A0K = C108945cZ.A0K(1);
        Paint.Style style = Paint.Style.FILL;
        A0K.setStyle(style);
        A0K.setShader(radialGradient);
        canvas.drawCircle(f4, f4, f8, A0K);
        A0K.reset();
        A0K.setFlags(1);
        A0K.setStyle(style);
        A0K.setColor(-2046820353);
        canvas.drawCircle(f4, f4, this.A02, A0K);
        AnonymousClass3MW.A1P(A0K);
        A0K.setColor(-6118750);
        A0K.setStrokeWidth(this.A04);
        canvas.drawCircle(f4, f4, this.A02, A0K);
        A0K.setFlags(1);
        A0K.setStyle(style);
        A0K.setColor(-1365724);
        A0L.reset();
        A0L.moveTo(f4 - this.A07, f4);
        A0L.lineTo(f4 - this.A05, f4);
        A0L.addArc(rectF, 180.0f, 90.0f);
        A0L.lineTo(f4, f4 - this.A06);
        BE8.A0w(canvas, A0K, A0L, f4 - this.A07, f4);
        A0K.setStyle(style);
        A0K.setColor(-2811114);
        A0L.reset();
        A0L.moveTo(this.A07 + f4, f4);
        A0L.lineTo(this.A05 + f4, f4);
        A0L.addArc(rectF, 0.0f, -90.0f);
        A0L.lineTo(f4, f4 - this.A06);
        BE8.A0w(canvas, A0K, A0L, this.A07 + f4, f4);
        C108945cZ.A1L(A0K);
        A0K.setColor(-4013374);
        A0L.reset();
        A0L.moveTo(f4 - this.A07, f4);
        A0L.lineTo(f4 - this.A05, f4);
        A0L.addArc(rectF, 180.0f, -90.0f);
        A0L.lineTo(f4, this.A06 + f4);
        BE8.A0w(canvas, A0K, A0L, f4 - this.A07, f4);
        C108945cZ.A1L(A0K);
        A0K.setColor(-2434342);
        A0L.reset();
        A0L.moveTo(this.A07 + f4, f4);
        A0L.lineTo(this.A05 + f4, f4);
        A0L.addArc(rectF, 0.0f, 90.0f);
        A0L.lineTo(f4, this.A06 + f4);
        BE8.A0w(canvas, A0K, A0L, this.A07 + f4, f4);
    }

    public void A08(Canvas canvas) {
        canvas.save();
        float f = this.A07.A0R.A00.A0Q.A0A;
        if (f < 0.0f) {
            f += 360.0f;
        }
        canvas.rotate(f, this.A00, this.A01);
        Bitmap bitmap = this.A08;
        float f2 = this.A00;
        float f3 = this.A02;
        canvas.drawBitmap(bitmap, f2 - f3, this.A01 - f3, (Paint) null);
        canvas.restore();
    }
}
