package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.26j  reason: invalid class name */
public class AnonymousClass26j extends Drawable.ConstantState {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public ColorStateList A03 = null;
    public Bitmap A04;
    public Paint A05;
    public PorterDuff.Mode A06;
    public PorterDuff.Mode A07 = C24291Jp.A08;
    public C63612tP A08 = new C63612tP();
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public void A00(int i, int i2) {
        this.A04.eraseColor(0);
        Canvas canvas = new Canvas(this.A04);
        C63612tP r4 = this.A08;
        C63612tP.A00(canvas, C63612tP.A0G, r4.A0F, r4, i, i2);
    }

    public Drawable newDrawable(Resources resources) {
        return new C24291Jp(this);
    }

    public int getChangingConfigurations() {
        return this.A01;
    }

    public Drawable newDrawable() {
        return new C24291Jp(this);
    }
}
