package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.Cxu  reason: case insensitive filesystem */
public final class C26337Cxu implements ServiceConnection {
    public final /* synthetic */ C26028Cqm A00;

    public /* synthetic */ C26337Cxu(C26028Cqm cqm) {
        this.A00 = cqm;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C26028Cqm cqm = this.A00;
        cqm.A06.A02("ServiceConnectionImpl.onServiceConnected(%s)", AnonymousClass8BV.A1b(componentName));
        cqm.A01().post(new C23534BjQ(iBinder, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C26028Cqm cqm = this.A00;
        C25764Cla cla = cqm.A06;
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = componentName;
        cla.A02("ServiceConnectionImpl.onServiceDisconnected(%s)", A1a);
        cqm.A01().post(new C23533BjP(this, 0));
    }
}
