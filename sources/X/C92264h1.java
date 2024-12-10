package X;

import android.content.DialogInterface;
import com.whatsapp.LegacyMessageDialogFragment;

/* renamed from: X.4h1  reason: invalid class name and case insensitive filesystem */
public class C92264h1 implements C107035Yd {
    public final int A00;
    public final Object A01;

    public C92264h1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onError(int i) {
        if (this.A00 != 0) {
            LegacyMessageDialogFragment A002 = AnonymousClass4FY.A00((DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null, (CharSequence) null, new Object[0], new Object[0], -1, 2131892305, 0, 0, 2131892306);
            AnonymousClass1FU r0 = (AnonymousClass1FU) this.A01;
            AnonymousClass3MY.A1H(A002, r0, (String) null);
            r0.CEx();
            return;
        }
        C17900vP.A0k("DeviceConfirmationRegAlertDialogFragment/ Error when sending Do Not Allow IQ with error: ", AnonymousClass000.A10(), i);
    }
}
