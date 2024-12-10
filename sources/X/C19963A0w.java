package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.A0w  reason: case insensitive filesystem */
public class C19963A0w {
    public final AnonymousClass1KB A00;
    public final C134076py A01;
    public final AnonymousClass11P A02;

    public void A02(long j, long j2) {
        C192309o9 r2 = this.A01.A05;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountDefenceLocalDataRepository/save-original-wait-time-diffs ");
        A10.append(j);
        C17900vP.A0m(", ", A10, j2);
        SharedPreferences.Editor A08 = AnonymousClass8BU.A08(r2.A00, "AccountDefenceLocalDataRepository_prefs");
        A08.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_sms_wait_time", j);
        A08.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_voice_wait_time", j2);
        A08.apply();
    }

    public C19963A0w(AnonymousClass1KB r1, AnonymousClass11P r2, C134076py r3) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = r3;
    }

    public static boolean A00(VerifyPhoneNumber verifyPhoneNumber) {
        int A4e = verifyPhoneNumber.A4e();
        if (A4e == 13 || A4e == 14) {
            return true;
        }
        return false;
    }

    public SpannableStringBuilder A01(Activity activity, String str, int i) {
        int i2;
        String A0R;
        C17900vP.A0j("AccountDefenceSecondCodeViewPresenter/getAccountDefenceTopDescription for state:", AnonymousClass000.A10(), i);
        if (i == 1 || i == 2) {
            i2 = 2131886310;
            A0R = C17890vO.A0R(activity, str, 1, 0, i2);
        } else if (i != 3) {
            A0R = activity.getString(2131886341);
        } else {
            i2 = 2131886309;
            A0R = C17890vO.A0R(activity, str, 1, 0, i2);
        }
        return A3H.A02(activity, new C21449AkG((Object) activity, 2), A0R, "learn-more");
    }
}
