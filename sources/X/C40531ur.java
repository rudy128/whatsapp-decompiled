package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.1ur  reason: invalid class name and case insensitive filesystem */
public abstract class C40531ur implements C40521uq {
    public final List A00;

    public boolean BgZ() {
        List list = this.A00;
        if (list.isEmpty() || (list.size() == 1 && ((C40511up) list.get(0)).A02())) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.A00;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }

    public C40531ur(List list) {
        this.A00 = list;
    }

    public List BTm() {
        return this.A00;
    }
}
