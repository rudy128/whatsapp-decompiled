package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* renamed from: X.Al1  reason: case insensitive filesystem */
public class C21492Al1 implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C21492Al1(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final Object call() {
        String str;
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
            int i2 = this.A01;
            boolean z = lottieAnimationView.A03;
            Context context = lottieAnimationView.getContext();
            if (z) {
                str = C39771tc.A08(context, i2);
            } else {
                str = null;
            }
            return C39771tc.A00(context, str, i2);
        }
        AnonymousClass9UM r1 = (AnonymousClass9UM) obj;
        int i3 = this.A01;
        C18070vi.A0d(r1, 0);
        WorkDatabase workDatabase = r1.A00;
        int A002 = AnonymousClass9ON.A00(workDatabase, "next_job_scheduler_id");
        if (i3 <= A002) {
            i3 = A002;
        } else {
            workDatabase.A0A().Bdd(new C193269po("next_job_scheduler_id", C17880vN.A0n(i3 + 1)));
        }
        return Integer.valueOf(i3);
    }
}
