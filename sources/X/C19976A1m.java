package X;

import java.util.Map;

/* renamed from: X.A1m  reason: case insensitive filesystem */
public final class C19976A1m {
    public final long A00;
    public final String A01;
    public final Map A02;

    public static C19976A1m A00(String str) {
        return new C19976A1m(str, (Map) null, -1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19976A1m) {
                C19976A1m a1m = (C19976A1m) obj;
                if (this.A00 != a1m.A00 || !C18070vi.A18(this.A01, a1m.A01) || !C18070vi.A18(this.A02, a1m.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass8BV.A00(this.A00) + C17900vP.A00(this.A01)) * 31) + C17880vN.A02(this.A02);
    }

    public C19976A1m(String str, Map map, long j) {
        this.A00 = j;
        this.A01 = str;
        this.A02 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FdsError(errorCode=");
        A10.append(this.A00);
        A10.append(", errorMessage=");
        A10.append(this.A01);
        A10.append(", params=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
