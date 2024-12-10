package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.C1418377d;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$processSticker$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$processSticker$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ boolean $isFromStorePreview;
    public final /* synthetic */ boolean $isSearchFlow;
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$processSticker$1(AnonymousClass1BI r2, C1418377d r3, StickerInfoViewModel stickerInfoViewModel, C30391dr r5, boolean z, boolean z2) {
        super(2, r5);
        this.$chatJid = r2;
        this.this$0 = stickerInfoViewModel;
        this.$isSearchFlow = z;
        this.$sticker = r3;
        this.$isFromStorePreview = z2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new StickerInfoViewModel$processSticker$1(this.$chatJid, this.$sticker, this.this$0, r9, this.$isSearchFlow, this.$isFromStorePreview);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.6u8] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00de, code lost:
        if (r6.A0W != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0174, code lost:
        if (r2 != null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.label
            if (r0 != 0) goto L_0x0182
            X.C30691eM.A01(r10)
            X.1BI r2 = r9.$chatJid
            if (r2 == 0) goto L_0x001b
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r1 = r9.this$0
            X.00H r0 = r1.A0D
            java.lang.Object r0 = r0.get()
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1E7 r0 = r0.A0E(r2)
            r1.A00 = r0
        L_0x001b:
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r2 = r9.this$0
            X.00H r0 = r2.A0C
            java.lang.Object r1 = r0.get()
            X.4md r1 = (X.C95684md) r1
            X.1BI r0 = r9.$chatJid
            boolean r0 = r1.A01(r0)
            r2.A01 = r0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r5 = r9.this$0
            boolean r0 = r9.$isSearchFlow
            r5.A02 = r0
            X.77d r3 = r9.$sticker
            java.lang.String r2 = r3.A0B
            if (r2 != 0) goto L_0x0057
            java.lang.String r4 = r3.A0F
            if (r4 == 0) goto L_0x0157
            X.1Ns r1 = r5.A03
            java.lang.String r0 = r3.A0E
            java.io.File r2 = r1.A04(r4, r0)
            boolean r1 = r2.exists()
            r0 = 1
            if (r1 != r0) goto L_0x0128
            java.lang.String r2 = r2.getAbsolutePath()
        L_0x0050:
            if (r2 == 0) goto L_0x0157
            r0 = 1
            r3.A0B = r2
            r3.A01 = r0
        L_0x0057:
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r4 = r9.this$0
            X.77d r5 = r9.$sticker
            r8 = 0
            r0 = 0
            X.6u8 r3 = new X.6u8
            r3.<init>()
            r3.A0B = r0
            r3.A09 = r0
            r3.A0A = r0
            r3.A05 = r0
            r3.A08 = r0
            r3.A0D = r0
            r3.A02 = r8
            r3.A03 = r8
            r3.A01 = r8
            r3.A04 = r8
            r3.A06 = r0
            r3.A0C = r0
            r3.A07 = r0
            r3.A00 = r8
            X.00H r0 = r4.A0J
            java.lang.Object r1 = r0.get()
            X.70H r1 = (X.AnonymousClass70H) r1
            java.lang.Integer r0 = r5.A01()
            X.73B r1 = r1.A03(r0, r2)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x00f1
            java.lang.String r0 = r1.A02
            r3.A03 = r0
            java.lang.String r0 = r1.A01
            r3.A02 = r0
            java.lang.String r0 = r1.A00
            r3.A01 = r0
            java.lang.String r6 = r1.A0A
            r3.A04 = r6
            boolean r0 = r1.A0G
            r3.A0A = r0
            boolean r0 = r1.A0F
            r3.A08 = r0
            boolean r0 = r1.A0B
            r3.A06 = r0
            boolean r0 = r1.A0E
            r3.A07 = r0
            java.lang.String r0 = r1.A08
            r3.A00 = r0
            if (r6 == 0) goto L_0x00c6
            int r0 = r6.length()
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "play.google.com"
            boolean r0 = X.C137446vT.A01(r6, r0)
            if (r0 != 0) goto L_0x00c8
        L_0x00c6:
            r3.A04 = r8
        L_0x00c8:
            java.lang.String r7 = r1.A00
            if (r7 == 0) goto L_0x00f1
            boolean r6 = r1.A03
            X.1SB r1 = r4.A07
            r0 = 0
            X.725 r6 = r1.A06(r8, r7, r6, r0)
            if (r6 == 0) goto L_0x00f1
            java.lang.String r0 = r6.A03
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r6.A0W
            r1 = 0
            if (r0 == 0) goto L_0x00e1
        L_0x00e0:
            r1 = 1
        L_0x00e1:
            r3.A0B = r1
            java.lang.String r0 = r6.A04
            r3.A02 = r0
            java.lang.String r0 = r6.A0K
            r3.A03 = r0
            boolean r0 = r6.A0W
            r0 = r0 ^ 1
            r3.A05 = r0
        L_0x00f1:
            X.1SB r0 = r4.A07
            boolean r0 = r0.A0L(r5)
            r3.A09 = r0
            X.00H r0 = r4.A0B
            boolean r0 = X.C108975cc.A1I(r0)
            r3.A0D = r0
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0125
            X.00H r0 = r4.A0G
        L_0x0107:
            X.67t r1 = X.C108945cZ.A0w(r0)
            java.lang.String r0 = r5.A0F
            if (r0 == 0) goto L_0x0110
            r2 = r0
        L_0x0110:
            boolean r0 = r1.A0N(r2)
            r3.A0C = r0
            X.1wy r2 = r4.A0A
            X.1E7 r1 = r4.A00
            X.6HU r0 = new X.6HU
            r0.<init>(r1, r3)
            r2.A0E(r0)
        L_0x0122:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0125:
            X.00H r0 = r4.A0I
            goto L_0x0107
        L_0x0128:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.C108995ce.A1N(r1, r4)
            java.lang.String r0 = ".webp"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            X.00H r0 = r5.A0E
            java.lang.Object r0 = r0.get()
            X.17r r0 = (X.C218617r) r0
            X.2hC r0 = r0.A08()
            java.io.File r1 = r0.A02
            r0 = 0
            X.C218617r.A07(r1, r0)
            java.io.File r1 = X.C17880vN.A0e(r1, r2)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0157
            java.lang.String r2 = r1.getAbsolutePath()
            goto L_0x0050
        L_0x0157:
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r1 = r9.this$0
            X.77d r3 = r9.$sticker
            boolean r0 = r9.$isFromStorePreview
            if (r0 == 0) goto L_0x0178
            java.lang.String r2 = r3.A0F
            if (r2 == 0) goto L_0x0178
            X.1Ns r1 = r1.A03
            java.lang.String r0 = r3.A0E
            java.io.File r0 = r1.A04(r2, r0)
            java.lang.String r2 = r0.getAbsolutePath()
            r0 = 1
            r3.A0B = r2
            r3.A01 = r0
            if (r2 == 0) goto L_0x0178
            goto L_0x0057
        L_0x0178:
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r0 = r9.this$0
            X.1wy r1 = r0.A0A
            X.6HV r0 = X.AnonymousClass6HV.A00
            r1.A0E(r0)
            goto L_0x0122
        L_0x0182:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$processSticker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$processSticker$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
