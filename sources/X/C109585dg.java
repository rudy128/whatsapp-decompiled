package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;

/* renamed from: X.5dg  reason: invalid class name and case insensitive filesystem */
public final class C109585dg extends Handler {
    public final /* synthetic */ AnonymousClass72m A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109585dg(Looper looper, AnonymousClass72m r2) {
        super(looper);
        this.A00 = r2;
        C17960vV.A07(looper);
    }

    public void handleMessage(Message message) {
        if (message.obj != null) {
            String A0s = C108955ca.A0s(message.getData(), "tag_bundle_key");
            ShapeItemView shapeItemView = (ShapeItemView) message.obj;
            if (A0s.equals(shapeItemView.A01)) {
                C127466eP r1 = (C127466eP) shapeItemView.getTag();
                shapeItemView.setImageDrawable(r1.A00);
                shapeItemView.setContentDescription(r1.A01);
            }
        }
    }
}
