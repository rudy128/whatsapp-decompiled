package X;

import android.app.Activity;
import com.whatsapp.passkeys.PasskeyFacade;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyFacade", f = "PasskeyFacade.kt", i = {0, 0, 0, 0, 1, 2, 2, 2}, l = {102, 121, 163}, m = "passkeyCreate", n = {"this", "activity", "prfInput", "onStartRegisterResponse", "this", "this", "clientResponse", "credentialId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2"})
/* renamed from: X.AoW  reason: case insensitive filesystem */
public final class C21703AoW extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21703AoW(PasskeyFacade passkeyFacade, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyFacade;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((Activity) null, (C193169pe) null, this, (C18090vk) null);
    }
}
