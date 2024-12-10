package com.whatsapp;

import X.AnonymousClass3Ma;
import X.C72463Mc;
import android.widget.TextView;

public final class SuspiciousLinkWarningDialogFragment extends Hilt_SuspiciousLinkWarningDialogFragment {
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r20) {
        /*
            r19 = this;
            r8 = r19
            android.os.Bundle r1 = r8.A15()
            java.lang.String r0 = "url"
            java.lang.String r7 = r1.getString(r0)
            android.os.Bundle r1 = r8.A15()
            java.lang.String r0 = "phishingChars"
            java.io.Serializable r6 = r1.getSerializable(r0)
            boolean r0 = r6 instanceof java.util.HashSet
            if (r0 == 0) goto L_0x0072
            java.util.AbstractCollection r6 = (java.util.AbstractCollection) r6
        L_0x001c:
            X.129 r1 = r8.A05
            if (r1 == 0) goto L_0x018f
            java.lang.String r0 = "26000162"
            java.lang.String r0 = r1.A06(r0)
            X.C18070vi.A0X(r0)
            android.content.Context r2 = r8.A14()
            r1 = 2131896643(0x7f122943, float:1.9428153E38)
            r5 = 1
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r0, r5)
            android.text.Spanned r0 = X.AnonymousClass1EG.A01(r2, r0, r1)
            android.text.SpannableStringBuilder r4 = X.AnonymousClass3MW.A09(r0)
            int r1 = r4.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r3 = 0
            java.lang.Object[] r2 = r4.getSpans(r3, r1, r0)
            android.text.style.URLSpan[] r2 = (android.text.style.URLSpan[]) r2
            if (r2 == 0) goto L_0x0086
            int r1 = r2.length
            r0 = 0
        L_0x004e:
            if (r0 >= r1) goto L_0x007c
            r9 = r2[r0]
            android.content.Context r11 = r8.A14()
            X.1KB r13 = r8.A00
            if (r13 == 0) goto L_0x0078
            X.11C r14 = r8.A02
            if (r14 == 0) goto L_0x0074
            X.1nl r12 = r8.A01
            if (r12 == 0) goto L_0x0192
            java.lang.String r16 = r9.getURL()
            r15 = 0
            X.3cE r10 = new X.3cE
            r10.<init>((android.content.Context) r11, (X.AnonymousClass1L8) r12, (X.AnonymousClass1KB) r13, (X.AnonymousClass11C) r14, (X.AnonymousClass206) r15, (java.lang.String) r16)
            X.C72473Md.A0x(r4, r9, r10)
            int r0 = r0 + 1
            goto L_0x004e
        L_0x0072:
            r6 = 0
            goto L_0x001c
        L_0x0074:
            java.lang.String r0 = "systemServices"
            goto L_0x0194
        L_0x0078:
            java.lang.String r0 = "globalUI"
            goto L_0x0194
        L_0x007c:
            if (r3 >= r1) goto L_0x0086
            r0 = r2[r3]
            r4.removeSpan(r0)
            int r3 = r3 + 1
            goto L_0x007c
        L_0x0086:
            java.lang.String r0 = "\n\n"
            r4.append(r0)
            if (r7 == 0) goto L_0x0167
            int r9 = r7.length()
            if (r9 == 0) goto L_0x0167
            if (r6 == 0) goto L_0x0167
            android.content.Context r3 = r8.A14()
            android.content.Context r2 = r8.A1n()
            r1 = 2130971434(0x7f040b2a, float:1.7551606E38)
            r0 = 2131102669(0x7f060bcd, float:1.7817782E38)
            int r0 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            android.text.style.ForegroundColorSpan r11 = new android.text.style.ForegroundColorSpan
            r11.<init>(r0)
            r3 = r7
            r0 = 0
            int r1 = r7.codePointCount(r0, r9)
            r0 = 96
            if (r1 <= r0) goto L_0x00c7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass1EG.A0E(r7, r0)
            r1.append(r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            java.lang.String r3 = X.C17890vO.A0c(r1, r0)
        L_0x00c7:
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r3)
            android.net.Uri r0 = android.net.Uri.parse(r7)
            if (r0 == 0) goto L_0x0156
            java.lang.String r3 = r0.getHost()
            if (r3 == 0) goto L_0x0156
            java.lang.String r1 = "\\."
            X.1wr r0 = new X.1wr
            r0.<init>((java.lang.String) r1)
            r10 = 0
            java.util.List r3 = r0.A01(r3, r10)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0153
            java.util.ListIterator r1 = X.C108955ca.A18(r3)
        L_0x00ee:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0153
            int r0 = X.C108985cd.A08(r1)
            if (r0 == 0) goto L_0x00ee
            java.util.List r0 = X.C108985cd.A0t(r3, r1)
        L_0x00fe:
            if (r0 == 0) goto L_0x0156
            java.lang.String[] r9 = X.C108955ca.A1b(r0)
            if (r9 == 0) goto L_0x0156
            int r0 = r9.length
            r18 = r0
            r12 = 0
            r13 = -1
        L_0x010b:
            r0 = r18
            if (r12 >= r0) goto L_0x0156
            r14 = r9[r12]
            r15 = 0
            r17 = 0
            r3 = -1
        L_0x0115:
            int r1 = r14.length()
            if (r15 >= r1) goto L_0x0142
            int r1 = r14.codePointAt(r15)
            int r16 = java.lang.Character.charCount(r1)
            boolean r0 = X.C108965cb.A1Z(r6, r1)
            if (r0 == 0) goto L_0x013e
            char r1 = (char) r1
            int r0 = r3 + 1
            int r3 = X.AnonymousClass1YF.A0C(r7, r1, r0, r10)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r5)
            int r5 = r3 + r16
            r0 = 33
            r2.setSpan(r1, r3, r5, r0)
            r17 = 1
        L_0x013e:
            int r15 = r15 + r16
            r5 = 1
            goto L_0x0115
        L_0x0142:
            if (r17 == 0) goto L_0x0150
            int r0 = r13 + 1
            int r13 = X.AnonymousClass1YF.A0F(r7, r14, r0, r10)
            int r1 = r1 + r13
            r0 = 33
            r2.setSpan(r11, r13, r1, r0)
        L_0x0150:
            int r12 = r12 + 1
            goto L_0x010b
        L_0x0153:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x00fe
        L_0x0156:
            X.0vb r0 = r8.A01
            X.1Wz r0 = X.C18000vb.A00(r0)
            X.1X3 r1 = r0.A01
            X.1X5 r0 = r1.A00
            android.text.SpannableStringBuilder r0 = r1.A02(r0, r2)
            r4.append(r0)
        L_0x0167:
            r6 = 2131896647(0x7f122947, float:1.9428161E38)
            r3 = 2131896646(0x7f122946, float:1.942816E38)
            X.3Rj r2 = X.AnonymousClass4a6.A04(r8)
            r0 = 2131896644(0x7f122944, float:1.9428155E38)
            r2.A0E(r0)
            r2.A0S(r4)
            r2.A0T(r5)
            r1 = 0
            X.74u r0 = new X.74u
            r0.<init>(r1, r7, r8)
            r2.A0X(r0, r3)
            r0 = 2
            X.AnonymousClass757.A01(r2, r8, r0, r6)
            X.05w r0 = X.AnonymousClass3MY.A0L(r2)
            return r0
        L_0x018f:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x0194
        L_0x0192:
            java.lang.String r0 = "linkLauncher"
        L_0x0194:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SuspiciousLinkWarningDialogFragment.A27(android.os.Bundle):android.app.Dialog");
    }

    public void A1v() {
        super.A1v();
        TextView textView = (TextView) A26().findViewById(16908299);
        if (textView != null) {
            AnonymousClass3Ma.A1I(textView, this.A02);
            C72463Mc.A0w(A1B(), A1D(), textView, 2130971433, 2131102668);
        }
    }
}
