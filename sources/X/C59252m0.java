package X;

/* renamed from: X.2m0  reason: invalid class name and case insensitive filesystem */
public final class C59252m0 {
    public long A00 = 0;
    public long A01 = 0;
    public final AnonymousClass206 A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59252m0) {
                C59252m0 r8 = (C59252m0) obj;
                if (!(C18070vi.A18(this.A02, r8.A02) && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C59252m0(AnonymousClass206 r3) {
        this.A02 = r3;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass000.A0L(this.A02)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AlbumMetadata(message=");
        A10.append(this.A02);
        A10.append(", photoCount=");
        A10.append(this.A00);
        A10.append(", videoCount=");
        return C17900vP.A0E(A10, this.A01);
    }
}
