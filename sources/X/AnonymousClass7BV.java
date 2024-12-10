package X;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.7BV  reason: invalid class name */
public class AnonymousClass7BV implements C43011z6 {
    public final int A00;
    public final Object A01;

    public AnonymousClass7BV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object apply(Object obj) {
        int i = this.A00;
        Object obj2 = this.A01;
        if (i == 0) {
            return ((C22821Di) ((AnonymousClass1JH) obj2)).invoke(obj);
        }
        View view = (View) obj2;
        RectF rectF = (RectF) obj;
        C18070vi.A0h(view, rectF);
        float A002 = AnonymousClass3MW.A00(view.getResources(), 2131166857);
        Path A0L = C108945cZ.A0L();
        A0L.moveTo(rectF.left, rectF.bottom);
        A0L.lineTo(rectF.left, rectF.top + A002);
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = 2.0f * A002;
        A0L.arcTo(new RectF(f, f2, f + f3, f2 + f3), 180.0f, 90.0f);
        A0L.lineTo(rectF.right - A002, rectF.top);
        float f4 = rectF.right;
        float f5 = rectF.top;
        A0L.addArc(new RectF(f4 - f3, f5, f4, f5 + f3), 270.0f, 90.0f);
        A0L.lineTo(rectF.right, rectF.bottom);
        A0L.lineTo(rectF.left, rectF.bottom);
        A0L.close();
        return A0L;
    }
}
