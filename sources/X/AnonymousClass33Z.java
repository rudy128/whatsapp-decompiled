package X;

import com.whatsapp.jid.Jid;
import java.util.Set;

/* renamed from: X.33Z  reason: invalid class name */
public final class AnonymousClass33Z implements AnonymousClass3L5 {
    public final AnonymousClass00H A00;

    public AnonymousClass33Z(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BCD(AnonymousClass206 r5, C61402pc r6) {
        A51 a51;
        if (((C437320s) ((AnonymousClass20Z) ((C88174Yp) this.A00.get()).A01.getValue()).A00(r5.A0u)).Bgd()) {
            C692336k A002 = C60472o5.A00(r5);
            AnonymousClass1BI r3 = null;
            if (A002 != null) {
                a51 = A002.A01();
                if (a51 != null) {
                    r3 = a51.A00;
                }
            } else {
                a51 = null;
            }
            if (AnonymousClass206.A08(r5) && a51 != null && r3 != null) {
                String str = a51.A01.A01;
                C18070vi.A0X(str);
                AnonymousClass1MD r0 = new AnonymousClass1MD("thread_msg_id", str);
                Set set = r6.A01;
                set.add(r0);
                set.add(new AnonymousClass1MD((Jid) r3, "thread_msg_sender_jid"));
            }
        }
    }
}
