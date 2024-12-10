package X;

import java.util.Map;

/* renamed from: X.CZw  reason: case insensitive filesystem */
public final class C25145CZw {
    public int[] A00 = C24692CGe.A00;
    public Object[] A01 = C24692CGe.A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            try {
                return (obj instanceof C25145CZw) || ((obj instanceof Map) && 0 == ((Map) obj).size());
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "{}";
    }
}
