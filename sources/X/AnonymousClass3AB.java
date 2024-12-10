package X;

import android.content.Context;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;

/* renamed from: X.3AB  reason: invalid class name */
public final class AnonymousClass3AB implements C72303Lk {
    public final Context A00;
    public final AnonymousClass11S A01;
    public final C19830z4 A02;
    public final C25081Mu A03;

    public /* synthetic */ void Bld() {
    }

    public void Blc() {
        C19830z4 r3 = this.A02;
        C17890vO.A0B(r3).getInt("c2dm_app_vers", 0);
        r3.A0g();
        AnonymousClass11S r0 = this.A01;
        r0.A0I();
        if (r0.A00 != null) {
            Log.i("updatedappreceiver/request-refresh");
            RegistrationIntentService.A01(this.A00.getApplicationContext(), this.A03);
            return;
        }
        Log.i("updateappreceiver/skip-refresh");
    }

    public AnonymousClass3AB(Context context, AnonymousClass11S r2, C19830z4 r3, C25081Mu r4) {
        C18070vi.A0p(r2, r4, r3);
        this.A00 = context;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
