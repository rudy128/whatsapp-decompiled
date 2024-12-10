package androidx.appcompat.widget;

import X.AnonymousClass03T;
import X.AnonymousClass03U;
import X.AnonymousClass03V;
import X.C007903o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView {
    public boolean A00;
    public final AnonymousClass03U A01;
    public final AnonymousClass03V A02;

    public ColorStateList getSupportBackgroundTintList() {
        C007903o r0;
        AnonymousClass03U r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C007903o r0;
        AnonymousClass03U r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public ColorStateList getSupportImageTintList() {
        C007903o r0;
        AnonymousClass03V r02 = this.A02;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C007903o r0;
        AnonymousClass03V r02 = this.A02;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A01;
    }

    public boolean hasOverlappingRendering() {
        if ((this.A02.A03.getBackground() instanceof RippleDrawable) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setImageDrawable(Drawable drawable) {
        AnonymousClass03V r2 = this.A02;
        if (!(r2 == null || drawable == null || this.A00)) {
            r2.A00 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (r2 != null) {
            r2.A02();
            if (!this.A00) {
                ImageView imageView = r2.A03;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(r2.A00);
                }
            }
        }
    }

    public void setImageResource(int i) {
        AnonymousClass03V r0 = this.A02;
        if (r0 != null) {
            r0.A03(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A04(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A05(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.03o] */
    public void setSupportImageTintList(ColorStateList colorStateList) {
        AnonymousClass03V r2 = this.A02;
        if (r2 != null) {
            C007903o r1 = r2.A01;
            C007903o r12 = r1;
            if (r1 == null) {
                ? obj = new Object();
                r2.A01 = obj;
                r12 = obj;
            }
            r12.A00 = colorStateList;
            r12.A02 = true;
            r2.A02();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.03o] */
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        AnonymousClass03V r2 = this.A02;
        if (r2 != null) {
            C007903o r1 = r2.A01;
            C007903o r12 = r1;
            if (r1 == null) {
                ? obj = new Object();
                r2.A01 = obj;
                r12 = obj;
            }
            r12.A01 = mode;
            r12.A03 = true;
            r2.A02();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        this.A00 = false;
        AnonymousClass03T.A04(getContext(), this);
        AnonymousClass03U r0 = new AnonymousClass03U(this);
        this.A01 = r0;
        r0.A06(attributeSet, i);
        AnonymousClass03V r02 = new AnonymousClass03V(this);
        this.A02 = r02;
        r02.A04(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
        AnonymousClass03V r02 = this.A02;
        if (r02 != null) {
            r02.A02();
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A03(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AnonymousClass03V r0 = this.A02;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.A00 = true;
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        AnonymousClass03V r0 = this.A02;
        if (r0 != null) {
            r0.A02();
        }
    }

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
