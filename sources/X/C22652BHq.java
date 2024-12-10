package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.BHq  reason: case insensitive filesystem */
public final class C22652BHq extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ DFL A01;

    public void getOutline(View view, Outline outline) {
        boolean A15 = C18070vi.A15(view, outline);
        outline.setRoundRect(A15 ? 1 : 0, A15 ? 1 : 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.A00);
        Drawable background = view.getBackground();
        if (background != null) {
            DFL dfl = this.A01;
            background.getOutline(outline);
            outline.setAlpha(dfl.A03(65, 1.0f));
        }
    }

    public C22652BHq(DFL dfl, float f) {
        this.A00 = f;
        this.A01 = dfl;
    }
}
