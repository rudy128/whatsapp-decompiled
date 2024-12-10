package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.whatsapp.registration.PreRegNotificationLearnMoreReceiver;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.37f  reason: invalid class name and case insensitive filesystem */
public final class C694437f implements BDP {
    public final C33841jT A00;

    public C694437f(C33841jT r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BcI(C195319t9 r8, String str, Map map) {
        String str2;
        C33841jT r5 = this.A00;
        if (!r5.A0J.A04()) {
            str2 = "RegistrationManager/checkIfNeedToPostPreRegistrationNotification/not-verified";
        } else {
            C19830z4 r3 = r5.A0C;
            if (C17880vN.A1W(C17890vO.A0B(r3), "chat_transfer_in_progress")) {
                str2 = "RegistrationManager/checkIfNeedToPostPreRegistrationNotification/skipped-chat-transfer-in-progress";
            } else {
                Log.i("RegistrationManager/checkIfNeedToPostPreRegistrationNotification");
                Context context = r5.A0A.A00;
                String string = context.getString(2131899103);
                SharedPreferences.Editor A002 = C19830z4.A00(r3);
                A002.putBoolean("show_pre_reg_do_not_share_code_warning", true);
                A002.apply();
                C1409673t A003 = C33841jT.A00(r5, string, context.getString(2131893056), C17880vN.A0q(context, string, new Object[1], 0, 2131893057));
                A003.A0Q.add(new C139316yd(2131232043, context.getString(2131899101), C1408573i.A01(context, 0, new Intent(context, PreRegNotificationLearnMoreReceiver.class), 268435456)));
                r5.A0B.BkR(20, A003.A05());
                return;
            }
        }
        Log.i(str2);
    }

    public boolean CLz(C180619Ng r2, Long l, String str) {
        return "PreRegistration".equalsIgnoreCase(str);
    }
}
