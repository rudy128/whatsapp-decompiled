package X;

import com.whatsapp.bridge.wfal.WfalManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6LN  reason: invalid class name */
public final class AnonymousClass6LN extends A34 {
    public final WfalManager A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass73E A02;
    public final C133526ou A03;
    public final AnonymousClass1W6 A04;
    public final C140116zy A05;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        StringBuilder A10;
        String obj;
        C133526ou r5 = this.A03;
        C201110w copyOf = C201110w.copyOf((Map) (ConcurrentHashMap) r5.A01.getValue());
        C18070vi.A0X(copyOf);
        Iterator it = copyOf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            String A0x = C17880vN.A0x(A16);
            List A0t = C29431cG.A0t(((C134636qu) A16.getValue()).A01);
            List A0t2 = C29431cG.A0t(((C134636qu) A16.getValue()).A00);
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it2 = A0t2.iterator();
            while (it2.hasNext()) {
                long A07 = C17890vO.A07(it2);
                AnonymousClass206 A032 = this.A04.A01.A03(A07);
                if (A032 == null || AnonymousClass25A.A0p(A032)) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("CrosspostSendUnsentSessionsTask/getMessageFromMessageRowIds encountered empty or revoked message: ");
                    A102.append(A07);
                    C108995ce.A1O(A102, ", skipping and retrying the rest");
                    this.A02.A07(C18070vi.A0M(Long.valueOf(A07)), A0t, 4);
                } else {
                    A13.add(A032);
                }
            }
            Iterator it3 = A0t.iterator();
            while (true) {
                if (it3.hasNext()) {
                    C122646Re r7 = (C122646Re) it3.next();
                    if (this.A00.A03(r7) == null) {
                        StringBuilder A103 = AnonymousClass000.A10();
                        A103.append("CrosspostSendUnsentSessionsTask/session messages ");
                        A103.append(A13);
                        obj = AnonymousClass001.A1E(r7, " invalid for retry due to account not linked: ", A103);
                        break;
                    }
                } else {
                    if (!(A13 instanceof Collection) || !A13.isEmpty()) {
                        Iterator it4 = A13.iterator();
                        while (it4.hasNext()) {
                            AnonymousClass206 A0Y = C17880vN.A0Y(it4);
                            C18070vi.A0d(A0Y, 0);
                            if (!C1402870s.A00(A0Y)) {
                                A10 = AnonymousClass000.A10();
                                AnonymousClass206.A06(A0Y, "CrosspostSendUnsentSessionsTask/message ", A10);
                                AnonymousClass206.A07(A0Y, " invalid for retry due to incompatible type: ", A10);
                            } else if (Math.abs(AnonymousClass3MZ.A05(this.A01, A0Y)) > 10800000) {
                                A10 = AnonymousClass000.A10();
                                AnonymousClass206.A06(A0Y, "CrosspostSendUnsentSessionsTask/message ", A10);
                                A10.append(" invalid for retry due to timestamp expiration: ");
                                A10.append(A0Y.A0I);
                            }
                            obj = A10.toString();
                        }
                    }
                    ArrayList A033 = AnonymousClass74A.A03(this.A02, A13, A0t);
                    C140116zy r72 = this.A05;
                    C18070vi.A0b(A0x);
                    StringBuilder A19 = AnonymousClass3MZ.A19(A0x, 0);
                    A19.append("CrosspostRequestSessionManager/handleCrosspostRetry started for session: ");
                    A19.append(A0x);
                    A19.append(" with messages: ");
                    ArrayList A0E = C29351c6.A0E(A13);
                    Iterator it5 = A13.iterator();
                    while (it5.hasNext()) {
                        C108995ce.A1Q(A0E, it5);
                    }
                    C18070vi.A0d(C17890vO.A0V(A0E, A19), 0);
                    ((C133526ou) r72.A07.get()).A00(A0x);
                    ((C133106oB) r72.A02.get()).A00(new C146357Ou(new AnonymousClass6OC(r72.A04), r72, A0x, A13), A0x, A13, A033, A0t, 10);
                }
            }
            StringBuilder A192 = AnonymousClass3MZ.A19(obj, 0);
            A192.append("CrosspostSendUnsentSessionsTask/doInBackground sessionId: ");
            A192.append(A0x);
            C18070vi.A0d(AnonymousClass000.A0y(" not eligible for retry, updating db", A192), 0);
            C18070vi.A0b(A0x);
            r5.A00(A0x);
            AnonymousClass73E r73 = this.A02;
            ArrayList A0D = C29351c6.A0D(A13);
            Iterator it6 = A13.iterator();
            while (it6.hasNext()) {
                C108995ce.A1Q(A0D, it6);
            }
            r73.A07(A0D, A0t, 4);
        }
        return null;
    }

    public AnonymousClass6LN(WfalManager wfalManager, AnonymousClass11P r2, AnonymousClass73E r3, C133526ou r4, AnonymousClass1W6 r5, C140116zy r6) {
        C18070vi.A0p(r5, wfalManager, r3);
        C72473Md.A1J(r6, r4);
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = wfalManager;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
    }
}
