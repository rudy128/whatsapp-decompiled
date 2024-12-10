package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass6E0;
import X.AnonymousClass6E1;
import X.C108945cZ;
import X.C120506Dy;
import X.C120516Dz;
import X.C123116Te;
import X.C136936ue;
import X.C1418377d;
import X.C17890vO;
import X.C17900vP;
import X.C200510q;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1", f = "AvatarOnDemandStickers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $remoteStickerList;
    public final /* synthetic */ List $stickerLocations;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1(AvatarOnDemandStickers avatarOnDemandStickers, List list, List list2, C30391dr r5) {
        super(2, r5);
        this.$remoteStickerList = list;
        this.$stickerLocations = list2;
        this.this$0 = avatarOnDemandStickers;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1(this.this$0, this.$remoteStickerList, this.$stickerLocations, r6);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object r0;
        if (this.label == 0) {
            C30691eM.A01(obj);
            List list = this.$remoteStickerList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list));
            for (Object next : list) {
                linkedHashMap.put(((C1418377d) next).A07, next);
            }
            List<C123116Te> list2 = this.$stickerLocations;
            AvatarOnDemandStickers avatarOnDemandStickers = this.this$0;
            ArrayList A13 = AnonymousClass000.A13();
            for (C123116Te r1 : list2) {
                if (r1 instanceof AnonymousClass6E0) {
                    r0 = new C120506Dy(((AnonymousClass6E0) r1).A00);
                } else if (r1 instanceof AnonymousClass6E1) {
                    String str2 = ((AnonymousClass6E1) r1).A00.A00;
                    C1418377d r2 = (C1418377d) linkedHashMap.get(str2);
                    if (r2 != null) {
                        String str3 = r2.A07;
                        String str4 = r2.A0I;
                        if (str3 == null) {
                            str = "sticker stable id is null";
                        } else if (str4 != null) {
                            r0 = new C120516Dz(r2, str3);
                        } else {
                            str = "sticker url is null";
                        }
                    } else {
                        str = "sticker is null";
                    }
                    C136936ue A0p = C108945cZ.A0p(avatarOnDemandStickers.A02);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("invalid / null data for sticker (");
                    A0p.A02(3, "observe_stickers_failed", C17900vP.A0B(str, A10));
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("AvatarOnDemandStickers/unable to fetch remote sticker for id ");
                    A102.append(str2);
                    C17890vO.A19(A102, ", invalid / null data");
                } else {
                    throw AnonymousClass3MW.A14();
                }
                A13.add(r0);
            }
            return A13;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
