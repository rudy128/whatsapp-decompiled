package X;

import android.text.SpannableString;
import android.text.style.URLSpan;
import android.widget.TextView;

/* renamed from: X.4H0  reason: invalid class name */
public abstract class AnonymousClass4H0 {
    public static final void A00(TextView textView) {
        C18070vi.A0d(textView, 0);
        SpannableString spannableString = new SpannableString(textView.getText());
        Object[] spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        C18070vi.A0X(spans);
        for (URLSpan uRLSpan : (URLSpan[]) spans) {
            spannableString.setSpan(new C72833Nr(uRLSpan.getURL()), spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 0);
        }
        textView.setText(spannableString);
    }
}
