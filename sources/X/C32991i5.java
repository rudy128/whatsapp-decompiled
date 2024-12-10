package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1i5  reason: invalid class name and case insensitive filesystem */
public final class C32991i5 {
    public final C26031Qo A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1DL A03;
    public final AnonymousClass1Cd A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public C32991i5(C26031Qo r2, AnonymousClass1LW r3, AnonymousClass1CJ r4, AnonymousClass1DL r5, AnonymousClass1Cd r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r2, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r6, 6);
        C18070vi.A0d(r8, 7);
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A05 = r7;
        this.A04 = r6;
        this.A06 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.ContentValues r10, X.C46162Dk r11, X.C32991i5 r12) {
        /*
            r3 = 0
            X.1Cd r0 = r12.A04     // Catch:{ all -> 0x002c }
            X.1au r2 = r0.A05()     // Catch:{ all -> 0x002c }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0025 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0025 }
            java.lang.String r6 = "newsletter"
            java.lang.String r7 = "chat_row_id = ?"
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0025 }
            long r0 = r11.A0D     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0025 }
            r9[r3] = r0     // Catch:{ all -> 0x0025 }
            java.lang.String r8 = "NewsletterStore/UPDATE_MEMBERSHIP_NEWSLETTER_INFO"
            r5 = r10
            r4.A02(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ all -> 0x002c }
            return
        L_0x0025:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x002c }
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            X.C30691eM.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32991i5.A01(android.content.ContentValues, X.2Dk, X.1i5):void");
    }

    public final int A02(C29691ci r5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Long.valueOf(r5.A0Y));
        contentValues.put("last_read_message_sort_id", Long.valueOf(r5.A0S));
        contentValues.put("display_message_sort_id", Long.valueOf(r5.A0X));
        contentValues.put("last_message_sort_id", Long.valueOf(r5.A0Q));
        contentValues.put("last_read_receipt_sent_message_sort_id", Long.valueOf(r5.A0U));
        contentValues.put("last_read_message_row_id", Long.valueOf(r5.A0R));
        contentValues.put("display_message_row_id", Long.valueOf(r5.A0W));
        contentValues.put("last_message_row_id", Long.valueOf(r5.A0P));
        contentValues.put("last_read_receipt_sent_message_row_id", Long.valueOf(r5.A0T));
        contentValues.put("sort_timestamp", Long.valueOf(r5.A0Z));
        contentValues.put("unseen_message_count", Integer.valueOf(r5.A0A));
        try {
            return this.A01.A05(contentValues, r5);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C46162Dk A03(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            r5 = 0
            X.1Cd r0 = r7.A04     // Catch:{ all -> 0x0036 }
            X.1at r4 = r0.get()     // Catch:{ all -> 0x0036 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x002f }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x002f }
            java.lang.String r2 = "SELECT * FROM newsletter JOIN chat_view ON chat_row_id = _id WHERE invite_code = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x002f }
            r1[r6] = r8     // Catch:{ all -> 0x002f }
            java.lang.String r0 = "NewsletterStore/GET_NEWSLETTER_BY_CODE"
            android.database.Cursor r3 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x002f }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x002f }
            java.util.ArrayList r2 = A00(r3, r7)     // Catch:{ all -> 0x0028 }
            r3.close()     // Catch:{ all -> 0x002f }
            r4.close()     // Catch:{ all -> 0x0036 }
            goto L_0x003c
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            X.1IU r2 = new X.1IU
            r2.<init>(r0)
        L_0x003c:
            java.lang.Throwable r1 = X.C30671eK.A00(r2)
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "NewsletterStore/failed to read newsletter"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0047:
            X.0wS r1 = X.C18460wS.A00
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x004e
            r2 = r1
        L_0x004e:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0 = 10
            int r0 = X.C29351c6.A0C(r2, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x005f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r1 = r2.next()
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1CJ r0 = r7.A02
            X.1ci r1 = r0.A0A(r1)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 != 0) goto L_0x0076
            r1 = r5
        L_0x0076:
            r3.add(r1)
            goto L_0x005f
        L_0x007a:
            java.lang.Object r0 = X.C29431cG.A0c(r3)
            X.2Dk r0 = (X.C46162Dk) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32991i5.A03(java.lang.String):X.2Dk");
    }

    public final synchronized AnonymousClass1D6 A06(C29681ch r8, String str) {
        AnonymousClass1D6 r2;
        C18070vi.A0d(r8, 0);
        AnonymousClass1CJ r6 = this.A02;
        C29691ci A002 = AnonymousClass1CJ.A00(r6, r8);
        if (A002 != null) {
            long j = A002.A0Y;
            if (j != -1) {
                r2 = new AnonymousClass1D6(A002, Long.valueOf(j));
            }
        }
        r6.A0L(r8);
        long A09 = this.A01.A09(r8);
        C29691ci r1 = new C29691ci((AnonymousClass1BI) r8);
        r1.A0Y = A09;
        r1.A0k = str;
        r1.A03 = 4;
        r2 = new AnonymousClass1D6(r1, Long.valueOf(A09));
        return r2;
    }

    public final void A08(C29681ch r5, int i) {
        C46162Dk r3;
        C18070vi.A0d(r5, 0);
        C29691ci A002 = AnonymousClass1CJ.A00(this.A02, r5);
        if (!(A002 instanceof C46162Dk) || (r3 = (C46162Dk) A002) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("NewsletterStore/failed to find newsletter in chatsCache for ");
            sb.append(r5);
            Log.e(sb.toString());
            this.A00.A00(C80533xK.A00, (String) null);
            return;
        }
        r3.A01 = i;
        ContentValues contentValues = new ContentValues();
        contentValues.put("show_enforced_update_banner", Integer.valueOf(r3.A01));
        A01(contentValues, r3, this);
    }

    public final void A09(C29681ch r5, boolean z) {
        C46162Dk r3;
        C18070vi.A0d(r5, 0);
        C29691ci A002 = AnonymousClass1CJ.A00(this.A02, r5);
        if ((A002 instanceof C46162Dk) && (r3 = (C46162Dk) A002) != null) {
            r3.A0B = z;
            ContentValues contentValues = new ContentValues();
            contentValues.put("muted", Boolean.valueOf(r3.A0B));
            A01(contentValues, r3, this);
        }
    }

    public static final ArrayList A00(Cursor cursor, C32991i5 r6) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("chat_row_id");
        ArrayList arrayList = new ArrayList(cursor.getCount());
        cursor.moveToPosition(-1);
        if ((cursor.isBeforeFirst() && !cursor.moveToFirst()) || cursor.isAfterLast()) {
            return arrayList;
        }
        do {
            AnonymousClass1BI A0B = r6.A01.A0B(cursor.getLong(columnIndexOrThrow));
            if ((A0B instanceof C29681ch) && A0B != null) {
                arrayList.add(A0B);
            }
        } while (cursor.moveToNext());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03e0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        X.CDX.A00(r50, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03e6, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02d5, code lost:
        r1 = r2.getInt(r28);
        r7 = X.AnonymousClass9IW.A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02e5, code lost:
        if (r7.hasNext() == false) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02e7, code lost:
        r4 = (X.AnonymousClass9IW) r7.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02ef, code lost:
        if (r4.value != r1) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02f1, code lost:
        r97 = X.AnonymousClass24X.A01(r2, r26);
        r79 = new java.util.ArrayList();
        r98 = X.AnonymousClass24X.A01(r2, r25);
        r7 = r2.getInt(r24);
        r10 = X.C179459Ia.A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0312, code lost:
        if (r10.hasNext() == false) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0314, code lost:
        r1 = (X.C179459Ia) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x031c, code lost:
        if (r1.value != r7) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x031e, code lost:
        r99 = X.AnonymousClass24X.A01(r2, r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0328, code lost:
        if (r2.isNull(r15) == false) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x032f, code lost:
        r71 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0332, code lost:
        r71 = java.lang.Long.valueOf(r2.getLong(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x033a, code lost:
        r81 = r2.getInt(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0340, code lost:
        if (r16 == null) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0342, code lost:
        r17 = r16.intValue();
        r0 = X.C49462Qo.A00;
        r11 = new java.util.ArrayList();
        r16 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0355, code lost:
        if (r16.hasNext() == false) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0357, code lost:
        r7 = r16.next();
        r0 = ((X.C49462Qo) r7).value;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0362, code lost:
        if ((r0 & r17) != r0) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0364, code lost:
        r11.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0368, code lost:
        r80 = X.C29431cG.A12(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x036d, code lost:
        r80 = X.C25511Om.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x036f, code lost:
        r59 = new X.C46162Dk(r60, r3, r62, r5, r64, r6, r1, r4, X.AnonymousClass9QK.A00(r18), (X.AnonymousClass206) null, X.AnonymousClass00R.A00, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r100, r85, r87, r89, r91, r93, r95, r97, r98, r99);
        r3 = ((X.C53342cN) r9.A06.get()).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x039e, code lost:
        if (((X.AnonymousClass1c4) r3.get()).A08() == false) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x03a0, code lost:
        r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x03a3, code lost:
        r8.add(r59);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x03a8, code lost:
        r1 = new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x03c8, code lost:
        r1 = new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03dd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A04() {
        /*
            r102 = this;
            r9 = r102
            X.00H r0 = r9.A05
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x03ed
            X.1Cd r0 = r9.A04     // Catch:{ all -> 0x03e7 }
            X.1at r50 = r0.get()     // Catch:{ all -> 0x03e7 }
            r0 = r50
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x03de }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x03de }
            java.lang.String r2 = "SELECT * FROM newsletter JOIN chat_view ON chat_row_id = _id"
            java.lang.String r1 = "NewsletterStore/GET_NEWSLETTER_SQL"
            r57 = 0
            r0 = r57
            android.database.Cursor r2 = r3.A0A(r2, r1, r0)     // Catch:{ all -> 0x03de }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x03de }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x03d7 }
            r8.<init>()     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "_id"
            int r58 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "jid_row_id"
            int r56 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "subject"
            int r55 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "last_read_message_sort_id"
            int r54 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "display_message_sort_id"
            int r53 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "last_message_sort_id"
            int r52 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "last_read_receipt_sent_message_sort_id"
            int r51 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "last_read_message_row_id"
            int r49 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "display_message_row_id"
            int r48 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "last_message_row_id"
            int r47 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "last_read_receipt_sent_message_row_id"
            int r46 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "sort_timestamp"
            int r45 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "unseen_message_count"
            int r44 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "group_type"
            int r43 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "created_timestamp"
            int r42 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "name"
            int r41 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "name_id"
            int r40 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "description"
            int r39 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "description_id"
            int r38 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "picture_url"
            int r37 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "picture_id"
            int r36 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "preview_url"
            int r35 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "preview_id"
            int r34 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "invite_code"
            int r33 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "handle"
            int r32 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "subscribers_count"
            int r31 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "membership"
            int r30 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "privacy"
            int r29 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "verified"
            int r28 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "verification_source"
            int r27 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "muted"
            int r26 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "oldest_message_retrieved"
            int r25 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "suspended"
            int r24 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "deleted"
            int r23 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "reaction_setting"
            int r22 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "reaction_setting_blocklist"
            int r21 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "reaction_setting_update_ts"
            int r15 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "show_enforced_update_banner"
            int r20 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "admin_count"
            int r19 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "capabilities"
            int r14 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "wamo_sub_plan_id"
            int r13 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.String r0 = "wamo_sub_status"
            int r12 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d7 }
        L_0x0136:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x03d0
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x03d7 }
            X.1DL r3 = r9.A03     // Catch:{ all -> 0x03d7 }
            r0 = r56
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            com.whatsapp.jid.Jid r0 = r3.A0B(r0)     // Catch:{ all -> 0x03d7 }
            X.1BI r0 = X.C22931Dv.A00(r0)     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x03c0
            X.1ci r3 = new X.1ci     // Catch:{ all -> 0x03d7 }
            r3.<init>((X.AnonymousClass1BI) r0)     // Catch:{ all -> 0x03d7 }
            r0 = r58
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0Y = r0     // Catch:{ all -> 0x03d7 }
            r0 = r55
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0k = r0     // Catch:{ all -> 0x03d7 }
            r0 = r54
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0S = r0     // Catch:{ all -> 0x03d7 }
            r0 = r53
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0X = r0     // Catch:{ all -> 0x03d7 }
            r0 = r52
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0Q = r0     // Catch:{ all -> 0x03d7 }
            r0 = r51
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0U = r0     // Catch:{ all -> 0x03d7 }
            r0 = r49
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0R = r0     // Catch:{ all -> 0x03d7 }
            r0 = r48
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0W = r0     // Catch:{ all -> 0x03d7 }
            r0 = r47
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0P = r0     // Catch:{ all -> 0x03d7 }
            r0 = r46
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0T = r0     // Catch:{ all -> 0x03d7 }
            r0 = r45
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0Z = r0     // Catch:{ all -> 0x03d7 }
            r0 = r44
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x03d7 }
            r3.A0A = r0     // Catch:{ all -> 0x03d7 }
            r0 = r43
            int r4 = r2.getInt(r0)     // Catch:{ all -> 0x03d7 }
            r3.A03 = r4     // Catch:{ all -> 0x03d7 }
            r1 = 4
            r0 = 0
            if (r4 != r1) goto L_0x01c2
            r0 = 1
        L_0x01c2:
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r41
            java.lang.String r73 = r2.getString(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r22
            boolean r0 = r2.isNull(r0)     // Catch:{ all -> 0x03d7 }
            if (r0 != 0) goto L_0x0219
            r0 = r22
            int r4 = r2.getInt(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x0219
            X.0z2 r0 = X.C179519Ih.A00     // Catch:{ all -> 0x03d7 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x03d7 }
        L_0x01e5:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x03b8
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x03d7 }
            X.9Ih r5 = (X.C179519Ih) r5     // Catch:{ all -> 0x03d7 }
            int r0 = r5.value     // Catch:{ all -> 0x03d7 }
            if (r0 != r4) goto L_0x01e5
        L_0x01f5:
            r0 = r27
            boolean r1 = r2.isNull(r0)     // Catch:{ all -> 0x03d7 }
            r0 = 0
            if (r1 != 0) goto L_0x0208
            r0 = r27
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x03d7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03d7 }
        L_0x0208:
            X.9IZ r64 = X.AnonymousClass9QJ.A00(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r19
            int r82 = r2.getInt(r0)     // Catch:{ all -> 0x03d7 }
            boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x021f
            goto L_0x021c
        L_0x0219:
            X.9Ih r5 = X.C179519Ih.DEFAULT     // Catch:{ all -> 0x03d7 }
            goto L_0x01f5
        L_0x021c:
            r16 = 0
            goto L_0x0227
        L_0x021f:
            int r0 = r2.getInt(r14)     // Catch:{ all -> 0x03d7 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03d7 }
        L_0x0227:
            boolean r0 = r2.isNull(r13)     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x0230
            r72 = 0
            goto L_0x0238
        L_0x0230:
            long r0 = r2.getLong(r13)     // Catch:{ all -> 0x03d7 }
            java.lang.Long r72 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x03d7 }
        L_0x0238:
            boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x0241
            r18 = 0
            goto L_0x0249
        L_0x0241:
            int r0 = r2.getInt(r12)     // Catch:{ all -> 0x03d7 }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03d7 }
        L_0x0249:
            r0 = r21
            boolean r0 = r2.isNull(r0)     // Catch:{ all -> 0x03d7 }
            if (r0 != 0) goto L_0x032b
            r0 = r21
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x03d7 }
            if (r4 == 0) goto L_0x032b
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x03d7 }
            r0 = 0
            java.lang.String r6 = ","
            r1[r0] = r6     // Catch:{ all -> 0x03d7 }
            java.util.List r0 = X.AnonymousClass1YF.A0S(r4, r1, r0)     // Catch:{ all -> 0x03d7 }
            X.1IX r60 = X.AnonymousClass1IX.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x03d7 }
        L_0x0269:
            long r0 = r3.A0Y     // Catch:{ all -> 0x03d7 }
            r100 = r0
            r0 = r40
            long r85 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r39
            java.lang.String r74 = r2.getString(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r38
            long r87 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r37
            java.lang.String r75 = r2.getString(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r36
            long r89 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r35
            java.lang.String r76 = r2.getString(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r34
            long r91 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r42
            long r93 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r32
            java.lang.String r77 = r2.getString(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r33
            java.lang.String r78 = r2.getString(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r31
            long r95 = r2.getLong(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r30
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x03d7 }
            X.9Ig r62 = X.AnonymousClass9QH.A00(r0)     // Catch:{ all -> 0x03d7 }
            r0 = r29
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x03d7 }
            X.0z2 r0 = X.AnonymousClass9IR.A00     // Catch:{ all -> 0x03d7 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x03d7 }
        L_0x02c5:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x03b0
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x03d7 }
            X.9IR r6 = (X.AnonymousClass9IR) r6     // Catch:{ all -> 0x03d7 }
            int r0 = r6.value     // Catch:{ all -> 0x03d7 }
            if (r0 != r1) goto L_0x02c5
            r0 = r28
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x03d7 }
            X.0z2 r0 = X.AnonymousClass9IW.A00     // Catch:{ all -> 0x03d7 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x03d7 }
        L_0x02e1:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x03c8
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x03d7 }
            X.9IW r4 = (X.AnonymousClass9IW) r4     // Catch:{ all -> 0x03d7 }
            int r0 = r4.value     // Catch:{ all -> 0x03d7 }
            if (r0 != r1) goto L_0x02e1
            r0 = r26
            boolean r97 = X.AnonymousClass24X.A01(r2, r0)     // Catch:{ all -> 0x03d7 }
            java.util.ArrayList r79 = new java.util.ArrayList     // Catch:{ all -> 0x03d7 }
            r79.<init>()     // Catch:{ all -> 0x03d7 }
            r0 = r25
            boolean r98 = X.AnonymousClass24X.A01(r2, r0)     // Catch:{ all -> 0x03d7 }
            r0 = r24
            int r7 = r2.getInt(r0)     // Catch:{ all -> 0x03d7 }
            X.0z2 r0 = X.C179459Ia.A00     // Catch:{ all -> 0x03d7 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x03d7 }
        L_0x030e:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x03a8
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x03d7 }
            X.9Ia r1 = (X.C179459Ia) r1     // Catch:{ all -> 0x03d7 }
            int r0 = r1.value     // Catch:{ all -> 0x03d7 }
            if (r0 != r7) goto L_0x030e
            r0 = r23
            boolean r99 = X.AnonymousClass24X.A01(r2, r0)     // Catch:{ all -> 0x03d7 }
            boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x0332
            goto L_0x032f
        L_0x032b:
            r60 = 0
            goto L_0x0269
        L_0x032f:
            r71 = 0
            goto L_0x033a
        L_0x0332:
            long r10 = r2.getLong(r15)     // Catch:{ all -> 0x03d7 }
            java.lang.Long r71 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x03d7 }
        L_0x033a:
            r0 = r20
            int r81 = r2.getInt(r0)     // Catch:{ all -> 0x03d7 }
            if (r16 == 0) goto L_0x036d
            int r17 = r16.intValue()     // Catch:{ all -> 0x03d7 }
            X.0z2 r0 = X.C49462Qo.A00     // Catch:{ all -> 0x03d7 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x03d7 }
            r11.<init>()     // Catch:{ all -> 0x03d7 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x03d7 }
        L_0x0351:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03d7 }
            if (r0 == 0) goto L_0x0368
            java.lang.Object r7 = r16.next()     // Catch:{ all -> 0x03d7 }
            r0 = r7
            X.2Qo r0 = (X.C49462Qo) r0     // Catch:{ all -> 0x03d7 }
            int r0 = r0.value     // Catch:{ all -> 0x03d7 }
            r10 = r0 & r17
            if (r10 != r0) goto L_0x0351
            r11.add(r7)     // Catch:{ all -> 0x03d7 }
            goto L_0x0351
        L_0x0368:
            java.util.Set r80 = X.C29431cG.A12(r11)     // Catch:{ all -> 0x03d7 }
            goto L_0x036f
        L_0x036d:
            X.1Om r80 = X.C25511Om.A00     // Catch:{ all -> 0x03d7 }
        L_0x036f:
            X.9Ib r68 = X.AnonymousClass9QK.A00(r18)     // Catch:{ all -> 0x03d7 }
            java.lang.Integer r70 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x03d7 }
            X.2Dk r0 = new X.2Dk     // Catch:{ all -> 0x03d7 }
            r59 = r0
            r61 = r3
            r63 = r5
            r65 = r6
            r66 = r1
            r67 = r4
            r69 = r57
            r83 = r100
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r85, r87, r89, r91, r93, r95, r97, r98, r99)     // Catch:{ all -> 0x03d7 }
            X.00H r1 = r9.A06     // Catch:{ all -> 0x03d7 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x03d7 }
            X.2cN r1 = (X.C53342cN) r1     // Catch:{ all -> 0x03d7 }
            X.00H r3 = r1.A01     // Catch:{ all -> 0x03d7 }
            java.lang.Object r1 = r3.get()     // Catch:{ all -> 0x03d7 }
            X.1c4 r1 = (X.AnonymousClass1c4) r1     // Catch:{ all -> 0x03d7 }
            boolean r1 = r1.A08()     // Catch:{ all -> 0x03d7 }
            if (r1 == 0) goto L_0x03a3
            r3.get()     // Catch:{ all -> 0x03d7 }
        L_0x03a3:
            r8.add(r0)     // Catch:{ all -> 0x03d7 }
            goto L_0x0136
        L_0x03a8:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ all -> 0x03d7 }
            r1.<init>(r0)     // Catch:{ all -> 0x03d7 }
            goto L_0x03cf
        L_0x03b0:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ all -> 0x03d7 }
            r1.<init>(r0)     // Catch:{ all -> 0x03d7 }
            goto L_0x03cf
        L_0x03b8:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ all -> 0x03d7 }
            r1.<init>(r0)     // Catch:{ all -> 0x03d7 }
            goto L_0x03cf
        L_0x03c0:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03d7 }
            r1.<init>(r0)     // Catch:{ all -> 0x03d7 }
            goto L_0x03cf
        L_0x03c8:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ all -> 0x03d7 }
            r1.<init>(r0)     // Catch:{ all -> 0x03d7 }
        L_0x03cf:
            throw r1     // Catch:{ all -> 0x03d7 }
        L_0x03d0:
            r2.close()     // Catch:{ all -> 0x03de }
            r50.close()     // Catch:{ all -> 0x03e7 }
            return r8
        L_0x03d7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03d9 }
        L_0x03d9:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x03de }
            throw r0     // Catch:{ all -> 0x03de }
        L_0x03de:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x03e0 }
        L_0x03e0:
            r1 = move-exception
            r0 = r50
            X.CDX.A00(r0, r2)     // Catch:{ all -> 0x03e7 }
            throw r1     // Catch:{ all -> 0x03e7 }
        L_0x03e7:
            r1 = move-exception
            java.lang.String r0 = "NewsletterStore/failed to read newsletter"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03ed:
            X.0wS r8 = X.C18460wS.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32991i5.A04():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A05() {
        /*
            r7 = this;
            X.00H r0 = r7.A05
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x0078
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x0072 }
            X.9Ig r0 = X.C179509Ig.ADMIN     // Catch:{ all -> 0x0072 }
            int r0 = r0.value     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0072 }
            r0 = 0
            r6[r0] = r1     // Catch:{ all -> 0x0072 }
            X.9Ig r0 = X.C179509Ig.OWNER     // Catch:{ all -> 0x0072 }
            int r0 = r0.value     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0072 }
            r0 = 1
            r6[r0] = r1     // Catch:{ all -> 0x0072 }
            X.1Cd r0 = r7.A04     // Catch:{ all -> 0x0072 }
            X.1at r4 = r0.get()     // Catch:{ all -> 0x0072 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x006b }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x006b }
            r1 = 2
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "SELECT chat_row_id FROM newsletter WHERE membership IN ("
            r3.append(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "?"
            java.util.List r2 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x006b }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = ","
            r0 = 0
            java.lang.String r0 = X.C29431cG.A0h(r1, r2, r0)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = X.C17900vP.A0B(r0, r3)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "NewsletterStore/GET_NEWSLETTER_JID_WITH_MEMBERSHIP_SQL"
            android.database.Cursor r2 = r5.A0A(r1, r0, r6)     // Catch:{ all -> 0x006b }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x006b }
            java.util.ArrayList r0 = A00(r2, r7)     // Catch:{ all -> 0x0064 }
            r2.close()     // Catch:{ all -> 0x006b }
            r4.close()     // Catch:{ all -> 0x0072 }
            return r0
        L_0x0064:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r1 = move-exception
            java.lang.String r0 = "NewsletterStore/failed to fetch admin newsletter jids"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0078:
            X.0wS r0 = X.C18460wS.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32991i5.A05():java.util.List");
    }

    public final void A07(C179509Ig r5, C29681ch r6) {
        C46162Dk r3;
        C29691ci A0A = this.A02.A0A(r6);
        if ((A0A instanceof C46162Dk) && (r3 = (C46162Dk) A0A) != null) {
            r3.A02 = r5;
            ContentValues contentValues = new ContentValues();
            contentValues.put("membership", Integer.valueOf(r3.A02.value));
            A01(contentValues, r3, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0368, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x036c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x036f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0373, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0393, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0397, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x039a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        X.CDX.A00(r19, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03a0, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.CDX.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02ee, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x032f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0333, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0336, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x033a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.util.List r24) {
        /*
            r23 = this;
            r7 = r23
            X.1Cd r0 = r7.A04     // Catch:{ all -> 0x03a1 }
            r22 = r0
            X.1au r19 = r22.A05()     // Catch:{ all -> 0x03a1 }
            X.1xA r9 = r19.BD0()     // Catch:{ all -> 0x0398 }
            java.util.Iterator r18 = r24.iterator()     // Catch:{ all -> 0x0391 }
        L_0x0012:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0391 }
            if (r0 == 0) goto L_0x0387
            java.lang.Object r6 = r18.next()     // Catch:{ all -> 0x0391 }
            X.2Dk r6 = (X.C46162Dk) r6     // Catch:{ all -> 0x0391 }
            r0 = 0
            X.C18070vi.A0d(r6, r0)     // Catch:{ all -> 0x0391 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0391 }
            r5.<init>()     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0D     // Catch:{ all -> 0x0391 }
            r20 = r0
            java.lang.Long r4 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "_id"
            r5.put(r0, r4)     // Catch:{ all -> 0x0391 }
            X.1DL r1 = r7.A03     // Catch:{ all -> 0x0391 }
            X.1BI r0 = r6.A08()     // Catch:{ all -> 0x0391 }
            long r0 = r1.A09(r0)     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "jid_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "subject"
            java.lang.String r8 = r6.A0T     // Catch:{ all -> 0x0391 }
            r5.put(r0, r8)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0S     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "last_read_message_sort_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0X     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "display_message_sort_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0Q     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "last_message_sort_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0U     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "last_read_receipt_sent_message_sort_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0R     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "last_read_message_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0W     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "display_message_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0P     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "last_message_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0T     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "last_read_receipt_sent_message_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0Z     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "sort_timestamp"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            int r0 = r6.A0A     // Catch:{ all -> 0x0391 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "unseen_message_count"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            int r0 = r6.A03     // Catch:{ all -> 0x0391 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "group_type"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "hidden"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0E     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "created_timestamp"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "chat_encryption_state"
            r5.put(r0, r1)     // Catch:{ all -> 0x0391 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0391 }
            r3.<init>()     // Catch:{ all -> 0x0391 }
            java.lang.String r2 = "chat_row_id"
            r3.put(r2, r4)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "name"
            r3.put(r0, r8)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0H     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "name_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            java.lang.String r1 = r6.A0Q     // Catch:{ all -> 0x0391 }
            if (r1 != 0) goto L_0x0109
            java.lang.String r1 = ""
        L_0x0109:
            java.lang.String r0 = "description"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0F     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "description_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            java.lang.String r1 = "picture_url"
            java.lang.String r0 = r6.A0V     // Catch:{ all -> 0x0391 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0I     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "picture_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            java.lang.String r1 = "preview_url"
            java.lang.String r0 = r6.A0U     // Catch:{ all -> 0x0391 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0J     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "preview_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            java.lang.String r1 = "invite_code"
            java.lang.String r0 = r6.A0S     // Catch:{ all -> 0x0391 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r1 = "handle"
            java.lang.String r0 = r6.A0R     // Catch:{ all -> 0x0391 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0391 }
            long r0 = r6.A0G     // Catch:{ all -> 0x0391 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "subscribers_count"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            X.9Ig r0 = r6.A02     // Catch:{ all -> 0x0391 }
            int r0 = r0.value     // Catch:{ all -> 0x0391 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "membership"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            X.9IR r0 = r6.A0N     // Catch:{ all -> 0x0391 }
            int r0 = r0.value     // Catch:{ all -> 0x0391 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "privacy"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            X.9IW r0 = r6.A05     // Catch:{ all -> 0x0391 }
            int r0 = r0.value     // Catch:{ all -> 0x0391 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "verified"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            X.9IZ r0 = r6.A0M     // Catch:{ all -> 0x0391 }
            int r0 = r0.value     // Catch:{ all -> 0x0391 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "verification_source"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            X.9Ia r0 = r6.A04     // Catch:{ all -> 0x0391 }
            int r0 = r0.value     // Catch:{ all -> 0x0391 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "suspended"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            java.lang.String r1 = "muted"
            boolean r0 = r6.A0B     // Catch:{ all -> 0x0391 }
            X.C50072Ta.A00(r3, r1, r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r1 = "oldest_message_retrieved"
            boolean r0 = r6.A0C     // Catch:{ all -> 0x0391 }
            X.C50072Ta.A00(r3, r1, r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r1 = "deleted"
            boolean r0 = r6.A0A     // Catch:{ all -> 0x0391 }
            X.C50072Ta.A00(r3, r1, r0)     // Catch:{ all -> 0x0391 }
            int r0 = r6.A01     // Catch:{ all -> 0x0391 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "show_enforced_update_banner"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            X.9Ih r0 = r6.A03     // Catch:{ all -> 0x0391 }
            int r0 = r0.value     // Catch:{ all -> 0x0391 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "reaction_setting"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            X.1IX r10 = r6.A0K     // Catch:{ all -> 0x0391 }
            if (r10 != 0) goto L_0x01cf
            r1 = 0
            goto L_0x01d8
        L_0x01cf:
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r0 = ""
            java.lang.String r1 = X.C29431cG.A0g(r1, r0, r0, r10, r8)     // Catch:{ all -> 0x0391 }
        L_0x01d8:
            java.lang.String r0 = "reaction_setting_blocklist"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            java.lang.String r1 = "reaction_setting_update_ts"
            java.lang.Long r0 = r6.A0P     // Catch:{ all -> 0x0391 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0391 }
            int r0 = r6.A00     // Catch:{ all -> 0x0391 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "admin_count"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            java.util.Set r0 = r6.A09     // Catch:{ all -> 0x0391 }
            r8 = 0
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0391 }
        L_0x01f6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0391 }
            if (r0 == 0) goto L_0x0206
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0391 }
            X.2Qo r0 = (X.C49462Qo) r0     // Catch:{ all -> 0x0391 }
            int r0 = r0.value     // Catch:{ all -> 0x0391 }
            r8 = r8 | r0
            goto L_0x01f6
        L_0x0206:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "capabilities"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            java.lang.String r1 = "wamo_sub_plan_id"
            java.lang.Long r0 = r6.A08     // Catch:{ all -> 0x0391 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0391 }
            X.9Ib r0 = r6.A06     // Catch:{ all -> 0x0391 }
            int r0 = r0.value     // Catch:{ all -> 0x0391 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0391 }
            java.lang.String r0 = "wamo_sub_status"
            r3.put(r0, r1)     // Catch:{ all -> 0x0391 }
            X.1au r8 = r22.A05()     // Catch:{ all -> 0x0374 }
            X.1xA r10 = r8.BD0()     // Catch:{ all -> 0x036d }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0366 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x0366 }
            java.lang.String r11 = "newsletter"
            java.lang.String r1 = "NewsletterStore/INSERT_NEWSLETTER"
            r0 = 5
            long r14 = r12.A09(r11, r1, r3, r0)     // Catch:{ all -> 0x0366 }
            r12 = 0
            r11 = 0
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x024d
            X.1Qo r1 = r7.A00     // Catch:{ all -> 0x0366 }
            X.8oC r0 = X.AnonymousClass8oC.A00     // Catch:{ all -> 0x0366 }
            r1.A00(r0, r11)     // Catch:{ all -> 0x0366 }
        L_0x0249:
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x0366 }
            goto L_0x034b
        L_0x024d:
            X.1LW r1 = r7.A01     // Catch:{ all -> 0x0366 }
            X.1BI r3 = r6.A08()     // Catch:{ all -> 0x0366 }
            X.1Cd r0 = r1.A03     // Catch:{ all -> 0x0366 }
            X.1au r17 = r0.A05()     // Catch:{ all -> 0x0366 }
            X.1xA r16 = r17.BD1()     // Catch:{ all -> 0x035c }
            X.00H r0 = r1.A06     // Catch:{ all -> 0x0352 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0352 }
            X.30e r0 = (X.C676130e) r0     // Catch:{ all -> 0x0352 }
            boolean r0 = r0.A02(r5, r3)     // Catch:{ all -> 0x0352 }
            r14 = -1
            if (r0 != 0) goto L_0x0282
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0352 }
            r1.<init>()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "ChatStore/replaceIntoChatTable/failed to fill column values for chatJid="
            r1.append(r0)     // Catch:{ all -> 0x0352 }
            r1.append(r3)     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0352 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0352 }
            goto L_0x02ab
        L_0x0282:
            r0 = r17
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0352 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x0352 }
            java.lang.String r1 = "chat"
            java.lang.String r0 = "replaceIntoChatTable/REPLACE_CHAT"
            long r12 = r12.A07(r1, r0, r5)     // Catch:{ all -> 0x0352 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x02ab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0352 }
            r1.<init>()     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = "ChatStore/replaceIntoChatTable/unable to replace for chatJid="
            r1.append(r0)     // Catch:{ all -> 0x0352 }
            r1.append(r3)     // Catch:{ all -> 0x0352 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0352 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0352 }
            r16.A00()     // Catch:{ all -> 0x0352 }
        L_0x02ab:
            r16.close()     // Catch:{ all -> 0x035c }
            r17.close()     // Catch:{ all -> 0x0366 }
            X.00H r0 = r7.A06     // Catch:{ all -> 0x0366 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0366 }
            X.2cN r0 = (X.C53342cN) r0     // Catch:{ all -> 0x0366 }
            X.1Cd r0 = r0.A00     // Catch:{ all -> 0x033b }
            X.1au r3 = r0.A05()     // Catch:{ all -> 0x033b }
            X.1xA r5 = r3.BD0()     // Catch:{ all -> 0x0334 }
            X.1au r12 = r0.A05()     // Catch:{ all -> 0x02ef }
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x02e8 }
            X.1Ev r15 = r0.A02     // Catch:{ all -> 0x02e8 }
            java.lang.String r14 = "newsletter_linked_account"
            java.lang.String r13 = "chat_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x02e8 }
            java.lang.String r16 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x02e8 }
            r0 = 0
            r1[r0] = r16     // Catch:{ all -> 0x02e8 }
            java.lang.String r0 = "NewsletterLinkedAccountsStore/DELETE_NEWSLETTER_LINKED_ACCOUNTS"
            int r0 = r15.A04(r14, r13, r0, r1)     // Catch:{ all -> 0x02e8 }
            r12.close()     // Catch:{ all -> 0x02ef }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02ef }
            goto L_0x02f5
        L_0x02e8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02ea }
        L_0x02ea:
            r0 = move-exception
            X.CDX.A00(r12, r1)     // Catch:{ all -> 0x02ef }
            throw r0     // Catch:{ all -> 0x02ef }
        L_0x02ef:
            r0 = move-exception
            X.1IU r1 = new X.1IU     // Catch:{ all -> 0x032d }
            r1.<init>(r0)     // Catch:{ all -> 0x032d }
        L_0x02f5:
            java.lang.Throwable r1 = X.C30671eK.A00(r1)     // Catch:{ all -> 0x032d }
            if (r1 == 0) goto L_0x0300
            java.lang.String r0 = "NewsletterLinkedAccountsStore/failed to store newsletter"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x032d }
        L_0x0300:
            java.util.List r0 = r6.A0W     // Catch:{ all -> 0x032d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x032d }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x032d }
            if (r0 == 0) goto L_0x0323
            r1.next()     // Catch:{ all -> 0x032d }
            r0 = 1
            X.C18070vi.A0d(r11, r0)     // Catch:{ all -> 0x032d }
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x032d }
            r0.<init>()     // Catch:{ all -> 0x032d }
            r0.put(r2, r4)     // Catch:{ all -> 0x032d }
            java.lang.String r1 = "getName"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x032d }
            r0.<init>(r1)     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x0323:
            r5.A00()     // Catch:{ all -> 0x032d }
            r5.close()     // Catch:{ all -> 0x0334 }
            r3.close()     // Catch:{ all -> 0x033b }
            goto L_0x033f
        L_0x032d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x032f }
        L_0x032f:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0334 }
            throw r0     // Catch:{ all -> 0x0334 }
        L_0x0334:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0336 }
        L_0x0336:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x033b }
            throw r0     // Catch:{ all -> 0x033b }
        L_0x033b:
            r0 = move-exception
            X.C30691eM.A00(r0)     // Catch:{ all -> 0x0366 }
        L_0x033f:
            X.1CJ r1 = r7.A02     // Catch:{ all -> 0x0366 }
            X.1BI r0 = r6.A0u     // Catch:{ all -> 0x0366 }
            r1.A0K(r6, r0)     // Catch:{ all -> 0x0366 }
            r10.A00()     // Catch:{ all -> 0x0366 }
            goto L_0x0249
        L_0x034b:
            r10.close()     // Catch:{ all -> 0x036d }
            r8.close()     // Catch:{ all -> 0x0374 }
            goto L_0x037a
        L_0x0352:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0357 }
            goto L_0x035b
        L_0x0357:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x035c }
        L_0x035b:
            throw r1     // Catch:{ all -> 0x035c }
        L_0x035c:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0361 }
            goto L_0x0365
        L_0x0361:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0366 }
        L_0x0365:
            throw r1     // Catch:{ all -> 0x0366 }
        L_0x0366:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0368 }
        L_0x0368:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ all -> 0x036d }
            throw r0     // Catch:{ all -> 0x036d }
        L_0x036d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x036f }
        L_0x036f:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x0374 }
            throw r0     // Catch:{ all -> 0x0374 }
        L_0x0374:
            r0 = move-exception
            X.1IU r1 = new X.1IU     // Catch:{ all -> 0x0391 }
            r1.<init>(r0)     // Catch:{ all -> 0x0391 }
        L_0x037a:
            java.lang.Throwable r1 = X.C30671eK.A00(r1)     // Catch:{ all -> 0x0391 }
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "NewsletterStore/failed to store newsletter"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0391 }
            goto L_0x0012
        L_0x0387:
            r9.A00()     // Catch:{ all -> 0x0391 }
            r9.close()     // Catch:{ all -> 0x0398 }
            r19.close()     // Catch:{ all -> 0x03a1 }
            return
        L_0x0391:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0393 }
        L_0x0393:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x0398 }
            throw r0     // Catch:{ all -> 0x0398 }
        L_0x0398:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x039a }
        L_0x039a:
            r1 = move-exception
            r0 = r19
            X.CDX.A00(r0, r2)     // Catch:{ all -> 0x03a1 }
            throw r1     // Catch:{ all -> 0x03a1 }
        L_0x03a1:
            r0 = move-exception
            X.C30691eM.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32991i5.A0A(java.util.List):void");
    }
}
