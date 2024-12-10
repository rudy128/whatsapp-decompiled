package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.imageview.ShapeableImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.collections.ObservableRecyclerView;

/* renamed from: X.5nK  reason: invalid class name and case insensitive filesystem */
public abstract class C113585nK extends C42011xT {
    public void A0B() {
        C38391rD r2;
        ValueAnimator valueAnimator;
        Runnable runnable;
        if (this instanceof AnonymousClass6KP) {
            AnonymousClass6KP r22 = (AnonymousClass6KP) this;
            if (r22.A05.A06()) {
                C17880vN.A0V(r22.A08).unregisterObserver(r22.A03);
            }
        } else if (this instanceof C121456Js) {
            C121456Js r0 = (C121456Js) this;
            r0.A04 = null;
            r0.A0A.setImageDrawable((Drawable) null);
        } else if (this instanceof C121446Jr) {
            C121446Jr r4 = (C121446Jr) this;
            if (r4 instanceof C121386Jl) {
                C121386Jl r42 = (C121386Jl) r4;
                r42.A05 = true;
                r42.A02 = null;
                ShapeableImageView shapeableImageView = r42.A07;
                if (shapeableImageView != null) {
                    shapeableImageView.setImageDrawable((Drawable) null);
                }
                C18100vl r23 = r42.A0A;
                if (r23.Bf6() && (runnable = r42.A04) != null) {
                    ((Handler) r23.getValue()).removeCallbacks(runnable);
                }
                try {
                    if (r42.A0F && (valueAnimator = r42.A02) != null) {
                        valueAnimator.cancel();
                        r42.A02 = null;
                        if (r42.A00 != -1) {
                            WaTextView waTextView = r42.A09;
                            ViewGroup.LayoutParams layoutParams = waTextView.getLayoutParams();
                            int i = r42.A00;
                            layoutParams.height = i;
                            int i2 = 0;
                            if (i == 0) {
                                i2 = 8;
                            }
                            waTextView.setVisibility(i2);
                            r42.A00 = -1;
                        }
                    }
                } catch (Throwable th) {
                    C30691eM.A00(th);
                }
            } else {
                r4.A02 = null;
                ShapeableImageView shapeableImageView2 = r4.A07;
                if (shapeableImageView2 != null) {
                    shapeableImageView2.setImageDrawable((Drawable) null);
                }
            }
        } else if (this instanceof AnonymousClass6KQ) {
            AnonymousClass6KQ r3 = (AnonymousClass6KQ) this;
            ViewPager2 viewPager2 = r3.A03;
            C38391rD r02 = viewPager2.A04.A0B;
            if (r02 != null) {
                r02.A01.unregisterObserver(r3.A06);
            }
            viewPager2.A05.A00.remove(r3.A02);
            r3.A01 = false;
        } else if (this instanceof AnonymousClass6KR) {
            AnonymousClass6KR r32 = (AnonymousClass6KR) this;
            r32.A04 = false;
            ObservableRecyclerView observableRecyclerView = r32.A09;
            if (observableRecyclerView != null) {
                observableRecyclerView.A0u(r32.A0B);
            }
            ((BM9) r32.A0J.getValue()).A08((RecyclerView) null);
            AnonymousClass8AU r24 = r32.A0A;
            if ((r24 instanceof C112425lS) && (r2 = (C38391rD) r24) != null) {
                r2.A01.unregisterObserver(r32.A07);
            }
        } else if (this instanceof AnonymousClass6KG) {
            AnonymousClass6KG r25 = (AnonymousClass6KG) this;
            r25.A00 = null;
            C126416ch r1 = r25.A01;
            if (r1 != null) {
                r25.A06.unregisterObserver(r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0386, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 10995) == false) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x058f, code lost:
        r2 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05e5, code lost:
        if (r0.A08 != false) goto L_0x05e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06a8, code lost:
        if ((!X.AnonymousClass73U.A00(r14.A01(), r0.A04, r6, r3)) != false) goto L_0x06aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0a77, code lost:
        if ((!X.AnonymousClass73U.A00(r14.A01(), r0.A04, r5, r2)) != false) goto L_0x0a79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0d10, code lost:
        r2 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0d12, code lost:
        if (r1 == false) goto L_0x0d2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0d14, code lost:
        X.C18070vi.A0W(r2);
        r2.setVisibility(8);
        r1 = r0.A01;
        X.C18070vi.A0W(r1);
        r1.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0d22, code lost:
        r0 = r0.A00;
        X.C18070vi.A0W(r0);
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0d2a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0d2b, code lost:
        X.C18070vi.A0W(r2);
        r1 = r0.A04.A03;
        X.C18070vi.A0X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0d39, code lost:
        if (r1.size() != 0) goto L_0x0d3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0d3b, code lost:
        r6 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0d3d, code lost:
        r2.setVisibility(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0d44, code lost:
        if (r2.getVisibility() != 0) goto L_0x0d51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0d46, code lost:
        r2 = r2.getViewTreeObserver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0d4a, code lost:
        if (r2 == null) goto L_0x0d51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0d4c, code lost:
        X.AnonymousClass793.A00(r2, r0, 27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0d51, code lost:
        r1 = r0.A01;
        X.C18070vi.A0W(r1);
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fa, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A00.A01, 6795) == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0150, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A05.A01, 6795) == false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0153, code lost:
        if (r7 != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0155, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0162, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A05.A01, 6799) != false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0164, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0167, code lost:
        if (r4 == false) goto L_0x0d10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0169, code lost:
        r1 = r0.A02;
        X.C18070vi.A0W(r1);
        r1.setVisibility(8);
        r1 = r0.A01;
        X.C18070vi.A0W(r1);
        r1.setVisibility(8);
        r0 = r0.A00;
        X.C18070vi.A0W(r0);
        r0.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0181, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x079f  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x07ab  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x07cb  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x07d9  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0802  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0817  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0822  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x083f  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0865  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.AnonymousClass6U0 r24) {
        /*
            r23 = this;
            r14 = r24
            r8 = 0
            r0 = r23
            boolean r1 = r0 instanceof X.AnonymousClass6K9
            if (r1 == 0) goto L_0x0023
            X.6K9 r0 = (X.AnonymousClass6K9) r0
            X.6JF r14 = (X.AnonymousClass6JF) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            boolean r1 = r14.A00
            r0.A00 = r1
            r2 = 2131232029(0x7f08051d, float:1.8080156E38)
            if (r1 == 0) goto L_0x001d
            r2 = 2131232031(0x7f08051f, float:1.808016E38)
        L_0x001d:
            com.whatsapp.WaImageView r0 = r0.A01
        L_0x001f:
            r0.setImageResource(r2)
        L_0x0022:
            return
        L_0x0023:
            boolean r1 = r0 instanceof X.C121506Jx
            if (r1 == 0) goto L_0x0036
            X.6Jx r0 = (X.C121506Jx) r0
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            com.whatsapp.WaTextView r1 = r0.A00
            r0 = 2131894946(0x7f1222a2, float:1.9424711E38)
        L_0x0032:
            r1.setText(r0)
            return
        L_0x0036:
            boolean r1 = r0 instanceof X.AnonymousClass6KC
            if (r1 == 0) goto L_0x00bb
            X.6KC r0 = (X.AnonymousClass6KC) r0
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            boolean r1 = r14 instanceof X.AnonymousClass6JX
            if (r1 == 0) goto L_0x0060
            com.whatsapp.WaTextView r2 = r0.A01
            if (r2 == 0) goto L_0x004e
            r1 = 2131889455(0x7f120d2f, float:1.9413574E38)
        L_0x004b:
            r2.setText(r1)
        L_0x004e:
            com.whatsapp.WaTextView r2 = r0.A00
            if (r2 == 0) goto L_0x0058
            r1 = 2131897145(0x7f122b39, float:1.9429171E38)
            r2.setText(r1)
        L_0x0058:
            android.view.View r2 = r0.A0H
            r1 = 15
            X.AnonymousClass78M.A00(r2, r0, r14, r1)
            return
        L_0x0060:
            boolean r1 = r14 instanceof X.AnonymousClass6JZ
            if (r1 == 0) goto L_0x006c
            com.whatsapp.WaTextView r2 = r0.A01
            if (r2 == 0) goto L_0x004e
            r1 = 2131889458(0x7f120d32, float:1.941358E38)
            goto L_0x004b
        L_0x006c:
            boolean r1 = r14 instanceof X.AnonymousClass6JY
            if (r1 == 0) goto L_0x0080
            com.whatsapp.WaTextView r2 = r0.A01
            if (r2 == 0) goto L_0x007a
            r1 = 2131889458(0x7f120d32, float:1.941358E38)
            r2.setText(r1)
        L_0x007a:
            com.whatsapp.WaTextView r1 = r0.A00
            X.C72453Mb.A1D(r1)
            goto L_0x0058
        L_0x0080:
            boolean r1 = r14 instanceof X.AnonymousClass6JV
            if (r1 == 0) goto L_0x00b3
            r3 = 2131895479(0x7f1224b7, float:1.9425792E38)
        L_0x0087:
            com.whatsapp.WaTextView r6 = r0.A01
            r2 = 0
            if (r6 == 0) goto L_0x0058
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L_0x0058
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L_0x0058
            java.lang.String r4 = r1.getString(r3)
            if (r4 == 0) goto L_0x0058
            X.1np r3 = r0.A03
            if (r3 == 0) goto L_0x00af
            r1 = 25
            X.7RD r2 = new X.7RD
            r2.<init>(r0, r14, r1)
            java.lang.String r1 = "channels-directory"
            android.text.SpannableStringBuilder r2 = r3.A05(r5, r2, r4, r1)
        L_0x00af:
            r6.setText(r2)
            goto L_0x0058
        L_0x00b3:
            boolean r1 = r14 instanceof X.AnonymousClass6JW
            if (r1 == 0) goto L_0x0058
            r3 = 2131895480(0x7f1224b8, float:1.9425794E38)
            goto L_0x0087
        L_0x00bb:
            boolean r1 = r0 instanceof X.AnonymousClass6KP
            if (r1 == 0) goto L_0x00dd
            X.6KP r0 = (X.AnonymousClass6KP) r0
            X.6Jd r14 = (X.C121306Jd) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            r0.A01 = r14
            X.1Lc r1 = r0.A05
            boolean r1 = r1.A06()
            if (r1 == 0) goto L_0x0022
            X.00H r1 = r0.A08
            X.10T r1 = X.C17880vN.A0V(r1)
            X.7MI r0 = r0.A03
            r1.registerObserver(r0)
            return
        L_0x00dd:
            boolean r1 = r0 instanceof X.AnonymousClass6KM
            if (r1 == 0) goto L_0x0132
            X.6KM r0 = (X.AnonymousClass6KM) r0
            X.6JK r14 = (X.AnonymousClass6JK) r14
            r6 = 0
            X.C18070vi.A0d(r14, r6)
            boolean r1 = r14.A00
            if (r1 == 0) goto L_0x00fc
            X.1Lc r1 = r0.A00
            X.0ve r3 = r1.A01
            r2 = 6795(0x1a8b, float:9.522E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            r2 = 1
            if (r1 != 0) goto L_0x00fd
        L_0x00fc:
            r2 = 0
        L_0x00fd:
            android.view.View r5 = r0.A0H
            boolean r1 = r5 instanceof com.whatsapp.wds.components.list.header.WDSSectionHeader
            if (r1 == 0) goto L_0x0022
            r4 = r5
            com.whatsapp.wds.components.list.header.WDSSectionHeader r4 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r4
            if (r4 == 0) goto L_0x0022
            if (r2 == 0) goto L_0x0d0a
            r3 = 2131231657(0x7f0803a9, float:1.8079401E38)
            X.1Xz r2 = X.C27881Xz.TONAL
            X.6Pl r1 = new X.6Pl
            r1.<init>(r2, r8, r3, r6)
            r4.setAddOnType(r1)
            com.whatsapp.wds.components.button.WDSButton r2 = r4.A07(r6)
            if (r2 == 0) goto L_0x0121
            r1 = 7
            X.AnonymousClass78L.A00(r2, r0, r1)
        L_0x0121:
            com.whatsapp.wds.components.button.WDSButton r2 = r4.A07(r6)
            if (r2 == 0) goto L_0x0022
            android.content.Context r1 = r5.getContext()
            r0 = 2131896785(0x7f1229d1, float:1.9428441E38)
            X.AnonymousClass3MY.A0w(r1, r2, r0)
            return
        L_0x0132:
            boolean r1 = r0 instanceof X.AnonymousClass6KN
            if (r1 == 0) goto L_0x0182
            X.6KN r0 = (X.AnonymousClass6KN) r0
            X.6JK r14 = (X.AnonymousClass6JK) r14
            r5 = 0
            X.C18070vi.A0d(r14, r5)
            boolean r7 = r14.A00
            r6 = 0
            if (r7 == 0) goto L_0x0152
            X.1Lc r1 = r0.A05
            X.0ve r3 = r1.A01
            r2 = 6795(0x1a8b, float:9.522E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            r4 = 1
            if (r1 != 0) goto L_0x0155
        L_0x0152:
            r4 = 0
            if (r7 == 0) goto L_0x0164
        L_0x0155:
            X.1Lc r1 = r0.A05
            X.0ve r3 = r1.A01
            r2 = 6799(0x1a8f, float:9.527E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r1, r3, r2)
            r1 = 1
            if (r2 != 0) goto L_0x0165
        L_0x0164:
            r1 = 0
        L_0x0165:
            r3 = 8
            if (r4 == 0) goto L_0x0d10
            android.view.View r1 = r0.A02
            X.C18070vi.A0W(r1)
            r1.setVisibility(r3)
            android.view.View r1 = r0.A01
            X.C18070vi.A0W(r1)
            r1.setVisibility(r3)
            android.view.View r0 = r0.A00
            X.C18070vi.A0W(r0)
            r0.setVisibility(r5)
            return
        L_0x0182:
            boolean r1 = r0 instanceof X.AnonymousClass6KB
            if (r1 == 0) goto L_0x01d2
            X.6KB r0 = (X.AnonymousClass6KB) r0
            android.view.View r6 = r0.A0H
            r1 = 2131430237(0x7f0b0b5d, float:1.848217E38)
            com.whatsapp.WaTextView r4 = X.AnonymousClass3Ma.A0N(r6, r1)
            r5 = 0
            r6.setVisibility(r5)
            X.1np r7 = r0.A03
            android.content.Context r8 = r6.getContext()
            android.content.Context r3 = r6.getContext()
            r2 = 2131896364(0x7f12282c, float:1.9427587E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.lang.String r11 = "%s"
            java.lang.String r10 = X.C17880vN.A0q(r3, r11, r1, r5, r2)
            android.content.Context r3 = r6.getContext()
            r2 = 2130968627(0x7f040033, float:1.7545913E38)
            r1 = 2131099690(0x7f06002a, float:1.781174E38)
            int r12 = X.AnonymousClass1YL.A00(r3, r2, r1)
            r1 = 35
            X.7RC r9 = X.AnonymousClass7RC.A00(r0, r1)
            android.text.SpannableStringBuilder r1 = r7.A06(r8, r9, r10, r11, r12)
            r4.setText(r1)
            X.11C r1 = r0.A00
            X.AnonymousClass3Ma.A1K(r4, r1)
            X.0ve r0 = r0.A01
            X.AnonymousClass3Ma.A1I(r4, r0)
            return
        L_0x01d2:
            boolean r1 = r0 instanceof X.AnonymousClass6K6
            if (r1 == 0) goto L_0x0200
            X.6K6 r0 = (X.AnonymousClass6K6) r0
            X.6JI r14 = (X.AnonymousClass6JI) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            boolean r1 = r14.A00
            r0.A00 = r1
            r4 = 2131232029(0x7f08051d, float:1.8080156E38)
            if (r1 == 0) goto L_0x01ea
            r4 = 2131232031(0x7f08051f, float:1.808016E38)
        L_0x01ea:
            android.view.View r3 = r0.A0H
            boolean r0 = r3 instanceof com.whatsapp.wds.components.list.header.WDSSectionHeader
            if (r0 == 0) goto L_0x0022
            com.whatsapp.wds.components.list.header.WDSSectionHeader r3 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r3
            if (r3 == 0) goto L_0x0022
            r2 = 1
            X.1Xz r1 = X.C27881Xz.TONAL
            X.6Pl r0 = new X.6Pl
            r0.<init>(r1, r8, r4, r2)
            r3.setAddOnType(r0)
            return
        L_0x0200:
            boolean r1 = r0 instanceof X.AnonymousClass6K8
            if (r1 == 0) goto L_0x021c
            X.6K8 r0 = (X.AnonymousClass6K8) r0
            X.6JI r14 = (X.AnonymousClass6JI) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            boolean r1 = r14.A00
            r0.A00 = r1
            r2 = 2131232029(0x7f08051d, float:1.8080156E38)
            if (r1 == 0) goto L_0x0218
            r2 = 2131232031(0x7f08051f, float:1.808016E38)
        L_0x0218:
            com.whatsapp.WaImageView r0 = r0.A01
            goto L_0x001f
        L_0x021c:
            boolean r1 = r0 instanceof X.AnonymousClass6KI
            if (r1 == 0) goto L_0x033a
            X.6KI r0 = (X.AnonymousClass6KI) r0
            X.6Jg r14 = (X.C121336Jg) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            r0.A00 = r14
            X.1E7 r7 = r14.A00
            X.1pZ r6 = r0.A06
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r5 = r0.A0D
            r6.A07(r5, r7)
            X.2Dk r4 = r14.A02
            long r1 = r4.A0G
            X.4XM r9 = r0.A09
            int r3 = (int) r1
            int r11 = X.AnonymousClass4XM.A00(r9, r3)
            java.lang.String r10 = r9.A01(r11)
            r1 = 1
            X.C18070vi.A0d(r10, r1)
            com.whatsapp.WaTextView r9 = r0.A05
            android.content.res.Resources r3 = X.AnonymousClass000.A0Y(r9)
            r2 = 2131755092(0x7f100054, float:1.9141054E38)
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r10, r1)
            X.AnonymousClass3MX.A1E(r3, r9, r1, r2, r11)
            X.6lO r2 = r0.A08
            X.1bI r9 = r0.A0B
            android.view.View r1 = r9.A02()
            android.content.Context r1 = X.AnonymousClass3MY.A04(r1)
            boolean r1 = r2.A00(r1)
            if (r1 == 0) goto L_0x0313
            X.1bI r2 = r0.A0C
            r1 = 8
            r2.A04(r1)
            com.whatsapp.WaImageView r3 = r0.A04
            r3.setVisibility(r1)
            android.view.View r9 = r9.A02()
            com.whatsapp.WaButtonWithLoader r9 = (com.whatsapp.WaButtonWithLoader) r9
            X.C18070vi.A0b(r9)
            r10 = 0
            r9.setVisibility(r10)
            boolean r1 = r14.A01
            if (r1 == 0) goto L_0x030e
            r9.A02()
        L_0x0288:
            X.9Ig r2 = r4.A02
            X.9Ig r1 = X.C179509Ig.GUEST
            boolean r1 = X.AnonymousClass000.A1Z(r2, r1)
            if (r1 == 0) goto L_0x0301
            X.1Xz r1 = X.C27881Xz.TONAL
            r9.setVariant(r1)
            r1 = 2131890489(0x7f121139, float:1.9415671E38)
            r9.setButtonText((int) r1)
        L_0x029d:
            r9.setSelected(r10)
        L_0x02a0:
            boolean r1 = r3.isSelected()
            r10 = 2131894872(0x7f122258, float:1.9424561E38)
            if (r1 == 0) goto L_0x02ac
            r10 = 2131890492(0x7f12113c, float:1.9415677E38)
        L_0x02ac:
            android.content.Context r9 = r3.getContext()
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            com.whatsapp.TextEmojiLabel r1 = r0.A02
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = X.C108975cc.A0b(r9, r1, r2, r10)
            r3.setContentDescription(r1)
            java.lang.String r9 = "Button"
            X.AnonymousClass1Y5.A07(r3, r9)
            r6.A07(r5, r7)
            X.1xh r2 = r0.A03
            r2.A0A(r7, r8)
            android.view.View r3 = r0.A0H
            boolean r1 = A00(r3)
            if (r1 != 0) goto L_0x02db
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            X.C43421zm.A04(r1)
        L_0x02db:
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            X.AnonymousClass1Y5.A07(r1, r9)
            int r2 = r0.A05()
            r1 = -1
            if (r2 == r1) goto L_0x0022
            int r2 = r0.A05()
            X.1c4 r1 = r0.A07
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x0022
            X.6l4 r1 = r0.A01
            X.1ch r0 = r4.A0M()
            X.6nd r0 = r1.A00(r3, r0, r2)
            r0.A00()
            return
        L_0x0301:
            X.1Xz r1 = X.C27881Xz.OUTLINE
            r9.setVariant(r1)
            r1 = 2131890498(0x7f121142, float:1.941569E38)
            r9.setButtonText((int) r1)
            r10 = 1
            goto L_0x029d
        L_0x030e:
            r9.A01()
            goto L_0x0288
        L_0x0313:
            boolean r9 = r14.A01
            X.1bI r1 = r0.A0C
            android.view.View r3 = X.AnonymousClass3MX.A0D(r1)
            r2 = 0
            int r1 = X.C72453Mb.A07(r9)
            r3.setVisibility(r1)
            com.whatsapp.WaImageView r3 = r0.A04
            if (r9 == 0) goto L_0x0328
            r2 = 4
        L_0x0328:
            r3.setVisibility(r2)
            X.9Ig r2 = r4.A02
            X.9Ig r1 = X.C179509Ig.GUEST
            boolean r1 = X.AnonymousClass000.A1Z(r2, r1)
            r1 = r1 ^ 1
            r3.setSelected(r1)
            goto L_0x02a0
        L_0x033a:
            boolean r1 = r0 instanceof X.AnonymousClass6K2
            if (r1 == 0) goto L_0x0359
            X.6K2 r0 = (X.AnonymousClass6K2) r0
            X.0ve r1 = r0.A00
            boolean r2 = X.AnonymousClass1J8.A07(r1)
            android.view.View r1 = r0.A0H
            if (r2 == 0) goto L_0x0d5a
            boolean r0 = r1 instanceof com.whatsapp.wds.components.list.header.WDSSectionHeader
            if (r0 == 0) goto L_0x0022
            com.whatsapp.wds.components.list.header.WDSSectionHeader r1 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r1
            if (r1 == 0) goto L_0x0022
            r0 = 2131892625(0x7f121991, float:1.9420004E38)
            r1.setHeaderText((int) r0)
            return
        L_0x0359:
            boolean r1 = r0 instanceof X.AnonymousClass6K5
            if (r1 == 0) goto L_0x038f
            X.6K5 r0 = (X.AnonymousClass6K5) r0
            X.6JN r14 = (X.AnonymousClass6JN) r14
            android.view.View r2 = X.C108965cb.A09(r0, r14)
            r1 = 2131430721(0x7f0b0d41, float:1.848315E38)
            android.widget.TextView r3 = X.C17880vN.A0E(r2, r1)
            r1 = 48
            X.AnonymousClass3Ma.A1E(r3, r0, r1)
            boolean r1 = r14.A00
            if (r1 != 0) goto L_0x0388
            X.00H r0 = r0.A01
            X.0ve r2 = X.AnonymousClass3MY.A0W(r0)
            r1 = 10995(0x2af3, float:1.5407E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 2131889453(0x7f120d2d, float:1.941357E38)
            if (r1 != 0) goto L_0x038b
        L_0x0388:
            r0 = 2131892623(0x7f12198f, float:1.942E38)
        L_0x038b:
            r3.setText(r0)
            return
        L_0x038f:
            boolean r1 = r0 instanceof X.AnonymousClass6K4
            if (r1 == 0) goto L_0x03ee
            X.6K4 r0 = (X.AnonymousClass6K4) r0
            X.6JH r14 = (X.AnonymousClass6JH) r14
            android.view.View r6 = X.C108965cb.A09(r0, r14)
            android.content.Context r3 = r6.getContext()
            X.C18070vi.A0b(r3)
            X.6U1 r5 = r14.A00
            boolean r2 = r5 instanceof X.AnonymousClass6KV
            if (r2 == 0) goto L_0x03ea
            r1 = 2131893141(0x7f121b95, float:1.942105E38)
        L_0x03ab:
            android.text.Spanned r4 = X.AnonymousClass4W6.A00(r3, r1)
            com.whatsapp.wds.components.banners.WDSBanner r6 = (com.whatsapp.wds.components.banners.WDSBanner) r6
            X.4XT r3 = new X.4XT
            r3.<init>()
            if (r2 == 0) goto L_0x03e6
            r1 = 2131233448(0x7f080aa8, float:1.8083034E38)
        L_0x03bb:
            X.4AG r2 = new X.4AG
            r2.<init>(r1)
            X.4AC r1 = new X.4AC
            r1.<init>(r2)
            r3.A02 = r1
            r3.A03 = r4
            X.4Os r1 = r3.A01()
            r6.setState(r1)
            r1 = 14
            X.AnonymousClass78M.A00(r6, r0, r5, r1)
            X.7vg r1 = new X.7vg
            r1.<init>(r0, r5)
            r6.setOnDismissListener((X.C18090vk) r1)
            r6.A08()
            X.1Di r0 = r0.A01
        L_0x03e2:
            r0.invoke(r14)
            return
        L_0x03e6:
            r1 = 2131233320(0x7f080a28, float:1.8082774E38)
            goto L_0x03bb
        L_0x03ea:
            r1 = 2131893098(0x7f121b6a, float:1.9420963E38)
            goto L_0x03ab
        L_0x03ee:
            boolean r1 = r0 instanceof X.AnonymousClass6KD
            if (r1 == 0) goto L_0x044d
            X.6KD r0 = (X.AnonymousClass6KD) r0
            X.6JH r14 = (X.AnonymousClass6JH) r14
            r9 = 0
            X.C18070vi.A0d(r14, r9)
            android.view.View r7 = r0.A0H
            android.content.Context r8 = r7.getContext()
            X.6U1 r5 = r14.A00
            boolean r6 = r5 instanceof X.AnonymousClass6KV
            if (r6 == 0) goto L_0x0449
            r4 = 2131893141(0x7f121b95, float:1.942105E38)
        L_0x0409:
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1a()
            r2 = 2130968764(0x7f0400bc, float:1.754619E38)
            r1 = 2131099833(0x7f0600b9, float:1.781203E38)
            int r1 = X.AnonymousClass1YL.A00(r8, r2, r1)
            java.lang.String r1 = X.AnonymousClass1EG.A03(r8, r1)
            r3[r9] = r1
            android.text.Spanned r2 = X.AnonymousClass1EG.A01(r8, r3, r4)
            X.C18070vi.A0X(r2)
            android.widget.TextView r1 = r0.A01
            r1.setText(r2)
            com.whatsapp.WaImageView r2 = r0.A02
            if (r6 == 0) goto L_0x0445
            r1 = 2131233449(0x7f080aa9, float:1.8083036E38)
        L_0x0430:
            r2.setImageResource(r1)
            r1 = 12
            X.AnonymousClass78M.A00(r7, r0, r5, r1)
            android.view.View r2 = r0.A00
            r1 = 13
            X.AnonymousClass78M.A00(r2, r0, r5, r1)
            X.AnonymousClass3MW.A1Q(r2)
            X.1Di r0 = r0.A04
            goto L_0x03e2
        L_0x0445:
            r1 = 2131233199(0x7f0809af, float:1.8082529E38)
            goto L_0x0430
        L_0x0449:
            r4 = 2131893098(0x7f121b6a, float:1.9420963E38)
            goto L_0x0409
        L_0x044d:
            boolean r1 = r0 instanceof X.AnonymousClass6K1
            if (r1 == 0) goto L_0x0469
            X.6K1 r0 = (X.AnonymousClass6K1) r0
            X.6JG r14 = (X.AnonymousClass6JG) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            boolean r2 = r14.A00
            r1 = 2131892948(0x7f121ad4, float:1.9420659E38)
            if (r2 == 0) goto L_0x0463
            r1 = 2131892949(0x7f121ad5, float:1.942066E38)
        L_0x0463:
            com.whatsapp.WaTextView r0 = r0.A00
        L_0x0465:
            r0.setText(r1)
            return
        L_0x0469:
            boolean r1 = r0 instanceof X.AnonymousClass6KL
            if (r1 == 0) goto L_0x0499
            X.6KL r0 = (X.AnonymousClass6KL) r0
            X.6JO r14 = (X.AnonymousClass6JO) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            X.0ve r3 = r0.A01
            X.0vf r2 = X.C18040vf.A01
            r1 = 11314(0x2c32, float:1.5854E-41)
            boolean r2 = X.C18020vd.A05(r2, r3, r1)
            r1 = 1
            if (r2 == r1) goto L_0x0493
            android.view.View r2 = r0.A00
            boolean r1 = r2 instanceof com.whatsapp.wds.components.list.header.WDSSectionHeader
            if (r1 == 0) goto L_0x0493
            com.whatsapp.wds.components.list.header.WDSSectionHeader r2 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r2
            if (r2 == 0) goto L_0x0493
            boolean r1 = r14.A01
            r1 = r1 ^ 1
            r2.setDividerVisibility(r1)
        L_0x0493:
            boolean r1 = r14.A00
            X.AnonymousClass6KL.A01(r0, r1)
            return
        L_0x0499:
            boolean r1 = r0 instanceof X.AnonymousClass6K7
            if (r1 == 0) goto L_0x04c5
            X.6K7 r0 = (X.AnonymousClass6K7) r0
            X.6JO r14 = (X.AnonymousClass6JO) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            android.view.View r3 = r0.A00
            X.C18070vi.A0W(r3)
            boolean r1 = r14.A01
            r1 = r1 ^ 1
            r2 = 0
            int r1 = X.C72453Mb.A07(r1)
            r3.setVisibility(r1)
            android.view.ViewGroup r1 = r0.A01
            X.C18070vi.A0W(r1)
            boolean r0 = r14.A00
            if (r0 != 0) goto L_0x04c1
            r2 = 8
        L_0x04c1:
            r1.setVisibility(r2)
            return
        L_0x04c5:
            boolean r1 = r0 instanceof X.AnonymousClass6KA
            if (r1 == 0) goto L_0x04db
            android.view.View r0 = X.C108965cb.A09(r0, r8)
            android.content.Context r0 = r0.getContext()
            X.C18070vi.A0X(r0)
            java.lang.String r0 = "getServerCtaContent"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x04db:
            boolean r1 = r0 instanceof X.AnonymousClass6KF
            if (r1 == 0) goto L_0x0510
            X.6KF r0 = (X.AnonymousClass6KF) r0
            r1 = 0
            X.C18070vi.A0d(r8, r1)
            android.view.View r2 = r0.A00
            r1 = 10
            X.AnonymousClass78M.A00(r2, r0, r8, r1)
            X.6mq r1 = r0.A03
            X.00H r1 = r1.A00
            X.0vd r2 = X.C17880vN.A0P(r1)
            r1 = 5836(0x16cc, float:8.178E-42)
            r2.A0N(r1)
            com.whatsapp.WaTextView r2 = r0.A02
            r1 = 2131896350(0x7f12281e, float:1.9427559E38)
            r2.setText(r1)
            com.whatsapp.WaTextView r1 = r0.A01
            r0 = 2131896348(0x7f12281c, float:1.9427555E38)
            r1.setText(r0)
            java.lang.String r0 = "getServerCtaContent"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0510:
            boolean r1 = r0 instanceof X.AnonymousClass6KE
            if (r1 == 0) goto L_0x055c
            X.6KE r0 = (X.AnonymousClass6KE) r0
            X.6JM r14 = (X.AnonymousClass6JM) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            X.1E7 r5 = r14.A00
            if (r5 == 0) goto L_0x0530
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r4 = r0.A05
            r3 = 0
            X.1BI r1 = r5.A0J
            boolean r1 = X.C22971Dz.A0Z(r1)
            if (r1 == 0) goto L_0x0554
            X.1VW r1 = r0.A01
            r1.A0C(r4, r5)
        L_0x0530:
            android.view.View r5 = r0.A0H
            X.AnonymousClass3MW.A1Q(r5)
            com.whatsapp.TextEmojiLabel r4 = r0.A00
            android.content.Context r3 = r4.getContext()
            r2 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r1 = 2131101314(0x7f060682, float:1.7815034E38)
            X.C72463Mc.A0y(r3, r4, r2, r1)
            android.content.Context r2 = r5.getContext()
            r1 = 2131886256(0x7f1200b0, float:1.9407086E38)
            X.AnonymousClass3MY.A0w(r2, r5, r1)
            r1 = 31
            X.AnonymousClass3Ma.A1E(r5, r0, r1)
            return
        L_0x0554:
            X.1pZ r2 = r0.A02
            X.AQC r1 = r0.A03
            r2.A05(r4, r1, r5, r3)
            goto L_0x0530
        L_0x055c:
            boolean r1 = r0 instanceof X.C121496Jw
            if (r1 == 0) goto L_0x056a
            android.view.View r1 = X.C108965cb.A09(r0, r14)
            r0 = 30
            X.AnonymousClass3Ma.A1E(r1, r14, r0)
            return
        L_0x056a:
            boolean r1 = r0 instanceof X.AnonymousClass6K3
            if (r1 == 0) goto L_0x0578
            X.6K3 r0 = (X.AnonymousClass6K3) r0
            android.view.View r2 = r0.A00
            r1 = 29
            X.AnonymousClass3Ma.A1E(r2, r0, r1)
            return
        L_0x0578:
            boolean r1 = r0 instanceof X.AnonymousClass6K0
            if (r1 == 0) goto L_0x05a4
            X.6K0 r0 = (X.AnonymousClass6K0) r0
            X.6JQ r14 = (X.AnonymousClass6JQ) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            android.view.View r2 = r0.A0H
            r1 = 28
            X.AnonymousClass3Ma.A1E(r2, r14, r1)
            int r3 = r14.A00
            if (r3 <= 0) goto L_0x0022
            com.whatsapp.WaTextView r2 = r0.A00
            android.content.res.Resources r1 = r2.getResources()
            if (r1 == 0) goto L_0x0022
            r0 = 2131755490(0x7f1001e2, float:1.914186E38)
            java.lang.String r0 = X.C72473Md.A0k(r1, r3, r0)
            if (r0 == 0) goto L_0x0022
            r2.setText(r0)
            return
        L_0x05a4:
            boolean r1 = r0 instanceof X.C121456Js
            if (r1 == 0) goto L_0x05b0
            X.6Js r0 = (X.C121456Js) r0
            X.6J8 r14 = (X.AnonymousClass6J8) r14
            r0.A0J(r14)
            return
        L_0x05b0:
            boolean r1 = r0 instanceof X.C121426Jp
            if (r1 == 0) goto L_0x0678
            X.6Jp r0 = (X.C121426Jp) r0
            X.6JC r14 = (X.AnonymousClass6JC) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            X.1E7 r1 = r14.A00
            com.whatsapp.status.ContactStatusThumbnail r6 = r0.A05
            X.C18070vi.A0W(r6)
            r0.A0D(r6, r1)
            r0.A0G(r6, r14)
            X.2sx r1 = r14.A00()
            r3 = 0
            if (r1 == 0) goto L_0x0675
            int r10 = r1.A00()
        L_0x05d4:
            X.6nQ r1 = r14.A05
            X.6nP r1 = r1.A02
            java.util.Set r7 = r1.A01
            boolean r9 = X.C108945cZ.A1U(r7)
            if (r10 == 0) goto L_0x05e7
            if (r9 != 0) goto L_0x05e7
            boolean r1 = r0.A08
            r5 = 0
            if (r1 == 0) goto L_0x05e8
        L_0x05e7:
            r5 = 1
        L_0x05e8:
            android.view.ViewStub r2 = r0.A02
            X.C18070vi.A0W(r2)
            int r1 = X.C72453Mb.A0J(r5)
            r2.setVisibility(r1)
            android.view.View r2 = r0.A01
            boolean r4 = r0.A08
            if (r4 == 0) goto L_0x0672
            if (r9 != 0) goto L_0x0672
        L_0x05fc:
            r2.setVisibility(r3)
            r1 = 40
            X.AnonymousClass3Ma.A1E(r2, r0, r1)
            android.widget.ImageView r3 = r0.A00
            if (r3 != 0) goto L_0x0615
            if (r5 == 0) goto L_0x0615
            android.view.View r2 = r0.A0H
            r1 = 2131435615(0x7f0b205f, float:1.8493077E38)
            android.widget.ImageView r3 = X.C108975cc.A0B(r2, r1)
            r0.A00 = r3
        L_0x0615:
            java.lang.String r1 = "statusBadge"
            if (r9 == 0) goto L_0x0661
            if (r3 == 0) goto L_0x0d73
            r2 = 2131233517(0x7f080aed, float:1.8083174E38)
        L_0x061e:
            r3.setImageResource(r2)
        L_0x0621:
            com.whatsapp.TextEmojiLabel r5 = r0.A03
            r1 = 2131892379(0x7f12189b, float:1.9419505E38)
            r5.setText(r1)
            X.AnonymousClass3MW.A1Q(r5)
            android.view.View r4 = r0.A0H
            android.content.Context r1 = r4.getContext()
            int r0 = X.C124256Xq.A00(r14)
            X.AnonymousClass3MY.A0w(r1, r5, r0)
            r5.A0N()
            android.content.Context r3 = r5.getContext()
            boolean r2 = X.C108945cZ.A1U(r7)
            r1 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r0 = 2131101314(0x7f060682, float:1.7815034E38)
            if (r2 == 0) goto L_0x0652
            r1 = 2130971379(0x7f040af3, float:1.7551495E38)
            r0 = 2131102602(0x7f060b8a, float:1.7817647E38)
        L_0x0652:
            X.C72463Mc.A0y(r3, r5, r1, r0)
            android.content.Context r1 = r4.getContext()
            int r0 = X.C124256Xq.A00(r14)
            X.AnonymousClass3MY.A0w(r1, r6, r0)
            return
        L_0x0661:
            if (r10 == 0) goto L_0x0665
            if (r4 == 0) goto L_0x0621
        L_0x0665:
            if (r3 == 0) goto L_0x0d73
            boolean r1 = X.C22891Dp.A02
            r2 = 2131232714(0x7f0807ca, float:1.8081545E38)
            if (r1 == 0) goto L_0x061e
            r2 = 2131232715(0x7f0807cb, float:1.8081547E38)
            goto L_0x061e
        L_0x0672:
            r3 = 8
            goto L_0x05fc
        L_0x0675:
            r10 = 0
            goto L_0x05d4
        L_0x0678:
            boolean r1 = r0 instanceof X.C121446Jr
            if (r1 == 0) goto L_0x06f3
            X.6Jr r0 = (X.C121446Jr) r0
            X.6J8 r14 = (X.AnonymousClass6J8) r14
            boolean r1 = r0 instanceof X.C121386Jl
            if (r1 == 0) goto L_0x0a57
            X.6Jl r0 = (X.C121386Jl) r0
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            r0.A05 = r1
            android.view.View r2 = r0.A0H
            java.lang.Object r1 = r2.getTag()
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x06aa
            int r6 = r0.A00
            long r3 = r0.A01
            java.lang.String r5 = r0.A04
            X.1E7 r1 = r14.A01()
            boolean r1 = X.AnonymousClass73U.A00(r1, r5, r6, r3)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x06b6
        L_0x06aa:
            r0.A0I(r14)
            r0.A0H(r14)
            r0.A0J(r14)
            r0.A0L(r14)
        L_0x06b6:
            r0.A0K(r14)
            boolean r1 = r0.A0C
            if (r1 == 0) goto L_0x09da
            boolean r1 = r14 instanceof X.AnonymousClass6JC
            if (r1 == 0) goto L_0x0022
            r1 = r14
            X.6JC r1 = (X.AnonymousClass6JC) r1
            if (r1 == 0) goto L_0x0022
            X.6nQ r1 = r1.A05
            X.2sx r1 = r1.A00
            if (r1 == 0) goto L_0x06d2
            int r1 = r1.A00()
            if (r1 != 0) goto L_0x0022
        L_0x06d2:
            X.0vl r1 = r0.A0B
            java.lang.Object r4 = r1.getValue()
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x0022
            X.1pZ r3 = r0.A00
            X.1E7 r5 = r14.A01()
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131168739(0x7f070de3, float:1.7951788E38)
            int r7 = r1.getDimensionPixelSize(r0)
            r6 = 0
            r8 = 0
            r3.A09(r4, r5, r6, r7, r8)
            return
        L_0x06f3:
            boolean r1 = r0 instanceof X.C121406Jn
            if (r1 == 0) goto L_0x074e
            X.6Jn r0 = (X.C121406Jn) r0
            X.6JB r14 = (X.AnonymousClass6JB) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            android.view.ViewStub r2 = r0.A01
            r1 = 8
            r2.setVisibility(r1)
            X.2sx r10 = r14.A01
            X.1E7 r9 = r14.A00
            X.1Me r7 = r0.A03
            java.lang.String r6 = r7.A0N(r9)
            android.view.View r5 = r0.A00
            r1 = 2131429428(0x7f0b0834, float:1.8480528E38)
            android.view.View r4 = r5.findViewById(r1)
            com.whatsapp.status.ContactStatusThumbnail r3 = r0.A05
            X.C18070vi.A0W(r3)
            r0.A0D(r3, r9)
            java.util.Map r1 = r3.A05
            r1.clear()
            int r2 = r10.A01()
            int r1 = r10.A00()
            r3.A07(r2, r1)
            java.lang.String r2 = r7.A0N(r9)
            X.1xh r1 = r0.A02
            r1.A0B(r8, r2)
            X.AnonymousClass3MW.A1Q(r4)
            if (r6 == 0) goto L_0x0744
            X.0vb r1 = r0.A04
            r0.A0F(r1, r14, r6)
        L_0x0744:
            r1 = 7
            X.AnonymousClass78M.A00(r5, r0, r14, r1)
            r1 = 15
            X.C1421578j.A00(r5, r14, r0, r1)
            return
        L_0x074e:
            boolean r1 = r0 instanceof X.C121416Jo
            if (r1 == 0) goto L_0x0871
            X.6Jo r0 = (X.C121416Jo) r0
            X.6JB r14 = (X.AnonymousClass6JB) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            com.whatsapp.status.ContactStatusThumbnail r4 = r0.A05
            r0.A0G(r4, r14)
            X.1E7 r1 = r14.A00
            X.1BI r1 = r1.A0J
            boolean r1 = X.C22971Dz.A0Z(r1)
            if (r1 != 0) goto L_0x086a
            X.1Lc r1 = r0.A06
            X.0ve r3 = r1.A01
            r2 = 5630(0x15fe, float:7.89E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 != 0) goto L_0x086a
            r2 = 0
            r1 = 1
            r0.A0E(r4, r14, r2, r1)
        L_0x077c:
            android.widget.ImageView r2 = r0.A00
            r1 = 8
            r2.setVisibility(r1)
            X.1E7 r2 = r14.A00
            X.1Me r1 = r0.A03
            java.lang.String r4 = r1.A0N(r2)
            X.1xh r7 = r0.A02
            r7.A0B(r8, r4)
            android.view.View r5 = r0.A0H
            android.content.Context r8 = r5.getContext()
            X.1BI r6 = r2.A0J
            boolean r1 = X.C22971Dz.A0Z(r6)
            r3 = 0
            if (r1 == 0) goto L_0x0865
            r1 = 1
            r7.A03(r1)
        L_0x07a3:
            boolean r1 = A00(r5)
            r2 = 8
            if (r1 == 0) goto L_0x083f
            boolean r1 = X.C22971Dz.A0Z(r6)
            if (r1 != 0) goto L_0x0857
            android.widget.TextView r6 = r0.A01
            r6.setVisibility(r3)
            r2 = 2130971979(0x7f040d4b, float:1.7552712E38)
            r1 = 2131103154(0x7f060db2, float:1.7818766E38)
        L_0x07bc:
            int r1 = X.AnonymousClass1YL.A00(r8, r2, r1)
        L_0x07c0:
            int r2 = X.C19740yt.A00(r8, r1)
            com.whatsapp.TextEmojiLabel r1 = r7.A01
            r1.setTextColor(r2)
            if (r4 == 0) goto L_0x07d0
            X.0vb r1 = r0.A04
            r0.A0F(r1, r14, r4)
        L_0x07d0:
            X.2sx r1 = r14.A01
            int r1 = r1.A00()
            r4 = 0
            if (r1 != 0) goto L_0x0822
            r6.setVisibility(r3)
            r1 = 2131886521(0x7f1201b9, float:1.9407623E38)
            r6.setText(r1)
        L_0x07e2:
            r1 = 6
            X.AnonymousClass78M.A00(r5, r0, r14, r1)
            r1 = 14
            X.C1421578j.A00(r5, r14, r0, r1)
            r5.setTag(r14)
            r1 = 2131432882(0x7f0b15b2, float:1.8487534E38)
            android.view.View r4 = r5.findViewById(r1)
            r1 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r3 = r5.findViewById(r1)
            boolean r1 = r14.A07
            r2 = 8
            if (r1 == 0) goto L_0x0817
            if (r3 == 0) goto L_0x0809
            r1 = 1056964608(0x3f000000, float:0.5)
            r3.setAlpha(r1)
        L_0x0809:
            X.C18070vi.A0b(r4)
            boolean r0 = r0.A08
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0813
            r2 = 0
        L_0x0813:
            r4.setVisibility(r2)
            return
        L_0x0817:
            if (r3 == 0) goto L_0x081e
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r0)
        L_0x081e:
            X.C18070vi.A0b(r4)
            goto L_0x0813
        L_0x0822:
            X.1Lc r1 = r0.A06
            X.0ve r3 = r1.A01
            r2 = 9813(0x2655, float:1.3751E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 != 0) goto L_0x0832
            r4 = 8
        L_0x0832:
            r6.setVisibility(r4)
            java.lang.CharSequence r1 = r14.A05
            if (r1 != 0) goto L_0x083b
            java.lang.String r1 = ""
        L_0x083b:
            r6.setText(r1)
            goto L_0x07e2
        L_0x083f:
            com.whatsapp.TextEmojiLabel r1 = r7.A01
            X.C43421zm.A04(r1)
            boolean r1 = X.C22971Dz.A0Z(r6)
            if (r1 != 0) goto L_0x0857
            android.widget.TextView r6 = r0.A01
            r6.setVisibility(r3)
            r2 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r1 = 2131101314(0x7f060682, float:1.7815034E38)
            goto L_0x07bc
        L_0x0857:
            android.widget.TextView r6 = r0.A01
            r6.setVisibility(r2)
            r1 = 2130970344(0x7f0406e8, float:1.7549395E38)
            int r1 = X.AnonymousClass4Z9.A00(r8, r1)
            goto L_0x07c0
        L_0x0865:
            r7.A03(r3)
            goto L_0x07a3
        L_0x086a:
            X.1E7 r1 = r14.A00
            r0.A0D(r4, r1)
            goto L_0x077c
        L_0x0871:
            boolean r1 = r0 instanceof X.C121476Ju
            if (r1 == 0) goto L_0x08a2
            r3 = 0
            X.C18070vi.A0d(r14, r3)
            boolean r1 = r14 instanceof X.AnonymousClass6JJ
            if (r1 == 0) goto L_0x0022
            X.6JJ r14 = (X.AnonymousClass6JJ) r14
            if (r14 == 0) goto L_0x0022
            java.lang.Integer r1 = r14.A00
            int r2 = r1.intValue()
            if (r2 == r3) goto L_0x089e
            r1 = 1
            if (r2 == r1) goto L_0x089a
            r1 = 2
            if (r2 != r1) goto L_0x0dda
            r1 = 2131893417(0x7f121ca9, float:1.942161E38)
        L_0x0892:
            android.view.View r0 = r0.A0H
            android.widget.TextView r0 = X.C108975cc.A0C(r0)
            goto L_0x0465
        L_0x089a:
            r1 = 2131890493(0x7f12113d, float:1.941568E38)
            goto L_0x0892
        L_0x089e:
            r1 = 2131896303(0x7f1227ef, float:1.9427463E38)
            goto L_0x0892
        L_0x08a2:
            boolean r1 = r0 instanceof X.AnonymousClass6KH
            if (r1 == 0) goto L_0x09cd
            X.6KH r0 = (X.AnonymousClass6KH) r0
            X.6Jf r14 = (X.C121326Jf) r14
            r3 = 0
            X.C18070vi.A0d(r14, r3)
            boolean r10 = r14.A01
            X.1bI r7 = r0.A0C
            android.view.View r2 = X.AnonymousClass3MX.A0D(r7)
            r1 = 0
            if (r10 != 0) goto L_0x08bb
            r3 = 8
        L_0x08bb:
            r2.setVisibility(r3)
            com.whatsapp.WaImageView r6 = r0.A04
            if (r10 == 0) goto L_0x08c3
            r1 = 4
        L_0x08c3:
            r6.setVisibility(r1)
            r0.A00 = r14
            X.1E7 r1 = r14.A00
            X.1pZ r5 = r0.A06
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r4 = r0.A0D
            r5.A07(r4, r1)
            X.2Dk r3 = r14.A02
            long r1 = r3.A0G
            X.4XM r11 = r0.A09
            int r9 = (int) r1
            int r13 = X.AnonymousClass4XM.A00(r11, r9)
            java.lang.String r12 = r11.A01(r13)
            r1 = 1
            X.C18070vi.A0d(r12, r1)
            com.whatsapp.WaTextView r11 = r0.A05
            android.content.res.Resources r9 = X.AnonymousClass000.A0Y(r11)
            r2 = 2131755092(0x7f100054, float:1.9141054E38)
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r12, r1)
            X.AnonymousClass3MX.A1E(r9, r11, r1, r2, r13)
            boolean r1 = r3.A0P()
            if (r1 == 0) goto L_0x0967
            r1 = 8
            r7.A04(r1)
            r6.setVisibility(r1)
        L_0x0902:
            boolean r1 = r6.isSelected()
            r9 = 2131894872(0x7f122258, float:1.9424561E38)
            if (r1 == 0) goto L_0x090e
            r9 = 2131890492(0x7f12113c, float:1.9415677E38)
        L_0x090e:
            android.content.Context r7 = r6.getContext()
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            com.whatsapp.TextEmojiLabel r1 = r0.A02
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = X.C108975cc.A0b(r7, r1, r2, r9)
            r6.setContentDescription(r1)
            java.lang.String r7 = "Button"
            X.AnonymousClass1Y5.A07(r6, r7)
            X.1E7 r1 = r14.A00
            r5.A07(r4, r1)
            X.1xh r2 = r0.A03
            X.1E7 r1 = r14.A00
            r2.A0A(r1, r8)
            android.view.View r4 = r0.A0H
            boolean r1 = A00(r4)
            if (r1 != 0) goto L_0x0941
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            X.C43421zm.A04(r1)
        L_0x0941:
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            X.AnonymousClass1Y5.A07(r1, r7)
            int r2 = r0.A05()
            r1 = -1
            if (r2 == r1) goto L_0x0022
            int r2 = r0.A05()
            X.1c4 r1 = r0.A07
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x0022
            X.6l1 r1 = r0.A01
            X.1ch r0 = r3.A0M()
            X.6nf r0 = r1.A00(r4, r0, r2)
            r0.A00()
            return
        L_0x0967:
            X.6lO r9 = r0.A08
            X.1bI r2 = r0.A0B
            android.view.View r1 = r2.A02()
            android.content.Context r1 = X.AnonymousClass3MY.A04(r1)
            boolean r1 = r9.A00(r1)
            if (r1 == 0) goto L_0x09be
            r1 = 8
            r7.A04(r1)
            r6.setVisibility(r1)
            android.view.View r9 = r2.A02()
            com.whatsapp.WaButtonWithLoader r9 = (com.whatsapp.WaButtonWithLoader) r9
            X.C18070vi.A0b(r9)
            r7 = 0
            r9.setVisibility(r7)
            if (r10 == 0) goto L_0x09ba
            r9.A02()
        L_0x0993:
            X.9Ig r2 = r3.A02
            X.9Ig r1 = X.C179509Ig.GUEST
            boolean r1 = X.AnonymousClass000.A1Z(r2, r1)
            if (r1 == 0) goto L_0x09ad
            X.1Xz r1 = X.C27881Xz.TONAL
            r9.setVariant(r1)
            r1 = 2131890489(0x7f121139, float:1.9415671E38)
            r9.setButtonText((int) r1)
        L_0x09a8:
            r9.setSelected(r7)
            goto L_0x0902
        L_0x09ad:
            X.1Xz r1 = X.C27881Xz.OUTLINE
            r9.setVariant(r1)
            r1 = 2131890498(0x7f121142, float:1.941569E38)
            r9.setButtonText((int) r1)
            r7 = 1
            goto L_0x09a8
        L_0x09ba:
            r9.A01()
            goto L_0x0993
        L_0x09be:
            X.9Ig r2 = r3.A02
            X.9Ig r1 = X.C179509Ig.GUEST
            boolean r1 = X.AnonymousClass000.A1Z(r2, r1)
            r1 = r1 ^ 1
            r6.setSelected(r1)
            goto L_0x0902
        L_0x09cd:
            boolean r1 = r0 instanceof X.C121526Jz
            if (r1 == 0) goto L_0x0b54
            X.6Jz r0 = (X.C121526Jz) r0
            com.whatsapp.WaTextView r1 = r0.A00
            r0 = 2131895498(0x7f1224ca, float:1.942583E38)
            goto L_0x0032
        L_0x09da:
            X.6J8 r3 = r0.A02
            boolean r1 = r3 instanceof X.AnonymousClass6JC
            if (r1 == 0) goto L_0x0022
            X.6JC r3 = (X.AnonymousClass6JC) r3
            if (r3 == 0) goto L_0x0022
            X.6nQ r1 = r0.A03
            X.6nQ r2 = r3.A05
            boolean r1 = X.C18070vi.A18(r1, r2)
            if (r1 != 0) goto L_0x0022
            r0.A03 = r2
            X.6nP r9 = r2.A02
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            X.2sx r1 = r3.A00()
            r6 = 0
            if (r1 == 0) goto L_0x0a41
            int r5 = r1.A01()
            int r11 = r1.A00()
        L_0x0a05:
            java.util.List r1 = r2.A03
            java.util.Iterator r10 = r1.iterator()
            r4 = 0
        L_0x0a0c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0a44
            java.lang.Object r2 = r10.next()
            int r3 = r4 + 1
            if (r4 >= 0) goto L_0x0a1e
            X.AnonymousClass1ZU.A0B()
            throw r8
        L_0x0a1e:
            X.206 r2 = (X.AnonymousClass206) r2
            java.util.Set r1 = r9.A01
            X.205 r2 = r2.A0v
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0a31
            X.1sh r1 = X.C39211sh.ERROR
        L_0x0a2c:
            r7.add(r1)
            r4 = r3
            goto L_0x0a0c
        L_0x0a31:
            java.util.Set r1 = r9.A02
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0a3e
            if (r4 < r5) goto L_0x0a3e
            X.1sh r1 = X.C39211sh.SEEN
            goto L_0x0a2c
        L_0x0a3e:
            X.1sh r1 = X.C39211sh.UNSEEN
            goto L_0x0a2c
        L_0x0a41:
            r5 = 0
            r11 = 0
            goto L_0x0a05
        L_0x0a44:
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = r0.A0D
            if (r1 == 0) goto L_0x0022
            X.2QH r0 = new X.2QH
            r0.<init>(r7)
            r1.setProfileStatus(r0)
            if (r11 <= 0) goto L_0x0a53
            r6 = 1
        L_0x0a53:
            r1.setStatusIndicatorEnabled(r6)
            return
        L_0x0a57:
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            android.view.View r7 = r0.A0H
            java.lang.Object r1 = r7.getTag()
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x0a79
            int r5 = r0.A00
            long r2 = r0.A01
            java.lang.String r4 = r0.A04
            X.1E7 r1 = r14.A01()
            boolean r1 = X.AnonymousClass73U.A00(r1, r4, r5, r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0a85
        L_0x0a79:
            r0.A0I(r14)
            r0.A0H(r14)
            r0.A0J(r14)
            r0.A0L(r14)
        L_0x0a85:
            r0.A0K(r14)
            boolean r1 = r14 instanceof X.AnonymousClass6JB
            if (r1 == 0) goto L_0x0aca
            r1 = r14
            X.6JB r1 = (X.AnonymousClass6JB) r1
            if (r1 == 0) goto L_0x0aca
            X.2sx r4 = r1.A01
            boolean r1 = r0.A0G
            if (r1 == 0) goto L_0x0aff
            int r1 = r4.A01()
            boolean r5 = X.AnonymousClass000.A1R(r1)
            android.view.View r4 = r0.A06
            if (r4 == 0) goto L_0x0aca
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.Object r1 = r4.getTag(r1)
            boolean r1 = X.C18070vi.A18(r2, r1)
            if (r1 != 0) goto L_0x0aca
            r3 = 2131233028(0x7f080904, float:1.8082182E38)
            if (r5 == 0) goto L_0x0abb
            r3 = 2131233029(0x7f080905, float:1.8082184E38)
        L_0x0abb:
            android.content.res.Resources r2 = r7.getResources()
            android.content.res.Resources$Theme r1 = X.AnonymousClass3Ma.A06(r7)
            android.graphics.drawable.Drawable r1 = X.C40501uo.A00(r1, r2, r3)
            r4.setBackground(r1)
        L_0x0aca:
            r0.A02 = r14
            r4 = 0
            X.2sx r8 = r14.A00()
            if (r8 == 0) goto L_0x0022
            X.6J8 r3 = r0.A02
            if (r3 == 0) goto L_0x0022
            boolean r2 = r3 instanceof X.AnonymousClass6JC
            if (r2 == 0) goto L_0x0afc
            r1 = r3
            X.6JC r1 = (X.AnonymousClass6JC) r1
            X.6rQ r1 = r1.A04
        L_0x0ae0:
            if (r1 == 0) goto L_0x0ae6
            X.206 r5 = r1.A00
            if (r5 != 0) goto L_0x0d77
        L_0x0ae6:
            if (r2 == 0) goto L_0x0af6
            r1 = r3
            X.6JC r1 = (X.AnonymousClass6JC) r1
            X.206 r5 = r1.A02
        L_0x0aed:
            if (r5 != 0) goto L_0x0d77
            X.206 r5 = r3.A02()
            if (r5 != 0) goto L_0x0d77
            return
        L_0x0af6:
            r1 = r3
            X.6JB r1 = (X.AnonymousClass6JB) r1
            X.206 r5 = r1.A03
            goto L_0x0aed
        L_0x0afc:
            X.6rQ r1 = r3.A01
            goto L_0x0ae0
        L_0x0aff:
            int r3 = r4.A01()
            int r2 = r4.A00()
            int r1 = r4.A01()
            int r2 = r2 - r1
            int r1 = r4.A00()
            X.6sL r5 = new X.6sL
            r5.<init>(r3, r2, r1)
            int r1 = r5.A01
            r3 = 32
            if (r1 <= r3) goto L_0x0b24
            int r2 = r5.A02
            int r1 = r5.A00
            X.6sL r5 = new X.6sL
            r5.<init>(r2, r1, r3)
        L_0x0b24:
            X.6sL r1 = r0.A03
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0aca
            r0.A03 = r5
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            int r3 = r5.A01
            r2 = 0
        L_0x0b35:
            if (r2 >= r3) goto L_0x0b46
            int r1 = r5.A02
            if (r2 >= r1) goto L_0x0b43
            X.1sh r1 = X.C39211sh.UNSEEN
        L_0x0b3d:
            r4.add(r1)
            int r2 = r2 + 1
            goto L_0x0b35
        L_0x0b43:
            X.1sh r1 = X.C39211sh.SEEN
            goto L_0x0b3d
        L_0x0b46:
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = r0.A0D
            if (r2 == 0) goto L_0x0aca
            X.2QH r1 = new X.2QH
            r1.<init>(r4)
            r2.setProfileStatus(r1)
            goto L_0x0aca
        L_0x0b54:
            boolean r1 = r0 instanceof X.C121356Ji
            if (r1 != 0) goto L_0x0ddf
            boolean r1 = r0 instanceof X.C121366Jj
            if (r1 != 0) goto L_0x0ddf
            boolean r1 = r0 instanceof X.AnonymousClass6KQ
            if (r1 == 0) goto L_0x0b99
            X.6KQ r0 = (X.AnonymousClass6KQ) r0
            X.6JP r14 = (X.AnonymousClass6JP) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            r0.A00 = r14
            androidx.viewpager2.widget.ViewPager2 r3 = r0.A03
            boolean r1 = r0.A01
            if (r1 != 0) goto L_0x0b83
            r1 = 1
            r0.A01 = r1
            androidx.recyclerview.widget.RecyclerView r1 = r3.A04
            X.1rD r2 = r1.A0B
            if (r2 == 0) goto L_0x0b7e
            X.5lX r1 = r0.A06
            r2.CDq(r1)
        L_0x0b7e:
            X.5nr r1 = r0.A02
            r3.A04(r1)
        L_0x0b83:
            X.8AU r3 = r0.A05
            X.72J r1 = r14.A01
            if (r1 == 0) goto L_0x0b96
            java.util.ArrayList r2 = r1.A02()
        L_0x0b8d:
            X.6zt r1 = r14.A00
            r3.BjN(r1, r2)
            X.AnonymousClass6KQ.A01(r0)
            return
        L_0x0b96:
            X.0wS r2 = X.C18460wS.A00
            goto L_0x0b8d
        L_0x0b99:
            boolean r1 = r0 instanceof X.AnonymousClass6KR
            if (r1 == 0) goto L_0x0bfc
            X.6KR r0 = (X.AnonymousClass6KR) r0
            X.6JP r14 = (X.AnonymousClass6JP) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            r0.A03 = r14
            boolean r1 = r0.A04
            if (r1 != 0) goto L_0x0bec
            r1 = 1
            r0.A04 = r1
            com.whatsapp.collections.ObservableRecyclerView r2 = r0.A09
            if (r2 == 0) goto L_0x0bb7
            X.5lt r1 = r0.A0B
            r2.A0t(r1)
        L_0x0bb7:
            X.0vl r1 = r0.A0J
            java.lang.Object r3 = r1.getValue()
            X.5ka r3 = (X.C111885ka) r3
            r3.A08(r2)
            X.6cr r2 = r0.A0C
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            r3.A00 = r2
            X.8AU r3 = r0.A0A
            boolean r1 = r3 instanceof X.C112425lS
            if (r1 == 0) goto L_0x0bda
            r2 = r3
            X.1rD r2 = (X.C38391rD) r2
            if (r2 == 0) goto L_0x0bda
            X.BLv r1 = r0.A07
            r2.CDq(r1)
        L_0x0bda:
            X.72J r1 = r14.A01
            if (r1 == 0) goto L_0x0bec
            java.util.ArrayList r2 = r1.A02()
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.status.tiles.StatusGridOptimizedAdapter"
            X.C18070vi.A0z(r3, r1)
            X.5lS r3 = (X.C112425lS) r3
            X.C112425lS.A01(r3, r2)
        L_0x0bec:
            com.google.android.material.tabs.TabLayout r3 = r0.A08
            int r2 = X.C108945cZ.A07(r3)
            r1 = 0
            r0 = 1
            if (r2 > r0) goto L_0x0bf8
            r1 = 8
        L_0x0bf8:
            r3.setVisibility(r1)
            return
        L_0x0bfc:
            boolean r1 = r0 instanceof X.AnonymousClass6KG
            if (r1 == 0) goto L_0x0022
            X.6KG r0 = (X.AnonymousClass6KG) r0
            X.6Je r14 = (X.C121316Je) r14
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            r0.A02 = r14
            X.6ch r2 = r0.A01
            if (r2 == 0) goto L_0x0c13
            X.2L7 r1 = r0.A06
            r1.unregisterObserver(r2)
        L_0x0c13:
            X.73S r12 = r0.A00
            if (r12 != 0) goto L_0x0c59
            X.6ax r1 = r0.A05
            android.view.View r13 = r0.A0H
            X.C18070vi.A0W(r13)
            com.whatsapp.updates.ui.UpdatesFragment r5 = r0.A07
            boolean r4 = r14.A04
            X.10H r1 = r1.A00
            X.10E r6 = r1.A00
            X.00S r1 = r6.AC9
            java.lang.Object r3 = r1.get()
            X.1dS r3 = (X.C30141dS) r3
            X.00S r1 = r6.A34
            X.00H r18 = X.C000200d.A00(r1)
            X.10G r2 = r6.A00
            X.00S r1 = r2.A5I
            X.00H r19 = X.C000200d.A00(r1)
            X.00S r1 = r2.A1G
            X.00H r20 = X.C000200d.A00(r1)
            X.00S r1 = r6.A4L
            X.00H r21 = X.C000200d.A00(r1)
            X.1hg r15 = X.C108965cb.A0Z(r6)
            X.73S r12 = new X.73S
            r16 = r5
            r17 = r3
            r22 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.A00 = r12
        L_0x0c59:
            X.6ch r1 = r0.A01
            if (r1 != 0) goto L_0x0c69
            X.6ch r2 = new X.6ch
            r2.<init>(r12)
            X.2L7 r1 = r0.A06
            r1.registerObserver(r2)
            r0.A01 = r2
        L_0x0c69:
            X.73S r1 = r0.A00
            if (r1 == 0) goto L_0x0d07
            X.87y r1 = r1.A00
            if (r1 == 0) goto L_0x0d07
            X.6Up r2 = r1.BPj()
        L_0x0c75:
            X.6Up r1 = r14.A03
            boolean r1 = X.C18070vi.A18(r2, r1)
            if (r1 != 0) goto L_0x0c80
            r12.A04(r14)
        L_0x0c80:
            boolean r1 = r0.A04
            r7 = 1
            if (r1 != 0) goto L_0x0cb5
            r0.A04 = r7
            android.view.View r6 = r0.A0H
            android.content.res.Resources r2 = X.AnonymousClass000.A0Y(r6)
            int r1 = r14.A02
            int r5 = X.AnonymousClass3MW.A01(r2, r1)
            android.view.ViewGroup$MarginLayoutParams r1 = X.C108995ce.A0L(r6)
            if (r1 == 0) goto L_0x0d05
            int r4 = r1.leftMargin
        L_0x0c9b:
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            boolean r1 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0d03
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L_0x0d03
            int r3 = r2.rightMargin
        L_0x0ca9:
            int r2 = X.C108995ce.A02(r6)
            X.1sv r1 = new X.1sv
            r1.<init>(r4, r5, r3, r2)
            X.C43531zx.A03(r6, r1)
        L_0x0cb5:
            boolean r1 = r0.A03
            if (r1 != 0) goto L_0x0022
            r0.A03 = r7
            android.view.View r2 = r0.A0H
            int r1 = r2.getId()
            r0 = 2131436557(0x7f0b240d, float:1.8494988E38)
            if (r1 != r0) goto L_0x0d00
            int r1 = r14.A01
        L_0x0cc8:
            r0 = 2131427795(0x7f0b01d3, float:1.8477216E38)
            android.view.View r5 = r2.findViewById(r0)
            if (r5 == 0) goto L_0x0022
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r2)
            int r4 = X.AnonymousClass3MW.A01(r0, r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.C108995ce.A0L(r5)
            if (r0 == 0) goto L_0x0cfe
            int r3 = r0.topMargin
        L_0x0ce1:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0cfc
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x0cfc
            int r2 = r1.rightMargin
        L_0x0cef:
            int r1 = X.C108995ce.A02(r5)
            X.1sv r0 = new X.1sv
            r0.<init>(r4, r3, r2, r1)
            X.C43531zx.A03(r5, r0)
            return
        L_0x0cfc:
            r2 = 0
            goto L_0x0cef
        L_0x0cfe:
            r3 = 0
            goto L_0x0ce1
        L_0x0d00:
            int r1 = r14.A00
            goto L_0x0cc8
        L_0x0d03:
            r3 = 0
            goto L_0x0ca9
        L_0x0d05:
            r4 = 0
            goto L_0x0c9b
        L_0x0d07:
            r2 = 0
            goto L_0x0c75
        L_0x0d0a:
            X.6Pj r0 = X.AnonymousClass6Pj.A00
            r4.setAddOnType(r0)
            return
        L_0x0d10:
            android.view.View r2 = r0.A02
            if (r1 == 0) goto L_0x0d2b
            X.C18070vi.A0W(r2)
            r2.setVisibility(r3)
            android.view.View r1 = r0.A01
            X.C18070vi.A0W(r1)
            r1.setVisibility(r5)
        L_0x0d22:
            android.view.View r0 = r0.A00
            X.C18070vi.A0W(r0)
            r0.setVisibility(r3)
            return
        L_0x0d2b:
            X.C18070vi.A0W(r2)
            X.0Iy r1 = r0.A04
            X.01m r1 = r1.A03
            X.C18070vi.A0X(r1)
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0d3d
            r6 = 8
        L_0x0d3d:
            r2.setVisibility(r6)
            int r1 = r2.getVisibility()
            if (r1 != 0) goto L_0x0d51
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            if (r2 == 0) goto L_0x0d51
            r1 = 27
            X.AnonymousClass793.A00(r2, r0, r1)
        L_0x0d51:
            android.view.View r1 = r0.A01
            X.C18070vi.A0W(r1)
            r1.setVisibility(r3)
            goto L_0x0d22
        L_0x0d5a:
            r0 = 2131431358(0x7f0b0fbe, float:1.8484443E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r1, r0)
            r0 = 2131892625(0x7f121991, float:1.9420004E38)
            r2.setText(r0)
            float r1 = X.C108985cd.A01(r2)
            r0 = 0
            r2.setTextSize(r0, r1)
            X.C43421zm.A04(r2)
            return
        L_0x0d73:
            X.C18070vi.A11(r1)
            throw r8
        L_0x0d77:
            com.whatsapp.jid.UserJid r2 = r8.A0A
            X.C18070vi.A0X(r2)
            boolean r1 = r0.A0F
            if (r1 != 0) goto L_0x0dd2
            boolean r1 = X.C22971Dz.A0Z(r2)
            if (r1 != 0) goto L_0x0dd2
            com.whatsapp.WaTextView r6 = r0.A09
            r6.setVisibility(r4)
            X.11P r3 = r0.A0A
            X.0vb r2 = r6.getWhatsAppLocale()
            long r0 = r5.A0I
            java.lang.String r5 = X.C108965cb.A0q(r3, r2, r0)
            X.C18070vi.A0X(r5)
            r6.setText(r5)
            r6.setCompoundDrawablesWithIntrinsicBounds(r4, r4, r4, r4)
            r4 = 1
            int r3 = r8.A01()
            int r2 = r8.A00()
            android.content.res.Resources r1 = X.AnonymousClass3MX.A05(r7)
            if (r3 <= 0) goto L_0x0dca
            r0 = 2131755450(0x7f1001ba, float:1.914178E38)
            java.lang.String r2 = X.C72473Md.A0k(r1, r3, r0)
        L_0x0db6:
            X.C18070vi.A0b(r2)
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r5)
            r0 = 32
            java.lang.String r0 = X.C17890vO.A0Z(r2, r1, r0)
            r6.setContentDescription(r0)
            r6.setImportantForAccessibility(r4)
            return
        L_0x0dca:
            r0 = 2131755451(0x7f1001bb, float:1.9141782E38)
            java.lang.String r2 = X.C72473Md.A0k(r1, r2, r0)
            goto L_0x0db6
        L_0x0dd2:
            com.whatsapp.WaTextView r1 = r0.A09
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0dda:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0ddf:
            X.6KO r0 = (X.AnonymousClass6KO) r0
            X.6JR r14 = (X.AnonymousClass6JR) r14
            r0.A0D(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113585nK.A0C(X.6U0):void");
    }

    public static boolean A00(View view) {
        Context context = view.getContext();
        C18070vi.A0X(context);
        return AnonymousClass1J8.A09(AnonymousClass1J8.A00(context));
    }
}
