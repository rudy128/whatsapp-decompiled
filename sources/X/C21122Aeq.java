package X;

import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.Aeq  reason: case insensitive filesystem */
public final /* synthetic */ class C21122Aeq implements AnonymousClass1TI {
    public final /* synthetic */ A99 A00;
    public final /* synthetic */ AnonymousClass1BI A01;
    public final /* synthetic */ CallInfo A02;
    public final /* synthetic */ CallState A03;
    public final /* synthetic */ CallState A04;
    public final /* synthetic */ boolean A05;

    public final void accept(Object obj) {
        A99 a99 = this.A00;
        CallState callState = this.A03;
        CallInfo callInfo = this.A02;
        CallState callState2 = this.A04;
        boolean z = this.A05;
        a99.A22.A0J(new AnonymousClass3CS(a99, callState, callInfo, callState2, obj, this.A01, 0, z));
    }

    public /* synthetic */ C21122Aeq(A99 a99, AnonymousClass1BI r2, CallInfo callInfo, CallState callState, CallState callState2, boolean z) {
        this.A00 = a99;
        this.A03 = callState;
        this.A02 = callInfo;
        this.A04 = callState2;
        this.A05 = z;
        this.A01 = r2;
    }
}
