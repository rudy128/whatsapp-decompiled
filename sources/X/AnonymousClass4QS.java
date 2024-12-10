package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4QS  reason: invalid class name */
public final class AnonymousClass4QS {
    public int A00;
    public int A01;
    public final /* synthetic */ AnonymousClass4XS A02;

    public void A00(UserJid userJid, Integer num, int i) {
        if (i != 1) {
            this.A01 = 4;
            AnonymousClass4XS r2 = this.A02;
            boolean A0O = r2.A00.A0O(userJid);
            int i2 = 2131888498;
            if (A0O) {
                i2 = 2131888499;
            }
            this.A00 = i2;
            if (A0O && num != null) {
                int intValue = num.intValue();
                if (intValue == 3) {
                    AnonymousClass4ZZ r3 = (AnonymousClass4ZZ) r2.A05.getValue();
                    C81313z2 A002 = AnonymousClass4ZZ.A00(r3);
                    A002.A02 = C17880vN.A0i();
                    A002.A00 = false;
                    r3.A01.CC7(A002);
                } else if (intValue == 4) {
                    AnonymousClass4ZZ r22 = (AnonymousClass4ZZ) r2.A05.getValue();
                    AnonymousClass4ZZ.A01(r22, AnonymousClass4ZZ.A00(r22), 5);
                }
            }
        } else {
            this.A01 = 2;
            this.A00 = 2131888504;
        }
        int i3 = this.A01;
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("dialog_id", i3);
        AnonymousClass4XS r32 = this.A02;
        AnonymousClass1FY r23 = r32.A01;
        A0D.putCharSequence("message", C18070vi.A0F(r23, this.A00));
        AnonymousClass3MY.A15(A0D, userJid, "user_jid");
        C84794Kw r1 = r32.A03;
        C18070vi.A0d(r1, 0);
        C72483Me.A0k(A0D, r23, r1, 2131888505);
    }

    public AnonymousClass4QS(AnonymousClass4XS r1) {
        this.A02 = r1;
    }
}
