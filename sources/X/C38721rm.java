package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1rm  reason: invalid class name and case insensitive filesystem */
public final class C38721rm {
    public final C19830z4 A00;
    public final C18030ve A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1LE A03;

    public C38721rm(AnonymousClass11P r2, C19830z4 r3, C18030ve r4, AnonymousClass1LE r5) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r3, 4);
        this.A02 = r2;
        this.A01 = r4;
        this.A03 = r5;
        this.A00 = r3;
    }

    public final void A00() {
        C19830z4 r2 = this.A00;
        C19830z4.A00(r2).remove("create_group_tool_tip_nudge_count").apply();
        C19830z4.A00(r2).remove("create_group_tool_tip_nudge_next_show_time").apply();
        C19830z4.A00(r2).remove("create_group_tool_tip_nudge_last_impression_time").apply();
        C19830z4.A00(r2).remove("create_group_tool_tip_nudge_show_time").apply();
        C19830z4.A00(r2).remove("create_group_tool_tip_temp_dismissed").apply();
        C19830z4.A00(r2).putBoolean("create_group_tool_tip_perm_dismissed", true).apply();
    }

    public final void A01() {
        TimeUnit timeUnit;
        long j;
        C19830z4 r5 = this.A00;
        C19830z4.A00(r5).putBoolean("create_group_tool_tip_temp_dismissed", true).apply();
        int A06 = r5.A06() + 1;
        if (A06 <= 7) {
            long currentTimeMillis = System.currentTimeMillis();
            if (A06 == 2 || A06 == 3) {
                timeUnit = TimeUnit.DAYS;
                j = 7;
            } else {
                timeUnit = TimeUnit.DAYS;
                j = 30;
            }
            C19830z4.A00(r5).putLong("create_group_tool_tip_nudge_next_show_time", currentTimeMillis + timeUnit.toMillis(j)).apply();
        }
    }

    public final boolean A02() {
        int A06;
        if (C18020vd.A05(C18040vf.A02, this.A01, 5288)) {
            C19830z4 r3 = this.A00;
            AnonymousClass00H r2 = r3.A00;
            if (((SharedPreferences) r2.get()).getBoolean("create_group_tool_tip_perm_dismissed", false) || this.A03.A00() || (!((SharedPreferences) r2.get()).getBoolean("one_of_create_group_tool_tip_activated", false) && ((A06 = r3.A06()) > 7 || (A06 != 0 && ((SharedPreferences) r2.get()).getBoolean("create_group_tool_tip_temp_dismissed", false) && System.currentTimeMillis() <= ((SharedPreferences) r2.get()).getLong("create_group_tool_tip_nudge_next_show_time", 0))))) {
                return false;
            }
            return true;
        }
        return false;
    }
}
