package X;

import android.util.Base64;
import android.util.Log;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class A6C {
    public Queue A00 = null;
    public final C186429eB A01;
    public final C19830z4 A02;
    public final C18030ve A03;
    public final AnonymousClass18K A04;
    public final C30051dJ A05;
    public final AnonymousClass11P A06;
    public final C31271fI A07;
    public final C35371m8 A08;
    public final C31321fN A09;
    public final C31461fb A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final Set A0E;
    public final Set A0F;

    public static final byte[] A01(String str, String str2) {
        try {
            return Base64.decode(str, 11);
        } catch (IllegalArgumentException unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("PushEncryptionHelper/base64 exception decoding:");
            A10.append(str2);
            A10.append(" value:'");
            A10.append(str);
            A10.append('\'');
            C17890vO.A0w(A10);
            return null;
        }
    }

    public static final byte[] A02(StringBuilder sb, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, long j) {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putLong(j);
            byte[] A022 = C20058A5h.A02(bArr, allocate.array(), (byte[]) null, 32);
            C18070vi.A0X(A022);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A022, "AES/GCM/NoPadding");
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, secretKeySpec, AnonymousClass8BT.A11(bArr3));
            instance.updateAAD(C18070vi.A1A("WA_PUSH_NOTIFICATION", C26571Sq.A01));
            ByteBuffer allocate2 = ByteBuffer.allocate(bArr2.length + bArr4.length);
            allocate2.put(bArr2);
            allocate2.put(bArr4);
            return instance.doFinal(allocate2.array());
        } catch (Exception e) {
            if ((e instanceof BadPaddingException) || (e instanceof IllegalBlockSizeException) || (e instanceof InvalidAlgorithmParameterException) || (e instanceof InvalidKeyException) || (e instanceof InvalidKeySpecException) || (e instanceof NoSuchAlgorithmException) || (e instanceof NoSuchPaddingException)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("PushEncryptionHelper/decryptData/issue decrypting ");
                A10.append(Log.getStackTraceString(e));
                A10.append(10);
                AnonymousClass8BS.A1D(A10, sb);
                return null;
            }
            throw e;
        }
    }

    public A6C(C186429eB r2, C30051dJ r3, AnonymousClass11P r4, C19830z4 r5, C18030ve r6, AnonymousClass18K r7, C31271fI r8, C35371m8 r9, C31321fN r10, C31461fb r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, Set set, Set set2) {
        this.A06 = r4;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r3;
        this.A07 = r8;
        this.A0B = r12;
        this.A08 = r9;
        this.A09 = r10;
        this.A02 = r5;
        this.A0C = r13;
        this.A0D = r14;
        this.A0F = set;
        this.A0A = r11;
        this.A0E = set2;
        this.A01 = r2;
    }

    public static void A00(AbstractCollection abstractCollection, AbstractCollection abstractCollection2, Iterator it) {
        Object next = it.next();
        if (C22971Dz.A0X((AnonymousClass1BI) next)) {
            abstractCollection.add(next);
        } else {
            abstractCollection2.add(next);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: X.0wS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v48, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v154, resolved type: X.1IU} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r20v0 */
    /* JADX WARNING: type inference failed for: r20v1, types: [X.6yd, java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v74, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v130, types: [android.database.sqlite.SQLiteDatabase$CursorFactory, java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r20v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r9v48 */
    /* JADX WARNING: type inference failed for: r10v30 */
    /* JADX WARNING: type inference failed for: r6v76 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0306, code lost:
        if (r3.equals(r6) == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r32 = r0.getString(r1);
        r27 = com.whatsapp.jid.DeviceJid.Companion.A05(r0.getString("from_device_jid"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x031e, code lost:
        if (r0.has("group_jid") == false) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0320, code lost:
        r6 = com.whatsapp.jid.GroupJid.Companion;
        r29 = X.C36321nh.A01(r0.getString("group_jid"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x032a, code lost:
        r39 = "1".equals(r0.getString("video_call"));
        r33 = java.lang.Long.parseLong(X.C18070vi.A0J("offer_ts_sec", r0));
        r35 = java.lang.Long.parseLong(X.C18070vi.A0J("offer_push_timeout_sec", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0350, code lost:
        if (r0.has("secondary_account_offer_timeout_sec") == false) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0352, code lost:
        r37 = java.lang.Long.parseLong(X.C18070vi.A0J("secondary_account_offer_timeout_sec", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x035a, code lost:
        r1 = "from_pn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x035d, code lost:
        r37 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0360, code lost:
        r29 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0367, code lost:
        if (r0.has(r1) == false) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0369, code lost:
        r28 = com.whatsapp.jid.DeviceJid.Companion.A05(r0.getString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0373, code lost:
        X.C18070vi.A0b(r32);
        r26 = new X.C1774998v(r27, r28, r29, r3, r4, r32, r33, r35, r37, r39);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0381, code lost:
        r28 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0384, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0386, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0393, code lost:
        X.C17900vP.A0e("PushPayloadParser/fromJSON missing ", r1, X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0411, code lost:
        r2 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x042e, code lost:
        if (r3.equals(r0) == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0430, code lost:
        r2 = new X.C1774698s(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0435, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("IncomingPushHandler/received payload nt:");
        r0 = X.AnonymousClass000.A0y(r2.A00(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x09ce, code lost:
        if (r1.equals("group_message") != false) goto L_0x09d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x09d0, code lost:
        r0 = r51;
        r8 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x09d4, code lost:
        if (r10 != null) goto L_0x09dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x09d6, code lost:
        r12 = X.AnonymousClass11P.A01(r0.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x09dc, code lost:
        com.whatsapp.util.Log.i("InactiveAccountNotificationManager/processMessageNotification");
        r16 = true;
        r0 = X.C17880vN.A0I(r8.A04).A06(r6, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x09ef, code lost:
        if (r0 == null) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x09f3, code lost:
        if ((r2 instanceof X.C1774898u) == false) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x09f5, code lost:
        r2 = (X.C1774898u) r2;
        r14 = r8.A07;
        r9 = (X.A1T) r14.get();
        r23 = r2.A00;
        r5 = r23.getRawString();
        X.C18070vi.A0d(r5, 1);
        r10 = X.C17880vN.A1Z();
        r10[r3] = "message";
        r22 = true;
        r10[1] = "group_message";
        r15 = new java.lang.String[1];
        r4 = r0.A07;
        r19 = r4;
        r15[r3] = r4;
        r10 = X.C200310o.A0F(r15, r10);
        r4 = new java.lang.String[1];
        r4[r3] = r5;
        r10 = X.C200310o.A0F(r10, r4);
        r15 = new java.lang.String[1];
        r24 = java.lang.String.valueOf(r0.A03);
        r15[r3] = r24;
        r10 = (java.lang.String[]) X.C200310o.A0F(r10, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        r9 = ((X.AnonymousClass2Df) r9.A00.get()).get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        r15 = ((X.C28801av) r9).A02;
        r5 = X.AnonymousClass000.A10();
        r5.append("SELECT sender_jid FROM notifications WHERE account_lid = ? AND notification_type IN ");
        r5.append(X.AnonymousClass1H2.A00(2));
        r5 = r15.A0A(X.AnonymousClass000.A0y(" AND sender_jid = ? AND timestamp >= ?", r5), "GET_SENDERS_FOR_NOT_LID_AND_NOTIFICATION_TYPE", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0a75, code lost:
        if (r5.getCount() > 0) goto L_0x0a79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0a77, code lost:
        r22 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0a7f, code lost:
        if (r22 == false) goto L_0x0acb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:?, code lost:
        r21 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(X.AnonymousClass11P.A01(r8.A01) - r0.A04);
        r4 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0a98, code lost:
        if (X.C18070vi.A18(r4, "message") == false) goto L_0x0a9d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0a9a, code lost:
        r9 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0aa3, code lost:
        if (X.C18070vi.A18(r4, "group_message") == false) goto L_0x0aac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0aa5, code lost:
        r9 = 120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0aa9, code lost:
        if (r21 <= r9) goto L_0x0aac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0aac, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0ab1, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:?, code lost:
        X.CDX.A00(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0ab5, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0ab8, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:?, code lost:
        X.CDX.A00(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0abc, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0abd, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:?, code lost:
        r5 = X.C108945cZ.A1J(r4).exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0ac4, code lost:
        if (r5 != null) goto L_0x0ac6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0ac6, code lost:
        com.whatsapp.util.Log.e("InactiveNotificationsStore/doesMessageSenderExist/failed", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0acb, code lost:
        r10 = X.C17880vN.A0J(r8.A05);
        r4 = X.AnonymousClass11P.A01(r8.A01);
        r15 = X.AnonymousClass000.A10();
        X.AnonymousClass8BW.A18(r0, "AccountSwitchingDataRepo/updateLastBuzzedTime/", r15);
        X.C17900vP.A0m("/lastBuzzedTimeMs:", r15, r4);
        r9 = X.C64012u4.A01(r10);
        r25 = X.C64012u4.A02(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0aed, code lost:
        if (r25 == null) goto L_0x0aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0aef, code lost:
        com.whatsapp.util.Log.e("AccountSwitchingDataRepo/updateLastBuzzedTime/Account doesn't exist");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0af4, code lost:
        r4 = (X.A1T) r14.get();
        r28 = r23.getRawString();
        r5 = r2.A02;
        r32 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0b02, code lost:
        if (r5 != null) goto L_0x0b04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0b04, code lost:
        r30 = r5.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0b08, code lost:
        r5 = r2.A05;
        r2 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0b0c, code lost:
        if (r2 != null) goto L_0x0b0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0b0e, code lost:
        r32 = r2.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0b12, code lost:
        r4.A01(new X.C195669ti(r6, r1, r28, r20, r30, r5, r32, r3, r12, 1));
        r2 = X.AnonymousClass000.A10();
        r2.append("InactiveAccountNotificationManager/showMessageNotifications/");
        X.C17890vO.A1A(r2, X.C49842Sd.A00(r0));
        r5 = r0.A05;
        r1 = r8.A02;
        r29 = r1;
        r1 = r1.A00;
        r28 = r1;
        X.C18070vi.A0X(r28);
        r22 = X.AnonymousClass1LU.A1a(r1, r19, r5, 3, r3);
        r2 = (X.C20034A4d) r8.A08.get();
        r21 = X.AnonymousClass000.A13();
        r14 = r2.A03;
        r1 = (X.A8T) r14.get();
        r5 = r1.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0b67, code lost:
        if (r5 == null) goto L_0x0c22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0b6f, code lost:
        r4 = X.AnonymousClass8BR.A0u(r5.getAbsolutePath(), "chatsettings.db");
        r10 = r1.A01;
        r5 = (X.AnonymousClass1CP) r1.A06.get();
        r4 = r4.getAbsolutePath();
        r6 = X.AnonymousClass000.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0b8c, code lost:
        r30 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0b90, code lost:
        X.C64012u4.A07(r9, r10, X.C62562rb.A00(r25, r20, r20, r20, r20, r3, r3, 1791, 0, r4, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:?, code lost:
        r9 = android.database.sqlite.SQLiteDatabase.openDatabase(r4, r20, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:?, code lost:
        r12 = X.AnonymousClass1Eu.A03(r9, r5, r10, "chatsettings.db");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:?, code lost:
        r1 = X.AnonymousClass8BR.A1b();
        r1[r3] = java.lang.String.valueOf(r3);
        X.C17890vO.A1K(r1, java.lang.System.currentTimeMillis());
        r1[2] = java.lang.String.valueOf(-1);
        r5 = r12.A0A("SELECT jid, mute_end FROM settings WHERE muted_notifications = ? AND (mute_end > ? OR mute_end = ? ) ORDER BY jid ASC", "GET_INACTIVE_ACCOUNT_MUTED_CHAT_JID_WITH_END_TIME_SORTED", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:?, code lost:
        r4 = r5.getColumnIndex("jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0be3, code lost:
        if (r5.moveToNext() != false) goto L_0x0be5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0be5, code lost:
        r1 = X.AnonymousClass3MX.A0l(r5.getString(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0bed, code lost:
        if (r1 != null) goto L_0x0bef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0bef, code lost:
        r6.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0bf7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0bf8, code lost:
        if (r5 != null) goto L_0x0bfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0bfe, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:?, code lost:
        X.AnonymousClass0DT.A00(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0c03, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:?, code lost:
        com.whatsapp.util.Log.e("/getInactiveAccountMutedChatsList", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0c09, code lost:
        if (r9 != null) goto L_0x0c0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0c0f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0c10, code lost:
        if (r9 != null) goto L_0x0c12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0c16, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:?, code lost:
        X.AnonymousClass0DT.A00(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0c1a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0c1b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:?, code lost:
        com.whatsapp.util.Log.e("ChatStore/getInactiveAccountMutedChatsList", r4);
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0c22, code lost:
        r5 = X.AnonymousClass000.A10();
        X.AnonymousClass8BW.A18(r0, "AccountSwitchingFileManager/getInactiveAccountMutedChats/account ", r5);
        X.C17890vO.A1A(r5, " databases dir does not exist");
        X.AnonymousClass8BX.A16(r1, "AccountSwitchingFileManager/getInactiveAccountMutedChats/stagingDirLogString/", X.AnonymousClass000.A10());
        r6 = X.C18460wS.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0c3b, code lost:
        r4 = X.AnonymousClass000.A13();
        r1 = X.AnonymousClass000.A13();
        r5 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0c4b, code lost:
        if (r5.hasNext() != false) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0c4d, code lost:
        A00(r4, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0c51, code lost:
        r4 = X.AnonymousClass1D6.A01(r4, r1);
        r23 = (java.util.List) r4.first;
        r13 = (java.util.List) r4.second;
        r4 = (X.A8T) r14.get();
        r5 = r4.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0c6d, code lost:
        if (r5 == null) goto L_0x0cea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0c75, code lost:
        r9 = X.AnonymousClass8BR.A0u(r5.getAbsolutePath(), "msgstore.db");
        r5 = r4.A01;
        r4 = (X.AnonymousClass1CP) r4.A06.get();
        r12 = r9.getAbsolutePath();
        r10 = X.AnonymousClass000.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0c93, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:?, code lost:
        r12 = android.database.sqlite.SQLiteDatabase.openDatabase(r12, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:?, code lost:
        r5 = X.AnonymousClass1Eu.A03(r12, r4, r5, "msgstore.db").A0A("SELECT jid.raw_string FROM chat_view LEFT JOIN jid ON jid_row_id = jid._id WHERE archived = 1", "GET_INACTIVE_ACCOUNT_ARCHIVED_CHAT_JID", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:?, code lost:
        r4 = r5.getColumnIndexOrThrow("raw_string");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0caf, code lost:
        if (r5.moveToNext() != false) goto L_0x0cb1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0cb1, code lost:
        r1 = X.AnonymousClass3MX.A0l(r5.getString(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0cb9, code lost:
        if (r1 != null) goto L_0x0cbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0cbb, code lost:
        r10.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0cc3, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0cc4, code lost:
        if (r5 != null) goto L_0x0cc6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0cca, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:?, code lost:
        X.AnonymousClass0DT.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0ccf, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:?, code lost:
        com.whatsapp.util.Log.e("ChatStore/getInactiveAccountArchivedChatsList", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0cd3, code lost:
        if (r12 != null) goto L_0x0cd5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0cd9, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0cda, code lost:
        if (r12 != null) goto L_0x0cdc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0ce0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:?, code lost:
        X.AnonymousClass0DT.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0ce4, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0ce5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:?, code lost:
        com.whatsapp.util.Log.e("ChatStore/getInactiveAccountArchivedChatsList", r1);
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0cea, code lost:
        r5 = X.AnonymousClass000.A10();
        X.AnonymousClass8BW.A18(r0, "AccountSwitchingFileManager/getInactiveAccountArchivedChats/account ", r5);
        X.C17890vO.A1A(r5, " databases dir does not exist");
        X.AnonymousClass8BX.A16(r4, "AccountSwitchingFileManager/getInactiveAccountArchivedChats/stagingDirLogString/", X.AnonymousClass000.A10());
        r10 = X.C18460wS.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0d03, code lost:
        r5 = X.AnonymousClass000.A13();
        r4 = X.AnonymousClass000.A13();
        r1 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0d13, code lost:
        if (r1.hasNext() != false) goto L_0x0d15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0d15, code lost:
        A00(r5, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0d19, code lost:
        r1 = X.AnonymousClass1D6.A01(r5, r4);
        r12 = (java.util.List) r1.first;
        r10 = (java.util.List) r1.second;
        r5 = (X.A8T) r14.get();
        r4 = r5.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0d2f, code lost:
        if (r4 == null) goto L_0x0dae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0d37, code lost:
        r6 = X.AnonymousClass8BR.A0u(r4.getAbsolutePath(), "msgstore.db");
        r15 = r5.A01;
        r1 = (X.AnonymousClass1CP) r5.A06.get();
        r14 = r6.getAbsolutePath();
        r9 = X.AnonymousClass000.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:?, code lost:
        r5 = android.database.sqlite.SQLiteDatabase.openDatabase(r14, r20, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:?, code lost:
        r4 = X.AnonymousClass1Eu.A03(r5, r1, r15, "msgstore.db").A0A("SELECT jid.raw_string FROM chat_view LEFT JOIN jid ON jid_row_id = jid._id WHERE chat_lock > 0", "GET_INACTIVE_ACCOUNT_LOCKED_CHAT_JID", r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:?, code lost:
        r14 = r4.getColumnIndexOrThrow("raw_string");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0d73, code lost:
        if (r4.moveToNext() != false) goto L_0x0d75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0d75, code lost:
        r1 = X.AnonymousClass3MX.A0l(r4.getString(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0d7d, code lost:
        if (r1 != null) goto L_0x0d7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0d7f, code lost:
        r9.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0d87, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0d88, code lost:
        if (r4 != null) goto L_0x0d8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0d8e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:?, code lost:
        X.AnonymousClass0DT.A00(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0d93, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:?, code lost:
        com.whatsapp.util.Log.e("ChatStore/getInactiveAccountLockedChatsList", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0d97, code lost:
        if (r5 != null) goto L_0x0d99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0d9d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0d9e, code lost:
        if (r5 != null) goto L_0x0da0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0da4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:?, code lost:
        X.AnonymousClass0DT.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0da8, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0da9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:?, code lost:
        com.whatsapp.util.Log.e("ChatStore/getInactiveAccountLockedChatsList", r1);
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0dae, code lost:
        r4 = X.AnonymousClass000.A10();
        X.AnonymousClass8BW.A18(r0, "AccountSwitchingFileManager/getInactiveAccountLockedChats/account ", r4);
        X.C17890vO.A1A(r4, " databases dir does not exist");
        X.AnonymousClass8BX.A16(r5, "AccountSwitchingFileManager/getInactiveAccountLockedChats/stagingDirLogString/", X.AnonymousClass000.A10());
        r9 = X.C18460wS.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0dc7, code lost:
        r5 = X.AnonymousClass000.A13();
        r4 = X.AnonymousClass000.A13();
        r1 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0dd7, code lost:
        if (r1.hasNext() != false) goto L_0x0dd9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0dd9, code lost:
        A00(r5, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0ddd, code lost:
        r1 = X.AnonymousClass1D6.A01(r5, r4);
        r9 = (java.util.List) r1.first;
        r6 = (java.util.List) r1.second;
        r5 = X.C29351c6.A0E(r23);
        r1 = r23.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0df5, code lost:
        if (r1.hasNext() != false) goto L_0x0df7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0df7, code lost:
        X.AnonymousClass8BX.A1N(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0dfb, code lost:
        r4 = X.C29351c6.A0E(r12);
        r1 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0e07, code lost:
        if (r1.hasNext() != false) goto L_0x0e09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0e09, code lost:
        X.AnonymousClass8BX.A1N(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0e0d, code lost:
        r5 = X.C29431cG.A0k(r4, r5);
        r4 = X.C29351c6.A0E(r9);
        r1 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0e1d, code lost:
        if (r1.hasNext() != false) goto L_0x0e1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0e1f, code lost:
        X.AnonymousClass8BX.A1N(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0e23, code lost:
        r9 = X.C29431cG.A0k(r4, r5);
        r5 = X.C29351c6.A0E(r13);
        r1 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0e33, code lost:
        if (r1.hasNext() != false) goto L_0x0e35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0e35, code lost:
        X.AnonymousClass8BX.A1N(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0e39, code lost:
        r4 = X.C29351c6.A0E(r10);
        r1 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0e45, code lost:
        if (r1.hasNext() != false) goto L_0x0e47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0e47, code lost:
        X.AnonymousClass8BX.A1N(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0e4b, code lost:
        r4 = X.C29431cG.A0k(r4, r5);
        r1 = X.C29351c6.A0E(r6);
        r5 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0e5b, code lost:
        if (r5.hasNext() != false) goto L_0x0e5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0e5d, code lost:
        X.AnonymousClass8BX.A1N(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0e61, code lost:
        r1 = X.AnonymousClass1D6.A01(r9.toArray(new java.lang.String[r3]), X.C29431cG.A0k(r1, r4).toArray(new java.lang.String[r3]));
        r5 = (X.A1T) r2.A04.get();
        r12 = (java.lang.String[]) r1.first;
        r10 = (java.lang.String[]) r1.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0e85, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:?, code lost:
        r9 = X.C72453Mb.A0G(r12, r10, 1);
        com.whatsapp.util.Log.i("InactiveNotificationsStore/readAllUnreadMessageNotifications");
        r4 = X.C17880vN.A1b("message", "group_message", r9, 1);
        r1 = new java.lang.String[1];
        r1[r3] = r19;
        r4 = X.C200310o.A0F(X.C200310o.A0F(X.C200310o.A0F(r1, r4), r12), r10);
        r1 = new java.lang.String[1];
        r1[r3] = r24;
        r9 = (java.lang.String[]) X.C200310o.A0F(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:?, code lost:
        r25 = ((X.AnonymousClass2Df) r5.A00.get()).get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:?, code lost:
        r6 = ((X.C28801av) r25).A02;
        r13 = r12.length;
        r12 = r10.length;
        r4 = X.AnonymousClass000.A10();
        r10 = X.AnonymousClass8BT.A0y("SELECT account_lid, notification_type, sender_jid, timestamp, group_jid, display_name, count, sender_pn_jid FROM notifications WHERE account_lid = ? AND notification_type IN (?,?) AND ", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0ed0, code lost:
        if (r13 > 0) goto L_0x0ed2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0ed2, code lost:
        r10.append("CASE WHEN group_jid IS NULL OR group_jid == '' ");
        r10.append("THEN sender_jid NOT IN ");
        r10.append(X.AnonymousClass1H2.A00(r13));
        r10.append("ELSE 1 END AND ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0ee8, code lost:
        if (r12 > 0) goto L_0x0eea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0eea, code lost:
        r10.append("group_jid NOT IN ");
        r10.append(X.AnonymousClass1H2.A00(r12));
        r10.append(" AND ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0efb, code lost:
        r4.append(X.C18070vi.A0H(r10));
        r1 = X.C18070vi.A04(r6, X.AnonymousClass000.A0y("timestamp >= ? ORDER BY timestamp DESC", r4), "GET_ALL_MSG_AND_GROUP_MSG_NOTIFICATIONS_SQL", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:?, code lost:
        r4 = X.AnonymousClass000.A13();
        r24 = r1.getColumnIndex("account_lid");
        r23 = r1.getColumnIndex("notification_type");
        r15 = r1.getColumnIndex("sender_jid");
        r14 = r1.getColumnIndex("timestamp");
        r13 = r1.getColumnIndex("group_jid");
        r12 = r1.getColumnIndex("display_name");
        r10 = r1.getColumnIndex("count");
        r9 = r1.getColumnIndex("sender_pn_jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x0f46, code lost:
        if (r1.moveToNext() != false) goto L_0x0f48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0f48, code lost:
        r4.add(new X.C195669ti(X.AnonymousClass8BS.A0c(r1, r24), X.AnonymousClass8BS.A0c(r1, r23), X.AnonymousClass8BS.A0c(r1, r15), r20, r1.getString(r13), r1.getString(r12), r1.getString(r9), r3, r1.getLong(r14), r1.getLong(r10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:?, code lost:
        r25.close();
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0f84, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:?, code lost:
        X.CDX.A00(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0f88, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x0f8b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:?, code lost:
        X.CDX.A00(r25, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0f91, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0f92, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:?, code lost:
        r4 = X.C108945cZ.A1J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0f97, code lost:
        r6 = X.C30671eK.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0f9b, code lost:
        if (r6 != null) goto L_0x0f9d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0f9d, code lost:
        com.whatsapp.util.Log.e("InactiveNotificationsStore/readAllUnreadMessageNotifications/failed", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0fa2, code lost:
        r6 = X.C18460wS.A00;
        r1 = r4 instanceof X.AnonymousClass1IU;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0fa6, code lost:
        if (r1 != false) goto L_0x0fa8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x0fa8, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x0fa9, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0fac, code lost:
        r26 = X.C20034A4d.A01(r0, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0fb4, code lost:
        if (r26.isEmpty() != false) goto L_0x0fb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0fb6, code lost:
        com.whatsapp.util.Log.e("InactiveAccountNotificationManager/showMessageNotifications/empty notificationsTextPair");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0fbb, code lost:
        r5 = X.C17880vN.A0J(r51.A03);
        r1 = X.AnonymousClass000.A10();
        r1.append("AccountSwitchingDataRepo/incrementInactivePushMessageCount/");
        X.C17890vO.A1A(r1, X.C49842Sd.A00(r7));
        r4 = X.C64012u4.A01(r5);
        r1 = X.C64012u4.A02(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0fdb, code lost:
        if (r1 == null) goto L_0x0fdd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0fdd, code lost:
        r1 = X.AnonymousClass000.A10();
        r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/account not found: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x0fe5, code lost:
        r25 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0fee, code lost:
        if (r25.hasNext() != false) goto L_0x0ff0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x0ff0, code lost:
        r6 = (X.C195449tM) r25.next();
        r4 = r6.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x0ffe, code lost:
        if (X.C18070vi.A18(r4, "message") != false) goto L_0x1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x1000, code lost:
        r12 = X.AnonymousClass3MW.A05(r2.A01);
        r9 = (int) r6.A00;
        r1 = new java.lang.Object[1];
        r4 = r6.A04;
        r1[r3] = r4;
        r1 = r12.getQuantityString(2131755291, r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x1016, code lost:
        X.C18070vi.A0X(r1);
        r21.add(X.C20034A4d.A00(r1, r4.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x102d, code lost:
        if (X.C18070vi.A18(r4, "group_message") != false) goto L_0x102f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x102f, code lost:
        r4 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x1034, code lost:
        if (r4 == 1) goto L_0x1036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x1036, code lost:
        r13 = X.AnonymousClass3MW.A05(r2.A01);
        r9 = (int) r6.A00;
        r10 = new java.lang.Object[2];
        r4 = r6.A04;
        r10[r3] = r4;
        r10[1] = r6.A02;
        r1 = r13.getQuantityString(2131755292, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x1056, code lost:
        if (r4 == 2) goto L_0x1058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x1058, code lost:
        r9 = r2.A01;
        r12 = new java.lang.Object[3];
        r4 = r6.A04;
        r12[r3] = r4;
        r12[1] = r6.A02;
        r1 = X.AnonymousClass8BS.A0f(r9, r6.A03, r12, 2, 2131893082);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:?, code lost:
        r27 = r2.A01;
        r12 = new java.lang.Object[4];
        r14 = r6.A04;
        r12[r3] = r14;
        r12[1] = r6.A02;
        r12[2] = r6.A03;
        X.AnonymousClass3MX.A1S(r12, 3, r4 - 2);
        r1 = r27.A02(2131893081, r12);
        X.C18070vi.A0X(r1);
        r21.add(X.C20034A4d.A00(r1, r14.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:?, code lost:
        com.whatsapp.util.Log.e("NotificationUiBuilder/getNotificationTextForMessages/error in string resource");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x10a8, code lost:
        com.whatsapp.util.Log.e(X.AnonymousClass001.A1H("NotificationUiBuilder/getNotificationTextForMessages/unknown message type/", r4, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x10bb, code lost:
        if (r26.size() != 1) goto L_0x1126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x10cb, code lost:
        r5 = r2.A01;
        r2 = new java.lang.Object[1];
        X.C17880vN.A1T(r2, 1, r3);
        r2 = r5.A02(2131893083, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x10d9, code lost:
        X.C18070vi.A0b(r2);
        r2 = X.AnonymousClass1D6.A01(r2, r21);
        ((X.C63302sq) X.C18070vi.A0E(r8.A06)).A04(r22, new X.C139316yd(r3, r29.A01(2131886391), X.C17880vN.A07(r28, r22, r3)), X.A6J.A00(X.C179579In.A04, r19), r8.A03(r0), (java.lang.String) r2.first, (java.util.List) r2.second, r16);
        X.A6J.A02(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x1126, code lost:
        r6 = X.AnonymousClass3MW.A05(r2.A01);
        r4 = r26.size();
        r2 = new java.lang.Object[1];
        X.C17880vN.A1T(r2, r26.size(), r3);
        r2 = r6.getQuantityString(2131755293, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x1141, code lost:
        r2 = r1.A01 + 1;
        r21 = r3;
        X.C64012u4.A07(r4, r5, X.C62562rb.A00(r1, r20, r20, r20, r20, r21, r2, 1983, 0, 0, r3));
        X.C17900vP.A0j("AccountSwitchingDataRepo/incrementInactivePushMessageCount/newUnreadMessageCount=", X.AnonymousClass000.A10(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x116b, code lost:
        if (r2 == 1000) goto L_0x116d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x116d, code lost:
        com.whatsapp.util.Log.i("InactiveAccountNotificationManager/showOfflineMessagesCountWarning");
        r5 = r7.A07;
        r16 = X.A6J.A00(X.C179579In.A08, r5);
        r17 = r8.A03(r7);
        r1 = r8.A02;
        ((X.C63302sq) X.C18070vi.A0E(r8.A06)).A03(X.AnonymousClass1LU.A1a(X.C108945cZ.A0E(r1), r5, r7.A05, 11, r3), r20, X.C18070vi.A0G(r1, 2131886374), r16, r17, 2131231578, 11, r3, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x1218, code lost:
        X.AnonymousClass8BW.A18(r7, r0, r1);
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x12f5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        X.C17890vO.A0w(r5);
        com.whatsapp.util.Log.e("PushEncryptionHelper/decryptPushPayloadToJSON bad JSON");
        r1 = new android.util.Pair((java.lang.Object) null, (java.lang.Object) null);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r3v1, types: [boolean, int] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0241 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0448 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0460 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04a3 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04a4 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04c0 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0516 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x05a0 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x05bf A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x05d3 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05d4 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0679 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x069c A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x06a2 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06d3 A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0152 A[SYNTHETIC, Splitter:B:42:0x0152] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015c A[SYNTHETIC, Splitter:B:44:0x015c] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x025e A[Catch:{ JSONException -> 0x024d }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A03(java.lang.Integer r53, java.lang.Integer r54, java.lang.Long r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, int r72, int r73, boolean r74) {
        /*
            r52 = this;
            r22 = r53
            r11 = r52
            monitor-enter(r11)
            X.11P r0 = r11.A06     // Catch:{ all -> 0x12fd }
            long r16 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x12fd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            r10 = r72
            if (r72 == 0) goto L_0x00a6
            java.lang.String r0 = "FBNS"
        L_0x0015:
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = " push received; id="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r45 = r56
            r0 = r45
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; ip="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r44 = r57
            r0 = r44
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; sessionId = "
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r43 = r58
            r0 = r43
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; mmsOverride="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r14 = r59
            r1.append(r14)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; fbips="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r25 = r60
            r0 = r25
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; notifyOnFailure="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r40 = r74
            r0 = r40
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; routingInfo="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r42 = r61
            r0 = r42
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; pushTs="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r15 = r64
            r1.append(r15)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; pushTransport="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r1.append(r10)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; originalPriority="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r0 = r22
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; deliveredPriority="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r47 = r54
            r0 = r47
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; pushNonce is empty="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r21 = r65
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ all -> 0x12fd }
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; has encPayload="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            goto L_0x00aa
        L_0x00a6:
            java.lang.String r0 = "GCM"
            goto L_0x0015
        L_0x00aa:
            r6 = r67
            boolean r0 = X.AnonymousClass000.A1W(r6)
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "; pushProvider="
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            r41 = r73
            r0 = r41
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r2 = "; providerSentTime="
            r46 = r55
            r0 = r46
            X.C17900vP.A0Y(r0, r2, r1)     // Catch:{ all -> 0x12fd }
            r0 = -1
            long r12 = X.C20099A7c.A04(r15, r0)     // Catch:{ all -> 0x12fd }
            r2 = 1
            if (r10 != r2) goto L_0x00df
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0572
            X.1m8 r0 = r11.A08     // Catch:{ all -> 0x12fd }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x00df
            goto L_0x0572
        L_0x00df:
            if (r67 == 0) goto L_0x0451
            X.00H r0 = r11.A0C     // Catch:{ all -> 0x12fd }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x12fd }
            X.A1D r3 = (X.A1D) r3     // Catch:{ all -> 0x12fd }
            r2 = 0
            r0 = r68
            if (r68 == 0) goto L_0x0212
            r4 = r69
            if (r69 == 0) goto L_0x0212
            r5 = r70
            if (r70 == 0) goto L_0x0212
            java.lang.String r1 = "payload"
            byte[] r28 = A01(r6, r1)     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = "IV"
            byte[] r29 = A01(r0, r1)     // Catch:{ all -> 0x12fd }
            r0 = -1
            long r31 = X.C20099A7c.A04(r4, r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = "tag"
            byte[] r30 = A01(r5, r4)     // Catch:{ all -> 0x12fd }
            if (r28 == 0) goto L_0x020f
            if (r29 == 0) goto L_0x020f
            int r4 = (r31 > r0 ? 1 : (r31 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x020f
            if (r30 == 0) goto L_0x020f
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            X.0z4 r0 = r3.A02     // Catch:{ all -> 0x12fd }
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r6 = "push:push_pkey_data"
            java.lang.String r0 = r0.getString(r6, r2)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0143
            byte[] r27 = X.A1D.A00(r3, r0)     // Catch:{ all -> 0x12fd }
            if (r27 == 0) goto L_0x0143
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadInternal attempting decrypt\n"
            r5.append(r0)     // Catch:{ all -> 0x12fd }
            r26 = r5
            byte[] r0 = A02(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x014a
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadInternal failed to decrypt\n"
            r5.append(r0)     // Catch:{ all -> 0x12fd }
            goto L_0x0148
        L_0x0143:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadInternal failed to get pKey"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
        L_0x0148:
            r0 = r2
            goto L_0x014e
        L_0x014a:
            java.lang.String r0 = X.C108955ca.A13(r0)     // Catch:{ all -> 0x12fd }
        L_0x014e:
            java.lang.String r19 = "PushEncryptionHelper/decryptPushPayloadToJSON bad JSON"
            if (r0 == 0) goto L_0x015c
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x024d }
            android.util.Pair r1 = X.C108945cZ.A0N(r2, r0)     // Catch:{ JSONException -> 0x024d }
            goto L_0x0258
        L_0x015c:
            X.9Zq r7 = r3.A00     // Catch:{ all -> 0x12fd }
            java.util.HashMap r9 = X.C17880vN.A11()     // Catch:{ all -> 0x12fd }
            X.00H r0 = r7.A00     // Catch:{ all -> 0x12fd }
            X.1cN r4 = X.C17880vN.A0I(r0)     // Catch:{ all -> 0x12fd }
            r1 = 1
            r0 = 0
            java.util.List r0 = r4.A09(r1, r0, r0)     // Catch:{ all -> 0x12fd }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ all -> 0x12fd }
        L_0x0172:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x019a
            java.lang.Object r4 = r18.next()     // Catch:{ all -> 0x12fd }
            X.2rb r4 = (X.C62562rb) r4     // Catch:{ all -> 0x12fd }
            java.lang.String r8 = r4.A07     // Catch:{ all -> 0x12fd }
            X.00H r0 = r7.A01     // Catch:{ all -> 0x12fd }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x12fd }
            X.A3v r1 = (X.C20026A3v) r1     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "MultiAccountSharedPrefReader/getPKeyFromSharedPref"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = X.C19830z4.A06     // Catch:{ all -> 0x12fd }
            X.C18070vi.A0Z(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = X.C20026A3v.A01(r4, r1, r0, r6)     // Catch:{ all -> 0x12fd }
            r9.put(r8, r0)     // Catch:{ all -> 0x12fd }
            goto L_0x0172
        L_0x019a:
            java.util.Iterator r7 = X.C17890vO.A0i(r9)     // Catch:{ all -> 0x12fd }
        L_0x019e:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0215
            java.util.Map$Entry r6 = X.AnonymousClass000.A16(r7)     // Catch:{ all -> 0x12fd }
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x12fd }
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != 0) goto L_0x01c7
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts pKey not found for {"
        L_0x01b6:
            r4.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = X.C17880vN.A0x(r6)     // Catch:{ all -> 0x12fd }
            r4.append(r0)     // Catch:{ all -> 0x12fd }
            r4.append(r1)     // Catch:{ all -> 0x12fd }
            X.C17890vO.A0w(r4)     // Catch:{ all -> 0x12fd }
            goto L_0x019e
        L_0x01c7:
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x12fd }
            X.AnonymousClass8BR.A1I(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x12fd }
            byte[] r34 = X.A1D.A00(r3, r0)     // Catch:{ all -> 0x12fd }
            if (r34 != 0) goto L_0x01dd
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts failed to get pKey for {"
            goto L_0x01b6
        L_0x01dd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts attempting decrypt for {"
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = X.C17880vN.A0x(r6)     // Catch:{ all -> 0x12fd }
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "}\n"
            X.C108985cd.A1L(r0, r1, r5)     // Catch:{ all -> 0x12fd }
            r33 = r5
            r35 = r28
            r36 = r29
            r37 = r30
            r38 = r31
            byte[] r0 = A02(r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x019e
            java.lang.Object r1 = r6.getKey()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = X.C108955ca.A13(r0)     // Catch:{ all -> 0x12fd }
            android.util.Pair r1 = X.C108945cZ.A0N(r1, r0)     // Catch:{ all -> 0x12fd }
            goto L_0x021f
        L_0x020f:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadToJSON bad payload attributes"
            goto L_0x0227
        L_0x0212:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadToJSON missing payload attributes"
            goto L_0x0227
        L_0x0215:
            java.lang.String r0 = "PushEncryptionHelper/decryptPushPayloadForInactiveAccounts failed to decrypt"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x12fd }
            r1.<init>(r2, r2)     // Catch:{ all -> 0x12fd }
        L_0x021f:
            java.lang.Object r0 = r1.second     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x0230
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x12fd }
        L_0x0227:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x12fd }
            r1.<init>(r2, r2)     // Catch:{ all -> 0x12fd }
            goto L_0x0258
        L_0x0230:
            java.lang.Object r1 = r1.first     // Catch:{ JSONException -> 0x0241 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0241 }
            if (r0 == 0) goto L_0x023f
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0241 }
        L_0x023a:
            android.util.Pair r1 = X.C108945cZ.A0N(r1, r0)     // Catch:{ JSONException -> 0x0241 }
            goto L_0x0258
        L_0x023f:
            r0 = r2
            goto L_0x023a
        L_0x0241:
            X.C17890vO.A0w(r5)     // Catch:{ all -> 0x12fd }
            com.whatsapp.util.Log.e((java.lang.String) r19)     // Catch:{ all -> 0x12fd }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x12fd }
            r1.<init>(r2, r2)     // Catch:{ all -> 0x12fd }
            goto L_0x0258
        L_0x024d:
            X.C17890vO.A0w(r5)     // Catch:{ all -> 0x12fd }
            com.whatsapp.util.Log.e((java.lang.String) r19)     // Catch:{ all -> 0x12fd }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x12fd }
            r1.<init>(r2, r2)     // Catch:{ all -> 0x12fd }
        L_0x0258:
            java.lang.Object r0 = r1.second     // Catch:{ all -> 0x12fd }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0448
            java.lang.Object r4 = r1.first     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x12fd }
            java.lang.String r2 = "nt"
            boolean r1 = X.C18070vi.A15(r0, r2)     // Catch:{ all -> 0x12fd }
            java.lang.String r3 = X.A6n.A03(r2, r0, r1)     // Catch:{ all -> 0x12fd }
            r2 = 0
            if (r3 == 0) goto L_0x027e
            int r8 = r3.hashCode()     // Catch:{ all -> 0x12fd }
            java.lang.String r5 = "PushPayloadParser/fromJSON missing "
            java.lang.String r6 = "display_name"
            java.lang.String r7 = "from_jid"
            java.lang.String r1 = "call_id"
            switch(r8) {
                case -1127809222: goto L_0x0292;
                case -395094592: goto L_0x0295;
                case -318861064: goto L_0x028e;
                case 143478273: goto L_0x02d4;
                case 239102022: goto L_0x0300;
                case 757346421: goto L_0x0428;
                case 954925063: goto L_0x039c;
                case 1006153287: goto L_0x03dc;
                default: goto L_0x027e;
            }     // Catch:{ all -> 0x12fd }
        L_0x027e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "PushPayloadParser/fromJSON unknown nt: "
            X.C17900vP.A0e(r0, r3, r1)     // Catch:{ all -> 0x12fd }
        L_0x0287:
            java.lang.String r0 = "IncomingPushHandler/payload failed to extract"
        L_0x0289:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            goto L_0x044b
        L_0x028e:
            java.lang.String r0 = "pre_reg"
            goto L_0x042a
        L_0x0292:
            java.lang.String r6 = "voip_call_offer_group"
            goto L_0x0302
        L_0x0295:
            java.lang.String r6 = "call_terminate"
            boolean r6 = r3.equals(r6)     // Catch:{ all -> 0x12fd }
            if (r6 == 0) goto L_0x027e
            java.lang.String r32 = r0.getString(r1)     // Catch:{ Exception -> 0x02bf }
            X.C18070vi.A0b(r32)     // Catch:{ Exception -> 0x02bf }
            r39 = 0
            r33 = 0
            X.98v r26 = new X.98v     // Catch:{ Exception -> 0x02bd }
            r28 = r2
            r29 = r2
            r37 = r33
            r27 = r2
            r30 = r3
            r31 = r4
            r35 = r33
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r35, r37, r39)     // Catch:{ Exception -> 0x02bd }
            goto L_0x0411
        L_0x02bd:
            r3 = move-exception
            goto L_0x02c0
        L_0x02bf:
            r3 = move-exception
        L_0x02c0:
            boolean r0 = r3 instanceof X.AnonymousClass11T     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x02cc
            boolean r0 = r3 instanceof org.json.JSONException     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x02cc
            boolean r0 = r3 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0450
        L_0x02cc:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            X.C17900vP.A0e(r5, r1, r0)     // Catch:{ all -> 0x12fd }
            goto L_0x0287
        L_0x02d4:
            java.lang.String r1 = "wfac_ban"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x12fd }
            if (r1 == 0) goto L_0x027e
            java.lang.String r1 = "decision"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x02ed }
            X.C18070vi.A0b(r1)     // Catch:{ Exception -> 0x02ed }
            X.98t r0 = new X.98t     // Catch:{ Exception -> 0x02ed }
            r0.<init>(r3, r4, r1)     // Catch:{ Exception -> 0x02ed }
            r2 = r0
            goto L_0x0435
        L_0x02ed:
            r3 = move-exception
            boolean r0 = r3 instanceof X.AnonymousClass11T     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x02fa
            boolean r0 = r3 instanceof org.json.JSONException     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x02fa
            boolean r0 = r3 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0450
        L_0x02fa:
            java.lang.String r0 = "PushPayloadParser/fromJSON/PAYLOAD_TYPE_WFAC_BAN missing decision"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x12fd }
            goto L_0x0287
        L_0x0300:
            java.lang.String r6 = "voip_call_offer_1on1"
        L_0x0302:
            boolean r6 = r3.equals(r6)     // Catch:{ all -> 0x12fd }
            if (r6 == 0) goto L_0x027e
            java.lang.String r32 = r0.getString(r1)     // Catch:{ Exception -> 0x0386 }
            java.lang.String r1 = "from_device_jid"
            X.1E0 r7 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ Exception -> 0x0386 }
            java.lang.String r6 = r0.getString(r1)     // Catch:{ Exception -> 0x0386 }
            com.whatsapp.jid.DeviceJid r27 = r7.A05(r6)     // Catch:{ Exception -> 0x0386 }
            java.lang.String r1 = "group_jid"
            boolean r6 = r0.has(r1)     // Catch:{ Exception -> 0x0386 }
            if (r6 == 0) goto L_0x0360
            X.1nh r6 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ Exception -> 0x0386 }
            java.lang.String r6 = r0.getString(r1)     // Catch:{ Exception -> 0x0386 }
            com.whatsapp.jid.GroupJid r29 = X.C36321nh.A01(r6)     // Catch:{ Exception -> 0x0386 }
        L_0x032a:
            java.lang.String r1 = "video_call"
            java.lang.String r7 = "1"
            java.lang.String r6 = r0.getString(r1)     // Catch:{ Exception -> 0x0386 }
            boolean r39 = r7.equals(r6)     // Catch:{ Exception -> 0x0386 }
            java.lang.String r1 = "offer_ts_sec"
            java.lang.String r6 = X.C18070vi.A0J(r1, r0)     // Catch:{ Exception -> 0x0386 }
            long r33 = java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x0386 }
            java.lang.String r1 = "offer_push_timeout_sec"
            java.lang.String r6 = X.C18070vi.A0J(r1, r0)     // Catch:{ Exception -> 0x0386 }
            long r35 = java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x0386 }
            java.lang.String r1 = "secondary_account_offer_timeout_sec"
            boolean r6 = r0.has(r1)     // Catch:{ Exception -> 0x0386 }
            if (r6 == 0) goto L_0x035d
            java.lang.String r6 = X.C18070vi.A0J(r1, r0)     // Catch:{ Exception -> 0x0386 }
            long r37 = java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x0386 }
        L_0x035a:
            java.lang.String r1 = "from_pn"
            goto L_0x0363
        L_0x035d:
            r37 = 0
            goto L_0x035a
        L_0x0360:
            r29 = r2
            goto L_0x032a
        L_0x0363:
            boolean r6 = r0.has(r1)     // Catch:{ Exception -> 0x0384 }
            if (r6 == 0) goto L_0x0381
            X.1E0 r6 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ Exception -> 0x0384 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x0384 }
            com.whatsapp.jid.DeviceJid r28 = r6.A05(r0)     // Catch:{ Exception -> 0x0384 }
        L_0x0373:
            X.C18070vi.A0b(r32)     // Catch:{ Exception -> 0x0384 }
            X.98v r26 = new X.98v     // Catch:{ Exception -> 0x0384 }
            r30 = r3
            r31 = r4
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r35, r37, r39)     // Catch:{ Exception -> 0x0384 }
            goto L_0x0411
        L_0x0381:
            r28 = r2
            goto L_0x0373
        L_0x0384:
            r3 = move-exception
            goto L_0x0387
        L_0x0386:
            r3 = move-exception
        L_0x0387:
            boolean r0 = r3 instanceof X.AnonymousClass11T     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x0393
            boolean r0 = r3 instanceof org.json.JSONException     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x0393
            boolean r0 = r3 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0450
        L_0x0393:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            X.C17900vP.A0e(r5, r1, r0)     // Catch:{ all -> 0x12fd }
            goto L_0x0287
        L_0x039c:
            java.lang.String r1 = "message"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x12fd }
            if (r1 == 0) goto L_0x027e
            X.1Dv r1 = X.AnonymousClass1BI.A00     // Catch:{ Exception -> 0x03c8 }
            java.lang.String r5 = r0.getString(r7)     // Catch:{ Exception -> 0x03c8 }
            X.1BI r27 = X.C22931Dv.A01(r5)     // Catch:{ Exception -> 0x03c8 }
            java.lang.String r32 = r0.optString(r6)     // Catch:{ Exception -> 0x03c8 }
            java.lang.String r5 = "sender_pn"
            java.lang.String r0 = r0.optString(r5)     // Catch:{ Exception -> 0x03c8 }
            X.1BI r28 = r1.A02(r0)     // Catch:{ Exception -> 0x03c8 }
            X.98u r26 = new X.98u     // Catch:{ Exception -> 0x03c8 }
            r29 = r2
            r30 = r3
            r31 = r4
            r26.<init>(r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x03c8 }
            goto L_0x0411
        L_0x03c8:
            r3 = move-exception
            boolean r0 = r3 instanceof X.AnonymousClass11T     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x03d5
            boolean r0 = r3 instanceof org.json.JSONException     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x03d5
            boolean r0 = r3 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0450
        L_0x03d5:
            java.lang.String r0 = "PushPayloadParser/fromJSON/PAYLOAD_TYPE_MESSAGE"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x12fd }
            goto L_0x0287
        L_0x03dc:
            java.lang.String r1 = "group_message"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x12fd }
            if (r1 == 0) goto L_0x027e
            X.1Dv r5 = X.AnonymousClass1BI.A00     // Catch:{ Exception -> 0x0414 }
            java.lang.String r1 = "participant_jid"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x0414 }
            X.1BI r27 = X.C22931Dv.A01(r1)     // Catch:{ Exception -> 0x0414 }
            X.1nh r1 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ Exception -> 0x0414 }
            java.lang.String r1 = r0.getString(r7)     // Catch:{ Exception -> 0x0414 }
            com.whatsapp.jid.GroupJid r29 = X.C36321nh.A01(r1)     // Catch:{ Exception -> 0x0414 }
            java.lang.String r1 = "participant_pn"
            java.lang.String r1 = r0.optString(r1)     // Catch:{ Exception -> 0x0414 }
            X.1BI r28 = r5.A02(r1)     // Catch:{ Exception -> 0x0414 }
            java.lang.String r32 = r0.optString(r6)     // Catch:{ Exception -> 0x0414 }
            X.98u r26 = new X.98u     // Catch:{ Exception -> 0x0414 }
            r30 = r3
            r31 = r4
            r26.<init>(r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x0414 }
        L_0x0411:
            r2 = r26
            goto L_0x0435
        L_0x0414:
            r3 = move-exception
            boolean r0 = r3 instanceof X.AnonymousClass11T     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x0421
            boolean r0 = r3 instanceof org.json.JSONException     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x0421
            boolean r0 = r3 instanceof java.lang.NumberFormatException     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0450
        L_0x0421:
            java.lang.String r0 = "PushPayloadParser/fromJSON/PAYLOAD_TYPE_GROUP_MESSAGE"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x12fd }
            goto L_0x0287
        L_0x0428:
            java.lang.String r0 = "post_reg"
        L_0x042a:
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x027e
            X.98s r2 = new X.98s     // Catch:{ all -> 0x12fd }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x12fd }
        L_0x0435:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "IncomingPushHandler/received payload nt:"
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = r2.A00()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0289
        L_0x0448:
            r2 = 0
            goto L_0x0287
        L_0x044b:
            boolean r0 = X.AnonymousClass000.A1W(r2)
            goto L_0x0454
        L_0x0450:
            throw r3     // Catch:{ all -> 0x12fd }
        L_0x0451:
            r2 = 0
            r7 = 0
            goto L_0x0458
        L_0x0454:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x12fd }
        L_0x0458:
            r6 = r62
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x049f
            r5 = r63
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x049f
            r3 = 0
            X.8rG r4 = new X.8rG     // Catch:{ all -> 0x12fd }
            r4.<init>()     // Catch:{ all -> 0x12fd }
            r0 = -1
            long r18 = X.C20099A7c.A04(r15, r0)     // Catch:{ all -> 0x12fd }
            int r8 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0493
            r4.A05 = r6     // Catch:{ all -> 0x12fd }
            r4.A04 = r5     // Catch:{ all -> 0x12fd }
            r4.A00 = r7     // Catch:{ all -> 0x12fd }
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x12fd }
            r4.A03 = r0     // Catch:{ all -> 0x12fd }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x12fd }
            r4.A02 = r0     // Catch:{ all -> 0x12fd }
            r0 = r47
            r4.A01 = r0     // Catch:{ all -> 0x12fd }
            X.18K r0 = r11.A04     // Catch:{ all -> 0x12fd }
            r0.CC7(r4)     // Catch:{ all -> 0x12fd }
        L_0x0493:
            X.1dJ r0 = r11.A05     // Catch:{ all -> 0x12fd }
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A07     // Catch:{ all -> 0x12fd }
            r0.getAndIncrement()     // Catch:{ all -> 0x12fd }
            boolean r18 = X.AnonymousClass8BR.A1S(r43)     // Catch:{ all -> 0x12fd }
            goto L_0x04a1
        L_0x049f:
            r3 = 0
            goto L_0x0493
        L_0x04a1:
            if (r18 == 0) goto L_0x04a4
            goto L_0x04a6
        L_0x04a4:
            r9 = 0
            goto L_0x04b2
        L_0x04a6:
            X.0z4 r0 = r11.A02     // Catch:{ all -> 0x12fd }
            java.util.List r1 = r0.A0v()     // Catch:{ all -> 0x12fd }
            r0 = r43
            boolean r9 = r1.contains(r0)     // Catch:{ all -> 0x12fd }
        L_0x04b2:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x12fd }
            r0 = -1
            long r4 = X.C20099A7c.A04(r15, r0)     // Catch:{ all -> 0x12fd }
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x050e
            X.8rh r8 = new X.8rh     // Catch:{ all -> 0x12fd }
            r8.<init>()     // Catch:{ all -> 0x12fd }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x12fd }
            r8.A08 = r0     // Catch:{ all -> 0x12fd }
            r0 = r22
            r8.A05 = r0     // Catch:{ all -> 0x12fd }
            r0 = r47
            r8.A04 = r0     // Catch:{ all -> 0x12fd }
            r0 = r16
            java.lang.Long r0 = X.C108945cZ.A1B(r0, r4)     // Catch:{ all -> 0x12fd }
            r8.A07 = r0     // Catch:{ all -> 0x12fd }
            r8.A06 = r6     // Catch:{ all -> 0x12fd }
            X.0z4 r1 = r11.A02     // Catch:{ all -> 0x12fd }
            android.content.SharedPreferences r4 = X.C17890vO.A0B(r1)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "c2dm_reg_id"
            boolean r0 = r4.contains(r0)     // Catch:{ all -> 0x12fd }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x12fd }
            r8.A01 = r0     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = r1.A0e()     // Catch:{ all -> 0x12fd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x12fd }
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)     // Catch:{ all -> 0x12fd }
            r8.A00 = r0     // Catch:{ all -> 0x12fd }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)     // Catch:{ all -> 0x12fd }
            r8.A02 = r0     // Catch:{ all -> 0x12fd }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x12fd }
            r8.A03 = r0     // Catch:{ all -> 0x12fd }
            X.18K r0 = r11.A04     // Catch:{ all -> 0x12fd }
            r0.CC7(r8)     // Catch:{ all -> 0x12fd }
        L_0x050e:
            r1 = r71
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x0547
            X.0ve r5 = r11.A03     // Catch:{ all -> 0x12fd }
            r4 = 12239(0x2fcf, float:1.715E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x12fd }
            boolean r0 = X.C18020vd.A05(r0, r5, r4)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0547
            java.util.Queue r0 = r11.A00     // Catch:{ all -> 0x12fd }
            r4 = 10
            if (r0 != 0) goto L_0x052f
            java.util.ArrayDeque r0 = new java.util.ArrayDeque     // Catch:{ all -> 0x12fd }
            r0.<init>(r4)     // Catch:{ all -> 0x12fd }
            r11.A00 = r0     // Catch:{ all -> 0x12fd }
        L_0x052f:
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x0572
            java.util.Queue r0 = r11.A00     // Catch:{ all -> 0x12fd }
            int r0 = r0.size()     // Catch:{ all -> 0x12fd }
            if (r0 < r4) goto L_0x0542
            java.util.Queue r0 = r11.A00     // Catch:{ all -> 0x12fd }
            r0.remove()     // Catch:{ all -> 0x12fd }
        L_0x0542:
            java.util.Queue r0 = r11.A00     // Catch:{ all -> 0x12fd }
            r0.add(r1)     // Catch:{ all -> 0x12fd }
        L_0x0547:
            X.0z4 r4 = r11.A02     // Catch:{ all -> 0x12fd }
            r1 = -1
            X.00H r15 = r4.A00     // Catch:{ all -> 0x12fd }
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r15)     // Catch:{ all -> 0x12fd }
            java.lang.String r9 = "push:recent_push_transport"
            int r8 = r0.getInt(r9, r1)     // Catch:{ all -> 0x12fd }
            r0 = 0
            android.content.SharedPreferences r6 = X.C17880vN.A0B(r15)     // Catch:{ all -> 0x12fd }
            java.lang.String r5 = "push:recent_push_ts"
            long r23 = r6.getLong(r5, r0)     // Catch:{ all -> 0x12fd }
            r18 = -1
            int r6 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x0574
            int r6 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0574
            int r0 = (r23 > r12 ? 1 : (r23 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0574
            if (r8 == r10) goto L_0x0574
        L_0x0572:
            monitor-exit(r11)
            return
        L_0x0574:
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass8BV.A06(r15)     // Catch:{ all -> 0x12fd }
            X.C17880vN.A1C(r0, r9, r10)     // Catch:{ all -> 0x12fd }
            int r0 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x058a
            int r0 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x058a
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r15)     // Catch:{ all -> 0x12fd }
            X.AnonymousClass8BW.A12(r0, r5, r12)     // Catch:{ all -> 0x12fd }
        L_0x058a:
            android.content.SharedPreferences$Editor r6 = X.AnonymousClass8BV.A06(r15)     // Catch:{ all -> 0x12fd }
            java.lang.String r5 = "push:most_recent_push_received_ts"
            r0 = r16
            X.C17880vN.A1D(r6, r5, r0)     // Catch:{ all -> 0x12fd }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "logins_with_messages"
            X.C17880vN.A1C(r1, r0, r3)     // Catch:{ all -> 0x12fd }
            if (r72 != 0) goto L_0x05b7
            X.00H r5 = r11.A0B     // Catch:{ all -> 0x12fd }
            java.lang.Object r1 = r5.get()     // Catch:{ all -> 0x12fd }
            X.2eG r1 = (X.C54512eG) r1     // Catch:{ all -> 0x12fd }
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x12fd }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x12fd }
            X.2eG r5 = (X.C54512eG) r5     // Catch:{ all -> 0x12fd }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x12fd }
            r5.A00 = r0     // Catch:{ all -> 0x12fd }
        L_0x05b7:
            java.lang.String r0 = "CLEAR"
            boolean r0 = r0.equalsIgnoreCase(r14)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x05d4
            r20 = 0
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "mms_authority_override"
            r1.remove(r0)     // Catch:{ all -> 0x12fd }
            r1.apply()     // Catch:{ all -> 0x12fd }
        L_0x05cd:
            boolean r0 = android.text.TextUtils.isEmpty(r42)     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x0677
            goto L_0x062f
        L_0x05d4:
            r20 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x05cd
            java.lang.String r0 = "\\|"
            r1 = 3
            java.lang.String[] r5 = r14.split(r0, r1)     // Catch:{ all -> 0x12fd }
            int r0 = r5.length     // Catch:{ all -> 0x12fd }
            if (r0 != r1) goto L_0x0625
            r0 = 1
            r0 = r5[r0]     // Catch:{ NumberFormatException -> 0x0617 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0617 }
            r6 = 2
            r6 = r5[r6]     // Catch:{ NumberFormatException -> 0x0617 }
            long r8 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0617 }
            long r0 = r0 + r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r8
            r5 = r5[r3]     // Catch:{ NumberFormatException -> 0x0617 }
            android.content.SharedPreferences$Editor r8 = X.C19830z4.A00(r4)     // Catch:{ NumberFormatException -> 0x0617 }
            java.lang.String r6 = "mms_authority_override"
            if (r5 == 0) goto L_0x0613
            java.lang.StringBuilder r5 = X.AnonymousClass000.A11(r5)     // Catch:{ NumberFormatException -> 0x0617 }
            java.lang.String r4 = "|"
            java.lang.String r0 = X.C17890vO.A0a(r4, r5, r0)     // Catch:{ NumberFormatException -> 0x0617 }
            r8.putString(r6, r0)     // Catch:{ NumberFormatException -> 0x0617 }
        L_0x060f:
            r8.apply()     // Catch:{ NumberFormatException -> 0x0617 }
            goto L_0x05cd
        L_0x0613:
            r8.remove(r6)     // Catch:{ NumberFormatException -> 0x0617 }
            goto L_0x060f
        L_0x0617:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "c2dm/mms_override/invalid_numbers:"
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            X.C17890vO.A13(r14, r1, r4)     // Catch:{ all -> 0x12fd }
            goto L_0x05cd
        L_0x0625:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "c2dm/mms_override/invalid_override:"
            X.C17900vP.A0g(r0, r14, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x05cd
        L_0x062f:
            X.1fN r8 = r11.A09     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            char[] r6 = r42.toCharArray()     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            int r5 = r6.length     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            r0 = r5 & 1
            if (r0 != 0) goto L_0x0663
            int r0 = r5 >> 1
            byte[] r4 = new byte[r0]     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            r1 = 0
            r14 = 0
        L_0x0640:
            if (r1 >= r5) goto L_0x065f
            char r0 = r6[r1]     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            r9 = 16
            int r0 = java.lang.Character.digit(r0, r9)     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            int r0 = r0 << 4
            int r10 = r1 + 1
            char r1 = r6[r10]     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            int r1 = java.lang.Character.digit(r1, r9)     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            r0 = r0 | r1
            int r1 = r10 + 1
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            r4[r14] = r0     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            int r14 = r14 + 1
            goto L_0x0640
        L_0x065f:
            r8.A00(r4)     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            goto L_0x0677
        L_0x0663:
            java.lang.String r0 = "Odd number of characters."
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
            throw r0     // Catch:{ IOException -> 0x0671, IllegalArgumentException -> 0x066a }
        L_0x066a:
            r1 = move-exception
            java.lang.String r0 = "GcmListenerService/handleGcmPush/routingInfo/failed to save edgeRoutingRoutingInfo, routing info is too big"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0677
        L_0x0671:
            r1 = move-exception
            java.lang.String r0 = "GcmListenerService/handleGcmPush/routingInfo/failed to parse edgeRoutingRoutingInfo"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x12fd }
        L_0x0677:
            if (r60 == 0) goto L_0x0686
            X.1fI r4 = r11.A07     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = ","
            r0 = r25
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ all -> 0x12fd }
            r4.A02(r0)     // Catch:{ all -> 0x12fd }
        L_0x0686:
            X.9eB r0 = r11.A01     // Catch:{ all -> 0x12fd }
            r51 = r0
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x12fd }
            X.00H r1 = r0.A02     // Catch:{ all -> 0x12fd }
            boolean r0 = X.AnonymousClass8BV.A1S(r1)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x1241
            if (r2 == 0) goto L_0x1241
            boolean r0 = r2 instanceof X.C1774798t     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x06a2
            r0 = r2
            X.98t r0 = (X.C1774798t) r0     // Catch:{ all -> 0x12fd }
            java.lang.String r6 = r0.A01     // Catch:{ all -> 0x12fd }
            goto L_0x06bb
        L_0x06a2:
            boolean r0 = r2 instanceof X.C1774898u     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x06ac
            r0 = r2
            X.98u r0 = (X.C1774898u) r0     // Catch:{ all -> 0x12fd }
            java.lang.String r6 = r0.A04     // Catch:{ all -> 0x12fd }
            goto L_0x06bb
        L_0x06ac:
            boolean r0 = r2 instanceof X.C1774698s     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x06b6
            r0 = r2
            X.98s r0 = (X.C1774698s) r0     // Catch:{ all -> 0x12fd }
            java.lang.String r6 = r0.A01     // Catch:{ all -> 0x12fd }
            goto L_0x06bb
        L_0x06b6:
            r0 = r2
            X.98v r0 = (X.C1774998v) r0     // Catch:{ all -> 0x12fd }
            java.lang.String r6 = r0.A08     // Catch:{ all -> 0x12fd }
        L_0x06bb:
            if (r6 == 0) goto L_0x1241
            int r0 = r6.length()     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x1241
            java.lang.String r0 = "IncomingInactiveAccountPushObserverImpl/handleIncomingPushMessage"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            X.1cN r1 = X.C17880vN.A0I(r1)     // Catch:{ all -> 0x12fd }
            r0 = 1
            X.2rb r7 = r1.A06(r6, r0, r0)     // Catch:{ all -> 0x12fd }
            if (r7 == 0) goto L_0x0572
            boolean r0 = r7.A0A     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x06e7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "IncomingInactiveAccountPushObserverImpl/handleIncomingPushMessage/"
            X.AnonymousClass8BW.A18(r7, r0, r1)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = " account logged out, ignoring notification"
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x12fd }
            goto L_0x0572
        L_0x06e7:
            java.lang.String r1 = r2.A00()     // Catch:{ all -> 0x12fd }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x12fd }
            switch(r0) {
                case -1127809222: goto L_0x07ac;
                case -395094592: goto L_0x0743;
                case -318861064: goto L_0x06f8;
                case 239102022: goto L_0x06f4;
                case 757346421: goto L_0x11aa;
                case 954925063: goto L_0x09be;
                case 1006153287: goto L_0x09c8;
                default: goto L_0x06f2;
            }     // Catch:{ all -> 0x12fd }
        L_0x06f2:
            goto L_0x0572
        L_0x06f4:
            java.lang.String r0 = "voip_call_offer_1on1"
            goto L_0x07ae
        L_0x06f8:
            java.lang.String r0 = "pre_reg"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0572
            r0 = r51
            X.A6J r1 = r0.A00     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "InactiveAccountNotificationManager/showPreRegistrationNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            X.00H r0 = r1.A06     // Catch:{ all -> 0x12fd }
            java.lang.Object r4 = X.C18070vi.A0E(r0)     // Catch:{ all -> 0x12fd }
            X.2sq r4 = (X.C63302sq) r4     // Catch:{ all -> 0x12fd }
            java.lang.String r5 = r7.A07     // Catch:{ all -> 0x12fd }
            X.9In r0 = X.C179579In.REGISTRATION     // Catch:{ all -> 0x12fd }
            java.lang.String r17 = X.A6J.A00(r0, r5)     // Catch:{ all -> 0x12fd }
            java.lang.String r18 = r1.A03(r7)     // Catch:{ all -> 0x12fd }
            X.118 r1 = r1.A02     // Catch:{ all -> 0x12fd }
            r0 = 2131893058(0x7f121b42, float:1.9420882E38)
            java.lang.String r16 = X.C18070vi.A0G(r1, r0)     // Catch:{ all -> 0x12fd }
            android.content.Context r2 = X.C108945cZ.A0E(r1)     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = r7.A05     // Catch:{ all -> 0x12fd }
            r0 = 9
            android.content.Intent r14 = X.AnonymousClass1LU.A1a(r2, r5, r1, r0, r3)     // Catch:{ all -> 0x12fd }
            r21 = 1
            r19 = 2131231578(0x7f08035a, float:1.807924E38)
            r13 = r4
            r15 = r20
            r20 = r0
            r22 = r21
            r13.A03(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x12fd }
            goto L_0x0572
        L_0x0743:
            java.lang.String r0 = "call_terminate"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0572
            r0 = r51
            X.A6J r4 = r0.A00     // Catch:{ all -> 0x12fd }
            X.98v r2 = (X.C1774998v) r2     // Catch:{ all -> 0x12fd }
            X.C18070vi.A0d(r2, r3)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "InactiveAccountNotificationManager/terminateCallNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r3 = r2.A08     // Catch:{ all -> 0x12fd }
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x12fd }
            java.lang.String r5 = r2.A06     // Catch:{ all -> 0x12fd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)     // Catch:{ all -> 0x12fd }
            X.9In r0 = X.C179579In.RINGING_CALL     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = X.A6J.A00(r0, r3)     // Catch:{ all -> 0x12fd }
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x12fd }
            X.11C r0 = r4.A00     // Catch:{ all -> 0x12fd }
            android.app.NotificationManager r1 = r0.A07()     // Catch:{ all -> 0x12fd }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x12fd }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x12fd }
            r0 = 64
            r1.cancel(r2, r0)     // Catch:{ all -> 0x12fd }
            X.19K r0 = r4.A03     // Catch:{ all -> 0x12fd }
            X.A7W r0 = X.AnonymousClass8BR.A0D(r0)     // Catch:{ all -> 0x12fd }
            r0.A09(r2)     // Catch:{ all -> 0x12fd }
            if (r3 == 0) goto L_0x0572
            X.00H r0 = r4.A07     // Catch:{ all -> 0x12fd }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x12fd }
            X.A1T r0 = (X.A1T) r0     // Catch:{ all -> 0x12fd }
            r0.A03(r3, r5)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "InactiveAccountNotificationManager/showCallNotifications"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            X.00H r0 = r4.A04     // Catch:{ all -> 0x12fd }
            X.1cN r1 = X.C17880vN.A0I(r0)     // Catch:{ all -> 0x12fd }
            r0 = 1
            X.2rb r0 = r1.A06(r3, r0, r0)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0572
            X.A6J.A01(r0, r4)     // Catch:{ all -> 0x12fd }
            goto L_0x0572
        L_0x07ac:
            java.lang.String r0 = "voip_call_offer_group"
        L_0x07ae:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0572
            r0 = r51
            X.A6J r4 = r0.A00     // Catch:{ all -> 0x12fd }
            X.98v r2 = (X.C1774998v) r2     // Catch:{ all -> 0x12fd }
            r8 = 1
            X.C18070vi.A0d(r2, r8)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "InactiveAccountNotificationManager/showRingingCallNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = r7.A07     // Catch:{ all -> 0x12fd }
            r22 = r0
            java.lang.String r0 = r2.A06     // Catch:{ all -> 0x12fd }
            r34 = r0
            java.lang.StringBuilder r5 = X.AnonymousClass000.A11(r34)     // Catch:{ all -> 0x12fd }
            X.9In r1 = X.C179579In.RINGING_CALL     // Catch:{ all -> 0x12fd }
            r0 = r22
            java.lang.String r0 = X.A6J.A00(r1, r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r6 = X.AnonymousClass000.A0y(r0, r5)     // Catch:{ all -> 0x12fd }
            com.whatsapp.jid.DeviceJid r0 = r2.A03     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x12f8
            com.whatsapp.jid.UserJid r0 = r0.userJid     // Catch:{ all -> 0x12fd }
            java.lang.String r18 = r0.getRawString()     // Catch:{ all -> 0x12fd }
            com.whatsapp.jid.DeviceJid r0 = r2.A04     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0810
            com.whatsapp.jid.UserJid r0 = r0.userJid     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0810
            java.lang.String r13 = r0.getRawString()     // Catch:{ all -> 0x12fd }
        L_0x07f1:
            boolean r10 = r2.A09     // Catch:{ all -> 0x12fd }
            java.lang.String r12 = r2.A07     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "voip_call_offer_group"
            boolean r14 = X.C18070vi.A18(r12, r0)     // Catch:{ all -> 0x12fd }
            X.00H r0 = r4.A08     // Catch:{ all -> 0x12fd }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x12fd }
            X.A4d r5 = (X.C20034A4d) r5     // Catch:{ all -> 0x12fd }
            r1 = r18
            r0 = r20
            java.lang.String r9 = r5.A02(r7, r1, r0, r13)     // Catch:{ all -> 0x12fd }
            X.118 r5 = r4.A02     // Catch:{ all -> 0x12fd }
            if (r14 == 0) goto L_0x081c
            goto L_0x0813
        L_0x0810:
            r13 = r20
            goto L_0x07f1
        L_0x0813:
            r1 = 2131891287(0x7f121457, float:1.941729E38)
            if (r10 == 0) goto L_0x0824
            r1 = 2131891286(0x7f121456, float:1.9417288E38)
            goto L_0x0824
        L_0x081c:
            r1 = 2131891289(0x7f121459, float:1.9417294E38)
            if (r10 == 0) goto L_0x0824
            r1 = 2131891288(0x7f121458, float:1.9417292E38)
        L_0x0824:
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ all -> 0x12fd }
            java.lang.String r17 = X.AnonymousClass8BS.A0f(r5, r9, r0, r3, r1)     // Catch:{ all -> 0x12fd }
            X.C18070vi.A0X(r17)     // Catch:{ all -> 0x12fd }
            java.lang.String r16 = r4.A03(r7)     // Catch:{ all -> 0x12fd }
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x12fd }
            long r0 = r2.A00     // Catch:{ all -> 0x12fd }
            long r9 = r2.A02     // Catch:{ all -> 0x12fd }
            long r0 = r0 + r9
            long r0 = r14.toMillis(r0)     // Catch:{ all -> 0x12fd }
            X.11P r10 = r4.A01     // Catch:{ all -> 0x12fd }
            long r14 = X.AnonymousClass11P.A01(r10)     // Catch:{ all -> 0x12fd }
            long r0 = r0 - r14
            r14 = 1000(0x3e8, double:4.94E-321)
            int r9 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r9 > 0) goto L_0x0885
            X.00H r0 = r4.A07     // Catch:{ all -> 0x12fd }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x12fd }
            X.A1T r1 = (X.A1T) r1     // Catch:{ all -> 0x12fd }
            long r23 = X.AnonymousClass11P.A01(r10)     // Catch:{ all -> 0x12fd }
            com.whatsapp.jid.GroupJid r0 = r2.A05     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0882
            java.lang.String r19 = r0.getRawString()     // Catch:{ all -> 0x12fd }
        L_0x085d:
            r25 = 1
            X.9ti r0 = new X.9ti     // Catch:{ all -> 0x12fd }
            r14 = r0
            r15 = r22
            r16 = r12
            r17 = r18
            r18 = r34
            r21 = r13
            r22 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r25)     // Catch:{ all -> 0x12fd }
            r1.A01(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "InactiveAccountNotificationManager/showRingingCallNotification/Inactive Account call expiry <= current time"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0572
            X.A6J.A01(r7, r4)     // Catch:{ all -> 0x12fd }
            goto L_0x0572
        L_0x0882:
            r19 = r20
            goto L_0x085d
        L_0x0885:
            long r14 = X.AnonymousClass9TL.A00     // Catch:{ all -> 0x12fd }
            int r9 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r9 >= 0) goto L_0x088c
            r0 = r14
        L_0x088c:
            X.00H r9 = r4.A07     // Catch:{ all -> 0x12fd }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x12fd }
            X.A1T r9 = (X.A1T) r9     // Catch:{ all -> 0x12fd }
            long r30 = X.AnonymousClass11P.A01(r10)     // Catch:{ all -> 0x12fd }
            com.whatsapp.jid.GroupJid r2 = r2.A05     // Catch:{ all -> 0x12fd }
            if (r2 == 0) goto L_0x09ba
            java.lang.String r26 = r2.getRawString()     // Catch:{ all -> 0x12fd }
        L_0x08a0:
            r32 = 1
            X.9ti r2 = new X.9ti     // Catch:{ all -> 0x12fd }
            r21 = r2
            r23 = r12
            r24 = r18
            r25 = r34
            r27 = r20
            r28 = r13
            r29 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)     // Catch:{ all -> 0x12fd }
            r9.A01(r2)     // Catch:{ all -> 0x12fd }
            X.9pH r14 = new X.9pH     // Catch:{ all -> 0x12fd }
            r14.<init>()     // Catch:{ all -> 0x12fd }
            java.lang.String r12 = "inactiveAccountNotificationId"
            r9 = 64
            java.util.Map r2 = r14.A00     // Catch:{ all -> 0x12fd }
            X.C17880vN.A1P(r12, r2, r9)     // Catch:{ all -> 0x12fd }
            java.lang.String r10 = "inactiveAccountNotificationLid"
            java.util.Map r13 = r14.A00     // Catch:{ all -> 0x12fd }
            r2 = r22
            r13.put(r10, r2)     // Catch:{ all -> 0x12fd }
            java.lang.String r10 = "inactiveAccountNotificationTag"
            r13.put(r10, r6)     // Catch:{ all -> 0x12fd }
            java.lang.String r2 = "inactiveAccountNotificationCallId"
            r15 = r34
            r13.put(r2, r15)     // Catch:{ all -> 0x12fd }
            X.A6Y r14 = r14.A00()     // Catch:{ all -> 0x12fd }
            java.lang.Class<com.whatsapp.accountswitching.notifications.InactiveAccountNotificationDismissWorker> r2 = com.whatsapp.accountswitching.notifications.InactiveAccountNotificationDismissWorker.class
            X.8Jt r13 = new X.8Jt     // Catch:{ all -> 0x12fd }
            r13.<init>(r2)     // Catch:{ all -> 0x12fd }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x12fd }
            r13.A02(r0, r2)     // Catch:{ all -> 0x12fd }
            r13.A04(r14)     // Catch:{ all -> 0x12fd }
            r13.A07(r6)     // Catch:{ all -> 0x12fd }
            X.9cO r1 = r13.A00()     // Catch:{ all -> 0x12fd }
            X.8Jv r1 = (X.C162248Jv) r1     // Catch:{ all -> 0x12fd }
            X.19K r0 = r4.A03     // Catch:{ all -> 0x12fd }
            X.A7W r0 = X.AnonymousClass8BR.A0D(r0)     // Catch:{ all -> 0x12fd }
            r0.A08(r1)     // Catch:{ all -> 0x12fd }
            android.content.Context r13 = r5.A00     // Catch:{ all -> 0x12fd }
            java.lang.Class<com.whatsapp.accountswitching.notifications.InactiveAccountNotificationReceiver> r0 = com.whatsapp.accountswitching.notifications.InactiveAccountNotificationReceiver.class
            android.content.Intent r1 = X.AnonymousClass8BR.A07(r13, r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "com.whatsapp.accountswitching.inactiveaccount.IgnoreCall"
            r1.setAction(r0)     // Catch:{ all -> 0x12fd }
            r1.putExtra(r12, r9)     // Catch:{ all -> 0x12fd }
            r1.putExtra(r10, r6)     // Catch:{ all -> 0x12fd }
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r14 = X.C1408573i.A01(r13, r3, r1, r0)     // Catch:{ all -> 0x12fd }
            X.C18070vi.A0X(r14)     // Catch:{ all -> 0x12fd }
            r2 = 2131231754(0x7f08040a, float:1.8079598E38)
            r0 = 2131898192(0x7f122f50, float:1.9431295E38)
            java.lang.String r0 = r5.A01(r0)     // Catch:{ all -> 0x12fd }
            X.6yd r1 = new X.6yd     // Catch:{ all -> 0x12fd }
            r1.<init>(r2, r0, r14)     // Catch:{ all -> 0x12fd }
            java.lang.String r7 = r7.A05     // Catch:{ all -> 0x12fd }
            r2 = 4
            X.C18070vi.A0X(r13)     // Catch:{ all -> 0x12fd }
            r0 = r22
            android.content.Intent r0 = X.AnonymousClass1LU.A1a(r13, r0, r7, r2, r3)     // Catch:{ all -> 0x12fd }
            r0.putExtra(r12, r9)     // Catch:{ all -> 0x12fd }
            r0.putExtra(r10, r6)     // Catch:{ all -> 0x12fd }
            android.app.PendingIntent r14 = X.C17880vN.A07(r13, r0, r3)     // Catch:{ all -> 0x12fd }
            X.C18070vi.A0X(r14)     // Catch:{ all -> 0x12fd }
            r2 = 2131231762(0x7f080412, float:1.8079614E38)
            r0 = 2131886391(0x7f120137, float:1.940736E38)
            java.lang.String r0 = r5.A01(r0)     // Catch:{ all -> 0x12fd }
            X.6yd r5 = new X.6yd     // Catch:{ all -> 0x12fd }
            r5.<init>(r2, r0, r14)     // Catch:{ all -> 0x12fd }
            r2 = 4
            r0 = r22
            android.content.Intent r7 = X.AnonymousClass1LU.A1a(r13, r0, r7, r2, r3)     // Catch:{ all -> 0x12fd }
            r7.putExtra(r12, r9)     // Catch:{ all -> 0x12fd }
            r7.putExtra(r10, r6)     // Catch:{ all -> 0x12fd }
            X.00H r0 = r4.A06     // Catch:{ all -> 0x12fd }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x12fd }
            X.2sq r4 = (X.C63302sq) r4     // Catch:{ all -> 0x12fd }
            X.C18070vi.A0d(r6, r8)     // Catch:{ all -> 0x12fd }
            r12 = 3
            r0 = r16
            X.C18070vi.A0d(r0, r12)     // Catch:{ all -> 0x12fd }
            X.118 r0 = r4.A00     // Catch:{ all -> 0x12fd }
            android.content.Context r10 = r0.A00     // Catch:{ all -> 0x12fd }
            X.73t r2 = X.C217217d.A03(r10)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "call"
            r2.A0L = r0     // Catch:{ all -> 0x12fd }
            r2.A03 = r8     // Catch:{ all -> 0x12fd }
            r2.A06(r12)     // Catch:{ all -> 0x12fd }
            r2.A0G(r8)     // Catch:{ all -> 0x12fd }
            r0 = r17
            r2.A0D(r0)     // Catch:{ all -> 0x12fd }
            r0 = r16
            r2.A0E(r0)     // Catch:{ all -> 0x12fd }
            java.util.ArrayList r0 = r2.A0Q     // Catch:{ all -> 0x12fd }
            r0.add(r1)     // Catch:{ all -> 0x12fd }
            r0.add(r5)     // Catch:{ all -> 0x12fd }
            android.app.PendingIntent r0 = X.C17880vN.A07(r10, r7, r3)     // Catch:{ all -> 0x12fd }
            r2.A0A = r0     // Catch:{ all -> 0x12fd }
            X.C17880vN.A1G(r2)     // Catch:{ all -> 0x12fd }
            r2.A0H(r8)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "critical_app_alerts@1"
            r2.A0M = r0     // Catch:{ all -> 0x12fd }
            r0 = r17
            r2.A0F(r0)     // Catch:{ all -> 0x12fd }
            X.1Vn r1 = r4.A01     // Catch:{ all -> 0x12fd }
            android.app.Notification r0 = r2.A05()     // Catch:{ all -> 0x12fd }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x12fd }
            r1.BkS(r6, r9, r0)     // Catch:{ all -> 0x12fd }
            goto L_0x0572
        L_0x09ba:
            r26 = r20
            goto L_0x08a0
        L_0x09be:
            java.lang.String r0 = "message"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x09d0
            goto L_0x0572
        L_0x09c8:
            java.lang.String r0 = "group_message"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0572
        L_0x09d0:
            r0 = r51
            X.A6J r8 = r0.A00     // Catch:{ all -> 0x12fd }
            if (r10 != 0) goto L_0x09dc
            X.11P r0 = r0.A01     // Catch:{ all -> 0x12fd }
            long r12 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x12fd }
        L_0x09dc:
            java.lang.String r0 = "InactiveAccountNotificationManager/processMessageNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            X.00H r0 = r8.A04     // Catch:{ all -> 0x12fd }
            X.1cN r5 = X.C17880vN.A0I(r0)     // Catch:{ all -> 0x12fd }
            r16 = 1
            r4 = r16
            X.2rb r0 = r5.A06(r6, r4, r4)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0fbb
            boolean r4 = r2 instanceof X.C1774898u     // Catch:{ all -> 0x12fd }
            if (r4 == 0) goto L_0x0fbb
            X.98u r2 = (X.C1774898u) r2     // Catch:{ all -> 0x12fd }
            X.00H r14 = r8.A07     // Catch:{ all -> 0x12fd }
            java.lang.Object r9 = r14.get()     // Catch:{ all -> 0x12fd }
            X.A1T r9 = (X.A1T) r9     // Catch:{ all -> 0x12fd }
            X.1BI r4 = r2.A00     // Catch:{ all -> 0x12fd }
            r23 = r4
            java.lang.String r5 = r23.getRawString()     // Catch:{ all -> 0x12fd }
            r4 = r16
            X.C18070vi.A0d(r5, r4)     // Catch:{ all -> 0x12fd }
            java.lang.String[] r10 = X.C17880vN.A1Z()     // Catch:{ all -> 0x12fd }
            java.lang.String r18 = "message"
            r10[r3] = r18     // Catch:{ all -> 0x12fd }
            java.lang.String r17 = "group_message"
            r22 = 1
            r10[r16] = r17     // Catch:{ all -> 0x12fd }
            java.lang.String[] r15 = new java.lang.String[r4]     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = r0.A07     // Catch:{ all -> 0x12fd }
            r19 = r4
            r15[r3] = r4     // Catch:{ all -> 0x12fd }
            java.lang.Object[] r10 = X.C200310o.A0F(r15, r10)     // Catch:{ all -> 0x12fd }
            r4 = r16
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x12fd }
            r4[r3] = r5     // Catch:{ all -> 0x12fd }
            java.lang.Object[] r10 = X.C200310o.A0F(r10, r4)     // Catch:{ all -> 0x12fd }
            r4 = r16
            java.lang.String[] r15 = new java.lang.String[r4]     // Catch:{ all -> 0x12fd }
            long r4 = r0.A03     // Catch:{ all -> 0x12fd }
            java.lang.String r24 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x12fd }
            r15[r3] = r24     // Catch:{ all -> 0x12fd }
            java.lang.Object[] r10 = X.C200310o.A0F(r10, r15)     // Catch:{ all -> 0x12fd }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x12fd }
            X.00H r4 = r9.A00     // Catch:{ all -> 0x0abd }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0abd }
            X.2Df r4 = (X.AnonymousClass2Df) r4     // Catch:{ all -> 0x0abd }
            X.1at r9 = r4.get()     // Catch:{ all -> 0x0abd }
            r4 = r9
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x0ab6 }
            X.1Ev r15 = r4.A02     // Catch:{ all -> 0x0ab6 }
            r21 = 2
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0ab6 }
            java.lang.String r4 = "SELECT sender_jid FROM notifications WHERE account_lid = ? AND notification_type IN "
            r5.append(r4)     // Catch:{ all -> 0x0ab6 }
            java.lang.String r4 = X.AnonymousClass1H2.A00(r21)     // Catch:{ all -> 0x0ab6 }
            r5.append(r4)     // Catch:{ all -> 0x0ab6 }
            java.lang.String r4 = " AND sender_jid = ? AND timestamp >= ?"
            java.lang.String r5 = X.AnonymousClass000.A0y(r4, r5)     // Catch:{ all -> 0x0ab6 }
            java.lang.String r4 = "GET_SENDERS_FOR_NOT_LID_AND_NOTIFICATION_TYPE"
            android.database.Cursor r5 = r15.A0A(r5, r4, r10)     // Catch:{ all -> 0x0ab6 }
            int r4 = r5.getCount()     // Catch:{ all -> 0x0aaf }
            if (r4 > 0) goto L_0x0a79
            r22 = 0
        L_0x0a79:
            r5.close()     // Catch:{ all -> 0x0ab6 }
            r9.close()     // Catch:{ all -> 0x0abd }
            if (r22 == 0) goto L_0x0acb
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x12fd }
            X.11P r4 = r8.A01     // Catch:{ all -> 0x12fd }
            long r4 = X.AnonymousClass11P.A01(r4)     // Catch:{ all -> 0x12fd }
            long r9 = r0.A04     // Catch:{ all -> 0x12fd }
            long r4 = r4 - r9
            long r21 = r15.toSeconds(r4)     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = r2.A03     // Catch:{ all -> 0x12fd }
            r5 = r18
            boolean r5 = X.C18070vi.A18(r4, r5)     // Catch:{ all -> 0x12fd }
            if (r5 == 0) goto L_0x0a9d
            r9 = 30
            goto L_0x0aa7
        L_0x0a9d:
            r5 = r17
            boolean r4 = X.C18070vi.A18(r4, r5)     // Catch:{ all -> 0x12fd }
            if (r4 == 0) goto L_0x0aac
            r9 = 120(0x78, double:5.93E-322)
        L_0x0aa7:
            int r4 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0aac
            goto L_0x0acb
        L_0x0aac:
            r16 = 0
            goto L_0x0af4
        L_0x0aaf:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0ab1 }
        L_0x0ab1:
            r10 = move-exception
            X.CDX.A00(r5, r4)     // Catch:{ all -> 0x0ab6 }
            throw r10     // Catch:{ all -> 0x0ab6 }
        L_0x0ab6:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0ab8 }
        L_0x0ab8:
            r5 = move-exception
            X.CDX.A00(r9, r4)     // Catch:{ all -> 0x0abd }
            throw r5     // Catch:{ all -> 0x0abd }
        L_0x0abd:
            r4 = move-exception
            X.1IU r4 = X.C108945cZ.A1J(r4)     // Catch:{ all -> 0x12fd }
            java.lang.Throwable r5 = r4.exception     // Catch:{ all -> 0x12fd }
            if (r5 == 0) goto L_0x0acb
            java.lang.String r4 = "InactiveNotificationsStore/doesMessageSenderExist/failed"
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ all -> 0x12fd }
        L_0x0acb:
            X.00H r4 = r8.A05     // Catch:{ all -> 0x12fd }
            X.2u4 r10 = X.C17880vN.A0J(r4)     // Catch:{ all -> 0x12fd }
            X.11P r4 = r8.A01     // Catch:{ all -> 0x12fd }
            long r4 = X.AnonymousClass11P.A01(r4)     // Catch:{ all -> 0x12fd }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r9 = "AccountSwitchingDataRepo/updateLastBuzzedTime/"
            X.AnonymousClass8BW.A18(r0, r9, r15)     // Catch:{ all -> 0x12fd }
            java.lang.String r9 = "/lastBuzzedTimeMs:"
            X.C17900vP.A0m(r9, r15, r4)     // Catch:{ all -> 0x12fd }
            X.2mj r9 = X.C64012u4.A01(r10)     // Catch:{ all -> 0x12fd }
            X.2rb r25 = X.C64012u4.A02(r9, r0)     // Catch:{ all -> 0x12fd }
            if (r25 != 0) goto L_0x0b90
            java.lang.String r4 = "AccountSwitchingDataRepo/updateLastBuzzedTime/Account doesn't exist"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ all -> 0x12fd }
        L_0x0af4:
            java.lang.Object r4 = r14.get()     // Catch:{ all -> 0x12fd }
            X.A1T r4 = (X.A1T) r4     // Catch:{ all -> 0x12fd }
            java.lang.String r28 = r23.getRawString()     // Catch:{ all -> 0x12fd }
            com.whatsapp.jid.GroupJid r5 = r2.A02     // Catch:{ all -> 0x12fd }
            r32 = 0
            if (r5 == 0) goto L_0x0b8c
            java.lang.String r30 = r5.getRawString()     // Catch:{ all -> 0x12fd }
        L_0x0b08:
            java.lang.String r5 = r2.A05     // Catch:{ all -> 0x12fd }
            X.1BI r2 = r2.A01     // Catch:{ all -> 0x12fd }
            if (r2 == 0) goto L_0x0b12
            java.lang.String r32 = r2.getRawString()     // Catch:{ all -> 0x12fd }
        L_0x0b12:
            r36 = 1
            X.9ti r2 = new X.9ti     // Catch:{ all -> 0x12fd }
            r25 = r2
            r26 = r6
            r27 = r1
            r29 = r20
            r31 = r5
            r33 = r3
            r34 = r12
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)     // Catch:{ all -> 0x12fd }
            r4.A01(r2)     // Catch:{ all -> 0x12fd }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = "InactiveAccountNotificationManager/showMessageNotifications/"
            r2.append(r1)     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = X.C49842Sd.A00(r0)     // Catch:{ all -> 0x12fd }
            X.C17890vO.A1A(r2, r1)     // Catch:{ all -> 0x12fd }
            java.lang.String r5 = r0.A05     // Catch:{ all -> 0x12fd }
            r4 = 3
            X.118 r1 = r8.A02     // Catch:{ all -> 0x12fd }
            r29 = r1
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x12fd }
            r28 = r1
            X.C18070vi.A0X(r28)     // Catch:{ all -> 0x12fd }
            r2 = r1
            r1 = r19
            android.content.Intent r22 = X.AnonymousClass1LU.A1a(r2, r1, r5, r4, r3)     // Catch:{ all -> 0x12fd }
            X.00H r1 = r8.A08     // Catch:{ all -> 0x12fd }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x12fd }
            X.A4d r2 = (X.C20034A4d) r2     // Catch:{ all -> 0x12fd }
            java.util.ArrayList r21 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x12fd }
            X.00H r14 = r2.A03     // Catch:{ all -> 0x12fd }
            java.lang.Object r1 = r14.get()     // Catch:{ all -> 0x12fd }
            X.A8T r1 = (X.A8T) r1     // Catch:{ all -> 0x12fd }
            java.io.File r5 = r1.A0C(r0)     // Catch:{ all -> 0x12fd }
            if (r5 == 0) goto L_0x0c22
            boolean r4 = r5.exists()     // Catch:{ all -> 0x12fd }
            if (r4 == 0) goto L_0x0c22
            java.lang.String r4 = r5.getAbsolutePath()     // Catch:{ all -> 0x12fd }
            java.lang.String r12 = "chatsettings.db"
            java.io.File r4 = X.AnonymousClass8BR.A0u(r4, r12)     // Catch:{ all -> 0x12fd }
            X.1CO r10 = r1.A01     // Catch:{ all -> 0x12fd }
            X.00H r1 = r1.A06     // Catch:{ all -> 0x12fd }
            java.lang.Object r5 = r1.get()     // Catch:{ all -> 0x12fd }
            X.1CP r5 = (X.AnonymousClass1CP) r5     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x12fd }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x12fd }
            goto L_0x0bad
        L_0x0b8c:
            r30 = r20
            goto L_0x0b08
        L_0x0b90:
            r32 = 1791(0x6ff, float:2.51E-42)
            r33 = 0
            r27 = r20
            r28 = r20
            r29 = r20
            r31 = r3
            r37 = r3
            r26 = r20
            r30 = r3
            r35 = r4
            X.2rb r4 = X.C62562rb.A00(r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37)     // Catch:{ all -> 0x12fd }
            X.C64012u4.A07(r9, r10, r4)     // Catch:{ all -> 0x12fd }
            goto L_0x0af4
        L_0x0bad:
            r1 = r20
            android.database.sqlite.SQLiteDatabase r9 = android.database.sqlite.SQLiteDatabase.openDatabase(r4, r1, r3)     // Catch:{ SQLiteException -> 0x0c1b }
            X.1Ev r12 = X.AnonymousClass1Eu.A03(r9, r5, r10, r12)     // Catch:{ all -> 0x0c0f }
            java.lang.String r10 = "SELECT jid, mute_end FROM settings WHERE muted_notifications = ? AND (mute_end > ? OR mute_end = ? ) ORDER BY jid ASC"
            java.lang.String[] r1 = X.AnonymousClass8BR.A1b()     // Catch:{ SQLiteException -> 0x0c03 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x0c03 }
            r1[r3] = r4     // Catch:{ SQLiteException -> 0x0c03 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x0c03 }
            X.C17890vO.A1K(r1, r4)     // Catch:{ SQLiteException -> 0x0c03 }
            r4 = -1
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x0c03 }
            r4 = 2
            r1[r4] = r5     // Catch:{ SQLiteException -> 0x0c03 }
            java.lang.String r4 = "GET_INACTIVE_ACCOUNT_MUTED_CHAT_JID_WITH_END_TIME_SORTED"
            android.database.Cursor r5 = r12.A0A(r10, r4, r1)     // Catch:{ SQLiteException -> 0x0c03 }
            java.lang.String r1 = "jid"
            int r4 = r5.getColumnIndex(r1)     // Catch:{ all -> 0x0bf7 }
        L_0x0bdf:
            boolean r1 = r5.moveToNext()     // Catch:{ all -> 0x0bf7 }
            if (r1 == 0) goto L_0x0bf3
            java.lang.String r1 = r5.getString(r4)     // Catch:{ all -> 0x0bf7 }
            X.1BI r1 = X.AnonymousClass3MX.A0l(r1)     // Catch:{ all -> 0x0bf7 }
            if (r1 == 0) goto L_0x0bdf
            r6.add(r1)     // Catch:{ all -> 0x0bf7 }
            goto L_0x0bdf
        L_0x0bf3:
            r5.close()     // Catch:{ SQLiteException -> 0x0c03 }
            goto L_0x0c09
        L_0x0bf7:
            r1 = move-exception
            if (r5 == 0) goto L_0x0c02
            r5.close()     // Catch:{ all -> 0x0bfe }
            goto L_0x0c02
        L_0x0bfe:
            r4 = move-exception
            X.AnonymousClass0DT.A00(r1, r4)     // Catch:{ SQLiteException -> 0x0c03 }
        L_0x0c02:
            throw r1     // Catch:{ SQLiteException -> 0x0c03 }
        L_0x0c03:
            r4 = move-exception
            java.lang.String r1 = "/getInactiveAccountMutedChatsList"
            com.whatsapp.util.Log.e(r1, r4)     // Catch:{ all -> 0x0c0f }
        L_0x0c09:
            if (r9 == 0) goto L_0x0c3b
            r9.close()     // Catch:{ SQLiteException -> 0x0c1b }
            goto L_0x0c3b
        L_0x0c0f:
            r1 = move-exception
            if (r9 == 0) goto L_0x0c1a
            r9.close()     // Catch:{ all -> 0x0c16 }
            goto L_0x0c1a
        L_0x0c16:
            r4 = move-exception
            X.AnonymousClass0DT.A00(r1, r4)     // Catch:{ SQLiteException -> 0x0c1b }
        L_0x0c1a:
            throw r1     // Catch:{ SQLiteException -> 0x0c1b }
        L_0x0c1b:
            r4 = move-exception
            java.lang.String r1 = "ChatStore/getInactiveAccountMutedChatsList"
            com.whatsapp.util.Log.e(r1, r4)     // Catch:{ all -> 0x12fd }
            goto L_0x0c3b
        L_0x0c22:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = "AccountSwitchingFileManager/getInactiveAccountMutedChats/account "
            X.AnonymousClass8BW.A18(r0, r4, r5)     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = " databases dir does not exist"
            X.C17890vO.A1A(r5, r4)     // Catch:{ all -> 0x12fd }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = "AccountSwitchingFileManager/getInactiveAccountMutedChats/stagingDirLogString/"
            X.AnonymousClass8BX.A16(r1, r4, r5)     // Catch:{ all -> 0x12fd }
            X.0wS r6 = X.C18460wS.A00     // Catch:{ all -> 0x12fd }
        L_0x0c3b:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x12fd }
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x12fd }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x12fd }
        L_0x0c47:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x12fd }
            if (r6 == 0) goto L_0x0c51
            A00(r4, r1, r5)     // Catch:{ all -> 0x12fd }
            goto L_0x0c47
        L_0x0c51:
            X.1D6 r4 = X.AnonymousClass1D6.A01(r4, r1)     // Catch:{ all -> 0x12fd }
            java.lang.Object r1 = r4.first     // Catch:{ all -> 0x12fd }
            r23 = r1
            r1 = r23
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x12fd }
            r23 = r1
            java.lang.Object r13 = r4.second     // Catch:{ all -> 0x12fd }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x12fd }
            java.lang.Object r4 = r14.get()     // Catch:{ all -> 0x12fd }
            X.A8T r4 = (X.A8T) r4     // Catch:{ all -> 0x12fd }
            java.io.File r5 = r4.A0C(r0)     // Catch:{ all -> 0x12fd }
            if (r5 == 0) goto L_0x0cea
            boolean r1 = r5.exists()     // Catch:{ all -> 0x12fd }
            if (r1 == 0) goto L_0x0cea
            java.lang.String r1 = r5.getAbsolutePath()     // Catch:{ all -> 0x12fd }
            java.lang.String r6 = "msgstore.db"
            java.io.File r9 = X.AnonymousClass8BR.A0u(r1, r6)     // Catch:{ all -> 0x12fd }
            X.1CO r5 = r4.A01     // Catch:{ all -> 0x12fd }
            X.00H r1 = r4.A06     // Catch:{ all -> 0x12fd }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x12fd }
            X.1CP r4 = (X.AnonymousClass1CP) r4     // Catch:{ all -> 0x12fd }
            java.lang.String r12 = r9.getAbsolutePath()     // Catch:{ all -> 0x12fd }
            java.lang.String r9 = "ChatStore/getInactiveAccountArchivedChatsList"
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x12fd }
            r1 = r20
            android.database.sqlite.SQLiteDatabase r12 = android.database.sqlite.SQLiteDatabase.openDatabase(r12, r1, r3)     // Catch:{ RuntimeException -> 0x0ce5 }
            X.1Ev r6 = X.AnonymousClass1Eu.A03(r12, r4, r5, r6)     // Catch:{ all -> 0x0cd9 }
            java.lang.String r5 = "SELECT jid.raw_string FROM chat_view LEFT JOIN jid ON jid_row_id = jid._id WHERE archived = 1"
            java.lang.String r4 = "GET_INACTIVE_ACCOUNT_ARCHIVED_CHAT_JID"
            android.database.Cursor r5 = r6.A0A(r5, r4, r1)     // Catch:{ RuntimeException -> 0x0ccf }
            java.lang.String r1 = "raw_string"
            int r4 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0cc3 }
        L_0x0cab:
            boolean r1 = r5.moveToNext()     // Catch:{ all -> 0x0cc3 }
            if (r1 == 0) goto L_0x0cbf
            java.lang.String r1 = r5.getString(r4)     // Catch:{ all -> 0x0cc3 }
            X.1BI r1 = X.AnonymousClass3MX.A0l(r1)     // Catch:{ all -> 0x0cc3 }
            if (r1 == 0) goto L_0x0cab
            r10.add(r1)     // Catch:{ all -> 0x0cc3 }
            goto L_0x0cab
        L_0x0cbf:
            r5.close()     // Catch:{ RuntimeException -> 0x0ccf }
            goto L_0x0cd3
        L_0x0cc3:
            r4 = move-exception
            if (r5 == 0) goto L_0x0cce
            r5.close()     // Catch:{ all -> 0x0cca }
            goto L_0x0cce
        L_0x0cca:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r4, r1)     // Catch:{ RuntimeException -> 0x0ccf }
        L_0x0cce:
            throw r4     // Catch:{ RuntimeException -> 0x0ccf }
        L_0x0ccf:
            r1 = move-exception
            com.whatsapp.util.Log.e(r9, r1)     // Catch:{ all -> 0x0cd9 }
        L_0x0cd3:
            if (r12 == 0) goto L_0x0d03
            r12.close()     // Catch:{ RuntimeException -> 0x0ce5 }
            goto L_0x0d03
        L_0x0cd9:
            r4 = move-exception
            if (r12 == 0) goto L_0x0ce4
            r12.close()     // Catch:{ all -> 0x0ce0 }
            goto L_0x0ce4
        L_0x0ce0:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r4, r1)     // Catch:{ RuntimeException -> 0x0ce5 }
        L_0x0ce4:
            throw r4     // Catch:{ RuntimeException -> 0x0ce5 }
        L_0x0ce5:
            r1 = move-exception
            com.whatsapp.util.Log.e(r9, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0d03
        L_0x0cea:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = "AccountSwitchingFileManager/getInactiveAccountArchivedChats/account "
            X.AnonymousClass8BW.A18(r0, r1, r5)     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = " databases dir does not exist"
            X.C17890vO.A1A(r5, r1)     // Catch:{ all -> 0x12fd }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = "AccountSwitchingFileManager/getInactiveAccountArchivedChats/stagingDirLogString/"
            X.AnonymousClass8BX.A16(r4, r1, r5)     // Catch:{ all -> 0x12fd }
            X.0wS r10 = X.C18460wS.A00     // Catch:{ all -> 0x12fd }
        L_0x0d03:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x12fd }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x12fd }
            java.util.Iterator r1 = r10.iterator()     // Catch:{ all -> 0x12fd }
        L_0x0d0f:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x12fd }
            if (r6 == 0) goto L_0x0d19
            A00(r5, r4, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0d0f
        L_0x0d19:
            X.1D6 r1 = X.AnonymousClass1D6.A01(r5, r4)     // Catch:{ all -> 0x12fd }
            java.lang.Object r12 = r1.first     // Catch:{ all -> 0x12fd }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x12fd }
            java.lang.Object r10 = r1.second     // Catch:{ all -> 0x12fd }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x12fd }
            java.lang.Object r5 = r14.get()     // Catch:{ all -> 0x12fd }
            X.A8T r5 = (X.A8T) r5     // Catch:{ all -> 0x12fd }
            java.io.File r4 = r5.A0C(r0)     // Catch:{ all -> 0x12fd }
            if (r4 == 0) goto L_0x0dae
            boolean r1 = r4.exists()     // Catch:{ all -> 0x12fd }
            if (r1 == 0) goto L_0x0dae
            java.lang.String r1 = r4.getAbsolutePath()     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = "msgstore.db"
            java.io.File r6 = X.AnonymousClass8BR.A0u(r1, r4)     // Catch:{ all -> 0x12fd }
            X.1CO r15 = r5.A01     // Catch:{ all -> 0x12fd }
            X.00H r1 = r5.A06     // Catch:{ all -> 0x12fd }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x12fd }
            X.1CP r1 = (X.AnonymousClass1CP) r1     // Catch:{ all -> 0x12fd }
            java.lang.String r14 = r6.getAbsolutePath()     // Catch:{ all -> 0x12fd }
            java.lang.String r6 = "ChatStore/getInactiveAccountLockedChatsList"
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x12fd }
            r5 = r20
            android.database.sqlite.SQLiteDatabase r5 = android.database.sqlite.SQLiteDatabase.openDatabase(r14, r5, r3)     // Catch:{ RuntimeException -> 0x0da9 }
            X.1Ev r15 = X.AnonymousClass1Eu.A03(r5, r1, r15, r4)     // Catch:{ all -> 0x0d9d }
            java.lang.String r14 = "SELECT jid.raw_string FROM chat_view LEFT JOIN jid ON jid_row_id = jid._id WHERE chat_lock > 0"
            java.lang.String r4 = "GET_INACTIVE_ACCOUNT_LOCKED_CHAT_JID"
            r1 = r20
            android.database.Cursor r4 = r15.A0A(r14, r4, r1)     // Catch:{ RuntimeException -> 0x0d93 }
            java.lang.String r1 = "raw_string"
            int r14 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0d87 }
        L_0x0d6f:
            boolean r1 = r4.moveToNext()     // Catch:{ all -> 0x0d87 }
            if (r1 == 0) goto L_0x0d83
            java.lang.String r1 = r4.getString(r14)     // Catch:{ all -> 0x0d87 }
            X.1BI r1 = X.AnonymousClass3MX.A0l(r1)     // Catch:{ all -> 0x0d87 }
            if (r1 == 0) goto L_0x0d6f
            r9.add(r1)     // Catch:{ all -> 0x0d87 }
            goto L_0x0d6f
        L_0x0d83:
            r4.close()     // Catch:{ RuntimeException -> 0x0d93 }
            goto L_0x0d97
        L_0x0d87:
            r1 = move-exception
            if (r4 == 0) goto L_0x0d92
            r4.close()     // Catch:{ all -> 0x0d8e }
            goto L_0x0d92
        L_0x0d8e:
            r4 = move-exception
            X.AnonymousClass0DT.A00(r1, r4)     // Catch:{ RuntimeException -> 0x0d93 }
        L_0x0d92:
            throw r1     // Catch:{ RuntimeException -> 0x0d93 }
        L_0x0d93:
            r1 = move-exception
            com.whatsapp.util.Log.e(r6, r1)     // Catch:{ all -> 0x0d9d }
        L_0x0d97:
            if (r5 == 0) goto L_0x0dc7
            r5.close()     // Catch:{ RuntimeException -> 0x0da9 }
            goto L_0x0dc7
        L_0x0d9d:
            r4 = move-exception
            if (r5 == 0) goto L_0x0da8
            r5.close()     // Catch:{ all -> 0x0da4 }
            goto L_0x0da8
        L_0x0da4:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r4, r1)     // Catch:{ RuntimeException -> 0x0da9 }
        L_0x0da8:
            throw r4     // Catch:{ RuntimeException -> 0x0da9 }
        L_0x0da9:
            r1 = move-exception
            com.whatsapp.util.Log.e(r6, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0dc7
        L_0x0dae:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = "AccountSwitchingFileManager/getInactiveAccountLockedChats/account "
            X.AnonymousClass8BW.A18(r0, r1, r4)     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = " databases dir does not exist"
            X.C17890vO.A1A(r4, r1)     // Catch:{ all -> 0x12fd }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = "AccountSwitchingFileManager/getInactiveAccountLockedChats/stagingDirLogString/"
            X.AnonymousClass8BX.A16(r5, r1, r4)     // Catch:{ all -> 0x12fd }
            X.0wS r9 = X.C18460wS.A00     // Catch:{ all -> 0x12fd }
        L_0x0dc7:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x12fd }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x12fd }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x12fd }
        L_0x0dd3:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x12fd }
            if (r6 == 0) goto L_0x0ddd
            A00(r5, r4, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0dd3
        L_0x0ddd:
            X.1D6 r1 = X.AnonymousClass1D6.A01(r5, r4)     // Catch:{ all -> 0x12fd }
            java.lang.Object r9 = r1.first     // Catch:{ all -> 0x12fd }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x12fd }
            java.lang.Object r6 = r1.second     // Catch:{ all -> 0x12fd }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x12fd }
            java.util.ArrayList r5 = X.C29351c6.A0E(r23)     // Catch:{ all -> 0x12fd }
            java.util.Iterator r1 = r23.iterator()     // Catch:{ all -> 0x12fd }
        L_0x0df1:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x12fd }
            if (r4 == 0) goto L_0x0dfb
            X.AnonymousClass8BX.A1N(r5, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0df1
        L_0x0dfb:
            java.util.ArrayList r4 = X.C29351c6.A0E(r12)     // Catch:{ all -> 0x12fd }
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x12fd }
        L_0x0e03:
            boolean r12 = r1.hasNext()     // Catch:{ all -> 0x12fd }
            if (r12 == 0) goto L_0x0e0d
            X.AnonymousClass8BX.A1N(r4, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0e03
        L_0x0e0d:
            java.util.ArrayList r5 = X.C29431cG.A0k(r4, r5)     // Catch:{ all -> 0x12fd }
            java.util.ArrayList r4 = X.C29351c6.A0E(r9)     // Catch:{ all -> 0x12fd }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x12fd }
        L_0x0e19:
            boolean r9 = r1.hasNext()     // Catch:{ all -> 0x12fd }
            if (r9 == 0) goto L_0x0e23
            X.AnonymousClass8BX.A1N(r4, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0e19
        L_0x0e23:
            java.util.ArrayList r9 = X.C29431cG.A0k(r4, r5)     // Catch:{ all -> 0x12fd }
            java.util.ArrayList r5 = X.C29351c6.A0E(r13)     // Catch:{ all -> 0x12fd }
            java.util.Iterator r1 = r13.iterator()     // Catch:{ all -> 0x12fd }
        L_0x0e2f:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x12fd }
            if (r4 == 0) goto L_0x0e39
            X.AnonymousClass8BX.A1N(r5, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0e2f
        L_0x0e39:
            java.util.ArrayList r4 = X.C29351c6.A0E(r10)     // Catch:{ all -> 0x12fd }
            java.util.Iterator r1 = r10.iterator()     // Catch:{ all -> 0x12fd }
        L_0x0e41:
            boolean r10 = r1.hasNext()     // Catch:{ all -> 0x12fd }
            if (r10 == 0) goto L_0x0e4b
            X.AnonymousClass8BX.A1N(r4, r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0e41
        L_0x0e4b:
            java.util.ArrayList r4 = X.C29431cG.A0k(r4, r5)     // Catch:{ all -> 0x12fd }
            java.util.ArrayList r1 = X.C29351c6.A0E(r6)     // Catch:{ all -> 0x12fd }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x12fd }
        L_0x0e57:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x12fd }
            if (r6 == 0) goto L_0x0e61
            X.AnonymousClass8BX.A1N(r1, r5)     // Catch:{ all -> 0x12fd }
            goto L_0x0e57
        L_0x0e61:
            java.util.ArrayList r4 = X.C29431cG.A0k(r1, r4)     // Catch:{ all -> 0x12fd }
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x12fd }
            java.lang.Object[] r5 = r9.toArray(r1)     // Catch:{ all -> 0x12fd }
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x12fd }
            java.lang.Object[] r1 = r4.toArray(r1)     // Catch:{ all -> 0x12fd }
            X.1D6 r1 = X.AnonymousClass1D6.A01(r5, r1)     // Catch:{ all -> 0x12fd }
            X.00H r4 = r2.A04     // Catch:{ all -> 0x12fd }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x12fd }
            X.A1T r5 = (X.A1T) r5     // Catch:{ all -> 0x12fd }
            java.lang.Object r12 = r1.first     // Catch:{ all -> 0x12fd }
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch:{ all -> 0x12fd }
            java.lang.Object r10 = r1.second     // Catch:{ all -> 0x12fd }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x12fd }
            monitor-enter(r5)     // Catch:{ all -> 0x12fd }
            r6 = 1
            int r9 = X.C72453Mb.A0G(r12, r10, r6)     // Catch:{ all -> 0x12f5 }
            java.lang.String r1 = "InactiveNotificationsStore/readAllUnreadMessageNotifications"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x12f5 }
            r4 = r18
            r1 = r17
            java.lang.String[] r4 = X.C17880vN.A1b(r4, r1, r9, r6)     // Catch:{ all -> 0x12f5 }
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x12f5 }
            r1[r3] = r19     // Catch:{ all -> 0x12f5 }
            java.lang.Object[] r1 = X.C200310o.A0F(r1, r4)     // Catch:{ all -> 0x12f5 }
            java.lang.Object[] r1 = X.C200310o.A0F(r1, r12)     // Catch:{ all -> 0x12f5 }
            java.lang.Object[] r4 = X.C200310o.A0F(r1, r10)     // Catch:{ all -> 0x12f5 }
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x12f5 }
            r1[r3] = r24     // Catch:{ all -> 0x12f5 }
            java.lang.Object[] r9 = X.C200310o.A0F(r4, r1)     // Catch:{ all -> 0x12f5 }
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ all -> 0x12f5 }
            X.00H r1 = r5.A00     // Catch:{ all -> 0x0f92 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0f92 }
            X.2Df r1 = (X.AnonymousClass2Df) r1     // Catch:{ all -> 0x0f92 }
            X.1at r25 = r1.get()     // Catch:{ all -> 0x0f92 }
            r1 = r25
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x0f89 }
            X.1Ev r6 = r1.A02     // Catch:{ all -> 0x0f89 }
            int r13 = r12.length     // Catch:{ all -> 0x0f89 }
            int r12 = r10.length     // Catch:{ all -> 0x0f89 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0f89 }
            java.lang.String r1 = "SELECT account_lid, notification_type, sender_jid, timestamp, group_jid, display_name, count, sender_pn_jid FROM notifications WHERE account_lid = ? AND notification_type IN (?,?) AND "
            java.lang.StringBuilder r10 = X.AnonymousClass8BT.A0y(r1, r4)     // Catch:{ all -> 0x0f89 }
            if (r13 <= 0) goto L_0x0ee8
            java.lang.String r1 = "CASE WHEN group_jid IS NULL OR group_jid == '' "
            r10.append(r1)     // Catch:{ all -> 0x0f89 }
            java.lang.String r1 = "THEN sender_jid NOT IN "
            r10.append(r1)     // Catch:{ all -> 0x0f89 }
            java.lang.String r1 = X.AnonymousClass1H2.A00(r13)     // Catch:{ all -> 0x0f89 }
            r10.append(r1)     // Catch:{ all -> 0x0f89 }
            java.lang.String r1 = "ELSE 1 END AND "
            r10.append(r1)     // Catch:{ all -> 0x0f89 }
        L_0x0ee8:
            if (r12 <= 0) goto L_0x0efb
            java.lang.String r1 = "group_jid NOT IN "
            r10.append(r1)     // Catch:{ all -> 0x0f89 }
            java.lang.String r1 = X.AnonymousClass1H2.A00(r12)     // Catch:{ all -> 0x0f89 }
            r10.append(r1)     // Catch:{ all -> 0x0f89 }
            java.lang.String r1 = " AND "
            r10.append(r1)     // Catch:{ all -> 0x0f89 }
        L_0x0efb:
            java.lang.String r1 = X.C18070vi.A0H(r10)     // Catch:{ all -> 0x0f89 }
            r4.append(r1)     // Catch:{ all -> 0x0f89 }
            java.lang.String r1 = "timestamp >= ? ORDER BY timestamp DESC"
            java.lang.String r4 = X.AnonymousClass000.A0y(r1, r4)     // Catch:{ all -> 0x0f89 }
            java.lang.String r1 = "GET_ALL_MSG_AND_GROUP_MSG_NOTIFICATIONS_SQL"
            android.database.Cursor r1 = X.C18070vi.A04(r6, r4, r1, r9)     // Catch:{ all -> 0x0f89 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0f82 }
            java.lang.String r6 = "account_lid"
            int r24 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x0f82 }
            java.lang.String r6 = "notification_type"
            int r23 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x0f82 }
            java.lang.String r6 = "sender_jid"
            int r15 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x0f82 }
            java.lang.String r6 = "timestamp"
            int r14 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x0f82 }
            java.lang.String r6 = "group_jid"
            int r13 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x0f82 }
            java.lang.String r6 = "display_name"
            int r12 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x0f82 }
            java.lang.String r6 = "count"
            int r10 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x0f82 }
            java.lang.String r6 = "sender_pn_jid"
            int r9 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x0f82 }
        L_0x0f42:
            boolean r6 = r1.moveToNext()     // Catch:{ all -> 0x0f82 }
            if (r6 == 0) goto L_0x0f7b
            r6 = r24
            java.lang.String r39 = X.AnonymousClass8BS.A0c(r1, r6)     // Catch:{ all -> 0x0f82 }
            r6 = r23
            java.lang.String r40 = X.AnonymousClass8BS.A0c(r1, r6)     // Catch:{ all -> 0x0f82 }
            java.lang.String r41 = X.AnonymousClass8BS.A0c(r1, r15)     // Catch:{ all -> 0x0f82 }
            long r47 = r1.getLong(r14)     // Catch:{ all -> 0x0f82 }
            java.lang.String r43 = r1.getString(r13)     // Catch:{ all -> 0x0f82 }
            java.lang.String r44 = r1.getString(r12)     // Catch:{ all -> 0x0f82 }
            long r49 = r1.getLong(r10)     // Catch:{ all -> 0x0f82 }
            java.lang.String r45 = r1.getString(r9)     // Catch:{ all -> 0x0f82 }
            X.9ti r6 = new X.9ti     // Catch:{ all -> 0x0f82 }
            r38 = r6
            r42 = r20
            r46 = r3
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r49)     // Catch:{ all -> 0x0f82 }
            r4.add(r6)     // Catch:{ all -> 0x0f82 }
            goto L_0x0f42
        L_0x0f7b:
            r1.close()     // Catch:{ all -> 0x0f89 }
            r25.close()     // Catch:{ all -> 0x0f92 }
            goto L_0x0f97
        L_0x0f82:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0f84 }
        L_0x0f84:
            r6 = move-exception
            X.CDX.A00(r1, r4)     // Catch:{ all -> 0x0f89 }
            throw r6     // Catch:{ all -> 0x0f89 }
        L_0x0f89:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0f8b }
        L_0x0f8b:
            r6 = move-exception
            r1 = r25
            X.CDX.A00(r1, r4)     // Catch:{ all -> 0x0f92 }
            throw r6     // Catch:{ all -> 0x0f92 }
        L_0x0f92:
            r1 = move-exception
            X.1IU r4 = X.C108945cZ.A1J(r1)     // Catch:{ all -> 0x12f5 }
        L_0x0f97:
            java.lang.Throwable r6 = X.C30671eK.A00(r4)     // Catch:{ all -> 0x12f5 }
            if (r6 == 0) goto L_0x0fa2
            java.lang.String r1 = "InactiveNotificationsStore/readAllUnreadMessageNotifications/failed"
            com.whatsapp.util.Log.e(r1, r6)     // Catch:{ all -> 0x12f5 }
        L_0x0fa2:
            X.0wS r6 = X.C18460wS.A00     // Catch:{ all -> 0x12f5 }
            boolean r1 = r4 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x12f5 }
            if (r1 == 0) goto L_0x0fa9
            r4 = r6
        L_0x0fa9:
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x12f5 }
            monitor-exit(r5)     // Catch:{ all -> 0x12fd }
            java.util.ArrayList r26 = X.C20034A4d.A01(r0, r2, r4)     // Catch:{ all -> 0x12fd }
            boolean r1 = r26.isEmpty()     // Catch:{ all -> 0x12fd }
            if (r1 == 0) goto L_0x0fe5
            java.lang.String r0 = "InactiveAccountNotificationManager/showMessageNotifications/empty notificationsTextPair"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
        L_0x0fbb:
            r0 = r51
            X.00H r0 = r0.A03     // Catch:{ all -> 0x12fd }
            X.2u4 r5 = X.C17880vN.A0J(r0)     // Catch:{ all -> 0x12fd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/"
            r1.append(r0)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = X.C49842Sd.A00(r7)     // Catch:{ all -> 0x12fd }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x12fd }
            X.2mj r4 = X.C64012u4.A01(r5)     // Catch:{ all -> 0x12fd }
            X.2rb r1 = X.C64012u4.A02(r4, r7)     // Catch:{ all -> 0x12fd }
            if (r1 != 0) goto L_0x1141
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/account not found: "
            goto L_0x1218
        L_0x0fe5:
            java.util.Iterator r25 = r26.iterator()     // Catch:{ all -> 0x12fd }
        L_0x0fe9:
            boolean r4 = r25.hasNext()     // Catch:{ all -> 0x12fd }
            r1 = 1
            if (r4 == 0) goto L_0x10b7
            java.lang.Object r6 = r25.next()     // Catch:{ all -> 0x12fd }
            X.9tM r6 = (X.C195449tM) r6     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = r6.A05     // Catch:{ all -> 0x12fd }
            r5 = r18
            boolean r5 = X.C18070vi.A18(r4, r5)     // Catch:{ all -> 0x12fd }
            if (r5 == 0) goto L_0x1027
            X.118 r4 = r2.A01     // Catch:{ all -> 0x12fd }
            android.content.res.Resources r12 = X.AnonymousClass3MW.A05(r4)     // Catch:{ all -> 0x12fd }
            r10 = 2131755291(0x7f10011b, float:1.9141457E38)
            long r4 = r6.A00     // Catch:{ all -> 0x12fd }
            int r9 = (int) r4     // Catch:{ all -> 0x12fd }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = r6.A04     // Catch:{ all -> 0x12fd }
            r1[r3] = r4     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = r12.getQuantityString(r10, r9, r1)     // Catch:{ all -> 0x12fd }
        L_0x1016:
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x12fd }
            int r4 = r4.length()     // Catch:{ all -> 0x12fd }
            android.text.SpannableString r1 = X.C20034A4d.A00(r1, r4)     // Catch:{ all -> 0x12fd }
            r4 = r21
            r4.add(r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0fe9
        L_0x1027:
            r5 = r17
            boolean r5 = X.C18070vi.A18(r4, r5)     // Catch:{ all -> 0x12fd }
            if (r5 == 0) goto L_0x10a8
            long r4 = r6.A01     // Catch:{ all -> 0x12fd }
            r10 = 2
            int r9 = (r4 > r36 ? 1 : (r4 == r36 ? 0 : -1))
            if (r9 != 0) goto L_0x1051
            X.118 r4 = r2.A01     // Catch:{ all -> 0x12fd }
            android.content.res.Resources r13 = X.AnonymousClass3MW.A05(r4)     // Catch:{ all -> 0x12fd }
            r12 = 2131755292(0x7f10011c, float:1.914146E38)
            long r4 = r6.A00     // Catch:{ all -> 0x12fd }
            int r9 = (int) r4     // Catch:{ all -> 0x12fd }
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = r6.A04     // Catch:{ all -> 0x12fd }
            r10[r3] = r4     // Catch:{ all -> 0x12fd }
            java.lang.String r5 = r6.A02     // Catch:{ all -> 0x12fd }
            r10[r1] = r5     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = r13.getQuantityString(r12, r9, r10)     // Catch:{ all -> 0x12fd }
            goto L_0x1016
        L_0x1051:
            r23 = 2
            r13 = 3
            int r9 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r9 != 0) goto L_0x106e
            X.118 r9 = r2.A01     // Catch:{ all -> 0x12fd }
            r5 = 2131893082(0x7f121b5a, float:1.942093E38)
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch:{ all -> 0x12fd }
            java.lang.String r4 = r6.A04     // Catch:{ all -> 0x12fd }
            r12[r3] = r4     // Catch:{ all -> 0x12fd }
            java.lang.String r13 = r6.A02     // Catch:{ all -> 0x12fd }
            r12[r1] = r13     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = r6.A03     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = X.AnonymousClass8BS.A0f(r9, r1, r12, r10, r5)     // Catch:{ all -> 0x12fd }
            goto L_0x1016
        L_0x106e:
            X.118 r9 = r2.A01     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            r27 = r9
            r15 = 2131893081(0x7f121b59, float:1.9420928E38)
            r9 = 4
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            java.lang.String r14 = r6.A04     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            r12[r3] = r14     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            java.lang.String r9 = r6.A02     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            r12[r1] = r9     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            java.lang.String r1 = r6.A03     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            r12[r10] = r1     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            long r4 = r4 - r23
            X.AnonymousClass3MX.A1S(r12, r13, r4)     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            r1 = r27
            java.lang.String r1 = r1.A02(r15, r12)     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            X.C18070vi.A0X(r1)     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            int r4 = r14.length()     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            android.text.SpannableString r1 = X.C20034A4d.A00(r1, r4)     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            r4 = r21
            r4.add(r1)     // Catch:{ IllegalFormatConversionException -> 0x10a1 }
            goto L_0x0fe9
        L_0x10a1:
            java.lang.String r1 = "NotificationUiBuilder/getNotificationTextForMessages/error in string resource"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0fe9
        L_0x10a8:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = "NotificationUiBuilder/getNotificationTextForMessages/unknown message type/"
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r4, r5)     // Catch:{ all -> 0x12fd }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x12fd }
            goto L_0x0fe9
        L_0x10b7:
            int r4 = r26.size()     // Catch:{ all -> 0x12fd }
            if (r4 != r1) goto L_0x1126
            r4 = r26
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x12fd }
            X.9tM r4 = (X.C195449tM) r4     // Catch:{ all -> 0x12fd }
            long r4 = r4.A00     // Catch:{ all -> 0x12fd }
            int r6 = (r4 > r36 ? 1 : (r4 == r36 ? 0 : -1))
            if (r6 != 0) goto L_0x1126
            X.118 r5 = r2.A01     // Catch:{ all -> 0x12fd }
            r4 = 2131893083(0x7f121b5b, float:1.9420933E38)
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x12fd }
            X.C17880vN.A1T(r2, r1, r3)     // Catch:{ all -> 0x12fd }
            java.lang.String r2 = r5.A02(r4, r2)     // Catch:{ all -> 0x12fd }
        L_0x10d9:
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x12fd }
            r1 = r21
            X.1D6 r2 = X.AnonymousClass1D6.A01(r2, r1)     // Catch:{ all -> 0x12fd }
            X.9In r5 = X.C179579In.MESSAGES     // Catch:{ all -> 0x12fd }
            X.00H r1 = r8.A06     // Catch:{ all -> 0x12fd }
            java.lang.Object r4 = X.C18070vi.A0E(r1)     // Catch:{ all -> 0x12fd }
            X.2sq r4 = (X.C63302sq) r4     // Catch:{ all -> 0x12fd }
            r1 = r19
            java.lang.String r24 = X.A6J.A00(r5, r1)     // Catch:{ all -> 0x12fd }
            java.lang.String r25 = r8.A03(r0)     // Catch:{ all -> 0x12fd }
            java.lang.Object r6 = r2.second     // Catch:{ all -> 0x12fd }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x12fd }
            java.lang.Object r5 = r2.first     // Catch:{ all -> 0x12fd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x12fd }
            r2 = 2131886391(0x7f120137, float:1.940736E38)
            r1 = r29
            java.lang.String r9 = r1.A01(r2)     // Catch:{ all -> 0x12fd }
            r2 = r28
            r1 = r22
            android.app.PendingIntent r2 = X.C17880vN.A07(r2, r1, r3)     // Catch:{ all -> 0x12fd }
            X.6yd r1 = new X.6yd     // Catch:{ all -> 0x12fd }
            r1.<init>(r3, r9, r2)     // Catch:{ all -> 0x12fd }
            r21 = r4
            r23 = r1
            r26 = r5
            r27 = r6
            r28 = r16
            r21.A04(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x12fd }
            X.A6J.A02(r0, r8)     // Catch:{ all -> 0x12fd }
            goto L_0x0fbb
        L_0x1126:
            X.118 r2 = r2.A01     // Catch:{ all -> 0x12fd }
            android.content.res.Resources r6 = X.AnonymousClass3MW.A05(r2)     // Catch:{ all -> 0x12fd }
            r5 = 2131755293(0x7f10011d, float:1.9141461E38)
            int r4 = r26.size()     // Catch:{ all -> 0x12fd }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x12fd }
            int r1 = r26.size()     // Catch:{ all -> 0x12fd }
            X.C17880vN.A1T(r2, r1, r3)     // Catch:{ all -> 0x12fd }
            java.lang.String r2 = r6.getQuantityString(r5, r4, r2)     // Catch:{ all -> 0x12fd }
            goto L_0x10d9
        L_0x1141:
            int r0 = r1.A01     // Catch:{ all -> 0x12fd }
            int r2 = r0 + 1
            r23 = 1983(0x7bf, float:2.779E-42)
            r24 = 0
            r18 = r20
            r19 = r20
            r28 = r3
            r16 = r1
            r17 = r20
            r21 = r3
            r22 = r2
            r26 = r24
            X.2rb r0 = X.C62562rb.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28)     // Catch:{ all -> 0x12fd }
            X.C64012u4.A07(r4, r5, r0)     // Catch:{ all -> 0x12fd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactivePushMessageCount/newUnreadMessageCount="
            X.C17900vP.A0j(r0, r1, r2)     // Catch:{ all -> 0x12fd }
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r0) goto L_0x0572
            java.lang.String r0 = "InactiveAccountNotificationManager/showOfflineMessagesCountWarning"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            X.00H r0 = r8.A06     // Catch:{ all -> 0x12fd }
            java.lang.Object r4 = X.C18070vi.A0E(r0)     // Catch:{ all -> 0x12fd }
            X.2sq r4 = (X.C63302sq) r4     // Catch:{ all -> 0x12fd }
            java.lang.String r5 = r7.A07     // Catch:{ all -> 0x12fd }
            X.9In r0 = X.C179579In.UNREAD_MSG_LIMIT     // Catch:{ all -> 0x12fd }
            java.lang.String r16 = X.A6J.A00(r0, r5)     // Catch:{ all -> 0x12fd }
            java.lang.String r17 = r8.A03(r7)     // Catch:{ all -> 0x12fd }
            X.118 r1 = r8.A02     // Catch:{ all -> 0x12fd }
            r0 = 2131886374(0x7f120126, float:1.9407325E38)
            java.lang.String r15 = X.C18070vi.A0G(r1, r0)     // Catch:{ all -> 0x12fd }
            android.content.Context r2 = X.C108945cZ.A0E(r1)     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = r7.A05     // Catch:{ all -> 0x12fd }
            r0 = 11
            android.content.Intent r13 = X.AnonymousClass1LU.A1a(r2, r5, r1, r0, r3)     // Catch:{ all -> 0x12fd }
            r18 = 2131231578(0x7f08035a, float:1.807924E38)
            r12 = r4
            r14 = r20
            r19 = r0
            r20 = r3
            r12.A03(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x12fd }
            goto L_0x0572
        L_0x11aa:
            java.lang.String r0 = "post_reg"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x0572
            r0 = r51
            X.A6J r1 = r0.A00     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "InactiveAccountNotificationManager/showPostRegistrationNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            X.00H r0 = r1.A06     // Catch:{ all -> 0x12fd }
            java.lang.Object r4 = X.C18070vi.A0E(r0)     // Catch:{ all -> 0x12fd }
            X.2sq r4 = (X.C63302sq) r4     // Catch:{ all -> 0x12fd }
            java.lang.String r5 = r7.A07     // Catch:{ all -> 0x12fd }
            X.9In r0 = X.C179579In.REGISTRATION     // Catch:{ all -> 0x12fd }
            java.lang.String r22 = X.A6J.A00(r0, r5)     // Catch:{ all -> 0x12fd }
            java.lang.String r23 = r1.A03(r7)     // Catch:{ all -> 0x12fd }
            X.118 r1 = r1.A02     // Catch:{ all -> 0x12fd }
            r0 = 2131893054(0x7f121b3e, float:1.9420874E38)
            java.lang.String r21 = X.C18070vi.A0G(r1, r0)     // Catch:{ all -> 0x12fd }
            android.content.Context r2 = X.C108945cZ.A0E(r1)     // Catch:{ all -> 0x12fd }
            java.lang.String r1 = r7.A05     // Catch:{ all -> 0x12fd }
            r0 = 10
            android.content.Intent r19 = X.AnonymousClass1LU.A1a(r2, r5, r1, r0, r3)     // Catch:{ all -> 0x12fd }
            r26 = 1
            r24 = 2131231578(0x7f08035a, float:1.807924E38)
            r18 = r4
            r25 = r0
            r27 = r26
            r18.A03(r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x12fd }
            r0 = r51
            X.00H r0 = r0.A03     // Catch:{ all -> 0x12fd }
            X.2u4 r2 = X.C17880vN.A0J(r0)     // Catch:{ all -> 0x12fd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "AccountSwitchingDataRepo/updateAccountLoginFlag/"
            X.AnonymousClass8BW.A18(r7, r0, r1)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "/isLoggedIn/"
            X.C17900vP.A0n(r0, r1, r3)     // Catch:{ all -> 0x12fd }
            X.2mj r1 = X.C64012u4.A01(r2)     // Catch:{ all -> 0x12fd }
            X.2rb r15 = X.C64012u4.A02(r1, r7)     // Catch:{ all -> 0x12fd }
            if (r15 != 0) goto L_0x1224
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = "AccountSwitchingDataRepo/updateAccountLoginFlag/account not found: "
        L_0x1218:
            X.AnonymousClass8BW.A18(r7, r0, r1)     // Catch:{ all -> 0x12fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x12fd }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x12fd }
            goto L_0x0572
        L_0x1224:
            r22 = 2015(0x7df, float:2.824E-42)
            r23 = 0
            r17 = r20
            r18 = r20
            r19 = r20
            r21 = r3
            r27 = r3
            r16 = r20
            r20 = r3
            r25 = r23
            X.2rb r0 = X.C62562rb.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27)     // Catch:{ all -> 0x12fd }
            X.C64012u4.A07(r1, r2, r0)     // Catch:{ all -> 0x12fd }
            goto L_0x0572
        L_0x1241:
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ all -> 0x12fd }
            r1 = r66
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x12fd }
            if (r0 != 0) goto L_0x1252
            java.lang.String r0 = "registration_code"
            r4.put(r0, r1)     // Catch:{ all -> 0x12fd }
        L_0x1252:
            if (r2 == 0) goto L_0x1259
            java.lang.String r0 = "push_payload"
            r4.put(r0, r2)     // Catch:{ all -> 0x12fd }
        L_0x1259:
            java.util.Set r0 = r11.A0E     // Catch:{ all -> 0x12fd }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x12fd }
        L_0x125f:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x1299
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x12fd }
            X.9ep r1 = (X.C186829ep) r1     // Catch:{ all -> 0x12fd }
            X.17v r0 = r1.A01     // Catch:{ all -> 0x12fd }
            r27 = 1
            r26 = 2
            r30 = r27
            r32 = r27
            r23 = r0
            r24 = r44
            r25 = r43
            r28 = r3
            r29 = r27
            r31 = r40
            r23.A0E(r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x12fd }
            X.1cb r8 = r1.A02     // Catch:{ all -> 0x12fd }
            X.118 r0 = r1.A00     // Catch:{ all -> 0x12fd }
            android.content.Context r6 = X.C108945cZ.A0E(r0)     // Catch:{ all -> 0x12fd }
            X.1cc r5 = r1.A03     // Catch:{ all -> 0x12fd }
            r1 = 12
            X.25d r0 = new X.25d     // Catch:{ all -> 0x12fd }
            r0.<init>(r6, r5, r1)     // Catch:{ all -> 0x12fd }
            X.C29631cb.A02(r8, r0)     // Catch:{ all -> 0x12fd }
            goto L_0x125f
        L_0x1299:
            X.00H r0 = r11.A0D     // Catch:{ all -> 0x12fd }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x12fd }
            X.1dB r1 = (X.C29971dB) r1     // Catch:{ all -> 0x12fd }
            if (r53 != 0) goto L_0x12a5
            r22 = r47
        L_0x12a5:
            r0 = r22
            r1.A08(r0)     // Catch:{ all -> 0x12fd }
            if (r7 == 0) goto L_0x12b2
            boolean r0 = r7.booleanValue()     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x12ea
        L_0x12b2:
            java.util.Set r0 = r11.A0F     // Catch:{ all -> 0x12fd }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x12fd }
        L_0x12b8:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x12ea
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x12fd }
            X.BDP r5 = (X.BDP) r5     // Catch:{ all -> 0x12fd }
            int r0 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            r3 = r20
            if (r0 == 0) goto L_0x12cb
            r3 = r10
        L_0x12cb:
            r0 = r45
            boolean r0 = r5.CLz(r2, r3, r0)     // Catch:{ all -> 0x12fd }
            if (r0 == 0) goto L_0x12b8
            X.9t9 r1 = new X.9t9     // Catch:{ all -> 0x12fd }
            r22 = r1
            r23 = r47
            r24 = r3
            r25 = r46
            r26 = r41
            r27 = r16
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x12fd }
            r0 = r45
            r5.BcI(r1, r0, r4)     // Catch:{ all -> 0x12fd }
            goto L_0x12b8
        L_0x12ea:
            if (r65 == 0) goto L_0x0572
            X.1fb r1 = r11.A0A     // Catch:{ all -> 0x12fd }
            r0 = r21
            r1.A01(r0)     // Catch:{ all -> 0x12fd }
            goto L_0x0572
        L_0x12f5:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x12fd }
            goto L_0x12fc
        L_0x12f8:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x12fd }
        L_0x12fc:
            throw r0     // Catch:{ all -> 0x12fd }
        L_0x12fd:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6C.A03(java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void");
    }
}
