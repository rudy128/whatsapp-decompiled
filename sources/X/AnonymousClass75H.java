package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* renamed from: X.75H  reason: invalid class name */
public final class AnonymousClass75H implements ServiceConnection {
    public final C128676gV A00;
    public final /* synthetic */ C138236wk A01;

    public AnonymousClass75H(C138236wk r1, C128676gV r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGetInstallReferrerService r1;
        C137066ur.A00("Install Referrer service connected.");
        C138236wk r2 = this.A01;
        if (iBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof IGetInstallReferrerService) {
                r1 = (IGetInstallReferrerService) queryLocalInterface;
            } else {
                r1 = new C1413075c(iBinder);
            }
        }
        r2.A02 = r1;
        r2.A00 = 2;
        C128676gV r0 = this.A00;
        r0.A02.CGF(new C146517Pk(r0.A00, r0.A01, 28));
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C137066ur.A01("Install Referrer service disconnected.");
        C138236wk r1 = this.A01;
        r1.A02 = null;
        r1.A00 = 0;
    }
}
