package X;

import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.3vf  reason: invalid class name and case insensitive filesystem */
public final class C79563vf extends C79393vM {
    public boolean A03(AnonymousClass1FU r5, AnonymousClass206 r6) {
        int i;
        C18070vi.A0d(r6, 0);
        if (!(r5 instanceof MediaGalleryActivity)) {
            return super.A03(r5, r6);
        }
        MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) r5;
        C18070vi.A0d(mediaGalleryActivity, 0);
        int i2 = mediaGalleryActivity.A00;
        if (i2 == mediaGalleryActivity.A03) {
            i = 4;
        } else if (i2 == mediaGalleryActivity.A01) {
            i = 5;
        } else {
            int i3 = mediaGalleryActivity.A02;
            i = 3;
            if (i2 == i3) {
                i = 6;
            }
        }
        return A02(r5, r6, i, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79563vf(C33251iW r1, C88104Yi r2) {
        super(r1, r2);
        C18070vi.A0j(r1, r2);
    }
}
