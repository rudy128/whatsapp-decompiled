package X;

import android.graphics.Bitmap;

/* renamed from: X.5oN  reason: invalid class name and case insensitive filesystem */
public final class C113985oN extends C122966Sp {
    public final Bitmap A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C113985oN) && C18070vi.A18(this.A00, ((C113985oN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C113985oN(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AiInputBitmap(bitmap=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
