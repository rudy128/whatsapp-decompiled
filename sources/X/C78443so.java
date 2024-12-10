package X;

import android.content.Context;
import android.provider.ContactsContract;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3so  reason: invalid class name and case insensitive filesystem */
public class C78443so extends AnonymousClass3uP {
    public int A00;
    public LinearLayout A01;
    public C19880zA A02;
    public C133656pG A03;
    public C108355bZ A04;
    public AnonymousClass1VW A05;
    public AnonymousClass700 A06;
    public AnonymousClass733 A07;
    public AnonymousClass12E A08;
    public C49212Pp A09;
    public C88644aH A0A;
    public C86304Rc A0B;
    public C86324Re A0C;
    public AnonymousClass18K A0D;
    public C36451nu A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass73C A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public C115265tf A0N;
    public boolean A0O;
    public final ImageView A0P;
    public final TextView A0Q;
    public final TextView A0R;
    public final TextView A0S;
    public final TextView A0T;
    public final TextView A0U;
    public final C37451pZ A0V;
    public final C28931bI A0W;
    public final C28931bI A0X;
    public final C108645c3 A0Y;
    public final AnonymousClass00H A0Z = DWR.A02(this, 42);
    public final ArrayList A0a = AnonymousClass000.A13();
    public final ArrayList A0b = AnonymousClass000.A13();
    public final AnonymousClass68H A0c;
    public final AnonymousClass00H A0d = DWR.A02(this, 43);

