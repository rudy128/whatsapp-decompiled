package X;

import android.content.Intent;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.Ait  reason: case insensitive filesystem */
public final /* synthetic */ class C21364Ait implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ VerifyPhoneNumber A02;
    public final /* synthetic */ boolean A03;

    public final void run() {
        Intent A0G;
        VerifyPhoneNumber verifyPhoneNumber = this.A02;
        boolean z = this.A03;
        long j = this.A00;
        long j2 = this.A01;
        AnonymousClass4Yv.A00(verifyPhoneNumber, 44);
        boolean z2 = verifyPhoneNumber.A1N;
        if (z) {
            A0G = AnonymousClass1LU.A0L(verifyPhoneNumber, j, j2, z2, verifyPhoneNumber.A1Z);
        } else {
            A0G = AnonymousClass1LU.A0G(verifyPhoneNumber, 0, 1, j, j2, 0, z2, verifyPhoneNumber.A1Z);
        }
        verifyPhoneNumber.finish();
        verifyPhoneNumber.startActivity(A0G);
        verifyPhoneNumber.overridePendingTransition(0, 0);
    }

    public /* synthetic */ C21364Ait(VerifyPhoneNumber verifyPhoneNumber, long j, long j2, boolean z) {
        this.A02 = verifyPhoneNumber;
        this.A03 = z;
        this.A00 = j;
        this.A01 = j2;
    }
}
