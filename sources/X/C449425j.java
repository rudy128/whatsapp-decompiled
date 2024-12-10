package X;

/* renamed from: X.25j  reason: invalid class name and case insensitive filesystem */
public class C449425j implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C449425j(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void run() {
        switch (this.A00) {
            case 0:
                ((C28251Zq) this.A02).A01(this.A01);
                return;
            case 1:
                C29221bq.A05((C29221bq) this.A02, this.A01);
                return;
            case 2:
                ((C36431ns) this.A02).A03.A00(this.A01, 0);
                return;
            default:
                ((AnonymousClass1DS) ((AnonymousClass1CM) this.A02).A01.get()).A0E(Integer.valueOf(this.A01));
                return;
        }
    }
}
