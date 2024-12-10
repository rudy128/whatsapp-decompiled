package X;

import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.81P  reason: invalid class name */
public final class AnonymousClass81P extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StickerStorePackPreviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81P(StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        super(1);
        this.this$0 = stickerStorePackPreviewActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (((X.C145707Mh) r6).A01 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            X.85x r6 = (X.C1597985x) r6
            boolean r0 = r6 instanceof X.C145717Mi
            if (r0 != 0) goto L_0x004b
            boolean r0 = r6 instanceof X.AnonymousClass6IL
            if (r0 != 0) goto L_0x004b
            boolean r0 = r6 instanceof X.AnonymousClass6IK
            if (r0 != 0) goto L_0x0018
            boolean r0 = r6 instanceof X.C145707Mh
            if (r0 == 0) goto L_0x0051
            X.7Mh r6 = (X.C145707Mh) r6
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0088
        L_0x0018:
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r2 = r5.this$0
            r2.A2X()
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r2.A0B
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "viewModel"
        L_0x0023:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0028:
            X.725 r4 = r0.A0T()
            if (r4 == 0) goto L_0x0088
            X.6d0 r1 = new X.6d0
            r1.<init>(r2)
            X.1SB r0 = r2.A08
            if (r0 == 0) goto L_0x0048
            X.6LY r3 = new X.6LY
            r3.<init>(r0, r1)
            X.10I r2 = r2.A05
            r0 = 1
            X.725[] r1 = new X.AnonymousClass725[r0]
            r0 = 0
            r1[r0] = r4
            r2.CGD(r3, r1)
            goto L_0x0088
        L_0x0048:
            java.lang.String r0 = "stickerRepository"
            goto L_0x0023
        L_0x004b:
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = r5.this$0
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A0V(r0)
            goto L_0x0088
        L_0x0051:
            boolean r0 = r6 instanceof X.AnonymousClass8BH
            if (r0 == 0) goto L_0x0088
            boolean r0 = r6 instanceof X.C145677Me
            if (r0 != 0) goto L_0x004b
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = r5.this$0
            boolean r0 = com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A0q(r0)
            if (r0 == 0) goto L_0x008b
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = r5.this$0
            X.00H r0 = r0.A0D
            if (r0 == 0) goto L_0x00de
            boolean r0 = X.C108975cc.A1I(r0)
            if (r0 != 0) goto L_0x008b
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r3 = r5.this$0
            boolean r0 = r3.A0V
            if (r0 != 0) goto L_0x0083
            X.00H r0 = r3.A0E
            if (r0 == 0) goto L_0x00da
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.73V r2 = (X.AnonymousClass73V) r2
            r1 = 0
            java.lang.String r0 = "sticker_store_pack_preview"
            r2.A04(r3, r0, r1)
        L_0x0083:
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r1 = r5.this$0
            r0 = 1
            r1.A0V = r0
        L_0x0088:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x008b:
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r2 = r5.this$0
            X.6RG r1 = r2.A03
            if (r1 != 0) goto L_0x0094
            java.lang.String r0 = "stickerPackPreviewSource"
            goto L_0x0023
        L_0x0094:
            X.6RG r0 = X.AnonymousClass6RG.DEEPLINK
            if (r1 != r0) goto L_0x0088
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0088
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = r5.this$0
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L_0x0088
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = r5.this$0
            X.3Rj r3 = X.AnonymousClass4a6.A00(r0)
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r2 = r5.this$0
            r0 = 2131896449(0x7f122881, float:1.942776E38)
            r3.A0E(r0)
            r0 = 2131896448(0x7f122880, float:1.9427758E38)
            r3.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 34
            X.AnonymousClass758.A01(r3, r2, r0, r1)
            r0 = 10
            X.759 r1 = new X.759
            r1.<init>(r2, r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = r3.A00
            r0.A0O(r1)
            X.05w r1 = X.AnonymousClass3MY.A0L(r3)
            r0 = 0
            r1.setCanceledOnTouchOutside(r0)
            r1.show()
            goto L_0x0088
        L_0x00da:
            java.lang.String r0 = "avatarEditorLauncher"
            goto L_0x0023
        L_0x00de:
            java.lang.String r0 = "avatarConfigRepository"
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81P.invoke(java.lang.Object):java.lang.Object");
    }
}
