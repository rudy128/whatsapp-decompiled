package X;

import android.app.Application;
import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.8Ev  reason: invalid class name */
public class AnonymousClass8Ev extends AnonymousClass287 {
    public final AnonymousClass9VM A00;
    public final AEQ A01;
    public final Jid A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public AnonymousClass1J2 A01(C37361pP r39) {
        AnonymousClass9VM r0 = this.A00;
        boolean z = this.A04;
        String str = this.A03;
        AEQ aeq = this.A01;
        boolean z2 = this.A05;
        Jid jid = this.A02;
        C36251na r3 = r0.A00;
        AnonymousClass10E r2 = r3.A02;
        Application A002 = AnonymousClass0YX.A00(r2.Ao9);
        AnonymousClass10G r1 = r2.A00;
        AnonymousClass1XN A0L = AnonymousClass8BU.A0L(r1);
        C26911Ty A0D = AnonymousClass8BT.A0D(r2);
        AnonymousClass1K1 r22 = r3.A00;
        C20653ATl A0L2 = AnonymousClass1K1.A0L(r22);
        C36241nZ r02 = r3.A01;
        C197639x1 r9 = new C197639x1((AnonymousClass1XN) r02.A2Q.A00.A0d.get());
        AM5 A0E = AnonymousClass8BT.A0E(r1);
        C199410f A022 = C36241nZ.A02();
        AM7 am7 = (AM7) r1.A1W.get();
        C173738ve r23 = (C173738ve) r1.A0f.get();
        A5L a5l = (A5L) r1.A4P.get();
        C190509l4 r25 = (C190509l4) r1.A1R.get();
        C197639x1 r26 = r9;
        C22427B7j b7j = (C22427B7j) r22.A3m.get();
        return new AnonymousClass8FD(A002, r39, (AnonymousClass9VN) r02.A0I.get(), A0D, A0E, am7, A0L2, r23, a5l, r25, r26, b7j, (C22433B7p) r22.A3l.get(), (C22434B7q) r02.A0H.get(), aeq, jid, A0L, (C36921og) r1.A1S.get(), str, A022, z, z2);
    }

    public AnonymousClass8Ev(Bundle bundle, AnonymousClass1FE r2, AnonymousClass9VM r3, AEQ aeq, Jid jid, String str, boolean z, boolean z2) {
        super(bundle, r2);
        this.A01 = aeq;
        this.A02 = jid;
        this.A04 = z;
        this.A00 = r3;
        this.A03 = str;
        this.A05 = z2;
    }
}
