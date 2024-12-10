package X;

/* renamed from: X.3C2  reason: invalid class name */
public class AnonymousClass3C2 implements Runnable {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;

    public AnonymousClass3C2(Object obj, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = j;
    }

    public final void run() {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C40991vd r5 = (C40991vd) this.A03;
                long j = this.A02;
                int i = this.A01;
                C40971vb r1 = r5.A00;
                r1.A09.A0J(new C21470Akb((Object) r5, i, 24, (Object) r1.A0J.A01(j)));
                return;
            case 2:
                C31301fL r7 = (C31301fL) this.A03;
                int i2 = this.A01;
                long j2 = this.A02;
                AnonymousClass2G3 r6 = new AnonymousClass2G3();
                r6.A00 = Integer.valueOf(i2);
                r6.A04 = r7.A01;
                long A002 = AnonymousClass11P.A00(r7.A03);
                r6.A03 = Long.valueOf(A002);
                r6.A01 = Long.valueOf(A002 - r7.A00);
                r6.A02 = Long.valueOf(j2);
                AnonymousClass18K r12 = r7.A04;
                r12.CC7(r6);
                r12.CHJ(true);
                return;
            default:
                A7P a7p = (A7P) this.A03;
                int i3 = this.A01;
                long j3 = this.A02;
                C171778sG A003 = A7P.A00(a7p, 0);
                A003.A03 = Integer.valueOf(i3);
                A003.A0J = Long.valueOf(j3);
                A7P.A01(A003, a7p);
                return;
        }
    }
}
