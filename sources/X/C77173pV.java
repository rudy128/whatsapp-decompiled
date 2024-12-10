package X;

/* renamed from: X.3pV  reason: invalid class name and case insensitive filesystem */
public final class C77173pV extends AnonymousClass4FI {
    public final AnonymousClass4Y9 A00;
    public final C86604Sh A01;

    public C77173pV(AnonymousClass4Y9 r2, C86604Sh r3) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C77173pV) {
                C77173pV r5 = (C77173pV) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SuccessState(input=");
        A10.append(this.A00);
        A10.append(", userMessage=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
