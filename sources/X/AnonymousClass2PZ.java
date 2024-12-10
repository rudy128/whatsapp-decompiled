package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2PZ  reason: invalid class name */
public final class AnonymousClass2PZ extends A34 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C29491cN A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public AnonymousClass2PZ(Context context, C29491cN r2, String str, String str2, String str3, int i, boolean z) {
        this.A04 = str;
        this.A02 = r2;
        this.A03 = str2;
        this.A01 = context;
        this.A06 = z;
        this.A00 = i;
        this.A05 = str3;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C62562rb A0C;
        String str = this.A04;
        int i = 0;
        if (str == null || str.length() == 0) {
            A0C = C17880vN.A0J(this.A02.A0F).A0C(this.A03);
        } else {
            A0C = this.A02.A06(str, false, false);
        }
        if (A0C != null) {
            i = A0C.A01;
        }
        return Integer.valueOf(i);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        C29491cN r5 = this.A02;
        Log.i("AccountSwitcher/clearExistingNotifications");
        ((C27301Vn) r5.A0K.get()).BEJ(57, "clearNotificationsBeforeAccountSwitching");
        Context context = this.A01;
        String str = this.A04;
        if (str != null) {
            String str2 = this.A03;
            boolean z = this.A06;
            int i = this.A00;
            String str3 = this.A05;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String A012 = r5.A0B.A01();
            Intent A0A = C17880vN.A0A();
            A0A.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
            A0A.putExtra("request_type", 2);
            A0A.putExtra("switch_to_account_lid", str);
            A0A.putExtra("switch_to_account_dir_id", str2);
            A0A.putExtra("is_missed_call_notification", z);
            A0A.putExtra("source", i);
            A0A.putExtra("inactive_account_num_pending_message_notifs", A0M);
            A0A.putExtra("switching_start_time_ms", elapsedRealtime);
            if (!(str3 == null || str3.length() == 0)) {
                A0A.putExtra("account_switching_sender_jid", str3);
            }
            if (!(A012 == null || A012.length() == 0)) {
                A0A.putExtra("account_language", A012);
            }
            A0A.addFlags(268468224);
            C29491cN.A02(context, A0A, r5);
            return;
        }
        throw C17880vN.A0g();
    }
}
