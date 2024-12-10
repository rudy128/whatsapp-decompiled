package X;

/* renamed from: X.4Y4  reason: invalid class name */
public final class AnonymousClass4Y4 {
    public final AnonymousClass4T2 A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4Y4) {
                AnonymousClass4Y4 r5 = (AnonymousClass4Y4) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public AnonymousClass4Y4(AnonymousClass4T2 r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallArEffectsProductSessionInfo(productSessionId=");
        A10.append(this.A01);
        A10.append(", callInfo=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public AnonymousClass4Y4() {
        this((AnonymousClass4T2) null, "");
    }
}
