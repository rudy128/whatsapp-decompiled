package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.6yQ  reason: invalid class name and case insensitive filesystem */
public final class C139216yQ {
    public static int A06;
    public static WeakReference A07;
    public ValueAnimator A00;
    public C126656d5 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass86B r6, X.C136056tC r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C146317Oq
            if (r0 == 0) goto L_0x0061
            X.7Oq r6 = (X.C146317Oq) r6
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x004c
            android.view.View r4 = r6.A01
            android.view.View r3 = r6.A02
            X.AFV r2 = new X.AFV
            r2.<init>((X.C139216yQ) r5)
            r1 = 9
            X.785 r0 = new X.785
            r0.<init>(r5, r1)
            r4.setOnClickListener(r2)
            r3.setOnClickListener(r0)
            android.view.View r1 = r6.A00
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.cancel()
            android.view.ViewPropertyAnimator r2 = X.C108985cd.A0G(r1)
            r0 = 600(0x258, double:2.964E-321)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            r0 = 1400(0x578, double:6.917E-321)
            android.view.ViewPropertyAnimator r2 = r2.setStartDelay(r0)
            r1 = 43
            X.5cy r0 = new X.5cy
            r0.<init>(r6, r1)
            android.view.ViewPropertyAnimator r0 = r2.setListener(r0)
            r0.start()
        L_0x004b:
            return
        L_0x004c:
            android.view.View r2 = r6.A00
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x004b
            android.view.ViewPropertyAnimator r0 = r2.animate()
            r0.cancel()
            r2.setVisibility(r1)
            return
        L_0x0061:
            boolean r0 = r6 instanceof X.C146307Op
            if (r0 == 0) goto L_0x011b
            X.7Op r6 = (X.C146307Op) r6
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0118
            android.view.View r4 = r6.A01
            android.view.View r3 = r6.A02
            X.AFV r2 = new X.AFV
            r2.<init>((X.C139216yQ) r5)
            r1 = 9
            X.785 r0 = new X.785
            r0.<init>(r5, r1)
            r4.setOnClickListener(r2)
            r3.setOnClickListener(r0)
            android.view.View r3 = r6.A00
        L_0x0087:
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L_0x004b
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0166
            java.lang.ref.WeakReference r0 = A07
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r0 = r0.get()
            if (r0 != r3) goto L_0x00d8
        L_0x009b:
            int r2 = A06
            r0 = 42
            X.5cy r4 = new X.5cy
            r4.<init>(r3, r0)
            r1 = 0
        L_0x00a5:
            android.animation.ValueAnimator r0 = r5.A00
            if (r0 == 0) goto L_0x00ac
            r0.removeAllListeners()
        L_0x00ac:
            android.animation.ValueAnimator r0 = r5.A00
            if (r0 == 0) goto L_0x00b3
            r0.removeAllUpdateListeners()
        L_0x00b3:
            android.animation.ValueAnimator r0 = r5.A00
            if (r0 == 0) goto L_0x00ba
            r0.cancel()
        L_0x00ba:
            android.animation.ValueAnimator r2 = X.C108995ce.A0B(r1, r2)
            r5.A00 = r2
            if (r2 == 0) goto L_0x004b
            X.C109005cf.A0I(r4, r2)
            r0 = 43
            X.C1411074h.A00(r2, r3, r0)
            if (r8 == 0) goto L_0x00d5
            r0 = 1400(0x578, double:6.917E-321)
        L_0x00ce:
            r2.setStartDelay(r0)
            r2.start()
            return
        L_0x00d5:
            r0 = 0
            goto L_0x00ce
        L_0x00d8:
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r3)
            A07 = r0
            int r4 = r3.getVisibility()
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            int r2 = r0.height
            r0 = 0
            r3.setVisibility(r0)
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            r0 = -2
            r1.height = r0
            android.view.ViewParent r0 = r3.getParent()
            if (r0 != 0) goto L_0x010f
            int r1 = r3.getWidth()
        L_0x00fd:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            X.C108985cd.A10(r3, r1, r0)
            int r0 = r3.getMeasuredHeight()
            A06 = r0
            r3.setVisibility(r4)
            X.AnonymousClass3MX.A1F(r3, r2)
            goto L_0x009b
        L_0x010f:
            android.view.View r0 = X.C72463Mc.A0L(r3)
            int r1 = r0.getWidth()
            goto L_0x00fd
        L_0x0118:
            android.view.View r3 = r6.A00
            goto L_0x0139
        L_0x011b:
            boolean r0 = r6 instanceof X.C146297Oo
            if (r0 == 0) goto L_0x004b
            X.7Oo r6 = (X.C146297Oo) r6
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0137
            X.6Re r0 = X.C122646Re.FACEBOOK
            r5.A00(r0, r6, r7)
            X.6Re r0 = X.C122646Re.INSTAGRAM
            r5.A00(r0, r6, r7)
            android.view.View r3 = r6.A00
            goto L_0x0087
        L_0x0137:
            android.view.View r3 = r6.A00
        L_0x0139:
            r2 = 0
            int r1 = r3.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x0158
            android.animation.ValueAnimator r0 = r5.A00
            if (r0 == 0) goto L_0x0149
            r0.removeAllListeners()
        L_0x0149:
            android.animation.ValueAnimator r0 = r5.A00
            if (r0 == 0) goto L_0x0150
            r0.removeAllUpdateListeners()
        L_0x0150:
            android.animation.ValueAnimator r0 = r5.A00
            if (r0 == 0) goto L_0x004b
            r0.cancel()
            return
        L_0x0158:
            int r1 = r3.getHeight()
            r0 = 41
            X.5cy r4 = new X.5cy
            r4.<init>(r3, r0)
            r8 = 0
            goto L_0x00a5
        L_0x0166:
            r0 = 0
            r3.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139216yQ.A01(X.86B, X.6tC, boolean):void");
    }

    public C139216yQ(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0s(r2, r3, r4, r5);
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A05 = AnonymousClass1DF.A01(new C154997s2(r2));
    }

    private final void A00(C122646Re r6, C146297Oo r7, C136056tC r8) {
        C122726Rr r4;
        ImageView imageView;
        View.OnClickListener onClickListener;
        if (r6.ordinal() != 0) {
            r4 = r8.A01;
            imageView = r7.A02;
        } else {
            r4 = r8.A00;
            imageView = r7.A01;
        }
        if (r4.isVisible) {
            imageView.setVisibility(0);
            boolean z = r4.isEnabled;
            imageView.setEnabled(z);
            Context context = imageView.getContext();
            int i = 2131103156;
            if (z) {
                i = 2131103152;
            }
            C108995ce.A0j(context, imageView, i);
            if (r4.isEnabled) {
                if (r6 != C122646Re.INSTAGRAM) {
                    int ordinal = ((AnonymousClass72B) this.A05.getValue()).A02(false).ordinal();
                    if (ordinal == 1 || ordinal == 2) {
                        onClickListener = new AFV(this);
                    } else if (ordinal != 3) {
                        if (ordinal == 0) {
                            onClickListener = new AnonymousClass781(13);
                        } else {
                            throw AnonymousClass3MW.A14();
                        }
                    }
                }
                onClickListener = new AnonymousClass78R(r6, this);
            } else {
                onClickListener = null;
            }
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }
}
