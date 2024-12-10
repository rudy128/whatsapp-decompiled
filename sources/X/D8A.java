package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public final class D8A implements E0U {
    public int A00;
    public BI8 A01;
    public BIH A02;
    public C25591CiW A03;
    public C25601Cig A04;
    public BEZ A05;
    public C0B A06;
    public E6Q A07;
    public Integer A08;
    public Runnable A09;
    public boolean A0A;
    public final D8F A0B;
    public final Deque A0C = new ArrayDeque();
    public final List A0D;

    public final void A05(Context context) {
        BI8 bi8;
        E6P e6p;
        BI8 bi82 = this.A01;
        if ((bi82 == null || bi82.getVisibility() != 0) && (bi8 = this.A01) != null) {
            bi8.setVisibility(0);
        }
        Deque deque = this.A0C;
        CSC csc = (CSC) deque.peek();
        if (csc != null && (e6p = csc.A02) != null) {
            e6p.Bm7();
        } else if (deque.size() > 1) {
            A02(context, this, (Integer) null);
        } else {
            C19810z2 r0 = C0B.A01;
            BEZ bez = this.A05;
            if (bez != null) {
                bez.dismiss();
            }
        }
    }

    public final void A07(Context context, String str) {
        String str2;
        Deque deque = this.A0C;
        CSC csc = (CSC) deque.peekFirst();
        if (csc == null || str.equals(csc.A04.BNW())) {
            str2 = "Attempting to pop to the current screen in the CDS bottom sheet, so no pop action was performed. This is a no-op.";
        } else {
            Iterator it = deque.iterator();
            C18070vi.A0X(it);
            int i = 0;
            while (it.hasNext()) {
                if (!str.equals(((CSC) it.next()).A04.BNW())) {
                    i++;
                } else {
                    for (int i2 = 0; i2 < i; i2++) {
                        A02(context, this, (Integer) null);
                    }
                    return;
                }
            }
            str2 = "No screen found with target ID, so no screens were popped.";
        }
        C25913CoX.A01("CDSBloksBottomSheetDelegate", str2);
    }

    private final void A00(Context context, int i) {
        Context context2;
        Window window;
        CSC csc = (CSC) this.A0C.peek();
        if (csc != null) {
            context2 = csc.A04.getContext();
        } else {
            context2 = null;
        }
        BEZ bez = this.A05;
        if (bez != null) {
            window = bez.getWindow();
        } else if (context2 instanceof Activity) {
            window = ((Activity) context2).getWindow();
        } else if (context instanceof Activity) {
            window = ((Activity) context).getWindow();
        } else {
            return;
        }
        if (window != null) {
            window.setSoftInputMode(i);
        }
    }

    public static final void A01(Context context, D8A d8a, EAQ eaq, E6P e6p, Integer num, int i) {
        int i2;
        if (d8a.A01 != null) {
            EAQ eaq2 = eaq;
            View BPL = eaq.BPL(context);
            C18070vi.A0X(BPL);
            BI8 bi8 = d8a.A01;
            if (bi8 != null) {
                BIK.A02(BPL, bi8.getContentPager(), num, true);
                A03(d8a, eaq);
                eaq.CA6();
                C21466AkX akX = new C21466AkX(d8a);
                if (BPL.isLaidOut()) {
                    akX.run();
                } else {
                    ViewTreeObserver viewTreeObserver = BPL.getViewTreeObserver();
                    viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass790(BPL, viewTreeObserver, akX, 0));
                }
                Deque deque = d8a.A0C;
                deque.isEmpty();
                deque.push(new CSC(BPL, eaq2, d8a.A06, e6p, i));
                CSC csc = (CSC) deque.peek();
                if (csc == null) {
                    C25913CoX.A01("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
                    i2 = 32;
                } else {
                    i2 = csc.A03;
                }
                d8a.A00(context, i2);
                return;
            }
            throw AnonymousClass000.A0n("Cannot show Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
        }
        throw AnonymousClass000.A0m(C27858Dmv.A00);
    }

    public static final void A02(Context context, D8A d8a, Integer num) {
        int i;
        Deque deque = d8a.A0C;
        CSC csc = (CSC) deque.pop();
        if (deque.peek() == null) {
            C25913CoX.A01("CDSBloksBottomSheetDelegate", "Attempting to check the current limited theme setting but found null.");
        }
        CSC csc2 = (CSC) deque.peek();
        if (csc2 == null) {
            C25913CoX.A01("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
            i = 32;
        } else {
            i = csc2.A03;
        }
        d8a.A00(context, i);
        if (d8a.A01 != null) {
            csc.A04.stop();
            d8a.A0D.add(csc);
            CSC csc3 = (CSC) deque.peek();
            BI8 bi8 = d8a.A01;
            if (csc3 == null) {
                throw AnonymousClass000.A0m(C27859Dmw.A00);
            } else if (bi8 != null) {
                d8a.A08(csc3.A01);
                C25601Cig cig = d8a.A04;
                if (cig != null) {
                    cig.A02.post(new C21466AkX((Object) cig, 33));
                }
                C25591CiW ciW = d8a.A03;
                if (ciW != null) {
                    ciW.A02.post(new C21466AkX((Object) ciW, 32));
                }
                EAQ eaq = csc3.A04;
                View view = csc3.A00;
                if (view == null) {
                    view = eaq.BPL(context);
                    C18070vi.A0X(view);
                }
                csc3.A00 = view;
                BIK.A02(view, bi8.getContentPager(), num, false);
                A03(d8a, eaq);
                eaq.CA6();
            } else {
                throw AnonymousClass000.A0m(C27860Dmx.A00);
            }
        } else {
            throw AnonymousClass000.A0m(C27857Dmu.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r7 != 7) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (r7 != 7) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int r7) {
        /*
            r6 = this;
            X.BIH r1 = r6.A02
            if (r1 == 0) goto L_0x0071
            X.BHQ r5 = r1.A02
            if (r5 == 0) goto L_0x0071
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x0071
            X.C08 r4 = r1.A0H
            X.C08 r0 = X.C08.ANIMATED_WHILE_LOADING
            r3 = 0
            r2 = 7
            r1 = 1
            if (r4 != r0) goto L_0x005f
            if (r7 == 0) goto L_0x006a
            if (r7 == r1) goto L_0x006a
            if (r7 == r2) goto L_0x006e
        L_0x001b:
            r0 = 5
            if (r7 == r0) goto L_0x0032
            r0 = 6
            if (r7 != r0) goto L_0x0031
            X.Cig r1 = r6.A04
            if (r1 == 0) goto L_0x0031
            android.os.Handler r3 = r1.A02
            r0 = 33
            X.AkX r2 = new X.AkX
            r2.<init>((java.lang.Object) r1, (int) r0)
        L_0x002e:
            r3.post(r2)
        L_0x0031:
            return
        L_0x0032:
            X.CiW r5 = r6.A03
            X.BIH r4 = r6.A02
            if (r5 == 0) goto L_0x0031
            if (r4 == 0) goto L_0x0031
            X.Cig r3 = r6.A04
            if (r3 == 0) goto L_0x004a
            android.os.Handler r2 = r3.A02
            r1 = 33
            X.AkX r0 = new X.AkX
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.post(r0)
        L_0x004a:
            r1 = 30
            X.AkX r0 = new X.AkX
            r0.<init>((java.lang.Object) r6, (int) r1)
            com.instagram.common.thread.ThreadUtil.runOnUiThread(r0)
            android.os.Handler r1 = r5.A02
            X.7RF r0 = new X.7RF
            r0.<init>((android.widget.FrameLayout) r4, (X.C25591CiW) r5)
            r1.post(r0)
            return
        L_0x005f:
            X.C08 r0 = X.C08.ANIMATED_WHILE_LOADED
            if (r4 != r0) goto L_0x0071
            if (r7 == 0) goto L_0x006e
            if (r7 == r1) goto L_0x006e
            if (r7 == r2) goto L_0x006a
            goto L_0x001b
        L_0x006a:
            r5.setIsSwirlAnimating(r1)
            goto L_0x0071
        L_0x006e:
            r5.setIsSwirlAnimating(r3)
        L_0x0071:
            if (r7 != 0) goto L_0x001b
            X.BIH r4 = r6.A02
            if (r4 == 0) goto L_0x0031
            X.Cig r1 = r6.A04
            if (r1 == 0) goto L_0x0031
            android.os.Handler r3 = r1.A02
            r0 = 31
            X.Akc r2 = new X.Akc
            r2.<init>((java.lang.Object) r4, (java.lang.Object) r1, (int) r0)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D8A.A04(int):void");
    }

    public final void A06(Context context, C166558d5 r5, String str) {
        String str2;
        Deque deque = this.A0C;
        if (deque.isEmpty() || this.A01 == null) {
            str2 = "Cannot pop from an empty bottom sheet.";
        } else if (deque.size() == 1) {
            str2 = "Attempting to pop to the root screen in the CDS bottom sheet or full screen, so no pop action was performed. This is a no-op.";
        } else if (str == null) {
            A02(context, this, r5.A00);
            return;
        } else {
            A07(context, str);
            return;
        }
        C25913CoX.A01("CDSBloksBottomSheetDelegate", str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r7 == r8) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r7 != r8) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C0B r27) {
        /*
            r26 = this;
            r6 = r26
            X.C0B r9 = r6.A06
            X.C0B r8 = X.C0B.FULL_SCREEN
            r3 = 1
            r5 = 0
            r7 = r27
            if (r9 != r8) goto L_0x0011
            if (r27 == 0) goto L_0x0011
            r2 = 1
            if (r7 != r8) goto L_0x0017
        L_0x0011:
            r2 = 0
            if (r9 == r8) goto L_0x0017
            r0 = 1
            if (r7 == r8) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            java.lang.String r1 = "CDSBloksBottomSheetDelegate"
            if (r2 != 0) goto L_0x01e6
            if (r0 != 0) goto L_0x01e6
            boolean r0 = X.AnonymousClass000.A1Z(r9, r8)
            if (r7 == r8) goto L_0x0025
            r3 = 0
        L_0x0025:
            if (r0 != 0) goto L_0x0032
            if (r3 != 0) goto L_0x0032
            X.BEZ r4 = r6.A05
            if (r4 != 0) goto L_0x0033
            java.lang.String r0 = "Bottom sheet should not be null when we try to update it"
        L_0x002f:
            X.C25913CoX.A01(r1, r0)
        L_0x0032:
            return
        L_0x0033:
            X.BIH r3 = r6.A02
            if (r27 == 0) goto L_0x0032
            if (r9 == r7) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            boolean r1 = r9.wrapsContent
            boolean r0 = r7.wrapsContent
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            float r0 = X.C25300Cd4.A00(r9)
            float r2 = X.C25300Cd4.A00(r7)
            if (r1 == 0) goto L_0x009c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x009c
        L_0x0051:
            boolean r0 = r7.fullScreenStyle
            if (r0 == 0) goto L_0x0097
            X.D3P r1 = new X.D3P
            r1.<init>(r5, r5, r5, r5)
        L_0x005a:
            X.D8F r0 = r6.A0B
            X.C25300Cd4.A01(r4, r1, r0)
            r6.A06 = r7
            boolean r0 = r7.fullScreenStyle
            X.BEZ r2 = r6.A05
            if (r0 == 0) goto L_0x0087
            if (r2 == 0) goto L_0x0032
            r1 = 0
            java.lang.Float r0 = r2.A09
            if (r0 == 0) goto L_0x0076
            float r0 = r0.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0081
        L_0x0076:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2.A09 = r0
            float r0 = r2.A00
            X.BEZ.A01(r2, r0)
        L_0x0081:
            r1 = 0
        L_0x0082:
            X.BHi r0 = r2.A08
            r0.A07 = r1
            return
        L_0x0087:
            if (r2 == 0) goto L_0x0032
            java.lang.Float r0 = r2.A09
            if (r0 == 0) goto L_0x0095
            r0 = 0
            r2.A09 = r0
            float r0 = r2.A00
            X.BEZ.A01(r2, r0)
        L_0x0095:
            r1 = 1
            goto L_0x0082
        L_0x0097:
            X.D8F r0 = r6.A0B
            X.D3P r1 = r0.A09
            goto L_0x005a
        L_0x009c:
            boolean r0 = r7.wrapsContent
            if (r0 == 0) goto L_0x01d5
            r1 = 0
            X.D85 r0 = new X.D85
            r0.<init>(r1, r2)
            r4.A07 = r0
            r4.A06 = r1
            X.BHi r2 = r4.A08
            X.E3n[] r1 = X.BEZ.A02(r0, r1)
        L_0x00b0:
            boolean r0 = r4.isShowing()
            r2.A03(r1, r0)
            X.D87 r1 = new X.D87
            r1.<init>(r3, r4)
            X.BHi r0 = r4.A08
            java.util.List r0 = r0.A0H
            r0.add(r1)
            boolean r1 = r7.fullScreenStyle
            X.C0B r0 = r3.A06
            boolean r0 = r0.fullScreenStyle
            if (r1 == r0) goto L_0x0149
            if (r1 == 0) goto L_0x01cc
            X.BIH.A01(r3)
        L_0x00d0:
            X.BIj r1 = r3.A05
            java.lang.String r17 = "cornerRadii"
            if (r1 == 0) goto L_0x00dc
            float[] r0 = r3.A08
            if (r0 == 0) goto L_0x01ea
            r1.A00 = r0
        L_0x00dc:
            X.BF1 r10 = r3.A03
            r16 = 6
            r15 = 4
            r14 = 2
            if (r10 == 0) goto L_0x00f3
            float[] r0 = r3.A08
            if (r0 == 0) goto L_0x01ea
            r9 = r0[r5]
            r2 = r0[r14]
            r1 = r0[r15]
            r0 = r0[r16]
            r10.A00(r9, r2, r1, r0)
        L_0x00f3:
            X.BF1 r10 = r3.A04
            if (r10 == 0) goto L_0x0106
            float[] r0 = r3.A08
            if (r0 == 0) goto L_0x01ea
            r9 = r0[r5]
            r2 = r0[r14]
            r1 = r0[r15]
            r0 = r0[r16]
            r10.A00(r9, r2, r1, r0)
        L_0x0106:
            X.BI8 r0 = r3.A0E
            android.view.ViewGroup$MarginLayoutParams r1 = X.C72463Mc.A0P(r0)
            int r0 = r3.A00
            r1.setMargins(r5, r0, r5, r5)
            X.C08 r13 = r3.A0H
            X.C08 r0 = X.C08.DISABLED
            if (r13 != r0) goto L_0x0178
            r3.getContext()
            X.E6Q r0 = r3.A0J
            boolean r1 = r0.BeR()
            if (r1 == 0) goto L_0x0175
            X.C0J r0 = X.C0J.A2T
        L_0x0124:
            int r1 = X.C25867Cna.A01(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.C199610h.A04(r0)
            X.BF1 r10 = new X.BF1
            r10.<init>()
            r10.A01(r1)
        L_0x0137:
            float[] r0 = r3.A08
            if (r0 == 0) goto L_0x01ea
            r9 = r0[r5]
            r2 = r0[r14]
            r1 = r0[r15]
            r0 = r0[r16]
            r10.A00(r9, r2, r1, r0)
            r3.setBackground(r10)
        L_0x0149:
            r3.A06 = r7
            X.BI8 r0 = r3.A0E
            r0.A02 = r7
            X.BIK r1 = r0.getContentPager()
            boolean r0 = r7.wrapsContent
            r1.A01 = r0
            X.CjD r0 = X.D8F.A0O
            X.D8F r0 = r3.A0I
            X.C07 r2 = r0.A0C
            X.C07 r0 = X.C07.AUTO
            r1 = 1
            if (r2 != r0) goto L_0x016e
            X.C0B r0 = X.C0B.FULL_SHEET
            if (r7 == r0) goto L_0x0168
            if (r7 != r8) goto L_0x0173
        L_0x0168:
            r0 = r1 ^ 1
            r3.A07 = r0
            goto L_0x0051
        L_0x016e:
            X.C07 r0 = X.C07.DISABLED
            if (r2 != r0) goto L_0x0173
            goto L_0x0168
        L_0x0173:
            r1 = 0
            goto L_0x0168
        L_0x0175:
            X.C0J r0 = X.C0J.A0A
            goto L_0x0124
        L_0x0178:
            X.D3N r1 = r3.A0F
            X.E6Q r12 = r3.A0J
            boolean r0 = r12.BeR()
            if (r0 == 0) goto L_0x01c9
            int r11 = r1.A00
        L_0x0184:
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x01bf
            X.BHQ r0 = r3.A02
            int r10 = r3.indexOfChild(r0)
            X.BHQ r0 = r3.A02
            r3.removeView(r0)
            android.content.Context r19 = r3.getContext()
            float[] r9 = r3.A08
            if (r9 == 0) goto L_0x01ea
            boolean r2 = r3.A0L
            float r1 = r3.A0D
            X.BHQ r0 = new X.BHQ
            r20 = r13
            r21 = r12
            r22 = r9
            r23 = r1
            r24 = r11
            r25 = r2
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r3.A02 = r0
            r0 = -1
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            X.BHQ r0 = r3.A02
            r3.addView(r0, r10, r1)
        L_0x01bf:
            X.BF1 r10 = new X.BF1
            r10.<init>()
            r10.A01(r11)
            goto L_0x0137
        L_0x01c9:
            int r11 = r1.A01
            goto L_0x0184
        L_0x01cc:
            android.content.Context r0 = X.AnonymousClass3MY.A04(r3)
            X.BIH.A00(r0, r3)
            goto L_0x00d0
        L_0x01d5:
            X.D83 r0 = new X.D83
            r0.<init>(r2)
            r4.A07 = r0
            r4.A06 = r0
            X.BHi r2 = r4.A08
            X.E3n[] r1 = X.BEZ.A02(r0, r0)
            goto L_0x00b0
        L_0x01e6:
            java.lang.String r0 = "Invalid operation - it is not possible to update the bottom sheet from full screen to one of the sheet variants"
            goto L_0x002f
        L_0x01ea:
            X.C18070vi.A11(r17)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D8A.A08(X.C0B):void");
    }

    public D8A(D8F d8f) {
        this.A0B = d8f;
        this.A06 = d8f.A0D;
        this.A0D = AnonymousClass000.A13();
    }

    public static void A03(D8A d8a, EAQ eaq) {
        C01920By BSP = eaq.BSP();
        C18070vi.A0X(BSP);
        BI8 bi8 = d8a.A01;
        if (bi8 != null) {
            ViewGroup headerContainer = bi8.getHeaderContainer();
            headerContainer.removeAllViews();
            headerContainer.addView(BSP);
        }
    }
}
