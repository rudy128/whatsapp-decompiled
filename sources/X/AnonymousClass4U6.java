package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.4U6  reason: invalid class name */
public final class AnonymousClass4U6 {
    public final int A00;
    public final SpannableStringBuilder A01;
    public final boolean A02;

    public AnonymousClass4U6(SpannableStringBuilder spannableStringBuilder, int i, boolean z) {
        C18070vi.A0d(spannableStringBuilder, 1);
        this.A01 = spannableStringBuilder;
        this.A02 = z;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4U6) {
                AnonymousClass4U6 r5 = (AnonymousClass4U6) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A01), this.A02) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageFormatAndTruncationResult(formattedTextBuilder=");
        A10.append(this.A01);
        A10.append(", wasTruncated=");
        A10.append(this.A02);
        A10.append(", charLimit=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
