package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.65N  reason: invalid class name */
public class AnonymousClass65N extends C112325lI {
    public int A00;
    public int A01;
    public final MediaGalleryFragmentBase A02;
    public final AnonymousClass00H A03;
    public final C18600wl A04;

    public void A0R(C42011xT r6) {
        C18070vi.A0d(r6, 0);
        super.A0R(r6);
        if (r6 instanceof C113295mr) {
            C113295mr r4 = (C113295mr) r6;
            AnonymousClass65B r3 = r4.A03;
            r3.setImageBitmap((Bitmap) null);
            r3.A06 = null;
            View view = r6.A0H;
            if (view.getTag() instanceof AnonymousClass891) {
                C112325lI.A02(view, this.A02);
                r4.A00 = null;
                r4.A01 = null;
                r3.setDuration((Long) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass65N(C18030ve r2, AnonymousClass18K r3, AnonymousClass8A8 r4, MediaGalleryFragmentBase mediaGalleryFragmentBase, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8, Integer num, C18600wl r10) {
        super(r2, r3, r4, mediaGalleryFragmentBase, r6, r7, r8, num);
        C18070vi.A0d(r10, 9);
        this.A02 = mediaGalleryFragmentBase;
        this.A03 = r7;
        this.A04 = r10;
    }
}
