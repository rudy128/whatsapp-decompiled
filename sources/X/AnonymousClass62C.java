package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.62C  reason: invalid class name */
public final class AnonymousClass62C extends AnonymousClass184 {
    public final String A00;
    public final C128976gz[] A01;

    public void serialize(C107425Zq r6) {
        for (C128976gz r0 : this.A01) {
            r6.CHf(r0.A00, r0.A02);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(this.A00);
        sb.append(" {");
        for (C128976gz r2 : this.A01) {
            if (r2.A01 != null) {
                AnonymousClass186.A00(String.valueOf(r2.A01), r2.A03, sb);
            }
        }
        return AnonymousClass000.A0y("}", sb);
    }

    public AnonymousClass62C(C18180vt r1, String str, C128976gz[] r3, int i, int i2, int i3) {
        super(i, r1, i2, i3);
        this.A00 = str;
        this.A01 = r3;
    }

    public Map getFieldsMap() {
        HashMap A11 = C17880vN.A11();
        for (C128976gz r2 : this.A01) {
            A11.put(Integer.valueOf(r2.A00), r2.A02);
        }
        return A11;
    }
}
