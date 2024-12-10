package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.1SS  reason: invalid class name */
public class AnonymousClass1SS {
    public final C002100z A00 = new AnonymousClass27K(this);
    public final AnonymousClass11P A01;
    public final AnonymousClass1RM A02;
    public final AnonymousClass10I A03;

    public synchronized void A05(C56202h4 r11) {
        C41851xA BD0;
        C17960vV.A01();
        try {
            C28791au A06 = this.A02.A06();
            try {
                BD0 = A06.BD0();
                C23141Ev r7 = ((C28801av) A06).A02;
                String str = r11.A0D;
                int i = r11.A0B;
                r7.A04("media_job", "uuid = ? AND job_type = ? ", "MediaJobDataStore/delete", new String[]{str, Integer.toString(i)});
                BD0.A00();
                C002100z r1 = this.A00;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                r1.A05(sb.toString());
                BD0.close();
                A06.close();
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("MediaJobDataStore/delete", e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        return;
        throw th;
    }

    public static ContentValues A00(C56202h4 r23, AnonymousClass1SS r24) {
        C56202h4 r1 = r23;
        String str = r1.A0D;
        long j = (long) r1.A0B;
        long j2 = r1.A0C;
        long j3 = r1.A09;
        long j4 = (long) r1.A03;
        long j5 = r1.A07;
        long j6 = r1.A08;
        int i = r1.A02;
        int i2 = r1.A00;
        long j7 = r1.A0A;
        int i3 = r1.A01;
        long j8 = r1.A04;
        long j9 = r1.A05;
        ContentValues contentValues = new ContentValues();
        contentValues.put("uuid", str);
        contentValues.put("job_type", Long.valueOf(j));
        contentValues.put("create_time", Long.valueOf(j2));
        contentValues.put("transfer_start_time", Long.valueOf(j3));
        contentValues.put("last_update_time", Long.valueOf(AnonymousClass11P.A01(r24.A01)));
        contentValues.put("user_initiated_attempt_count", Long.valueOf(j4));
        contentValues.put("overall_cumulative_time", Long.valueOf(j5));
        contentValues.put("overall_cumulative_user_visible_time", Long.valueOf(j6));
        contentValues.put("streaming_playback_count", Integer.valueOf(i));
        contentValues.put("media_key_reuse_type", Integer.valueOf(i2));
        contentValues.put("transferred_bytes", Long.valueOf(j7));
        contentValues.put("reupload_attempt_count", Integer.valueOf(i3));
        contentValues.put("last_reupload_attempt_timestamp", Long.valueOf(j8));
        contentValues.put("last_reupload_success_timestamp", Long.valueOf(j9));
        return contentValues;
    }

    public C56202h4 A02(String str, int i) {
        AnonymousClass11P r0 = this.A01;
        long A012 = AnonymousClass11P.A01(r0);
        long A013 = AnonymousClass11P.A01(r0);
        long A014 = AnonymousClass11P.A01(r0);
        boolean z = true;
        boolean z2 = false;
        if (A012 > 0) {
            z2 = true;
        }
        C17960vV.A0D(z2);
        if (A014 <= 0) {
            z = false;
        }
        C17960vV.A0D(z);
        String str2 = str;
        C17960vV.A07(str2);
        C56202h4 r4 = new C56202h4(str2, i, 0, 0, 0, 0, A012, A013, A014, 0, 0, 0, 0, 0);
        this.A03.CGF(new C146807Qr(this, r4, 24));
        return r4;
    }

    public synchronized C56202h4 A03(String str, int i) {
        Cursor A0A;
        synchronized (this) {
            C17960vV.A01();
            C002100z r3 = this.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            int i2 = i;
            sb.append(i2);
            C56202h4 r0 = (C56202h4) r3.A04(sb.toString());
            if (r0 != null) {
                return r0;
            }
            C28781at A05 = this.A02.get();
            try {
                A0A = ((C28801av) A05).A02.A0A("SELECT + _id, uuid, job_type , create_time, transfer_start_time, last_update_time, user_initiated_attempt_count, overall_cumulative_time, overall_cumulative_user_visible_time, streaming_playback_count, media_key_reuse_type, doodle_id, transferred_bytes, reupload_attempt_count, last_reupload_attempt_timestamp, last_reupload_success_timestamp FROM media_job WHERE uuid=? AND job_type=?", "MediaJobDataStore/get", new String[]{str, Integer.toString(i2)});
                if (A0A.moveToLast()) {
                    String string = A0A.getString(1);
                    int i3 = A0A.getInt(2);
                    long j = A0A.getLong(3);
                    long j2 = A0A.getLong(4);
                    long j3 = A0A.getLong(5);
                    int i4 = A0A.getInt(6);
                    long j4 = A0A.getLong(7);
                    long j5 = A0A.getLong(8);
                    int i5 = A0A.getInt(9);
                    int i6 = A0A.getInt(10);
                    long j6 = A0A.getLong(12);
                    int i7 = A0A.getInt(13);
                    long j7 = A0A.getLong(14);
                    long j8 = A0A.getLong(15);
                    boolean z = true;
                    boolean z2 = false;
                    if (j > 0) {
                        z2 = true;
                    }
                    C17960vV.A0D(z2);
                    if (j3 <= 0) {
                        z = false;
                    }
                    C17960vV.A0D(z);
                    C17960vV.A07(string);
                    C56202h4 r9 = new C56202h4(string, i3, i4, i5, i6, i7, j, j2, j3, j4, j5, j6, j7, j8);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(r9.A0D);
                    sb2.append(r9.A0B);
                    r3.A08(sb2.toString(), r9);
                    A0A.close();
                    A05.close();
                    return r9;
                }
                A0A.close();
                A05.close();
                return null;
            } catch (Throwable th) {
                try {
                    A05.close();
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
                throw th;
            }
        }
        throw th;
    }

    public void A04(C56202h4 r4) {
        r4.A06 = AnonymousClass11P.A01(this.A01);
        if (A01(r4, this)) {
            C002100z r2 = this.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(r4.A0D);
            sb.append(r4.A0B);
            r2.A08(sb.toString(), r4);
        }
    }

    public AnonymousClass1SS(AnonymousClass11P r2, AnonymousClass1RM r3, AnonymousClass10I r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static boolean A01(C56202h4 r8, AnonymousClass1SS r9) {
        C28791au A06;
        C17960vV.A01();
        try {
            A06 = r9.A02.A06();
            ((C28801av) A06).A02.A02(A00(r8, r9), "media_job", "uuid = ? AND job_type = ? ", "MediaJobDataStore/updateInternal", new String[]{r8.A0D, Integer.toString(r8.A0B)});
            A06.close();
            return true;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("MediaJobDataStore/update", e);
            return false;
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }
}
