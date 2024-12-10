package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.7QB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C136576u2 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public final void run() {
        C136576u2 r10 = this.A02;
        Context context = this.A01;
        boolean z = this.A05;
        int i = this.A00;
        String str = this.A03;
        String str2 = this.A04;
        C33841jT r3 = r10.A05;
        r3.A04();
        C33841jT.A03(r3, 9, true);
        C19830z4 r9 = r10.A04;
        C17880vN.A1F(C19830z4.A00(r9), "support_ban_appeal_user_banned_from_chat_disconnect", true);
        C17880vN.A1F(C19830z4.A00(r9), "support_ban_appeal_screen_before_verification", true);
        r10.A01.A02();
        if (r10.A00.A00 == null) {
            Log.i("banmanager/startPermanentBanFlow/showLoginFailureNotificationIfNeeded");
            r3.A0B();
            return;
        }
        Log.i("banmanager/startPermanentBanFlow/launching-banappeals");
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context.getPackageName(), "com.whatsapp.userban.ui.BanAppealActivity");
        A0A.putExtra("is_eu_smb", z);
        A0A.putExtra("ban_violation_type", i);
        A0A.putExtra("ban_violation_reason", str);
        A0A.putExtra("appeal_request_token", str2);
        A0A.putExtra("launch_source", 3);
        A0A.setFlags(268468224);
        context.startActivity(A0A);
    }

    public /* synthetic */ AnonymousClass7QB(Context context, C136576u2 r2, String str, String str2, int i, boolean z) {
        this.A02 = r2;
        this.A01 = context;
        this.A05 = z;
        this.A00 = i;
        this.A03 = str;
        this.A04 = str2;
    }
}
