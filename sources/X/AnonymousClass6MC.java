package X;

import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.6MC  reason: invalid class name */
public class AnonymousClass6MC extends A34 {
    public final AnonymousClass1SB A00;
    public final C1607989y A01;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass725[] r6 = (AnonymousClass725[]) objArr;
        C17960vV.A07(r6);
        AnonymousClass1SB r4 = this.A00;
        AnonymousClass725 r3 = r6[0];
        C17960vV.A00();
        if (r3.A0W && !r3.A0U) {
            return AnonymousClass1SB.A00(r4, ((C134006pr) r4.A0M.get()).A01(r3), r3.A0H);
        }
        C17960vV.A00();
        String str = r3.A0H;
        File A012 = AnonymousClass1SB.A01(r3, r4);
        if (A012 == null || A012.exists() || ((C133966pn) r4.A0J.get()).A01(r3)) {
            return AnonymousClass1SB.A00(r4, A012, str);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C1607989y r0 = this.A01;
        if (bitmap == null) {
            r0.Bwy();
        } else {
            r0.Bx3(bitmap);
        }
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        this.A01.Bwo(((Bitmap[]) objArr)[0]);
    }

    public AnonymousClass6MC(AnonymousClass1SB r1, C1607989y r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
