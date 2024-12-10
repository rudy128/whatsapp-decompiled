package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3Di  reason: invalid class name */
public class AnonymousClass3Di implements C18080vj, C18090vk {
    public final int A00;

    public AnonymousClass3Di(int i) {
        this.A00 = i;
    }

    public final Object invoke() {
        switch (this.A00) {
            case 0:
            case 1:
                return Collections.synchronizedMap(C17880vN.A11());
            case 2:
                return new AtomicReference((Object) null);
            case 3:
                return C17890vO.A0Q();
            case 4:
                C18100vl r0 = C30361do.A0C;
                return C200410p.A0S(new AnonymousClass1D6[]{new AnonymousClass1D6(15, 15), new AnonymousClass1D6(19, 19)});
            case 5:
                PorterDuffXfermode porterDuffXfermode = C43081zE.A0S;
                Paint paint = new Paint(1);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                paint.setColor(-1);
                return paint;
            case 6:
                PorterDuffXfermode porterDuffXfermode2 = C43081zE.A0S;
                return new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            case 7:
                PorterDuffXfermode porterDuffXfermode3 = C43081zE.A0S;
                return new C43521zw();
            case 8:
                PorterDuffXfermode porterDuffXfermode4 = C43081zE.A0S;
                return new Path();
            case 9:
                PorterDuffXfermode porterDuffXfermode5 = C43081zE.A0S;
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setDither(true);
                paint2.setFilterBitmap(true);
                return paint2;
            case 10:
                return new AnonymousClass2QE();
            case 11:
                return new Path();
            case 12:
            case 13:
                return new RectF();
            case 16:
                return AnonymousClass1ZU.A06(new C39251sl(), new C39291sp(), new C39301sq(AnonymousClass00R.A0C), new C39301sq(AnonymousClass00R.A01), new C39301sq(AnonymousClass00R.A00), new C39331st());
            default:
                return new C39351sv(0, 0, 0, 0);
        }
    }
}
