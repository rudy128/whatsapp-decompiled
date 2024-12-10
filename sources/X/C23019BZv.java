package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;

/* renamed from: X.BZv  reason: case insensitive filesystem */
public final class C23019BZv extends C23023BZz {
    public final int A00;
    public final ClientAppContext A01;
    public final CLJ A02 = new CLJ();

    public final void A0B(int i) {
        String str;
        if (i != 1) {
            str = "CLIENT_DISCONNECTED";
        } else {
            str = "ACTIVITY_STOPPED";
        }
        if (isConnected()) {
            C23072Ban ban = new C23072Ban((ClientAppContext) null, 1, i);
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                BE7.A1L("Emitting client lifecycle event %s", "NearbyMessagesClient", new Object[]{str});
            }
            C26398Cyy cyy = (C26398Cyy) A04();
            Parcel A002 = C26398Cyy.A00(ban, cyy);
            try {
                cyy.A00.transact(9, A002, (Parcel) null, 1);
            } finally {
                A002.recycle();
            }
        } else if (Log.isLoggable("NearbyMessagesClient", 3)) {
            BE7.A1L("Failed to emit client lifecycle event %s due to GmsClient being disconnected", "NearbyMessagesClient", new Object[]{str});
        }
    }

    public final void BIn() {
        try {
            A0B(2);
        } catch (RemoteException e) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", AnonymousClass8BV.A1b(e)));
            }
        }
        this.A02.A00.clear();
        super.BIn();
    }

    public final int BUx() {
        return 12451000;
    }

    public C23019BZv(Context context, Looper looper, EDW edw, EDX edx, CTL ctl) {
        super(context, looper, edw, edx, ctl, 62);
        int i;
        String str = ctl.A02;
        if (context instanceof Activity) {
            i = 1;
        } else if (context instanceof Application) {
            i = 2;
        } else {
            i = 0;
            if (context instanceof Service) {
                i = 3;
            }
        }
        this.A01 = new ClientAppContext(str, (String) null, (String) null, 1, i, false);
        this.A00 = -1;
    }

    public final boolean CFd() {
        return C25929Cot.A01(this.A0F);
    }
}
