package X;

/* renamed from: X.2lr  reason: invalid class name and case insensitive filesystem */
public final class C59162lr {
    public final int A00;
    public final Boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59162lr) {
                C59162lr r5 = (C59162lr) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass001.A0k(this.A01);
    }

    public C59162lr(Boolean bool, int i) {
        this.A00 = i;
        this.A01 = bool;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EphemeralAdditionalInfo(trigger=");
        A10.append(this.A00);
        A10.append(", initiatedByMe=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
