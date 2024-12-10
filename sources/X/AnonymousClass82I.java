package X;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.viewpager2.widget.ViewPager2;
import com.whatsapp.gallery.GalleryTabHostFragment;
import java.util.List;

/* renamed from: X.82I  reason: invalid class name */
public final class AnonymousClass82I extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SubMenu $overflowSubMenu;
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82I(SubMenu subMenu, GalleryTabHostFragment galleryTabHostFragment) {
        super(1);
        this.this$0 = galleryTabHostFragment;
        this.$overflowSubMenu = subMenu;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        MenuItem add;
        List<AnonymousClass6g8> list = (List) obj;
        C18070vi.A0d(list, 0);
        this.this$0.A0c = AnonymousClass000.A1a(list);
        SubMenu subMenu = this.$overflowSubMenu;
        GalleryTabHostFragment galleryTabHostFragment = this.this$0;
        for (AnonymousClass6g8 r3 : list) {
            if (!(subMenu == null || (add = subMenu.add(r3.A02)) == null)) {
                add.setIcon(r3.A01);
                add.setOnMenuItemClickListener(new C1420077u(r3, galleryTabHostFragment, 0));
            }
        }
        GalleryTabHostFragment galleryTabHostFragment2 = this.this$0;
        ViewPager2 viewPager2 = galleryTabHostFragment2.A04;
        if (viewPager2 != null) {
            i = viewPager2.A00;
        } else {
            i = 0;
        }
        GalleryTabHostFragment.A0J(galleryTabHostFragment2, i);
        return C27621Wu.A00;
    }
}
