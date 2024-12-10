package X;

import java.util.List;

/* renamed from: X.1uy  reason: invalid class name and case insensitive filesystem */
public class C40601uy implements C40521uq {
    public final List A00;

    public C26049CrJ BHA() {
        List list = this.A00;
        if (((C40511up) list.get(0)).A02()) {
            return new AnonymousClass29O(list);
        }
        return new AnonymousClass29N(list);
    }

    public boolean BgZ() {
        List list = this.A00;
        if (list.size() != 1 || !((C40511up) list.get(0)).A02()) {
            return false;
        }
        return true;
    }

    public C40601uy(List list) {
        this.A00 = list;
    }

    public List BTm() {
        return this.A00;
    }
}
