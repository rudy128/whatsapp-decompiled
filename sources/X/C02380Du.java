package X;

/* renamed from: X.0Du  reason: invalid class name and case insensitive filesystem */
public abstract class C02380Du {
    public static final void A00(C17130tn r6, C36001nB r7, int i) {
        int i2;
        r6.COC(674185128);
        if ((i & 14) == 0) {
            i2 = AnonymousClass001.A0a(r6, r7) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r6.BZO()) {
            AnonymousClass07W r5 = C04100Lv.A00;
            AnonymousClass0tC r4 = (AnonymousClass0tC) r6.BFh(r5);
            AnonymousClass0W2 r0 = (AnonymousClass0W2) AnonymousClass0EU.A00(r6, C02370Dt.A00(r4), new C08510fD(r4), AnonymousClass000.A1b(r4, 1), 4);
            AnonymousClass0PZ.A03(r6, r5.A03(r0), AnonymousClass0LC.A00(r6, new C14500p7(r0, r7), 1863926504), 56);
        } else {
            r6.CNR();
        }
        C05660Vf BKF = r6.BKF();
        if (BKF != null) {
            BKF.A03(new C13110mq(r7, i));
        }
    }
}
