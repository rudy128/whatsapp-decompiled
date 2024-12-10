package X;

import android.os.RemoteException;

/* renamed from: X.Da5  reason: case insensitive filesystem */
public final class C27226Da5 extends RuntimeException {
    public static C27226Da5 A00(RemoteException remoteException) {
        return new C27226Da5(remoteException);
    }

    public C27226Da5(RemoteException remoteException) {
        super(remoteException);
    }
}
