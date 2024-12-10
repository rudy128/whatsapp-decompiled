package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

/* renamed from: X.4hu  reason: invalid class name and case insensitive filesystem */
public class C92784hu implements BCQ {
    public final Drawable A00;
    public final Drawable A01;

    public /* bridge */ /* synthetic */ void Blh(BCx bCx) {
        C92814hx r3 = (C92814hx) bCx;
        ImageView BSp = r3.BSp();
        if (BSp != null && A00(r3)) {
            Drawable drawable = r3.A03;
            if (drawable == null) {
                drawable = this.A01;
            }
            BSp.setImageDrawable(drawable);
        }
    }

    public /* bridge */ /* synthetic */ void Bwu(BCx bCx) {
        C92814hx r3 = (C92814hx) bCx;
        ImageView BSp = r3.BSp();
        if (BSp != null && A00(r3)) {
            Drawable drawable = r3.A02;
            if (drawable == null) {
                drawable = this.A00;
            }
            BSp.setImageDrawable(drawable);
        }
        C108315bU r0 = r3.A04;
        if (r0 != null) {
            r0.Bwt();
        }
    }

    public /* bridge */ /* synthetic */ void Bx1(BCx bCx) {
        C92814hx r4 = (C92814hx) bCx;
        ImageView BSp = r4.BSp();
        if (BSp != null) {
            BSp.setTag(2131432149, r4.A05);
        }
        C108315bU r0 = r4.A04;
        if (r0 != null) {
            r0.C8a();
        }
    }

    public /* bridge */ /* synthetic */ void Bx6(Bitmap bitmap, BCx bCx, boolean z) {
        Drawable drawable;
        C92814hx r6 = (C92814hx) bCx;
        ImageView BSp = r6.BSp();
        if (BSp != null && A00(r6)) {
            if ((BSp.getDrawable() == null || (BSp.getDrawable() instanceof ColorDrawable)) && !z) {
                Drawable[] drawableArr = new Drawable[2];
                if (BSp.getDrawable() == null) {
                    drawable = new ColorDrawable(0);
                } else {
                    drawable = BSp.getDrawable();
                }
                drawableArr[0] = drawable;
                drawableArr[1] = new BitmapDrawable(BSp.getResources(), bitmap);
                TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(200);
                BSp.setImageDrawable(transitionDrawable);
            } else {
                BSp.setImageBitmap(bitmap);
            }
        }
        C108315bU r0 = r6.A04;
        if (r0 != null) {
            r0.C8b(bitmap);
        }
    }

    public C92784hu(Drawable drawable, Drawable drawable2) {
        this.A00 = drawable2;
        this.A01 = drawable;
    }

    public static boolean A00(C92814hx r3) {
        ImageView BSp = r3.BSp();
        if (BSp == null || BSp.getTag(2131432149) == null || !BSp.getTag(2131432149).equals(r3.A05)) {
            return false;
        }
        return true;
    }
}
