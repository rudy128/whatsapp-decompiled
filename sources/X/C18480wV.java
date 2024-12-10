package X;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.0wV  reason: invalid class name and case insensitive filesystem */
public class C18480wV {
    public static final Object A0B = new Object();
    public static final ThreadFactory A0C = new AnonymousClass3DQ();
    public String A00;
    public Set A01;
    public final C18220vy A02;
    public final C18320wC A03;
    public final C18820xD A04;
    public final C18830xE A05;
    public final C18790xA A06;
    public final Object A07;
    public final List A08;
    public final Executor A09;
    public final ExecutorService A0A;

    public static void A00(C18480wV r5) {
        C18220vy r52 = r5.A02;
        C18220vy.A02(r52);
        C18230vz r2 = r52.A01;
        String str = r2.A01;
        C18210vx.A05(str, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C18220vy.A02(r52);
        C18210vx.A05(r2.A03, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C18220vy.A02(r52);
        String str2 = r2.A00;
        C18210vx.A05(str2, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C18220vy.A02(r52);
        C18210vx.A07(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C18220vy.A02(r52);
        C18210vx.A07(C18820xD.A03.matcher(str2).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static void A01(C18480wV r3, C24686CFk cFk) {
        synchronized (r3.A07) {
            Iterator it = r3.A08.iterator();
            while (it.hasNext()) {
                if (((AnonymousClass3LZ) it.next()).C6V(cFk)) {
                    it.remove();
                }
            }
        }
    }

    public static void A02(C18480wV r3, Exception exc) {
        synchronized (r3.A07) {
            Iterator it = r3.A08.iterator();
            while (it.hasNext()) {
                if (((AnonymousClass3LZ) it.next()).BtW(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.0xC, java.lang.Object] */
    public C18480wV(C18220vy r6, C18290w6 r7, Executor executor, ExecutorService executorService) {
        C18220vy.A02(r6);
        C18790xA r4 = new C18790xA(r6.A00, r7);
        C18830xE r3 = new C18830xE(r6);
        C18810xC r0 = C18810xC.A00;
        C18810xC r02 = r0;
        if (r0 == null) {
            ? obj = new Object();
            C18810xC.A00 = obj;
            r02 = obj;
        }
        C18820xD r2 = C18820xD.A01;
        if (r2 == null) {
            r2 = new C18820xD(r02);
            C18820xD.A01 = r2;
        }
        C18320wC r1 = new C18320wC(new C65622wq(r6, 1));
        byte b = C18840xF.A00;
        this.A07 = new Object();
        this.A01 = new HashSet();
        this.A08 = new ArrayList();
        this.A02 = r6;
        this.A06 = r4;
        this.A05 = r3;
        this.A04 = r2;
        this.A03 = r1;
        this.A0A = executorService;
        this.A09 = executor;
    }

    public Task A03() {
        String str;
        A00(this);
        synchronized (this) {
            str = this.A00;
        }
        if (str != null) {
            zzw zzw = new zzw();
            zzw.zzb(str);
            return zzw;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C65642ws r2 = new C65642ws(taskCompletionSource);
        synchronized (this.A07) {
            this.A08.add(r2);
        }
        zzw zzw2 = taskCompletionSource.zza;
        this.A0A.execute(new C27080DTf((Object) this, 30));
        return zzw2;
    }
}
