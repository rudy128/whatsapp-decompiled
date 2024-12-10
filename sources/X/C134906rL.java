package X;

/* renamed from: X.6rL  reason: invalid class name and case insensitive filesystem */
public final class C134906rL {
    public final C1418477e A00;
    public final C1418477e A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134906rL) {
                C134906rL r5 = (C134906rL) obj;
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

    public C134906rL(C1418477e r1, C1418477e r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarUserBackup(fbId=");
        A10.append(this.A00);
        A10.append(", password=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
