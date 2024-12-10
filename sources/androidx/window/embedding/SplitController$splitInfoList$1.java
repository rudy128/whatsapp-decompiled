package androidx.window.embedding;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4W9;
import X.C108475bl;
import X.C18070vi;
import X.C18460wS;
import X.C24746CIi;
import X.C27134DVv;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.CWP;
import X.D6I;
import X.D7F;
import X.DlO;
import X.EAn;
import android.app.Activity;
import android.util.Log;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.window.embedding.SplitController$splitInfoList$1", f = "SplitController.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class SplitController$splitInfoList$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Activity $activity;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C24746CIi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitController$splitInfoList$1(Activity activity, C24746CIi cIi, C30391dr r4) {
        super(2, r4);
        this.this$0 = cIi;
        this.$activity = activity;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        SplitController$splitInfoList$1 splitController$splitInfoList$1 = new SplitController$splitInfoList$1(this.$activity, this.this$0, r5);
        splitController$splitInfoList$1.L$0 = obj;
        return splitController$splitInfoList$1;
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r4 = (C108475bl) this.L$0;
            D6I d6i = new D6I(r4, 0);
            EAn eAn = this.this$0.A00;
            Activity activity = this.$activity;
            C27134DVv dVv = new C27134DVv(0);
            D7F d7f = (D7F) eAn;
            C18070vi.A0d(activity, 0);
            ReentrantLock reentrantLock = D7F.A06;
            reentrantLock.lock();
            try {
                if (d7f.A00 == null) {
                    Log.v("EmbeddingBackend", "Extension not loaded, skipping callback registration.");
                    d6i.accept(C18460wS.A00);
                } else {
                    CWP cwp = new CWP(activity, d6i, dVv);
                    d7f.A04.add(cwp);
                    List list = d7f.A02.A00;
                    if (list == null) {
                        list = C18460wS.A00;
                    }
                    cwp.A00(list);
                }
                reentrantLock.unlock();
                DlO dlO = new DlO(d6i, this.this$0);
                this.label = 1;
                if (AnonymousClass4W9.A00(this, dlO, r4) == r5) {
                    return r5;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SplitController$splitInfoList$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
