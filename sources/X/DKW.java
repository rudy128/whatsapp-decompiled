package X;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public class DKW implements Continuation {
    public final int A00;

    public DKW(int i) {
        this.A00 = i;
    }

    public final Object then(Task task) {
        if (this.A00 != 0) {
            return BE7.A0Z();
        }
        return 403;
    }
}
