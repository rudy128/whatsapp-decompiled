package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

public class AYF implements BCC {
    public final /* synthetic */ C1418477e A00;
    public final /* synthetic */ C175838zM A01;
    public final /* synthetic */ C178749Eh A02;
    public final /* synthetic */ C178749Eh A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ HashMap A07;

    public /* synthetic */ void BzI(AnonymousClass9O3 r1) {
    }

    public AYF(C1418477e r1, C175838zM r2, C178749Eh r3, C178749Eh r4, String str, String str2, String str3, HashMap hashMap) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = str;
        this.A07 = hashMap;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = r3;
        this.A02 = r4;
    }

    public void Bpz(AnonymousClass8pF r11) {
        C175838zM r2 = this.A01;
        C1418477e r0 = r11.A01;
        C17960vV.A07(r0);
        String str = r11.A02;
        C1418477e r1 = this.A00;
        String str2 = this.A04;
        HashMap hashMap = this.A07;
        C175838zM.A00(r0, r1, r2, this.A03, this.A02, str, str2, this.A06, this.A05, hashMap);
    }

    public void Bss(A7B a7b) {
        Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to set pin");
        BBD bbd = this.A01.A00;
        if (bbd != null) {
            bbd.C5K(a7b);
        }
    }
}
