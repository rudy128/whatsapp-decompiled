package com.whatsapp.media.utwonet;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass6nl;
import X.C136196tQ;
import X.C139906zd;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C72453Mb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.utwonet.UTwoNetViewModel$fetch$1", f = "UTwoNetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UTwoNetViewModel$fetch$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UTwoNetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UTwoNetViewModel$fetch$1(UTwoNetViewModel uTwoNetViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = uTwoNetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UTwoNetViewModel$fetch$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UTwoNetViewModel$fetch$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass6nl r5 = (AnonymousClass6nl) this.this$0.A07.get();
            C139906zd[] r4 = new C139906zd[2];
            r4[0] = C139906zd.A00("UTwoNet", "6fbe8aec8231e6fa7439f8078769c46306967cba8cafef6eaf240a5f659769c4", 1020);
            ((C136196tQ) r5.A01.get()).A02(C18070vi.A0O(C139906zd.A00(AnonymousClass3MW.A0y(r5.A02), AnonymousClass3MW.A0y(r5.A03), C72453Mb.A0I(r5.A04)), r4, 1));
            C18030ve r1 = this.this$0.A04;
            C18040vf r3 = C18040vf.A02;
            ((AnonymousClass6nl) this.this$0.A07.get()).A00(C18020vd.A05(r3, this.this$0.A04, 10857), C18020vd.A05(r3, r1, 12876));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
