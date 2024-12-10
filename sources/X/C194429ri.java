package X;

import java.util.List;

/* renamed from: X.9ri  reason: invalid class name and case insensitive filesystem */
public final class C194429ri {
    public final C19979A1p A00;
    public final C193799qg A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194429ri) {
                C194429ri r5 = (C194429ri) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A02) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01);
    }

    public C194429ri(C19979A1p a1p, C193799qg r2, List list) {
        this.A02 = list;
        this.A00 = a1p;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsMetadataResponse(flowIdLinks=");
        A10.append(this.A02);
        A10.append(", compatibility=");
        A10.append(this.A00);
        A10.append(", endpointPublicKey=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
