package X;

import android.database.Cursor;

/* renamed from: X.2sU  reason: invalid class name and case insensitive filesystem */
public final class C63092sU {
    public static final int[] A04 = {-1, 7, 11, 15, 35, 36, 38, 39, 50, 56, 58, 64, 68, 69, 70, 71, 74, 75, 76, 77, 79, 84, 87, 102};
    public long A00 = System.currentTimeMillis();
    public final AnonymousClass11N A01;
    public final AnonymousClass1NK A02;
    public final AnonymousClass00H A03;

    public static final Integer A00(C63092sU r10, AnonymousClass1BI r11, long j) {
        Cursor A0A;
        long j2;
        int A1O;
        AnonymousClass1NK r2 = r10.A02;
        long j3 = j - 86400000;
        int[] iArr = A04;
        AnonymousClass1Ez r1 = new AnonymousClass1Ez(false);
        r1.A05("rowidstore/getFirstSentOrReceivedRowIdInTimeWindowExcludingTypes");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT _id FROM available_message_view WHERE chat_row_id = ? AND ");
        A10.append(AnonymousClass001.A1H(C26121Qx.A00(iArr), " AND ", AnonymousClass000.A10()));
        A10.append("(");
        A10.append("from_me = 1");
        A10.append(" AND ");
        A10.append("timestamp BETWEEN ? AND ?");
        A10.append(" OR ");
        A10.append("from_me = 0");
        A10.append(" AND ");
        A10.append("received_timestamp BETWEEN ? AND ?");
        String A0y = AnonymousClass000.A0y(") ORDER BY sort_id ASC LIMIT 1", A10);
        C28781at A042 = r2.A01.get();
        try {
            C23141Ev r5 = ((C28801av) A042).A02;
            String[] strArr = new String[5];
            C17890vO.A1J(strArr, r2.A00.A09(r11));
            String l = Long.toString(j3);
            strArr[1] = l;
            String l2 = Long.toString(j);
            strArr[2] = l2;
            strArr[3] = l;
            strArr[4] = l2;
            A0A = r5.A0A(A0y, "GET_FIRST_IN_TIME_WINDOW_EXCLUDE_TYPES", strArr);
            if (A0A.moveToNext()) {
                j2 = C17890vO.A06(A0A, "_id");
            } else {
                j2 = 1;
            }
            A0A.close();
            A042.close();
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("rowidstore/getFirstSentOrReceivedRowIdInTimeWindowExcludingTypes ");
            A102.append("");
            A102.append(" | time spent:");
            C17890vO.A16(A102, r1.A02());
            if (j2 == 1) {
                A1O = 2;
            } else {
                AnonymousClass206 A022 = AnonymousClass1W2.A02(r10.A03, j2);
                if (A022 == null) {
                    C17900vP.A0l("calculateConversationInitiator: cannot load FMessage for rowId=", AnonymousClass000.A10(), j2);
                    return null;
                }
                A1O = AnonymousClass000.A1O(A022.A0v.A02 ? 1 : 0);
            }
            return Integer.valueOf(A1O);
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public C63092sU(AnonymousClass11N r3, AnonymousClass1NK r4, AnonymousClass00H r5) {
        C18070vi.A0o(r3, r4, r5);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
