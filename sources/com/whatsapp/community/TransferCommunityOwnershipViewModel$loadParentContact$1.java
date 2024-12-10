package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3To;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C88294Zc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.TransferCommunityOwnershipViewModel$loadParentContact$1", f = "TransferCommunityOwnershipViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TransferCommunityOwnershipViewModel$loadParentContact$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass3To this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferCommunityOwnershipViewModel$loadParentContact$1(AnonymousClass3To r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new TransferCommunityOwnershipViewModel$loadParentContact$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new TransferCommunityOwnershipViewModel$loadParentContact$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3To r6 = this.this$0;
            AnonymousClass1G4 r5 = r6.A05;
            do {
            } while (!r5.BFK(r5.getValue(), new C88294Zc(r6.A02.A0E(r6.A03), AnonymousClass00R.A01, (Integer) null)));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
