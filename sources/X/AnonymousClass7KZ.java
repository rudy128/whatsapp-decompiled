package X;

import android.app.Activity;
import com.whatsapp.companionmode.registration.CompanionRegistrationViewModel;
import com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1;
import com.whatsapp.stickers.flow.StickerPackFlow;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7KZ  reason: invalid class name */
public class AnonymousClass7KZ implements C23691Hg {
    public final int A00;
    public final String A01;

    public AnonymousClass7KZ(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public static void A00(AnonymousClass10T r1, String str, int i) {
        r1.notifyAllObservers(new AnonymousClass7KZ(str, i));
    }

    public final void CGE(Object obj) {
        Object value;
        switch (this.A00) {
            case 0:
                for (AnonymousClass8A4 Bwh : ((AnonymousClass6h1) obj).A03) {
                    Bwh.Bwh();
                }
                return;
            case 1:
                String str = this.A01;
                AnonymousClass6UT r12 = (AnonymousClass6UT) obj;
                if (r12 instanceof C116395xC) {
                    C116395xC r122 = (C116395xC) r12;
                    if (2 - r122.A00 == 0) {
                        C18070vi.A0d(str, 0);
                        Activity activity = (Activity) r122.A01;
                        activity.runOnUiThread(new C146817Qs(2, str, activity));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = this.A01;
                AnonymousClass6UT r123 = (AnonymousClass6UT) obj;
                if (r123 instanceof C116395xC) {
                    C116395xC r124 = (C116395xC) r123;
                    if (1 - r124.A00 == 0) {
                        C18070vi.A0d(str2, 0);
                        ((CompanionRegistrationViewModel) r124.A01).A05.A0E(new C116415xE(str2));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                String str3 = this.A01;
                AnonymousClass8B1 r125 = (AnonymousClass8B1) obj;
                C18070vi.A0d(r125, 1);
                r125.Bla(str3);
                return;
            case 4:
                String str4 = this.A01;
                AnonymousClass8B1 r126 = (AnonymousClass8B1) obj;
                C18070vi.A0d(r126, 1);
                r126.Bly(str4);
                return;
            case 5:
                String str5 = this.A01;
                AnonymousClass8B1 r127 = (AnonymousClass8B1) obj;
                C18070vi.A0d(r127, 1);
                r127.Bm0(str5);
                return;
            case 6:
                String str6 = this.A01;
                C134226qF r128 = (C134226qF) obj;
                C18070vi.A0d(r128, 1);
                if (r128 instanceof AnonymousClass6H6) {
                    AnonymousClass6H6 r129 = (AnonymousClass6H6) r128;
                    switch (r129.A00) {
                        case 0:
                            C18070vi.A0d(str6, 0);
                            if (str6.equals("meta-avatar")) {
                                ((C108495bn) r129.A01).CQ0(new AnonymousClass6ER("onStickerPackRemoved"));
                                return;
                            }
                            return;
                        case 1:
                            C18070vi.A0d(str6, 0);
                            StickerPackFlow stickerPackFlow = (StickerPackFlow) r129.A02;
                            List list = stickerPackFlow.A00.A00;
                            ArrayList A13 = AnonymousClass000.A13();
                            for (Object next : list) {
                                AnonymousClass3MZ.A1V(next, A13, C18070vi.A18(((C133436ok) next).A01(), str6) ? 1 : 0);
                            }
                            C134226qF.A00(r129, stickerPackFlow, A13);
                            return;
                        default:
                            return;
                    }
                } else {
                    AnonymousClass6H5 r1210 = (AnonymousClass6H5) r128;
                    switch (r1210.A00) {
                        case 1:
                            AnonymousClass72m r10 = (AnonymousClass72m) r1210.A01;
                            r10.A0Z.remove(str6);
                            Map map = r10.A0a;
                            Collection<AnonymousClass8B0> collection = (Collection) map.get(str6);
                            if (collection != null) {
                                AnonymousClass7IT r8 = r10.A0G;
                                synchronized (r8) {
                                    for (AnonymousClass8B0 r5 : collection) {
                                        for (AnonymousClass737 r1 : r5.BRD()) {
                                            Collection collection2 = (Collection) r8.A01.get(r1);
                                            if (collection2 != null) {
                                                collection2.remove(r5);
                                            }
                                        }
                                    }
                                }
                            }
                            map.remove(str6);
                            r10.A0I.A0V(str6);
                            return;
                        case 3:
                        case 4:
                        case 5:
                            AnonymousClass722 r3 = (AnonymousClass722) r1210.A01;
                            if (r3.A04 != null) {
                                boolean z = false;
                                for (int i = 0; i < r3.A04.size(); i++) {
                                    if (AnonymousClass725.A01(str6, r3.A04, i)) {
                                        r3.A04.remove(i);
                                        z = true;
                                    }
                                }
                                if (z) {
                                    AnonymousClass722.A01(r3, (String) null, r3.A04);
                                }
                            }
                            AnonymousClass722.A00(r3);
                            C111185ii r0 = r3.A01;
                            if (r0 != null) {
                                r0.A0T();
                                return;
                            }
                            return;
                        case 6:
                            StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) r1210.A01;
                            if (stickerStoreTabFragment instanceof StickerStoreMyTabFragment) {
                                StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) stickerStoreTabFragment;
                                C112295lF r4 = stickerStoreMyTabFragment.A0B;
                                if (r4 != null) {
                                    if (str6.equals("whatsappcuppy")) {
                                        C17880vN.A1F(C19830z4.A00(C17880vN.A0K(r4.A01.A0I)), "pref_cuppy_sticker_pack_has_been_removed", true);
                                    }
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < r4.A00.size()) {
                                            AnonymousClass725 r13 = (AnonymousClass725) r4.A00.get(i2);
                                            if (r13.A0H.equals(str6)) {
                                                r4.A00.remove(r13);
                                                if (r4.A00.isEmpty()) {
                                                    r4.notifyDataSetChanged();
                                                } else {
                                                    r4.A0I(i2);
                                                }
                                                r4.A01.A27();
                                            } else {
                                                i2++;
                                            }
                                        }
                                    }
                                    stickerStoreMyTabFragment.A04 = true;
                                    return;
                                }
                                return;
                            }
                            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) stickerStoreTabFragment;
                            if (stickerStoreFeaturedTabFragment.A0J != null) {
                                int i3 = 0;
                                while (i3 < stickerStoreFeaturedTabFragment.A0J.size()) {
                                    AnonymousClass725 A0b = C108965cb.A0b(stickerStoreFeaturedTabFragment, i3);
                                    if (A0b.A0H.equals(str6)) {
                                        A0b.A09 = false;
                                        A0b.A01 = 0;
                                        A0b.A03 = null;
                                        C112295lF r14 = stickerStoreFeaturedTabFragment.A0B;
                                        if (r14 != null) {
                                            if (StickerStoreFeaturedTabFragment.A01(stickerStoreFeaturedTabFragment)) {
                                                i3++;
                                            }
                                            r14.A0G(i3);
                                            return;
                                        }
                                        return;
                                    }
                                    i3++;
                                }
                                return;
                            }
                            return;
                        case 7:
                            C18070vi.A0d(str6, 0);
                            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r1210.A01;
                            StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = stickerStorePackPreviewActivity.A0B;
                            if (stickerStorePackPreviewViewModel == null) {
                                AnonymousClass3MW.A1H();
                                throw null;
                            }
                            AnonymousClass725 A0T = stickerStorePackPreviewViewModel.A0T();
                            if (A0T != null && C18070vi.A18(A0T.A0H, str6)) {
                                StickerStorePackPreviewActivity.A0Q(stickerStorePackPreviewActivity);
                                if (A0T.A0V) {
                                    stickerStorePackPreviewActivity.A05.A08(2131896457, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            default:
                String str7 = this.A01;
                C134226qF r1211 = (C134226qF) obj;
                C18070vi.A0d(r1211, 1);
                if (r1211 instanceof AnonymousClass6H6) {
                    AnonymousClass6H6 r1212 = (AnonymousClass6H6) r1211;
                    switch (r1212.A00) {
                        case 0:
                            if (C18070vi.A18(str7, "meta-avatar")) {
                                C130746jw r52 = (C130746jw) r1212.A02;
                                AnonymousClass3MW.A1X(r52.A05, new AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1(r52, (C30391dr) null, (C108475bl) r1212.A01), r52.A06);
                                return;
                            }
                            return;
                        case 1:
                            StickerPackFlow stickerPackFlow2 = (StickerPackFlow) r1212.A02;
                            List list2 = stickerPackFlow2.A00.A00;
                            ArrayList A132 = AnonymousClass000.A13();
                            for (Object next2 : list2) {
                                AnonymousClass3MZ.A1V(next2, A132, C18070vi.A18(((C133436ok) next2).A01(), str7) ? 1 : 0);
                            }
                            C134226qF.A00(r1212, stickerPackFlow2, A132);
                            return;
                        default:
                            return;
                    }
                } else {
                    AnonymousClass6H5 r1213 = (AnonymousClass6H5) r1211;
                    switch (r1213.A00) {
                        case 2:
                            if (str7 != null) {
                                AnonymousClass1G4 r2 = ((C130196j2) r1213.A01).A04;
                                do {
                                    value = r2.getValue();
                                } while (!r2.BFK(value, C41841x9.A07(str7, (Set) value)));
                                return;
                            }
                            return;
                        case 3:
                        case 4:
                        case 5:
                            AnonymousClass722 r22 = (AnonymousClass722) r1213.A01;
                            r22.A0G.remove(str7);
                            r22.A0H.remove(str7);
                            List list3 = r22.A04;
                            if (list3 != null) {
                                AnonymousClass722.A01(r22, (String) null, list3);
                                return;
                            }
                            return;
                        case 6:
                            StickerStoreTabFragment stickerStoreTabFragment2 = (StickerStoreTabFragment) r1213.A01;
                            if (!(stickerStoreTabFragment2 instanceof StickerStoreMyTabFragment)) {
                                StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment2 = (StickerStoreFeaturedTabFragment) stickerStoreTabFragment2;
                                if (stickerStoreFeaturedTabFragment2.A0J != null) {
                                    for (int i4 = 0; i4 < stickerStoreFeaturedTabFragment2.A0J.size(); i4++) {
                                        AnonymousClass725 A0b2 = C108965cb.A0b(stickerStoreFeaturedTabFragment2, i4);
                                        if (A0b2.A0H.equals(str7)) {
                                            A0b2.A09 = false;
                                            C112295lF r23 = stickerStoreFeaturedTabFragment2.A0B;
                                            if (r23 != null) {
                                                int i5 = i4;
                                                if (StickerStoreFeaturedTabFragment.A01(stickerStoreFeaturedTabFragment2)) {
                                                    i5 = i4 + 1;
                                                }
                                                r23.A0G(i5);
                                            }
                                            if (stickerStoreFeaturedTabFragment2.A04 >= 7) {
                                                if (stickerStoreFeaturedTabFragment2.A00 != null) {
                                                    C90594eK A002 = C124176Xi.A00(stickerStoreFeaturedTabFragment2.A00, stickerStoreFeaturedTabFragment2, (AnonymousClass11C) stickerStoreFeaturedTabFragment2.A08.get(), AnonymousClass3MX.A16(stickerStoreFeaturedTabFragment2, A0b2.A04, new Object[1], 0, 2131896501), AnonymousClass000.A13());
                                                    stickerStoreFeaturedTabFragment2.A05 = A002;
                                                    A002.A07(AnonymousClass7RI.A00(stickerStoreFeaturedTabFragment2, 24));
                                                    stickerStoreFeaturedTabFragment2.A05.A03();
                                                } else {
                                                    stickerStoreFeaturedTabFragment2.A05.A0G(AnonymousClass3MX.A16(stickerStoreFeaturedTabFragment2, A0b2.A04, new Object[1], 0, 2131896501), 1);
                                                }
                                            }
                                        }
                                    }
                                    return;
                                }
                                return;
                            } else if (stickerStoreTabFragment2.A0J != null) {
                                for (int i6 = 0; i6 < stickerStoreTabFragment2.A0J.size(); i6++) {
                                    AnonymousClass725 A0b3 = C108965cb.A0b(stickerStoreTabFragment2, i6);
                                    if (A0b3.A0H.equals(str7)) {
                                        A0b3.A09 = false;
                                        C112295lF r02 = stickerStoreTabFragment2.A0B;
                                        if (r02 != null) {
                                            r02.A0G(i6);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            } else {
                                return;
                            }
                        case 7:
                            StickerStorePackPreviewActivity stickerStorePackPreviewActivity2 = (StickerStorePackPreviewActivity) r1213.A01;
                            StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel2 = stickerStorePackPreviewActivity2.A0B;
                            if (stickerStorePackPreviewViewModel2 == null) {
                                AnonymousClass3MW.A1H();
                                throw null;
                            }
                            AnonymousClass725 A0T2 = stickerStorePackPreviewViewModel2.A0T();
                            if (A0T2 != null && C18070vi.A18(str7, A0T2.A0H)) {
                                A0T2.A09 = false;
                                StickerStorePackPreviewActivity.A0V(stickerStorePackPreviewActivity2);
                                if (A0T2.A0V) {
                                    stickerStorePackPreviewActivity2.A05.A0G(C17880vN.A0q(stickerStorePackPreviewActivity2, A0T2.A04, new Object[1], 0, 2131896501), 0);
                                    return;
                                }
                                StickerStorePackPreviewActivity.A0c(stickerStorePackPreviewActivity2, AnonymousClass3Ma.A10(stickerStorePackPreviewActivity2, A0T2.A04, new Object[1], 0, 2131896501));
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
        }
    }
}
