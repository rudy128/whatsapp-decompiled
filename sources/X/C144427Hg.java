package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.7Hg  reason: invalid class name and case insensitive filesystem */
public final class C144427Hg implements C1606889n {
    public final /* synthetic */ AnonymousClass8B2 A00;
    public final /* synthetic */ AnonymousClass65B A01;
    public final /* synthetic */ C112325lI A02;
    public final /* synthetic */ AnonymousClass891 A03;
    public final /* synthetic */ C98484rE A04;

    public /* synthetic */ void Bti() {
    }

    public void C7F(Bitmap bitmap, boolean z) {
        Bitmap bitmap2 = bitmap;
        C18070vi.A0d(bitmap, 0);
        C112325lI r4 = this.A02;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = r4.A03;
        if (mediaGalleryFragmentBase.A1B() != null) {
            AnonymousClass65B r8 = this.A01;
            if (r8.getTag() == this.A03) {
                AnonymousClass8B2 r7 = this.A00;
                if (bitmap.equals(AnonymousClass6YZ.A00)) {
                    bitmap2 = null;
                }
                int i = mediaGalleryFragmentBase.A02;
                Drawable drawable = mediaGalleryFragmentBase.A05;
                if (drawable != null) {
                    C137216v6.A01(bitmap2, drawable, r7, r8, i, !z, true, C72453Mb.A1a(r4.A08));
                    if (!z && C72453Mb.A1a(r4.A07)) {
                        C22681Cu r5 = new C22681Cu();
                        C98484rE r1 = this.A04;
                        r5.A02 = "WaMediaPickerThumbnailLoadTimeMs";
                        r5.A00 = C108945cZ.A1B(SystemClock.elapsedRealtime(), r1.element);
                        AnonymousClass18K r0 = r4.A02;
                        if (r0 != null) {
                            r0.CC7(r5);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C18070vi.A11("placeholderDrawable");
                throw null;
            }
        }
    }

    public C144427Hg(AnonymousClass8B2 r1, AnonymousClass65B r2, C112325lI r3, AnonymousClass891 r4, C98484rE r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
    }

    public void BCw() {
        C112325lI r3 = this.A02;
        if (C72453Mb.A1a(r3.A07)) {
            this.A04.element = SystemClock.elapsedRealtime();
        }
        C108975cc.A0x(this.A01, r3.A03.A02);
    }
}
