package X;

import android.graphics.Bitmap;

/* renamed from: X.462  reason: invalid class name */
public final class AnonymousClass462 extends AnonymousClass4F1 {
    public final Bitmap A00;
    public final boolean A01;

    public AnonymousClass462(Bitmap bitmap, boolean z) {
        C18070vi.A0d(bitmap, 1);
        this.A00 = bitmap;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass462) {
                AnonymousClass462 r5 = (AnonymousClass462) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(avatarProfilePic=");
        A10.append(this.A00);
        A10.append(", isCreated=");
        return C17900vP.A0F(A10, this.A01);
    }
}
