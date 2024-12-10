package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.2iB  reason: invalid class name and case insensitive filesystem */
public class C56882iB {
    public final AnonymousClass1WI A00;

    public C56882iB(AnonymousClass1WI r1) {
        this.A00 = r1;
    }

    public void A00(GroupJid groupJid, int i, int i2) {
        String str;
        C41851xA BD0;
        int i3 = i2;
        if (i2 == 0) {
            str = "reaction_open_tray_count";
        } else if (i3 == 1) {
            str = "reaction_delete_count";
        } else if (i3 != 2) {
            str = "pnh_indicator_clicks_info_screen";
        } else {
            str = "pnh_indicator_clicks_chat";
        }
        C28791au A06 = this.A00.A06();
        try {
            BD0 = A06.BD0();
            C23141Ev r7 = ((C28801av) A06).A02;
            if (!(!TextUtils.isEmpty(C28331Zy.A00(r7, "table", "pnh_daily_event_logging")))) {
                Log.e("PnhDailyActionLoggingStore/incrementCount: table does not exist");
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("UPDATE ");
                A10.append("pnh_daily_event_logging");
                A10.append(" SET ");
                A10.append(str);
                A10.append(" = ");
                A10.append(str);
                C17890vO.A18(A10, " + ?");
                A10.append("community_id");
                A10.append(" = ? AND ");
                A10.append("type_of_subgroup");
                C60042nI A0D = r7.A0D(AnonymousClass000.A0y(" = ?", A10), "update_pnh_daily_action");
                SQLiteStatement sQLiteStatement = A0D.A00;
                sQLiteStatement.bindLong(1, 1);
                sQLiteStatement.bindString(2, groupJid.getRawString());
                int i4 = i;
                sQLiteStatement.bindLong(3, (long) i4);
                if (A0D.A00() == 0) {
                    ContentValues A09 = C17880vN.A09(3);
                    A09.put("community_id", groupJid.getRawString());
                    C17880vN.A18(A09, "type_of_subgroup", i4);
                    C17880vN.A18(A09, str, 1);
                    r7.A05("pnh_daily_event_logging", "update_pnh_daily_action", A09);
                }
                BD0.A00();
            }
            BD0.close();
            A06.close();
            return;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }
}
