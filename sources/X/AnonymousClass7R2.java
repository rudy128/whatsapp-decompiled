package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import java.io.File;

/* renamed from: X.7R2  reason: invalid class name */
public class AnonymousClass7R2 implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public AnonymousClass7R2(Object obj, Object obj2, Object obj3, int i, long j, boolean z) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
        this.A05 = z;
        this.A04 = obj3;
    }

    public final void run() {
        TextView textView;
        Number number;
        boolean z;
        long j;
        C79093uR r0;
        int intValue;
        switch (this.A00) {
            case 0:
                r0 = (C79093uR) this.A02;
                textView = (TextView) this.A03;
                j = this.A01;
                z = this.A05;
                number = (Number) this.A04;
                break;
            case 1:
                r0 = (C79093uR) this.A02;
                textView = (TextView) this.A03;
                number = (Number) this.A04;
                j = this.A01;
                z = this.A05;
                break;
            case 2:
                boolean z2 = this.A05;
                long j2 = this.A01;
                ((AnonymousClass126) this.A02).A0b((AnonymousClass1EC) this.A04, (UserJid) this.A03, j2, z2);
                return;
            case 3:
                C1193467t r7 = (C1193467t) this.A02;
                C1418377d r6 = (C1418377d) this.A03;
                long j3 = this.A01;
                AnonymousClass887 r4 = (AnonymousClass887) this.A04;
                r7.A0L(r6, j3, false);
                r7.A01.CGP(new AnonymousClass7RR(r7, (C122606Ra) null, 1, false));
                String str = r6.A0F;
                if (str != null) {
                    r4.Bqt(str);
                    return;
                }
                return;
            default:
                AnonymousClass74M r3 = (AnonymousClass74M) this.A02;
                boolean z3 = this.A05;
                ((C86064Qa) r3.A1I.get()).A00(r3.A0C, new AnonymousClass7P4(r3, (File) this.A03, (File) this.A04, this.A01, z3));
                return;
        }
        Context context = r0.getContext();
        String A0C = AnonymousClass25A.A0C(r0.A0D, j);
        if (number == null) {
            if (z) {
                intValue = 2131891185;
            }
            textView.setText(A0C);
        }
        intValue = number.intValue();
        A0C = C17890vO.A0R(context, A0C, 1, 0, intValue);
        textView.setText(A0C);
    }

    public AnonymousClass7R2(AnonymousClass887 r2, C1193467t r3, C1418377d r4, long j) {
        this.A00 = 3;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = j;
        this.A05 = true;
        this.A04 = r2;
    }
}
