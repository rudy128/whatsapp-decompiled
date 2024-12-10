package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel$setDescriptionNewValue$1", f = "GroupDescriptionAddUpsellViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
public final class GroupDescriptionAddUpsellViewModel$setDescriptionNewValue$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $value;
    public int label;
    public final /* synthetic */ GroupDescriptionAddUpsellViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupDescriptionAddUpsellViewModel$setDescriptionNewValue$1(GroupDescriptionAddUpsellViewModel groupDescriptionAddUpsellViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = groupDescriptionAddUpsellViewModel;
        this.$value = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GroupDescriptionAddUpsellViewModel$setDescriptionNewValue$1(this.this$0, this.$value, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            GroupDescriptionAddUpsellViewModel groupDescriptionAddUpsellViewModel = this.this$0;
            String str = this.$value;
            this.label = 1;
            if (GroupDescriptionAddUpsellViewModel.A00(groupDescriptionAddUpsellViewModel, str, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupDescriptionAddUpsellViewModel$setDescriptionNewValue$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
