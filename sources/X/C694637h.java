package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.37h  reason: invalid class name and case insensitive filesystem */
public final class C694637h implements BDP {
    public final C19830z4 A00;
    public final C33841jT A01;

    public boolean CLz(C180619Ng r9, Long l, String str) {
        boolean equals = "PostRegSMBTakeover".equals(str);
        boolean equals2 = "PostRegistration".equals(str);
        AnonymousClass00H r3 = this.A00.A00;
        if ((C17880vN.A0B(r3).getInt("migration_state_on_provider_side", 0) != 1 || !equals) && equals2) {
            if (l == null || TimeUnit.MILLISECONDS.toSeconds(l.longValue()) >= C17890vO.A04(C17880vN.A0B(r3), "last_login_time") + 60) {
                return true;
            }
            Log.i("PostRegistrationIncomingPushObserver/post-registration-notification/notification-delayed");
        }
        return false;
    }

    public C694637h(C19830z4 r1, C33841jT r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BcI(C195319t9 r7, String str, Map map) {
        C17960vV.A07(str);
        if (str != null) {
            C33841jT r5 = this.A01;
            Log.i("RegistrationManager/checkIfNeedToPostPostRegistrationNotification");
            r5.A0B.BEJ(20, str);
            C19830z4 r4 = r5.A0C;
            C17880vN.A1D(C19830z4.A00(r4), "post_reg_notification_time", AnonymousClass11P.A01(r5.A09));
            r4.A2C(true);
            SharedPreferences.Editor A002 = C19830z4.A00(r4);
            A002.remove("show_pre_reg_do_not_share_code_warning");
            A002.apply();
            r5.A07();
        }
    }
}
