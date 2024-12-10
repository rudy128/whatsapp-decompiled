package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.Cxt  reason: case insensitive filesystem */
public final class C26336Cxt implements ServiceConnection {
    public final /* synthetic */ C25994CqA A00;

    public /* synthetic */ C26336Cxt(C25994CqA cqA) {
        this.A00 = cqA;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C25994CqA cqA = this.A00;
        cqA.A06.A01("ServiceConnectionImpl.onServiceConnected(%s)", AnonymousClass8BV.A1b(componentName));
        cqA.A01().post(new C23523Bj8(iBinder, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C25994CqA cqA = this.A00;
        cqA.A06.A01("ServiceConnectionImpl.onServiceDisconnected(%s)", AnonymousClass8BV.A1b(componentName));
        cqA.A01().post(new Bj6(this, 1));
    }
}
