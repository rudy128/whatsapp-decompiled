package X;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.3ON  reason: invalid class name */
public final class AnonymousClass3ON extends ViewOutlineProvider {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Matrix.ScaleToFit A03;

    public AnonymousClass3ON(Matrix.ScaleToFit scaleToFit, int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = scaleToFit;
        this.A00 = i3;
    }

    public void getOutline(View view, Outline outline) {
        C18070vi.A0h(view, outline);
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.A02, (float) this.A01);
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, this.A03);
        matrix.mapRect(rectF);
        Rect A07 = AnonymousClass3MW.A07();
        rectF.roundOut(A07);
        outline.setRoundRect(A07, (float) this.A00);
    }
}
