package X;

import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.49Y  reason: invalid class name */
public class AnonymousClass49Y extends A34 {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C33251iW A01;
    public final AnonymousClass1BI A02;
    public final WeakReference A03;
    public final boolean A04;

    public AnonymousClass49Y(AnonymousClass1FU r3, C33251iW r4, AnonymousClass1BI r5, boolean z) {
        super(r3, true);
        this.A03 = AnonymousClass3MW.A0z(r3);
        this.A02 = r5;
        this.A01 = r4;
        this.A04 = z;
    }

    public void A0F() {
        WeakReference weakReference = this.A03;
        if (weakReference.get() != null) {
            ((AnonymousClass1FU) weakReference.get()).CNA(2131895077);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        this.A01.A0X(this.A02, this.A04, false);
        AnonymousClass1FU.A0X(this.A00, 300);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1FU r2 = (AnonymousClass1FU) this.A03.get();
        if (r2 != null) {
            r2.CEx();
            r2.A3q(C72473Md.A09(r2), false);
        }
    }
}
