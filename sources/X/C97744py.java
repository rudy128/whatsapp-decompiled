package X;

/* renamed from: X.4py  reason: invalid class name and case insensitive filesystem */
public class C97744py implements C40981vc {
    public final int A00;
    public final Object A01;

    public C97744py(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BAE(long j, int i) {
        int i2 = this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            C91454fi r3 = (C91454fi) obj;
            C59822mw r0 = r3.A02;
            if (r0 != null && r0.A02 == j && i != 0) {
                r3.A02 = null;
                C91454fi.A00(r3);
                return;
            }
            return;
        }
        C77843ra r32 = (C77843ra) obj;
        C59822mw r02 = r32.A00;
        if (r02 != null && r02.A02 == j && i != 0) {
            r32.A00 = null;
            r32.A01.invalidateOptionsMenu();
        }
    }

    public void BAF(AnonymousClass1BI r3, String str) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C91454fi r1 = (C91454fi) obj;
            if (r1.A02 != null && r3.equals(r1.A05) && str.equals(r1.A02.A07)) {
                r1.A02 = null;
                C91454fi.A00(r1);
                return;
            }
            return;
        }
        C77843ra r12 = (C77843ra) obj;
        if (r12.A00 != null && r3.equals(r12.A0J) && str.equals(r12.A00.A07)) {
            r12.A00 = null;
            r12.A01.invalidateOptionsMenu();
        }
    }

    public void C4R(C59822mw r4) {
        if (this.A00 != 0) {
            AnonymousClass1BI r2 = r4.A04;
            C91454fi r1 = (C91454fi) this.A01;
            if (r2.equals(r1.A05)) {
                r1.A02 = r4;
                C91454fi.A00(r1);
                return;
            }
            return;
        }
        C77843ra r22 = (C77843ra) this.A01;
        if (r22.A0G.equals(r4.A04)) {
            r22.A00 = r4;
            r22.A01.invalidateOptionsMenu();
        }
    }
}
