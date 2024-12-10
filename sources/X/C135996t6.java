package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.6t6  reason: invalid class name and case insensitive filesystem */
public final class C135996t6 {
    public final int A00;
    public final Drawable A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C135996t6(Drawable drawable, String str, String str2, String str3, int i) {
        C18070vi.A0d(str, 1);
        this.A04 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = drawable;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135996t6) {
                C135996t6 r5 = (C135996t6) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C17880vN.A03(this.A04) + C17900vP.A00(this.A02)) * 31) + this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C108955ca.A06(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SearchResultItem(text=");
        A10.append(this.A04);
        A10.append(", settingType=");
        A10.append(this.A02);
        A10.append(", viewType=");
        A10.append(this.A00);
        A10.append(", icon=");
        A10.append(this.A01);
        A10.append(", subtitle=");
        return C17900vP.A0B(this.A03, A10);
    }
}
