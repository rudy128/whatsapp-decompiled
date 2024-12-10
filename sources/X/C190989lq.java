package X;

import com.whatsapp.calling.callsuggestions.SuggestionManager$combineResults$jobResult$1;
import com.whatsapp.calling.callsuggestions.SuggestionManager$loadBuckets$bucketResultList$1$1;
import com.whatsapp.favorite.FavoriteManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.9lq  reason: invalid class name and case insensitive filesystem */
public final class C190989lq {
    public final C188419hO A00;
    public final AnonymousClass4Q1 A01;
    public final AnonymousClass1OX A02;
    public final C188319hE A03;

    public final C199429zz A00(Collection collection) {
        AnonymousClass9IL r7;
        Object obj;
        Collection collection2 = collection;
        C18070vi.A0d(collection2, 0);
        C188419hO r12 = this.A00;
        List<AnonymousClass9IL> list = r12.A08;
        ArrayList<C22496BAd> A0D = C29351c6.A0D(list);
        for (AnonymousClass9IL A04 : list) {
            C188319hE r5 = this.A03;
            AnonymousClass1OX r2 = this.A02;
            switch (C108955ca.A04(A04, 0)) {
                case 0:
                    obj = C20545APe.A00;
                    break;
                case 1:
                    C37391pS r52 = r5.A00.A00;
                    AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r52.A00);
                    C37381pR r53 = r52.A01;
                    obj = new C20552APl(r12, (C132226mR) r53.A08.get(), (A11) r53.A09.get(), A4z, collection2, r2);
                    break;
                case 2:
                    C37391pS r54 = r5.A01.A00;
                    obj = new C20548APh(r12, (C132226mR) r54.A01.A08.get(), AnonymousClass10E.A4z(r54.A00), collection2, r2);
                    break;
                case 3:
                    C37391pS r55 = r5.A02.A00;
                    AnonymousClass10E r4 = r55.A00;
                    obj = new C20551APk(r12, (A11) r55.A01.A09.get(), AnonymousClass10E.A4z(r4), (AnonymousClass1R3) r4.A5f.get(), collection2, r2);
                    break;
                case 4:
                    obj = new C20547APg(AnonymousClass10E.A4z(r5.A03.A00.A00), collection2);
                    break;
                case 5:
                    obj = new C20544APd(r12, (A11) r5.A04.A00.A01.A09.get(), collection2, r2);
                    break;
                case 6:
                    C37391pS r6 = r5.A05.A00;
                    obj = new C20549APi(r12, (C132226mR) r6.A01.A08.get(), AnonymousClass3MY.A0V(r6.A00), collection2, r2);
                    break;
                case 7:
                    C37391pS r62 = r5.A06.A00;
                    AnonymousClass10E r56 = r62.A00;
                    obj = new C20550APj(r12, (A11) r62.A01.A09.get(), AnonymousClass3Ma.A0d(r56), AnonymousClass3MY.A0V(r56), (AnonymousClass1R3) r56.A5f.get(), collection2);
                    break;
                case 8:
                    obj = new C20546APf((FavoriteManager) r5.A07.A00.A00.A4J.get(), collection2);
                    break;
                case 9:
                    C37391pS r72 = r5.A08.A00;
                    AnonymousClass10E r63 = r72.A00;
                    obj = new C20553APm(r12, (A11) r72.A01.A09.get(), AnonymousClass10E.A4z(r63), (AnonymousClass1R3) r63.A5f.get(), (FavoriteManager) r63.A4J.get(), collection2, r2);
                    break;
                default:
                    throw AnonymousClass3MW.A14();
            }
            A0D.add(obj);
        }
        ArrayList<EEF> A0D2 = C29351c6.A0D(A0D);
        for (C22496BAd suggestionManager$loadBuckets$bucketResultList$1$1 : A0D) {
            AnonymousClass1OX r42 = this.A02;
            A0D2.add(C30451dy.A01(AnonymousClass00R.A00, C23761Hn.A01, new SuggestionManager$loadBuckets$bucketResultList$1$1(this, suggestionManager$loadBuckets$bucketResultList$1$1, (C30391dr) null), r42));
        }
        C199429zz r43 = new C199429zz(r12.A03);
        LinkedHashSet A14 = C17880vN.A14();
        for (EEF suggestionManager$combineResults$jobResult$1 : A0D2) {
            int i = r12.A00;
            C193679qU r64 = (C193679qU) this.A01.A00(new SuggestionManager$combineResults$jobResult$1((C30391dr) null, suggestionManager$combineResults$jobResult$1));
            if (r64 != null) {
                C22496BAd bAd = r64.A00;
                if (bAd instanceof C20545APe) {
                    r7 = AnonymousClass9IL.NONE;
                } else if (bAd instanceof C20552APl) {
                    r7 = AnonymousClass9IL.LGC_MEMBERS;
                } else if (bAd instanceof C20548APh) {
                    r7 = AnonymousClass9IL.ADHOC_MEMBERS;
                } else if (bAd instanceof C20551APk) {
                    r7 = AnonymousClass9IL.GROUP_CHAT_MEMBERS;
                } else if (bAd instanceof C20547APg) {
                    r7 = AnonymousClass9IL.STARRED_CONTACTS;
                } else if (bAd instanceof C20544APd) {
                    r7 = AnonymousClass9IL.ONE_ON_ONE;
                } else if (bAd instanceof C20549APi) {
                    r7 = AnonymousClass9IL.LGC;
                } else if (bAd instanceof C20550APj) {
                    r7 = AnonymousClass9IL.GROUP_CHAT;
                } else if (bAd instanceof C20546APf) {
                    r7 = AnonymousClass9IL.FAVORITES;
                } else if (bAd instanceof C20553APm) {
                    r7 = AnonymousClass9IL.FAVORITE_GROUP_CHAT_MEMBERS;
                } else {
                    throw AnonymousClass3MW.A14();
                }
                for (Object next : r64.A01) {
                    if (i > 0) {
                        C18070vi.A0d(next, 1);
                        List A0t = AnonymousClass8BS.A0t(r7, r43.A02);
                        if (A0t != null) {
                            A0t.add(next);
                        }
                        List list2 = r43.A01;
                        if (list2.size() < r43.A00 || r43.A04.contains(next)) {
                            Map map = r43.A03;
                            map.put(r7, C108995ce.A0T((Number) AnonymousClass8BV.A0m(r7, map)));
                            if (r43.A04.add(next)) {
                                list2.add(next);
                            }
                        }
                        if (A14.add(next)) {
                            i--;
                        }
                    }
                }
            }
        }
        return r43;
    }

    public C190989lq(C188419hO r1, C188319hE r2, AnonymousClass4Q1 r3, AnonymousClass1OX r4) {
        C72473Md.A1I(r3, r4);
        this.A01 = r3;
        this.A03 = r2;
        this.A02 = r4;
        this.A00 = r1;
    }
}
