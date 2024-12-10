package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.Cfc  reason: case insensitive filesystem */
public abstract class C25430Cfc {
    public static final long A00 = AnonymousClass001.A0r(0);
    public static final C22591BEq A01 = new Canvas();

    public static final Paint.FontMetricsInt A00(TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, C26043Cr7 cr7, D4T[] d4tArr) {
        boolean z;
        C26043Cr7 cr72 = cr7;
        int i = cr72.A04 - 1;
        Layout layout = cr72.A08;
        if (layout.getLineStart(i) != layout.getLineEnd(i) || d4tArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("​");
        D4T d4t = d4tArr[0];
        int length = spannableString.length();
        if (i == 0 || !d4t.A09) {
            z = d4t.A09;
        } else {
            z = false;
        }
        spannableString.setSpan(new D4T(d4t.A06, d4t.A07, length, z, d4t.A09), 0, spannableString.length(), 33);
        int length2 = spannableString.length();
        boolean z2 = cr72.A0B;
        StaticLayout BG8 = CE4.A00.BG8(new CUH(C24690CGc.A00, textDirectionHeuristic, textPaint, (TextUtils.TruncateAt) null, spannableString, length2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0, 0, 0, 0, z2));
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = BG8.getLineAscent(0);
        fontMetricsInt.descent = BG8.getLineDescent(0);
        fontMetricsInt.top = BG8.getLineTop(0);
        fontMetricsInt.bottom = BG8.getLineBottom(0);
        return fontMetricsInt;
    }
}
