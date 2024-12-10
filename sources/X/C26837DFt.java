package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: X.DFt  reason: case insensitive filesystem */
public final class C26837DFt implements C17780vD {
    public final BTQ A00;
    public final CharSequence A01;

    public /* synthetic */ boolean Beg(C17780vD r2) {
        C18070vi.A0d(r2, 1);
        return C25322CdT.A01(this, r2);
    }

    public C26837DFt(BTQ btq, CharSequence charSequence) {
        this.A00 = btq;
        this.A01 = charSequence;
    }

    public C03270Hh BhN(AnonymousClass0HJ r10, long j) {
        TextView textView;
        int measuredWidth;
        int intValue;
        int A012 = C04520Ns.A01(j);
        int A002 = C04520Ns.A00(j);
        CharSequence charSequence = this.A01;
        Context context = r10.A00.A02;
        try {
            textView = new EditText(context, (AttributeSet) null);
            textView.setBackgroundResource(17170445);
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message == null || !AnonymousClass1YF.A0V(message, "ConstantState.newDrawable")) {
                throw e;
            }
            View A09 = AnonymousClass3MX.A09(LayoutInflater.from(context), (ViewGroup) null, 2131625302);
            C18070vi.A0z(A09, "null cannot be cast to non-null type com.facebook.primitive.textinput.TextInputViewForMeasure");
            textView = (TextView) A09;
        }
        BTQ btq = this.A00;
        Integer num = btq.A0G;
        if (num != null && (intValue = num.intValue()) > -1) {
            textView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(intValue)});
        }
        if (charSequence == null) {
            charSequence = btq.A09;
        }
        textView.setText(charSequence);
        textView.setHint(btq.A08);
        Integer num2 = btq.A0D;
        if (num2 != null) {
            textView.setGravity(num2.intValue());
        }
        Rect rect = btq.A00;
        if (rect != null) {
            textView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        BTH bth = btq.A07;
        if (bth != null) {
            textView.setTextSize(2, bth.A00);
        }
        Float f = btq.A0A;
        Integer num3 = null;
        float lineSpacingExtra = textView.getLineSpacingExtra();
        float lineSpacingMultiplier = textView.getLineSpacingMultiplier();
        if (f != null) {
            float floatValue = f.floatValue();
            float fontMetrics = textView.getPaint().getFontMetrics((Paint.FontMetrics) null);
            if (floatValue == fontMetrics) {
                lineSpacingExtra = 0.0f;
            } else {
                lineSpacingExtra = floatValue - fontMetrics;
            }
        }
        textView.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        C179669Iw r0 = btq.A05;
        if (r0 != null) {
            num3 = Integer.valueOf(r0.A00());
        }
        C24274ByX byX = btq.A03;
        boolean z = btq.A0O;
        int A003 = C24562C9i.A00(byX, num3, z);
        textView.setInputType(A003);
        if (z && !C26188CuE.A02(A003)) {
            textView.setSingleLine(true);
        }
        Typeface typeface = btq.A01;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        textView.measure(A012, A002);
        if (View.MeasureSpec.getMode(A012) == Integer.MIN_VALUE) {
            measuredWidth = View.MeasureSpec.getSize(A012);
        } else {
            measuredWidth = textView.getMeasuredWidth();
        }
        return new C03270Hh((Object) null, C02760Fg.A00(measuredWidth, textView.getMeasuredHeight()));
    }
}
