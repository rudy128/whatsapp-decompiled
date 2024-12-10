package X;

import com.facebook.wearable.airshield.security.Hash;

public final class BTU extends C3J {
    public Hash A00 = null;
    public Hash A01 = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTU) {
                BTU btu = (BTU) obj;
                if (!C18070vi.A18(this.A01, btu.A01) || !C18070vi.A18(this.A00, btu.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A01) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PendingEncryptionValues(txChallenge=");
        A10.append(this.A01);
        A10.append(", rxChallenge=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
