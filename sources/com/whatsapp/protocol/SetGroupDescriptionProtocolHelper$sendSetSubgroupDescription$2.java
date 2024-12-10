package com.whatsapp.protocol;

import X.A7K;
import X.AIj;
import X.AUI;
import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass1PY;
import X.AnonymousClass8BS;
import X.B0F;
import X.C108975cc;
import X.C162478Kx;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C183519Yo;
import X.C189819ju;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72473Md;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.groups.SetGroupPropertyResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.protocol.SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2", f = "SetGroupDescriptionProtocolHelper.kt", i = {0}, l = {158}, m = "invokeSuspend", n = {"newId"}, s = {"L$0"})
public final class SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $description;
    public final /* synthetic */ String $descriptionId;
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ SetGroupDescriptionProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2(AnonymousClass1EC r2, SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper, String str, String str2, C30391dr r6) {
        super(2, r6);
        this.$description = str;
        this.this$0 = setGroupDescriptionProtocolHelper;
        this.$groupJid = r2;
        this.$descriptionId = str2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        String str = this.$description;
        return new SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2(this.$groupJid, this.this$0, str, this.$descriptionId, r8);
    }

    public final Object invokeSuspend(Object obj) {
        String A0e;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            String str = this.$description;
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                A0e = null;
            } else {
                SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper = this.this$0;
                A0e = AnonymousClass8BS.A0e(setGroupDescriptionProtocolHelper.A00, setGroupDescriptionProtocolHelper.A01);
            }
            SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper2 = this.this$0;
            String str2 = this.$description;
            AnonymousClass1EC r9 = this.$groupJid;
            String str3 = this.$descriptionId;
            this.L$0 = A0e;
            this.L$1 = setGroupDescriptionProtocolHelper2;
            this.L$2 = str2;
            this.L$3 = r9;
            this.L$4 = str3;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            AUI aui = new AUI(r9, setGroupDescriptionProtocolHelper2, A0m);
            if (!C18020vd.A05(C18040vf.A02, setGroupDescriptionProtocolHelper2.A03, 11931) || str2 == null) {
                setGroupDescriptionProtocolHelper2.A04.A07(aui, r9, str3, A0e, str2);
            } else {
                C183519Yo r1 = setGroupDescriptionProtocolHelper2.A05;
                C18070vi.A0d(r9, 0);
                AnonymousClass1PY r5 = r1.A00;
                A7K A00 = A7K.A00();
                String rawString = r9.getRawString();
                C18070vi.A0d(rawString, 0);
                A00.A07("group_id", rawString);
                C189819ju r12 = GraphQlCallInput.A02;
                C162478Kx A002 = C162478Kx.A00(r12, str2, "description");
                C162478Kx.A01(A002, A0e, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                C162478Kx.A01(A002, str3, "previous_id");
                C162478Kx A003 = r12.A00();
                A003.A06(A002, "description");
                C108975cc.A0z(A003, A00, "input");
                AIj.A01(A00, r5, SetGroupPropertyResponseImpl.class, "SetGroupProperty").A04(new B0F(aui));
            }
            obj = A0m.A0C();
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
