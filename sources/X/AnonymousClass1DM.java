package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1DM  reason: invalid class name */
public class AnonymousClass1DM {
    public static final int[] A03 = {1, 2, 3, 5, 7, 15};
    public final AnonymousClass194 A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;

    public int A00() {
        C19830z4 r9 = this.A02;
        long j = ((SharedPreferences) r9.A00.get()).getLong("software_expiration_last_warned", 0);
        long A012 = AnonymousClass11P.A01(this.A01);
        if (j > A012) {
            j = 0;
        }
        if (86400000 + j > A012) {
            Log.i("software/expiration/suppress/24h");
        } else {
            Date A002 = this.A00.A00();
            int time = ((int) ((A002.getTime() - A012) / 86400000)) + 1;
            int time2 = ((int) ((A002.getTime() - j) / 86400000)) + 1;
            int[] iArr = A03;
            int i = 0;
            do {
                int i2 = iArr[i];
                if (time > i2 || time2 <= i2) {
                    i++;
                } else {
                    C19830z4.A00(r9).putLong("software_expiration_last_warned", A012).apply();
                    return time;
                }
            } while (i < 6);
        }
        return -1;
    }

    public AnonymousClass1DM(AnonymousClass194 r1, AnonymousClass11P r2, C19830z4 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void A01(long j) {
        SharedPreferences.Editor editor;
        C18170vs.A00();
        if (1741114680000L >= j) {
            C19830z4 r7 = this.A02;
            long j2 = ((SharedPreferences) r7.A00.get()).getLong("client_expiration_time", 0);
            long A012 = AnonymousClass11P.A01(this.A01) + TimeUnit.DAYS.toMillis(3);
            if (j2 == 0 || (j < j2 && j2 > A012)) {
                long max = Math.max(j, A012);
                StringBuilder sb = new StringBuilder();
                sb.append("wa-shared-prefs/set-client-expiration-time/");
                sb.append(max);
                sb.append(" ");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(max);
                sb.append(simpleDateFormat.format(instance.getTime()));
                Log.i(sb.toString());
                editor = C19830z4.A00(r7).putLong("client_expiration_time", max);
            } else if (j2 > 0 && j == -1) {
                Log.i("wa-shared-prefs/clear-client-expiration-time");
                editor = C19830z4.A00(r7).remove("client_expiration_time");
            } else {
                return;
            }
            editor.apply();
        }
    }
}
