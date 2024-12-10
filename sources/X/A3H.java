package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import java.util.HashMap;
import java.util.Map;

public abstract class A3H {
    public static final SpannableStringBuilder A00(Context context, TextAppearanceSpan textAppearanceSpan, Runnable runnable, String str, String str2, int i, boolean z) {
        C18070vi.A0d(str, 1);
        HashMap A11 = C17880vN.A11();
        A11.put(str2, runnable);
        return A01(context, textAppearanceSpan, str, A11, i, z);
    }

    public static final SpannableStringBuilder A01(Context context, TextAppearanceSpan textAppearanceSpan, String str, Map map, int i, boolean z) {
        Object r0;
        C18070vi.A0j(str, map);
        Spanned fromHtml = Html.fromHtml(str);
        C18070vi.A0X(fromHtml);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (map.containsKey(uRLSpan.getURL())) {
                    int spanStart = A09.getSpanStart(uRLSpan);
                    int spanEnd = A09.getSpanEnd(uRLSpan);
                    int spanFlags = A09.getSpanFlags(uRLSpan);
                    A09.removeSpan(uRLSpan);
                    if (z) {
                        r0 = new C161378Cy(uRLSpan, map, i);
                    } else {
                        r0 = new C166608dB(context, uRLSpan, map, i);
                    }
                    A09.setSpan(r0, spanStart, spanEnd, spanFlags);
                    if (textAppearanceSpan != null) {
                        A09.setSpan(textAppearanceSpan, spanStart, spanEnd, spanFlags);
                    }
                }
            }
        }
        return A09;
    }

    public static final SpannableStringBuilder A02(Context context, Runnable runnable, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        boolean A15 = C18070vi.A15(context2, str);
        return A00(context2, (TextAppearanceSpan) null, runnable, str3, str2, A15 ? 1 : 0, A15);
    }
}
