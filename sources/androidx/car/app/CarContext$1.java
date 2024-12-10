package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass04N;
import X.AnonymousClass0ZH;
import X.C15350qU;
import X.C23381Fv;
import X.C23401Fx;
import androidx.car.app.IOnRequestPermissionsListener;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    public final /* synthetic */ AnonymousClass04N this$0;
    public final /* synthetic */ Executor val$executor;
    public final /* synthetic */ C23381Fv val$lifecycle;
    public final /* synthetic */ C15350qU val$listener;

    public CarContext$1(AnonymousClass04N r1, C23381Fv r2, Executor executor, C15350qU r4) {
        this.this$0 = r1;
        this.val$lifecycle = r2;
        this.val$executor = executor;
        this.val$listener = r4;
    }

    public static /* synthetic */ void lambda$onRequestPermissionsResult$0(C15350qU r0, List list, List list2) {
        throw AnonymousClass000.A0s("onRequestPermissionsResult");
    }

    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (this.val$lifecycle.A04().A00(C23401Fx.CREATED)) {
            this.val$executor.execute(new AnonymousClass0ZH(Arrays.asList(strArr), Arrays.asList(strArr2)));
        }
    }
}
