package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public class AJM implements OnSuccessListener {
    public final int A00;
    public final Object A01;

    public AJM(C22821Di r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public static void A00(Task task, C22821Di r2, int i) {
        task.addOnSuccessListener(new AJM(r2, i));
    }

    public final void onSuccess(Object obj) {
        C22821Di r1 = (C22821Di) this.A01;
        C18070vi.A0d(r1, 0);
        r1.invoke(obj);
    }
}
