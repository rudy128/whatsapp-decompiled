package X;

/* renamed from: X.6rD  reason: invalid class name and case insensitive filesystem */
public final class C134826rD {
    public final AnonymousClass1E7 A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134826rD) {
                C134826rD r5 = (C134826rD) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A00) * 31) + C108955ca.A06(this.A01);
    }

    public C134826rD(AnonymousClass1E7 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReactionSender(contact=");
        A10.append(this.A00);
        A10.append(", profilePicUrl=");
        return C17900vP.A0B(this.A01, A10);
    }
}
