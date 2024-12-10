package X;

import com.whatsapp.stickers.flow.StickerPackFlow;
import com.whatsapp.stickers.starred.StarredStickersFlow$notifyStickerFavoriteAdded$1;
import com.whatsapp.stickers.starred.StarredStickersFlow$notifyStickerFavoriteRemoved$1;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6qF  reason: invalid class name and case insensitive filesystem */
public abstract class C134226qF {
    public static void A00(AnonymousClass6H6 r2, StickerPackFlow stickerPackFlow, List list) {
        StickerPackFlow.A00(new AnonymousClass6HC(list), stickerPackFlow, (C108475bl) r2.A01);
    }

    public void A01(String str, int i) {
        List list;
        String str2 = str;
        int i2 = i;
        if (this instanceof AnonymousClass6H6) {
            AnonymousClass6H6 r6 = (AnonymousClass6H6) this;
            switch (r6.A00) {
                case 0:
                    if (C18070vi.A18(str, "meta-avatar")) {
                        ((C108495bn) r6.A01).CQ0(new AnonymousClass6EQ(i));
                        return;
                    }
                    return;
                case 1:
                    StickerPackFlow stickerPackFlow = (StickerPackFlow) r6.A02;
                    List<C133436ok> list2 = stickerPackFlow.A00.A00;
                    ArrayList A0D = C29351c6.A0D(list2);
                    for (C133436ok r2 : list2) {
                        if ((r2 instanceof AnonymousClass6HH) && C18070vi.A18(r2.A01(), str)) {
                            AnonymousClass6HH r22 = (AnonymousClass6HH) r2;
                            r2 = new AnonymousClass6HH(r22.A01, r22.A02, i);
                        }
                        A0D.add(r2);
                    }
                    A00(r6, stickerPackFlow, A0D);
                    return;
                default:
                    return;
            }
        } else {
            AnonymousClass6H5 r1 = (AnonymousClass6H5) this;
            switch (r1.A00) {
                case 3:
                case 4:
                case 5:
                    AnonymousClass722 r0 = (AnonymousClass722) r1.A01;
                    AnonymousClass8AV r62 = r0.A03;
                    if (r62 != null && (list = r0.A04) != null) {
                        r62.C6r(str2, r0.A0H, r0.A0G, r0.A0I, list, i2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void A02(Collection collection, boolean z) {
        C138666xU r5;
        C108475bl r4;
        boolean z2;
        if (this instanceof AnonymousClass6H6) {
            AnonymousClass6H6 r1 = (AnonymousClass6H6) this;
            switch (r1.A00) {
                case 4:
                    C18070vi.A0d(collection, 0);
                    r5 = (C138666xU) r1.A02;
                    r4 = (C108475bl) r1.A01;
                    C138666xU.A00(r5, r4, 2);
                    z2 = false;
                    if (!collection.isEmpty()) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C108945cZ.A0x(it).A0N) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    C18070vi.A0d(collection, 0);
                    r5 = (C138666xU) r1.A02;
                    r4 = (C108475bl) r1.A01;
                    z2 = true;
                    C138666xU.A00(r5, r4, 1);
                    if (!collection.isEmpty()) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (C108945cZ.A0x(it2).A0N) {
                                    break;
                                }
                            }
                        }
                    }
                    z2 = false;
                    break;
                default:
                    return;
            }
            AnonymousClass3MW.A1X(r5.A04, new StarredStickersFlow$notifyStickerFavoriteAdded$1(r5, collection, (C30391dr) null, z2), r4);
            return;
        }
        AnonymousClass6H5 r12 = (AnonymousClass6H5) this;
        switch (r12.A00) {
            case 1:
                AnonymousClass72m r13 = (AnonymousClass72m) r12.A01;
                AnonymousClass72m.A01(r13, collection, true);
                r13.A0I.A0U();
                return;
            case 3:
            case 4:
            case 5:
                AnonymousClass8AV r14 = ((AnonymousClass722) r12.A01).A03;
                if (r14 != null) {
                    r14.Bu2(true, z);
                    return;
                }
                return;
            case 7:
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r12.A01;
                StickerStorePackPreviewActivity.A0c(stickerStorePackPreviewActivity, C18070vi.A0F(stickerStorePackPreviewActivity, 2131896495));
                return;
            default:
                return;
        }
    }

    public void A03(Collection collection, boolean z) {
        C138666xU r5;
        C108475bl r4;
        boolean z2;
        if (this instanceof AnonymousClass6H6) {
            AnonymousClass6H6 r1 = (AnonymousClass6H6) this;
            switch (r1.A00) {
                case 4:
                    C18070vi.A0d(collection, 0);
                    r5 = (C138666xU) r1.A02;
                    r4 = (C108475bl) r1.A01;
                    C138666xU.A00(r5, r4, 2);
                    z2 = false;
                    if (!collection.isEmpty()) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C108945cZ.A0x(it).A0N) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    C18070vi.A0d(collection, 0);
                    r5 = (C138666xU) r1.A02;
                    r4 = (C108475bl) r1.A01;
                    z2 = true;
                    C138666xU.A00(r5, r4, 1);
                    if (!collection.isEmpty()) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (C108945cZ.A0x(it2).A0N) {
                                    break;
                                }
                            }
                        }
                    }
                    z2 = false;
                    break;
                default:
                    return;
            }
            AnonymousClass3MW.A1X(r5.A04, new StarredStickersFlow$notifyStickerFavoriteRemoved$1(r5, (C30391dr) null, z2), r4);
            return;
        }
        AnonymousClass6H5 r12 = (AnonymousClass6H5) this;
        switch (r12.A00) {
            case 3:
            case 4:
            case 5:
                AnonymousClass722 r2 = (AnonymousClass722) r12.A01;
                AnonymousClass8AV r13 = r2.A03;
                if (r13 != null) {
                    r13.Bu2(true, z);
                }
                C111185ii r0 = r2.A01;
                if (r0 != null) {
                    r0.A0T();
                    return;
                }
                return;
            case 7:
                C18070vi.A0d(collection, 0);
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r12.A01;
                StickerStorePackPreviewActivity.A0c(stickerStorePackPreviewActivity, C18070vi.A0F(stickerStorePackPreviewActivity, 2131896519));
                for (Object next : collection) {
                    C112345lK r02 = stickerStorePackPreviewActivity.A0A;
                    if (r02 != null) {
                        List<C135906sx> list = r02.A03;
                        if (list == null) {
                            list = AnonymousClass000.A13();
                        }
                        for (C135906sx r14 : list) {
                            if (next.equals(r14.A03)) {
                                r14.A02 = false;
                            }
                        }
                    }
                }
                return;
            default:
                return;
        }
    }
}
