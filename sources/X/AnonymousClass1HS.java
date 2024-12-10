package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.1HS  reason: invalid class name */
public class AnonymousClass1HS {
    public final AnonymousClass1HQ A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    private CallState A00() {
        CallState callState;
        try {
            if (!C18020vd.A05(C18040vf.A02, (C18020vd) this.A01.get(), 11710)) {
                callState = Voip.A03(((AnonymousClass1HR) this.A00).A00);
            } else if (!C28291Zu.A00) {
                return CallState.NONE;
            } else {
                CallInfo A012 = ((C88054Yd) this.A02.get()).A01();
                if (A012 == null) {
                    return CallState.NONE;
                }
                callState = A012.callState;
            }
            if (callState == null) {
                return CallState.NONE;
            }
            return callState;
        } catch (UnsatisfiedLinkError e) {
            Log.e("unable to query for current call state", e);
            return CallState.NONE;
        }
    }

    public AnonymousClass1HS(AnonymousClass1HQ r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public boolean A01() {
        CallState A002 = A00();
        if (A002 == CallState.NONE || A002 == CallState.LINK || A002 == CallState.PRECALLING) {
            return false;
        }
        return true;
    }

    public boolean A02() {
        if (A00() == CallState.LINK) {
            return true;
        }
        return false;
    }

    public boolean A03() {
        CallInfo BO3;
        if (!A01() || (BO3 = this.A00.BO3()) == null || !BO3.videoEnabled) {
            return false;
        }
        return true;
    }
}
