package X;

import java.util.Map;

/* renamed from: X.9rx  reason: invalid class name and case insensitive filesystem */
public final class C194579rx {
    public final String A00;
    public final String A01;
    public final Map A02;

    public C194579rx(String str, String str2, Map map) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194579rx) {
                C194579rx r5 = (C194579rx) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17880vN.A03(this.A00) + C17900vP.A00(this.A01)) * 31) + C17880vN.A02(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PhoenixRequestNode(config=");
        A10.append(this.A00);
        A10.append(", state=");
        A10.append(this.A01);
        A10.append(", params=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
