package X;

/* renamed from: X.Ck3  reason: case insensitive filesystem */
public class C25672Ck3 {
    public static final C25672Ck3 A04;
    public static final C25672Ck3 A05;
    public static final C25672Ck3 A06;
    public C28547E6v A00;
    public C28547E6v A01;
    public C28548E6w A02;
    public boolean A03 = false;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Ck3] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.Ck3] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Ck3] */
    static {
        ? obj = new Object();
        obj.A03 = false;
        DY1 dy1 = C24735CHx.A03;
        obj.A01 = dy1;
        obj.A00 = dy1;
        obj.A02 = C24735CHx.A00;
        A06 = obj;
        ? obj2 = new Object();
        obj2.A03 = true;
        DY0 dy0 = C24735CHx.A02;
        obj2.A01 = dy0;
        obj2.A00 = dy0;
        DY3 dy3 = C24735CHx.A01;
        obj2.A02 = dy3;
        A05 = obj2;
        ? obj3 = new Object();
        obj3.A03 = false;
        obj3.A01 = dy1;
        obj3.A00 = dy1;
        obj3.A02 = dy3;
        A04 = obj3;
    }

    public void A00(Appendable appendable, String str) {
        if (!this.A01.Bk7(str)) {
            appendable.append(str);
            return;
        }
        appendable.append('\"');
        C25672Ck3 ck3 = C25453Cg5.A00;
        if (str != null) {
            this.A02.BKa(appendable, str);
        }
        appendable.append('\"');
    }

    public C25672Ck3() {
        DY1 dy1 = C24735CHx.A03;
        this.A01 = dy1;
        this.A00 = dy1;
        this.A02 = C24735CHx.A00;
    }
}
