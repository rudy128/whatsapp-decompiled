package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import java.util.Set;

/* renamed from: X.3tw  reason: invalid class name */
public class AnonymousClass3tw extends C78683tL {
    public AnonymousClass4N9 A00;
    public C32211gp A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05 = findViewById(2131429542);
    public final View A06;
    public final ViewGroup A07;
    public final FrameLayout A08;
    public final ImageView A09 = AnonymousClass3MW.A0H(this, 2131431496);
    public final ImageView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final TextEmojiLabel A0F;
    public final WaImageView A0G = AnonymousClass3MW.A0S(this, 2131429541);
    public final AnonymousClass3M2 A0H = new C98114qb(this, 1);
    public final C28931bI A0I;
    public final C28931bI A0J = C72453Mb.A0s(this, 2131436130);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2.A0F, 6786) == false) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02() {
        /*
            r23 = this;
            r2 = r23
            X.206 r12 = r2.A0I
            X.21V r12 = (X.AnonymousClass21V) r12
            X.21i r12 = (X.C438921i) r12
            android.widget.ImageView r8 = r2.A09
            android.content.Context r0 = r2.getContext()
            android.graphics.drawable.Drawable r0 = X.C137486vX.A00(r0, r12)
            r8.setImageDrawable(r0)
            java.lang.String r1 = r12.A19()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0212
            android.content.Context r1 = r2.getContext()
            r0 = 2131897363(0x7f122c13, float:1.9429613E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x002a:
            com.whatsapp.TextEmojiLabel r3 = r2.A0F
            r3.setText(r0)
            X.0vb r0 = r2.A0D
            boolean r1 = X.AnonymousClass3MW.A1Z(r0)
            r0 = 3
            if (r1 == 0) goto L_0x0039
            r0 = 5
        L_0x0039:
            r3.setGravity(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131166256(0x7f070430, float:1.7946752E38)
            int r6 = r1.getDimensionPixelSize(r0)
            r0 = 2131430109(0x7f0b0add, float:1.848191E38)
            android.view.View r5 = r2.findViewById(r0)
            java.lang.String r9 = r12.A06
            if (r9 == 0) goto L_0x0065
            boolean r0 = X.C26521Sl.A0e(r9)
            if (r0 == 0) goto L_0x0065
            X.0ve r3 = r2.A0F
            r1 = 6786(0x1a82, float:9.509E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r7 = 1
            if (r0 != 0) goto L_0x0066
        L_0x0065:
            r7 = 0
        L_0x0066:
            boolean r0 = r12.A16()
            r10 = 0
            r4 = 0
            r3 = 8
            if (r0 == 0) goto L_0x01f0
            r8.setVisibility(r3)
            X.C72463Mc.A15(r5, r4, r6)
            X.1bI r6 = r2.A0J
            if (r7 == 0) goto L_0x01eb
            r6.A04(r4)
            boolean r5 = X.C26521Sl.A0f(r9)
            android.view.View r1 = r6.A02()
            r0 = 2131436754(0x7f0b24d2, float:1.8495387E38)
            android.view.View r1 = r1.findViewById(r0)
            int r0 = X.C72453Mb.A07(r5)
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r2.A0A
            r0.setVisibility(r3)
            r0.setTag(r10)
        L_0x009b:
            X.1gV r14 = r2.A1S
            if (r7 == 0) goto L_0x01e7
            android.view.View r1 = r6.A02()
            r0 = 2131436123(0x7f0b225b, float:1.8494108E38)
            android.view.View r11 = r1.findViewById(r0)
        L_0x00aa:
            X.3M2 r13 = r2.A0H
            X.205 r15 = r12.A0v
            r19 = 1
            r16 = 480(0x1e0, float:6.73E-43)
            r20 = r4
            r22 = r19
            r17 = r4
            r18 = r4
            r21 = r19
            X.C32021gV.A05(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x00bf:
            java.lang.String r1 = r12.A01
            android.view.View r0 = r2.A06
            r2.A2m(r0, r1)
            X.21V r0 = r2.getFMessage()
            boolean r0 = X.AnonymousClass25A.A11(r0)
            if (r0 == 0) goto L_0x0198
            android.view.View r0 = r2.A05
            r0.setVisibility(r4)
            com.whatsapp.WaImageView r5 = r2.A0G
            r0 = 2131232492(0x7f0806ec, float:1.8081095E38)
            r5.setImageResource(r0)
            X.1rL r0 = r2.A0C
            r5.setOnClickListener(r0)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            X.AnonymousClass1Y5.A02(r5, r0)
            X.205 r0 = r12.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0187
            boolean r0 = r12.A0u()
            if (r0 != 0) goto L_0x0187
            android.content.Context r1 = r2.getContext()
            r0 = 2131896784(0x7f1229d0, float:1.942844E38)
            X.AnonymousClass3MY.A0w(r1, r5, r0)
        L_0x00fe:
            android.view.View r5 = r2.A04
            X.1rL r0 = r2.A0F
        L_0x0102:
            r5.setOnClickListener(r0)
        L_0x0105:
            android.widget.TextView r0 = r2.A0E
            r0.setVisibility(r3)
            android.view.ViewGroup r0 = r2.A07
            r0.setVisibility(r4)
            r2.A1y()
            android.widget.TextView r7 = r2.A0B
            X.0vb r6 = r2.A0D
            long r0 = r12.A01
            java.lang.String r0 = X.C88584aA.A02(r6, r0)
            r7.setText(r0)
            int r0 = r12.A00
            android.widget.TextView r6 = r2.A0D
            if (r0 == 0) goto L_0x017e
            r6.setVisibility(r4)
            android.view.View r0 = r2.A03
            r0.setVisibility(r4)
            X.0vb r1 = r2.A0D
            X.747 r0 = X.C62272r8.A04
            java.lang.String r0 = r0.A09(r1, r12)
            r6.setText(r0)
        L_0x0138:
            java.lang.String r0 = r12.A06
            java.lang.String r1 = X.C25291Nq.A03(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0162
            java.lang.String r0 = r12.A19()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0162
            java.lang.String r0 = r12.A19()
            java.lang.String r1 = X.C64062u9.A09(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r0)
        L_0x0162:
            r0 = 10
            java.lang.String r0 = X.AnonymousClass1EG.A0F(r1, r0)
            android.widget.TextView r1 = r2.A0C
            java.lang.CharSequence r0 = r2.A1p(r0)
            r1.setText(r0)
            X.AnonymousClass3uP.A0W(r5, r2)
            r2.A2n(r12)
            r2.A2P(r12)
            r2.A2N(r12)
            return
        L_0x017e:
            r6.setVisibility(r3)
            android.view.View r0 = r2.A03
            r0.setVisibility(r3)
            goto L_0x0138
        L_0x0187:
            android.content.Context r1 = r2.getContext()
            r0 = 2131896783(0x7f1229cf, float:1.9428437E38)
            X.AnonymousClass3MY.A0w(r1, r5, r0)
            android.view.View r5 = r2.A04
            r5.setOnClickListener(r10)
            goto L_0x0105
        L_0x0198:
            boolean r1 = X.C79103uS.A1L(r2)
            com.whatsapp.WaImageView r5 = r2.A0G
            X.AnonymousClass1Y5.A01(r5)
            android.view.View r0 = r2.A05
            if (r1 == 0) goto L_0x01aa
            r0.setVisibility(r3)
            goto L_0x00fe
        L_0x01aa:
            r0.setVisibility(r4)
            X.21V r0 = r2.getFMessage()
            boolean r0 = X.AnonymousClass4H3.A00(r0)
            if (r0 == 0) goto L_0x01d0
            r0 = 2131231866(0x7f08047a, float:1.8079825E38)
            r5.setImageResource(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131887592(0x7f1205e8, float:1.9409795E38)
            X.AnonymousClass3MY.A0w(r1, r5, r0)
            X.1rL r0 = r2.A0D
            r5.setOnClickListener(r0)
            android.view.View r5 = r2.A04
            goto L_0x0102
        L_0x01d0:
            r0 = 2131232380(0x7f08067c, float:1.8080868E38)
            r5.setImageResource(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131895332(0x7f122424, float:1.9425494E38)
            X.AnonymousClass3MY.A0w(r1, r5, r0)
            X.1rL r0 = r2.A0E
            r5.setOnClickListener(r0)
            goto L_0x00fe
        L_0x01e7:
            android.widget.ImageView r11 = r2.A0A
            goto L_0x00aa
        L_0x01eb:
            r6.A04(r3)
            goto L_0x009b
        L_0x01f0:
            r8.setVisibility(r4)
            int r1 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            r5.setPadding(r6, r1, r6, r0)
            X.1bI r0 = r2.A0J
            r0.A04(r3)
            android.widget.ImageView r0 = r2.A0A
            r0.setTag(r10)
            r0.setVisibility(r3)
            android.view.View r0 = r2.A02
            r0.setVisibility(r3)
            goto L_0x00bf
        L_0x0212:
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = X.AnonymousClass1EG.A0F(r1, r0)
            java.lang.CharSequence r0 = r2.A1p(r0)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3tw.A02():void");
    }

    public boolean A1V() {
        if (!((C32911hx) this.A1y.get()).A01(this.A0I) || !this.A0l.CMI()) {
            return false;
        }
        return true;
    }

    public boolean A1X() {
        return C79103uS.A1K(this, this.A0I, this.A1h);
    }

    public boolean A1Z() {
        return AnonymousClass25A.A0W(this.A0E, this.A0I, this.A2O);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r13.A0F, 6786) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1v() {
        /*
            r13 = this;
            X.206 r0 = r13.A0I
            boolean r0 = r0.A16()
            if (r0 == 0) goto L_0x0067
            X.206 r0 = r13.A0I
            X.21V r0 = (X.AnonymousClass21V) r0
            java.lang.String r6 = r0.A06
            if (r6 == 0) goto L_0x0023
            boolean r0 = X.C26521Sl.A0e(r6)
            if (r0 == 0) goto L_0x0023
            X.0ve r2 = r13.A0F
            r1 = 6786(0x1a82, float:9.509E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r5 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            r4 = 8
            X.1bI r3 = r13.A0J
            if (r5 == 0) goto L_0x006b
            r0 = 0
            r3.A04(r0)
            boolean r2 = X.C26521Sl.A0f(r6)
            android.view.View r1 = r3.A02()
            r0 = 2131436754(0x7f0b24d2, float:1.8495387E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r2 == 0) goto L_0x0040
            r4 = 0
        L_0x0040:
            r0.setVisibility(r4)
        L_0x0043:
            X.1gV r4 = r13.A1S
            X.C17960vV.A07(r4)
            X.206 r2 = r13.A0I
            if (r5 == 0) goto L_0x0068
            android.view.View r1 = r3.A02()
            r0 = 2131436123(0x7f0b225b, float:1.8494108E38)
            android.view.View r1 = r1.findViewById(r0)
        L_0x0057:
            X.3M2 r3 = r13.A0H
            X.205 r5 = r2.A0v
            r0 = 0
            r9 = 1
            r7 = 0
            r6 = 480(0x1e0, float:6.73E-43)
            r10 = r7
            r12 = r9
            r8 = r7
            r11 = r9
            X.C32021gV.A05(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0067:
            return
        L_0x0068:
            android.widget.ImageView r1 = r13.A0A
            goto L_0x0057
        L_0x006b:
            r3.A04(r4)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3tw.A1v():void");
    }

    public void A1y() {
        AnonymousClass21V r5 = (AnonymousClass21V) this.A0I;
        TextView textView = this.A0E;
        C88564a8.A02(this.A07, textView, this.A00, this.A0D, this.A05, r5);
        C28931bI r1 = this.A0I;
        C32861hs r0 = this.A05;
        C17960vV.A07(r0);
        C88564a8.A01(r0, r5, r1);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        if (!(r2 instanceof C442522s)) {
            boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
            super.A2V(r2, z);
            if (z || A1Z) {
                A02();
            }
        }
    }

    public C438921i getFMessage() {
        return (C438921i) ((AnonymousClass21V) this.A0I);
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C438921i);
        super.setFMessage(r2);
    }

    public AnonymousClass3tw(Context context, C108875cR r4, C438921i r5) {
        super(context, r4, r5);
        A1M();
        C28931bI A0s = C72453Mb.A0s(this, 2131434181);
        this.A0I = A0s;
        C98254qp.A00(A0s, context, 22);
        this.A0F = AnonymousClass3MX.A0W(this, 2131436208);
        this.A0E = AnonymousClass3MW.A0J(this, 2131432439);
        this.A07 = AnonymousClass3MW.A0C(this, 2131432748);
        this.A04 = findViewById(2131429510);
        this.A0D = C17880vN.A0E(this, 2131431625);
        this.A03 = findViewById(2131428482);
        this.A0B = C17880vN.A0E(this, 2131430843);
        this.A0C = C17880vN.A0E(this, 2131430844);
        this.A0A = AnonymousClass3MW.A0H(this, 2131434041);
        this.A02 = findViewById(2131434048);
        FrameLayout frameLayout = (FrameLayout) findViewById(2131430107);
        this.A08 = frameLayout;
        this.A06 = findViewById(2131436057);
        if (frameLayout != null) {
            frameLayout.setForeground(getInnerFrameForegroundDrawable());
        }
        A02();
    }

    public void A1u() {
        A02();
        AnonymousClass3uP.A0h(this, false);
    }

    public void A20() {
        super.A20();
        Activity A052 = AnonymousClass3Ma.A05(this);
        if (A052 instanceof AnonymousClass1FU) {
            Object obj = this.A0O.get();
            C17960vV.A07(obj);
            AnonymousClass1KB r3 = this.A0S;
            C17960vV.A07(r3);
            AnonymousClass190 r1 = this.A07;
            C17960vV.A07(r1);
            AnonymousClass10I r9 = this.A1X;
            C17960vV.A07(r9);
            AnonymousClass1L9 r0 = this.A0Q;
            C17960vV.A07(r0);
            C32211gp r5 = this.A01;
            C17960vV.A07(r5);
            C219217x r4 = this.A03;
            C17960vV.A07(r4);
            int A002 = AnonymousClass6WA.A00(r0, r1, (AnonymousClass1FU) A052, r3, r4, r5, (C438921i) ((AnonymousClass21V) this.A0I), (C139956zi) obj, this.A1T, r9);
            if (A002 == 2) {
                A2p();
            } else if (A002 == 4) {
                this.A0S.A06(2131897346, 1);
            }
        }
    }

    public void A2m(View view, String str) {
        super.A2m(view, str);
        if (TextUtils.isEmpty(str) && this.A0B != null) {
            ViewGroup viewGroup = this.A06;
            viewGroup.setPadding(getResources().getDimensionPixelSize(2131166201), 0, AnonymousClass3Ma.A02(this, 2131166201), 0);
            C72463Mc.A12(viewGroup);
            this.A0H.setTextColor(getSecondaryTextColor());
            View view2 = this.A06;
            if (view2 == null) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(2131166185);
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131166184);
                AnonymousClass3MW.A0B(view2).bottomMargin = dimensionPixelSize;
                AnonymousClass3MW.A0B(view2).topMargin = dimensionPixelSize2;
                return;
            }
            AnonymousClass3MW.A0B(view2).topMargin = (-viewGroup.getMeasuredHeight()) - getResources().getDimensionPixelSize(2131166185);
        }
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        FrameLayout frameLayout = this.A08;
        if (frameLayout != null) {
            innerFrameLayouts.add(frameLayout);
        }
        return innerFrameLayouts;
    }

    public int getMainChildMaxWidth() {
        if (C79103uS.A1H(this)) {
            return 0;
        }
        return getResources().getDimensionPixelSize(2131166243);
    }

    public int getCenteredLayoutId() {
        return 2131624814;
    }

    public int getIncomingLayoutId() {
        return 2131624814;
    }

    public int getOutgoingLayoutId() {
        return 2131624817;
    }
}
