package X;

import java.util.Map;

/* renamed from: X.Cad  reason: case insensitive filesystem */
public final class C25187Cad {
    public final String A00;
    public final Map A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25187Cad) {
                C25187Cad cad = (C25187Cad) obj;
                if (!C18070vi.A18(this.A01, cad.A01) || !C18070vi.A18(this.A02, cad.A02) || !C18070vi.A18(this.A00, cad.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A01) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A00);
    }

    public C25187Cad(String str, String str2, Map map) {
        this.A01 = map;
        this.A02 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BloksComponentQueryParseResult(components=");
        A10.append(this.A01);
        A10.append(", generatedBundleId=");
        A10.append(this.A02);
        A10.append(", clientBundleId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
