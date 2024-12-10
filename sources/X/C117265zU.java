package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.5zU  reason: invalid class name and case insensitive filesystem */
public final class C117265zU extends AnonymousClass6T4 {
    public final int A00;
    public final Bitmap A01;
    public final C127246e2 A02;
    public final List A03;
    public final boolean A04;

    public C117265zU(Bitmap bitmap, C127246e2 r3, List list, int i, boolean z) {
        C18070vi.A0d(list, 3);
        this.A02 = r3;
        this.A00 = i;
        this.A03 = list;
        this.A04 = z;
        this.A01 = bitmap;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C117265zU) {
                C117265zU r5 = (C117265zU) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A03, r5.A03) || this.A04 != r5.A04 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A03, (AnonymousClass000.A0L(this.A02) + this.A00) * 31), this.A04) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BrowserState(selectedTab=");
        A10.append(this.A02);
        A10.append(", selectedTabPosition=");
        A10.append(this.A00);
        A10.append(", tabs=");
        A10.append(this.A03);
        A10.append(", showAvatarEditIcon=");
        A10.append(this.A04);
        A10.append(", dynamicAvatarIconBitmap=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
