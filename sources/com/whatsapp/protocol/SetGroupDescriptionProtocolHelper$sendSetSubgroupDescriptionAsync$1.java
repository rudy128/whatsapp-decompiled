package com.whatsapp.protocol;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.B9M;
import X.C21000Acs;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import X.C76993ox;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.protocol.SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1", f = "SetGroupDescriptionProtocolHelper.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ B9M $callback;
    public final /* synthetic */ String $description;
    public final /* synthetic */ String $descriptionId;
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public int label;
    public final /* synthetic */ SetGroupDescriptionProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1(AnonymousClass1EC r2, B9M b9m, SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper, String str, String str2, C30391dr r7) {
        super(2, r7);
        this.this$0 = setGroupDescriptionProtocolHelper;
        this.$groupJid = r2;
        this.$descriptionId = str;
        this.$description = str2;
        this.$callback = b9m;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper = this.this$0;
        return new SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1(this.$groupJid, this.$callback, setGroupDescriptionProtocolHelper, this.$descriptionId, this.$description, r9);
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper = this.this$0;
            AnonymousClass1EC r2 = this.$groupJid;
            String str = this.$descriptionId;
            String str2 = this.$description;
            this.label = 1;
            A00 = setGroupDescriptionProtocolHelper.A00(r2, str, str2, this);
            if (A00 == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
            A00 = ((C30671eK) obj).value;
        } else {
            throw AnonymousClass000.A0l();
        }
        if (!(A00 instanceof AnonymousClass1IU)) {
            ((C21000Acs) this.$callback).A00.A03.A0E(C76993ox.A00);
        } else {
            Throwable A002 = C30671eK.A00(A00);
            if (A002 != null) {
                this.$callback.onError(A002);
            } else {
                this.$callback.onError(AnonymousClass000.A0s("Expected an exception cause but got null instead"));
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
