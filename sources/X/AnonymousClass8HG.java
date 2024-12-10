package X;

import java.util.List;

/* renamed from: X.8HG  reason: invalid class name */
public class AnonymousClass8HG extends C24490C6i {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A01.size();
    }

    public int A01() {
        return this.A00.size();
    }

    public boolean A03(int i, int i2) {
        List list = this.A00;
        if (i >= list.size()) {
            return false;
        }
        List list2 = this.A01;
        if (i2 < list2.size()) {
            return list.get(i).equals(list2.get(i2));
        }
        return false;
    }

    public boolean A04(int i, int i2) {
        C1418477e r1;
        List list = this.A00;
        if (i >= list.size()) {
            return false;
        }
        List list2 = this.A01;
        if (i2 >= list2.size()) {
            return false;
        }
        C192459oQ r2 = (C192459oQ) list.get(i);
        C192459oQ r3 = (C192459oQ) list2.get(i2);
        if (r2.A00 != r3.A00) {
            return false;
        }
        AnonymousClass8pS r0 = r2.A01;
        C1418477e r22 = null;
        if (r0 != null) {
            r1 = r0.A01;
        } else {
            r1 = null;
        }
        AnonymousClass8pS r02 = r3.A01;
        if (r02 != null) {
            r22 = r02.A01;
        }
        if (r1 != null) {
            return r1.equals(r22);
        }
        if (r22 == null) {
            return true;
        }
        return false;
    }

    public AnonymousClass8HG(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
