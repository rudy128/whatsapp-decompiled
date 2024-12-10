package X;

import android.view.ViewGroup;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;

/* renamed from: X.5kS  reason: invalid class name and case insensitive filesystem */
public final class C111805kS extends C41251w3 {
    public final StickerExpressionsFragment A00;
    public final C125916bt A01;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        int i2 = 2131627124;
        if (i == 1) {
            i2 = 2131627125;
        }
        return new C113395n1(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, i2), this.A01);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1uf, java.lang.Object] */
    public C111805kS(StickerExpressionsFragment stickerExpressionsFragment, C125916bt r3) {
        super((C40411uf) new Object());
        this.A00 = stickerExpressionsFragment;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        if (((X.AnonymousClass614) r1).A00.A08 != false) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r12, int r13) {
        /*
            r11 = this;
            X.5n1 r12 = (X.C113395n1) r12
            r1 = 0
            X.C18070vi.A0d(r12, r1)
            java.lang.Object r6 = r11.A0U(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.stickers.packlist.StickerPackListViewData"
            X.C18070vi.A0z(r6, r0)
            X.6oe r6 = (X.C133376oe) r6
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r5 = r11.A00
            X.AnonymousClass3Ma.A1N(r6, r1, r5)
            boolean r4 = r6 instanceof X.AnonymousClass60Z
            java.lang.String r3 = "starred"
            java.lang.String r2 = "recent"
            if (r4 == 0) goto L_0x0125
            r0 = r6
            X.60Z r0 = (X.AnonymousClass60Z) r0
            java.lang.String r7 = r0.A03
        L_0x0023:
            X.6UU r1 = r6.A00()
            boolean r0 = r1 instanceof X.AnonymousClass613
            if (r0 == 0) goto L_0x0108
            X.613 r1 = (X.AnonymousClass613) r1
            X.725 r9 = r1.A00
        L_0x002f:
            if (r9 == 0) goto L_0x0112
            X.6bt r8 = r12.A04
            if (r8 == 0) goto L_0x0112
            com.google.android.material.imageview.ShapeableImageView r7 = r12.A02
            r0 = 0
            r7.setImageDrawable(r0)
            java.lang.String r0 = X.AnonymousClass725.A00(r9)
            r7.setTag(r0)
            X.7MY r1 = new X.7MY
            r1.<init>(r7, r0)
            X.1SB r0 = r8.A00
            r0.A0F(r9, r1)
        L_0x004c:
            com.google.android.material.imageview.ShapeableImageView r9 = r12.A02
            boolean r10 = r6.A01()
            r9.setSelected(r10)
            android.view.View r8 = r12.A01
            r0 = 24
            X.C90014dO.A00(r8, r5, r6, r0)
            com.whatsapp.WaImageView r1 = r12.A03
            r7 = 0
            int r0 = X.C72453Mb.A07(r10)
            r1.setVisibility(r0)
            boolean r1 = r6 instanceof X.AnonymousClass60Y
            if (r1 == 0) goto L_0x00e3
            r0 = r6
            X.60Y r0 = (X.AnonymousClass60Y) r0
            java.lang.String r0 = r0.A01
        L_0x006f:
            r9.setContentDescription(r0)
            android.view.View r4 = r12.A00
            boolean r0 = r6 instanceof X.C1175660a
            if (r0 == 0) goto L_0x00e0
            r0 = r6
            X.60a r0 = (X.C1175660a) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00e0
        L_0x007f:
            r4.setVisibility(r7)
            boolean r0 = r6 instanceof X.AnonymousClass60X
            if (r0 != 0) goto L_0x009d
            if (r1 == 0) goto L_0x00db
            X.6UU r1 = r6.A00()
            boolean r0 = r1 instanceof X.AnonymousClass614
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.ui.stickergrid.StickerSection.Pack"
            X.C18070vi.A0z(r1, r0)
            X.614 r1 = (X.AnonymousClass614) r1
            X.725 r0 = r1.A00
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x00db
        L_0x009d:
            X.1bI r1 = r12.A05
            r0 = 0
        L_0x00a0:
            r1.A04(r0)
            X.6UU r1 = r6.A00()
            boolean r0 = r1 instanceof X.AnonymousClass615
            if (r0 == 0) goto L_0x01a3
            r0 = r1
            X.615 r0 = (X.AnonymousClass615) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x01a3
            android.view.View r0 = r12.A0H
            int r0 = X.C108985cd.A03(r0)
            r9.setColorFilter(r0)
            java.lang.String r1 = r1.A00()
            boolean r0 = X.C18070vi.A18(r1, r2)
            if (r0 == 0) goto L_0x00d0
            r1 = 44
        L_0x00c7:
            X.78O r0 = new X.78O
            r0.<init>((com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r5, (int) r1)
        L_0x00cc:
            r8.setOnClickListener(r0)
            return
        L_0x00d0:
            boolean r0 = X.C18070vi.A18(r1, r3)
            if (r0 == 0) goto L_0x00d9
            r1 = 45
            goto L_0x00c7
        L_0x00d9:
            r0 = 0
            goto L_0x00cc
        L_0x00db:
            X.1bI r1 = r12.A05
            r0 = 8
            goto L_0x00a0
        L_0x00e0:
            r7 = 8
            goto L_0x007f
        L_0x00e3:
            boolean r0 = r6 instanceof X.C1175660a
            if (r0 == 0) goto L_0x00ed
            r0 = r6
            X.60a r0 = (X.C1175660a) r0
            java.lang.String r0 = r0.A01
            goto L_0x006f
        L_0x00ed:
            if (r4 == 0) goto L_0x00f6
            r0 = r6
            X.60Z r0 = (X.AnonymousClass60Z) r0
            java.lang.String r0 = r0.A02
            goto L_0x006f
        L_0x00f6:
            boolean r0 = r6 instanceof X.AnonymousClass60X
            if (r0 == 0) goto L_0x0101
            r0 = r6
            X.60X r0 = (X.AnonymousClass60X) r0
            java.lang.String r0 = r0.A01
            goto L_0x006f
        L_0x0101:
            r0 = r6
            X.60W r0 = (X.AnonymousClass60W) r0
            java.lang.String r0 = r0.A02
            goto L_0x006f
        L_0x0108:
            boolean r0 = r1 instanceof X.AnonymousClass614
            if (r0 == 0) goto L_0x0112
            X.614 r1 = (X.AnonymousClass614) r1
            X.725 r9 = r1.A00
            goto L_0x002f
        L_0x0112:
            com.google.android.material.imageview.ShapeableImageView r1 = r12.A02
            if (r7 == 0) goto L_0x011f
            android.net.Uri r0 = android.net.Uri.parse(r7)
            r1.setImageURI(r0)
            goto L_0x004c
        L_0x011f:
            r0 = 0
            r1.setImageDrawable(r0)
            goto L_0x004c
        L_0x0125:
            boolean r0 = r6 instanceof X.AnonymousClass60W
            if (r0 == 0) goto L_0x0182
            com.google.android.material.imageview.ShapeableImageView r7 = r12.A02
            r0 = r6
            X.60W r0 = (X.AnonymousClass60W) r0
            int r0 = r0.A00
            r7.setImageResource(r0)
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x017e
            android.content.Context r8 = X.C108945cZ.A0D(r12)
            r1 = 2130971949(0x7f040d2d, float:1.755265E38)
            r0 = 2131103049(0x7f060d49, float:1.7818553E38)
            int r1 = X.AnonymousClass1YL.A00(r8, r1, r0)
        L_0x0147:
            android.view.View r0 = r12.A0H
            int r0 = X.AnonymousClass3MY.A02(r0, r1)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            X.C28081Yu.A00(r0, r7)
            X.6UU r0 = r6.A00()
            java.lang.String r1 = r0.A00()
            boolean r0 = X.C18070vi.A18(r1, r2)
            if (r0 != 0) goto L_0x0168
            boolean r0 = X.C18070vi.A18(r1, r3)
            if (r0 == 0) goto L_0x004c
        L_0x0168:
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r7)
            r0 = 2131165414(0x7f0700e6, float:1.7945044E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r0.width = r1
            X.AnonymousClass3MX.A1F(r7, r1)
            goto L_0x004c
        L_0x017e:
            r1 = 2131101222(0x7f060626, float:1.7814848E38)
            goto L_0x0147
        L_0x0182:
            boolean r0 = r6 instanceof X.C1175660a
            if (r0 == 0) goto L_0x018d
            r0 = r6
            X.60a r0 = (X.C1175660a) r0
            java.lang.String r7 = r0.A02
            goto L_0x0023
        L_0x018d:
            boolean r0 = r6 instanceof X.AnonymousClass60Y
            if (r0 == 0) goto L_0x0198
            r0 = r6
            X.60Y r0 = (X.AnonymousClass60Y) r0
            java.lang.String r7 = r0.A02
            goto L_0x0023
        L_0x0198:
            boolean r0 = r6 instanceof X.AnonymousClass60X
            if (r0 == 0) goto L_0x004c
            r0 = r6
            X.60X r0 = (X.AnonymousClass60X) r0
            java.lang.String r7 = r0.A02
            goto L_0x0023
        L_0x01a3:
            r9.clearColorFilter()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111805kS.Bmc(X.1xT, int):void");
    }

    public int getItemViewType(int i) {
        Object A0U = A0U(i);
        if ((A0U instanceof AnonymousClass60Z) || (A0U instanceof AnonymousClass60Y) || (A0U instanceof C1175660a) || (A0U instanceof AnonymousClass60X)) {
            return 0;
        }
        if (A0U instanceof AnonymousClass60W) {
            return 1;
        }
        throw AnonymousClass3MW.A14();
    }
}
