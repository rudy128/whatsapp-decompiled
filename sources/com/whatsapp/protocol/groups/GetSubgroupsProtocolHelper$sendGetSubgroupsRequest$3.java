package com.whatsapp.protocol.groups;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1MD;
import X.AnonymousClass1OS;
import X.AnonymousClass1OZ;
import X.AnonymousClass8BR;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C20968AcM;
import X.C27621Wu;
import X.C29621ca;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72473Md;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3", f = "GetSubgroupsProtocolHelper.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
public final class GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ AnonymousClass1EC $parentGroupJid;
    public final /* synthetic */ AnonymousClass1EC $participatingSubgroupJid;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ GetSubgroupsProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3(AnonymousClass1EC r2, AnonymousClass1EC r3, GetSubgroupsProtocolHelper getSubgroupsProtocolHelper, String str, C30391dr r6) {
        super(2, r6);
        this.this$0 = getSubgroupsProtocolHelper;
        this.$iqId = str;
        this.$parentGroupJid = r2;
        this.$participatingSubgroupJid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3(this.$parentGroupJid, this.$participatingSubgroupJid, this.this$0, this.$iqId, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1MD[] r1;
        Object obj2 = obj;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj2);
            GetSubgroupsProtocolHelper getSubgroupsProtocolHelper = this.this$0;
            String str = this.$iqId;
            AnonymousClass1EC r7 = this.$parentGroupJid;
            AnonymousClass1EC r2 = this.$participatingSubgroupJid;
            this.L$0 = getSubgroupsProtocolHelper;
            this.L$1 = str;
            this.L$2 = r7;
            this.L$3 = r2;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            C18070vi.A0e(str, 1, r7);
            AnonymousClass1OZ A0U = C17880vN.A0U(getSubgroupsProtocolHelper.A01);
            if (r2 != null) {
                r1 = new AnonymousClass1MD[1];
                C17880vN.A1I(r2, "sub_group_jid", r1, 0);
            } else {
                r1 = null;
            }
            C29621ca A0k = AnonymousClass8BR.A0k("sub_groups", r1);
            AnonymousClass1MD[] r22 = new AnonymousClass1MD[4];
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r22, 0);
            C17880vN.A1Q("xmlns", "w:g2", r22, 1);
            C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22);
            A0U.A0I(new C20968AcM(getSubgroupsProtocolHelper.A00, A0m), C29621ca.A00(r7, A0k, r22), str, 297, 32000);
            obj2 = A0m.A0C();
            if (obj2 == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj2);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
