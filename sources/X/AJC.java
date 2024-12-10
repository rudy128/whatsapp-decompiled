package X;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.whatsapp.util.Log;

public class AJC implements OnCompleteListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AJC(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onComplete(Task task) {
        if (this.A00 != 0) {
            AnonymousClass1KY r2 = (AnonymousClass1KY) this.A01;
            C191739n6 r1 = (C191739n6) this.A02;
            if (task.isSuccessful()) {
                r2.A00();
            }
            if (task.getException() != null) {
                Log.e("AbstractCronetEngineProvider/installAndCreateCronetEngine/Async cronet engine install failed");
            }
            r1.A00();
            return;
        }
        C22580BEe.A00((Intent) this.A02, (C22580BEe) this.A01);
    }
}