    public static boolean A04(C78443so r6, AnonymousClass73C r7) {
        boolean z;
        if (r7 != null) {
            List list = r7.A06;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (r6.A0U.A0O(((C129926ib) it.next()).A01)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (list.size() > 0 && !z) {
                    return true;
                }
            }
            List<C130276jA> list2 = r7.A03;
            if (list2 != null) {
                for (C130276jA r0 : list2) {
                    if (r0.A01 == ContactsContract.CommonDataKinds.Email.class) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A1u() {
        AnonymousClass3uP.A0h(this, false);
        A00();
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d8, code lost:
        if (r7.A04 == false) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r30 = this;
            r10 = r30
            X.206 r8 = r10.getFMessage()
            android.widget.TextView r1 = r10.A0U
            X.205 r0 = r8.A0v
            r1.setTag(r0)
            X.5tf r1 = r10.A0N
            if (r1 == 0) goto L_0x0016
            X.68H r0 = r10.A0c
            r0.A07(r1)
        L_0x0016:
            X.68H r0 = r10.A0c
            java.lang.Runnable r2 = r0.A02(r8)
            X.5tf r2 = (X.C115265tf) r2
            r10.A0N = r2
            r3 = 8
            X.4qx r1 = new X.4qx
            r1.<init>(r10, r3)
            X.1KB r0 = r10.A0S
            java.util.concurrent.Executor r0 = r0.A05
            r2.A0A(r1, r0)
            android.content.Context r0 = r10.getContext()
            java.lang.String r0 = X.C62872s8.A01(r0, r8)
            r10.A02(r0)
            X.1VW r2 = r10.A05
            android.widget.ImageView r1 = r10.A0P
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            r2.A09(r1, r0)
            r0 = 1024(0x400, double:5.06E-321)
            boolean r0 = r8.A11(r0)
            if (r0 == 0) goto L_0x00f4
            android.view.ViewGroup r12 = r10.getWebPagePreviewHolder()
            if (r12 == 0) goto L_0x00f3
            X.0ve r3 = r10.A0F
            X.1gU r2 = r10.A1D
            android.content.Context r1 = r10.getContext()
            X.4X8 r0 = X.C87754Wv.A05
            X.4Wv r7 = r0.A01(r1, r3, r2, r8)
            r0 = 0
            r12.setVisibility(r0)
            X.4aH r0 = r10.A0A
            if (r0 != 0) goto L_0x00cf
            android.content.Context r16 = r10.getContext()
            X.5c7 r14 = r10.A0l
            X.1nl r13 = r10.A0T
            X.1no r11 = r10.A10
            X.1gV r9 = r10.A1S
            X.6lM r6 = r10.A1C
            X.4Oj r21 = r10.A1n()
            X.0zA r1 = r10.A02
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0084
            r1.A03()
        L_0x0084:
            X.0ve r5 = r10.A0F
            X.5bZ r4 = r10.A04
            X.00H r0 = r10.A0Q
            java.lang.Object r3 = r0.get()
            X.2r5 r3 = (X.C62242r5) r3
            X.00H r0 = r10.A0S
            java.lang.Object r2 = r0.get()
            X.4Qu r2 = (X.C86224Qu) r2
            X.00H r0 = r10.A0L
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            X.10I r0 = r10.A1X
            X.4aH r15 = new X.4aH
            r29 = r0
            r27 = r3
            r28 = r9
            r25 = r5
            r26 = r6
            r23 = r14
            r24 = r11
            r22 = r10
            r20 = r4
            r19 = r2
            r18 = r1
            r17 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r10.A0A = r15
            com.whatsapp.webpagepreview.WebPagePreviewView r2 = r15.A0K
            r1 = -1
            r0 = -2
            r12.addView(r2, r1, r0)
            X.4aH r0 = r10.A0A
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0K
            X.AnonymousClass3uP.A0W(r0, r10)
        L_0x00cf:
            X.5c3 r2 = r10.A0Y
            boolean r0 = r2 instanceof X.DR0
            if (r0 == 0) goto L_0x00da
            boolean r0 = r7.A04
            r1 = 1
            if (r0 != 0) goto L_0x00db
        L_0x00da:
            r1 = 0
        L_0x00db:
            r10.A0M = r1
            X.4aH r4 = r10.A0A
            X.4Re r0 = r10.A0C
            boolean r9 = r0.A00(r8)
            X.4Re r0 = r10.A0C
            boolean r10 = r0.A01(r8)
            r11 = 0
            r5 = r8
            r6 = r2
            r8 = r1
            r12 = r11
            r4.A04(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x00f3:
            return
        L_0x00f4:
            X.0ve r1 = r10.A0F
            r0 = 11798(0x2e16, float:1.6533E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x011c
            r0 = 2131437044(0x7f0b25f4, float:1.8495976E38)
            android.view.View r2 = r10.findViewById(r0)
        L_0x0105:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00f3
            X.4aH r0 = r10.A0A
            if (r0 == 0) goto L_0x0118
            r1 = r2
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0K
            r1.removeView(r0)
            r0 = 0
            r10.A0A = r0
        L_0x0118:
            r2.setVisibility(r3)
            return
        L_0x011c:
            android.view.ViewGroup r2 = r10.getWebPagePreviewHolder()
            goto L_0x0105
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78443so.A00():void");
    }

    private void A01() {
        boolean A002 = this.A0B.A00();
        LinearLayout linearLayout = this.A01;
        if (A002) {
            linearLayout.setOnTouchListener((View.OnTouchListener) this.A0d.get());
        } else {
            linearLayout.setOnClickListener(new C825048f(this, 0));
        }
    }

    private void A02(String str) {
        CharSequence A022;
        String A0E2 = AnonymousClass1EG.A0E(str, 128);
        Context context = getContext();
        TextView textView = this.A0U;
        TextPaint paint = textView.getPaint();
        AnonymousClass1KW r1 = this.A15;
        if (A0E2 == null) {
            A022 = null;
        } else {
            A022 = C43251zV.A02(context, paint, new AnonymousClass7G7(), r1, A0E2);
        }
        textView.setText(A1p(A022));
    }

    private boolean A03() {
        List list;
        this.A1i.get();
        AnonymousClass73C r0 = this.A0J;
        if (r0 == null || (list = r0.A06) == null || list.size() != 1 || list.get(0) == null) {
            return false;
        }
        return C42701yb.A01(((C129926ib) list.get(0)).A01);
    }

    public void A1M() {
        if (!this.A0O) {
            this.A0O = true;
            C27691Xc A0O2 = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r1 = A0O2.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r1, A0O2, this);
            AnonymousClass10G r4 = r1.A00;
            AnonymousClass3uQ.A16(r4, this);
            AnonymousClass3uQ.A0w(A0n, r1, r4, this);
            AnonymousClass3uQ.A12(r1, r4, this);
            AnonymousClass3uQ.A0y(A0n, r1, this, BE8.A0d(r1));
            AnonymousClass3uQ.A13(r1, r4, this, r1.ABq);
            AnonymousClass3uQ.A0x(A0n, r1, r4, this, r1.AIy);
            C19890zB r2 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r2, r1, r4, A0O2, this);
            AnonymousClass3uQ.A11(r1, r4, this);
            AnonymousClass3uQ.A15(r1, this);
            AnonymousClass3uQ.A0s(r2, A0n, r1, r4, this);
            AnonymousClass3uQ.A0u(r2, r1, r4, A0O2, this);
            AnonymousClass3uQ.A0t(r2, A0n, r1, A0O2, this);
            AnonymousClass3uQ.A10(r1, r4, this);
            AnonymousClass3uQ.A0z(r1, r4, A0O2, this, AnonymousClass3uQ.A0o(r1));
            this.A03 = (C133656pG) r4.A1b.get();
            this.A05 = BE9.A0W(r1);
            this.A06 = BE9.A0X(r4);
            this.A0E = (C36451nu) r1.A0G.get();
            this.A04 = (C108355bZ) A0n.A5a.get();
            this.A08 = (AnonymousClass12E) r1.A2k.get();
            this.A0B = (C86304Rc) r4.A9L.get();
            this.A07 = (AnonymousClass733) r4.A2s.get();
            this.A0C = (C86324Re) r4.A7Y.get();
            this.A0H = C000200d.A00(A0n.A4W);
            this.A0G = C000200d.A00(r1.A1K);
            this.A02 = r2;
            this.A0D = AnonymousClass3Ma.A0g(r1);
            this.A0I = C000200d.A00(r1.AAt);
            this.A0F = C000200d.A00(r1.A0p);
        }
    }

    public boolean A1V() {
        return this.A0l.CMI();
    }

    public boolean A1X() {
        return C79103uS.A1K(this, getFMessage(), this.A1h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (A03() != false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x029f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A2j(X.AnonymousClass4OY r26) {
        /*
            r25 = this;
            r4 = r26
            X.206 r2 = r4.A01
            X.205 r1 = r2.A0v
            r13 = r25
            android.widget.TextView r12 = r13.A0U
            java.lang.Object r0 = r12.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02f3
            X.73C r0 = r4.A04
            r13.A0J = r0
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r0.A02()
            r13.A02(r0)
        L_0x0021:
            X.73C r0 = r13.A0J
            r7 = 1
            r11 = 0
            if (r0 == 0) goto L_0x0039
            X.6oE r0 = r0.A0A
            java.lang.String r0 = r0.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0039
            boolean r0 = r13.A03()
            r16 = 1
            if (r0 == 0) goto L_0x003b
        L_0x0039:
            r16 = 0
        L_0x003b:
            r3 = 8
            if (r16 == 0) goto L_0x00cd
            android.widget.TextView r10 = r13.A0Q
            r10.setVisibility(r11)
            r0 = 2131887564(0x7f1205cc, float:1.9409739E38)
            r10.setText(r0)
            X.73C r0 = r13.A0J
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.widget.TextView r5 = r13.A0S
            if (r0 != 0) goto L_0x00d5
            r5.setVisibility(r11)
            X.73C r0 = r13.A0J
            java.lang.String r0 = r0.A02
            r5.setText(r0)
        L_0x0060:
            X.73C r6 = r13.A0J
            if (r6 == 0) goto L_0x006b
            X.1pZ r5 = r13.A0V
            android.widget.ImageView r0 = r13.A0P
            r5.A0D(r0, r6)
        L_0x006b:
            r13.A00 = r11
            java.util.ArrayList r9 = r13.A0a
            r9.clear()
            java.util.ArrayList r6 = r13.A0b
            r6.clear()
            X.73C r0 = r13.A0J
            r5 = 0
            if (r0 == 0) goto L_0x00d9
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x00d9
            java.util.Iterator r15 = r0.iterator()
        L_0x0084:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r14 = r15.next()
            X.6ib r14 = (X.C129926ib) r14
            java.lang.String r8 = r14.A02
            r6.add(r8)
            boolean r0 = r13.A0L
            if (r0 == 0) goto L_0x00af
            boolean r0 = r13.A0K
            if (r0 != 0) goto L_0x00af
            X.1M9 r0 = r13.A0j
            X.1E7 r8 = r0.A0J(r8, r7)
            if (r8 == 0) goto L_0x00af
            X.2lf r0 = r8.A0H
            if (r0 != 0) goto L_0x00ad
            X.1E7 r0 = r8.A0I
            if (r0 == 0) goto L_0x00af
        L_0x00ad:
            r13.A0K = r7
        L_0x00af:
            com.whatsapp.jid.UserJid r8 = r14.A01
            if (r8 == 0) goto L_0x00c9
            X.11S r0 = r13.A0U
            boolean r0 = r0.A0O(r8)
            if (r0 == 0) goto L_0x00bf
            r9.add(r5)
            goto L_0x0084
        L_0x00bf:
            r9.add(r8)
            int r0 = r13.A00
            int r0 = r0 + 1
            r13.A00 = r0
            goto L_0x0084
        L_0x00c9:
            r9.add(r5)
            goto L_0x0084
        L_0x00cd:
            android.widget.TextView r0 = r13.A0S
            r0.setVisibility(r3)
            android.widget.TextView r5 = r13.A0Q
            r10 = r5
        L_0x00d5:
            r5.setVisibility(r3)
            goto L_0x0060
        L_0x00d9:
            boolean r6 = r1.A02
            if (r6 != 0) goto L_0x02ea
            X.1BI r8 = r1.A00
            boolean r0 = X.C22971Dz.A0e(r8)
            X.1M9 r1 = r13.A0j
            if (r0 == 0) goto L_0x02e0
            X.1BI r0 = r2.A0H()
            X.C17960vV.A07(r0)
            X.1E7 r2 = r1.A0H(r0)
            X.1Mc r0 = r13.A1Q
            boolean r1 = r0.A06(r8)
            X.126 r0 = r13.A19
            X.1EC r8 = (X.AnonymousClass1EC) r8
            X.1MZ r0 = r0.A0O
            boolean r0 = r0.A0O(r8)
            r0 = r0 ^ 1
            r1 = r1 & r0
        L_0x0105:
            X.2lf r0 = r2.A0H
            if (r0 == 0) goto L_0x010a
            r7 = 0
        L_0x010a:
            r7 = r7 & r1
            X.1Mc r1 = r13.A1Q
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r0 = r2.A06(r0)
            X.C17960vV.A07(r0)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            boolean r0 = r1.A06(r0)
            r7 = r7 & r0
        L_0x011d:
            r0 = 2131428595(0x7f0b04f3, float:1.8478839E38)
            android.view.View r2 = r13.findViewById(r0)
            r0 = 2131428623(0x7f0b050f, float:1.8478896E38)
            android.view.View r1 = r13.findViewById(r0)
            if (r7 != 0) goto L_0x02c9
            int r0 = r13.A00
            if (r0 <= 0) goto L_0x02aa
            android.widget.TextView r8 = r13.A0T
            r8.setVisibility(r11)
            r0 = 2131895709(0x7f12259d, float:1.9426259E38)
            r8.setText(r0)
            r0 = 48
            X.AnonymousClass48m.A00(r8, r13, r0)
        L_0x0141:
            if (r6 == 0) goto L_0x024b
            if (r16 == 0) goto L_0x0149
            int r0 = r13.A00
            if (r0 > 0) goto L_0x0285
        L_0x0149:
            r1.setVisibility(r3)
            android.widget.TextView r5 = r13.A0R
            r5.setVisibility(r3)
            X.1bI r0 = r13.A0X
            r0.A04(r3)
            r13.A01()
        L_0x0159:
            int r0 = r8.getVisibility()
            if (r0 == 0) goto L_0x0246
            int r0 = r5.getVisibility()
            if (r0 == 0) goto L_0x0246
            r2.setVisibility(r3)
        L_0x0168:
            int r0 = r8.getVisibility()
            if (r0 != 0) goto L_0x02db
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x02db
            r1.setVisibility(r11)
        L_0x0177:
            java.lang.String r7 = r4.A02
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x023c
            java.lang.Object r0 = r9.get(r11)
            if (r0 == 0) goto L_0x023c
            boolean r0 = r13.A03()
            if (r0 == 0) goto L_0x023c
            X.00H r0 = r13.A1i
            java.lang.Object r6 = r0.get()
            X.1PW r6 = (X.AnonymousClass1PW) r6
            X.00H r0 = r13.A1h
            java.lang.Object r5 = r0.get()
            X.1Ps r5 = (X.C25811Ps) r5
            java.lang.Object r4 = r9.get(r11)
            X.1BI r4 = (X.AnonymousClass1BI) r4
            X.1FU r17 = X.C72473Md.A0O(r13)
            X.1KB r0 = r13.A0S
            r18 = r0
            X.10I r15 = r13.A1X
            X.18K r3 = r13.A0D
            r23 = 0
            X.4d3 r2 = new X.4d3
            r24 = r11
            r22 = r15
            r20 = r3
            r21 = r4
            r19 = r6
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            X.73C r0 = r13.A0J
            if (r0 == 0) goto L_0x023a
            X.6oE r0 = r0.A0A
            java.lang.String r14 = r0.A08
        L_0x01c8:
            r1 = 1
            X.4d3 r0 = new X.4d3
            r16 = r17
            r17 = r18
            r18 = r6
            r19 = r3
            r20 = r4
            r21 = r15
            r22 = r14
            r23 = r1
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r8.setOnClickListener(r0)
            android.widget.LinearLayout r0 = r13.A01
            r0.setOnClickListener(r2)
            r12.setText(r7)
            r10.setVisibility(r11)
            r0 = 2131887302(0x7f1204c6, float:1.9409207E38)
            r10.setText(r0)
            android.content.Context r4 = r13.getContext()
            r3 = 2130968887(0x7f040137, float:1.754644E38)
            r0 = 2131099963(0x7f06013b, float:1.7812294E38)
            int r0 = X.AnonymousClass1YL.A00(r4, r3, r0)
            r5.A06(r10, r0, r1)
            X.1bI r0 = r13.A0W
            r0.A04(r11)
            android.view.View r0 = r0.A02()
            r0.setOnClickListener(r2)
        L_0x0210:
            X.73C r2 = r13.A0J
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x02f3
            java.lang.Object r0 = r9.get(r11)
            if (r0 == 0) goto L_0x02f3
            X.0ve r0 = r13.A0F
            boolean r0 = X.C84104Hw.A00(r0)
            if (r0 == 0) goto L_0x02f3
            if (r2 == 0) goto L_0x02f3
            java.lang.String r1 = "3p_full"
            java.lang.String r0 = r2.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02ed
            X.6oE r0 = r2.A0A
            java.lang.String r0 = r0.A08
            r13.setupViewIfThirdPartyBotContact(r0)
            return
        L_0x023a:
            r14 = 0
            goto L_0x01c8
        L_0x023c:
            X.1bI r1 = r13.A0W
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0210
            r1.A04(r3)
            goto L_0x0210
        L_0x0246:
            r2.setVisibility(r11)
            goto L_0x0168
        L_0x024b:
            if (r16 != 0) goto L_0x0285
            X.11S r0 = r13.A0U
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x027c
            boolean r0 = r13.A03()
            if (r0 != 0) goto L_0x027c
            boolean r0 = r13.A0K
            if (r0 != 0) goto L_0x027c
            r1.setVisibility(r11)
            android.widget.TextView r5 = r13.A0R
            r5.setVisibility(r11)
            r0 = 2131886469(0x7f120185, float:1.9407518E38)
            r5.setText(r0)
            r0 = 46
            X.AnonymousClass48m.A00(r5, r13, r0)
        L_0x0272:
            r13.A01()
        L_0x0275:
            X.1bI r0 = r13.A0X
            r0.A04(r3)
            goto L_0x0159
        L_0x027c:
            r1.setVisibility(r3)
            android.widget.TextView r5 = r13.A0R
            r5.setVisibility(r3)
            goto L_0x0272
        L_0x0285:
            r1.setVisibility(r3)
            int r0 = r13.A00
            if (r0 <= 0) goto L_0x029f
            android.widget.TextView r5 = r13.A0R
            r5.setVisibility(r3)
            android.widget.LinearLayout r6 = r13.A01
            r0 = 49
            X.AnonymousClass48m.A00(r6, r13, r0)
            X.1bI r0 = r13.A0X
            r0.A04(r11)
            goto L_0x0159
        L_0x029f:
            android.widget.LinearLayout r0 = r13.A01
            r0.setOnClickListener(r5)
            android.widget.TextView r5 = r13.A0R
            r5.setVisibility(r3)
            goto L_0x0275
        L_0x02aa:
            X.73C r0 = r13.A0J
            boolean r0 = A04(r13, r0)
            android.widget.TextView r8 = r13.A0T
            if (r0 == 0) goto L_0x02c4
            r8.setVisibility(r11)
            r0 = 2131891468(0x7f12150c, float:1.9417657E38)
            r8.setText(r0)
            r0 = 47
            X.AnonymousClass48m.A00(r8, r13, r0)
            goto L_0x0141
        L_0x02c4:
            r8.setVisibility(r3)
            goto L_0x0141
        L_0x02c9:
            android.widget.TextView r8 = r13.A0T
            r8.setVisibility(r3)
            android.widget.TextView r0 = r13.A0R
            r0.setVisibility(r3)
            X.1bI r0 = r13.A0X
            r0.A04(r3)
            r2.setVisibility(r3)
        L_0x02db:
            r1.setVisibility(r3)
            goto L_0x0177
        L_0x02e0:
            X.C17960vV.A07(r8)
            X.1E7 r2 = r1.A0H(r8)
            r1 = 1
            goto L_0x0105
        L_0x02ea:
            r7 = 0
            goto L_0x011d
        L_0x02ed:
            X.10I r1 = r13.A1X
            r0 = 1
            X.C98784ri.A00(r1, r13, r0)
        L_0x02f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78443so.A2j(X.4OY):void");
    }

    public int getMainChildMaxWidth() {
        if (this.A0l.Bew(getFMessage())) {
            return 0;
        }
        int A0k = AnonymousClass3uQ.A0k(this);
        if (this.A0M) {
            return Math.min(A0k, C88264Yz.A01(getContext(), 72));
        }
        return A0k;
    }

    public void onDetachedFromWindow() {
        C49212Pp r1 = this.A09;
        if (r1 != null) {
            r1.A0B(true);
            this.A09 = null;
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.A3I.A02(r3) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.AnonymousClass206 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C442222p
            if (r0 != 0) goto L_0x000b
            boolean r1 = X.A3I.A02(r3)
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.C17960vV.A0D(r0)
            r2.A0I = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78443so.setFMessage(X.206):void");
    }

    public C78443so(Context context, C37451pZ r5, C108875cR r6, AnonymousClass206 r7, AnonymousClass68H r8) {
        super(context, r6, r7);
        A1M();
        this.A0V = r5;
        this.A0c = r8;
        this.A0U = C17880vN.A0E(this, 2131436685);
        this.A0Q = C17880vN.A0E(this, 2131427464);
        this.A0S = C17880vN.A0E(this, 2131429927);
        this.A0P = AnonymousClass3MW.A0H(this, 2131433831);
        this.A0T = C17880vN.A0E(this, 2131432809);
        this.A0R = C17880vN.A0E(this, 2131427489);
        this.A0W = C28931bI.A00(this, 2131427539);
        C28931bI A002 = C28931bI.A00(this, 2131427542);
        this.A0X = A002;
        A002.A07(new C98254qp(this, 21));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131429390);
        this.A01 = linearLayout;
        AnonymousClass3uP.A0W(linearLayout, this);
        this.A0Y = C63752td.A00(context);
        this.A0L = C18020vd.A05(C18040vf.A02, this.A0F, 5868);
        A00();
    }

    private void setupViewIfThirdPartyBotContact(String str) {
        TextView A0E2;
        int color = getResources().getColor(2131103264);
        AnonymousClass48m r5 = new AnonymousClass48m(this, 49);
        TextView textView = this.A0T;
        C89904dD.A00(textView, this, 27);
        textView.setTextColor(color);
        TextView textView2 = this.A0U;
        textView2.setText(str);
        textView2.setTextColor(getResources().getColor(2131102246));
        TextView textView3 = this.A0Q;
        textView3.setVisibility(0);
        textView3.setText(2131887342);
        C90074dU.A01(this.A01, this, r5, 9);
        C28931bI r2 = this.A0W;
        r2.A04(0);
        C90074dU.A01(r2.A02(), this, r5, 10);
        View A022 = r2.A02();
        if (!(A022 == null || (A0E2 = C17880vN.A0E(A022, 2131427538)) == null)) {
            A0E2.setTextColor(color);
        }
        this.A0X.A04(8);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public /* synthetic */ void A2i(AnonymousClass1E7 r2) {
        setupViewIfThirdPartyBotContact(r2.A0L());
    }

    public ViewGroup getWebPagePreviewHolder() {
        View findViewById = findViewById(2131437044);
        if (findViewById == null) {
            return null;
        }
        if (findViewById instanceof ViewStub) {
            findViewById = ((ViewStub) findViewById).inflate();
        }
        return (ViewGroup) findViewById;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.A0U.getText());
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(this.A0U.getText());
    }

    public int getCenteredLayoutId() {
        return 2131624798;
    }

    public int getIncomingLayoutId() {
        return 2131624798;
    }

    public int getOutgoingLayoutId() {
        return 2131624799;
    }
}
