package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.Cmr  reason: case insensitive filesystem */
public final class C25837Cmr {
    public final int A00;
    public final int A01;
    public final PrecomputedText.Params A02;
    public final TextDirectionHeuristic A03;
    public final TextPaint A04;

    public boolean equals(Object obj) {
        Object textLocale;
        Object textLocale2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25837Cmr) {
            C25837Cmr cmr = (C25837Cmr) obj;
            if (Build.VERSION.SDK_INT < 23 || (this.A00 == cmr.A00() && this.A01 == cmr.A01())) {
                TextPaint textPaint = this.A04;
                float textSize = textPaint.getTextSize();
                TextPaint textPaint2 = cmr.A04;
                if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags()) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        textLocale = textPaint.getTextLocales();
                        textLocale2 = textPaint2.getTextLocales();
                    } else {
                        textLocale = textPaint.getTextLocale();
                        textLocale2 = textPaint2.getTextLocale();
                    }
                    if (textLocale.equals(textLocale2)) {
                        if (textPaint.getTypeface() == null) {
                            if (textPaint2.getTypeface() != null) {
                                return false;
                            }
                        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                            return false;
                        }
                        return this.A03 == cmr.A03;
                    }
                }
            }
        }
        return false;
    }

    public int A00() {
        return this.A00;
    }

    public int A01() {
        return this.A01;
    }

    public int hashCode() {
        Object textLocale;
        int i = Build.VERSION.SDK_INT;
        Object[] objArr = new Object[11];
        TextPaint textPaint = this.A04;
        BE6.A1T(objArr, textPaint.getTextSize(), 0);
        BE6.A1T(objArr, textPaint.getTextScaleX(), 1);
        BE6.A1T(objArr, textPaint.getTextSkewX(), 2);
        BE6.A1T(objArr, textPaint.getLetterSpacing(), 3);
        int flags = textPaint.getFlags();
        if (i >= 24) {
            C17880vN.A1T(objArr, flags, 4);
            textLocale = textPaint.getTextLocales();
        } else {
            C17880vN.A1T(objArr, flags, 4);
            textLocale = textPaint.getTextLocale();
        }
        objArr[5] = textLocale;
        objArr[6] = textPaint.getTypeface();
        AnonymousClass8BR.A1L(objArr, 7, textPaint.isElegantTextHeight());
        objArr[8] = this.A03;
        C17880vN.A1T(objArr, this.A00, 9);
        C17880vN.A1T(objArr, this.A01, 10);
        return Arrays.hashCode(objArr);
    }

    public String toString() {
        Object textLocale;
        StringBuilder A0u = BE6.A0u("{");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("textSize=");
        TextPaint textPaint = this.A04;
        A10.append(textPaint.getTextSize());
        StringBuilder A0q = C108985cd.A0q(A10, A0u);
        A0q.append(", textScaleX=");
        A0q.append(textPaint.getTextScaleX());
        StringBuilder A0q2 = C108985cd.A0q(A0q, A0u);
        A0q2.append(", textSkewX=");
        A0q2.append(textPaint.getTextSkewX());
        StringBuilder A0q3 = C108985cd.A0q(A0q2, A0u);
        A0q3.append(", letterSpacing=");
        A0q3.append(textPaint.getLetterSpacing());
        StringBuilder A0q4 = C108985cd.A0q(A0q3, A0u);
        A0q4.append(", elegantTextHeight=");
        A0q4.append(textPaint.isElegantTextHeight());
        AnonymousClass8BS.A1D(A0q4, A0u);
        int i = Build.VERSION.SDK_INT;
        StringBuilder A102 = AnonymousClass000.A10();
        if (i >= 24) {
            A102.append(", textLocale=");
            textLocale = textPaint.getTextLocales();
        } else {
            A102.append(", textLocale=");
            textLocale = textPaint.getTextLocale();
        }
        A102.append(textLocale);
        StringBuilder A0q5 = C108985cd.A0q(A102, A0u);
        A0q5.append(", typeface=");
        A0q5.append(textPaint.getTypeface());
        AnonymousClass8BS.A1D(A0q5, A0u);
        if (i >= 26) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append(", variationSettings=");
            C108985cd.A1L(textPaint.getFontVariationSettings(), A103, A0u);
        }
        StringBuilder A104 = AnonymousClass000.A10();
        A104.append(", textDir=");
        A104.append(this.A03);
        StringBuilder A0q6 = C108985cd.A0q(A104, A0u);
        A0q6.append(", breakStrategy=");
        A0q6.append(this.A00);
        StringBuilder A0q7 = C108985cd.A0q(A0q6, A0u);
        A0q7.append(", hyphenationFrequency=");
        return BEA.A0n(C17880vN.A0t(A0q7, this.A01), A0u);
    }

    public C25837Cmr(TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, int i, int i2) {
        PrecomputedText.Params params;
        if (Build.VERSION.SDK_INT >= 29) {
            params = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        } else {
            params = null;
        }
        this.A02 = params;
        this.A04 = textPaint;
        this.A03 = textDirectionHeuristic;
        this.A00 = i;
        this.A01 = i2;
    }

    public C25837Cmr(PrecomputedText.Params params) {
        this.A04 = params.getTextPaint();
        this.A03 = params.getTextDirection();
        this.A00 = params.getBreakStrategy();
        this.A01 = params.getHyphenationFrequency();
        this.A02 = Build.VERSION.SDK_INT < 29 ? null : params;
    }
}
