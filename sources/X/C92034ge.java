package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.4ge  reason: invalid class name and case insensitive filesystem */
public class C92034ge implements C107835ah {
    public final int A00;
    public final Object A01;

    public C92034ge(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void Br5() {
        if (2 - this.A00 == 0) {
            ((AnonymousClass4aY) this.A01).A2Q.BLL();
        }
    }

    public final void Br8() {
        switch (this.A00) {
            case 0:
                AnonymousClass3MW.A1V(this.A01);
                return;
            case 1:
                ((C108665c6) this.A01).BLL();
                return;
            case 2:
                ((AnonymousClass4aY) this.A01).A2Q.BLL();
                return;
            case 3:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A01;
                AnonymousClass4S9 r0 = mediaGalleryActivity.A0G;
                if (r0 != null) {
                    r0.A03.clear();
                }
                AnonymousClass02B r02 = mediaGalleryActivity.A05;
                if (r02 != null) {
                    r02.A05();
                    return;
                }
                return;
            default:
                Fragment fragment = ((Fragment) this.A01).A0E;
                if (fragment instanceof C107835ah) {
                    ((C107835ah) fragment).Br8();
                    return;
                }
                return;
        }
    }
}
