package X;

import android.content.Context;
import android.view.GestureDetector;
import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.authgraphql.ui.CommonBloksScreenFragment;
import com.whatsapp.bot.creation.QuickCreateFragment;
import com.whatsapp.bot.creation.service.AiCreationPhotoLoader;
import com.whatsapp.bot.home.AiHomeFragment;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;
import com.whatsapp.conversation.ForwardMessagesRouter;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.flows.webview.view.FlowsWebViewFragment;
import com.whatsapp.gallerypicker.GalleryDropdownFilterFragment;
import com.whatsapp.group.AddMembersRouter;
import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.group.NewGroupRouter;
import com.whatsapp.group.SuggestGroupRouter;
import com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment;
import com.whatsapp.inappsupport.ui.SupportBkScreenFragment;
import com.whatsapp.instrumentation.ui.ConfirmFragment;
import com.whatsapp.instrumentation.ui.PermissionsFragment;
import com.whatsapp.interopui.setting.InteropSettingsConfigFragment;
import com.whatsapp.interopui.setting.InteropSettingsMainFragment;
import com.whatsapp.interopui.setting.InteropSettingsOptinFragment;
import com.whatsapp.lists.ListsManagerFragment;
import com.whatsapp.lists.home.ui.main.ListsHomeFragment;
import com.whatsapp.mediacomposer.ui.caption.CaptionFragment;
import com.whatsapp.music.musiceditor.ui.MusicEditorDialog;
import com.whatsapp.settings.SettingsPasskeysDisabledFragment;
import com.whatsapp.settings.SettingsPasskeysEnabledFragment;
import com.whatsapp.shops.ShopsProductPreviewFragment;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.1nZ  reason: invalid class name and case insensitive filesystem */
public final class C36241nZ extends C008903z {
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
    public AnonymousClass00S A0z;
    public AnonymousClass00S A10;
    public AnonymousClass00S A11;
    public AnonymousClass00S A12;
    public AnonymousClass00S A13;
    public AnonymousClass00S A14;
    public AnonymousClass00S A15;
    public AnonymousClass00S A16;
    public AnonymousClass00S A17;
    public AnonymousClass00S A18;
    public AnonymousClass00S A19;
    public AnonymousClass00S A1A;
    public AnonymousClass00S A1B;
    public AnonymousClass00S A1C;
    public AnonymousClass00S A1D;
    public AnonymousClass00S A1E;
    public AnonymousClass00S A1F;
    public AnonymousClass00S A1G;
    public AnonymousClass00S A1H;
    public AnonymousClass00S A1I;
    public AnonymousClass00S A1J;
    public AnonymousClass00S A1K;
    public AnonymousClass00S A1L;
    public AnonymousClass00S A1M;
    public AnonymousClass00S A1N;
    public AnonymousClass00S A1O;
    public AnonymousClass00S A1P;
    public AnonymousClass00S A1Q;
    public AnonymousClass00S A1R;
    public AnonymousClass00S A1S;
    public AnonymousClass00S A1T;
    public AnonymousClass00S A1U;
    public AnonymousClass00S A1V;
    public AnonymousClass00S A1W;
    public AnonymousClass00S A1X;
    public AnonymousClass00S A1Y;
    public AnonymousClass00S A1Z;
    public AnonymousClass00S A1a;
    public AnonymousClass00S A1b;
    public AnonymousClass00S A1c;
    public AnonymousClass00S A1d;
    public AnonymousClass00S A1e;
    public AnonymousClass00S A1f;
    public AnonymousClass00S A1g;
    public AnonymousClass00S A1h;
    public AnonymousClass00S A1i;
    public AnonymousClass00S A1j;
    public AnonymousClass00S A1k;
    public AnonymousClass00S A1l;
    public AnonymousClass00S A1m;
    public AnonymousClass00S A1n;
    public AnonymousClass00S A1o;
    public AnonymousClass00S A1p;
    public AnonymousClass00S A1q;
    public AnonymousClass00S A1r;
    public AnonymousClass00S A1s;
    public AnonymousClass00S A1t;
    public AnonymousClass00S A1u;
    public AnonymousClass00S A1v;
    public AnonymousClass00S A1w;
    public AnonymousClass00S A1x;
    public AnonymousClass00S A1y;
    public AnonymousClass00S A1z;
    public AnonymousClass00S A20;
    public AnonymousClass00S A21;
    public AnonymousClass00S A22;
    public AnonymousClass00S A23;
    public AnonymousClass00S A24;
    public AnonymousClass00S A25;
    public AnonymousClass00S A26;
    public AnonymousClass00S A27;
    public AnonymousClass00S A28;
    public AnonymousClass00S A29;
    public AnonymousClass00S A2A;
    public AnonymousClass00S A2B;
    public AnonymousClass00S A2C;
    public AnonymousClass00S A2D;
    public AnonymousClass00S A2E;
    public AnonymousClass00S A2F;
    public AnonymousClass00S A2G;
    public AnonymousClass00S A2H;
    public AnonymousClass00S A2I;
    public AnonymousClass00S A2J;
    public AnonymousClass00S A2K;
    public AnonymousClass00S A2L;
    public AnonymousClass00S A2M;
    public AnonymousClass00S A2N;
    public final AnonymousClass1K1 A2O;
    public final C24331Jt A2P;
    public final AnonymousClass10E A2Q;
    public final C36241nZ A2R;

    /* access modifiers changed from: private */
    public C201110w A00() {
        return C201110w.of(2, A0Q(), 1, A0P(), 3, A0S(), 4, A0R(), 5, A0O());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2fN, java.lang.Object] */
    public static C55192fN A04() {
        return new Object();
    }

    public static C129946id A05(C36241nZ r8) {
        AnonymousClass10E r2 = r8.A2Q;
        AnonymousClass00H A002 = C000200d.A00(r2.AAv);
        AnonymousClass00H A003 = C000200d.A00(r2.ABd);
        AnonymousClass10G A112 = r2.A00;
        return new C129946id(A002, A003, C000200d.A00(A112.A30), C000200d.A00(r2.A4I), C000200d.A00(A112.ADU), C000200d.A00(r8.A2O.A4n));
    }

    public static C167838hr A06(C36241nZ r11) {
        AnonymousClass10E r1 = r11.A2Q;
        AnonymousClass1KB r2 = (AnonymousClass1KB) r1.A4b.get();
        AnonymousClass00H A002 = C000200d.A00(r1.A6N);
        AnonymousClass00H A003 = C000200d.A00(r11.A2H);
        C19949A0g a0g = (C19949A0g) r1.A4W.get();
        AnonymousClass00H A004 = C000200d.A00(r1.A1w);
        C18030ve r5 = (C18030ve) r1.A04.get();
        return new C167838hr(r2, (C26911Ty) r1.A1J.get(), (C190449kx) r1.A00.AEG.get(), r5, a0g, (C20004A2u) r1.A0v.get(), (AnonymousClass10I) r1.AC1.get(), A002, A003, A004);
    }

    /* access modifiers changed from: private */
    public C189899k2 A07() {
        return new C189899k2(C000200d.A00(this.A2Q.A1o), C000200d.A00(this.A1S));
    }

    public static AnonymousClass7CX A09(C36241nZ r5) {
        AnonymousClass2YK r3 = (AnonymousClass2YK) r5.A2D.get();
        AnonymousClass2YO r2 = (AnonymousClass2YO) r5.A2E.get();
        return new AnonymousClass7CX((AnonymousClass6a1) r5.A1k.get(), r3, r2, (C18000vb) r5.A2Q.ABz.get());
    }

    public static C131476lA A0A(C36241nZ r1) {
        return new C131476lA((AnonymousClass118) r1.A2Q.ABY.get());
    }

    public static AnonymousClass7CW A0B(C36241nZ r4) {
        C131476lA A0A2 = A0A(r4);
        return new AnonymousClass7CW((AnonymousClass6a1) r4.A1k.get(), (AnonymousClass1KB) r4.A2Q.A4b.get(), A0A2);
    }

    public static C167918hz A0C(C36241nZ r11) {
        AnonymousClass10E r1 = r11.A2Q;
        AnonymousClass00H A002 = C000200d.A00(r1.A6N);
        C26911Ty r3 = (C26911Ty) r1.A1J.get();
        C19949A0g a0g = (C19949A0g) r1.A4W.get();
        C19830z4 r5 = (C19830z4) r1.ABl.get();
        AnonymousClass00H A003 = C000200d.A00(r11.A2O.A0W);
        AnonymousClass00H A004 = C000200d.A00(r1.A1w);
        return new C167918hz((AnonymousClass1KB) r1.A4b.get(), r3, (C190449kx) r1.A00.AEG.get(), r5, a0g, (C20004A2u) r1.A0v.get(), (AnonymousClass10I) r1.AC1.get(), A002, A003, A004);
    }

    public static C188669hn A0D(C36241nZ r11) {
        AnonymousClass10E r2 = r11.A2Q;
        C20004A2u a2u = (C20004A2u) r2.A0v.get();
        AnonymousClass00H A002 = C000200d.A00(r2.A6N);
        AnonymousClass10G A112 = r2.A00;
        C183909a6 r4 = (C183909a6) A112.AEH.get();
        C26911Ty r3 = (C26911Ty) r2.A1J.get();
        C19949A0g a0g = (C19949A0g) r2.A4W.get();
        AnonymousClass00H A003 = C000200d.A00(r11.A2F);
        return new C188669hn(r3, r4, (C190449kx) A112.AEG.get(), (AnonymousClass118) r2.ABY.get(), a0g, a2u, (AnonymousClass10I) r2.AC1.get(), A002, A003);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.GestureDetector$SimpleOnGestureListener, X.5dx] */
    public static C109755dx A0E() {
        return new GestureDetector.SimpleOnGestureListener();
    }

    public static AiCreationPhotoLoader A0G(C36241nZ r9) {
        AnonymousClass10E r1 = r9.A2Q;
        AnonymousClass181 r3 = (AnonymousClass181) r1.AA9.get();
        AnonymousClass11Z r5 = (AnonymousClass11Z) r1.AAV.get();
        return new AiCreationPhotoLoader(C000500i.A00(r1.Ao9), r3, (AnonymousClass11P) r1.AAv.get(), r5, (C18030ve) r1.A04.get(), (C24371Kb) r1.A6A.get(), (C24421Kg) r1.A9a.get(), (C18600wl) r1.A9E.get());
    }

    private C173758vg A0H() {
        AnonymousClass1K1 r1 = this.A2O;
        AnonymousClass2Y4 r3 = (AnonymousClass2Y4) r1.A91.get();
        AnonymousClass2Y3 r2 = (AnonymousClass2Y3) r1.A90.get();
        return new C173758vg(C19880zA.A00(), r2, r3, (AnonymousClass2Y9) this.A1l.get(), (AnonymousClass2YA) this.A1m.get(), (AnonymousClass2YB) this.A1n.get(), (AnonymousClass2YC) this.A1o.get(), (AnonymousClass2YD) this.A1p.get());
    }

    public static C20529AOo A0I(C36241nZ r1) {
        return new C20529AOo(AnonymousClass1K1.A0J(r1.A2O));
    }

