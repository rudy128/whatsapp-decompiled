package X;

import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1WJ  reason: invalid class name */
public class AnonymousClass1WJ {
    public final AnonymousClass1WI A00;

    public synchronized boolean A00(int i, long j) {
        String str;
        C41851xA BD0;
        boolean z;
        if (i == 0) {
            str = "poll_votes";
        } else if (i == 1) {
            str = "poll_votes_changed";
        } else if (i == 2) {
            str = "poll_vote_deletes";
        } else if (i != 3) {
            str = "users_participated";
        } else {
            str = "option_count";
        }
        C28791au A06 = this.A00.A06();
        try {
            BD0 = A06.BD0();
            C23141Ev r2 = ((C28801av) A06).A02;
            z = false;
            if (!(!TextUtils.isEmpty(C28331Zy.A00(r2, "table", "poll_event_logging")))) {
                Log.e("PollDailyActionLoggingStore/incrementCount: table does not exist");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("UPDATE ");
                sb.append("poll_event_logging");
                sb.append(" SET ");
                sb.append(str);
                sb.append(" = ");
                sb.append(str);
                sb.append(" + ?");
                sb.append(" WHERE ");
                sb.append("poll_id");
                sb.append(" = ?");
                C60042nI A0D = r2.A0D(sb.toString(), "update_poll_action");
                SQLiteStatement sQLiteStatement = A0D.A00;
                sQLiteStatement.bindLong(1, 1);
                sQLiteStatement.bindLong(2, j);
                int A002 = A0D.A00();
                BD0.A00();
                if (A002 != 0) {
                    z = true;
                }
            }
            BD0.close();
            A06.close();
        } catch (Throwable th) {
            try {
                A06.close();
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
            throw th;
        }
        return z;
        throw th;
    }

    public AnonymousClass1WJ(AnonymousClass1WI r1) {
        this.A00 = r1;
    }
}
