package X;

import com.whatsapp.calling.controls.view.CallControlCard;

/* renamed from: X.5Qt  reason: invalid class name and case insensitive filesystem */
public final class C105115Qt extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CallControlCard this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105115Qt(CallControlCard callControlCard) {
        super(1);
        this.this$0 = callControlCard;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A05 = C17880vN.A05(obj);
        AnonymousClass4aL callControlStateHolder = this.this$0.getCallControlStateHolder();
        int i = (int) A05;
        int i2 = C88054Yd.A00(callControlStateHolder.A0C).A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallControlState/onAudioRouteSelected selected ");
        A10.append(i);
        C17900vP.A0j(", current route: ", A10, i2);
        if (i != i2) {
            if (i == 1) {
                AnonymousClass4aL.A04(callControlStateHolder, 9);
                A99 a99 = callControlStateHolder.A05.A00;
                if (a99 != null) {
                    a99.A0e();
                }
            } else if (i == 2) {
                AnonymousClass4aL.A04(callControlStateHolder, 53);
                A99 a992 = callControlStateHolder.A05.A00;
                if (a992 != null) {
                    a992.A0d();
                }
            } else if (i == 3) {
                AnonymousClass4aL.A04(callControlStateHolder, 11);
                A99 a993 = callControlStateHolder.A05.A00;
                if (a993 != null) {
                    a993.A0c();
                }
            } else if (i != 4) {
                C17900vP.A0j("CallControlState invalid route: ", AnonymousClass000.A10(), i);
            } else {
                A99 a994 = callControlStateHolder.A05.A00;
                if (a994 != null) {
                    C21067Adx adx = a994.A0R;
                    C17960vV.A07(adx);
                    adx.A0L.execute(new C21446AkD(adx, 45));
                }
            }
        }
        return C27621Wu.A00;
    }
}
