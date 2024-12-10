package X;

import android.os.SystemClock;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.37J  reason: invalid class name */
public class AnonymousClass37J implements AnonymousClass1O5 {
    public final long A00;
    public final AnonymousClass195 A01;
    public final C23651Hc A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass18K A04;
    public final JniBridge A05;

    public void BrD(String str) {
        A00(3);
        JniBridge.jvidispatchIOOO(this.A05.wajContext.get(), (Object) null, (Object) null);
    }

    public void Bt9(C29621ca r3, String str) {
        A00(3);
        JniBridge.jvidispatchIOOO(this.A05.wajContext.get(), (Object) null, (Object) null);
    }

    public AnonymousClass37J(AnonymousClass195 r1, C23651Hc r2, AnonymousClass11P r3, AnonymousClass18K r4, JniBridge jniBridge, long j) {
        this.A05 = jniBridge;
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = j;
    }

    private void A00(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        C46902Gi r3 = new C46902Gi();
        r3.A04 = Integer.valueOf(i);
        Long valueOf = Long.valueOf(elapsedRealtime);
        r3.A05 = valueOf;
        r3.A07 = valueOf;
        if (this.A01.A00) {
            r3.A02 = 1;
        } else {
            r3.A02 = C17880vN.A0i();
        }
        r3.A01 = Boolean.valueOf(this.A02.A02());
        r3.A03 = 1;
        r3.A00 = true;
        this.A04.CC7(r3);
    }

    public void C7Z(C29621ca r4, String str) {
        C29621ca A0L = r4.A0L("sign_credential");
        A0L.A0C("t");
        byte[] bArr = A0L.A0L("signed_credential").A01;
        byte[] bArr2 = A0L.A0L("acs_public_key").A01;
        A00(1);
        JniBridge.jvidispatchIOOO(this.A05.wajContext.get(), bArr, bArr2);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
