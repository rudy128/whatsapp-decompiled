package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.audio.TranscriptionStatusView;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.BqW  reason: case insensitive filesystem */
public class C23819BqW extends BqK {
    public TranscriptionStatusView A00;
    public C28470E2l A01;
    public C24266ByP A02;
    public C26186CuA A03;
    public AnonymousClass205 A04;
    public C28537E6l A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public Integer A0A;
    public AnonymousClass1D6 A0B;
    public AnonymousClass1D6 A0C;
    public boolean A0D;
    public TextView A0E;
    public C25802CmF A0F;
    public final ImageView A0G;
    public final ImageView A0H;
    public final C37451pZ A0I;
    public final C31131f4 A0J;
    public final CWL A0K;
    public final AudioPlayerView A0L = ((AudioPlayerView) C18070vi.A05(this, 2131429586));
    public final VoiceNoteProfileAvatarView A0M;
    public final C28931bI A0N;
    public final C28931bI A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;
    public final boolean A0R;
    public final View.OnClickListener A0S;
    public final C22851Dl A0T;
    public final AnonymousClass00H A0U = C217517g.A00(16386);
    public final AnonymousClass00H A0V = this.A01;
    public final AnonymousClass00H A0W = getPttTranscriptionConfigLazy();
    public final AnonymousClass00H A0X = C217517g.A00(16422);
    public final AnonymousClass00H A0Y = getSequentialPlaybackModelLazy();
    public final AnonymousClass00H A0Z = getTranscriptionDailyLoggerStorageLazy();
    public final C18100vl A0a;
    public final boolean A0b = AnonymousClass70T.A01(this.A0F);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23819BqW(android.content.Context r11, X.C37451pZ r12, X.C108875cR r13, X.C134196qC r14, X.C31131f4 r15, X.C441822l r16) {
        /*
            r10 = this;
            r4 = r11
            r8 = r16
            X.C18070vi.A0j(r11, r8)
            r1 = 3
            X.C18070vi.A0d(r12, r1)
            r0 = 4
            r6 = r14
            r7 = r15
            X.C18070vi.A0g(r14, r0, r15)
            r3 = r10
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r10.A1M()
            r10.A0I = r12
            r10.A0J = r15
            r0 = 16422(0x4026, float:2.3012E-41)
            X.11g r0 = X.C217517g.A00(r0)
            r10.A0X = r0
            r0 = 16386(0x4002, float:2.2962E-41)
            X.11g r0 = X.C217517g.A00(r0)
            r10.A0U = r0
            X.00H r0 = r10.getPttTranscriptionConfigLazy()
            r10.A0W = r0
            X.00H r0 = r10.getTranscriptionDailyLoggerStorageLazy()
            r10.A0Z = r0
            X.00H r0 = r10.getSequentialPlaybackModelLazy()
            r10.A0Y = r0
            X.00H r0 = r10.A01
            r10.A0V = r0
            X.0ve r0 = r10.A0F
            boolean r0 = X.AnonymousClass70T.A01(r0)
            r10.A0b = r0
            r0 = 2131429586(0x7f0b08d2, float:1.8480849E38)
            android.view.View r0 = X.C18070vi.A05(r10, r0)
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = (com.whatsapp.search.views.itemviews.AudioPlayerView) r0
            r10.A0L = r0
            r0 = 2131429619(0x7f0b08f3, float:1.8480916E38)
            android.view.View r2 = X.C18070vi.A05(r10, r0)
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r2 = (com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView) r2
            r10.A0M = r2
            r0 = 2131427907(0x7f0b0243, float:1.8477443E38)
            X.1bI r0 = X.C28931bI.A00(r10, r0)
            r10.A0O = r0
            r0 = 2131427905(0x7f0b0241, float:1.847744E38)
            X.1bI r0 = X.C28931bI.A00(r10, r0)
            r10.A0N = r0
            X.ByP r0 = X.C24266ByP.AUDIO_METADATA
            r10.A02 = r0
            X.Dk4 r0 = new X.Dk4
            r0.<init>(r10)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            r10.A0a = r0
            X.Dk2 r0 = new X.Dk2
            r0.<init>(r10)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            r10.A0P = r0
            X.Dk3 r0 = new X.Dk3
            r0.<init>(r10)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            r10.A0Q = r0
            android.widget.ImageView r0 = r2.A04
            X.C18070vi.A0X(r0)
            r10.A0H = r0
            android.widget.ImageView r0 = r2.A02
            X.C18070vi.A0X(r0)
            r10.A0G = r0
            X.11C r0 = r10.A0C
            android.view.accessibility.AccessibilityManager r0 = r0.A0M()
            boolean r0 = X.AnonymousClass1Y5.A0D(r0)
            r10.A0R = r0
            X.E6l r0 = r10.getPttFastPlaybackControllerFactory()
            X.CWL r0 = r0.BGf(r2)
            r10.A0K = r0
            X.5cR r0 = r10.A0k
            if (r0 == 0) goto L_0x0107
            X.4a3 r2 = r10.getPttTranscriptionConfig()
            X.206 r0 = r10.A0I
            X.21V r0 = (X.AnonymousClass21V) r0
            X.C18070vi.A0X(r0)
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            if (r0 == 0) goto L_0x0107
            boolean r0 = r2.A0A(r0)
            if (r0 == 0) goto L_0x0107
            X.E2l r0 = r10.getTranscriptionViewModelFactory()
            X.DOx r0 = (X.C27001DOx) r0
            X.1Xd r0 = r0.A00
            X.10E r2 = r0.A00
            X.00S r0 = r2.A9G
            X.00H r5 = X.C000200d.A00(r0)
            X.00S r0 = r2.A5z
            X.00H r6 = X.C000200d.A00(r0)
            X.00S r0 = r2.AAz
            X.00H r7 = X.C000200d.A00(r0)
            X.00S r0 = r2.AC1
            X.00H r8 = X.C000200d.A00(r0)
            X.10G r0 = r2.A00
            X.00S r0 = r0.A49
            X.00H r9 = X.C000200d.A00(r0)
            X.CuA r4 = new X.CuA
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A03 = r4
        L_0x0107:
            r0 = 0
            r10.A2u(r0, r0)
            X.4dE r0 = new X.4dE
            r0.<init>(r10, r1)
            r10.A0S = r0
            r1 = 4
            X.D6m r0 = new X.D6m
            r0.<init>(r10, r1)
            r10.A0T = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23819BqW.<init>(android.content.Context, X.1pZ, X.5cR, X.6qC, X.1f4, X.22l):void");
    }

    public static final void A01(C23819BqW bqW, C145777Mo r5, C441822l r6, C108295bS r7) {
        C108295bS r3;
        C18070vi.A0d(r7, 2);
        bqW.getPttSavedPlaybackPositionController().CEy(r6.A0x);
        if (!r7.BFo(r6, r5.A0Q, r5.A0U)) {
            if (bqW.A0b) {
                C108875cR r32 = bqW.A0k;
                if ((r32 instanceof C108295bS) && (r3 = (C108295bS) r32) != null) {
                    r3.CRY(r6, (long) bqW.A0W.A04(AnonymousClass18O.A0n), true);
                }
            }
            bqW.A0k.CNC(r6);
        } else if (bqW.getPushToVideoModel().A03.A06() == null) {
            r5.A0P = true;
        }
    }

    public boolean A1V() {
        return false;
    }

    public void A1u() {
        super.A1u();
        A2u(false, false);
    }

    public void A2J(AnonymousClass206 r3) {
        super.A2V(r3, true);
        A2u(false, true);
    }

    public void A2V(AnonymousClass206 r3, boolean z) {
        C18070vi.A0d(r3, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(r3, (AnonymousClass21V) this.A0I);
        super.A2V(r3, z);
        if (z || A1Z) {
            A2u(false, false);
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 2;
    }

    public void setDuration(String str) {
        C18070vi.A0d(str, 0);
        TextView textView = this.A0E;
        if (textView == null) {
            textView = (TextView) findViewById(2131429927);
            this.A0E = textView;
        }
        textView.setText(str);
    }

    public final void setEnableTranscriptionUserActionsLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setPttFastPlaybackControllerFactory(C28537E6l e6l) {
        C18070vi.A0d(e6l, 0);
        this.A05 = e6l;
    }

    public final void setPttTranscriptionConfigLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setSequentialPlaybackModelLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setTranscriptionDailyLoggerStorageLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setTranscriptionViewModelFactory(C28470E2l e2l) {
        C18070vi.A0d(e2l, 0);
        this.A01 = e2l;
    }

    public static final void A00(C23819BqW bqW) {
        C441822l r3 = (C441822l) ((AnonymousClass21V) bqW.A0I);
        C18070vi.A0X(r3);
        C26186CuA cuA = bqW.A03;
        if (cuA != null) {
            boolean contains = bqW.getMessagesManuallyTranscribedSinceChatOpen().contains(r3.A0v);
            C25802CmF cmF = bqW.A0F;
            String transcriptionFormatString = bqW.getTranscriptionFormatString();
            C18070vi.A0X(transcriptionFormatString);
            C26186CuA.A03(cuA, new C28090Dr4(cuA, r3, cmF, transcriptionFormatString, contains));
        }
    }

    private final View getAudioMetadataDateWrapperPlaceholder() {
        return AnonymousClass3MW.A0A(this.A0P);
    }

    private final View getFooterDateWrapperPlaceholder() {
        return AnonymousClass3MW.A0A(this.A0Q);
    }

    private final C37181p6 getMessagesManuallyTranscribedSinceChatOpen() {
        AnonymousClass00H r1 = this.A0U;
        C18070vi.A0d(r1, 0);
        return (C37181p6) r1.get();
    }

    private final AnonymousClass8AF getPttSavedPlaybackPositionController() {
        AnonymousClass00H r0 = this.A0V;
        C18070vi.A0W(r0);
        return (AnonymousClass8AF) r0.get();
    }

    private final C88534a3 getPttTranscriptionConfig() {
        AnonymousClass00H r1 = this.A0W;
        C18070vi.A0d(r1, 0);
        return (C88534a3) r1.get();
    }

    private final C216616x getPushToVideoModel() {
        AnonymousClass00H r1 = this.A0X;
        C18070vi.A0d(r1, 0);
        return (C216616x) r1.get();
    }

    private final C85714Ol getSequentialPlaybackModel() {
        AnonymousClass00H r1 = this.A0Y;
        C18070vi.A0d(r1, 0);
        return (C85714Ol) r1.get();
    }

    private final C131006kM getTranscriptionDailyLoggerStorage() {
        AnonymousClass00H r1 = this.A0Z;
        C18070vi.A0d(r1, 0);
        return (C131006kM) r1.get();
    }

    private final String getTranscriptionFormatString() {
        return (String) this.A0a.getValue();
    }

    public boolean A1g() {
        AnonymousClass21V r1 = (AnonymousClass21V) this.A0I;
        C18070vi.A0X(r1);
        if (!r1.A0w() && this.A0D && !r1.A0v.A02) {
            if (!C18020vd.A05(C18040vf.A02, this.A0F, 10174)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A20() {
        View view;
        C441822l A022;
        C31131f4 r2 = this.A0J;
        AnonymousClass00H r1 = this.A00;
        C18070vi.A0W(r1);
        View rootView = this.A08.getRootView();
        C18070vi.A0X(rootView);
        C18070vi.A0d(r2, 0);
        AnonymousClass4aV.A03(rootView, r2, r1);
        C441822l r7 = (C441822l) ((AnonymousClass21V) this.A0I);
        C18070vi.A0X(r7);
        C108875cR r3 = this.A0k;
        if (!(r3 instanceof C108295bS)) {
            super.A20();
            return;
        }
        C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.sequentialplayback.SequentialMessageContainer");
        C108295bS r32 = (C108295bS) r3;
        getSequentialPlaybackModel().A03 = true;
        if (this.A03 != null) {
            Context A042 = AnonymousClass3MY.A04(this);
            C219217x r0 = this.A03;
            C18070vi.A0W(r0);
            if (!AnonymousClass74O.A0P(A042, r0)) {
                return;
            }
        }
        if (A2t(r7)) {
            if (!(!this.A0b || (A022 = r2.A02()) == null || A022.A0x == r7.A0x)) {
                r32.CRY(A022, 0, false);
            }
            C145777Mo A002 = this.A03.A00(AnonymousClass3Ma.A05(this), r7, true);
            A002.A0D(r7);
            A002.A0I = new DP0(this, 0);
            this.A0D = true;
            A002.A0G = new C27002DOy(this, A002, r7, r32);
            A002.A0G(true);
            if (A002.A14) {
                AnonymousClass21V r02 = (AnonymousClass21V) this.A0I;
                C18070vi.A0X(r02);
                C88534a3 pttTranscriptionConfig = getPttTranscriptionConfig();
                AnonymousClass205 r12 = r02.A0v;
                AnonymousClass1BI r03 = r12.A00;
                if (!(r03 == null || !pttTranscriptionConfig.A0A(r03) || r12 == this.A04)) {
                    this.A04 = r12;
                    C28931bI r13 = this.A0O;
                    if (r13.A0A()) {
                        view = r13.A02();
                    } else {
                        view = null;
                    }
                    boolean z = false;
                    if (view != null && view.getVisibility() == 0) {
                        z = true;
                    }
                    this.A1X.CGF(new AnonymousClass7RK(38, (Object) this, z));
                }
            }
            super.A1u();
            A2u(true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0121, code lost:
        if (r0 != null) goto L_0x0123;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A2u(boolean r13, boolean r14) {
        /*
            r12 = this;
            X.206 r6 = r12.A0I
            X.21V r6 = (X.AnonymousClass21V) r6
            X.22l r6 = (X.C441822l) r6
            X.C18070vi.A0X(r6)
            boolean r0 = r6.A0w()
            if (r0 != 0) goto L_0x0015
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r6)
            if (r0 == 0) goto L_0x001a
        L_0x0015:
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r0 = r12.A0M
            r0.setIsNewsletterAudioOrPttUi(r6)
        L_0x001a:
            com.whatsapp.search.views.itemviews.AudioPlayerView r5 = r12.A0L
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r4 = r12.A0M
            X.AnonymousClass72W.A03(r6, r5, r4)
            X.1pZ r8 = r12.A0I
            X.11S r1 = r12.A0U
            X.1M9 r7 = r12.A0j
            X.0ve r2 = r12.A0F
            r0 = 1040(0x410, float:1.457E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r2, r0)
            if (r0 == 0) goto L_0x0104
            boolean r0 = r6.A1J()
            if (r0 == 0) goto L_0x0104
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r6)
            if (r0 != 0) goto L_0x0104
            r0 = 1
            r4.setIsForwardedByNonAuthorPttUi(r0)
        L_0x0043:
            X.0ve r1 = r12.A0F
            r0 = 637(0x27d, float:8.93E-43)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x005d
            r0 = 32768(0x8000, double:1.61895E-319)
            boolean r0 = r6.A11(r0)
            if (r0 != 0) goto L_0x00ec
            r0 = 0
            r5.setTag(r0)
            r5.A02()
        L_0x005d:
            boolean r0 = r12.A0b
            if (r0 == 0) goto L_0x00de
            android.view.View$OnClickListener r0 = r12.A0S
            r4.setOnFastPlaybackButtonClickListener(r0)
            X.206 r7 = r12.A0I
            X.21V r7 = (X.AnonymousClass21V) r7
            X.C18070vi.A0X(r7)
            X.6qC r0 = r12.A03
            X.1f4 r1 = r0.A02
            boolean r0 = r1.A0D(r7)
            if (r0 == 0) goto L_0x00ea
            X.7Mo r3 = r1.A00()
        L_0x007b:
            X.1f4 r0 = r12.A0J
            X.22l r2 = r0.A02()
            X.7Mo r1 = r0.A00()
            X.205 r0 = r7.A0v
            boolean r8 = r0.A02
            X.1BI r0 = r0.A00
            boolean r9 = X.C22971Dz.A0e(r0)
            if (r3 == 0) goto L_0x0097
            boolean r0 = r3.A0I()
            if (r0 != 0) goto L_0x00ab
        L_0x0097:
            if (r13 != 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00a1
            boolean r0 = r1.A0I()
            if (r0 != 0) goto L_0x00e5
        L_0x00a1:
            if (r2 == 0) goto L_0x00e5
            long r2 = r2.A0x
            long r0 = r7.A0x
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x00e5
        L_0x00ab:
            int r0 = X.C145777Mo.A15
            r4.A02(r0, r14, r8, r9)
            boolean r0 = r12.A0R
            if (r0 == 0) goto L_0x00de
            if (r8 == 0) goto L_0x00de
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x00de
            r0 = 2131429541(0x7f0b08a5, float:1.8480758E38)
            android.view.View r3 = r5.findViewById(r0)
            r0 = 2131430795(0x7f0b0d8b, float:1.8483301E38)
            android.view.View r2 = r4.findViewById(r0)
            if (r3 == 0) goto L_0x00de
            if (r2 == 0) goto L_0x00de
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x00de
            r1 = 10
            X.BJi r0 = new X.BJi
            r0.<init>(r3, r1)
            X.AnonymousClass1HF.A0f(r2, r0)
        L_0x00de:
            A00(r12)
            r12.A2n(r6)
            return
        L_0x00e5:
            r0 = 0
            r4.A03(r0, r14, r8, r9)
            goto L_0x00de
        L_0x00ea:
            r3 = 0
            goto L_0x007b
        L_0x00ec:
            X.205 r0 = r6.A0v
            r5.setTag(r0)
            X.1Qe r2 = r12.A18
            X.C18070vi.A0W(r2)
            r0 = 40
            X.4rl r1 = new X.4rl
            r1.<init>(r12, r6, r0)
            X.1Om r0 = X.C25511Om.A00
            r2.A06(r6, r1, r0)
            goto L_0x005d
        L_0x0104:
            r11 = 0
            r4.setIsForwardedByNonAuthorPttUi(r11)
            X.205 r10 = r6.A0v
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0128
            android.widget.ImageView r2 = r4.A04
            boolean r0 = r6.A0w()
            if (r0 != 0) goto L_0x013d
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r6)
            if (r0 != 0) goto L_0x013d
            r1.A0I()
            X.1E8 r0 = r1.A0D
            if (r0 == 0) goto L_0x0043
        L_0x0123:
            r8.A07(r2, r0)
            goto L_0x0043
        L_0x0128:
            android.widget.ImageView r9 = r4.A02
            android.widget.ImageView r2 = r4.A04
            X.1BI r0 = r10.A00
            boolean r1 = X.C22971Dz.A0e(r0)
            r0 = 8
            if (r1 == 0) goto L_0x0167
            r9.setVisibility(r11)
            r2.setVisibility(r0)
            r2 = r9
        L_0x013d:
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r6)
            if (r0 == 0) goto L_0x0151
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r6)
            X.C17960vV.A07(r0)
            X.1ch r1 = r0.A01
        L_0x014c:
            X.1E7 r0 = r7.A0H(r1)
            goto L_0x0123
        L_0x0151:
            X.1BI r1 = r10.A00
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 != 0) goto L_0x015f
            boolean r0 = X.C22971Dz.A0a(r1)
            if (r0 == 0) goto L_0x0163
        L_0x015f:
            X.1BI r1 = r6.A0H()
        L_0x0163:
            X.C17960vV.A07(r1)
            goto L_0x014c
        L_0x0167:
            r9.setVisibility(r0)
            goto L_0x013d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23819BqW.A2u(boolean, boolean):void");
    }

    public final AnonymousClass00H getEnableTranscriptionUserActionsLazy() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("enableTranscriptionUserActionsLazy");
        throw null;
    }

    public int getMainChildMaxWidth() {
        if (this.A0l.Bew((AnonymousClass21V) this.A0I)) {
            return 0;
        }
        return getResources().getDimensionPixelSize(2131166319);
    }

    public final AnonymousClass00H getMessagesManuallyTranscribedSinceChatOpenLazy() {
        return this.A0U;
    }

    public final C28537E6l getPttFastPlaybackControllerFactory() {
        C28537E6l e6l = this.A05;
        if (e6l != null) {
            return e6l;
        }
        C18070vi.A11("pttFastPlaybackControllerFactory");
        throw null;
    }

    public final AnonymousClass00H getPttTranscriptionConfigLazy() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pttTranscriptionConfigLazy");
        throw null;
    }

    public final AnonymousClass00H getPushToVideoModelLazy() {
        return this.A0X;
    }

    public final AnonymousClass00H getSequentialPlaybackModelLazy() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sequentialPlaybackModelLazy");
        throw null;
    }

    public final AnonymousClass00H getTranscriptionDailyLoggerStorageLazy() {
        AnonymousClass00H r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("transcriptionDailyLoggerStorageLazy");
        throw null;
    }

    public final C28470E2l getTranscriptionViewModelFactory() {
        C28470E2l e2l = this.A01;
        if (e2l != null) {
            return e2l;
        }
        C18070vi.A11("transcriptionViewModelFactory");
        throw null;
    }

    public final void setSharedTranscriptionState(C25802CmF cmF) {
        if (cmF != this.A0F) {
            this.A0F = cmF;
            A00(this);
        }
    }

    public static final void A02(C23819BqW bqW, boolean z) {
        bqW.getTranscriptionDailyLoggerStorage().A04.A00(1);
        if (z) {
            bqW.getTranscriptionDailyLoggerStorage().A07.A00(1);
        }
    }

    public int getCenteredLayoutId() {
        return 2131624961;
    }

    public int getIncomingLayoutId() {
        return 2131624961;
    }

    public int getOutgoingLayoutId() {
        return 2131624962;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C26186CuA cuA = this.A03;
        if (cuA != null) {
            C22851Dl r1 = this.A0T;
            C18070vi.A0d(r1, 0);
            cuA.A00 = r1;
            r1.Bo9(cuA.A02);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C26186CuA cuA = this.A03;
        if (cuA != null) {
            cuA.A00 = null;
            COP cop = (COP) cuA.A09.getValue();
            Runnable runnable = cop.A00;
            if (runnable != null) {
                cop.A01.removeCallbacks(runnable);
                cop.A00 = null;
            }
        }
    }

    public final void setHasPlayedPttInCurrentSession(boolean z) {
        this.A0D = z;
    }
}
