package com.whatsapp.home.ui;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass17T;
import X.AnonymousClass17U;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1FU;
import X.AnonymousClass1HF;
import X.AnonymousClass1HO;
import X.AnonymousClass1YL;
import X.AnonymousClass3M7;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass41K;
import X.AnonymousClass49E;
import X.AnonymousClass5Af;
import X.C100955Aj;
import X.C135166rl;
import X.C1599286k;
import X.C17880vN;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C19740yt;
import X.C21355Aik;
import X.C218317o;
import X.C22821Di;
import X.C24001Il;
import X.C27581Wq;
import X.C27691Xc;
import X.C28281Zt;
import X.C36401np;
import X.C43531zx;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C91334fW;
import X.C94134k6;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

public final class HomePlaceholderActivity extends AnonymousClass1FU {
    public int A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public View A02;

    public class HomePlaceholderView extends LinearLayout implements AnonymousClass009, C218317o {
        public int A00;
        public View A01;
        public View A02;
        public ImageView A03;
        public TextView A04;
        public AnonymousClass11S A05;
        public AnonymousClass17T A06;
        public C18030ve A07;
        public WallPaperView A08;
        public C36401np A09;
        public AnonymousClass1DC A0A;
        public AnonymousClass10I A0B;
        public AnonymousClass00H A0C;
        public AnonymousClass031 A0D;
        public Integer A0E;
        public C22821Di A0F;
        public boolean A0G;
        public boolean A0H;
        public View A0I;
        public TextView A0J;
        public final AnonymousClass41K A0K;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomePlaceholderView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C18070vi.A0d(context, 1);
            if (!this.A0H) {
                this.A0H = true;
                C27691Xc.A0x((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
            }
            this.A00 = 200;
            View.inflate(context, 2131627364, this);
            this.A03 = AnonymousClass3MW.A0H(this, 2131431537);
            this.A04 = C17880vN.A0E(this, 2131436475);
            this.A0J = AnonymousClass3MW.A0J(this, 2131436474);
            this.A08 = (WallPaperView) AnonymousClass1HF.A06(this, 2131433873);
            this.A0I = AnonymousClass1HF.A06(this, 2131430073);
            A02(this, AnonymousClass3MX.A0j(getSplitWindowManager()).A00, false);
            this.A0K = new AnonymousClass41K(this, 2);
        }

        public static final void setPlaceholderE2EText$lambda$6(HomePlaceholderView homePlaceholderView) {
            AnonymousClass1FU r1;
            C18070vi.A0d(homePlaceholderView, 0);
            E2EEDescriptionBottomSheet A002 = E2EEDescriptionBottomSheet.A00(12);
            Context context = homePlaceholderView.getContext();
            if ((context instanceof AnonymousClass1FU) && (r1 = (AnonymousClass1FU) context) != null) {
                r1.CMl(A002);
            }
        }

        public final void setAbProps(C18030ve r2) {
            C18070vi.A0d(r2, 0);
            this.A07 = r2;
        }

        public final void setLinkifier(C36401np r2) {
            C18070vi.A0d(r2, 0);
            this.A09 = r2;
        }

        public final void setMeManager(AnonymousClass11S r2) {
            C18070vi.A0d(r2, 0);
            this.A05 = r2;
        }

        public final void setSplitWindowManager(AnonymousClass00H r2) {
            C18070vi.A0d(r2, 0);
            this.A0C = r2;
        }

        public final void setSystemFeatures(AnonymousClass1DC r2) {
            C18070vi.A0d(r2, 0);
            this.A0A = r2;
        }

        public final void setVoipReturnToCallBannerBridge(AnonymousClass17T r2) {
            C18070vi.A0d(r2, 0);
            this.A06 = r2;
        }

        public final void setWaWorkers(AnonymousClass10I r2) {
            C18070vi.A0d(r2, 0);
            this.A0B = r2;
        }

        public static final void A01(HomePlaceholderView homePlaceholderView) {
            Context context;
            int i;
            View view = homePlaceholderView.A02;
            if (view == null || view.getVisibility() != 0) {
                context = homePlaceholderView.getContext();
                i = 2131102739;
            } else {
                context = homePlaceholderView.getContext();
                i = AnonymousClass1YL.A00(homePlaceholderView.getContext(), 2130968925, 2131099980);
            }
            int A002 = C19740yt.A00(context, i);
            View view2 = homePlaceholderView.A01;
            if (view2 != null) {
                view2.setBackgroundColor(A002);
            }
        }

        public static final void A02(HomePlaceholderView homePlaceholderView, int i, boolean z) {
            int i2;
            if (i != 200) {
                if (i == 300) {
                    ImageView imageView = homePlaceholderView.A03;
                    if (imageView != null) {
                        imageView.setImageResource(2131233451);
                    }
                    TextView textView = homePlaceholderView.A04;
                    if (textView != null) {
                        textView.setText(2131896399);
                    }
                    i2 = 2131896398;
                } else if (i == 400) {
                    ImageView imageView2 = homePlaceholderView.A03;
                    if (imageView2 != null) {
                        imageView2.setImageResource(2131233225);
                    }
                    TextView textView2 = homePlaceholderView.A04;
                    if (textView2 != null) {
                        textView2.setText(2131887863);
                    }
                    i2 = 2131887862;
                } else if (i == 600) {
                    ImageView imageView3 = homePlaceholderView.A03;
                    if (imageView3 != null) {
                        imageView3.setImageResource(2131233249);
                    }
                    TextView textView3 = homePlaceholderView.A04;
                    if (textView3 != null) {
                        textView3.setText(2131888484);
                    }
                    i2 = 2131889005;
                }
                homePlaceholderView.setPlaceholderE2EText(i2);
            } else {
                ImageView imageView4 = homePlaceholderView.A03;
                if (imageView4 != null) {
                    imageView4.setImageResource(2131233235);
                }
                TextView textView4 = homePlaceholderView.A04;
                if (textView4 != null) {
                    textView4.setText(2131889006);
                }
                homePlaceholderView.setPlaceholderE2EText(2131889005);
                C24001Il A0j = AnonymousClass3MX.A0j(homePlaceholderView.getSplitWindowManager());
                if (A0j.A0A()) {
                    C17890vO.A0q(A0j, 22);
                }
            }
            ImageView imageView5 = homePlaceholderView.A03;
            int i3 = 8;
            if (imageView5 != null) {
                imageView5.setVisibility(C72453Mb.A01(z ? 1 : 0));
            }
            TextView textView5 = homePlaceholderView.A04;
            if (textView5 != null) {
                if (!z) {
                    i3 = 0;
                }
                textView5.setVisibility(i3);
            }
        }

        private final void setPlaceholderE2EText(int i) {
            TextView textView = this.A0J;
            if (textView != null) {
                textView.setText(getLinkifier().A06(textView.getContext(), new C21355Aik(this, 46), AnonymousClass3Ma.A11(this, i), "%s", AnonymousClass1YL.A00(textView.getContext(), 2130968627, 2131102239)));
                AnonymousClass3Ma.A1I(textView, getAbProps());
            }
        }

        public final Object generatedComponent() {
            AnonymousClass031 r0 = this.A0D;
            if (r0 == null) {
                r0 = AnonymousClass3MW.A0u(this);
                this.A0D = r0;
            }
            return r0.generatedComponent();
        }

        public final C18030ve getAbProps() {
            C18030ve r0 = this.A07;
            if (r0 != null) {
                return r0;
            }
            AnonymousClass3MW.A1A();
            throw null;
        }

        public final C22821Di getActionBarSizeListener() {
            return this.A0F;
        }

        public final boolean getContentDrawnBehindStatusBar() {
            return this.A0G;
        }

        public final C36401np getLinkifier() {
            C36401np r0 = this.A09;
            if (r0 != null) {
                return r0;
            }
            AnonymousClass3MW.A1E();
            throw null;
        }

        public final AnonymousClass11S getMeManager() {
            AnonymousClass11S r0 = this.A05;
            if (r0 != null) {
                return r0;
            }
            AnonymousClass3MW.A1D();
            throw null;
        }

        public final AnonymousClass00H getSplitWindowManager() {
            AnonymousClass00H r0 = this.A0C;
            if (r0 != null) {
                return r0;
            }
            C18070vi.A11("splitWindowManager");
            throw null;
        }

        public final AnonymousClass1DC getSystemFeatures() {
            AnonymousClass1DC r0 = this.A0A;
            if (r0 != null) {
                return r0;
            }
            C18070vi.A11("systemFeatures");
            throw null;
        }

        public final AnonymousClass17T getVoipReturnToCallBannerBridge() {
            AnonymousClass17T r0 = this.A06;
            if (r0 != null) {
                return r0;
            }
            C18070vi.A11("voipReturnToCallBannerBridge");
            throw null;
        }

        public final AnonymousClass10I getWaWorkers() {
            AnonymousClass10I r0 = this.A0B;
            if (r0 != null) {
                return r0;
            }
            AnonymousClass3MW.A1G();
            throw null;
        }

        public static final void A00(View view, ViewGroup viewGroup, AnonymousClass1HO r6, HomePlaceholderView homePlaceholderView) {
            int i;
            WindowInsets rootWindowInsets;
            C18070vi.A0k(view, r6);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                i = view.getRootWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()).top;
            } else if (i2 < 23 || (rootWindowInsets = view.getRootWindowInsets()) == null) {
                i = 0;
            } else {
                i = rootWindowInsets.getStableInsetTop();
            }
            C22821Di r1 = homePlaceholderView.A0F;
            if (r1 != null) {
                r1.invoke(Integer.valueOf(i));
            }
            Integer num = homePlaceholderView.A0E;
            if (num == null || i != num.intValue()) {
                homePlaceholderView.A0E = Integer.valueOf(i);
                if (homePlaceholderView.A0G) {
                    View view2 = homePlaceholderView.A01;
                    if (!(view2 == null || viewGroup == null)) {
                        viewGroup.removeView(view2);
                    }
                    View A0R = C72453Mb.A0R(homePlaceholderView);
                    homePlaceholderView.A01 = A0R;
                    if (viewGroup != null) {
                        viewGroup.addView(A0R, 0, new ViewGroup.LayoutParams(-1, C72463Mc.A0B(homePlaceholderView.A0E)));
                    }
                    View view3 = homePlaceholderView.A01;
                    if (view3 != null) {
                        C43531zx.A06(new AnonymousClass5Af(homePlaceholderView, 19), view3);
                    }
                }
            }
        }

