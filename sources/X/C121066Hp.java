package X;

/* renamed from: X.6Hp  reason: invalid class name and case insensitive filesystem */
public final class C121066Hp extends C123266Tt {
    public final int A00;
    public final String A01;
    public final String A02;

    public C121066Hp(int i, String str, String str2) {
        C18070vi.A0d(str2, 3);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121066Hp) {
                C121066Hp r5 = (C121066Hp) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, C17890vO.A02(this.A01, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarStickerHeaderTextItem(index=");
        A10.append(this.A00);
        A10.append(", pageId=");
        A10.append(this.A01);
        A10.append(", title=");
        return C17900vP.A0B(this.A02, A10);
    }
}
