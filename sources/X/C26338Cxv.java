package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.Cxv  reason: case insensitive filesystem */
public class C26338Cxv implements ServiceConnection {
    public boolean A00 = false;
    public final BlockingQueue A01 = new LinkedBlockingQueue();

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A01.add(iBinder);
    }
}
