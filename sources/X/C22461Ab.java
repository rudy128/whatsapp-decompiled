package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1Ab  reason: invalid class name and case insensitive filesystem */
public class C22461Ab implements AnonymousClass191 {
    public final C17930vS A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11P A02;
    public final C19830z4 A03;

    public /* synthetic */ void Blg() {
    }

    public ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        if (!A05("breakpad")) {
            arrayList.add("breakpad");
        }
        if (!A05("anr_detector")) {
            arrayList.add("anr_detector");
        }
        if (!A05("abort_hook")) {
            arrayList.add("abort_hook");
        }
        return arrayList;
    }

    public void A04(String str) {
        boolean delete = A00(this.A00, str).delete();
        StringBuilder sb = new StringBuilder();
        sb.append("Module ");
        sb.append(str);
        sb.append(" health file deleted: ");
        sb.append(delete);
        Log.i(sb.toString());
    }

    public boolean A05(String str) {
        return !A00(this.A00, str).exists();
    }

    public void Blf() {
        C19830z4 r8 = this.A03;
        if (((SharedPreferences) r8.A00.get()).getBoolean("report_unhealthy_module", true)) {
            ArrayList A022 = A02();
            Iterator it = A022.iterator();
            while (it.hasNext()) {
                AnonymousClass190 r2 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("app-init-module-unhealthy-");
                sb.append((String) it.next());
                r2.A0G(sb.toString(), C62912sC.A02(), false);
            }
            if (!A022.isEmpty()) {
                C19830z4.A00(r8).putBoolean("report_unhealthy_module", false).apply();
            }
        }
    }

    public C22461Ab(AnonymousClass190 r1, AnonymousClass11P r2, C19830z4 r3, C17930vS r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = r4;
    }

    public static File A00(C17930vS r2, String str) {
        File A002 = r2.A00();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".health");
        return new File(A002, sb.toString());
    }

    public static void A01(C22461Ab r6, Runnable runnable, String str, boolean z) {
        StringBuilder sb;
        if (!r6.A05(str)) {
            sb.append("Skipping module ");
            sb.append(str);
            sb.append(" since its unhealthy");
            Log.w(sb.toString());
            return;
        }
        sb = new StringBuilder();
        sb.append("Loading module: ");
        sb.append(str);
        Log.i(sb.toString());
        try {
            A00(r6.A00, str).createNewFile();
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error creating health file for ");
            sb2.append(str);
            Log.e(sb2.toString(), e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        runnable.run();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (z) {
            r6.A04(str);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Module loaded: ");
        sb3.append(str);
        sb3.append(" load time: ");
        sb3.append(elapsedRealtime2 - elapsedRealtime);
        Log.i(sb3.toString());
        return;
    }

    public void Ba9() {
    }

    public void A03(Runnable runnable, String str, boolean z) {
        A01(this, runnable, str, z);
    }
}
