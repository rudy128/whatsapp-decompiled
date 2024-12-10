package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.calling.fragment.CallConfirmationFragment;

/* renamed from: X.4b1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4b1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ CallConfirmationFragment A02;
    public final /* synthetic */ AnonymousClass1E7 A03;
    public final /* synthetic */ boolean A04;

    public final void onClick(DialogInterface dialogInterface, int i) {
        CallConfirmationFragment callConfirmationFragment = this.A02;
        int i2 = this.A00;
        Activity activity = this.A01;
        AnonymousClass1E7 r5 = this.A03;
        boolean z = this.A04;
        C72453Mb.A1P(callConfirmationFragment.A05);
        if (i2 > 0) {
            C19830z4 r0 = callConfirmationFragment.A03;
            C17880vN.A1C(C19830z4.A00(r0), "call_log_education_dialog_shown_count", C17890vO.A0B(r0).getInt("call_log_education_dialog_shown_count", 0) + 1);
        }
        CallConfirmationFragment.A00(activity, callConfirmationFragment, r5, z);
    }

    public /* synthetic */ AnonymousClass4b1(Activity activity, CallConfirmationFragment callConfirmationFragment, AnonymousClass1E7 r3, int i, boolean z) {
        this.A02 = callConfirmationFragment;
        this.A00 = i;
        this.A01 = activity;
        this.A03 = r3;
        this.A04 = z;
    }
}
