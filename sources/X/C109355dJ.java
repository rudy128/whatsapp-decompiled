package X;

import android.database.ContentObserver;
import android.os.Handler;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$maybeCacheMedia$1;
import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.5dJ  reason: invalid class name and case insensitive filesystem */
public class C109355dJ extends ContentObserver {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109355dJ(Handler handler, Object obj, int i) {
        super(handler);
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean deliverSelfNotifications() {
        switch (this.A00) {
            case 0:
            case 2:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    public void onChange(boolean z) {
        switch (this.A00) {
            case 0:
                C17900vP.A0n("MediaGalleryFragmentBase/onchange ", AnonymousClass000.A10(), z);
                MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A01;
                C160878Ah r6 = mediaGalleryFragmentBase.A0G;
                if (r6 != null) {
                    if (!z) {
                        MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = (MediaGalleryFragmentViewModel) mediaGalleryFragmentBase.A0i.getValue();
                        C160878Ah r4 = mediaGalleryFragmentBase.A0G;
                        AnonymousClass3MW.A1X(mediaGalleryFragmentViewModel.A08, new MediaGalleryFragmentViewModel$maybeCacheMedia$1(r4, mediaGalleryFragmentViewModel, (C30391dr) null), C41561wd.A00(mediaGalleryFragmentViewModel));
                    }
                    mediaGalleryFragmentBase.A01 = r6.getCount();
                }
                mediaGalleryFragmentBase.A26().CGP(C146747Ql.A00(mediaGalleryFragmentBase, 40));
                return;
            case 1:
                GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) this.A01;
                AnonymousClass1FL A1B = galleryPickerFragment.A1B();
                if (A1B != null && !A1B.isFinishing()) {
                    AnonymousClass10I r1 = galleryPickerFragment.A0K;
                    if (r1 != null) {
                        r1.CGF(C146747Ql.A00(galleryPickerFragment, 43));
                        return;
                    } else {
                        C18070vi.A11("workers");
                        throw null;
                    }
                } else {
                    return;
                }
            default:
                super.onChange(z);
                ((AnonymousClass7JV) this.A01).A0F.A09.post(C108945cZ.A0X(this, 16));
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109355dJ(AnonymousClass7JV r2) {
        super((Handler) null);
        this.A00 = 2;
        this.A01 = r2;
    }
}
