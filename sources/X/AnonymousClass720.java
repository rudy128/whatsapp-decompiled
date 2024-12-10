package X;

import android.view.View;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.720  reason: invalid class name */
public final class AnonymousClass720 {
    public View.OnClickListener A00;
    public ImageView.ScaleType A01 = ImageView.ScaleType.CENTER;
    public C107345Zi A02;
    public AnonymousClass4ZN A03;
    public AnonymousClass4ZN A04;
    public Long A05;
    public List A06 = C18460wS.A00;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final C122636Rd A0A;
    public final AnonymousClass4ZN A0B;
    public final AnonymousClass4ZN A0C;

    public AnonymousClass720(C122636Rd r2, AnonymousClass4ZN r3, AnonymousClass4ZN r4, int i) {
        C18070vi.A0d(r3, 2);
        this.A0A = r2;
        this.A0C = r3;
        this.A0B = r4;
        this.A09 = i;
    }

    public static AnonymousClass720 A00(C122636Rd r4, Object obj, Object[] objArr, int i) {
        objArr[0] = obj;
        return new AnonymousClass720(r4, C1402670q.A02(objArr, i), (AnonymousClass4ZN) null, 0);
    }

    public static void A01(AnonymousClass720 r2, int i, int i2) {
        C95774mm r1 = new C95774mm(i, i2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        r2.A02 = r1;
        r2.A01 = scaleType;
    }

    public final AnonymousClass7C7 A02() {
        C122636Rd r3 = this.A0A;
        AnonymousClass4ZN r5 = this.A0C;
        AnonymousClass4ZN r6 = this.A0B;
        List list = this.A06;
        C107345Zi r4 = this.A02;
        int i = this.A09;
        ImageView.ScaleType scaleType = this.A01;
        boolean z = this.A08;
        boolean z2 = this.A07;
        return new AnonymousClass7C7(this.A00, scaleType, r3, r4, r5, r6, this.A03, this.A04, this.A05, list, i, z, false, z2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2 != null) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.view.View.OnClickListener r2) {
        /*
            r1 = this;
            r1.A00 = r2
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0009
            r0 = 0
            if (r2 == 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r1.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass720.A03(android.view.View$OnClickListener):void");
    }
}
