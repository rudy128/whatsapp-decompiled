package X;

import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsDataSource$getCombinedStickerPacksFlow$1;
import com.whatsapp.expressionstray.expression.stickers.mediacomposer.ContentStickerProvider$observeContentStickers$1;
import com.whatsapp.expressionstray.expression.stickers.mediacomposer.ContentStickerProvider$observeRecentShapes$1;
import com.whatsapp.expressionstray.expression.stickers.mediacomposer.ContentStickerProvider$observeShapesStickers$1;
import com.whatsapp.expressionstray.expression.stickers.received.ReceivedStickersFlow$getTopReceivedStickers$1;
import com.whatsapp.expressionstray.expression.stickers.received.ReceivedStickersFlow$getTopReceivedStickers$2;
import com.whatsapp.stickers.flow.DiscoveryPackFetcher$getStickerDiscoveryPacks$1;
import com.whatsapp.stickers.flow.DiscoveryPackFetcher$getStickerDiscoveryPacks$2;
import com.whatsapp.stickers.flow.GetDiscoveryStickerPackFlow$invoke$1;
import com.whatsapp.stickers.flow.GetDiscoveryStickerPackFlow$invoke$2;
import com.whatsapp.stickers.flow.GetDiscoveryStickerPackFlow$invoke$3;
import com.whatsapp.stickers.flow.GetDiscoveryStickerPackFlow$invoke$4;
import com.whatsapp.stickers.flow.GetDiscoveryStickerPackFlow$invoke$5;
import com.whatsapp.stickers.flow.StickerPackFlow;

/* renamed from: X.6xS  reason: invalid class name and case insensitive filesystem */
public final class C138646xS {
    public final C130196j2 A00;
    public final StickerPackFlow A01;
    public final AnonymousClass1OX A02;
    public final C23421Fz A03 = A00(false);
    public final C23421Fz A04 = A00(true);
    public final C131016kN A05;
    public final C138666xU A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final C18600wl A09;

    public C138646xS(C130196j2 r3, StickerPackFlow stickerPackFlow, C131016kN r5, C138666xU r6, AnonymousClass00H r7, AnonymousClass00H r8, C18600wl r9) {
        C18070vi.A0p(r5, r6, r7);
        C18070vi.A0d(r8, 5);
        C18070vi.A0d(r9, 7);
        this.A01 = stickerPackFlow;
        this.A05 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A00 = r3;
        this.A09 = r9;
        this.A02 = C108995ce.A0g(r9);
    }

    private final C147207Sf A00(boolean z) {
        C23421Fz r7;
        C23421Fz r72;
        C23421Fz r73;
        C23421Fz r1;
        Object r12;
        C23421Fz[] r5 = new C23421Fz[7];
        C23421Fz r11 = this.A01.A0E;
        C130196j2 r4 = this.A00;
        AnonymousClass6H5 r6 = new AnonymousClass6H5(r4, 2);
        C130626jk r10 = (C130626jk) r4.A00.get();
        C27183DXs dXs = new C27183DXs((Object) new C27183DXs((Object) AnonymousClass3MZ.A0L(new GetDiscoveryStickerPackFlow$invoke$3(r6, r4, (C30391dr) null), AnonymousClass4I5.A00(r4.A02, AnonymousClass4Z8.A00(new GetDiscoveryStickerPackFlow$invoke$2((C30391dr) null), new C27182DXr(new AnonymousClass6HC(C18460wS.A00), new GetDiscoveryStickerPackFlow$invoke$1((C30391dr) null), new C147207Sf(r10, new C27183DXs((AnonymousClass1OS) new DiscoveryPackFetcher$getStickerDiscoveryPacks$2(r10, (C30391dr) null), (C23421Fz) new C28243Du4(new DiscoveryPackFetcher$getStickerDiscoveryPacks$1(r10, (C30391dr) null)), 10), 14)), r4.A04))), (Object) new GetDiscoveryStickerPackFlow$invoke$4(r6, r4, (C30391dr) null), 5), (Object) new GetDiscoveryStickerPackFlow$invoke$5((C30391dr) null), 8);
        r5[0] = AnonymousClass4Z8.A00(new StickerExpressionsDataSource$getCombinedStickerPacksFlow$1((C30391dr) null), r11, AnonymousClass4Z7.A01(AnonymousClass6HD.A00, r4.A03, dXs, new C99654tF(0)));
        if (z) {
            C130076iq r102 = (C130076iq) this.A07.get();
            r7 = AnonymousClass4I5.A00(r102.A05, new C28243Du4(new ContentStickerProvider$observeContentStickers$1(r102, (C30391dr) null)));
        } else {
            r7 = new C147197Se(AnonymousClass60S.A00, 5);
        }
        r5[1] = r7;
        if (z) {
            C130076iq r103 = (C130076iq) this.A07.get();
            r72 = AnonymousClass4I5.A00(r103.A05, new C28243Du4(new ContentStickerProvider$observeShapesStickers$1(r103, (C30391dr) null)));
        } else {
            r72 = new C147197Se(AnonymousClass60V.A00, 5);
        }
        r5[2] = r72;
        if (z) {
            r73 = new C147197Se(AnonymousClass6I0.A00, 5);
        } else {
            r73 = this.A05.A07;
        }
        r5[3] = r73;
        r5[4] = this.A06.A06;
        C130346jH r104 = (C130346jH) this.A08.get();
        C18030ve r74 = (C18030ve) C18070vi.A0E(r104.A00);
        C18070vi.A0d(r74, 0);
        if (C25291Nq.A04(r74, 9761)) {
            C99454sq r8 = new C99454sq(C26092CsA.A02(((C137836w6) r104.A01.get()).A00), 13);
            ReceivedStickersFlow$getTopReceivedStickers$1 receivedStickersFlow$getTopReceivedStickers$1 = new ReceivedStickersFlow$getTopReceivedStickers$1(r104, (C30391dr) null);
            AnonymousClass4Z6 r0 = AnonymousClass4Z6.$redex_init_class;
            C23421Fz A002 = AnonymousClass4I5.A00((C18560wh) C18070vi.A0E(r104.A02), new C27183DXs((Object) AnonymousClass4Z6.A00(new AnonymousClass5AH((C30391dr) null, receivedStickersFlow$getTopReceivedStickers$1), r8), (Object) new ReceivedStickersFlow$getTopReceivedStickers$2((C30391dr) null), 8));
            C99654tF r75 = new C99654tF(0);
            r1 = AnonymousClass4Z7.A01(C1175960d.A00, (AnonymousClass1OX) r104.A06.getValue(), A002, r75);
        } else {
            r1 = new C147197Se(C1175860c.A00, 5);
        }
        r5[5] = r1;
        if (z) {
            C130076iq r2 = (C130076iq) this.A07.get();
            r12 = AnonymousClass4I5.A00(r2.A05, new C28243Du4(new ContentStickerProvider$observeRecentShapes$1(r2, (C30391dr) null)));
        } else {
            r12 = new C147197Se(AnonymousClass60V.A00, 5);
        }
        return new C147207Sf(this, C29431cG.A0t(C18070vi.A0O(r12, r5, 6)).toArray(new C23421Fz[0]), 10);
    }
}
