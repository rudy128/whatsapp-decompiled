package X;

import java.util.List;

/* renamed from: X.CZd  reason: case insensitive filesystem */
public class C25130CZd {
    public List A00 = null;

    public void A00(C63 c63) {
        if (this.A00 == null) {
            this.A00 = AnonymousClass000.A13();
        }
        int i = 0;
        while (true) {
            int size = this.A00.size();
            List list = this.A00;
            if (i >= size) {
                list.add(c63);
                return;
            } else if (((C63) list.get(i)).A00.A00 > c63.A00.A00) {
                this.A00.add(i, c63);
                return;
            } else {
                i++;
            }
        }
    }

    public void A01(C25130CZd cZd) {
        List list = cZd.A00;
        if (list != null) {
            if (this.A00 == null) {
                this.A00 = AnonymousClass000.A14(list);
            }
            for (C63 A002 : cZd.A00) {
                A00(A002);
            }
        }
    }

    public String toString() {
        List<Object> list = this.A00;
        if (list == null) {
            return "";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        for (Object A1D : list) {
            AnonymousClass8BS.A1D(A1D, A10);
            A10.append(10);
        }
        return A10.toString();
    }
}
