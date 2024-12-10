package X;

import java.util.Map;

/* renamed from: X.9qy  reason: invalid class name and case insensitive filesystem */
public final class C193979qy {
    public final String A00;
    public final Map A01;

    public C193979qy(String str, Map map) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A01 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193979qy) {
                C193979qy r5 = (C193979qy) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FcsJitPrefetchNextScreenData(appId=");
        A10.append(this.A00);
        A10.append(", bloksServerParams=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
