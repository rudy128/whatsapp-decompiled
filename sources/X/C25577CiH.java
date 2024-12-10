package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* renamed from: X.CiH  reason: case insensitive filesystem */
public class C25577CiH {
    public static final Object A04 = C17880vN.A0p();
    public AnonymousClass3KF A00;
    public final Context A01;
    public final String A02;
    public final Map A03;

    public C25577CiH(Drawable.Callback callback, String str, Map map) {
        Context applicationContext;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = AnonymousClass8BW.A0l(str, AnonymousClass000.A10(), '/');
        }
        this.A02 = str;
        this.A03 = map;
        this.A00 = null;
        if (!(callback instanceof View)) {
            applicationContext = null;
        } else {
            applicationContext = ((View) callback).getContext().getApplicationContext();
        }
        this.A01 = applicationContext;
    }
}
