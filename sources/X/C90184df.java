package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.4df  reason: invalid class name and case insensitive filesystem */
public final class C90184df implements View.OnLayoutChangeListener {
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        AnonymousClass1HF.A0p(view, C18070vi.A0M(new Rect(0, 0, view.getWidth(), view.getHeight())));
    }
}
