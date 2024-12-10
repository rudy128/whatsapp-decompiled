package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.1Xa  reason: invalid class name and case insensitive filesystem */
public class C27671Xa implements View.OnApplyWindowInsetsListener {
    public AnonymousClass1HO A00 = null;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass1HE A02;

    public C27671Xa(View view, AnonymousClass1HE r3) {
        this.A01 = view;
        this.A02 = r3;
    }

    public static void A00(View view, WindowInsets windowInsets) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131436019);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        AnonymousClass1HO A012 = AnonymousClass1HO.A01(view, windowInsets);
        if (Build.VERSION.SDK_INT < 30) {
            A00(this.A01, windowInsets);
            if (A012.equals(this.A00)) {
                return this.A02.BlX(view, A012).A06();
            }
        }
        this.A00 = A012;
        AnonymousClass1HO BlX = this.A02.BlX(view, A012);
        if (Build.VERSION.SDK_INT < 30) {
            AnonymousClass1HF.A0U(view);
        }
        return BlX.A06();
    }
}
