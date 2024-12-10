package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.0yJ  reason: invalid class name and case insensitive filesystem */
public class C19500yJ {
    public static int A07;
    public static PendingIntent A08;
    public static final Executor A09 = C19510yK.A00;
    public static final Pattern A0A = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public Messenger A00;
    public D3G A01;
    public final Context A02;
    public final AnonymousClass00O A03 = new AnonymousClass00O(0);
    public final C19520yL A04;
    public final Messenger A05;
    public final ScheduledExecutorService A06;

    public static final zzw A00(Bundle bundle, C19500yJ r11) {
        String num;
        String str;
        Class<C19500yJ> cls = C19500yJ.class;
        synchronized (cls) {
            int i = A07;
            A07 = i + 1;
            num = Integer.toString(i);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AnonymousClass00O r1 = r11.A03;
        synchronized (r1) {
            r1.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        C19520yL r7 = r11.A04;
        if (r7.A01() == 2) {
            str = "com.google.iid.TOKEN_REQUEST";
        } else {
            str = "com.google.android.c2dm.intent.REGISTER";
        }
        intent.setAction(str);
        intent.putExtras(bundle);
        Context context = r11.A02;
        synchronized (cls) {
            PendingIntent pendingIntent = A08;
            if (pendingIntent == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, AnonymousClass2VX.A00);
                A08 = pendingIntent;
            }
            intent.putExtra("app", pendingIntent);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("|ID|");
        sb.append(num);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
        }
        intent.putExtra("google.messenger", r11.A05);
        if (!(r11.A00 == null && r11.A01 == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = r11.A00;
                if (messenger == null) {
                    messenger = r11.A01.A00;
                }
                messenger.send(obtain);
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.zza.addOnCompleteListener(A09, (OnCompleteListener) new C65432wQ(r11, num, r11.A06.schedule(new C27080DTf((Object) taskCompletionSource, 7), 30, TimeUnit.SECONDS)));
            return taskCompletionSource.zza;
        }
        if (r7.A01() == 2) {
            context.sendBroadcast(intent);
        } else {
            context.startService(intent);
        }
        taskCompletionSource.zza.addOnCompleteListener(A09, (OnCompleteListener) new C65432wQ(r11, num, r11.A06.schedule(new C27080DTf((Object) taskCompletionSource, 7), 30, TimeUnit.SECONDS)));
        return taskCompletionSource.zza;
    }

    public static final void A01(Bundle bundle, C19500yJ r3, String str) {
        AnonymousClass00O r32 = r3.A03;
        synchronized (r32) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) r32.remove(str);
            if (taskCompletionSource == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing callback for ");
                sb.append(str);
                Log.w("Rpc", sb.toString());
            } else {
                taskCompletionSource.setResult(bundle);
            }
        }
    }

    public C19500yJ(Context context) {
        this.A02 = context;
        this.A04 = new C19520yL(context);
        this.A05 = new Messenger(new C19540yN(Looper.getMainLooper(), this));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A06 = scheduledThreadPoolExecutor;
    }
}
