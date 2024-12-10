package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.4XZ  reason: invalid class name */
public class AnonymousClass4XZ {
    public float A00;
    public int A01 = -1;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public LinearLayout A06;
    public AnonymousClass21V A07;
    public final LinearLayout A08;
    public final C1407773a A09;
    public final StickerView A0A;
    public final ImageView A0B;
    public final TextView A0C;
    public final /* synthetic */ C79073uJ A0D;

    public AnonymousClass4XZ(LinearLayout linearLayout, C79073uJ r29) {
        C98784ri r12;
        LinearLayout linearLayout2;
        C79073uJ r13 = r29;
        this.A0D = r13;
        LinearLayout linearLayout3 = linearLayout;
        this.A0A = (StickerView) linearLayout3.findViewById(2131435733);
        this.A0C = C17880vN.A0E(linearLayout3, 2131429789);
        this.A0B = AnonymousClass3MW.A0H(linearLayout3, 2131435610);
        if (((C86304Rc) r13.A1t.get()).A01()) {
            r12 = new C98784ri((Object) this, 29);
        } else {
            r12 = null;
        }
        C18030ve r16 = r13.A0F;
        C34531kd r26 = r13.A0V;
        C33251iW r25 = r13.A0a;
        C18000vb r14 = r13.A0D;
        AnonymousClass1KB r11 = r13.A0S;
        AnonymousClass00H r10 = r13.A0O;
        AnonymousClass10I r9 = r13.A1X;
        C32021gV r8 = r13.A1S;
        C219217x r7 = r13.A00;
        C19830z4 r6 = r13.A0v;
        C32431hB r5 = r13.A02;
        C26631Sw r2 = r13.A03;
        C32861hs r1 = r13.A01;
        C50522Ut r20 = r13.A04;
        C32021gV r21 = r8;
        AnonymousClass10I r22 = r9;
        AnonymousClass00H r23 = r10;
        C98784ri r24 = r12;
        C219217x r122 = r7;
        C19830z4 r132 = r6;
        AnonymousClass1KB r92 = r11;
        C34531kd r102 = r26;
        C33251iW r112 = r25;
        LinearLayout linearLayout4 = linearLayout3;
        this.A09 = new C1407773a(linearLayout4, r92, r102, r112, r122, r132, r14, r16, r1, r5, (AnonymousClass70H) r13.A05.get(), r2, r20, r21, r22, r23, r24);
        this.A08 = (LinearLayout) linearLayout3.findViewById(2131429812);
        linearLayout3.setClipChildren(false);
        linearLayout3.setClipToPadding(false);
        LinearLayout.LayoutParams A0D2 = AnonymousClass3Ma.A0D();
        A0D2.gravity = 8388613;
        C79073uJ r52 = this.A0D;
        A0D2.topMargin = -r52.getReactionsViewVerticalOverlap();
        boolean A1b = AnonymousClass3MY.A1b(r52.A0D);
        int A082 = C72463Mc.A08(r52);
        if (A1b) {
            A0D2.rightMargin = A082;
        } else {
            A0D2.leftMargin = A082;
        }
        if (this.A06 == null) {
            boolean A052 = C18020vd.A05(C18040vf.A02, r52.A0F, 11487);
            Context context = r52.getContext();
            if (A052) {
                linearLayout2 = new AnonymousClass3Q6(context);
            } else {
                linearLayout2 = new LinearLayout(context);
            }
            this.A06 = linearLayout2;
            linearLayout3.addView(linearLayout2, A0D2);
            this.A06.bringToFront();
        }
    }

