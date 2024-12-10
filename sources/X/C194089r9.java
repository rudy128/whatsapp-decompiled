package X;

import java.util.Map;

/* renamed from: X.9r9  reason: invalid class name and case insensitive filesystem */
public final class C194089r9 {
    public final String A00;
    public final Map A01;

    public C194089r9(String str, Map map) {
        C18070vi.A0d(map, 2);
        this.A00 = str;
        this.A01 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194089r9) {
                C194089r9 r5 = (C194089r9) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, C17880vN.A03(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MainTextConfig(text=");
        A10.append(this.A00);
        A10.append(", links=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