        private final AnonymousClass01E getActivity() {
            Context context = getContext();
            if (context instanceof AnonymousClass01E) {
                return (AnonymousClass01E) context;
            }
            return null;
        }

        @OnLifecycleEvent(C27581Wq.ON_START)
        public final void onActivityStarted() {
            C17890vO.A0u(new AnonymousClass49E(AnonymousClass3MY.A04(this), AnonymousClass3MX.A05(this), getAbProps(), this.A08), getWaWorkers());
            if (AnonymousClass3MX.A0j(getSplitWindowManager()).A0A()) {
                C17880vN.A0V(getSplitWindowManager()).registerObserver(this.A0K);
            }
        }

        @OnLifecycleEvent(C27581Wq.ON_STOP)
        public final void onActivityStopped() {
            if (AnonymousClass3MX.A0j(getSplitWindowManager()).A0A()) {
                C17880vN.A0V(getSplitWindowManager()).unregisterObserver(this.A0K);
            }
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (AnonymousClass3MX.A0j(getSplitWindowManager()).A0A()) {
                C17880vN.A0V(getSplitWindowManager()).registerObserver(this.A0K);
            }
            C17890vO.A0u(new AnonymousClass49E(AnonymousClass3MY.A04(this), AnonymousClass3MX.A05(this), getAbProps(), this.A08), getWaWorkers());
            getSystemFeatures();
            ViewGroup A0D2 = AnonymousClass3MW.A0D(this, 2131428706);
            getSystemFeatures();
            AnonymousClass01E activity = getActivity();
            if (activity != null && this.A02 == null) {
                this.A02 = getVoipReturnToCallBannerBridge().BHS(activity, getMeManager(), (C135166rl) null, getAbProps(), (AnonymousClass1BI) null);
                AnonymousClass3M7 r0 = ((AnonymousClass17U) getVoipReturnToCallBannerBridge()).A00;
                if (r0 != null) {
                    r0.setShouldShowGenericContactOrGroupName(true);
                }
                if (A0D2 != null) {
                    A0D2.addView(this.A02);
                    getVoipReturnToCallBannerBridge().setVisibilityChangeListener(new C94134k6(activity, this));
                }
            }
            AnonymousClass1HF.A0g(this, new C91334fW(this, A0D2, 0));
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            WallPaperView wallPaperView = this.A08;
            if (wallPaperView != null) {
                C72473Md.A1F(wallPaperView);
            }
            ViewGroup A0D2 = AnonymousClass3MW.A0D(this, 2131428706);
            View view = this.A01;
            if (view != null) {
                if (A0D2 != null) {
                    A0D2.removeView(view);
                }
                this.A01 = null;
            }
            View view2 = this.A02;
            if (view2 != null) {
                if (A0D2 != null) {
                    A0D2.removeView(view2);
                }
                getVoipReturnToCallBannerBridge().setVisibilityChangeListener((C1599286k) null);
                this.A02 = null;
            }
            if (AnonymousClass3MX.A0j(getSplitWindowManager()).A0A()) {
                C17880vN.A0V(getSplitWindowManager()).unregisterObserver(this.A0K);
            }
        }

