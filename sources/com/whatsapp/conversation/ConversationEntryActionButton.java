package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1F9;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3SQ;
import X.AnonymousClass3V4;
import X.AnonymousClass4CU;
import X.AnonymousClass4LC;
import X.AnonymousClass4LD;
import X.AnonymousClass4RQ;
import X.AnonymousClass4UY;
import X.AnonymousClass4W7;
import X.AnonymousClass78Y;
import X.C000200d;
import X.C108535br;
import X.C146497Pi;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C22339B3q;
import X.C22650BHo;
import X.C27691Xc;
import X.C28931bI;
import X.C41111vp;
import X.C72473Md;
import X.C84084Hu;
import X.C88134Yl;
import X.C90004dN;
import X.C90304dr;
import X.C90354dw;
import X.C91494fm;
import X.C95664mb;
import X.C98774rh;
import X.C99244sV;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class ConversationEntryActionButton extends RelativeLayout implements AnonymousClass009 {
    public int A00;
    public long A01;
    public C95664mb A02;
    public AnonymousClass4RQ A03;
    public AnonymousClass3V4 A04;
    public AnonymousClass11C A05;
    public AnonymousClass11P A06;
    public C18000vb A07;
    public C18030ve A08;
    public PushToRecordIconAnimation A09;
    public AnonymousClass00H A0A;
    public AnonymousClass031 A0B;
    public Integer A0C;
    public boolean A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final View A0H;
    public final C28931bI A0I;

    public ConversationEntryActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009d, code lost:
        if (r2 == r1) goto L_0x0159;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A03(X.C88134Yl r18, X.C88134Yl[] r19) {
        /*
            r17 = this;
            r5 = 0
            r7 = r19[r5]
            r2 = r18
            r19[r5] = r18
            r4 = r17
            if (r7 == 0) goto L_0x0019
            boolean r0 = r7.A05
            boolean r1 = r2.A05
            if (r0 == r1) goto L_0x0019
            android.view.View r0 = r4.A0E
            X.C18070vi.A0d(r0, r5)
            r0.setEnabled(r1)
        L_0x0019:
            r10 = 0
            if (r7 != 0) goto L_0x0077
            r1 = 0
        L_0x001d:
            int r0 = r2.A00()
            int r6 = r2.A00
            int r9 = A00(r0, r6)
            r3 = 1
            if (r9 == r1) goto L_0x0091
            if (r1 == 0) goto L_0x0074
            if (r1 == r3) goto L_0x0071
            r0 = 2
            if (r1 == r0) goto L_0x006e
            android.view.View r8 = r4.A0E
        L_0x0033:
            if (r9 == 0) goto L_0x006b
            if (r9 == r3) goto L_0x0068
            r0 = 2
            if (r9 == r0) goto L_0x0065
            android.view.View r0 = r4.A0E
        L_0x003c:
            X.4mb r1 = r4.A02
            r1.A00(r8, r5)
            r1.A00(r0, r3)
            com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation r0 = r4.A09
            if (r0 == 0) goto L_0x0091
            if (r9 == 0) goto L_0x004b
            r10 = 1
        L_0x004b:
            r1.A00(r0, r10)
            if (r9 == 0) goto L_0x0091
            r0 = 1
            if (r9 == r3) goto L_0x0082
            r0 = 2
            if (r9 == r0) goto L_0x0082
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid icon: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r9)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0065:
            android.view.View r0 = r4.A0F
            goto L_0x003c
        L_0x0068:
            android.view.View r0 = r4.A0H
            goto L_0x003c
        L_0x006b:
            android.view.View r0 = r4.A0G
            goto L_0x003c
        L_0x006e:
            android.view.View r8 = r4.A0F
            goto L_0x0033
        L_0x0071:
            android.view.View r8 = r4.A0H
            goto L_0x0033
        L_0x0074:
            android.view.View r8 = r4.A0G
            goto L_0x0033
        L_0x0077:
            int r1 = r7.A00()
            int r0 = r7.A00
            int r1 = A00(r1, r0)
            goto L_0x001d
        L_0x0082:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0091
            com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation r1 = r4.A09
            int r0 = r0.intValue()
            r1.CBk(r0)
        L_0x0091:
            boolean r2 = r2.A08
            if (r7 == 0) goto L_0x009f
            boolean r1 = r7.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x009f
            if (r2 == r1) goto L_0x0159
        L_0x009f:
            if (r2 == 0) goto L_0x014e
            X.4RQ r10 = r4.getOrCreateRecorderModeMenu()
            X.0vl r0 = r10.A09
            java.lang.Object r0 = r0.getValue()
            X.4N8 r0 = (X.AnonymousClass4N8) r0
            android.view.ViewGroup r1 = r0.A01
            X.0vl r0 = r0.A02
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r1.addView(r0)
            r8 = 0
            X.0vb r1 = r10.A07
            boolean r0 = X.AnonymousClass3MW.A1Z(r1)
            boolean r16 = X.AnonymousClass000.A1O(r0)
            X.0SF r9 = r10.A00
            if (r9 != 0) goto L_0x013d
            android.content.Context r11 = r10.A04
            java.util.List r0 = r10.A08
            X.3Op r7 = new X.3Op
            r7.<init>(r11, r1, r0)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131166188(0x7f0703ec, float:1.7946614E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131166187(0x7f0703eb, float:1.7946612E38)
            int r15 = r1.getDimensionPixelSize(r0)
            int r14 = X.C72453Mb.A09(r11)
            r13 = 0
            r0 = 2132083196(0x7f1501fc, float:1.9806527E38)
            X.0SF r9 = new X.0SF
            r9.<init>(r11, r13, r5, r0)
            android.view.View r0 = r10.A06
            r9.A06 = r0
            r9.CHm(r7)
            int r12 = r7.getCount()
            r11 = 0
            r1 = 0
        L_0x0100:
            if (r11 >= r12) goto L_0x0113
            android.view.View r0 = r7.getView(r11, r13, r13)
            r0.measure(r5, r5)
            int r0 = r0.getMeasuredWidth()
            if (r0 <= r1) goto L_0x0110
            r1 = r0
        L_0x0110:
            int r11 = r11 + 1
            goto L_0x0100
        L_0x0113:
            int r0 = java.lang.Math.max(r15, r1)
            int r0 = java.lang.Math.min(r0, r14)
            r9.A03 = r0
            r1 = 2
            X.4en r0 = new X.4en
            r0.<init>(r10, r1)
            android.widget.PopupWindow r1 = r9.A0A
            r1.setOnDismissListener(r0)
            X.4ee r0 = new X.4ee
            r0.<init>(r9, r10, r3)
            r9.A07 = r0
            r9.CLK(r2)
            r9.A0F = r5
            r1.setFocusable(r5)
            r9.A0E = r3
            r10.A00 = r9
            r10.A03 = r7
        L_0x013d:
            if (r16 != 0) goto L_0x0148
            android.view.View r0 = r10.A06
            int r8 = r0.getWidth()
            int r0 = r9.A03
            int r8 = r8 - r0
        L_0x0148:
            r9.A01 = r8
            r9.CMX()
            goto L_0x0159
        L_0x014e:
            X.4RQ r0 = r4.A03
            if (r0 == 0) goto L_0x0159
            X.0SF r0 = r0.A00
            if (r0 == 0) goto L_0x0159
            r0.dismiss()
        L_0x0159:
            X.4RQ r2 = r4.A03
            if (r2 == 0) goto L_0x0168
            if (r6 != r3) goto L_0x0169
            r0 = 2
        L_0x0161:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00(r0)
        L_0x0168:
            return
        L_0x0169:
            r0 = 1
            goto L_0x0161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationEntryActionButton.A03(X.4Yl, X.4Yl[]):void");
    }

    public static int A00(int i, int i2) {
        if (i == 0) {
            return 0;
        }
        if (i == 2) {
            return 3;
        }
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        throw new Error("Invalid recorder mode");
    }

    private PushToRecordIconAnimation getIconAnimationView() {
        if (!this.A04.A01.A0A) {
            return null;
        }
        C28931bI r2 = this.A0I;
        if (r2.A00 == null) {
            ((PushToRecordIconAnimation) r2.A02()).A00(this.A04.A01.A0F);
        }
        return (PushToRecordIconAnimation) r2.A02();
    }

    private AnonymousClass4RQ getOrCreateRecorderModeMenu() {
        AnonymousClass4RQ r3 = this.A03;
        if (r3 != null) {
            return r3;
        }
        if (this.A04.A01.A00 != 2) {
            Log.e("conversation/ConversationEntryActionButton/getOrCreateRecorderModeMenu called unexpectedly");
        }
        ArrayList A13 = AnonymousClass000.A13();
        if (this.A04.A01.A0H) {
            A13.add(new AnonymousClass4UY(AnonymousClass4CU.TITLE, (Integer) null, 2131888980, 0));
        }
        AnonymousClass4CU r2 = AnonymousClass4CU.OPTION;
        A13.add(new AnonymousClass4UY(r2, 2131232406, 2131888981, 2));
        A13.add(new AnonymousClass4UY(r2, 2131232107, 2131888982, 1));
        AnonymousClass4RQ r32 = new AnonymousClass4RQ(getContext(), this, this.A07, A13);
        this.A03 = r32;
        r32.A01 = new AnonymousClass4LC(this);
        r32.A02 = new AnonymousClass4LD(this);
        return r32;
    }

    /* access modifiers changed from: private */
    public long getShortTapTimeoutMs() {
        return (long) Math.min(Math.max(C18020vd.A00(C18040vf.A02, this.A08, 5348), 50), 500);
    }

    public void A02(AnonymousClass1F9 r13, C108535br r14, AnonymousClass3V4 r15) {
        Integer valueOf;
        boolean z;
        this.A04 = r15;
        PushToRecordIconAnimation iconAnimationView = getIconAnimationView();
        this.A09 = iconAnimationView;
        C90354dw r5 = null;
        if (iconAnimationView != null) {
            iconAnimationView.setTint(AnonymousClass3MZ.A02(this.A09.getContext(), getContext(), 2130970097, 2131103410));
            View view = this.A0F;
            C18070vi.A0d(view, 0);
            AnonymousClass4W7.A00((Drawable) null, view);
            View view2 = this.A0H;
            C18070vi.A0d(view2, 0);
            AnonymousClass4W7.A00((Drawable) null, view2);
            PushToRecordIconAnimation pushToRecordIconAnimation = this.A09;
            C41111vp r2 = r15.A05;
            pushToRecordIconAnimation.BhF(A00(AnonymousClass3MX.A0e(r2).A00(), AnonymousClass3MX.A0e(r2).A00));
        }
        View view3 = this.A0H;
        view3.setLongClickable(true);
        AnonymousClass1HF.A0f(view3, new AnonymousClass3SQ(this, r15, 0));
        View view4 = this.A0F;
        AnonymousClass3MZ.A1K(view4, this, 3);
        C41111vp r1 = r15.A05;
        r1.A0A(r13, new C91494fm(new C88134Yl[]{null}, this, 8));
        float A002 = C72473Md.A00(this);
        C18030ve r9 = this.A08;
        C18070vi.A0d(r9, 1);
        C18040vf r22 = C18040vf.A02;
        int A003 = C18020vd.A00(r22, r9, 5363);
        if (A003 < 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(C22339B3q.A01(((float) A003) * A002));
        }
        this.A0C = valueOf;
        this.A00 = Math.max(0, C18020vd.A00(r22, r9, 5384));
        C84084Hu.A00(this.A0E, C99244sV.A00(r14, 17));
        boolean z2 = AnonymousClass3MX.A0e(r1).A06;
        View view5 = this.A0G;
        if (z2) {
            z = false;
            C18070vi.A0d(view5, 0);
            AnonymousClass4W7.A01(view5, 2131231663);
        } else {
            Drawable A062 = AnonymousClass3MX.A06(getContext(), 2131232506);
            z = false;
            C18070vi.A0d(view5, 0);
            AnonymousClass4W7.A00(A062, view5);
        }
        view5.setOutlineProvider(new C22650BHo(this, 3));
        C146497Pi r10 = new C146497Pi(this, r15, 29);
        if (C18020vd.A05(r22, r9, 3582)) {
            view5.setOnTouchListener((View.OnTouchListener) this.A0A.get());
        }
        C90004dN.A00(view5, this, r14, 41);
        if (C18020vd.A00(r22, r9, 5363) >= 0) {
            z = true;
        }
        C90354dw r0 = new C90354dw(new C90304dr(r14, this, 5), this, r10, new C98774rh(r14, 3));
        view3.setOnTouchListener(r0);
        if (!z) {
            r0 = null;
        }
        view3.setOnLongClickListener(r0);
        view3.setOnKeyListener(new AnonymousClass78Y(r14, this, 0));
        C90354dw r02 = new C90354dw(new C90304dr(r14, this, 6), this, r10, new C98774rh(r14, 2));
        view4.setOnTouchListener(r02);
        view4.setLongClickable(z);
        if (z) {
            r5 = r02;
        }
        view4.setOnLongClickListener(r5);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0B;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public ConversationEntryActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0D) {
            this.A0D = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A06 = AnonymousClass10E.A6O(r1);
            this.A08 = AnonymousClass10E.A8r(r1);
            this.A07 = AnonymousClass10E.A6Q(r1);
            this.A05 = AnonymousClass3Ma.A0a(r1);
            this.A0A = C000200d.A00(r1.Agr);
            this.A02 = (C95664mb) r2.A0a.get();
        }
        this.A0C = null;
        this.A00 = 0;
        this.A01 = 0;
        C18070vi.A0d(context, 0);
        LayoutInflater.from(context).inflate(2131624722, this);
        this.A0G = AnonymousClass1HF.A06(this, 2131435142);
        this.A0H = AnonymousClass1HF.A06(this, 2131436880);
        this.A0F = AnonymousClass1HF.A06(this, 2131434241);
        this.A0I = C28931bI.A00(this, 2131429567);
        View A062 = AnonymousClass1HF.A06(this, 2131436874);
        this.A0E = A062;
        C18070vi.A0d(A062, 0);
        AnonymousClass4W7.A01(A062, 2131233309);
    }

    public ConversationEntryActionButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
