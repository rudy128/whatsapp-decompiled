package X;

import android.content.SharedPreferences;

/* renamed from: X.9tE  reason: invalid class name and case insensitive filesystem */
public final class C195369tE {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass11P A05;

    public final String A01() {
        SharedPreferences.Editor putLong;
        AnonymousClass00H r8 = this.A04;
        String A0r = C17880vN.A0r(((C190139kR) r8.get()).A00(), "pref_saved_fs_search_session_id");
        if (!(A0r == null || A0r.length() == 0)) {
            long j = ((C190139kR) r8.get()).A00().getLong("pref_saved_fs_search_session_ts", 0);
            if (j != 0 && AnonymousClass8BR.A04(j) < 1800000) {
                putLong = AnonymousClass8BX.A0C(r8).putLong("pref_saved_fs_search_session_ts", System.currentTimeMillis());
                putLong.apply();
                return A0r;
            }
        }
        A0r = C108985cd.A0f();
        C17880vN.A1E(AnonymousClass8BX.A0C(r8), "pref_saved_fs_search_session_id", A0r);
        putLong = AnonymousClass8BX.A0C(r8).putLong("pref_saved_fs_search_session_ts", System.currentTimeMillis());
        putLong.apply();
        return A0r;
    }

    public final String A02() {
        AnonymousClass00H r6 = this.A04;
        String A0r = C17880vN.A0r(((C190139kR) r6.get()).A00(), "pref_saved_ps_search_session_id");
        if (!(A0r == null || A0r.length() == 0)) {
            long j = ((C190139kR) r6.get()).A00().getLong("pref_saved_ps_search_session_ts", 0);
            if (j != 0 && AnonymousClass8BR.A04(j) < 1800000) {
                C17880vN.A1D(AnonymousClass8BX.A0C(r6), "pref_saved_ps_search_session_ts", System.currentTimeMillis());
                return A0r;
            }
        }
        return A00();
    }

    public C195369tE(AnonymousClass11P r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A05 = r1;
        this.A04 = r2;
    }

    public final String A00() {
        String A0f = C108985cd.A0f();
        AnonymousClass00H r4 = this.A04;
        C17880vN.A1E(AnonymousClass8BX.A0C(r4), "pref_saved_ps_search_session_id", A0f);
        C17880vN.A1D(AnonymousClass8BX.A0C(r4), "pref_saved_ps_search_session_ts", System.currentTimeMillis());
        C17880vN.A1C(AnonymousClass8BX.A0C(r4), "pref_saved_search_session_action_order", 0);
        return A0f;
    }
}
