package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* renamed from: X.5hZ  reason: invalid class name and case insensitive filesystem */
public final class C110965hZ extends C39401t1 {
    public boolean A00;
    public final int A01;
    public final Rect A02 = AnonymousClass3MW.A07();
    public final Rect A03 = AnonymousClass3MW.A07();
    public final Rect A04 = AnonymousClass3MW.A07();
    public final Rect A05 = AnonymousClass3MW.A07();
    public final AnonymousClass87W A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public void A1h(C26228CvK cvK, int i) {
        Rect rect;
        C18070vi.A0d(cvK, 1);
        if (!A03()) {
            cvK.A0Q("");
            cvK.A02.setBoundsInParent(new Rect(0, 0, 0, 0));
            cvK.A0O(C108955ca.A0x(this));
            return;
        }
        if (i == 0) {
            cvK.A0Q(this.A09);
            rect = this.A04;
        } else if (i == 1) {
            cvK.A0Q(this.A0A);
            rect = this.A05;
        } else if (i != 2) {
            if (i == 3) {
                cvK.A0Q(this.A08);
                rect = this.A03;
            }
            cvK.A0O("VideoTimelineView");
            cvK.A0A(16);
        } else {
            cvK.A0Q(this.A07);
            rect = this.A02;
        }
        cvK.A02.setBoundsInParent(rect);
        cvK.A0O("VideoTimelineView");
        cvK.A0A(16);
    }

    public void A1i(List list) {
        C18070vi.A0d(list, 0);
        if (A03()) {
            list.add(0);
            list.add(C17880vN.A0h());
            list.add(C17880vN.A0i());
            list.add(C17880vN.A0j());
        }
    }

    private final boolean A03() {
        if (!this.A00 || this.A04.isEmpty() || this.A05.isEmpty() || this.A02.isEmpty() || this.A03.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean A1m(int i, int i2, Bundle bundle) {
        AnonymousClass87W r4 = this.A06;
        if (r4 == null || !A03() || i2 != 16) {
            return false;
        }
        if (i == 0) {
            r4.CRR(-1, true);
        } else if (i == 1) {
            r4.CRR(1, true);
        } else if (i == 2) {
            r4.CRR(-1, false);
        } else if (i == 3) {
            r4.CRR(1, false);
        }
        A1d();
        return true;
    }

    public C110965hZ(View view, AnonymousClass87W r4, int i) {
        super(view);
        this.A01 = i;
        this.A06 = r4;
        this.A09 = AnonymousClass3MY.A0m(view.getResources(), 2131886296);
        this.A0A = AnonymousClass3MY.A0m(view.getResources(), 2131886297);
        this.A07 = AnonymousClass3MY.A0m(view.getResources(), 2131886294);
        this.A08 = AnonymousClass3MY.A0m(view.getResources(), 2131886295);
    }

    public int A1b(float f, float f2) {
        if (!A03()) {
            return -1;
        }
        int i = (int) f;
        int i2 = (int) f2;
        if (this.A04.contains(i, i2)) {
            return 0;
        }
        if (this.A05.contains(i, i2)) {
            return 1;
        }
        if (this.A02.contains(i, i2)) {
            return 2;
        }
        if (this.A03.contains(i, i2)) {
            return 3;
        }
        return -1;
    }
}
