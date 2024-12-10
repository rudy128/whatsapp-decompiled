package X;

import java.util.Map;

/* renamed from: X.6oh  reason: invalid class name and case insensitive filesystem */
public final class C133406oh {
    public final Map A00 = C17880vN.A13();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((C133406oh) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
