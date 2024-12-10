package X;

import android.text.style.TypefaceSpan;
import android.util.Range;
import com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner;
import com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder;
import com.whatsapp.calling.views.InCallDialPadView;
import com.whatsapp.calling.views.VoipReturnToCallBanner;
import com.whatsapp.community.subgroup.views.CommunityViewGroupsView;
import com.whatsapp.communitymedia.itemviews.MediaMessageTitleView;
import com.whatsapp.conversation.comments.ui.CommentHeaderView;
import com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;
import com.whatsapp.conversation.conversationrow.audio.TranscriptionStatusView;
import com.whatsapp.conversation.conversationrow.audio.TranscriptionView;
import com.whatsapp.home.ui.HomePlaceholderActivity;
import com.whatsapp.home.ui.StarredMessagesPlaceholderActivity;
import com.whatsapp.mediacomposer.bottombar.BottomBarView;
import com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.ui.widget.ContactMerchantView;
import com.whatsapp.settings.chat.wallpaper.WallpaperMockChatView;
import com.whatsapp.statuscomposer.composer.ComposerModeTabLayout;
import com.whatsapp.stickers.flow.StickerPackFlow;
import java.util.Map;

/* renamed from: X.1Xc  reason: invalid class name and case insensitive filesystem */
public final class C27691Xc extends AnonymousClass033 {
    public AnonymousClass00S A00;
    public AnonymousClass00S A01;
    public AnonymousClass00S A02;
    public AnonymousClass00S A03;
    public AnonymousClass00S A04;
    public AnonymousClass00S A05;
    public AnonymousClass00S A06;
    public AnonymousClass00S A07;
    public AnonymousClass00S A08;
    public AnonymousClass00S A09;
    public AnonymousClass00S A0A;
    public AnonymousClass00S A0B;
    public AnonymousClass00S A0C;
    public AnonymousClass00S A0D;
    public AnonymousClass00S A0E;
    public AnonymousClass00S A0F;
    public AnonymousClass00S A0G;
    public AnonymousClass00S A0H;
    public AnonymousClass00S A0I;
    public AnonymousClass00S A0J;
    public AnonymousClass00S A0K;
    public AnonymousClass00S A0L;
    public AnonymousClass00S A0M;
    public AnonymousClass00S A0N;
    public AnonymousClass00S A0O;
    public AnonymousClass00S A0P;
    public AnonymousClass00S A0Q;
    public AnonymousClass00S A0R;
    public AnonymousClass00S A0S;
    public AnonymousClass00S A0T;
    public AnonymousClass00S A0U;
    public AnonymousClass00S A0V;
    public AnonymousClass00S A0W;
    public AnonymousClass00S A0X;
    public AnonymousClass00S A0Y;
    public AnonymousClass00S A0Z;
    public AnonymousClass00S A0a;
    public AnonymousClass00S A0b;
    public AnonymousClass00S A0c;
    public AnonymousClass00S A0d;
    public AnonymousClass00S A0e;
    public AnonymousClass00S A0f;
    public AnonymousClass00S A0g;
    public AnonymousClass00S A0h;
    public AnonymousClass00S A0i;
    public AnonymousClass00S A0j;
    public AnonymousClass00S A0k;
    public AnonymousClass00S A0l;
    public AnonymousClass00S A0m;
    public AnonymousClass00S A0n;
    public AnonymousClass00S A0o;
    public AnonymousClass00S A0p;
    public AnonymousClass00S A0q;
    public AnonymousClass00S A0r;
    public AnonymousClass00S A0s;
    public AnonymousClass00S A0t;
    public AnonymousClass00S A0u;
    public AnonymousClass00S A0v;
    public AnonymousClass00S A0w;
    public AnonymousClass00S A0x;
    public AnonymousClass00S A0y;
    public final AnonymousClass1K1 A0z;
    public final AnonymousClass10E A10;
    public final C24331Jt A11;
    public final C27691Xc A12;

    /* access modifiers changed from: private */
    public C201110w A00() {
        return C201110w.of(2, A0O(), 1, A0N(), 3, A0Q(), 4, A0P(), 5, A0M());
    }

    private C201110w A01() {
        C201210x builderWithExpectedSize = C201110w.builderWithExpectedSize(7);
        builderWithExpectedSize.put(1, A0U());
        builderWithExpectedSize.put(2, new C46112Cy());
        builderWithExpectedSize.put(3, A0T());
        builderWithExpectedSize.put(4, A0V());
        builderWithExpectedSize.put(5, A0S());
        builderWithExpectedSize.put(6, new C46102Cx());
        builderWithExpectedSize.put(7, A0R());
        return builderWithExpectedSize.build();
    }

    private C201110w A02() {
        return C201110w.of("IN", this.A10.A00.AFl, "BR", this.A0o);
    }

    public static C201110w A03() {
        return C201110w.of(C438921i.class, A0F(), C438421d.class, A0G(), AnonymousClass4TL.class, A0H(), AnonymousClass21Y.class, A0I());
    }

    public static C199410f A05(C27691Xc r0) {
        return C199410f.of(r0.A10.A00.ADq.get());
    }

    public static C52892be A06(C27691Xc r2) {
        AnonymousClass10E r1 = r2.A10;
        return new C52892be((AnonymousClass2Z9) r1.A00.A2p.get(), (C18030ve) r1.A04.get());
    }

    public static AnonymousClass3NA A07(C27691Xc r1) {
        return new AnonymousClass3NA((AnonymousClass4P1) r1.A0n.get());
    }

    public static AnonymousClass3N8 A08(C27691Xc r1) {
        return new AnonymousClass3N8((AnonymousClass4P1) r1.A0n.get());
    }

