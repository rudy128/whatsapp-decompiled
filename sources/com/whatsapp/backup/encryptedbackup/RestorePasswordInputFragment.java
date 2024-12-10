package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1L9;
import X.AnonymousClass1LC;
import X.AnonymousClass1LU;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BS;
import X.C18070vi;
import X.C21457AkO;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class RestorePasswordInputFragment extends Hilt_RestorePasswordInputFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass1LC A01;
    public AnonymousClass1LU A02;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        TextView textView = this.A03;
        if (textView != null) {
            AnonymousClass8BS.A16(textView, this, 2131889856);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            AnonymousClass8BS.A16(textView2, this, 2131889854);
        }
        WDSButton wDSButton = this.A0B;
        if (wDSButton != null) {
            AnonymousClass8BS.A16(wDSButton, this, 2131889855);
        }
        TextView textView3 = this.A04;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        TextView textView4 = this.A04;
        if (textView4 != null) {
            textView4.setText(2131889866);
        }
        A29(new C21457AkO((Object) this, 15));
        TextView textView5 = this.A04;
        if (textView5 != null) {
            AnonymousClass3MZ.A1J(textView5, this, 39);
        }
    }
}
