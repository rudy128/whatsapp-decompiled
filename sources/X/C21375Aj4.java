package X;

import com.whatsapp.jid.DeviceJid;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Aj4  reason: case insensitive filesystem */
public class C21375Aj4 implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public C21375Aj4(Object obj, Object obj2, String str, int i, long j, boolean z) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
        this.A05 = z;
        this.A03 = obj2;
        this.A04 = str;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.97s, X.20i] */
    /* JADX WARNING: type inference failed for: r6v3, types: [X.20i, X.97t] */
    public final void run() {
        AnonymousClass206 r6;
        switch (this.A00) {
            case 0:
                C191709n3 r7 = (C191709n3) this.A02;
                long j = this.A01;
                boolean z = this.A05;
                AnonymousClass1BI r9 = (AnonymousClass1BI) this.A03;
                String str = this.A04;
                long A012 = AnonymousClass11P.A01(r7.A05);
                long millis = A012 + TimeUnit.SECONDS.toMillis(j);
                AnonymousClass205 A013 = r7.A07.A02.A01(r9, true);
                if (z) {
                    ? r62 = new C436420i(A013, 174, A012);
                    r62.A00 = -1;
                    r62.A00 = millis;
                    r62.A01 = str;
                    r6 = r62;
                } else {
                    ? r63 = new C436420i(A013, 175, A012);
                    r63.A00 = -1;
                    r63.A00 = millis;
                    r63.A01 = str;
                    r6 = r63;
                }
                r7.A06.BBZ(r6, -1);
                A2A a2a = r7.A02;
                a2a.A05.CGF(new C21437Ak4(a2a, r9, (Object) null, AnonymousClass00R.A01, 4, true));
                return;
            case 1:
                C20135A8w a8w = (C20135A8w) this.A02;
                List list = (List) this.A03;
                String str2 = this.A04;
                long j2 = this.A01;
                boolean z2 = this.A05;
                C18070vi.A0h(a8w, list);
                int i = 0;
                int i2 = 0;
                for (Object next : list) {
                    if ((next instanceof C48582Na) || (next instanceof C39631tO)) {
                        i++;
                    } else if (!(next instanceof C1776199s)) {
                    }
                    i2++;
                }
                AM6 A0G = AnonymousClass8BT.A0G(a8w);
                C34141jz r64 = a8w.A0F;
                boolean A1T = AnonymousClass000.A1T(r64.A02, 98);
                int A032 = C108955ca.A03(r64);
                String A0A = a8w.A0A();
                if (C20045A4o.A01(A0G.A00)) {
                    C171228rN r12 = new C171228rN();
                    AnonymousClass8BT.A1C(r12, C17880vN.A0k(), A1T ? 1 : 0);
                    r12.A02 = 2;
                    AM6.A01(A0G, r12);
                    AM6.A02(A0G, r12, Boolean.valueOf(z2), Integer.valueOf(A032), (Integer) null, Integer.valueOf(i), Integer.valueOf(i2), (Integer) null, (Integer) null, (Integer) null, Long.valueOf(j2), A0A, (List) null);
                    A0G.A01.CC7(r12);
                }
                if (i2 == 0 && A1T) {
                    A0G.A04((Boolean) null, 2, str2, (String) null, (String) null, (Map) null, 3, 1);
                    return;
                }
                return;
            case 2:
                DeviceJid deviceJid = (DeviceJid) this.A03;
                ((C19994A2h) this.A02).A03.A0T.A04(deviceJid, deviceJid.userJid, this.A04, -1, this.A01, this.A05);
                return;
            default:
                AnonymousClass74M r65 = (AnonymousClass74M) this.A02;
                boolean z3 = this.A05;
                String str3 = this.A04;
                long j3 = this.A01;
                Object obj = this.A03;
                r65.A0R(j3, str3, z3);
                r65.A0g.A0J(new AnonymousClass7RJ(obj, 45));
                return;
        }
    }
}
