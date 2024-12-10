package X;

import android.animation.TimeInterpolator;
import com.whatsapp.calling.callgrid.view.CallGrid;
import java.lang.ref.WeakReference;

/* renamed from: X.5ng  reason: invalid class name and case insensitive filesystem */
public final class C113755ng extends C65142vu {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ TimeInterpolator A02;
    public final /* synthetic */ C1409273p A03;
    public final /* synthetic */ boolean A04;

    public C113755ng(TimeInterpolator timeInterpolator, C1409273p r2, int i, long j, boolean z) {
        this.A03 = r2;
        this.A04 = z;
        this.A01 = j;
        this.A00 = i;
        this.A02 = timeInterpolator;
    }

    public void C9H(AnonymousClass1LG r3) {
        C1409273p r0 = this.A03;
        r0.A01 = false;
        C1409273p.A03(r0.A07, false);
    }

    public void C9K(AnonymousClass1LG r14) {
        C160958At r4;
        C1409273p r6 = this.A03;
        r6.A01 = true;
        if (r6.A0A) {
            WeakReference weakReference = r6.A00;
            if (!(weakReference == null || (r4 = (C160958At) weakReference.get()) == null)) {
                boolean z = this.A04;
                r4.C0f(this.A02, this.A01, z);
            }
        } else if (C72473Md.A1Z(r6.A09)) {
            CallGrid callGrid = r6.A02;
            boolean z2 = this.A04;
            long j = this.A01;
            callGrid.A0G(this.A02, this.A00, j, z2);
        }
        C1409273p.A03(r6.A07, true);
    }
}
