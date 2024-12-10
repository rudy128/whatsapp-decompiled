package X;

import android.graphics.Bitmap;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;

/* renamed from: X.80G  reason: invalid class name */
public final class AnonymousClass80G extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ TitleBarView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80G(TitleBarView titleBarView) {
        super(1);
        this.this$0 = titleBarView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C109455dT r3 = this.this$0.A0P;
            if (r3 != null) {
                i = (int) (((float) Math.min(r3.getBounds().width(), r3.getBounds().height())) * 0.4375f * r3.A00);
            } else {
                i = 0;
            }
            int i2 = i * 2;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i2, false);
            C18070vi.A0X(createScaledBitmap);
            BF3 bf3 = new BF3(this.this$0.getResources(), createScaledBitmap);
            bf3.A00();
            this.this$0.getGlobalUI().A0J(new C70643By(this.this$0, bf3, 8));
        }
        return C27621Wu.A00;
    }
}
