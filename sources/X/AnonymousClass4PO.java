package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4PO  reason: invalid class name */
public final class AnonymousClass4PO {
    public final boolean A00(C86534Sa r3) {
        C18070vi.A0d(r3, 0);
        if (r3.A0G) {
            return false;
        }
        int i = r3.A00;
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        CallState callState = r3.A0B;
        C18070vi.A0W(callState);
        if (AnonymousClass72U.A02(callState)) {
            return true;
        }
        if (r3.A0E == null || callState != CallState.PRECALLING) {
            return false;
        }
        return true;
    }
}
