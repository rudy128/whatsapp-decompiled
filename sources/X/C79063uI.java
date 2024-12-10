package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.WaImageView;
import java.lang.ref.SoftReference;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.3uI  reason: invalid class name and case insensitive filesystem */
public final class C79063uI extends C78193sO {
    public WaImageView A00;
    public AnonymousClass2P1 A01;
    public C25481Oj A02;
    public AnonymousClass118 A03;
    public AnonymousClass2P0 A04;
    public C18030ve A05;
    public AnonymousClass00H A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new C102355Gd(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new C102365Ge(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new C102375Gf(this));
    public final FrameLayout A0A = ((FrameLayout) AnonymousClass3MX.A0C(this, 2131432381));
    public final C28931bI A0B = C72453Mb.A0s(this, 2131432226);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79063uI(Context context, C108875cR r8, AnonymousClass210 r9) {
        super(context, r8, r9);
        C18070vi.A0d(context, 1);
        A1M();
        A2j(true);
        int A052 = C72453Mb.A05(C79103uS.A1I(this) ? 1 : 0);
        C108355bZ r0 = this.A09;
        C18070vi.A0W(r0);
        Drawable BZi = r0.BZi(A052);
        Rect A072 = AnonymousClass3MW.A07();
        Rect BNj = this.A09.BNj(1);
        BZi.getPadding(A072);
        ViewGroup viewGroup = this.A06;
        viewGroup.setBackground(BZi);
        if (!C18020vd.A05(C18040vf.A02, this.A05, 9811)) {
            viewGroup.setPadding(viewGroup.getPaddingLeft() + (BNj.left * 4), viewGroup.getPaddingTop(), viewGroup.getPaddingRight() + (BNj.right * 4), viewGroup.getPaddingBottom());
        }
    }

    public static final void setEmojiView$lambda$8(C79063uI r6, Drawable drawable, String str) {
        C18070vi.A0e(r6, 0, str);
        C28931bI r1 = r6.A0B;
        if (r1.A00 != null) {
            C72453Mb.A1D(r1.A02());
        }
        if (r6.A00 == null) {
            WaImageView A0f = C72453Mb.A0f(r6);
            FrameLayout frameLayout = r6.A0A;
            frameLayout.addView(A0f);
            ViewGroup.LayoutParams layoutParams = A0f.getLayoutParams();
            C18100vl r2 = r6.A08;
            layoutParams.height = C72453Mb.A0I(r2);
            layoutParams.width = C72453Mb.A0I(r2);
            r6.A00 = A0f;
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = C72453Mb.A0I(r2);
            layoutParams2.width = C72453Mb.A0I(r2);
        }
        WaImageView waImageView = r6.A00;
        if (waImageView != null) {
            waImageView.setImageDrawable(drawable);
            waImageView.setVisibility(0);
            if (C137596vi.A00(str) != null && waImageView.getAnimation() == null) {
                C42491yG.A04(waImageView);
            }
        }
    }

    public static final void setLottieAnimationView$lambda$9(C79063uI r1, C39801tf r2) {
        C18070vi.A0d(r1, 0);
        r1.setLottieComposition(r2);
    }

    public static final void setLottieComposition$lambda$13$lambda$11$lambda$10(C79063uI r4) {
        C18070vi.A0d(r4, 0);
        C25451Og r1 = r4.getSingleEmojiDailyLoggingManager().A00;
        C17880vN.A1C(C25451Og.A00(r1).edit(), "replay_animation_count", C25451Og.A00(r1).getInt("replay_animation_count", 0) + 1);
    }

    public void A2K(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        super.A2K(r2);
        A2L(r2);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        C18070vi.A0d(r2, 0);
        boolean z2 = !r2.equals(getFMessage());
        super.A2V(r2, z);
        if (z || z2) {
            A2j(z2);
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setAnimatedEmojiLottieCache(AnonymousClass2P0 r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setHighResolutionEmojiDrawableCache(AnonymousClass2P1 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setNetworkResourcesManagerLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setSingleEmojiDailyLoggingManager(C25481Oj r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWaContext(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    private final int getAnimatedEmojiAssetSize() {
        return C72453Mb.A0I(this.A07);
    }

    private final int getBubbleSize() {
        return C72453Mb.A0I(this.A08);
    }

    private final boolean getUseLowQualityEmojisEnabled() {
        return C72453Mb.A1a(this.A09);
    }

    private final void setLottieComposition(C39801tf r6) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A0B.A02();
        boolean A2H = this.A0v.A2H();
        lottieAnimationView.setComposition(r6);
        lottieAnimationView.setVisibility(0);
        if (A2H) {
            lottieAnimationView.A04();
        }
        View.OnLongClickListener onLongClickListener = this.A2t;
        lottieAnimationView.setOnLongClickListener(onLongClickListener);
        C90074dU.A00(lottieAnimationView, this, 35);
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        if (layoutParams != null) {
            C18100vl r1 = this.A07;
            layoutParams.height = C72453Mb.A0I(r1);
            layoutParams.width = C72453Mb.A0I(r1);
        }
        FrameLayout frameLayout = this.A0A;
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        C18100vl r12 = this.A08;
        layoutParams2.height = C72453Mb.A0I(r12);
        layoutParams2.width = C72453Mb.A0I(r12);
        frameLayout.setOnLongClickListener(onLongClickListener);
    }

    public final void A2j(boolean z) {
        View A022;
        if (z) {
            WaImageView waImageView = this.A00;
            if (waImageView != null) {
                waImageView.clearAnimation();
                waImageView.setVisibility(8);
            }
            C28931bI r1 = this.A0B;
            if (!(r1.A00 == null || (A022 = r1.A02()) == null)) {
                A022.setVisibility(8);
            }
            this.A1X.CGF(new AnonymousClass7RK(36, (Object) this, z));
        }
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass2P0 getAnimatedEmojiLottieCache() {
        AnonymousClass2P0 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("animatedEmojiLottieCache");
        throw null;
    }

    public final AnonymousClass2P1 getHighResolutionEmojiDrawableCache() {
        AnonymousClass2P1 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("highResolutionEmojiDrawableCache");
        throw null;
    }

    public final AnonymousClass00H getNetworkResourcesManagerLazy() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("networkResourcesManagerLazy");
        throw null;
    }

    public final C25481Oj getSingleEmojiDailyLoggingManager() {
        C25481Oj r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("singleEmojiDailyLoggingManager");
        throw null;
    }

    public final AnonymousClass118 getWaContext() {
        AnonymousClass118 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContext");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        r1 = X.C18040vf.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        if (r3 != null) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setLottieAnimationView(boolean r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0096
            X.206 r0 = r8.getFMessage()
            java.lang.String r5 = r0.A0P()
            if (r5 == 0) goto L_0x0096
            X.2P0 r0 = r8.getAnimatedEmojiLottieCache()
            X.00z r0 = r0.A00
            java.lang.Object r3 = r0.A04(r5)
            if (r3 != 0) goto L_0x0080
            X.0ve r7 = r8.A05     // Catch:{ OutOfMemoryError -> 0x008d }
            X.C18070vi.A0W(r7)     // Catch:{ OutOfMemoryError -> 0x008d }
            X.00H r0 = r8.getNetworkResourcesManagerLazy()     // Catch:{ OutOfMemoryError -> 0x008d }
            java.lang.Object r6 = X.C18070vi.A0E(r0)     // Catch:{ OutOfMemoryError -> 0x008d }
            X.A1I r6 = (X.A1I) r6     // Catch:{ OutOfMemoryError -> 0x008d }
            X.2P0 r2 = r8.getAnimatedEmojiLottieCache()     // Catch:{ OutOfMemoryError -> 0x008d }
            X.1Oh r1 = r8.A0H     // Catch:{ OutOfMemoryError -> 0x008d }
            X.C18070vi.A0W(r1)     // Catch:{ OutOfMemoryError -> 0x008d }
            r0 = 1
            X.C18070vi.A0d(r6, r0)     // Catch:{ OutOfMemoryError -> 0x008d }
            X.00z r4 = r2.A00     // Catch:{ OutOfMemoryError -> 0x008d }
            java.lang.Object r3 = r4.A04(r5)     // Catch:{ OutOfMemoryError -> 0x008d }
            if (r3 != 0) goto L_0x0080
            boolean r0 = X.C26180Cu0.A01(r7, r1, r5)     // Catch:{ OutOfMemoryError -> 0x008d }
            if (r0 == 0) goto L_0x0093
            r0 = 12495(0x30cf, float:1.7509E-41)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ OutOfMemoryError -> 0x008d }
            boolean r2 = X.C18020vd.A05(r1, r7, r0)     // Catch:{ OutOfMemoryError -> 0x008d }
            r0 = 11066(0x2b3a, float:1.5507E-41)
            boolean r1 = X.C18020vd.A05(r1, r7, r0)     // Catch:{ OutOfMemoryError -> 0x008d }
            java.lang.String r0 = X.AnonymousClass72X.A00(r5)     // Catch:{ OutOfMemoryError -> 0x008d }
            X.C0L r1 = X.C26180Cu0.A00(r0, r2, r1)     // Catch:{ OutOfMemoryError -> 0x008d }
            r0 = 0
            if (r1 == 0) goto L_0x0093
            java.io.FileInputStream r2 = X.C88574a9.A01(r6, r1)     // Catch:{ Exception -> 0x0079 }
            X.1yu r0 = X.C39771tc.A04(r2, r0)     // Catch:{ all -> 0x0072 }
            java.lang.Object r3 = r0.A00     // Catch:{ all -> 0x0072 }
            X.1tf r3 = (X.C39801tf) r3     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x006c
            r4.A08(r5, r3)     // Catch:{ all -> 0x0072 }
        L_0x006c:
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ Exception -> 0x0079 }
            goto L_0x007e
        L_0x0072:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x0079 }
            throw r0     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            r0.toString()     // Catch:{ OutOfMemoryError -> 0x008d }
            goto L_0x0093
        L_0x007e:
            if (r3 == 0) goto L_0x0093
        L_0x0080:
            X.1KB r2 = r8.A0S
            r1 = 26
            X.4rl r0 = new X.4rl
            r0.<init>(r8, r3, r1)
            r2.A0J(r0)
            return
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "ConversationRowSingleEmoji/setLottieAnimationView/failed to load animated emoji"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0093:
            r8.A2i()
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79063uI.setLottieAnimationView(boolean):void");
    }

    public static final Drawable A00(C79063uI r10, C72233Ld r11) {
        String A0P = r10.getFMessage().A0P();
        if (A0P == null) {
            return null;
        }
        C43281zY r7 = new C43281zY(A0P);
        long A002 = C43291zZ.A00(r7, false);
        if (C72453Mb.A1a(r10.A09)) {
            return r10.A15.A07(AnonymousClass3MX.A05(r10), r7, A002);
        }
        BitmapDrawable A062 = r10.A15.A06(AnonymousClass3MX.A05(r10), r11, r7, A002);
        if (A062 == null) {
            return null;
        }
        if (C18020vd.A05(C18040vf.A02, r10.A05, 11052)) {
            AnonymousClass2P1 highResolutionEmojiDrawableCache = r10.getHighResolutionEmojiDrawableCache();
            ReentrantLock reentrantLock = (ReentrantLock) highResolutionEmojiDrawableCache.A01.getValue();
            reentrantLock.lock();
            try {
                highResolutionEmojiDrawableCache.A00.A08(A0P, new SoftReference(A062));
            } finally {
                reentrantLock.unlock();
            }
        }
        return A062;
    }

    public static final void setLottieComposition$lambda$13$lambda$11(LottieAnimationView lottieAnimationView, C79063uI r2, View view) {
        C18070vi.A0h(lottieAnimationView, r2);
        if (!lottieAnimationView.A06()) {
            lottieAnimationView.A04();
            C98784ri.A00(r2.A1X, r2, 27);
        }
    }

    public boolean A1a() {
        if (getFMessage().A0K() == null) {
            if (A2d(this.A17, getFMessage(), this.A01, this.A0V)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r3 != null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A2i() {
        /*
            r5 = this;
            X.206 r0 = r5.getFMessage()
            java.lang.String r4 = r0.A0P()
            if (r4 == 0) goto L_0x0052
            X.0ve r2 = r5.A05
            r1 = 11052(0x2b2c, float:1.5487E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0056
            X.2P1 r1 = r5.getHighResolutionEmojiDrawableCache()
            X.0vl r0 = r1.A01
            java.lang.Object r2 = r0.getValue()
            java.util.concurrent.locks.ReentrantLock r2 = (java.util.concurrent.locks.ReentrantLock) r2
            r2.lock()
            X.00z r1 = r1.A00     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r1.A04(r4)     // Catch:{ all -> 0x003c }
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0030
            goto L_0x0053
        L_0x0030:
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x003c }
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3     // Catch:{ all -> 0x003c }
            if (r3 != 0) goto L_0x0041
            r1.A05(r4)     // Catch:{ all -> 0x003c }
            goto L_0x0041
        L_0x003c:
            r0 = move-exception
            r2.unlock()
            throw r0
        L_0x0041:
            r2.unlock()
            if (r3 == 0) goto L_0x0056
        L_0x0046:
            X.1KB r2 = r5.A0S
            r1 = 11
            X.AkY r0 = new X.AkY
            r0.<init>(r5, r3, r4, r1)
            r2.A0J(r0)
        L_0x0052:
            return
        L_0x0053:
            r2.unlock()
        L_0x0056:
            X.4mk r0 = new X.4mk
            r0.<init>(r5)
            android.graphics.drawable.Drawable r3 = A00(r5, r0)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79063uI.A2i():void");
    }

    public int getCenteredLayoutId() {
        return 2131624767;
    }

    public int getIncomingLayoutId() {
        return 2131624767;
    }

    public int getOutgoingLayoutId() {
        return 2131624768;
    }
}
