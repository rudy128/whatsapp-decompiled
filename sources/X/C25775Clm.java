package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.Clm  reason: case insensitive filesystem */
public final class C25775Clm {
    public final String A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25775Clm)) {
            return false;
        }
        C25775Clm clm = (C25775Clm) obj;
        return this.A00.equals(clm.A00) && this.A01.equals(clm.A01);
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + this.A01.hashCode();
    }

    public C25775Clm(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }

    public static C25775Clm A00(String str) {
        return new C25775Clm(str, Collections.emptyMap());
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FieldDescriptor{name=");
        A10.append(this.A00);
        A10.append(", properties=");
        return AnonymousClass8BX.A0d(this.A01.values(), A10);
    }
}
