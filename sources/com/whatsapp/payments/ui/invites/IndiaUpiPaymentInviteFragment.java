package com.whatsapp.payments.ui.invites;

import X.ALX;
import X.AZ6;
import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1FU;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass1QD;
import X.AnonymousClass1QO;
import X.AnonymousClass8BR;
import X.AnonymousClass8FV;
import X.AnonymousClass8Gf;
import X.AnonymousClass9YW;
import X.C18030ve;
import X.C191339mR;
import X.C194529rs;
import X.C195859u1;
import X.C19954A0l;
import X.C20110A7s;
import X.C20338AGu;
import X.C24921Me;
import X.C27201Vd;
import X.C33351ig;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IndiaUpiPaymentInviteFragment extends Hilt_IndiaUpiPaymentInviteFragment {
    public AnonymousClass1M9 A00;
    public AnonymousClass1PM A01;
    public C24921Me A02;
    public C27201Vd A03;
    public AnonymousClass11P A04;
    public C18030ve A05;
    public ALX A06;
    public AnonymousClass1QD A07;
    public C191339mR A08;
    public C20110A7s A09;
    public AnonymousClass1QO A0A;
    public C195859u1 A0B;
    public AZ6 A0C;
    public C33351ig A0D;
    public AnonymousClass8FV A0E;
    public AnonymousClass00H A0F;

    public void A21(Bundle bundle, View view) {
        AnonymousClass8FV r0 = (AnonymousClass8FV) AnonymousClass8BR.A0C(new AnonymousClass8Gf(this, 2), this).A00(AnonymousClass8FV.class);
        this.A0E = r0;
        r0.A00.A0A(A1G(), new C20338AGu(this, 3));
        this.A0E.A01.A0A(A1G(), new C20338AGu(this, 4));
        this.A0E.A02.A0A(A1G(), new C20338AGu(this, 5));
        super.A21(bundle, view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r0.A0F == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C171858sO r6, com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment r7) {
        /*
            X.1ig r0 = r7.A0D
            X.A0v r2 = r0.A01()
            X.11P r0 = r7.A04
            long r0 = X.AnonymousClass11P.A00(r0)
            int r5 = r2.A00(r0)
            r1 = 4
            r4 = 1
            if (r5 == r4) goto L_0x001a
            r0 = 2
            if (r5 == r0) goto L_0x001a
            if (r5 == r1) goto L_0x001a
            return
        L_0x001a:
            X.8zi r3 = new X.8zi
            r3.<init>()
            r2 = 0
            boolean r1 = X.AnonymousClass000.A1T(r5, r1)
            java.lang.String r0 = "is_ended_early"
            r3.A08(r0, r1)
            X.4k3 r0 = r7.A01
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.A0F
            r1 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            X.A7u[] r0 = new X.C20112A7u[r4]
            r0[r2] = r3
            X.A7u r2 = X.C20112A7u.A03(r0)
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = "section"
            java.lang.String r0 = "incentive_banner"
            r2.A07(r1, r0)
        L_0x0044:
            X.AnonymousClass8BR.A1H(r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment.A00(X.8sO, com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment):void");
    }

    public void A1w(int i, int i2, Intent intent) {
        if (i == 1026) {
            AnonymousClass1FU r5 = (AnonymousClass1FU) A1D();
            if (intent != null && !r5.isFinishing()) {
                ((C19954A0l) this.A0F.get()).A00(r5, new C194529rs(intent.getExtras(), false, true), (AnonymousClass9YW) null);
            }
            A26();
            return;
        }
        super.A1w(i, i2, intent);
    }
}
