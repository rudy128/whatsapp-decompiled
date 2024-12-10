package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.77g  reason: invalid class name and case insensitive filesystem */
public final class C1418677g implements InputFilter {
    public final /* synthetic */ C138706xY A00;

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        boolean z;
        Spanned spanned2 = spanned;
        AnonymousClass3Ma.A1O(charSequence, 0, spanned2);
        boolean z2 = false;
        int i5 = i3;
        int i6 = i4;
        int A03 = AnonymousClass74F.A03(spanned2, 0, spanned2.length()) - AnonymousClass74F.A03(spanned2, i5, i6);
        int A032 = AnonymousClass74F.A03(charSequence, i, i2) + A03;
        C138706xY r7 = this.A00;
        int A002 = (C138706xY.A00(spanned2, 0, spanned2.length()) - C138706xY.A00(spanned2, i5, i6)) + 1;
        int A003 = C138706xY.A00(charSequence, i, i2) + A002;
        StringBuilder sb = new StringBuilder(spanned2.toString());
        sb.replace(i5, i6, charSequence.subSequence(i, i2).toString());
        String A02 = r7.A0F.A02(sb.toString());
        int A033 = AnonymousClass74F.A03(sb, 0, sb.length());
        int A004 = C138706xY.A00(sb.toString(), 0, sb.length()) + 1;
        int i7 = 5;
        int i8 = 350;
        if (A02 == null || r7.A05.getVisibility() == 0 || (A033 <= 350 && A004 <= 5)) {
            z = false;
        } else {
            z = true;
        }
        r7.A04 = z;
        if (A02 != null && !A02.equals(r7.A02) && !z) {
            z2 = true;
        }
        r7.A0K.A01 = z2;
        if (!z2) {
            i8 = 700;
            i7 = 10;
        }
        int i9 = i8 - A03;
        int i10 = i7 - A002;
        if (A032 <= i8 && A003 <= i7) {
            return null;
        }
        if (A03 < i8 && A002 < i7) {
            r7.A0L.A00(i8, i7);
            return AnonymousClass74F.A06(charSequence, i, i2, i10, i9);
        } else if (i2 - i <= 0) {
            return "";
        } else {
            r7.A0L.A00(i8, i7);
            return "";
        }
    }

    public C1418677g(C138706xY r1) {
        this.A00 = r1;
    }
}
