package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

public class AYD implements BCC {
    public final /* synthetic */ C1418477e A00;
    public final /* synthetic */ C175838zM A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ HashMap A04;

    public /* synthetic */ void BzI(AnonymousClass9O3 r1) {
    }

    public AYD(C1418477e r1, C175838zM r2, String str, String str2, HashMap hashMap) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A04 = hashMap;
        this.A03 = str2;
    }

    public void Bpz(AnonymousClass8pF r8) {
        C175838zM r2 = this.A01;
        C1418477e r0 = r8.A01;
        C17960vV.A07(r0);
        String str = r8.A02;
        C175838zM.A01(r0, this.A00, r2, str, this.A02, this.A03, this.A04);
    }

    public void Bss(A7B a7b) {
        Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to change pin");
        BBD bbd = this.A01.A00;
        if (bbd != null) {
            bbd.C5K(a7b);
        }
    }
}
