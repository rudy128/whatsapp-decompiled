package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;

/* renamed from: X.5ni  reason: invalid class name and case insensitive filesystem */
public class C113775ni extends C6Y {
    public final int A00;
    public final Object A01;

    public C113775ni(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A01(Drawable drawable) {
        switch (this.A00) {
            case 0:
                C454028v r0 = ((CallGrid) this.A01).A01;
                if (r0 != null) {
                    r0.start();
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(drawable, 0);
                C6Y c6y = ((StickerView) this.A01).A01;
                if (c6y != null) {
                    c6y.A01(drawable);
                    return;
                }
                return;
            default:
                ((StorageUsageDeleteCompleteDialogFragment) this.A01).A00.A0K(AnonymousClass7RI.A00(this, 40), 500);
                return;
        }
    }

    public void A02(Drawable drawable) {
        if (1 - this.A00 != 0) {
            super.A02(drawable);
            return;
        }
        C18070vi.A0d(drawable, 0);
        C6Y c6y = ((StickerView) this.A01).A01;
        if (c6y != null) {
            c6y.A02(drawable);
        }
    }
}
