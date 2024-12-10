package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.BHn  reason: case insensitive filesystem */
public class C22649BHn extends ViewOutlineProvider {
    public final int A00;

    public C22649BHn(int i) {
        this.A00 = i;
    }

    public void getOutline(View view, Outline outline) {
        if (this.A00 != 0) {
            C18070vi.A0h(view, outline);
            int width = view.getWidth();
            int height = view.getHeight();
            int min = Math.min(width, height);
            int i = (width - min) / 2;
            int i2 = (height - min) / 2;
            outline.setOval(i, i2, i + min, min + i2);
            return;
        }
        C18070vi.A0h(view, outline);
        Drawable background = view.getBackground();
        if (background != null) {
            background.getOutline(outline);
        }
    }
}
