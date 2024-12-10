package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.9mT  reason: invalid class name and case insensitive filesystem */
public class C191359mT {
    public final AnonymousClass1QE A00 = AnonymousClass1QE.A00("PaymentStepUpWebviewAction", "network", "COMMON");
    public final Context A01;
    public final AnonymousClass1KB A02;
    public final C33711jG A03;
    public final C31061ex A04;

    public void A00(BBG bbg, ADT adt, C29621ca r12, String str) {
        C29621ca[] r3;
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
        char A1W = C17890vO.A1W("step_up_id", adt.A02, r2);
        C29621ca A0k = AnonymousClass8BR.A0k("step_up", r2);
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[1];
        C17880vN.A1Q("challenge_id", adt.A00.A00(), r22, A1W);
        C29621ca A0k2 = AnonymousClass8BR.A0k("step_up_challenge", r22);
        if (r12 != null) {
            r3 = new C29621ca[3];
            r3[A1W] = A0k;
            r3[1] = A0k2;
            r3[2] = r12;
        } else {
            r3 = new C29621ca[2];
            r3[A1W] = A0k;
            r3[1] = A0k2;
        }
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11("action", "get-step-up-webview-url", A13);
        if (!TextUtils.isEmpty(str)) {
            C17890vO.A11("provider_type", str, A13);
        }
        C29621ca A0l = AnonymousClass8BR.A0l("account", AnonymousClass8BT.A1b(A13, A1W), r3);
        C31061ex r0 = this.A04;
        Context context = this.A01;
        AnonymousClass1KB r5 = this.A02;
        AnonymousClass8BW.A1C(r0, new C175428yh(context, this.A03, r5, bbg, this, 20), A0l);
    }

    public C191359mT(Context context, AnonymousClass1KB r5, C33711jG r6, C31061ex r7) {
        this.A01 = context;
        this.A02 = r5;
        this.A04 = r7;
        this.A03 = r6;
    }
}
