package X;

import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.airshield.security.PublicKey;
import java.util.UUID;

public final class BTW extends C3J {
    public final PrivateKey A00;
    public final PublicKey A01;
    public final UUID A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTW) {
                BTW btw = (BTW) obj;
                if (!C18070vi.A18(this.A00, btw.A00) || !C18070vi.A18(this.A01, btw.A01) || !C18070vi.A18(this.A02, btw.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)));
    }

    public BTW(PrivateKey privateKey, PublicKey publicKey, UUID uuid) {
        this.A00 = privateKey;
        this.A01 = publicKey;
        this.A02 = uuid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkSecurity(appKey=");
        byte[] serialize = this.A00.serialize();
        C28144Ds3 ds3 = C28144Ds3.A00;
        A10.append(C200410p.A0J(ds3, serialize));
        A10.append(", devicePublicKey=");
        A10.append(C200410p.A0J(ds3, this.A01.serialize()));
        A10.append(", serviceUUID=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
