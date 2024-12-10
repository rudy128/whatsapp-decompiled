package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.3OM  reason: invalid class name */
public final class AnonymousClass3OM extends ViewOutlineProvider {
    public final float A00;
    public final int A01;
    public final boolean A02;

    public void getOutline(View view, Outline outline) {
        Integer valueOf;
        int width;
        Outline outline2 = outline;
        boolean A15 = C18070vi.A15(view, outline);
        boolean z = this.A02;
        int i = this.A01;
        if (z) {
            valueOf = Integer.valueOf(-i);
            width = view.getWidth() - i;
        } else {
            valueOf = Integer.valueOf(i);
            width = view.getWidth() + i;
        }
        Integer valueOf2 = Integer.valueOf(width);
        outline2.setRoundRect(valueOf.intValue(), A15 ? 1 : 0, valueOf2.intValue(), view.getHeight(), this.A00);
    }

    public AnonymousClass3OM(int i, float f, boolean z) {
        this.A00 = f;
        this.A01 = i;
        this.A02 = z;
    }
}
