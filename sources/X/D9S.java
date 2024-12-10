package X;

import com.facebook.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;

public final class D9S implements C22563BCy {
    public C26154CtM A00;
    public final Object A01;
    public final /* synthetic */ C22783BOw A02;

    public D9S(C22783BOw bOw, Object obj) {
        this.A02 = bOw;
        this.A00 = new C26154CtM((C25199Caq) null, bOw.A03.A02, 0);
        this.A01 = obj;
    }

    private CTB A00(CTB ctb) {
        long j = ctb.A04;
        long j2 = ctb.A03;
        if (j == j && j2 == j2) {
            return ctb;
        }
        int i = ctb.A00;
        int i2 = ctb.A02;
        return new CTB(ctb.A05, ctb.A06, i, i2, ctb.A01, j, j2);
    }

    private boolean A01(C25199Caq caq, int i) {
        if (caq != null) {
            C22783BOw bOw = this.A02;
            Object obj = this.A01;
            if (bOw instanceof C22782BOv) {
                DS9 ds9 = (DS9) obj;
                int i2 = 0;
                while (true) {
                    List list = ds9.A04;
                    if (i2 >= list.size()) {
                        return false;
                    }
                    if (((D9L) list.get(i2)).A04.A03 == caq.A03) {
                        caq = caq.A00(caq.A02 + ds9.A01);
                        break;
                    }
                    i2++;
                }
            }
        } else {
            caq = null;
        }
        C22783BOw bOw2 = this.A02;
        Object obj2 = this.A01;
        if (bOw2 instanceof C22782BOv) {
            i += ((DS9) obj2).A02;
        }
        C26154CtM ctM = this.A00;
        if (ctM.A00 == i && Util.A0D(ctM.A01, caq)) {
            return true;
        }
        this.A00 = new C26154CtM(caq, bOw2.A03.A02, i);
        return true;
    }

    public void BsG(C25199Caq caq, CTB ctb, int i) {
        if (A01(caq, i)) {
            this.A00.A0A(A00(ctb));
        }
    }

    public void Bwp(C25199Caq caq, CJ1 cj1, CTB ctb, int i) {
        if (A01(caq, i)) {
            this.A00.A06(cj1, A00(ctb));
        }
    }

    public void Bwr(C25199Caq caq, CJ1 cj1, CTB ctb, Object obj, int i) {
        if (A01(caq, i)) {
            this.A00.A09(cj1, A00(ctb), obj);
        }
    }

    public void Bwv(C25199Caq caq, CJ1 cj1, CTB ctb, IOException iOException, int i, boolean z) {
        if (A01(caq, i)) {
            this.A00.A08(cj1, A00(ctb), iOException, z);
        }
    }

    public void Bx2(C25199Caq caq, CJ1 cj1, CTB ctb, int i) {
        if (A01(caq, i)) {
            this.A00.A07(cj1, A00(ctb));
        }
    }

    public void Bxw(C25199Caq caq, int i) {
        if (A01(caq, i)) {
            this.A00.A02();
        }
    }

    public void Bxx(C25199Caq caq, int i) {
        if (A01(caq, i)) {
            this.A00.A03();
        }
    }

    public void C2X(C25199Caq caq, int i) {
        if (A01(caq, i)) {
            this.A00.A04();
        }
    }
}
