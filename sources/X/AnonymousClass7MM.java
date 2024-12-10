package X;

import android.widget.FrameLayout;
import com.whatsapp.stickers.StickerView;
import java.util.List;

/* renamed from: X.7MM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7MM implements AnonymousClass889 {
    public final /* synthetic */ C1418377d A00;
    public final /* synthetic */ C113465n8 A01;

    public final void C6q(boolean z) {
        C113465n8 r5 = this.A01;
        C1418377d r4 = this.A00;
        List list = C42011xT.A0I;
        if (z) {
            FrameLayout frameLayout = r5.A02;
            AnonymousClass73J.A03(frameLayout, true, r5.A00);
            C108955ca.A1B(AnonymousClass3MY.A04(r5.A0H), frameLayout, r4);
            StickerView stickerView = r5.A05;
            stickerView.A03 = true;
            stickerView.A07();
            stickerView.setDisabled(false);
            stickerView.requestLayout();
        }
    }

    public /* synthetic */ AnonymousClass7MM(C1418377d r1, C113465n8 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
