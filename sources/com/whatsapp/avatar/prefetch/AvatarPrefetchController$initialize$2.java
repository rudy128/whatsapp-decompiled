package com.whatsapp.avatar.prefetch;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C25243Cbe;
import X.C25724Cku;
import X.C26651D8a;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.prefetch.AvatarPrefetchController$initialize$2", f = "AvatarPrefetchController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarPrefetchController$initialize$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarPrefetchController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarPrefetchController$initialize$2(AvatarPrefetchController avatarPrefetchController, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarPrefetchController;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarPrefetchController$initialize$2 avatarPrefetchController$initialize$2 = new AvatarPrefetchController$initialize$2(this.this$0, r4);
        avatarPrefetchController$initialize$2.L$0 = obj;
        return avatarPrefetchController$initialize$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C25243Cbe cbe = (C25243Cbe) ((AnonymousClass1D6) this.L$0).second;
            AvatarPrefetchController avatarPrefetchController = this.this$0;
            C26651D8a d8a = avatarPrefetchController.A05;
            C25724Cku cku = avatarPrefetchController.A06;
            C18070vi.A0d(cbe, 1);
            WeakReference weakReference = d8a.A01;
            if (weakReference == null || weakReference.get() == null) {
                synchronized (cku) {
                    cku.A01.add(d8a);
                }
                cku.A02(cbe);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarPrefetchController$initialize$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