    public static C116095wO A09(C27691Xc r15) {
        Range range = C112285lE.A0M;
        AnonymousClass10E r1 = r15.A10;
        AnonymousClass1K1 r2 = r15.A0z;
        C124706Zj r3 = (C124706Zj) r2.A8G.get();
        C124716Zk r4 = (C124716Zk) r2.A8H.get();
        C124726Zl r5 = (C124726Zl) r2.A8I.get();
        C124736Zm r6 = (C124736Zm) r2.A8J.get();
        C124746Zn r7 = (C124746Zn) r2.A8K.get();
        C124756Zo r8 = (C124756Zo) r2.A8L.get();
        C124766Zp r9 = (C124766Zp) r2.A8M.get();
        C143867Fc r12 = (C143867Fc) r1.A00.AFD.get();
        return new C116095wO(r3, r4, r5, r6, r7, r8, r9, (C124776Zq) r2.A8N.get(), (C124786Zr) r2.A8O.get(), r12, (C18030ve) r1.A04.get(), (AnonymousClass1DC) r1.A95.get(), r1.A8t);
    }

    public static C66812ym A0A(C27691Xc r1) {
        return new C66812ym((AnonymousClass1VW) r1.A10.A2d.get());
    }

    /* access modifiers changed from: private */
    public C86114Qf A0B() {
        AnonymousClass10E r1 = this.A10;
        return new C86114Qf((AnonymousClass11S) r1.A63.get(), (C71263Eo) r1.A7t.get(), (AnonymousClass1M9) r1.A2f.get(), (AnonymousClass1MZ) r1.A4t.get());
    }

    public static AnonymousClass4PJ A0D(C27691Xc r9) {
        AnonymousClass10E r1 = r9.A10;
        return new AnonymousClass4PJ((AnonymousClass4N1) r9.A0p.get(), r9.A0B(), C000200d.A00(r1.A1l), C000200d.A00(r9.A0z.A6O), C000200d.A00(r9.A0t), C000200d.A00(r9.A0x), C000200d.A00(r1.A8X), C000200d.A00(r1.A4t));
    }

    public static VCOverscrollEntryPointStateHolder A0E(C27691Xc r12) {
        AnonymousClass10E r1 = r12.A10;
        return new VCOverscrollEntryPointStateHolder(C000200d.A00(r1.A04), C000200d.A00(r1.A63), C000200d.A00(r1.A1l), C000200d.A00(r1.A2f), C000200d.A00(r12.A0z.A6O), C000200d.A00(r12.A0p), C000200d.A00(r1.A4t), C000200d.A00(r12.A0y), C000200d.A00(r1.A8X), C27011Uj.A00(), (C18600wl) r1.A9F.get());
    }

    public static AnonymousClass8A6 A0F() {
        Object A012 = C221618v.A01(16489);
        C18070vi.A0z(A012, "null cannot be cast to non-null type com.whatsapp.communitymedia.itemviews.binders.CustomViewsBinder<android.view.View, android.view.View, kotlin.Any>");
        AnonymousClass8A6 r1 = (AnonymousClass8A6) A012;
        AnonymousClass00W.A02(r1);
        return r1;
    }

    public static AnonymousClass8A6 A0G() {
        Object A012 = C221618v.A01(16490);
        C18070vi.A0z(A012, "null cannot be cast to non-null type com.whatsapp.communitymedia.itemviews.binders.CustomViewsBinder<android.view.View, android.view.View, kotlin.Any>");
        AnonymousClass8A6 r1 = (AnonymousClass8A6) A012;
        AnonymousClass00W.A02(r1);
        return r1;
    }

    public static AnonymousClass8A6 A0H() {
        Object A012 = C221618v.A01(16491);
        C18070vi.A0z(A012, "null cannot be cast to non-null type com.whatsapp.communitymedia.itemviews.binders.CustomViewsBinder<android.view.View, android.view.View, kotlin.Any>");
        AnonymousClass8A6 r1 = (AnonymousClass8A6) A012;
        AnonymousClass00W.A02(r1);
        return r1;
    }

    public static AnonymousClass8A6 A0I() {
        Object A012 = C221618v.A01(16492);
        C18070vi.A0z(A012, "null cannot be cast to non-null type com.whatsapp.communitymedia.itemviews.binders.CustomViewsBinder<android.view.View, android.view.View, kotlin.Any>");
        AnonymousClass8A6 r1 = (AnonymousClass8A6) A012;
        AnonymousClass00W.A02(r1);
        return r1;
    }

    private AnonymousClass4XF A0J() {
        TypefaceSpan typefaceSpan = AnonymousClass4XF.A02;
        AnonymousClass10E r1 = this.A10;
        return new AnonymousClass4XF((AnonymousClass118) r1.ABY.get(), (C18000vb) r1.ABz.get());
    }

    public static AnonymousClass4Q6 A0L(C27691Xc r3) {
        return new AnonymousClass4Q6((C18030ve) r3.A10.A04.get(), (AnonymousClass4R1) r3.A0z.A5l.get());
    }

    private C66982z3 A0M() {
        return new C66982z3((C34811l7) this.A10.A92.get());
    }

    private AQN A0N() {
        AnonymousClass10E r1 = this.A10;
        AnonymousClass00H A002 = C000200d.A00(r1.A1s);
        A8Q a8q = (A8Q) r1.A1p.get();
        return new AQN((C195529tU) r1.A1t.get(), a8q, (AnonymousClass122) r1.A2y.get(), A002, C000200d.A00(r1.A1H), C000200d.A00(r1.A1y), C000200d.A00(r1.A0s));
    }

    private C94844lH A0O() {
        return new C94844lH((AnonymousClass1KB) this.A10.A4b.get());
    }

    private C66992z4 A0P() {
        AnonymousClass10E r1 = this.A10;
        return new C66992z4((AnonymousClass190) r1.A31.get(), (C36361nl) r1.A5h.get(), (C18030ve) r1.A04.get(), C000200d.A00(r1.An8));
    }

    private C169838ne A0R() {
        return new C169838ne((C32021gV) this.A10.A6k.get());
    }

    private C169848nf A0S() {
        return new C169848nf((C32021gV) this.A10.A6k.get());
    }

