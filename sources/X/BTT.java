package X;

import com.facebook.wearable.airshield.security.Hash;

public final class BTT extends C3J {
    public final Hash A00;
    public final Hash A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTT) {
                BTT btt = (BTT) obj;
                if (!C18070vi.A18(this.A01, btt.A01) || !C18070vi.A18(this.A00, btt.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public BTT(Hash hash, Hash hash2) {
        this.A01 = hash;
        this.A00 = hash2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Challenges(tx=");
        A10.append(this.A01);
        A10.append(", rx=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
