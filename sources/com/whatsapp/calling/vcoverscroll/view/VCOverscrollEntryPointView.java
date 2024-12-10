package com.whatsapp.calling.vcoverscroll.view;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1F9;
import X.AnonymousClass1Y1;
import X.AnonymousClass1ZG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Mo;
import X.AnonymousClass3PF;
import X.AnonymousClass4EE;
import X.AnonymousClass4G2;
import X.AnonymousClass4PJ;
import X.AnonymousClass4TC;
import X.AnonymousClass4ZN;
import X.AnonymousClass4a5;
import X.AnonymousClass4aR;
import X.AnonymousClass4aX;
import X.AnonymousClass5EO;
import X.AnonymousClass5EP;
import X.AnonymousClass5EQ;
import X.AnonymousClass5ER;
import X.AnonymousClass5ES;
import X.AnonymousClass5ET;
import X.AnonymousClass5EU;
import X.AnonymousClass5EV;
import X.AnonymousClass5EW;
import X.AnonymousClass5EX;
import X.C000200d;
import X.C103915Md;
import X.C103925Me;
import X.C104875Pv;
import X.C107225Yw;
import X.C17880vN;
import X.C17900vP;
import X.C17960vV;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18600wl;
import X.C194859sP;
import X.C26993DOp;
import X.C27011Uj;
import X.C27691Xc;
import X.C28931bI;
import X.C30391dr;
import X.C43421zm;
import X.C43531zx;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C76663nk;
import X.C84074Ht;
import X.C89704ct;
import X.C89994dM;
import X.C93664jL;
import X.C93674jM;
import X.C93684jN;
import X.C98254qp;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;

