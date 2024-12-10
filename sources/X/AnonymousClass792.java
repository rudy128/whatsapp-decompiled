package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.792  reason: invalid class name */
public final /* synthetic */ class AnonymousClass792 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ BottomSheetBehavior A02;
    public final /* synthetic */ GalleryTabHostFragment A03;
    public final /* synthetic */ C22811Dh A04;

    public final void onGlobalLayout() {
        GalleryTabHostFragment galleryTabHostFragment = this.A03;
        View view = this.A01;
        C22811Dh r8 = this.A04;
        BottomSheetBehavior bottomSheetBehavior = this.A02;
        Rect rect = this.A00;
        C18070vi.A0d(r8, 2);
        C18070vi.A0d(rect, 4);
        AnonymousClass00H r0 = galleryTabHostFragment.A0P;
        if (r0 != null) {
            r0.get();
            boolean A002 = AnonymousClass1L4.A00(view);
            if (A002 != r8.element) {
                r8.element = A002;
                if (!A002) {
                    C108965cb.A0P(galleryTabHostFragment).A05.A0F(AnonymousClass7HP.A00);
                    bottomSheetBehavior.A0h = false;
                } else {
                    int i = bottomSheetBehavior.A0J;
                    if (i == 6 || i == 4) {
                        bottomSheetBehavior.A0h = true;
                        bottomSheetBehavior.A0W(3);
                    }
                }
                GalleryTabHostFragment.A0E(rect, view, galleryTabHostFragment);
                return;
            }
            return;
        }
        C18070vi.A11("imeUtils");
        throw null;
    }

    public /* synthetic */ AnonymousClass792(Rect rect, View view, BottomSheetBehavior bottomSheetBehavior, GalleryTabHostFragment galleryTabHostFragment, C22811Dh r5) {
        this.A03 = galleryTabHostFragment;
        this.A01 = view;
        this.A04 = r5;
        this.A02 = bottomSheetBehavior;
        this.A00 = rect;
    }
}
