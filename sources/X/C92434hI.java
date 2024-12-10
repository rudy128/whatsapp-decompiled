package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.4hI  reason: invalid class name and case insensitive filesystem */
public final class C92434hI implements C108805cK {
    public final Drawable A00;

    public C92434hI() {
        this((Drawable) null);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C92434hI) && C18070vi.A18(this.A00, ((C92434hI) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("None(selectedDrawable=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C92434hI(Drawable drawable) {
        this.A00 = drawable;
    }
}
