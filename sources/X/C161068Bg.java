package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.ResultReceiver;

/* renamed from: X.8Bg  reason: invalid class name and case insensitive filesystem */
public class C161068Bg extends Service {
    public IBinder A00;
    public ResultReceiver A01;

    public IBinder onBind(Intent intent) {
        return this.A00;
    }
}
