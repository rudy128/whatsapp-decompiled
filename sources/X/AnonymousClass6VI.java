package X;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* renamed from: X.6VI  reason: invalid class name */
public abstract class AnonymousClass6VI {
    public static Spanned A00(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnonymousClass6VH.A00(str);
        }
        return Html.fromHtml(str);
    }
}
