package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.facebook.animated.webp.WebPImage;

/* renamed from: X.6yl  reason: invalid class name and case insensitive filesystem */
public class C139396yl {
    public int A00 = 0;
    public Bitmap A01;
    public Bitmap A02;
    public Canvas A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Bitmap A08;
    public final WebPImage A09;
    public final String A0A;
    public final Paint A0B;

    public synchronized void finalize() {
        this.A09.dispose();
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
            this.A01 = null;
        }
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.A02 = null;
        }
    }

    public static void A00(Canvas canvas, C24988CSo cSo, C139396yl r11) {
        int i = cSo.A02;
        float f = r11.A04;
        int i2 = cSo.A03;
        canvas.drawRect(((float) i) * f, ((float) i2) * f, ((float) (i + cSo.A01)) * f, ((float) (i2 + cSo.A00)) * f, r11.A0B);
    }

    public C139396yl(Bitmap bitmap, WebPImage webPImage, String str, int i, int i2) {
        this.A0A = str;
        this.A09 = webPImage;
        this.A08 = bitmap;
        Paint A062 = AnonymousClass3MW.A06();
        this.A0B = A062;
        AnonymousClass3MZ.A1D(0, A062);
        C108965cb.A11(A062, PorterDuff.Mode.SRC);
        this.A07 = webPImage.getFrameCount();
        this.A06 = i;
        this.A05 = i2;
        this.A04 = ((float) i) / ((float) Math.max(webPImage.getWidth(), webPImage.getHeight()));
    }
}
