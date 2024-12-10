package X;

import android.graphics.Matrix;
import android.view.View;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;

/* renamed from: X.7mb  reason: invalid class name and case insensitive filesystem */
public final class C151627mb extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ImageComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151627mb(ImageComposerFragment imageComposerFragment) {
        super(0);
        this.this$0 = imageComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ImageComposerFragment imageComposerFragment = this.this$0;
        View findViewById = imageComposerFragment.A17().findViewById(2131432382);
        imageComposerFragment.A2O(findViewById);
        ImagePreviewContentLayout imagePreviewContentLayout = (ImagePreviewContentLayout) findViewById;
        boolean z = !this.this$0.A2W();
        C1419877s r2 = imagePreviewContentLayout.A02;
        r2.A0F = z;
        if (!z) {
            Matrix matrix = r2.A0I;
            matrix.set(r2.A0J);
            r2.A04 = r2.A03;
            r2.A0N.A00(matrix);
        }
        return imagePreviewContentLayout;
    }
}
