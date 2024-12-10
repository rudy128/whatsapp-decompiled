package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

public class AAL implements Handler.Callback {
    public final int A00;
    public final Object A01;

    public AAL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean handleMessage(Message message) {
        int i;
        CallState callState;
        switch (this.A00) {
            case 0:
                C175258yP r3 = (C175258yP) this.A01;
                int i2 = message.what;
                if (i2 != 1 && i2 != 2) {
                    return true;
                }
                Handler handler = r3.A01;
                handler.removeMessages(1);
                handler.removeMessages(2);
                CallInfo A03 = C175258yP.A03(r3, (CallInfo) null);
                if (A03 == null) {
                    return true;
                }
                C175258yP.A04(r3, A03, false);
                return true;
            case 1:
                A99 a99 = (A99) this.A01;
                CallInfo A0r = AnonymousClass8BR.A0r(a99);
                int i3 = message.what;
                boolean A1T = AnonymousClass000.A1T(i3, 4);
                if (C40811vJ.A0e(A0r) || A1T) {
                    if (i3 == 0) {
                        Log.i("voip/call/not-accept-timeout");
                        if (A0r.isGroupCall && ((callState = A0r.callState) == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED)) {
                            return true;
                        }
                        i = 7;
                    } else if (i3 == 1) {
                        Log.i("voip/call/accepted-but-not-active-timeout");
                        if (A0r.isAudioChat()) {
                            a99.A18(AnonymousClass000.A13(), 34);
                        }
                        i = 8;
                    } else if (i3 == 2) {
                        Log.i("voip/call/send-call-offer-timeout");
                        if (!C18020vd.A05(C18040vf.A02, a99.A2p, 11174) && a99.A2S.A03(true) != 0) {
                            return true;
                        }
                        A99.A0G(a99, A0r, a99.A1r.getString(2131898115), 9);
                        return true;
                    } else if (i3 == 3) {
                        Log.i("voip/call/busy-tone-timeout");
                        i = 10;
                    } else if (i3 != 4) {
                        return false;
                    } else {
                        Log.i("voip/call/ringtone-timeout");
                        a99.A0X.A06();
                        return true;
                    }
                    A99.A0G(a99, A0r, (String) null, i);
                    return true;
                }
                Log.e("voip/callTimeoutHandler we are not in an active call");
                return false;
            case 2:
                A99 a992 = (A99) this.A01;
                int i4 = message.what;
                if (i4 != 0) {
                    if (i4 != 1) {
                        return false;
                    }
                    CallState A032 = Voip.A03(((AnonymousClass1HR) a992.A29).A00);
                    if (A032 != null && A032 != CallState.NONE && A032 != CallState.LINK && A032 != CallState.PRECALLING) {
                        return true;
                    }
                    C21067Adx adx = a992.A0R;
                    C17960vV.A07(adx);
                    adx.A02();
                    return true;
                } else if (!A99.A0L(a992)) {
                    return true;
                } else {
                    if (A99.A4B.get() > 0) {
                        a992.A0V();
                        return true;
                    }
                    Log.i("voip/service/stopSelfHandler stopSelf now");
                    a992.A1j = true;
                    AnonymousClass8BT.A17(a992.A2J.A00, 2);
                    return true;
                }
            case 3:
                return ((A99) this.A01).A1D(message);
            default:
                XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager = (XmppConnectionMetricsWorkManager) this.A01;
                if (message.what != C18070vi.A16(xmppConnectionMetricsWorkManager, message)) {
                    return false;
                }
                ((C57942jt) xmppConnectionMetricsWorkManager.A03.get()).A00();
                return true;
        }
    }
}
