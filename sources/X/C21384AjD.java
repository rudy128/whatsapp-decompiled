package X;

import android.app.Notification;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.AjD  reason: case insensitive filesystem */
public final /* synthetic */ class C21384AjD implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Notification A01;
    public final /* synthetic */ C138686xW A02;
    public final /* synthetic */ AJT A03;
    public final /* synthetic */ CallInfo A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public final void run() {
        AJT ajt = this.A03;
        Notification notification = this.A01;
        boolean z = this.A05;
        CallInfo callInfo = this.A04;
        boolean z2 = this.A06;
        int i = this.A00;
        C138686xW r7 = this.A02;
        A99 a99 = ajt.A02;
        if (!A99.A0K(notification, a99, z, callInfo.videoEnabled, z2, false)) {
            a99.A31.CGS(new C21365Aiu(ajt, r7, callInfo, i, 9), "call_notification_builder");
        }
    }

    public /* synthetic */ C21384AjD(Notification notification, C138686xW r2, AJT ajt, CallInfo callInfo, int i, boolean z, boolean z2) {
        this.A03 = ajt;
        this.A01 = notification;
        this.A05 = z;
        this.A04 = callInfo;
        this.A06 = z2;
        this.A00 = i;
        this.A02 = r2;
    }
}
