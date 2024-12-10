package X;

/* renamed from: X.607  reason: invalid class name */
public final class AnonymousClass607 extends AnonymousClass6TD {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass607) {
                AnonymousClass607 r5 = (AnonymousClass607) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17900vP.A00(this.A00) * 31, this.A01);
    }

    public AnonymousClass607(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MoveToStickerPage(page=");
        A10.append(this.A00);
        A10.append(", isSelectedByUser=");
        return C17900vP.A0F(A10, this.A01);
    }
}
