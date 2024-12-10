package X;

import com.whatsapp.waffle.accountlinking.WaffleLinkedRequestExecutor$pingAsCompanion$pingResult$1;

/* renamed from: X.6OY  reason: invalid class name */
public abstract class AnonymousClass6OY extends AnonymousClass67U {
    public final C35131lh A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6OY(X.AnonymousClass181 r15, X.C19830z4 r16, X.C18030ve r17, X.C31611fq r18, X.AnonymousClass11W r19, X.C35131lh r20, X.AnonymousClass00H r21, X.AnonymousClass00H r22, X.AnonymousClass00H r23, X.C18140vp r24, X.C18140vp r25, long r26) {
        /*
            r14 = this;
            r9 = 0
            java.lang.Object r0 = r22.get()
            com.whatsapp.bridge.wfal.WfalManager r0 = (com.whatsapp.bridge.wfal.WfalManager) r0
            X.732 r0 = r0.A02()
            if (r0 == 0) goto L_0x0031
            X.77e r0 = r0.A02
            java.lang.Object r8 = r0.A00
            java.lang.String r8 = (java.lang.String) r8
        L_0x0013:
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r21
            r14.A01 = r0
            r0 = r20
            r14.A00 = r0
            return
        L_0x0031:
            r8 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OY.<init>(X.181, X.0z4, X.0ve, X.1fq, X.11W, X.1lh, X.00H, X.00H, X.00H, X.0vp, X.0vp, long):void");
    }

    public void CBv(C1606989o r10) {
        Exception r3;
        C18070vi.A0d(r10, 0);
        C130466jT r6 = (C130466jT) this.A01.get();
        AnonymousClass7RN r32 = new AnonymousClass7RN(this, r10, 30);
        C126786dI r2 = new C126786dI(r10);
        C35131lh r7 = this.A00;
        C31081ez.A02("WaffleLinkedRequestExecutor/executeWithPreprocessing Start preprocessing linked waffle request");
        int A002 = ((C35101le) r6.A04.get()).A00(r7);
        if (A002 != 2) {
            if (A002 == 3) {
                C31081ez.A01("WaffleLinkedRequestExecutor/post AccountsPausedError");
                r3 = new AnonymousClass6OR(3, (Throwable) null);
            } else if (A002 == 4) {
                C31081ez.A01("WaffleLinkedRequestExecutor/post NoAccountsLinkedError");
                r3 = new AnonymousClass6OT(3, (Throwable) null);
            } else {
                return;
            }
        } else if (((AnonymousClass11S) r6.A03.get()).A0N()) {
            if (r7.isEnabledForCompanions) {
                if (C18020vd.A05(C18040vf.A02, r6.A00.A00, 9171)) {
                    AnonymousClass6U6 r1 = (AnonymousClass6U6) AnonymousClass4GT.A00(AnonymousClass1OR.A00, new WaffleLinkedRequestExecutor$pingAsCompanion$pingResult$1(r6, (C30391dr) null));
                    if (r1 instanceof AnonymousClass6OA) {
                        C31081ez.A02("WaffleLinkedRequestExecutor/ping/onSuccess");
                        r32.run();
                        return;
                    } else if (r1 instanceof AnonymousClass6OB) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("WaffleLinkedRequestExecutor/ping/onError ");
                        Exception exc = ((AnonymousClass6OB) r1).A00;
                        C31081ez.A01(AnonymousClass000.A0y(exc.getMessage(), A10));
                        r3 = new AnonymousClass6OU(exc);
                    } else if (r1 instanceof AnonymousClass6O9) {
                        C31081ez.A01("WaffleLinkedRequestExecutor/ping/onDeliveryFailure");
                        r2.A00.BrB(C17880vN.A0f("Account ping failed to deliver"));
                        return;
                    } else {
                        return;
                    }
                }
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Wfal feature: ");
            A102.append(r7);
            C17960vV.A0F(false, AnonymousClass000.A0y(" is not enabled on companions", A102));
            r3 = new AnonymousClass6OU(2, AnonymousClass000.A0n("Invalid access to ping API on companion"));
        } else {
            ((C132186mL) r6.A01.get()).A00(new AnonymousClass7GY(r2, r32));
            return;
        }
        r2.A00.Bsw(r3);
    }

    public static final void A00(C1606989o r2, AnonymousClass6OY r3) {
        super.CBv(new AnonymousClass7I7(r2, 11));
    }
}
