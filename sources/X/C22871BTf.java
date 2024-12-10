package X;

import java.util.UUID;

/* renamed from: X.BTf  reason: case insensitive filesystem */
public final class C22871BTf extends C3J {
    public C26127Csp A00;
    public final C22868BTc A01;
    public final UUID A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22871BTf) {
                C22871BTf bTf = (C22871BTf) obj;
                if (!C18070vi.A18(this.A00, bTf.A00) || !C18070vi.A18(this.A02, bTf.A02) || !C18070vi.A18(this.A01, bTf.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.A00) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A01);
    }

    public C22871BTf(C26127Csp csp, C22868BTc bTc, UUID uuid) {
        this.A00 = csp;
        this.A02 = uuid;
        this.A01 = bTc;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkedDeviceWrapper(appLinkDevice=");
        A10.append(this.A00);
        A10.append(", appLinkUUID=");
        A10.append(this.A02);
        A10.append(", config=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public C22871BTf() {
        this((C26127Csp) null, (C22868BTc) null, (UUID) null);
    }
}