    private C169878ni A0T() {
        AnonymousClass10E r1 = this.A10;
        AnonymousClass118 r2 = (AnonymousClass118) r1.ABY.get();
        AnonymousClass1R2 r6 = (AnonymousClass1R2) r1.A8L.get();
        C18000vb r3 = (C18000vb) r1.ABz.get();
        C32021gV r7 = (C32021gV) r1.A6k.get();
        return new C169878ni(r2, r3, (C18030ve) r1.A04.get(), (AnonymousClass1QO) r1.A8G.get(), r6, r7, (AnonymousClass10I) r1.AC1.get());
    }

    private C169868nh A0U() {
        AnonymousClass10E r1 = this.A10;
        return new C169868nh((AnonymousClass118) r1.ABY.get(), (C18000vb) r1.ABz.get(), (C32021gV) r1.A6k.get());
    }

    private C169858ng A0V() {
        AnonymousClass10E r1 = this.A10;
        return new C169858ng((AnonymousClass118) r1.ABY.get(), (C32021gV) r1.A6k.get());
    }

    /* access modifiers changed from: private */
    public AnonymousClass4ND A0W() {
        AnonymousClass10E r1 = this.A10;
        return new AnonymousClass4ND((AnonymousClass11P) r1.AAv.get(), (C18000vb) r1.ABz.get());
    }

    public static AnonymousClass71Q A0Y(C27691Xc r1) {
        return new AnonymousClass71Q(C000200d.A00(r1.A0w));
    }

    public static AnonymousClass4RA A0Z(C27691Xc r2) {
        AnonymousClass10E r1 = r2.A10;
        return new AnonymousClass4RA((AnonymousClass11P) r1.AAv.get(), C000200d.A00(r1.A00.ACo));
    }

    /* access modifiers changed from: private */
    public C130196j2 A0a() {
        AnonymousClass10E r1 = this.A10;
        return new C130196j2(C000200d.A00(r1.AAP), C000200d.A00(this.A0r), (C18600wl) r1.A9F.get(), (C18600wl) r1.A9E.get());
    }

    /* access modifiers changed from: private */
    public StickerPackFlow A0c() {
        AnonymousClass10E r2 = this.A10;
        return new StickerPackFlow((C18030ve) r2.A04.get(), C000200d.A00(r2.A0V), C000200d.A00(r2.Ak9), C000200d.A00(r2.AAN), C000200d.A00(r2.AAP), C000200d.A00(r2.AAR), C000200d.A00(r2.Ajr), C000200d.A00(r2.Ajt), C000200d.A00(r2.Ak6), C000200d.A00(r2.Alk), C000200d.A00(r2.Aky), C000200d.A00(r2.AAu), (C18600wl) r2.A9F.get(), C27011Uj.A00(), (AnonymousClass1OX) r2.A9C.get());
    }

    /* access modifiers changed from: private */
    public C52652bG A0e() {
        return new C52652bG((C35761ml) this.A10.Als.get());
    }

