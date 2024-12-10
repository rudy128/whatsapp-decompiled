package X;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* renamed from: X.AMd  reason: case insensitive filesystem */
public final class C20466AMd implements BCQ {
    public C115525vC A00;
    public final int A01;

    public /* bridge */ /* synthetic */ void Blh(BCx bCx) {
        B7F b7f;
        C20467AMe aMe = (C20467AMe) bCx;
        if (aMe.A00() && (b7f = aMe.A02) != null) {
            b7f.Bli(aMe);
        }
    }

    public /* bridge */ /* synthetic */ void Bwu(BCx bCx) {
        B7G b7g;
        C20467AMe aMe = (C20467AMe) bCx;
        C168568j6 r4 = (C168568j6) aMe;
        if (r4.A00 == 1) {
            ArrayList A0z = C17880vN.A0z(2);
            C20491ANc aNc = new C20491ANc(aMe, this, 1);
            String str = aMe.A05;
            String str2 = r4.A01;
            String str3 = r4.A02;
            int i = this.A01;
            C168568j6 r42 = new C168568j6(aMe.BSp(), (B7F) null, (B7G) null, aNc, str, str2, str3, 2, i, i);
            C168568j6 r12 = new C168568j6(aMe.BSp(), (B7F) null, (B7G) null, aNc, str, str2, str3, 3, Integer.MAX_VALUE, Integer.MAX_VALUE);
            A0z.add(r42);
            A0z.add(r12);
            aMe.A00 = A0z;
            C115525vC r2 = this.A00;
            if (r2 != null) {
                r2.A03(r42, true);
                this.A00.A03(r12, true);
            }
        } else if (aMe.A00() && (b7g = aMe.A03) != null) {
            b7g.Bwx(aMe);
        }
    }

    public /* bridge */ /* synthetic */ void Bx6(Bitmap bitmap, BCx bCx, boolean z) {
        C20467AMe aMe = (C20467AMe) bCx;
        if (aMe.A00()) {
            if (aMe.BSp() != null) {
                aMe.BSp().setTag(2131432150, aMe.Bb5());
            }
            aMe.A04.Bx5(bitmap, aMe, z);
        }
    }

    public C20466AMd(int i) {
        this.A01 = i;
    }

    public /* bridge */ /* synthetic */ void Bx1(BCx bCx) {
    }
}
