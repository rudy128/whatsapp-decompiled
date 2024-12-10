package X;

import java.util.Map;

/* renamed from: X.6sR  reason: invalid class name and case insensitive filesystem */
public final class C135586sR {
    public final AnonymousClass1IX A00;
    public final String A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135586sR) {
                C135586sR r5 = (C135586sR) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A01)));
    }

    public C135586sR(AnonymousClass1IX r1, String str, Map map) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostSessionData(sessionId=");
        A10.append(this.A01);
        A10.append(", messageToCrosspost=");
        A10.append(this.A00);
        A10.append(", cachedDBDataMap=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
