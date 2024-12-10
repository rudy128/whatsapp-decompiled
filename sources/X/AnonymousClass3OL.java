package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.3OL  reason: invalid class name */
public final class AnonymousClass3OL extends ViewOutlineProvider {
    public final int A00;
    public final boolean A01;

    public void getOutline(View view, Outline outline) {
        Integer valueOf;
        int width;
        Outline outline2 = outline;
        boolean A15 = C18070vi.A15(view, outline);
        float f = (float) this.A00;
        int i = (int) (0.6f * f);
        if (this.A01) {
            valueOf = Integer.valueOf(A15);
            width = view.getWidth() + i;
        } else {
            valueOf = Integer.valueOf(-i);
            width = view.getWidth();
        }
        AnonymousClass1D6 A002 = AnonymousClass1D6.A00(valueOf, width);
        outline2.setRoundRect(AnonymousClass3MZ.A04(A002), A15 ? 1 : 0, AnonymousClass000.A0M(A002.second), view.getHeight(), f);
    }

    public AnonymousClass3OL(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
