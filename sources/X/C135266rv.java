package X;

/* renamed from: X.6rv  reason: invalid class name and case insensitive filesystem */
public final class C135266rv {
    public final C193079pV A00;
    public final C193079pV A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135266rv) {
                C135266rv r5 = (C135266rv) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C108955ca.A06(this.A02);
    }

    public C135266rv(C193079pV r1, C193079pV r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkedAccountMediaResponse(fbLinkedAccountMedia=");
        A10.append(this.A00);
        A10.append(", igLinkedAccountMedia=");
        A10.append(this.A01);
        A10.append(", igAccountName=");
        return C17900vP.A0B(this.A02, A10);
    }
}
