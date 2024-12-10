package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.0yP  reason: invalid class name and case insensitive filesystem */
public class C19560yP {
    public C19710yq A00;
    public Boolean A01;
    public boolean A02;
    public final C18440wP A03;
    public final /* synthetic */ FirebaseMessaging A04;

    public synchronized boolean A00() {
        boolean z;
        Boolean bool;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        synchronized (this) {
            try {
                if (!this.A02) {
                    C18220vy r0 = this.A04.A04;
                    C18220vy.A02(r0);
                    Context context = r0.A00;
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                    if (sharedPreferences.contains("auto_init")) {
                        bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
                    } else {
                        try {
                            PackageManager packageManager = context.getPackageManager();
                            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled"))) {
                                bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        bool = null;
                    }
                    this.A01 = bool;
                    if (bool == null) {
                        C19710yq r5 = new C19710yq(this);
                        this.A00 = r5;
                        C18440wP r4 = this.A03;
                        Class<C19720yr> cls = C19720yr.class;
                        Executor executor = r4.A02;
                        synchronized (r4) {
                            Map map = r4.A01;
                            if (!map.containsKey(cls)) {
                                map.put(cls, new ConcurrentHashMap());
                            }
                            ((ConcurrentHashMap) map.get(cls)).put(r5, executor);
                        }
                    }
                    this.A02 = true;
                }
                Boolean bool2 = this.A01;
                if (bool2 != null) {
                    z = bool2.booleanValue();
                } else {
                    C18220vy r02 = this.A04.A04;
                    C18220vy.A02(r02);
                    C19730ys r1 = (C19730ys) r02.A03.get();
                    synchronized (r1) {
                        try {
                            z = r1.A00;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
        return z;
    }

    public C19560yP(C18440wP r1, FirebaseMessaging firebaseMessaging) {
        this.A04 = firebaseMessaging;
        this.A03 = r1;
    }
}
