package X;

import android.os.Handler;
import com.whatsapp.account.delete.DeleteAccountActivity;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;
import com.whatsapp.registration.phonenumberentry.ChangeNumber;

/* renamed from: X.4oj  reason: invalid class name and case insensitive filesystem */
public class C96984oj implements C72293Lj {
    public final int A00;
    public final Object A01;

    public C96984oj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BzK() {
        C85034Lv r0;
        Handler handler;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                r0 = ((DeleteAccountActivity) obj).A04;
                break;
            case 1:
                r0 = ((C822343w) obj).A02;
                break;
            default:
                handler = ((ChangeNumber) obj).A0O;
                break;
        }
        if (r0 != null) {
            handler = r0.A00.A02;
            if (handler == null) {
                C18070vi.A11("handler");
                throw null;
            }
            handler.sendEmptyMessage(3);
        }
    }

    public void BzL(String str) {
        C85034Lv r0;
        String str2;
        Handler handler;
        int i;
        switch (this.A00) {
            case 0:
                r0 = ((DeleteAccountActivity) this.A01).A04;
                break;
            case 1:
                r0 = ((C822343w) this.A01).A02;
                break;
            default:
                ChangeNumber changeNumber = (ChangeNumber) this.A01;
                String A0B = changeNumber.A02.A0B();
                if (A0B == null || !A0B.equals(str)) {
                    handler = changeNumber.A0O;
                    i = 2;
                } else {
                    handler = changeNumber.A0O;
                    i = 1;
                }
                handler.sendEmptyMessage(i);
                return;
        }
        if (r0 != null) {
            MatchPhoneNumberFragment matchPhoneNumberFragment = r0.A00;
            AnonymousClass11S r02 = matchPhoneNumberFragment.A00;
            if (r02 != null) {
                PhoneUserJid A012 = AnonymousClass11S.A01(r02);
                C18070vi.A0X(A012);
                String str3 = A012.user;
                C17960vV.A07(str3);
                C18070vi.A0X(str3);
                int A04 = C72453Mb.A04(str3.equals(str) ? 1 : 0);
                AnonymousClass3NT r03 = matchPhoneNumberFragment.A02;
                if (r03 == null) {
                    str2 = "handler";
                } else {
                    r03.sendEmptyMessage(A04);
                    return;
                }
            } else {
                str2 = "meManager";
            }
            C18070vi.A11(str2);
            throw null;
        }
    }
}
