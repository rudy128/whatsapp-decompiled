package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.5kU  reason: invalid class name and case insensitive filesystem */
public final class C111825kU extends C41251w3 {
    public AnonymousClass1SB A00;
    public AnonymousClass10I A01;
    public boolean A02;
    public final AnonymousClass1KB A03;
    public final C133806pW A04;
    public final C26631Sw A05;
    public final AnonymousClass778 A06;
    public final List A07 = AnonymousClass000.A13();
    public final C22821Di A08;
    public final C22821Di A09;
    public final C22821Di A0A;
    public final AnonymousClass1OS A0B;
    public final C36001nB A0C;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater A0K = C72463Mc.A0K(viewGroup, 0);
        int i2 = 2131626790;
        if (i == 1) {
            i2 = 2131626789;
        }
        return new C113385n0(AnonymousClass3MX.A0B(A0K, viewGroup, i2, false), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0077, code lost:
        r5 = (X.AnonymousClass60H) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r22, int r23) {
        /*
            r21 = this;
            r3 = r22
            X.5n0 r3 = (X.C113385n0) r3
            r2 = 0
            X.C18070vi.A0d(r3, r2)
            r0 = r21
            r6 = r23
            java.lang.Object r5 = r0.A0U(r6)
            X.6TF r5 = (X.AnonymousClass6TF) r5
            if (r5 == 0) goto L_0x0058
            boolean r0 = r5 instanceof X.AnonymousClass60G
            if (r0 == 0) goto L_0x005b
            X.60G r5 = (X.AnonymousClass60G) r5
            android.view.View r8 = r3.A03
            r0 = 2131434210(0x7f0b1ae2, float:1.8490227E38)
            android.view.View r7 = X.AnonymousClass1HF.A06(r8, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaTextView"
            X.C18070vi.A0z(r7, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            X.5kU r6 = r3.A05
            java.lang.String r4 = r5.A01
            r7.setText(r4)
            android.content.Context r3 = r7.getContext()
            if (r3 == 0) goto L_0x0059
            r1 = 2131890545(0x7f121171, float:1.9415785E38)
            r0 = 1
            java.lang.String r1 = X.C17890vO.A0R(r3, r4, r0, r2, r1)
        L_0x003f:
            r0 = 22
            X.C90014dO.A00(r7, r6, r5, r0)
            r7.setText(r1)
            r0 = 2131429123(0x7f0b0703, float:1.847991E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r8, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaImageView"
            X.C18070vi.A0z(r1, r0)
            r0 = 23
            X.C90014dO.A00(r1, r6, r5, r0)
        L_0x0058:
            return
        L_0x0059:
            r1 = 0
            goto L_0x003f
        L_0x005b:
            android.view.View r1 = r3.A03
            r0 = 2131435423(0x7f0b1f9f, float:1.8492688E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.facebook.shimmer.ShimmerFrameLayout r0 = (com.facebook.shimmer.ShimmerFrameLayout) r0
            r3.A00 = r0
            r0 = 2131431036(0x7f0b0e7c, float:1.848379E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.stickers.StickerView r1 = (com.whatsapp.stickers.StickerView) r1
            r3.A01 = r1
            boolean r0 = r5 instanceof X.AnonymousClass60I
            if (r0 != 0) goto L_0x00f9
            X.60H r5 = (X.AnonymousClass60H) r5
            X.77d r12 = r5.A02
            if (r12 == 0) goto L_0x00f9
            int r0 = r23 + 1
            java.lang.String r11 = java.lang.String.valueOf(r0)
            X.5kU r4 = r3.A05
            int r0 = r4.A0Q()
            java.lang.String r10 = java.lang.String.valueOf(r0)
            X.778 r0 = r4.A06
            r1 = 0
            if (r0 == 0) goto L_0x0096
            java.lang.String r9 = r0.A02
            if (r9 != 0) goto L_0x0098
        L_0x0096:
            java.lang.String r9 = ""
        L_0x0098:
            com.whatsapp.stickers.StickerView r0 = r3.A01
            if (r0 == 0) goto L_0x00b2
            android.content.Context r8 = r0.getContext()
            if (r8 == 0) goto L_0x00b2
            r7 = 2131896468(0x7f122894, float:1.9427798E38)
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r2] = r11
            r0 = 1
            r1[r0] = r10
            r0 = 2
            java.lang.String r1 = X.C17880vN.A0q(r8, r9, r1, r0, r7)
        L_0x00b2:
            com.whatsapp.stickers.StickerView r0 = r3.A01
            if (r0 == 0) goto L_0x00b9
            r0.setContentDescription(r1)
        L_0x00b9:
            com.whatsapp.stickers.StickerView r0 = r3.A01
            if (r0 == 0) goto L_0x00c9
            r14 = 2
            X.78D r9 = new X.78D
            r10 = r4
            r11 = r5
            r13 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            r0.setOnClickListener(r9)
        L_0x00c9:
            com.whatsapp.stickers.StickerView r1 = r3.A01
            if (r1 == 0) goto L_0x00d5
            X.78g r0 = new X.78g
            r0.<init>(r4, r5, r12, r6)
            r1.setOnLongClickListener(r0)
        L_0x00d5:
            boolean r1 = r5.A04
            com.whatsapp.stickers.StickerView r11 = r3.A01
            if (r11 == 0) goto L_0x0058
            X.1Sw r0 = r4.A05
            int r14 = r12.A03
            int r15 = r12.A02
            r18 = r1 ^ 1
            X.7ML r13 = new X.7ML
            r13.<init>(r3, r1)
            r16 = 1
            X.2my r10 = new X.2my
            r20 = r2
            r17 = r2
            r19 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.A06(r10)
            return
        L_0x00f9:
            if (r1 == 0) goto L_0x0103
            r0 = 8
            r1.setVisibility(r0)
            r0 = 1
            r1.A02 = r0
        L_0x0103:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r3.A00
            if (r0 == 0) goto L_0x0058
            r0.setVisibility(r2)
            r0.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111825kU.Bmc(X.1xT, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1uf, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111825kU(AnonymousClass1KB r5, C133806pW r6, C26631Sw r7, AnonymousClass1SB r8, AnonymousClass778 r9, AnonymousClass10I r10, C22821Di r11, C22821Di r12, C22821Di r13, AnonymousClass1OS r14, C36001nB r15) {
        super((C40411uf) new Object());
        C18070vi.A0o(r5, r10, r6);
        C18070vi.A0g(r8, 4, r7);
        this.A03 = r5;
        this.A01 = r10;
        this.A04 = r6;
        this.A00 = r8;
        this.A05 = r7;
        this.A06 = r9;
        this.A0A = r11;
        this.A0C = r15;
        this.A0B = r14;
        this.A08 = r12;
        this.A09 = r13;
        int i = 0;
        do {
            this.A07.add(AnonymousClass60I.A00);
            i++;
        } while (i < 4);
    }

    public int getItemViewType(int i) {
        return A0U(i) instanceof AnonymousClass60G ? 1 : 0;
    }
}
