package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

public class AZX implements BBP {
    public final /* synthetic */ AnonymousClass1FY A00;
    public final /* synthetic */ PinBottomSheetDialogFragment A01;
    public final /* synthetic */ A5F A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public void Buu() {
    }

    public AZX(AnonymousClass1FY r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, A5F a5f, boolean z, boolean z2) {
        this.A02 = a5f;
        this.A01 = pinBottomSheetDialogFragment;
        this.A00 = r1;
        this.A03 = z;
        this.A04 = z2;
    }

    public void BpL(String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A01;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A2N();
        } else {
            AnonymousClass1FY r3 = this.A00;
            if (r3 instanceof BrazilAccountRecoveryPinActivity) {
                r3.CNA(2131886361);
                r3.CRG(r3.getResources().getString(2131886360));
            }
        }
        A5F a5f = this.A02;
        AnonymousClass11P r8 = a5f.A02;
        AnonymousClass1KB r6 = a5f.A00;
        AnonymousClass11S r7 = a5f.A01;
        C191529mk r14 = a5f.A0E;
        AnonymousClass1QS r13 = a5f.A0D;
        C30951em r1 = a5f.A0L;
        C188549hb r5 = new C188549hb(r6, r7, r8, a5f.A05, AnonymousClass8BR.A0a(a5f.A0N), a5f.A09, a5f.A0B, r13, r14, a5f.A0G, r1);
        AnonymousClass1FY r72 = this.A00;
        BD4 bd4 = a5f.A0H;
        String str2 = str;
        C190249kc r12 = new C190249kc(this, str2);
        C171858sO BHN = bd4.BHN();
        BHN.A08 = C17880vN.A0j();
        BHN.A0b = "api_event";
        BHN.A0B = 26;
        bd4.BiH(BHN);
        A54 a54 = r5.A07;
        AZ2 A012 = a54.A01("FB", "PIN");
        if (A012 != null) {
            C198959zC r2 = new C198959zC(A012);
            r5.A06.A00(new C20770AXz(r72, r5, r2, r12, 0), r2, str2);
            return;
        }
        new C191619mt(r72, r5.A00, r5.A02, r5.A03, a54, "PIN").A00(new C20777AYg(r72, r5, r12, str2, 0), "FB");
    }
}
