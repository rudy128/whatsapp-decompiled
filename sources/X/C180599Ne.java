package X;

import android.text.TextUtils;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.registration.phonenumberentry.ChangeNumber;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.9Ne  reason: invalid class name and case insensitive filesystem */
public abstract class C180599Ne {
    public void A00(String str, String str2) {
        C188129gv r0;
        AnonymousClass8nC r1 = (AnonymousClass8nC) this;
        switch (r1.A00) {
            case 0:
                r0 = ((ChangeNumber) r1.A01).A0E;
                if (r0 == null) {
                    C18070vi.A11("oldNumberEntry");
                    throw null;
                }
                break;
            case 1:
                r0 = ((AnonymousClass99S) r1.A01).A0L;
                break;
            default:
                RegisterPhone registerPhone = (RegisterPhone) r1.A01;
                registerPhone.A0L.A04.setContentDescription((CharSequence) null);
                int i = 0;
                if ("".equals(str)) {
                    registerPhone.A0L.A04.setText(2131894983);
                } else if (str2 == null) {
                    registerPhone.A0L.A04.setText(2131894992);
                    registerPhone.A4n();
                } else {
                    String A03 = registerPhone.A0O.A03(registerPhone.A00, str2);
                    registerPhone.A0L.A04.setText(A03);
                    registerPhone.A0L.A04.setContentDescription(C17890vO.A0R(registerPhone, A03, 1, 0, 2131895007));
                    registerPhone.A4p();
                }
                TextEmojiLabel textEmojiLabel = registerPhone.A0G;
                try {
                    C193299pr r5 = registerPhone.A1A;
                    boolean z = false;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            if (Integer.parseInt(str) == 44) {
                                z = true;
                            }
                        } catch (NumberFormatException e) {
                            Log.e("CountryPhoneInfo/isUk", e);
                        }
                    }
                    r5.A01 = z;
                    boolean equals = "eu".equals(registerPhone.A04.A04(str));
                    r5.A00 = equals;
                    if (!equals) {
                        if (r5.A01) {
                        }
                        i = 8;
                    }
                } catch (IOException e2) {
                    Log.e("RegisterPhone/shouldShowTosInfo/getTosRegion failed", e2);
                }
                textEmojiLabel.setVisibility(i);
                return;
        }
        r0.A06 = str2;
    }
}
