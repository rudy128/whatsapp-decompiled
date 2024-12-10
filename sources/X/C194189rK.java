package X;

import android.graphics.Bitmap;

/* renamed from: X.9rK  reason: invalid class name and case insensitive filesystem */
public final class C194189rK {
    public final Bitmap A00;
    public final C62562rb A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194189rK) {
                C194189rK r5 = (C194189rK) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00)) * 31, this.A02);
    }

    public C194189rK(Bitmap bitmap, C62562rb r2, boolean z) {
        this.A01 = r2;
        this.A00 = bitmap;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitcherBottomSheetRowModel(accountSwitchingModel=");
        A10.append(this.A01);
        A10.append(", profilePhoto=");
        A10.append(this.A00);
        A10.append(", isActiveAccount=");
        return C17900vP.A0F(A10, this.A02);
    }
}
