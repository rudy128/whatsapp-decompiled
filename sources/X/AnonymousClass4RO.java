package X;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4RO  reason: invalid class name */
public final class AnonymousClass4RO {
    public int A00;
    public int A01;
    public AnonymousClass0SF A02;
    public C18090vk A03;
    public C22821Di A04;
    public final Context A05;
    public final MotionEvent A06;
    public final View A07;
    public final AnonymousClass3Oj A08;

    public AnonymousClass4RO(Context context, MotionEvent motionEvent, View view, AnonymousClass3Oj r5) {
        C18070vi.A0d(context, 1);
        this.A05 = context;
        this.A07 = view;
        this.A08 = r5;
        this.A06 = motionEvent;
    }

    public final void A00() {
        int i;
        Context context = this.A05;
        int A09 = C72453Mb.A09(context);
        AnonymousClass0SF r3 = new AnonymousClass0SF(new C003101k(context, 2132083352), (AttributeSet) null, 0, 2132083352);
        View view = this.A07;
        r3.A06 = view;
        AnonymousClass3Oj r10 = this.A08;
        r3.CHm(r10);
        int count = r10.getCount();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            View view2 = r10.getView(i4, (View) null, (ViewGroup) null);
            view2.measure(0, 0);
            int measuredWidth = view2.getMeasuredWidth();
            if (i2 < measuredWidth) {
                i2 = measuredWidth;
            }
            i3 += view2.getMeasuredHeight();
        }
        Point point = new Point(i2, i3);
        int i5 = point.x;
        int i6 = point.y;
        r3.A03 = C28851b7.A03(i5, this.A00, A09);
        MotionEvent motionEvent = this.A06;
        if (motionEvent != null) {
            r3.A01 = (int) motionEvent.getX();
            i = ((int) motionEvent.getY()) + i6;
        } else {
            r3.A01 = (view.getWidth() - r3.A03) / 2;
            i = this.A01;
        }
        r3.CLK(i);
        r3.A07 = new C90794ee(r3, this, 0);
        r3.A0A.setOnDismissListener(new C90884en(this, 0));
        r3.CMX();
        this.A02 = r3;
    }
}
