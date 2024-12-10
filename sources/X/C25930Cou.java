package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Cou  reason: case insensitive filesystem */
public abstract class C25930Cou {
    public static float A00 = 1.0f;
    public static long A01;
    public static Context A02;
    public static final HashMap A03 = new HashMap(16);
    public static final float A04 = (((float) Math.sqrt(3.0d)) / 2.0f);

    public static C25478CgX A00() {
        C25478CgX cgX;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("hue_");
        A10.append(240.0f);
        String obj = A10.toString();
        HashMap hashMap = A03;
        Reference reference = (Reference) hashMap.get(obj);
        if (reference == null || (cgX = (C25478CgX) reference.get()) == null) {
            Paint A0K = C108945cZ.A0K(1);
            float f = A00 * 10.0f;
            int A042 = BE6.A04(2.0f, f);
            int A043 = BE6.A04(3.0f, f);
            Bitmap createBitmap = Bitmap.createBitmap(A042 + 10, A043 + 10, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            float[] fArr = {240.0f, 1.0f, 1.0f};
            int HSVToColor = Color.HSVToColor(fArr);
            fArr[2] = 0.8f;
            int HSVToColor2 = Color.HSVToColor(fArr);
            fArr[2] = 0.5f;
            int HSVToColor3 = Color.HSVToColor(fArr);
            A0K.setColor(HSVToColor);
            float f2 = f + 5.0f;
            float f3 = (float) (A043 + 5);
            A01(canvas, A0K, f2, f3, f);
            A0K.setColor(HSVToColor3);
            canvas.drawCircle(f2, f2, f / 2.5f, A0K);
            AnonymousClass3MW.A1P(A0K);
            A0K.setStrokeWidth(A00);
            A0K.setColor(HSVToColor2);
            A01(canvas, A0K, f2, f3, f);
            if (createBitmap == null) {
                return null;
            }
            cgX = new C25478CgX(createBitmap);
            hashMap.put(obj, AnonymousClass3MW.A0z(cgX));
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = A01;
        if (j >= 600000 || j == 0) {
            A01 = uptimeMillis;
            Iterator A0i = C17890vO.A0i(hashMap);
            while (A0i.hasNext()) {
                if (((Reference) C17890vO.A0P(A0i)).get() == null) {
                    A0i.remove();
                }
            }
        }
        return cgX;
    }

    public static void A01(Canvas canvas, Paint paint, float f, float f2, float f3) {
        Path A0L = C108945cZ.A0L();
        float f4 = f3 * 2.0f;
        float f5 = f2 - f4;
        A0L.moveTo(f, f5);
        A0L.arcTo(new RectF(f - f3, f5 - f3, f + f3, f5 + f3), 30.0f, -240.0f, true);
        A0L.lineTo(f, f4 + f5);
        BE8.A0w(canvas, paint, A0L, f + (A04 * f3), f5 + (f3 * 0.5f));
    }
}
