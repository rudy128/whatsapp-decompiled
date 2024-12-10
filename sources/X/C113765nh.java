package X;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import com.whatsapp.calling.callgrid.view.CallGrid;

/* renamed from: X.5nh  reason: invalid class name and case insensitive filesystem */
public class C113765nh extends C65142vu {
    public boolean A00;
    public final int A01 = 1;
    public final Object A02;
    public final Object A03;

    public C113765nh(TimeInterpolator timeInterpolator, C1409273p r3, boolean z) {
        this.A03 = r3;
        this.A00 = z;
        this.A02 = timeInterpolator;
    }

    public void C9G(AnonymousClass1LG r3) {
        if (this.A01 == 0) {
            C61132pB.A01((ViewGroup) this.A03, false);
            this.A00 = true;
        }
    }

    public void C9H(AnonymousClass1LG r3) {
        if (this.A01 != 0) {
            C1409273p r0 = (C1409273p) this.A03;
            r0.A01 = false;
            C1409273p.A03(r0.A07, false);
            return;
        }
        if (!this.A00) {
            C61132pB.A01((ViewGroup) this.A03, false);
        }
        r3.A0O(this);
    }

    public void C9I() {
        if (this.A01 == 0) {
            C61132pB.A01((ViewGroup) this.A03, false);
        }
    }

    public void C9J() {
        if (this.A01 == 0) {
            C61132pB.A01((ViewGroup) this.A03, true);
        }
    }

    public void C9K(AnonymousClass1LG r9) {
        int inCallControlsTop;
        if (1 - this.A01 == 0) {
            C1409273p r1 = (C1409273p) this.A03;
            r1.A01 = true;
            if (!r1.A0A) {
                CallGrid callGrid = r1.A02;
                if (this.A00) {
                    inCallControlsTop = r1.A06.A02().getTop();
                } else {
                    inCallControlsTop = r1.A03.getInCallControlsTop();
                }
                callGrid.A0G((TimeInterpolator) this.A02, inCallControlsTop, 0, true);
            }
            C1409273p.A03(r1.A07, true);
        }
    }

    public C113765nh(ViewGroup viewGroup, C29081ba r3) {
        this.A02 = r3;
        this.A03 = viewGroup;
        this.A00 = false;
    }
}
