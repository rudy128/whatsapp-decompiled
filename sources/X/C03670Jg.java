package X;

/* renamed from: X.0Jg  reason: invalid class name and case insensitive filesystem */
public final class C03670Jg {
    public final int A00;
    public final AnonymousClass0NK A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C03670Jg) {
                C03670Jg r5 = (C03670Jg) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public C03670Jg(AnonymousClass0NK r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImageVectorEntry(imageVector=");
        A10.append(this.A01);
        A10.append(", configFlags=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
