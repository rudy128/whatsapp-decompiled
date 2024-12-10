package X;

import com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

public class AMR implements C22570BDl {
    public final /* synthetic */ DeleteAccountFromHsmServerJob A00;
    public final /* synthetic */ AtomicInteger A01;

    public AMR(DeleteAccountFromHsmServerJob deleteAccountFromHsmServerJob, AtomicInteger atomicInteger) {
        this.A00 = deleteAccountFromHsmServerJob;
        this.A01 = atomicInteger;
    }

    public void onSuccess() {
        Log.i("DeleteAccountFromHsmServerJob/job successful");
    }

    public void Bt2(String str, int i, int i2) {
        C17900vP.A0i("DeleteAccountFromHsmServerJob/job unsuccessful with error code: ", AnonymousClass000.A10(), i);
        this.A01.set(i);
    }
}
