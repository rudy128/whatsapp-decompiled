package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.calling.fragment.CallConfirmationFragment;

/* renamed from: X.4cx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C89744cx implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ CallConfirmationFragment A01;
    public final /* synthetic */ AnonymousClass1E7 A02;
    public final /* synthetic */ boolean A03;

    public final void onClick(View view) {
        CallConfirmationFragment callConfirmationFragment = this.A01;
        Activity activity = this.A00;
        AnonymousClass1E7 r2 = this.A02;
        boolean z = this.A03;
        C72453Mb.A1P(callConfirmationFragment.A05);
        CallConfirmationFragment.A00(activity, callConfirmationFragment, r2, z);
        callConfirmationFragment.A29();
    }

    public /* synthetic */ C89744cx(Activity activity, CallConfirmationFragment callConfirmationFragment, AnonymousClass1E7 r3, boolean z) {
        this.A01 = callConfirmationFragment;
        this.A00 = activity;
        this.A02 = r3;
        this.A03 = z;
    }
}
