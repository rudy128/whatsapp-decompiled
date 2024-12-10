package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.ViewGroup;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;

/* renamed from: X.5kc  reason: invalid class name and case insensitive filesystem */
public final class C111905kc extends C38391rD {
    public final C111225jD A00;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113075mV(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131625585), this.A00);
    }

    public int A0Q() {
        return AnonymousClass001.A0m(AnonymousClass3MW.A10(this.A00.A0T));
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r7, int i) {
        C127036dh r2;
        Bitmap bitmap;
        C130296jC r0;
        C113075mV r72 = (C113075mV) r7;
        C18070vi.A0d(r72, 0);
        List A10 = AnonymousClass3MW.A10(this.A00.A0T);
        if (A10 != null) {
            r2 = (C127036dh) A10.get(i);
        } else {
            r2 = null;
        }
        Resources A0Y = AnonymousClass000.A0Y(r72.A0H);
        if (r2 == null || (r0 = r2.A00) == null) {
            bitmap = null;
        } else {
            bitmap = r0.A00;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0Y, bitmap);
        ShapeableImageView shapeableImageView = r72.A01;
        Drawable drawable = shapeableImageView.getDrawable();
        if (drawable instanceof TransitionDrawable) {
            drawable = ((LayerDrawable) drawable).getDrawable(1);
        }
        if (drawable == null || r72.A00 != i) {
            shapeableImageView.setImageDrawable(bitmapDrawable);
        } else {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
            shapeableImageView.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(150);
        }
        r72.A00 = i;
    }

    public C111905kc(C111225jD r1) {
        this.A00 = r1;
    }
}
