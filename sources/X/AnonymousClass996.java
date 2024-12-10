package X;

import android.view.Menu;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel;

/* renamed from: X.996  reason: invalid class name */
public abstract class AnonymousClass996 extends C166698dp {
    public AnonymousClass4SH A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C21979Avh(this));

    public AnonymousClass996(boolean z, boolean z2) {
        super(true, false);
        AGE.A00(this, 27);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        String str;
        C18070vi.A0d(menu, 0);
        AnonymousClass4SH r3 = this.A00;
        if (r3 != null) {
            RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel = (RegistrationAudioGuidanceViewModel) this.A01.getValue();
            if (this instanceof RegisterName) {
                str = ((RegisterName) this).A1R;
            } else {
                str = ((RestoreFromBackupActivity) this).A0i;
            }
            r3.A00(menu, this, registrationAudioGuidanceViewModel, str);
            return super.onCreateOptionsMenu(menu);
        }
        C18070vi.A11("registrationAudioGuidanceSetupManager");
        throw null;
    }

    public final void A4f() {
        String str;
        String str2;
        AnonymousClass4SH r4 = this.A00;
        if (r4 != null) {
            RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel = (RegistrationAudioGuidanceViewModel) this.A01.getValue();
            if (this instanceof RegisterName) {
                str = ((RegisterName) this).A1R;
                str2 = "profile_photo";
            } else {
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this;
                str = restoreFromBackupActivity.A0i;
                str2 = restoreFromBackupActivity.A0j;
            }
            r4.A01(this, registrationAudioGuidanceViewModel, str, str2);
            return;
        }
        C18070vi.A11("registrationAudioGuidanceSetupManager");
        throw null;
    }

    public void onStart() {
        super.onStart();
        A4f();
    }

    public void onStop() {
        super.onStop();
        ((RegistrationAudioGuidanceViewModel) this.A01.getValue()).A0U(false);
    }

    public AnonymousClass996() {
        super(true, true);
        AGE.A00(this, 27);
    }
}
