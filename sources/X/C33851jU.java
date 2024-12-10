package X;

import android.content.Context;
import android.os.Message;
import com.whatsapp.Me;
import com.whatsapp.util.Log;

/* renamed from: X.1jU  reason: invalid class name and case insensitive filesystem */
public final class C33851jU implements AnonymousClass1RJ {
    public final C33841jT A00;
    public final AnonymousClass00H A01 = C217517g.A00(16449);

    public C33851jU(C33841jT r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public int[] BSG() {
        return new int[]{198, 199, 200, 201};
    }

    public boolean BcT(Message message, int i) {
        C18070vi.A0d(message, 1);
        switch (i) {
            case 198:
                Object obj = message.obj;
                C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                C18070vi.A0d(str, 0);
                for (C72293Lj BzL : ((C37191p7) this.A01.get()).A00) {
                    BzL.BzL(str);
                }
                return true;
            case 199:
                for (C72293Lj BzK : ((C37191p7) this.A01.get()).A00) {
                    BzK.BzK();
                }
                return true;
            case 200:
                this.A00.A06();
                return true;
            case 201:
                C33841jT r4 = this.A00;
                int i2 = message.arg2;
                AnonymousClass11S r5 = r4.A05;
                Me A07 = r5.A07();
                Context context = r4.A0A.A00;
                if (A07 != null) {
                    if (i2 != 400) {
                        if (i2 == 401) {
                            r4.A01.post(new C146517Pk(r4, context, 34));
                        } else if (i2 == 405) {
                            r4.A06();
                            return true;
                        } else if (i2 == 409 || i2 >= 500) {
                            return true;
                        }
                        r4.A0C.A2A(true);
                        r4.A06.A06();
                    } else {
                        Log.w("RegistrationManager/notifyChangeNumberError/match");
                        r4.A01.post(new C146517Pk(r4, context, 33));
                    }
                    r5.A0H();
                    r4.A03.A00();
                    return true;
                }
                Log.w("RegistrationManager/notifyChangeNumberError/response/error but already changed");
                return true;
            default:
                return false;
        }
    }
}
