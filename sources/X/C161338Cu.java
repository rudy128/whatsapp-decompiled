package X;

import android.telephony.PhoneStateListener;

/* renamed from: X.8Cu  reason: invalid class name and case insensitive filesystem */
public class C161338Cu extends PhoneStateListener {
    public boolean A00 = false;
    public final /* synthetic */ A99 A01;

    public C161338Cu(A99 a99) {
        this.A01 = a99;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r8 != 2) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r1.isSpeakerphoneOn() == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCallStateChanged(int r8, java.lang.String r9) {
        /*
            r7 = this;
            X.A99 r2 = r7.A01
            X.11C r0 = r2.A2b
            android.media.AudioManager r1 = r0.A0D()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/phoneStateListener/onCallStateChanged state: "
            r3.append(r0)
            java.lang.String r0 = X.C40811vJ.A08(r8)
            r3.append(r0)
            java.lang.String r0 = " using speaker: "
            r3.append(r0)
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0028
            boolean r1 = r1.isSpeakerphoneOn()
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            X.C17900vP.A0r(r3, r0)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            boolean r0 = r2.A1G(r0)
            if (r0 == 0) goto L_0x0045
            android.telephony.TelephonyManager r1 = r2.A1s
            if (r1 == 0) goto L_0x0045
            java.lang.String r0 = "PhoneStateListener is only used when Telecom Framework is not enabled"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            android.telephony.PhoneStateListener r0 = r2.A0N
            r1.listen(r0, r6)
        L_0x0044:
            return
        L_0x0045:
            int r4 = r2.A03
            r2.A03 = r8
            X.1HQ r1 = r2.A29
            com.whatsapp.voipcalling.CallInfo r3 = r1.BO3()
            if (r8 != r5) goto L_0x005d
            if (r3 == 0) goto L_0x0060
            boolean r0 = r3.isBotCall
            if (r0 == 0) goto L_0x0060
            r1.BjM()
            r7.A00 = r6
            return
        L_0x005d:
            r0 = 2
            if (r8 == r0) goto L_0x0066
        L_0x0060:
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x007f
            if (r8 != r5) goto L_0x007f
        L_0x0066:
            boolean r0 = r7.A00
            if (r5 != r0) goto L_0x0081
            if (r3 == 0) goto L_0x0044
            if (r8 == 0) goto L_0x009a
            X.Adx r2 = r2.A0R
            X.C17960vV.A07(r2)
            X.10s r1 = r2.A0L
            r0 = 6
            X.C21431Ajy.A00(r1, r2, r3, r0)
            r0 = 40
            X.C21446AkD.A00(r1, r2, r0)
            return
        L_0x007f:
            r5 = 0
            goto L_0x0066
        L_0x0081:
            r7.A00 = r5
            android.os.Handler r0 = r2.A0H
            r1 = 6
            android.os.Message r3 = r0.obtainMessage(r1, r8, r5)
            android.os.Handler r0 = r2.A0H
            r0.removeMessages(r1)
            android.os.Handler r2 = r2.A0H
            if (r5 == 0) goto L_0x0097
            r2.sendMessage(r3)
            return
        L_0x0097:
            r0 = 1000(0x3e8, double:4.94E-321)
            goto L_0x00ad
        L_0x009a:
            if (r4 == 0) goto L_0x0044
            android.os.Handler r0 = r2.A0H
            r1 = 38
            android.os.Message r3 = r0.obtainMessage(r1)
            android.os.Handler r0 = r2.A0H
            r0.removeMessages(r1)
            android.os.Handler r2 = r2.A0H
            r0 = 2000(0x7d0, double:9.88E-321)
        L_0x00ad:
            r2.sendMessageDelayed(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161338Cu.onCallStateChanged(int, java.lang.String):void");
    }
}
