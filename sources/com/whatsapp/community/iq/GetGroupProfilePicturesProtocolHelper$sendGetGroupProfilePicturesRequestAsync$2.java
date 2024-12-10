package com.whatsapp.community.iq;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.B5A;
import X.C17890vO;
import X.C18070vi;
import X.C193749qb;
import X.C20557APr;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import X.C55782gM;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$2", f = "GetGroupProfilePicturesProtocolHelper.kt", i = {0}, l = {116}, m = "invokeSuspend", n = {"iqId"}, s = {"L$0"})
public final class GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ B5A $callback;
    public final /* synthetic */ Map $otherGroupJidPhotoIdMap;
    public final /* synthetic */ AnonymousClass1EC $parentGroupJid;
    public final /* synthetic */ AnonymousClass1EC $subgroupJidMeParticipating;
    public Object L$0;
    public int label;
    public final /* synthetic */ GetGroupProfilePicturesProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$2(B5A b5a, GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper, AnonymousClass1EC r4, AnonymousClass1EC r5, Map map, C30391dr r7) {
        super(2, r7);
        this.this$0 = getGroupProfilePicturesProtocolHelper;
        this.$parentGroupJid = r4;
        this.$otherGroupJidPhotoIdMap = map;
        this.$subgroupJidMeParticipating = r5;
        this.$callback = b5a;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper = this.this$0;
        AnonymousClass1EC r3 = this.$parentGroupJid;
        Map map = this.$otherGroupJidPhotoIdMap;
        return new GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$2(this.$callback, getGroupProfilePicturesProtocolHelper, r3, this.$subgroupJidMeParticipating, map, r9);
    }

    public final Object invokeSuspend(Object obj) {
        Object A01;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            String A0T = C17890vO.A0T(this.this$0.A01);
            GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper = this.this$0;
            AnonymousClass1EC r2 = this.$parentGroupJid;
            Map map = this.$otherGroupJidPhotoIdMap;
            AnonymousClass1EC r0 = this.$subgroupJidMeParticipating;
            this.L$0 = A0T;
            this.label = 1;
            A01 = getGroupProfilePicturesProtocolHelper.A01(r2, r0, map, this);
            if (A01 == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
            A01 = ((C30671eK) obj).value;
        } else {
            throw AnonymousClass000.A0l();
        }
        if (!(A01 instanceof AnonymousClass1IU)) {
            B5A b5a = this.$callback;
            C30691eM.A01(A01);
            C193749qb r6 = (C193749qb) A01;
            C20557APr aPr = (C20557APr) b5a;
            C18070vi.A0d(r6, 1);
            for (C55782gM A04 : r6.A01) {
                aPr.A00.A00.A04(A04, r6.A00);
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
