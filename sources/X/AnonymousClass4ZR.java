package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.4ZR  reason: invalid class name */
public final class AnonymousClass4ZR {
    public final Context A00;

    public AnonymousClass4ZR(Context context) {
        C18070vi.A0d(context, 1);
        Context applicationContext = context.getApplicationContext();
        C18070vi.A0X(applicationContext);
        this.A00 = applicationContext;
    }

    public static String A01(Context context) {
        return new AnonymousClass4ZR(context).A02(2131899529);
    }

    public final String A02(int i) {
        return AnonymousClass3MY.A0m(this.A00.getResources(), i);
    }

    public static Bundle A00(Activity activity, View view, AnonymousClass4ZR r3) {
        return AnonymousClass745.A05(activity, view, r3.A02(2131899529));
    }
}
