package X;

import android.database.Cursor;
import android.os.SystemClock;

/* renamed from: X.387  reason: invalid class name */
public class AnonymousClass387 implements C1602787v {
    public final C18000vb A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1LY A02;
    public final AnonymousClass1QB A03;
    public final AnonymousClass1Cd A04;
    public final C18030ve A05;
    public final AnonymousClass11P A06;

    public Cursor BUo(C42621yT r21, C34141jz r22) {
        String str;
        AnonymousClass1LY r2;
        long j;
        AnonymousClass26f r3;
        AnonymousClass1LY r23;
        long j2;
        C28781at A042;
        AnonymousClass26f A0C;
        String str2;
        C28781at A043;
        String str3;
        C18030ve r11 = this.A05;
        C18040vf r32 = C18040vf.A02;
        C34141jz r7 = r22;
        if (C18020vd.A05(r32, r11, 11471)) {
            r7.A08 = AnonymousClass000.A0i();
        }
        AnonymousClass1BI r9 = r7.A03;
        C42621yT r6 = r21;
        if (r9 == null) {
            str = "StarredMessageStore/getStarredMessages";
            long uptimeMillis = SystemClock.uptimeMillis();
            AnonymousClass1QB r24 = this.A03;
            long BS5 = r24.BS5();
            try {
                A043 = this.A04.get();
                if (!AnonymousClass000.A1a(r7.A04())) {
                    r3 = ((C28801av) A043).A02.A0C(r6, AnonymousClass203.A02, "GET_ALL_STARRED_MESSAGES_START_SQL", (String[]) null);
                } else if (BS5 == 1) {
                    String A0G = r24.A0G(r7.A02());
                    r3 = ((C28801av) A043).A02.A0C(r6, C51002Wp.A0B, "SEARCH_STARRED_MESSAGES_FTS_DEPRECATED_SQL", new String[]{A0G});
                } else {
                    AnonymousClass1Ez r8 = new AnonymousClass1Ez("FtsStarredMessageSearchCursorProvider/getAllMessages");
                    r8.A04();
                    String A0C2 = r24.A0C(r6, r7, (Integer) null);
                    r8.A03("matchTerm");
                    if (C18020vd.A05(r32, r11, 11471)) {
                        str3 = C51002Wp.A06;
                    } else {
                        str3 = C51002Wp.A0C;
                    }
                    r3 = ((C28801av) A043).A02.A0C(r6, str3, "SEARCH_STARRED_MESSAGES_FTS_SQL", new String[]{A0C2});
                    r8.A02();
                }
                A043.close();
                r23 = this.A02;
                j2 = SystemClock.uptimeMillis() - uptimeMillis;
            } catch (Throwable th) {
                th = th;
                r2 = this.A02;
                j = SystemClock.uptimeMillis() - uptimeMillis;
                r2.A01(str, j);
                throw th;
            }
        } else {
            str = "StarredMessageStore/getStarredMessagesForJid";
            long uptimeMillis2 = SystemClock.uptimeMillis();
            AnonymousClass1QB r25 = this.A03;
            long BS52 = r25.BS5();
            try {
                A042 = this.A04.get();
                if (!AnonymousClass000.A1a(r7.A04())) {
                    C23141Ev r33 = ((C28801av) A042).A02;
                    String str4 = AnonymousClass203.A01;
                    String[] strArr = new String[1];
                    AnonymousClass1LW.A03(this.A01, r9, strArr, 0);
                    A0C = r33.A0C(r6, str4, "GET_ALL_STARRED_MESSAGES_FOR_JID_START_SQL", strArr);
                } else if (BS52 == 1) {
                    String A0G2 = r25.A0G(r7.A02());
                    C23141Ev r72 = ((C28801av) A042).A02;
                    String str5 = C51002Wp.A09;
                    String[] A1Z = C17880vN.A1Z();
                    AnonymousClass1LW.A03(this.A01, r9, A1Z, 0);
                    A1Z[1] = A0G2;
                    A0C = r72.A0C(r6, str5, "SEARCH_STARRED_MESSAGES_FOR_JID_FTS_DEPRECATED_SQL", A1Z);
                } else {
                    AnonymousClass1Ez r92 = new AnonymousClass1Ez("FtsStarredMessageSearchCursorProvider/getMessagesForJid");
                    r92.A04();
                    String A0C3 = r25.A0C(r6, r7, (Integer) null);
                    r92.A03("matchTerm");
                    if (C18020vd.A05(r32, r11, 11471)) {
                        str2 = C51002Wp.A06;
                    } else {
                        str2 = C51002Wp.A0A;
                    }
                    A0C = ((C28801av) A042).A02.A0C(r6, str2, "SEARCH_STARRED_MESSAGES_FOR_JID_FTS_SQL", new String[]{A0C3});
                    r92.A02();
                }
                A042.close();
                r23 = this.A02;
                j2 = SystemClock.uptimeMillis() - uptimeMillis2;
            } catch (Throwable th2) {
                th = th2;
                r2 = this.A02;
                j = SystemClock.uptimeMillis() - uptimeMillis2;
                r2.A01(str, j);
                throw th;
            }
        }
        r23.A01(str, j2);
        return r3;
        throw th;
        throw th;
    }

    public AnonymousClass387(AnonymousClass11P r1, C18000vb r2, AnonymousClass1LW r3, AnonymousClass1LY r4, AnonymousClass1QB r5, AnonymousClass1Cd r6, C18030ve r7) {
        this.A06 = r1;
        this.A05 = r7;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
    }
}
