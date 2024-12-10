package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.80a  reason: invalid class name and case insensitive filesystem */
public final class C1582680a extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C113365my $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1582680a(C113365my r2) {
        super(1);
        this.$this_apply = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C113365my r0 = this.$this_apply;
        if (bitmap != null) {
            r0.A00.setImageBitmap(bitmap);
        } else {
            ImageView imageView = r0.A00;
            C108955ca.A1L(imageView, AnonymousClass3MZ.A02(imageView.getContext(), imageView.getContext(), 2130969324, 2131100309));
        }
        return C27621Wu.A00;
    }
}
