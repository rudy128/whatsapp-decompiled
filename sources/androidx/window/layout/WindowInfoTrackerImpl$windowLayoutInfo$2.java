package androidx.window.layout;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4W9;
import X.C108475bl;
import X.C27134DVv;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.D6I;
import X.D7M;
import X.DlP;
import android.app.Activity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class WindowInfoTrackerImpl$windowLayoutInfo$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Activity $activity;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ D7M this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$2(Activity activity, D7M d7m, C30391dr r4) {
        super(2, r4);
        this.this$0 = d7m;
        this.$activity = activity;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        WindowInfoTrackerImpl$windowLayoutInfo$2 windowInfoTrackerImpl$windowLayoutInfo$2 = new WindowInfoTrackerImpl$windowLayoutInfo$2(this.$activity, this.this$0, r5);
        windowInfoTrackerImpl$windowLayoutInfo$2.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$2;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r5 = (C108475bl) this.L$0;
            D6I d6i = new D6I(r5, 1);
            this.this$0.A00.CDy(this.$activity, d6i, new C27134DVv(0));
            DlP dlP = new DlP(d6i, this.this$0);
            this.label = 1;
            if (AnonymousClass4W9.A00(this, dlP, r5) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
