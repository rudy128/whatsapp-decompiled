package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class AZW implements BBP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AZW(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void BpL(String str) {
        AZV azv;
        int i;
        if (this.A00 != 0) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A02;
            pinBottomSheetDialogFragment.A2N();
            A5V a5v = (A5V) this.A01;
            AnonymousClass1FY r6 = a5v.A05;
            AnonymousClass1KB r7 = a5v.A04;
            C31061ex r9 = a5v.A09;
            C33711jG r8 = a5v.A07;
            A54 a54 = a5v.A0A;
            C191619mt r5 = new C191619mt(r6, r7, r8, r9, a54, "PIN");
            AZ2 A012 = a54.A01("FB", "PIN");
            if (A012 != null) {
                A5V.A01(new C198959zC(A012), pinBottomSheetDialogFragment, a5v, str);
            } else {
                r5.A00(new C20773AYc(this, str), "FB");
            }
        } else {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = (PinBottomSheetDialogFragment) this.A02;
            pinBottomSheetDialogFragment2.A2N();
            C188459hS r2 = (C188459hS) this.A01;
            int A022 = r2.A04.A02();
            A4K a4k = r2.A05;
            if (A022 == 1) {
                azv = new AZV(pinBottomSheetDialogFragment2, this, 4);
                i = 3;
            } else {
                azv = new AZV(pinBottomSheetDialogFragment2, this, 5);
                i = 1;
            }
            A4K.A00(new AZS(azv, a4k, str, i), azv, a4k, "FB");
        }
    }

    public void Buu() {
        if (this.A00 != 0) {
            A5V a5v = (A5V) this.A01;
            AnonymousClass1FY r1 = a5v.A05;
            if (a5v instanceof C1764794j) {
                C1764794j r4 = (C1764794j) a5v;
                AnonymousClass9Y7 r3 = new AnonymousClass9Y7(r1);
                C17890vO.A0u(new C177799Aq(r3, r4.A00), r4.A0E);
                return;
            }
            return;
        }
        C188459hS r12 = (C188459hS) this.A01;
        AnonymousClass9Y7 r32 = new AnonymousClass9Y7(r12.A01);
        C17890vO.A0u(new C177799Aq(r32, r12.A03), r12.A08);
    }
}
