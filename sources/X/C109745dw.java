package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5dw  reason: invalid class name and case insensitive filesystem */
public final class C109745dw extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C1422878w A00;

    public boolean onDown(MotionEvent motionEvent) {
        float f;
        float f2;
        C18070vi.A0d(motionEvent, 0);
        C1422878w r7 = this.A00;
        r7.A05 = true;
        float x = motionEvent.getX();
        ImageView imageView = r7.A04;
        if (imageView != null) {
            float x2 = imageView.getX();
            C109465dU r2 = r7.A07;
            f = x2 + ((float) ((r2.A05 / 2) + r2.A04 + r2.A02));
        } else {
            f = 0.0f;
        }
        float f3 = x - f;
        float y = motionEvent.getY();
        ImageView imageView2 = r7.A04;
        if (imageView2 != null) {
            float y2 = imageView2.getY();
            C109465dU r22 = r7.A07;
            f2 = y2 + (((float) r22.A03) - r22.A01);
        } else {
            f2 = 0.0f;
        }
        r7.A00 = 0.0f;
        r7.A01 = 0.0f;
        C1422878w.A02(r7, f3);
        C1422878w.A03(r7, y - f2);
        C1422878w.A01(r7);
        List list = r7.A08;
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
            A0D.add(C27621Wu.A00);
        }
        return true;
    }

    public C109745dw(C1422878w r1) {
        this.A00 = r1;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C1422878w r2 = this.A00;
        if (r2.A05) {
            r2.A05 = false;
            return true;
        }
        C1422878w.A02(r2, r2.A00 - f);
        C1422878w.A03(r2, r2.A01 - f2);
        C1422878w.A01(r2);
        return true;
    }
}
