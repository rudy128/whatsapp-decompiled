package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.CNp  reason: case insensitive filesystem */
public final class C24871CNp {
    public final Messenger A00;
    public final D3G A01;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.D3G] */
    public C24871CNp(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor == "android.os.IMessenger" || (interfaceDescriptor != null && interfaceDescriptor.equals("android.os.IMessenger"))) {
            this.A00 = new Messenger(iBinder);
        } else if (interfaceDescriptor == "com.google.android.gms.iid.IMessengerCompat" || (interfaceDescriptor != null && interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
            ? obj = new Object();
            obj.A00 = new Messenger(iBinder);
            this.A01 = obj;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }
}
