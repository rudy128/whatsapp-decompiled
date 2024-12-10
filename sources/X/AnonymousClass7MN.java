package X;

import android.widget.FrameLayout;
import com.whatsapp.stickers.StickerView;
import java.util.List;

/* renamed from: X.7MN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7MN implements AnonymousClass889 {
    public final /* synthetic */ AnonymousClass61I A00;
    public final /* synthetic */ C1418377d A01;
    public final /* synthetic */ boolean A02;

    public final void C6q(boolean z) {
        AnonymousClass61I r5 = this.A00;
        C1418377d r4 = this.A01;
        boolean z2 = this.A02;
        List list = C42011xT.A0I;
        if (z) {
            FrameLayout frameLayout = r5.A06;
            AnonymousClass73J.A03(frameLayout, z2, r5.A02);
            C108955ca.A1B(AnonymousClass3MY.A04(r5.A0H), frameLayout, r4);
            if (r5.A03 && r5.A01) {
                StickerView stickerView = r5.A0B;
                stickerView.A03 = true;
                stickerView.A07();
            }
            StickerView stickerView2 = r5.A0B;
            stickerView2.setDisabled(false);
            stickerView2.requestLayout();
        }
    }

    public /* synthetic */ AnonymousClass7MN(AnonymousClass61I r1, C1418377d r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }
}
