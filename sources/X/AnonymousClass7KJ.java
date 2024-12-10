package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7KJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7KJ implements C1601087d {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C29681ch A01;
    public final /* synthetic */ AnonymousClass749 A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ WeakReference A05;

    public final void BzB(Integer num, boolean z) {
        WeakReference weakReference = this.A05;
        AnonymousClass749 r2 = this.A02;
        C29681ch r4 = this.A01;
        int i = this.A00;
        Integer num2 = this.A03;
        String str = this.A04;
        Object A0Z = C108975cc.A0Z(weakReference);
        if (A0Z != null) {
            r2.A03.A0J(new AnonymousClass3CT(r2, A0Z, r4, num2, str, i, 2, true));
        }
    }

    public /* synthetic */ AnonymousClass7KJ(C29681ch r1, AnonymousClass749 r2, Integer num, String str, WeakReference weakReference, int i) {
        this.A05 = weakReference;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = num;
        this.A04 = str;
    }
}
