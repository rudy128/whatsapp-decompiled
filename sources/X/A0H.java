package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class A0H {
    public final C33251iW A00;
    public final C20606ARq A01;
    public final AnonymousClass1RW A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass121 A04;
    public final C28521aN A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public void A01(A7L a7l, AnonymousClass1BI r27, boolean z, boolean z2) {
        Throwable th;
        boolean z3;
        int i;
        A7L a7l2 = a7l;
        long j = a7l2.A00;
        long max = Math.max(j, a7l2.A01);
        AnonymousClass121 r6 = this.A04;
        AnonymousClass1BI r8 = r27;
        long BTu = r6.BTu(r8, max);
        AnonymousClass122 r14 = (AnonymousClass122) r6;
        String[] strArr = new String[4];
        C17890vO.A1J(strArr, r14.A0C.A09(r8));
        C17880vN.A1V(strArr, 1, BTu);
        strArr[2] = String.valueOf(AnonymousClass11P.A01(r14.A0A));
        C17880vN.A1S(strArr, 1000, 3);
        C28781at A042 = r14.A0V.get();
        try {
            Cursor A0A = ((C28801av) A042).A02.A0A("   SELECT _id, sort_id, key_id, from_me, timestamp, receipt_server_timestamp, starred, status FROM available_message_view WHERE chat_row_id = ? AND sort_id <= ? AND (message_type != '7') AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT ? ", "SELECT_INCOMING_AND_SENT_MESSAGE_KEYS_OLDER_THAN_SORT_ID_IN_CHAT_SQL", strArr);
            A042.close();
            try {
                ArrayList A13 = AnonymousClass000.A13();
                if (A0A != null) {
                    while (A0A.moveToNext()) {
                        A13.add(new C186659eY(A0A, r8));
                    }
                    A0A.close();
                }
                Iterator it = A13.iterator();
                long j2 = Long.MAX_VALUE;
                while (it.hasNext()) {
                    C186659eY r1 = (C186659eY) it.next();
                    long j3 = r1.A00;
                    if (j3 < j2 && r1.A01 >= j) {
                        j2 = j3;
                    }
                }
                Iterator it2 = A13.iterator();
                long j4 = -1;
                while (it2.hasNext()) {
                    C186659eY r0 = (C186659eY) it2.next();
                    long j5 = r0.A00;
                    if (j5 < j2 && j5 > j4 && r0.A01 < j) {
                        j4 = j5;
                    }
                }
                A0A = r6.Ba5(r8, j4, BTu, max);
                ArrayList A132 = AnonymousClass000.A13();
                if (A0A != null) {
                    while (A0A.moveToNext()) {
                        A132.add(new C186659eY(A0A, r8));
                    }
                    A0A.close();
                }
                ArrayList A133 = AnonymousClass000.A13();
                ArrayList A134 = AnonymousClass000.A13();
                Iterator it3 = A13.iterator();
                while (true) {
                    z3 = z2;
                    if (!it3.hasNext()) {
                        break;
                    }
                    C186659eY r2 = (C186659eY) it3.next();
                    if (r2.A00 > j4 && ((!r2.A03 || z2) && r2.A01 < j)) {
                        A134.add(C108945cZ.A0s(r2.A02, C17880vN.A0c(this.A06)));
                    }
                }
                A133.addAll(A134);
                ArrayList A135 = AnonymousClass000.A13();
                Iterator it4 = A132.iterator();
                while (it4.hasNext()) {
                    C186659eY r5 = (C186659eY) it4.next();
                    long j6 = r5.A01;
                    if (j6 <= max) {
                        C436420i r3 = (C436420i) C108945cZ.A0s(r5.A02, C17880vN.A0c(this.A06));
                        if (!(r3 == null || (i = r3.A00) == 67)) {
                            if (!C108965cb.A1b((Set) AnonymousClass2WQ.A00.get(), i) || j6 < AnonymousClass11P.A01(this.A03) - AnonymousClass8BW.A05()) {
                                A135.add(r3);
                            }
                        }
                    }
                }
                A133.addAll(A135);
                A133.addAll(A00(r8, a7l2.A02, z3));
                A133.addAll(A00(r8, a7l2.A03, z3));
                boolean z4 = z;
                if (j4 != -1) {
                    Long valueOf = Long.valueOf(j4);
                    if (z2) {
                        this.A05.A04(r8, valueOf);
                    }
                    r6.CKc(r8, true);
                    r6.BEq(r8, valueOf, true, z4);
                }
                if (!A133.isEmpty()) {
                    r6.BIL(A133, z4 ? 1 : 0);
                }
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A042.close();
            throw th;
        }
    }

    public A0H(C33251iW r1, C20606ARq aRq, AnonymousClass1RW r3, AnonymousClass11P r4, AnonymousClass121 r5, C28521aN r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A06 = r7;
        this.A01 = aRq;
        this.A07 = r8;
        this.A05 = r6;
        this.A02 = r3;
    }

    private ArrayList A00(AnonymousClass1BI r7, Set set, boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C196029uL r3 = (C196029uL) it.next();
            AnonymousClass206 A012 = AnonymousClass1W2.A01(((C59392mE) this.A07.get()).A01(AnonymousClass205.A01(r7, r3.A03, r3.A04)), this.A06);
            if (A012 != null && (!A012.A0q || z)) {
                A13.add(A012);
            }
        }
        return A13;
    }
}
