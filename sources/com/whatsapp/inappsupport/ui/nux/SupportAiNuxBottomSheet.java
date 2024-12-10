package com.whatsapp.inappsupport.ui.nux;

import X.AnonymousClass00H;
import X.AnonymousClass11E;
import X.C17880vN;
import X.C18070vi;
import X.C28401aA;
import X.C36401np;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewStub;
import com.whatsapp.TextEmojiLabel;

public final class SupportAiNuxBottomSheet extends Hilt_SupportAiNuxBottomSheet {
    public ViewStub A00;
    public ViewStub A01;
    public AnonymousClass11E A02;
    public C28401aA A03;
    public C36401np A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public boolean A07;
    public boolean A08;
    public TextEmojiLabel A09;

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        boolean z = this.A07;
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("start_chat", z);
        A0D.putBoolean("no_internet", this.A08);
        A1F().A0w("request_start_chat", A0D);
        Bundle bundle = this.A06;
        if (bundle != null && bundle.getBoolean("from_existing_chat")) {
            C28401aA r2 = this.A03;
            if (r2 != null) {
                r2.A00("support_ai", (Object) null);
            } else {
                C18070vi.A11("nuxManager");
                throw null;
            }
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r11, android.view.LayoutInflater r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            X.1FL r0 = r10.A1B()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131627153(0x7f0e0c91, float:1.8881562E38)
            r2 = 1
            android.view.View r3 = r1.inflate(r0, r13, r2)
            android.os.Bundle r1 = r10.A06
            if (r1 == 0) goto L_0x00a6
            java.lang.String r0 = "from_existing_chat"
            boolean r0 = r1.getBoolean(r0)
            if (r0 != r2) goto L_0x00a6
        L_0x001c:
            X.C18070vi.A0b(r3)
            r0 = 2131433261(0x7f0b172d, float:1.8488303E38)
            android.view.ViewStub r0 = X.AnonymousClass3MW.A0F(r3, r0)
            r10.A00 = r0
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.inflate()
            if (r1 == 0) goto L_0x003e
            r0 = 2131428609(0x7f0b0501, float:1.8478867E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x003e
            r0 = 16
        L_0x003b:
            X.C89954dI.A00(r1, r10, r0)
        L_0x003e:
            r0 = 2131889375(0x7f120cdf, float:1.9413412E38)
            X.1np r4 = r10.A04
            if (r4 == 0) goto L_0x00e9
            android.content.Context r5 = r10.A14()
            java.lang.String r7 = r10.A1H(r0)
            android.content.Context r2 = r10.A14()
            r1 = 2130971981(0x7f040d4d, float:1.7552716E38)
            r0 = 2131101274(0x7f06065a, float:1.7814953E38)
            int r9 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r0 = 15
            X.7Pd r6 = new X.7Pd
            r6.<init>(r10, r0)
            java.lang.String r8 = "learn-more"
            android.text.SpannableStringBuilder r2 = r4.A06(r5, r6, r7, r8, r9)
            r0 = 2131429941(0x7f0b0a35, float:1.8481569E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass3MX.A0W(r3, r0)
            X.0ve r0 = r1.getAbProps()
            X.AnonymousClass3Ma.A1L(r0, r1)
            r1.setText(r2)
            r10.A09 = r1
            android.os.Bundle r1 = r10.A06
            r2 = 0
            if (r1 == 0) goto L_0x0099
            java.lang.String r0 = "from_existing_chat"
            boolean r1 = r1.getBoolean(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0099
            X.00H r0 = r10.A06
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1mP r1 = (X.C35541mP) r1
            r0 = 22
        L_0x0095:
            r1.A02(r0, r2)
            return r3
        L_0x0099:
            X.00H r0 = r10.A06
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1mP r1 = (X.C35541mP) r1
            r0 = 9
            goto L_0x0095
        L_0x00a6:
            android.os.Bundle r1 = r10.A06
            if (r1 == 0) goto L_0x00b4
            java.lang.String r0 = "isTappedFromSystemMessageOrChatInfo"
            boolean r0 = r1.getBoolean(r0)
            if (r0 != r2) goto L_0x00b4
            goto L_0x001c
        L_0x00b4:
            X.C18070vi.A0b(r3)
            r0 = 2131435588(0x7f0b2044, float:1.8493022E38)
            android.view.ViewStub r0 = X.AnonymousClass3MW.A0F(r3, r0)
            r10.A01 = r0
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r0.inflate()
            if (r2 == 0) goto L_0x003e
            r0 = 2131433187(0x7f0b16e3, float:1.8488153E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x00d6
            r0 = 14
            X.C89954dI.A00(r1, r10, r0)
        L_0x00d6:
            r0 = 2131428618(0x7f0b050a, float:1.8478886E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x003e
            r0 = 15
            goto L_0x003b
        L_0x00e3:
            java.lang.String r0 = "supportLogger"
            X.C18070vi.A11(r0)
            throw r2
        L_0x00e9:
            X.AnonymousClass3MW.A1E()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1r() {
        super.A1r();
        this.A09 = null;
        this.A00 = null;
        this.A01 = null;
    }
}
