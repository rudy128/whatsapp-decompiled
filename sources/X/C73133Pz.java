package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Pz  reason: invalid class name and case insensitive filesystem */
public final class C73133Pz extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public int A01;
    public int A02;
    public Animator A03;
    public AnimatorSet A04;
    public FrameLayout A05;
    public LottieAnimationView A06;
    public AnonymousClass1KB A07;
    public C106685Wu A08;
    public AnonymousClass1VW A09;
    public AnonymousClass1M9 A0A;
    public C24921Me A0B;
    public C27171Va A0C;
    public AnonymousClass11C A0D;
    public C18000vb A0E;
    public AnonymousClass1MZ A0F;
    public AnonymousClass1KW A0G;
    public C18030ve A0H;
    public AnonymousClass1BI A0I;
    public C18010vc A0J;
    public C28931bI A0K;
    public C28931bI A0L;
    public AnonymousClass10I A0M;
    public AnonymousClass031 A0N;
    public List A0O;
    public boolean A0P;
    public C37451pZ A0Q;
    public final C108675c7 A0R;
    public final C18100vl A0S;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r12 == X.AnonymousClass00R.A0C) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.animation.ValueAnimator A01(android.view.View r10, X.C73133Pz r11, java.lang.Integer r12, int r13, int r14) {
        /*
            r7 = r10
            r9 = r13
            r10 = r14
            if (r7 != 0) goto L_0x0007
            r0 = 0
            return r0
        L_0x0007:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r5 = 1
            r3 = 0
            r8 = r12
            if (r12 == r0) goto L_0x0013
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r4 = 0
            if (r12 != r0) goto L_0x0014
        L_0x0013:
            r4 = 1
        L_0x0014:
            r0 = 2
            float[] r2 = new float[r0]
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L_0x0021
            r0 = 1036831949(0x3dcccccd, float:0.1)
        L_0x0021:
            r2[r3] = r0
            if (r4 == 0) goto L_0x0027
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0027:
            r2[r5] = r1
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r2)
            int r0 = r11.A01
            if (r0 != r5) goto L_0x005a
            r0 = 0
        L_0x0033:
            r6.setDuration(r0)
            r2 = 1048576000(0x3e800000, float:0.25)
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r0 = X.C29111bd.A00(r2, r1, r2, r0)
            r6.setInterpolator(r0)
            r7.measure(r3, r3)
            if (r13 > 0) goto L_0x004b
            int r9 = r7.getMeasuredWidth()
        L_0x004b:
            if (r14 > 0) goto L_0x0051
            int r10 = r7.getMeasuredHeight()
        L_0x0051:
            X.4ag r5 = new X.4ag
            r5.<init>(r6, r7, r8, r9, r10)
            r6.addUpdateListener(r5)
            return r6
        L_0x005a:
            r0 = 300(0x12c, double:1.48E-321)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73133Pz.A01(android.view.View, X.3Pz, java.lang.Integer, int, int):android.animation.ValueAnimator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (r2 > 0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (X.C22971Dz.A0e(r8) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C37451pZ r7, X.AnonymousClass1BI r8) {
        /*
            r6 = this;
            r3 = 0
            boolean r5 = X.C18070vi.A17(r8, r7)
            r6.A0I = r8
            r6.A0Q = r7
            int r2 = r6.A01
            r0 = 3
            if (r2 < r0) goto L_0x0085
            boolean r1 = X.C22971Dz.A0e(r8)
            r0 = 2132017229(0x7f14004d, float:1.967273E38)
            if (r1 != 0) goto L_0x001a
        L_0x0017:
            r0 = 2132017228(0x7f14004c, float:1.9672728E38)
        L_0x001a:
            r6.setAnimationAssetRes(r0)
            if (r2 <= 0) goto L_0x007d
            boolean r0 = X.C22971Dz.A0e(r8)
            if (r0 == 0) goto L_0x007d
            int r0 = r6.A01
            if (r0 != 0) goto L_0x007e
            android.widget.FrameLayout r0 = r6.A05
        L_0x002b:
            if (r0 == 0) goto L_0x007d
            r0 = 2131430773(0x7f0b0d75, float:1.8483256E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r0 == 0) goto L_0x007d
            X.1bI r4 = X.AnonymousClass3MW.A0p(r0)
            android.view.View r2 = X.AnonymousClass3MY.A0I(r4, r3)
            com.whatsapp.contact.FacepileView r2 = (com.whatsapp.contact.FacepileView) r2
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166964(0x7f0706f4, float:1.7948188E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setContactIconSize(r0)
            android.view.View r0 = r4.A02()
            com.whatsapp.contact.FacepileView r0 = (com.whatsapp.contact.FacepileView) r0
            r0.setContactsSize(r5)
            r6.A0L = r4
            r6.getWhatsAppLocale()
            r0 = 2131436183(0x7f0b2297, float:1.849423E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r6, r0)
            X.C27641Ww.A03(r0, r3, r3)
            r6.getWhatsAppLocale()
            r0 = 2131436185(0x7f0b2299, float:1.8494233E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r6, r0)
            X.5c7 r1 = r6.A0R
            android.content.Context r0 = r6.getContext()
            int r0 = r1.BW4(r0, r3)
            X.C27641Ww.A03(r2, r0, r3)
        L_0x007d:
            return
        L_0x007e:
            X.1bI r0 = r6.A0K
            if (r0 == 0) goto L_0x007d
            android.view.View r0 = r0.A00
            goto L_0x002b
        L_0x0085:
            r0 = 2132017227(0x7f14004b, float:1.9672726E38)
            if (r2 <= 0) goto L_0x001a
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73133Pz.A06(X.1pZ, X.1BI):void");
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A0H = r2;
    }

    public final void setBubbleProvider(C106685Wu r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r0 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r1 > 0) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setComposingJids(java.util.List r5) {
        /*
            r4 = this;
            r1 = 0
            X.C18070vi.A0d(r5, r1)
            boolean r0 = r5.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0038
            int r0 = r5.size()
            if (r0 != r3) goto L_0x0039
            java.lang.Object r0 = r5.get(r1)
            X.2d0 r0 = (X.C53732d0) r0
            int r0 = r0.A00
            if (r0 != r3) goto L_0x0039
            r2 = 2132017230(0x7f14004e, float:1.9672733E38)
        L_0x0020:
            r4.setAnimationAssetRes(r2)
            com.airbnb.lottie.LottieAnimationView r1 = r4.A06
            if (r1 == 0) goto L_0x0030
            boolean r0 = r1.A06()
            if (r0 == r3) goto L_0x0030
            r1.A04()
        L_0x0030:
            X.1bI r0 = r4.A0L
            if (r0 != 0) goto L_0x0053
            r0 = 0
            r4.setupContentDescription(r0)
        L_0x0038:
            return
        L_0x0039:
            X.1BI r2 = r4.A0I
            int r1 = r4.A01
            r0 = 3
            if (r1 < r0) goto L_0x004d
            boolean r0 = X.C22971Dz.A0e(r2)
            r2 = 2132017229(0x7f14004d, float:1.967273E38)
            if (r0 != 0) goto L_0x0020
        L_0x0049:
            r2 = 2132017228(0x7f14004c, float:1.9672728E38)
            goto L_0x0020
        L_0x004d:
            r2 = 2132017227(0x7f14004b, float:1.9672726E38)
            if (r1 <= 0) goto L_0x0020
            goto L_0x0049
        L_0x0053:
            X.5N7 r3 = new X.5N7
            r3.<init>(r4, r5)
            int r1 = r4.A01
            r0 = 2
            if (r1 < r0) goto L_0x006c
            X.10s r2 = r4.getSerialExecutor()
            r1 = 27
            X.4rh r0 = new X.4rh
            r0.<init>(r3, r1)
            r2.execute(r0)
            return
        L_0x006c:
            X.10I r1 = r4.getWaWorkers()
            r0 = 28
            X.C98774rh.A01(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73133Pz.setComposingJids(java.util.List):void");
    }

    public final void setContactAvatars(AnonymousClass1VW r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setContactManager(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A0G = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setGroupParticipantsManager(AnonymousClass1MZ r2) {
        C18070vi.A0d(r2, 0);
        this.A0F = r2;
    }

    public final void setInitialManager(C27171Va r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A0J = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setWaContactNames(C24921Me r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A0M = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A0E = r2;
    }

    public static final List A02(List list, List list2) {
        if (list == null || list.isEmpty()) {
            return list2;
        }
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        for (Object next : list) {
            if (list2.contains(next)) {
                A132.add(next);
            }
        }
        A13.addAll(A132);
        ArrayList A133 = AnonymousClass000.A13();
        for (Object next2 : list2) {
            AnonymousClass3MZ.A1V(next2, A133, list.contains(next2) ? 1 : 0);
        }
        A13.addAll(A133);
        return A13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r1 = X.AnonymousClass00R.A00;
        r0 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C63312sr r11, X.C73133Pz r12, java.util.List r13, int r14, boolean r15) {
        /*
            android.animation.AnimatorSet r0 = r12.A04
            r7 = 1
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.isRunning()
            if (r0 != r7) goto L_0x0013
            android.animation.AnimatorSet r0 = r12.A04
            if (r0 == 0) goto L_0x0012
            r0.end()
        L_0x0012:
            return
        L_0x0013:
            X.1bI r0 = r12.A0L
            if (r0 == 0) goto L_0x0012
            android.view.View r3 = r0.A02()
            com.whatsapp.contact.FacepileView r3 = (com.whatsapp.contact.FacepileView) r3
            if (r3 == 0) goto L_0x0012
            int r0 = r13.size()
            r3.setContactsSize(r0)
            java.util.Iterator r10 = r13.iterator()
            r4 = 0
            r1 = 0
        L_0x002c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0087
            int r9 = r1 + 1
            X.1E7 r6 = X.C17880vN.A0O(r10)
            com.whatsapp.WaImageView r5 = r3.A04(r1)
            if (r5 == 0) goto L_0x0085
            r5.setVisibility(r4)
            if (r15 == 0) goto L_0x0077
            java.lang.Object r8 = r5.getTag()
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131168739(0x7f070de3, float:1.7951788E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131168737(0x7f070de1, float:1.7951784E38)
            float r0 = r1.getDimension(r0)
            java.lang.String r0 = r6.A08(r0, r2)
            X.C18070vi.A0X(r0)
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 != 0) goto L_0x0077
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            int r0 = r3.A01
            android.animation.ValueAnimator r0 = A01(r5, r12, r1, r0, r0)
            if (r0 == 0) goto L_0x0077
            r0.start()
        L_0x0077:
            X.1pZ r2 = r12.A0Q
            if (r2 == 0) goto L_0x0085
            int r1 = r3.A01
            X.4kC r0 = new X.4kC
            r0.<init>(r12, r6, r1)
            r2.A05(r5, r0, r6, r7)
        L_0x0085:
            r1 = r9
            goto L_0x002c
        L_0x0087:
            int r0 = r3.A03
            r3.setNotInFacepileCount(r14)
            if (r15 == 0) goto L_0x00a1
            if (r0 > 0) goto L_0x00a1
            if (r14 <= 0) goto L_0x00a1
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            com.whatsapp.contact.FacepileItemMaskView r1 = r3.A05
            int r0 = r3.A01
            android.animation.ValueAnimator r0 = A01(r1, r12, r2, r4, r0)
            if (r0 == 0) goto L_0x00a1
            r0.start()
        L_0x00a1:
            int r1 = r12.A01
            r0 = 3
            if (r1 < r0) goto L_0x0012
            com.airbnb.lottie.LottieAnimationView r2 = r12.A06
            if (r2 == 0) goto L_0x0012
            if (r11 == 0) goto L_0x00b4
            int r0 = A00(r11, r12)
        L_0x00b0:
            X.C42491yG.A0C(r2, r0)
            return
        L_0x00b4:
            android.content.Context r1 = r3.getContext()
            r0 = 2131102080(0x7f060980, float:1.7816588E38)
            int r0 = X.C19740yt.A00(r1, r0)
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73133Pz.A03(X.2sr, X.3Pz, java.util.List, int, boolean):void");
    }

    private final C200710s getSerialExecutor() {
        return (C200710s) this.A0S.getValue();
    }

    private final int getTypingIndicatorDefaultColor() {
        Resources A0Y;
        Context context;
        int i;
        int i2;
        if (this.A01 > 0) {
            A0Y = AnonymousClass000.A0Y(this);
            context = getContext();
            i = 2130971663;
            i2 = 2131102751;
        } else {
            int i3 = this.A00;
            A0Y = AnonymousClass000.A0Y(this);
            context = getContext();
            i = 2130970659;
            i2 = 2131102034;
            if (i3 == 2132017230) {
                i = 2130971662;
                i2 = 2131102750;
            }
        }
        return AnonymousClass3Ma.A01(context, A0Y, i, i2);
    }

    private final void setAnimationAssetRes(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            LottieAnimationView lottieAnimationView = this.A06;
            if (lottieAnimationView != null) {
                lottieAnimationView.setAnimation(i);
            }
            LottieAnimationView lottieAnimationView2 = this.A06;
            if (lottieAnimationView2 != null) {
                C42491yG.A0C(lottieAnimationView2, getTypingIndicatorDefaultColor());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setupContentDescription(List list) {
        String str;
        if (list == null) {
            Context context = getContext();
            int i = 2131888988;
            if (this.A00 == 2132017230) {
                i = 2131888989;
            }
            str = context.getString(i);
        } else if (list.size() == 1) {
            Context context2 = getContext();
            int i2 = 2131889003;
            if (this.A00 == 2132017230) {
                i2 = 2131889004;
            }
            str = C17880vN.A0q(context2, AnonymousClass3MY.A0q(getWaContactNames(), (AnonymousClass1E7) list.get(0)), new Object[1], 0, i2);
        } else if (list.size() > 1) {
            Resources resources = getResources();
            int A022 = AnonymousClass3MX.A02(list, 1);
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = AnonymousClass3MY.A0q(getWaContactNames(), (AnonymousClass1E7) list.get(0));
            C17880vN.A1T(A1b, AnonymousClass3MX.A02(list, 1), 1);
            str = resources.getQuantityString(2131755198, A022, A1b);
        } else {
            str = "";
        }
        setContentDescription(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r10 = this;
            int r3 = r10.A01
            if (r3 != 0) goto L_0x0009
            android.widget.FrameLayout r0 = r10.A05
        L_0x0006:
            if (r0 == 0) goto L_0x0010
        L_0x0008:
            return
        L_0x0009:
            X.1bI r0 = r10.A0K
            if (r0 == 0) goto L_0x0010
            android.view.View r0 = r0.A00
            goto L_0x0006
        L_0x0010:
            if (r3 > 0) goto L_0x00c5
            r0 = 2131436183(0x7f0b2297, float:1.849423E38)
            android.view.View r4 = r10.findViewById(r0)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r10.A05 = r4
        L_0x001d:
            if (r4 == 0) goto L_0x0083
            X.5Wu r0 = r10.getBubbleProvider()
            X.DOp r0 = (X.C26993DOp) r0
            X.0vl r0 = r0.A0L
            java.lang.Object r2 = r0.getValue()
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            android.graphics.Rect r0 = X.AnonymousClass3MW.A07()
            r2.getPadding(r0)
            X.0vb r0 = r10.getWhatsAppLocale()
            X.3cP r1 = new X.3cP
            r1.<init>(r2, r0)
            r0 = 1
            r1.A00 = r0
            r4.setBackground(r1)
            int r7 = X.C72463Mc.A05(r4)
            android.content.res.Resources r1 = r4.getResources()
            if (r3 <= 0) goto L_0x00b4
            r0 = 2131166980(0x7f070704, float:1.794822E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.0vb r0 = r10.getWhatsAppLocale()
            int r1 = r1 + r7
            X.C27641Ww.A05(r4, r0, r1, r7)
        L_0x005c:
            r10.getWhatsAppLocale()
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168059(0x7f070b3b, float:1.795041E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            X.C27641Ww.A03(r4, r1, r0)
            r0 = 2131436482(0x7f0b23c2, float:1.8494836E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r4, r0)
            com.airbnb.lottie.LottieAnimationView r2 = (com.airbnb.lottie.LottieAnimationView) r2
            r10.A06 = r2
            if (r2 == 0) goto L_0x0083
            r1 = 1
            X.4gK r0 = new X.4gK
            r0.<init>(r4, r10, r1)
            r2.A02 = r0
        L_0x0083:
            X.1BI r1 = r10.A0I
            if (r1 == 0) goto L_0x0094
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x0094
            X.1pZ r0 = r10.A0Q
            if (r0 == 0) goto L_0x0094
            r10.A06(r0, r1)
        L_0x0094:
            com.airbnb.lottie.LottieAnimationView r1 = r10.A06
            if (r1 == 0) goto L_0x009d
            int r0 = r10.A00
            r1.setAnimation((int) r0)
        L_0x009d:
            com.airbnb.lottie.LottieAnimationView r1 = r10.A06
            if (r1 == 0) goto L_0x00a8
            int r0 = r10.getTypingIndicatorDefaultColor()
            X.C42491yG.A0C(r1, r0)
        L_0x00a8:
            com.airbnb.lottie.LottieAnimationView r1 = r10.A06
            if (r1 == 0) goto L_0x0008
            X.0vb r0 = r10.getWhatsAppLocale()
            X.C27641Ww.A0C(r1, r0)
            return
        L_0x00b4:
            r0 = 2131168777(0x7f070e09, float:1.7951865E38)
            int r6 = r1.getDimensionPixelSize(r0)
            X.0vb r5 = r10.getWhatsAppLocale()
            r9 = r7
            r8 = r7
            X.C27641Ww.A07(r4, r5, r6, r7, r8, r9)
            goto L_0x005c
        L_0x00c5:
            X.1bI r0 = r10.A0K
            if (r0 == 0) goto L_0x0083
            android.view.View r4 = r0.A02()
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73133Pz.A05():void");
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0N;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0N = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final C106685Wu getBubbleProvider() {
        C106685Wu r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("bubbleProvider");
        throw null;
    }

    public final AnonymousClass1VW getContactAvatars() {
        AnonymousClass1VW r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactAvatars");
        throw null;
    }

    public final AnonymousClass1M9 getContactManager() {
        AnonymousClass1M9 r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final AnonymousClass1MZ getGroupParticipantsManager() {
        AnonymousClass1MZ r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupParticipantsManager");
        throw null;
    }

    public final C27171Va getInitialManager() {
        C27171Va r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("initialManager");
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final C24921Me getWaContactNames() {
        C24921Me r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A0M;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73133Pz(Context context, C108675c7 r5) {
        super(context);
        C18070vi.A0j(context, r5);
        if (!this.A0P) {
            this.A0P = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A0H = AnonymousClass10E.A8r(r1);
            this.A08 = (C106685Wu) r2.A0z.A9k.get();
            this.A09 = AnonymousClass3MZ.A0e(r1);
            this.A0A = AnonymousClass10E.A4z(r1);
            this.A0G = AnonymousClass3Ma.A0f(r1);
            this.A07 = AnonymousClass10E.A12(r1);
            this.A0F = AnonymousClass3MY.A0V(r1);
            this.A0C = (C27171Va) r1.A5H.get();
            this.A0J = AnonymousClass3Ma.A0r(r1);
            this.A0D = AnonymousClass3Ma.A0a(r1);
            this.A0B = AnonymousClass3MZ.A0g(r1);
            this.A0M = AnonymousClass10E.AL1(r1);
            this.A0E = AnonymousClass10E.A6Q(r1);
        }
        this.A0R = r5;
        this.A0S = AnonymousClass1DF.A01(new AnonymousClass5GD(this));
        this.A00 = 2132017227;
        int typingIndicatorAnimationVersion = getTypingIndicatorAnimationVersion();
        this.A01 = typingIndicatorAnimationVersion;
        if (typingIndicatorAnimationVersion > 0) {
            View.inflate(context, 2131627247, this);
            this.A0K = C72453Mb.A0s(this, 2131436184);
        } else {
            View.inflate(context, 2131627244, this);
            A05();
        }
        setVisibility(8);
    }

    public static int A00(C63312sr r2, C73133Pz r3) {
        boolean A0D2 = r3.getContactAvatars().A0D();
        Context context = r3.getContext();
        if (A0D2) {
            r3.getContactAvatars();
            return C19740yt.A00(context, AnonymousClass1VW.A01(r2.A04).accentColorRes);
        }
        C18070vi.A0X(context);
        return C84024Ho.A00(context, r2);
    }

    private final int getTypingIndicatorAnimationVersion() {
        return C36301nf.A00(getAbProps(), 10056, 0);
    }

    public static final void setComposingJids$lambda$10(C18090vk r0) {
        AnonymousClass3Ma.A1Q(r0);
    }

    public static final void setComposingJids$lambda$9(C18090vk r0) {
        AnonymousClass3Ma.A1Q(r0);
    }

    public final int getDisplayingHeight() {
        if (getHeight() == 0 || this.A01 == 1) {
            return getResources().getDimensionPixelSize(2131169086);
        }
        return getHeight();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            A05();
            LottieAnimationView lottieAnimationView = this.A06;
            if (lottieAnimationView != null && !lottieAnimationView.A06()) {
                lottieAnimationView.A04();
                return;
            }
            return;
        }
        LottieAnimationView lottieAnimationView2 = this.A06;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.A03();
        }
    }
}
