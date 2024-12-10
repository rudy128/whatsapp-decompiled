package X;

import android.app.Notification;
import com.whatsapp.voipcalling.CallInfo;

public class AJT implements AnonymousClass3LY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C138686xW A01;
    public final /* synthetic */ A99 A02;
    public final /* synthetic */ CallInfo A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass1KB r0 = this.A02.A22;
        boolean z = this.A05;
        CallInfo callInfo = this.A03;
        boolean z2 = this.A04;
        int i = this.A00;
        r0.A0J(new C21384AjD((Notification) obj, this.A01, this, callInfo, i, z, z2));
    }

    public AJT(C138686xW r1, A99 a99, CallInfo callInfo, int i, boolean z, boolean z2) {
        this.A02 = a99;
        this.A05 = z;
        this.A03 = callInfo;
        this.A04 = z2;
        this.A00 = i;
        this.A01 = r1;
    }

    public void Btr(Throwable th) {
        this.A02.A1x.A0G("VoiceService/startForegroundService/callNotificationBuilder/build", C17900vP.A0C("Notification/Future/onFailure: ", AnonymousClass000.A10(), th), true);
    }
}
