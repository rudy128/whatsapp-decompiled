package com.whatsapp.companiondevice;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass1DF;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass3Ma;
import X.AnonymousClass48A;
import X.AnonymousClass7AT;
import X.C1418577f;
import X.C149197if;
import X.C157937yt;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C90084dV;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.jid.DeviceJid;

public final class SetDeviceNicknameFragment extends Hilt_SetDeviceNicknameFragment {
    public AnonymousClass11C A00;
    public C18000vb A01;
    public AnonymousClass1L2 A02;
    public AnonymousClass1KW A03;
    public C18030ve A04;
    public C18010vc A05;
    public AnonymousClass00H A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new C149197if(this));

    public void A21(Bundle bundle, View view) {
        String str;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        Bundle A15 = A15();
        DeviceJid A052 = DeviceJid.Companion.A05(A15.getString("device_jid_raw_string"));
        String string = A15.getString("existing_display_name");
        String string2 = A15.getString("device_string");
        AnonymousClass7AT.A01(this, ((LinkedDeviceEnterNicknameViewModel) this.A07.getValue()).A01, new C157937yt(this), 21);
        WaEditText waEditText = (WaEditText) C18070vi.A05(view2, 2131433126);
        TextView A0E = AnonymousClass3Ma.A0E(view2, 2131429681);
        int i = 0;
        waEditText.setFilters(new C1418577f[]{new C1418577f(50)});
        waEditText.A0I(false);
        C18030ve r15 = this.A04;
        if (r15 != null) {
            AnonymousClass1KW r14 = this.A03;
            if (r14 != null) {
                AnonymousClass11C r11 = this.A00;
                if (r11 != null) {
                    C18000vb r12 = this.A01;
                    if (r12 != null) {
                        C18010vc r0 = this.A05;
                        if (r0 != null) {
                            AnonymousClass1L2 r13 = this.A02;
                            if (r13 != null) {
                                waEditText.addTextChangedListener(new AnonymousClass48A(waEditText, A0E, r11, r12, r13, r14, r15, r0, 50, 50, false, false, false));
                                waEditText.setText(string);
                                if (string != null) {
                                    i = string.length();
                                }
                                waEditText.setSelection(i);
                                waEditText.setHint(string2);
                                C18070vi.A05(view2, 2131434787).setOnClickListener(new C90084dV((Object) this, (Object) A052, (Object) waEditText, 36));
                                AnonymousClass3Ma.A1B(C18070vi.A05(view2, 2131428814), this, 6);
                                return;
                            }
                            str = "emojiRichFormatterStaticCaller";
                        } else {
                            str = "sharedPreferencesFactory";
                        }
                    } else {
                        str = "whatsAppLocale";
                    }
                } else {
                    str = "systemServices";
                }
            } else {
                str = "emojiLoader";
            }
        } else {
            str = "abProps";
        }
        C18070vi.A11(str);
        throw null;
    }
}
