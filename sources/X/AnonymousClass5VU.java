package X;

import android.widget.CheckBox;
import com.whatsapp.settings.SettingsContactsDeleteDialogFragment;

/* renamed from: X.5VU  reason: invalid class name */
public final class AnonymousClass5VU extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C89484cX $data;
    public final /* synthetic */ CheckBox $saveContactsCheckboxView;
    public final /* synthetic */ SettingsContactsDeleteDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VU(CheckBox checkBox, C89484cX r3, SettingsContactsDeleteDialogFragment settingsContactsDeleteDialogFragment) {
        super(1);
        this.this$0 = settingsContactsDeleteDialogFragment;
        this.$data = r3;
        this.$saveContactsCheckboxView = checkBox;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        boolean A1Y = AnonymousClass000.A1Y(obj);
        C37301pI r2 = this.this$0.A02;
        if (r2 != null) {
            if (!this.$data.A04) {
                i = 5;
            } else {
                i = 4;
                if (this.$saveContactsCheckboxView.isChecked()) {
                    i = 3;
                }
            }
            r2.A02(A1Y, i);
            return C27621Wu.A00;
        }
        C18070vi.A11("nativeContactsLogUtil");
        throw null;
    }
}
