package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass4FR;
import X.AnonymousClass5WL;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99614tB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsConversationManagementActivity$onCreate$3", f = "ListsConversationManagementActivity.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class ListsConversationManagementActivity$onCreate$3 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ListsConversationManagementActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsConversationManagementActivity$onCreate$3(ListsConversationManagementActivity listsConversationManagementActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = listsConversationManagementActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ListsConversationManagementActivity$onCreate$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ListsConversationManagementActivity$onCreate$3(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G1 r2 = ((ListsConversationsManagementViewModel) this.this$0.A02.getValue()).A02;
            AnonymousClass5WL A00 = AnonymousClass4FR.A00(C23401Fx.STARTED, this.this$0.getLifecycle(), r2);
            C99614tB A002 = C99614tB.A00(this.this$0, 28);
            this.label = 1;
            if (A00.BFC(this, A002) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
