package com.whatsapp.productinfra.avatar.ui.stickers.upsell;

import X.AnonymousClass73V;
import X.C136936ue;
import X.C18070vi;
import X.C18600wl;
import X.C27021Uk;
import X.C27031Ul;
import X.C72473Md;
import android.app.Activity;
import android.view.View;

public final class AvatarStickerUpsellViewController {
    public final Activity A00;
    public final View A01;
    public final C27031Ul A02;
    public final AnonymousClass73V A03;
    public final C136936ue A04;
    public final C27021Uk A05;
    public final C18600wl A06;

    public AvatarStickerUpsellViewController(Activity activity, View view, C27021Uk r4, C27031Ul r5, AnonymousClass73V r6, C136936ue r7, C18600wl r8) {
        C18070vi.A0d(view, 1);
        C72473Md.A1M(r7, r4, r5, 3);
        C18070vi.A0d(r6, 6);
        this.A01 = view;
        this.A00 = activity;
        this.A04 = r7;
        this.A05 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A06 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        if (X.C30451dy.A00(r5, r1, r0) == r4) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C123156Ti r10, X.C30391dr r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C147817Up
            if (r0 == 0) goto L_0x00ad
            r5 = r11
            X.7Up r5 = (X.C147817Up) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ad
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r6 = 3
            r8 = 2
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L_0x005c
            if (r0 == r7) goto L_0x0058
            if (r0 == r8) goto L_0x004e
            if (r0 != r6) goto L_0x00b9
            boolean r7 = r5.Z$0
            java.lang.Object r10 = r5.L$1
            java.lang.Object r2 = r5.L$0
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController r2 = (com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController) r2
            X.C30691eM.A01(r1)
        L_0x002f:
            if (r7 != 0) goto L_0x0040
            X.6ES r0 = X.AnonymousClass6ES.A00
            boolean r0 = X.C18070vi.A18(r10, r0)
            if (r0 == 0) goto L_0x0043
            r1 = 14
        L_0x003b:
            X.6ue r0 = r2.A04
            r0.A03(r3, r1)
        L_0x0040:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0043:
            X.6ET r0 = X.AnonymousClass6ET.A00
            boolean r0 = X.C18070vi.A18(r10, r0)
            if (r0 == 0) goto L_0x00b4
            r1 = 9
            goto L_0x003b
        L_0x004e:
            java.lang.Object r10 = r5.L$1
            java.lang.Object r2 = r5.L$0
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController r2 = (com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController) r2
            X.C30691eM.A01(r1)
            goto L_0x0093
        L_0x0058:
            X.C30691eM.A01(r1)
            goto L_0x0040
        L_0x005c:
            X.C30691eM.A01(r1)
            X.1Ul r0 = r9.A02
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r2 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "pref_has_dismissed_sticker_upsell"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0084
            boolean r0 = r10 instanceof X.AnonymousClass6ET
            if (r0 == 0) goto L_0x0084
            X.0wl r1 = r9.A06
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$2 r0 = new com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$2
            r0.<init>(r9, r3)
            r5.label = r7
            java.lang.Object r0 = X.C30451dy.A00(r5, r1, r0)
            if (r0 != r4) goto L_0x0040
        L_0x0083:
            return r4
        L_0x0084:
            X.1Uk r0 = r9.A05
            r5.L$0 = r9
            r5.L$1 = r10
            r5.label = r8
            java.lang.Object r1 = r0.A00(r5, r1)
            if (r1 == r4) goto L_0x0083
            r2 = r9
        L_0x0093:
            boolean r7 = X.AnonymousClass000.A1Y(r1)
            X.0wl r1 = r2.A06
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3 r0 = new com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3
            r0.<init>(r2, r3, r7)
            r5.L$0 = r2
            r5.L$1 = r10
            r5.Z$0 = r7
            r5.label = r6
            java.lang.Object r0 = X.C30451dy.A00(r5, r1, r0)
            if (r0 != r4) goto L_0x002f
            return r4
        L_0x00ad:
            X.7Up r5 = new X.7Up
            r5.<init>(r9, r11)
            goto L_0x0012
        L_0x00b4:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController.A00(X.6Ti, X.1dr):java.lang.Object");
    }
}
