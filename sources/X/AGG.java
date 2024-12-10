package X;

import android.content.Intent;
import androidx.preference.Preference;
import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment;

public final class AGG implements AnonymousClass02j {
    public String A00;
    public final /* synthetic */ NotificationsAndSoundsFragment A01;

    public AGG(NotificationsAndSoundsFragment notificationsAndSoundsFragment) {
        this.A01 = notificationsAndSoundsFragment;
    }

    public /* bridge */ /* synthetic */ void Bkx(Object obj) {
        Object obj2;
        B6V b6v;
        C005702m r6 = (C005702m) obj;
        C18070vi.A0d(r6, 0);
        String str = this.A00;
        if (str != null) {
            NotificationsAndSoundsFragment notificationsAndSoundsFragment = this.A01;
            if (r6.A00 != -1) {
                return;
            }
            if (str.equals("jid_message_tone") || str.equals("jid_call_ringtone")) {
                Intent intent = r6.A01;
                if (intent != null) {
                    obj2 = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                } else {
                    obj2 = null;
                }
                Preference BLF = notificationsAndSoundsFragment.BLF(str);
                if (BLF != null && (b6v = BLF.A0A) != null) {
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    b6v.C1R(BLF, obj2);
                }
            }
        }
    }
}
