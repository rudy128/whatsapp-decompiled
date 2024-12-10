package X;

/* renamed from: X.6zX  reason: invalid class name and case insensitive filesystem */
public final class C139846zX {
    public final AnonymousClass725 A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139846zX) {
                C139846zX r5 = (C139846zX) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass001.A0k(this.A00) * 31, this.A01);
    }

    public C139846zX(AnonymousClass725 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CustomPackDataClass(stickerPack=");
        A10.append(this.A00);
        A10.append(", newOption=");
        return C17900vP.A0F(A10, this.A01);
    }

    public C139846zX() {
        this((AnonymousClass725) null, false);
    }
}
