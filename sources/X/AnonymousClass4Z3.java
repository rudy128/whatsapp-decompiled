package X;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.URLSpan;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.4Z3  reason: invalid class name */
public abstract class AnonymousClass4Z3 {
    public static String A01(String str) {
        if (!str.startsWith("whatsapp:user-notice")) {
            return "open-link";
        }
        String queryParameter = Uri.parse(AnonymousClass001.A1H("h://", str, AnonymousClass000.A10())).getQueryParameter("action");
        if (queryParameter == null) {
            return "";
        }
        return queryParameter;
    }

    public static SpannableString A00(Context context, C107725aU r16, Boolean bool, String str) {
        Spanned fromHtml = Html.fromHtml(str);
        String obj = fromHtml.toString();
        SpannableString spannableString = new SpannableString(obj);
        for (Object obj2 : fromHtml.getSpans(0, obj.length(), Object.class)) {
            int spanStart = fromHtml.getSpanStart(obj2);
            int spanEnd = fromHtml.getSpanEnd(obj2);
            int spanFlags = fromHtml.getSpanFlags(obj2);
            if (obj2 instanceof URLSpan) {
                URLSpan uRLSpan = (URLSpan) obj2;
                C107725aU r11 = r16;
                if (r16 != null) {
                    String url = uRLSpan.getURL();
                    boolean booleanValue = bool.booleanValue();
                    String A01 = A01(url);
                    HashMap A02 = A02(url);
                    Context context2 = context;
                    if (booleanValue) {
                        obj2 = new AnonymousClass48G(context2, r11, url, A01, A02);
                    } else {
                        obj2 = new AnonymousClass48F(context2, r11, url, A01, A02);
                    }
                }
            }
            spannableString.setSpan(obj2, spanStart, spanEnd, spanFlags);
        }
        return spannableString;
    }

    public static HashMap A02(String str) {
        HashMap A11 = C17880vN.A11();
        if (!str.startsWith("whatsapp:user-notice")) {
            A11.put("link", str);
        } else {
            Uri parse = Uri.parse(AnonymousClass001.A1H("h://", str, AnonymousClass000.A10()));
            Iterator<String> it = parse.getQueryParameterNames().iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                if (!"action".equals(A0v)) {
                    A11.put(A0v, parse.getQueryParameter(A0v));
                }
            }
        }
        return A11;
    }
}
