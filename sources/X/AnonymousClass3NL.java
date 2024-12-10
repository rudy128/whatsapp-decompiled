package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.3NL  reason: invalid class name */
public abstract class AnonymousClass3NL extends InsetDrawable {
    public boolean A00;

    public void draw(Canvas canvas) {
        if (!this.A00) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        canvas.scale(-1.0f, 1.0f, getBounds().exactCenterX(), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    public static C74743cP A00(Context context, C18000vb r2, int i) {
        return new C74743cP(C24261Jm.A00(context, i), r2);
    }

    public static void A01(Context context, ImageView imageView, C18000vb r3, int i) {
        imageView.setImageDrawable(new C74743cP(C24261Jm.A00(context, i), r3));
    }

    public static void A02(Context context, Toolbar toolbar, C18000vb r3, int i) {
        toolbar.setNavigationIcon((Drawable) new C74743cP(C24261Jm.A00(context, i), r3));
    }

    public boolean getPadding(Rect rect) {
        boolean padding = super.getPadding(rect);
        if (this.A00) {
            int i = rect.right;
            rect.right = rect.left;
            rect.left = i;
        }
        return padding;
    }
}
