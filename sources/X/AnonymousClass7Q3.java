package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.7Q3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Q3 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C139336yf A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void run() {
        C139336yf r4 = this.A02;
        Context context = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        int i = this.A00;
        C33841jT r3 = r4.A05;
        r3.A04();
        C33841jT.A03(r3, 21, true);
        C17880vN.A1F(C19830z4.A00(r4.A04), "support_ban_appeal_user_banned_from_chat_disconnect", true);
        r4.A01.A02();
        if (r4.A00.A00 == null) {
            C31081ez.A02("WfacManager/startWfacFlow/showLoginFailureNotificationIfNeeded");
            r3.A0B();
            return;
        }
        C31081ez.A02("WfacManager/startWfacFlow/launching-wfac-ban");
        Intent A002 = C139336yf.A00(context, str, str2, (String) null, 59, i, 3);
        A002.setFlags(268468224);
        context.startActivity(A002);
    }

    public /* synthetic */ AnonymousClass7Q3(Context context, C139336yf r2, String str, String str2, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
    }
}
