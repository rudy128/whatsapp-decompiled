package X;

import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.9Pt  reason: invalid class name and case insensitive filesystem */
public abstract class C181259Pt {
    public static final CallInfo A00(AnonymousClass1HQ r3, String str) {
        C18070vi.A0d(r3, 0);
        if (r3.BeE()) {
            CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
            if (callLinkInfo != null) {
                return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
            }
            return null;
        }
        CallInfo BO3 = r3.BO3();
        if (BO3 == null) {
            return null;
        }
        if (str == null || !AnonymousClass8BU.A1U(BO3, str)) {
            return BO3;
        }
        return CallInfo.convertCallWaitingInfoToCallInfo(BO3);
    }
}
