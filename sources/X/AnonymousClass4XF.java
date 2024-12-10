package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TypefaceSpan;

/* renamed from: X.4XF  reason: invalid class name */
public class AnonymousClass4XF {
    public static final TypefaceSpan A02 = new TypefaceSpan("monospace");
    public final AnonymousClass118 A00;
    public final C18000vb A01;

    public SpannableStringBuilder A00(long j, long j2) {
        String A012;
        Spannable[] spannableArr;
        SpannableString spannableString;
        char c;
        AnonymousClass118 r1;
        int i;
        SpannableString spannableString2 = new SpannableString(this.A01.A0M().format(((double) j) / 100.0d));
        if (spannableString2.length() > 0) {
            spannableString2.setSpan(A02, 0, spannableString2.length() - 1, 33);
        }
        if (j2 < 60000) {
            spannableString = new SpannableString(String.valueOf(C17880vN.A04(j2)));
            r1 = this.A00;
            i = 2131890034;
        } else if (j2 < 3600000) {
            spannableString = new SpannableString(String.valueOf(j2 / 60000));
            r1 = this.A00;
            i = 2131890033;
        } else if (j2 < 43200000) {
            SpannableString spannableString3 = new SpannableString(String.valueOf(j2 / 3600000));
            spannableString = new SpannableString(String.valueOf((j2 % 3600000) / 60000));
            A012 = this.A00.A01(2131890032);
            spannableArr = new Spannable[3];
            AnonymousClass001.A1Q(spannableString2, spannableString3, spannableArr);
            c = 2;
            spannableArr[c] = spannableString;
            return C26302CxJ.A04(A012, spannableArr);
        } else {
            A012 = this.A00.A01(2131890031);
            spannableArr = new Spannable[]{spannableString2};
            return C26302CxJ.A04(A012, spannableArr);
        }
        A012 = r1.A01(i);
        spannableArr = new Spannable[2];
        spannableArr[0] = spannableString2;
        c = 1;
        spannableArr[c] = spannableString;
        return C26302CxJ.A04(A012, spannableArr);
    }

    public AnonymousClass4XF(AnonymousClass118 r1, C18000vb r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
