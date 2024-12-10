package X;

import com.whatsapp.picker.search.StickerSearchTabFragment;

/* renamed from: X.7SL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7SL implements C22821Di {
    public final /* synthetic */ int A00;
    public final /* synthetic */ StickerSearchTabFragment A01;

    public final Object invoke(Object obj) {
        StickerSearchTabFragment stickerSearchTabFragment = this.A01;
        int i = this.A00;
        C112185l4 r1 = stickerSearchTabFragment.A03;
        if (r1 != null) {
            r1.A0U(StickerSearchTabFragment.A00(stickerSearchTabFragment).A2I(i));
            r1.notifyDataSetChanged();
        }
        return C27621Wu.A00;
    }

    public /* synthetic */ AnonymousClass7SL(StickerSearchTabFragment stickerSearchTabFragment, int i) {
        this.A01 = stickerSearchTabFragment;
        this.A00 = i;
    }
}
