package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass10T;
import X.AnonymousClass1OS;
import X.AnonymousClass6DZ;
import X.AnonymousClass7KZ;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$3", f = "AvatarStickersRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6DZ $revisionOutdated;
    public int label;
    public final /* synthetic */ AvatarStickersRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$3(AvatarStickersRepository avatarStickersRepository, AnonymousClass6DZ r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = avatarStickersRepository;
        this.$revisionOutdated = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$3(this.this$0, this.$revisionOutdated, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass10T A0V = C17880vN.A0V(this.this$0.A03);
            String str = this.$revisionOutdated.newRevision;
            C18070vi.A0d(str, 0);
            AnonymousClass7KZ.A00(A0V, str, 3);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
