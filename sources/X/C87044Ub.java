package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.4Ub  reason: invalid class name and case insensitive filesystem */
public final class C87044Ub {
    public Drawable A00;
    public String A01;
    public boolean A02 = true;
    public final int A03;

    public C87044Ub(Drawable drawable, String str, int i) {
        this.A03 = i;
        this.A01 = str;
        this.A00 = drawable;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87044Ub) {
                C87044Ub r5 = (C87044Ub) obj;
                if (this.A03 != r5.A03 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((((this.A03 * 31) + C17900vP.A00(this.A01)) * 31) + C17880vN.A02(this.A00)) * 31, this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageSelectionMenuItem(id=");
        A10.append(this.A03);
        A10.append(", title=");
        A10.append(this.A01);
        A10.append(", icon=");
        A10.append(this.A00);
        A10.append(", isVisible=");
        return C17900vP.A0F(A10, this.A02);
    }
}
