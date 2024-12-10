package X;

import android.view.View;

/* renamed from: X.78j  reason: invalid class name and case insensitive filesystem */
public class C1421578j implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1421578j(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnLongClickListener(new C1421578j(obj, obj2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a2, code lost:
        r1 = r2.A01.A0A;
        X.C18070vi.A0X(r1);
        r3.C6g(r1, r2.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012e, code lost:
        r4.A05 = java.lang.Integer.valueOf(r0);
        r3 = new com.whatsapp.stickers.Hilt_StarStickerFromPickerDialogFragment();
        r1 = X.C17880vN.A0D();
        r1.putParcelable("sticker", r4);
        r3.A1R(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0145, code lost:
        r0 = r2.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0147, code lost:
        r0 = X.AnonymousClass1L9.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x014b, code lost:
        ((X.AnonymousClass1FU) r0).CMl(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02a2, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02a4, code lost:
        r0.BxT(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x02e6;
                case 1: goto L_0x02a9;
                case 2: goto L_0x0298;
                case 3: goto L_0x028d;
                case 4: goto L_0x0280;
                case 5: goto L_0x030c;
                case 6: goto L_0x02fa;
                case 7: goto L_0x025f;
                case 8: goto L_0x023b;
                case 9: goto L_0x0213;
                case 10: goto L_0x01e1;
                case 11: goto L_0x019f;
                case 12: goto L_0x0112;
                case 13: goto L_0x00af;
                case 14: goto L_0x0096;
                case 15: goto L_0x007e;
                case 16: goto L_0x006f;
                case 17: goto L_0x0054;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A01
            X.6KJ r2 = (X.AnonymousClass6KJ) r2
            java.lang.Object r1 = r14.A02
            X.6Jh r1 = (X.C121346Jh) r1
            java.util.List r0 = X.C42011xT.A0I
            r7 = 1
            X.5lM r0 = r2.A0F
            X.2Dk r6 = r1.A0A
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A0Z
            com.whatsapp.updates.viewmodels.UpdatesViewModel r5 = r0.A0P
            if (r5 == 0) goto L_0x0052
            X.70D r0 = com.whatsapp.updates.viewmodels.UpdatesViewModel.A00(r5)
            boolean r4 = r0.A05(r6)
            X.70D r0 = com.whatsapp.updates.viewmodels.UpdatesViewModel.A00(r5)
            boolean r3 = r0.A00
            X.70D r2 = com.whatsapp.updates.viewmodels.UpdatesViewModel.A00(r5)
            X.70D r0 = com.whatsapp.updates.viewmodels.UpdatesViewModel.A00(r5)
            java.util.Set r0 = r0.A01()
            int r1 = r0.size()
            r0 = 1
            if (r1 != r7) goto L_0x003e
            if (r4 == 0) goto L_0x003e
            r0 = 0
        L_0x003e:
            r2.A00 = r0
            r0 = r4 ^ 1
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A06(r6, r5, r0)
            if (r3 == 0) goto L_0x004f
            X.70D r0 = com.whatsapp.updates.viewmodels.UpdatesViewModel.A00(r5)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0052
        L_0x004f:
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0E(r5)
        L_0x0052:
            r4 = 1
        L_0x0053:
            return r4
        L_0x0054:
            java.lang.Object r1 = r14.A01
            X.6Js r1 = (X.C121456Js) r1
            java.lang.Object r3 = r14.A02
            X.6J8 r3 = (X.AnonymousClass6J8) r3
            java.util.List r0 = X.C42011xT.A0I
            X.1kg r2 = r1.A0E
            X.6JB r3 = (X.AnonymousClass6JB) r3
            X.2sx r0 = r3.A01
            com.whatsapp.jid.UserJid r1 = r0.A0A
            X.C18070vi.A0X(r1)
            boolean r0 = r3.A07
            r2.C6g(r1, r0)
            goto L_0x0052
        L_0x006f:
            java.lang.Object r1 = r14.A01
            X.6Jr r1 = (X.C121446Jr) r1
            java.lang.Object r2 = r14.A02
            X.6J8 r2 = (X.AnonymousClass6J8) r2
            java.util.List r0 = X.C42011xT.A0I
            X.8AW r3 = r1.A0C
            X.6JB r2 = (X.AnonymousClass6JB) r2
            goto L_0x00a2
        L_0x007e:
            java.lang.Object r1 = r14.A01
            X.6Jn r1 = (X.C121406Jn) r1
            java.lang.Object r3 = r14.A02
            X.6JB r3 = (X.AnonymousClass6JB) r3
            java.util.List r0 = X.C42011xT.A0I
            r2 = 0
            X.1kf r1 = r1.A06
            X.2sx r0 = r3.A01
            com.whatsapp.jid.UserJid r0 = r0.A0A
            X.C18070vi.A0X(r0)
            r1.C6g(r0, r2)
            goto L_0x0052
        L_0x0096:
            java.lang.Object r1 = r14.A01
            X.6Jo r1 = (X.C121416Jo) r1
            java.lang.Object r2 = r14.A02
            X.6JB r2 = (X.AnonymousClass6JB) r2
            java.util.List r0 = X.C42011xT.A0I
            X.8AW r3 = r1.A07
        L_0x00a2:
            X.2sx r0 = r2.A01
            com.whatsapp.jid.UserJid r1 = r0.A0A
            X.C18070vi.A0X(r1)
            boolean r0 = r2.A07
            r3.C6g(r1, r0)
            goto L_0x0052
        L_0x00af:
            java.lang.Object r2 = r14.A01
            X.6d4 r2 = (X.C126646d4) r2
            java.lang.Object r1 = r14.A02
            X.5mz r1 = (X.C113375mz) r1
            java.util.List r0 = X.C42011xT.A0I
            r10 = 1
            X.C18070vi.A0d(r1, r10)
            com.whatsapp.TextEmojiLabel r0 = r1.A00
            android.content.Context r8 = X.AnonymousClass3MY.A04(r0)
            java.lang.String r9 = X.AnonymousClass3Ma.A13(r0)
            java.lang.String r7 = r1.A03
            X.5kn r6 = r2.A00
            java.util.List r1 = r6.A06
            int r0 = r1.size()
            r5 = 2131889340(0x7f120cbc, float:1.941334E38)
            if (r0 <= r10) goto L_0x00d9
            r5 = 2131895142(0x7f122366, float:1.9425109E38)
        L_0x00d9:
            int r0 = r1.size()
            r4 = 2131898874(0x7f1231fa, float:1.9432678E38)
            if (r0 <= r10) goto L_0x00e5
            r4 = 2131895092(0x7f122334, float:1.9425007E38)
        L_0x00e5:
            r0 = 31
            X.74r r3 = new X.74r
            r3.<init>(r0)
            X.750 r2 = new X.750
            r2.<init>(r6, r9, r7, r10)
            X.3Rj r1 = X.AnonymousClass4a6.A00(r8)
            java.lang.String r0 = r8.getString(r5)
            r1.A0S(r0)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            java.lang.String r0 = r8.getString(r0)
            r1.A0J(r3, r0)
            java.lang.String r0 = r8.getString(r4)
            r1.A0L(r2, r0)
            X.AnonymousClass3MY.A1G(r1)
            goto L_0x0052
        L_0x0112:
            java.lang.Object r1 = r14.A01
            X.5l4 r1 = (X.C112185l4) r1
            java.lang.Object r4 = r14.A02
            X.77d r4 = (X.C1418377d) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.85r r1 = r1.A02
            if (r1 == 0) goto L_0x0323
            X.7MQ r1 = (X.AnonymousClass7MQ) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0152;
                case 1: goto L_0x0176;
                case 2: goto L_0x017c;
                case 3: goto L_0x0189;
                default: goto L_0x0129;
            }
        L_0x0129:
            java.lang.Object r2 = r1.A01
            X.7Kl r2 = (X.C145227Kl) r2
            r0 = 4
        L_0x012e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A05 = r0
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment r3 = new com.whatsapp.stickers.StarStickerFromPickerDialogFragment
            r3.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "sticker"
            r1.putParcelable(r0, r4)
            r3.A1R(r1)
        L_0x0145:
            android.content.Context r0 = r2.A0B
        L_0x0147:
            android.app.Activity r0 = X.AnonymousClass1L9.A00(r0)
        L_0x014b:
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.CMl(r3)
            goto L_0x0052
        L_0x0152:
            java.lang.Object r2 = r1.A01
            X.7Kl r2 = (X.C145227Kl) r2
            java.lang.Integer r0 = X.C17880vN.A0j()
            r4.A05 = r0
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment r3 = new com.whatsapp.stickers.StarStickerFromPickerDialogFragment
            r3.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "sticker"
            r1.putParcelable(r0, r4)
            r3.A1R(r1)
            android.content.Context r1 = r2.A0B
            java.lang.Class<X.1FU> r0 = X.AnonymousClass1FU.class
            android.app.Activity r0 = X.AnonymousClass1L9.A01(r1, r0)
            goto L_0x014b
        L_0x0176:
            java.lang.Object r2 = r1.A01
            X.7Kl r2 = (X.C145227Kl) r2
            r0 = 3
            goto L_0x012e
        L_0x017c:
            java.lang.Object r1 = r1.A01
            X.6Hy r1 = (X.C121156Hy) r1
            boolean r0 = r1.A0D
            com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment r3 = com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment.A00(r4, r0)
            android.content.Context r0 = r1.A0B
            goto L_0x0147
        L_0x0189:
            java.lang.Object r2 = r1.A01
            X.7Kl r2 = (X.C145227Kl) r2
            java.lang.String r1 = "sticker"
            com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment r3 = new com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment
            r3.<init>()
            android.os.Bundle r0 = X.C17880vN.A0D()
            r0.putParcelable(r1, r4)
            r3.A1R(r0)
            goto L_0x0145
        L_0x019f:
            java.lang.Object r4 = r14.A01
            X.8Gc r4 = (X.C161588Gc) r4
            java.lang.Object r3 = r14.A02
            X.8pf r3 = (X.C170318pf) r3
            X.11C r0 = r4.A0N
            android.content.ClipboardManager r1 = r0.A09()
            r2 = 0
            if (r1 != 0) goto L_0x01ba
            X.1KB r1 = r4.A0I
            r0 = 2131897878(0x7f122e16, float:1.9430658E38)
            r1.A08(r0, r2)
            goto L_0x0052
        L_0x01ba:
            X.9ue r0 = r3.A0H     // Catch:{ NullPointerException | SecurityException -> 0x01d7 }
            X.77e r0 = r0.A08     // Catch:{ NullPointerException | SecurityException -> 0x01d7 }
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r0 = r0.A00     // Catch:{ NullPointerException | SecurityException -> 0x01d7 }
        L_0x01c2:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ NullPointerException | SecurityException -> 0x01d7 }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)     // Catch:{ NullPointerException | SecurityException -> 0x01d7 }
            r1.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x01d7 }
            X.1KB r1 = r4.A0I     // Catch:{ NullPointerException | SecurityException -> 0x01d7 }
            r0 = 2131897525(0x7f122cb5, float:1.9429942E38)
            r1.A08(r0, r2)     // Catch:{ NullPointerException | SecurityException -> 0x01d7 }
            goto L_0x0052
        L_0x01d5:
            r0 = 0
            goto L_0x01c2
        L_0x01d7:
            X.1KB r1 = r4.A0I
            r0 = 2131897878(0x7f122e16, float:1.9430658E38)
            r1.A08(r0, r2)
            goto L_0x0052
        L_0x01e1:
            java.lang.Object r1 = r14.A01
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            java.lang.Object r0 = r14.A02
            java.util.Set r13 = java.util.Collections.singleton(r0)
            X.1FL r2 = r1.A1D()
            X.1KB r3 = r1.A0F
            X.1gc r10 = r1.A0r
            X.11S r4 = r1.A0G
            X.1M9 r5 = r1.A0K
            X.0vb r8 = r1.A0W
            X.11C r7 = r1.A0Q
            X.1Me r6 = r1.A0M
            X.0vc r11 = r1.A0v
            X.00H r0 = r1.A1Q
            java.lang.Object r12 = r0.get()
            X.1y1 r12 = (X.C42341y1) r12
            X.00H r0 = r1.A1G
            r0.get()
            X.0ve r9 = r1.A0e
            X.C63752td.A03(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0052
        L_0x0213:
            java.lang.Object r4 = r14.A01
            X.77J r4 = (X.AnonymousClass77J) r4
            java.lang.Object r3 = r14.A02
            X.66Q r3 = (X.AnonymousClass66Q) r3
            java.util.List r0 = X.C42011xT.A0I
            r2 = 0
            X.621 r1 = new X.621
            r1.<init>()
            int r0 = r4.A00
            int r0 = X.C123876We.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.18K r0 = r3.A07
            r0.CC7(r1)
            X.87C r0 = r3.A09
            r0.BvG(r4, r2)
            goto L_0x0052
        L_0x023b:
            java.lang.Object r3 = r14.A01
            X.5mr r3 = (X.C113295mr) r3
            java.lang.Object r2 = r14.A02
            X.8A8 r2 = (X.AnonymousClass8A8) r2
            java.util.List r0 = X.C42011xT.A0I
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            boolean r0 = r3.A02
            r4 = 0
            if (r0 == 0) goto L_0x0251
            r3.A02 = r1
            return r4
        L_0x0251:
            X.65B r1 = r3.A03
            X.8B2 r0 = r1.A08
            if (r0 == 0) goto L_0x0053
            boolean r0 = r2.BwJ(r0, r1)
            if (r0 == 0) goto L_0x0053
            goto L_0x0052
        L_0x025f:
            java.lang.Object r1 = r14.A01
            X.5nM r1 = (X.C113605nM) r1
            java.lang.Object r4 = r14.A02
            X.5Zl r4 = (X.C107375Zl) r4
            X.1KW r5 = r1.A04
            android.widget.ImageView r3 = r1.A02
            X.737 r0 = r1.A01
            int[] r6 = r0.A00
            r7 = 0
            X.3RO r2 = new X.3RO
            r2.<init>(r3, r4, r5, r6, r7)
            com.whatsapp.emoji.EmojiContainerView r0 = r1.A03
            android.view.View r0 = r0.getRootView()
            X.AnonymousClass72X.A01(r3, r0, r2)
            goto L_0x0052
        L_0x0280:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.calllink.view.CallLinkActivity r1 = (com.whatsapp.calling.calllink.view.CallLinkActivity) r1
            java.lang.Object r0 = r14.A02
            X.76u r0 = (X.C1417476u) r0
            com.whatsapp.calling.calllink.view.CallLinkActivity.A0Q(r1, r0)
            goto L_0x0052
        L_0x028d:
            java.lang.Object r0 = r14.A01
            X.5wV r0 = (X.C116165wV) r0
            java.lang.Object r1 = r14.A02
            X.70A r1 = (X.AnonymousClass70A) r1
            X.5bq r0 = r0.A03
            goto L_0x02a2
        L_0x0298:
            java.lang.Object r0 = r14.A01
            X.5wX r0 = (X.C116185wX) r0
            java.lang.Object r1 = r14.A02
            X.70A r1 = (X.AnonymousClass70A) r1
            X.5bq r0 = r0.A03
        L_0x02a2:
            if (r0 == 0) goto L_0x0323
            r0.BxT(r1)
            goto L_0x0052
        L_0x02a9:
            java.lang.Object r5 = r14.A01
            X.5kP r5 = (X.C111775kP) r5
            java.lang.Object r4 = r14.A02
            X.5mv r4 = (X.C113335mv) r4
            X.AnonymousClass3MX.A1P(r4)
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x0323
            int r3 = r4.A05()
            r0 = -1
            if (r3 == r0) goto L_0x0323
            java.lang.Object r0 = r5.A0U(r3)
            X.6qf r0 = (X.C134486qf) r0
            java.util.Set r2 = r5.A01
            java.lang.String r1 = r0.A00
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x02e2
            r2.remove(r1)
        L_0x02d4:
            r5.A0G(r3)
            X.1Di r1 = r4.A03
            java.util.List r0 = X.C29431cG.A0t(r2)
            r1.invoke(r0)
            goto L_0x0052
        L_0x02e2:
            r2.add(r1)
            goto L_0x02d4
        L_0x02e6:
            java.lang.Object r2 = r14.A01
            X.1Zk r2 = (X.C28221Zk) r2
            java.lang.Object r1 = r14.A02
            X.1bm r1 = (X.C29201bm) r1
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0052
            r2.A06(r1)
            boolean r4 = r1.C4q()
            return r4
        L_0x02fa:
            java.lang.Object r0 = r14.A01
            X.2D6 r0 = (X.AnonymousClass2D6) r0
            java.lang.Object r3 = r14.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            X.1jm r2 = r0.A03
            X.1xZ r1 = r0.A06
            r0 = -1
            boolean r4 = r2.BxV(r1, r1, r3, r0)
            return r4
        L_0x030c:
            java.lang.Object r2 = r14.A01
            X.1Di r2 = (X.C22821Di) r2
            java.lang.Object r1 = r14.A02
            X.6sZ r1 = (X.C135666sZ) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.lang.Object r0 = r1.A03
            java.lang.Object r0 = r2.invoke(r0)
            boolean r4 = X.AnonymousClass000.A1Y(r0)
            return r4
        L_0x0323:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421578j.onLongClick(android.view.View):boolean");
    }
}
