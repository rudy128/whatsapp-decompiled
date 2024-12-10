package X;

import android.database.Cursor;
import android.os.SystemClock;

/* renamed from: X.386  reason: invalid class name */
public class AnonymousClass386 implements C1602787v {
    public final AnonymousClass11P A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1LY A02;
    public final AnonymousClass1QB A03;
    public final AnonymousClass1Cd A04;

    public Cursor BUo(C42621yT r11, C34141jz r12) {
        C28781at A042;
        AnonymousClass26f r3;
        AnonymousClass1BI r5 = r12.A03;
        if (r5 == null) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            A042 = this.A04.get();
            if (AnonymousClass000.A1a(r12.A04())) {
                String A0C = this.A03.A0C(r11, r12, (Integer) null);
                r3 = ((C28801av) A042).A02.A0C(r11, C51002Wp.A08, "SEARCH_KEPT_MESSAGES_FOR_JID_FTS_SQL", new String[]{A0C});
            } else {
                C23141Ev r32 = ((C28801av) A042).A02;
                String str = AnonymousClass203.A00;
                String[] strArr = new String[1];
                AnonymousClass1LW.A03(this.A01, r5, strArr, 0);
                r3 = r32.A0C(r11, str, "GET_ALL_KEPT_MESSAGES_FOR_JID_START_SQL", strArr);
            }
            A042.close();
            this.A02.A01("KeptMessageStore/getKeptMessagesForJid", SystemClock.uptimeMillis() - uptimeMillis);
            return r3;
        } catch (Throwable th) {
            this.A02.A01("KeptMessageStore/getKeptMessagesForJid", SystemClock.uptimeMillis() - uptimeMillis);
            throw th;
        }
        throw th;
    }

    public AnonymousClass386(AnonymousClass11P r1, AnonymousClass1LW r2, AnonymousClass1LY r3, AnonymousClass1QB r4, AnonymousClass1Cd r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
