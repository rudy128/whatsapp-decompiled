package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.6sj  reason: invalid class name and case insensitive filesystem */
public final class C135766sj {
    public final Drawable A00;
    public final CharSequence A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135766sj) {
                C135766sj r5 = (C135766sj) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, C17890vO.A02(this.A02, C17880vN.A03(this.A03))));
    }

    public C135766sj(Drawable drawable, CharSequence charSequence, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = drawable;
        this.A01 = charSequence;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GalleryMenuOption(activityInfoPackageName=");
        A10.append(this.A03);
        A10.append(", activityInfoName=");
        A10.append(this.A02);
        A10.append(", icon=");
        A10.append(this.A00);
        A10.append(", label=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
