package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass3U0;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72463Mc;
import X.C81673zc;
import X.C88474Zv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$logContactSelectionChangeSuggestionsDisabled$1", f = "AddGroupParticipantsSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AddGroupParticipantsSelectorViewModel$logContactSelectionChangeSuggestionsDisabled$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public int label;
    public final /* synthetic */ AnonymousClass3U0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddGroupParticipantsSelectorViewModel$logContactSelectionChangeSuggestionsDisabled$1(AnonymousClass3U0 r2, AnonymousClass1E7 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$contact = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AddGroupParticipantsSelectorViewModel$logContactSelectionChangeSuggestionsDisabled$1(this.this$0, this.$contact, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C88474Zv r5 = this.this$0.A06;
            AnonymousClass1E7 r0 = this.$contact;
            C18070vi.A0d(r0, 0);
            C81673zc r2 = new C81673zc();
            boolean z = r0.A0y;
            int i = 5;
            if (z) {
                i = 3;
            }
            C72463Mc.A1E(r2, r5, 90, i, false);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AddGroupParticipantsSelectorViewModel$logContactSelectionChangeSuggestionsDisabled$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
