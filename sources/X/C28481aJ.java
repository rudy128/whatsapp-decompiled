package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1aJ  reason: invalid class name and case insensitive filesystem */
public final class C28481aJ implements C28411aB {
    public static final long A02 = TimeUnit.DAYS.toMillis(7);
    public final AnonymousClass11P A00;
    public final C19830z4 A01;

    public /* bridge */ /* synthetic */ boolean Bck(Object obj) {
        AnonymousClass00H r7 = this.A01.A00;
        long j = ((SharedPreferences) r7.get()).getLong("pref_community_events_nux_first_seen_timestamp", 0);
        if (j == 0) {
            return false;
        }
        if (((SharedPreferences) r7.get()).getBoolean("pref_community_events_nux_seen", false) || ((SharedPreferences) r7.get()).getInt("pref_community_events_nux_times_displayed", 0) >= 3 || AnonymousClass11P.A01(this.A00) > j + A02) {
            return true;
        }
        return false;
    }

    public void BkZ(boolean z) {
        C19830z4.A00(this.A01).putBoolean("pref_community_events_nux_seen", z).apply();
    }

    public /* bridge */ /* synthetic */ void CJc(Object obj) {
        C19830z4 r7 = this.A01;
        AnonymousClass00H r2 = r7.A00;
        C19830z4.A00(r7).putInt("pref_community_events_nux_times_displayed", ((SharedPreferences) r2.get()).getInt("pref_community_events_nux_times_displayed", 0) + 1).apply();
        if (((SharedPreferences) r2.get()).getLong("pref_community_events_nux_first_seen_timestamp", 0) == 0) {
            C19830z4.A00(r7).putLong("pref_community_events_nux_first_seen_timestamp", AnonymousClass11P.A01(this.A00)).apply();
        }
        if (C18070vi.A18(obj, true) || ((SharedPreferences) r2.get()).getInt("pref_community_events_nux_times_displayed", 0) >= 3 || AnonymousClass11P.A01(this.A00) > ((SharedPreferences) r2.get()).getLong("pref_community_events_nux_first_seen_timestamp", 0) + A02) {
            C19830z4.A00(r7).putBoolean("pref_community_events_nux_seen", true).apply();
        }
    }

    public C28481aJ(AnonymousClass11P r1, C19830z4 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BVY() {
        return "community_events";
    }
}
