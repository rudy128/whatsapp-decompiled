package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;

/* renamed from: X.25w  reason: invalid class name and case insensitive filesystem */
public class C450725w extends JobService {
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C18860xH.A00(getApplicationContext());
        byte[] bArr = null;
        if (string != null) {
            C19300xz r1 = (C19300xz) C61072p4.A00.get(i);
            if (r1 != null) {
                if (string2 != null) {
                    bArr = Base64.decode(string2, 0);
                }
                C18870xI r0 = C18860xH.A04;
                if (r0 != null) {
                    C19400y9 r3 = ((C18860xH) r0.A09.get()).A01;
                    r3.A08.execute(new C21365Aiu(r3, C19440yD.A00(r1, string, bArr), new C27076DTa(this, jobParameters, 40), i2, 0));
                    return true;
                }
                throw AnonymousClass000.A0n("Not initialized!");
            }
            throw AnonymousClass001.A13("Unknown Priority for value ", AnonymousClass000.A10(), i);
        }
        throw AnonymousClass000.A0s("Null backendName");
    }
}
