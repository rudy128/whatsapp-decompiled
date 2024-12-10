package X;

import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.7G6  reason: invalid class name */
public class AnonymousClass7G6 implements C107365Zk {
    public final int A00;
    public final Object A01;

    public AnonymousClass7G6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean Bf8() {
        AnonymousClass74M r0;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                return !((AnonymousClass4aY) obj).A3G();
            case 1:
                r0 = ((PopupNotification) obj).A15;
                break;
            default:
                r0 = ((MessageReplyActivity) obj).A14;
                break;
        }
        if (r0 == null || r0.A0J == null) {
            return true;
        }
        return false;
    }
}
