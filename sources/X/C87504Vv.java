package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.4Vv  reason: invalid class name and case insensitive filesystem */
public abstract class C87504Vv {
    public static C23520Bik A00(Activity activity, Intent intent, View view, int i) {
        C23520Bik A01 = C23520Bik.A01(view, 2131891467, 0);
        A01.A0F(new C177679Ad(activity, i, 4, intent), 2131897301);
        A01.A0E(AnonymousClass3MZ.A02(view.getContext(), view.getContext(), 2130970021, 2131101153));
        return A01;
    }

    public static boolean A01(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(C60382nw.A00(Uri.parse(str)))) {
            return false;
        }
        return true;
    }
}
