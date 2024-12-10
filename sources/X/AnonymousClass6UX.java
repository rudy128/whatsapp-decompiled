package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6UX  reason: invalid class name */
public abstract class AnonymousClass6UX {
    /* JADX WARNING: type inference failed for: r0v23, types: [java.lang.Object, java.util.Comparator] */
    public void A00(List list) {
        Object obj;
        List list2 = list;
        if (this instanceof AnonymousClass6H9) {
            AnonymousClass6H9 r3 = (AnonymousClass6H9) this;
            Collections.sort(list2, new Object());
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = r3.A00;
            stickerStoreFeaturedTabFragment.A0A = false;
            if (!stickerStoreFeaturedTabFragment.A29() || !C108975cc.A1I(stickerStoreFeaturedTabFragment.A0D)) {
                stickerStoreFeaturedTabFragment.A0J = list2;
                StickerStoreFeaturedTabFragment.A00(stickerStoreFeaturedTabFragment);
            } else {
                stickerStoreFeaturedTabFragment.A0A.A0G(new AnonymousClass7MU(r3, list2), "meta-avatar", false);
            }
            stickerStoreFeaturedTabFragment.A27();
        } else if (this instanceof AnonymousClass6HB) {
            AnonymousClass6HB r32 = (AnonymousClass6HB) this;
            C18070vi.A0d(list2, 0);
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C18070vi.A18(((AnonymousClass725) obj).A0H, "whatsappcuppy")) {
                    break;
                }
            }
            AnonymousClass725 r14 = (AnonymousClass725) obj;
            if (r14 != null) {
                C133886pf r1 = r32.A00;
                if (!((C26501Sj) r1.A01.get()).A03(C26551So.A0j, 0, r14.A02, true, false, false, false, false)) {
                    Log.i("InitialStickerPackDownloader/downloadInitialStickerPack/autodownload is not safe, going to do nothing");
                } else {
                    ((StickerPackDownloader) r1.A03.get()).A02(r14, new AnonymousClass7MR(r32.A01, 0), C17880vN.A0k(), (Integer) null, (Integer) null, (Integer) null, false);
                }
            }
        } else {
            AnonymousClass6HA r33 = (AnonymousClass6HA) this;
            list2.size();
            boolean z = false;
            if (list2.size() == 1 && ((AnonymousClass725) list2.get(0)).A0S) {
                z = true;
            }
            if (list2.size() == 0 || z) {
                r33.A00.A08.A00(new AnonymousClass7RK(49, (Object) r33, r33.A01));
                return;
            }
            C134166q9 r2 = r33.A00;
            C17880vN.A1F(C19830z4.A00(r2.A06.A04), "sticker_picker_initial_download", true);
            r2.A00(r33.A01);
        }
    }
}
