package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7Q2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Q2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C38471rL A02;
    public final /* synthetic */ C139126yG A03;
    public final /* synthetic */ String A04;

    public final void run() {
        C23291Fl r0;
        WeakReference A002;
        C23291Fl r1;
        C139126yG r02 = this.A03;
        String str = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        C38471rL r4 = this.A02;
        AnonymousClass00H r12 = r02.A04;
        WeakReference A003 = ((AnonymousClass178) r12.get()).A00(str);
        if (A003 != null && (r0 = (C23291Fl) A003.get()) != null) {
            C23401Fx BPx = r0.BPx();
            C23401Fx r3 = C23401Fx.STARTED;
            if (BPx.A00(r3) && (A002 = ((AnonymousClass178) r12.get()).A00(str)) != null && (r1 = (C23291Fl) A002.get()) != null && r1.BPx().A00(r3)) {
                C90594eK BZQ = r1.BZQ(i, 3500, false);
                if (r4 != null && i2 != 0) {
                    BZQ.A06(new AnonymousClass48j((Object) null, BZQ, r4, 33), i2);
                    BIE bie = BZQ.A01.A0J;
                    C18070vi.A0X(bie);
                    BZQ.A05(AnonymousClass1YL.A00(bie.getContext(), 2130971311, 2131102579));
                } else if (BZQ == null) {
                    return;
                }
                BZQ.A03();
            }
        }
    }

    public /* synthetic */ AnonymousClass7Q2(C38471rL r1, C139126yG r2, String str, int i, int i2) {
        this.A03 = r2;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
    }
}
