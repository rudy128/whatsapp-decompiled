package X;

import android.content.SharedPreferences;

/* renamed from: X.2xg  reason: invalid class name and case insensitive filesystem */
public final class C66132xg implements AnonymousClass191 {
    public final AnonymousClass1Bc A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public /* synthetic */ void Blg() {
    }

    public void Blf() {
        AnonymousClass1Bc r5 = this.A00;
        synchronized (r5) {
            SharedPreferences.Editor edit = AnonymousClass1Bc.A00(r5).edit();
            edit.putInt("total_cold_start_count_pref", AnonymousClass1Bc.A00(r5).getInt("total_cold_start_count_pref", 0) + 1);
            if (AnonymousClass1Bf.A00()) {
                edit.putInt("bg_cold_start_count_pref", AnonymousClass1Bc.A00(r5).getInt("bg_cold_start_count_pref", 0) + 1);
            }
            edit.putInt("last_cold_start_time_min", (int) (((AnonymousClass11P.A00(r5.A01) / 60) / 10) * 10));
            edit.apply();
        }
    }

    public C66132xg(AnonymousClass1Bc r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r3, r1, r4, r5);
        this.A04 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r4;
        this.A03 = r5;
    }

    public void Ba9() {
    }
}
