package X;

/* renamed from: X.4St  reason: invalid class name and case insensitive filesystem */
public final class C86714St {
    public final C86704Ss A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86714St) {
                C86714St r5 = (C86714St) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, (AnonymousClass000.A0L(this.A01) + 2131898718) * 31);
    }

    public /* synthetic */ C86714St(Integer num) {
        C86704Ss r0 = new C86704Ss(2131898718, (Integer) null);
        this.A01 = num;
        this.A00 = r0;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExitButtonConfiguration(iconRes=");
        A10.append(this.A01);
        A10.append(", stringRes=");
        A10.append(2131898718);
        A10.append(", accessibility=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
