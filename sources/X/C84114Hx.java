package X;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;

/* renamed from: X.4Hx  reason: invalid class name and case insensitive filesystem */
public abstract class C84114Hx {
    public static final Spanned A00(Context context, int i, int i2) {
        C18070vi.A0d(context, 0);
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = AnonymousClass1EG.A03(context, 2131103150);
        C17880vN.A1T(A1b, i2, 1);
        Spanned fromHtml = Html.fromHtml(context.getResources().getQuantityString(i, i2, AnonymousClass1EG.A0K(A1b)));
        C18070vi.A0X(fromHtml);
        return fromHtml;
    }
}
