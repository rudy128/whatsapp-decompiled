package com.whatsapp.productinfra.avatar.data.graphql.profilephoto.pose;

import X.A7K;
import X.AIj;
import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.AnonymousClass6DS;
import X.AnonymousClass6DT;
import X.AnonymousClass718;
import X.B33;
import X.C108975cc;
import X.C135856ss;
import X.C162478Kx;
import X.C196829vi;
import X.C19993A2g;
import X.C20125A8k;
import X.C26941Uc;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C35021lW;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.avatars.SelectedOrDefaultPoseQueryResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.graphql.profilephoto.pose.AvatarCoinFlipGetPoseDataRequester$fetchSelectedPoseFromGraphQL$2", f = "AvatarCoinFlipGetPoseDataRequester.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarCoinFlipGetPoseDataRequester$fetchSelectedPoseFromGraphQL$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass718 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarCoinFlipGetPoseDataRequester$fetchSelectedPoseFromGraphQL$2(AnonymousClass718 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarCoinFlipGetPoseDataRequester$fetchSelectedPoseFromGraphQL$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarCoinFlipGetPoseDataRequester$fetchSelectedPoseFromGraphQL$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C162478Kx A00 = GraphQlCallInput.A02.A00();
            C162478Kx.A01(A00, "V4_PROFILE_PHOTOS_COIN_FLIP", "template_pack");
            A7K a7k = new A7K();
            C108975cc.A0z(A00, a7k, "params");
            try {
                C19993A2g A0J = C108975cc.A0J(new AIj(a7k, SelectedOrDefaultPoseQueryResponseImpl.class, "SelectedOrDefaultPoseQuery"), this.this$0.A00);
                A0J.A01 = true;
                A0J.A02(C35021lW.A03);
                this.label = 1;
                obj = A0J.A01(this, B33.A00);
                if (obj == r4) {
                    return r4;
                }
            } catch (C26941Uc e) {
                throw new AnonymousClass6DS(C196829vi.A00(e.error));
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C20125A8k a8k = (C20125A8k) obj;
        C135856ss A002 = AnonymousClass718.A00((SelectedOrDefaultPoseQueryResponseImpl.FetchWAAvatar) a8k.A09(SelectedOrDefaultPoseQueryResponseImpl.FetchWAAvatar.class, "fetch__WAAvatar"), this.this$0);
        if (A002 != null) {
            return AnonymousClass1D6.A01(A002, a8k.A00);
        }
        throw AnonymousClass6DT.A00;
    }
}
