package X;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Future;

public class DKY implements OnCompleteListener {
    public final int A00;
    public final Object A01;

    public DKY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onComplete(Task task) {
        switch (this.A00) {
            case 0:
                C25928Cos.A01((Intent) this.A01);
                return;
            case 1:
                ((C24880CNy) this.A01).A01.trySetResult((Object) null);
                return;
            case 2:
                ((Future) this.A01).cancel(false);
                return;
            default:
                C18070vi.A0d(task, 1);
                task.getResult();
                C17880vN.A1F(C19830z4.A00(((C54522eH) this.A01).A01), "in_app_review_shown", true);
                return;
        }
    }
}
