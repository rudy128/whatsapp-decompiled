package X;

/* renamed from: X.9se  reason: invalid class name and case insensitive filesystem */
public final class C195009se {
    public AnonymousClass1E7 A00;
    public CharSequence A01;
    public final long A02;
    public final AnonymousClass1E2 A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195009se) {
                C195009se r8 = (C195009se) obj;
                if (!C18070vi.A18(this.A03, r8.A03) || this.A02 != r8.A02 || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A00, r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0K(this.A02, AnonymousClass000.A0L(this.A03)) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A00);
    }

    public C195009se(AnonymousClass1E7 r1, AnonymousClass1E2 r2, CharSequence charSequence, long j) {
        this.A03 = r2;
        this.A02 = j;
        this.A01 = charSequence;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterPollVoter(lid=");
        A10.append(this.A03);
        A10.append(", actionTimestamp=");
        A10.append(this.A02);
        A10.append(", displayName=");
        A10.append(this.A01);
        A10.append(", contact=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
