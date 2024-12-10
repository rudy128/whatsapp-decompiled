package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6Jy  reason: invalid class name and case insensitive filesystem */
public final class C121516Jy extends C113585nK {
    public C121516Jy(View view, int i) {
        super(view);
        ViewGroup.LayoutParams layoutParams;
        View findViewById = view.findViewById(2131429504);
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = AnonymousClass000.A0Y(view).getDimensionPixelSize(i);
        }
    }
}
