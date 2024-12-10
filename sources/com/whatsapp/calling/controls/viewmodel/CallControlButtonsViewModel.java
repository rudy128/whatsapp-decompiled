package com.whatsapp.calling.controls.viewmodel;

import X.AnonymousClass1DT;
import X.AnonymousClass3VX;
import X.C108945cZ;
import X.C175258yP;

public class CallControlButtonsViewModel extends AnonymousClass3VX {
    public int A00 = 0;
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final C175258yP A02;

    public void A0S() {
        this.A02.unregisterObserver(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BnL(X.C86534Sa r7) {
        /*
            r6 = this;
            com.whatsapp.voipcalling.CallState r1 = r7.A0B
            boolean r2 = com.whatsapp.voipcalling.Voip.A0A(r1)
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x002c
            if (r2 == 0) goto L_0x002c
            int r5 = r6.A00
            boolean r0 = r7.A0I
            X.6ob r3 = new X.6ob
            r3.<init>(r0)
            r2 = 1
        L_0x0016:
            r0 = 0
            X.6pI r4 = new X.6pI
            r4.<init>(r0, r3, r2, r5)
        L_0x001c:
            X.1DT r1 = r6.A01
            java.lang.Object r0 = r1.A06()
            boolean r0 = X.C42171xk.A00(r0, r4)
            if (r0 != 0) goto L_0x002b
            r1.A0F(r4)
        L_0x002b:
            return
        L_0x002c:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 != r0) goto L_0x003e
            r1 = 4
        L_0x0031:
            r2 = 3
            r0 = 0
            int r5 = r6.A00
            X.6ob r3 = new X.6ob
            if (r1 == r2) goto L_0x0055
            r3.<init>(r0)
            r2 = 4
            goto L_0x0016
        L_0x003e:
            int r1 = r7.A00
            r0 = 1
            if (r1 == r0) goto L_0x0053
            r0 = 2
            if (r1 == r0) goto L_0x0053
            if (r2 == 0) goto L_0x0059
            r0 = 3
            if (r1 == r0) goto L_0x0059
            r1 = 0
            r0 = 0
            X.6pI r4 = new X.6pI
            r4.<init>(r0, r0, r1, r1)
            goto L_0x001c
        L_0x0053:
            r1 = 3
            goto L_0x0031
        L_0x0055:
            r3.<init>(r0)
            goto L_0x0016
        L_0x0059:
            int r3 = r6.A00
            boolean r1 = r7.A0Q
            com.whatsapp.jid.UserJid r0 = r7.A0A
            X.6oo r2 = new X.6oo
            r2.<init>(r0, r1)
            r1 = 2
            r0 = 0
            X.6pI r4 = new X.6pI
            r4.<init>(r2, r0, r1, r3)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel.BnL(X.4Sa):void");
    }

    public CallControlButtonsViewModel(C175258yP r2) {
        this.A02 = r2;
        r2.registerObserver(this);
        AnonymousClass3VX.A00(r2, this);
    }
}
