package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3U0;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$maybeLogContactsLoaded$1", f = "AddGroupParticipantsSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AddGroupParticipantsSelectorViewModel$maybeLogContactsLoaded$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $suggestedContactsCount;
    public int label;
    public final /* synthetic */ AnonymousClass3U0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddGroupParticipantsSelectorViewModel$maybeLogContactsLoaded$1(AnonymousClass3U0 r2, C30391dr r3, int i) {
        super(2, r3);
        this.this$0 = r2;
        this.$suggestedContactsCount = i;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AddGroupParticipantsSelectorViewModel$maybeLogContactsLoaded$1(this.this$0, r5, this.$suggestedContactsCount);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A06.A02(90, AnonymousClass3MW.A0v(this.$suggestedContactsCount));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AddGroupParticipantsSelectorViewModel$maybeLogContactsLoaded$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
