package X;

import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.7GD  reason: invalid class name */
public class AnonymousClass7GD implements C107395Zn {
    public final int A00;
    public final Object A01;

    public AnonymousClass7GD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BsX(AnonymousClass737 r3) {
        C107845ai r1;
        switch (this.A00) {
            case 0:
                r1 = ((SharedTextPreviewDialogFragment) this.A01).A0a;
                break;
            case 1:
                r1 = ((C130696jr) this.A01).A04;
                break;
            case 2:
                C18070vi.A0d(r3, 1);
                r1 = ((C109235d2) this.A01).A0B;
                break;
            case 3:
                r1 = ((PopupNotification) this.A01).A1X;
                break;
            case 4:
                r1 = ((MessageReplyActivity) this.A01).A1k;
                break;
            default:
                C18070vi.A0d(r3, 1);
                r1 = ((TextStatusComposerFragment) this.A01).A1K;
                break;
        }
        r1.BsW(r3.A00);
    }
}
