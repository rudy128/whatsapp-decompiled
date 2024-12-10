package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* renamed from: X.Cxw  reason: case insensitive filesystem */
public final class C26339Cxw implements ServiceConnection {
    public final int A00;
    public final /* synthetic */ C26157CtR A01;

    public C26339Cxw(C26157CtR ctR, int i) {
        this.A01 = ctR;
        this.A00 = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler handler;
        Message message;
        IGmsServiceBroker dIx;
        int i;
        int i2;
        C26157CtR ctR = this.A01;
        if (iBinder == null) {
            synchronized (ctR.A0J) {
                i = ctR.A02;
            }
            if (i == 3) {
                ctR.A0C = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            handler = ctR.A0G;
            message = handler.obtainMessage(i2, ctR.A0B.get(), 16);
        } else {
            synchronized (ctR.A0K) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                    dIx = new C26916DIx(iBinder);
                } else {
                    dIx = (IGmsServiceBroker) queryLocalInterface;
                }
                ctR.A09 = dIx;
            }
            int i3 = this.A00;
            C23215BdR bdR = new C23215BdR(ctR, 0);
            handler = ctR.A0G;
            message = handler.obtainMessage(7, i3, -1, bdR);
        }
        handler.sendMessage(message);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C26157CtR ctR = this.A01;
        synchronized (ctR.A0K) {
            ctR.A09 = null;
        }
        int i = this.A00;
        Handler handler = ctR.A0G;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
