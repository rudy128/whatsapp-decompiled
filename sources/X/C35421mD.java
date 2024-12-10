package X;

import com.whatsapp.calling.callhistory.view.CallsHistoryFragment;
import com.whatsapp.util.Log;

/* renamed from: X.1mD  reason: invalid class name and case insensitive filesystem */
public class C35421mD {
    public final /* synthetic */ CallsHistoryFragment A00;

    public C35421mD(CallsHistoryFragment callsHistoryFragment) {
        this.A00 = callsHistoryFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0223, code lost:
        if (X.C40811vJ.A0Z(r6.A0T, r6.A0P.A08.A0A(r15)) != false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0233, code lost:
        if (((X.AnonymousClass1VQ) r13).BjR(r14, r15, r16, r2, r18, false, false) == 0) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C66582yP r22, X.Bq2 r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r6 = r0.A00
            X.00H r0 = r6.A0q
            java.lang.Object r0 = r0.get()
            X.9sx r0 = (X.C195199sx) r0
            r0.A01()
            X.02B r0 = r6.A02
            if (r0 == 0) goto L_0x0019
            r0 = r23
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A08(r0, r6)
            return
        L_0x0019:
            X.1FL r5 = r6.A1B()
            if (r5 != 0) goto L_0x0025
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onCallButtonClicked activity null"
        L_0x0021:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0025:
            r7 = r22
            X.3Bg r13 = r7.A01
            java.util.List r0 = r13.A03()
            r8 = 0
            java.lang.Object r4 = r0.get(r8)
            X.9Bw r4 = (X.C178119Bw) r4
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r6.A0C
            X.1vo r0 = r0.A0Y
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.String r12 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onCallButtonClicked call origin null. Call type: "
            r11 = -1
            r10 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0240
            r2 = 35
        L_0x0049:
            X.1E7 r1 = r7.A03
            java.util.List r14 = r13.A04
            X.C18070vi.A0W(r14)
            java.lang.Object r0 = X.C29431cG.A0c(r14)
            X.9Bw r0 = (X.C178119Bw) r0
            r9 = r24
            if (r0 == 0) goto L_0x0082
            X.2m4 r15 = r0.A0B
            if (r15 == 0) goto L_0x0082
            boolean r0 = r5 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = r15.A02
            java.lang.String r0 = X.AnonymousClass74H.A07(r0, r9)
            android.net.Uri r3 = android.net.Uri.parse(r0)
            X.1VP r2 = r6.A0D
            X.1FU r5 = (X.AnonymousClass1FU) r5
            X.1vD r0 = r6.A0B
            r0.A03()
            X.1KB r1 = r6.A08
            r0 = 12
            X.C63982u1.A06(r3, r5, r1, r2, r0)
        L_0x007c:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r6.A0C
            r0.A0Z(r7, r9)
            return
        L_0x0082:
            boolean r15 = r13.A04()
            r0 = 13
            if (r15 == 0) goto L_0x0138
            if (r1 != 0) goto L_0x0138
            X.11C r1 = r6.A0L
            android.view.inputmethod.InputMethodManager r11 = r1.A0N()
            android.view.View r1 = r5.getCurrentFocus()
            if (r11 == 0) goto L_0x00a1
            if (r1 == 0) goto L_0x00a1
            android.os.IBinder r1 = r1.getWindowToken()
            r11.hideSoftInputFromWindow(r1, r8)
        L_0x00a1:
            X.00H r1 = r6.A0l
            java.lang.Object r12 = r1.get()
            X.9oZ r12 = (X.C192539oZ) r12
            r12.A00()
            int r1 = com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A01(r4)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r12.A01(r11, r1, r0)
            boolean r0 = r5 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0126
            r11 = r5
            X.1FU r11 = (X.AnonymousClass1FU) r11
            X.0ve r1 = r6.A0T
            r0 = 12111(0x2f4f, float:1.6971E-41)
            X.0vf r12 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r12, r1, r0)
            if (r0 == 0) goto L_0x00e2
            X.C18070vi.A0d(r4, r3)
            X.4cT r1 = r4.A04
            X.C18070vi.A0W(r1)
            com.whatsapp.jid.GroupJid r0 = r4.A0C
            com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet r5 = X.C87384Vj.A00(r0, r1, r2)
            java.lang.String r0 = "CallConfirmationSheet"
        L_0x00de:
            r11.CMk(r5, r0)
            goto L_0x007c
        L_0x00e2:
            X.0ve r1 = r6.A0T
            r0 = 7175(0x1c07, float:1.0054E-41)
            boolean r0 = X.C18020vd.A05(r12, r1, r0)
            if (r0 == 0) goto L_0x0126
            X.4cT r4 = r4.A04
            X.C18070vi.A0d(r4, r8)
            com.whatsapp.calling.callconfirmationsheet.ui.AdhocCallConfirmationSheet r5 = new com.whatsapp.calling.callconfirmationsheet.ui.AdhocCallConfirmationSheet
            r5.<init>()
            r0 = 3
            X.1D6[] r12 = new X.AnonymousClass1D6[r0]
            java.lang.String r1 = "call_log_message_key"
            X.1D6 r0 = new X.1D6
            r0.<init>(r1, r4)
            r12[r8] = r0
            java.lang.String r4 = "is_from_call_log"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            X.1D6 r0 = new X.1D6
            r0.<init>(r4, r1)
            r12[r3] = r0
            java.lang.String r3 = "call_from_ui"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            X.1D6 r0 = new X.1D6
            r0.<init>(r3, r1)
            r12[r10] = r0
            android.os.Bundle r0 = X.AnonymousClass9O6.A00(r12)
            r5.A1R(r0)
            java.lang.String r0 = "AdhocCallConfirmationSheet"
            goto L_0x00de
        L_0x0126:
            X.0ve r2 = r6.A0T
            X.11S r1 = r6.A09
            X.1M9 r0 = r6.A0G
            r15 = 21
            r11 = r1
            r12 = r0
            r13 = r2
            r14 = r4
            r10 = r5
            X.AnonymousClass74H.A08(r10, r11, r12, r13, r14, r15)
            goto L_0x007c
        L_0x0138:
            if (r2 != r11) goto L_0x014f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            int r0 = r13.A00()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0021
        L_0x014f:
            boolean r11 = r13.A04()
            r12 = 3
            if (r11 != 0) goto L_0x017e
            X.1E7 r11 = r13.A01()
            X.00H r0 = r6.A0l
            java.lang.Object r8 = r0.get()
            X.9oZ r8 = (X.C192539oZ) r8
            r8.A00()
            int r0 = com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A01(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r24 == 0) goto L_0x0170
            r10 = 3
        L_0x0170:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r8.A01(r1, r0, r10)
            X.1VP r0 = r6.A0D
            r0.CNw(r5, r11, r2, r9)
            goto L_0x007c
        L_0x017e:
            if (r1 == 0) goto L_0x007c
            boolean r10 = r5 instanceof X.AnonymousClass1FU
            if (r10 == 0) goto L_0x007c
            com.whatsapp.jid.GroupJid r15 = r4.A0C
            if (r24 == 0) goto L_0x01ee
            java.lang.Object r10 = X.C29431cG.A0c(r14)
            X.9Bw r10 = (X.C178119Bw) r10
            if (r10 == 0) goto L_0x01ee
            com.whatsapp.jid.GroupJid r10 = r10.A0C
            if (r10 == 0) goto L_0x01ee
        L_0x0194:
            X.00H r3 = r6.A0l
            java.lang.Object r10 = r3.get()
            X.9oZ r10 = (X.C192539oZ) r10
            r10.A00()
            int r3 = com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A01(r4)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r10.A01(r8, r3, r0)
            X.1FU r5 = (X.AnonymousClass1FU) r5
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x0237
            java.lang.String r8 = "CallConfirmationSheet"
            X.0ve r3 = r6.A0T
            r0 = 12111(0x2f4f, float:1.6971E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r10, r3, r0)
            if (r0 == 0) goto L_0x01d4
            X.4cT r1 = r4.A04
            X.C18070vi.A0W(r1)
            com.whatsapp.jid.GroupJid r0 = r4.A0C
            com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet r0 = X.C87384Vj.A00(r0, r1, r2)
        L_0x01cf:
            r5.CMk(r0, r8)
            goto L_0x007c
        L_0x01d4:
            X.0ve r3 = r6.A0T
            r0 = 7175(0x1c07, float:1.0054E-41)
            boolean r0 = X.C18020vd.A05(r10, r3, r0)
            if (r0 == 0) goto L_0x0237
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            X.C17960vV.A07(r0)
            X.1EC r0 = (X.AnonymousClass1EC) r0
            com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet r0 = X.C87384Vj.A01(r0, r2, r9)
            goto L_0x01cf
        L_0x01ee:
            int r10 = r4.A07
            if (r10 == r3) goto L_0x0194
            boolean r10 = r4.A0W()
            X.0ve r3 = r6.A0T
            boolean r3 = X.C40811vJ.A0P(r3)
            if (r3 == 0) goto L_0x0201
            if (r10 != 0) goto L_0x0201
            goto L_0x0194
        L_0x0201:
            X.1VP r13 = r6.A0D
            X.1MZ r11 = r6.A0P
            X.11S r10 = r6.A09
            X.1M9 r3 = r6.A0G
            java.util.List r16 = X.C63982u1.A04(r10, r3, r11, r1)
            android.content.Context r14 = r6.A1n()
            if (r15 == 0) goto L_0x0225
            X.0ve r10 = r6.A0T
            X.1MZ r3 = r6.A0P
            X.1MW r3 = r3.A08
            int r3 = r3.A0A(r15)
            boolean r3 = X.C40811vJ.A0Z(r10, r3)
            r18 = 1
            if (r3 == 0) goto L_0x0227
        L_0x0225:
            r18 = 0
        L_0x0227:
            X.1VQ r13 = (X.AnonymousClass1VQ) r13
            r19 = r8
            r20 = r8
            r17 = r2
            int r3 = r13.BjR(r14, r15, r16, r17, r18, r19, r20)
            if (r3 != 0) goto L_0x0194
            goto L_0x007c
        L_0x0237:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            com.whatsapp.calling.fragment.CallConfirmationFragment.A01(r5, r1, r0, r9)
            goto L_0x007c
        L_0x0240:
            int r0 = r13.A00()
            if (r0 == 0) goto L_0x026a
            if (r0 == r3) goto L_0x0266
            if (r0 == r10) goto L_0x0263
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            int r0 = r13.A00()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r2 = -1
            goto L_0x0049
        L_0x0263:
            r2 = 1
            goto L_0x0049
        L_0x0266:
            r2 = 9
            goto L_0x0049
        L_0x026a:
            r2 = 2
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35421mD.A00(X.2yP, X.Bq2, boolean):void");
    }

    public void A01(Bq2 bq2) {
        CallsHistoryFragment callsHistoryFragment = this.A00;
        if (!callsHistoryFragment.A0u) {
            Log.i("callsHistoryFragmentV2/callItemViewHolderEventListener/onSingleContactPhotoLongClicked Ignoring long click");
        } else {
            CallsHistoryFragment.A08(bq2, callsHistoryFragment);
        }
    }
}
