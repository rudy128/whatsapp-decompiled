package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.mediacomposer.ImageComposerFragment;

/* renamed from: X.7wO  reason: invalid class name */
public final class AnonymousClass7wO extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Bitmap $backgroundBitmap;
    public final /* synthetic */ boolean $cached;
    public final /* synthetic */ Bitmap $result;
    public final /* synthetic */ ImageComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wO(Bitmap bitmap, Bitmap bitmap2, ImageComposerFragment imageComposerFragment, boolean z) {
        super(0);
        this.this$0 = imageComposerFragment;
        this.$backgroundBitmap = bitmap;
        this.$cached = z;
        this.$result = bitmap2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ImageView imageView = this.this$0.A03;
        if (imageView != null) {
            imageView.setImageBitmap(this.$backgroundBitmap);
        }
        ImageComposerFragment.A05(this.$result, this.$backgroundBitmap, this.this$0, this.$cached);
        return C27621Wu.A00;
    }
}
