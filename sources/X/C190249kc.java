package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.widget.TextView;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

/* renamed from: X.9kc  reason: invalid class name and case insensitive filesystem */
public class C190249kc {
    public final /* synthetic */ AZX A00;
    public final /* synthetic */ String A01;

    public C190249kc(AZX azx, String str) {
        this.A00 = azx;
        this.A01 = str;
    }

    public void A00(A7B a7b) {
        C010105w A002;
        AZX azx = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = azx.A01;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A2M();
        } else {
            AnonymousClass1FY r1 = azx.A00;
            if (r1 instanceof BrazilAccountRecoveryPinActivity) {
                r1.CEx();
            }
        }
        int i = a7b.A00;
        if (i != 1440) {
            if (i == 1448) {
                azx.A02.A0G.A02(a7b, "FB", "PIN");
            }
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A29();
            }
            AnonymousClass1FY r2 = azx.A00;
            A002 = C20110A7s.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(2131894963));
        } else {
            int i2 = a7b.A01;
            if (i2 == 0) {
                A5F a5f = azx.A02;
                AnonymousClass1FY r4 = azx.A00;
                A5F.A00(r4, a5f);
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A29();
                }
                boolean z = azx.A03;
                A002 = C20110A7s.A01(r4, new C20158A9u(r4, z), r4.getString(2131886346), r4.getString(2131886345));
            } else if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A2O(i2, 2131755317);
                return;
            } else {
                AnonymousClass1FY r5 = azx.A00;
                if (r5 instanceof BrazilAccountRecoveryPinActivity) {
                    BrazilAccountRecoveryPinActivity brazilAccountRecoveryPinActivity = (BrazilAccountRecoveryPinActivity) r5;
                    brazilAccountRecoveryPinActivity.A01.setErrorState(true);
                    brazilAccountRecoveryPinActivity.A01.A0K();
                    TextView textView = brazilAccountRecoveryPinActivity.A00;
                    Resources resources = brazilAccountRecoveryPinActivity.getResources();
                    Object[] objArr = new Object[1];
                    boolean A1b = C72453Mb.A1b(objArr, i2);
                    textView.setText(resources.getQuantityString(2131755317, i2, objArr));
                    TextView textView2 = brazilAccountRecoveryPinActivity.A00;
                    C72463Mc.A0w(brazilAccountRecoveryPinActivity, textView2.getContext(), textView2, 2130969090, 2131100132);
                    brazilAccountRecoveryPinActivity.A00.setVisibility(A1b ? 1 : 0);
                    return;
                }
                A002 = C20110A7s.A00(r5, (DialogInterface.OnDismissListener) null, r5.getString(2131894963));
            }
        }
        A002.show();
    }
}
