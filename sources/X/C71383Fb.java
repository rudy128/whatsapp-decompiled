package X;

import com.whatsapp.suggestions.SuggestionsEngine;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.suggestions.SuggestionsEngine", f = "SuggestionsEngine.kt", i = {0, 0, 0, 0, 0, 0}, l = {213}, m = "getLandingScreenSuggestionsAndWhatsAppContacts", n = {"this", "excludedJids", "signalStrength", "allWaContacts", "favoritedContactsOnWhatsApp", "suggestionsCount"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
/* renamed from: X.3Fb  reason: invalid class name and case insensitive filesystem */
public final class C71383Fb extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SuggestionsEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71383Fb(SuggestionsEngine suggestionsEngine, C30391dr r2) {
        super(r2);
        this.this$0 = suggestionsEngine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A04((C36471nw) null, (String) null, (Set) null, this, 0);
    }
}
