package X;

import android.content.DialogInterface;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.Me;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.settings.SettingsContactsActivity;

/* renamed from: X.4as  reason: invalid class name and case insensitive filesystem */
public class C88824as implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C88824as(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment = (DisplayExceptionDialogFactory$LoginFailedDialogFragment) this.A01;
                boolean z = this.A02;
                PhoneUserJid A002 = AnonymousClass11S.A00(displayExceptionDialogFactory$LoginFailedDialogFragment.A04);
                if (A002 != null) {
                    C19830z4 r0 = displayExceptionDialogFactory$LoginFailedDialogFragment.A08;
                    C17880vN.A1E(C19830z4.A00(r0), "saved_user_before_logout", A002.user);
                    AnonymousClass11S r02 = displayExceptionDialogFactory$LoginFailedDialogFragment.A04;
                    r02.A0I();
                    Me me = r02.A00;
                    if (me != null) {
                        if (C18020vd.A05(C18040vf.A02, displayExceptionDialogFactory$LoginFailedDialogFragment.A02, 11167)) {
                            C19830z4 r03 = displayExceptionDialogFactory$LoginFailedDialogFragment.A08;
                            C17880vN.A1E(C19830z4.A00(r03), "pref_country_code_of_logged_out_user", me.cc);
                            C19830z4 r04 = displayExceptionDialogFactory$LoginFailedDialogFragment.A08;
                            C17880vN.A1E(C19830z4.A00(r04), "pref_phone_number_of_logged_out_user", me.number);
                        }
                    }
                    if (C18020vd.A05(C18040vf.A02, displayExceptionDialogFactory$LoginFailedDialogFragment.A02, 11167)) {
                        displayExceptionDialogFactory$LoginFailedDialogFragment.A01.A0G("saveUserDuringLogout me is null", "me is null", false);
                    }
                }
                AnonymousClass1FL A1D = displayExceptionDialogFactory$LoginFailedDialogFragment.A1D();
                String string = C17890vO.A0B(displayExceptionDialogFactory$LoginFailedDialogFragment.A08).getString("main_button_url", (String) null);
                if (!z || C24605CBj.A00(string) || string == null) {
                    DisplayExceptionDialogFactory$LoginFailedDialogFragment.A00(A1D, displayExceptionDialogFactory$LoginFailedDialogFragment);
                } else {
                    displayExceptionDialogFactory$LoginFailedDialogFragment.A03.CGU(A1D, Uri.parse(string), (AnonymousClass206) null);
                }
                A1D.finishAffinity();
                return;
            case 1:
                DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment2 = (DisplayExceptionDialogFactory$LoginFailedDialogFragment) this.A01;
                boolean z2 = this.A02;
                AnonymousClass1FL A1D2 = displayExceptionDialogFactory$LoginFailedDialogFragment2.A1D();
                C36361nl r2 = displayExceptionDialogFactory$LoginFailedDialogFragment2.A03;
                String A0r = C17880vN.A0r(C17890vO.A0B(displayExceptionDialogFactory$LoginFailedDialogFragment2.A08), "secondary_button_url");
                if (!z2 || C24605CBj.A00(A0r)) {
                    A0r = "https://faq.whatsapp.com";
                }
                C72453Mb.A18(A1D2, r2, A0r);
                A1D2.finishAffinity();
                return;
            case 2:
                boolean z3 = this.A02;
                Fragment fragment = (Fragment) this.A01;
                if (z3) {
                    C72463Mc.A1A(fragment);
                    return;
                }
                return;
            default:
                SettingsContactsActivity settingsContactsActivity = (SettingsContactsActivity) this.A01;
                boolean z4 = this.A02;
                AnonymousClass1UN r05 = settingsContactsActivity.A0I;
                if (r05 != null) {
                    settingsContactsActivity.A4b(new AnonymousClass5U8(settingsContactsActivity), 2131893353, true, z4, false, r05.A09());
                    return;
                }
                C18070vi.A11("nativeContactGateKeeper");
                throw null;
        }
    }
}
