package X;

import androidx.viewpager2.widget.ViewPager2;
import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.7zy  reason: invalid class name and case insensitive filesystem */
public final class C158247zy extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158247zy(GalleryTabHostFragment galleryTabHostFragment) {
        super(1);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        ViewPager2 viewPager2 = this.this$0.A04;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(!bool.booleanValue());
        }
        return C27621Wu.A00;
    }
}
