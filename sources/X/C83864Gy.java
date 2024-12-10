package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Gy  reason: invalid class name and case insensitive filesystem */
public abstract class C83864Gy {
    public static Intent A00(Context context, UserJid userJid, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context.getPackageName(), "com.whatsapp.blockbusiness.BlockBusinessActivity");
        A0A.putExtra("jid_extra", userJid.getRawString());
        A0A.putExtra("entry_point_extra", str);
        A0A.putExtra("show_success_toast_extra", z6);
        A0A.putExtra("show_report_upsell", z5);
        A0A.putExtra("should_delete_chat_post_block", z3);
        A0A.putExtra("should_launch_home_activity_post_block", z4);
        A0A.putExtra("third_party_bot", z2);
        A0A.putExtra("from_report_flow", z);
        return A0A;
    }
}
