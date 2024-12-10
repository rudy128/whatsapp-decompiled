package X;

import com.whatsapp.dobverification.AgeAppealTokenManager$refreshIdvTokenIfDue$1;

/* renamed from: X.7Ex  reason: invalid class name and case insensitive filesystem */
public final class C143817Ex implements C72113Kr {
    public final AnonymousClass00H A00;

    public C143817Ex(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void Bqf() {
        C129656i9 r4 = (C129656i9) this.A00.get();
        long A002 = AnonymousClass11P.A00(r4.A00);
        C18100vl r3 = r4.A01.A00;
        if (A002 > C17890vO.A04(C18070vi.A03(r3), "idv_token_refresh_end_time_secs")) {
            C17880vN.A1F(C108995ce.A0E(r3), "idv_token_refresh_started", false);
        } else if (C17880vN.A1W(C18070vi.A03(r3), "idv_token_refresh_started")) {
            AnonymousClass3MW.A1X(r4.A03, new AgeAppealTokenManager$refreshIdvTokenIfDue$1(r4, (C30391dr) null), r4.A04);
        }
    }
}
