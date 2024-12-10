package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass5M8;
import X.C101115Bj;
import X.C101125Bk;
import X.C139436yq;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C25791Pq;
import X.C36401np;
import X.C36531o3;
import X.C72453Mb;
import X.C90084dV;
import X.C99274sY;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public final class ImagineMeConsentBottomSheet extends Hilt_ImagineMeConsentBottomSheet {
    public C36531o3 A00;
    public AnonymousClass11C A01;
    public C18030ve A02;
    public C36401np A03;
    public ViewGroup A04;
    public final C18100vl A05;
    public final int A06 = 2131626051;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r7, android.view.LayoutInflater r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            android.view.View r3 = super.A1q(r7, r8, r9)
            r0 = 0
            if (r3 == 0) goto L_0x008a
            X.0vl r0 = r6.A05
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.bot.metaai.imagineme.ImagineMeConsentViewModel r4 = (com.whatsapp.bot.metaai.imagineme.ImagineMeConsentViewModel) r4
            android.os.Bundle r5 = r6.A06
            r1 = 0
            if (r5 == 0) goto L_0x0024
            java.lang.String r0 = "argument_chat_jid"
            java.lang.String r0 = r5.getString(r0, r1)
            if (r0 == 0) goto L_0x0024
            X.1BI r1 = X.AnonymousClass3MX.A0l(r0)
        L_0x0024:
            r4.A01 = r1
            r2 = -1
            if (r5 == 0) goto L_0x0088
            java.lang.String r0 = "argument_action_source"
            int r1 = r5.getInt(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0088
            if (r1 == r2) goto L_0x0088
            if (r1 != 0) goto L_0x0076
            X.00H r0 = r4.A03
        L_0x003b:
            java.lang.Object r0 = r0.get()
            X.1Pq r0 = (X.C25791Pq) r0
        L_0x0041:
            r4.A00 = r0
            android.content.Context r1 = r6.A14()
            r0 = 2131233694(0x7f080b9e, float:1.8083533E38)
            X.AnonymousClass3MY.A0v(r1, r3, r0)
            X.6jX r0 = r6.A2G()
            int r0 = r0.A00
            if (r0 == r2) goto L_0x0059
            float r0 = (float) r0
            X.C42491yG.A06(r3, r0)
        L_0x0059:
            X.C72473Md.A13(r3, r6)
            r2 = r3
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1 = 0
            r0 = 2131626052(0x7f0e0844, float:1.887933E38)
            android.view.View r1 = X.AnonymousClass3MX.A0B(r8, r2, r0, r1)
            r0 = 2131432711(0x7f0b1507, float:1.8487187E38)
            android.view.ViewGroup r0 = X.AnonymousClass3MW.A0C(r3, r0)
            r6.A04 = r0
            if (r0 == 0) goto L_0x0075
            r0.addView(r1)
        L_0x0075:
            return r3
        L_0x0076:
            r0 = 2
            if (r1 != r0) goto L_0x007c
            X.00H r0 = r4.A06
            goto L_0x003b
        L_0x007c:
            r0 = 3
            if (r1 != r0) goto L_0x0082
            X.00H r0 = r4.A05
            goto L_0x003b
        L_0x0082:
            r0 = 4
            if (r1 != r0) goto L_0x0088
            X.00H r0 = r4.A04
            goto L_0x003b
        L_0x0088:
            r0 = 0
            goto L_0x0041
        L_0x008a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.imagineme.ImagineMeConsentBottomSheet.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            View A052 = C18070vi.A05(view, 2131432712);
            C90084dV.A00(AnonymousClass1HF.A06(A052, 2131432714), this, A052, viewGroup, 17);
        }
        AnonymousClass3MZ.A1H(AnonymousClass1HF.A06(view, 2131432710), this, 19);
        ImagineMeConsentViewModel imagineMeConsentViewModel = (ImagineMeConsentViewModel) this.A05.getValue();
        C25791Pq r3 = imagineMeConsentViewModel.A00;
        if (r3 != null) {
            AnonymousClass3MY.A1P(imagineMeConsentViewModel.A01, r3, 11, false);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C25791Pq r3;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        ImagineMeConsentViewModel imagineMeConsentViewModel = (ImagineMeConsentViewModel) this.A05.getValue();
        if (!imagineMeConsentViewModel.A02 && (r3 = imagineMeConsentViewModel.A00) != null) {
            AnonymousClass3MY.A1P(imagineMeConsentViewModel.A01, r3, 14, true);
        }
    }

    public int A2F() {
        return this.A06;
    }

    public ImagineMeConsentBottomSheet() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ImagineMeConsentViewModel.class);
        this.A05 = C99274sY.A00(new C101115Bj(this), new C101125Bk(this), new AnonymousClass5M8(this), A15);
    }

    public void A1s() {
        super.A1s();
        this.A04 = null;
    }

    public void A2I(C139436yq r1) {
        C72453Mb.A1N(r1);
    }

    public int A25() {
        return 2132084859;
    }
}
