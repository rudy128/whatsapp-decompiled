package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.4mn  reason: invalid class name and case insensitive filesystem */
public final class C95784mn implements C107345Zi {
    public final int A00;

    public Drawable BQt(Context context) {
        C18070vi.A0d(context, 0);
        return AnonymousClass03S.A01(context, this.A00);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C95784mn) && this.A00 == ((C95784mn) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C95784mn(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DrawableProviderImpl(resId=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
