package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

public class BFI extends InsetDrawable {
    public final /* synthetic */ C26248Cvm A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BFI(Drawable drawable, C26248Cvm cvm, int i, int i2, int i3, int i4) {
        super(drawable, i, i2, i3, i4);
        this.A00 = cvm;
    }

    public int getMinimumHeight() {
        return -1;
    }

    public int getMinimumWidth() {
        return -1;
    }

    public boolean getPadding(Rect rect) {
        return false;
    }
}
