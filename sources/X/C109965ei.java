package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.5ei  reason: invalid class name and case insensitive filesystem */
public final class C109965ei extends ViewOutlineProvider {
    public final /* synthetic */ int A00;

    public void getOutline(View view, Outline outline) {
        C18070vi.A0d(view, 0);
        Outline outline2 = outline;
        if (outline != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            int i = this.A00;
            outline2.setRoundRect(0, 0, width, height + i, (float) i);
        }
    }

    public C109965ei(int i) {
        this.A00 = i;
    }
}
