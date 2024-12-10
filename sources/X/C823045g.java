package X;

import android.graphics.Bitmap;

/* renamed from: X.45g  reason: invalid class name and case insensitive filesystem */
public final class C823045g extends C83384Ex {
    public final Bitmap A00;
    public final Bitmap A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C823045g) {
                C823045g r5 = (C823045g) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C823045g(Bitmap bitmap, Bitmap bitmap2) {
        this.A01 = bitmap;
        this.A00 = bitmap2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HasProfilePicAndAvatarPic(profilePicBitmap=");
        A10.append(this.A01);
        A10.append(", avatarBitmap=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