        public final void setActionBarSizeListener(C22821Di r1) {
            this.A0F = r1;
        }

        public final void setContentDrawnBehindStatusBar(boolean z) {
            this.A0G = z;
        }

        public HomePlaceholderView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet);
            if (!this.A0H) {
                this.A0H = true;
                C27691Xc.A0x((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624056);
        C28281Zt.A06(this, 2131102739);
        C28281Zt.A04(this);
        HomePlaceholderView homePlaceholderView = (HomePlaceholderView) findViewById(2131431476);
        if (homePlaceholderView != null) {
            getLifecycle().A05(homePlaceholderView);
            homePlaceholderView.A0G = true;
            homePlaceholderView.A0F = new C100955Aj(this, 4);
        }
        if (Build.VERSION.SDK_INT == 33) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.format = -2;
            layoutParams.flags = 131096;
            this.A02 = new View(this);
            WindowManager windowManager = getWindowManager();
            if (windowManager != null) {
                windowManager.addView(this.A02, layoutParams);
            }
        }
    }

    public void onDestroy() {
        WindowManager windowManager;
        super.onDestroy();
        HomePlaceholderView homePlaceholderView = (HomePlaceholderView) findViewById(2131431476);
        if (homePlaceholderView != null) {
            homePlaceholderView.A0F = null;
            ViewTreeObserver viewTreeObserver = homePlaceholderView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.A01);
            }
        }
        View view = this.A02;
        if (view != null && (windowManager = getWindowManager()) != null) {
            windowManager.removeView(view);
        }
    }
}
