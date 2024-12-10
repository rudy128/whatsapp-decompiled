package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C41661wr;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerHelper$sanitizePastedString$2", f = "DialerHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DialerHelper$sanitizePastedString$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $pastedString;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerHelper$sanitizePastedString$2(String str, C30391dr r3) {
        super(2, r3);
        this.$pastedString = str;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DialerHelper$sanitizePastedString$2(this.$pastedString, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DialerHelper$sanitizePastedString$2(this.$pastedString, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            String str = this.$pastedString;
            C41661wr r1 = new C41661wr("[^0123456789\\-() +]");
            C18070vi.A0d(str, 0);
            if (r1.nativePattern.matcher(str).find()) {
                return null;
            }
            return new C41661wr("[^0123456789+]").A00(this.$pastedString, "");
        }
        throw AnonymousClass000.A0l();
    }
}
