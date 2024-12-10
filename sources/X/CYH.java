package X;

import java.util.List;

public final class CYH {
    public final Object A00;
    public final List A01 = AnonymousClass000.A13();

    public String toString() {
        StringBuilder A0t = BE6.A0t(100);
        C17900vP.A0a(this.A00, A0t);
        A0t.append('{');
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0t.append(C17880vN.A0w(list, i));
            if (i < size - 1) {
                A0t.append(", ");
            }
        }
        return C17890vO.A0b(A0t);
    }

    public /* synthetic */ CYH(Object obj) {
        this.A00 = obj;
    }

    public void A00(Object obj, String str) {
        this.A01.add(AnonymousClass001.A1H("=", String.valueOf(obj), AnonymousClass000.A11(str)));
    }
}
