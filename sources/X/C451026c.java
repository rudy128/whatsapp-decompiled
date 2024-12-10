package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.26c  reason: invalid class name and case insensitive filesystem */
public class C451026c extends BroadcastReceiver {
    public static AtomicReference A01 = new AtomicReference();
    public final Context A00;

    public static /* synthetic */ void A00(Context context) {
        AtomicReference atomicReference = A01;
        if (atomicReference.get() == null) {
            C451026c r2 = new C451026c(context);
            if (AnonymousClass00N.A00((Object) null, r2, atomicReference)) {
                context.registerReceiver(r2, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        synchronized (C18220vy.A0A) {
            Iterator A0l = C17890vO.A0l(C18220vy.A0B);
            while (A0l.hasNext()) {
                C18220vy.A03((C18220vy) A0l.next());
            }
        }
        this.A00.unregisterReceiver(this);
    }

    public C451026c(Context context) {
        this.A00 = context;
    }
}
