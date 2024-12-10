package X;

import android.graphics.Bitmap;

/* renamed from: X.60f  reason: invalid class name */
public final class AnonymousClass60f extends AnonymousClass6TM {
    public final Bitmap A00;
    public final C127246e2 A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass60f(Bitmap bitmap, C127246e2 r3, String str, boolean z) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A00 = bitmap;
        this.A01 = r3;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60f) {
                AnonymousClass60f r5 = (AnonymousClass60f) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A01, (C17880vN.A03(this.A02) + AnonymousClass001.A0k(this.A00)) * 31), this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SearchExpressionsStateSearch(expressionsSearchVal=");
        A10.append(this.A02);
        A10.append(", dynamicAvatarIconBitmap=");
        A10.append(this.A00);
        A10.append(", selectedTab=");
        A10.append(this.A01);
        A10.append(", focusChanged=");
        return C17900vP.A0F(A10, this.A03);
    }
}
