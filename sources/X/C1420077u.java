package X;

import android.view.MenuItem;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;

/* renamed from: X.77u  reason: invalid class name and case insensitive filesystem */
public class C1420077u implements MenuItem.OnMenuItemClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1420077u(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        DFL dfl;
        if (this.A00 != 0) {
            DOZ doz = (DOZ) this.A02;
            E8A e8a = ((C133756pR) this.A01).A00;
            if (e8a == null || doz == null || (dfl = C26272CwJ.A01(doz).A06) == null) {
                return false;
            }
            C26209Cul.A01(doz, dfl, C108985cd.A0K(doz), e8a);
            return true;
        }
        GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this.A01;
        AnonymousClass6g8 r4 = (AnonymousClass6g8) this.A02;
        C18070vi.A0d(galleryTabHostFragment, 0);
        Integer A002 = GalleryPickerViewModel.A00(galleryTabHostFragment.A0n);
        if (A002 != null) {
            C108955ca.A1Q(C108985cd.A0b(galleryTabHostFragment), 19, 1, A002.intValue());
        }
        galleryTabHostFragment.startActivityForResult(r4.A00, 91);
        return false;
    }
}
