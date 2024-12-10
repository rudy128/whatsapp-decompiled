package X;

import com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.LowMemoryFallbackTrigger$getInSessionMemoryCheck$$inlined$filter$3$2;

/* renamed from: X.DXp  reason: case insensitive filesystem */
public final class C27180DXp implements C23421Fz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C27040DQl A01;
    public final /* synthetic */ C23421Fz A02;

    public C27180DXp(C27040DQl dQl, C23421Fz r2, int i) {
        this.A02 = r2;
        this.A01 = dQl;
        this.A00 = i;
    }

    public Object BFC(C30391dr r5, AnonymousClass1G2 r6) {
        Object BFC = this.A02.BFC(r5, new LowMemoryFallbackTrigger$getInSessionMemoryCheck$$inlined$filter$3$2(this.A01, r6, this.A00));
        if (BFC != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return BFC;
    }
}
