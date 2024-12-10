package X;

import android.view.View;

/* renamed from: X.78M  reason: invalid class name */
public class AnonymousClass78M implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass78M(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass78M(obj, obj2, i));
    }

    /* JADX WARNING: type inference failed for: r0v41, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0228, code lost:
        if (r1 != 0) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x024f, code lost:
        if (r1 != 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0479, code lost:
        r0 = r2.A01.A0A;
        X.C18070vi.A0X(r0);
        r1.C6a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0483, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0492, code lost:
        r0 = r2.A01.A0A;
        X.C18070vi.A0X(r0);
        r1.C6a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x049c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04f3, code lost:
        r2 = (X.C1404071h) r3.A0i.get();
        r1 = r4 instanceof X.AnonymousClass6KU;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04fd, code lost:
        if (r1 == false) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04ff, code lost:
        X.C1404071h.A01(r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0503, code lost:
        X.C1404071h.A00(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0508, code lost:
        if ((r4 instanceof X.AnonymousClass6KV) == false) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x050a, code lost:
        r3.A0Z.A2E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x050f, code lost:
        r3.A0V(r3.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0514, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0515, code lost:
        if (r1 == false) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0517, code lost:
        r3.A0Z.A2A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05b5, code lost:
        com.whatsapp.voipcalling.VoipActivityV2.A1a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f5, code lost:
        X.AnonymousClass3MX.A1Q(new com.whatsapp.usercontrol.view.UserControlBaseFragment$onActionClicked$1(r3, r4, (X.C30391dr) null), X.AnonymousClass3MZ.A0H(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0102, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r37) {
        /*
            r36 = this;
            r5 = r36
            int r0 = r5.A00
            r6 = r37
            switch(r0) {
                case 0: goto L_0x02b3;
                case 1: goto L_0x02d5;
                case 2: goto L_0x03b6;
                case 3: goto L_0x03c6;
                case 4: goto L_0x0040;
                case 5: goto L_0x0442;
                case 6: goto L_0x0451;
                case 7: goto L_0x045e;
                case 8: goto L_0x046b;
                case 9: goto L_0x0484;
                case 10: goto L_0x0672;
                case 11: goto L_0x049d;
                case 12: goto L_0x04b1;
                case 13: goto L_0x04be;
                case 14: goto L_0x04e7;
                case 15: goto L_0x051d;
                case 16: goto L_0x00de;
                case 17: goto L_0x00e7;
                case 18: goto L_0x0103;
                case 19: goto L_0x052d;
                case 20: goto L_0x012a;
                case 21: goto L_0x0545;
                case 22: goto L_0x0573;
                case 23: goto L_0x01d6;
                case 24: goto L_0x0594;
                case 25: goto L_0x0213;
                case 26: goto L_0x05b9;
                case 27: goto L_0x05c8;
                case 28: goto L_0x062c;
                case 29: goto L_0x0256;
                case 30: goto L_0x0270;
                case 31: goto L_0x028c;
                case 32: goto L_0x0642;
                case 33: goto L_0x066c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r5.A01
            X.8Do r2 = (X.AnonymousClass8Do) r2
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r0 = r2.A0G
            X.AnonymousClass3MW.A1S(r0)
            java.lang.Object r0 = r5.A02
            X.Ajw r0 = (X.C21429Ajw) r0
            java.lang.Object r1 = r0.A01
            org.npci.upi.security.pinactivitycomponent.s r1 = (org.npci.upi.security.pinactivitycomponent.s) r1
            int r0 = r1.A01
            int r0 = r0 + -1
            r1.A01 = r0
            r1.A28(r2)
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.String r1 = "action"
            java.lang.String r0 = "TRIGGER_OTP"
            r3.putString(r1, r0)
            java.lang.String r1 = r2.A0F
            java.lang.String r0 = "AADHAAR"
            boolean r2 = r1.equals(r0)
            android.os.ResultReceiver r1 = X.C188559hc.A0B
            r0 = 2
            if (r2 == 0) goto L_0x003c
            r0 = 4
        L_0x003c:
            r1.send(r0, r3)
        L_0x003f:
            return
        L_0x0040:
            java.lang.Object r4 = r5.A01
            X.6zw r4 = (X.C140096zw) r4
            java.lang.Object r3 = r5.A02
            X.6J0 r3 = (X.AnonymousClass6J0) r3
            java.util.List r0 = X.C42011xT.A0I
            r5 = 1
            java.lang.String r6 = r4.A00
            if (r6 == 0) goto L_0x003f
            X.1DT r0 = r4.A06
            java.lang.Number r0 = X.C108945cZ.A1C(r0)
            if (r0 == 0) goto L_0x003f
            int r2 = r0.intValue()
            if (r2 != 0) goto L_0x007a
            X.6lY r0 = r3.A03
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity r3 = r0.A00
            r3.A0E = r5
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity.A0r(r3, r5)
            java.lang.String r6 = r4.A00
            if (r6 == 0) goto L_0x070a
            java.util.List r0 = r3.A0A
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x067b
            X.73G r0 = X.C108965cb.A0d(r3)
            r0.A07(r6)
            return
        L_0x007a:
            r1 = 3
            if (r2 != r1) goto L_0x0091
            X.1DT r0 = r4.A02
            java.lang.Number r0 = X.C108945cZ.A1C(r0)
            if (r0 == 0) goto L_0x003f
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x003f
            X.6lY r0 = r3.A03
            r0.A00()
            return
        L_0x0091:
            r0 = 2
            if (r2 == r0) goto L_0x0096
            if (r2 != r5) goto L_0x003f
        L_0x0096:
            X.6lY r0 = r3.A03
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity r5 = r0.A00
            java.util.List r0 = r5.A0K
            java.util.Iterator r2 = r0.iterator()
        L_0x00a0:
            boolean r0 = r2.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r1 = r2.next()
            boolean r0 = X.C140096zw.A00(r1, r6)
            if (r0 == 0) goto L_0x00a0
        L_0x00b1:
            X.6zw r1 = (X.C140096zw) r1
            r0 = 0
            X.751 r3 = new X.751
            r3.<init>(r5, r1, r6, r0)
            r0 = 2131896881(0x7f122a31, float:1.9428636E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x00da
            X.1DT r0 = r1.A06
            java.lang.Number r0 = X.C108945cZ.A1C(r0)
            if (r0 == 0) goto L_0x00da
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x00da
        L_0x00d1:
            com.whatsapp.thunderstorm.ThunderstormCancelTransferDialog r0 = new com.whatsapp.thunderstorm.ThunderstormCancelTransferDialog
            r0.<init>(r3, r2)
            r5.CMk(r0, r4)
            return
        L_0x00da:
            r2 = r4
            goto L_0x00d1
        L_0x00dc:
            r1 = r4
            goto L_0x00b1
        L_0x00de:
            java.lang.Object r4 = r5.A01
            com.whatsapp.usercontrol.view.UserControlBaseFragment r4 = (com.whatsapp.usercontrol.view.UserControlBaseFragment) r4
            java.lang.Object r3 = r5.A02
            X.6Rg r3 = (X.C122666Rg) r3
            goto L_0x00f3
        L_0x00e7:
            java.lang.Object r4 = r5.A01
            com.whatsapp.usercontrol.view.UserControlBaseFragment r4 = (com.whatsapp.usercontrol.view.UserControlBaseFragment) r4
            java.lang.Object r3 = r5.A02
            X.6Rg r3 = (X.C122666Rg) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
        L_0x00f3:
            if (r4 == 0) goto L_0x003f
            X.1pm r2 = X.AnonymousClass3MZ.A0H(r4)
            r1 = 0
            com.whatsapp.usercontrol.view.UserControlBaseFragment$onActionClicked$1 r0 = new com.whatsapp.usercontrol.view.UserControlBaseFragment$onActionClicked$1
            r0.<init>(r3, r4, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x0103:
            java.lang.Object r3 = r5.A01
            X.BwF r3 = (X.C24149BwF) r3
            java.lang.Object r2 = r5.A02
            X.70X r2 = (X.AnonymousClass70X) r2
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x011c
            r1 = 0
            r3.A0P = r1
            r0 = 1
            r3.A0Q = r0
            X.C24149BwF.A05(r3)
            r2.A0M(r1)
            return
        L_0x011c:
            boolean r0 = r3.A0J
            if (r0 != 0) goto L_0x003f
            boolean r0 = r2.A0a()
            if (r0 == 0) goto L_0x0710
            r3.A08()
            return
        L_0x012a:
            java.lang.Object r6 = r5.A01
            com.whatsapp.voipcalling.VoipActivityV2 r6 = (com.whatsapp.voipcalling.VoipActivityV2) r6
            java.lang.Object r3 = r5.A02
            com.whatsapp.voipcalling.CallInfo r3 = (com.whatsapp.voipcalling.CallInfo) r3
            android.view.ViewGroup r1 = r6.A0F
            X.C17960vV.A05(r1)
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            r0 = 8
            r1.setVisibility(r0)
            X.00H r0 = r6.A1x
            X.C72453Mb.A1P(r0)
            X.00H r0 = r6.A1w
            java.lang.Object r1 = r0.get()
            X.6wn r1 = (X.C138266wn) r1
            java.lang.Integer r0 = X.C17880vN.A0k()
            r1.A02 = r0
            X.C138266wn.A00(r1)
            java.lang.String r0 = "VoipActivityV2 vm call back onclick"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Map r0 = r3.participants
            java.util.Iterator r2 = X.C17890vO.A0l(r0)
        L_0x0169:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x017f
            java.lang.Object r1 = r2.next()
            X.6qE r1 = (X.C134216qE) r1
            boolean r0 = r1.A0M
            if (r0 != 0) goto L_0x0169
            com.whatsapp.jid.UserJid r0 = r1.A0A
            r4.add(r0)
            goto L_0x0169
        L_0x017f:
            java.util.Iterator r2 = r4.iterator()
        L_0x0183:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0199
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1M9 r0 = r6.A12
            X.1E7 r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x0183
            r8.add(r0)
            goto L_0x0183
        L_0x0199:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x003f
            android.os.Handler r1 = r6.A05
            r0 = 9
            r1.removeMessages(r0)
            X.1VP r5 = r6.A0l
            boolean r10 = r3.videoEnabled
            com.whatsapp.jid.GroupJid r7 = r3.groupJid
            r9 = 30
            int r0 = r5.CNy(r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x01d0
            com.whatsapp.jid.GroupJid r2 = r3.groupJid
            if (r2 != 0) goto L_0x01bc
            com.whatsapp.jid.UserJid r2 = r3.getPeerJid()
        L_0x01bc:
            X.C17960vV.A07(r2)
            X.1BI r2 = (X.AnonymousClass1BI) r2
            boolean r1 = r3.videoEnabled
            r0 = 27
            com.whatsapp.voipcalling.VoipActivityV2.A1D(r2, r6, r0, r1)
        L_0x01c8:
            X.8At r0 = r6.A0n
            if (r0 == 0) goto L_0x003f
            r0.CFn()
            return
        L_0x01d0:
            X.AfC r0 = r6.A0z
            r0.A06()
            goto L_0x01c8
        L_0x01d6:
            java.lang.Object r4 = r5.A01
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            java.lang.Object r3 = r5.A02
            com.whatsapp.calling.views.VoipCallFooter r3 = (com.whatsapp.calling.views.VoipCallFooter) r3
            boolean r0 = r6.isEnabled()
            if (r0 == 0) goto L_0x003f
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r4)
            if (r2 == 0) goto L_0x003f
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x003f
            boolean r0 = com.whatsapp.voipcalling.VoipActivityV2.A1x(r2, r4)
            if (r0 != 0) goto L_0x020f
            X.A99 r0 = r4.A0u
            if (r0 == 0) goto L_0x020f
            android.widget.ImageButton r0 = r3.A0I
            boolean r0 = r0.isSelected()
            r1 = 9
            if (r0 == 0) goto L_0x0206
            r1 = 10
        L_0x0206:
            r0 = 4
            com.whatsapp.voipcalling.VoipActivityV2.A1h(r4, r1, r0)
            X.A99 r0 = r4.A0u
            r0.A0e()
        L_0x020f:
            com.whatsapp.voipcalling.VoipActivityV2.A1a(r4)
            return
        L_0x0213:
            java.lang.Object r6 = r5.A01
            com.whatsapp.voipcalling.VoipActivityV2 r6 = (com.whatsapp.voipcalling.VoipActivityV2) r6
            java.lang.Object r4 = r5.A02
            com.whatsapp.calling.views.VoipCallFooter r4 = (com.whatsapp.calling.views.VoipCallFooter) r4
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r3 = r6.A1b
            if (r3 == 0) goto L_0x003f
            X.1bI r0 = r3.A0Z
            if (r0 == 0) goto L_0x022a
            int r1 = r0.A01()
            r0 = 1
            if (r1 == 0) goto L_0x022b
        L_0x022a:
            r0 = 0
        L_0x022b:
            r2 = r0 ^ 1
            X.1bI r1 = r3.A0Z
            if (r1 == 0) goto L_0x0244
            int r0 = X.C72453Mb.A07(r2)
            r1.A04(r0)
            X.73c r0 = r3.A0K
            if (r0 == 0) goto L_0x0244
            r0.A07 = r2
            r0.A04()
            r0.A05()
        L_0x0244:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r6.A1b
            X.1bI r0 = r0.A0Z
            if (r0 == 0) goto L_0x0251
            int r1 = r0.A01()
            r0 = 1
            if (r1 == 0) goto L_0x0252
        L_0x0251:
            r0 = 0
        L_0x0252:
            r4.setDialpadBtnSelected(r0)
            return
        L_0x0256:
            java.lang.Object r1 = r5.A01
            X.86X r1 = (X.AnonymousClass86X) r1
            java.lang.Object r0 = r5.A02
            android.app.Activity r0 = (android.app.Activity) r0
            if (r1 == 0) goto L_0x003f
            X.89U r0 = (X.AnonymousClass89U) r0
            X.CXY r2 = r0.Bbg()
            X.E8A r1 = r1.BM3()
            X.9zJ r0 = X.C199029zJ.A01
            X.C26209Cul.A05(r0, r1, r2)
            return
        L_0x0270:
            java.lang.Object r0 = r5.A01
            X.6pR r0 = (X.C133756pR) r0
            java.lang.Object r3 = r5.A02
            X.DOZ r3 = (X.DOZ) r3
            X.E8A r2 = r0.A00
            if (r2 == 0) goto L_0x003f
            X.DNk r0 = X.C26272CwJ.A01(r3)
            X.DFL r1 = r0.A06
            if (r1 == 0) goto L_0x003f
            X.9zJ r0 = X.C108985cd.A0K(r3)
            X.C26209Cul.A01(r3, r1, r0, r2)
            return
        L_0x028c:
            java.lang.Object r4 = r5.A01
            X.5qG r4 = (X.C114165qG) r4
            java.lang.Object r3 = r5.A02
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            if (r37 == 0) goto L_0x02a6
            X.8As r2 = r4.A03
            android.content.Context r1 = r6.getContext()
            r0 = 2131898511(0x7f12308f, float:1.9431942E38)
            java.lang.String r0 = X.C18070vi.A0F(r1, r0)
            r2.CRT(r0)
        L_0x02a6:
            X.8As r1 = r4.A03
            java.lang.String r0 = ""
            r1.CRU(r0)
            if (r3 == 0) goto L_0x003f
            r3.reload()
            return
        L_0x02b3:
            java.lang.Object r0 = r5.A01
            X.1xT r0 = (X.C42011xT) r0
            java.lang.Object r3 = r5.A02
            X.1DS r3 = (X.AnonymousClass1DS) r3
            android.content.Context r0 = X.C108945cZ.A0D(r0)
            android.content.Intent r2 = X.C72463Mc.A0G(r0)
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.ml.v2.storageusage.MLModelStorageUsageActivity"
            r2.setClassName(r1, r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r2.addFlags(r0)
            r3.A0F(r2)
            return
        L_0x02d5:
            java.lang.Object r12 = r5.A01
            com.whatsapp.support.DescribeProblemActivity r12 = (com.whatsapp.support.DescribeProblemActivity) r12
            java.lang.Object r4 = r5.A02
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r3 = com.whatsapp.support.DescribeProblemActivity.A03(r12)
            byte[] r0 = r3.getBytes()
            int r2 = r0.length
            java.lang.String r0 = r12.A0N
            boolean r1 = X.C197289wS.A00(r0)
            boolean r0 = r12.A0P
            r11 = 0
            if (r0 != 0) goto L_0x030e
            boolean r0 = com.whatsapp.support.DescribeProblemActivity.A0u(r3, r1)
            if (r0 == 0) goto L_0x030e
            android.widget.EditText r1 = r12.A02
            r0 = 2131231320(0x7f080258, float:1.8078718E38)
            X.AnonymousClass3MY.A0v(r12, r1, r0)
            r0 = 2131889361(0x7f120cd1, float:1.9413383E38)
            if (r2 != 0) goto L_0x0307
            r0 = 2131889360(0x7f120cd0, float:1.9413381E38)
        L_0x0307:
            r4.setText(r0)
            r4.setVisibility(r11)
            return
        L_0x030e:
            android.widget.EditText r1 = r12.A02
            r0 = 2131231322(0x7f08025a, float:1.8078722E38)
            X.AnonymousClass3MY.A0v(r12, r1, r0)
            r0 = 8
            r4.setVisibility(r0)
            int r1 = r12.A00
            r0 = 2
            if (r1 == r0) goto L_0x03b2
            r0 = 3
            if (r1 == r0) goto L_0x03b2
            java.lang.String r1 = "voip-dev@whatsapp.com"
            java.lang.String r0 = r12.A0M
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x03b2
            java.lang.String r0 = r12.A0N
            boolean r0 = X.C197289wS.A00(r0)
            if (r0 != 0) goto L_0x03b2
            X.10I r10 = r12.A05
            X.6MO r0 = r12.A0B
            if (r0 == 0) goto L_0x0347
            int r1 = r0.A09()
            r0 = 1
            if (r1 != r0) goto L_0x0347
            X.6MO r0 = r12.A0B
            r0.A0B(r11)
        L_0x0347:
            X.181 r0 = r12.A05
            r18 = r0
            X.1K3 r0 = r12.A0J
            r17 = r0
            X.00H r0 = r12.A0C
            java.lang.Object r9 = r0.get()
            X.11Z r9 = (X.AnonymousClass11Z) r9
            X.129 r15 = r12.A0H
            X.0vb r14 = r12.A00
            X.1mQ r13 = r12.A0I
            X.1NM r8 = r12.A06
            X.1MB r7 = r12.A09
            X.0z4 r6 = r12.A0A
            X.6oJ r5 = r12.A0G
            java.lang.String r4 = r12.A0N
            java.lang.String r3 = r12.A0O
            X.6Ug r0 = r12.A0F
            if (r0 == 0) goto L_0x03af
            java.util.ArrayList r34 = r0.A00()
        L_0x0371:
            java.lang.String r33 = com.whatsapp.support.DescribeProblemActivity.A03(r12)
            android.net.Uri[] r2 = r12.A0R
            X.00H r0 = r12.A0L
            java.lang.Object r1 = r0.get()
            X.1mP r1 = (X.C35541mP) r1
            r22 = 0
            X.6MO r0 = new X.6MO
            r16 = r12
            r26 = r22
            r29 = r13
            r30 = r17
            r31 = r4
            r32 = r3
            r35 = r2
            r23 = r7
            r24 = r1
            r25 = r12
            r27 = r5
            r28 = r15
            r19 = r6
            r20 = r14
            r21 = r9
            r17 = r18
            r18 = r8
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r12.A0B = r0
            X.AnonymousClass3MW.A1T(r0, r10, r11)
            return
        L_0x03af:
            r34 = 0
            goto L_0x0371
        L_0x03b2:
            com.whatsapp.support.DescribeProblemActivity.A0q(r12)
            return
        L_0x03b6:
            java.lang.Object r2 = r5.A01
            com.whatsapp.support.faq.SearchFAQActivity r2 = (com.whatsapp.support.faq.SearchFAQActivity) r2
            java.lang.Object r1 = r5.A02
            X.6hb r1 = (X.C129316hb) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.support.faq.SearchFAQActivity.A10(r1, r2)
            return
        L_0x03c6:
            java.lang.Object r3 = r5.A01
            X.6d3 r3 = (X.C126636d3) r3
            java.lang.Object r2 = r5.A02
            X.5mz r2 = (X.C113375mz) r2
            java.util.List r0 = X.C42011xT.A0I
            r1 = 1
            X.C18070vi.A0d(r2, r1)
            com.whatsapp.TextEmojiLabel r0 = r2.A00
            java.lang.String r5 = X.AnonymousClass3Ma.A13(r0)
            java.lang.String r4 = r2.A03
            com.whatsapp.textstatus.AddTextStatusActivity r3 = r3.A00
            r3.A0E = r1
            java.lang.String r2 = "textEntry"
            if (r5 == 0) goto L_0x0429
            com.whatsapp.WaEditText r1 = r3.A01
            if (r1 == 0) goto L_0x0431
            X.3NY r0 = new X.3NY
            r0.<init>(r5)
            r1.setText(r0)
            com.whatsapp.WaEditText r1 = r3.A01
            if (r1 == 0) goto L_0x0431
            int r0 = r5.length()
            r1.setSelection(r0)
        L_0x03fb:
            if (r4 == 0) goto L_0x0414
            X.10I r2 = r3.A05
            r1 = 22
            X.7RS r0 = new X.7RS
            r0.<init>(r1, r4, r3)
            r2.CGN(r0)
        L_0x0409:
            X.5kn r1 = r3.A08
            java.lang.String r0 = "adapter"
            if (r1 != 0) goto L_0x0435
            X.C18070vi.A11(r0)
        L_0x0412:
            r0 = 0
            throw r0
        L_0x0414:
            android.content.Context r2 = r3.getApplicationContext()
            r1 = 2131232116(0x7f080574, float:1.8080332E38)
            r0 = 2131101210(0x7f06061a, float:1.7814823E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            X.C18070vi.A0X(r0)
            com.whatsapp.textstatus.AddTextStatusActivity.A03(r0, r3)
            goto L_0x0409
        L_0x0429:
            com.whatsapp.WaEditText r0 = r3.A01
            if (r0 == 0) goto L_0x0431
            X.AnonymousClass3MW.A1S(r0)
            goto L_0x03fb
        L_0x0431:
            X.C18070vi.A11(r2)
            goto L_0x0412
        L_0x0435:
            r1.A01 = r5
            r3.A0D = r4
            r1.A00 = r4
            r1.notifyDataSetChanged()
            com.whatsapp.textstatus.AddTextStatusActivity.A0Q(r3)
            return
        L_0x0442:
            java.lang.Object r1 = r5.A01
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r1 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r1
            java.lang.Object r0 = r5.A02
            X.C108965cb.A1N(r0)
            X.1eh r1 = r1.A0B
            r0 = 0
            r1.A01 = r0
            return
        L_0x0451:
            java.lang.Object r1 = r5.A01
            X.6Jo r1 = (X.C121416Jo) r1
            java.lang.Object r2 = r5.A02
            X.6JB r2 = (X.AnonymousClass6JB) r2
            java.util.List r0 = X.C42011xT.A0I
            X.8AW r1 = r1.A07
            goto L_0x0479
        L_0x045e:
            java.lang.Object r1 = r5.A01
            X.6Jn r1 = (X.C121406Jn) r1
            java.lang.Object r2 = r5.A02
            X.6JB r2 = (X.AnonymousClass6JB) r2
            java.util.List r0 = X.C42011xT.A0I
            X.1kf r1 = r1.A06
            goto L_0x0492
        L_0x046b:
            java.lang.Object r1 = r5.A01
            X.6Jr r1 = (X.C121446Jr) r1
            java.lang.Object r2 = r5.A02
            X.6J8 r2 = (X.AnonymousClass6J8) r2
            java.util.List r0 = X.C42011xT.A0I
            X.8AW r1 = r1.A0C
            X.6JB r2 = (X.AnonymousClass6JB) r2
        L_0x0479:
            X.2sx r0 = r2.A01
            com.whatsapp.jid.UserJid r0 = r0.A0A
            X.C18070vi.A0X(r0)
            r1.C6a(r0)
            return
        L_0x0484:
            java.lang.Object r1 = r5.A01
            X.6Js r1 = (X.C121456Js) r1
            java.lang.Object r2 = r5.A02
            X.6J8 r2 = (X.AnonymousClass6J8) r2
            java.util.List r0 = X.C42011xT.A0I
            X.1kg r1 = r1.A0E
            X.6JB r2 = (X.AnonymousClass6JB) r2
        L_0x0492:
            X.2sx r0 = r2.A01
            com.whatsapp.jid.UserJid r0 = r0.A0A
            X.C18070vi.A0X(r0)
            r1.C6a(r0)
            return
        L_0x049d:
            java.lang.Object r2 = r5.A01
            X.6KJ r2 = (X.AnonymousClass6KJ) r2
            java.lang.Object r1 = r5.A02
            X.6Jh r1 = (X.C121346Jh) r1
            java.util.List r0 = X.C42011xT.A0I
            X.5lM r0 = r2.A0F
            X.2Dk r1 = r1.A0A
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A0Z
            r0.Bz7(r1)
            return
        L_0x04b1:
            java.lang.Object r1 = r5.A01
            X.6KD r1 = (X.AnonymousClass6KD) r1
            java.lang.Object r4 = r5.A02
            X.6U1 r4 = (X.AnonymousClass6U1) r4
            java.util.List r0 = X.C42011xT.A0I
            X.5lM r3 = r1.A03
            goto L_0x04f3
        L_0x04be:
            java.lang.Object r1 = r5.A01
            X.6KD r1 = (X.AnonymousClass6KD) r1
            java.lang.Object r3 = r5.A02
            X.6U1 r3 = (X.AnonymousClass6U1) r3
            java.util.List r0 = X.C42011xT.A0I
            X.5lM r2 = r1.A03
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.00H r0 = r2.A0i
            java.lang.Object r1 = r0.get()
            X.71h r1 = (X.C1404071h) r1
            boolean r0 = r3 instanceof X.AnonymousClass6KU
            if (r0 == 0) goto L_0x04de
            r0 = 3
            X.C1404071h.A01(r1, r0)
        L_0x04de:
            X.C1404071h.A00(r3, r1)
            X.6u6 r0 = r2.A03
            r2.A0V(r0)
            return
        L_0x04e7:
            java.lang.Object r1 = r5.A01
            X.6K4 r1 = (X.AnonymousClass6K4) r1
            java.lang.Object r4 = r5.A02
            X.6U1 r4 = (X.AnonymousClass6U1) r4
            java.util.List r0 = X.C42011xT.A0I
            X.5lM r3 = r1.A00
        L_0x04f3:
            X.00H r0 = r3.A0i
            java.lang.Object r2 = r0.get()
            X.71h r2 = (X.C1404071h) r2
            boolean r1 = r4 instanceof X.AnonymousClass6KU
            if (r1 == 0) goto L_0x0503
            r0 = 2
            X.C1404071h.A01(r2, r0)
        L_0x0503:
            X.C1404071h.A00(r4, r2)
            boolean r0 = r4 instanceof X.AnonymousClass6KV
            if (r0 == 0) goto L_0x0515
            com.whatsapp.updates.ui.UpdatesFragment r0 = r3.A0Z
            r0.A2E()
        L_0x050f:
            X.6u6 r0 = r3.A03
            r3.A0V(r0)
            return
        L_0x0515:
            if (r1 == 0) goto L_0x050f
            com.whatsapp.updates.ui.UpdatesFragment r0 = r3.A0Z
            r0.A2A()
            goto L_0x050f
        L_0x051d:
            java.lang.Object r2 = r5.A01
            X.6KC r2 = (X.AnonymousClass6KC) r2
            java.lang.Object r1 = r5.A02
            X.6U0 r1 = (X.AnonymousClass6U0) r1
            java.util.List r0 = X.C42011xT.A0I
            com.whatsapp.updates.ui.UpdatesFragment r0 = r2.A02
            r0.A2G(r1)
            return
        L_0x052d:
            java.lang.Object r0 = r5.A01
            X.5ks r0 = (X.C112065ks) r0
            java.lang.Object r4 = r5.A02
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r3 = r0.A02
            X.00H r0 = r3.A0O
            X.C72453Mb.A1P(r0)
            X.1VP r2 = r3.A02
            r1 = 15
            r0 = 1
            r2.CNw(r3, r4, r1, r0)
            return
        L_0x0545:
            java.lang.Object r3 = r5.A01
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.Object r2 = r5.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            X.1L9 r1 = r3.A01
            X.1LU r0 = new X.1LU
            r0.<init>()
            android.content.Intent r0 = X.AnonymousClass3MY.A06(r3, r0, r2)
            r1.A09(r3, r0)
            X.00H r0 = r3.A1w
            java.lang.Object r1 = r0.get()
            X.6wn r1 = (X.C138266wn) r1
            java.lang.Integer r0 = X.C17880vN.A0j()
            r1.A02 = r0
            X.C138266wn.A00(r1)
            r0 = 1
            r3.A2G = r0
            r3.finish()
            return
        L_0x0573:
            java.lang.Object r2 = r5.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r1 = r5.A02
            com.whatsapp.calling.views.VoipCallFooter r1 = (com.whatsapp.calling.views.VoipCallFooter) r1
            X.A99 r0 = r2.A0u
            if (r0 == 0) goto L_0x05b5
            android.widget.ImageButton r0 = r1.A0H
            boolean r0 = r0.isSelected()
            int r1 = X.C72453Mb.A03(r0)
            r0 = 4
            com.whatsapp.voipcalling.VoipActivityV2.A1h(r2, r1, r0)
            X.A99 r1 = r2.A0u
            r0 = 0
            r1.A0z(r0)
            goto L_0x05b5
        L_0x0594:
            java.lang.Object r2 = r5.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Object r1 = r5.A02
            com.whatsapp.calling.views.VoipCallFooter r1 = (com.whatsapp.calling.views.VoipCallFooter) r1
            X.A99 r0 = r2.A0u
            if (r0 == 0) goto L_0x05b5
            android.widget.ImageButton r0 = r1.A0G
            boolean r0 = r0.isSelected()
            r1 = 11
            if (r0 == 0) goto L_0x05ac
            r1 = 12
        L_0x05ac:
            r0 = 4
            com.whatsapp.voipcalling.VoipActivityV2.A1h(r2, r1, r0)
            X.A99 r0 = r2.A0u
            r0.A0c()
        L_0x05b5:
            com.whatsapp.voipcalling.VoipActivityV2.A1a(r2)
            return
        L_0x05b9:
            java.lang.Object r1 = r5.A01
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.Object r0 = r5.A02
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r6)
            com.whatsapp.voipcalling.VoipActivityV2.A1R(r1)
            return
        L_0x05c8:
            java.lang.Object r4 = r5.A01
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            java.lang.Object r3 = r5.A02
            com.whatsapp.voipcalling.CallInfo r3 = (com.whatsapp.voipcalling.CallInfo) r3
            r1 = 33
            r0 = 5
            com.whatsapp.voipcalling.VoipActivityV2.A1h(r4, r1, r0)
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r4)
            X.1PM r0 = r4.A14
            boolean r1 = X.C63982u1.A0A(r0, r2)
            boolean r0 = com.whatsapp.voipcalling.VoipActivityV2.A24(r4)
            if (r0 == 0) goto L_0x05f9
            X.0ve r0 = r4.A0E
            boolean r0 = X.C40811vJ.A0Q(r0)
            if (r0 == 0) goto L_0x05f9
            com.whatsapp.voipcalling.WASecuredDialogFragment r1 = new com.whatsapp.voipcalling.WASecuredDialogFragment
            r1.<init>()
            java.lang.String r0 = "WASecuredDialogFragment"
            r4.A4h(r1, r0)
            return
        L_0x05f9:
            if (r1 == 0) goto L_0x060a
            X.0ve r0 = r4.A0E
            boolean r0 = X.C40811vJ.A0Q(r0)
            if (r0 == 0) goto L_0x060a
            X.10I r1 = r4.A05
            r0 = 5
            X.AnonymousClass7RN.A02(r1, r4, r2, r0)
            return
        L_0x060a:
            if (r3 == 0) goto L_0x0629
            boolean r0 = r3.videoEnabled
            if (r0 == 0) goto L_0x0629
            r3 = 11
        L_0x0612:
            com.whatsapp.calling.dialogs.E2EEInfoDialogFragment r2 = new com.whatsapp.calling.dialogs.E2EEInfoDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "entry_point"
            r1.putInt(r0, r3)
            r2.A1R(r1)
            java.lang.String r0 = "E2EEInfoDialogFragment"
            r4.A4h(r2, r0)
            return
        L_0x0629:
            r3 = 10
            goto L_0x0612
        L_0x062c:
            java.lang.Object r0 = r5.A01
            X.1gi r0 = (X.C32141gi) r0
            java.lang.Object r2 = r5.A02
            android.content.Context r2 = (android.content.Context) r2
            X.118 r0 = r0.A00
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "maiba-learn-more"
            android.content.Intent r0 = X.AnonymousClass1LU.A1L(r1, r0)
            r2.startActivity(r0)
            return
        L_0x0642:
            java.lang.Object r2 = r5.A01
            com.whatsapp.webview.ui.views.WebViewNavigationBarView r2 = (com.whatsapp.webview.ui.views.WebViewNavigationBarView) r2
            java.lang.Object r1 = r5.A02
            android.content.Context r1 = (android.content.Context) r1
            r2.getWebViewIntentUtils()
            X.6oO r0 = r2.getWebViewViewModel()
            X.5ey r0 = r0.A00
            if (r0 == 0) goto L_0x065b
            java.lang.String r0 = r0.getUrl()
            if (r0 != 0) goto L_0x065d
        L_0x065b:
            java.lang.String r0 = ""
        L_0x065d:
            X.C138376wy.A00(r1, r0)
            X.6oO r0 = r2.getWebViewViewModel()
            r1 = 23
            X.1DT r0 = r0.A0B
            X.AnonymousClass3MX.A1J(r0, r1)
            return
        L_0x066c:
            java.lang.Object r0 = r5.A01
            X.C108965cb.A1N(r0)
            return
        L_0x0672:
            java.util.List r0 = X.C42011xT.A0I
            java.lang.String r0 = "getItemType"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x067b:
            r3.A09 = r6
            java.util.List r0 = r3.A0K
            java.util.Iterator r4 = r0.iterator()
        L_0x0683:
            boolean r0 = r4.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x0708
            java.lang.Object r1 = r4.next()
            boolean r0 = X.C140096zw.A00(r1, r6)
            if (r0 == 0) goto L_0x0683
        L_0x0694:
            X.6zw r1 = (X.C140096zw) r1
            if (r1 == 0) goto L_0x069a
            X.1DT r2 = r1.A04
        L_0x069a:
            X.0vl r0 = r3.A0M
            r0.getValue()
            r1 = 2131896897(0x7f122a41, float:1.9428668E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r7 = X.C108975cc.A0b(r3, r2, r0, r1)
            r6 = 49
            r4 = -1
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "android.intent.action.PICK"
            r2.setAction(r0)
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            r2.setData(r0)
            java.lang.String r0 = "origin"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "title"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "skip_max_items_new_limit"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "send"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "should_hide_caption_view"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "disable_shared_activity_transition_animation"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "is_in_multi_select_mode_only"
            r2.putExtra(r0, r5)
            java.lang.String r1 = "preview"
            r0 = 0
            r2.putExtra(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r4)
            java.lang.String r1 = "include_media"
            r0 = 7
            r2.putExtra(r1, r0)
            r0 = 22
            r3.startActivityForResult(r2, r0)
            X.1KB r2 = r3.A05
            r1 = 15
            X.Ajq r0 = new X.Ajq
            r0.<init>(r1)
            r2.A0J(r0)
            return
        L_0x0708:
            r1 = r2
            goto L_0x0694
        L_0x070a:
            java.lang.String r0 = "thunderstorm_logs: ThunderstormConnectionsInfoActivity/ endpointId cannot be null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0710:
            r3.A0G()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78M.onClick(android.view.View):void");
    }
}
