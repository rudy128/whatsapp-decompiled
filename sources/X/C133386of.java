package X;

import android.graphics.Matrix;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;

/* renamed from: X.6of  reason: invalid class name and case insensitive filesystem */
public final class C133386of {
    public final /* synthetic */ ImagePreviewContentLayout A00;

    public C133386of(ImagePreviewContentLayout imagePreviewContentLayout) {
        this.A00 = imagePreviewContentLayout;
    }

    public void A00(Matrix matrix) {
        ImagePreviewContentLayout imagePreviewContentLayout = this.A00;
        AnonymousClass7JF r1 = imagePreviewContentLayout.A00;
        if (r1 != null) {
            r1.A0Q.A05.set(matrix);
            r1.A0P.invalidate();
        }
        imagePreviewContentLayout.invalidate();
    }

    public void A01(boolean z) {
        ImageComposerFragment imageComposerFragment;
        boolean z2;
        boolean z3;
        AnonymousClass85G r0 = this.A00.A01;
        if (z) {
            if (r0 != null) {
                imageComposerFragment = ((AnonymousClass7J9) r0).A00;
                z2 = true;
                z3 = false;
            } else {
                return;
            }
        } else if (r0 != null) {
            imageComposerFragment = ((AnonymousClass7J9) r0).A00;
            z2 = false;
            z3 = true;
        } else {
            return;
        }
        ImageComposerFragment.A0B(imageComposerFragment, z2, z3);
    }
}
