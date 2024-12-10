package X;

import android.text.SpannableString;

/* renamed from: X.9r4  reason: invalid class name and case insensitive filesystem */
public final class C194039r4 {
    public final SpannableString A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194039r4) {
                C194039r4 r5 = (C194039r4) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C194039r4(SpannableString spannableString, boolean z) {
        this.A01 = z;
        this.A00 = spannableString;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SecureBadge(shouldShowSecureBadge=");
        A10.append(this.A01);
        A10.append(", secureContent=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
