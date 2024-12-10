package X;

import android.database.Cursor;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.24s  reason: invalid class name and case insensitive filesystem */
public final class C447724s implements C447624r {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public C447724s(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void CCZ(AnonymousClass206 r11, C49702Rn r12) {
        Cursor A0A;
        C18070vi.A0d(r11, 0);
        if ((r11.A11 & 1) == 1) {
            C25891Qa r8 = (C25891Qa) this.A01.get();
            ArrayList arrayList = new ArrayList();
            C28781at A04 = r8.A03.get();
            try {
                A0A = ((C28801av) A04).A02.A0A("SELECT jid_row_id, display_name FROM message_mentions WHERE message_row_id = ?", "GET_JIDS_FROM_MESSAGES_MENTIONED_TABLE_SQL", new String[]{Long.toString(r11.A0x)});
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("jid_row_id");
                int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("display_name");
                while (A0A.moveToNext()) {
                    long j = A0A.getLong(columnIndexOrThrow);
                    String string = A0A.getString(columnIndexOrThrow2);
                    Jid A0B = r8.A02.A0B(j);
                    C22931Dv r0 = AnonymousClass1BI.A00;
                    AnonymousClass1BI A002 = C22931Dv.A00(A0B);
                    if (A002 != null) {
                        arrayList.add(new C70503Bi(A002, string));
                    }
                }
                A0A.close();
                A04.close();
                r11.A0l(arrayList);
                boolean z = false;
                if (((AnonymousClass1PW) this.A00.get()).A03(r11.A0h) != null) {
                    z = true;
                }
                r11.A0n(z);
                if (r12 != null) {
                    new AnonymousClass20F(C447724s.class);
                    throw new NullPointerException("onProcessorExecuted");
                }
                return;
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
