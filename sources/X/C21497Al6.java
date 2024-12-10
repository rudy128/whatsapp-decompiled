package X;

import android.app.Notification;
import com.whatsapp.voipcalling.CallInfo;
import java.util.concurrent.Callable;

/* renamed from: X.Al6  reason: case insensitive filesystem */
public final /* synthetic */ class C21497Al6 implements Callable {
    public final /* synthetic */ Notification A00;
    public final /* synthetic */ A99 A01;
    public final /* synthetic */ CallInfo A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public final Object call() {
        A99 a99 = this.A01;
        Notification notification = this.A00;
        boolean z = this.A03;
        CallInfo callInfo = this.A02;
        return Boolean.valueOf(A99.A0K(notification, a99, z, callInfo.videoEnabled, this.A04, this.A05));
    }

    public /* synthetic */ C21497Al6(Notification notification, A99 a99, CallInfo callInfo, boolean z, boolean z2, boolean z3) {
        this.A01 = a99;
        this.A00 = notification;
        this.A03 = z;
        this.A02 = callInfo;
        this.A04 = z2;
        this.A05 = z3;
    }
}
