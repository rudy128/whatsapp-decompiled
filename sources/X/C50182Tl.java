package X;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.widget.TextView;

/* renamed from: X.2Tl  reason: invalid class name and case insensitive filesystem */
public abstract class C50182Tl {
    public static void A00(TextView textView, C18030ve r11, Object[] objArr, int i) {
        Context context = textView.getContext();
        Spannable spannable = (Spannable) Html.fromHtml(context.getString(i, objArr));
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            spannable.setSpan(new C72843Ns(context, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
            spannable.removeSpan(uRLSpan);
        }
        textView.setText(spannable);
        textView.setMovementMethod(new C39441t5(r11));
    }
}
