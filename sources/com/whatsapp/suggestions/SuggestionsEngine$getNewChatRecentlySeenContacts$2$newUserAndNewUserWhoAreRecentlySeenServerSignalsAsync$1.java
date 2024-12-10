package com.whatsapp.suggestions;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput;
import com.whatsapp.suggestions.networking.SuggestedContactsFetcher;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.suggestions.SuggestionsEngine$getNewChatRecentlySeenContacts$2$newUserAndNewUserWhoAreRecentlySeenServerSignalsAsync$1", f = "SuggestionsEngine.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestionsEngine$getNewChatRecentlySeenContacts$2$newUserAndNewUserWhoAreRecentlySeenServerSignalsAsync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Set $excludedJids;
    public int label;
    public final /* synthetic */ SuggestionsEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionsEngine$getNewChatRecentlySeenContacts$2$newUserAndNewUserWhoAreRecentlySeenServerSignalsAsync$1(SuggestionsEngine suggestionsEngine, Set set, C30391dr r4) {
        super(2, r4);
        this.this$0 = suggestionsEngine;
        this.$excludedJids = set;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new SuggestionsEngine$getNewChatRecentlySeenContacts$2$newUserAndNewUserWhoAreRecentlySeenServerSignalsAsync$1(this.this$0, this.$excludedJids, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            XWA2GrowthSuggestedContactsInput A00 = SuggestionsEngine.A00(this.this$0, "NEW_CHAT_CONTACT_SCREEN_NEW_TO_WHATSAPP_WITH_RECENTLY_ONLINE", this.$excludedJids, false);
            this.label = 1;
            obj = ((SuggestedContactsFetcher) this.this$0.A08.get()).A00(A00, this);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SuggestionsEngine$getNewChatRecentlySeenContacts$2$newUserAndNewUserWhoAreRecentlySeenServerSignalsAsync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
