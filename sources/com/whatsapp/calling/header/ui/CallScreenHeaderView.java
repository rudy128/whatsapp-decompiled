package com.whatsapp.calling.header.ui;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1F9;
import X.AnonymousClass1K1;
import X.AnonymousClass1V9;
import X.AnonymousClass1VF;
import X.AnonymousClass1VW;
import X.AnonymousClass1ZG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4EC;
import X.AnonymousClass4IY;
import X.AnonymousClass4UW;
import X.AnonymousClass4ZN;
import X.AnonymousClass4aO;
import X.AnonymousClass5MT;
import X.C000200d;
import X.C101645Dk;
import X.C101655Dl;
import X.C104835Pr;
import X.C104845Ps;
import X.C125666bS;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18110vm;
import X.C18140vp;
import X.C19740yt;
import X.C27201Vd;
import X.C27691Xc;
import X.C28931bI;
import X.C30391dr;
import X.C37451pZ;
import X.C42141xh;
import X.C43531zx;
import X.C66812ym;
import X.C72043Kk;
import X.C72463Mc;
import X.C72473Md;
import X.C76283n2;
import X.C76293n3;
import X.C76303n4;
import X.C76313n5;
import X.C76343n8;
import X.C76353n9;
import X.C76363nA;
import X.C84074Ht;
import X.C85924Pg;
import X.C87264Ux;
import X.C89704ct;
import X.C90034dQ;
import X.C98244qo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.header.CallHeaderStateHolder;

public class CallScreenHeaderView extends ConstraintLayout implements AnonymousClass009 {
    public C72043Kk A00;
    public C125666bS A01;
    public AnonymousClass1VF A02;
    public CallHeaderStateHolder A03;
    public AnonymousClass1V9 A04;
    public C66812ym A05;
    public AnonymousClass1VW A06;
    public C27201Vd A07;
    public C18000vb A08;
    public C18030ve A09;
    public AnonymousClass1DC A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass031 A0C;
    public C18140vp A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J;
    public final C18100vl A0K;
    public final C18100vl A0L;
    public final C42141xh A0M;
    public final C18100vl A0N;
    public final C18100vl A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;
    public final C18100vl A0R;
    public final C18100vl A0S;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallScreenHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public static /* synthetic */ void getEnableNewCallControls$annotations() {
    }

    public void A08(AnonymousClass4EC r7) {
        C18070vi.A0d(r7, 0);
        AnonymousClass1E7 r3 = null;
        if (r7 instanceof C76283n2) {
            C76283n2 r72 = (C76283n2) r7;
            setTitle(r72.A02, r72.A01);
            A00(r72.A00, true);
            C85924Pg callStateChangeTransition = getCallStateChangeTransition();
            if (callStateChangeTransition != null) {
                callStateChangeTransition.A00(this, true);
            }
            setupButtons((C87264Ux) null, (C87264Ux) null, (C87264Ux) null, (C87264Ux) null);
        } else if (r7 instanceof C76293n3) {
            C76293n3 r73 = (C76293n3) r7;
            AnonymousClass1E7 r1 = r73.A01;
            setTitle(r1, r73.A02);
            A00(r73.A00, true);
            C85924Pg callStateChangeTransition2 = getCallStateChangeTransition();
            if (callStateChangeTransition2 != null) {
                callStateChangeTransition2.A00(this, true);
            }
            setupButtons((C87264Ux) null, (C87264Ux) null, (C87264Ux) null, (C87264Ux) null);
            if (r1 != null && r73.A03) {
                r3 = r1;
            }
        } else if (r7 instanceof C76313n5) {
            C76313n5 r74 = (C76313n5) r7;
            setTitle(r74.A05, r74.A06);
            A00(r74.A04, false);
            setupButtons(r74.A02, r74.A03, r74.A01, r74.A00);
            C85924Pg callStateChangeTransition3 = getCallStateChangeTransition();
            if (callStateChangeTransition3 != null) {
                callStateChangeTransition3.A00(this, false);
            }
        } else if (r7 instanceof C76303n4) {
            C76303n4 r75 = (C76303n4) r7;
            setTitle(r75.A06, r75.A05);
            A00(r75.A04, false);
            C85924Pg callStateChangeTransition4 = getCallStateChangeTransition();
            if (callStateChangeTransition4 != null) {
                callStateChangeTransition4.A00(this, false);
            }
            setupButtons(r75.A02, r75.A03, r75.A01, r75.A00);
        } else if (r7 instanceof C76353n9) {
            C76353n9 r76 = (C76353n9) r7;
            A00(r76.A00, false);
            C85924Pg callStateChangeTransition5 = getCallStateChangeTransition();
            if (callStateChangeTransition5 != null) {
                callStateChangeTransition5.A00(this, true);
            }
            setupButtons((C87264Ux) null, (C87264Ux) null, (C87264Ux) null, (C87264Ux) null);
            setPhoto(r76.A01);
            return;
        } else if (!(r7 instanceof C76343n8) && (r7 instanceof C76363nA)) {
            C76363nA r77 = (C76363nA) r7;
            setTitle(r77.A03, r77.A04);
            A00(r77.A02, false);
            setupButtons(r77.A00, r77.A01, (C87264Ux) null, (C87264Ux) null);
            return;
        } else {
            return;
        }
        setPhoto(r3);
    }

