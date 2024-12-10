package com.whatsapp.bloks.components;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1FD;
import X.AnonymousClass3MW;
import X.AnonymousClass7RP;
import X.AnonymousClass8d6;
import X.AnonymousClass9WU;
import X.BI8;
import X.BIH;
import X.BIK;
import X.C05;
import X.C0B;
import X.C0J;
import X.C17880vN;
import X.C18070vi;
import X.C20101A7f;
import X.C22402B6f;
import X.C24514C7i;
import X.C24515C7j;
import X.C24750CIm;
import X.C24751CIn;
import X.C25591CiW;
import X.C25601Cig;
import X.C26294Cx6;
import X.C26724DBa;
import X.C72483Me;
import X.CSC;
import X.CXY;
import X.D3L;
import X.D3N;
import X.D8A;
import X.D8B;
import X.D8F;
import X.DOY;
import X.E6Q;
import X.EAQ;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import com.facebook.common.util.redex.OriginalClassName;
import java.util.Deque;
import java.util.Iterator;

public class BkCdsBottomSheetFragment extends DialogFragment implements AnonymousClass1FD, C22402B6f {
    public AnonymousClass9WU A00;
    public CXY A01;
    public D8A A02;
    public final D8B A03 = new D8B(this);

    public static void A02(Activity activity, int i) {
        AnonymousClass7RP r2 = new AnonymousClass7RP(activity, i, 3);
        if (Build.VERSION.SDK_INT != 26 || activity.getApplicationInfo().targetSdkVersion <= 26 || (!A03(activity, 16842840) && !A03(activity, 16842839) && !A03(activity, 16843763))) {
            try {
                r2.run();
            } catch (IllegalStateException e) {
                if ("Only fullscreen activities can request orientation".equals(e.getMessage())) {
                    Object[] A1a = AnonymousClass3MW.A1a();
                    A1a[0] = OriginalClassName.getClassSimpleName(activity);
                    C26294Cx6.A0E("FixedOrientationCompat", "%s hit fixed orientation exception", e, A1a);
                    return;
                }
                throw e;
            }
        }
    }

    public static D8A A00(BkCdsBottomSheetFragment bkCdsBottomSheetFragment) {
        D8A d8a = bkCdsBottomSheetFragment.A02;
        if (d8a != null) {
            return d8a;
        }
        throw AnonymousClass000.A0n("Must initialize bottom sheet delegate!");
    }

