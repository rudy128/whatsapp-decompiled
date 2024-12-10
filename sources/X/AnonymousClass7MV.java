package X;

import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.7MV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7MV implements AnonymousClass3LI {
    public final /* synthetic */ WeakReference A00;

    public final void C6u(boolean z) {
        C1597885w r2 = (C1597885w) this.A00.get();
        if (r2 != null) {
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r2;
            stickerStorePackPreviewActivity.A0W = false;
            if (z) {
                stickerStorePackPreviewActivity.setResult(2);
                AnonymousClass6RG r1 = stickerStorePackPreviewActivity.A03;
                if (r1 == null) {
                    C18070vi.A11("stickerPackPreviewSource");
                    throw null;
                } else if (r1 != AnonymousClass6RG.DEEPLINK) {
                    stickerStorePackPreviewActivity.finish();
                }
            } else {
                StickerStorePackPreviewActivity.A0V(stickerStorePackPreviewActivity);
            }
        }
    }

    public /* synthetic */ AnonymousClass7MV(WeakReference weakReference) {
        this.A00 = weakReference;
    }
}
