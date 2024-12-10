package X;

import com.whatsapp.settings.securitycheckup.SecurityCheckupStatusRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.securitycheckup.SecurityCheckupStatusRepository", f = "SecurityCheckupStatusRepository.kt", i = {0, 1}, l = {43, 54}, m = "syncStatus", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: X.4ue  reason: invalid class name and case insensitive filesystem */
public final class C100524ue extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SecurityCheckupStatusRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100524ue(SecurityCheckupStatusRepository securityCheckupStatusRepository, C30391dr r2) {
        super(r2);
        this.this$0 = securityCheckupStatusRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this);
    }
}
