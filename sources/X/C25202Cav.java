package X;

import android.util.SparseArray;

/* renamed from: X.Cav  reason: case insensitive filesystem */
public class C25202Cav {
    public final SparseArray A00 = BE6.A0Q();
    public final SparseArray A01 = BE6.A0Q();
    public final SparseArray A02 = BE6.A0Q();
    public final C26194CuP A03;

    public C22909BUu A00(int i) {
        Object obj = this.A02.get(C26194CuP.A00(this.A03, i));
        C28111Yx.A02(obj);
        return (C22909BUu) obj;
    }

    public C25632CjI A01(int i) {
        Object obj = this.A00.get(C26194CuP.A00(this.A03, i));
        C28111Yx.A02(obj);
        return (C25632CjI) obj;
    }

    public C25971Cpe A02(int i) {
        Object obj = this.A01.get(C26194CuP.A00(this.A03, i));
        C28111Yx.A02(obj);
        return (C25971Cpe) obj;
    }

    public C25202Cav(C26194CuP cuP) {
        this.A03 = cuP;
    }
}
