package X;

/* renamed from: X.3ov  reason: invalid class name and case insensitive filesystem */
public final class C76973ov extends AnonymousClass4FF {
    public final AnonymousClass4Y8 A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76973ov) {
                C76973ov r5 = (C76973ov) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + this.A01.hashCode();
    }

    public C76973ov(AnonymousClass4Y8 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ErrorDialogState(input=");
        A10.append(this.A00);
        A10.append(", userMessage=");
        return C17900vP.A0B(this.A01, A10);
    }
}
