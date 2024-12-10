package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.72U  reason: invalid class name */
public abstract class AnonymousClass72U {
    public static final boolean A00(CallState callState) {
        C18070vi.A0d(callState, 0);
        if (callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.CALLING || callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING || callState == CallState.ACCEPT_SENT || callState == CallState.PRECALLING) {
            return true;
        }
        return false;
    }

    public static final boolean A01(CallState callState) {
        C18070vi.A0d(callState, 0);
        if (callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY) {
            return true;
        }
        return false;
    }

    public static final boolean A02(CallState callState) {
        C18070vi.A0d(callState, 0);
        if (callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING) {
            return true;
        }
        return false;
    }

    public static final boolean A03(CallState callState) {
        if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.ACCEPT_RECEIVED) {
            return true;
        }
        return false;
    }
}
