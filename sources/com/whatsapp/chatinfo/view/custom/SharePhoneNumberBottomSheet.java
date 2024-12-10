package com.whatsapp.chatinfo.view.custom;

import X.AOI;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11P;
import X.AnonymousClass1DF;
import X.AnonymousClass1E2;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass206;
import X.AnonymousClass3C0;
import X.AnonymousClass3MW;
import X.AnonymousClass5EY;
import X.C103935Mf;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C22941Dw;
import X.C25065CVx;
import X.C33251iW;
import X.C36401np;
import X.C37551pj;
import X.C72453Mb;
import X.C87374Vi;
import X.C88414Zp;
import X.C92934iA;
import android.view.View;
import com.whatsapp.chatinfo.SharePhoneNumberViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

public final class SharePhoneNumberBottomSheet extends Hilt_SharePhoneNumberBottomSheet {
    public C18030ve A00;
    public C36401np A01;
    public AnonymousClass00H A02;
    public final C18100vl A03 = C88414Zp.A03(this, "arg_entry_point", 6);
    public final C18100vl A04 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C103935Mf(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new AnonymousClass5EY(this));

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r1 == 5) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r8, android.view.View r9) {
        /*
            r7 = this;
            r5 = 0
            X.C18070vi.A0d(r9, r5)
            super.A21(r8, r9)
            android.widget.TextView r1 = r7.A02
            if (r1 == 0) goto L_0x0011
            r0 = 2131896109(0x7f12272d, float:1.942707E38)
            r1.setText(r0)
        L_0x0011:
            android.widget.TextView r2 = r7.A05
            r4 = 5
            r6 = 4
            r3 = 3
            if (r2 == 0) goto L_0x002d
            X.0vl r0 = r7.A03
            int r1 = X.C72453Mb.A0I(r0)
            if (r1 == r3) goto L_0x0027
            if (r1 == r6) goto L_0x0027
            r0 = 2131896108(0x7f12272c, float:1.9427068E38)
            if (r1 != r4) goto L_0x002a
        L_0x0027:
            r0 = 2131896107(0x7f12272b, float:1.9427066E38)
        L_0x002a:
            r2.setText(r0)
        L_0x002d:
            android.widget.TextView r2 = r7.A04
            if (r2 == 0) goto L_0x0046
            X.0vl r0 = r7.A03
            int r1 = X.C72453Mb.A0I(r0)
            if (r1 == r3) goto L_0x008f
            if (r1 == r6) goto L_0x008f
            r0 = 2131896104(0x7f122728, float:1.942706E38)
            if (r1 == r4) goto L_0x0043
            r0 = 2131896106(0x7f12272a, float:1.9427064E38)
        L_0x0043:
            r2.setText(r0)
        L_0x0046:
            android.widget.TextView r1 = r7.A01
            if (r1 == 0) goto L_0x0050
            r0 = 2131896102(0x7f122726, float:1.9427056E38)
            r1.setText(r0)
        L_0x0050:
            android.widget.TextView r1 = r7.A03
            if (r1 == 0) goto L_0x005a
            r0 = 2131896103(0x7f122727, float:1.9427058E38)
            r1.setText(r0)
        L_0x005a:
            X.0vl r0 = r7.A05
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.chatinfo.SharePhoneNumberViewModel r4 = (com.whatsapp.chatinfo.SharePhoneNumberViewModel) r4
            X.0vl r0 = r7.A04
            com.whatsapp.jid.Jid r3 = X.AnonymousClass3MW.A0h(r0)
            X.0vl r0 = r7.A03
            int r1 = X.C72453Mb.A0I(r0)
            X.C18070vi.A0d(r3, r5)
            X.1DT r2 = r4.A00
            boolean r0 = r3 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x0084
            X.00H r0 = r4.A02
            java.lang.Object r0 = r0.get()
            X.CVx r0 = (X.C25065CVx) r0
            X.1E2 r3 = (X.AnonymousClass1E2) r3
            r0.A00(r3, r6, r1, r5)
        L_0x0084:
            X.5R9 r1 = new X.5R9
            r1.<init>(r7)
            r0 = 30
            X.AnonymousClass3MY.A1K(r7, r2, r1, r0)
            return
        L_0x008f:
            r0 = 2131896105(0x7f122729, float:1.9427062E38)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public void onClick(View view) {
        C18070vi.A0d(view, 0);
        int id = view.getId();
        if (!(id == 2131435375 || id == 2131435376)) {
            if (id == 2131435377) {
                AnonymousClass1FL A1B = A1B();
                C18070vi.A0z(A1B, "null cannot be cast to non-null type android.app.Activity");
                AnonymousClass00H r0 = this.A02;
                if (r0 != null) {
                    C37551pj A0V = AnonymousClass3MW.A0V(r0);
                    C22941Dw r02 = UserJid.Companion;
                    C18100vl r1 = this.A04;
                    if (A0V.A0P(C22941Dw.A01(AnonymousClass3MW.A0h(r1)))) {
                        A29();
                        C92934iA r12 = new C92934iA(A1B, new AOI(A1B, this, 0), this, 1);
                        AnonymousClass3MW.A1W(A1B);
                        ((AnonymousClass1FU) A1B).CMl(C87374Vi.A01(r12, A1H(2131894668), 0, false));
                        return;
                    } else if (r1.getValue() instanceof AnonymousClass1E2) {
                        r1.getValue();
                        SharePhoneNumberViewModel sharePhoneNumberViewModel = (SharePhoneNumberViewModel) this.A05.getValue();
                        Jid A0h = AnonymousClass3MW.A0h(r1);
                        int A0I = C72453Mb.A0I(this.A03);
                        C18070vi.A0d(A0h, 0);
                        if (A0h instanceof AnonymousClass1E2) {
                            C33251iW r8 = sharePhoneNumberViewModel.A01;
                            AnonymousClass1E2 r6 = (AnonymousClass1E2) A0h;
                            r8.A0U.BBM(new AnonymousClass206(C17880vN.A0Z(r6, r8.A0x), 73, AnonymousClass11P.A01(r8.A0K)));
                            r8.A19.CGF(new AnonymousClass3C0(r8, r6, 9));
                            ((C25065CVx) sharePhoneNumberViewModel.A02.get()).A00(r6, 6, A0I, false);
                        }
                    } else {
                        return;
                    }
                } else {
                    C18070vi.A11("blockListManager");
                    throw null;
                }
            } else {
                return;
            }
        }
        A29();
    }

    public void A1s() {
        SharePhoneNumberViewModel sharePhoneNumberViewModel = (SharePhoneNumberViewModel) this.A05.getValue();
        Jid A0h = AnonymousClass3MW.A0h(this.A04);
        int A0I = C72453Mb.A0I(this.A03);
        C18070vi.A0d(A0h, 0);
        if (A0h instanceof AnonymousClass1E2) {
            ((C25065CVx) sharePhoneNumberViewModel.A02.get()).A00((AnonymousClass1E2) A0h, 5, A0I, false);
        }
        super.A1s();
    }
}
