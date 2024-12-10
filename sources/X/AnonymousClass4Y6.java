package X;

/* renamed from: X.4Y6  reason: invalid class name */
public final class AnonymousClass4Y6 {
    public final AEW A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4Y6) {
                AnonymousClass4Y6 r5 = (AnonymousClass4Y6) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.A01) * 31) + C17880vN.A02(this.A00);
    }

    public AnonymousClass4Y6(AEW aew, String str) {
        this.A01 = str;
        this.A00 = aew;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CapiState(callPlatform=");
        A10.append(this.A01);
        A10.append(", profile=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public AnonymousClass4Y6() {
        this((AEW) null, (String) null);
    }
}
