package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2mG  reason: invalid class name and case insensitive filesystem */
public final class C59412mG {
    public final long A00;
    public final C29621ca A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59412mG) {
                C59412mG r8 = (C59412mG) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A00, AnonymousClass000.A0L(this.A01)) + AnonymousClass001.A0k(this.A02);
    }

    public C59412mG(C29621ca r1, Long l, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OutgoingAckReceipt(tag=");
        C29621ca r1 = this.A01;
        A10.append(r1.A00);
        A10.append(", id=");
        A10.append(C29621ca.A02(r1, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        A10.append(", loggableStanzaId=");
        A10.append(this.A00);
        A10.append(" rowId=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
