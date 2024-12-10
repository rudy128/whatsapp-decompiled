package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.picker.search.Hilt_StickerSearchTabFragment;
import com.whatsapp.picker.search.StickerSearchTabFragment;

/* renamed from: X.5hn  reason: invalid class name and case insensitive filesystem */
public final class C111005hn extends C28861b9 {
    public StickerSearchTabFragment A00;

    public int A0E() {
        return 7;
    }

    public void A09(ViewGroup viewGroup, Object obj, int i) {
        C18070vi.A0i(viewGroup, obj);
        super.A09(viewGroup, obj, i);
        if (this.A00 != obj) {
            this.A00 = (StickerSearchTabFragment) obj;
        }
    }

    public /* bridge */ /* synthetic */ Fragment A0I(int i) {
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("sticker_category_tab", i);
        Hilt_StickerSearchTabFragment hilt_StickerSearchTabFragment = new Hilt_StickerSearchTabFragment();
        hilt_StickerSearchTabFragment.A1R(A0D);
        return hilt_StickerSearchTabFragment;
    }
}
