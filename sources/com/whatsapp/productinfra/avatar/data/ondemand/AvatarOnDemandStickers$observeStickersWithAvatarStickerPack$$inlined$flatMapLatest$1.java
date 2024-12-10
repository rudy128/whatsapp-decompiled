package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass3MW;
import X.AnonymousClass6EP;
import X.AnonymousClass6EQ;
import X.AnonymousClass6ER;
import X.C108945cZ;
import X.C120476Dv;
import X.C120486Dw;
import X.C120496Dx;
import X.C123096Tc;
import X.C139726zL;
import X.C147197Se;
import X.C23421Fz;
import X.C27621Wu;
import X.C28243Du4;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import X.C88604aC;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1", f = "AvatarOnDemandStickers.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 extends C30431dv implements C36001nB {
    public final /* synthetic */ Integer $qplInstanceKey$inlined;
    public final /* synthetic */ C123096Tc $searchType$inlined;
    public final /* synthetic */ List $stableIds$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1(C123096Tc r2, AvatarOnDemandStickers avatarOnDemandStickers, Integer num, List list, C30391dr r6) {
        super(3, r6);
        this.$qplInstanceKey$inlined = num;
        this.this$0 = avatarOnDemandStickers;
        this.$searchType$inlined = r2;
        this.$stableIds$inlined = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Integer num = this.$qplInstanceKey$inlined;
        AvatarOnDemandStickers avatarOnDemandStickers = this.this$0;
        AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 = new AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1(this.$searchType$inlined, avatarOnDemandStickers, num, this.$stableIds$inlined, (C30391dr) obj3);
        avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1.L$0 = obj;
        avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1.L$1 = obj2;
        return avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C23421Fz r2;
        int A01;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r3 = (AnonymousClass1G2) this.L$0;
            Object obj3 = this.L$1;
            if (obj3 instanceof AnonymousClass6EP) {
                Integer num = this.$qplInstanceKey$inlined;
                if (num != null) {
                    A01 = num.intValue();
                } else {
                    A01 = AvatarOnDemandStickers.A00(this.this$0).A01();
                    AvatarOnDemandStickers.A00(this.this$0).A03(A01, "sticker_category_fetch_initiated");
                }
                r2 = new C28243Du4(new AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1(this.$searchType$inlined, this.this$0, this.$stableIds$inlined, (C30391dr) null, A01));
            } else {
                if (obj3 instanceof AnonymousClass6EQ) {
                    Integer num2 = this.$qplInstanceKey$inlined;
                    if (num2 != null) {
                        AvatarOnDemandStickers.A00(this.this$0).A03(num2.intValue(), "sticker_pack_loading");
                    }
                    C123096Tc r7 = this.$searchType$inlined;
                    List<C139726zL> list = this.$stableIds$inlined;
                    ArrayList A0D = C29351c6.A0D(list);
                    for (C139726zL r0 : list) {
                        A0D.add(new C120496Dx(r0.A00));
                    }
                    obj2 = new C120486Dw(r7, A0D);
                } else if (obj3 instanceof AnonymousClass6ER) {
                    C108945cZ.A0p(this.this$0.A02).A02(3, "observe_stickers_failed", "avatar sticker pack not available");
                    Integer num3 = this.$qplInstanceKey$inlined;
                    if (num3 != null) {
                        AvatarOnDemandStickers.A00(this.this$0).A03(num3.intValue(), "sticker_pack_unavailable");
                    }
                    obj2 = new C120476Dv(this.$searchType$inlined, AnonymousClass000.A0n("Avatar sticker pack not available"));
                } else {
                    throw AnonymousClass3MW.A14();
                }
                r2 = new C147197Se(obj2, 5);
            }
            this.label = 1;
            if (C88604aC.A02(this, r2, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
