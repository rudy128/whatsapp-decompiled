package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaMediaThumbnailView;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.ImageComposerFragment$loadImage$recipient$1$onSuccess$1;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.7Hd  reason: invalid class name and case insensitive filesystem */
public class C144397Hd implements C1606889n {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C144397Hd(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void BCw() {
        if (this.A00 == 0) {
            C113555nH r0 = (C113555nH) this.A02;
            C108975cc.A0x(r0.A03, r0.A01);
        }
    }

    public /* synthetic */ void Bti() {
        AnonymousClass1FL A1B;
        if (this.A00 != 0 && (A1B = ((Fragment) this.A02).A1B()) != null) {
            A1B.A2Z();
        }
    }

    public void C7F(Bitmap bitmap, boolean z) {
        Object obj;
        Bitmap bitmap2 = bitmap;
        boolean z2 = z;
        if (this.A00 != 0) {
            C18070vi.A0d(bitmap, 0);
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this.A02;
            Context A1n = imageComposerFragment.A1n();
            Uri uri = imageComposerFragment.A01;
            if (A1n != null && uri != null) {
                PhotoView photoView = imageComposerFragment.A06;
                if (photoView != null) {
                    obj = photoView.getTag();
                } else {
                    obj = null;
                }
                if (obj != imageComposerFragment.A01) {
                    return;
                }
                if (imageComposerFragment.A2U()) {
                    C98494rF A002 = C98494rF.A00();
                    Bitmap bitmap3 = imageComposerFragment.A00;
                    A002.element = bitmap3;
                    if (bitmap3 != null) {
                        ImageComposerFragment.A04(A1n, bitmap3, uri, imageComposerFragment, (C160888Ai) this.A01);
                        ImageComposerFragment.A0A(imageComposerFragment, new AnonymousClass7wO(bitmap3, bitmap, imageComposerFragment, z));
                        return;
                    }
                    C37581pm A0H = AnonymousClass3MZ.A0H(imageComposerFragment);
                    C18600wl r0 = imageComposerFragment.A09;
                    if (r0 != null) {
                        AnonymousClass3MW.A1X(r0, new ImageComposerFragment$loadImage$recipient$1$onSuccess$1(A1n, bitmap2, uri, imageComposerFragment, (C160888Ai) this.A01, (C30391dr) null, A002, z2), A0H);
                    } else {
                        C18070vi.A11("ioDispatcher");
                        throw null;
                    }
                } else {
                    ImageComposerFragment.A04(A1n, bitmap, uri, imageComposerFragment, (C160888Ai) this.A01);
                    ImageComposerFragment.A05(bitmap, (Bitmap) null, imageComposerFragment, z);
                }
            }
        } else {
            C18070vi.A0d(bitmap, 0);
            C113555nH r4 = (C113555nH) this.A02;
            WaMediaThumbnailView waMediaThumbnailView = r4.A03;
            if (waMediaThumbnailView.getTag() != this.A01) {
                return;
            }
            if (bitmap.equals(AnonymousClass6YZ.A00)) {
                waMediaThumbnailView.setScaleType(ImageView.ScaleType.CENTER);
                waMediaThumbnailView.setBackgroundColor(r4.A01);
                waMediaThumbnailView.setImageResource(2131232110);
                return;
            }
            AnonymousClass3MW.A1R(waMediaThumbnailView);
            waMediaThumbnailView.setBackgroundResource(0);
            waMediaThumbnailView.setThumbnail(bitmap);
            if (!z) {
                BitmapDrawable A05 = C108965cb.A05(bitmap, waMediaThumbnailView);
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[0] = r4.A02;
                C108995ce.A10(waMediaThumbnailView, A05, drawableArr);
            }
        }
    }
}
