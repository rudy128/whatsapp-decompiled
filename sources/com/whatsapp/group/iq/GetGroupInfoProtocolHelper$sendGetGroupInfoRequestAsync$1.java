package com.whatsapp.group.iq;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass3L7;
import X.C18020vd;
import X.C18040vf;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.iq.GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1", f = "GetGroupInfoProtocolHelper.kt", i = {}, l = {81, 88}, m = "invokeSuspend", n = {}, s = {})
public final class GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass3L7 $callback;
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public final /* synthetic */ String $requestType;
    public final /* synthetic */ int $syncDeviceType;
    public int label;
    public final /* synthetic */ GetGroupInfoProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1(GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, AnonymousClass3L7 r3, AnonymousClass1EC r4, String str, C30391dr r6, int i) {
        super(2, r6);
        this.this$0 = getGroupInfoProtocolHelper;
        this.$groupJid = r4;
        this.$syncDeviceType = i;
        this.$requestType = str;
        this.$callback = r3;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        GetGroupInfoProtocolHelper getGroupInfoProtocolHelper = this.this$0;
        AnonymousClass1EC r3 = this.$groupJid;
        int i = this.$syncDeviceType;
        return new GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1(getGroupInfoProtocolHelper, this.$callback, r3, this.$requestType, r9, i);
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            int A002 = C18020vd.A00(C18040vf.A02, this.this$0.A01, 8179);
            if (A002 == 0) {
                GetGroupInfoProtocolHelper getGroupInfoProtocolHelper = this.this$0;
                AnonymousClass1EC r7 = this.$groupJid;
                int i2 = this.$syncDeviceType;
                String str = this.$requestType;
                AnonymousClass3L7 r6 = this.$callback;
                this.label = 1;
                A00 = GetGroupInfoProtocolHelper.A00(getGroupInfoProtocolHelper, r6, r7, str, this, i2);
            } else if (A002 == 1) {
                GetGroupInfoProtocolHelper getGroupInfoProtocolHelper2 = this.this$0;
                AnonymousClass1EC r2 = this.$groupJid;
                int i3 = this.$syncDeviceType;
                AnonymousClass3L7 r0 = this.$callback;
                this.label = 2;
                A00 = GetGroupInfoProtocolHelper.A01(getGroupInfoProtocolHelper2, r0, r2, this, i3);
            }
            if (A00 == r4) {
                return r4;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
