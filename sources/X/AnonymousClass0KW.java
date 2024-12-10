package X;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0KW  reason: invalid class name */
public class AnonymousClass0KW {
    public long A00 = -1;
    public Interpolator A01;
    public AnonymousClass1HM A02;
    public boolean A03;
    public final ArrayList A04 = AnonymousClass000.A13();
    public final AnonymousClass1HN A05 = new AnonymousClass0Bj(this);

    public void A00() {
        if (this.A03) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1HC) it.next()).A01();
            }
            this.A03 = false;
        }
    }

    public void A01() {
        if (!this.A03) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                AnonymousClass1HC r5 = (AnonymousClass1HC) it.next();
                long j = this.A00;
                if (j >= 0) {
                    r5.A08(j);
                }
                Interpolator interpolator = this.A01;
                if (interpolator != null) {
                    r5.A0A(interpolator);
                }
                if (this.A02 != null) {
                    r5.A0B(this.A05);
                }
                r5.A02();
            }
            this.A03 = true;
        }
    }

    public void A02(AnonymousClass1HC r4, AnonymousClass1HC r5) {
        ArrayList arrayList = this.A04;
        arrayList.add(r4);
        r5.A09(r4.A00());
        arrayList.add(r5);
    }

    public void A03(AnonymousClass1HM r2) {
        if (!this.A03) {
            this.A02 = r2;
        }
    }
}
