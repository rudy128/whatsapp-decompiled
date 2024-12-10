package X;

import java.util.Map;

/* renamed from: X.6rc  reason: invalid class name and case insensitive filesystem */
public final class C135076rc {
    public final Map A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135076rc) {
                C135076rc r5 = (C135076rc) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass3MX.A03(this.A01));
    }

    public C135076rc(Map map, boolean z) {
        this.A01 = z;
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostRequestResult(isAccountLinkingStatusValid=");
        A10.append(this.A01);
        A10.append(", destinationResultMap=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
