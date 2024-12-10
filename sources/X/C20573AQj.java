package X;

import android.content.SharedPreferences;
import java.util.Iterator;

/* renamed from: X.AQj  reason: case insensitive filesystem */
public final class C20573AQj implements C72113Kr {
    public final AnonymousClass18K A00;
    public final AnonymousClass1Bc A01;
    public final AnonymousClass00H A02;

    public void Bqf() {
        C171598ry r8 = new C171598ry();
        AnonymousClass1Bc r7 = this.A01;
        SharedPreferences A002 = AnonymousClass1Bc.A00(r7);
        long A003 = ((AnonymousClass11P.A00(r7.A01) / 60) / 10) * 10;
        r8.A01 = C17880vN.A0n(A002.getInt("total_cold_start_count_pref", 0));
        r8.A02 = C17880vN.A0n(A002.getInt("fg_cold_start_count_pref", 0));
        r8.A00 = C17880vN.A0n(A002.getInt("bg_cold_start_count_pref", 0));
        r8.A09 = C108945cZ.A1B(A003, (long) A002.getInt("last_cold_start_time_min", 0));
        r8.A04 = C17880vN.A0n(A002.getInt("warm_start_count_pref", 0));
        r8.A0C = C108945cZ.A1B(A003, (long) A002.getInt("last_warm_start_time_min", 0));
        r8.A03 = C17880vN.A0n(A002.getInt("lukewarm_start_count_pref", 0));
        r8.A0B = C108945cZ.A1B(A003, (long) A002.getInt("last_lukewarm_start_time_min", 0));
        r8.A0A = C108945cZ.A1B(A003, (long) A002.getInt("last_health_event_time_min", 0));
        SharedPreferences.Editor edit = AnonymousClass1Bc.A00(r7).edit();
        edit.putInt("last_health_event_time_min", (int) A003);
        edit.apply();
        Iterator A0h = C17890vO.A0h(((AnonymousClass9XR) this.A02.get()).A00);
        while (A0h.hasNext()) {
            ((AnonymousClass1LV) A0h.next()).CBp(r8);
        }
        this.A00.CC4(r8);
        synchronized (r7) {
            SharedPreferences.Editor edit2 = AnonymousClass1Bc.A00(r7).edit();
            edit2.putInt("fg_cold_start_count_pref", 0);
            edit2.putInt("bg_cold_start_count_pref", 0);
            edit2.putInt("total_cold_start_count_pref", 0);
            edit2.putInt("warm_start_count_pref", 0);
            edit2.putInt("lukewarm_start_count_pref", 0);
            edit2.apply();
        }
    }

    public C20573AQj(AnonymousClass18K r1, AnonymousClass1Bc r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
