package X;

import android.os.Message;

/* renamed from: X.2mF  reason: invalid class name and case insensitive filesystem */
public final class C59402mF {
    public final int A00;
    public final Message A01;
    public final C26971Uf A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59402mF) {
                C59402mF r5 = (C59402mF) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A01) + this.A00) * 31) + AnonymousClass001.A0k(this.A02);
    }

    public C59402mF(Message message, C26971Uf r2, int i) {
        this.A01 = message;
        this.A00 = i;
        this.A02 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnackedMessage(message=");
        A10.append(this.A01);
        A10.append(", sendCount=");
        A10.append(this.A00);
        A10.append(", deliveryCallback=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
