package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.4ZN  reason: invalid class name */
public abstract class AnonymousClass4ZN {
    public abstract CharSequence A03(Context context);

    public static CharSequence A00(View view, AnonymousClass4ZN r1) {
        Context context = view.getContext();
        C18070vi.A0X(context);
        return r1.A03(context);
    }

    public static void A01(Context context, TextView textView, AnonymousClass4ZN r2) {
        textView.setText(r2.A03(context));
    }

    public static void A02(View view, TextView textView, AnonymousClass4ZN r2) {
        Context context = view.getContext();
        C18070vi.A0X(context);
        textView.setText(r2.A03(context));
    }
}
