package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.6sI  reason: invalid class name and case insensitive filesystem */
public final class C135496sI {
    public final int A00;
    public final SpannableStringBuilder A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135496sI) {
                C135496sI r5 = (C135496sI) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, C17890vO.A02(this.A02, this.A00 * 31));
    }

    public C135496sI(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = spannableStringBuilder;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserEducationInfo(iconId=");
        A10.append(this.A00);
        A10.append(", title=");
        A10.append(this.A02);
        A10.append(", description=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
