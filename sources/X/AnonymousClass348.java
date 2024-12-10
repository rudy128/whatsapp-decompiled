package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;

/* renamed from: X.348  reason: invalid class name */
public class AnonymousClass348 implements BC9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass348(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    public final void BsD(C1409173o r10, C136996uk r11) {
        C63042sP r2;
        int i;
        short s;
        C136996uk r4 = r11;
        switch (this.A00) {
            case 0:
                C60142nS r3 = (C60142nS) this.A01;
                Object obj = this.A02;
                Object obj2 = this.A03;
                C18070vi.A0f(r10, 3, r11);
                if (r10.A03()) {
                    r3.A03.CGF(new C21368Aix(obj, r3, r4, obj2, 17));
                    return;
                }
                return;
            case 1:
                C18070vi.A0h(r10, r11);
                if (!r10.A03()) {
                    ((C63822tk) this.A03).A0R.CGF(new C70623Bv(this.A01, this.A02, 12));
                    return;
                }
                C63822tk r5 = (C63822tk) this.A03;
                r5.A0R.CGF(new C70833Cr((Object) r4, (Object) r5, this.A02, this.A01, 2));
                return;
            case 2:
                if (r10.A03()) {
                    C17890vO.A0q((AnonymousClass10T) this.A03, 24);
                    return;
                }
                return;
            default:
                File file = (File) this.A01;
                C48282Lw r32 = (C48282Lw) this.A02;
                C22821Di r22 = (C22821Di) this.A03;
                C18070vi.A0d(file, 0);
                C18070vi.A0d(r10, 3);
                C17900vP.A0Y(r10, "AlbumArtworkWaDownloader/download result=", AnonymousClass000.A10());
                if (r10.A03()) {
                    Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                    if (decodeFile != null) {
                        r22.invoke(decodeFile);
                    }
                    r2 = (C63042sP) r32.A03.get();
                    i = 501822150;
                    s = 2;
                } else {
                    r22.invoke((Object) null);
                    r2 = (C63042sP) r32.A03.get();
                    i = 501822150;
                    s = 3;
                }
                C63042sP.A01(r2, i, s);
                return;
        }
    }

    public /* synthetic */ void BsA(long j) {
    }

    public /* synthetic */ void BsC(boolean z) {
    }
}
