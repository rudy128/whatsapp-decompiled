package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass000;
import X.AnonymousClass1DS;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C22698BLa;
import X.C25143CZt;
import X.C25169CaL;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C83804Gs;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.components.contextcard.NameThisGroupButtonViewModel$clickButton$1", f = "NameThisGroupButtonViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NameThisGroupButtonViewModel$clickButton$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C22698BLa this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameThisGroupButtonViewModel$clickButton$1(C22698BLa bLa, C30391dr r3) {
        super(2, r3);
        this.this$0 = bLa;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new NameThisGroupButtonViewModel$clickButton$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NameThisGroupButtonViewModel$clickButton$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String A0I;
        AnonymousClass1DS r3;
        Object caL;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C22698BLa bLa = this.this$0;
            Integer A00 = bLa.A04.A00(bLa.A05);
            int intValue = A00.intValue();
            C22698BLa bLa2 = this.this$0;
            if (intValue != 0) {
                r3 = bLa2.A01;
                C18070vi.A0z(r3, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.NameThisGroupButtonViewModel.ErrorUiState>");
                caL = new C25143CZt(A00);
            } else {
                AnonymousClass1E7 A0H = bLa2.A02.A0H(bLa2.A05);
                if (C83804Gs.A00(A0H)) {
                    A0I = "";
                } else {
                    A0I = this.this$0.A03.A0I(A0H);
                }
                r3 = this.this$0.A00;
                C18070vi.A0z(r3, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.NameThisGroupButtonViewModel.DialogUiState>");
                caL = new C25169CaL(A0H, A0I);
            }
            r3.A0E(caL);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
