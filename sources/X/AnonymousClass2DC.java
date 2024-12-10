package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2DC  reason: invalid class name */
public class AnonymousClass2DC extends C42601yR {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Paint A03;
    public final AnonymousClass11C A04;
    public final C18000vb A05;
    public final AnonymousClass1KW A06;
    public final C18010vc A07;
    public final CharSequence A08;
    public final List A09;

    public AnonymousClass2DC(Context context, Paint paint, AnonymousClass11C r3, C18000vb r4, AnonymousClass1KW r5, C18010vc r6, CharSequence charSequence, List list, int i, int i2) {
        this.A02 = context;
        this.A03 = paint;
        this.A01 = i;
        this.A00 = i2;
        this.A08 = charSequence;
        this.A09 = list;
        this.A06 = r5;
        this.A04 = r3;
        this.A05 = r4;
        this.A07 = r6;
    }

    public static List A00(BreakIterator breakIterator, List list, int i, int i2) {
        if (list.size() == 0) {
            return list;
        }
        ArrayList A13 = AnonymousClass000.A13();
        int min = Math.min(list.size(), 5);
        for (int i3 = 0; i3 < min; i3++) {
            C19760yx r1 = (C19760yx) list.get(i3);
            Number number = (Number) r1.A00;
            C17960vV.A07(number);
            Number number2 = (Number) r1.A01;
            C17960vV.A07(number2);
            int max = Math.max(0, breakIterator.preceding(Math.max(0, number.intValue() - i)));
            int following = breakIterator.following(Math.min(i2, number2.intValue() + i)) - 1;
            if (following < 0) {
                following = i2;
            }
            C19760yx r7 = new C19760yx(Integer.valueOf(max), Integer.valueOf(following));
            if (A13.size() != 0) {
                int size = A13.size() - 1;
                C19760yx r10 = (C19760yx) A13.get(size);
                Object obj = r7.A00;
                C17960vV.A07(obj);
                int A0M = AnonymousClass000.A0M(obj);
                Object obj2 = r7.A01;
                C17960vV.A07(obj2);
                int A0M2 = AnonymousClass000.A0M(obj2);
                Object obj3 = r10.A00;
                C17960vV.A07(obj3);
                int A0M3 = AnonymousClass000.A0M(obj3);
                Object obj4 = r10.A01;
                C17960vV.A07(obj4);
                int A0M4 = AnonymousClass000.A0M(obj4);
                if ((A0M <= A0M3 && A0M3 <= A0M2) || (A0M3 <= A0M && A0M <= A0M4)) {
                    int min2 = Math.min(A0M, A0M3);
                    int max2 = Math.max(A0M2, A0M4);
                    A13.remove(size);
                    r7 = new C19760yx(Integer.valueOf(min2), Integer.valueOf(max2));
                }
            }
            A13.add(r7);
        }
        return A13;
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, AnonymousClass2DC r9, CharSequence charSequence, List list) {
        long length = (long) (charSequence.length() - 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C19760yx r6 = (C19760yx) it.next();
            r9.A00.A02();
            Object obj = r6.A00;
            if (!(obj == null || AnonymousClass000.A0M(obj) == 0)) {
                if (spannableStringBuilder.length() == 0) {
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append("…");
                } else if (!"…".equals(String.valueOf(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1)))) {
                    if (!Character.isWhitespace(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1))) {
                        spannableStringBuilder.append(" ");
                    }
                    spannableStringBuilder.append("…");
                    spannableStringBuilder.append(" ");
                }
            }
            C17960vV.A07(obj);
            int A0M = AnonymousClass000.A0M(obj);
            Number number = (Number) r6.A01;
            C17960vV.A07(number);
            spannableStringBuilder.append(charSequence.subSequence(A0M, number.intValue()));
            if (((long) number.intValue()) < length) {
                spannableStringBuilder.append(" ");
                spannableStringBuilder.append("…");
            }
        }
    }
}
