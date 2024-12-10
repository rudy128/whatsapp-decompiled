package com.whatsapp.biz.catalog.view.fragments;

import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.C18030ve;
import X.C18100vl;
import X.C19880zA;
import X.C36401np;

public final class LinkedCatalogLearnMoreBottomSheet extends Hilt_LinkedCatalogLearnMoreBottomSheet {
    public C19880zA A00;
    public AnonymousClass11S A01;
    public AnonymousClass11C A02;
    public C18030ve A03;
    public AnonymousClass18K A04;
    public C36401np A05;
    public C18100vl A06;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (r9 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r14, android.view.View r15) {
        /*
            r13 = this;
            r7 = 0
            X.C18070vi.A0d(r15, r7)
            super.A21(r14, r15)
            r0 = 2131432042(0x7f0b126a, float:1.848583E38)
            android.widget.TextView r5 = X.AnonymousClass3Ma.A0E(r15, r0)
            r0 = 2131432043(0x7f0b126b, float:1.8485832E38)
            android.widget.TextView r4 = X.AnonymousClass3Ma.A0E(r15, r0)
            X.0ve r1 = r13.A03
            if (r1 == 0) goto L_0x0119
            r0 = 11030(0x2b16, float:1.5456E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0092
            X.11S r0 = r13.A01
            if (r0 == 0) goto L_0x011c
            com.whatsapp.jid.PhoneUserJid r2 = X.AnonymousClass11S.A00(r0)
            if (r2 == 0) goto L_0x0048
            X.0vl r0 = r13.A06
            if (r0 == 0) goto L_0x0044
            java.lang.Object r1 = r0.getValue()
            X.A7x r1 = (X.C20114A7x) r1
            monitor-enter(r1)
            X.9yf r0 = X.A76.A00(r1, r2)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x004b
            java.lang.String r9 = r0.A03     // Catch:{ all -> 0x0041 }
            goto L_0x004c
        L_0x0041:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0044:
            java.lang.String r0 = "catalogCacheManager"
            goto L_0x011e
        L_0x0048:
            java.lang.String r9 = ""
            goto L_0x004f
        L_0x004b:
            r9 = 0
        L_0x004c:
            monitor-exit(r1)
            if (r9 == 0) goto L_0x0048
        L_0x004f:
            boolean r0 = X.AnonymousClass1EG.A0H(r9)
            if (r0 != 0) goto L_0x0083
            android.content.res.Resources r2 = X.AnonymousClass3MZ.A09(r13)
            r1 = 2131891645(0x7f1215bd, float:1.9418016E38)
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = X.AnonymousClass3MW.A0x(r2, r9, r0, r7, r1)
            X.C18070vi.A0X(r1)
            int r6 = X.AnonymousClass1YF.A0F(r1, r9, r7, r7)
            r0 = -1
            if (r6 <= r0) goto L_0x008e
            android.text.SpannableStringBuilder r3 = X.AnonymousClass3MW.A09(r1)
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r8)
            int r1 = r9.length()
            int r1 = r1 + r6
            r0 = 33
            r3.setSpan(r2, r6, r1, r0)
            r5.setText(r3)
        L_0x0083:
            r4.setVisibility(r7)
            r0 = 2131891649(0x7f1215c1, float:1.9418024E38)
            r4.setText(r0)
            r0 = 1
            goto L_0x00a8
        L_0x008e:
            r5.setText(r1)
            goto L_0x0083
        L_0x0092:
            X.0ve r1 = r13.A03
            if (r1 == 0) goto L_0x0119
            r0 = 11029(0x2b15, float:1.5455E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 2131891646(0x7f1215be, float:1.9418018E38)
            r5.setText(r0)
            r4.setVisibility(r7)
            r0 = 2
        L_0x00a8:
            X.AnonymousClass3MZ.A1I(r4, r13, r0)
        L_0x00ab:
            X.8r3 r1 = new X.8r3
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0l()
            r1.A00 = r0
            r0 = 74
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()
            r1.A01 = r0
            X.18K r0 = r13.A04
            if (r0 == 0) goto L_0x0110
            r0.CC7(r1)
            return
        L_0x00cc:
            X.0ve r6 = r13.A03
            if (r6 == 0) goto L_0x0119
            android.content.Context r8 = X.AnonymousClass3MY.A04(r5)
            X.1np r7 = r13.A05
            if (r7 == 0) goto L_0x0116
            r0 = 2131891644(0x7f1215bc, float:1.9418014E38)
            java.lang.String r10 = X.AnonymousClass3MY.A0n(r13, r0)
            X.11C r3 = r13.A02
            if (r3 == 0) goto L_0x0113
            r0 = 46
            X.Ajr r2 = new X.Ajr
            r2.<init>(r13, r0)
            java.lang.String r11 = "linked-catalog-commerce-manager-learn-more"
            r1 = 2130971981(0x7f040d4d, float:1.7552716E38)
            r0 = 2131103159(0x7f060db7, float:1.7818776E38)
            int r12 = X.AnonymousClass1YL.A00(r8, r1, r0)
            r0 = 41
            X.Ajr r9 = new X.Ajr
            r9.<init>(r2, r0)
            android.text.SpannableStringBuilder r0 = r7.A06(r8, r9, r10, r11, r12)
            X.AnonymousClass3Ma.A1I(r5, r6)
            X.AnonymousClass3MZ.A1Q(r5, r3)
            r5.setText(r0)
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x00ab
        L_0x0110:
            java.lang.String r0 = "wamRuntime"
            goto L_0x011e
        L_0x0113:
            java.lang.String r0 = "systemServices"
            goto L_0x011e
        L_0x0116:
            java.lang.String r0 = "linkifier"
            goto L_0x011e
        L_0x0119:
            java.lang.String r0 = "abProps"
            goto L_0x011e
        L_0x011c:
            java.lang.String r0 = "meManager"
        L_0x011e:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.fragments.LinkedCatalogLearnMoreBottomSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public int A2F() {
        return 2131625823;
    }
}