    private void A0k() {
        AnonymousClass10E r3 = this.A10;
        C24331Jt r2 = this.A11;
        AnonymousClass1K1 r1 = this.A0z;
        C27691Xc r4 = this.A12;
        this.A0b = new C27701Xd(r1, r2, r3, r4, 0);
        this.A04 = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 1));
        AnonymousClass00S A022 = C19870z9.A01();
        this.A0S = A022;
        this.A0T = A022;
        this.A0f = A022;
        this.A0g = A022;
        this.A0m = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 3));
        this.A0E = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 2));
        this.A0n = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 4));
        this.A0I = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 6));
        this.A0J = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 5));
        this.A0p = new C27701Xd(r1, r2, r3, r4, 7);
        this.A0v = new C27701Xd(r1, r2, r3, r4, 9);
        this.A0t = new C27701Xd(r1, r2, r3, r4, 8);
        this.A0x = new C27701Xd(r1, r2, r3, r4, 10);
        this.A0y = new C27701Xd(r1, r2, r3, r4, 11);
        this.A0q = new C27701Xd(r1, r2, r3, r4, 13);
        this.A0a = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 12));
        this.A0P = new C27701Xd(r1, r2, r3, r4, 14);
        this.A0W = new C27701Xd(r1, r2, r3, r4, 15);
        this.A0h = new C27701Xd(r1, r2, r3, r4, 16);
        this.A01 = new C27701Xd(r1, r2, r3, r4, 17);
        this.A0U = new C27701Xd(r1, r2, r3, r4, 18);
        this.A02 = new C27701Xd(r1, r2, r3, r4, 19);
        this.A0K = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 20));
        this.A0k = new C27701Xd(r1, r2, r3, r4, 21);
        this.A0L = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 22));
        this.A0M = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 23));
        this.A00 = new C27701Xd(r1, r2, r3, r4, 24);
        this.A0N = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 26));
        this.A0O = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 25));
        this.A0Z = new C27701Xd(r1, r2, r3, r4, 27);
        this.A0i = new C27701Xd(r1, r2, r3, r4, 28);
        this.A0l = new C27701Xd(r1, r2, r3, r4, 29);
        this.A05 = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 31));
        this.A06 = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 30));
        this.A0R = new C27701Xd(r1, r2, r3, r4, 32);
        this.A0j = new C27701Xd(r1, r2, r3, r4, 33);
        this.A0Q = new C27701Xd(r1, r2, r3, r4, 34);
        this.A07 = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 35));
        this.A08 = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 36));
        this.A09 = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 37));
        this.A0A = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 38));
        this.A03 = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 39));
        this.A0o = new C27701Xd(r1, r2, r3, r4, 40);
        this.A0c = new C27701Xd(r1, r2, r3, r4, 41);
        this.A0B = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 42));
        this.A0C = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 43));
        this.A0r = new C27701Xd(r1, r2, r3, r4, 45);
        this.A0e = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 44));
        this.A0s = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 46));
        this.A0w = new C27701Xd(r1, r2, r3, r4, 47);
        this.A0V = new C27701Xd(r1, r2, r3, r4, 48);
        this.A0X = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 51));
        this.A0u = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 52));
        this.A0Y = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 50));
        this.A0D = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 49));
        this.A0F = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 53));
        this.A0d = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 54));
        this.A0G = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 55));
        this.A0H = AnonymousClass00f.A00(new C27701Xd(r1, r2, r3, r4, 56));
    }

    public static void A0l(AnonymousClass1L9 r0, CommunityViewGroupsView communityViewGroupsView) {
        communityViewGroupsView.A00 = r0;
    }

    public static void A0m(C27691Xc r2, VoipInCallNotifBanner voipInCallNotifBanner) {
        AnonymousClass10E r1 = r2.A10;
        A1K(voipInCallNotifBanner, (C18030ve) r1.A04.get());
        A15((AnonymousClass1KB) r1.A4b.get(), voipInCallNotifBanner);
        A1I(voipInCallNotifBanner, (C27201Vd) r1.A2j.get());
        A1G(voipInCallNotifBanner, (AnonymousClass1VW) r1.A2d.get());
        A1H(voipInCallNotifBanner, (AnonymousClass1M9) r1.A2f.get());
        A1J(voipInCallNotifBanner, (AnonymousClass11C) r1.AAp.get());
        A1F(voipInCallNotifBanner, A0A(r2));
    }

    public static void A0n(C27691Xc r1, InCallDialPadView inCallDialPadView) {
        AnonymousClass10E r12 = r1.A10;
        A1L(inCallDialPadView, (AnonymousClass11C) r12.AAp.get());
        A1D((AnonymousClass1HQ) r12.A99.get(), inCallDialPadView);
    }

    public static void A0o(C27691Xc r1, VoipReturnToCallBanner voipReturnToCallBanner) {
        AnonymousClass10E r12 = r1.A10;
        A1S(voipReturnToCallBanner, (C18030ve) r12.A04.get());
        A1U(voipReturnToCallBanner, (C24901Mc) r12.AA5.get());
        A1V(voipReturnToCallBanner, (AnonymousClass1VT) r12.A1X.get());
        A1M(voipReturnToCallBanner, (AnonymousClass1HS) r12.A98.get());
        A1E((AnonymousClass1HQ) r12.A99.get(), voipReturnToCallBanner);
        A1N(voipReturnToCallBanner, (AnonymousClass1M9) r12.A2f.get());
        A1Q(voipReturnToCallBanner, (AnonymousClass11C) r12.AAp.get());
        A1P(voipReturnToCallBanner, (C24921Me) r12.ABX.get());
        A1R(voipReturnToCallBanner, (C18000vb) r12.ABz.get());
        A1O(voipReturnToCallBanner, (C24671Lf) r12.A2g.get());
        A1T(voipReturnToCallBanner, (AnonymousClass126) r12.A4h.get());
        A1C((C61182pG) r12.A1i.get(), voipReturnToCallBanner);
    }

    public static void A0p(C27691Xc r1, CommunityViewGroupsView communityViewGroupsView) {
        AnonymousClass10E r12 = r1.A10;
        A0l((AnonymousClass1L9) r12.A0E.get(), communityViewGroupsView);
        A1W(communityViewGroupsView, C000200d.A00(r12.A2M));
    }

    public static void A0q(C27691Xc r1, MediaMessageTitleView mediaMessageTitleView) {
        AnonymousClass10E r12 = r1.A10;
        A1Y(mediaMessageTitleView, (C32091gc) r12.A6G.get());
        A1X(mediaMessageTitleView, (C18000vb) r12.ABz.get());
    }

    public static void A0r(C27691Xc r1, CommentHeaderView commentHeaderView) {
        AnonymousClass10E r12 = r1.A10;
        A1e(commentHeaderView, C000200d.A00(r12.AmV));
        A1a((AnonymousClass1M9) r12.A2f.get(), commentHeaderView);
        A1f(commentHeaderView, (C18600wl) r12.A9F.get());
        A16((AnonymousClass11S) r12.A63.get(), commentHeaderView);
        A1d((C24921Me) r12.ABX.get(), commentHeaderView);
    }

    public static void A0s(C27691Xc r1, InteractiveButtonsRowContentLayout interactiveButtonsRowContentLayout) {
        AnonymousClass10E r12 = r1.A10;
        A1h(interactiveButtonsRowContentLayout, (C18000vb) r12.ABz.get());
        A1i(interactiveButtonsRowContentLayout, (C18030ve) r12.A04.get());
    }

    public static void A0t(C27691Xc r2, InteractiveMessageButton interactiveMessageButton) {
        AnonymousClass10E r1 = r2.A10;
        A1l(interactiveMessageButton, (C18030ve) r1.A04.get());
        A17((AnonymousClass11S) r1.A63.get(), interactiveMessageButton);
        A1B((C33251iW) r1.ABA.get(), interactiveMessageButton);
        A1o(interactiveMessageButton, (AnonymousClass1QS) r1.A8J.get());
        A1q(interactiveMessageButton, (AnonymousClass1R2) r1.A8L.get());
        A1j(interactiveMessageButton, (C18000vb) r1.ABz.get());
        A1k(interactiveMessageButton, (C24751Ln) r1.ABe.get());
        A1p(interactiveMessageButton, AnonymousClass1K1.A1R(r2.A0z));
        A1c((AnonymousClass1PM) r1.ABM.get(), interactiveMessageButton);
        A1w(interactiveMessageButton, C000200d.A00(r1.A8H));
        A1n(interactiveMessageButton, (AnonymousClass1QO) r1.A8G.get());
        A1m(interactiveMessageButton, (AnonymousClass1QJ) r1.A8F.get());
        A1v(interactiveMessageButton, C000200d.A00(r1.A92));
        A1t(interactiveMessageButton, C000200d.A00(r1.A00.A9e));
        A1u(interactiveMessageButton, C000200d.A00(r2.A0Q));
        A1s(interactiveMessageButton, C000200d.A00(r1.A8r));
        A1r(interactiveMessageButton, C000200d.A00(r1.AJi));
        A1x(interactiveMessageButton, r2.A02());
    }

    public static void A0u(C27691Xc r2, InteractiveMessageView interactiveMessageView) {
        AnonymousClass10E r1 = r2.A10;
        A1z(interactiveMessageView, (C18030ve) r1.A04.get());
        A20(interactiveMessageView, (AnonymousClass10I) r1.AC1.get());
        A1y(interactiveMessageView, (C18000vb) r1.ABz.get());
        A18((AnonymousClass11S) r1.A63.get(), interactiveMessageView);
        A21(interactiveMessageView, C000200d.A00(r1.AJ3));
        A1g((AnonymousClass70E) r1.A2I.get(), interactiveMessageView);
        A27(interactiveMessageView, r2.A01());
        A24(interactiveMessageView, C000200d.A00(r2.A0Q));
        A25(interactiveMessageView, C000200d.A00(r1.A5R));
        A26(interactiveMessageView, C000200d.A00(r1.A7r));
        A23(interactiveMessageView, C000200d.A00(r1.A8r));
        A22(interactiveMessageView, C000200d.A00(r1.AJi));
    }

    public static void A0v(C27691Xc r2, TranscriptionStatusView transcriptionStatusView) {
        AnonymousClass10E r22 = r2.A10;
        A2F(transcriptionStatusView, (AnonymousClass1OX) r22.A9C.get());
        A29(transcriptionStatusView, (AnonymousClass1Nb) r22.A2E.get());
        AnonymousClass10G A112 = r22.A00;
        A28(transcriptionStatusView, (AnonymousClass4V5) A112.A9c.get());
        A2D(transcriptionStatusView, (C18600wl) r22.A9E.get());
        A2A(transcriptionStatusView, (C36401np) A112.A30.get());
        A2E(transcriptionStatusView, (C18600wl) r22.A9F.get());
        A2C(transcriptionStatusView, C000200d.A00(r22.AXd));
        A2B(transcriptionStatusView, (C88534a3) r22.A9G.get());
    }

    public static void A0w(C27691Xc r2, TranscriptionView transcriptionView) {
        AnonymousClass10E r22 = r2.A10;
        A2H(transcriptionView, (C18030ve) r22.A04.get());
        A2P(transcriptionView, (AnonymousClass1OX) r22.A9C.get());
        A2K(transcriptionView, (AnonymousClass1Nb) r22.A2E.get());
        A2N(transcriptionView, (C18600wl) r22.A9E.get());
        AnonymousClass10G A112 = r22.A00;
        A2L(transcriptionView, (C36401np) A112.A30.get());
        A2O(transcriptionView, (C18600wl) r22.A9F.get());
        A2J(transcriptionView, (C25749ClJ) r22.A5z.get());
        A2M(transcriptionView, (C128826gk) A112.AI9.get());
        A2G(transcriptionView, (C19830z4) r22.ABl.get());
        A2I(transcriptionView, (AnonymousClass18K) r22.A9B.get());
    }

    public static void A0x(C27691Xc r3, HomePlaceholderActivity.HomePlaceholderView homePlaceholderView) {
        AnonymousClass10E r2 = r3.A10;
        A2X((C18030ve) r2.A04.get(), homePlaceholderView);
        AnonymousClass10G A112 = r2.A00;
        A2c(homePlaceholderView, (C36401np) A112.A30.get());
        A19((AnonymousClass11S) r2.A63.get(), homePlaceholderView);
        A2f(homePlaceholderView, C000200d.A00(A112.A4a));
        A2d(homePlaceholderView, (AnonymousClass1DC) r2.A95.get());
        A1Z(AnonymousClass1K1.A0p(r3.A0z), homePlaceholderView);
        A2e(homePlaceholderView, (AnonymousClass10I) r2.AC1.get());
    }

    public static void A0y(C27691Xc r1, StarredMessagesPlaceholderActivity.StarredMessagePlaceholderView starredMessagePlaceholderView) {
        AnonymousClass10E r12 = r1.A10;
        A2Y((C18030ve) r12.A04.get(), starredMessagePlaceholderView);
        A2g(starredMessagePlaceholderView, (C36401np) r12.A00.A30.get());
        A2h(starredMessagePlaceholderView, (AnonymousClass10I) r12.AC1.get());
    }

    public static void A0z(C27691Xc r1, BottomBarView bottomBarView) {
        AnonymousClass10E r12 = r1.A10;
        A2Z((C18030ve) r12.A04.get(), bottomBarView);
        A2i(bottomBarView, (C24641Lc) r12.AAB.get());
    }

    public static void A10(C27691Xc r1, DefaultRecipientsView defaultRecipientsView) {
        A2j(defaultRecipientsView, (AnonymousClass85D) r1.A0s.get());
        A2V((C18000vb) r1.A10.ABz.get(), defaultRecipientsView);
    }

    public static void A11(C27691Xc r1, NumberEntryKeyboard numberEntryKeyboard) {
        AnonymousClass10E r12 = r1.A10;
        A2W((C18000vb) r12.ABz.get(), numberEntryKeyboard);
        A2R((AnonymousClass11C) r12.AAp.get(), numberEntryKeyboard);
    }

    public static void A12(C27691Xc r1, ContactMerchantView contactMerchantView) {
        AnonymousClass10E r12 = r1.A10;
        A2a((C18030ve) r12.A04.get(), contactMerchantView);
        A1b((AnonymousClass1M9) r12.A2f.get(), contactMerchantView);
        A2k(contactMerchantView, (C36401np) r12.A00.A30.get());
        A2S((AnonymousClass11C) r12.AAp.get(), contactMerchantView);
    }

    public static void A13(C27691Xc r2, WallpaperMockChatView wallpaperMockChatView) {
        AnonymousClass10E r1 = r2.A10;
        A2U((AnonymousClass11P) r1.AAv.get(), wallpaperMockChatView);
        A1A((AnonymousClass11S) r1.A63.get(), wallpaperMockChatView);
        A2l(wallpaperMockChatView, C000200d.A00(r2.A0z.A0n));
    }

    public static void A14(C27691Xc r1, ComposerModeTabLayout composerModeTabLayout) {
        AnonymousClass10E r12 = r1.A10;
        A2b((C18030ve) r12.A04.get(), composerModeTabLayout);
        A2T((AnonymousClass11C) r12.AAp.get(), composerModeTabLayout);
    }

    public static void A15(AnonymousClass1KB r0, VoipInCallNotifBanner voipInCallNotifBanner) {
        voipInCallNotifBanner.A03 = r0;
    }

    public static void A16(AnonymousClass11S r0, CommentHeaderView commentHeaderView) {
        commentHeaderView.A00 = r0;
    }

    public static void A17(AnonymousClass11S r0, InteractiveMessageButton interactiveMessageButton) {
        interactiveMessageButton.A00 = r0;
    }

    public static void A18(AnonymousClass11S r0, InteractiveMessageView interactiveMessageView) {
        interactiveMessageView.A03 = r0;
    }

    public static void A19(AnonymousClass11S r0, HomePlaceholderActivity.HomePlaceholderView homePlaceholderView) {
        homePlaceholderView.A05 = r0;
    }

    public static void A1A(AnonymousClass11S r0, WallpaperMockChatView wallpaperMockChatView) {
        wallpaperMockChatView.A05 = r0;
    }

    public static void A1B(C33251iW r0, InteractiveMessageButton interactiveMessageButton) {
        interactiveMessageButton.A01 = r0;
    }

    public static void A1C(C61182pG r0, C110665gi r1) {
        r1.A00 = r0;
    }

    public static void A1D(AnonymousClass1HQ r0, InCallDialPadView inCallDialPadView) {
        inCallDialPadView.A00 = r0;
    }

    public static void A1E(AnonymousClass1HQ r0, C110665gi r1) {
        r1.A01 = r0;
    }

    public static void A1F(VoipInCallNotifBanner voipInCallNotifBanner, C66812ym r1) {
        voipInCallNotifBanner.A06 = r1;
    }

    public static void A1G(VoipInCallNotifBanner voipInCallNotifBanner, AnonymousClass1VW r1) {
        voipInCallNotifBanner.A07 = r1;
    }

    public static void A1H(VoipInCallNotifBanner voipInCallNotifBanner, AnonymousClass1M9 r1) {
        voipInCallNotifBanner.A08 = r1;
    }

    public static void A1I(VoipInCallNotifBanner voipInCallNotifBanner, C27201Vd r1) {
        voipInCallNotifBanner.A09 = r1;
    }

    public static void A1J(VoipInCallNotifBanner voipInCallNotifBanner, AnonymousClass11C r1) {
        voipInCallNotifBanner.A0A = r1;
    }

    public static void A1K(VoipInCallNotifBanner voipInCallNotifBanner, C18030ve r1) {
        voipInCallNotifBanner.A0B = r1;
    }

    public static void A1L(InCallDialPadView inCallDialPadView, AnonymousClass11C r1) {
        inCallDialPadView.A01 = r1;
    }

    public static void A1M(C110665gi r0, AnonymousClass1HS r1) {
        r0.A02 = r1;
    }

    public static void A1N(C110665gi r0, AnonymousClass1M9 r1) {
        r0.A05 = r1;
    }

    public static void A1O(C110665gi r0, C24671Lf r1) {
        r0.A06 = r1;
    }

    public static void A1P(C110665gi r0, C24921Me r1) {
        r0.A07 = r1;
    }

    public static void A1Q(C110665gi r0, AnonymousClass11C r1) {
        r0.A08 = r1;
    }

    public static void A1R(C110665gi r0, C18000vb r1) {
        r0.A09 = r1;
    }

    public static void A1S(C110665gi r0, C18030ve r1) {
        r0.A0A = r1;
    }

    public static void A1T(C110665gi r0, AnonymousClass126 r1) {
        r0.A0B = r1;
    }

    public static void A1U(C110665gi r0, C24901Mc r1) {
        r0.A0E = r1;
    }

    public static void A1V(C110665gi r0, AnonymousClass1VT r1) {
        r0.A0F = r1;
    }

    public static void A1W(CommunityViewGroupsView communityViewGroupsView, AnonymousClass00H r1) {
        communityViewGroupsView.A02 = r1;
    }

    public static void A1X(MediaMessageTitleView mediaMessageTitleView, C18000vb r1) {
        mediaMessageTitleView.A01 = r1;
    }

    public static void A1Y(MediaMessageTitleView mediaMessageTitleView, C32091gc r1) {
        mediaMessageTitleView.A02 = r1;
    }

    public static void A1Z(AnonymousClass17T r0, HomePlaceholderActivity.HomePlaceholderView homePlaceholderView) {
        homePlaceholderView.A06 = r0;
    }

    public static void A1a(AnonymousClass1M9 r0, CommentHeaderView commentHeaderView) {
        commentHeaderView.A01 = r0;
    }

    public static void A1b(AnonymousClass1M9 r0, ContactMerchantView contactMerchantView) {
        contactMerchantView.A00 = r0;
    }

    public static void A1c(AnonymousClass1PM r0, InteractiveMessageButton interactiveMessageButton) {
        interactiveMessageButton.A02 = r0;
    }

    public static void A1d(C24921Me r0, CommentHeaderView commentHeaderView) {
        commentHeaderView.A02 = r0;
    }

    public static void A1e(CommentHeaderView commentHeaderView, AnonymousClass00H r1) {
        commentHeaderView.A03 = r1;
    }

    public static void A1f(CommentHeaderView commentHeaderView, C18600wl r1) {
        commentHeaderView.A05 = r1;
    }

    public static void A1g(AnonymousClass70E r0, InteractiveMessageView interactiveMessageView) {
        interactiveMessageView.A08 = r0;
    }

    public static void A1h(InteractiveButtonsRowContentLayout interactiveButtonsRowContentLayout, C18000vb r1) {
        interactiveButtonsRowContentLayout.A01 = r1;
    }

    public static void A1i(InteractiveButtonsRowContentLayout interactiveButtonsRowContentLayout, C18030ve r1) {
        interactiveButtonsRowContentLayout.A02 = r1;
    }

    public static void A1j(InteractiveMessageButton interactiveMessageButton, C18000vb r1) {
        interactiveMessageButton.A03 = r1;
    }

    public static void A1k(InteractiveMessageButton interactiveMessageButton, C24751Ln r1) {
        interactiveMessageButton.A04 = r1;
    }

    public static void A1l(InteractiveMessageButton interactiveMessageButton, C18030ve r1) {
        interactiveMessageButton.A05 = r1;
    }

    public static void A1m(InteractiveMessageButton interactiveMessageButton, AnonymousClass1QJ r1) {
        interactiveMessageButton.A06 = r1;
    }

    public static void A1n(InteractiveMessageButton interactiveMessageButton, AnonymousClass1QO r1) {
        interactiveMessageButton.A07 = r1;
    }

    public static void A1o(InteractiveMessageButton interactiveMessageButton, AnonymousClass1QS r1) {
        interactiveMessageButton.A08 = r1;
    }

    public static void A1p(InteractiveMessageButton interactiveMessageButton, C85754Op r1) {
        interactiveMessageButton.A09 = r1;
    }

    public static void A1q(InteractiveMessageButton interactiveMessageButton, AnonymousClass1R2 r1) {
        interactiveMessageButton.A0A = r1;
    }

    public static void A1r(InteractiveMessageButton interactiveMessageButton, AnonymousClass00H r1) {
        interactiveMessageButton.A0B = r1;
    }

    public static void A1s(InteractiveMessageButton interactiveMessageButton, AnonymousClass00H r1) {
        interactiveMessageButton.A0C = r1;
    }

    public static void A1t(InteractiveMessageButton interactiveMessageButton, AnonymousClass00H r1) {
        interactiveMessageButton.A0D = r1;
    }

    public static void A1u(InteractiveMessageButton interactiveMessageButton, AnonymousClass00H r1) {
        interactiveMessageButton.A0E = r1;
    }

    public static void A1v(InteractiveMessageButton interactiveMessageButton, AnonymousClass00H r1) {
        interactiveMessageButton.A0F = r1;
    }

    public static void A1w(InteractiveMessageButton interactiveMessageButton, AnonymousClass00H r1) {
        interactiveMessageButton.A0G = r1;
    }

    public static void A1x(InteractiveMessageButton interactiveMessageButton, Map map) {
        interactiveMessageButton.A0I = map;
    }

    public static void A1y(InteractiveMessageView interactiveMessageView, C18000vb r1) {
        interactiveMessageView.A0A = r1;
    }

    public static void A1z(InteractiveMessageView interactiveMessageView, C18030ve r1) {
        interactiveMessageView.A0B = r1;
    }

    public static void A20(InteractiveMessageView interactiveMessageView, AnonymousClass10I r1) {
        interactiveMessageView.A0C = r1;
    }

    public static void A21(InteractiveMessageView interactiveMessageView, AnonymousClass00H r1) {
        interactiveMessageView.A0D = r1;
    }

    public static void A22(InteractiveMessageView interactiveMessageView, AnonymousClass00H r1) {
        interactiveMessageView.A0E = r1;
    }

    public static void A23(InteractiveMessageView interactiveMessageView, AnonymousClass00H r1) {
        interactiveMessageView.A0F = r1;
    }

    public static void A24(InteractiveMessageView interactiveMessageView, AnonymousClass00H r1) {
        interactiveMessageView.A0G = r1;
    }

    public static void A25(InteractiveMessageView interactiveMessageView, AnonymousClass00H r1) {
        interactiveMessageView.A0H = r1;
    }

    public static void A26(InteractiveMessageView interactiveMessageView, AnonymousClass00H r1) {
        interactiveMessageView.A0I = r1;
    }

    public static void A27(InteractiveMessageView interactiveMessageView, Map map) {
        interactiveMessageView.A0L = map;
    }

    public static void A28(TranscriptionStatusView transcriptionStatusView, AnonymousClass4V5 r1) {
        transcriptionStatusView.A00 = r1;
    }

    public static void A29(TranscriptionStatusView transcriptionStatusView, AnonymousClass1Nb r1) {
        transcriptionStatusView.A01 = r1;
    }

    public static void A2A(TranscriptionStatusView transcriptionStatusView, C36401np r1) {
        transcriptionStatusView.A02 = r1;
    }

    public static void A2B(TranscriptionStatusView transcriptionStatusView, C88534a3 r1) {
        transcriptionStatusView.A03 = r1;
    }

    public static void A2C(TranscriptionStatusView transcriptionStatusView, AnonymousClass00H r1) {
        transcriptionStatusView.A04 = r1;
    }

    public static void A2D(TranscriptionStatusView transcriptionStatusView, C18600wl r1) {
        transcriptionStatusView.A06 = r1;
    }

    public static void A2E(TranscriptionStatusView transcriptionStatusView, C18600wl r1) {
        transcriptionStatusView.A07 = r1;
    }

    public static void A2F(TranscriptionStatusView transcriptionStatusView, AnonymousClass1OX r1) {
        transcriptionStatusView.A08 = r1;
    }

    public static void A2G(TranscriptionView transcriptionView, C19830z4 r1) {
        transcriptionView.A00 = r1;
    }

    public static void A2H(TranscriptionView transcriptionView, C18030ve r1) {
        transcriptionView.A01 = r1;
    }

    public static void A2I(TranscriptionView transcriptionView, AnonymousClass18K r1) {
        transcriptionView.A02 = r1;
    }

    public static void A2J(TranscriptionView transcriptionView, C25749ClJ clJ) {
        transcriptionView.A03 = clJ;
    }

    public static void A2K(TranscriptionView transcriptionView, AnonymousClass1Nb r1) {
        transcriptionView.A04 = r1;
    }

    public static void A2L(TranscriptionView transcriptionView, C36401np r1) {
        transcriptionView.A05 = r1;
    }

    public static void A2M(TranscriptionView transcriptionView, C128826gk r1) {
        transcriptionView.A06 = r1;
    }

    public static void A2N(TranscriptionView transcriptionView, C18600wl r1) {
        transcriptionView.A08 = r1;
    }

    public static void A2O(TranscriptionView transcriptionView, C18600wl r1) {
        transcriptionView.A09 = r1;
    }

    public static void A2P(TranscriptionView transcriptionView, AnonymousClass1OX r1) {
        transcriptionView.A0A = r1;
    }

    private void A2Q(AQO aqo) {
        AnonymousClass10E r1 = this.A10;
        C64042u7.A04(aqo, (C18030ve) r1.A04.get());
        C64042u7.A0A(aqo, (AnonymousClass1R2) r1.A8L.get());
        C64042u7.A09(aqo, (C192479oS) r1.A00.AES.get());
        C64042u7.A07(aqo, (AnonymousClass1QS) r1.A8J.get());
        C64042u7.A03(aqo, (C24751Ln) r1.ABe.get());
        C64042u7.A08(aqo, AnonymousClass1K1.A1R(this.A0z));
        C64042u7.A06(aqo, (AnonymousClass1QO) r1.A8G.get());
        C64042u7.A05(aqo, (ALX) r1.AcF.get());
        C64042u7.A0C(aqo, C000200d.A00(r1.ATu));
        C64042u7.A0D(aqo, C000200d.A00(r1.AdF));
        C64042u7.A00(C19880zA.A00(), aqo);
        C64042u7.A02((C26911Ty) r1.A1J.get(), aqo);
        C64042u7.A01((C196149uX) r1.A1I.get(), aqo);
        C64042u7.A0B(aqo, C000200d.A00(r1.A1H));
    }

    public static void A2R(AnonymousClass11C r0, NumberEntryKeyboard numberEntryKeyboard) {
        numberEntryKeyboard.A05 = r0;
    }

    public static void A2S(AnonymousClass11C r0, ContactMerchantView contactMerchantView) {
        contactMerchantView.A01 = r0;
    }

    public static void A2T(AnonymousClass11C r0, ComposerModeTabLayout composerModeTabLayout) {
        composerModeTabLayout.A01 = r0;
    }

    public static void A2U(AnonymousClass11P r0, WallpaperMockChatView wallpaperMockChatView) {
        wallpaperMockChatView.A08 = r0;
    }

    public static void A2V(C18000vb r0, DefaultRecipientsView defaultRecipientsView) {
        defaultRecipientsView.A01 = r0;
    }

    public static void A2W(C18000vb r0, NumberEntryKeyboard numberEntryKeyboard) {
        numberEntryKeyboard.A06 = r0;
    }

    public static void A2X(C18030ve r0, HomePlaceholderActivity.HomePlaceholderView homePlaceholderView) {
        homePlaceholderView.A07 = r0;
    }

    public static void A2Y(C18030ve r0, StarredMessagesPlaceholderActivity.StarredMessagePlaceholderView starredMessagePlaceholderView) {
        starredMessagePlaceholderView.A02 = r0;
    }

    public static void A2Z(C18030ve r0, BottomBarView bottomBarView) {
        bottomBarView.A00 = r0;
    }

    public static void A2a(C18030ve r0, ContactMerchantView contactMerchantView) {
        contactMerchantView.A02 = r0;
    }

    public static void A2b(C18030ve r0, ComposerModeTabLayout composerModeTabLayout) {
        composerModeTabLayout.A02 = r0;
    }

    public static void A2c(HomePlaceholderActivity.HomePlaceholderView homePlaceholderView, C36401np r1) {
        homePlaceholderView.A09 = r1;
    }

    public static void A2d(HomePlaceholderActivity.HomePlaceholderView homePlaceholderView, AnonymousClass1DC r1) {
        homePlaceholderView.A0A = r1;
    }

    public static void A2e(HomePlaceholderActivity.HomePlaceholderView homePlaceholderView, AnonymousClass10I r1) {
        homePlaceholderView.A0B = r1;
    }

    public static void A2f(HomePlaceholderActivity.HomePlaceholderView homePlaceholderView, AnonymousClass00H r1) {
        homePlaceholderView.A0C = r1;
    }

    public static void A2g(StarredMessagesPlaceholderActivity.StarredMessagePlaceholderView starredMessagePlaceholderView, C36401np r1) {
        starredMessagePlaceholderView.A04 = r1;
    }

    public static void A2h(StarredMessagesPlaceholderActivity.StarredMessagePlaceholderView starredMessagePlaceholderView, AnonymousClass10I r1) {
        starredMessagePlaceholderView.A05 = r1;
    }

    public static void A2i(BottomBarView bottomBarView, C24641Lc r1) {
        bottomBarView.A01 = r1;
    }

    public static void A2j(DefaultRecipientsView defaultRecipientsView, AnonymousClass85D r1) {
        defaultRecipientsView.A03 = r1;
    }

    public static void A2k(ContactMerchantView contactMerchantView, C36401np r1) {
        contactMerchantView.A03 = r1;
    }

    public static void A2l(WallpaperMockChatView wallpaperMockChatView, AnonymousClass00H r1) {
        wallpaperMockChatView.A09 = r1;
    }

    public C27691Xc(AnonymousClass1K1 r1, C24331Jt r2, AnonymousClass10E r3) {
        this.A12 = this;
        this.A10 = r3;
        this.A11 = r2;
        this.A0z = r1;
        A0k();
    }

    public static AnonymousClass4N9 A0K(C27691Xc r1) {
        return new AnonymousClass4N9(r1.A0J());
    }

    private AQO A0Q() {
        AQO A002 = AnonymousClass3BI.A00();
        A2Q(A002);
        return A002;
    }
}
