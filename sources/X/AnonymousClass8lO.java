package X;

import android.os.Handler;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.8lO  reason: invalid class name */
public class AnonymousClass8lO extends AnonymousClass1VR {
    public final A99 A00;
    public final C18030ve A01;

    public AnonymousClass8lO(A99 a99, C18030ve r2) {
        this.A00 = a99;
        this.A01 = r2;
    }

    public void A02(String str) {
        C17960vV.A02();
        C17900vP.A0f("voip/service/selfManagedConnectionListener/onCreateIncomingConnection ", str, AnonymousClass000.A10());
        A99 a99 = this.A00;
        CallInfo A0r = AnonymousClass8BR.A0r(a99);
        if (A0r == null || (!str.equals(A0r.callId) && !AnonymousClass8BU.A1U(A0r, str))) {
            AnonymousClass1VM.A00(a99.A2K).A0J(str);
            return;
        }
        a99.A0H.removeMessages(1);
        Handler handler = a99.A0H;
        handler.sendMessageDelayed(handler.obtainMessage(28, str), 500);
    }

    public void A03(String str) {
        C17960vV.A02();
        C17900vP.A0f("voip/service/selfManagedConnectionListener/onCreateIncomingConnectionFailed ", str, AnonymousClass000.A10());
        if (AnonymousClass8BT.A1Y(str)) {
            A99 a99 = this.A00;
            a99.A0H.removeMessages(1);
            a99.A0m(0, 4, str, "busy");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (X.AnonymousClass8BU.A1U(r5, r13) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.lang.String r19) {
        /*
            r18 = this;
            X.C17960vV.A02()
            r0 = r18
            X.A99 r10 = r0.A00
            android.os.Handler r0 = r10.A0H
            r6 = 28
            r0.removeMessages(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/service/selfManagedConnectionListener/onShowIncomingCallUi "
            r13 = r19
            X.C17900vP.A0f(r0, r13, r1)
            com.whatsapp.voipcalling.CallInfo r5 = X.AnonymousClass8BR.A0r(r10)
            r14 = 0
            r4 = 1
            if (r5 == 0) goto L_0x0028
            boolean r0 = X.AnonymousClass8BU.A1U(r5, r13)
            r9 = 1
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r9 = 0
        L_0x0029:
            boolean r0 = X.C40811vJ.A0e(r5)
            if (r0 == 0) goto L_0x0076
            boolean r0 = r5.callEnding
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = r5.callId
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x003d
            if (r9 == 0) goto L_0x0076
        L_0x003d:
            long r2 = r10.A0A
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = X.C108945cZ.A1B(r0, r2)
            r10.A11 = r0
        L_0x004f:
            if (r9 != 0) goto L_0x0062
            com.whatsapp.jid.UserJid r12 = X.C108955ca.A0T(r5)
            boolean r15 = r5.videoEnabled
            boolean r0 = r5.isGroupCall
            com.whatsapp.jid.GroupJid r11 = r5.groupJid
            r17 = r14
            r16 = r0
            r10.A0u(r11, r12, r13, r14, r15, r16, r17)
        L_0x0062:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L_0x0074
            if (r9 == 0) goto L_0x006d
            boolean r0 = r10.A1Y
            if (r0 != 0) goto L_0x006d
            r14 = 1
        L_0x006d:
            r13 = 0
            r11 = r5
            r12 = r4
            r15 = r13
            X.A99.A0E(r10, r11, r12, r13, r14, r15)
        L_0x0074:
            r10.A1O = r4
        L_0x0076:
            return
        L_0x0077:
            java.lang.String r0 = "selfManagedConnectionNewCallTs is not set"
            X.C17960vV.A0F(r14, r0)
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8lO.A04(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (X.AnonymousClass8BU.A1U(r4, r8) == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.String r8, java.lang.Integer r9) {
        /*
            r7 = this;
            X.C17960vV.A02()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/service/selfManagedConnectionListener/onConnectionStateChanged "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", state "
            r1.append(r0)
            int r6 = r9.intValue()
            switch(r6) {
                case 0: goto L_0x00d3;
                case 1: goto L_0x00cf;
                case 2: goto L_0x00cb;
                case 3: goto L_0x00c7;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.String r0 = "ON_DISCONNECT"
        L_0x001d:
            X.C17890vO.A1A(r1, r0)
            X.A99 r3 = r7.A00
            com.whatsapp.voipcalling.CallInfo r4 = X.AnonymousClass8BR.A0r(r3)
            r5 = 0
            r2 = 1
            if (r4 == 0) goto L_0x0031
            boolean r0 = X.AnonymousClass8BU.A1U(r4, r8)
            r1 = 1
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            boolean r0 = X.C40811vJ.A0e(r4)
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r4.callId
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0042
            if (r1 == 0) goto L_0x005a
        L_0x0042:
            if (r6 == r5) goto L_0x010e
            if (r6 == r2) goto L_0x010a
            r0 = 2
            if (r6 == r0) goto L_0x00e6
            r0 = 3
            if (r6 == r0) goto L_0x005b
            X.9eS r0 = r3.A2B
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x00d7
            X.Adx r0 = r3.A0R
            boolean r0 = r0.A0F(r8)
            if (r0 != 0) goto L_0x00d7
        L_0x005a:
            return
        L_0x005b:
            X.1VM r0 = r3.A2K
            int r2 = r0.A02()
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r0 = r3.A0A
            java.lang.Long r4 = X.C108945cZ.A1B(r4, r0)
            r3.A12 = r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService/onConnectionStateChanged Time elapsed since SelfManagedConnection creation = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", Android auto connected = "
            r1.append(r0)
            X.9eS r6 = r3.A2B
            boolean r0 = r6.A03
            r1.append(r0)
            java.lang.String r0 = ", isBluetoothAvailable = "
            r1.append(r0)
            X.Adx r0 = r3.A0R
            boolean r0 = r0.A0F(r8)
            X.C17900vP.A0r(r1, r0)
            java.lang.Long r0 = r3.A12
            long r4 = r0.longValue()
            long r1 = (long) r2
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00aa
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x00de
            X.Adx r0 = r3.A0R
            boolean r0 = r0.A0F(r8)
            if (r0 != 0) goto L_0x00de
        L_0x00aa:
            android.telephony.TelephonyManager r1 = r3.A1s
            X.17x r0 = r3.A2e
            int r0 = X.C63982u1.A00(r1, r0)
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = "VoiceService/onConnectionStateChanged Ignoring SelfManagedConnection.onReject"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r3.A1O
            if (r0 != 0) goto L_0x005a
            r0 = 0
            r3.A0A = r0
            r0 = 500(0x1f4, double:2.47E-321)
            r3.A0q(r0)
            return
        L_0x00c7:
            java.lang.String r0 = "ON_REJECT"
            goto L_0x001d
        L_0x00cb:
            java.lang.String r0 = "ON_ANSWER"
            goto L_0x001d
        L_0x00cf:
            java.lang.String r0 = "ON_UNHOLD"
            goto L_0x001d
        L_0x00d3:
            java.lang.String r0 = "ON_HOLD"
            goto L_0x001d
        L_0x00d7:
            r1 = 31
            r0 = 0
            X.A99.A0G(r3, r4, r0, r1)
            return
        L_0x00de:
            r2 = 9
            r1 = 0
            r0 = 0
            r3.A0m(r0, r2, r8, r1)
            return
        L_0x00e6:
            r3.A1F = r2
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x00fb
            X.0ve r2 = r7.A01
            r1 = 12634(0x315a, float:1.7704E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00fb
            r5 = 1
        L_0x00fb:
            r3.A0w(r4, r5)
            X.1VM r0 = r3.A2K
            boolean r1 = r0.A0B()
            r0 = 8
            r3.A0o(r0, r8, r1)
            return
        L_0x010a:
            r3.A0x(r4, r5, r2)
            return
        L_0x010e:
            r3.A0x(r4, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8lO.A05(java.lang.String, java.lang.Integer):void");
    }
}
