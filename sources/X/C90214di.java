package X;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.insights.view.chart.LineChartView;

/* renamed from: X.4di  reason: invalid class name and case insensitive filesystem */
public class C90214di implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C90214di(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int measuredHeight;
        int i9;
        float f;
        View view2;
        switch (this.A00) {
            case 0:
                View view3 = (View) this.A02;
                if (view3.getParent() != null) {
                    view3.removeOnLayoutChangeListener(this);
                    ((BLs) this.A01).A0W((C73713Xa) this.A03);
                    return;
                }
                return;
            case 1:
                C42011xT r5 = (C42011xT) this.A03;
                r5.A0H.removeOnLayoutChangeListener(this);
                C40401ue r1 = (C40401ue) this.A01;
                RecyclerView recyclerView = r1.A01;
                if (view != null && recyclerView != null && (measuredHeight = recyclerView.getMeasuredHeight() - i4) > 0) {
                    if (r1.A02 == 6) {
                        i9 = AnonymousClass3MX.A00(view.getResources(), 2131165992, view.getResources().getDimensionPixelSize(2131165993));
                    } else {
                        i9 = 0;
                    }
                    int measuredHeight2 = (view.getMeasuredHeight() + measuredHeight) - i9;
                    int A0M = AnonymousClass000.A0M(((C58482kl) this.A02).A02);
                    WaTextView waTextView = ((C74123Yp) r5).A00;
                    int i10 = 2131889750;
                    if (A0M == 2) {
                        i10 = 2131896159;
                    }
                    waTextView.setText(i10);
                    waTextView.setMinimumHeight(measuredHeight2);
                    return;
                }
                return;
            default:
                View view4 = (View) this.A02;
                view4.removeOnLayoutChangeListener(this);
                LineChartView lineChartView = (LineChartView) this.A01;
                float A06 = lineChartView.A06(C17880vN.A05(this.A03));
                float width = ((float) view4.getWidth()) / 2.0f;
                float height = ((float) view4.getHeight()) / 2.0f;
                ViewParent parent = lineChartView.getParent();
                if (!(parent instanceof View) || (view2 = (View) parent) == null) {
                    f = 0.0f;
                } else {
                    f = view2.getY();
                }
                view4.setX(C28851b7.A02(A06, width, ((float) lineChartView.getWidth()) - width) - width);
                view4.setY((f + lineChartView.getY()) - height);
                return;
        }
    }
}