    public final boolean A0A(MotionEvent motionEvent) {
        C18100vl r1 = this.A0K;
        if (AnonymousClass3MX.A0v(r1).A00 == null) {
            return false;
        }
        Rect A072 = AnonymousClass3MW.A07();
        AnonymousClass3MX.A0v(r1).A02().getGlobalVisibleRect(A072);
        return A072.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setCallHeaderStateHolder(CallHeaderStateHolder callHeaderStateHolder) {
        C18070vi.A0d(callHeaderStateHolder, 0);
        this.A03 = callHeaderStateHolder;
    }

    public final void setCallUserJourneyLogger(AnonymousClass1V9 r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setCallingAwarenessManager(AnonymousClass1VF r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setContactAvatars(AnonymousClass1VW r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setContactPhotos(C27201Vd r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setEnableNewCallControls(C18140vp r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setFloatingViewStateHolder(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setPhotoDisplayer(C66812ym r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setStatusBarHeightPx(C125666bS r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setSystemFeatures(AnonymousClass1DC r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setTextEmojiLabelControllerFactory(C72043Kk r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    private final void A00(AnonymousClass4UW r8, boolean z) {
        Drawable drawable;
        Drawable mutate;
        if (r8 == null) {
            getSubtitleView$app_product_calling_calling().setVisibility(8);
            return;
        }
        int i = 0;
        int A002 = C19740yt.A00(AnonymousClass3MX.A04(getSubtitleView$app_product_calling_calling(), this, 0), r8.A01);
        Integer num = r8.A03;
        AlphaAnimation alphaAnimation = null;
        if (num != null) {
            drawable = AnonymousClass3MZ.A0B(this, num.intValue());
            if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
                mutate.setTint(A002);
            }
        } else {
            drawable = null;
        }
        C18110vm A012 = AnonymousClass1DF.A01(new AnonymousClass5MT(this, z));
        if (drawable != null) {
            drawable.setBounds(0, 0, AnonymousClass000.A0M(A012.getValue()), AnonymousClass000.A0M(A012.getValue()));
        }
        WaTextView subtitleView$app_product_calling_calling = getSubtitleView$app_product_calling_calling();
        subtitleView$app_product_calling_calling.setText(AnonymousClass4ZN.A00(subtitleView$app_product_calling_calling, r8.A02));
        subtitleView$app_product_calling_calling.setTextColor(A002);
        if (drawable != null && !z) {
            i = C72463Mc.A06(subtitleView$app_product_calling_calling);
        }
        subtitleView$app_product_calling_calling.setCompoundDrawablePadding(i);
        if (AnonymousClass3MY.A1b(subtitleView$app_product_calling_calling.getWhatsAppLocale())) {
            subtitleView$app_product_calling_calling.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            subtitleView$app_product_calling_calling.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        int i2 = r8.A00;
        if ((i2 == 3 || i2 == 0) && !getFadeInAnimation().hasStarted()) {
            alphaAnimation = getFadeInAnimation();
        } else {
            if (i2 == 2 && !getFadeOutAnimation().hasStarted()) {
                alphaAnimation = getFadeOutAnimation();
            }
            subtitleView$app_product_calling_calling.setAnimation(alphaAnimation);
        }
        alphaAnimation.start();
        subtitleView$app_product_calling_calling.setAnimation(alphaAnimation);
    }

    private final C28931bI getArEffectsBtnStubHolder() {
        return AnonymousClass3MX.A0v(this.A0H);
    }

    private final C85924Pg getCallStateChangeTransition() {
        return (C85924Pg) this.A0N.getValue();
    }

    private final AlphaAnimation getFadeInAnimation() {
        return (AlphaAnimation) this.A0O.getValue();
    }

    private final AlphaAnimation getFadeOutAnimation() {
        return (AlphaAnimation) this.A0P.getValue();
    }

    private final C28931bI getMinimizeButtonStubHolder() {
        return AnonymousClass3MX.A0v(this.A0J);
    }

    private final C28931bI getParticipantsButtonStubHolder() {
        return AnonymousClass3MX.A0v(this.A0K);
    }

    private final void setPhoto(AnonymousClass1E7 r6) {
        C18100vl r4 = this.A0L;
        C28931bI A0v = AnonymousClass3MX.A0v(r4);
        int i = 0;
        if (r6 == null) {
            i = 8;
        }
        A0v.A04(i);
        if (r6 != null) {
            ((C37451pZ) this.A0Q.getValue()).A05((ImageView) AnonymousClass3MX.A0v(r4).A02(), getPhotoDisplayer(), r6, true);
        }
    }

    public static /* synthetic */ void setSubtitle$default(CallScreenHeaderView callScreenHeaderView, AnonymousClass4UW r2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            callScreenHeaderView.A00(r2, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSubtitle");
    }

    private final void setTitle(AnonymousClass4ZN r3, AnonymousClass4ZN r4) {
        CharSequence charSequence;
        if (r3 != null) {
            getTitleView$app_product_calling_calling().setVisibility(0);
            C42141xh r0 = this.A0M;
            r0.A01.setText(AnonymousClass4ZN.A00(this, r3));
            TextEmojiLabel titleView$app_product_calling_calling = getTitleView$app_product_calling_calling();
            if (r4 != null) {
                charSequence = AnonymousClass4ZN.A00(this, r4);
            } else {
                charSequence = null;
            }
            titleView$app_product_calling_calling.setContentDescription(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (r5 != null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupButton(X.C87264Ux r5, X.C28931bI r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x006b
            android.view.View r1 = r6.A02()
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            int r0 = r5.A01
            r1.setIcon((int) r0)
            android.view.View r1 = r6.A02()
            boolean r0 = r5.A04
            r1.setEnabled(r0)
            android.view.View r1 = r6.A02()
            boolean r0 = r5.A05
            r1.setSelected(r0)
            android.view.View r1 = r6.A02()
            float r0 = r5.A00
            r1.setRotation(r0)
            android.view.View r1 = r6.A02()
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            X.4D1 r0 = r5.A03
            r1.setSize(r0)
            r0 = 0
        L_0x0034:
            r6.A04(r0)
            int r0 = r6.A01()
            if (r0 != 0) goto L_0x0066
            android.view.View r3 = r6.A02()
            r2 = 0
            if (r5 == 0) goto L_0x0067
            X.4T9 r0 = r5.A02
            X.4ZN r0 = r0.A01
            java.lang.CharSequence r0 = X.AnonymousClass4ZN.A00(r4, r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = r0.toString()
        L_0x0052:
            X.4T9 r0 = r5.A02
            X.4ZN r0 = r0.A00
            if (r0 == 0) goto L_0x0062
            java.lang.CharSequence r0 = X.AnonymousClass4ZN.A00(r4, r0)
            if (r0 == 0) goto L_0x0062
            java.lang.String r2 = r0.toString()
        L_0x0062:
            r0 = 1
            X.AnonymousClass4aR.A08(r3, r1, r2, r0)
        L_0x0066:
            return
        L_0x0067:
            r1 = r2
            if (r5 == 0) goto L_0x0062
            goto L_0x0052
        L_0x006b:
            r0 = 8
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.header.ui.CallScreenHeaderView.setupButton(X.4Ux, X.1bI):void");
    }

    private final void setupButtons(C87264Ux r2, C87264Ux r3, C87264Ux r4, C87264Ux r5) {
        setupButton(r2, AnonymousClass3MX.A0v(this.A0J));
        setupButton(r3, AnonymousClass3MX.A0v(this.A0K));
        setupButton(r4, AnonymousClass3MX.A0v(this.A0I));
        setupButton(r5, AnonymousClass3MX.A0v(this.A0H));
    }

    public static /* synthetic */ void setupButtons$default(CallScreenHeaderView callScreenHeaderView, C87264Ux r3, C87264Ux r4, C87264Ux r5, C87264Ux r6, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                r3 = null;
            }
            if ((i & 2) != 0) {
                r4 = null;
            }
            if ((i & 4) != 0) {
                r5 = null;
            }
            if ((i & 8) != 0) {
                r6 = null;
            }
            callScreenHeaderView.setupButtons(r3, r4, r5, r6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupButtons");
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0C;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final CallHeaderStateHolder getCallHeaderStateHolder() {
        CallHeaderStateHolder callHeaderStateHolder = this.A03;
        if (callHeaderStateHolder != null) {
            return callHeaderStateHolder;
        }
        C18070vi.A11("callHeaderStateHolder");
        throw null;
    }

    public final AnonymousClass1V9 getCallUserJourneyLogger() {
        AnonymousClass1V9 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callUserJourneyLogger");
        throw null;
    }

    public final AnonymousClass1VF getCallingAwarenessManager() {
        AnonymousClass1VF r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callingAwarenessManager");
        throw null;
    }

    public final C28931bI getCameraSwitchBtnStubHolder$app_product_calling_calling() {
        return AnonymousClass3MX.A0v(this.A0I);
    }

    public final AnonymousClass1VW getContactAvatars() {
        AnonymousClass1VW r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactAvatars");
        throw null;
    }

    public final C27201Vd getContactPhotos() {
        C27201Vd r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }

    public final C18140vp getEnableNewCallControls() {
        C18140vp r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("enableNewCallControls");
        throw null;
    }

    public final AnonymousClass00H getFloatingViewStateHolder() {
        AnonymousClass00H r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("floatingViewStateHolder");
        throw null;
    }

    public final C66812ym getPhotoDisplayer() {
        C66812ym r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("photoDisplayer");
        throw null;
    }

    public final C28931bI getPhotoViewStubHolder$app_product_calling_calling() {
        return AnonymousClass3MX.A0v(this.A0L);
    }

    public final C125666bS getStatusBarHeightPx() {
        C125666bS r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statusBarHeightPx");
        throw null;
    }

    public final WaTextView getSubtitleView$app_product_calling_calling() {
        return (WaTextView) this.A0R.getValue();
    }

    public final AnonymousClass1DC getSystemFeatures() {
        AnonymousClass1DC r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("systemFeatures");
        throw null;
    }

    public final C72043Kk getTextEmojiLabelControllerFactory() {
        C72043Kk r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("textEmojiLabelControllerFactory");
        throw null;
    }

    public final TextEmojiLabel getTitleView$app_product_calling_calling() {
        return (TextEmojiLabel) this.A0S.getValue();
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public static final boolean A01(MotionEvent motionEvent, C28931bI r3) {
        if (r3.A01() == 0) {
            if (!AnonymousClass4aO.A05(AnonymousClass3MW.A07(), motionEvent, r3.A02())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A07() {
        this.A0E = C72473Md.A1Z(getEnableNewCallControls());
        C18100vl r3 = this.A0I;
        AnonymousClass3MX.A0v(r3).A05(new C90034dQ(this, 21));
        C98244qo.A00(AnonymousClass3MX.A0v(r3), 1);
        AnonymousClass3MX.A0v(this.A0J).A05(new C90034dQ(this, 22));
        AnonymousClass3MX.A0v(this.A0K).A05(new C90034dQ(this, 23));
        C98244qo.A00(AnonymousClass3MX.A0v(this.A0L), 2);
        AnonymousClass3MX.A0v(this.A0H).A05(new C90034dQ(this, 24));
        if (!this.A0G) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = AnonymousClass3MX.A00(AnonymousClass000.A0Y(this), 2131168774, getStatusBarHeightPx().A00);
                setLayoutParams(marginLayoutParams);
            } else {
                throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(this);
        if (A002 != null) {
            AnonymousClass3MX.A1Q(new CallScreenHeaderView$setupOnAttach$2(A002, this, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
        }
    }

    public boolean A09(MotionEvent motionEvent) {
        if (getVisibility() != 0) {
            return false;
        }
        if (A01(motionEvent, AnonymousClass3MX.A0v(this.A0J)) || A01(motionEvent, AnonymousClass3MX.A0v(this.A0K)) || A01(motionEvent, AnonymousClass3MX.A0v(this.A0I)) || A01(motionEvent, AnonymousClass3MX.A0v(this.A0H))) {
            return true;
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C18100vl r1 = this.A0Q;
        if (r1.Bf6()) {
            ((C37451pZ) r1.getValue()).A02();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallScreenHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A0F) {
            this.A0F = true;
            C27691Xc r3 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r3.A10;
            this.A09 = AnonymousClass10E.A8r(r1);
            AnonymousClass1K1 r2 = r3.A0z;
            this.A03 = (CallHeaderStateHolder) r2.A0P.get();
            this.A04 = (AnonymousClass1V9) r1.A1e.get();
            this.A02 = AnonymousClass10E.A3a(r1);
            this.A06 = AnonymousClass3MZ.A0e(r1);
            this.A07 = AnonymousClass3MZ.A0i(r1);
            this.A0D = r1.A8t;
            this.A0B = C000200d.A00(r2.A40);
            this.A05 = C27691Xc.A0A(r3);
            this.A01 = (C125666bS) r2.A5q.get();
            this.A0A = AnonymousClass3MZ.A13(r1);
            this.A00 = AnonymousClass3MZ.A0T(r1.A00);
            this.A08 = AnonymousClass10E.A6Q(r1);
        }
        Integer num = AnonymousClass00R.A0C;
        this.A0S = C43531zx.A02(this, num, 2131436208);
        this.A0R = C43531zx.A02(this, num, 2131435885);
        this.A0J = C84074Ht.A00(this, num, 2131432760);
        this.A0K = C84074Ht.A00(this, num, 2131433445);
        this.A0I = C84074Ht.A00(this, num, 2131428805);
        this.A0H = C84074Ht.A00(this, num, 2131427837);
        this.A0L = C84074Ht.A00(this, num, 2131429439);
        this.A0Q = AnonymousClass1DF.A01(new C101655Dl(this));
        this.A0O = AnonymousClass1DF.A01(C104835Pr.A00);
        this.A0P = AnonymousClass1DF.A01(C104845Ps.A00);
        this.A0N = AnonymousClass1DF.A01(new C101645Dk(this));
        View.inflate(context, 2131624457, this);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass4IY.A01;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            this.A0G = obtainStyledAttributes.getBoolean(0, false);
            getCallHeaderStateHolder().A03 = this.A0G;
            obtainStyledAttributes.recycle();
        }
        this.A0M = getTextEmojiLabelControllerFactory().BGE(context, getTitleView$app_product_calling_calling());
        if (isAttachedToWindow()) {
            A07();
        } else {
            C89704ct.A00(this, 4);
        }
    }

    private final void setTitle(AnonymousClass1E7 r3, AnonymousClass4ZN r4) {
        CharSequence charSequence;
        if (r3 != null) {
            getTitleView$app_product_calling_calling().setVisibility(0);
            this.A0M.A07(r3, 10);
            TextEmojiLabel titleView$app_product_calling_calling = getTitleView$app_product_calling_calling();
            if (r4 != null) {
                charSequence = AnonymousClass4ZN.A00(this, r4);
            } else {
                charSequence = null;
            }
            titleView$app_product_calling_calling.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallScreenHeaderView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
