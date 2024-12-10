package com.whatsapp.group.iq;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass4A4;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.AnonymousClass8BY;
import X.C108945cZ;
import X.C108955ca;
import X.C178759Ei;
import X.C17880vN;
import X.C18070vi;
import X.C20975AcT;
import X.C27621Wu;
import X.C29591cX;
import X.C29601cY;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.iq.GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3", f = "GetGroupInfoProtocolHelper.kt", i = {}, l = {285}, m = "invokeSuspend", n = {}, s = {})
public final class GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ String $requestType;
    public final /* synthetic */ int $syncDeviceType;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ GetGroupInfoProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3(GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, AnonymousClass1EC r3, String str, String str2, C30391dr r6, int i) {
        super(2, r6);
        this.this$0 = getGroupInfoProtocolHelper;
        this.$iqId = str;
        this.$groupJid = r3;
        this.$syncDeviceType = i;
        this.$requestType = str2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        GetGroupInfoProtocolHelper getGroupInfoProtocolHelper = this.this$0;
        String str = this.$iqId;
        return new GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3(getGroupInfoProtocolHelper, this.$groupJid, str, this.$requestType, r9, this.$syncDeviceType);
    }

    public final Object invokeSuspend(Object obj) {
        C178759Ei r7;
        Object obj2 = obj;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj2);
            GetGroupInfoProtocolHelper getGroupInfoProtocolHelper = this.this$0;
            String str = this.$iqId;
            AnonymousClass1EC r8 = this.$groupJid;
            int i2 = this.$syncDeviceType;
            String str2 = this.$requestType;
            this.L$0 = getGroupInfoProtocolHelper;
            this.L$1 = str;
            this.L$2 = r8;
            this.L$3 = str2;
            this.I$0 = i2;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            C18070vi.A0e(str, 1, r8);
            if (str2 != null) {
                r7 = new C178759Ei(new AnonymousClass4A4(str2, 1));
            } else {
                r7 = null;
            }
            String A03 = GetGroupInfoProtocolHelper.A03(getGroupInfoProtocolHelper, r8);
            C29591cX A0Y = C108955ca.A0Y();
            AnonymousClass8BY.A16(A0Y, "w:g2");
            AnonymousClass8BT.A1E(r8, A0Y, "to");
            AnonymousClass8BY.A15(A0Y, str);
            C29591cX A0t = C108945cZ.A0t("query");
            if (A03 != null && C29601cY.A04(A03, 10, 10, true)) {
                C29591cX.A01(A0t, "phash", A03);
            }
            AnonymousClass8BW.A1E(A0t, r7);
            C17880vN.A0U(getGroupInfoProtocolHelper.A03).A0I(new C20975AcT(getGroupInfoProtocolHelper, A0m, i2), C29591cX.A00(A0t, A0Y), str, 20, GetGroupInfoProtocolHelper.A0B);
            obj2 = A0m.A0C();
            if (obj2 == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj2);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
