package X;

/* renamed from: X.1hP  reason: invalid class name and case insensitive filesystem */
public class C32571hP {
    public final C18030ve A00;
    public final AnonymousClass18K A01;
    public final C32561hO A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass11E A04;
    public final AnonymousClass11P A05;

    public static int A00(C32571hP r0) {
        Integer A002 = AnonymousClass1LS.A00(r0.A04.A04());
        if (A002 == null) {
            return 0;
        }
        return A002.intValue();
    }

    public static long A01(C32571hP r3) {
        long A012 = AnonymousClass11P.A01(r3.A05);
        return A012 - (A012 % 86400000);
    }

    public synchronized void A02(int i, int i2) {
        synchronized (this) {
            if (!C18020vd.A05(C18040vf.A02, this.A00, 12670)) {
                long A012 = A01(this);
                int A002 = A00(this);
                C32561hO r5 = this.A02;
                int i3 = i;
                int i4 = i2;
                C63132sZ A013 = r5.A01(i3, A002, i4, A012, false);
                A013.A08++;
                r5.A02(A013, i3, A002, i4, A012, false);
            }
        }
    }

    public synchronized void A03(C136496tu r21, int i, int i2) {
        synchronized (this) {
            int A002 = A00(this);
            if (!C18020vd.A05(C18040vf.A02, this.A00, 12670)) {
                long A012 = A01(this);
                C32561hO r5 = this.A02;
                int i3 = i;
                int i4 = i2;
                C63132sZ A013 = r5.A01(i4, A002, i3, A012, false);
                A013.A05++;
                r5.A02(A013, i4, A002, i3, A012, false);
            }
            ((C132006m1) this.A03.get()).A00(r21, A002);
        }
    }

    public C32571hP(AnonymousClass11E r1, AnonymousClass11P r2, C18030ve r3, AnonymousClass18K r4, C32561hO r5, AnonymousClass00H r6) {
        this.A05 = r2;
        this.A01 = r4;
        this.A04 = r1;
        this.A02 = r5;
        this.A03 = r6;
        this.A00 = r3;
    }
}
