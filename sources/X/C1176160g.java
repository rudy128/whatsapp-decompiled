package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.60g  reason: invalid class name and case insensitive filesystem */
public final class C1176160g extends AnonymousClass6TM {
    public final int A00;
    public final Bitmap A01;
    public final C127246e2 A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public C1176160g(Bitmap bitmap, C127246e2 r3, List list, int i, boolean z, boolean z2) {
        C18070vi.A0d(list, 3);
        this.A02 = r3;
        this.A00 = i;
        this.A03 = list;
        this.A01 = bitmap;
        this.A05 = z;
        this.A04 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1176160g) {
                C1176160g r5 = (C1176160g) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || this.A05 != r5.A05 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A03, (AnonymousClass000.A0L(this.A02) + this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31, this.A05), this.A04);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BrowserStateSearch(selectedTab=");
        A10.append(this.A02);
        A10.append(", selectedTabPosition=");
        A10.append(this.A00);
        A10.append(", tabs=");
        A10.append(this.A03);
        A10.append(", dynamicAvatarIconBitmap=");
        A10.append(this.A01);
        A10.append(", openKeyboard=");
        A10.append(this.A05);
        A10.append(", isTabSelectedByUser=");
        return C17900vP.A0F(A10, this.A04);
    }
}
