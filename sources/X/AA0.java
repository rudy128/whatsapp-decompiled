package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.dialogs.PromptDialogFragment;

public class AA0 implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AA0(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.A00 != 0) {
            PromptDialogFragment promptDialogFragment = (PromptDialogFragment) this.A01;
            TextView textView = (TextView) ((Dialog) this.A02).getWindow().findViewById(16908299);
            AnonymousClass3Ma.A1I(textView, promptDialogFragment.A02);
            AnonymousClass3MZ.A1Q(textView, promptDialogFragment.A00);
            return;
        }
        FingerprintBottomSheet.A02(dialogInterface, (Bundle) this.A01, (FingerprintBottomSheet) this.A02);
    }
}
