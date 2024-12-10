package X;

import com.whatsapp.productinfra.avatar.liveediting.fallback.FlowExtensionsKt$delay$1;
import com.whatsapp.productinfra.avatar.liveediting.fallback.FlowExtensionsKt$takeUntil$1;
import com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.TimeoutFallbackTrigger$getBloksTimeout$1;
import com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.TimeoutFallbackTrigger$getNativeTimeout$1;
import com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.TimeoutFallbackTrigger$getNativeTimeout$3;
import com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.TimeoutFallbackTrigger$getNativeTimeout$4;
import com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.TimeoutFallbackTrigger$notifier$2;
import com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.TimeoutFallbackTrigger$trigger$1;

/* renamed from: X.4pJ  reason: invalid class name and case insensitive filesystem */
public final class C97344pJ implements C28536E6k {
    public final C55472fp A00;
    public final AnonymousClass1G3 A01;
    public final C18600wl A02;

    public C23421Fz CPq(C25274CcM ccM, C25243Cbe cbe) {
        C23421Fz r2;
        C27183DXs dXs = new C27183DXs((AnonymousClass1OS) new TimeoutFallbackTrigger$notifier$2((C30391dr) null), (C23421Fz) new C27179DXo(new C27179DXo(AnonymousClass4HP.A00(ccM), 11), 15), 10);
        Double d = cbe.A05;
        if (d != null) {
            r2 = new C28243Du4(new FlowExtensionsKt$takeUntil$1((C30391dr) null, new C27183DXs((Object) AnonymousClass3MZ.A0L(new TimeoutFallbackTrigger$getNativeTimeout$3((C30391dr) null), new C27179DXo(new C27183DXs((AnonymousClass1OS) new TimeoutFallbackTrigger$getNativeTimeout$1((C30391dr) null), (C23421Fz) new C28243Du4(new FlowExtensionsKt$delay$1((C30391dr) null, (long) (d.doubleValue() * 1000.0d))), 10), 10)), (Object) new TimeoutFallbackTrigger$getNativeTimeout$4((C30391dr) null), 5), AnonymousClass4Z6.A01(this.A01, dXs)));
        } else {
            r2 = C99494su.A00;
        }
        return AnonymousClass4I5.A00(this.A02, new C27183DXs((AnonymousClass1OS) new TimeoutFallbackTrigger$trigger$1((C30391dr) null), (C23421Fz) AnonymousClass4Z6.A01(r2, AnonymousClass4I4.A00(new TimeoutFallbackTrigger$getBloksTimeout$1(this, (C30391dr) null))), 10));
    }

    public C97344pJ(C55472fp r1, C18600wl r2, AnonymousClass1G3 r3) {
        C18070vi.A0o(r3, r2, r1);
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = r1;
    }
}
