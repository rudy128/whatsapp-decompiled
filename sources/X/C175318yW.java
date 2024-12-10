package X;

/* renamed from: X.8yW  reason: invalid class name and case insensitive filesystem */
public final class C175318yW extends AnonymousClass9MS {
    public final long A00;
    public final long A01;
    public final C193139pb A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C175318yW) {
                C175318yW r8 = (C175318yW) obj;
                if (!(C18070vi.A18(this.A02, r8.A02) && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass001.A0k(this.A02) * 31));
    }

    public C175318yW(C193139pb r1, long j, long j2) {
        this.A02 = r1;
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Exists(credentialId=");
        A10.append(this.A02);
        A10.append(", createTsS=");
        A10.append(this.A00);
        A10.append(", usedTsS=");
        return C17900vP.A0E(A10, this.A01);
    }
}
