package X;

import com.whatsapp.companionmode.registration.KeyAttestationLifetimeManagerKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.KeyAttestationLifetimeManagerKt", f = "KeyAttestationLifetimeManager.kt", i = {0, 0, 0, 0}, l = {35}, m = "retry", n = {"delayMs", "block", "times2", "attempt"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* renamed from: X.AoN  reason: case insensitive filesystem */
public final class C21694AoN extends C30421du {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public C21694AoN(C30391dr r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KeyAttestationLifetimeManagerKt.A00(this, (C18090vk) null, (C22821Di) null, 0);
    }
}
