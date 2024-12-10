package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1DL  reason: invalid class name */
public class AnonymousClass1DL {
    public final AnonymousClass190 A00;
    public final AnonymousClass1Cd A01;
    public final Map A02 = new ConcurrentHashMap();
    public final Map A03 = new ConcurrentHashMap();

    public long A0A(Jid jid) {
        Jid jid2 = jid;
        Number number = (Number) this.A02.get(jid);
        if (number != null) {
            return number.longValue();
        }
        C28781at A04 = this.A01.get();
        try {
            long A012 = A01(jid);
            if (A012 > 0) {
                if (((C28801av) A04).A02.A00.inTransaction()) {
                    A04.BJ7(new AnonymousClass3C3(this, jid2, 8, A012));
                } else {
                    A07(this, jid, A012);
                }
            }
            A04.close();
            return A012;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public Jid A0D(Cursor cursor, C28781at r16, Class cls, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        long j2 = j;
        try {
            return (Jid) cls.cast(A0C(cursor, r16, i, i2, i3, i4, i5, i6, j2));
        } catch (ClassCastException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("JidStore/readJidByRowId/jid wrong class; rowId=");
            sb.append(j2);
            sb.append("; db_data=");
            sb.append(A05(j2));
            Log.e(sb.toString(), e);
            this.A00.A0G("invalid-jid-in-store", (String) null, false);
            return null;
        }
    }

    public static long A00(C23141Ev r8, Jid jid) {
        Cursor cursor;
        long j;
        if (jid instanceof DeviceJid) {
            cursor = r8.A0A("SELECT _id FROM jid WHERE user = ? AND server = ? AND agent = ? AND device = ? AND type = ?", "GET_JID_ROW_ID_FROM_DEVICE_JID", new String[]{jid.user, jid.getServer(), Integer.toString(jid.getAgent()), Integer.toString(jid.getDevice()), Integer.toString(jid.getType())});
            try {
                if (cursor.moveToLast()) {
                    j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                }
                cursor.close();
                return -1;
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        } else {
            cursor = r8.A0A("SELECT _id FROM jid WHERE user = ? AND server = ? AND agent = ? AND type = ?", "GET_JID_ROW_ID_FROM_JID", new String[]{jid.user, jid.getServer(), Integer.toString(jid.getAgent()), Integer.toString(jid.getType())});
            if (cursor.moveToLast()) {
                j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            }
            cursor.close();
            return -1;
        }
        cursor.close();
        return j;
    }

    private long A01(Jid jid) {
        C28781at A04 = this.A01.get();
        try {
            long A002 = A00(((C28801av) A04).A02, jid);
            A04.close();
            return A002;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    private String A05(long j) {
        Cursor A0A;
        int i;
        String str;
        C28781at A04 = this.A01.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?", "GET_JID_BY_ROW_ID_SQL", new String[]{Long.toString(j)});
            if (A0A.moveToLast()) {
                String string = A0A.getString(A0A.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER));
                String string2 = A0A.getString(A0A.getColumnIndexOrThrow("server"));
                int i2 = A0A.getInt(A0A.getColumnIndexOrThrow("agent"));
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("device");
                if (A0A.isNull(columnIndexOrThrow)) {
                    i = 0;
                } else {
                    i = A0A.getInt(columnIndexOrThrow);
                }
                int i3 = A0A.getInt(A0A.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
                String string3 = A0A.getString(A0A.getColumnIndexOrThrow("raw_string"));
                boolean isNull = A0A.isNull(columnIndexOrThrow);
                if (string != null) {
                    String A09 = AnonymousClass1EG.A09('*', string);
                    if (string3 != null) {
                        string3 = string3.replace(string, A09);
                    }
                    string = A09;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("user=");
                sb.append(string);
                sb.append("; server=");
                sb.append(string2);
                sb.append("; agent=");
                sb.append(i2);
                sb.append("; device=");
                sb.append(i);
                sb.append("; type=");
                sb.append(i3);
                sb.append("; rawString=");
                sb.append(string3);
                sb.append("; has_device=");
                if (isNull) {
                    str = "no";
                } else {
                    str = "yes";
                }
                sb.append(str);
                String obj = sb.toString();
                A0A.close();
                A04.close();
                return obj;
            }
            A0A.close();
            A04.close();
            return null;
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

    public static String A06(Cursor cursor, int i) {
        try {
            return cursor.getString(i);
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading string or blob", e);
            throw e;
        } catch (SQLiteException e2) {
            if (e2.getMessage() == null || !e2.getMessage().contains("Unable to convert BLOB to string")) {
                Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading string or blob", e2);
                throw e2;
            }
            byte[] blob = cursor.getBlob(i);
            if (blob == null) {
                return null;
            }
            try {
                String str = new String(blob, C19620yd.A0A);
                StringBuilder sb = new StringBuilder();
                sb.append("DatabaseUtils/tryGetStringOrGetBlob/converting from blob; string=");
                sb.append(str);
                Log.i(sb.toString());
                return str;
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
    }

    public static void A07(AnonymousClass1DL r2, Jid jid, long j) {
        Map map = r2.A03;
        Long valueOf = Long.valueOf(j);
        map.put(valueOf, jid);
        r2.A02.put(jid, valueOf);
    }

    public static void A08(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" user=");
        sb.append(str2);
        sb.append(" server=");
        sb.append(str3);
        sb.append(" agent=");
        sb.append(i);
        sb.append(" device=");
        sb.append(i2);
        sb.append(" type=");
        sb.append(i3);
        sb.append(" rawString=");
        sb.append(str4);
        Log.e(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x022c A[Catch:{ all -> 0x025a, SQLiteConstraintException -> 0x00b1, all -> 0x02a2, all -> 0x0253 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A09(com.whatsapp.jid.Jid r24) {
        /*
            r23 = this;
            java.lang.String r22 = "jid"
            java.lang.String r21 = "raw_string"
            java.lang.String r20 = "type"
            java.lang.String r5 = "device"
            java.lang.String r14 = "agent"
            java.lang.String r13 = "server"
            java.lang.String r12 = "user"
            r7 = r23
            java.util.Map r0 = r7.A02
            r8 = r24
            java.lang.Object r0 = r0.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0024
            long r0 = r0.longValue()
            return r0
        L_0x0024:
            X.1Cd r0 = r7.A01
            X.1au r6 = r0.A05()
            long r1 = r7.A01(r8)     // Catch:{ all -> 0x02ac }
            java.lang.String r19 = "; rowId="
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x02ac }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x02ac }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x02ac }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x02ac }
            if (r0 == 0) goto L_0x0053
            r12 = 9
            X.3C3 r0 = new X.3C3     // Catch:{ all -> 0x02ac }
            r9 = r0
            r10 = r7
            r11 = r8
            r13 = r1
            r9.<init>(r10, r11, r12, r13)     // Catch:{ all -> 0x02ac }
            r6.BJ7(r0)     // Catch:{ all -> 0x02ac }
            goto L_0x029e
        L_0x0053:
            A07(r7, r8, r1)     // Catch:{ all -> 0x02ac }
            goto L_0x029e
        L_0x0058:
            X.1xA r18 = r6.BD1()     // Catch:{ all -> 0x02ac }
            long r1 = r7.A01(r8)     // Catch:{ all -> 0x02a2 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x025f
            r0 = 6
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r9.<init>(r0)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r0 = r8.user     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r9.put(r12, r0)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r0 = r8.getServer()     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r9.put(r13, r0)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            int r0 = r8.getAgent()     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r9.put(r14, r0)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            int r0 = r8.getDevice()     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r9.put(r5, r0)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            int r0 = r8.getType()     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r0 = r20
            r9.put(r0, r3)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r3 = r8.getRawString()     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r0 = r21
            r9.put(r0, r3)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            X.1Ev r4 = r0.A02     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            java.lang.String r3 = "INSERT_JID_SQL"
            r0 = r22
            long r1 = r4.A06(r0, r3, r9)     // Catch:{ SQLiteConstraintException -> 0x00b1 }
            goto L_0x025f
        L_0x00b1:
            r17 = move-exception
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x02a2 }
            X.1Ev r15 = r0.A02     // Catch:{ all -> 0x02a2 }
            java.lang.String r9 = "SELECT _id, user, server, agent, device, type, raw_string FROM jid WHERE raw_string = ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x02a2 }
            java.lang.String r3 = r8.getRawString()     // Catch:{ all -> 0x02a2 }
            r0 = 0
            r4[r0] = r3     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "GET_JID_FROM_RAW_STRING"
            android.database.Cursor r11 = r15.A0A(r9, r0, r4)     // Catch:{ all -> 0x02a2 }
            boolean r0 = r11.moveToLast()     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x020d
            java.lang.String r0 = "_id"
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0253 }
            long r3 = r11.getLong(r0)     // Catch:{ all -> 0x0253 }
            java.util.Map r9 = r7.A03     // Catch:{ all -> 0x0253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0253 }
            boolean r16 = r9.containsKey(r0)     // Catch:{ all -> 0x0253 }
            com.whatsapp.jid.Jid r10 = r7.A0B(r3)     // Catch:{ all -> 0x0253 }
            java.lang.String r9 = "; errorRowId="
            if (r10 == 0) goto L_0x01de
            int r15 = r11.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0253 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0253 }
            r5.<init>()     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed; jid="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; db.user="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            int r0 = r11.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; db.server="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            int r0 = r11.getColumnIndexOrThrow(r13)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; db.agent="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            int r0 = r11.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x0253 }
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; db.device="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            boolean r0 = r11.isNull(r15)     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x01d4
            java.lang.String r0 = "<null>"
        L_0x013d:
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; db.type="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            r0 = r20
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0253 }
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; db.raw_string="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            r0 = r21
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            r5.append(r9)     // Catch:{ all -> 0x0253 }
            r5.append(r3)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; inCache="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            r0 = r16
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; jidFromDb.user="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r10.user     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; jidFromDb.server="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r10.getServer()     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; jidFromDb.agent="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            int r0 = r10.getAgent()     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; jidFromDb.device="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            int r0 = r10.getDevice()     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; jidFromDb.type="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            int r0 = r10.getType()     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; jidFromDb.raw_string="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "; matchingJid="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            boolean r0 = r8.equals(r10)     // Catch:{ all -> 0x0253 }
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0253 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0253 }
            boolean r0 = r8.equals(r10)     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x0225
            goto L_0x0226
        L_0x01d4:
            int r0 = r11.getInt(r15)     // Catch:{ all -> 0x0253 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0253 }
            goto L_0x013d
        L_0x01de:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0253 }
            r5.<init>()     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed, but jid not found by row_id; jid="
            r5.append(r0)     // Catch:{ all -> 0x0253 }
            r5.append(r8)     // Catch:{ all -> 0x0253 }
            r5.append(r9)     // Catch:{ all -> 0x0253 }
            r5.append(r3)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0253 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r9 = "raw_string = ?"
            r5 = 1
            java.lang.String[] r4 = new java.lang.String[r5]     // Catch:{ all -> 0x0253 }
            java.lang.String r3 = r8.getRawString()     // Catch:{ all -> 0x0253 }
            r0 = 0
            r4[r0] = r3     // Catch:{ all -> 0x0253 }
            java.lang.String r3 = "getRowIdForJid/DELETE_JID_ON_MISMATCH"
            r0 = r22
            r15.A04(r0, r9, r3, r4)     // Catch:{ all -> 0x0253 }
            r3 = r1
            goto L_0x0227
        L_0x020d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0253 }
            r3.<init>()     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed, but jid not found by raw_string; jid="
            r3.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0253 }
            r3.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0253 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0253 }
        L_0x0225:
            r3 = r1
        L_0x0226:
            r5 = 0
        L_0x0227:
            r11.close()     // Catch:{ all -> 0x02a2 }
            if (r5 != 0) goto L_0x0251
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0250
            X.190 r5 = r7.A00     // Catch:{ all -> 0x02a2 }
            java.lang.String r2 = "JidStore/raw_string-constraint-failed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a2 }
            r1.<init>()     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "jid found by raws string; jid="
            r1.append(r0)     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x02a2 }
            r1.append(r0)     // Catch:{ all -> 0x02a2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02a2 }
            r0 = 0
            r5.A0G(r2, r1, r0)     // Catch:{ all -> 0x02a2 }
            goto L_0x0251
        L_0x0250:
            throw r17     // Catch:{ all -> 0x02a2 }
        L_0x0251:
            r1 = r3
            goto L_0x025f
        L_0x0253:
            r1 = move-exception
            if (r11 == 0) goto L_0x025e
            r11.close()     // Catch:{ all -> 0x025a }
            goto L_0x025e
        L_0x025a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x02a2 }
        L_0x025e:
            throw r1     // Catch:{ all -> 0x02a2 }
        L_0x025f:
            r18.A00()     // Catch:{ all -> 0x02a2 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x028d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a2 }
            r3.<init>()     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "JidStore/getRowIdForJid/Error inserting jid; jid="
            r3.append(r0)     // Catch:{ all -> 0x02a2 }
            r3.append(r8)     // Catch:{ all -> 0x02a2 }
            r0 = r19
            r3.append(r0)     // Catch:{ all -> 0x02a2 }
            r3.append(r1)     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x02a2 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02a2 }
            r18.close()     // Catch:{ all -> 0x02ac }
            r6.close()
            r0 = -1
            return r0
        L_0x028d:
            r12 = 10
            X.3C3 r0 = new X.3C3     // Catch:{ all -> 0x02a2 }
            r9 = r0
            r10 = r7
            r11 = r8
            r13 = r1
            r9.<init>(r10, r11, r12, r13)     // Catch:{ all -> 0x02a2 }
            r6.BJ7(r0)     // Catch:{ all -> 0x02a2 }
            r18.close()     // Catch:{ all -> 0x02ac }
        L_0x029e:
            r6.close()
            return r1
        L_0x02a2:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x02a7 }
            goto L_0x02ab
        L_0x02a7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x02ac }
        L_0x02ab:
            throw r1     // Catch:{ all -> 0x02ac }
        L_0x02ac:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x02b1 }
            throw r1
        L_0x02b1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DL.A09(com.whatsapp.jid.Jid):long");
    }

    public Jid A0B(long j) {
        Cursor A0A;
        long j2 = j;
        if (j <= 0) {
            return null;
        }
        Map map = this.A03;
        Long valueOf = Long.valueOf(j2);
        if (map.containsKey(valueOf)) {
            return (Jid) map.get(valueOf);
        }
        C28781at A04 = this.A01.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?", "GET_JID_BY_ROW_ID_SQL", new String[]{Long.toString(j2)});
            if (A0A.moveToLast()) {
                Jid A0C = A0C(A0A, A04, A0A.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER), A0A.getColumnIndexOrThrow("server"), A0A.getColumnIndexOrThrow("agent"), A0A.getColumnIndexOrThrow("device"), A0A.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), A0A.getColumnIndexOrThrow("raw_string"), j2);
                A0A.close();
                A04.close();
                return A0C;
            }
            A0A.close();
            A04.close();
            return null;
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

    public Jid A0C(Cursor cursor, C28781at r14, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        long j2 = j;
        if (j <= 0) {
            return null;
        }
        Map map = this.A03;
        Long valueOf = Long.valueOf(j2);
        if (map.containsKey(valueOf)) {
            return (Jid) map.get(valueOf);
        }
        Jid A032 = A03(cursor, i, i2, i3, i4, i5, i6);
        if (A032 == null) {
            return A032;
        }
        if (((C28801av) r14).A02.A00.inTransaction()) {
            r14.BJ7(new AnonymousClass3C3(this, A032, 7, j2));
            return A032;
        }
        A07(this, A032, j2);
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r5.A03.containsKey(java.lang.Long.valueOf(r7)) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.jid.Jid A0E(java.lang.Class r6, long r7) {
        /*
            r5 = this;
            r1 = 0
            r3 = 1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0014
            java.util.Map r1 = r5.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            boolean r0 = r1.containsKey(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r4 = 0
        L_0x0015:
            com.whatsapp.jid.Jid r0 = r5.A0B(r7)     // Catch:{ ClassCastException -> 0x0020 }
            java.lang.Object r0 = r6.cast(r0)     // Catch:{ ClassCastException -> 0x0020 }
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0     // Catch:{ ClassCastException -> 0x0020 }
            return r0
        L_0x0020:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "JidStore/readJidByRowId/jid wrong class; rowId="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; db_data="
            r1.append(r0)
            java.lang.String r0 = r5.A05(r7)
            r1.append(r0)
            java.lang.String r0 = "; isJidInCache="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            X.190 r2 = r5.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "invalid-jid-in-store-isJidInCache:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "JidStore/readJidByRowId"
            r2.A0G(r0, r1, r3)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DL.A0E(java.lang.Class, long):com.whatsapp.jid.Jid");
    }

    public HashMap A0F(Class cls, Collection collection) {
        Class cls2;
        Cursor A0A;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            cls2 = cls;
            if (!it.hasNext()) {
                break;
            }
            Number number = (Number) it.next();
            long longValue = number.longValue();
            if (this.A03.containsKey(number)) {
                hashMap.put(number, A0E(cls2, longValue));
            } else {
                arrayList.add(Long.toString(longValue));
            }
        }
        C443423b r1 = new C443423b(arrayList.toArray(C19620yd.A0M), 975);
        C28781at A04 = this.A01.get();
        try {
            Iterator it2 = r1.iterator();
            while (it2.hasNext()) {
                String[] strArr = (String[]) it2.next();
                C23141Ev r4 = ((C28801av) A04).A02;
                int length = strArr.length;
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT _id, user, server, agent, device, type, raw_string FROM jid WHERE _id IN ");
                sb.append(AnonymousClass1H2.A00(length));
                A0A = r4.A0A(sb.toString(), "GET_JIDS_BY_ROW_IDS_SQL", strArr);
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                int columnIndexOrThrow3 = A0A.getColumnIndexOrThrow("server");
                int columnIndexOrThrow4 = A0A.getColumnIndexOrThrow("agent");
                int columnIndexOrThrow5 = A0A.getColumnIndexOrThrow("device");
                int columnIndexOrThrow6 = A0A.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                int columnIndexOrThrow7 = A0A.getColumnIndexOrThrow("raw_string");
                while (A0A.moveToNext()) {
                    long j = A0A.getLong(columnIndexOrThrow);
                    hashMap.put(Long.valueOf(j), A0D(A0A, A04, cls2, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6, columnIndexOrThrow7, j));
                }
                A0A.close();
            }
            A04.close();
            for (Object next : collection) {
                if (!hashMap.containsKey(next)) {
                    hashMap.put(next, (Object) null);
                }
            }
            return hashMap;
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

    public AnonymousClass1DL(AnonymousClass190 r2, AnonymousClass1Cd r3) {
        this.A00 = r2;
        this.A01 = r3;
    }

    public static long A02(Jid jid, AnonymousClass00H r2) {
        return ((AnonymousClass1DL) r2.get()).A09(jid);
    }

    public static Jid A03(Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        String A06 = A06(cursor, i);
        String A062 = A06(cursor, i2);
        int i8 = cursor.getInt(i3);
        if (cursor.isNull(i4)) {
            i7 = 0;
        } else {
            i7 = cursor.getInt(i4);
        }
        int i9 = cursor.getInt(i5);
        String A063 = A06(cursor, i6);
        try {
            C22911Dt r0 = Jid.Companion;
            Jid A002 = C22911Dt.A00(A063);
            if (i9 == 0) {
                if (A002 instanceof DeviceJid) {
                    A002 = ((DeviceJid) A002).userJid;
                }
            } else if (i9 == 17 && C22971Dz.A0d(A002)) {
                A002 = DeviceJid.Companion.A02(A002);
                C17960vV.A07(A002);
            }
            if (AnonymousClass1EG.A0I(A06, A002.user) && AnonymousClass1EG.A0I(A062, A002.getServer()) && i8 == A002.getAgent() && i7 == A002.getDevice() && i9 == A002.getType()) {
                return A002;
            }
            A08("jidstore/readjidfromcursor/cursormismatch", A06, A062, A063, i8, i7, i9);
            return null;
        } catch (AnonymousClass11T unused) {
            if (i9 == 11 && TextUtils.isEmpty(A06) && TextUtils.isEmpty(A062) && i8 == 0 && i7 == 0 && TextUtils.isEmpty(A063)) {
                return AnonymousClass1E5.A00;
            }
            A08("jidstore/readjidfromcursor/invalidjid", A06, A062, A063, i8, i7, i9);
            return null;
        }
    }

    public static Long A04(AnonymousClass1DL r0, Jid jid) {
        return Long.valueOf(r0.A09(jid));
    }
}
