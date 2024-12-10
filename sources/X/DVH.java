package X;

import java.util.Map;

public class DVH implements Map.Entry, Comparable {
    public Object A00;
    public final Comparable A01;
    public final /* synthetic */ C27298DbT A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.A01;
        Object key = entry.getKey();
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.A00;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public DVH(C27298DbT dbT, Comparable comparable, Object obj) {
        this.A02 = dbT;
        this.A01 = comparable;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A01.compareTo(((DVH) obj).A01);
    }

    public /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public Object getValue() {
        return this.A00;
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A01) ^ C17880vN.A02(this.A00);
    }

    public Object setValue(Object obj) {
        C27298DbT.A03(this.A02);
        Object obj2 = this.A00;
        this.A00 = obj;
        return obj2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append("=");
        return C17890vO.A0V(this.A00, A10);
    }
}
