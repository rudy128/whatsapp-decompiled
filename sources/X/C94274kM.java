package X;

import android.content.Intent;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.settings.SettingsPrivacy;

/* renamed from: X.4kM  reason: invalid class name and case insensitive filesystem */
public class C94274kM implements C72093Kp {
    public final int A00;
    public final Object A01;

    public C94274kM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CC1() {
        switch (this.A00) {
            case 0:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A01;
                C91604fx.A00(groupChatInfoActivity, groupChatInfoActivity.A0J.A03(groupChatInfoActivity.A0v.A0J, groupChatInfoActivity.A1K), 24);
                return;
            case 1:
                GroupChatInfoActivity.A1M((GroupChatInfoActivity) this.A01, true);
                return;
            default:
                SettingsPrivacy settingsPrivacy = (SettingsPrivacy) this.A01;
                Intent A06 = AnonymousClass3MZ.A06(settingsPrivacy.A0x);
                A06.setClassName(settingsPrivacy.getPackageName(), "com.whatsapp.settings.SettingsContactsActivity");
                settingsPrivacy.startActivity(A06);
                return;
        }
    }
}
