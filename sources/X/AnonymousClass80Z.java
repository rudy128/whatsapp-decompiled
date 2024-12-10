package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.80Z  reason: invalid class name */
public final class AnonymousClass80Z extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass6BV $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80Z(AnonymousClass6BV r2) {
        super(1);
        this.$this_apply = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass6BV r0 = this.$this_apply;
        if (bitmap != null) {
            r0.A00.setImageBitmap(bitmap);
        } else {
            ImageView imageView = r0.A00;
            C108955ca.A1L(imageView, AnonymousClass3MZ.A02(imageView.getContext(), imageView.getContext(), 2130969324, 2131100309));
        }
        return C27621Wu.A00;
    }
}
