package X;

import android.view.Menu;
import com.whatsapp.passkeys.PasskeyCreateEducationScreen;
import com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel;
import com.whatsapp.registration.email.EmailEducationScreen;
import com.whatsapp.registration.email.RegisterEmail;
import com.whatsapp.registration.email.VerifyEmail;

/* renamed from: X.8eI  reason: invalid class name and case insensitive filesystem */
public abstract class C166908eI extends AnonymousClass1FY {
    public AnonymousClass4SH A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C21978Avg(this));

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        AnonymousClass4SH r2 = this.A00;
        if (r2 != null) {
            r2.A00(menu, this, (RegistrationAudioGuidanceViewModel) this.A01.getValue(), A4b());
            return super.onCreateOptionsMenu(menu);
        }
        C18070vi.A11("registrationAudioGuidanceSetupManager");
        throw null;
    }

    public String A4b() {
        if (this instanceof VerifyEmail) {
            return "verify_email";
        }
        if (this instanceof RegisterEmail) {
            return "add_email";
        }
        if (this instanceof EmailEducationScreen) {
            return "email_upsell";
        }
        if (this instanceof PasskeyCreateEducationScreen) {
            return "passkey_upsell";
        }
        return "restore_or_transfer_chats";
    }

    public String A4c() {
        if (this instanceof VerifyEmail) {
            return "verify_email_otp";
        }
        if (this instanceof RegisterEmail) {
            return "register_email";
        }
        if (this instanceof EmailEducationScreen) {
            return "email_education";
        }
        if (this instanceof PasskeyCreateEducationScreen) {
            return "passkey_create_education";
        }
        return "restore_or_transfer_chats";
    }

    public final void A4d() {
        AnonymousClass4SH r3 = this.A00;
        if (r3 != null) {
            r3.A01(this, (RegistrationAudioGuidanceViewModel) this.A01.getValue(), A4b(), A4c());
        } else {
            C18070vi.A11("registrationAudioGuidanceSetupManager");
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        A4d();
    }

    public void onStop() {
        super.onStop();
        ((RegistrationAudioGuidanceViewModel) this.A01.getValue()).A0U(false);
    }
}
