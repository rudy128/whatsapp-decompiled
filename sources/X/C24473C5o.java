package X;

/* renamed from: X.C5o  reason: case insensitive filesystem */
public abstract class C24473C5o {
    public String A01() {
        if (this instanceof C22920BVi) {
            return "user_scope";
        }
        if (this instanceof C22919BVh) {
            return "stale_removal";
        }
        if (this instanceof C22923BVl) {
            return "eviction.v2";
        }
        return ((C22918BVg) this).A00.A01();
    }
}
