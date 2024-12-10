package X;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: X.1V2  reason: invalid class name */
public class AnonymousClass1V2 {
    public final AnonymousClass1V1 A00;

    public void A00(AnonymousClass1EC r20, long j) {
        C41851xA BD0;
        AnonymousClass1V1 r11 = this.A00;
        C28791au A05 = r11.A01.A05();
        try {
            BD0 = A05.BD0();
            ContentValues contentValues = new ContentValues();
            long j2 = j;
            contentValues.put("announcement_version", Long.valueOf(j2));
            AnonymousClass1EC r12 = r20;
            if (((C28801av) A05).A02.A02(contentValues, "group_notification_version", "group_jid_row_id = ?", "UPDATE_GROUP_NOTIFICATION_ANNOUNCEMENT_VERSION", new String[]{String.valueOf(r11.A00.A09(r12))}) != 1) {
                AnonymousClass1V1.A01(r11, r12, 0, j2, 0);
            }
            BD0.A00();
            A05.BJ7(new AnonymousClass3Bx(r11, r12, 28));
            BD0.close();
            A05.close();
            return;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A01(AnonymousClass1EC r22, long j) {
        C41851xA BD0;
        AnonymousClass1V1 r13 = this.A00;
        C28791au A05 = r13.A01.A05();
        try {
            BD0 = A05.BD0();
            ContentValues contentValues = new ContentValues();
            long j2 = j;
            contentValues.put("subject_timestamp", Long.valueOf(j2));
            AnonymousClass1EC r14 = r22;
            long A09 = r13.A00.A09(r14);
            if (((C28801av) A05).A02.A02(contentValues, "group_notification_version", "group_jid_row_id = ?", "UPDATE_GROUP_NOTIFICATION_SUBJECT_TIMESTAMP", new String[]{String.valueOf(A09)}) != 1) {
                AnonymousClass1V1.A01(r13, r14, j2, 0, 0);
            }
            BD0.A00();
            A05.BJ7(new AnonymousClass3Bx(r13, r14, 30));
            BD0.close();
            A05.close();
            return;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A02(AnonymousClass1EC r5, long j) {
        long j2;
        AnonymousClass1V1 r2 = this.A00;
        Map map = r2.A02;
        synchronized (map) {
            C54252dq r0 = (C54252dq) map.get(r5);
            if (r0 == null) {
                r0 = AnonymousClass1V1.A00(r2, r5);
            }
            j2 = r0.A02;
        }
        if (j2 <= j) {
            return true;
        }
        return false;
    }

    public AnonymousClass1V2(AnonymousClass1V1 r1) {
        this.A00 = r1;
    }
}
