package X;

import com.whatsapp.passkeys.PasskeyExistsCache;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyExistsCache", f = "PasskeyExistsCache.kt", i = {0, 1}, l = {138, 92}, m = "syncPasskeyExistenceFromServer", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: X.Anm  reason: case insensitive filesystem */
public final class C21657Anm extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyExistsCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21657Anm(PasskeyExistsCache passkeyExistsCache, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyExistsCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this);
    }
}
