package X;

import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7MU  reason: invalid class name */
public class AnonymousClass7MU implements AnonymousClass89P {
    public final /* synthetic */ AnonymousClass6H9 A00;
    public final /* synthetic */ List A01;

    public AnonymousClass7MU(AnonymousClass6H9 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public void C6s(AnonymousClass725 r5) {
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A00.A00;
        ArrayList A13 = AnonymousClass000.A13();
        stickerStoreFeaturedTabFragment.A0J = A13;
        A13.add(r5);
        A13.addAll(1, this.A01);
        StickerStoreFeaturedTabFragment.A00(stickerStoreFeaturedTabFragment);
    }

    public void C6t() {
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A00.A00;
        stickerStoreFeaturedTabFragment.A0J = this.A01;
        StickerStoreFeaturedTabFragment.A00(stickerStoreFeaturedTabFragment);
        Log.e("StickerStoreFeaturedTabFragment/updatePackList: The avatar config is true but the avatar sticker pack is not available!");
    }
}
