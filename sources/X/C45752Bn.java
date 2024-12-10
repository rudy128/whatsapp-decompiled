package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import com.whatsapp.workers.ntp.NtpSyncWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Bn  reason: invalid class name and case insensitive filesystem */
public class C45752Bn extends C195879u4 {
    public final AnonymousClass11C A00;
    public final C18030ve A01;
    public final C132726nS A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass118 A04;
    public final C22631Cp A05;

    public void A04() {
        long j;
        if (C18020vd.A05(C18040vf.A02, this.A01, 170)) {
            Log.i("NtpAction; cancelling ntp sync using alarm manager.");
            PendingIntent A032 = A03("com.whatsapp.action.UPDATE_NTP", 536870912);
            if (A032 != null) {
                AlarmManager A052 = this.A00.A05();
                if (A052 != null) {
                    A052.cancel(A032);
                }
                A032.cancel();
            }
            Log.i("NtpAction; setting ntp sync using work manager.");
            C132726nS r5 = this.A02;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C196269uj r6 = new C196269uj(NtpSyncWorker.class);
            r6.A00.A01(timeUnit.toMillis(43200000), timeUnit.toMillis(21600000));
            r6.A07("tag.whatsapp.time.ntp");
            AnonymousClass19K r4 = r5.A02;
            ((A7W) r4.get()).A02((C162258Jw) r6.A00(), AnonymousClass00R.A01, "name.whatsapp.time.ntp");
            SharedPreferences.Editor edit = C18070vi.A03(r5.A03).edit();
            synchronized (r4) {
                j = r4.A00;
            }
            C17880vN.A1D(edit, "/ntp/work_manager_init", j);
        } else {
            Log.i("NtpAction; cancelling ntp sync using work manager.");
            A7W a7w = (A7W) this.A02.A02.get();
            a7w.A0A("name.whatsapp.time.ntp");
            a7w.A09("tag.whatsapp.time.ntp");
            Log.i("NtpAction; setting up ntp sync using alarm manager.");
            PendingIntent A033 = A03("com.whatsapp.action.UPDATE_NTP", 134217728);
            AlarmManager A053 = this.A00.A05();
            if (A053 != null) {
                A053.setInexactRepeating(3, SystemClock.elapsedRealtime() + 43200000, 43200000, A033);
            } else {
                Log.w("NtpAction/setupUpdateNtpAlarm AlarmManager is null");
            }
        }
        A00((Intent) null);
    }

    public boolean A06(Intent intent) {
        return C17890vO.A1S(intent, "com.whatsapp.action.UPDATE_NTP");
    }

    public C45752Bn(Context context, AnonymousClass11C r2, AnonymousClass11P r3, AnonymousClass118 r4, C22631Cp r5, C18030ve r6, C132726nS r7) {
        super(context);
        this.A03 = r3;
        this.A01 = r6;
        this.A05 = r5;
        this.A04 = r4;
        this.A00 = r2;
        this.A02 = r7;
    }

    private void A00(Intent intent) {
        PowerManager.WakeLock wakeLock;
        C17900vP.A0Y(intent, "NtpAction#updateNtp; intent=", AnonymousClass000.A10());
        PowerManager A0G = this.A00.A0G();
        if (A0G == null) {
            Log.w("NtpAction/updateNtp pm=null");
            wakeLock = null;
        } else {
            wakeLock = C181789Rv.A00(A0G, "NtpAction#updateNtp", 1);
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(300000);
        }
        try {
            Context context = this.A04.A00;
            AnonymousClass11P r5 = this.A03;
            C18030ve r7 = this.A01;
            NtpSyncWorker.A05.A00(context, r5, this.A05, r7, this.A02);
        } finally {
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
    }

    public void A05(Intent intent) {
        A00(intent);
    }
}
