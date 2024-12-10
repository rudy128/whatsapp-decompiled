package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.4Uk  reason: invalid class name and case insensitive filesystem */
public final class C87134Uk {
    public final Drawable A00;
    public final C82814Ce A01;
    public final CharSequence A02;
    public final CharSequence A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87134Uk) {
                C87134Uk r5 = (C87134Uk) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A02);
    }

    public C87134Uk(Drawable drawable, C82814Ce r2, CharSequence charSequence, CharSequence charSequence2) {
        this.A01 = r2;
        this.A00 = drawable;
        this.A03 = charSequence;
        this.A02 = charSequence2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HeaderViewState(headerSize=");
        A10.append(this.A01);
        A10.append(", headerImage=");
        A10.append(this.A00);
        A10.append(", headline=");
        A10.append(this.A03);
        A10.append(", description=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
