package X;

import java.util.UUID;

public final class BTX extends C3J {
    public final C25057CVn A00;
    public final E57 A01;
    public final E57 A02;
    public final C24374C0r A03;
    public final UUID A04;
    public final UUID A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTX) {
                BTX btx = (BTX) obj;
                if (!C18070vi.A18(this.A05, btx.A05) || !C18070vi.A18(this.A04, btx.A04) || !C18070vi.A18(this.A02, btx.A02) || !C18070vi.A18(this.A01, btx.A01) || this.A03 != btx.A03 || !C18070vi.A18(this.A00, btx.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0L(this.A05))))));
    }

    public BTX(C25057CVn cVn, E57 e57, E57 e572, C24374C0r c0r, UUID uuid, UUID uuid2) {
        this.A05 = uuid;
        this.A04 = uuid2;
        this.A02 = e57;
        this.A01 = e572;
        this.A03 = c0r;
        this.A00 = cVn;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SetLinkResult(txId=");
        A10.append(this.A05);
        A10.append(", rxId=");
        A10.append(this.A04);
        A10.append(", txTransformer=");
        A10.append(this.A02);
        A10.append(", rxTransformer=");
        A10.append(this.A01);
        A10.append(", targetState=");
        A10.append(this.A03);
        A10.append(", rollover=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
