package X;

import com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager", f = "CompanionRegOverSideChannelV2Manager.kt", i = {0, 0}, l = {335}, m = "handleSetPrimaryEphemeralIdentityResponse", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* renamed from: X.3FN  reason: invalid class name */
public final class AnonymousClass3FN extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CompanionRegOverSideChannelV2Manager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FN(CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager, C30391dr r2) {
        super(r2);
        this.this$0 = companionRegOverSideChannelV2Manager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CompanionRegOverSideChannelV2Manager.A00(this.this$0, (AnonymousClass3KW) null, this);
    }
}
