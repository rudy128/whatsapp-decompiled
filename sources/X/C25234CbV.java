package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: X.CbV  reason: case insensitive filesystem */
public final class C25234CbV {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Bitmap A04;
    public final Drawable A05;
    public final boolean A06;
    public final boolean A07;
    public final String A08;

    public C25234CbV(Bitmap bitmap, Drawable drawable, String str, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C18070vi.A0d(drawable, 6);
        this.A08 = str;
        this.A00 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = bitmap;
        this.A05 = drawable;
        this.A06 = z;
        this.A07 = z2;
        this.A01 = i4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25234CbV) {
                C25234CbV cbV = (C25234CbV) obj;
                if (!(C18070vi.A18(this.A08, cbV.A08) && this.A00 == cbV.A00 && this.A02 == cbV.A02 && this.A03 == cbV.A03 && C18070vi.A18(this.A04, cbV.A04) && C18070vi.A18(this.A05, cbV.A05) && this.A06 == cbV.A06 && this.A07 == cbV.A07 && this.A01 == cbV.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A05, (((((((C17880vN.A03(this.A08) + this.A00) * 31) + this.A02) * 31) + this.A03) * 31) + AnonymousClass001.A0k(this.A04)) * 31), this.A06), this.A07) + this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChatThemeSelectionItem(themeId=");
        A10.append(this.A08);
        A10.append(", backgroundColor=");
        A10.append(this.A00);
        A10.append(", foregroundColor=");
        A10.append(this.A02);
        A10.append(", outgoingColor=");
        A10.append(this.A03);
        A10.append(", background=");
        A10.append(this.A04);
        A10.append(", checkMark=");
        A10.append(this.A05);
        A10.append(", checked=");
        A10.append(this.A06);
        A10.append(", isDoodle=");
        A10.append(this.A07);
        A10.append(", dimLevel=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
