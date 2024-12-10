package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Map;

/* renamed from: X.8Hf  reason: invalid class name and case insensitive filesystem */
public final class C161658Hf extends C38391rD {
    public final Map A00 = C17880vN.A11();
    public final /* synthetic */ CatalogCarouselDetailImageView A01;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A01;
        return new AnonymousClass8J4(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(catalogCarouselDetailImageView), viewGroup, 2131626620), catalogCarouselDetailImageView);
    }

    public C161658Hf(CatalogCarouselDetailImageView catalogCarouselDetailImageView) {
        this.A01 = catalogCarouselDetailImageView;
    }

    public int A0Q() {
        int i;
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A01;
        boolean A05 = C18020vd.A05(C18040vf.A02, catalogCarouselDetailImageView.getAbProps(), 10691);
        int i2 = 0;
        C20287AEv aEv = catalogCarouselDetailImageView.A01;
        if (A05) {
            if (aEv != null) {
                i = aEv.A0A.size();
            } else {
                i = 0;
            }
            C20287AEv aEv2 = catalogCarouselDetailImageView.A01;
            if (aEv2 != null) {
                i2 = aEv2.A0B.size();
            }
            return i2 + i;
        } else if (aEv != null) {
            return aEv.A0A.size();
        } else {
            return 0;
        }
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r3) {
        AnonymousClass8J4 r32 = (AnonymousClass8J4) r3;
        C18070vi.A0d(r32, 0);
        ThumbnailButton thumbnailButton = r32.A01;
        thumbnailButton.setImageBitmap((Bitmap) null);
        thumbnailButton.setOnClickListener((View.OnClickListener) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        if (r8 > 1) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r25, int r26) {
        /*
            r24 = this;
            r4 = r25
            X.8J4 r4 = (X.AnonymousClass8J4) r4
            r7 = 0
            X.C18070vi.A0d(r4, r7)
            r0 = r24
            java.util.Map r1 = r0.A00
            r6 = 1
            X.C18070vi.A0d(r1, r6)
            com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView r2 = r4.A03
            X.AEv r0 = r2.A01
            r9 = 0
            if (r0 == 0) goto L_0x0191
            java.util.List r0 = r0.A0A
            int r0 = r0.size()
        L_0x001d:
            r13 = 0
            r3 = r26
            if (r3 < r0) goto L_0x00aa
            X.AEv r0 = r2.A01
            if (r0 == 0) goto L_0x00a8
            java.util.List r0 = r0.A0A
            int r5 = r0.size()
        L_0x002c:
            X.AEv r0 = r2.A01
            if (r0 == 0) goto L_0x00a6
            java.util.List r0 = r0.A0B
            int r0 = r0.size()
        L_0x0036:
            int r5 = r5 + r0
            if (r3 >= r5) goto L_0x00aa
            android.widget.ImageView r0 = r4.A00
            r0.setVisibility(r7)
            X.AEv r0 = r2.A01
            if (r0 == 0) goto L_0x00a4
            java.util.List r0 = r0.A0A
            int r0 = r0.size()
        L_0x0048:
            int r5 = r26 - r0
            if (r5 < 0) goto L_0x0194
            X.AEv r0 = r2.A01
            if (r0 == 0) goto L_0x0194
            java.util.List r0 = r0.A0B
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x0194
            X.AEv r0 = r2.A01
            if (r0 == 0) goto L_0x00a3
            java.util.List r0 = r0.A0B
            java.lang.Object r9 = r0.get(r5)
            X.773 r9 = (X.AnonymousClass773) r9
            if (r9 == 0) goto L_0x00a3
            com.whatsapp.components.button.ThumbnailButton r8 = r4.A01
            X.AEv r0 = r2.A01
            if (r0 == 0) goto L_0x00a3
            java.lang.String r6 = r0.A0H
            if (r6 == 0) goto L_0x00a3
            java.lang.String r5 = X.A1M.A00(r6, r3)
            X.C18070vi.A0X(r5)
            java.lang.Object r0 = r8.getTag()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0087
            r0 = 2131101278(0x7f06065e, float:1.7814961E38)
            r8.setImageResource(r0)
        L_0x0087:
            r8.setTag(r5)
            X.A2v r7 = r2.A03
            if (r7 == 0) goto L_0x009b
            X.ANb r12 = new X.ANb
            r12.<init>(r4, r5, r1)
            X.9Zz r11 = r2.getImageLoadContext()
            r10 = r13
            r7.A05(r8, r9, r10, r11, r12)
        L_0x009b:
            X.9Ac r0 = new X.9Ac
            r0.<init>(r8, r2, r6, r3)
            r8.setOnClickListener(r0)
        L_0x00a3:
            return
        L_0x00a4:
            r0 = 0
            goto L_0x0048
        L_0x00a6:
            r0 = 0
            goto L_0x0036
        L_0x00a8:
            r5 = 0
            goto L_0x002c
        L_0x00aa:
            android.widget.ImageView r5 = r4.A00
            r0 = 8
            r5.setVisibility(r0)
            X.AEv r0 = r2.A01
            r5 = 1
            if (r0 == 0) goto L_0x00c4
            java.util.List r0 = r0.A0A
            boolean r0 = r0.isEmpty()
            if (r0 != r6) goto L_0x00c4
        L_0x00be:
            com.whatsapp.components.button.ThumbnailButton r0 = r4.A01
            X.AnonymousClass9PP.A00(r0)
            return
        L_0x00c4:
            X.AEv r0 = r2.A01
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r0.A02()
            if (r0 != r6) goto L_0x00cf
            goto L_0x00be
        L_0x00cf:
            X.0ve r10 = r2.getAbProps()
            r8 = 10691(0x29c3, float:1.4981E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r8 = X.C18020vd.A05(r0, r10, r8)
            X.AEv r0 = r2.A01
            if (r8 == 0) goto L_0x0184
            if (r0 == 0) goto L_0x0181
            java.util.List r0 = r0.A0A
            int r8 = r0.size()
        L_0x00e7:
            X.AEv r0 = r2.A01
            if (r0 == 0) goto L_0x017e
            java.util.List r0 = r0.A0B
            int r0 = r0.size()
        L_0x00f1:
            int r8 = r8 + r0
        L_0x00f2:
            if (r8 <= r6) goto L_0x018e
        L_0x00f4:
            X.AEv r0 = r2.A01
            if (r0 == 0) goto L_0x0175
            java.util.List r0 = r0.A0A
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0175
            X.AEv r0 = r2.A01
            if (r0 == 0) goto L_0x0173
            java.util.List r0 = r0.A0A
            java.lang.Object r13 = r0.get(r3)
            X.AEI r13 = (X.AEI) r13
            if (r13 == 0) goto L_0x0173
            int r10 = r13.A03
            int r9 = r13.A02
            if (r10 == 0) goto L_0x0119
            if (r9 == 0) goto L_0x0119
            X.AnonymousClass8J4.A01(r4, r10, r9, r5)
        L_0x0119:
            X.AEv r0 = r2.A01
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = r0.A0H
            java.lang.String r8 = X.A1M.A00(r0, r3)
            X.C18070vi.A0X(r8)
            com.whatsapp.components.button.ThumbnailButton r12 = r4.A01
            java.lang.Object r0 = r12.getTag()
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0138
            r0 = 2131101278(0x7f06065e, float:1.7814961E38)
            r12.setImageResource(r0)
        L_0x0138:
            r12.setTag(r8)
            if (r13 == 0) goto L_0x015e
            X.A2v r11 = r2.A03
            if (r11 == 0) goto L_0x015e
            X.ANe r17 = new X.ANe
            r22 = r9
            r23 = r5
            r19 = r8
            r20 = r1
            r21 = r10
            r18 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.9Zz r15 = r2.getImageLoadContext()
            r14 = 0
            r16 = r14
            r18 = r6
            r11.A03(r12, r13, r14, r15, r16, r17, r18)
        L_0x015e:
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x00a3
            com.whatsapp.components.button.ThumbnailButton r1 = r4.A01
            X.9Ad r0 = new X.9Ad
            if (r5 != 0) goto L_0x016f
            r0.<init>(r4, r3, r7, r2)
        L_0x016b:
            r1.setOnClickListener(r0)
            return
        L_0x016f:
            r0.<init>(r4, r3, r6, r2)
            goto L_0x016b
        L_0x0173:
            r10 = 0
            goto L_0x0119
        L_0x0175:
            com.whatsapp.components.button.ThumbnailButton r1 = r4.A01
            r0 = 2131101278(0x7f06065e, float:1.7814961E38)
            r1.setImageResource(r0)
            goto L_0x015e
        L_0x017e:
            r0 = 0
            goto L_0x00f1
        L_0x0181:
            r8 = 0
            goto L_0x00e7
        L_0x0184:
            if (r0 == 0) goto L_0x018e
            java.util.List r0 = r0.A0A
            int r8 = r0.size()
            goto L_0x00f2
        L_0x018e:
            r5 = 0
            goto L_0x00f4
        L_0x0191:
            r0 = 0
            goto L_0x001d
        L_0x0194:
            com.whatsapp.components.button.ThumbnailButton r1 = r4.A01
            r0 = 2131101278(0x7f06065e, float:1.7814961E38)
            r1.setImageResource(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161658Hf.Bmc(X.1xT, int):void");
    }
}
