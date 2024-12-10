package X;

import android.app.Dialog;
import android.os.Handler;

public final class BZZ extends AnonymousClass2S2 {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ C27076DTa A01;

    public BZZ(Dialog dialog, C27076DTa dTa) {
        this.A01 = dTa;
        this.A00 = dialog;
    }

    public final void A00() {
        BZQ bzq = (BZQ) this.A01.A01;
        bzq.A04.set((Object) null);
        Handler handler = bzq.A03.A06;
        handler.sendMessage(handler.obtainMessage(3));
        Dialog dialog = this.A00;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
