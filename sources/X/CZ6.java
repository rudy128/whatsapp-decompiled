package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

public class CZ6 {
    public WeakReference A00;
    public final WeakReference A01;
    public final List A02 = AnonymousClass000.A13();
    public final Application.ActivityLifecycleCallbacks A03;
    public volatile boolean A04;

    public void A00() {
        int i;
        Runnable[] runnableArr;
        List list = this.A02;
        synchronized (list) {
            this.A04 = true;
        }
        Context context = (Context) this.A01.get();
        if (context != null) {
            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.A03);
        }
        synchronized (list) {
            runnableArr = (Runnable[]) list.toArray(new Runnable[0]);
        }
        for (Runnable run : runnableArr) {
            run.run();
        }
        synchronized (list) {
            list.removeAll(Arrays.asList(runnableArr));
        }
    }

    public void A01(Runnable runnable) {
        if (runnable != null) {
            List list = this.A02;
            synchronized (list) {
                if (!this.A04) {
                    list.add(runnable);
                    runnable = null;
                }
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public CZ6(Context context) {
        C26325Cxi cxi = new C26325Cxi(this);
        this.A03 = cxi;
        Context context2 = context;
        while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        this.A01 = AnonymousClass3MW.A0z(context2);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(cxi);
    }
}
