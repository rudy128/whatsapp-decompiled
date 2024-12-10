package X;

import java.util.Map;

/* renamed from: X.Caz  reason: case insensitive filesystem */
public final class C25206Caz {
    public final long A00;
    public final C24285Byi A01;
    public final String A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25206Caz) {
                C25206Caz caz = (C25206Caz) obj;
                if (!C18070vi.A18(this.A02, caz.A02) || !C18070vi.A18(this.A03, caz.A03) || this.A00 != caz.A00 || this.A01 != caz.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass000.A0N(this.A03, C17880vN.A03(this.A02))));
    }

    public C25206Caz(C24285Byi byi, String str, Map map, long j) {
        this.A02 = str;
        this.A03 = map;
        this.A00 = j;
        this.A01 = byi;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ComponentQueryStoreRequest(appId=");
        A10.append(this.A02);
        A10.append(", params=");
        A10.append(this.A03);
        A10.append(", cacheTtlSeconds=");
        A10.append(this.A00);
        A10.append(", queryPurpose=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
