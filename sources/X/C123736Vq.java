package X;

import android.os.Bundle;
import com.whatsapp.blockui.BlockConfirmationDialogFragment;

/* renamed from: X.6Vq  reason: invalid class name and case insensitive filesystem */
public abstract class C123736Vq {
    public static final BlockConfirmationDialogFragment A00(C130546jc r4) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = new BlockConfirmationDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("jid", r4.A02.getRawString());
        A0D.putString("entryPoint", r4.A03);
        A0D.putBoolean("deleteChatOnBlock", r4.A04);
        A0D.putBoolean("showSuccessToast", r4.A07);
        A0D.putBoolean("showReportAndBlock", r4.A06);
        A0D.putInt("postBlockNavigation", r4.A01);
        A0D.putInt("postBlockAndReportNavigation", r4.A00);
        A0D.putBoolean("enableReportCheckboxByDefault", r4.A05);
        blockConfirmationDialogFragment.A1R(A0D);
        return blockConfirmationDialogFragment;
    }
}
