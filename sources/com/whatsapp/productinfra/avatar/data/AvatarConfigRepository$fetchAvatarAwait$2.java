package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6D1;
import X.AnonymousClass6D4;
import X.AnonymousClass6D8;
import X.AnonymousClass6XG;
import X.AnonymousClass7I9;
import X.AnonymousClass7L2;
import X.C108945cZ;
import X.C127606ed;
import X.C138506xC;
import X.C23761Hn;
import X.C27021Uk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$fetchAvatarAwait$2", f = "AvatarConfigRepository.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarConfigRepository$fetchAvatarAwait$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C27021Uk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarConfigRepository$fetchAvatarAwait$2(C27021Uk r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarConfigRepository$fetchAvatarAwait$2 avatarConfigRepository$fetchAvatarAwait$2 = new AvatarConfigRepository$fetchAvatarAwait$2(this.this$0, r4);
        avatarConfigRepository$fetchAvatarAwait$2.L$0 = obj;
        return avatarConfigRepository$fetchAvatarAwait$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object r0;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                C127606ed r2 = (C127606ed) this.this$0.A00.get();
                AnonymousClass7I9 BGe = r2.A01.BGe(new AnonymousClass7L2(r2, 1));
                this.label = 1;
                obj = BGe.CBx(this, C23761Hn.A01);
                if (obj == r4) {
                    return r4;
                }
            } catch (Throwable th) {
                obj2 = C108945cZ.A1J(th);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        obj2 = AnonymousClass6XG.A00((C138506xC) obj);
        Throwable A00 = C30671eK.A00(obj2);
        if (A00 == null) {
            return obj2;
        }
        if (A00 instanceof IOException) {
            r0 = new AnonymousClass6D1(A00);
        } else {
            r0 = new AnonymousClass6D4(A00);
        }
        return new AnonymousClass6D8(r0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarConfigRepository$fetchAvatarAwait$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
