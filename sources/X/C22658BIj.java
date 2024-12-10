package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.widget.ImageView;

/* renamed from: X.BIj  reason: case insensitive filesystem */
public final class C22658BIj extends ImageView {
    public float[] A00;
    public final Paint A01;
    public final Path A02 = C108945cZ.A0L();

    public C22658BIj(Context context, float[] fArr) {
        super(context);
        this.A00 = fArr;
        Paint A06 = AnonymousClass3MW.A06();
        this.A01 = A06;
        A06.setAntiAlias(true);
        A06.setColor(-1);
        C108965cb.A11(A06, PorterDuff.Mode.DST_OUT);
        setLayerType(2, (Paint) null);
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        canvas.drawPath(this.A02, this.A01);
    }

    public final void setRadii(float[] fArr) {
        C18070vi.A0d(fArr, 0);
        this.A00 = fArr;
    }

    public final float[] getRadii() {
        return this.A00;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.A02;
        path.reset();
        float f = (float) i;
        float f2 = (float) i2;
        path.addRoundRect(new RectF(0.0f, 0.0f, f, f2), this.A00, Path.Direction.CW);
        path.addRect(new RectF(0.0f, 0.0f, f, f2), Path.Direction.CCW);
        path.close();
    }
}
