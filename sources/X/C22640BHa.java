package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BHa  reason: case insensitive filesystem */
public final class C22640BHa extends View implements E58 {
    public float A00 = 0.0533f;
    public C25589CiU A01 = C25589CiU.A05;
    public List A02 = Collections.emptyList();
    public final List A03 = AnonymousClass000.A13();

    public void CQM(C25589CiU ciU, List list, float f, float f2) {
        this.A02 = list;
        this.A01 = ciU;
        this.A00 = f;
        while (true) {
            List list2 = this.A03;
            if (list2.size() < list.size()) {
                list2.add(new C24923CPw(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    public void dispatchDraw(Canvas canvas) {
        List list = this.A02;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int A09 = C72463Mc.A09(this);
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && A09 > paddingLeft) {
                int i = paddingBottom - paddingTop;
                float f = this.A00;
                if (f != -3.4028235E38f && f * ((float) i) > 0.0f && 0 < list.size()) {
                    list.get(0);
                    throw AnonymousClass000.A0s("verticalType");
                }
            }
        }
    }

    public C22640BHa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
