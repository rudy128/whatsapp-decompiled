package X;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.settings.SettingsSetupUserProxyActivity;

/* renamed from: X.5U9  reason: invalid class name */
public final class AnonymousClass5U9 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SettingsSetupUserProxyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5U9(SettingsSetupUserProxyActivity settingsSetupUserProxyActivity) {
        super(1);
        this.this$0 = settingsSetupUserProxyActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String valueOf;
        String valueOf2;
        String str;
        AnonymousClass1D6 r6 = (AnonymousClass1D6) obj;
        SettingsSetupUserProxyActivity settingsSetupUserProxyActivity = this.this$0;
        C88074Yf r4 = (C88074Yf) r6.second;
        TextInputLayout textInputLayout = settingsSetupUserProxyActivity.A01;
        if (textInputLayout == null) {
            str = "proxyInputEditText";
        } else {
            EditText editText = textInputLayout.A0B;
            if (editText != null) {
                String str2 = r4.A02;
                if (str2 == null && (str2 = r4.A05) == null) {
                    str2 = "";
                }
                Editable text = editText.getText();
                C18070vi.A0X(text);
                if (!C18070vi.A18(AnonymousClass1YF.A0I(text), str2) && str2.length() > 0) {
                    AnonymousClass3MW.A1S(editText);
                    editText.append(str2);
                }
            }
            int i = r4.A00;
            if (i == 443) {
                valueOf = settingsSetupUserProxyActivity.getString(2131894816);
            } else {
                valueOf = String.valueOf(i);
            }
            C18070vi.A0b(valueOf);
            int i2 = r4.A01;
            if (i2 == 587) {
                valueOf2 = settingsSetupUserProxyActivity.getString(2131894816);
            } else {
                valueOf2 = String.valueOf(i2);
            }
            C18070vi.A0b(valueOf2);
            WaTextView waTextView = settingsSetupUserProxyActivity.A02;
            if (waTextView == null) {
                str = "chatPortTextView";
            } else {
                waTextView.setText(valueOf);
                WaTextView waTextView2 = settingsSetupUserProxyActivity.A03;
                if (waTextView2 == null) {
                    str = "mediaPortTextView";
                } else {
                    waTextView2.setText(valueOf2);
                    int A04 = AnonymousClass3MZ.A04(r6);
                    if (A04 == 0) {
                        View view = this.this$0.A00;
                        if (view != null) {
                            view.setEnabled(true);
                            SettingsSetupUserProxyActivity settingsSetupUserProxyActivity2 = this.this$0;
                            View view2 = settingsSetupUserProxyActivity2.A00;
                            if (view2 != null) {
                                AnonymousClass3MZ.A1P(view2, settingsSetupUserProxyActivity2, r6, 19);
                            }
                        }
                        C18070vi.A11("saveProxyButton");
                        throw null;
                    } else if (A04 == 1 || A04 == 2) {
                        View view3 = this.this$0.A00;
                        if (view3 != null) {
                            view3.setEnabled(false);
                        }
                        C18070vi.A11("saveProxyButton");
                        throw null;
                    }
                    return C27621Wu.A00;
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
