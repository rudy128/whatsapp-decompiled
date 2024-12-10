package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* renamed from: X.0y6  reason: invalid class name and case insensitive filesystem */
public class C19370y6 implements C19360y5 {
    public final Context A00;
    public final C19340y3 A01;
    public final C19250xu A02;

    /* JADX INFO: finally extract failed */
    public void CGt(C19450yE r17, int i, boolean z) {
        long j;
        Context context = this.A00;
        ComponentName componentName = new ComponentName(context, C450725w.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(DefaultCrypto.UTF_8)));
        C19450yE r11 = r17;
        C19460yF r5 = (C19460yF) r11;
        String str = r5.A01;
        adler32.update(str.getBytes(Charset.forName(DefaultCrypto.UTF_8)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        C19300xz r10 = r5.A00;
        allocate.putInt(C61072p4.A00(r10));
        adler32.update(allocate.array());
        byte[] bArr = r5.A02;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        int i2 = i;
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        A3G.A01(r11, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((C19280xx) this.A02).A04().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(C61072p4.A00(r10))});
        try {
            if (rawQuery.moveToNext()) {
                j = rawQuery.getLong(0);
            } else {
                j = 0;
            }
            Long valueOf = Long.valueOf(j);
            rawQuery.close();
            long longValue = valueOf.longValue();
            C19340y3 r13 = this.A01;
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(r13.A00(r10, i2, longValue));
            Set set = ((C19320y1) ((C19310y0) ((C19350y4) r13).A01.get(r10))).A01;
            if (set.contains(C19330y2.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(C19330y2.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(C19330y2.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", C61072p4.A00(r10));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {r17, Integer.valueOf(value), Long.valueOf(r13.A00(r10, i2, longValue)), valueOf, Integer.valueOf(i2)};
            String A002 = A3G.A00("JobInfoScheduler");
            if (Log.isLoggable(A002, 3)) {
                Log.d(A002, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public C19370y6(Context context, C19340y3 r2, C19250xu r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }
}
