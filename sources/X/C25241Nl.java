package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/* renamed from: X.1Nl  reason: invalid class name and case insensitive filesystem */
public class C25241Nl {
    public SharedPreferences A00;
    public final C18010vc A01;
    public final AnonymousClass11P A02;
    public final SecureRandom A03 = new SecureRandom();

    public synchronized long A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A05(A03());
            this.A00 = sharedPreferences;
        }
        return sharedPreferences.getLong("start_time_ms", 0);
    }

    public synchronized long A02(Random random) {
        long A012;
        A012 = A01();
        if (A012 == 0) {
            A012 = AnonymousClass11P.A01(this.A02) - ((long) random.nextInt(86400000));
            A06(A012);
        }
        return A012;
    }

    public synchronized void A06(long j) {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A05(A03());
            this.A00 = sharedPreferences;
        }
        sharedPreferences.edit().putLong("start_time_ms", j).apply();
    }

    public synchronized byte[] A08() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A05(A03());
            this.A00 = sharedPreferences;
        }
        if (!sharedPreferences.contains("thread_user_secret")) {
            byte[] bArr = new byte[32];
            this.A03.nextBytes(bArr);
            A07(bArr);
        }
        return Base64.decode(sharedPreferences.getString("thread_user_secret", ""), 2);
    }

    public String A03() {
        if (this instanceof C26161Rb) {
            return "bizIntegrityTelemetry";
        }
        if (this instanceof C37711q0) {
            return "bizCTWATTelemetry";
        }
        return "chatCounts";
    }

    public String A05(String str) {
        String format = new SimpleDateFormat("yyyy/MM/dd", Locale.US).format(new Date(A02(new Random()) - 28800000));
        byte[] A08 = A08();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(format);
        return A00(A08, sb.toString());
    }

    public void A07(byte[] bArr) {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A05(A03());
            this.A00 = sharedPreferences;
        }
        sharedPreferences.edit().putString("thread_user_secret", Base64.encodeToString(bArr, 2)).apply();
    }

    public C25241Nl(AnonymousClass11P r2, C18010vc r3) {
        this.A02 = r2;
        this.A01 = r3;
    }

    public static String A00(byte[] bArr, String str) {
        byte[] bArr2;
        try {
            bArr2 = AnonymousClass9QC.A00(new String(str.getBytes(), C19620yd.A0C).getBytes(), bArr);
        } catch (Exception e) {
            Log.e("WamThreadIdManager/computeHash failed to compute hmac", e);
            bArr2 = null;
        }
        if (bArr2 != null) {
            return Base64.encodeToString(bArr2, 2);
        }
        return null;
    }

    public String A04(String str) {
        return A00(A08(), str);
    }
}