    public static void A00(AnonymousClass4XZ r4) {
        View view = r4.A02;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        AnonymousClass3O3 r1 = new AnonymousClass3O3(r4.A0D.getContext(), r4);
        r4.A02 = r1;
        r1.setClickable(true);
        C89904dD.A00(r4.A02, r4, 49);
        ((ViewGroup) r4.A0A.getParent()).addView(r4.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.content.res.ColorStateList} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.view.View$OnLongClickListener] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x026e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass21V r32, boolean r33) {
        /*
            r31 = this;
            r6 = r31
            r7 = r32
            r6.A07 = r7
            android.widget.LinearLayout r5 = r6.A08
            X.3uJ r4 = r6.A0D
            X.5bZ r1 = r4.A09
            X.206 r0 = r4.A0I
            X.205 r0 = r0.A0v
            boolean r0 = r0.A02
            int r0 = X.C72453Mb.A05(r0)
            r9 = 0
            android.graphics.drawable.Drawable r0 = r1.BZi(r0)
            r5.setBackground(r0)
            boolean r2 = X.C79103uS.A1H(r4)
            android.view.View r0 = r4.A08
            r1 = -2
            if (r2 == 0) goto L_0x0028
            r1 = -1
        L_0x0028:
            X.C42491yG.A08(r0, r1)
            android.view.View r0 = r4.A07
            X.C42491yG.A08(r0, r1)
            X.5cR r3 = r4.A0k
            if (r3 == 0) goto L_0x02c0
            boolean r0 = r3.Bcq()
            if (r0 == 0) goto L_0x02c0
            A00(r6)
            android.view.View r1 = r6.A02
            boolean r0 = r3.Bfa(r7)
            r1.setSelected(r0)
        L_0x0046:
            r2 = 0
            if (r32 == 0) goto L_0x02b9
            r10 = r33
            if (r33 == 0) goto L_0x0065
            if (r3 == 0) goto L_0x0061
            boolean r9 = r3.Bgo(r7)
            X.73a r0 = r6.A09
            com.whatsapp.stickers.StickerView r8 = r0.A0E
            if (r9 == 0) goto L_0x02b5
            r1 = 1
            X.3Zr r0 = new X.3Zr
            r0.<init>(r6, r7, r1)
            r8.A01 = r0
        L_0x0061:
            X.73a r0 = r6.A09
            r0.A02 = r9
        L_0x0065:
            X.73a r0 = r6.A09
            r30 = r0
            r1 = r7
            X.22g r1 = (X.C441322g) r1
            r0.A06(r2, r1, r10)
            X.21V r1 = r6.A07
            int r9 = r6.A01
            if (r3 == 0) goto L_0x0275
            X.00H r0 = r4.A0P
            java.lang.Object r8 = r0.get()
            X.4Zj r8 = (X.C88354Zj) r8
            int r0 = r3.getContainerType()
            boolean r0 = r8.A06(r1, r0)
            if (r0 == 0) goto L_0x0275
            X.2sn r8 = r4.A0c
            r0 = 56
            r10 = 0
            r8.A02(r1, r2, r0, r10)
            X.8BG r8 = X.C63892tr.A01(r1)
            X.36k r24 = r4.A1o(r1)
            X.00H r0 = r4.A0P
            java.lang.Object r13 = r0.get()
            X.4Zj r13 = (X.C88354Zj) r13
            android.widget.LinearLayout r0 = r6.A06
            if (r8 != 0) goto L_0x00ae
            X.11S r12 = r4.A0U
            java.util.List r11 = java.util.Collections.emptyList()
            X.7CA r8 = new X.7CA
            r8.<init>(r12, r11)
        L_0x00ae:
            boolean r25 = r4.A1Y()
            boolean r26 = r4.A1Z()
            r21 = 0
            X.4V9 r16 = new X.4V9
            r29 = r10
            r27 = r10
            r22 = r16
            r23 = r8
            r28 = r10
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r8 = 28
            if (r9 == r8) goto L_0x00ce
            r8 = -1
            if (r9 != r8) goto L_0x00d0
        L_0x00ce:
            r21 = 1
        L_0x00d0:
            r8 = 29
            X.4rl r10 = new X.4rl
            r10.<init>(r6, r1, r8)
            r8 = 30
            X.4rl r11 = new X.4rl
            r11.<init>(r6, r1, r8)
            r9 = 16
        L_0x00e0:
            X.Ajp r8 = new X.Ajp
            r8.<init>(r9)
            r14 = r0
            r15 = r3
            r17 = r1
            r18 = r10
            r19 = r11
            r20 = r8
            r13.A02(r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x00f2:
            X.2rc r10 = X.AnonymousClass206.A00(r7)
            android.widget.TextView r3 = r6.A0C
            X.0vb r1 = r4.A0D
            X.11P r0 = r4.A0u
            X.C72473Md.A15(r3, r0, r1, r7)
            boolean r1 = r7.A0q
            r16 = 3
            r13 = 4
            r14 = 16
            r3 = 8
            r11 = 2
            r12 = 1
            r9 = -2
            r8 = 0
            android.widget.ImageView r0 = r6.A05
            if (r1 == 0) goto L_0x026e
            if (r0 != 0) goto L_0x0149
            android.widget.ImageView r0 = X.C72453Mb.A0U(r4)
            r6.A05 = r0
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r9, r9)
            r1.gravity = r14
            android.widget.ImageView r0 = r6.A05
            r0.setLayoutParams(r1)
            X.0vb r15 = r4.A0D
            android.widget.ImageView r1 = r6.A05
            int r0 = X.C72463Mc.A07(r4)
            X.C27641Ww.A05(r1, r15, r8, r0)
            android.widget.ImageView r1 = r6.A05
            android.view.View[] r15 = new android.view.View[r13]
            r15[r8] = r1
            android.widget.ImageView r0 = r6.A03
            r15[r12] = r0
            android.widget.ImageView r0 = r6.A04
            r15[r11] = r0
            r15[r16] = r2
            int r0 = X.C87424Vn.A00(r15, r8)
            r5.addView(r1, r0)
            r5.setClipChildren(r8)
        L_0x0149:
            android.widget.ImageView r1 = r6.A05
            android.content.Context r0 = r4.getContext()
            android.graphics.drawable.Drawable r0 = X.C87424Vn.A01(r0, r8, r8)
            r1.setImageDrawable(r0)
            android.widget.ImageView r0 = r6.A05
            r0.setVisibility(r8)
        L_0x015b:
            int r0 = r7.A0C()
            r1 = 1
            if (r12 == r0) goto L_0x0163
            r1 = 0
        L_0x0163:
            android.widget.ImageView r0 = r6.A03
            if (r1 == 0) goto L_0x0267
            if (r0 != 0) goto L_0x01a0
            android.widget.ImageView r0 = X.C72453Mb.A0U(r4)
            r6.A03 = r0
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r9, r9)
            r1.gravity = r14
            android.widget.ImageView r0 = r6.A03
            r0.setLayoutParams(r1)
            X.0vb r15 = r4.A0D
            android.widget.ImageView r1 = r6.A03
            int r0 = X.C72463Mc.A07(r4)
            X.C27641Ww.A05(r1, r15, r8, r0)
            android.widget.ImageView r1 = r6.A03
            android.view.View[] r15 = new android.view.View[r13]
            android.widget.ImageView r0 = r6.A05
            r15[r8] = r0
            r15[r12] = r1
            android.widget.ImageView r0 = r6.A04
            r15[r11] = r0
            r15[r16] = r2
            int r0 = X.C87424Vn.A00(r15, r12)
            r5.addView(r1, r0)
            r5.setClipChildren(r8)
        L_0x01a0:
            android.widget.ImageView r1 = r6.A03
            android.content.Context r0 = r4.getContext()
            android.graphics.drawable.Drawable r0 = X.C87424Vn.A01(r0, r12, r8)
            r1.setImageDrawable(r0)
            android.widget.ImageView r0 = r6.A03
            r0.setVisibility(r8)
        L_0x01b2:
            int r1 = X.C63892tr.A00(r7)
            android.widget.ImageView r0 = r6.A04
            if (r1 != r12) goto L_0x0261
            if (r0 != 0) goto L_0x01f3
            android.widget.ImageView r0 = X.C72453Mb.A0U(r4)
            r6.A04 = r0
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r9, r9)
            r1.gravity = r14
            android.widget.ImageView r0 = r6.A04
            r0.setLayoutParams(r1)
            X.0vb r9 = r4.A0D
            android.widget.ImageView r1 = r6.A04
            int r0 = X.C72463Mc.A07(r4)
            X.C27641Ww.A05(r1, r9, r8, r0)
            android.widget.ImageView r9 = r6.A04
            android.view.View[] r1 = new android.view.View[r13]
            android.widget.ImageView r0 = r6.A05
            r1[r8] = r0
            android.widget.ImageView r0 = r6.A03
            r1[r12] = r0
            r1[r11] = r9
            r1[r16] = r2
            int r0 = X.C87424Vn.A00(r1, r11)
            r5.addView(r9, r0)
            r5.setClipChildren(r8)
        L_0x01f3:
            android.widget.ImageView r1 = r6.A04
            android.content.Context r0 = r4.getContext()
            android.graphics.drawable.Drawable r0 = X.C87424Vn.A01(r0, r11, r8)
            r1.setImageDrawable(r0)
            android.widget.ImageView r0 = r6.A04
            r0.setVisibility(r8)
        L_0x0205:
            X.205 r9 = r7.A0v
            boolean r8 = r9.A02
            if (r8 == 0) goto L_0x022b
            android.widget.ImageView r11 = r6.A0B
            if (r11 == 0) goto L_0x022b
            int r0 = r4.getMessageStatus()
            int r5 = r4.A1k(r0)
            int r1 = r4.A1l(r0)
            if (r1 == 0) goto L_0x0225
            android.content.Context r0 = r4.getContext()
            android.content.res.ColorStateList r2 = X.C19740yt.A03(r0, r1)
        L_0x0225:
            X.C28081Yu.A00(r2, r11)
            r11.setImageResource(r5)
        L_0x022b:
            boolean r0 = r10.A0f
            if (r0 == 0) goto L_0x0241
            boolean r0 = r10.A0d
            if (r0 != 0) goto L_0x0241
            r30.A04()
        L_0x0236:
            com.whatsapp.stickers.StickerView r0 = r6.A0A
            X.4dp r2 = new X.4dp
            r2.<init>(r6, r7, r3)
        L_0x023d:
            r0.setOnLongClickListener(r2)
            return
        L_0x0241:
            boolean r0 = r10.A0V
            if (r0 == 0) goto L_0x024b
            boolean r0 = r10.A0c
            if (r0 == 0) goto L_0x0259
            if (r8 != 0) goto L_0x0259
        L_0x024b:
            boolean r0 = r7.A0l
            if (r0 == 0) goto L_0x025d
            if (r8 == 0) goto L_0x025d
            X.1BI r0 = r9.A00
            boolean r0 = X.C22971Dz.A0N(r0)
            if (r0 != 0) goto L_0x025d
        L_0x0259:
            r30.A05()
            goto L_0x0236
        L_0x025d:
            r30.A03()
            goto L_0x0236
        L_0x0261:
            if (r0 == 0) goto L_0x0205
            r0.setVisibility(r3)
            goto L_0x0205
        L_0x0267:
            if (r0 == 0) goto L_0x01b2
            r0.setVisibility(r3)
            goto L_0x01b2
        L_0x026e:
            if (r0 == 0) goto L_0x015b
            r0.setVisibility(r3)
            goto L_0x015b
        L_0x0275:
            android.widget.LinearLayout r0 = r6.A06
            if (r0 == 0) goto L_0x00f2
            X.00H r8 = r4.A0P
            java.lang.Object r13 = r8.get()
            X.4Zj r13 = (X.C88354Zj) r13
            X.11S r10 = r4.A0U
            java.util.List r9 = java.util.Collections.emptyList()
            X.7CA r8 = new X.7CA
            r8.<init>(r10, r9)
            boolean r19 = r4.A1Y()
            boolean r20 = r4.A1Z()
            r21 = 0
            X.4V9 r16 = new X.4V9
            r23 = r21
            r17 = r8
            r18 = r2
            r22 = r21
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r8 = 27
            X.4rl r10 = new X.4rl
            r10.<init>(r6, r1, r8)
            r8 = 28
            X.4rl r11 = new X.4rl
            r11.<init>(r6, r1, r8)
            r9 = 15
            goto L_0x00e0
        L_0x02b5:
            r8.A01 = r2
            goto L_0x0061
        L_0x02b9:
            com.whatsapp.stickers.StickerView r0 = r6.A0A
            r0.setImageDrawable(r2)
            goto L_0x023d
        L_0x02c0:
            android.view.View r0 = r6.A02
            X.C72453Mb.A1B(r0)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XZ.A01(X.21V, boolean):void");
    }
}
