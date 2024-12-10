package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: X.BHl  reason: case insensitive filesystem */
public class C22647BHl extends ViewGroup implements E7C {
    public int A00;
    public Matrix A01;
    public View A02;
    public ViewGroup A03;
    public final View A04;
    public final ViewTreeObserver.OnPreDrawListener A05 = new D5F(this, 0);

    public void onDraw(Canvas canvas) {
        C24715CHc.A00(canvas, true);
        canvas.setMatrix(this.A01);
        View view = this.A04;
        C24493C6l c6l = C25446Cfx.A02;
        c6l.A05(view, 0);
        view.invalidate();
        c6l.A05(view, 4);
        drawChild(canvas, view, getDrawingTime());
        C24715CHc.A00(canvas, false);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void CFf(View view, ViewGroup viewGroup) {
        this.A03 = viewGroup;
        this.A02 = view;
    }

    public void onDetachedFromWindow() {
        View view = this.A04;
        view.getViewTreeObserver().removeOnPreDrawListener(this.A05);
        C25446Cfx.A02.A05(view, 0);
        view.setTag(2131431115, (Object) null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    public C22647BHl(View view) {
        super(view.getContext());
        this.A04 = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, (Paint) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.A04;
        view.setTag(2131431115, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.A05);
        C25446Cfx.A02.A05(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.A04;
        if (view.getTag(2131431115) == this) {
            int i2 = 0;
            if (i == 0) {
                i2 = 4;
            }
            C25446Cfx.A02.A05(view, i2);
        }
    }
}
