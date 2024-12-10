package X;

import java.util.List;

/* renamed from: X.6no  reason: invalid class name and case insensitive filesystem */
public final class C132886no {
    public final C41701wv A00;
    public final C126446ck A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public final void A00(AnonymousClass1FU r8, C122646Re r9, Integer num, List list) {
        List list2 = list;
        AnonymousClass1FU r2 = r8;
        if (list.size() > 15) {
            AnonymousClass4Yv.A01(r8, 27);
            return;
        }
        this.A01.A00.A12.clear();
        if (num != null) {
            ((C41801x5) this.A02.get()).A03(r2, r9, "my_status_activity", list2, num.intValue());
        }
    }

    public C132886no(C41701wv r1, C126446ck r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0w(r1, r3, r4, r5, r6);
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r2;
    }
}
