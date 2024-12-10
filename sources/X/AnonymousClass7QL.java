package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7QL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QL implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C114375qh A02;
    public final /* synthetic */ C38471rL A03;
    public final /* synthetic */ AnonymousClass730 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final void run() {
        C23291Fl r4;
        AnonymousClass730 r6 = this.A04;
        String str = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        C38471rL r5 = this.A03;
        boolean z = this.A06;
        C114375qh r3 = this.A02;
        WeakReference A002 = ((AnonymousClass178) r6.A07.get()).A00(str);
        if (A002 != null && (r4 = (C23291Fl) A002.get()) != null) {
            if (r4.BPx().A00(C23401Fx.STARTED)) {
                C90594eK A003 = AnonymousClass730.A00(r5, r6, str, i, i2);
                if (A003 != null) {
                    if (r3 != null) {
                        A003.A01.A0C(r3);
                    }
                    A003.A03();
                }
            } else if (z) {
                r4.getLifecycle().A05(new AnonymousClass7AA(r3, r4, r5, r6, str, i, i2));
            }
        }
    }

    public /* synthetic */ AnonymousClass7QL(C114375qh r1, C38471rL r2, AnonymousClass730 r3, String str, int i, int i2, boolean z) {
        this.A04 = r3;
        this.A05 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r2;
        this.A06 = z;
        this.A02 = r1;
    }
}
