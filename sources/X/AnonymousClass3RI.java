package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.banner.view.MinimizedCallBanner$onAttach$1;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel$onReturnToCallVisible$1;
import com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.whatsapp.calling.wds.CallingMediaWDSButton;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3RI  reason: invalid class name */
public class AnonymousClass3RI extends LinearLayout implements AnonymousClass009, AnonymousClass3M7 {
    public ValueAnimator A00;
    public C18000vb A01;
    public C18030ve A02;
    public AnonymousClass031 A03;
    public Runnable A04;
    public C18140vp A05;
    public boolean A06;
    public C106695Wv A07;
    public C106695Wv A08;
    public C1599286k A09;
    public MinimizedCallBannerViewModel A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final AnonymousClass1BI A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J;
    public final C18100vl A0K;
    public final C18100vl A0L;

    public AnonymousClass3RI(Context context, AnonymousClass1BI r6) {
        super(context, (AttributeSet) null);
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A02 = AnonymousClass10E.A8r(A0O);
            this.A05 = A0O.A8t;
            this.A01 = AnonymousClass10E.A6Q(A0O);
        }
        this.A0F = r6;
        Integer num = AnonymousClass00R.A0C;
        this.A0J = C43531zx.A02(this, num, 2131436208);
        this.A0L = C43531zx.A02(this, num, 2131436234);
        this.A0H = C43531zx.A02(this, num, 2131430463);
        this.A0I = C43531zx.A02(this, num, 2131432875);
        this.A0C = C84074Ht.A00(this, num, 2131428641);
        this.A0E = C84074Ht.A00(this, num, 2131430152);
        this.A0B = C84074Ht.A00(this, num, 2131427911);
        this.A0G = AnonymousClass1DF.A00(num, C104695Pd.A00);
        this.A0D = AnonymousClass1DF.A01(C104755Pj.A00);
        this.A0K = AnonymousClass1DF.A01(new AnonymousClass5C6(this));
        LayoutInflater.from(context).inflate(2131626066, this, true);
        setVisibility(8);
        setBackgroundColor(AnonymousClass1YH.A00((Resources.Theme) null, getResources(), 2131101881));
        if (isAttachedToWindow()) {
            A04(this);
        } else {
            C89704ct.A00(this, 0);
        }
    }

    public static final void A05(AnonymousClass3RI r3, boolean z) {
        int i = 0;
        r3.setVisibility(C72453Mb.A07(z ? 1 : 0));
        AnonymousClass1G4 r1 = r3.getViewModel().A08;
        if (!z) {
            i = 8;
        }
        r1.setValue(Integer.valueOf(i));
        C1599286k r12 = r3.A09;
        if (r12 != null) {
            r12.CAF(r3.getVisibility());
        }
    }

    public static /* synthetic */ void getEnableNewCallControls$annotations() {
    }

    public final void A06(C18090vk r10, boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        boolean z3 = z;
        if (AnonymousClass000.A1P(getVisibility()) != z || ((valueAnimator = this.A00) != null && valueAnimator.isRunning())) {
            ValueAnimator valueAnimator2 = this.A00;
            C18090vk r5 = r10;
            boolean z4 = z2;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                removeCallbacks(this.A04);
                this.A04 = new C70753Cj(this, r5, 4, z4, z3);
            } else if (!C72453Mb.A1a(this.A0D) || !z2) {
                A05(this, z);
                if (r10 != null) {
                    r10.invoke();
                }
            } else {
                int i = 0;
                setVisibility(0);
                if (z) {
                    A05(this, true);
                }
                measure(0, 0);
                int measuredHeight = getMeasuredHeight();
                if (!z) {
                    i = measuredHeight;
                }
                ValueAnimator A092 = C72483Me.A09(i, measuredHeight - i);
                C88754aj.A00(A092, this, 1);
                C72473Md.A0n(A092, 250);
                A092.addListener(new C72553Mn(this, r10, 1, z));
                A092.start();
                this.A00 = A092;
            }
        }
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public void setCallLogData(C135166rl r1) {
    }

    public final void setEnableNewCallControls(C18140vp r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public void setShouldHideCallDuration(boolean z) {
    }

    public void setShouldShowGenericContactOrGroupName(boolean z) {
    }

    public final void setViewModel(MinimizedCallBannerViewModel minimizedCallBannerViewModel) {
        C18070vi.A0d(minimizedCallBannerViewModel, 0);
        this.A0A = minimizedCallBannerViewModel;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public static final void A02(C59492mO r1, AnonymousClass3RI r2) {
        if (C72453Mb.A1a(r2.A0D)) {
            r1.A02();
            C28931bI A0v = AnonymousClass3MX.A0v(r2.A0E);
            if (A0v.A00 != null) {
                A0v.A02().setBackground((Drawable) null);
                A0v.A04(8);
            }
        }
    }

    public static final void A03(C106715Wx r6, AnonymousClass3RI r7, AnonymousClass1OX r8) {
        if (r6 instanceof C93294ik) {
            r7.A06(new AnonymousClass5C7(r7), false, ((C93294ik) r6).A00);
        } else if (r6 instanceof C93284ij) {
            C93284ij r62 = (C93284ij) r6;
            r7.A06((C18090vk) null, C18070vi.A16(r62, r8), r62.A05);
            r7.setCurrentStartButton(r62.A02);
            r7.setCurrentEndButton(r62.A00);
            r7.getTitleLayout().setContentDescription(AnonymousClass4ZN.A00(r7, r62.A04));
            C106705Ww r5 = r62.A03;
            if (r5 instanceof C93264ih) {
                C93264ih r52 = (C93264ih) r5;
                boolean z = !r62.A06;
                WaTextView title = r7.getTitle();
                if (z) {
                    title.setText(AnonymousClass4ZN.A00(title, r52.A01));
                }
                AnonymousClass3MX.A1C(r7.getContext(), title, 2131101882);
                title.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                C18100vl r0 = r7.A0C;
                C28931bI A0v = AnonymousClass3MX.A0v(r0);
                ((ImageView) AnonymousClass3MX.A0v(r0).A02()).setImageResource(r52.A00);
                A0v.A04(0);
                AnonymousClass3MX.A0v(r7.A0B).A04(8);
                A02(r7.getAvdHolder(), r7);
                boolean z2 = r52.A02;
                C86054Pz titleAnimator = r7.getTitleAnimator();
                if (z2) {
                    if (titleAnimator != null) {
                        C18100vl r2 = titleAnimator.A01;
                        if (!((Animator) r2.getValue()).isRunning()) {
                            C88754aj.A00((ValueAnimator) r2.getValue(), titleAnimator, 2);
                            ((Animator) r2.getValue()).start();
                        }
                    }
                } else if (titleAnimator != null) {
                    titleAnimator.A00();
                }
            } else {
                if (r5 instanceof C93254ig) {
                    C93254ig r53 = (C93254ig) r5;
                    boolean z3 = !r62.A06;
                    WaTextView title2 = r7.getTitle();
                    if (z3) {
                        title2.setText(AnonymousClass4ZN.A00(title2, r53.A00));
                    }
                    AnonymousClass3MX.A1C(r7.getContext(), title2, 2131101882);
                    title2.setEllipsize(TextUtils.TruncateAt.END);
                    AnonymousClass3MX.A0v(r7.A0C).A04(8);
                    AnonymousClass3MX.A0v(r7.A0B).A04(8);
                    C59492mO avdHolder = r7.getAvdHolder();
                    if (C72453Mb.A1a(r7.A0D)) {
                        C454028v A002 = avdHolder.A00(AnonymousClass3MY.A04(r7), 2131233516, true);
                        C28931bI A0v2 = AnonymousClass3MX.A0v(r7.A0E);
                        A0v2.A02().setBackground(A002);
                        A0v2.A04(0);
                    }
                } else if (r5 instanceof C93274ii) {
                    C93274ii r54 = (C93274ii) r5;
                    boolean z4 = !r62.A06;
                    int A003 = C19740yt.A00(r7.getContext(), 2131101882);
                    WaTextView title3 = r7.getTitle();
                    if (z4) {
                        title3.setText(AnonymousClass4ZN.A00(title3, r54.A01));
                    }
                    title3.setTextColor(A003);
                    title3.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    AnonymousClass3MX.A0v(r7.A0C).A04(8);
                    C28931bI A0v3 = AnonymousClass3MX.A0v(r7.A0B);
                    VoiceParticipantAudioWave.A02((VoiceParticipantAudioWave) A0v3.A02(), r54.A00, true);
                    ((VoiceParticipantAudioWave) A0v3.A02()).setColor(A003);
                    A0v3.A04(0);
                    A02(r7.getAvdHolder(), r7);
                }
                C86054Pz titleAnimator2 = r7.getTitleAnimator();
                if (titleAnimator2 != null) {
                    titleAnimator2.A00();
                }
            }
            if (r62.A06) {
                r7.getTitle().setText(2131896776);
                AnonymousClass3MX.A1Q(new MinimizedCallBannerViewModel$onReturnToCallVisible$1(r7.getViewModel(), (C30391dr) null), r8);
            }
        }
    }

    private final C28931bI getAudioWave() {
        return AnonymousClass3MX.A0v(this.A0B);
    }

    /* access modifiers changed from: private */
    public final C59492mO getAvdHolder() {
        return (C59492mO) this.A0G.getValue();
    }

    private final boolean getEnableAnimationsByGating() {
        return C72453Mb.A1a(this.A0D);
    }

    private final C28931bI getLoadingWave() {
        return AnonymousClass3MX.A0v(this.A0E);
    }

    /* access modifiers changed from: private */
    public final C86054Pz getTitleAnimator() {
        return (C86054Pz) this.A0K.getValue();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final C28931bI getAvIcon() {
        return AnonymousClass3MX.A0v(this.A0C);
    }

    public final AnonymousClass1BI getChatJid() {
        return this.A0F;
    }

    public final C106695Wv getCurrentEndButton() {
        return this.A07;
    }

    public final C106695Wv getCurrentStartButton() {
        return this.A08;
    }

    public final C18140vp getEnableNewCallControls() {
        C18140vp r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("enableNewCallControls");
        throw null;
    }

    public final WDSButton getEndCallButton() {
        return (WDSButton) this.A0H.getValue();
    }

    public final WDSButton getMuteCallButton() {
        return (WDSButton) this.A0I.getValue();
    }

    public final WaTextView getTitle() {
        return (WaTextView) this.A0J.getValue();
    }

    public final ViewGroup getTitleLayout() {
        return (ViewGroup) this.A0L.getValue();
    }

    public final MinimizedCallBannerViewModel getViewModel() {
        MinimizedCallBannerViewModel minimizedCallBannerViewModel = this.A0A;
        if (minimizedCallBannerViewModel != null) {
            return minimizedCallBannerViewModel;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setCurrentEndButton(C106695Wv r4) {
        if (!C18070vi.A18(this.A07, r4)) {
            this.A07 = r4;
            boolean z = r4 instanceof C93234ie;
            WDSButton endCallButton = getEndCallButton();
            if (z) {
                endCallButton.setVisibility(0);
                C93234ie r42 = (C93234ie) r4;
                C18070vi.A0d(r42, 0);
                Context context = getContext();
                Drawable A052 = AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, r42.A00), 2131103331);
                C18070vi.A0X(A052);
                getEndCallButton().setIcon(A052);
                CharSequence A002 = AnonymousClass4ZN.A00(this, r42.A01);
                AnonymousClass4aR.A07(getEndCallButton(), A002, A002);
                return;
            }
            C18070vi.A0d(endCallButton, 0);
            endCallButton.setVisibility(4);
        }
    }

    public final void setCurrentStartButton(C106695Wv r4) {
        if (!C18070vi.A18(this.A08, r4)) {
            this.A08 = r4;
            boolean z = r4 instanceof C93214ic;
            WDSButton muteCallButton = getMuteCallButton();
            if (z) {
                muteCallButton.setVisibility(0);
                getMuteCallButton().setSelected(((C93214ic) r4).A00);
                return;
            }
            C18070vi.A0d(muteCallButton, 0);
            muteCallButton.setVisibility(4);
        }
    }

    public static final void A04(AnonymousClass3RI r4) {
        CallingMediaWDSButton callingMediaWDSButton;
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(r4);
        if (A002 == null) {
            Log.i("MinimizedCallBanner/onAttach/ no lifecycle owner");
            return;
        }
        AnonymousClass3MX.A1Q(new MinimizedCallBanner$onAttach$1(A002, r4, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
        WDSButton muteCallButton = r4.getMuteCallButton();
        if ((muteCallButton instanceof CallingMediaWDSButton) && (callingMediaWDSButton = (CallingMediaWDSButton) muteCallButton) != null) {
            callingMediaWDSButton.setCallControlMuteIcon(C72473Md.A1Z(r4.getEnableNewCallControls()));
        }
        C83584Fr.A00(r4.getMuteCallButton());
        A002.getLifecycle().A05(r4.getViewModel());
        if (!r4.isAttachedToWindow()) {
            A002.getLifecycle().A06(r4.getViewModel());
        } else {
            r4.addOnAttachStateChangeListener(new C89684cr(r4, A002, r4));
        }
        MinimizedCallBannerViewModel viewModel = r4.getViewModel();
        C89874dA.A00(r4.getEndCallButton(), viewModel, 8);
        C89994dM.A00(r4.getMuteCallButton(), viewModel, r4, 12);
        C825248h r1 = new C825248h(viewModel, r4, 18);
        r4.setOnClickListener(r1);
        r4.getTitleLayout().setOnClickListener(r1);
    }

    public void setShouldHideBanner(boolean z) {
        MinimizedCallBannerViewModel viewModel = getViewModel();
        if (viewModel.A01 != z) {
            viewModel.A01 = z;
            MinimizedCallBannerViewModel.A00(viewModel);
        }
    }

    public void setVisibilityChangeListener(C1599286k r1) {
        this.A09 = r1;
    }

    public int getBackgroundColorRes() {
        return 2131101881;
    }

    public int getLayout() {
        return 2131626066;
    }
}
