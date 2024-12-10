package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.AutoScrollView;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* renamed from: X.BwF  reason: case insensitive filesystem */
public class C24149BwF extends BID implements AnonymousClass009 {
    public AccelerateInterpolator A00;
    public Animation A01;
    public Animation A02;
    public Animation A03;
    public Animation A04;
    public Animation A05;
    public Animation A06;
    public Animation A07;
    public Animation A08;
    public Animation A09;
    public Animation A0A;
    public DecelerateInterpolator A0B;
    public C18030ve A0C;
    public C24888COg A0D;
    public C28542E6q A0E;
    public C28542E6q A0F;
    public C28542E6q A0G;
    public AnonymousClass70X A0H;
    public AnonymousClass031 A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public E2x A0T;
    public final int A0U;
    public final Handler A0V;
    public final View A0W;
    public final View A0X;
    public final ViewGroup A0Y;
    public final ViewGroup A0Z;
    public final ViewGroup A0a;
    public final ViewGroup A0b;
    public final ViewGroup A0c;
    public final ViewGroup A0d;
    public final Animation.AnimationListener A0e;
    public final ImageButton A0f;
    public final ImageButton A0g;
    public final ImageButton A0h;
    public final ImageButton A0i;
    public final LinearLayout A0j;
    public final LinearLayout A0k;
    public final ProgressBar A0l;
    public final SeekBar A0m;
    public final TextView A0n;
    public final TextView A0o;
    public final AutoScrollView A0p;
    public final ReadMoreTextView A0q;
    public final C25022CTy A0r;
    public final WDSButton A0s;
    public final Runnable A0t;
    public final StringBuilder A0u;
    public final Formatter A0v;
    public final int A0w;
    public final HorizontalScrollView A0x;
    public final ImageButton A0y;
    public final ImageButton A0z;
    public final ImageButton A10;
    public final ImageButton A11;
    public final ImageButton A12;
    public final ImageView A13;
    public final TextView A14;
    public final WDSButton A15;
    public final WDSButton A16;

