package X;

/* renamed from: X.6Hq  reason: invalid class name and case insensitive filesystem */
public final class C121076Hq extends C123266Tt {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C121076Hq(int i, int i2, String str, String str2) {
        C18070vi.A0d(str2, 4);
        this.A01 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121076Hq) {
                C121076Hq r5 = (C121076Hq) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.A01 * 31;
        return C108945cZ.A09(this.A02, (C17890vO.A02(this.A03, i) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarStickerHeaderIconItem(index=");
        A10.append(this.A01);
        A10.append(", pageId=");
        A10.append(this.A03);
        A10.append(", icon=");
        A10.append(this.A00);
        A10.append(", accessibilityLabel=");
        return C17900vP.A0B(this.A02, A10);
    }
}
