package X;

import android.database.Cursor;

/* renamed from: X.24p  reason: invalid class name and case insensitive filesystem */
public final class C447424p implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public C447424p(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, com.whatsapp.TextData] */
    public void BL9(AnonymousClass206 r10) {
        Cursor A0A;
        C18070vi.A0d(r10, 0);
        AnonymousClass1QU r1 = (AnonymousClass1QU) this.A00.get();
        AnonymousClass210 r102 = (AnonymousClass210) r10;
        boolean z = false;
        if (r102.A0x > 0) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TextMessageStore/fillTextInfo/message must have row_id set; key=");
        sb.append(r102.A0v);
        C17960vV.A0G(z, sb.toString());
        String[] strArr = {Long.toString(r102.A0x)};
        C28781at A04 = r1.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT description, page_title, url, font_style, text_color, background_color, preview_type, invite_link_group_type, counter_abuse_token FROM message_text WHERE message_row_id = ?", "GET_TEXT_MESSAGE_BY_ROW_ID_SQL", strArr);
            if (A0A.moveToNext()) {
                r102.A05 = A0A.getString(A0A.getColumnIndexOrThrow("description"));
                r102.A06 = A0A.getString(A0A.getColumnIndexOrThrow("page_title"));
                r102.A07 = A0A.getString(A0A.getColumnIndexOrThrow("url"));
                if (!A0A.isNull(A0A.getColumnIndexOrThrow("font_style"))) {
                    ? obj = new Object();
                    obj.fontStyle = A0A.getInt(A0A.getColumnIndexOrThrow("font_style"));
                    obj.textColor = A0A.getInt(A0A.getColumnIndexOrThrow("text_color"));
                    obj.backgroundColor = A0A.getInt(A0A.getColumnIndexOrThrow("background_color"));
                    r102.A18(obj);
                }
                r102.A01 = A0A.getInt(A0A.getColumnIndexOrThrow("preview_type"));
                r102.A00 = A0A.getInt(A0A.getColumnIndexOrThrow("invite_link_group_type"));
                r102.A04 = A0A.getString(A0A.getColumnIndexOrThrow("counter_abuse_token"));
            }
            A0A.close();
            A04.close();
            r102.A19(r1.A01.A05(r102));
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
        throw th;
    }

    public void BdY(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        AnonymousClass210 r32 = (AnonymousClass210) r3;
        AnonymousClass1QU.A01(r32);
        AnonymousClass1QU.A00((AnonymousClass1QU) this.A00.get(), r32, false);
    }

    public void CQL(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        AnonymousClass210 r32 = (AnonymousClass210) r3;
        AnonymousClass1QU.A01(r32);
        AnonymousClass1QU.A00((AnonymousClass1QU) this.A00.get(), r32, true);
    }

    public static void A00(AnonymousClass206 r1, AnonymousClass00H r2) {
        ((C447424p) r2.get()).BdY(r1);
    }
}
