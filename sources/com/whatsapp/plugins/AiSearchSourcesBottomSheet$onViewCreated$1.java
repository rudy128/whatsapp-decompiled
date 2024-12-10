package com.whatsapp.plugins;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3TZ;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99614tB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.plugins.AiSearchSourcesBottomSheet$onViewCreated$1", f = "AiSearchSourcesBottomSheet.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
public final class AiSearchSourcesBottomSheet$onViewCreated$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AiSearchSourcesBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiSearchSourcesBottomSheet$onViewCreated$1(AiSearchSourcesBottomSheet aiSearchSourcesBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = aiSearchSourcesBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AiSearchSourcesBottomSheet$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AiSearchSourcesBottomSheet$onViewCreated$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AiSearchSourcesBottomSheet aiSearchSourcesBottomSheet = this.this$0;
            AnonymousClass3TZ r0 = aiSearchSourcesBottomSheet.A01;
            if (r0 == null) {
                C18070vi.A11("searchSourceViewModel");
                throw null;
            }
            AnonymousClass1G4 r1 = r0.A01;
            C99614tB A00 = C99614tB.A00(aiSearchSourcesBottomSheet, 37);
            this.label = 1;
            if (r1.BFC(this, A00) == r4) {
                return r4;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw AnonymousClass3MW.A13();
    }
}
