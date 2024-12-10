package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.9sL  reason: invalid class name and case insensitive filesystem */
public final class C194819sL {
    public final Drawable A00;
    public final B7K A01;
    public final AnonymousClass9a3 A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194819sL) {
                C194819sL r5 = (C194819sL) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, C17890vO.A02(this.A03, AnonymousClass001.A0k(this.A00) * 31) * 31 * 31) + C17880vN.A02(this.A02);
    }

    public C194819sL(Drawable drawable, B7K b7k, AnonymousClass9a3 r3, String str) {
        this.A00 = drawable;
        this.A03 = str;
        this.A01 = b7k;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CategoryThumbnail(iconDrawable=");
        A10.append(this.A00);
        A10.append(", text=");
        A10.append(this.A03);
        C108975cc.A17(A10, ", contentDescription=");
        C108975cc.A17(A10, ", transitionName=");
        A10.append(", clickListener=");
        A10.append(this.A01);
        A10.append(", fetchListener=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
