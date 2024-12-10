package X;

import android.view.View;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.7MP  reason: invalid class name */
public class AnonymousClass7MP implements AnonymousClass889 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass7MP(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A01 = i;
        this.A03 = obj;
        this.A04 = obj2;
    }

    public final void C6q(boolean z) {
        C1418377d r1;
        StickerView stickerView;
        int i = this.A00;
        C112345lK r3 = (C112345lK) this.A02;
        int i2 = this.A01;
        Object obj = this.A03;
        if (i != 0) {
            StickerView stickerView2 = (StickerView) obj;
            r1 = (C1418377d) this.A04;
            C112345lK.A01(stickerView2, r3, i2, z);
            stickerView = stickerView2;
        } else {
            r1 = (C1418377d) this.A04;
            C112345lK.A03(r3, i2, z);
            stickerView = (View) obj;
        }
        C108955ca.A1B(stickerView.getContext(), stickerView, r1);
    }
}