    private AAC A0J() {
        AnonymousClass10E r1 = this.A2Q;
        C18000vb r4 = (C18000vb) r1.ABz.get();
        return new AAC((AnonymousClass1RB) r1.AUE.get(), (AnonymousClass1KB) r1.A4b.get(), (AnonymousClass118) r1.ABY.get(), r4, (AnonymousClass10I) r1.AC1.get());
    }

    public static AnonymousClass6h1 A0K(C36241nZ r3) {
        AnonymousClass10E r1 = r3.A2Q;
        AnonymousClass1V7 r2 = (AnonymousClass1V7) r1.A97.get();
        return new AnonymousClass6h1((C47972Kr) r1.A1S.get(), r2, (AnonymousClass118) r1.ABY.get());
    }

    public static AnonymousClass3WN A0L(Context context, C27201Vd r2, C18030ve r3, C18140vp r4) {
        return new AnonymousClass3WN(context, r2, r3, r4);
    }

    public static AnonymousClass3WN A0M(C36241nZ r5) {
        AnonymousClass10E r4 = r5.A2Q;
        Context A002 = C000500i.A00(r4.Ao9);
        r4.A2d.get();
        AnonymousClass3WN A0L2 = A0L(A002, (C27201Vd) r4.A2j.get(), (C18030ve) r4.A04.get(), r4.A8t);
        r5.A3j(A0L2);
        return A0L2;
    }

    public static C66812ym A0N(C36241nZ r1) {
        return new C66812ym((AnonymousClass1VW) r1.A2Q.A2d.get());
    }

    private C66982z3 A0O() {
        return new C66982z3((C34811l7) this.A2Q.A92.get());
    }

    private AQN A0P() {
        AnonymousClass10E r1 = this.A2Q;
        AnonymousClass00H A002 = C000200d.A00(r1.A1s);
        A8Q a8q = (A8Q) r1.A1p.get();
        return new AQN((C195529tU) r1.A1t.get(), a8q, (AnonymousClass122) r1.A2y.get(), A002, C000200d.A00(r1.A1H), C000200d.A00(r1.A1y), C000200d.A00(r1.A0s));
    }

    private C94844lH A0Q() {
        return new C94844lH((AnonymousClass1KB) this.A2Q.A4b.get());
    }

    private C66992z4 A0R() {
        AnonymousClass10E r1 = this.A2Q;
        return new C66992z4((AnonymousClass190) r1.A31.get(), (C36361nl) r1.A5h.get(), (C18030ve) r1.A04.get(), C000200d.A00(r1.An8));
    }

