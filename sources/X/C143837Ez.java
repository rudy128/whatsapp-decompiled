package X;

import android.content.SharedPreferences;

/* renamed from: X.7Ez  reason: invalid class name and case insensitive filesystem */
public final class C143837Ez implements C72113Kr {
    public final AnonymousClass00H A00;

    public C143837Ez(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void Bqf() {
        AnonymousClass6q2 r2 = (AnonymousClass6q2) this.A00.get();
        AnonymousClass00H r3 = r2.A00.A00;
        if (C17880vN.A1W(C17880vN.A0B(r3), "automatic_account_report_enabled") && r2.A01(C17890vO.A05(C17880vN.A0B(r3), "automatic_account_report_requested_ts_sec"))) {
            r2.A00(AnonymousClass00R.A01);
        }
        if (C17880vN.A1W(C17880vN.A0B(r3), "automatic_channel_report_enabled") && r2.A01(C17890vO.A05(C17880vN.A0B(r3), "automatic_channels_report_requested_ts_sec"))) {
            r2.A00(AnonymousClass00R.A0C);
        }
        SharedPreferences sharedPreferences = r2.A03.A00;
        if (C17880vN.A1W(sharedPreferences, "automatic_wamo_report_enabled") && r2.A01(C17890vO.A05(sharedPreferences, "automatic_wamo_report_requested_ts_sec"))) {
            r2.A00(AnonymousClass00R.A0N);
        }
    }
}
