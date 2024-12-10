package X;

/* renamed from: X.4UN  reason: invalid class name */
public final class AnonymousClass4UN {
    public final C29681ch A00;
    public final C89494cY A01;
    public final Boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UN) {
                AnonymousClass4UN r5 = (AnonymousClass4UN) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)) + AnonymousClass001.A0k(this.A02);
    }

    public AnonymousClass4UN(C29681ch r1, C89494cY r2, Boolean bool) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = bool;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SharedEnforcementData(newsletterJid=");
        A10.append(this.A00);
        A10.append(", enforcement=");
        A10.append(this.A01);
        A10.append(", isOwner=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
