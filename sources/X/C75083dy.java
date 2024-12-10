package X;

import android.content.Intent;
import com.whatsapp.Me;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.3dy  reason: invalid class name and case insensitive filesystem */
public abstract class C75083dy extends AnonymousClass1FY {
    public C33841jT A00;

    public final void A4b() {
        String A0n = this.A0A.A0n();
        C18070vi.A0X(A0n);
        String A0l = this.A0A.A0l();
        C18070vi.A0X(A0l);
        Intent A01 = AnonymousClass1LU.A01(this);
        if (AnonymousClass11P.A01(this.A05) < C17890vO.A05(C72453Mb.A0M(this), "post_reg_notification_time") + 1800000) {
            A01.putExtra("com.whatsapp.registration.RegisterPhone.phone_number", A0n);
            A01.putExtra("com.whatsapp.registration.RegisterPhone.country_code", A0l);
            A01.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
        }
        C33841jT r0 = this.A00;
        if (r0 != null) {
            r0.A04();
            C33841jT r1 = this.A00;
            if (r1 != null) {
                C33841jT.A03(r1, 0, true);
                startActivity(A01);
                return;
            }
        }
        C18070vi.A11("registrationManager");
        throw null;
    }

    public final void A4c() {
        PhoneUserJid A002 = AnonymousClass11S.A00(this.A02);
        if (A002 != null) {
            C19830z4 r0 = this.A0A;
            C17880vN.A1E(C19830z4.A00(r0), "saved_user_before_logout", A002.user);
            AnonymousClass11S r02 = this.A02;
            r02.A0I();
            Me me = r02.A00;
            if (me != null) {
                if (C18020vd.A05(C18040vf.A02, this.A0E, 11167)) {
                    C19830z4 r03 = this.A0A;
                    C17880vN.A1E(C19830z4.A00(r03), "pref_country_code_of_logged_out_user", me.cc);
                    C19830z4 r04 = this.A0A;
                    C17880vN.A1E(C19830z4.A00(r04), "pref_phone_number_of_logged_out_user", me.number);
                    return;
                }
            }
            if (C18020vd.A05(C18040vf.A02, this.A0E, 11167)) {
                this.A03.A0G("saveUserDuringLogout me is null", "me is null", false);
            }
        }
    }
}
