package X;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.7EQ  reason: invalid class name */
public class AnonymousClass7EQ implements C108535br {
    public final int A00;
    public final Object A01;

    public AnonymousClass7EQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C56() {
        if (this.A00 != 0) {
            MessageReplyActivity.A13((MessageReplyActivity) this.A01, false);
        } else {
            PopupNotification.A0q((PopupNotification) this.A01);
        }
    }

    public void CAL() {
        AnonymousClass74M r2;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            MessageReplyActivity messageReplyActivity = (MessageReplyActivity) obj;
            if ((!C108975cc.A1E(messageReplyActivity) && messageReplyActivity.A0c.A01()) || (r2 = messageReplyActivity.A14) == null) {
                return;
            }
        } else {
            PopupNotification popupNotification = (PopupNotification) obj;
            if (!popupNotification.A0k.A01()) {
                r2 = popupNotification.A15;
            } else {
                return;
            }
        }
        r2.A0Q(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r2.A0c.A01() != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 == null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean CAN(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            int r0 = r3.A00
            java.lang.Object r2 = r3.A01
            if (r0 == 0) goto L_0x001f
            com.whatsapp.status.playback.MessageReplyActivity r2 = (com.whatsapp.status.playback.MessageReplyActivity) r2
            boolean r0 = X.C108975cc.A1E(r2)
            r1 = 0
            if (r0 != 0) goto L_0x0017
            X.3xv r0 = r2.A0c
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x001e
        L_0x0017:
            X.74M r0 = r2.A14
            if (r0 == 0) goto L_0x001e
        L_0x001b:
            r0.A0d(r5, r4, r1)
        L_0x001e:
            return r1
        L_0x001f:
            com.whatsapp.notification.PopupNotification r2 = (com.whatsapp.notification.PopupNotification) r2
            X.4UI r0 = r2.A0k
            boolean r0 = r0.A01()
            r1 = 0
            if (r0 != 0) goto L_0x001e
            X.74M r0 = r2.A15
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7EQ.CAN(android.view.View, android.view.MotionEvent):boolean");
    }

    public /* synthetic */ void BlL() {
    }

    public /* synthetic */ void C2D() {
    }

    public /* synthetic */ boolean C2E(MotionEvent motionEvent) {
        return false;
    }

    public /* synthetic */ boolean CAJ(int i, KeyEvent keyEvent) {
        return false;
    }
}
