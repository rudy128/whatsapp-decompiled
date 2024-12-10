package X;

import android.content.Context;
import java.util.Map;

public final class DDT implements C28592E9h, EA4 {
    public final CK3 A00 = new CK3();
    public final EDF A01;

    public EDK BP7(C22892BUd bUd) {
        C18070vi.A0d(bUd, 0);
        EDK BP7 = this.A01.BP7(bUd);
        C18070vi.A0X(BP7);
        return BP7;
    }

    public E4f BP8(C9Z c9z) {
        C18070vi.A0d(c9z, 0);
        return this.A01.BP8(c9z);
    }

    public Object BPA(C25313CdJ cdJ) {
        C18070vi.A0d(cdJ, 0);
        return this.A01.BPA(cdJ);
    }

    public boolean BeL(C22892BUd bUd) {
        C18070vi.A0d(bUd, 0);
        return this.A01.BeL(bUd);
    }

    public boolean BeM(C9Z c9z) {
        C18070vi.A0d(c9z, 0);
        return this.A01.BeM(c9z);
    }

    public synchronized void CG0() {
        EDF edf = this.A01;
        C25515ChD chD = new C25515ChD(this.A00);
        DEJ dej = (DEJ) edf;
        synchronized (dej) {
            CZ2 cz2 = dej.A03;
            C9Z c9z = EDJ.A00;
            ((EDJ) cz2.A00(c9z)).BtS(28);
            ((EDJ) cz2.A00(c9z)).BlS();
            DEJ.A00(dej);
            if (dej.A07 == 2) {
                dej.A00 = chD;
                C9P c9p = C25515ChD.A02;
                Map map = chD.A00;
                String str = (String) map.remove(c9p);
                String str2 = (String) map.remove(C25515ChD.A03);
                String str3 = (String) map.remove(C25515ChD.A01);
                if (str != null) {
                    ((EDJ) cz2.A00(c9z)).CKE(str);
                }
                if (str2 != null) {
                    cz2.A00(c9z);
                }
                if (str3 != null) {
                    cz2.A00(c9z);
                }
                C22890BUb bUb = dej.A01;
                bUb.CCA();
                bUb.connect();
                dej.A07 = 3;
            }
            ((EDJ) cz2.A00(c9z)).BtP();
        }
    }

    public synchronized void destroy() {
        this.A01.release();
    }

    public synchronized void pause() {
        DEJ dej = (DEJ) this.A01;
        synchronized (dej) {
            if (dej.A07 == 3 || dej.A07 == 4) {
                dej.A07 = 2;
                dej.A01.BIn();
            }
            if (!dej.A04) {
                dej.release();
            }
        }
    }

    public void BCe(String str) {
        if (((DEJ) this.A01).A07 == 0) {
            throw AnonymousClass000.A0n(str);
        }
    }

    public Context getContext() {
        Context context = this.A01.getContext();
        C18070vi.A0X(context);
        return context;
    }

    public DDT(EDF edf) {
        this.A01 = edf;
    }
}
