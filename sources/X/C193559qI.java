package X;

/* renamed from: X.9qI  reason: invalid class name and case insensitive filesystem */
public final class C193559qI {
    public final A2Y A00;
    public final AnonymousClass1BI A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193559qI) {
                C193559qI r5 = (C193559qI) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
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

    public C193559qI(A2Y a2y, AnonymousClass1BI r2) {
        this.A01 = r2;
        this.A00 = a2y;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BizCallPermissionSetting(chatJid=");
        A10.append(this.A01);
        A10.append(", replyOption=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
