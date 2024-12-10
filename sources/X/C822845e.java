package X;

import android.graphics.Bitmap;

/* renamed from: X.45e  reason: invalid class name and case insensitive filesystem */
public final class C822845e extends C83384Ex {
    public final Bitmap A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C822845e) && C18070vi.A18(this.A00, ((C822845e) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C822845e(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HasAvatarPicOnly(avatarBitmap=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
