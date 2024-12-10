package com.whatsapp.community.iq;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass4A4;
import X.AnonymousClass8BR;
import X.AnonymousClass9F6;
import X.C108945cZ;
import X.C178709Ed;
import X.C178759Ei;
import X.C178769Ej;
import X.C17880vN;
import X.C20996Aco;
import X.C27621Wu;
import X.C29621ca;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72453Mb;
import X.C72473Md;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3", f = "GetGroupProfilePicturesProtocolHelper.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
public final class GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ Map $otherGroupJidPhotoIdMap;
    public final /* synthetic */ AnonymousClass1EC $parentGroupJid;
    public final /* synthetic */ AnonymousClass1EC $subgroupJidMeParticipating;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ GetGroupProfilePicturesProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3(GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper, AnonymousClass1EC r3, AnonymousClass1EC r4, String str, Map map, C30391dr r7) {
        super(2, r7);
        this.this$0 = getGroupProfilePicturesProtocolHelper;
        this.$iqId = str;
        this.$parentGroupJid = r3;
        this.$otherGroupJidPhotoIdMap = map;
        this.$subgroupJidMeParticipating = r4;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper = this.this$0;
        String str = this.$iqId;
        return new GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3(getGroupProfilePicturesProtocolHelper, this.$parentGroupJid, this.$subgroupJidMeParticipating, str, this.$otherGroupJidPhotoIdMap, r9);
    }

    public final Object invokeSuspend(Object obj) {
        C178759Ei r6;
        Object obj2 = obj;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj2);
            GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper = this.this$0;
            String str = this.$iqId;
            AnonymousClass1EC r9 = this.$parentGroupJid;
            Map map = this.$otherGroupJidPhotoIdMap;
            AnonymousClass1EC r10 = this.$subgroupJidMeParticipating;
            this.L$0 = getGroupProfilePicturesProtocolHelper;
            this.L$1 = str;
            this.L$2 = r9;
            this.L$3 = map;
            this.L$4 = r10;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            try {
                ArrayList A11 = C72453Mb.A11(map);
                Iterator A15 = AnonymousClass000.A15(map);
                while (true) {
                    r6 = null;
                    if (!A15.hasNext()) {
                        break;
                    }
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    AnonymousClass1EC r12 = (AnonymousClass1EC) A16.getKey();
                    String A10 = AnonymousClass8BR.A10(A16);
                    if (A10 != null) {
                        r6 = new C178759Ei(A10, 18);
                    }
                    A11.add(new C178709Ed(new C178769Ej(r12, 1), r6, new AnonymousClass4A4("preview", 3), new AnonymousClass4A4("url", 2)));
                }
                if (r10 != null) {
                    r6 = new C178759Ei(r10);
                }
                AnonymousClass9F6 r1 = new AnonymousClass9F6(r6, new C178759Ei(r9, new C178759Ei(str, 13)), (List) A11);
                C17880vN.A0U(getGroupProfilePicturesProtocolHelper.A01).A0I(new C20996Aco(r1, A0m, 0), (C29621ca) r1.A00, str, 375, GetGroupProfilePicturesProtocolHelper.A04);
            } catch (Exception e) {
                A0m.resumeWith(new C30671eK(C108945cZ.A1J(e)));
            }
            obj2 = A0m.A0C();
            if (obj2 == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj2);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
