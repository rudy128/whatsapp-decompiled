package X;

import android.os.Bundle;
import com.whatsapp.dialogs.Hilt_PromptDialogFragment;
import com.whatsapp.dialogs.PromptDialogFragment;

/* renamed from: X.4VU  reason: invalid class name */
public class AnonymousClass4VU {
    public final Bundle A00;

    public void A01() {
        this.A00.putBoolean("is_message_clickable", true);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.whatsapp.dialogs.PromptDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.dialogs.Hilt_PromptDialogFragment] */
    public PromptDialogFragment A00() {
        ? hilt_PromptDialogFragment = new Hilt_PromptDialogFragment();
        hilt_PromptDialogFragment.A1R(this.A00);
        return hilt_PromptDialogFragment;
    }

    public void A02(CharSequence charSequence) {
        this.A00.putCharSequence("message", charSequence);
    }

    public void A03(String str) {
        this.A00.putString("negative_button", str);
    }

    public void A04(String str) {
        this.A00.putString("positive_button", str);
    }

    public void A05(boolean z) {
        this.A00.putBoolean("cancelable", z);
    }

    public AnonymousClass4VU(int i) {
        Bundle A0D = C17880vN.A0D();
        this.A00 = A0D;
        A0D.putInt("dialog_id", i);
    }
}
