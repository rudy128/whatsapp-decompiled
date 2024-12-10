package X;

import com.whatsapp.util.Log;

/* renamed from: X.3A4  reason: invalid class name */
public final class AnonymousClass3A4 implements C72303Lk {
    public final AnonymousClass00H A00;

    public AnonymousClass3A4(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void Bld() {
    }

    public void Blc() {
        AnonymousClass194 r5 = (AnonymousClass194) this.A00.get();
        Log.i("Roadblocks/onAppUpdated");
        C19830z4 r4 = r5.A02;
        C17880vN.A1D(C19830z4.A00(r4), "software_forced_expiration", 0);
        Log.i("wa-shared-prefs/clear-client-expiration-time");
        C17880vN.A1B(C19830z4.A00(r4), "client_expiration_time");
        r5.A01 = false;
    }
}
