package X;

import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.2Pc  reason: invalid class name and case insensitive filesystem */
public final class C49082Pc extends A34 {
    public C33251iW A00;
    public WeakReference A01;
    public final long A02;
    public final AnonymousClass1BI A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C33251iW r4 = this.A00;
        AnonymousClass1BI r7 = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A05;
        ((A5M) r4.A1D.get()).A03(r7, (Integer) null, (String) null, (String) null, this.A04.intValue(), 4, false, false);
        r4.A0B.A00(r7, 4);
        C26811To r3 = r4.A0C;
        Set A0A = r3.A0A(r7, !z, z2);
        r4.A0U.BEq(r7, (Long) null, z, z2);
        C18070vi.A0d(r7, 0);
        AnonymousClass2VZ.A00.put(r7, false);
        r3.A0R(A0A);
        A74.A01((A74) r4.A1H.get(), r7, 9, (Integer) null, 5);
        AnonymousClass1FU.A0X(this.A02, 300);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Runnable runnable;
        WeakReference weakReference = this.A01;
        if (weakReference != null && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
    }

    public C49082Pc(C33251iW r2, AnonymousClass1BI r3, Integer num, Runnable runnable, long j, boolean z, boolean z2) {
        this.A00 = r2;
        this.A01 = new WeakReference(runnable);
        this.A03 = r3;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = j;
        this.A04 = num;
    }
}
