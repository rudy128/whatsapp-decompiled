package com.whatsapp.avatar.autogen;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass34B;
import X.AnonymousClass6nF;
import X.AnonymousClass73B;
import X.C120246Cy;
import X.C120256Cz;
import X.C145917Nc;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C202911o;
import X.C20586AQw;
import X.C21453AkK;
import X.C26551So;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30581eB;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C54942ex;
import X.C55612g5;
import X.C61382pa;
import X.C62022qf;
import X.C63722ta;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3", f = "AvatarAutogenMediaUploadManagerImpl.kt", i = {0}, l = {88}, m = "invokeSuspend", n = {"mediaJob"}, s = {"L$0"})
public final class AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ C202911o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3(C202911o r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass34B A0B;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            File A0e = C17880vN.A0e(this.this$0.A00.A09(), "TEMP_SELFIE.jpg");
            C26551So r12 = C26551So.A06;
            C20586AQw aQw = new C20586AQw(r12);
            C18030ve r8 = this.this$0.A01;
            C18040vf r7 = C18040vf.A02;
            int A00 = C18020vd.A00(r7, r8, 2656);
            int A002 = C18020vd.A00(r7, r8, 2655);
            int A003 = C18020vd.A00(r7, r8, 2654);
            A0B = this.this$0.A02.A0B(aQw, C63722ta.A00(Uri.fromFile(A0e), (C61382pa) null, new AnonymousClass6nF(A00, A002, A003, A003), new C62022qf(true, false, false), r12, (AnonymousClass73B) null, (String) null, 16, false, false, false), true);
            A0B.A0Z = "metaverse";
            C202911o r5 = this.this$0;
            this.L$0 = A0B;
            this.label = 1;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
            C31781g7 r3 = new C31781g7(1, C30581eB.A02(this));
            r3.A0F();
            r5.A03.CGN(new C21453AkK(A0B, r5, 10));
            A0B.A07(new C145917Nc(r3, 1), (Executor) null);
            if (r3.A0C() == r4) {
                return r4;
            }
        } else if (i == 1) {
            A0B = (AnonymousClass34B) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C54942ex r1 = (C54942ex) A0B.A0B.A00();
        if (r1 != null && !r1.A02.get()) {
            r1.A01.delete();
        }
        C55612g5 A03 = A0B.A03();
        if (A03 == null || A03.A00 != 0) {
            return C120256Cz.A00;
        }
        String A04 = A03.A02.A04();
        if (A04 == null) {
            return C120256Cz.A00;
        }
        return new C120246Cy(A04);
    }
}
