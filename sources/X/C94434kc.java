package X;

import com.whatsapp.conversation.banner.strategy.AsyncBannerStrategy$initStrategy$1$1;
import com.whatsapp.conversation.banner.strategy.AsyncBannerStrategy$initStrategy$1$2;
import com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;
import java.util.List;

/* renamed from: X.4kc  reason: invalid class name and case insensitive filesystem */
public final class C94434kc implements C108615c0 {
    public ConversationBannersViewModel A00;
    public final AnonymousClass4XJ A01;
    public final PinInChatBannerViewModel A02;
    public final C94424kb A03;

    public void BjQ() {
        this.A03.BjQ();
    }

    public void C0e(List list) {
        C18070vi.A0d(list, 0);
        this.A02.A0T(list);
    }

    public void CMd() {
        this.A03.CMd();
    }

    public void CQk(AnonymousClass1E7 r4) {
        C18070vi.A0d(r4, 0);
        ConversationBannersViewModel conversationBannersViewModel = this.A00;
        if (conversationBannersViewModel == null) {
            C18070vi.A11("conversationBannersViewModel");
            throw null;
        }
        C98524rI A002 = conversationBannersViewModel.A00.A00(C77963rt.class);
        if (A002 != null) {
            conversationBannersViewModel.A03.CQ0(AnonymousClass1D6.A01(A002, r4));
        }
    }

    public void CQn(C178119Bw r2) {
        this.A03.CQn(r2);
    }

    public void CQt(Jid jid, int i) {
        C18070vi.A0d(jid, 0);
        this.A03.CQt(jid, i);
    }

    public void CR3() {
        this.A03.CR3();
    }

    public void CR4(AnonymousClass1E7 r2) {
        C18070vi.A0d(r2, 0);
        this.A03.CR4(r2);
    }

    public void CRD(AnonymousClass1E7 r2, int i) {
        C18070vi.A0d(r2, 0);
        this.A03.CRD(r2, i);
    }

    public void CRP(C195409tI r2) {
        this.A03.CRP(r2);
    }

    public void BdS(AnonymousClass1FY r6) {
        if (r6 != null) {
            AnonymousClass5N9 r4 = new AnonymousClass5N9(r6, this);
            this.A00 = (ConversationBannersViewModel) C99274sY.A00(new AnonymousClass5GG(r6), new AnonymousClass5GF(r6), new AnonymousClass5NA(r6, r4), AnonymousClass3MW.A15(ConversationBannersViewModel.class)).getValue();
            C37581pm A0H = AnonymousClass3MZ.A0H(r6);
            AsyncBannerStrategy$initStrategy$1$1 asyncBannerStrategy$initStrategy$1$1 = new AsyncBannerStrategy$initStrategy$1$1(r6, this, (C30391dr) null);
            AnonymousClass1OR r3 = AnonymousClass1OR.A00;
            C30451dy.A02(AnonymousClass3MW.A0w(r3, asyncBannerStrategy$initStrategy$1$1, A0H), r3, new AsyncBannerStrategy$initStrategy$1$2(r6, this, (C30391dr) null), AnonymousClass3MZ.A0H(r6));
        }
    }

    public C94434kc(C94424kb r1, AnonymousClass4XJ r2, PinInChatBannerViewModel pinInChatBannerViewModel) {
        C18070vi.A0k(pinInChatBannerViewModel, r2);
        this.A03 = r1;
        this.A02 = pinInChatBannerViewModel;
        this.A01 = r2;
    }
}
