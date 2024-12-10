package X;

import android.content.Context;
import android.content.Intent;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/* renamed from: X.AaA  reason: case insensitive filesystem */
public final /* synthetic */ class C20832AaA implements B95 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public final void C1m(BottomSheetDialogFragment bottomSheetDialogFragment) {
        Context context = this.A00;
        String str = this.A01;
        bottomSheetDialogFragment.A28();
        Intent A03 = AnonymousClass8BS.A03(context);
        A03.putExtra("screen_name", str);
        A03.putExtra("hide_send_payment_cta", true);
        AnonymousClass8k7.A03(A03, "onboarding_context", "p2p_context");
        AnonymousClass8k7.A03(A03, "referral_screen", "receive_flow");
        context.startActivity(A03);
    }

    public /* synthetic */ C20832AaA(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }
}
