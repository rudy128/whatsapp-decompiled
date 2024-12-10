package X;

import android.content.Context;

/* renamed from: X.BVe  reason: case insensitive filesystem */
public class C22916BVe extends C22917BVf implements C28512E4w {
    public DG9 A00;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.DG9] */
    public void A01(Context context) {
        A53 a53;
        synchronized (A53.class) {
            a53 = A53.A03;
            if (a53 == null) {
                a53 = new A53(context);
                A53.A03 = a53;
            }
        }
        this.A00 = a53;
        this.A01 = this;
        ? obj = new Object();
        obj.A01 = this;
        obj.A00 = new CNW(context);
        obj.A02 = new DUP(obj, 8);
        this.A00 = obj;
    }

    public C28511E4v BFq(C24473C5o c5o) {
        if (!(this instanceof C22915BVd)) {
            return null;
        }
        C22915BVd bVd = (C22915BVd) this;
        C18070vi.A0d(c5o, 0);
        String A01 = c5o.A01();
        switch (A01.hashCode()) {
            case 101264299:
                if (A01.equals("eviction.v2")) {
                    return (DG7) bVd.A01.A00.getValue();
                }
                return null;
            case 351608024:
                if (A01.equals("version")) {
                    return (DG6) bVd.A01.A03.getValue();
                }
                return null;
            case 408072700:
                if (A01.equals("max_size")) {
                    return (DG8) bVd.A01.A01.getValue();
                }
                return null;
            case 1738660166:
                if (A01.equals("stale_removal")) {
                    return (DG5) bVd.A01.A02.getValue();
                }
                return null;
            default:
                return null;
        }
    }
}
