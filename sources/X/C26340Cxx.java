package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.IInterface;
import com.facebook.wearable.applinks.AppLinkRegisterRequest;

/* renamed from: X.Cxx  reason: case insensitive filesystem */
public class C26340Cxx implements ServiceConnection {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C26340Cxx(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.Cyl] */
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C26385Cyl cyl;
        if (this.A00 != 0) {
            ((ConditionVariable) this.A02).open();
            return;
        }
        C18070vi.A0d(iBinder, 1);
        C26294Cx6.A06("lam:LinkedAppManager", "onServiceConnected: IPC server IAppLinkServiceV2 is connected");
        Cw1 cw1 = (Cw1) this.A02;
        boolean z = cw1.A0H;
        if (z) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.wearable.applinks.IAppLinkServiceV2");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C26385Cyl)) {
                ? obj = new Object();
                obj.A00 = iBinder;
                cyl = obj;
            } else {
                cyl = (C26385Cyl) queryLocalInterface;
            }
            cw1.A00 = cyl;
        }
        AppLinkRegisterRequest appLinkRegisterRequest = (AppLinkRegisterRequest) this.A01;
        if (z) {
            Cw1.A05(new Dm1(appLinkRegisterRequest, cw1));
            return;
        }
        IllegalStateException A0n = AnonymousClass000.A0n("Please update to MWA v127+ to use applinks");
        C26294Cx6.A09("lam:LinkedAppManager", "registerLinkableAppService: unsupported", A0n);
        throw A0n;
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.A00 != 0) {
            ((ConditionVariable) this.A02).close();
            return;
        }
        C26294Cx6.A09("lam:LinkedAppManager", "onServiceDisconnected IPC server IAppLinkServiceV2 has disconnected", (Throwable) null);
        Cw1.A02((Cw1) this.A02);
    }
}
