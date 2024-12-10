package X;

import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.72v  reason: invalid class name and case insensitive filesystem */
public final class C1407472v {
    public LottieAnimationView A00;
    public AnonymousClass6RF A01;
    public C18090vk A02;
    public AnonymousClass6RF A03;
    public final AnonymousClass1JD A04 = new AnonymousClass1JD();
    public final Map A05 = C17880vN.A13();
    public final Map A06 = C17880vN.A13();

    public static final void A00(LottieAnimationView lottieAnimationView, AnonymousClass6RF r10, C1407472v r11, Map map, AtomicInteger atomicInteger, AnonymousClass1JD r14, C98474rD r15, int i) {
        C98474rD r8 = r15;
        r15.element++;
        AnonymousClass6RF r3 = r10;
        Map map2 = map;
        Object obj = map.get(r10);
        C1407472v r4 = r11;
        AtomicInteger atomicInteger2 = atomicInteger;
        AnonymousClass1JD r7 = r14;
        if (obj != null) {
            r14.addLast(AnonymousClass1D6.A01(r10, obj));
            atomicInteger.getAndDecrement();
            if (atomicInteger.get() == 0) {
                AnonymousClass1JD r0 = r11.A04;
                r0.addAll(r14);
                if (r15.element == r0.size()) {
                    A02(r11);
                    return;
                }
                return;
            }
            return;
        }
        C38631rd r2 = new C38631rd();
        r14.addLast(AnonymousClass1D6.A01(r10, r2));
        C39771tc.A06(lottieAnimationView.getContext(), i).A02(new C142827Ay(r2, r3, r4, map2, atomicInteger2, r7, r8));
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, X.4rD] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(X.AnonymousClass6RF r13, boolean r14) {
        /*
            r12 = this;
            r6 = r12
            com.airbnb.lottie.LottieAnimationView r4 = r12.A00
            if (r4 == 0) goto L_0x005c
            r1 = 2
            java.util.concurrent.atomic.AtomicInteger r8 = new java.util.concurrent.atomic.AtomicInteger
            r8.<init>(r1)
            X.4rD r10 = new X.4rD
            r10.<init>()
            X.1JD r9 = new X.1JD
            r9.<init>()
            if (r14 != 0) goto L_0x0069
            X.6RF r5 = r12.A03
            if (r5 == 0) goto L_0x0069
            int r3 = r5.ordinal()
            r2 = 0
            r0 = 2132017205(0x7f140035, float:1.9672682E38)
            if (r3 == r2) goto L_0x0033
            r0 = 1
            if (r3 == r0) goto L_0x0065
            r0 = 2132017208(0x7f140038, float:1.9672688E38)
            if (r3 == r1) goto L_0x0033
            r0 = 3
            if (r3 != r0) goto L_0x0069
            r0 = 2132017210(0x7f14003a, float:1.9672692E38)
        L_0x0033:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0069
            java.util.Map r7 = r12.A06
            int r11 = r0.intValue()
            A00(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0042:
            java.util.Map r7 = r12.A05
            r5 = r13
            int r2 = r13.ordinal()
            r0 = 1
            if (r2 == r0) goto L_0x0061
            if (r2 == r1) goto L_0x005d
            r0 = 3
            r11 = 2132017209(0x7f140039, float:1.967269E38)
            if (r2 == r0) goto L_0x0057
            r11 = 2132017204(0x7f140034, float:1.967268E38)
        L_0x0057:
            A00(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A03 = r13
        L_0x005c:
            return
        L_0x005d:
            r11 = 2132017207(0x7f140037, float:1.9672686E38)
            goto L_0x0057
        L_0x0061:
            r11 = 2132017206(0x7f140036, float:1.9672684E38)
            goto L_0x0057
        L_0x0065:
            r0 = 2132017207(0x7f140037, float:1.9672686E38)
            goto L_0x0033
        L_0x0069:
            r8.getAndDecrement()
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407472v.A01(X.6RF, boolean):void");
    }

    public final void A03(AnonymousClass6RF r4, boolean z) {
        C18070vi.A0d(r4, 0);
        LottieAnimationView lottieAnimationView = this.A00;
        if (lottieAnimationView != null && this.A03 != r4) {
            if (lottieAnimationView.getVisibility() != 0) {
                this.A01 = r4;
                return;
            }
            AnonymousClass1JD r2 = this.A04;
            r2.clear();
            if (r4 == AnonymousClass6RF.TIMEOUT_GENERIC || r4 == AnonymousClass6RF.TIMEOUT_NO_INTERNET) {
                Drawable A062 = AnonymousClass3MX.A06(lottieAnimationView.getContext(), 2131232642);
                C18070vi.A0X(A062);
                r2.addLast(AnonymousClass1D6.A01(r4, A062));
                this.A03 = null;
                A02(this);
            } else if (this.A03 == AnonymousClass6RF.PROCESSING && r4 == AnonymousClass6RF.LISTENING) {
                A01(r4, true);
            } else {
                A01(r4, z);
            }
        }
    }

    public static final void A02(C1407472v r6) {
        LottieAnimationView lottieAnimationView;
        AnonymousClass1JD r1 = r6.A04;
        if (!r1.isEmpty() && (lottieAnimationView = r6.A00) != null) {
            AnonymousClass1D6 r0 = (AnonymousClass1D6) r1.removeFirst();
            Object obj = r0.first;
            Drawable drawable = (Drawable) r0.second;
            lottieAnimationView.setImageDrawable(drawable);
            if (drawable instanceof C38631rd) {
                lottieAnimationView.setPadding(0, 0, 0, 0);
                C38631rd r3 = (C38631rd) drawable;
                C38651rf r2 = r3.A0d;
                r2.removeAllListeners();
                r2.addListener(new C109165cv(drawable, obj, r6, 2));
                r3.A07();
                return;
            }
            AnonymousClass3MY.A14(lottieAnimationView.getResources(), lottieAnimationView, 2131168776);
        }
    }

    public C1407472v(LottieAnimationView lottieAnimationView, C18090vk r3) {
        this.A00 = lottieAnimationView;
        this.A02 = r3;
    }
}
