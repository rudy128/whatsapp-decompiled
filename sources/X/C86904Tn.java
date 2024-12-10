package X;

/* renamed from: X.4Tn  reason: invalid class name and case insensitive filesystem */
public final class C86904Tn {
    public final AnonymousClass1E7 A00;
    public final AnonymousClass23S A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86904Tn) {
                C86904Tn r5 = (C86904Tn) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C86904Tn(AnonymousClass1E7 r1, AnonymousClass23S r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InvitedContact(contact=");
        A10.append(this.A00);
        A10.append(", inviteMessage=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
