package androidx.room;

import X.BGB;
import X.C17880vN;
import X.C22607BFn;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.Map;

public final class MultiInstanceInvalidationService extends Service {
    public int A00;
    public final RemoteCallbackList A01 = new BGB(this);
    public final Map A02 = C17880vN.A13();
    public final C22607BFn A03 = new C22607BFn(this);

    public IBinder onBind(Intent intent) {
        return this.A03;
    }
}
