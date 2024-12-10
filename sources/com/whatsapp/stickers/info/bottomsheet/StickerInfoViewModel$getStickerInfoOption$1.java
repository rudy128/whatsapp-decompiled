package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass1OS;
import X.C122606Ra;
import X.C136636u8;
import X.C1418377d;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$getStickerInfoOption$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$getStickerInfoOption$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $fromMe;
    public final /* synthetic */ C122606Ra $origin;
    public final /* synthetic */ C1418377d $sticker;
    public final /* synthetic */ C136636u8 $stickerInfo;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$getStickerInfoOption$1(C1418377d r2, C136636u8 r3, C122606Ra r4, StickerInfoViewModel stickerInfoViewModel, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = stickerInfoViewModel;
        this.$fromMe = z;
        this.$sticker = r2;
        this.$stickerInfo = r3;
        this.$origin = r4;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new StickerInfoViewModel$getStickerInfoOption$1(this.$sticker, this.$stickerInfo, this.$origin, this.this$0, r9, this.$fromMe);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x022b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r11.A01, 5693) != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0234, code lost:
        if (r17 != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (X.C138986y1.A00(r11.A03) == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        if (r9.A08 == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cd, code lost:
        if (r8 == r2) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0116, code lost:
        if (r8 == X.C122606Ra.MESSAGE) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r2 = r21
            int r0 = r2.label
            if (r0 != 0) goto L_0x0244
            X.C30691eM.A01(r22)
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r1 = r2.this$0
            X.1wy r0 = r1.A09
            r20 = r0
            X.00H r0 = r1.A0K
            java.lang.Object r11 = r0.get()
            X.6hY r11 = (X.C129286hY) r11
            boolean r0 = r2.$fromMe
            r19 = r0
            X.77d r12 = r2.$sticker
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r0 = r2.this$0
            boolean r10 = r0.A01
            X.6u8 r9 = r2.$stickerInfo
            X.6Ra r8 = r2.$origin
            boolean r0 = r0.A02
            r18 = r0
            r13 = 1
            X.C18070vi.A0d(r12, r13)
            X.C108985cd.A1D(r9, r8)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.lang.String r0 = r12.A0B
            r6 = 0
            if (r0 == 0) goto L_0x0240
            boolean r17 = X.C108975cc.A1M(r0)
        L_0x003d:
            X.6Ra r5 = X.C122606Ra.STICKER_STORE_PREVIEW
            boolean r16 = X.AnonymousClass3Ma.A1Z(r8, r5)
            int r4 = r8.ordinal()
            if (r4 == r6) goto L_0x023c
            r0 = 2
            if (r4 == r0) goto L_0x023c
            r0 = 4
            if (r4 == r0) goto L_0x023c
            r0 = 7
            if (r4 == r0) goto L_0x023c
            if (r4 == r13) goto L_0x0238
            r3 = 0
        L_0x0055:
            X.6Ra r2 = X.C122606Ra.FULL_TEXT_SEARCH
            if (r8 != r2) goto L_0x005e
            X.6Hi r0 = X.C121026Hi.A00
            r7.add(r0)
        L_0x005e:
            X.6Ra r1 = X.C122606Ra.TRANSPARENT_IMAGE
            if (r8 != r1) goto L_0x0067
            X.6Hg r0 = X.C121006Hg.A00
            r7.add(r0)
        L_0x0067:
            if (r10 != 0) goto L_0x0234
            X.6Ra r0 = X.C122606Ra.MESSAGE
            if (r8 == r0) goto L_0x0234
            if (r8 == r2) goto L_0x0234
            if (r8 == r1) goto L_0x0234
            if (r17 == 0) goto L_0x00bb
            X.0ve r15 = r11.A01
            r14 = 7838(0x1e9e, float:1.0983E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r15, r14)
            if (r0 == 0) goto L_0x0084
            X.6Hh r0 = X.C121016Hh.A00
            r7.add(r0)
        L_0x0084:
            if (r8 == r1) goto L_0x00bb
            boolean r0 = r9.A09
            if (r0 != 0) goto L_0x00bb
            X.11S r0 = r11.A00
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x00b2
            X.0ve r15 = r11.A01
            r14 = 1396(0x574, float:1.956E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r15, r14)
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x00b6
            X.00H r0 = r11.A03
            boolean r0 = X.C138986y1.A00(r0)
            if (r0 == 0) goto L_0x00b6
        L_0x00b2:
            boolean r0 = r9.A08
            if (r0 != 0) goto L_0x00bb
        L_0x00b6:
            X.6HZ r0 = X.AnonymousClass6HZ.A00
            r7.add(r0)
        L_0x00bb:
            if (r3 == 0) goto L_0x00cd
            X.6Ra r0 = X.C122606Ra.TRAY_RECENT
            if (r8 == r0) goto L_0x00cf
            X.6Ra r0 = X.C122606Ra.TRAY_FAVORITES
            if (r8 == r0) goto L_0x00cf
            X.6HY r0 = new X.6HY
            r0.<init>(r13)
            r7.add(r0)
        L_0x00cd:
            if (r8 == r2) goto L_0x00de
        L_0x00cf:
            X.0ve r14 = r11.A01
            r0 = 11793(0x2e11, float:1.6526E-41)
            boolean r0 = X.C25291Nq.A04(r14, r0)
            if (r0 == 0) goto L_0x00de
            X.6Ha r0 = X.C120946Ha.A00
            r7.add(r0)
        L_0x00de:
            if (r10 != 0) goto L_0x00f1
            if (r8 == r2) goto L_0x00f8
            if (r16 == 0) goto L_0x00f1
            if (r17 == 0) goto L_0x00f1
            boolean r0 = r12.A0N
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f1
            X.6He r0 = X.C120986He.A00
            r7.add(r0)
        L_0x00f1:
            if (r8 != r1) goto L_0x00f8
            X.6Hd r0 = X.C120976Hd.A00
            r7.add(r0)
        L_0x00f8:
            X.11S r1 = r11.A00
            boolean r0 = r1.A0N()
            if (r0 != 0) goto L_0x020b
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x020b
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x020b
            X.0ve r15 = r11.A01
            r14 = 1396(0x574, float:1.956E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r15, r14)
            if (r0 == 0) goto L_0x020b
            X.6Ra r0 = X.C122606Ra.MESSAGE
            if (r8 != r0) goto L_0x011d
        L_0x0118:
            X.6Hk r0 = X.C121046Hk.A00
            r7.add(r0)
        L_0x011d:
            if (r10 != 0) goto L_0x015f
            if (r8 == r2) goto L_0x015f
            java.lang.String r5 = r9.A03
            java.lang.String r0 = "Giphy"
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 == 0) goto L_0x0146
            X.0ve r14 = r11.A01
            r5 = 3792(0xed0, float:5.314E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r14, r5)
            if (r0 == 0) goto L_0x0146
            java.lang.String r0 = r9.A02
            if (r0 == 0) goto L_0x0146
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0146
            X.6Hj r0 = X.C121036Hj.A00
            r7.add(r0)
        L_0x0146:
            if (r16 == 0) goto L_0x015f
            X.00H r0 = r11.A02
            java.lang.Object r5 = r0.get()
            X.6pW r5 = (X.C133806pW) r5
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x015f
            boolean r0 = r5.A00()
            if (r0 == 0) goto L_0x015f
            X.6Hb r0 = X.C120956Hb.A00
            r7.add(r0)
        L_0x015f:
            boolean r0 = r1.A0N()
            if (r0 != 0) goto L_0x0191
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0191
            boolean r0 = r9.A0D
            if (r0 != 0) goto L_0x0191
            X.0ve r5 = r11.A01
            r1 = 1396(0x574, float:1.956E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x0191
            X.0vf r1 = X.C18040vf.A01
            r0 = 9398(0x24b6, float:1.317E-41)
            boolean r0 = X.C18020vd.A05(r1, r5, r0)
            r1 = 2131233535(0x7f080aff, float:1.808321E38)
            if (r0 == 0) goto L_0x0189
            r1 = 2131231709(0x7f0803dd, float:1.8079507E38)
        L_0x0189:
            X.6HX r0 = new X.6HX
            r0.<init>(r1)
            r7.add(r0)
        L_0x0191:
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x01b7
            X.00H r0 = r11.A03
            boolean r0 = X.C138986y1.A00(r0)
            if (r0 == 0) goto L_0x01b7
            X.0ve r5 = r11.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 9398(0x24b6, float:1.317E-41)
            boolean r0 = X.C18020vd.A05(r1, r5, r0)
            r1 = 2131233535(0x7f080aff, float:1.808321E38)
            if (r0 == 0) goto L_0x01af
            r1 = 2131231709(0x7f0803dd, float:1.8079507E38)
        L_0x01af:
            X.6HW r0 = new X.6HW
            r0.<init>(r1)
            r7.add(r0)
        L_0x01b7:
            if (r10 != 0) goto L_0x01d2
            if (r8 == r2) goto L_0x01d2
            if (r16 == 0) goto L_0x01d2
            boolean r0 = r12.A0J
            if (r0 != 0) goto L_0x01d2
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x01d2
            if (r19 != 0) goto L_0x01d2
            boolean r0 = r12.A0N
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01d2
            X.6Hc r0 = X.C120966Hc.A00
            r7.add(r0)
        L_0x01d2:
            if (r17 == 0) goto L_0x01db
            if (r18 != 0) goto L_0x01db
            r0 = 2
            if (r4 == r0) goto L_0x01f5
            if (r4 == r13) goto L_0x01f5
        L_0x01db:
            if (r3 == 0) goto L_0x01ed
            X.6Ra r0 = X.C122606Ra.TRAY_RECENT
            if (r8 == r0) goto L_0x01e5
            X.6Ra r0 = X.C122606Ra.TRAY_FAVORITES
            if (r8 != r0) goto L_0x01ed
        L_0x01e5:
            X.6HY r0 = new X.6HY
            r0.<init>(r6)
            r7.add(r0)
        L_0x01ed:
            r0 = r20
            r0.A0E(r7)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x01f5:
            boolean r0 = r12.A0N
            if (r0 != 0) goto L_0x01db
            X.0ve r2 = r11.A01
            r1 = 8214(0x2016, float:1.151E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01db
            X.6Hf r0 = X.C120996Hf.A00
            r7.add(r0)
            goto L_0x01db
        L_0x020b:
            boolean r0 = r9.A0B
            if (r0 != 0) goto L_0x0219
            java.lang.String r0 = r9.A04
            if (r0 == 0) goto L_0x022f
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x022f
        L_0x0219:
            if (r8 == r5) goto L_0x011d
            boolean r0 = r12.A02()
            if (r0 == 0) goto L_0x0118
            X.0ve r14 = r11.A01
            r5 = 5693(0x163d, float:7.978E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r14, r5)
            if (r0 == 0) goto L_0x011d
            goto L_0x0118
        L_0x022f:
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x011d
            goto L_0x0219
        L_0x0234:
            if (r17 == 0) goto L_0x00bb
            goto L_0x0084
        L_0x0238:
            boolean r3 = r9.A0C
            goto L_0x0055
        L_0x023c:
            boolean r3 = r9.A09
            goto L_0x0055
        L_0x0240:
            r17 = 0
            goto L_0x003d
        L_0x0244:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$getStickerInfoOption$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$getStickerInfoOption$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
