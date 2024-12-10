package com.whatsapp.conversationslist;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass4FM;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72463Mc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$updateSuggestionPresence$1", f = "ConversationsSuggestedContactsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationsSuggestedContactsViewModel$updateSuggestionPresence$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $jid;
    public int label;
    public final /* synthetic */ ConversationsSuggestedContactsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsSuggestedContactsViewModel$updateSuggestionPresence$1(ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel, AnonymousClass1BI r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = conversationsSuggestedContactsViewModel;
        this.$jid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ConversationsSuggestedContactsViewModel$updateSuggestionPresence$1(this.this$0, this.$jid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            int size = this.this$0.A03.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (C18070vi.A18(((AnonymousClass4FM) this.this$0.A03.get(i)).A00.A0J, this.$jid)) {
                    this.this$0.A03.get(i);
                    if (C72463Mc.A1Y(this.this$0.A0L.get(this.$jid))) {
                        C18070vi.A11("greenDotBadge");
                        throw null;
                    }
                    ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel = this.this$0;
                    conversationsSuggestedContactsViewModel.A0E.A0E(conversationsSuggestedContactsViewModel.A03);
                } else {
                    i++;
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationsSuggestedContactsViewModel$updateSuggestionPresence$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
