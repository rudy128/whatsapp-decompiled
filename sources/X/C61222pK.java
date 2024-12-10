package X;

import android.text.Spannable;

/* renamed from: X.2pK  reason: invalid class name and case insensitive filesystem */
public class C61222pK {
    public final CharSequence A00;

    public C61222pK(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    public static void A00(Spannable spannable, Spannable spannable2) {
        C61222pK[] r3 = (C61222pK[]) spannable.getSpans(0, spannable.length(), C61222pK.class);
        if (r3 != null) {
            for (C61222pK removeSpan : r3) {
                spannable.removeSpan(removeSpan);
            }
        }
        spannable.setSpan(new C61222pK(spannable2), 0, spannable.length(), -16777216);
    }
}
