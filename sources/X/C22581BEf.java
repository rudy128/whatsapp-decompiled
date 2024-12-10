package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

/* renamed from: X.BEf  reason: case insensitive filesystem */
public abstract class C22581BEf extends Service implements E9I {
    public ComponentName A00;
    public Intent A01;
    public Looper A02;
    public DL0 A03 = new DL0(new C25485Cgg(this));
    public BG3 A04;
    public boolean A05;
    public IBinder A06;
    public final Object A07 = C17880vN.A0p();

    public void BoB(ECT ect) {
    }

    public void BoC(ECT ect) {
    }

    public void Bvz(ECT ect) {
    }

    public void Bzm(ECT ect) {
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction())) {
            return this.A06;
        }
        return null;
    }

    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.A00);
            Log.d("WearableLS", AnonymousClass001.A1H("onDestroy: ", valueOf, BE6.A0t(BE8.A0C(valueOf) + 11)));
        }
        synchronized (this.A07) {
            this.A05 = true;
            BG3 bg3 = this.A04;
            if (bg3 != null) {
                bg3.getLooper().quit();
                BG3.A00(bg3, "quit");
            } else {
                String valueOf2 = String.valueOf(this.A00);
                StringBuilder A0t = BE6.A0t(BE8.A0C(valueOf2) + 111);
                A0t.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                throw AnonymousClass000.A0o(valueOf2, A0t);
            }
        }
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        this.A00 = new ComponentName(this, C17890vO.A0U(this));
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.A00);
            Log.d("WearableLS", AnonymousClass001.A1H("onCreate: ", valueOf, BE6.A0t(BE8.A0C(valueOf) + 10)));
        }
        Looper looper = this.A02;
        if (looper == null) {
            looper = BE7.A0G(new HandlerThread("WearableListenerService"));
            this.A02 = looper;
        }
        this.A04 = new BG3(looper, this);
        Intent A0G = C108945cZ.A0G("com.google.android.gms.wearable.BIND_LISTENER");
        this.A01 = A0G;
        A0G.setComponent(this.A00);
        this.A06 = new C23508BiI(this);
    }
}
