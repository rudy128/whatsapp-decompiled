package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.whatsapp.newsletter.insights.view.chart.LineChartView;
import com.whatsapp.newsletter.insights.view.chart.PieChartView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3O5  reason: invalid class name */
public abstract class AnonymousClass3O5 extends View {
    public float A00;
    public C18000vb A01;
    public boolean A02;

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public boolean A05() {
        if (this instanceof PieChartView) {
            List<C86944Tr> list = ((PieChartView) this).A01;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C86944Tr r0 : list) {
                    if (r0.A00 > 0.0f) {
                        return false;
                    }
                }
            }
            return true;
        }
        List<AnonymousClass4UL> list2 = ((LineChartView) this).A0D;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (AnonymousClass4UL r02 : list2) {
                if (AnonymousClass000.A1a(r02.A02)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean getAnimate() {
        return this.A02;
    }

    public final float getDrawnProgress() {
        return this.A00;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public static Long A00(Iterator it) {
        return Long.valueOf(((C86934Tq) it.next()).A00);
    }

    public static Long A01(Iterator it) {
        return Long.valueOf(((C86934Tq) it.next()).A01);
    }

    public static Iterator A02(Iterator it) {
        return ((AnonymousClass4UL) it.next()).A02.iterator();
    }

    public final void A04() {
        if (!A05()) {
            if (this.A02) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                C72473Md.A0n(ofFloat, 650);
                C88754aj.A00(ofFloat, this, 17);
                ofFloat.setStartDelay(300);
                ofFloat.start();
            } else {
                this.A00 = 1.0f;
            }
        }
        postInvalidate();
    }

    public final void setAnimate(boolean z) {
        this.A02 = z;
    }

    public final void setDrawnProgress(float f) {
        this.A00 = f;
    }
}
