package X;

import android.text.SpannableString;

/* renamed from: X.9r2  reason: invalid class name and case insensitive filesystem */
public final class C194019r2 {
    public final SpannableString A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194019r2) {
                C194019r2 r5 = (C194019r2) obj;
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

    public C194019r2(SpannableString spannableString, boolean z) {
        this.A01 = z;
        this.A00 = spannableString;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InstallmentData(shouldShowInstallmentData=");
        A10.append(this.A01);
        A10.append(", installmentContent=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
