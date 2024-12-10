package X;

import java.lang.ref.WeakReference;

/* renamed from: X.35B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass35B implements C1601087d {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C29681ch A01;
    public final /* synthetic */ C36341nj A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;

    public final void BzB(Integer num, boolean z) {
        WeakReference weakReference = this.A04;
        C36341nj r1 = this.A02;
        C29681ch r6 = this.A01;
        String str = this.A03;
        long j = this.A00;
        C18070vi.A0d(weakReference, 0);
        AnonymousClass1FL r4 = (AnonymousClass1FL) weakReference.get();
        if (r4 != null) {
            ((C219117w) r1.A05.get()).A01(C217417f.class);
            C20098A7b.A02(AnonymousClass4HA.A00(r6, str, j, z), r4.A03.A00.A03);
        }
    }

    public /* synthetic */ AnonymousClass35B(C29681ch r1, C36341nj r2, String str, WeakReference weakReference, long j) {
        this.A04 = weakReference;
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = str;
        this.A00 = j;
    }
}
