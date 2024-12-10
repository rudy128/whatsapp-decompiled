package X;

import com.whatsapp.flows.ui.CtwaFlowContextLoadingBottomSheet;

/* renamed from: X.4m9  reason: invalid class name and case insensitive filesystem */
public final class C95384m9 implements C72363Lq {
    public final /* synthetic */ C78543sy A00;
    public final /* synthetic */ AnonymousClass4FP A01;
    public final /* synthetic */ CtwaFlowContextLoadingBottomSheet A02;

    public C95384m9(C78543sy r1, AnonymousClass4FP r2, CtwaFlowContextLoadingBottomSheet ctwaFlowContextLoadingBottomSheet) {
        this.A02 = ctwaFlowContextLoadingBottomSheet;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BrA() {
        this.A02.A2K();
    }

    public void C7H(AnonymousClass4VG r10) {
        String str;
        CtwaFlowContextLoadingBottomSheet ctwaFlowContextLoadingBottomSheet = this.A02;
        if (ctwaFlowContextLoadingBottomSheet.A1e()) {
            C78543sy r3 = this.A00;
            AnonymousClass4FP r0 = (AnonymousClass4FP) ((A5S) r3.getCtwaFlowContextStore().get()).A04(this.A01.A01);
            if (r0 != null && (str = r0.A08) != null) {
                String str2 = r0.A07;
                String str3 = r0.A09;
                if (str3 != null) {
                    C78543sy.A07(r3);
                    ctwaFlowContextLoadingBottomSheet.A29();
                    C78543sy.A08(r3, r0.A01, str, str2, str3, C78543sy.A05(r3, r0));
                }
            }
        }
    }

    public void onError(int i) {
        this.A02.A2K();
    }
}
