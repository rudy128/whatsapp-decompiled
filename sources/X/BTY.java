package X;

import java.util.UUID;

public final class BTY extends C3J {
    public C25057CVn A00 = null;
    public E57 A01 = null;
    public E57 A02 = null;
    public C24374C0r A03 = null;
    public C24374C0r A04 = null;
    public UUID A05 = null;
    public UUID A06 = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTY) {
                BTY bty = (BTY) obj;
                if (!C18070vi.A18(this.A06, bty.A06) || !C18070vi.A18(this.A02, bty.A02) || this.A04 != bty.A04 || !C18070vi.A18(this.A05, bty.A05) || !C18070vi.A18(this.A01, bty.A01) || this.A03 != bty.A03 || !C18070vi.A18(this.A00, bty.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass001.A0k(this.A06) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PendingLinkSetupValues(txId=");
        A10.append(this.A06);
        A10.append(", txTransformer=");
        A10.append(this.A02);
        A10.append(", txTargetState=");
        A10.append(this.A04);
        A10.append(", rxId=");
        A10.append(this.A05);
        A10.append(", rxTransformer=");
        A10.append(this.A01);
        A10.append(", rxTargetState=");
        A10.append(this.A03);
        A10.append(", rollover=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