    public static boolean A03(Activity activity, int i) {
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.type != 18 || typedValue.data == 0) {
            return false;
        }
        return true;
    }

    public void A20(Bundle bundle) {
        D8A d8a = this.A02;
        if (d8a != null) {
            bundle.putBundle("open_screen_config", d8a.A0B.A00());
        }
        super.A20(bundle);
    }

    public static BkCdsBottomSheetFragment A01(D8F d8f, String str) {
        Bundle A0D = C17880vN.A0D();
        A0D.putString("request_data", str);
        A0D.putBundle("open_screen_config", d8f.A00());
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment = new BkCdsBottomSheetFragment();
        bkCdsBottomSheetFragment.A1R(A0D);
        return bkCdsBottomSheetFragment;
    }

    public void A1K() {
        super.A1K();
        D8A d8a = this.A02;
        if (d8a != null) {
            D3L d3l = d8a.A0B.A00;
            if (d3l != null) {
                d3l.A00.CGI();
            }
            Runnable runnable = d8a.A09;
            if (runnable != null) {
                runnable.run();
            }
            d8a.A02 = null;
            d8a.A01 = null;
            d8a.A05 = null;
            d8a.A09 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.BI8, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        D8A A002 = A00(this);
        Context A14 = A14();
        D8F d8f = A002.A0B;
        DOY doy = new DOY(A14, d8f.A0F);
        A002.A07 = doy;
        C24750CIm cIm = new C24750CIm(A002);
        C24751CIn cIn = new C24751CIn(A002);
        A002.A04 = new C25601Cig(A14, cIm, doy, d8f.A0E, d8f.A0I);
        E6Q e6q = A002.A07;
        if (e6q != null) {
            A002.A03 = new C25591CiW(A14, cIm, cIn, e6q);
            Activity A003 = C20101A7f.A00(A14);
            if (A003 != null) {
                A002.A08 = Integer.valueOf(A003.getRequestedOrientation());
                A02(A003, 1);
            }
            C0B c0b = A002.A06;
            ? frameLayout = new FrameLayout(A14);
            frameLayout.A02 = c0b;
            Context context = frameLayout.getContext();
            frameLayout.A00 = new FrameLayout(context);
            frameLayout.A01 = new BIK(context);
            frameLayout.getContentPager().A01 = frameLayout.A02.wrapsContent;
            frameLayout.getContentPager().setImportantForAccessibility(1);
            frameLayout.addView(frameLayout.getContentPager());
            frameLayout.addView(frameLayout.getHeaderContainer());
            A002.A01 = frameLayout;
            frameLayout.getContentPager().A00 = A002;
            E6Q e6q2 = A002.A07;
            if (e6q2 != null) {
                Integer num = AnonymousClass00R.A0C;
                C26724DBa dBa = C26724DBa.A00;
                float A004 = C24515C7j.A00(A14, (float) dBa.BG2(num));
                C05 c05 = d8f.A0A;
                C24514C7i c7i = C24514C7i.$redex_init_class;
                int ordinal = c05.ordinal();
                float[] fArr = new float[8];
                fArr[0] = A004;
                if (ordinal != 1) {
                    C72483Me.A19(fArr, A004);
                } else {
                    fArr[1] = A004;
                    fArr[2] = A004;
                    fArr[3] = A004;
                    fArr[4] = 0.0f;
                    fArr[5] = 0.0f;
                    fArr[6] = 0.0f;
                    fArr[7] = 0.0f;
                }
                D3N BFD = dBa.BFD(C0J.A2T);
                dBa.BLN(AnonymousClass00R.A0u);
                BIH bih = new BIH(A14, frameLayout, dBa.BFD(C0J.A1Y), BFD, d8f, e6q2, fArr);
                A002.A02 = bih;
                CSC csc = (CSC) A002.A0C.peek();
                if (csc != null) {
                    EAQ eaq = csc.A04;
                    if (csc.A00 == null) {
                        View Bbb = eaq.Bbb(A14);
                        C18070vi.A0X(Bbb);
                        csc.A00 = Bbb;
                        BIK.A02(Bbb, frameLayout.getContentPager(), AnonymousClass00R.A00, false);
                        D8A.A03(A002, eaq);
                        eaq.CA6();
                    } else {
                        throw AnonymousClass000.A0n("NavStack entry should have no view associated at Fragment's view creation");
                    }
                }
                return bih;
            }
        }
        C18070vi.A11("isDarkModeProvider");
        throw null;
    }

    public void A1r() {
        super.A1r();
        D8A d8a = this.A02;
        if (d8a != null) {
            Context A14 = A14();
            Deque<CSC> deque = d8a.A0C;
            for (CSC csc : deque) {
                csc.A04.destroy();
            }
            deque.clear();
            Integer num = d8a.A08;
            if (num != null) {
                int intValue = num.intValue();
                Activity A002 = C20101A7f.A00(A14);
                if (A002 != null) {
                    A02(A002, intValue);
                    d8a.A08 = null;
                }
            }
        }
    }

    public void A1s() {
        super.A1s();
        D8A d8a = this.A02;
        if (d8a != null) {
            BI8 bi8 = d8a.A01;
            if (bi8 != null) {
                bi8.getHeaderContainer().removeAllViews();
            }
            Deque<CSC> deque = d8a.A0C;
            for (CSC csc : deque) {
                if (csc.A00 != null) {
                    if (csc.equals(deque.peek())) {
                        csc.A04.stop();
                    }
                    csc.A04.Bo4();
                    csc.A00 = null;
                }
            }
            C25601Cig cig = d8a.A04;
            if (cig != null) {
                cig.A00 = null;
            }
            d8a.A04 = null;
            C25591CiW ciW = d8a.A03;
            if (ciW != null) {
                ciW.A00 = null;
            }
            d8a.A03 = null;
        }
    }

    public void A1v() {
        super.A1v();
    }

    public void A1z(Bundle bundle) {
        Bundle bundle2;
        super.A1z(bundle);
        if (bundle != null) {
            A28();
        }
        Bundle A15 = A15();
        if (bundle == null) {
            bundle2 = A15.getBundle("open_screen_config");
        } else {
            bundle2 = bundle.getBundle("open_screen_config");
        }
        this.A02 = new D8A(D8F.A0O.A01(bundle2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0164 A[LOOP:0: B:62:0x0164->B:65:0x016e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r15) {
        /*
            r14 = this;
            X.D8A r9 = A00(r14)
            android.content.Context r8 = r14.A14()
            r7 = 1
            X.D8F r6 = r9.A0B
            java.lang.Integer r5 = r6.A0F
            X.DOY r0 = new X.DOY
            r0.<init>(r8, r5)
            r9.A07 = r0
            X.C0B r0 = r9.A06
            X.C0B r4 = X.C0B.FULL_SCREEN
            if (r0 == r4) goto L_0x01d7
            r3 = 0
            X.BEZ r2 = new X.BEZ
            r2.<init>(r8)
            X.C06 r10 = r6.A0B
            X.C7k r0 = X.C24516C7k.$redex_init_class
            int r1 = r10.ordinal()
            r0 = -1
            if (r1 == r0) goto L_0x01b8
            if (r1 == r7) goto L_0x01b3
            r0 = 2
            if (r1 != r0) goto L_0x0033
            r2.setCanceledOnTouchOutside(r3)
        L_0x0033:
            java.lang.Integer r0 = r6.A02
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            if (r0 != r1) goto L_0x003b
            r2.A0D = r7
        L_0x003b:
            java.lang.Integer r0 = r6.A01
            if (r0 != r1) goto L_0x0041
            r2.A0F = r7
        L_0x0041:
            X.D3P r0 = r6.A09
            X.C25300Cd4.A01(r2, r0, r6)
            X.D3E r13 = r6.A07
            X.C0B r11 = r6.A0D
            float r10 = X.C25300Cd4.A00(r11)
            boolean r0 = r11.wrapsContent
            if (r0 != 0) goto L_0x019a
            X.D86 r12 = new X.D86
            r12.<init>(r8, r13, r10)
            r2.A07 = r12
            X.BHi r10 = r2.A08
            X.E3n r0 = r2.A06
            X.E3n[] r1 = X.BEZ.A02(r12, r0)
            boolean r0 = r2.isShowing()
            r10.A03(r1, r0)
        L_0x0068:
            r2.A06 = r12
            X.E3n r0 = r2.A07
            X.E3n[] r1 = X.BEZ.A02(r0, r12)
            boolean r0 = r2.isShowing()
            r10.A03(r1, r0)
            boolean r0 = r2.A0G
            if (r0 == r3) goto L_0x007d
            r2.A0G = r3
        L_0x007d:
            boolean r0 = r2.A0A
            if (r0 == r7) goto L_0x0088
            r2.A0A = r7
            float r0 = r2.A00
            X.BEZ.A01(r2, r0)
        L_0x0088:
            r10.A09 = r7
            X.C07 r1 = r6.A0C
            X.C07 r0 = X.C07.AUTO
            if (r1 != r0) goto L_0x0194
            X.C0B r0 = X.C0B.FULL_SHEET
            if (r11 == r0) goto L_0x0096
            if (r11 != r4) goto L_0x00a2
        L_0x0096:
            X.CeV r1 = X.C25370CeV.A00
            X.E3n r0 = X.BEZ.A0K
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r10.A06 = r0
            r10.A02 = r1
        L_0x00a2:
            X.DOY r1 = new X.DOY
            r1.<init>(r8, r5)
            X.D3D r4 = r6.A06
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            int r1 = X.C24541C8m.A00(r8, r1, r0)
            int r0 = r2.A02
            if (r0 == r1) goto L_0x00ba
            r2.A02 = r1
            float r0 = r2.A00
            X.BEZ.A01(r2, r0)
        L_0x00ba:
            int r0 = android.graphics.Color.alpha(r1)
            float r1 = (float) r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r0
            float r0 = r2.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00cf
            r2.A01 = r1
            float r0 = r2.A00
            X.BEZ.A01(r2, r0)
        L_0x00cf:
            X.BpJ r0 = X.C23774BpJ.A00
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 != 0) goto L_0x00f6
            boolean r0 = r4 instanceof X.C23775BpK
            if (r0 == 0) goto L_0x00f6
            X.BpK r4 = (X.C23775BpK) r4
            float r1 = r4.A00
            java.lang.Float r0 = r2.A09
            if (r0 == 0) goto L_0x00eb
            float r0 = r0.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f6
        L_0x00eb:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2.A09 = r0
            float r0 = r2.A00
            X.BEZ.A01(r2, r0)
        L_0x00f6:
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x00ff
            r0.setStatusBarColor(r3)
        L_0x00ff:
            r9.A05 = r2
            X.CMX r0 = new X.CMX
            r0.<init>(r8, r9)
            r2.A05 = r0
            X.C0B r1 = r9.A06
            X.C0B r0 = X.C0B.HALF_SHEET_WITH_UNDERLAY
            if (r1 != r0) goto L_0x0145
            r1 = 268435455(0xfffffff, float:2.5243547E-29)
            r0 = 0
            X.BF6 r4 = new X.BF6
            r4.<init>(r1, r0)
            r1 = -15173646(0xffffffffff1877f2, float:-2.0266545E38)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            X.BE8.A0x(r0, r4, r1)
            X.E6Q r0 = r9.A07
            if (r0 == 0) goto L_0x01d0
            android.graphics.Paint r3 = X.AnonymousClass3MW.A06()
            r4.A00 = r3
            boolean r1 = r0.BeR()
            X.C0J r0 = X.C0J.A2T
            int r1 = X.C25867Cna.A01(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.C199610h.A04(r0)
            r3.setColor(r1)
            X.Cxr r0 = new X.Cxr
            r0.<init>(r4)
            r2.setOnShowListener(r0)
        L_0x0145:
            X.C0B r1 = r9.A06
            X.C0B r0 = X.C0B.FULL_SCREEN_STYLE_SHEET
            if (r1 != r0) goto L_0x014e
            r0 = 0
            r10.A07 = r0
        L_0x014e:
            android.app.Activity r0 = X.C20101A7f.A00(r8)
            if (r0 == 0) goto L_0x01c9
            java.util.List r1 = X.C20101A7f.A03(r0)
            if (r1 == 0) goto L_0x0170
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0170
            java.util.Iterator r1 = r1.iterator()
        L_0x0164:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r0 = r1.next()
            if (r0 != r14) goto L_0x0164
        L_0x0170:
            X.D3N r1 = r6.A05
            if (r1 == 0) goto L_0x0190
            X.E6Q r0 = r9.A07
            if (r0 == 0) goto L_0x01d0
            boolean r0 = r0.BeR()
            if (r0 == 0) goto L_0x0191
            int r0 = r1.A00
        L_0x0180:
            if (r0 != 0) goto L_0x0190
            r1 = 0
            float r0 = r2.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0190
            r2.A01 = r1
            float r0 = r2.A00
            X.BEZ.A01(r2, r0)
        L_0x0190:
            return r2
        L_0x0191:
            int r0 = r1.A01
            goto L_0x0180
        L_0x0194:
            X.C07 r0 = X.C07.DISABLED
            if (r1 != r0) goto L_0x00a2
            goto L_0x0096
        L_0x019a:
            X.D85 r1 = new X.D85
            r1.<init>(r13, r10)
            r2.A07 = r1
            X.BHi r10 = r2.A08
            X.E3n r0 = r2.A06
            X.E3n[] r1 = X.BEZ.A02(r1, r0)
            boolean r0 = r2.isShowing()
            r10.A03(r1, r0)
            r12 = 0
            goto L_0x0068
        L_0x01b3:
            r2.setCanceledOnTouchOutside(r7)
            goto L_0x0033
        L_0x01b8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid enum value for DimmedBackgroundTapToDismiss: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r10, r0, r1)
            java.lang.String r0 = "CDSBloksBottomSheetDialogHelper"
            X.C25913CoX.A01(r0, r1)
            goto L_0x0033
        L_0x01c9:
            X.Dmt r0 = X.C27856Dmt.A00
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0m(r0)
            throw r0
        L_0x01d0:
            java.lang.String r0 = "isDarkModeProvider"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x01d7:
            java.lang.String r0 = "onFragmentCreateDialog() is not supported for CDS full screen."
            java.lang.UnsupportedOperationException r0 = X.BE6.A0v(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A27(android.os.Bundle):android.app.Dialog");
    }

    public void A2E(EAQ eaq, AnonymousClass8d6 r9) {
        D8A A002 = A00(this);
        Context A14 = A14();
        C18070vi.A0d(r9, 2);
        EAQ eaq2 = eaq;
        D8A.A01(A14, A002, eaq2, r9.A01, AnonymousClass00R.A00, r9.A00);
    }

    public boolean A2F(String str) {
        Iterator it = A00(this).A0C.iterator();
        C18070vi.A0X(it);
        while (it.hasNext()) {
            if (C18070vi.A18(str, ((CSC) it.next()).A04.BNW())) {
                return true;
            }
        }
        return false;
    }

    public void C39(int i) {
        A00(this).A04(i);
    }
}