    public static void A02(C24149BwF bwF) {
        if (bwF.A0j.getVisibility() != 8) {
            ImageView imageView = bwF.A13;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Resources resources = bwF.getResources();
            int i = 2131167103;
            if (bwF.A0M) {
                i = 2131167102;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            imageView.requestLayout();
        }
    }

    public static void A03(C24149BwF bwF) {
        boolean z;
        if (!bwF.A0M || !(bwF.A0j.getVisibility() == 0 || bwF.A0q.getVisibility() == 0)) {
            z = false;
        } else {
            z = true;
        }
        Resources resources = bwF.getResources();
        int i = 2131168774;
        if (z) {
            i = 2131167101;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        LinearLayout linearLayout = bwF.A0j;
        C72463Mc.A14(linearLayout, linearLayout.getPaddingLeft(), dimensionPixelSize);
    }

    public static void A04(C24149BwF bwF) {
        int i;
        if (bwF.A0b.getVisibility() != 8) {
            AutoScrollView autoScrollView = bwF.A0p;
            if (autoScrollView.A02) {
                HorizontalScrollView horizontalScrollView = bwF.A0x;
                ViewGroup.LayoutParams layoutParams = horizontalScrollView.getLayoutParams();
                if (bwF.A0M) {
                    i = autoScrollView.A05;
                } else {
                    i = -1;
                }
                layoutParams.width = i;
                horizontalScrollView.requestLayout();
            }
            autoScrollView.A00.post(new C146437Pc(autoScrollView, 27));
        }
    }

    public static void A05(C24149BwF bwF) {
        AnonymousClass70X r0 = bwF.A0H;
        if (r0 != null) {
            boolean A0a2 = r0.A0a();
            ImageButton imageButton = bwF.A0h;
            int i = 2131232217;
            if (A0a2) {
                i = 2131232160;
            }
            imageButton.setImageResource(i);
            Context context = bwF.getContext();
            int i2 = 2131899314;
            if (A0a2) {
                i2 = 2131893587;
            }
            String string = context.getString(i2);
            imageButton.setContentDescription(string);
            ImageButton imageButton2 = bwF.A0i;
            int i3 = 2131232397;
            if (A0a2) {
                i3 = 2131232395;
            }
            imageButton2.setImageResource(i3);
            imageButton2.setContentDescription(string);
        }
    }

    public static boolean A07(C24149BwF bwF) {
        int i = bwF.A0U;
        if (i == 1 || i == 7 || i == 4) {
            return false;
        }
        return true;
    }

    private int getBottomContainerHorizontalPadding() {
        if (!this.A0M) {
            return 2131168775;
        }
        if (A06()) {
            return 2131167113;
        }
        return 2131168777;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r2 = this;
            boolean r0 = r2.A0L
            if (r0 != 0) goto L_0x0050
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x0050
            X.70X r0 = r2.A0H
            if (r0 == 0) goto L_0x0050
            int r0 = r2.A0w
            r1 = 1
            if (r0 != r1) goto L_0x0015
            java.lang.Boolean r0 = X.C17970vW.A03
        L_0x0015:
            r2.A0L = r1
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0051
            android.widget.LinearLayout r0 = r2.A0k
            android.view.animation.Animation r1 = r2.A02
            r0.startAnimation(r1)
            android.view.ViewGroup r0 = r2.A0d
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x002f
            android.widget.ImageButton r0 = r2.A0i
            r0.startAnimation(r1)
        L_0x002f:
            android.view.animation.Animation r1 = r2.getFullscreenBottomControlsSlideOutAnimation()
            if (r1 == 0) goto L_0x003a
            android.view.ViewGroup r0 = r2.A0Y
            r0.startAnimation(r1)
        L_0x003a:
            boolean r0 = r2.A06()
            if (r0 != 0) goto L_0x0047
            android.view.ViewGroup r1 = r2.A0a
            android.view.animation.Animation r0 = r2.A08
        L_0x0044:
            r1.startAnimation(r0)
        L_0x0047:
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0050
            r0 = 4358(0x1106, float:6.107E-42)
            r2.setSystemUiVisibility(r0)
        L_0x0050:
            return
        L_0x0051:
            android.view.ViewGroup r1 = r2.A0Y
            android.view.animation.Animation r0 = r2.A0A
            r1.startAnimation(r0)
            android.widget.ProgressBar r1 = r2.A0l
            android.view.animation.Animation r0 = r2.A02
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24149BwF.A0D():void");
    }

    public void A0F() {
        Runnable runnable = this.A0t;
        removeCallbacks(runnable);
        AnonymousClass70X r0 = this.A0H;
        if (r0 != null && r0.A0a()) {
            if (!this.A0N || this.A0M) {
                postDelayed(runnable, 3000);
            }
        }
    }

    public void A0G() {
        AnonymousClass70X r0 = this.A0H;
        if (r0 != null) {
            if (!r0.A0a()) {
                this.A0H.A0E();
                C25022CTy cTy = this.A0r;
                if (cTy != null) {
                    cTy.A09.A02();
                }
            }
            A0F();
            A05(this);
            A0A(100);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0I;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0I = r0;
        }
        return r0.generatedComponent();
    }

    public void setCloseButtonListener(C28542E6q e6q) {
        this.A0E = e6q;
        AnonymousClass78L.A00(this.A0f, this, 25);
        AnonymousClass78L.A00(this.A0z, this, 26);
        AnonymousClass78L.A00(this.A11, this, 27);
    }

    public void setFullscreenButtonClickListener(C28542E6q e6q) {
        this.A0F = e6q;
        AnonymousClass78L.A00(this.A0y, this, 28);
        AnonymousClass78L.A00(this.A10, this, 29);
        AnonymousClass78L.A00(this.A12, this, 30);
    }

    public void setMusicAttributionClickListener(C28542E6q e6q) {
        AnonymousClass78L.A00(this.A0b, e6q, 21);
        AnonymousClass78L.A00(this.A0p, e6q, 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0042, code lost:
        if (r5.A0M == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPlayer(X.AnonymousClass70X r6) {
        /*
            r5 = this;
            r5.A0H = r6
            X.CTy r0 = r5.A0r
            if (r0 == 0) goto L_0x000e
            r1 = 0
            X.DR3 r0 = new X.DR3
            r0.<init>(r5, r1)
            r6.A09 = r0
        L_0x000e:
            android.widget.ImageButton r3 = r5.A0h
            android.content.Context r1 = r5.getContext()
            r0 = 2131893587(0x7f121d53, float:1.9421955E38)
            r4 = 2131893587(0x7f121d53, float:1.9421955E38)
            X.AnonymousClass3MY.A0w(r1, r3, r0)
            r0 = 18
            X.78M r2 = new X.78M
            r2.<init>(r5, r6, r0)
            r3.setOnClickListener(r2)
            android.widget.ImageButton r1 = r5.A0i
            android.content.Context r0 = r5.getContext()
            X.AnonymousClass3MY.A0w(r0, r1, r4)
            r1.setOnClickListener(r2)
            r2 = 1
            r1.setClickable(r2)
            com.whatsapp.wds.components.button.WDSButton r4 = r5.A0s
            boolean r0 = A07(r5)
            if (r0 == 0) goto L_0x0044
            boolean r1 = r5.A0M
            r0 = 0
            if (r1 != 0) goto L_0x0046
        L_0x0044:
            r0 = 8
        L_0x0046:
            r4.setVisibility(r0)
            android.widget.ProgressBar r1 = r5.A0l
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.setMax(r0)
            r1.setSecondaryProgress(r0)
            android.widget.SeekBar r1 = r5.A0m
            r1.setMax(r0)
            X.D5U r0 = new X.D5U
            r0.<init>(r5, r6)
            r1.setOnSeekBarChangeListener(r0)
            X.DR5 r0 = new X.DR5
            r0.<init>(r5, r6)
            r6.A0T(r0)
            X.DR2 r0 = new X.DR2
            r0.<init>(r5)
            r6.A08 = r0
            X.DR1 r0 = new X.DR1
            r0.<init>(r5, r6)
            r6.A0S(r0)
            r5.A0R = r2
            android.os.Handler r1 = r5.A0V
            r0 = 0
            r1.sendEmptyMessage(r0)
            r3.setClickable(r2)
            android.widget.ImageButton r0 = r5.A0y
            r0.setClickable(r2)
            android.widget.ImageButton r0 = r5.A10
            r0.setClickable(r2)
            android.widget.ImageButton r0 = r5.A12
            r0.setClickable(r2)
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x0098
            A01(r5)
        L_0x0098:
            A05(r5)
            A02(r5)
            r5.A0F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24149BwF.setPlayer(X.70X):void");
    }

    public void setPlayerElevation(int i) {
        View A092;
        AnonymousClass70X r0 = this.A0H;
        if (r0 != null && (A092 = r0.A09()) != null && A092.getParent() != null) {
            AnonymousClass1HF.A0W((View) this.A0H.A09().getParent().getParent(), (float) i);
        }
    }

    public void setVideoAttribution(String str) {
        String str2 = str;
        if (str != null) {
            this.A0b.setVisibility(0);
            AutoScrollView autoScrollView = this.A0p;
            autoScrollView.setText(str2);
            DWX dwx = new DWX(this, 22);
            if (!autoScrollView.A01) {
                autoScrollView.A01 = true;
                WaTextView waTextView = autoScrollView.A0A;
                boolean z = false;
                waTextView.setVisibility(0);
                WaTextView waTextView2 = autoScrollView.A09;
                if (!waTextView2.isLaidOut() || waTextView2.isLayoutRequested()) {
                    waTextView2.addOnLayoutChangeListener(new C26583D4x(dwx, autoScrollView, 1));
                    return;
                }
                if (autoScrollView.getRootView().getLayoutDirection() == 0) {
                    z = true;
                }
                autoScrollView.A03 = z;
                HorizontalScrollView horizontalScrollView = autoScrollView.A00;
                horizontalScrollView.setLayoutDirection(z ^ true ? 1 : 0);
                int width = waTextView2.getWidth() + autoScrollView.A06;
                int i = 1;
                if (autoScrollView.A03) {
                    i = -1;
                }
                int i2 = -i;
                int i3 = autoScrollView.A04;
                int i4 = autoScrollView.A07;
                int i5 = i3 + width + i4;
                int i6 = autoScrollView.A05;
                if (i5 < i6) {
                    ViewGroup.LayoutParams layoutParams = waTextView2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = i5;
                        waTextView2.setLayoutParams(layoutParams);
                        ViewGroup.LayoutParams layoutParams2 = horizontalScrollView.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = -2;
                            horizontalScrollView.setLayoutParams(layoutParams2);
                            waTextView2.setTranslationX((float) (i4 * i2));
                            waTextView.setVisibility(8);
                        } else {
                            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    } else {
                        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else {
                    autoScrollView.A02 = true;
                    ViewGroup.LayoutParams layoutParams3 = horizontalScrollView.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.width = i6;
                        horizontalScrollView.setLayoutParams(layoutParams3);
                        float f = (float) ((i3 + i4) * i2);
                        long j = autoScrollView.A08 * ((long) (width / i6));
                        waTextView2.setTranslationX(f);
                        waTextView.setTranslationX(waTextView2.getTranslationX() + ((float) (width * i2)));
                        AutoScrollView.A00(autoScrollView, f, width, i, i2, j);
                        if (i3 > 0) {
                            horizontalScrollView.setHorizontalFadingEdgeEnabled(true);
                            horizontalScrollView.setFadingEdgeLength(i3);
                            horizontalScrollView.requestLayout();
                        }
                    } else {
                        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                horizontalScrollView.post(new C146437Pc(autoScrollView, 27));
                dwx.invoke();
                return;
            }
            return;
        }
        this.A0b.setVisibility(8);
    }

    public void setWatchMoreVideosText(String str) {
        if (str != null) {
            this.A16.setText(str);
        }
    }

    public C24149BwF(Context context, C25022CTy cTy, int i, boolean z) {
        super(context);
        if (!this.A0O) {
            this.A0O = true;
            this.A0C = AnonymousClass10E.A8q(AnonymousClass3MW.A0O(generatedComponent()));
        }
        int i2 = 0;
        this.A0N = false;
        this.A0S = false;
        this.A0M = false;
        this.A0R = false;
        this.A0K = false;
        this.A0J = false;
        this.A0L = false;
        this.A0P = false;
        this.A0Q = false;
        this.A0t = new AnonymousClass7RJ(this, 15);
        this.A0e = new C23796Bpf(this);
        this.A0V = new Handler(Looper.myLooper(), new C26370CyW(this, 6));
        LayoutInflater.from(context).inflate(2131625702, this);
        this.A0w = C18020vd.A00(C18040vf.A02, this.A0C, 820);
        this.A0U = i;
        StringBuilder A102 = AnonymousClass000.A10();
        this.A0u = A102;
        this.A0v = new Formatter(A102, Locale.getDefault());
        this.A0f = (ImageButton) AnonymousClass1HF.A06(this, 2131429132);
        this.A0z = (ImageButton) AnonymousClass1HF.A06(this, 2131431032);
        this.A10 = (ImageButton) AnonymousClass1HF.A06(this, 2131431035);
        this.A11 = (ImageButton) AnonymousClass1HF.A06(this, 2131431931);
        this.A12 = (ImageButton) AnonymousClass1HF.A06(this, 2131431932);
        this.A0y = (ImageButton) AnonymousClass1HF.A06(this, z ? 2131429031 : 2131435644);
        this.A0h = (ImageButton) AnonymousClass1HF.A06(this, 2131433890);
        this.A0i = (ImageButton) AnonymousClass1HF.A06(this, 2131433891);
        this.A0l = (ProgressBar) AnonymousClass1HF.A06(this, 2131432763);
        this.A0m = (SeekBar) AnonymousClass1HF.A06(this, 2131432456);
        this.A0o = AnonymousClass3MW.A0J(this, 2131436190);
        this.A0n = AnonymousClass3MW.A0J(this, 2131436191);
        AutoScrollView autoScrollView = (AutoScrollView) AnonymousClass1HF.A06(this, 2131432856);
        this.A0p = autoScrollView;
        this.A0x = autoScrollView.A00;
        ImageButton imageButton = (ImageButton) AnonymousClass1HF.A06(this, 2131432211);
        this.A0g = imageButton;
        WDSButton wDSButton = (WDSButton) AnonymousClass1HF.A06(this, 2131432210);
        this.A0s = wDSButton;
        this.A0X = AnonymousClass1HF.A06(this, 2131432153);
        this.A0W = AnonymousClass1HF.A06(this, 2131428018);
        this.A0k = (LinearLayout) AnonymousClass1HF.A06(this, 2131432391);
        this.A0b = AnonymousClass3MW.A0C(this, 2131436738);
        this.A0c = AnonymousClass3MW.A0C(this, 2131436755);
        this.A0Z = AnonymousClass3MW.A0C(this, 2131433860);
        this.A0a = AnonymousClass3MW.A0C(this, 2131433988);
        this.A0Y = AnonymousClass3MW.A0C(this, 2131428327);
        this.A0d = AnonymousClass3MW.A0C(this, 2131437016);
        this.A16 = (WDSButton) AnonymousClass1HF.A06(this, 2131437015);
        this.A15 = (WDSButton) AnonymousClass1HF.A06(this, 2131433883);
        imageButton.setVisibility(8);
        wDSButton.setVisibility(!A07(this) ? 8 : i2);
        this.A0j = (LinearLayout) AnonymousClass1HF.A06(this, 2131427917);
        this.A14 = AnonymousClass3MW.A0J(this, 2131427916);
        this.A0q = (ReadMoreTextView) AnonymousClass1HF.A06(this, 2131436744);
        this.A13 = AnonymousClass3MW.A0G(this, 2131427915);
        ImageButton imageButton2 = this.A0g;
        imageButton2.setPaddingRelative(imageButton2.getPaddingStart(), imageButton2.getPaddingTop(), 0, imageButton2.getPaddingBottom());
        ImageButton imageButton3 = this.A0f;
        imageButton3.setPaddingRelative(imageButton3.getPaddingStart(), imageButton3.getPaddingTop(), 0, imageButton3.getPaddingBottom());
        ImageButton imageButton4 = this.A0h;
        imageButton4.setPaddingRelative(0, imageButton4.getPaddingTop(), imageButton4.getPaddingEnd(), imageButton4.getPaddingBottom());
        this.A00 = new AccelerateInterpolator();
        this.A0B = new DecelerateInterpolator();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 2130772024);
        loadAnimation.setDuration(200);
        loadAnimation.setInterpolator(this.A00);
        this.A08 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), 2130772025);
        loadAnimation2.setDuration(200);
        loadAnimation2.setInterpolator(this.A0B);
        this.A07 = loadAnimation2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(getContext(), 2130772049);
        loadAnimation3.setDuration(200);
        loadAnimation3.setInterpolator(this.A00);
        this.A0A = loadAnimation3;
        Animation loadAnimation4 = AnimationUtils.loadAnimation(getContext(), 2130772049);
        loadAnimation4.setDuration(200);
        loadAnimation4.setInterpolator(this.A0B);
        this.A09 = loadAnimation4;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200);
        alphaAnimation.setInterpolator(this.A00);
        this.A02 = alphaAnimation;
        alphaAnimation.setAnimationListener(this.A0e);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(200);
        alphaAnimation2.setInterpolator(this.A0B);
        this.A01 = alphaAnimation2;
        this.A0r = cTy;
        onConfigurationChanged(getResources().getConfiguration());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r5.A06() != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C24149BwF r5) {
        /*
            android.content.res.Resources r1 = r5.getResources()
            int r0 = r5.getBottomContainerHorizontalPadding()
            int r3 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r2 = r5.getResources()
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x001d
            boolean r1 = r5.A06()
            r0 = 2131167136(0x7f0707a0, float:1.7948537E38)
            if (r1 == 0) goto L_0x0020
        L_0x001d:
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
        L_0x0020:
            int r2 = r2.getDimensionPixelSize(r0)
            android.view.ViewGroup r1 = r5.A0Y
            int r0 = r1.getPaddingTop()
            r1.setPadding(r3, r0, r3, r2)
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x004e
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168777(0x7f070e09, float:1.7951865E38)
            int r4 = r1.getDimensionPixelSize(r0)
        L_0x003c:
            android.view.ViewGroup r3 = r5.A0c
            int r2 = r5.getPaddingLeft()
            int r1 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            r3.setPadding(r2, r1, r0, r4)
            return
        L_0x004e:
            r4 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24149BwF.A00(X.BwF):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r6.A0N != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r6.A0N != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C24149BwF r6) {
        /*
            boolean r5 = r6.A06()
            android.widget.ImageButton r2 = r6.A10
            r4 = 0
            r3 = 8
            if (r5 != 0) goto L_0x0010
            boolean r1 = r6.A0N
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0010:
            r0 = 8
        L_0x0012:
            r2.setVisibility(r0)
            android.widget.ImageButton r1 = r6.A0z
            r0 = 0
            if (r5 == 0) goto L_0x001c
            r0 = 8
        L_0x001c:
            r1.setVisibility(r0)
            android.widget.ImageButton r2 = r6.A12
            if (r5 == 0) goto L_0x0028
            boolean r1 = r6.A0N
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0028:
            r0 = 8
        L_0x002a:
            r2.setVisibility(r0)
            android.widget.ImageButton r1 = r6.A11
            int r0 = X.C72453Mb.A07(r5)
            r1.setVisibility(r0)
            boolean r1 = r6.A0M
            android.view.ViewGroup r0 = r6.A0a
            if (r1 == 0) goto L_0x0044
            if (r5 == 0) goto L_0x0040
            r4 = 8
        L_0x0040:
            r0.setVisibility(r4)
            return
        L_0x0044:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24149BwF.A01(X.BwF):void");
    }

    private boolean A06() {
        return AnonymousClass000.A1T(getResources().getConfiguration().orientation, 2);
    }

    private Animation getFullscreenBottomControlsSlideInAnimation() {
        if (A06()) {
            return this.A04;
        }
        return this.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r5.A06 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r2 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, X.C108945cZ.A04(r5.A0k));
        r2.setDuration(200);
        r2.setInterpolator(r5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r4 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r5.A06 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r5.A04 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r2 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, X.C108945cZ.A04(r5.A0k), 0.0f);
        r2.setDuration(200);
        r2.setInterpolator(r5.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r4 == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r5.A04 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r5.A03 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r5.A05 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        return r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r5.A05 != null) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r5.A03 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (A06() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r5.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.animation.Animation getFullscreenBottomControlsSlideOutAnimation() {
        /*
            r5 = this;
            boolean r4 = r5.A06()
            r3 = 0
            if (r4 != 0) goto L_0x0018
            android.view.animation.Animation r0 = r5.A05
            if (r0 == 0) goto L_0x001c
        L_0x000b:
            android.view.animation.Animation r0 = r5.A03
            if (r0 == 0) goto L_0x0039
        L_0x000f:
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x0059
            android.view.animation.Animation r0 = r5.A06
            return r0
        L_0x0018:
            android.view.animation.Animation r0 = r5.A06
            if (r0 != 0) goto L_0x0035
        L_0x001c:
            android.widget.LinearLayout r0 = r5.A0k
            float r0 = X.C108945cZ.A04(r0)
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r3, r3, r3, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.view.animation.AccelerateInterpolator r0 = r5.A00
            r2.setInterpolator(r0)
            if (r4 == 0) goto L_0x0056
            r5.A06 = r2
        L_0x0035:
            android.view.animation.Animation r0 = r5.A04
            if (r0 != 0) goto L_0x000f
        L_0x0039:
            android.widget.LinearLayout r0 = r5.A0k
            float r0 = X.C108945cZ.A04(r0)
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r3, r3, r0, r3)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = r5.A0B
            r2.setInterpolator(r0)
            if (r4 == 0) goto L_0x0053
            r5.A04 = r2
            goto L_0x000f
        L_0x0053:
            r5.A03 = r2
            goto L_0x000f
        L_0x0056:
            r5.A05 = r2
            goto L_0x000b
        L_0x0059:
            android.view.animation.Animation r0 = r5.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24149BwF.getFullscreenBottomControlsSlideOutAnimation():android.view.animation.Animation");
    }

    public void A0E() {
        View view;
        Animation animation;
        A05(this);
        setSystemUiVisibility(0);
        A0F();
        if (!A0C()) {
            if (this.A0M) {
                A01(this);
                Animation fullscreenBottomControlsSlideInAnimation = getFullscreenBottomControlsSlideInAnimation();
                if (fullscreenBottomControlsSlideInAnimation != null) {
                    this.A0Y.startAnimation(fullscreenBottomControlsSlideInAnimation);
                }
                LinearLayout linearLayout = this.A0k;
                Animation animation2 = this.A01;
                linearLayout.startAnimation(animation2);
                linearLayout.setVisibility(0);
                if (this.A0d.getVisibility() != 0) {
                    ImageButton imageButton = this.A0i;
                    imageButton.startAnimation(animation2);
                    imageButton.setVisibility(0);
                }
                if (!A06()) {
                    view = this.A0a;
                    animation = this.A07;
                } else {
                    return;
                }
            } else {
                this.A0Y.startAnimation(this.A09);
                view = this.A0l;
                animation = this.A01;
            }
            view.startAnimation(animation);
            view.setVisibility(0);
        }
    }

    public List getFullscreenControls() {
        ArrayList A132 = AnonymousClass000.A13();
        A132.add(this.A0s);
        A132.add(this.A0f);
        A132.add(this.A0h);
        A132.add(this.A0k);
        return A132;
    }

    public List getInlineControls() {
        ArrayList A132 = AnonymousClass000.A13();
        A132.add(this.A0g);
        A132.add(this.A0y);
        A132.add(this.A0l);
        return A132;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A01(this);
        A00(this);
        A04(this);
    }

    public void setVideoCaption(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ReadMoreTextView readMoreTextView = this.A0q;
            readMoreTextView.setText(charSequence);
            readMoreTextView.setVisibility(0);
            readMoreTextView.setOnTouchListener(new C1422678u((Object) this, 23));
        }
    }

    public void setBlockPlayButtonInput(boolean z) {
        this.A0J = z;
    }

    public void setInStatus(boolean z) {
        this.A0N = z;
    }

    public void setPlayPauseListener(E2x e2x) {
        this.A0T = e2x;
    }
}
