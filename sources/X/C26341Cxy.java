package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cxy  reason: case insensitive filesystem */
public final class C26341Cxy implements ServiceConnection {
    public int A00 = 0;
    public C24871CNp A01;
    public final Messenger A02 = new Messenger(new C19530yM(Looper.getMainLooper(), new C26368CyU(this)));
    public final SparseArray A03 = BE6.A0Q();
    public final Queue A04 = new ArrayDeque();
    public final /* synthetic */ C25983Cpw A05;

    public final synchronized void A00() {
        if (this.A00 == 2 && this.A04.isEmpty() && this.A03.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.A00 = 3;
            C26111CsX.A00().A02(this.A05.A02, this);
        }
    }

    public final synchronized void A01(String str) {
        A02(str, (Throwable) null);
    }

    public final synchronized void A02(String str, Throwable th) {
        SparseArray sparseArray;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i = this.A00;
        if (i == 0) {
            throw BE6.A0k();
        } else if (i == 1 || i == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.A00 = 4;
            C26111CsX.A00().A02(this.A05.A02, this);
            C1U c1u = new C1U(str, th);
            Queue<C25264Cc5> queue = this.A04;
            for (C25264Cc5 A012 : queue) {
                A012.A01(c1u);
            }
            queue.clear();
            int i2 = 0;
            while (true) {
                sparseArray = this.A03;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((C25264Cc5) sparseArray.valueAt(i2)).A01(c1u);
                i2++;
            }
            sparseArray.clear();
        } else if (i == 3) {
            this.A00 = 4;
        }
    }

    public final synchronized boolean A03(C25264Cc5 cc5) {
        synchronized (this) {
            int i = this.A00;
            if (i == 0) {
                this.A04.add(cc5);
                if (this.A00 == 0) {
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.A00 = 1;
                    Intent A0G = C108945cZ.A0G("com.google.android.c2dm.intent.REGISTER");
                    A0G.setPackage("com.google.android.gms");
                    try {
                        C26111CsX A002 = C26111CsX.A00();
                        C25983Cpw cpw = this.A05;
                        Context context = cpw.A02;
                        if (!C26111CsX.A01(context, A0G, this, A002, C17890vO.A0U(context), 1)) {
                            A01("Unable to bind to service");
                        } else {
                            cpw.A03.schedule(new C27080DTf((Object) this, 8), 30, TimeUnit.SECONDS);
                        }
                    } catch (SecurityException e) {
                        A02("Unable to bind to service", e);
                    }
                } else {
                    throw BE6.A0k();
                }
            } else if (i == 1) {
                this.A04.add(cc5);
            } else if (i != 2) {
                return false;
            } else {
                this.A04.add(cc5);
                this.A05.A03.execute(new C27074DSc(this));
            }
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        C27076DTa.A01(this, iBinder, this.A05.A03, 41);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.A05.A03.execute(new C27080DTf((Object) this, 9));
    }

    public /* synthetic */ C26341Cxy(C25983Cpw cpw) {
        this.A05 = cpw;
    }
}
