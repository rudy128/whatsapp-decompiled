package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.mediacomposer.ImageComposerFragment;

/* renamed from: X.7vz  reason: invalid class name and case insensitive filesystem */
public final class C157217vz extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C98494rF $background;
    public final /* synthetic */ C98494rF $bitmap;
    public final /* synthetic */ ImageComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157217vz(ImageComposerFragment imageComposerFragment, C98494rF r3, C98494rF r4) {
        super(0);
        this.this$0 = imageComposerFragment;
        this.$bitmap = r3;
        this.$background = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ImageComposerFragment.A06((Bitmap) this.$bitmap.element, this.this$0);
        ImageView imageView = this.this$0.A03;
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) this.$background.element);
        }
        return C27621Wu.A00;
    }
}