public final class VCOverscrollEntryPointView extends AnonymousClass3PF {
    public View A00;
    public View A01;
    public ListView A02;
    public VCOverscrollEntryPointStateHolder A03;
    public AnonymousClass1EC A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public C18090vk A0B;
    public C18600wl A0C;
    public C18600wl A0D;
    public long A0E;
    public View A0F;
    public boolean A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J;
    public final C18100vl A0K;
    public final C18100vl A0L;
    public final C18100vl A0M;
    public final C18100vl A0N;
    public final C18100vl A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;
    public final C18100vl A0R;
    public final C18100vl A0S;
    public final C18100vl A0T;
    public final C18100vl A0U;
    public final C18100vl A0V;
    public final C18100vl A0W;
    public final C18100vl A0X;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VCOverscrollEntryPointView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public static /* synthetic */ void getLatencySensitiveDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    /* access modifiers changed from: private */
    public final Drawable getSocialIconDrawable() {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{AnonymousClass4aX.A04(getContext(), getContext(), 2130971979, 2131103155, 2131233443)});
        int dimensionPixelSize = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131169545);
        layerDrawable.setLayerInset(0, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        Drawable mutate = layerDrawable.mutate();
        C18070vi.A0X(mutate);
        return mutate;
    }

    public final void A09(MotionEvent motionEvent, int i, boolean z) {
        boolean z2;
        C18100vl r1 = this.A0L;
        if (AnonymousClass3MX.A0v(r1).A00 != null) {
            VCMiniPlayerView vCMiniPlayerView = (VCMiniPlayerView) AnonymousClass3MX.A0v(r1).A02();
            if (motionEvent.getAction() == 2 && motionEvent.getHistorySize() > 0 && Math.abs(motionEvent.getY() - motionEvent.getHistoricalY(0)) > 10.0f) {
                AnonymousClass4PJ stateHolder = vCMiniPlayerView.getStateHolder();
                if (stateHolder.A0G != CallState.CONNECTED_LONELY) {
                    AnonymousClass3MY.A1Y(stateHolder.A0D, false);
                }
            }
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getTime().get();
            this.A0E = System.currentTimeMillis();
            ListView listView = this.A02;
            if (listView != null) {
                listView.getLocationOnScreen(getListViewLocationOnScreen());
                int i2 = getListViewLocationOnScreen()[1];
                int A022 = AnonymousClass3MW.A02(listView, getListViewLocationOnScreen()[1]);
                if (motionEvent.getAction() != 0 || (motionEvent.getRawY() >= ((float) i2) && motionEvent.getRawY() <= ((float) A022))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.A0G = z2;
            }
        } else if (action == 1) {
            this.A0E = 0;
            this.A0G = false;
        } else if (action == 2) {
            if (!this.A0G) {
                getTime().get();
                if (System.currentTimeMillis() - this.A0E < 150) {
                    return;
                }
            } else {
                return;
            }
        }
        VCOverscrollEntryPointStateHolder stateHolder2 = getStateHolder();
        AnonymousClass1EC r12 = this.A04;
        if (stateHolder2.A06 != i) {
            stateHolder2.A06 = i;
            VCOverscrollEntryPointStateHolder.A00(stateHolder2, 0.0f);
        }
        if (AnonymousClass4G2.A00(stateHolder2.A08) || stateHolder2.A0D || stateHolder2.A0E) {
            stateHolder2.A0C = z;
            if (AnonymousClass4G2.A00(stateHolder2.A08)) {
                VCOverscrollEntryPointStateHolder.A00(stateHolder2, 0.0f);
                return;
            }
            return;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            if (action2 != 1) {
                if (action2 != 2) {
                    if (action2 != 3) {
                        return;
                    }
                }
            }
            VCOverscrollEntryPointStateHolder.A01(stateHolder2, r12, motionEvent.getRawY());
            stateHolder2.A01 = -1.0f;
            return;
        }
        if (z || stateHolder2.A01 != -1.0f) {
            if (stateHolder2.A01 == -1.0f || motionEvent.getAction() == 0) {
                stateHolder2.A0A = false;
                stateHolder2.A09 = false;
                stateHolder2.A0G = false;
                if (stateHolder2.A07 == null) {
                    stateHolder2.A07 = r12;
                }
                stateHolder2.A01 = motionEvent.getRawY();
            }
            VCOverscrollEntryPointStateHolder.A00(stateHolder2, stateHolder2.A01 - motionEvent.getRawY());
            return;
        }
        VCOverscrollEntryPointStateHolder.A01(stateHolder2, r12, -1.0f);
    }

    public final void setDynamicBubbleProvider(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setGlobalUi(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setGroupParticipantsManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setLatencySensitiveDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setPreCallUserJourneyLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setStateHolder(VCOverscrollEntryPointStateHolder vCOverscrollEntryPointStateHolder) {
        C18070vi.A0d(vCOverscrollEntryPointStateHolder, 0);
        this.A03 = vCOverscrollEntryPointStateHolder;
    }

    public final void setSystemServices(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setTime(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public static final void A01(ListView listView, VCOverscrollEntryPointView vCOverscrollEntryPointView) {
        if (vCOverscrollEntryPointView.A00 == null) {
            View A0R2 = C72453Mb.A0R(listView);
            A0R2.setLayoutParams(new AbsListView.LayoutParams(-1, C72453Mb.A0I(vCOverscrollEntryPointView.A0H)));
            A0R2.setFocusable(true);
            A0R2.setImportantForAccessibility(1);
            AnonymousClass4aR.A07(A0R2, AnonymousClass3MW.A0y(vCOverscrollEntryPointView.A0Q), (CharSequence) null);
            A0R2.setOnClickListener(new C89994dM(A0R2, vCOverscrollEntryPointView, 46));
            vCOverscrollEntryPointView.A00 = A0R2;
            ListView listView2 = vCOverscrollEntryPointView.A02;
            if (listView2 != null) {
                listView2.addFooterView(A0R2);
            }
        }
    }

    public static final void A04(VCMiniPlayerView vCMiniPlayerView, VCOverscrollEntryPointView vCOverscrollEntryPointView) {
        vCMiniPlayerView.setGroupJid(vCOverscrollEntryPointView.A04);
        vCMiniPlayerView.addOnLayoutChangeListener(vCOverscrollEntryPointView.getMiniplayerLayoutChangeListener());
        vCMiniPlayerView.A02();
    }

    public static final void A05(VCOverscrollEntryPointView vCOverscrollEntryPointView) {
        ListView listView;
        vCOverscrollEntryPointView.setVisibility(8);
        vCOverscrollEntryPointView.getEducationFooter().setVisibility(8);
        ListView listView2 = vCOverscrollEntryPointView.A02;
        if (listView2 != null) {
            listView2.setTranslationY(0.0f);
        }
        View view = vCOverscrollEntryPointView.A01;
        if (view != null) {
            ListView listView3 = vCOverscrollEntryPointView.A02;
            if (listView3 != null) {
                listView3.removeFooterView(view);
            }
            vCOverscrollEntryPointView.A01 = null;
        }
        if (vCOverscrollEntryPointView.getStateHolder().A0E && (listView = vCOverscrollEntryPointView.A02) != null) {
            A01(listView, vCOverscrollEntryPointView);
        }
    }

    private final void A06(boolean z) {
        AnonymousClass1F9 A002;
        if (z) {
            Vibrator A0H2 = ((AnonymousClass11C) getSystemServices().get()).A0H();
            if (A0H2 != null) {
                AnonymousClass4a5.A00(A0H2, 240);
            }
            AnonymousClass1EC r3 = this.A04;
            if (r3 != null && (A002 = AnonymousClass1ZG.A00(this)) != null) {
                AnonymousClass3MX.A1Q(new VCOverscrollEntryPointView$tryStartVC$1$1(this, r3, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
            }
        }
    }

    private final int getA11yFooterHeight() {
        return C72453Mb.A0I(this.A0H);
    }

    private final ImageView getArrowView() {
        return AnonymousClass3MX.A0J(this.A0I);
    }

    private final int getArrowViewSize() {
        return C72453Mb.A0I(this.A0J);
    }

    private final View.OnLayoutChangeListener getComposerLayoutChangeListener() {
        return (View.OnLayoutChangeListener) this.A0R.getValue();
    }

    private final WaTextView getEducationFooter() {
        return (WaTextView) this.A0S.getValue();
    }

    private final LayerDrawable getHoldAnimCompletedDrawable() {
        return (LayerDrawable) this.A0T.getValue();
    }

    private final LayerDrawable getHoldAnimInProgressDrawable() {
        return (LayerDrawable) this.A0U.getValue();
    }

    private final AnonymousClass3Mo getHoldAnimListener() {
        return (AnonymousClass3Mo) this.A0V.getValue();
    }

    private final C28931bI getHoldAnimView() {
        return AnonymousClass3MX.A0v(this.A0K);
    }

    private final int[] getListViewLocationOnScreen() {
        return (int[]) this.A0W.getValue();
    }

    private final C28931bI getMiniPlayer() {
        return AnonymousClass3MX.A0v(this.A0L);
    }

    private final int getMiniPlayerHeight() {
        return C72453Mb.A0I(this.A0M);
    }

    private final int getMiniPlayerTopOrBottomMargin() {
        return C72453Mb.A0I(this.A0N);
    }

    private final View.OnLayoutChangeListener getMiniplayerLayoutChangeListener() {
        return (View.OnLayoutChangeListener) this.A0X.getValue();
    }

    private final int getOverscrollHeight() {
        return C72453Mb.A0I(this.A0O);
    }

    private final int getOverscrollStartThreshold() {
        return C72453Mb.A0I(this.A0P);
    }

    private final String getVoiceChatA11yString() {
        return AnonymousClass3MW.A0y(this.A0Q);
    }

    private final void setArrowUiState(C93664jL r6) {
        C18100vl r4 = this.A0I;
        ImageView A0J2 = AnonymousClass3MX.A0J(r4);
        int i = 0;
        if (r6 != null) {
            AnonymousClass3MX.A0J(r4).setTranslationY(r6.A01);
            ImageView A0J3 = AnonymousClass3MX.A0J(r4);
            float f = r6.A00;
            A0J3.setScaleX(f);
            A0J3.setScaleY(f);
        } else {
            i = 8;
        }
        A0J2.setVisibility(i);
    }

    /* access modifiers changed from: private */
    public final void setComposerVisibility(AnonymousClass4EE r4) {
        View view = this.A0F;
        if (view != null) {
            int i = 0;
            if ((r4 instanceof C76663nk) && ((C76663nk) r4).A03 != null) {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    private final void setContentUiState(C107225Yw r3) {
        C93664jL r0;
        C93674jM r02;
        Vibrator A0H2;
        if (!(AnonymousClass3MX.A0v(this.A0K).A01() == 0 || !(r3 instanceof C93674jM) || (A0H2 = ((AnonymousClass11C) getSystemServices().get()).A0H()) == null)) {
            AnonymousClass4a5.A00(A0H2, StringTreeSet.OFFSET_BASE_ENCODING);
        }
        C93684jN r1 = null;
        if (r3 instanceof C93664jL) {
            r0 = (C93664jL) r3;
        } else {
            r0 = null;
        }
        setArrowUiState(r0);
        if (r3 instanceof C93674jM) {
            r02 = (C93674jM) r3;
        } else {
            r02 = null;
        }
        setHoldAnimViewUiState(r02);
        if (r3 instanceof C93684jN) {
            r1 = (C93684jN) r3;
        }
        setMiniPlayerUiState(r1);
    }

    private final void setHoldAnimViewUiState(C93674jM r12) {
        LayerDrawable holdAnimInProgressDrawable;
        int i;
        Integer num;
        C18100vl r3 = this.A0K;
        C28931bI A0v = AnonymousClass3MX.A0v(r3);
        if (r12 == null) {
            if (A0v.A00 != null && ((LottieAnimationView) A0v.A02()).A06()) {
                ((LottieAnimationView) A0v.A02()).A09.A0d.removeAllListeners();
                ((LottieAnimationView) A0v.A02()).A02();
            }
            i = 8;
        } else {
            A0v.A02().setTranslationY(r12.A00);
            if (!((LottieAnimationView) A0v.A02()).A06() && !getStateHolder().A0B) {
                if (getBackground() == null) {
                    AnonymousClass3MX.A0v(r3).A02().setBackgroundDrawable(getHoldAnimInProgressDrawable());
                }
                ((LottieAnimationView) A0v.A02()).A09.A0d.addListener(getHoldAnimListener());
                C194859sP r4 = (C194859sP) C18070vi.A0E(getPreCallUserJourneyLogger());
                Integer A0j = C17880vN.A0j();
                AnonymousClass1EC r1 = this.A04;
                if (r1 != null) {
                    num = C72473Md.A0d(r1, getGroupParticipantsManager());
                } else {
                    num = null;
                }
                r4.A01((Boolean) null, (Boolean) null, A0j, num, (Integer) null, 37);
                ((LottieAnimationView) A0v.A02()).A04();
            }
            A06(r12.A01);
            View A022 = AnonymousClass3MX.A0v(r3).A02();
            if (getStateHolder().A0B) {
                holdAnimInProgressDrawable = getHoldAnimCompletedDrawable();
            } else {
                holdAnimInProgressDrawable = getHoldAnimInProgressDrawable();
            }
            A022.setBackgroundDrawable(holdAnimInProgressDrawable);
            i = 0;
        }
        A0v.A04(i);
    }

    private final void setMiniPlayerUiState(C93684jN r11) {
        int i;
        boolean z;
        boolean z2;
        View view;
        C18100vl r4 = this.A0L;
        C28931bI A0v = AnonymousClass3MX.A0v(r4);
        boolean z3 = true;
        if (r11 != null) {
            VCMiniPlayerView vCMiniPlayerView = (VCMiniPlayerView) AnonymousClass3MX.A0v(r4).A02();
            vCMiniPlayerView.setTranslationY(r11.A00);
            boolean z4 = r11.A02;
            vCMiniPlayerView.setIsAtBottom(z4);
            ListView listView = this.A02;
            if (listView != null) {
                switch (r11.A01.intValue()) {
                    case 3:
                    case 4:
                        z2 = true;
                        break;
                    default:
                        z2 = false;
                        break;
                }
                int A0I2 = ((int) getStateHolder().A02) + (C72453Mb.A0I(this.A0N) * 2);
                View view2 = this.A01;
                if (z2) {
                    if (view2 == null) {
                        Log.i("VCOverscrollEntryPointView/updateFooterIfNeeded footer added");
                        listView.setTranscriptMode(2);
                        View A0R2 = C72453Mb.A0R(listView);
                        A0R2.setLayoutParams(new AbsListView.LayoutParams(-1, A0I2));
                        this.A01 = A0R2;
                        listView.addFooterView(A0R2);
                        if (z4) {
                            if (isAttachedToWindow()) {
                                C18090vk r0 = this.A0B;
                                if (r0 != null) {
                                    r0.invoke();
                                }
                            } else {
                                C89704ct.A00(this, 6);
                            }
                        }
                        View view3 = this.A00;
                        if (view3 != null) {
                            listView.removeFooterView(view3);
                            this.A00 = null;
                        }
                    } else if (!(view2.getHeight() == A0I2 || (view = this.A01) == null)) {
                        view.setImportantForAccessibility(2);
                        view.setFocusable(false);
                        view.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = A0I2;
                            if (z4) {
                                if (isAttachedToWindow()) {
                                    C18090vk r02 = this.A0B;
                                    if (r02 != null) {
                                        r02.invoke();
                                    }
                                } else {
                                    C89704ct.A00(this, 6);
                                }
                            }
                            view.setLayoutParams(layoutParams);
                        } else {
                            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.AbsListView.LayoutParams");
                        }
                    }
                } else if (view2 != null) {
                    Log.i("VCOverscrollEntryPointView/updateFooterIfNeeded footer removed");
                    listView.removeFooterView(this.A01);
                }
            }
            if (3 - r11.A01.intValue() != 0) {
                z = false;
            } else {
                z = true;
            }
            A06(z);
            i = 0;
        } else {
            i = 8;
        }
        A0v.A04(i);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VCOverscrollEntryPointView/setMiniPlayerUiState miniPlayer isVisible: ");
        if (AnonymousClass3MX.A0v(r4).A01() != 0) {
            z3 = false;
        }
        C17900vP.A0r(A10, z3);
    }

    public final void A07() {
        Log.i("VCOverscrollEntryPointView/onAttach");
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(this);
        if (A002 != null) {
            AnonymousClass1EC r3 = this.A04;
            if (r3 == null) {
                C17960vV.A0F(false, "VCOverscrollEntryPointView/ groupJid not set");
                return;
            }
            getStateHolder().A03 = (float) C72453Mb.A0I(this.A0N);
            VCOverscrollEntryPointStateHolder stateHolder = getStateHolder();
            float A0I2 = (float) C72453Mb.A0I(this.A0M);
            if (stateHolder.A02 != A0I2) {
                stateHolder.A02 = A0I2;
                if (stateHolder.A08 == AnonymousClass00R.A0Y) {
                    VCOverscrollEntryPointStateHolder.A00(stateHolder, 0.0f);
                }
            }
            getStateHolder().A04 = (float) C72453Mb.A0I(this.A0O);
            getStateHolder().A00 = (float) C72453Mb.A0I(this.A0J);
            getStateHolder().A05 = (float) C72453Mb.A0I(this.A0P);
            AnonymousClass3MX.A1Q(new VCOverscrollEntryPointView$onAttach$1(A002, this, r3, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
        }
    }

    public final void A08() {
        Log.i("VCOverscrollEntryPointView/onDestroy");
        View view = this.A0F;
        if (view != null) {
            view.removeOnLayoutChangeListener(getComposerLayoutChangeListener());
        }
        C18100vl r1 = this.A0L;
        if (AnonymousClass3MX.A0v(r1).A00 != null) {
            AnonymousClass3MX.A0v(r1).A02().removeOnLayoutChangeListener(getMiniplayerLayoutChangeListener());
        }
        setComposer((View) null);
        this.A02 = null;
    }

    public final View getComposer() {
        return this.A0F;
    }

    public final AnonymousClass00H getDynamicBubbleProvider() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("dynamicBubbleProvider");
        throw null;
    }

    public final AnonymousClass00H getGlobalUi() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("globalUi");
        throw null;
    }

    public final AnonymousClass1EC getGroupJid() {
        return this.A04;
    }

    public final AnonymousClass00H getGroupParticipantsManager() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupParticipantsManager");
        throw null;
    }

    public final C18600wl getLatencySensitiveDispatcher() {
        C18600wl r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("latencySensitiveDispatcher");
        throw null;
    }

    public final ListView getListView() {
        return this.A02;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1L();
        throw null;
    }

    public final AnonymousClass00H getPreCallUserJourneyLogger() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("preCallUserJourneyLogger");
        throw null;
    }

    public final C18090vk getScrollToBottom() {
        return this.A0B;
    }

    public final VCOverscrollEntryPointStateHolder getStateHolder() {
        VCOverscrollEntryPointStateHolder vCOverscrollEntryPointStateHolder = this.A03;
        if (vCOverscrollEntryPointStateHolder != null) {
            return vCOverscrollEntryPointStateHolder;
        }
        C18070vi.A11("stateHolder");
        throw null;
    }

    public final AnonymousClass00H getSystemServices() {
        AnonymousClass00H r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final AnonymousClass00H getTime() {
        AnonymousClass00H r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final void setComposer(View view) {
        int i;
        if (!C18070vi.A18(this.A0F, view)) {
            this.A0F = view;
            if (view == null || view.getHeight() != 0) {
                VCOverscrollEntryPointStateHolder stateHolder = getStateHolder();
                View view2 = this.A0F;
                if (view2 != null) {
                    i = view2.getHeight();
                } else {
                    i = 0;
                }
                if (stateHolder.A06 != i) {
                    stateHolder.A06 = i;
                    VCOverscrollEntryPointStateHolder.A00(stateHolder, 0.0f);
                }
            }
            View view3 = this.A0F;
            if (view3 != null) {
                view3.addOnLayoutChangeListener(getComposerLayoutChangeListener());
            }
        }
    }

    public static final void A02(C76663nk r4, VCOverscrollEntryPointView vCOverscrollEntryPointView) {
        int height = vCOverscrollEntryPointView.getHeight();
        int i = r4.A01;
        if (height != i) {
            ViewGroup.LayoutParams layoutParams = vCOverscrollEntryPointView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i;
                vCOverscrollEntryPointView.setLayoutParams(layoutParams);
            } else {
                throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
        }
        vCOverscrollEntryPointView.setVisibility(0);
        vCOverscrollEntryPointView.setContentUiState(r4.A02);
        WaTextView educationFooter = vCOverscrollEntryPointView.getEducationFooter();
        AnonymousClass4TC r2 = r4.A03;
        int i2 = 0;
        if (r2 != null) {
            educationFooter.setText(AnonymousClass4ZN.A00(educationFooter, r2.A01));
            educationFooter.setTranslationY(r2.A00);
        } else {
            i2 = 8;
        }
        educationFooter.setVisibility(i2);
        ListView listView = vCOverscrollEntryPointView.A02;
        if (listView != null) {
            listView.setTranslationY(r4.A00);
        }
    }

    public final boolean A0A() {
        return AnonymousClass000.A1P(getEducationFooter().getVisibility());
    }

    public final void setGroupJid(AnonymousClass1EC r1) {
        this.A04 = r1;
    }

    public final void setListView(ListView listView) {
        this.A02 = listView;
    }

    public final void setScrollToBottom(C18090vk r1) {
        this.A0B = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCOverscrollEntryPointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A05 = C000200d.A00(r2.A0z.A6u);
            AnonymousClass10E r1 = r2.A10;
            this.A06 = C000200d.A00(r1.A4b);
            this.A07 = C000200d.A00(r1.A4t);
            this.A0C = C27011Uj.A00();
            this.A0D = AnonymousClass3MZ.A1C(r1);
            this.A08 = C000200d.A00(r1.A8X);
            this.A03 = C27691Xc.A0E(r2);
            this.A09 = C000200d.A00(r1.AAp);
            this.A0A = C000200d.A00(r1.AAv);
        }
        Integer num = AnonymousClass00R.A0C;
        this.A0S = C43531zx.A02(this, num, 2131430273);
        this.A0L = C84074Ht.A00(this, num, 2131436682);
        this.A0K = C84074Ht.A00(this, num, 2131436680);
        this.A0N = AnonymousClass1DF.A01(new AnonymousClass5ET(context));
        this.A0J = AnonymousClass1DF.A01(new AnonymousClass5EP(context));
        this.A0O = AnonymousClass1DF.A01(new AnonymousClass5EV(context));
        this.A0M = AnonymousClass1DF.A01(new AnonymousClass5ES(context));
        C18100vl A022 = C43531zx.A02(this, num, 2131427856);
        setPivotX(((float) C72453Mb.A0I(this.A0J)) / 2.0f);
        setPivotY(0.0f);
        this.A0I = A022;
        this.A0U = AnonymousClass1DF.A01(new C103925Me(context, this));
        this.A0T = AnonymousClass1DF.A01(new C103915Md(context, this));
        this.A0V = AnonymousClass1DF.A01(new AnonymousClass5ER(this));
        this.A0R = AnonymousClass1DF.A01(new AnonymousClass5EQ(this));
        this.A0X = AnonymousClass1DF.A01(new AnonymousClass5EU(this));
        this.A0W = AnonymousClass1DF.A01(C104875Pv.A00);
        this.A0Q = AnonymousClass1DF.A01(new AnonymousClass5EX(context));
        this.A0H = AnonymousClass1DF.A01(new AnonymousClass5EO(context));
        this.A0P = AnonymousClass1DF.A01(new AnonymousClass5EW(context));
        View.inflate(context, 2131627455, this);
        C98254qp.A00(AnonymousClass3MX.A0v(this.A0L), this, 14);
        WaTextView educationFooter = getEducationFooter();
        educationFooter.setBackground((Drawable) ((C26993DOp) getDynamicBubbleProvider().get()).A04.getValue());
        C72463Mc.A0w(educationFooter.getContext(), educationFooter.getContext(), educationFooter, 2130969234, 2131100231);
        C43421zm.A04(educationFooter);
    }

    public /* synthetic */ VCOverscrollEntryPointView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VCOverscrollEntryPointView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
