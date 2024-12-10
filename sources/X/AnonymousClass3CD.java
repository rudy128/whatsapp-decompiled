package X;

import java.util.List;

/* renamed from: X.3CD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CD implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C130496jW A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public final void run() {
        C130496jW r4 = this.A02;
        int i = this.A00;
        String str = this.A03;
        int i2 = this.A01;
        List list = this.A04;
        C34991lS r5 = (C34991lS) r4.A03.get();
        C35021lW r6 = C35011lV.A00;
        Integer valueOf = Integer.valueOf(i);
        C18000vb r0 = r4.A01;
        String A05 = r0.A05();
        String A042 = r0.A04();
        AnonymousClass7GU r3 = new AnonymousClass7GU(r4, i2, 0, list);
        ((C35041lY) r5.A03.get()).A01(r6, new C1178861i(r3, r3, r5, r6, (AnonymousClass705) null, valueOf, str, A05, A042));
    }

    public /* synthetic */ AnonymousClass3CD(C130496jW r1, String str, List list, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A03 = str;
        this.A01 = i2;
        this.A04 = list;
    }
}
