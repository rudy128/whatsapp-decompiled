package X;

/* renamed from: X.3bs  reason: invalid class name and case insensitive filesystem */
public class C74523bs extends C114375qh {
    public final int A00;
    public final Object A01;

    public C74523bs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void A01(Object obj, int i) {
        if (this.A00 != 0) {
            A03((C23520Bik) obj, i);
        } else {
            ((Runnable) this.A01).run();
        }
    }

    public void A03(C23520Bik bik, int i) {
        if (this.A00 != 0) {
            C90594eK r1 = (C90594eK) this.A01;
            C90594eK.A00(r1, 0);
            r1.A02.clear();
            return;
        }
        ((Runnable) this.A01).run();
    }
}
