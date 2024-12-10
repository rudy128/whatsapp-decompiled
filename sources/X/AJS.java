package X;

import com.whatsapp.voipcalling.CallInfo;

public class AJS implements AnonymousClass3LY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C138686xW A01;
    public final /* synthetic */ A99 A02;
    public final /* synthetic */ CallInfo A03;

    public AJS(C138686xW r1, A99 a99, CallInfo callInfo, int i) {
        this.A02 = a99;
        this.A00 = i;
        this.A01 = r1;
        this.A03 = callInfo;
    }

    public void Btr(Throwable th) {
        this.A02.A1x.A0G("VoiceService/startForegroundService", C17900vP.A0C("Notification/Future/onFailure: ", AnonymousClass000.A10(), th), true);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (!AnonymousClass000.A1Y(obj)) {
            A99 a99 = this.A02;
            a99.A2d.BkR(23, a99.A2H.A06(a99.A1r, this.A01, a99.A2J, this.A00, true));
            CallInfo callInfo = this.A03;
            AnonymousClass1BI r1 = callInfo.groupJid;
            if (!(r1 == null && (r1 = callInfo.getCreatorJid()) == null)) {
                a99.A2X.A0C(r1, 0);
            }
            a99.A1R = true;
        }
    }
}
