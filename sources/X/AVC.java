package X;

import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.Iterator;

public final /* synthetic */ class AVC implements AnonymousClass3L8 {
    public final /* synthetic */ CallInfo A00;
    public final /* synthetic */ CallState A01;

    public final void BKm(Iterable iterable) {
        CallState callState = this.A01;
        CallInfo callInfo = this.A00;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((C123506Us) it.next()).A06(callState, callInfo);
        }
    }

    public /* synthetic */ AVC(CallState callState, CallInfo callInfo) {
        this.A01 = callState;
        this.A00 = callInfo;
    }
}