    public static AnonymousClass2E7 A0T(C36241nZ r7) {
        AnonymousClass10E r2 = r7.A2Q;
        AnonymousClass10G A112 = r2.A00;
        C1193267r r3 = (C1193267r) r2.A9P.get();
        EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) A112.A1c.get();
        return new AnonymousClass2E7((C19830z4) r2.ABl.get(), r3, emojiSearchProvider, (C131196kh) r7.A2O.A6E.get(), (AnonymousClass1L4) A112.A2e.get());
    }

    /* access modifiers changed from: private */
    public AnonymousClass2EB A0U() {
        AnonymousClass10E r2 = this.A2Q;
        AnonymousClass10G A112 = r2.A00;
        C1193267r r3 = (C1193267r) r2.A9P.get();
        EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) A112.A1c.get();
        return new AnonymousClass2EB((C19830z4) r2.ABl.get(), r3, emojiSearchProvider, (C131196kh) this.A2O.A6E.get(), (AnonymousClass1L4) A112.A2e.get());
    }

    /* access modifiers changed from: private */
    public C127276e5 A0W() {
        AnonymousClass10E r1 = this.A2Q;
        return new C127276e5((AnonymousClass11C) r1.AAp.get(), (C26521Sl) r1.A69.get());
    }

    public static C187279fY A0Y(C36241nZ r6) {
        AnonymousClass10E r1 = r6.A2Q;
        return new C187279fY((AnonymousClass10I) r1.AC1.get(), C000200d.A00(r1.A6N), C000200d.A00(r1.A4q), C000200d.A00(r1.A8i), C000200d.A00(r1.AUu));
    }

    private C161778Hs A0Z() {
        AnonymousClass10E r1 = this.A2Q;
        AnonymousClass11P r7 = (AnonymousClass11P) r1.AAv.get();
        AnonymousClass1L9 r3 = (AnonymousClass1L9) r1.A0E.get();
        AnonymousClass11C r6 = (AnonymousClass11C) r1.AAp.get();
        C27201Vd r5 = (C27201Vd) r1.A2j.get();
        C18000vb r8 = (C18000vb) r1.ABz.get();
        return new C161778Hs(C000500i.A00(r1.Ao9), r3, (C24921Me) r1.ABX.get(), r5, r6, r7, r8, (C18030ve) r1.A04.get(), (C36401np) r1.A00.A30.get());
    }

    public static C172648tl A0a(C36241nZ r10) {
        AnonymousClass10E r1 = r10.A2Q;
        Context A002 = C000500i.A00(r1.Ao9);
        AnonymousClass1L9 r3 = (AnonymousClass1L9) r1.A0E.get();
        C27201Vd r5 = (C27201Vd) r1.A2j.get();
        AnonymousClass11C r6 = (AnonymousClass11C) r1.AAp.get();
        return new C172648tl(A002, r3, (C24921Me) r1.ABX.get(), r5, r6, (AnonymousClass11P) r1.AAv.get(), (C18000vb) r1.ABz.get(), (C18030ve) r1.A04.get(), (C36401np) r1.A00.A30.get());
    }

    public static AnonymousClass6gB A0b(C36241nZ r3) {
        AnonymousClass10E r1 = r3.A2Q;
        return new AnonymousClass6gB((C132216mP) r1.A00.A4S.get(), (AnonymousClass1MB) r1.AAb.get(), C000200d.A00(r1.A2n));
    }

    public static C130806k2 A0c(C36241nZ r12) {
        AnonymousClass10E r2 = r12.A2Q;
        AnonymousClass1KB r4 = (AnonymousClass1KB) r2.A4b.get();
        AnonymousClass118 r6 = (AnonymousClass118) r2.ABY.get();
        AnonymousClass190 r3 = (AnonymousClass190) r2.A31.get();
        AnonymousClass11C r5 = (AnonymousClass11C) r2.AAp.get();
        AnonymousClass1c4 r10 = (AnonymousClass1c4) r2.A7C.get();
        AnonymousClass10G A112 = r2.A00;
        return new C130806k2(r3, r4, r5, r6, (C18030ve) r2.A04.get(), (AnonymousClass6gC) A112.A2V.get(), (C32861hs) r2.Agw.get(), r10, (AnonymousClass10I) r2.AC1.get(), C000200d.A00(A112.AIq));
    }

    public static C138736xb A0d(C36241nZ r46) {
        C36241nZ r2 = r46;
        AnonymousClass10E r0 = r2.A2Q;
        AnonymousClass00H A002 = C000200d.A00(r0.A90);
        AnonymousClass00H A003 = C000200d.A00(r0.ABX);
        AnonymousClass1M9 r5 = (AnonymousClass1M9) r0.A2f.get();
        AnonymousClass1K1 r1 = r2.A2O;
        C95684md r7 = (C95684md) r1.A0c.get();
        C58322kV r11 = (C58322kV) r0.AgY.get();
        AnonymousClass00H A004 = C000200d.A00(r0.AAd);
        AnonymousClass10G A112 = r0.A00;
        AnonymousClass00H A005 = C000200d.A00(A112.AFS);
        C56242h9 r8 = (C56242h9) A112.ABw.get();
        AnonymousClass00H A006 = C000200d.A00(r0.AN9);
        AnonymousClass00H A007 = C000200d.A00(r0.AP1);
        AnonymousClass00H A008 = C000200d.A00(r0.AC1);
        AnonymousClass00H A009 = C000200d.A00(r0.A69);
        AnonymousClass00H A0010 = C000200d.A00(r0.A6Y);
        AnonymousClass00H A0011 = C000200d.A00(r0.A6C);
        AnonymousClass00H A0012 = C000200d.A00(r0.A6k);
        AnonymousClass00H A0013 = C000200d.A00(r0.Ae9);
        AnonymousClass00H A0014 = C000200d.A00(r0.ABd);
        AnonymousClass00H A0015 = C000200d.A00(r0.AB9);
        AnonymousClass00H A0016 = C000200d.A00(r0.A4b);
        AnonymousClass00H A0017 = C000200d.A00(r0.AAp);
        AnonymousClass00H A0018 = C000200d.A00(r0.A31);
        AnonymousClass00H A0019 = C000200d.A00(r0.A9r);
        AnonymousClass00H A0020 = C000200d.A00(r0.A0E);
        AnonymousClass00H A0021 = C000200d.A00(A112.AHj);
        AnonymousClass00H A0022 = C000200d.A00(A112.A5C);
        AnonymousClass00H A0023 = C000200d.A00(r0.A3w);
        AnonymousClass00H A0024 = C000200d.A00(A112.AGL);
        return new C138736xb(C19880zA.A00(), r5, (C18030ve) r0.A04.get(), r7, r8, (C136906ub) r0.AVb.get(), (C139506yx) r0.AmD.get(), r11, (AnonymousClass1PU) r0.A4j.get(), (AnonymousClass1DC) r0.A95.get(), A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, C000200d.A00(r0.A6V), C000200d.A00(r0.A9B), C000200d.A00(A112.AHU), C000200d.A00(r0.AjI), C000200d.A00(r0.AAf), C000200d.A00(r0.A2R), C000200d.A00(r0.A2H), C000200d.A00(r0.A14), C000200d.A00(r1.A5l), C000200d.A00(A112.ABo));
    }

    public static AnonymousClass8HW A0e(C19880zA r1, AnonymousClass2Y3 r2, AnonymousClass2Y4 r3) {
        return new AnonymousClass8HW(r1, r2, r3);
    }

    public static AnonymousClass8HW A0f(C36241nZ r2) {
        AnonymousClass1K1 r1 = r2.A2O;
        return A0e(C19880zA.A00(), (AnonymousClass2Y3) r1.A90.get(), (AnonymousClass2Y4) r1.A91.get());
    }

    public static AnonymousClass8HT A0g(C36241nZ r7) {
        AnonymousClass10E r1 = r7.A2Q;
        return new AnonymousClass8HT((AnonymousClass2YL) r7.A2C.get(), (AnonymousClass118) r1.ABY.get(), C000200d.A00(r1.A4b), C000200d.A00(r1.AC1), C000200d.A00(r1.AA9), C000200d.A00(r1.A0n));
    }

    public static C87904Xn A0h(C36241nZ r11) {
        AnonymousClass10E r1 = r11.A2Q;
        AnonymousClass1KB r4 = (AnonymousClass1KB) r1.A4b.get();
        C19890zB A002 = C19880zA.A00();
        AnonymousClass1R3 r7 = (AnonymousClass1R3) r1.A5f.get();
        return new C87904Xn(A002, A002, r4, (AnonymousClass11S) r1.A63.get(), (C26911Ty) r1.A1J.get(), r7, (C18030ve) r1.A04.get(), (AnonymousClass18K) r1.A9B.get(), (AnonymousClass10I) r1.AC1.get(), C000200d.A00(r1.A3w));
    }

    public static C136806uR A0i(C36241nZ r6) {
        AnonymousClass10E r1 = r6.A2Q;
        return new C136806uR((WfalManager) r1.ABv.get(), (C24641Lc) r1.AAB.get(), (C35511mM) r1.A4L.get(), (C30141dS) r1.AC9.get(), C000200d.A00(r1.A00.A4e));
    }

    /* access modifiers changed from: private */
    public AnonymousClass7HS A0j() {
        AnonymousClass10E r1 = this.A2Q;
        return new AnonymousClass7HS((C24641Lc) r1.AAB.get(), (C32741hg) r1.AAL.get(), (C58572ku) r1.A00.A4f.get());
    }

    /* access modifiers changed from: private */
    public AnonymousClass7HR A0l() {
        AnonymousClass10E r1 = this.A2Q;
        AnonymousClass00H A002 = C000200d.A00(r1.A04);
        AnonymousClass00H A003 = C000200d.A00(r1.A95);
        AnonymousClass10G A112 = r1.A00;
        return new AnonymousClass7HR(A002, A003, C000200d.A00(A112.A2J), C000200d.A00(A112.ABQ), C000200d.A00(A112.AHj), C000200d.A00(A112.A1h));
    }

    public static C57002iN A0n(C36241nZ r1) {
        return new C57002iN((C25161Nd) r1.A2Q.A2v.get());
    }

    /* access modifiers changed from: private */
    public C36481nx A0o() {
        return new C36481nx((C18030ve) this.A2Q.A04.get());
    }

    public static C131746lb A0q(C36241nZ r1) {
        return new C131746lb((AnonymousClass18K) r1.A2Q.A9B.get());
    }

    public static Set A18() {
        return new HashSet();
    }

    private void A19() {
        AnonymousClass10E r4 = this.A2Q;
        C24331Jt r2 = this.A2P;
        AnonymousClass1K1 r1 = this.A2O;
        C36241nZ r3 = this.A2R;
        this.A2G = new C36251na(r1, r2, r3, r4, 1);
        this.A00 = new C36251na(r1, r2, r3, r4, 0);
        this.A04 = new C36251na(r1, r2, r3, r4, 2);
        this.A09 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 3));
        this.A2H = new C36251na(r1, r2, r3, r4, 5);
        this.A0E = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 4));
        this.A0K = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 6));
        this.A1S = new C36251na(r1, r2, r3, r4, 7);
        this.A0L = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 8));
        this.A0U = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 9));
        this.A0e = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 10));
        this.A0m = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 12));
        this.A2D = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 11));
        this.A2E = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 13));
        this.A1k = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 14));
        this.A2F = new C36251na(r1, r2, r3, r4, 16);
        this.A0A = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 15));
        this.A0B = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 17));
        this.A0C = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 18));
        this.A1H = new C36251na(r1, r2, r3, r4, 19);
        this.A0D = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 20));
        this.A1l = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 21));
        this.A1m = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 22));
        this.A1n = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 23));
        this.A1o = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 24));
        this.A1p = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 25));
        this.A2L = new C36251na(r1, r2, r3, r4, 26);
        this.A1q = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 27));
        this.A0F = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 29));
        this.A1r = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 28));
        this.A0G = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 30));
        this.A1s = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 31));
        this.A1t = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 32));
        this.A0H = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 34));
        this.A0I = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 35));
        this.A1u = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 33));
        this.A0J = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 36));
        this.A1v = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 38));
        this.A1U = new C36251na(r1, r2, r3, r4, 37);
        this.A1w = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 40));
        this.A1x = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 41));
        this.A1y = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 42));
        this.A1z = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 43));
        this.A20 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 44));
        this.A21 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 45));
        this.A22 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 46));
        this.A23 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 47));
        this.A24 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 48));
        this.A25 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 49));
        this.A26 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 50));
        this.A03 = new C36251na(r1, r2, r3, r4, 39);
        this.A0M = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 51));
        this.A1X = new C36251na(r1, r2, r3, r4, 52);
        this.A0N = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 53));
        this.A0O = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 54));
        this.A0P = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 55));
        this.A0Q = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 56));
        this.A0R = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 57));
        this.A0S = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 58));
        this.A1P = new C36251na(r1, r2, r3, r4, 59);
        this.A0T = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 60));
        this.A2J = new C36251na(r1, r2, r3, r4, 64);
        this.A1e = new C36251na(r1, r2, r3, r4, 63);
        this.A2K = new C36251na(r1, r2, r3, r4, 65);
        this.A1O = new C36251na(r1, r2, r3, r4, 62);
        this.A0V = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 61));
        this.A1j = new C36251na(r1, r2, r3, r4, 66);
        this.A0W = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 67));
        this.A0X = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 68));
        this.A1d = new C36251na(r1, r2, r3, r4, 69);
        this.A0Y = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 70));
        this.A0Z = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 72));
        this.A0a = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 71));
        this.A27 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 73));
        this.A1f = new C36251na(r1, r2, r3, r4, 74);
        this.A1E = new C36251na(r1, r2, r3, r4, 75);
        this.A06 = new C36251na(r1, r2, r3, r4, 76);
        this.A0b = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 77));
        this.A0c = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 78));
        this.A0d = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 79));
        this.A0f = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 80));
        this.A0g = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 81));
        this.A0h = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 82));
        this.A0i = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 83));
        this.A1Y = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 84));
        this.A05 = new C36251na(r1, r2, r3, r4, 85);
        this.A0j = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 86));
        this.A0k = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 87));
        this.A1c = new C36251na(r1, r2, r3, r4, 88);
        this.A1Z = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 89));
        this.A02 = new C36251na(r1, r2, r3, r4, 90);
        this.A1A = new C36251na(r1, r2, r3, r4, 91);
        this.A1B = new C36251na(r1, r2, r3, r4, 92);
        this.A1V = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 93));
        this.A1F = new C36251na(r1, r2, r3, r4, 94);
        this.A1G = new C36251na(r1, r2, r3, r4, 95);
        this.A28 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 96));
        this.A29 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 97));
        this.A2A = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 98));
        this.A0l = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 99));
    }

    private void A1A() {
        AnonymousClass10E r4 = this.A2Q;
        C24331Jt r2 = this.A2P;
        AnonymousClass1K1 r1 = this.A2O;
        C36241nZ r3 = this.A2R;
        this.A2B = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 100));
        this.A0n = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 101));
        this.A0o = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 102));
        this.A0p = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 103));
        this.A08 = new C36251na(r1, r2, r3, r4, 104);
        this.A01 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 105));
        this.A1R = C19870z9.A01();
        this.A1N = C000200d.A01(new C36251na(r1, r2, r3, r4, 106));
        this.A1g = new C36251na(r1, r2, r3, r4, 107);
        this.A1D = new C36251na(r1, r2, r3, r4, AnonymousClass74N.A03);
        this.A1T = new C36251na(r1, r2, r3, r4, 109);
        this.A0q = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 110));
        this.A1M = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 112));
        this.A1K = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 113));
        this.A1L = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 114));
        this.A1J = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 111));
        this.A1Q = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 115));
        this.A1C = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 117));
        this.A0r = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 116));
        this.A1W = new C36251na(r1, r2, r3, r4, 118);
        this.A0s = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 119));
        this.A0t = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 120));
        this.A2C = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 121));
        this.A0u = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 122));
        this.A0v = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 123));
        this.A0w = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 124));
        this.A1I = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, StringTreeSet.OFFSET_BASE_ENCODING));
        this.A0x = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 126));
        this.A0y = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 128));
        this.A0z = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 129));
        this.A10 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 125));
        this.A07 = new C36251na(r1, r2, r3, r4, 130);
        this.A11 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 131));
        this.A2I = new C36251na(r1, r2, r3, r4, 133);
        this.A1a = new C36251na(r1, r2, r3, r4, 132);
        this.A12 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 134));
        this.A13 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 135));
        this.A1i = new C36251na(r1, r2, r3, r4, 136);
        this.A2M = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 138));
        this.A2N = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 137));
        this.A1b = new C36251na(r1, r2, r3, r4, 139);
        this.A14 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 141));
        this.A15 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 140));
        this.A1h = new C36251na(r1, r2, r3, r4, 142);
        this.A16 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 143));
        this.A17 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 145));
        this.A18 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, 146));
        this.A19 = AnonymousClass00f.A00(new C36251na(r1, r2, r3, r4, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT));
    }

    public static void A1B(C19880zA r0, ForwardMessagesRouter forwardMessagesRouter) {
        forwardMessagesRouter.A00 = r0;
    }

    public static void A1C(AnonymousClass1L9 r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A00 = r0;
    }

    public static void A1D(C22701Cw r0, C55192fN r1) {
        r1.A00 = r0;
    }

    public static void A1E(C56382hN r0, BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        bkScreenFragmentWithCustomPreloadScreens.A02 = r0;
    }

    public static void A1F(C131346kw r0, AiHomeFragment aiHomeFragment) {
        aiHomeFragment.A00 = r0;
    }

    public static void A1G(AnonymousClass2YE r0, BusinessApiBrowseFragment businessApiBrowseFragment) {
        businessApiBrowseFragment.A00 = r0;
    }

    public static void A1H(AnonymousClass9VK r0, BusinessApiHomeFragment businessApiHomeFragment) {
        businessApiHomeFragment.A01 = r0;
    }

    public static void A1I(C56492hY r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A01 = r0;
    }

    public static void A1J(C56492hY r0, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A00 = r0;
    }

    public static void A1K(C56492hY r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A01 = r0;
    }

    public static void A1L(C56502hZ r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A02 = r0;
    }

    public static void A1M(C56502hZ r0, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A01 = r0;
    }

    public static void A1N(C56502hZ r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A02 = r0;
    }

    public static void A1O(AnonymousClass9VM r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A03 = r0;
    }

    public static void A1P(AnonymousClass2YF r0, ForwardMessagesRouter forwardMessagesRouter) {
        forwardMessagesRouter.A01 = r0;
    }

    public static void A1Q(AnonymousClass2YG r0, AddMembersRouter addMembersRouter) {
        addMembersRouter.A00 = r0;
    }

    public static void A1R(AnonymousClass9VT r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A00 = r0;
    }

    public static void A1S(AnonymousClass2YH r0, NewGroupRouter newGroupRouter) {
        newGroupRouter.A00 = r0;
    }

    public static void A1T(AnonymousClass2YJ r0, SuggestGroupRouter suggestGroupRouter) {
        suggestGroupRouter.A00 = r0;
    }

    public static void A1U(AnonymousClass4KB r0, ListsManagerFragment listsManagerFragment) {
        listsManagerFragment.A02 = r0;
    }

    public static void A1V(C36241nZ r1, PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment) {
        AnonymousClass10E r12 = r1.A2Q;
        A2K(pushnameEmojiBlacklistDialogFragment, (AnonymousClass1KW) r12.A3d.get());
        A2L(pushnameEmojiBlacklistDialogFragment, (AnonymousClass129) r12.A4I.get());
        A2J(pushnameEmojiBlacklistDialogFragment, (C18000vb) r12.ABz.get());
    }

    public static void A1X(C36241nZ r1, FingerprintBottomSheet fingerprintBottomSheet) {
        AnonymousClass10E r12 = r1.A2Q;
        A2j(fingerprintBottomSheet, (AnonymousClass11P) r12.AAv.get());
        A2k(fingerprintBottomSheet, (C18000vb) r12.ABz.get());
    }

    public static void A1Y(C36241nZ r2, CommonBloksScreenFragment commonBloksScreenFragment) {
        AnonymousClass10E r22 = r2.A2Q;
        AnonymousClass10G A112 = r22.A00;
        C60642oN.A01(commonBloksScreenFragment, C000200d.A00(A112.AFQ));
        C60642oN.A00((C57112iY) A112.AJ4.get(), commonBloksScreenFragment);
        A2l(commonBloksScreenFragment, (C18030ve) r22.A04.get());
    }

    public static void A1a(C36241nZ r2, AiHomeFragment aiHomeFragment) {
        AnonymousClass10E r1 = r2.A2Q;
        A2w(aiHomeFragment, (C57642jP) r1.A00.A04.get());
        A1F((C131346kw) r2.A0D.get(), aiHomeFragment);
        A2x(aiHomeFragment, (C24921Me) r1.ABX.get());
        A2y(aiHomeFragment, (AnonymousClass118) r1.ABY.get());
    }

    public static void A1b(C36241nZ r2, ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment) {
        AnonymousClass10E r1 = r2.A2Q;
        A31(imagineMeOnboardingCameraFragment, (C18030ve) r1.A04.get());
        A33(imagineMeOnboardingCameraFragment, C000200d.A00(r1.A14));
        A35(imagineMeOnboardingCameraFragment, C29911d4.A00());
        A2A((AnonymousClass1KB) r1.A4b.get(), imagineMeOnboardingCameraFragment);
        A2i((CX1) r2.A2O.A4Y.get(), imagineMeOnboardingCameraFragment);
        A32(imagineMeOnboardingCameraFragment, (C18010vc) r1.A9s.get());
        A2z(imagineMeOnboardingCameraFragment, (AnonymousClass11C) r1.AAp.get());
        A34(imagineMeOnboardingCameraFragment, C000200d.A00(r1.ABd));
        A30(imagineMeOnboardingCameraFragment, (C219217x) r1.ABj.get());
    }

    public static void A1c(C36241nZ r2, BusinessApiBrowseFragment businessApiBrowseFragment) {
        AnonymousClass10G A112 = r2.A2Q.A00;
        A39(businessApiBrowseFragment, (A17) A112.A0Z.get());
        A36((AnonymousClass0I4) A112.A0a.get(), businessApiBrowseFragment);
        A37(r2.A0H(), businessApiBrowseFragment);
        A3A(businessApiBrowseFragment, C000200d.A00(r2.A2L));
        A1G((AnonymousClass2YE) r2.A1q.get(), businessApiBrowseFragment);
    }

    public static void A1d(C36241nZ r2, BusinessApiHomeFragment businessApiHomeFragment) {
        AnonymousClass10E r1 = r2.A2Q;
        A3B(businessApiHomeFragment, (C18030ve) r1.A04.get());
        A3C(businessApiHomeFragment, (AnonymousClass1L4) r1.A00.A2e.get());
        A38(r2.A0H(), businessApiHomeFragment);
        A3D(businessApiHomeFragment, C000200d.A00(r2.A2L));
        A1H((AnonymousClass9VK) r2.A1r.get(), businessApiHomeFragment);
    }

    public static void A1e(C36241nZ r4, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        AnonymousClass10E r2 = r4.A2Q;
        A2Q((C40751vD) r2.AB7.get(), businessDirectoryConsumerHomeFragment);
        AnonymousClass10G A112 = r2.A00;
        A3T(businessDirectoryConsumerHomeFragment, (AnonymousClass1L4) A112.A2e.get());
        A3R(businessDirectoryConsumerHomeFragment, (AnonymousClass1LU) r2.ABd.get());
        A1C((AnonymousClass1L9) r2.A0E.get(), businessDirectoryConsumerHomeFragment);
        AnonymousClass1K1 r1 = r4.A2O;
        A3K(AnonymousClass1K1.A0O(r1), businessDirectoryConsumerHomeFragment);
        A3L(r4.A0J(), businessDirectoryConsumerHomeFragment);
        A1I((C56492hY) r4.A1s.get(), businessDirectoryConsumerHomeFragment);
        A3V(businessDirectoryConsumerHomeFragment, C000200d.A00(A112.A1W));
        A3S(businessDirectoryConsumerHomeFragment, (AnonymousClass1XN) A112.A0d.get());
        A3J(AnonymousClass1K1.A0M(r1), businessDirectoryConsumerHomeFragment);
        A3O(AnonymousClass1K1.A0Q(r1), businessDirectoryConsumerHomeFragment);
        A3G((C192189nx) A112.A6b.get(), businessDirectoryConsumerHomeFragment);
        A3U(businessDirectoryConsumerHomeFragment, C000200d.A00(r2.A2n));
        A1L((C56502hZ) r4.A1t.get(), businessDirectoryConsumerHomeFragment);
    }

    public static void A1f(C36241nZ r3, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        AnonymousClass10E r2 = r3.A2Q;
        A2R((C40751vD) r2.AB7.get(), businessDirectoryContextualSearchFragment);
        AnonymousClass10G A112 = r2.A00;
        A3Y(businessDirectoryContextualSearchFragment, (AnonymousClass1L4) A112.A2e.get());
        A3W(businessDirectoryContextualSearchFragment, (AnonymousClass1LU) r2.ABd.get());
        A3Z(businessDirectoryContextualSearchFragment, C000200d.A00(r2.A2n));
        A3M(r3.A0J(), businessDirectoryContextualSearchFragment);
        A1J((C56492hY) r3.A1s.get(), businessDirectoryContextualSearchFragment);
        A3a(businessDirectoryContextualSearchFragment, C000200d.A00(A112.A1W));
        A3X(businessDirectoryContextualSearchFragment, (AnonymousClass1XN) A112.A0d.get());
        A3P(AnonymousClass1K1.A0Q(r3.A2O), businessDirectoryContextualSearchFragment);
        A3H((C192189nx) A112.A6b.get(), businessDirectoryContextualSearchFragment);
        A1M((C56502hZ) r3.A1t.get(), businessDirectoryContextualSearchFragment);
    }

    public static void A1g(C36241nZ r2, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        AnonymousClass10E r1 = r2.A2Q;
        A2S((C40751vD) r1.AB7.get(), businessDirectorySearchFragment);
        A3d(businessDirectorySearchFragment, (AnonymousClass1LU) r1.ABd.get());
        A3c(businessDirectorySearchFragment, (C18000vb) r1.ABz.get());
        A3b(businessDirectorySearchFragment, (C219217x) r1.ABj.get());
        A3f(businessDirectorySearchFragment, C000200d.A00(r1.A2n));
        A3N(r2.A0J(), businessDirectorySearchFragment);
        A1K((C56492hY) r2.A1s.get(), businessDirectorySearchFragment);
        AnonymousClass10G A112 = r1.A00;
        A3g(businessDirectorySearchFragment, C000200d.A00(A112.A1W));
        A3e(businessDirectorySearchFragment, (AnonymousClass1XN) A112.A0d.get());
        A3I((C192189nx) A112.A6b.get(), businessDirectorySearchFragment);
        A3F((C173738ve) A112.A0f.get(), businessDirectorySearchFragment);
        A1O((AnonymousClass9VM) r2.A1u.get(), businessDirectorySearchFragment);
        A3Q(AnonymousClass1K1.A0Q(r2.A2O), businessDirectorySearchFragment);
        A1N((C56502hZ) r2.A1t.get(), businessDirectorySearchFragment);
    }

    public static void A1j(C36241nZ r2, FlowsWebViewFragment flowsWebViewFragment) {
        AnonymousClass10E r22 = r2.A2Q;
        A4Q((C18030ve) r22.A04.get(), flowsWebViewFragment);
        A4e(flowsWebViewFragment, C000200d.A00(r22.AU0));
        AnonymousClass10G A112 = r22.A00;
        A4b(A112.A5Z(), flowsWebViewFragment);
        A4f(flowsWebViewFragment, C000200d.A00(r22.AU2));
        A2C((AnonymousClass1KB) r22.A4b.get(), flowsWebViewFragment);
        A4d(flowsWebViewFragment, (AnonymousClass1L4) A112.A2e.get());
        A4c(flowsWebViewFragment, (C220418j) r22.A9d.get());
        A2N((AnonymousClass181) r22.AA9.get(), flowsWebViewFragment);
        A4H((AnonymousClass11P) r22.AAv.get(), flowsWebViewFragment);
        A4L((C18000vb) r22.ABz.get(), flowsWebViewFragment);
    }

    public static void A1k(C36241nZ r1, GalleryDropdownFilterFragment galleryDropdownFilterFragment) {
        AnonymousClass10E r12 = r1.A2Q;
        A4R((C18030ve) r12.A04.get(), galleryDropdownFilterFragment);
        A3h((C24771Lp) r12.A0o.get(), galleryDropdownFilterFragment);
        A4g(galleryDropdownFilterFragment, C000200d.A00(r12.A00.ADC));
        A4A((AnonymousClass11C) r12.AAp.get(), galleryDropdownFilterFragment);
    }

    public static void A1l(C36241nZ r1, AddMembersRouter addMembersRouter) {
        A1Q((AnonymousClass2YG) r1.A28.get(), addMembersRouter);
        A4N((AnonymousClass1CJ) r1.A2Q.A2H.get(), addMembersRouter);
    }

    public static void A1m(C36241nZ r2, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        AnonymousClass10E r1 = r2.A2Q;
        A4S((C18030ve) r1.A04.get(), groupMembershipApprovalRequestsFragment);
        A2D((AnonymousClass1KB) r1.A4b.get(), groupMembershipApprovalRequestsFragment);
        A4i(groupMembershipApprovalRequestsFragment, (C36401np) r1.A00.A30.get());
        A4h(r2.A0Z(), groupMembershipApprovalRequestsFragment);
        A1R((AnonymousClass9VT) r2.A29.get(), groupMembershipApprovalRequestsFragment);
        A4B((AnonymousClass11C) r1.AAp.get(), groupMembershipApprovalRequestsFragment);
        A3z((C24921Me) r1.ABX.get(), groupMembershipApprovalRequestsFragment);
    }

    public static void A1n(C36241nZ r1, NewGroupRouter newGroupRouter) {
        A1S((AnonymousClass2YH) r1.A2A.get(), newGroupRouter);
        A4j(newGroupRouter, (AnonymousClass1LU) r1.A2Q.ABd.get());
    }

    public static void A1o(C36241nZ r1, SuggestGroupRouter suggestGroupRouter) {
        A1T((AnonymousClass2YJ) r1.A2B.get(), suggestGroupRouter);
        A4k(suggestGroupRouter, (AnonymousClass1LU) r1.A2Q.ABd.get());
    }

    public static void A1p(C36241nZ r2, ContextualHelpBkScreenFragment contextualHelpBkScreenFragment) {
        AnonymousClass10E r22 = r2.A2Q;
        AnonymousClass10G A112 = r22.A00;
        C60642oN.A01(contextualHelpBkScreenFragment, C000200d.A00(A112.AFQ));
        C60642oN.A00((C57112iY) A112.AJ4.get(), contextualHelpBkScreenFragment);
        A4o(contextualHelpBkScreenFragment, C000200d.A00(r22.A2n));
        A2F((C36361nl) r22.A5h.get(), contextualHelpBkScreenFragment);
        A4m(contextualHelpBkScreenFragment, (AnonymousClass19T) r22.A9I.get());
        A4n(contextualHelpBkScreenFragment, (AnonymousClass198) r22.AC0.get());
    }

    public static void A1q(C36241nZ r2, SupportBkScreenFragment supportBkScreenFragment) {
        AnonymousClass10E r1 = r2.A2Q;
        AnonymousClass10G A112 = r1.A00;
        C60642oN.A01(supportBkScreenFragment, C000200d.A00(A112.AFQ));
        C60642oN.A00((C57112iY) A112.AJ4.get(), supportBkScreenFragment);
        A2p((C19943A0a) r1.AFZ.get(), supportBkScreenFragment);
        A3w((AnonymousClass11E) r1.A2X.get(), supportBkScreenFragment);
        A2G((C36361nl) r1.A5h.get(), supportBkScreenFragment);
        A4q(supportBkScreenFragment, (AnonymousClass19T) r1.A9I.get());
        A4r(supportBkScreenFragment, (A98) r1.Ag7.get());
        A2M((C132216mP) A112.A4S.get(), supportBkScreenFragment);
        A4l((AnonymousClass1MB) r1.AAb.get(), supportBkScreenFragment);
        A4C((AnonymousClass11C) r1.AAp.get(), supportBkScreenFragment);
        A4p(supportBkScreenFragment, (AnonymousClass1LU) r1.ABd.get());
        A4K((C219217x) r1.ABj.get(), supportBkScreenFragment);
        A4t(supportBkScreenFragment, (AnonymousClass10I) r1.AC1.get());
        A4s(supportBkScreenFragment, (AnonymousClass198) r1.AC0.get());
    }

    public static void A1r(C36241nZ r2, ConfirmFragment confirmFragment) {
        AnonymousClass10E r22 = r2.A2Q;
        A4T((C18030ve) r22.A04.get(), confirmFragment);
        AnonymousClass10G A112 = r22.A00;
        A4v(confirmFragment, (C36401np) A112.A30.get());
        A2T((AnonymousClass1LC) A112.A5B.get(), confirmFragment);
        A40((C36531o3) r22.A2n.get(), confirmFragment);
    }

    public static void A1s(C36241nZ r2, PermissionsFragment permissionsFragment) {
        AnonymousClass10E r22 = r2.A2Q;
        A4U((C18030ve) r22.A04.get(), permissionsFragment);
        AnonymousClass10G A112 = r22.A00;
        A4w(permissionsFragment, (C36401np) A112.A30.get());
        A2U((AnonymousClass1LC) A112.A5B.get(), permissionsFragment);
        A41((C36531o3) r22.A2n.get(), permissionsFragment);
        A4u((AnonymousClass1TM) r22.A5K.get(), permissionsFragment);
    }

    public static void A1t(C36241nZ r1, InteropSettingsConfigFragment interopSettingsConfigFragment) {
        AnonymousClass10E r12 = r1.A2Q;
        A4z((C39541tF) r12.A5U.get(), interopSettingsConfigFragment);
        A4x((AnonymousClass1LU) r12.ABd.get(), interopSettingsConfigFragment);
    }

    public static void A1u(C36241nZ r1, InteropSettingsMainFragment interopSettingsMainFragment) {
        AnonymousClass10E r12 = r1.A2Q;
        A4V((C18030ve) r12.A04.get(), interopSettingsMainFragment);
        A3x((AnonymousClass11E) r12.A2X.get(), interopSettingsMainFragment);
        A50((C33971jg) r12.A5V.get(), interopSettingsMainFragment);
        A4I((AnonymousClass118) r12.ABY.get(), interopSettingsMainFragment);
        A4y((AnonymousClass1LU) r12.ABd.get(), interopSettingsMainFragment);
    }

    public static void A1v(C36241nZ r2, InteropSettingsOptinFragment interopSettingsOptinFragment) {
        AnonymousClass10E r1 = r2.A2Q;
        A4W((C18030ve) r1.A04.get(), interopSettingsOptinFragment);
        A51(interopSettingsOptinFragment, (AnonymousClass129) r1.A4I.get());
        A52(interopSettingsOptinFragment, C000200d.A00(r1.A5j));
        A53(interopSettingsOptinFragment, C000200d.A00(r2.A2O.A4U));
        A4D((AnonymousClass11C) r1.AAp.get(), interopSettingsOptinFragment);
        A54(interopSettingsOptinFragment, C000200d.A00(r1.ABd));
    }

    public static void A1w(C36241nZ r2, ListsManagerFragment listsManagerFragment) {
        AnonymousClass10E r1 = r2.A2Q;
        A55(listsManagerFragment, C000200d.A00(r1.A2j));
        A56(listsManagerFragment, C000200d.A00(r1.A5n));
        A57(listsManagerFragment, C000200d.A00(r1.AAp));
        A2P((C72043Kk) r1.A00.A1j.get(), listsManagerFragment);
        A1U((AnonymousClass4KB) r2.A0o.get(), listsManagerFragment);
        A58(listsManagerFragment, C000200d.A00(r1.ABd));
    }

    public static void A1x(C36241nZ r1, ListsHomeFragment listsHomeFragment) {
        AnonymousClass10E r12 = r1.A2Q;
        A4O((AnonymousClass1KW) r12.A3d.get(), listsHomeFragment);
        A59(listsHomeFragment, C000200d.A00(r12.A5n));
        A5A(listsHomeFragment, C000200d.A00(r12.AAp));
        A5B(listsHomeFragment, C000200d.A00(r12.ABd));
    }

    public static void A1y(C36241nZ r1, CaptionFragment captionFragment) {
        AnonymousClass10E r12 = r1.A2Q;
        A4P((AnonymousClass1KW) r12.A3d.get(), captionFragment);
        A5C(captionFragment, (C18010vc) r12.A9s.get());
        A4E((AnonymousClass11C) r12.AAp.get(), captionFragment);
    }

    public static void A1z(C36241nZ r2, MusicEditorDialog musicEditorDialog) {
        AnonymousClass10E r1 = r2.A2Q;
        A5D(musicEditorDialog, C000200d.A00(r1.A00.A06));
        A5E(musicEditorDialog, C000200d.A00(r1.A2X));
        A5F(musicEditorDialog, C000200d.A00(r1.A4b));
        A5G(musicEditorDialog, C000200d.A00(r2.A1N));
        A5H(musicEditorDialog, C000200d.A00(r1.ABz));
    }

    public static void A20(C36241nZ r0, C110355fM r1) {
        A3E((C32151gj) r0.A2Q.A1G.get(), r1);
    }

    public static void A21(C36241nZ r1, SettingsPasskeysDisabledFragment settingsPasskeysDisabledFragment) {
        A4X((C18030ve) r1.A2Q.A04.get(), settingsPasskeysDisabledFragment);
        A5I(settingsPasskeysDisabledFragment, C000200d.A00(r1.A07));
        A5J(settingsPasskeysDisabledFragment, C000200d.A00(r1.A2O.A5O));
    }

    public static void A22(C36241nZ r2, SettingsPasskeysEnabledFragment settingsPasskeysEnabledFragment) {
        AnonymousClass10E r1 = r2.A2Q;
        A4Y((C18030ve) r1.A04.get(), settingsPasskeysEnabledFragment);
        A5K(settingsPasskeysEnabledFragment, C000200d.A00(r2.A07));
        A5L(settingsPasskeysEnabledFragment, C000200d.A00(r1.AAv));
        A5M(settingsPasskeysEnabledFragment, C000200d.A00(r1.ABz));
    }

    public static void A23(C36241nZ r2, ShopsProductPreviewFragment shopsProductPreviewFragment) {
        AnonymousClass10E r22 = r2.A2Q;
        AnonymousClass10G A112 = r22.A00;
        C60642oN.A01(shopsProductPreviewFragment, C000200d.A00(A112.AFQ));
        C60642oN.A00((C57112iY) A112.AJ4.get(), shopsProductPreviewFragment);
        A5N(shopsProductPreviewFragment, (C187529fx) r22.Aiu.get());
        A2H((C36361nl) r22.A5h.get(), shopsProductPreviewFragment);
        A2n((C85424Ni) r22.Ain.get(), shopsProductPreviewFragment);
    }

    public static void A24(C36241nZ r1, AnonymousClass72I r2) {
        AnonymousClass10E r12 = r1.A2Q;
        A4F((AnonymousClass11C) r12.AAp.get(), r2);
        A4M((C18000vb) r12.ABz.get(), r2);
    }

    public static void A25(C36241nZ r2, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        AnonymousClass10E r1 = r2.A2Q;
        A4Z((C18030ve) r1.A04.get(), voipCallControlBottomSheetV2);
        A2m((C26911Ty) r1.A1J.get(), voipCallControlBottomSheetV2);
        A2E((AnonymousClass1KB) r1.A4b.get(), voipCallControlBottomSheetV2);
        A3u((C24911Md) r1.ABS.get(), voipCallControlBottomSheetV2);
        A5P((AnonymousClass1DC) r1.A95.get(), voipCallControlBottomSheetV2);
        A4G((AnonymousClass11C) r1.AAp.get(), voipCallControlBottomSheetV2);
        A4J((C27301Vn) r1.A9A.get(), voipCallControlBottomSheetV2);
        A3r(A0M(r2), voipCallControlBottomSheetV2);
        A3y((AnonymousClass1PM) r1.ABM.get(), voipCallControlBottomSheetV2);
        A3s(AnonymousClass1K1.A0f(r2.A2O), voipCallControlBottomSheetV2);
        A3i((AnonymousClass1HQ) r1.A99.get(), voipCallControlBottomSheetV2);
        A5Q((AnonymousClass10I) r1.AC1.get(), voipCallControlBottomSheetV2);
        A3t((AnonymousClass1V9) r1.A1e.get(), voipCallControlBottomSheetV2);
        A5R(voipCallControlBottomSheetV2, C000200d.A00(r1.ABV));
    }

    public static void A26(C36241nZ r4, BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        AnonymousClass10E r2 = r4.A2Q;
        AnonymousClass10G A112 = r2.A00;
        C60642oN.A01(bkScreenFragmentWithCustomPreloadScreens, C000200d.A00(A112.AFQ));
        C60642oN.A00((C57112iY) A112.AJ4.get(), bkScreenFragmentWithCustomPreloadScreens);
        A4a((C18030ve) r2.A04.get(), bkScreenFragmentWithCustomPreloadScreens);
        AnonymousClass1K1 r1 = r4.A2O;
        A5T(bkScreenFragmentWithCustomPreloadScreens, AnonymousClass1K1.A01(r1));
        A5U(bkScreenFragmentWithCustomPreloadScreens, C201110w.of());
        A2r(A112.A2Q(), bkScreenFragmentWithCustomPreloadScreens);
        A2q((C19943A0a) r2.AFZ.get(), bkScreenFragmentWithCustomPreloadScreens);
        A5S(bkScreenFragmentWithCustomPreloadScreens, C000200d.A00(r2.AmX));
        A1E((C56382hN) r1.A64.get(), bkScreenFragmentWithCustomPreloadScreens);
        A5O((AnonymousClass198) r2.AC0.get(), bkScreenFragmentWithCustomPreloadScreens);
    }

    public static void A27(C36241nZ r2, BkBottomSheetContentFragment bkBottomSheetContentFragment) {
        AnonymousClass10E r22 = r2.A2Q;
        AnonymousClass10G A112 = r22.A00;
        C60642oN.A01(bkBottomSheetContentFragment, C000200d.A00(A112.AFQ));
        C60642oN.A00((C57112iY) A112.AJ4.get(), bkBottomSheetContentFragment);
        A5V(bkBottomSheetContentFragment, C000200d.A00(r22.AFK));
    }

    public static void A28(AnonymousClass1KB r0, C62092qm r1) {
        r1.A00 = r0;
    }

    public static void A29(AnonymousClass1KB r0, QuickCreateFragment quickCreateFragment) {
        quickCreateFragment.A01 = r0;
    }

    public static void A2A(AnonymousClass1KB r0, ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment) {
        imagineMeOnboardingCameraFragment.A03 = r0;
    }

    public static void A2B(AnonymousClass1KB r0, ForwardMessagesRouter forwardMessagesRouter) {
        forwardMessagesRouter.A02 = r0;
    }

    public static void A2C(AnonymousClass1KB r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A01 = r0;
    }

    public static void A2D(AnonymousClass1KB r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A01 = r0;
    }

    public static void A2E(AnonymousClass1KB r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0H = r0;
    }

    public static void A2F(C36361nl r0, ContextualHelpBkScreenFragment contextualHelpBkScreenFragment) {
        contextualHelpBkScreenFragment.A02 = r0;
    }

    public static void A2G(C36361nl r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A02 = r0;
    }

    public static void A2H(C36361nl r0, ShopsProductPreviewFragment shopsProductPreviewFragment) {
        shopsProductPreviewFragment.A02 = r0;
    }

    public static void A2I(AnonymousClass11S r0, AnonymousClass3WN r1) {
        r1.A00 = r0;
    }

    public static void A2J(PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment, C18000vb r1) {
        pushnameEmojiBlacklistDialogFragment.A00 = r1;
    }

    public static void A2K(PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment, AnonymousClass1KW r1) {
        pushnameEmojiBlacklistDialogFragment.A01 = r1;
    }

    public static void A2L(PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment, AnonymousClass129 r1) {
        pushnameEmojiBlacklistDialogFragment.A02 = r1;
    }

    public static void A2M(C132216mP r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A03 = r0;
    }

    public static void A2N(AnonymousClass181 r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A02 = r0;
    }

    public static void A2O(C72043Kk r0, AnonymousClass3WN r1) {
        r1.A01 = r0;
    }

    public static void A2P(C72043Kk r0, ListsManagerFragment listsManagerFragment) {
        listsManagerFragment.A03 = r0;
    }

    public static void A2Q(C40751vD r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A03 = r0;
    }

    public static void A2R(C40751vD r0, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A02 = r0;
    }

    public static void A2S(C40751vD r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A04 = r0;
    }

    public static void A2T(AnonymousClass1LC r0, ConfirmFragment confirmFragment) {
        confirmFragment.A00 = r0;
    }

    public static void A2U(AnonymousClass1LC r0, PermissionsFragment permissionsFragment) {
        permissionsFragment.A00 = r0;
    }

    private void A2V(C55192fN r3) {
        AnonymousClass10E r1 = this.A2Q;
        A2Y(r3, (C18030ve) r1.A04.get());
        A2X(r3, (C22671Ct) r1.ADU.get());
        A1D((C22701Cw) r1.ADX.get(), r3);
        A2a(r3, C000200d.A00(r1.ABh));
        A2Z(r3, (AnonymousClass10I) r1.AC1.get());
    }

    public static void A2W(C55192fN r0, C62092qm r1) {
        r1.A01 = r0;
    }

    public static void A2X(C55192fN r0, C22671Ct r1) {
        r0.A01 = r1;
    }

    public static void A2Y(C55192fN r0, C18030ve r1) {
        r0.A02 = r1;
    }

    public static void A2Z(C55192fN r0, AnonymousClass10I r1) {
        r0.A03 = r1;
    }

    public static void A2a(C55192fN r0, AnonymousClass00H r1) {
        r0.A04 = r1;
    }

    /* access modifiers changed from: private */
    public void A2b(C62092qm r3) {
        AnonymousClass10E r1 = this.A2Q;
        A2e(r3, C000200d.A00(r1.A08));
        A28((AnonymousClass1KB) r1.A4b.get(), r3);
        A2W(A03(), r3);
        A2f(r3, C000200d.A00(this.A2G));
        A2g(r3, C000200d.A00(r1.A00.AFt));
        A2h(r3, C000200d.A00(r1.AfP));
        A2c(r3, (C19830z4) r1.ABl.get());
        A2d(r3, (AnonymousClass10I) r1.AC1.get());
    }

    public static void A2c(C62092qm r0, C19830z4 r1) {
        r0.A02 = r1;
    }

    public static void A2d(C62092qm r0, AnonymousClass10I r1) {
        r0.A03 = r1;
    }

    public static void A2e(C62092qm r0, AnonymousClass00H r1) {
        r0.A04 = r1;
    }

    public static void A2f(C62092qm r0, AnonymousClass00H r1) {
        r0.A05 = r1;
    }

    public static void A2g(C62092qm r0, AnonymousClass00H r1) {
        r0.A06 = r1;
    }

    public static void A2h(C62092qm r0, AnonymousClass00H r1) {
        r0.A07 = r1;
    }

    public static void A2i(CX1 cx1, ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment) {
        imagineMeOnboardingCameraFragment.A0A = cx1;
    }

    public static void A2j(FingerprintBottomSheet fingerprintBottomSheet, AnonymousClass11P r1) {
        fingerprintBottomSheet.A04 = r1;
    }

    public static void A2k(FingerprintBottomSheet fingerprintBottomSheet, C18000vb r1) {
        fingerprintBottomSheet.A05 = r1;
    }

    public static void A2l(CommonBloksScreenFragment commonBloksScreenFragment, C18030ve r1) {
        commonBloksScreenFragment.A00 = r1;
    }

    public static void A2m(C26911Ty r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0I = r0;
    }

    public static void A2n(C85424Ni r0, ShopsProductPreviewFragment shopsProductPreviewFragment) {
        shopsProductPreviewFragment.A03 = r0;
    }

    public static void A2o(C186529eL r0, C109755dx r1) {
        r1.A03 = r0;
    }

    public static void A2p(C19943A0a a0a, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A04 = a0a;
    }

    public static void A2q(C19943A0a a0a, BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        bkScreenFragmentWithCustomPreloadScreens.A03 = a0a;
    }

    public static void A2r(CXN cxn, BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        bkScreenFragmentWithCustomPreloadScreens.A04 = cxn;
    }

    private void A2s(C109755dx r2) {
        A2o((C186529eL) this.A2Q.A00.A6o.get(), r2);
        A2t(r2, AnonymousClass1K1.A01(this.A2O));
    }

    public static void A2t(C109755dx r0, Map map) {
        r0.A07 = map;
    }

    public static void A2u(QuickCreateFragment quickCreateFragment, AiCreationPhotoLoader aiCreationPhotoLoader) {
        quickCreateFragment.A06 = aiCreationPhotoLoader;
    }

    public static void A2v(QuickCreateFragment quickCreateFragment, AnonymousClass00H r1) {
        quickCreateFragment.A09 = r1;
    }

    public static void A2w(AiHomeFragment aiHomeFragment, C57642jP r1) {
        aiHomeFragment.A01 = r1;
    }

    public static void A2x(AiHomeFragment aiHomeFragment, C24921Me r1) {
        aiHomeFragment.A02 = r1;
    }

    public static void A2y(AiHomeFragment aiHomeFragment, AnonymousClass118 r1) {
        aiHomeFragment.A03 = r1;
    }

    public static void A2z(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment, AnonymousClass11C r1) {
        imagineMeOnboardingCameraFragment.A0E = r1;
    }

    public static void A30(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment, C219217x r1) {
        imagineMeOnboardingCameraFragment.A0F = r1;
    }

    public static void A31(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment, C18030ve r1) {
        imagineMeOnboardingCameraFragment.A0G = r1;
    }

    public static void A32(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment, C18010vc r1) {
        imagineMeOnboardingCameraFragment.A0H = r1;
    }

    public static void A33(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment, AnonymousClass00H r1) {
        imagineMeOnboardingCameraFragment.A0K = r1;
    }

    public static void A34(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment, AnonymousClass00H r1) {
        imagineMeOnboardingCameraFragment.A0L = r1;
    }

    public static void A35(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment, C18600wl r1) {
        imagineMeOnboardingCameraFragment.A0M = r1;
    }

    public static void A36(AnonymousClass0I4 r0, BusinessApiBrowseFragment businessApiBrowseFragment) {
        businessApiBrowseFragment.A01 = r0;
    }

    public static void A37(C173758vg r0, BusinessApiBrowseFragment businessApiBrowseFragment) {
        businessApiBrowseFragment.A02 = r0;
    }

    public static void A38(C173758vg r0, BusinessApiHomeFragment businessApiHomeFragment) {
        businessApiHomeFragment.A02 = r0;
    }

    public static void A39(BusinessApiBrowseFragment businessApiBrowseFragment, A17 a17) {
        businessApiBrowseFragment.A03 = a17;
    }

    public static void A3A(BusinessApiBrowseFragment businessApiBrowseFragment, AnonymousClass00H r1) {
        businessApiBrowseFragment.A04 = r1;
    }

    public static void A3B(BusinessApiHomeFragment businessApiHomeFragment, C18030ve r1) {
        businessApiHomeFragment.A04 = r1;
    }

    public static void A3C(BusinessApiHomeFragment businessApiHomeFragment, AnonymousClass1L4 r1) {
        businessApiHomeFragment.A05 = r1;
    }

    public static void A3D(BusinessApiHomeFragment businessApiHomeFragment, AnonymousClass00H r1) {
        businessApiHomeFragment.A06 = r1;
    }

    public static void A3E(C32151gj r0, C110355fM r1) {
        r1.A00 = r0;
    }

    public static void A3F(C173738ve r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A05 = r0;
    }

    public static void A3G(C192189nx r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A04 = r0;
    }

    public static void A3H(C192189nx r0, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A03 = r0;
    }

    public static void A3I(C192189nx r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A06 = r0;
    }

    public static void A3J(A6I a6i, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A05 = a6i;
    }

    public static void A3K(C192609og r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A06 = r0;
    }

    public static void A3L(AAC aac, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A07 = aac;
    }

    public static void A3M(AAC aac, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A04 = aac;
    }

    public static void A3N(AAC aac, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A07 = aac;
    }

    public static void A3O(C173768vh r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A08 = r0;
    }

    public static void A3P(C173768vh r0, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A05 = r0;
    }

    public static void A3Q(C173768vh r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A08 = r0;
    }

    public static void A3R(BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment, AnonymousClass1LU r1) {
        businessDirectoryConsumerHomeFragment.A0B = r1;
    }

    public static void A3S(BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment, AnonymousClass1XN r1) {
        businessDirectoryConsumerHomeFragment.A0C = r1;
    }

    public static void A3T(BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment, AnonymousClass1L4 r1) {
        businessDirectoryConsumerHomeFragment.A0D = r1;
    }

    public static void A3U(BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment, AnonymousClass00H r1) {
        businessDirectoryConsumerHomeFragment.A0E = r1;
    }

    public static void A3V(BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment, AnonymousClass00H r1) {
        businessDirectoryConsumerHomeFragment.A0F = r1;
    }

    public static void A3W(BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment, AnonymousClass1LU r1) {
        businessDirectoryContextualSearchFragment.A08 = r1;
    }

    public static void A3X(BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment, AnonymousClass1XN r1) {
        businessDirectoryContextualSearchFragment.A09 = r1;
    }

    public static void A3Y(BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment, AnonymousClass1L4 r1) {
        businessDirectoryContextualSearchFragment.A0B = r1;
    }

    public static void A3Z(BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment, AnonymousClass00H r1) {
        businessDirectoryContextualSearchFragment.A0C = r1;
    }

    public static void A3a(BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment, AnonymousClass00H r1) {
        businessDirectoryContextualSearchFragment.A0D = r1;
    }

    public static void A3b(BusinessDirectorySearchFragment businessDirectorySearchFragment, C219217x r1) {
        businessDirectorySearchFragment.A0B = r1;
    }

    public static void A3c(BusinessDirectorySearchFragment businessDirectorySearchFragment, C18000vb r1) {
        businessDirectorySearchFragment.A0C = r1;
    }

    public static void A3d(BusinessDirectorySearchFragment businessDirectorySearchFragment, AnonymousClass1LU r1) {
        businessDirectorySearchFragment.A0D = r1;
    }

    public static void A3e(BusinessDirectorySearchFragment businessDirectorySearchFragment, AnonymousClass1XN r1) {
        businessDirectorySearchFragment.A0E = r1;
    }

    public static void A3f(BusinessDirectorySearchFragment businessDirectorySearchFragment, AnonymousClass00H r1) {
        businessDirectorySearchFragment.A0G = r1;
    }

    public static void A3g(BusinessDirectorySearchFragment businessDirectorySearchFragment, AnonymousClass00H r1) {
        businessDirectorySearchFragment.A0H = r1;
    }

    public static void A3h(C24771Lp r0, GalleryDropdownFilterFragment galleryDropdownFilterFragment) {
        galleryDropdownFilterFragment.A00 = r0;
    }

    public static void A3i(AnonymousClass1HQ r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0J = r0;
    }

    private void A3j(AnonymousClass3WN r3) {
        AnonymousClass10E r1 = this.A2Q;
        A3p(r3, (C24901Mc) r1.AA5.get());
        A3l(r3, (AnonymousClass1M9) r1.A2f.get());
        A3n(r3, (AnonymousClass11C) r1.AAp.get());
        A3m(r3, (C24921Me) r1.ABX.get());
        A2I((AnonymousClass11S) r1.A63.get(), r3);
        A3o(r3, (AnonymousClass126) r1.A4h.get());
        A3k(r3, A0N(this));
        A2O((C72043Kk) r1.A00.A1j.get(), r3);
        A3q(r3, (AnonymousClass1DC) r1.A95.get());
    }

    public static void A3k(AnonymousClass3WN r0, C66812ym r1) {
        r0.A03 = r1;
    }

    public static void A3l(AnonymousClass3WN r0, AnonymousClass1M9 r1) {
        r0.A04 = r1;
    }

    public static void A3m(AnonymousClass3WN r0, C24921Me r1) {
        r0.A05 = r1;
    }

    public static void A3n(AnonymousClass3WN r0, AnonymousClass11C r1) {
        r0.A06 = r1;
    }

    public static void A3o(AnonymousClass3WN r0, AnonymousClass126 r1) {
        r0.A07 = r1;
    }

    public static void A3p(AnonymousClass3WN r0, C24901Mc r1) {
        r0.A09 = r1;
    }

    public static void A3q(AnonymousClass3WN r0, AnonymousClass1DC r1) {
        r0.A0A = r1;
    }

    public static void A3r(AnonymousClass3WN r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0L = r0;
    }

    public static void A3s(C160868Ag r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0O = r0;
    }

    public static void A3t(AnonymousClass1V9 r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0P = r0;
    }

    public static void A3u(C24911Md r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0R = r0;
    }

    public static void A3v(C34511kb r0, ForwardMessagesRouter forwardMessagesRouter) {
        forwardMessagesRouter.A03 = r0;
    }

    public static void A3w(AnonymousClass11E r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A05 = r0;
    }

    public static void A3x(AnonymousClass11E r0, InteropSettingsMainFragment interopSettingsMainFragment) {
        interopSettingsMainFragment.A00 = r0;
    }

    public static void A3y(AnonymousClass1PM r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0U = r0;
    }

    public static void A3z(C24921Me r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A02 = r0;
    }

    public static void A40(C36531o3 r0, ConfirmFragment confirmFragment) {
        confirmFragment.A01 = r0;
    }

    public static void A41(C36531o3 r0, PermissionsFragment permissionsFragment) {
        permissionsFragment.A01 = r0;
    }

    public static void A42(ForwardMessagesRouter forwardMessagesRouter, AnonymousClass1LU r1) {
        forwardMessagesRouter.A05 = r1;
    }

    public static void A43(ForwardMessagesRouter forwardMessagesRouter, AnonymousClass10I r1) {
        forwardMessagesRouter.A06 = r1;
    }

    public static void A44(ForwardMessagesRouter forwardMessagesRouter, AnonymousClass00H r1) {
        forwardMessagesRouter.A07 = r1;
    }

    public static void A45(ForwardMessagesRouter forwardMessagesRouter, AnonymousClass00H r1) {
        forwardMessagesRouter.A08 = r1;
    }

    private void A46(AQO aqo) {
        AnonymousClass10E r1 = this.A2Q;
        C64042u7.A04(aqo, (C18030ve) r1.A04.get());
        C64042u7.A0A(aqo, (AnonymousClass1R2) r1.A8L.get());
        C64042u7.A09(aqo, (C192479oS) r1.A00.AES.get());
        C64042u7.A07(aqo, (AnonymousClass1QS) r1.A8J.get());
        C64042u7.A03(aqo, (C24751Ln) r1.ABe.get());
        C64042u7.A08(aqo, AnonymousClass1K1.A1R(this.A2O));
        C64042u7.A06(aqo, (AnonymousClass1QO) r1.A8G.get());
        C64042u7.A05(aqo, (ALX) r1.AcF.get());
        C64042u7.A0C(aqo, C000200d.A00(r1.ATu));
        C64042u7.A0D(aqo, C000200d.A00(r1.AdF));
        C64042u7.A00(C19880zA.A00(), aqo);
        C64042u7.A02((C26911Ty) r1.A1J.get(), aqo);
        C64042u7.A01((C196149uX) r1.A1I.get(), aqo);
        C64042u7.A0B(aqo, C000200d.A00(r1.A1H));
    }

    /* access modifiers changed from: private */
    public void A47(C37731q2 r3) {
        AnonymousClass10E r1 = this.A2Q;
        A49(r3, C000200d.A00(r1.ABj));
        A48(r3, C000200d.A00(r1.A2b));
    }

    public static void A48(C37731q2 r0, AnonymousClass00H r1) {
        r0.A03 = r1;
    }

    public static void A49(C37731q2 r0, AnonymousClass00H r1) {
        r0.A04 = r1;
    }

    public static void A4A(AnonymousClass11C r0, GalleryDropdownFilterFragment galleryDropdownFilterFragment) {
        galleryDropdownFilterFragment.A01 = r0;
    }

    public static void A4B(AnonymousClass11C r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A03 = r0;
    }

    public static void A4C(AnonymousClass11C r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A06 = r0;
    }

    public static void A4D(AnonymousClass11C r0, InteropSettingsOptinFragment interopSettingsOptinFragment) {
        interopSettingsOptinFragment.A00 = r0;
    }

    public static void A4E(AnonymousClass11C r0, CaptionFragment captionFragment) {
        captionFragment.A00 = r0;
    }

    public static void A4F(AnonymousClass11C r0, AnonymousClass72I r1) {
        r1.A04 = r0;
    }

    public static void A4G(AnonymousClass11C r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0V = r0;
    }

    public static void A4H(AnonymousClass11P r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A03 = r0;
    }

    public static void A4I(AnonymousClass118 r0, InteropSettingsMainFragment interopSettingsMainFragment) {
        interopSettingsMainFragment.A01 = r0;
    }

    public static void A4J(C27301Vn r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0W = r0;
    }

    public static void A4K(C219217x r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A07 = r0;
    }

    public static void A4L(C18000vb r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A04 = r0;
    }

    public static void A4M(C18000vb r0, AnonymousClass72I r1) {
        r1.A05 = r0;
    }

    public static void A4N(AnonymousClass1CJ r0, AddMembersRouter addMembersRouter) {
        addMembersRouter.A01 = r0;
    }

    public static void A4O(AnonymousClass1KW r0, ListsHomeFragment listsHomeFragment) {
        listsHomeFragment.A02 = r0;
    }

    public static void A4P(AnonymousClass1KW r0, CaptionFragment captionFragment) {
        captionFragment.A01 = r0;
    }

    public static void A4Q(C18030ve r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A05 = r0;
    }

    public static void A4R(C18030ve r0, GalleryDropdownFilterFragment galleryDropdownFilterFragment) {
        galleryDropdownFilterFragment.A02 = r0;
    }

    public static void A4S(C18030ve r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A04 = r0;
    }

    public static void A4T(C18030ve r0, ConfirmFragment confirmFragment) {
        confirmFragment.A02 = r0;
    }

    public static void A4U(C18030ve r0, PermissionsFragment permissionsFragment) {
        permissionsFragment.A02 = r0;
    }

    public static void A4V(C18030ve r0, InteropSettingsMainFragment interopSettingsMainFragment) {
        interopSettingsMainFragment.A02 = r0;
    }

    public static void A4W(C18030ve r0, InteropSettingsOptinFragment interopSettingsOptinFragment) {
        interopSettingsOptinFragment.A01 = r0;
    }

    public static void A4X(C18030ve r0, SettingsPasskeysDisabledFragment settingsPasskeysDisabledFragment) {
        settingsPasskeysDisabledFragment.A00 = r0;
    }

    public static void A4Y(C18030ve r0, SettingsPasskeysEnabledFragment settingsPasskeysEnabledFragment) {
        settingsPasskeysEnabledFragment.A00 = r0;
    }

    public static void A4Z(C18030ve r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0X = r0;
    }

    public static void A4a(C18030ve r0, BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        bkScreenFragmentWithCustomPreloadScreens.A05 = r0;
    }

    public static void A4b(AnonymousClass7F7 r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A07 = r0;
    }

    public static void A4c(FlowsWebViewFragment flowsWebViewFragment, C220418j r1) {
        flowsWebViewFragment.A09 = r1;
    }

    public static void A4d(FlowsWebViewFragment flowsWebViewFragment, AnonymousClass1L4 r1) {
        flowsWebViewFragment.A0A = r1;
    }

    public static void A4e(FlowsWebViewFragment flowsWebViewFragment, AnonymousClass00H r1) {
        flowsWebViewFragment.A0B = r1;
    }

    public static void A4f(FlowsWebViewFragment flowsWebViewFragment, AnonymousClass00H r1) {
        flowsWebViewFragment.A0C = r1;
    }

    public static void A4g(GalleryDropdownFilterFragment galleryDropdownFilterFragment, AnonymousClass00H r1) {
        galleryDropdownFilterFragment.A05 = r1;
    }

    public static void A4h(C161778Hs r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A05 = r0;
    }

    public static void A4i(GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment, C36401np r1) {
        groupMembershipApprovalRequestsFragment.A08 = r1;
    }

    public static void A4j(NewGroupRouter newGroupRouter, AnonymousClass1LU r1) {
        newGroupRouter.A01 = r1;
    }

    public static void A4k(SuggestGroupRouter suggestGroupRouter, AnonymousClass1LU r1) {
        suggestGroupRouter.A01 = r1;
    }

    public static void A4l(AnonymousClass1MB r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A08 = r0;
    }

    public static void A4m(ContextualHelpBkScreenFragment contextualHelpBkScreenFragment, AnonymousClass19T r1) {
        contextualHelpBkScreenFragment.A03 = r1;
    }

    public static void A4n(ContextualHelpBkScreenFragment contextualHelpBkScreenFragment, AnonymousClass198 r1) {
        contextualHelpBkScreenFragment.A04 = r1;
    }

    public static void A4o(ContextualHelpBkScreenFragment contextualHelpBkScreenFragment, AnonymousClass00H r1) {
        contextualHelpBkScreenFragment.A05 = r1;
    }

    public static void A4p(SupportBkScreenFragment supportBkScreenFragment, AnonymousClass1LU r1) {
        supportBkScreenFragment.A09 = r1;
    }

    public static void A4q(SupportBkScreenFragment supportBkScreenFragment, AnonymousClass19T r1) {
        supportBkScreenFragment.A0A = r1;
    }

    public static void A4r(SupportBkScreenFragment supportBkScreenFragment, A98 a98) {
        supportBkScreenFragment.A0B = a98;
    }

    public static void A4s(SupportBkScreenFragment supportBkScreenFragment, AnonymousClass198 r1) {
        supportBkScreenFragment.A0C = r1;
    }

    public static void A4t(SupportBkScreenFragment supportBkScreenFragment, AnonymousClass10I r1) {
        supportBkScreenFragment.A0D = r1;
    }

    public static void A4u(AnonymousClass1TM r0, PermissionsFragment permissionsFragment) {
        permissionsFragment.A03 = r0;
    }

    public static void A4v(ConfirmFragment confirmFragment, C36401np r1) {
        confirmFragment.A04 = r1;
    }

    public static void A4w(PermissionsFragment permissionsFragment, C36401np r1) {
        permissionsFragment.A05 = r1;
    }

    public static void A4x(AnonymousClass1LU r0, InteropSettingsConfigFragment interopSettingsConfigFragment) {
        interopSettingsConfigFragment.A00 = r0;
    }

    public static void A4y(AnonymousClass1LU r0, InteropSettingsMainFragment interopSettingsMainFragment) {
        interopSettingsMainFragment.A03 = r0;
    }

    public static void A4z(C39541tF r0, InteropSettingsConfigFragment interopSettingsConfigFragment) {
        interopSettingsConfigFragment.A01 = r0;
    }

    public static void A50(C33971jg r0, InteropSettingsMainFragment interopSettingsMainFragment) {
        interopSettingsMainFragment.A04 = r0;
    }

    public static void A51(InteropSettingsOptinFragment interopSettingsOptinFragment, AnonymousClass129 r1) {
        interopSettingsOptinFragment.A02 = r1;
    }

    public static void A52(InteropSettingsOptinFragment interopSettingsOptinFragment, AnonymousClass00H r1) {
        interopSettingsOptinFragment.A03 = r1;
    }

    public static void A53(InteropSettingsOptinFragment interopSettingsOptinFragment, AnonymousClass00H r1) {
        interopSettingsOptinFragment.A04 = r1;
    }

    public static void A54(InteropSettingsOptinFragment interopSettingsOptinFragment, AnonymousClass00H r1) {
        interopSettingsOptinFragment.A05 = r1;
    }

    public static void A55(ListsManagerFragment listsManagerFragment, AnonymousClass00H r1) {
        listsManagerFragment.A07 = r1;
    }

    public static void A56(ListsManagerFragment listsManagerFragment, AnonymousClass00H r1) {
        listsManagerFragment.A08 = r1;
    }

    public static void A57(ListsManagerFragment listsManagerFragment, AnonymousClass00H r1) {
        listsManagerFragment.A09 = r1;
    }

    public static void A58(ListsManagerFragment listsManagerFragment, AnonymousClass00H r1) {
        listsManagerFragment.A0A = r1;
    }

    public static void A59(ListsHomeFragment listsHomeFragment, AnonymousClass00H r1) {
        listsHomeFragment.A04 = r1;
    }

    public static void A5A(ListsHomeFragment listsHomeFragment, AnonymousClass00H r1) {
        listsHomeFragment.A05 = r1;
    }

    public static void A5B(ListsHomeFragment listsHomeFragment, AnonymousClass00H r1) {
        listsHomeFragment.A06 = r1;
    }

    public static void A5C(CaptionFragment captionFragment, C18010vc r1) {
        captionFragment.A02 = r1;
    }

    public static void A5D(MusicEditorDialog musicEditorDialog, AnonymousClass00H r1) {
        musicEditorDialog.A0E = r1;
    }

    public static void A5E(MusicEditorDialog musicEditorDialog, AnonymousClass00H r1) {
        musicEditorDialog.A0F = r1;
    }

    public static void A5F(MusicEditorDialog musicEditorDialog, AnonymousClass00H r1) {
        musicEditorDialog.A0G = r1;
    }

    public static void A5G(MusicEditorDialog musicEditorDialog, AnonymousClass00H r1) {
        musicEditorDialog.A0H = r1;
    }

    public static void A5H(MusicEditorDialog musicEditorDialog, AnonymousClass00H r1) {
        musicEditorDialog.A0I = r1;
    }

    public static void A5I(SettingsPasskeysDisabledFragment settingsPasskeysDisabledFragment, AnonymousClass00H r1) {
        settingsPasskeysDisabledFragment.A01 = r1;
    }

    public static void A5J(SettingsPasskeysDisabledFragment settingsPasskeysDisabledFragment, AnonymousClass00H r1) {
        settingsPasskeysDisabledFragment.A02 = r1;
    }

    public static void A5K(SettingsPasskeysEnabledFragment settingsPasskeysEnabledFragment, AnonymousClass00H r1) {
        settingsPasskeysEnabledFragment.A01 = r1;
    }

    public static void A5L(SettingsPasskeysEnabledFragment settingsPasskeysEnabledFragment, AnonymousClass00H r1) {
        settingsPasskeysEnabledFragment.A02 = r1;
    }

    public static void A5M(SettingsPasskeysEnabledFragment settingsPasskeysEnabledFragment, AnonymousClass00H r1) {
        settingsPasskeysEnabledFragment.A03 = r1;
    }

    public static void A5N(ShopsProductPreviewFragment shopsProductPreviewFragment, C187529fx r1) {
        shopsProductPreviewFragment.A05 = r1;
    }

    public static void A5O(AnonymousClass198 r0, BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        bkScreenFragmentWithCustomPreloadScreens.A06 = r0;
    }

    public static void A5P(AnonymousClass1DC r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0Y = r0;
    }

    public static void A5Q(AnonymousClass10I r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0a = r0;
    }

    public static void A5R(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2, AnonymousClass00H r1) {
        voipCallControlBottomSheetV2.A0c = r1;
    }

    public static void A5S(BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens, AnonymousClass00H r1) {
        bkScreenFragmentWithCustomPreloadScreens.A07 = r1;
    }

    public static void A5T(BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens, Map map) {
        bkScreenFragmentWithCustomPreloadScreens.A08 = map;
    }

    public static void A5U(BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens, Map map) {
        bkScreenFragmentWithCustomPreloadScreens.A09 = map;
    }

    public static void A5V(BkBottomSheetContentFragment bkBottomSheetContentFragment, AnonymousClass00H r1) {
        bkBottomSheetContentFragment.A02 = r1;
    }

    public AnonymousClass043 A5W() {
        return this.A2O.AHu();
    }

    public C36241nZ(AnonymousClass1K1 r1, C24331Jt r2, AnonymousClass10E r3) {
        this.A2R = this;
        this.A2Q = r3;
        this.A2P = r2;
        this.A2O = r1;
        A19();
        A1A();
    }

    public static C199410f A02() {
        return C199410f.copyOf((Collection) A18());
    }

    private C55192fN A03() {
        C55192fN A042 = A04();
        A2V(A042);
        return A042;
    }

    public static C109755dx A0F(C36241nZ r1) {
        C109755dx A0E2 = A0E();
        r1.A2s(A0E2);
        return A0E2;
    }

    private AQO A0S() {
        AQO A002 = AnonymousClass3BI.A00();
        A46(A002);
        return A002;
    }

    public static void A1Z(C36241nZ r1, QuickCreateFragment quickCreateFragment) {
        A2u(quickCreateFragment, A0G(r1));
        AnonymousClass10E r12 = r1.A2Q;
        A29((AnonymousClass1KB) r12.A4b.get(), quickCreateFragment);
        A2v(quickCreateFragment, C000200d.A00(r12.ABd));
    }

    public static void A1h(C36241nZ r2, ForwardMessagesRouter forwardMessagesRouter) {
        A1B(C19880zA.A00(), forwardMessagesRouter);
        AnonymousClass10E r1 = r2.A2Q;
        A3v((C34511kb) r1.A2L.get(), forwardMessagesRouter);
        A44(forwardMessagesRouter, C000200d.A00(r1.A3w));
        A1P((AnonymousClass2YF) r2.A27.get(), forwardMessagesRouter);
        A2B((AnonymousClass1KB) r1.A4b.get(), forwardMessagesRouter);
        A45(forwardMessagesRouter, C000200d.A00(r1.Aaz));
        A42(forwardMessagesRouter, (AnonymousClass1LU) r1.ABd.get());
        A43(forwardMessagesRouter, (AnonymousClass10I) r1.AC1.get());
    }
}
