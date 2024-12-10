package X;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: X.6Mj  reason: invalid class name and case insensitive filesystem */
public abstract class C121996Mj extends C110395fZ {
    public AlphaAnimation A00;
    public AnonymousClass11C A01;
    public C18000vb A02;
    public C18030ve A03;
    public C135046rZ A04;
    public AnonymousClass864 A05;
    public AnonymousClass865 A06;
    public AnonymousClass88U A07;
    public Long A08;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B;
    public boolean A0C = true;
    public final FrameLayout A0D;
    public final FrameLayout A0E;
    public final FrameLayout A0F;
    public final FrameLayout A0G;
    public final ImageView A0H;
    public final TextView A0I;
    public final Runnable A0J = new AnonymousClass7RJ(this, 32);
    public final Runnable A0K = new AnonymousClass7RJ(this, 31);
    public final StringBuilder A0L;
    public final Formatter A0M;
    public final ImageButton A0N;
    public final LinearLayout A0O;
    public final TextView A0P;
    public final SeekBar A0Q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121996Mj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A03();
        StringBuilder A10 = AnonymousClass000.A10();
        this.A0L = A10;
        this.A0M = new Formatter(A10, Locale.getDefault());
        LayoutInflater.from(context).inflate(2131627522, this);
        this.A0F = (FrameLayout) AnonymousClass3MX.A0C(this, 2131432246);
        this.A0P = C72453Mb.A0W(this, 2131436190);
        this.A0I = C72453Mb.A0W(this, 2131436191);
        SeekBar seekBar = (SeekBar) AnonymousClass3MX.A0C(this, 2131432456);
        this.A0Q = seekBar;
        ImageView A0B2 = C108975cc.A0B(this, 2131428012);
        this.A0H = A0B2;
        this.A0O = (LinearLayout) AnonymousClass3MX.A0C(this, 2131430949);
        seekBar.setMax(1000);
        this.A0D = (FrameLayout) AnonymousClass3MX.A0C(this, 2131429544);
        this.A0N = (ImageButton) AnonymousClass3MX.A0C(this, 2131433882);
        this.A0G = (FrameLayout) AnonymousClass3MX.A0C(this, 2131431977);
        FrameLayout frameLayout = (FrameLayout) AnonymousClass3MX.A0C(this, 2131434717);
        this.A0E = frameLayout;
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = this.A0G;
        frameLayout2.setVisibility(0);
        frameLayout.setOnTouchListener(new AnonymousClass6L6(this, 0));
        frameLayout2.setOnTouchListener(new AnonymousClass6L6(this, 1));
        A01(this);
        if (AnonymousClass3MW.A1Z(getWhatsAppLocale()) && !isInEditMode()) {
            A0B2.setRotationY(180.0f);
        }
        Configuration configuration = getResources().getConfiguration();
        C18070vi.A0X(configuration);
        onConfigurationChanged(configuration);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        r6.A04.A00.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        if (r2 != false) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            r4 = 0
            X.C18070vi.A0d(r10, r4)
            X.6rZ r0 = r9.A04
            if (r0 == 0) goto L_0x011d
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x011d
            int r1 = r10.getKeyCode()
            r0 = 21
            r8 = 1
            if (r1 == r0) goto L_0x00f6
            r0 = 22
            if (r1 == r0) goto L_0x00f2
            r0 = 85
            r2 = 0
            if (r1 == r0) goto L_0x00ce
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 == r0) goto L_0x00de
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 == r0) goto L_0x00e8
            switch(r1) {
                case 87: goto L_0x002c;
                case 88: goto L_0x0087;
                case 89: goto L_0x00f6;
                case 90: goto L_0x00f2;
                default: goto L_0x002b;
            }
        L_0x002b:
            return r4
        L_0x002c:
            r6 = r9
            com.whatsapp.videoplayback.HeroPlaybackControlView r6 = (com.whatsapp.videoplayback.HeroPlaybackControlView) r6
            X.6rZ r0 = r6.A04
            X.C17960vV.A07(r0)
            com.facebook.android.exoplayer2.Timeline r5 = r0.A00()
            if (r5 == 0) goto L_0x0119
            X.6rZ r0 = r6.A04
            X.Cye r0 = r0.A00
            X.D49 r0 = X.C108965cb.A0E(r0)
            int r3 = r0.A0W
            int r0 = r5.A01()
            int r0 = r0 + -1
            if (r3 < r0) goto L_0x00be
            X.ClG r2 = r6.A01
            r0 = 0
            X.ClG r0 = r5.A09(r2, r3, r0)
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0119
            X.6rZ r0 = r6.A04
            X.Cye r0 = r0.A00
            X.CwF r5 = r0.A0D
            X.Cye r3 = r5.A0B     // Catch:{ RemoteException -> 0x010f }
            long r6 = r3.A0N     // Catch:{ RemoteException -> 0x010f }
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r0)     // Catch:{ RemoteException -> 0x010f }
            if (r0 == 0) goto L_0x0119
            X.Cub r0 = X.C26270CwF.A00(r5)     // Catch:{ RemoteException -> 0x010f }
            long r1 = r3.A0N     // Catch:{ RemoteException -> 0x010f }
            X.CZ4 r0 = r0.A0U     // Catch:{ RemoteException -> 0x010f }
            X.Cyh r2 = r0.A00(r1)     // Catch:{ RemoteException -> 0x010f }
            if (r2 == 0) goto L_0x0119
            android.os.Handler r1 = r2.A0l     // Catch:{ RemoteException -> 0x010f }
            r0 = 47
            android.os.Message r0 = r1.obtainMessage(r0)     // Catch:{ RemoteException -> 0x010f }
            X.C26381Cyh.A08(r0, r2)     // Catch:{ RemoteException -> 0x010f }
            goto L_0x0119
        L_0x0087:
            r6 = r9
            com.whatsapp.videoplayback.HeroPlaybackControlView r6 = (com.whatsapp.videoplayback.HeroPlaybackControlView) r6
            X.6rZ r0 = r6.A04
            X.C17960vV.A07(r0)
            com.facebook.android.exoplayer2.Timeline r3 = r0.A00()
            if (r3 == 0) goto L_0x0119
            X.6rZ r0 = r6.A04
            X.Cye r0 = r0.A00
            X.D49 r0 = X.C108965cb.A0E(r0)
            int r2 = r0.A0W
            X.ClG r5 = r6.A01
            r0 = 0
            r3.A09(r5, r2, r0)
            if (r2 <= 0) goto L_0x00c6
            X.6rZ r0 = r6.A04
            X.Cye r0 = r0.A00
            long r3 = r0.A09()
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00be
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x00c6
        L_0x00be:
            X.6rZ r0 = r6.A04
            X.Cye r0 = r0.A00
            r0.A0E()
            goto L_0x0119
        L_0x00c6:
            X.6rZ r2 = r6.A04
            r0 = 0
            r2.A01(r0)
            goto L_0x0119
        L_0x00ce:
            X.6rZ r1 = r9.A04
            if (r1 == 0) goto L_0x0119
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x00d9
            r2 = 1
        L_0x00d9:
            X.Cye r0 = r1.A00
            if (r2 == 0) goto L_0x00ee
            goto L_0x00e4
        L_0x00de:
            X.6rZ r0 = r9.A04
            if (r0 == 0) goto L_0x0119
            X.Cye r0 = r0.A00
        L_0x00e4:
            r0.A0C()
            goto L_0x0119
        L_0x00e8:
            X.6rZ r0 = r9.A04
            if (r0 == 0) goto L_0x0119
            X.Cye r0 = r0.A00
        L_0x00ee:
            r0.A0B()
            goto L_0x0119
        L_0x00f2:
            A02(r9)
            goto L_0x0119
        L_0x00f6:
            X.6rZ r5 = r9.A04
            if (r5 == 0) goto L_0x0119
            X.Cye r0 = r5.A00
            long r3 = r0.A09()
            r0 = 10000(0x2710, double:4.9407E-320)
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x010b
            r3 = 0
        L_0x010b:
            r5.A01(r3)
            goto L_0x0119
        L_0x010f:
            r3 = move-exception
            X.Cye r2 = r5.A0B
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Error occurs while seek to default position"
            X.C26378Cye.A05(r2, r0, r3, r1)
        L_0x0119:
            r9.A05()
            return r8
        L_0x011d:
            boolean r0 = super.dispatchKeyEvent(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121996Mj.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int A002;
        int i;
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        int A012 = (int) (AnonymousClass1ZO.A01(context) / C72463Mc.A00(context));
        int i2 = configuration.orientation;
        Context context2 = getContext();
        if (i2 == 2) {
            A002 = (int) ((20.0f * C72463Mc.A00(context2)) + 0.5f);
            i = A012 / 10;
        } else {
            A002 = (int) ((30.0f * C72463Mc.A00(context2)) + 0.5f);
            i = A012 / 20;
        }
        this.A0G.setPadding(i, 0, i, 0);
        this.A0E.setPadding(i, 0, i, 0);
        C108985cd.A0z(this.A0I, A002);
        C108985cd.A0z(this.A0Q, A002);
        C108985cd.A0z(this.A0P, A002);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public abstract void setPlayer(Object obj);

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public static final void A02(C121996Mj r7) {
        C135046rZ r72 = r7.A04;
        if (r72 != null) {
            long A092 = r72.A00.A09() + 10000;
            long j = C108965cb.A0E(r72.A00).A0X;
            if (j < 0) {
                j = -1;
            }
            if (A092 > j) {
                A092 = j;
            }
            r72.A01(A092);
        }
    }

    public final void A04() {
        C135046rZ r2;
        if (this.A09 && this.A00 == null && !C108965cb.A1X(getSystemServices())) {
            AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(getAlpha(), 0.0f);
            alphaAnimation.setDuration(250);
            Interpolator interpolator = accelerateInterpolator;
            alphaAnimation.setInterpolator(interpolator);
            C114545r0.A00(alphaAnimation, this, 13);
            this.A00 = alphaAnimation;
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 2130772017);
            loadAnimation.setDuration(250);
            loadAnimation.setInterpolator(interpolator);
            FrameLayout frameLayout = this.A0F;
            if (C108995ce.A1U(frameLayout)) {
                frameLayout.setVisibility(4);
                AnonymousClass88U r1 = this.A07;
                if (r1 != null) {
                    r1.CAE(frameLayout.getVisibility());
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), 2130772016);
                loadAnimation2.setDuration(250);
                loadAnimation2.setInterpolator(interpolator);
                this.A0H.startAnimation(loadAnimation2);
                frameLayout.startAnimation(this.A00);
                this.A0O.startAnimation(loadAnimation);
            }
            if (this.A0A) {
                FrameLayout frameLayout2 = this.A0D;
                if (frameLayout2.getVisibility() == 0 && (r2 = this.A04) != null && r2.A02() && r2.A00.A0J()) {
                    frameLayout2.setVisibility(4);
                    frameLayout2.startAnimation(this.A00);
                }
            }
        }
    }

    public final void A05() {
        if (this.A09) {
            FrameLayout frameLayout = this.A0F;
            frameLayout.setVisibility(0);
            AnonymousClass88U r1 = this.A07;
            if (r1 != null) {
                r1.CAE(frameLayout.getVisibility());
            }
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, getAlpha());
            alphaAnimation.setDuration(250);
            Interpolator interpolator = decelerateInterpolator;
            alphaAnimation.setInterpolator(interpolator);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 2130772018);
            loadAnimation.setDuration(250);
            loadAnimation.setInterpolator(interpolator);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), 2130772015);
            loadAnimation2.setDuration(250);
            loadAnimation2.setInterpolator(interpolator);
            FrameLayout frameLayout2 = this.A0D;
            if (frameLayout2.getVisibility() == 4 && this.A0A) {
                frameLayout2.setVisibility(0);
                frameLayout2.startAnimation(alphaAnimation);
                this.A0N.sendAccessibilityEvent(8);
            }
            frameLayout.startAnimation(alphaAnimation);
            this.A0O.startAnimation(loadAnimation);
            this.A0H.startAnimation(loadAnimation2);
            A01(this);
        }
    }

    public final void A06() {
        if (this.A0A) {
            this.A0D.setVisibility(0);
        }
        this.A0F.setVisibility(4);
        A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (((X.D49) r1.get()).A0T != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r8 = this;
            android.widget.FrameLayout r0 = r8.A0F
            boolean r0 = X.C108995ce.A1U(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.Long r0 = r8.A08
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L_0x0030
            X.6rZ r0 = r8.A04
            if (r0 == 0) goto L_0x002e
            X.Cye r0 = r0.A00
            if (r0 == 0) goto L_0x002e
            java.util.concurrent.atomic.AtomicReference r1 = r0.A08
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r1.get()
            X.D49 r0 = (X.D49) r0
            boolean r0 = r0.A0T
            if (r0 == 0) goto L_0x002e
        L_0x0028:
            android.widget.SeekBar r0 = r8.A0Q
            r0.setEnabled(r6)
        L_0x002d:
            return
        L_0x002e:
            r6 = 0
            goto L_0x0028
        L_0x0030:
            long r4 = r0.longValue()
            r2 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.widget.FrameLayout r0 = r8.A0E
            if (r1 > 0) goto L_0x003d
            r7 = 4
        L_0x003d:
            r0.setVisibility(r7)
            android.widget.FrameLayout r0 = r8.A0G
            r0.setVisibility(r7)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121996Mj.A07():void");
    }

    public final void A08() {
        if (this.A0D.getVisibility() != 4) {
            C135046rZ r0 = this.A04;
            boolean z = false;
            if (r0 != null) {
                z = C108975cc.A1B(r0.A02() ? 1 : 0);
            }
            ImageButton imageButton = this.A0N;
            int i = 2131232396;
            if (z) {
                i = 2131232394;
            }
            imageButton.setImageResource(i);
            C18000vb whatsAppLocale = getWhatsAppLocale();
            int i2 = 2131898982;
            if (z) {
                i2 = 2131898981;
            }
            String A0A2 = whatsAppLocale.A0A(i2);
            C18070vi.A0X(A0A2);
            imageButton.setContentDescription(A0A2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r11 = this;
            android.widget.FrameLayout r0 = r11.A0F
            boolean r0 = X.C108995ce.A1U(r0)
            if (r0 == 0) goto L_0x00f4
            java.lang.Long r0 = r11.A08
            r4 = 0
            if (r0 != 0) goto L_0x0040
            X.6rZ r0 = r11.A04
            if (r0 == 0) goto L_0x0106
            X.Cye r0 = r0.A00
            X.D49 r0 = X.C108965cb.A0E(r0)
            long r2 = r0.A0X
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            r2 = -1
        L_0x0020:
            java.lang.StringBuilder r1 = r11.A0L
            java.util.Formatter r0 = r11.A0M
            java.lang.String r2 = X.CDS.A00(r1, r0, r2)
            X.C18070vi.A0X(r2)
            android.widget.TextView r1 = r11.A0P
            java.lang.CharSequence r0 = r1.getText()
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = X.AnonymousClass3Ma.A13(r1)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0040
        L_0x003d:
            r1.setText(r2)
        L_0x0040:
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x0100
            X.6rZ r0 = r11.A04
            if (r0 == 0) goto L_0x00fc
            X.Cye r3 = r0.A00
            long r1 = r3.A0N
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x00fc
            X.D49 r0 = X.C108965cb.A0E(r3)
            long r2 = r0.A0C
        L_0x005a:
            android.widget.SeekBar r6 = r11.A0Q
            long r9 = r11.getDuration()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00f9
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00f9
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r2 = r2 / r9
            int r0 = (int) r2
        L_0x0072:
            r6.setSecondaryProgress(r0)
            X.6rZ r0 = r11.A04
            if (r0 == 0) goto L_0x007f
            X.Cye r0 = r0.A00
            long r4 = r0.A09()
        L_0x007f:
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x00a3
            java.lang.StringBuilder r1 = r11.A0L
            java.util.Formatter r0 = r11.A0M
            java.lang.String r2 = X.CDS.A00(r1, r0, r4)
            X.C18070vi.A0X(r2)
            android.widget.TextView r1 = r11.A0I
            java.lang.CharSequence r0 = r1.getText()
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = X.AnonymousClass3Ma.A13(r1)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a3
        L_0x00a0:
            r1.setText(r2)
        L_0x00a3:
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x00c3
            long r7 = r11.getDuration()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f7
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f7
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r4 * r2
            long r0 = r0 / r7
            int r2 = (int) r0
        L_0x00c0:
            r6.setProgress(r2)
        L_0x00c3:
            java.lang.Runnable r3 = r11.A0K
            r11.removeCallbacks(r3)
            X.6rZ r0 = r11.A04
            r2 = 1
            if (r0 == 0) goto L_0x00f4
            X.Cye r0 = r0.A00
            int r1 = r0.A08()
            if (r1 == r2) goto L_0x00f4
            r0 = 4
            if (r1 == r0) goto L_0x00f4
            X.6rZ r0 = r11.A04
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x00f1
            boolean r0 = r0.A02()
            if (r0 != r2) goto L_0x00f1
            r0 = 3
            if (r1 != r0) goto L_0x00f1
            long r4 = r4 % r6
            long r8 = r6 - r4
            r1 = 200(0xc8, double:9.9E-322)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f5
            long r6 = r6 + r8
        L_0x00f1:
            r11.postDelayed(r3, r6)
        L_0x00f4:
            return
        L_0x00f5:
            r6 = r8
            goto L_0x00f1
        L_0x00f7:
            r2 = 0
            goto L_0x00c0
        L_0x00f9:
            r0 = 0
            goto L_0x0072
        L_0x00fc:
            r2 = 0
            goto L_0x005a
        L_0x0100:
            android.widget.SeekBar r6 = r11.A0Q
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0072
        L_0x0106:
            r2 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121996Mj.A09():void");
    }

    public final void A0A(int i) {
        Runnable runnable = this.A0J;
        removeCallbacks(runnable);
        C135046rZ r0 = this.A04;
        if (r0 != null && r0.A02()) {
            postDelayed(runnable, (long) i);
        }
        if (this.A00 != null) {
            clearAnimation();
            this.A00 = null;
        }
    }

    public final boolean A0B() {
        return C108995ce.A1U(this.A0F);
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final long getDuration() {
        Long l = this.A08;
        if (l != null) {
            return l.longValue();
        }
        C135046rZ r0 = this.A04;
        if (r0 == null) {
            return -9223372036854775807L;
        }
        long j = C108965cb.A0E(r0.A00).A0X;
        if (j < 0) {
            return -1;
        }
        return j;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public static final void A00(FrameLayout frameLayout, C121996Mj r8) {
        if (!C108965cb.A1X(r8.getSystemServices())) {
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
            AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500);
            alphaAnimation.setInterpolator(decelerateInterpolator);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(500);
            alphaAnimation2.setInterpolator(accelerateInterpolator);
            alphaAnimation2.setStartOffset(500);
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(alphaAnimation2);
            C114545r0.A00(animationSet, frameLayout, 12);
            frameLayout.startAnimation(animationSet);
        }
    }

    public static void A01(C121996Mj r0) {
        r0.A08();
        r0.A07();
        r0.A09();
    }

    public final void setDuration(long j) {
        Long valueOf = Long.valueOf(j);
        this.A08 = valueOf;
        TextView textView = this.A0P;
        StringBuilder sb = this.A0L;
        Formatter formatter = this.A0M;
        if (valueOf != null) {
            j = valueOf.longValue();
        }
        textView.setText(CDS.A00(sb, formatter, j));
        A09();
        A07();
    }

    public final void setPlayControlVisibility(int i) {
        this.A0A = AnonymousClass000.A1P(i);
        this.A0D.setVisibility(i);
    }

    public final void setAllowControlFrameVisibilityChanges(boolean z) {
        this.A09 = z;
    }

    public final void setPlayButtonClickListener(AnonymousClass864 r1) {
        this.A05 = r1;
    }

    public final void setSeekbarStartTrackingTouchListener(AnonymousClass865 r1) {
        this.A06 = r1;
    }

    public final void setStreaming(boolean z) {
        this.A0C = z;
    }

    public final void setVisibilityListener(AnonymousClass88U r1) {
        this.A07 = r1;
    }
}
