package X;

import android.view.KeyEvent;
import com.whatsapp.mediacomposer.ui.caption.CaptionView;
import com.whatsapp.util.Log;

/* renamed from: X.4kU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94354kU implements AnonymousClass5Z5 {
    public final /* synthetic */ CaptionView A00;
    public final /* synthetic */ C108515bp A01;

    public final void BwT(KeyEvent keyEvent, int i) {
        C108515bp r3 = this.A01;
        CaptionView captionView = this.A00;
        if (i == 4) {
            if (keyEvent != null && keyEvent.getAction() == 1) {
                Log.i("MediaCaptionDialog/dismiss/send");
                r3.onDismiss();
            }
        } else if (i == 66 && keyEvent != null && keyEvent.getAction() == 1 && captionView.A08) {
            if (keyEvent.isCtrlPressed()) {
                C72483Me.A0o(captionView.A0B);
            } else {
                r3.Bns();
            }
        }
    }

    public /* synthetic */ C94354kU(CaptionView captionView, C108515bp r2) {
        this.A01 = r2;
        this.A00 = captionView;
    }
}
