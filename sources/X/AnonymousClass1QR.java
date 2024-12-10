package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1QR  reason: invalid class name */
public class AnonymousClass1QR {
    public static final String[] A0D = {"message_row_id", "remote_jid_row_id", "key_id", "interop_id", PublicKeyCredentialControllerUtility.JSON_KEY_ID, "timestamp", "init_timestamp", "status", "error_code", "sender_jid_row_id", "receiver_jid_row_id", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "currency_code", "amount_1000", "credential_id", "methods", "bank_transaction_id", "request_key_id", "metadata", "country", "version", "future_data", "service_id", "background_id", "purchase_initiator"};
    public PaymentConfiguration A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1DL A02;
    public final AnonymousClass1Cd A03;
    public final AnonymousClass1QE A04 = AnonymousClass1QE.A00("PaymentTransactionStore", "database", "COMMON");
    public final AnonymousClass190 A05;
    public final AnonymousClass11S A06;
    public final C24621La A07;
    public final C24751Ln A08;
    public final AnonymousClass1NG A09;
    public final AnonymousClass1KI A0A;
    public final AnonymousClass1KH A0B;
    public final AnonymousClass1QQ A0C;

    public static int A00(ContentValues contentValues, C28791au r7, AW0 aw0) {
        return ((C28801av) r7).A02.A02(contentValues, "pay_transaction", "id=?", "expireOldPendingRequestsV2/UPDATE_PAY_TRANSACTION", new String[]{aw0.A0K});
    }

    public static Cursor A01(AnonymousClass1QR r10, Integer num) {
        String str;
        String num2 = Integer.toString(20);
        String[] strArr = {num2, Integer.toString(12), Integer.toString(40), num2, "%\"isPendingRequestViewed\":true%"};
        C28781at A042 = r10.A03.get();
        try {
            C23141Ev r3 = ((C28801av) A042).A02;
            String[] strArr2 = A0D;
            if (num != null) {
                str = num.toString();
            } else {
                str = null;
            }
            Cursor A0B2 = r3.A0B("pay_transaction", strArr2, "((type=? AND status=?) OR (type=? AND status=?)) AND metadata NOT LIKE ?", strArr, (String) null, (String) null, str, "getUnviewedPendingRequestsCursor/QUERY_PAY_TRANSACTION");
            A042.close();
            return A0B2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    private Pair A02() {
        String l = Long.toString(this.A02.A09(A0A(this)));
        Pair pair = new Pair(new String[]{l, l}, "( sender_jid_row_id=? OR receiver_jid_row_id=? )");
        StringBuilder sb = new StringBuilder();
        sb.append("( type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR (type=? AND ");
        sb.append((String) pair.second);
        sb.append(") OR (");
        sb.append(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        sb.append("=? AND ");
        sb.append("status");
        sb.append("!=? AND ");
        sb.append("status");
        sb.append("!=?) OR (");
        sb.append(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        sb.append("=? AND (");
        sb.append("status");
        sb.append("=? OR ");
        sb.append("status");
        sb.append("=? OR ");
        sb.append("status");
        sb.append("=?)) OR (");
        sb.append(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        sb.append("=? AND ");
        sb.append("status");
        sb.append("!=? AND ");
        sb.append("status");
        sb.append("!=? AND ");
        sb.append("status");
        sb.append("!=?))");
        String obj = sb.toString();
        Pair pair2 = new Pair(new String[0], (Object) null);
        String[] strArr = (String[]) pair2.first;
        Object obj2 = pair2.second;
        if (obj2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" AND ");
            sb2.append((String) obj2);
            obj = sb2.toString();
        }
        boolean z = !TextUtils.isEmpty((CharSequence) null);
        if (z) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(" AND credential_id=?");
            obj = sb3.toString();
        }
        int length = strArr.length;
        String[] strArr2 = new String[((z ? 1 : 0) + true + length)];
        int i = 0;
        strArr2[0] = Integer.toString(1);
        strArr2[1] = Integer.toString(2);
        strArr2[2] = Integer.toString(100);
        strArr2[3] = Integer.toString(6);
        strArr2[4] = Integer.toString(7);
        strArr2[5] = Integer.toString(8);
        strArr2[6] = Integer.toString(9);
        strArr2[7] = Integer.toString(1000);
        String[] strArr3 = (String[]) pair.first;
        strArr2[8] = strArr3[0];
        strArr2[9] = strArr3[1];
        strArr2[10] = Integer.toString(20);
        String num = Integer.toString(12);
        strArr2[11] = num;
        String num2 = Integer.toString(17);
        strArr2[12] = num2;
        strArr2[13] = Integer.toString(40);
        strArr2[14] = Integer.toString(415);
        strArr2[15] = Integer.toString(15);
        strArr2[16] = Integer.toString(16);
        strArr2[17] = Integer.toString(10);
        strArr2[18] = num;
        strArr2[19] = Integer.toString(19);
        int i2 = 21;
        strArr2[20] = num2;
        while (i < length) {
            strArr2[i2] = strArr[i];
            i++;
            i2++;
        }
        if (z) {
            strArr2[i2] = null;
        }
        return new Pair(obj, strArr2);
    }

    public static Pair A03() {
        String num = Integer.toString(12);
        return new Pair("((type=? AND status=?) OR (type=? AND (status=? OR status=?)))", new String[]{Integer.toString(20), num, Integer.toString(10), num, Integer.toString(19)});
    }

    public static Pair A05(AnonymousClass1QR r10, AnonymousClass1BI r11) {
        String obj;
        Pair A022 = r10.A02();
        Pair A032 = A03();
        Pair pair = new Pair(new String[0], (Object) null);
        Pair A042 = A04(A032, new Pair(pair.second, pair.first), "AND");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(2);
        long A092 = r10.A02.A09(r10.A0O(r11));
        if (A092 == -1) {
            obj = null;
        } else {
            sb.append("remote_jid_row_id");
            sb.append("=?");
            arrayList.add(String.valueOf(A092));
            obj = sb.toString();
        }
        Pair pair2 = new Pair(obj, arrayList);
        int size = ((List) pair2.second).size();
        Object[] objArr = new String[(((String[]) A022.second).length + size + ((String[]) A042.second).length)];
        if (size > 0) {
            String str = (String) pair2.first;
            int i = 0;
            do {
                objArr[i] = ((List) pair2.second).get(i);
                i++;
            } while (i < size);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(");
            sb2.append(str);
            sb2.append(" AND (");
            sb2.append((String) A022.first);
            sb2.append(" OR ");
            sb2.append((String) A042.first);
            sb2.append("))");
            String obj2 = sb2.toString();
            Object obj3 = A022.second;
            System.arraycopy(obj3, 0, objArr, size, ((String[]) obj3).length);
            Object obj4 = A042.second;
            System.arraycopy(obj4, 0, objArr, size + ((String[]) A022.second).length, ((String[]) obj4).length);
            return new Pair(obj2, objArr);
        }
        AnonymousClass1QE r2 = r10.A04;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("getPendingRequestsAndTransactionsQueryAndParams/no row id for jid/jid=");
        sb3.append(r11.getRawString());
        r2.A05(sb3.toString());
        return null;
    }

    public static ArrayList A0C(AnonymousClass1QR r15, AnonymousClass1BI r16, int i) {
        Pair A052;
        String str;
        Cursor A0B2;
        ArrayList arrayList;
        AnonymousClass1BI r0 = r16;
        if (r16 == null) {
            A052 = r15.A02();
        } else {
            A052 = A05(r15, r0);
        }
        if (A052 == null) {
            r15.A04.A05("readTransactionsV2/null queryPair");
            return new ArrayList();
        }
        String str2 = (String) A052.first;
        String[] strArr = (String[]) A052.second;
        if (i > 0) {
            str = Integer.toString(i);
        } else {
            str = "";
        }
        C28781at A042 = r15.A03.get();
        try {
            A0B2 = ((C28801av) A042).A02.A0B("pay_transaction", A0D, str2, strArr, (String) null, "init_timestamp DESC", str, "readTransactionsV2/QUERY_PAY_TRANSACTION");
            if (A0B2 != null) {
                arrayList = A0B(A0B2, r15, "readTransactionsV2");
                AnonymousClass1QE r2 = r15.A04;
                StringBuilder sb = new StringBuilder();
                sb.append("readTransactionsV2 returned: ");
                sb.append(arrayList.size());
                AnonymousClass1QE.A02(r2, (String) null, sb.toString());
                A0B2.close();
            } else {
                arrayList = new ArrayList();
            }
            A042.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public static synchronized ArrayList A0D(AnonymousClass1QR r13, boolean z) {
        List<AW0> list;
        ArrayList arrayList;
        C41851xA BD0;
        synchronized (r13) {
            long A012 = AnonymousClass11P.A01(r13.A01);
            if (z) {
                int[] iArr = AW0.A0T;
                int[] iArr2 = AW0.A0U;
                ArrayList arrayList2 = new ArrayList(7);
                for (int i = 0; i < 4; i++) {
                    arrayList2.add(Integer.valueOf(iArr[i]));
                }
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList2.add(Integer.valueOf(iArr2[i2]));
                }
                list = r13.A0X((Integer[]) arrayList2.toArray(new Integer[0]), new Integer[]{2, 200, 20, 10}, -1);
            } else {
                list = r13.A0V(-1);
            }
            arrayList = new ArrayList();
            try {
                C28791au A052 = r13.A03.A05();
                try {
                    BD0 = A052.BD0();
                    for (AW0 aw0 : list) {
                        ContentValues contentValues = new ContentValues();
                        Pair A072 = A07(aw0.A0L, aw0.A0K);
                        if (A072 != null) {
                            contentValues.put("status", 0);
                            contentValues.put("timestamp", Integer.valueOf((int) (A012 / 1000)));
                            AnonymousClass1QE r2 = r13.A04;
                            StringBuilder sb = new StringBuilder();
                            sb.append("failed transaction/key_id=");
                            sb.append(aw0.A0L);
                            sb.append(", transaction_id=");
                            sb.append(aw0.A0K);
                            r2.A06(sb.toString());
                            A0F(contentValues, A072, A052);
                            arrayList.add(new AnonymousClass205(aw0.A0C, aw0.A0L, aw0.A0Q));
                        }
                    }
                    BD0.A00();
                    BD0.close();
                    A052.close();
                } catch (Throwable th) {
                    A052.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                AnonymousClass1QE r22 = r13.A04;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PaymentTransactionStore/failPendingTransactions/failed: ");
                sb2.append(e);
                r22.A05(sb2.toString());
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        }
        return arrayList;
        throw th;
    }

    public AW0 A0K(String str) {
        return A0N(str, (String) null, -1);
    }

    public AW0 A0L(String str) {
        Cursor A0B2;
        boolean z = true;
        String str2 = str;
        String[] strArr = {str};
        C28781at A042 = this.A03.get();
        try {
            A0B2 = ((C28801av) A042).A02.A0B("pay_transaction", A0D, "request_key_id=?", strArr, (String) null, (String) null, (String) null, "readTransactionInfoByRequestMessageId/QUERY_PAY_TRANSACTION");
            AW0 aw0 = null;
            if (A0B2.moveToLast()) {
                aw0 = A09(A0B2, this);
            }
            A0B2.close();
            A042.close();
            AnonymousClass1QE r2 = this.A04;
            StringBuilder sb = new StringBuilder();
            sb.append("readTransactionInfoByRequestMessageId/");
            sb.append(str2);
            sb.append("/");
            if (aw0 == null) {
                z = false;
            }
            sb.append(z);
            r2.A06(sb.toString());
            return aw0;
        } catch (AnonymousClass11T e) {
            this.A04.A0A("PaymentTransactionStore/readTransactionInfoByRequestMessageId/InvalidJidException - Cannot read TransactionInfo from a message with invalid JID", e);
            A0B2.close();
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AW0 A0M(java.lang.String r19) {
        /*
            r18 = this;
            r4 = 1
            java.lang.String[] r13 = new java.lang.String[r4]
            r0 = 0
            r5 = r19
            r13[r0] = r19
            r7 = r18
            X.1Cd r0 = r7.A03
            X.1at r8 = r0.get()
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x006d }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x006d }
            java.lang.String r10 = "pay_transaction"
            java.lang.String[] r11 = A0D     // Catch:{ all -> 0x006d }
            java.lang.String r12 = "id=?"
            java.lang.String r17 = "readTransactionInfoByTransId/QUERY_PAY_TRANSACTION"
            r14 = 0
            r16 = r14
            r15 = r14
            android.database.Cursor r6 = r9.A0B(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x006d }
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0038
            X.AW0 r3 = A09(r6, r7)     // Catch:{ 11T -> 0x0030 }
            goto L_0x0039
        L_0x0030:
            r2 = move-exception
            X.1QE r1 = r7.A04     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "PaymentTransactionStore/readTransactionInfoByTransId/InvalidJidException - Cannot read TransactionInfo from a message with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x0061 }
        L_0x0038:
            r3 = 0
        L_0x0039:
            r6.close()     // Catch:{ all -> 0x006d }
            r8.close()
            X.1QE r2 = r7.A04
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "readTransactionInfoByTransId/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "/"
            r1.append(r0)
            if (r3 != 0) goto L_0x0056
            r4 = 0
        L_0x0056:
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r2.A06(r0)
            return r3
        L_0x0061:
            r1 = move-exception
            if (r6 == 0) goto L_0x006c
            r6.close()     // Catch:{ all -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x006d }
        L_0x006c:
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0072 }
            throw r1
        L_0x0072:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.A0M(java.lang.String):X.AW0");
    }

    public ArrayList A0Q() {
        String[] strArr = {String.valueOf(405), String.valueOf(1), String.valueOf(System.currentTimeMillis() - 5184000000L)};
        StringBuilder sb = new StringBuilder();
        sb.append("readMostFrequentSuccessfulTransactions/QUERY_SUCCESSFUL_TRANSACTIONS");
        sb.append("/QUERY_PAY_TRANSACTION");
        String obj = sb.toString();
        String join = TextUtils.join(",", new String[]{"sender_jid_row_id", "receiver_jid_row_id"});
        StringBuilder sb2 = new StringBuilder();
        sb2.append("COUNT(");
        sb2.append("status");
        sb2.append(") AS ");
        sb2.append("frequency");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("MAX(init_timestamp) AS ");
        sb3.append("recentTransactionTs");
        String[] strArr2 = {"sender_jid_row_id", "receiver_jid_row_id", "status", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, sb2.toString(), sb3.toString()};
        C28781at A042 = this.A03.get();
        try {
            Cursor A0B2 = ((C28801av) A042).A02.A0B("pay_transaction", strArr2, "status =? AND type =? AND init_timestamp <=? AND receiver_jid_row_id is not null", strArr, join, "frequency DESC", String.valueOf(4), obj);
            if (A0B2 != null) {
                try {
                    ArrayList arrayList = new ArrayList(A0B2.getCount());
                    while (A0B2.moveToNext()) {
                        int i = A0B2.getInt(A0B2.getColumnIndexOrThrow("status"));
                        AnonymousClass1DL r11 = this.A02;
                        Jid A0B3 = r11.A0B(A0B2.getLong(A0B2.getColumnIndexOrThrow("sender_jid_row_id")));
                        if (A0B3 instanceof AnonymousClass1BI) {
                            A0B3 = A0O((AnonymousClass1BI) A0B3);
                        }
                        C22941Dw r0 = UserJid.Companion;
                        UserJid A012 = C22941Dw.A01(A0B3);
                        Jid A0B4 = r11.A0B(A0B2.getLong(A0B2.getColumnIndexOrThrow("receiver_jid_row_id")));
                        if (A0B4 instanceof AnonymousClass1BI) {
                            A0B4 = A0O((AnonymousClass1BI) A0B4);
                        }
                        UserJid A013 = C22941Dw.A01(A0B4);
                        int i2 = A0B2.getInt(A0B2.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
                        String string = A0B2.getString(A0B2.getColumnIndexOrThrow("frequency"));
                        long j = A0B2.getLong(A0B2.getColumnIndexOrThrow("recentTransactionTs"));
                        AnonymousClass1QE r112 = this.A04;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("readTransactionInfoByTransId got from db: type: ");
                        sb4.append(i2);
                        sb4.append(" status: ");
                        sb4.append(i);
                        sb4.append(" sender: ");
                        sb4.append(A012);
                        sb4.append(" peer: ");
                        sb4.append(A013);
                        AnonymousClass1QE.A02(r112, (String) null, sb4.toString());
                        arrayList.add(new C21346Aia(A012, A013, Integer.valueOf(string).intValue(), j));
                    }
                    AnonymousClass1QE r2 = this.A04;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("readMostFrequentSuccessfulTransactions returned: ");
                    sb5.append(arrayList.size());
                    r2.A06(sb5.toString());
                    A0B2.close();
                    A042.close();
                    return arrayList;
                } catch (AnonymousClass11T e) {
                    this.A04.A0A("extractPaymentTransactionInfo/InvalidJidException - Skipped transaction with invalid JID", e);
                } catch (Throwable th) {
                    A0B2.close();
                    throw th;
                }
            } else {
                A042.close();
                return new ArrayList();
            }
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public synchronized ArrayList A0R() {
        ArrayList A0E;
        synchronized (this) {
            Pair A032 = A03();
            Pair pair = new Pair(new String[0], (Object) null);
            Pair A042 = A04(A032, new Pair(pair.second, pair.first), "AND");
            A0E = A0E((String) A042.first, (String[]) A042.second, -1);
        }
        return A0E;
    }

    public synchronized ArrayList A0S(int i) {
        ArrayList A0E;
        synchronized (this) {
            Pair pair = new Pair(new String[0], (Object) null);
            Pair A032 = A03();
            String str = ((AnonymousClass1KL) AnonymousClass1KL.A0C).A06;
            C18070vi.A0W(str);
            Pair A042 = A04(A04(A04(A032, new Pair("(currency_code != ? OR metadata LIKE ?)", new String[]{str, "%money%"}), "AND"), new Pair("(type=? AND status=?)", new String[]{Integer.toString(8), Integer.toString(608)}), "OR"), new Pair((String) pair.second, (String[]) pair.first), "AND");
            A0E = A0E((String) A042.first, (String[]) A042.second, i);
        }
        return A0E;
    }

    public synchronized List A0V(int i) {
        ArrayList arrayList;
        int[] iArr = AW0.A0T;
        int[] iArr2 = AW0.A0V;
        int[] iArr3 = AW0.A0U;
        arrayList = new ArrayList(18);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(Integer.valueOf(iArr[i2]));
        }
        for (int i3 = 0; i3 < 11; i3++) {
            arrayList.add(Integer.valueOf(iArr2[i3]));
        }
        for (int i4 = 0; i4 < 3; i4++) {
            arrayList.add(Integer.valueOf(iArr3[i4]));
        }
        return A0X((Integer[]) arrayList.toArray(new Integer[0]), new Integer[]{2, 1, 200, 100, 20, 10, 6, 7, 8}, i);
    }

    public synchronized List A0W(String str, Integer[] numArr, Integer[] numArr2, int i) {
        ArrayList arrayList;
        String str2;
        Cursor A0B2;
        AnonymousClass1Cd r3 = this.A03;
        r3.A06();
        if (!r3.A08) {
            arrayList = Collections.emptyList();
        } else {
            Integer[] numArr3 = numArr;
            if (numArr3.length > 0) {
                str2 = String.format("(%s IN (\"%s\"))", new Object[]{"status", TextUtils.join("\",\"", numArr3)});
            } else {
                str2 = "";
            }
            String format = String.format("(%s IN (\"%s\"))", new Object[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, TextUtils.join("\",\"", numArr2)});
            String str3 = null;
            if (TextUtils.isEmpty(str2)) {
                str2 = null;
            }
            if (TextUtils.isEmpty(format)) {
                format = str2;
            } else if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" AND ");
                sb.append(format);
                format = sb.toString();
            }
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("credential_id=");
                sb2.append(str);
                String obj = sb2.toString();
                if (TextUtils.isEmpty(format)) {
                    format = obj;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(format);
                    sb3.append(" AND ");
                    sb3.append(obj);
                    format = sb3.toString();
                }
            }
            if (TextUtils.isEmpty(format)) {
                arrayList = new ArrayList();
            } else {
                String format2 = String.format("(%s) AND (%s IS NOT NULL)", new Object[]{format, PublicKeyCredentialControllerUtility.JSON_KEY_ID});
                AnonymousClass1QE r2 = this.A04;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("pending txns query: ");
                sb4.append(format2);
                AnonymousClass1QE.A02(r2, (String) null, sb4.toString());
                if (i > 0) {
                    str3 = Integer.toString(i);
                }
                try {
                    C28781at A042 = r3.get();
                    try {
                        A0B2 = ((C28801av) A042).A02.A0B("pay_transaction", A0D, format2, (String[]) null, (String) null, "timestamp DESC", str3, "readTransactionsWithTypeAndStatus/QUERY_PAY_TRANSACTION");
                        ArrayList A0B3 = A0B(A0B2, this, "readTransactionsWithTypeStatusAndCredentialId");
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("readPendingTransactions returned: ");
                        sb5.append(A0B3.size());
                        AnonymousClass1QE.A02(r2, (String) null, sb5.toString());
                        if (A0B2 != null) {
                            A0B2.close();
                        }
                        A042.close();
                        arrayList = A0B3;
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                } catch (IllegalStateException e) {
                    r2.A0A("readPendingTransactions/IllegalStateException ", e);
                    arrayList = new ArrayList();
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
            }
        }
        return arrayList;
        throw th;
    }

    public synchronized List A0X(Integer[] numArr, Integer[] numArr2, int i) {
        return A0W((String) null, numArr, numArr2, i);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0Y(X.AW0 r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.11P r0 = r8.A01     // Catch:{ all -> 0x0079 }
            long r4 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0079 }
            X.1Cd r0 = r8.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070 }
            X.1au r3 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070 }
            X.1xA r7 = r3.BD0()     // Catch:{ all -> 0x0066 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x005c }
            r6.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r1 = r9.A0L     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x005c }
            A07(r1, r0)     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "status"
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x005c }
            r6.put(r1, r0)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "timestamp"
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r0
            int r0 = (int) r4     // Catch:{ all -> 0x005c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x005c }
            r6.put(r2, r0)     // Catch:{ all -> 0x005c }
            X.1QE r2 = r8.A04     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "expirePendingRequest key id:"
            r1.append(r0)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r9.A0L     // Catch:{ all -> 0x005c }
            r1.append(r0)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005c }
            r2.A06(r0)     // Catch:{ all -> 0x005c }
            A00(r6, r3, r9)     // Catch:{ all -> 0x005c }
            r7.A00()     // Catch:{ all -> 0x005c }
            r7.close()     // Catch:{ all -> 0x0066 }
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070 }
            goto L_0x0077
        L_0x005c:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0066 }
        L_0x0065:
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070 }
        L_0x006f:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0070 }
        L_0x0070:
            X.1QE r1 = r8.A04     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "expirePendingRequest failed."
            r1.A05(r0)     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r8)
            return
        L_0x0079:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.A0Y(X.AW0):void");
    }

    public boolean A0b() {
        Cursor A012 = A01(this, 1);
        try {
            boolean moveToNext = A012.moveToNext();
            A012.close();
            return moveToNext;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [X.76o, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r4.A03 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r2 = r2.A02;
        r1 = r4.A02;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
        if (r1 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c3, code lost:
        r0 = new java.util.HashMap();
        r1 = new java.lang.Object();
        r1.A00 = r0;
        r4.A02 = r1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d1, code lost:
        r1.A00.put(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00db, code lost:
        return A0G(r5, r4, r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073 A[Catch:{ NumberFormatException -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[Catch:{ NumberFormatException -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091 A[Catch:{ NumberFormatException -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a A[Catch:{ NumberFormatException -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2 A[Catch:{ NumberFormatException -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0 A[Catch:{ NumberFormatException -> 0x00dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0d(X.AW0 r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            X.8pG r0 = r10.A0A     // Catch:{ all -> 0x00ee }
            r7 = 0
            if (r0 == 0) goto L_0x0009
            X.ADR r2 = r0.A01     // Catch:{ all -> 0x00ee }
            goto L_0x000a
        L_0x0009:
            r2 = r7
        L_0x000a:
            r8 = 0
            if (r2 == 0) goto L_0x00ec
            X.11S r1 = r9.A06     // Catch:{ all -> 0x00ee }
            com.whatsapp.jid.UserJid r0 = r10.A0E     // Catch:{ all -> 0x00ee }
            boolean r0 = r1.A0O(r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ec
            com.whatsapp.jid.UserJid r1 = r10.A0D     // Catch:{ all -> 0x00ee }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x00ee }
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A01(r1)     // Catch:{ all -> 0x00ee }
            if (r3 == 0) goto L_0x00e5
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00e5
            X.1KH r6 = r9.A0B     // Catch:{ all -> 0x00ee }
            X.1Ln r5 = r9.A08     // Catch:{ all -> 0x00ee }
            boolean r0 = r3 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0039
            r0 = r3
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0     // Catch:{ all -> 0x00ee }
            X.1E2 r0 = r5.A0C(r0)     // Catch:{ all -> 0x00ee }
            X.8pI r4 = r6.A06(r3, r0)     // Catch:{ all -> 0x00ee }
            goto L_0x004a
        L_0x0039:
            boolean r0 = r3 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x004d
            r0 = r3
            X.1E1 r0 = (X.AnonymousClass1E1) r0     // Catch:{ all -> 0x00ee }
            com.whatsapp.jid.PhoneUserJid r0 = r5.A0D(r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x004d
            X.8pI r4 = r6.A06(r0, r3)     // Catch:{ all -> 0x00ee }
        L_0x004a:
            if (r4 == 0) goto L_0x0053
            goto L_0x004f
        L_0x004d:
            r4 = 0
            goto L_0x0053
        L_0x004f:
            com.whatsapp.jid.UserJid r0 = r4.A03     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x007b
        L_0x0053:
            X.1yi r0 = X.C42771yi.A00()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = X.AnonymousClass17K.A00(r0, r3)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = X.C20056A5f.A02(r0)     // Catch:{ all -> 0x00ee }
            X.2tK r0 = X.C63572tK.A01(r0)     // Catch:{ all -> 0x00ee }
            com.whatsapp.payments.PaymentConfiguration r1 = r9.A00     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x00ee }
            X.2is r0 = r1.A00(r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0091
            X.BD1 r0 = r0.A00(r7)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0091
            X.8pI r4 = r0.BdI()     // Catch:{ all -> 0x00ee }
            if (r4 == 0) goto L_0x00ec
            r4.A03 = r3     // Catch:{ all -> 0x00ee }
        L_0x007b:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x00ee }
            r3.<init>()     // Catch:{ all -> 0x00ee }
            X.76o r0 = r4.A02     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = r2.A02     // Catch:{ all -> 0x00ee }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x00ee }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00ee }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0095
            goto L_0x0094
        L_0x0091:
            if (r4 == 0) goto L_0x00ec
            goto L_0x007b
        L_0x0094:
            r3 = r0
        L_0x0095:
            int r0 = r10.A02     // Catch:{ NumberFormatException -> 0x00dc }
            switch(r0) {
                case 401: goto L_0x00b0;
                case 402: goto L_0x00b0;
                case 403: goto L_0x00b0;
                case 404: goto L_0x00a2;
                case 405: goto L_0x00b0;
                case 406: goto L_0x00a2;
                case 407: goto L_0x00a2;
                case 408: goto L_0x00a2;
                case 409: goto L_0x00a2;
                case 410: goto L_0x00b0;
                case 411: goto L_0x00a2;
                case 412: goto L_0x00a2;
                case 413: goto L_0x00a2;
                case 414: goto L_0x00a2;
                case 415: goto L_0x00a2;
                case 416: goto L_0x00a2;
                case 417: goto L_0x00b0;
                case 418: goto L_0x00a2;
                case 419: goto L_0x00a2;
                case 420: goto L_0x00b0;
                case 421: goto L_0x00a2;
                default: goto L_0x009a;
            }     // Catch:{ NumberFormatException -> 0x00dc }
        L_0x009a:
            X.1QE r1 = r9.A04     // Catch:{ NumberFormatException -> 0x00dc }
            java.lang.String r0 = "There's no valid transaction status. Updating the incentive record in the payment contacts table failed."
            r1.A05(r0)     // Catch:{ NumberFormatException -> 0x00dc }
            goto L_0x00ec
        L_0x00a2:
            java.lang.String r0 = r10.A0K     // Catch:{ NumberFormatException -> 0x00dc }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00dc }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00dc }
            r3.remove(r0)     // Catch:{ NumberFormatException -> 0x00dc }
            goto L_0x00bd
        L_0x00b0:
            java.lang.String r0 = r10.A0K     // Catch:{ NumberFormatException -> 0x00dc }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00dc }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00dc }
            r3.add(r0)     // Catch:{ NumberFormatException -> 0x00dc }
        L_0x00bd:
            java.lang.String r2 = r2.A02     // Catch:{ all -> 0x00ee }
            X.76o r1 = r4.A02     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00d1
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00ee }
            r0.<init>()     // Catch:{ all -> 0x00ee }
            X.76o r1 = new X.76o     // Catch:{ all -> 0x00ee }
            r1.<init>()     // Catch:{ all -> 0x00ee }
            r1.A00 = r0     // Catch:{ all -> 0x00ee }
            r4.A02 = r1     // Catch:{ all -> 0x00ee }
        L_0x00d1:
            java.util.HashMap r0 = r1.A00     // Catch:{ all -> 0x00ee }
            r0.put(r2, r3)     // Catch:{ all -> 0x00ee }
            boolean r0 = A0G(r5, r4, r6)     // Catch:{ all -> 0x00ee }
            monitor-exit(r9)
            return r0
        L_0x00dc:
            r2 = move-exception
            X.1QE r1 = r9.A04     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "There was a problem parsing the paymentTransactionInfo.id"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x00ee }
            goto L_0x00ec
        L_0x00e5:
            X.1QE r1 = r9.A04     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "insertOrUpdateIncentivePaymentContactInfo/ Receiver Jid or transaction id are null. Updating the incentive record in the payment contacts table failed."
            r1.A05(r0)     // Catch:{ all -> 0x00ee }
        L_0x00ec:
            monitor-exit(r9)
            return r8
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.A0d(X.AW0):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0140, code lost:
        if (r6 <= 0) goto L_0x0142;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0e(X.AW0 r19, X.AW0 r20, java.lang.String r21) {
        /*
            r18 = this;
            r11 = 0
            r3 = r18
            r8 = r19
            r4 = r21
            r8.A0L = r4     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            r9 = r20
            android.content.ContentValues r0 = r3.A0I(r9, r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            if (r0 != 0) goto L_0x0019
            X.1QE r1 = r3.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessage() content-values are null, nothing to update"
            r1.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            return r11
        L_0x0019:
            int r0 = r0.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            if (r0 <= 0) goto L_0x0151
            X.1Cd r0 = r3.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            X.1au r10 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            android.content.ContentValues r13 = r3.A0J(r9, r8)     // Catch:{ all -> 0x0147 }
            r6 = 0
            if (r13 != 0) goto L_0x0036
            X.1QE r5 = r3.A04     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 content values are null, nothing to update"
        L_0x0031:
            r5.A06(r0)     // Catch:{ all -> 0x0147 }
            goto L_0x013b
        L_0x0036:
            boolean r0 = r8.A0P     // Catch:{ all -> 0x0147 }
            java.lang.String r1 = "key_id"
            if (r0 != 0) goto L_0x006a
            r13.put(r1, r4)     // Catch:{ all -> 0x0147 }
        L_0x003f:
            java.lang.String r2 = "/"
            if (r20 != 0) goto L_0x0088
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0147 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0147 }
            java.lang.String r1 = "insertOrUpdatePaymentInfoWithoutMessageV2/REPLACE_PAY_TRANSACTION"
            java.lang.String r0 = "pay_transaction"
            long r6 = r5.A07(r0, r1, r13)     // Catch:{ all -> 0x0147 }
            X.1QE r5 = r3.A04     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            r1.<init>()     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2/"
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            r1.append(r4)     // Catch:{ all -> 0x0147 }
            r1.append(r2)     // Catch:{ all -> 0x0147 }
            r1.append(r6)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0147 }
            goto L_0x0031
        L_0x006a:
            java.lang.String r0 = "interop_id"
            r13.put(r0, r4)     // Catch:{ all -> 0x0147 }
            r13.remove(r1)     // Catch:{ all -> 0x0147 }
            X.1QE r1 = r3.A04     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 interop_id is added to content values"
            r1.A06(r0)     // Catch:{ all -> 0x0147 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 keyId is empty"
        L_0x0081:
            r1.A06(r0)     // Catch:{ all -> 0x0147 }
            goto L_0x003f
        L_0x0085:
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 keyId is not empty"
            goto L_0x0081
        L_0x0088:
            boolean r0 = r9.A0P(r8)     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x0147 }
            android.util.Pair r0 = A08(r4, r0)     // Catch:{ all -> 0x0147 }
            if (r0 != 0) goto L_0x00b5
            X.1QE r5 = r3.A04     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            r1.<init>()     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2 got null query and params for interop id: "
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            r1.append(r4)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = " trans id: "
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x0147 }
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0147 }
            goto L_0x0031
        L_0x00b5:
            java.lang.Object r15 = r0.first     // Catch:{ all -> 0x0147 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0147 }
            java.lang.Object r6 = r0.second     // Catch:{ all -> 0x0147 }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ all -> 0x0147 }
            X.1QE r5 = r3.A04     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            r1.<init>()     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2 already exists with old message id: "
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r9.A0L     // Catch:{ all -> 0x0147 }
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "; new key id: "
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r8.A0L     // Catch:{ all -> 0x0147 }
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = " old transaction id: "
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0147 }
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = " new transaction id: "
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x0147 }
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = " query: "
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            r1.append(r15)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = " params: "
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = java.util.Arrays.toString(r6)     // Catch:{ all -> 0x0147 }
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0147 }
            r0 = 0
            X.AnonymousClass1QE.A02(r5, r0, r1)     // Catch:{ all -> 0x0147 }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0147 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x0147 }
            java.lang.String r14 = "pay_transaction"
            java.lang.String r16 = "insertOrUpdatePaymentInfoWithoutMessageV2/UPDATE_PAY_TRANSACTION"
            r17 = r6
            int r0 = r12.A02(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0147 }
            long r6 = (long) r0     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            r1.<init>()     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2/found old row and updating transaction id: "
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x0147 }
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = " message id: "
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            r1.append(r4)     // Catch:{ all -> 0x0147 }
            r1.append(r2)     // Catch:{ all -> 0x0147 }
            r1.append(r6)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0147 }
            goto L_0x0031
        L_0x013b:
            r4 = 0
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0143
        L_0x0142:
            r0 = 0
        L_0x0143:
            r10.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            return r0
        L_0x0147:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x014c }
            goto L_0x0150
        L_0x014c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
        L_0x0150:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
        L_0x0151:
            X.1QE r2 = r3.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage/found no columns to update: "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            r1.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            r2.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0168 }
            return r11
        L_0x0168:
            r2 = move-exception
            X.1QE r1 = r3.A04
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage"
            r1.A0A(r0, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.A0e(X.AW0, X.AW0, java.lang.String):boolean");
    }

    public static Pair A04(Pair pair, Pair pair2, String str) {
        if (TextUtils.isEmpty((CharSequence) pair.first)) {
            return pair2;
        }
        if (TextUtils.isEmpty((CharSequence) pair2.first)) {
            return pair;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append((String) pair.first);
        sb.append(") ");
        sb.append(str);
        sb.append(" (");
        sb.append((String) pair2.first);
        sb.append(")");
        String obj = sb.toString();
        Object obj2 = pair.second;
        int length = ((String[]) obj2).length;
        String[] strArr = new String[(((String[]) pair2.second).length + length)];
        System.arraycopy(obj2, 0, strArr, 0, length);
        Object obj3 = pair2.second;
        System.arraycopy(obj3, 0, strArr, ((String[]) pair.second).length, ((String[]) obj3).length);
        return new Pair(obj, strArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A06(X.AnonymousClass1QR r9, X.C188079gq r10) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.ADh r0 = r10.A01
            if (r0 == 0) goto L_0x00fe
            java.lang.String[] r0 = r0.A01
            java.util.Collections.addAll(r3, r0)
            X.ADh r0 = r10.A01
            java.lang.String r0 = r0.A00
        L_0x0017:
            r2.add(r0)
        L_0x001a:
            com.whatsapp.jid.UserJid r1 = A0A(r9)
            X.1DL r0 = r9.A02
            long r0 = r0.A09(r1)
            java.lang.String r5 = java.lang.Long.toString(r0)
            boolean r0 = r10.A06
            r7 = 1
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "(type=? OR type=? OR type=?)"
            r2.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r7)
            r3.add(r0)
            r0 = 10
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r3.add(r0)
            r0 = 100
            java.lang.String r0 = java.lang.Integer.toString(r0)
        L_0x0048:
            r3.add(r0)
        L_0x004b:
            java.lang.String r0 = "( receiver_jid_row_id=? OR sender_jid_row_id=? OR (service_id=? AND (type=? OR type=? OR type=? OR type=?)))"
            r2.add(r0)
            r3.add(r5)
            r3.add(r5)
            r0 = 6
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.add(r0)
            r0 = 7
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.add(r0)
            r0 = 8
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.add(r0)
            r0 = 9
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.add(r0)
            boolean r0 = r10.A02
            r4 = 0
            if (r0 == 0) goto L_0x00db
            java.lang.String r6 = "(status IN (?, ?, ?, ?))"
        L_0x007f:
            r0 = 4
            java.lang.String[] r5 = new java.lang.String[r0]
            r0 = 405(0x195, float:5.68E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r4] = r0
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r7] = r0
            r0 = 604(0x25c, float:8.46E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 2
            r5[r0] = r1
            r0 = 408(0x198, float:5.72E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 3
            r5[r0] = r1
            android.util.Pair r1 = android.util.Pair.create(r5, r6)
            java.lang.Object r0 = r1.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.Collections.addAll(r3, r0)
            java.lang.Object r0 = r1.second
            r2.add(r0)
        L_0x00b4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "("
            r1.append(r0)
            java.lang.String r0 = " AND "
            java.lang.String r0 = android.text.TextUtils.join(r0, r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r0 = r3.toArray(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
        L_0x00db:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x00b4
            java.lang.String r6 = "(status NOT IN (?, ?, ?, ?))"
            goto L_0x007f
        L_0x00e2:
            X.9RF r0 = r10.A00
            if (r0 == 0) goto L_0x004b
            X.C17960vV.A07(r0)
            r4 = 20
            r1 = 2
            java.lang.String r0 = "(type=? OR type=?)"
            r2.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r1)
            r3.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r4)
            goto L_0x0048
        L_0x00fe:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x001a
            r0 = 18
            java.lang.String[] r4 = new java.lang.String[r0]
            r0 = 19
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r4[r0] = r1
            r8 = 12
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r6 = 1
            r4[r6] = r0
            r7 = 17
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r5 = 2
            r4[r5] = r0
            r0 = 608(0x260, float:8.52E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 3
            r4[r0] = r1
            r1 = 4
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r4[r1] = r0
            r1 = 5
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r4[r1] = r0
            r0 = 20
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = 6
            r4[r1] = r0
            r6 = 10
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r5 = 7
            r4[r5] = r0
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r1 = 8
            r4[r1] = r0
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r5 = 9
            r4[r5] = r0
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r4[r6] = r0
            r1 = 11
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r4[r1] = r0
            r0 = 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4[r8] = r0
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 13
            r4[r0] = r1
            r0 = 40
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 14
            r4[r0] = r1
            r0 = 415(0x19f, float:5.82E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 15
            r4[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 16
            r4[r0] = r1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4[r7] = r0
            java.lang.String r0 = "((status!=?) AND (status!=?) AND (status!=?) AND (status!=?) AND (type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR (type=? AND (status=? OR status=? OR status=?))))"
            android.util.Pair r1 = android.util.Pair.create(r4, r0)
            java.lang.Object r0 = r1.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.Collections.addAll(r3, r0)
            java.lang.Object r0 = r1.second
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.A06(X.1QR, X.9gq):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x038f, code lost:
        if (r1 != null) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03b6, code lost:
        if (r2 == 602) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0167, code lost:
        if (r8 != 30) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0275, code lost:
        if (r8 != 3) goto L_0x0279;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0350  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AW0 A09(android.database.Cursor r49, X.AnonymousClass1QR r50) {
        /*
            r7 = r50
            X.1DL r6 = r7.A02
            java.lang.String r0 = "remote_jid_row_id"
            r3 = r49
            int r0 = r3.getColumnIndexOrThrow(r0)
            long r0 = r3.getLong(r0)
            com.whatsapp.jid.Jid r1 = r6.A0B(r0)
            boolean r0 = r1 instanceof X.AnonymousClass1BI
            if (r0 == 0) goto L_0x001e
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1BI r1 = r7.A0O(r1)
        L_0x001e:
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1BI r28 = X.C22931Dv.A00(r1)
            java.lang.String r0 = "key_id"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r27 = r3.getString(r0)
            java.lang.String r0 = "id"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r26 = r3.getString(r0)
            java.lang.String r0 = "init_timestamp"
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r0 = r3.getInt(r0)
            long r0 = (long) r0
            r10 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r10
            java.lang.String r2 = "timestamp"
            int r4 = r3.getColumnIndexOrThrow(r2)
            boolean r2 = r3.isNull(r4)
            if (r2 == 0) goto L_0x027f
            r2 = 0
        L_0x0054:
            long r8 = (long) r2
            long r8 = r8 * r10
            r4 = 0
            long r14 = java.lang.Math.max(r8, r4)
            java.lang.String r2 = "status"
            int r2 = r3.getColumnIndexOrThrow(r2)
            int r25 = r3.getInt(r2)
            java.lang.String r2 = "sender_jid_row_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            long r4 = r3.getLong(r2)
            com.whatsapp.jid.Jid r4 = r6.A0B(r4)
            boolean r2 = r4 instanceof X.AnonymousClass1BI
            if (r2 == 0) goto L_0x0080
            X.1BI r4 = (X.AnonymousClass1BI) r4
            X.1BI r4 = r7.A0O(r4)
        L_0x0080:
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r24 = X.C22941Dw.A01(r4)
            java.lang.String r2 = "receiver_jid_row_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            long r4 = r3.getLong(r2)
            com.whatsapp.jid.Jid r4 = r6.A0B(r4)
            boolean r2 = r4 instanceof X.AnonymousClass1BI
            if (r2 == 0) goto L_0x009e
            X.1BI r4 = (X.AnonymousClass1BI) r4
            X.1BI r4 = r7.A0O(r4)
        L_0x009e:
            com.whatsapp.jid.UserJid r9 = X.C22941Dw.A01(r4)
            java.lang.String r2 = "type"
            int r2 = r3.getColumnIndexOrThrow(r2)
            int r8 = r3.getInt(r2)
            java.lang.String r2 = "currency_code"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r23 = r3.getString(r2)
            java.lang.String r2 = "amount_1000"
            int r2 = r3.getColumnIndexOrThrow(r2)
            long r12 = r3.getLong(r2)
            java.lang.String r2 = "credential_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r36 = r3.getString(r2)
            java.lang.String r2 = "error_code"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r37 = r3.getString(r2)
            java.lang.String r2 = "bank_transaction_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r38 = r3.getString(r2)
            java.lang.String r2 = "methods"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r22 = r3.getString(r2)
            java.lang.String r2 = "metadata"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r21 = r3.getString(r2)
            java.lang.String r2 = "request_key_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r19 = r3.getString(r2)
            java.lang.String r2 = "country"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r40 = r3.getString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r40)
            if (r2 == 0) goto L_0x010f
            java.lang.String r40 = "IN"
        L_0x010f:
            java.lang.String r2 = "version"
            int r2 = r3.getColumnIndexOrThrow(r2)
            int r43 = r3.getInt(r2)
            java.lang.String r2 = "future_data"
            int r2 = r3.getColumnIndexOrThrow(r2)
            byte[] r11 = r3.getBlob(r2)
            java.lang.String r2 = "service_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            int r18 = r3.getInt(r2)
            java.lang.String r2 = "background_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r4 = r3.getString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x027c
            X.1QQ r2 = r7.A0C
            X.AEX r6 = r2.A03(r4)
        L_0x0145:
            java.lang.String r2 = "purchase_initiator"
            int r2 = r3.getColumnIndexOrThrow(r2)
            int r45 = r3.getInt(r2)
            X.11S r4 = r7.A06
            boolean r2 = r4.A0O(r9)
            if (r2 == 0) goto L_0x025c
            X.A8n r2 = X.C20128A8n.$redex_init_class
            r2 = 20
            if (r8 == r2) goto L_0x0169
            r2 = 40
            if (r8 == r2) goto L_0x0169
            r2 = 10
            if (r8 == r2) goto L_0x0169
            r2 = 30
            if (r8 != r2) goto L_0x025c
        L_0x0169:
            r5 = 1
        L_0x016a:
            java.lang.String r2 = "interop_id"
            int r2 = r3.getColumnIndexOrThrow(r2)
            java.lang.String r20 = r3.getString(r2)
            X.1QE r2 = r7.A04
            r50 = r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "readTransactionInfoByTransId got from db: id: "
            r3.append(r2)
            r2 = r26
            r3.append(r2)
            java.lang.String r2 = " timestamp: "
            r3.append(r2)
            r3.append(r14)
            java.lang.String r2 = " service_id: "
            r3.append(r2)
            r2 = r18
            r3.append(r2)
            java.lang.String r2 = " type: "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = " status: "
            r3.append(r2)
            r2 = r25
            r3.append(r2)
            java.lang.String r2 = " description:  peer: "
            r3.append(r2)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r2 = r50
            X.AnonymousClass1QE.A02(r2, r4, r3)
            r2 = 5
            if (r8 != r2) goto L_0x020c
            boolean r2 = android.text.TextUtils.isEmpty(r23)
            if (r2 == 0) goto L_0x020c
            X.A8n r2 = X.C20128A8n.$redex_init_class
            r14 = 5
            r16 = 0
            X.AW0 r3 = new X.AW0
            r12 = r3
            r13 = r40
            r15 = r43
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            r3.A0R = r11
            r16 = 0
        L_0x01db:
            r3.A0B(r6)
            r0 = r28
            r3.A0C = r0
            r3.A0Q = r5
            boolean r0 = android.text.TextUtils.isEmpty(r27)
            if (r0 == 0) goto L_0x01f2
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x01f6
            r27 = r20
        L_0x01f2:
            r0 = r27
            r3.A0L = r0
        L_0x01f6:
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 != 0) goto L_0x0200
            r0 = r19
            r3.A0M = r0
        L_0x0200:
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x0339
            X.1KJ r19 = r3.A01()
            r2 = 0
            goto L_0x0285
        L_0x020c:
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r12)
            r2 = -3
            java.math.BigDecimal r12 = r3.scaleByPowerOfTen(r2)
            X.1KI r3 = r7.A0A
            r2 = r23
            X.1KJ r2 = r3.A01(r2)
            r16 = 0
            X.A8n r3 = X.C20128A8n.$redex_init_class
            r3 = 4
            if (r8 == r3) goto L_0x0257
            r3 = r2
            X.1KK r3 = (X.AnonymousClass1KK) r3
            int r3 = r3.A01
            X.1KN r10 = new X.1KN
            r10.<init>(r12, r3)
            X.AW0 r3 = new X.AW0
            r29 = r3
            r30 = r2
            r31 = r10
            r32 = r24
            r33 = r9
            r34 = r23
            r35 = r26
            r39 = r4
            r41 = r8
            r42 = r25
            r44 = r18
            r46 = r0
            r48 = r14
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48)
            r3.A0R = r11
            r0 = 0
            r3.A0E(r0)
            r3.A07 = r2
            goto L_0x01db
        L_0x0257:
            X.AW0 r3 = X.C20128A8n.A01(r0)
            goto L_0x01db
        L_0x025c:
            r2 = r24
            boolean r2 = r4.A0O(r2)
            if (r2 == 0) goto L_0x0279
            X.A8n r2 = X.C20128A8n.$redex_init_class
            r2 = 2
            r4 = 1
            if (r8 == r2) goto L_0x0169
            r2 = 200(0xc8, float:2.8E-43)
            if (r8 == r2) goto L_0x0169
            if (r8 == r4) goto L_0x0169
            r2 = 100
            if (r8 == r2) goto L_0x0169
            r2 = 3
            if (r8 != r2) goto L_0x0279
            goto L_0x0169
        L_0x0279:
            r5 = 0
            goto L_0x016a
        L_0x027c:
            r6 = 0
            goto L_0x0145
        L_0x027f:
            int r2 = r3.getInt(r4)
            goto L_0x0054
        L_0x0285:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0330 }
            r0 = r22
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0330 }
            int r0 = r1.length()     // Catch:{ JSONException -> 0x0330 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0330 }
            r12.<init>(r0)     // Catch:{ JSONException -> 0x0330 }
            r11 = 0
            r10 = 0
        L_0x0297:
            int r0 = r1.length()     // Catch:{ JSONException -> 0x0330 }
            if (r10 >= r0) goto L_0x032b
            org.json.JSONObject r13 = r1.getJSONObject(r10)     // Catch:{ JSONException -> 0x0330 }
            java.lang.String r0 = "t"
            int r15 = r13.optInt(r0, r11)     // Catch:{ JSONException -> 0x0330 }
            java.lang.String r0 = "st"
            java.lang.String r14 = r13.optString(r0, r4)     // Catch:{ JSONException -> 0x0330 }
            java.lang.String r0 = "cc"
            java.lang.String r18 = r13.optString(r0, r4)     // Catch:{ JSONException -> 0x0330 }
            java.lang.String r0 = "c"
            java.lang.String r6 = r13.optString(r0, r4)     // Catch:{ JSONException -> 0x0330 }
            java.lang.String r0 = "n"
            java.lang.String r5 = r13.optString(r0, r4)     // Catch:{ JSONException -> 0x0330 }
            java.lang.String r0 = "a"
            java.lang.String r8 = r13.optString(r0, r4)     // Catch:{ JSONException -> 0x0330 }
            java.lang.String r9 = "sd"
            r0 = 1
            int r9 = r13.optInt(r9, r0)     // Catch:{ JSONException -> 0x0330 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0330 }
            if (r0 != 0) goto L_0x0314
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x0330 }
            if (r0 != 0) goto L_0x0314
            r0 = r19
            X.1KK r0 = (X.AnonymousClass1KK) r0     // Catch:{ JSONException -> 0x0330 }
            int r0 = r0.A01     // Catch:{ JSONException -> 0x0330 }
            X.1KN r8 = X.AnonymousClass2TQ.A00(r8, r0)     // Catch:{ JSONException -> 0x0330 }
            if (r8 == 0) goto L_0x030e
            boolean r0 = r8.A00()     // Catch:{ JSONException -> 0x0330 }
            if (r0 == 0) goto L_0x030e
            X.2tK r0 = X.C63572tK.A00(r18)     // Catch:{ JSONException -> 0x0330 }
            X.AEs r6 = X.C20284AEs.A01(r0, r14, r6, r5, r15)     // Catch:{ JSONException -> 0x0330 }
            boolean r0 = r6 instanceof X.AnonymousClass8pK     // Catch:{ JSONException -> 0x0330 }
            if (r0 == 0) goto L_0x0303
            r5 = r6
            X.8pK r5 = (X.AnonymousClass8pK) r5     // Catch:{ JSONException -> 0x0330 }
            java.lang.String r0 = "ci"
            int r0 = r13.optInt(r0, r11)     // Catch:{ JSONException -> 0x0330 }
            r5.A01 = r0     // Catch:{ JSONException -> 0x0330 }
        L_0x0303:
            X.9dI r0 = new X.9dI     // Catch:{ JSONException -> 0x0330 }
            r0.<init>(r8, r6, r9)     // Catch:{ JSONException -> 0x0330 }
            r12.add(r0)     // Catch:{ JSONException -> 0x0330 }
            int r10 = r10 + 1
            goto L_0x0297
        L_0x030e:
            java.lang.String r0 = "PAY: PaymentTransaction:Source:fromJsonString could not parse string amount"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ JSONException -> 0x0330 }
            goto L_0x0336
        L_0x0314:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0330 }
            r1.<init>()     // Catch:{ JSONException -> 0x0330 }
            java.lang.String r0 = "PAY: PaymentTransaction:Source:fromJsonString could not parse string: "
            r1.append(r0)     // Catch:{ JSONException -> 0x0330 }
            r0 = r22
            r1.append(r0)     // Catch:{ JSONException -> 0x0330 }
            java.lang.String r0 = r1.toString()     // Catch:{ JSONException -> 0x0330 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ JSONException -> 0x0330 }
            goto L_0x0336
        L_0x032b:
            r12.size()     // Catch:{ JSONException -> 0x0330 }
            r2 = r12
            goto L_0x0336
        L_0x0330:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentTransaction:Source:fromJsonString threw json exception in response: "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0336:
            r3.A0D(r2)
        L_0x0339:
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x0342
            r0 = 1
            r3.A0P = r0
        L_0x0342:
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x03dc
            com.whatsapp.payments.PaymentConfiguration r2 = r7.A00
            if (r2 == 0) goto L_0x03dc
            int r6 = r3.A01
            if (r6 == 0) goto L_0x0387
            X.0zA r0 = r2.A01
            java.lang.Object r5 = r0.A03()
            X.2as r5 = (X.C52412as) r5
            monitor-enter(r5)
            java.util.Map r0 = r5.A00     // Catch:{ all -> 0x0384 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0384 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0384 }
        L_0x0363:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0384 }
            if (r0 == 0) goto L_0x0382
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0384 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0384 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0384 }
            X.0vp r0 = (X.C18140vp) r0     // Catch:{ all -> 0x0384 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0384 }
            X.AZ9 r1 = (X.AZ9) r1     // Catch:{ all -> 0x0384 }
            int r0 = r1.BZ3()     // Catch:{ all -> 0x0384 }
            if (r6 != r0) goto L_0x0363
            goto L_0x0392
        L_0x0382:
            monitor-exit(r5)
            goto L_0x0399
        L_0x0384:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0387:
            java.lang.String r1 = r3.A0G
            java.lang.String r0 = r3.A0I
            X.BD1 r1 = r2.A02(r1, r0)
            if (r1 == 0) goto L_0x0399
            goto L_0x0393
        L_0x0392:
            monitor-exit(r5)
        L_0x0393:
            X.8pG r0 = r1.BdL()
            r3.A0A = r0
        L_0x0399:
            X.8pG r1 = r3.A0A
            if (r1 == 0) goto L_0x03dc
            r0 = r21
            r1.A06(r0)
            monitor-enter(r3)
            boolean r0 = r3.A0J()     // Catch:{ all -> 0x03b0 }
            if (r0 != 0) goto L_0x03b8
            int r2 = r3.A02     // Catch:{ all -> 0x03b0 }
            r0 = 608(0x260, float:8.52E-43)
            if (r2 == r0) goto L_0x03b8
            goto L_0x03b3
        L_0x03b0:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x03b3:
            r1 = 602(0x25a, float:8.44E-43)
            r0 = 0
            if (r2 != r1) goto L_0x03b9
        L_0x03b8:
            r0 = 1
        L_0x03b9:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x03dc
            X.8pG r0 = r3.A0A
            long r5 = r0.A0A()
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x03dc
            X.11P r0 = r7.A01
            long r1 = X.AnonymousClass11P.A01(r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03dc
            int r2 = r3.A03
            r1 = 8
            r0 = 16
            if (r2 != r1) goto L_0x03da
            r0 = 607(0x25f, float:8.5E-43)
        L_0x03da:
            r3.A02 = r0
        L_0x03dc:
            int r0 = r3.A01
            if (r0 != 0) goto L_0x03f4
            com.whatsapp.payments.PaymentConfiguration r2 = r7.A00
            if (r2 == 0) goto L_0x0415
            java.lang.String r1 = r3.A0G
            java.lang.String r0 = r3.A0I
            X.BD1 r0 = r2.A02(r1, r0)
            if (r0 == 0) goto L_0x0415
            int r0 = r0.BZ3()
        L_0x03f2:
            r3.A01 = r0
        L_0x03f4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "readTransactionFromCursor: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " countryData: "
            r1.append(r0)
            X.8pG r0 = r3.A0A
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = r50
            X.AnonymousClass1QE.A02(r0, r4, r1)
            return r3
        L_0x0415:
            r0 = 0
            goto L_0x03f2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.A09(android.database.Cursor, X.1QR):X.AW0");
    }

    public static UserJid A0A(AnonymousClass1QR r0) {
        AnonymousClass11S r02 = r0.A06;
        r02.A0I();
        AnonymousClass1E8 r03 = r02.A0D;
        C17960vV.A07(r03);
        UserJid userJid = (UserJid) r03.A0J;
        C17960vV.A07(userJid);
        return userJid;
    }

    private synchronized ArrayList A0E(String str, String[] strArr, int i) {
        String str2;
        Cursor A0B2;
        ArrayList A0B3;
        synchronized (this) {
            if (i > 0) {
                str2 = Integer.toString(i);
            } else {
                str2 = "";
            }
            try {
                C28781at A042 = this.A03.get();
                try {
                    A0B2 = ((C28801av) A042).A02.A0B("pay_transaction", A0D, str, strArr, (String) null, "init_timestamp DESC", str2, "readPendingRequestsV2/QUERY_PAY_TRANSACTION");
                    A0B3 = A0B(A0B2, this, "queryPaymentTransactionInfosV2");
                    AnonymousClass1QE r2 = this.A04;
                    StringBuilder sb = new StringBuilder();
                    sb.append("readPendingRequests returned: ");
                    sb.append(A0B3.size());
                    AnonymousClass1QE.A02(r2, (String) null, sb.toString());
                    if (A0B2 != null) {
                        A0B2.close();
                    }
                    A042.close();
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            } catch (IllegalStateException e) {
                this.A04.A0A("queryPaymentTransactionInfosV2/IllegalStateException ", e);
                return new ArrayList();
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        }
        return A0B3;
        throw th;
    }

    public static void A0F(ContentValues contentValues, Pair pair, C28791au r8) {
        ((C28801av) r8).A02.A02(contentValues, "pay_transaction", (String) pair.first, "failPendingTransactionV2/UPDATE_PAY_TRANSACTION", (String[]) pair.second);
    }

    public static boolean A0G(C24751Ln r2, AnonymousClass8pI r3, AnonymousClass1KH r4) {
        PhoneUserJid A0D2;
        UserJid userJid = r3.A03;
        if (userJid instanceof PhoneUserJid) {
            return r4.A0J(r3, userJid, r2.A0C((PhoneUserJid) userJid));
        }
        if (!(userJid instanceof AnonymousClass1E2) || (A0D2 = r2.A0D((AnonymousClass1E1) userJid)) == null) {
            return false;
        }
        return r4.A0J(r3, A0D2, userJid);
    }

    public long A0H() {
        Cursor A0A2;
        long j;
        C28781at A042 = this.A03.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT COUNT(*) as count FROM pay_transaction", "COUNT_TRANSACTIONS_SQL", (String[]) null);
            if (A0A2.moveToNext()) {
                j = A0A2.getLong(A0A2.getColumnIndexOrThrow("count"));
            } else {
                this.A04.A06("PaymentTransactionStore/countAllTransactions/version=2/db no message");
                j = 0;
            }
            A0A2.close();
            A042.close();
            return j;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a5 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.ContentValues A0I(X.AW0 r9, X.AW0 r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0058
            boolean r0 = r9.A0P(r10)
            if (r0 != 0) goto L_0x0058
            X.1QE r4 = r8.A04
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "writeTransactionToCValues skipping transaction with: "
            r5.append(r0)
            java.lang.String r0 = r10.A0K
            r5.append(r0)
            java.lang.String r0 = " as status is not updated  old ts: "
            r5.append(r0)
            long r0 = r9.A06
            r5.append(r0)
            java.lang.String r3 = " counter: "
            r5.append(r3)
            X.8pG r0 = r9.A0A
            r2 = 0
            if (r0 == 0) goto L_0x0056
            int r0 = r0.A08()
        L_0x0032:
            r5.append(r0)
            java.lang.String r0 = " new ts: "
            r5.append(r0)
            long r0 = r10.A06
            r5.append(r0)
            r5.append(r3)
            X.8pG r0 = r10.A0A
            if (r0 == 0) goto L_0x004a
            int r2 = r0.A08()
        L_0x004a:
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r4.A06(r0)
            r0 = 0
            return r0
        L_0x0056:
            r0 = 0
            goto L_0x0032
        L_0x0058:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r0 = r10.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006c
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r10.A0L
            r3.put(r1, r0)
        L_0x006c:
            int r0 = r10.A03
            if (r0 == 0) goto L_0x007a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "type"
            r3.put(r0, r1)
        L_0x007a:
            java.lang.String r0 = r10.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0089
            java.lang.String r1 = "id"
            java.lang.String r0 = r10.A0K
            r3.put(r1, r0)
        L_0x0089:
            X.1KN r0 = r10.A09
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00a9
            X.1KN r0 = r10.A09
            java.math.BigDecimal r1 = r0.A00
            r0 = 3
            java.math.BigDecimal r0 = r1.scaleByPowerOfTen(r0)
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "amount_1000"
            r3.put(r0, r1)
        L_0x00a9:
            long r1 = r10.A05
            r6 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00be
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "init_timestamp"
            r3.put(r0, r1)
        L_0x00be:
            int r0 = r10.A02
            java.lang.String r1 = "status"
            if (r0 != 0) goto L_0x00c9
            if (r9 == 0) goto L_0x00d0
            int r0 = r9.A02
        L_0x00c9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r1, r0)
        L_0x00d0:
            long r1 = r10.A06
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e2
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r3.put(r0, r1)
        L_0x00e2:
            java.lang.String r0 = r10.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00f1
            java.lang.String r1 = "credential_id"
            java.lang.String r0 = r10.A0H
            r3.put(r1, r0)
        L_0x00f1:
            java.lang.String r0 = r10.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0100
            java.lang.String r1 = "error_code"
            java.lang.String r0 = r10.A0J
            r3.put(r1, r0)
        L_0x0100:
            java.lang.String r0 = r10.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x010f
            java.lang.String r1 = "bank_transaction_id"
            java.lang.String r0 = r10.A0F
            r3.put(r1, r0)
        L_0x010f:
            java.lang.String r0 = r10.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x011e
            java.lang.String r1 = "request_key_id"
            java.lang.String r0 = r10.A0M
            r3.put(r1, r0)
        L_0x011e:
            java.util.ArrayList r2 = r10.A0N
            java.lang.String r1 = "methods"
            if (r2 == 0) goto L_0x01a5
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x01a5
            java.lang.String r0 = X.C20128A8n.A05(r2)
        L_0x012e:
            r3.put(r1, r0)
        L_0x0131:
            java.lang.String r2 = "metadata"
            if (r9 == 0) goto L_0x019c
            X.8pG r1 = r9.A0A
            if (r1 == 0) goto L_0x019c
            X.8pG r0 = r10.A0A
            if (r0 == 0) goto L_0x0147
            r1.A0R(r0)
            X.8pG r1 = r9.A0A
            int r0 = r9.A02
            r1.A0M(r0)
        L_0x0147:
            java.lang.String r0 = r1.A0J()
        L_0x014b:
            r3.put(r2, r0)
        L_0x014e:
            java.lang.String r0 = r10.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x015d
            java.lang.String r1 = "country"
            java.lang.String r0 = r10.A0G
            r3.put(r1, r0)
        L_0x015d:
            int r0 = r10.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "version"
            r3.put(r0, r1)
            byte[] r1 = r10.A0R
            if (r1 == 0) goto L_0x0172
            java.lang.String r0 = "future_data"
            r3.put(r0, r1)
        L_0x0172:
            int r0 = r10.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "service_id"
            r3.put(r0, r1)
            X.AEX r2 = r10.A04()
            if (r2 == 0) goto L_0x0190
            java.lang.String r1 = "background_id"
            java.lang.String r0 = r2.A0F
            r3.put(r1, r0)
            X.1QQ r0 = r8.A0C
            r0.A04(r2)
        L_0x0190:
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "purchase_initiator"
            r3.put(r0, r1)
            return r3
        L_0x019c:
            X.8pG r0 = r10.A0A
            if (r0 == 0) goto L_0x014e
            java.lang.String r0 = r0.A0J()
            goto L_0x014b
        L_0x01a5:
            if (r9 == 0) goto L_0x0131
            java.util.ArrayList r0 = r9.A0N
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = X.C20128A8n.A05(r0)
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.A0I(X.AW0, X.AW0):android.content.ContentValues");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
        if (r1.equalsIgnoreCase(r0) == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x020d, code lost:
        if (r0 != null) goto L_0x01b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0210 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.ContentValues A0J(X.AW0 r9, X.AW0 r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0058
            boolean r0 = r9.A0P(r10)
            if (r0 != 0) goto L_0x0058
            X.1QE r4 = r8.A04
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "writeTransactionToCValuesV2 skipping transaction with: "
            r5.append(r0)
            java.lang.String r0 = r10.A0K
            r5.append(r0)
            java.lang.String r0 = " as status is not updated  old ts: "
            r5.append(r0)
            long r0 = r9.A06
            r5.append(r0)
            java.lang.String r3 = " counter: "
            r5.append(r3)
            X.8pG r0 = r9.A0A
            r2 = 0
            if (r0 == 0) goto L_0x0056
            int r0 = r0.A08()
        L_0x0032:
            r5.append(r0)
            java.lang.String r0 = " new ts: "
            r5.append(r0)
            long r0 = r10.A06
            r5.append(r0)
            r5.append(r3)
            X.8pG r0 = r10.A0A
            if (r0 == 0) goto L_0x004a
            int r2 = r0.A08()
        L_0x004a:
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r4.A06(r0)
            r0 = 0
            return r0
        L_0x0056:
            r0 = 0
            goto L_0x0032
        L_0x0058:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            X.1BI r0 = r10.A0C
            java.lang.String r6 = "remote_jid_row_id"
            r4 = -1
            if (r0 != 0) goto L_0x006b
            if (r9 == 0) goto L_0x0080
            X.1BI r0 = r9.A0C
            if (r0 == 0) goto L_0x0080
        L_0x006b:
            X.1DL r1 = r8.A02
            X.1BI r0 = r8.A0O(r0)
            long r1 = r1.A09(r0)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0080
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.put(r6, r0)
        L_0x0080:
            java.lang.String r0 = r10.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008f
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r10.A0L
            r3.put(r1, r0)
        L_0x008f:
            int r0 = r10.A03
            if (r0 == 0) goto L_0x009d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "type"
            r3.put(r0, r1)
        L_0x009d:
            java.lang.String r0 = r10.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ac
            java.lang.String r1 = "id"
            java.lang.String r0 = r10.A0K
            r3.put(r1, r0)
        L_0x00ac:
            com.whatsapp.jid.UserJid r0 = r10.A0E
            if (r0 == 0) goto L_0x00c4
            X.1DL r1 = r8.A02
            X.1BI r0 = r8.A0O(r0)
            long r0 = r1.A09(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "sender_jid_row_id"
            r3.put(r0, r1)
        L_0x00c4:
            com.whatsapp.jid.UserJid r0 = r10.A0D
            if (r0 == 0) goto L_0x00db
            X.1DL r1 = r8.A02
            X.1BI r0 = r8.A0O(r0)
            long r0 = r1.A09(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "receiver_jid_row_id"
            r3.put(r0, r1)
        L_0x00db:
            if (r9 == 0) goto L_0x00f6
            java.lang.String r0 = r10.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00fd
            java.lang.String r1 = r10.A0I
            X.1KJ r0 = X.AnonymousClass1KL.A0C
            X.1KL r0 = (X.AnonymousClass1KL) r0
            java.lang.String r0 = r0.A06
            X.C18070vi.A0W(r0)
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00fd
        L_0x00f6:
            java.lang.String r1 = "currency_code"
            java.lang.String r0 = r10.A0I
            r3.put(r1, r0)
        L_0x00fd:
            X.1KN r0 = r10.A09
            if (r0 == 0) goto L_0x011d
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x011d
            X.1KN r0 = r10.A09
            java.math.BigDecimal r1 = r0.A00
            r0 = 3
            java.math.BigDecimal r0 = r1.scaleByPowerOfTen(r0)
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "amount_1000"
            r3.put(r0, r1)
        L_0x011d:
            long r1 = r10.A05
            r6 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0132
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "init_timestamp"
            r3.put(r0, r1)
        L_0x0132:
            int r0 = r10.A02
            java.lang.String r1 = "status"
            if (r0 != 0) goto L_0x013d
            if (r9 == 0) goto L_0x0144
            int r0 = r9.A02
        L_0x013d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r1, r0)
        L_0x0144:
            long r1 = r10.A06
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r3.put(r0, r1)
        L_0x0156:
            java.lang.String r0 = r10.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0165
            java.lang.String r1 = "credential_id"
            java.lang.String r0 = r10.A0H
            r3.put(r1, r0)
        L_0x0165:
            java.lang.String r0 = r10.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0174
            java.lang.String r1 = "error_code"
            java.lang.String r0 = r10.A0J
            r3.put(r1, r0)
        L_0x0174:
            java.lang.String r0 = r10.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0183
            java.lang.String r1 = "bank_transaction_id"
            java.lang.String r0 = r10.A0F
            r3.put(r1, r0)
        L_0x0183:
            java.lang.String r0 = r10.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0192
            java.lang.String r1 = "request_key_id"
            java.lang.String r0 = r10.A0M
            r3.put(r1, r0)
        L_0x0192:
            java.util.ArrayList r2 = r10.A0N
            java.lang.String r1 = "methods"
            if (r2 == 0) goto L_0x0210
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0210
            java.lang.String r0 = X.C20128A8n.A05(r2)
        L_0x01a2:
            r3.put(r1, r0)
        L_0x01a5:
            java.lang.String r2 = "metadata"
            if (r9 == 0) goto L_0x020b
            X.8pG r1 = r9.A0A
            if (r1 == 0) goto L_0x020b
            X.8pG r0 = r10.A0A
            if (r0 == 0) goto L_0x01b4
            r1.A0R(r0)
        L_0x01b4:
            X.8pG r0 = r9.A0A
        L_0x01b6:
            java.lang.String r0 = r0.A0J()
            r3.put(r2, r0)
        L_0x01bd:
            java.lang.String r0 = r10.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01cc
            java.lang.String r1 = "country"
            java.lang.String r0 = r10.A0G
            r3.put(r1, r0)
        L_0x01cc:
            int r0 = r10.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "version"
            r3.put(r0, r1)
            byte[] r1 = r10.A0R
            if (r1 == 0) goto L_0x01e1
            java.lang.String r0 = "future_data"
            r3.put(r0, r1)
        L_0x01e1:
            int r0 = r10.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "service_id"
            r3.put(r0, r1)
            X.AEX r2 = r10.A04()
            if (r2 == 0) goto L_0x01ff
            java.lang.String r1 = "background_id"
            java.lang.String r0 = r2.A0F
            r3.put(r1, r0)
            X.1QQ r0 = r8.A0C
            r0.A04(r2)
        L_0x01ff:
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "purchase_initiator"
            r3.put(r0, r1)
            return r3
        L_0x020b:
            X.8pG r0 = r10.A0A
            if (r0 == 0) goto L_0x01bd
            goto L_0x01b6
        L_0x0210:
            if (r9 == 0) goto L_0x01a5
            java.util.ArrayList r0 = r9.A0N
            if (r0 == 0) goto L_0x01a5
            java.lang.String r0 = X.C20128A8n.A05(r0)
            goto L_0x01a2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.A0J(X.AW0, X.AW0):android.content.ContentValues");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b1, code lost:
        if (r10 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d8, code lost:
        if (r2 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (r8 != null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AW0 A0N(java.lang.String r15, java.lang.String r16, long r17) {
        /*
            r14 = this;
            r3 = -1
            r2 = 0
            r10 = 0
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            r3 = r16
            if (r0 <= 0) goto L_0x004e
            java.lang.String r0 = "message_row_id=?"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            X.3Ek r1 = new X.3Ek
            r1.<init>(r14)
            java.lang.String r0 = java.lang.Long.toString(r17)
            r1.add(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = " OR key_id=?"
            r4.append(r0)
            r1.add(r15)
        L_0x002b:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = " OR id=?"
            r4.append(r0)
            r1.add(r3)
        L_0x0039:
            java.lang.String r8 = r4.toString()
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r9 = r1.toArray(r0)
            java.lang.String[] r9 = (java.lang.String[]) r9
            if (r8 == 0) goto L_0x00b3
        L_0x0047:
            X.1Cd r0 = r14.A03
            X.1at r4 = r0.get()
            goto L_0x006c
        L_0x004e:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            r1 = 1
            if (r0 != 0) goto L_0x005f
            r0 = 2
            java.lang.String[] r9 = new java.lang.String[r0]
            r9[r2] = r15
            r9[r1] = r15
            java.lang.String r8 = "key_id=? OR interop_id=?"
            goto L_0x0047
        L_0x005f:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00b3
            java.lang.String[] r9 = new java.lang.String[r1]
            r9[r2] = r16
            java.lang.String r8 = "id=?"
            goto L_0x0047
        L_0x006c:
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a7 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x00a7 }
            java.lang.String r6 = "pay_transaction"
            java.lang.String[] r7 = A0D     // Catch:{ all -> 0x00a7 }
            java.lang.String r13 = "getMessagePaymentInfoV2/QUERY_PAY_TRANSACTION"
            r12 = r10
            r11 = r10
            android.database.Cursor r3 = r5.A0B(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00a7 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0097
            X.AW0 r10 = A09(r3, r14)     // Catch:{ 11T -> 0x0088 }
            goto L_0x0097
        L_0x0088:
            r2 = move-exception
            X.1QE r1 = r14.A04     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "getMessagePaymentInfoV2/InvalidJidException - Cannot get PaymentInfo from a message with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x009b }
            r3.close()     // Catch:{ all -> 0x00a7 }
            r4.close()
            return r10
        L_0x0097:
            r3.close()     // Catch:{ all -> 0x00a7 }
            goto L_0x00bb
        L_0x009b:
            r1 = move-exception
            if (r3 == 0) goto L_0x00a6
            r3.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00a7 }
        L_0x00a6:
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00ac }
            throw r1
        L_0x00ac:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x00b1:
            if (r10 != 0) goto L_0x00e5
        L_0x00b3:
            X.1QE r2 = r14.A04
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN PaymentTransactionStore#getMessagePaymentInfoV2 fetching from db, txn is null"
        L_0x00b7:
            r2.A06(r0)
            return r10
        L_0x00bb:
            r4.close()
            if (r10 == 0) goto L_0x00c4
            X.8pG r2 = r10.A0A
            if (r2 != 0) goto L_0x00da
        L_0x00c4:
            com.whatsapp.payments.PaymentConfiguration r2 = r14.A00
            if (r2 == 0) goto L_0x00b1
            if (r10 == 0) goto L_0x00b3
            java.lang.String r1 = r10.A0G
            java.lang.String r0 = r10.A0I
            X.BD1 r0 = r2.A02(r1, r0)
            if (r0 == 0) goto L_0x00e5
            X.8pG r2 = r0.BdL()
            if (r2 == 0) goto L_0x00e5
        L_0x00da:
            java.lang.String r1 = r2.A0F()
            if (r1 == 0) goto L_0x00e5
            X.1KH r0 = r14.A0B
            r0.A0F(r2, r1)
        L_0x00e5:
            X.1QE r2 = r14.A04
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN PaymentTransactionStore#getMessagePaymentInfoV2 fetching from db, and interop is "
            r1.append(r0)
            boolean r0 = r10.A0P
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.A0N(java.lang.String, java.lang.String, long):X.AW0");
    }

    public AnonymousClass1BI A0O(AnonymousClass1BI r5) {
        AnonymousClass1BI A002 = this.A09.A00(r5);
        if (A002 != null) {
            return A002;
        }
        this.A05.A0G("payments-lid-migration-lid-jid-failure", "PaymentTransactionStore/chatLidMigrationUtil.normalizeChatJidForPayments failed to get lid compatible", false);
        return r5;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:83:0x0173=Splitter:B:83:0x0173, B:105:0x0234=Splitter:B:105:0x0234} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0P(X.AnonymousClass206 r24, boolean r25) {
        /*
            r23 = this;
            r5 = r24
            X.AW0 r2 = X.AnonymousClass25B.A00(r5)
            if (r2 == 0) goto L_0x024b
            r3 = 0
            r4 = r23
            X.1Cd r0 = r4.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x0242 }
            X.1au r16 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0242 }
            X.8pG r1 = r2.A0A     // Catch:{ all -> 0x0238 }
            if (r1 == 0) goto L_0x012e
            java.lang.String r8 = r1.A0F()     // Catch:{ all -> 0x0238 }
            long r14 = r1.A0B()     // Catch:{ all -> 0x0238 }
            if (r8 == 0) goto L_0x00c0
            X.1KH r6 = r4.A0B     // Catch:{ all -> 0x0238 }
            com.whatsapp.payments.PaymentConfiguration r0 = r6.A01     // Catch:{ all -> 0x0238 }
            X.BD1 r0 = r0.A01()     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x0039
            X.8pG r10 = r0.BdL()     // Catch:{ all -> 0x0238 }
            if (r10 == 0) goto L_0x0032
            r6.A0F(r10, r8)     // Catch:{ all -> 0x0238 }
        L_0x0032:
            X.2Di r0 = r6.A00     // Catch:{ all -> 0x0238 }
            X.1au r13 = r0.A06()     // Catch:{ all -> 0x0238 }
            goto L_0x003b
        L_0x0039:
            r10 = 0
            goto L_0x0032
        L_0x003b:
            X.1xA r12 = r13.BD0()     // Catch:{ all -> 0x00b3 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x00a9 }
            r6 = 1
            r11 = 0
            if (r0 != 0) goto L_0x0092
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00a9 }
            r7.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "tmp_id"
            r7.put(r0, r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = r1.A0K()     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x0092
            java.lang.String r0 = "tmp_metadata"
            r7.put(r0, r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r9 = "tmp_ts"
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x00a9 }
            r7.put(r9, r0)     // Catch:{ all -> 0x00a9 }
            if (r10 == 0) goto L_0x0096
            java.lang.String r0 = r10.A0F()     // Catch:{ all -> 0x00a9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x0096
            r0 = r13
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a9 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x00a9 }
            java.lang.String r19 = "tmp_transactions"
            java.lang.String r20 = "tmp_id=?"
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x00a9 }
            r0[r11] = r8     // Catch:{ all -> 0x00a9 }
            java.lang.String r21 = "storePaymentTransactionTmpInfo/UPDATE_SCHEMA_PAY_TRANSACTIONS_TMP"
            r17 = r1
            r18 = r7
            r22 = r0
            r17.A02(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x00a9 }
        L_0x0092:
            r12.A00()     // Catch:{ all -> 0x00a9 }
            goto L_0x00a5
        L_0x0096:
            r0 = r13
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a9 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "tmp_transactions"
            java.lang.String r0 = "storePaymentTransactionTmpInfo/INSERT_SCHEMA_PAY_TRANSACTIONS_TMP"
            r6.A05(r1, r0, r7)     // Catch:{ all -> 0x00a9 }
            goto L_0x0092
        L_0x00a5:
            r12.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00bd
        L_0x00a9:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00b3 }
        L_0x00b2:
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0238 }
        L_0x00bc:
            throw r1     // Catch:{ all -> 0x0238 }
        L_0x00bd:
            r13.close()     // Catch:{ all -> 0x0238 }
        L_0x00c0:
            X.1KH r6 = r4.A0B     // Catch:{ all -> 0x0238 }
            com.whatsapp.jid.UserJid r1 = r2.A0E     // Catch:{ all -> 0x0238 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0238 }
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A01(r1)     // Catch:{ all -> 0x0238 }
            X.1Ln r8 = r4.A08     // Catch:{ all -> 0x0238 }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x011a
            r0 = r1
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0     // Catch:{ all -> 0x0238 }
            X.1E2 r0 = r8.A0C(r0)     // Catch:{ all -> 0x0238 }
            X.8pI r7 = r6.A06(r1, r0)     // Catch:{ all -> 0x0238 }
        L_0x00db:
            X.8pG r0 = r2.A0A     // Catch:{ all -> 0x0238 }
            java.lang.String r1 = r0.A0I()     // Catch:{ all -> 0x0238 }
            if (r7 == 0) goto L_0x0116
            com.whatsapp.jid.UserJid r0 = r7.A03     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x0116
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0238 }
            if (r0 != 0) goto L_0x0116
            java.lang.String r0 = r7.A09()     // Catch:{ all -> 0x0238 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0238 }
            if (r0 != 0) goto L_0x0116
            r7.A0D(r1)     // Catch:{ all -> 0x0238 }
            A0G(r8, r7, r6)     // Catch:{ all -> 0x0238 }
            X.1QE r6 = r4.A04     // Catch:{ all -> 0x0238 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0238 }
            r1.<init>()     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "updated the contact for "
            r1.append(r0)     // Catch:{ all -> 0x0238 }
            com.whatsapp.jid.UserJid r0 = r7.A03     // Catch:{ all -> 0x0238 }
            r1.append(r0)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0238 }
            r6.A06(r0)     // Catch:{ all -> 0x0238 }
        L_0x0116:
            r4.A0d(r2)     // Catch:{ all -> 0x0238 }
            goto L_0x012e
        L_0x011a:
            boolean r0 = r1 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x012c
            r0 = r1
            X.1E1 r0 = (X.AnonymousClass1E1) r0     // Catch:{ all -> 0x0238 }
            com.whatsapp.jid.PhoneUserJid r0 = r8.A0D(r0)     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x012c
            X.8pI r7 = r6.A06(r0, r1)     // Catch:{ all -> 0x0238 }
            goto L_0x00db
        L_0x012c:
            r7 = 0
            goto L_0x00db
        L_0x012e:
            if (r25 == 0) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            r9 = r3
            goto L_0x013d
        L_0x0133:
            X.205 r0 = r5.A0v     // Catch:{ all -> 0x0238 }
            java.lang.String r6 = r0.A01     // Catch:{ all -> 0x0238 }
            r0 = -1
            X.AW0 r9 = r4.A0N(r6, r3, r0)     // Catch:{ all -> 0x0238 }
        L_0x013d:
            X.AW0 r0 = X.AnonymousClass25B.A00(r5)     // Catch:{ all -> 0x0238 }
            android.content.ContentValues r0 = r4.A0I(r9, r0)     // Catch:{ all -> 0x0238 }
            if (r0 != 0) goto L_0x014b
            r16.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0242 }
            return r3
        L_0x014b:
            if (r9 == 0) goto L_0x0177
            java.lang.String r0 = r9.A0L     // Catch:{ all -> 0x0238 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0238 }
            if (r0 != 0) goto L_0x0177
            X.1QE r6 = r4.A04     // Catch:{ all -> 0x0238 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0238 }
            r1.<init>()     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "insertMessagePaymentInfo/found no columns to update: "
            r1.append(r0)     // Catch:{ all -> 0x0238 }
            X.205 r0 = r5.A0v     // Catch:{ all -> 0x0238 }
            r1.append(r0)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0238 }
            r6.A06(r0)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0238 }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = r2.A0K     // Catch:{ all -> 0x0238 }
        L_0x0173:
            r16.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0242 }
            return r0
        L_0x0177:
            X.AW0 r0 = X.AnonymousClass25B.A00(r5)     // Catch:{ all -> 0x0238 }
            android.content.ContentValues r8 = r4.A0J(r9, r0)     // Catch:{ all -> 0x0238 }
            if (r8 == 0) goto L_0x01e2
            if (r9 == 0) goto L_0x018b
            java.lang.String r0 = r9.A0L     // Catch:{ all -> 0x0238 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x01a5
        L_0x018b:
            X.1DL r1 = r4.A02     // Catch:{ all -> 0x0238 }
            X.205 r6 = r5.A0v     // Catch:{ all -> 0x0238 }
            X.1BI r0 = r6.A00     // Catch:{ all -> 0x0238 }
            long r0 = r1.A09(r0)     // Catch:{ all -> 0x0238 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "remote_jid_row_id"
            r8.put(r0, r1)     // Catch:{ all -> 0x0238 }
            java.lang.String r1 = r6.A01     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "key_id"
            r8.put(r0, r1)     // Catch:{ all -> 0x0238 }
        L_0x01a5:
            long r0 = r5.A0x     // Catch:{ all -> 0x0238 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "message_row_id"
            r8.put(r0, r1)     // Catch:{ all -> 0x0238 }
            java.lang.String r7 = "/"
            if (r9 != 0) goto L_0x01e9
            r0 = r16
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0238 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0238 }
            java.lang.String r1 = "insertOrUpdateMessagePaymentInfoV2/REPLACE_PAY_TRANSACTION"
            java.lang.String r0 = "pay_transaction"
            long r0 = r6.A07(r0, r1, r8)     // Catch:{ all -> 0x0238 }
            X.1QE r9 = r4.A04     // Catch:{ all -> 0x0238 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0238 }
            r8.<init>()     // Catch:{ all -> 0x0238 }
            java.lang.String r6 = "insertMessagePaymentInfoV2/"
        L_0x01cb:
            r8.append(r6)     // Catch:{ all -> 0x0238 }
            X.205 r5 = r5.A0v     // Catch:{ all -> 0x0238 }
            X.1BI r5 = r5.A00     // Catch:{ all -> 0x0238 }
            r8.append(r5)     // Catch:{ all -> 0x0238 }
            r8.append(r7)     // Catch:{ all -> 0x0238 }
            r8.append(r0)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0238 }
            r9.A06(r0)     // Catch:{ all -> 0x0238 }
        L_0x01e2:
            java.lang.String r0 = r2.A0K     // Catch:{ all -> 0x0238 }
            if (r0 != 0) goto L_0x0234
            java.lang.String r0 = "UNSET"
            goto L_0x0234
        L_0x01e9:
            long r0 = r5.A0x     // Catch:{ all -> 0x0238 }
            r13 = -1
            java.lang.String r6 = "insertMessagePaymentInfoV2/found old row and updating "
            r12 = 0
            r11 = 1
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 == 0) goto L_0x0223
            r0 = 2
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x0238 }
            long r0 = r5.A0x     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0238 }
            r10[r12] = r0     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0238 }
            r10[r11] = r0     // Catch:{ all -> 0x0238 }
            r0 = r16
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0238 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0238 }
            java.lang.String r20 = "message_row_id=? OR id=?"
            java.lang.String r21 = "insertOrUpdateMessagePaymentInfoV2/withMessageId/UPDATE_PAY_TRANSACTION"
        L_0x020e:
            java.lang.String r19 = "pay_transaction"
            r17 = r0
            r18 = r8
            r22 = r10
            int r0 = r17.A02(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0238 }
            long r0 = (long) r0     // Catch:{ all -> 0x0238 }
            X.1QE r9 = r4.A04     // Catch:{ all -> 0x0238 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0238 }
            r8.<init>()     // Catch:{ all -> 0x0238 }
            goto L_0x01cb
        L_0x0223:
            java.lang.String[] r10 = new java.lang.String[r11]     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0238 }
            r10[r12] = r0     // Catch:{ all -> 0x0238 }
            r0 = r16
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0238 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0238 }
            java.lang.String r20 = "id=?"
            java.lang.String r21 = "insertOrUpdateMessagePaymentInfoV2/UPDATE_PAY_TRANSACTION"
            goto L_0x020e
        L_0x0234:
            r16.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0242 }
            return r0
        L_0x0238:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x023d }
            goto L_0x0241
        L_0x023d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0242 }
        L_0x0241:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0242 }
        L_0x0242:
            r2 = move-exception
            X.1QE r1 = r4.A04
            java.lang.String r0 = "insertMessagePaymentInfo"
            r1.A0A(r0, r2)
            return r3
        L_0x024b:
            java.lang.String r1 = "PaymentTransactionStore"
            java.lang.String r0 = "insertMessagePaymentInfo transaction info is null"
            java.lang.String r1 = X.AnonymousClass1QE.A01(r1, r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.A0P(X.206, boolean):java.lang.String");
    }

    public ArrayList A0T(C188079gq r16) {
        Cursor A0B2;
        Pair A062 = A06(this, r16);
        String[] strArr = (String[]) A062.first;
        String str = (String) A062.second;
        try {
            C28781at A042 = this.A03.get();
            try {
                A0B2 = ((C28801av) A042).A02.A0B("pay_transaction", A0D, str, strArr, (String) null, "init_timestamp DESC", (String) null, "readTransactionsWithFilters/QUERY_PAY_TRANSACTION");
                if (A0B2 != null) {
                    ArrayList A0B3 = A0B(A0B2, this, "readTransactionsWithFilters");
                    AnonymousClass1QE r2 = this.A04;
                    StringBuilder sb = new StringBuilder();
                    sb.append("readTransactionsWithFilters returned: ");
                    sb.append(A0B3.size());
                    AnonymousClass1QE.A02(r2, (String) null, sb.toString());
                    A0B2.close();
                    A042.close();
                    return A0B3;
                }
                A042.close();
                return new ArrayList();
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            this.A04.A0A("PaymentTransactionStore/readTransactionsWithFilters ", e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public ArrayList A0U(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("id IN (\"");
        sb.append(TextUtils.join("\",\"", list));
        sb.append("\")");
        String obj = sb.toString();
        C28781at A042 = this.A03.get();
        try {
            Cursor A0B2 = ((C28801av) A042).A02.A0B("pay_transaction", A0D, obj, (String[]) null, (String) null, (String) null, "100", "readTransactionsByIds/QUERY_PAY_TRANSACTION");
            if (A0B2 != null) {
                try {
                    ArrayList arrayList = new ArrayList(A0B2.getCount());
                    while (A0B2.moveToNext()) {
                        arrayList.add(A09(A0B2, this));
                    }
                    AnonymousClass1QE r2 = this.A04;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("readTransactionsByIds returned: ");
                    sb2.append(arrayList.size());
                    r2.A06(sb2.toString());
                    A0B2.close();
                    A042.close();
                    return arrayList;
                } catch (AnonymousClass11T e) {
                    this.A04.A0A("readTransactionsByIds/InvalidJidException - Skipped transaction with invalid JID", e);
                } catch (Throwable th) {
                    A0B2.close();
                    throw th;
                }
            } else {
                A042.close();
                return new ArrayList();
            }
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public void A0Z(AnonymousClass206 r6) {
        if (r6.A0u == 0) {
            String str = "UNSET";
            if (str.equals(AnonymousClass25B.A01(r6))) {
                AW0 A0N = A0N(r6.A0v.A01, (String) null, -1);
                if (A0N != null) {
                    String str2 = A0N.A0K;
                    if (str2 != null) {
                        str = str2;
                    }
                } else if (!C20128A8n.A07(AnonymousClass25B.A00(r6))) {
                    A0P(r6, false);
                }
                AnonymousClass25B.A03(r6, new AnonymousClass25E(A0N, str));
            }
        }
    }

    public boolean A0c(AW0 aw0) {
        AW0 A0N = A0N(aw0.A0L, aw0.A0K, -1);
        if (A0N == null) {
            return false;
        }
        aw0.A06 = AnonymousClass11P.A01(this.A01);
        return A0e(aw0, A0N, aw0.A0L);
    }

    public boolean A0f(AW0 aw0, AnonymousClass205 r12, int i, int i2, long j) {
        C28791au A052;
        AnonymousClass8pG BdL;
        BD1 A022 = this.A00.A02(aw0.A0G, aw0.A0I);
        if (!(A022 == null || (BdL = A022.BdL()) == null)) {
            synchronized (aw0) {
                if (i > 0) {
                    if (aw0.A02 != i) {
                        AnonymousClass8pG r0 = aw0.A0A;
                        if (r0 == null) {
                            aw0.A0A = BdL;
                            r0 = BdL;
                        }
                        r0.A0M(i);
                    }
                }
            }
            aw0.A09(BdL, j);
            aw0.A08(BdL, i2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, Integer.valueOf(aw0.A03));
        contentValues.put("status", Integer.valueOf(aw0.A02));
        contentValues.put("timestamp", Integer.valueOf((int) (aw0.A06 / 1000)));
        if (!TextUtils.isEmpty(aw0.A0K)) {
            contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, aw0.A0K);
        }
        if (!TextUtils.isEmpty(aw0.A0H)) {
            contentValues.put("credential_id", aw0.A0H);
        }
        if (!TextUtils.isEmpty(aw0.A0J)) {
            contentValues.put("error_code", aw0.A0J);
        }
        if (!TextUtils.isEmpty(aw0.A0F)) {
            contentValues.put("bank_transaction_id", aw0.A0F);
        }
        AnonymousClass8pG r02 = aw0.A0A;
        if (r02 != null) {
            contentValues.put("metadata", r02.A0J());
        }
        try {
            A052 = this.A03.A05();
            Pair A072 = A07(r12.A01, aw0.A0K);
            boolean z = false;
            if (A072 != null) {
                if (((C28801av) A052).A02.A02(contentValues, "pay_transaction", (String) A072.first, "updateMessagePaymentInfoV2/UPDATE_PAY_TRANSACTION", (String[]) A072.second) > 0) {
                    z = true;
                }
            }
            if (aw0.A0A != null && z) {
                A0d(aw0);
            }
            A052.close();
            return z;
        } catch (SQLiteDatabaseCorruptException e) {
            this.A04.A0A("PaymentTransactionStore/insertMessagePaymentInfo", e);
            return false;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        if (r4.A0L.equals("undefined") != false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0g(java.util.List r21) {
        /*
            r20 = this;
            java.lang.String r7 = " counter: "
            r13 = 0
            r6 = r20
            if (r21 == 0) goto L_0x015b
            int r0 = r21.size()
            if (r0 <= 0) goto L_0x015b
            X.1Cd r0 = r6.A03
            X.1au r12 = r0.A05()
            X.1xA r11 = r12.BD0()     // Catch:{ all -> 0x0151 }
            java.util.Iterator r10 = r21.iterator()     // Catch:{ all -> 0x0147 }
            r3 = 0
        L_0x001c:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x0106
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x0147 }
            X.AW0 r4 = (X.AW0) r4     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x0147 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0147 }
            if (r0 != 0) goto L_0x00fd
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x0147 }
            X.AW0 r8 = r6.A0M(r0)     // Catch:{ all -> 0x0147 }
            if (r8 == 0) goto L_0x008c
            boolean r0 = r8.A0P(r4)     // Catch:{ all -> 0x0147 }
            if (r0 != 0) goto L_0x008c
            X.1QE r2 = r6.A04     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            r5.<init>()     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "storeTransactions skipping store transaction with: "
            r5.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x0147 }
            r5.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = " as status is not updated  old ts: "
            r5.append(r0)     // Catch:{ all -> 0x0147 }
            long r0 = r8.A06     // Catch:{ all -> 0x0147 }
            r5.append(r0)     // Catch:{ all -> 0x0147 }
            r5.append(r7)     // Catch:{ all -> 0x0147 }
            X.8pG r0 = r8.A0A     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x008a
            int r0 = r0.A08()     // Catch:{ all -> 0x0147 }
        L_0x0065:
            r5.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = " new ts: "
            r5.append(r0)     // Catch:{ all -> 0x0147 }
            long r0 = r4.A06     // Catch:{ all -> 0x0147 }
            r5.append(r0)     // Catch:{ all -> 0x0147 }
            r5.append(r7)     // Catch:{ all -> 0x0147 }
            X.8pG r0 = r4.A0A     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x0088
            int r0 = r0.A08()     // Catch:{ all -> 0x0147 }
        L_0x007d:
            r5.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0147 }
            r2.A06(r0)     // Catch:{ all -> 0x0147 }
            goto L_0x00f9
        L_0x0088:
            r0 = 0
            goto L_0x007d
        L_0x008a:
            r0 = 0
            goto L_0x0065
        L_0x008c:
            android.content.ContentValues r5 = r6.A0J(r8, r4)     // Catch:{ all -> 0x0147 }
            if (r5 == 0) goto L_0x001c
            java.lang.String r0 = r4.A0L     // Catch:{ all -> 0x0147 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0147 }
            r9 = 1
            if (r0 != 0) goto L_0x00a8
            java.lang.String r1 = r4.A0L     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "undefined"
            boolean r2 = r1.equals(r0)     // Catch:{ all -> 0x0147 }
            r1 = 0
            r0 = 2
            if (r2 == 0) goto L_0x00aa
        L_0x00a8:
            r1 = 1
            r0 = 1
        L_0x00aa:
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x0147 }
            r8[r13] = r0     // Catch:{ all -> 0x0147 }
            java.lang.String r2 = "id=?"
            if (r1 != 0) goto L_0x00c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            r1.<init>()     // Catch:{ all -> 0x0147 }
            r1.append(r2)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = " OR key_id=?"
            r1.append(r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = r4.A0L     // Catch:{ all -> 0x0147 }
            r8[r9] = r0     // Catch:{ all -> 0x0147 }
        L_0x00c9:
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0147 }
            X.1Ev r14 = r0.A02     // Catch:{ all -> 0x0147 }
            java.lang.String r4 = "pay_transaction"
            java.lang.String r18 = "storeTransactionV2/UPDATE_PAY_TRANSACTION"
            r15 = r5
            r16 = r4
            r17 = r2
            r19 = r8
            int r0 = r14.A02(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0147 }
            long r1 = (long) r0     // Catch:{ all -> 0x0147 }
            r8 = 1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = "storeTransactionV2/INSERT_PAY_TRANSACTION"
            long r4 = r14.A05(r4, r0, r5)     // Catch:{ all -> 0x0147 }
            goto L_0x00ef
        L_0x00ed:
            r4 = -1
        L_0x00ef:
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00f9
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x001c
        L_0x00f9:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x00fd:
            X.1QE r1 = r6.A04     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "could not update or insert transaction with empty transaction id"
            r1.A06(r0)     // Catch:{ all -> 0x0147 }
            goto L_0x001c
        L_0x0106:
            r11.A00()     // Catch:{ all -> 0x0147 }
            r11.close()     // Catch:{ all -> 0x0151 }
            r12.close()
            int r0 = r21.size()
            X.1QE r2 = r6.A04
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r3 != r0) goto L_0x0134
            r1.<init>()
            java.lang.String r0 = "storeTransactions stored: "
        L_0x011f:
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.A06(r0)
            int r0 = r21.size()
            if (r3 != r0) goto L_0x0163
            r13 = 1
            return r13
        L_0x0134:
            r1.<init>()
            java.lang.String r0 = "storeTransactions got: "
            r1.append(r0)
            int r0 = r21.size()
            r1.append(r0)
            java.lang.String r0 = " transactions but stored: "
            goto L_0x011f
        L_0x0147:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x014c }
            goto L_0x0150
        L_0x014c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0151 }
        L_0x0150:
            throw r1     // Catch:{ all -> 0x0151 }
        L_0x0151:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0156 }
            throw r1
        L_0x0156:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x015b:
            X.1QE r1 = r6.A04
            java.lang.String r0 = "storeTransactions not storing transactions"
            r1.A06(r0)
        L_0x0163:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QR.A0g(java.util.List):boolean");
    }

    public AnonymousClass1QR(AnonymousClass190 r4, AnonymousClass11S r5, AnonymousClass11P r6, AnonymousClass1DL r7, AnonymousClass1Cd r8, C24621La r9, C24751Ln r10, AnonymousClass1NG r11, AnonymousClass1KI r12, AnonymousClass1KH r13, AnonymousClass1QQ r14) {
        this.A01 = r6;
        this.A02 = r7;
        this.A06 = r5;
        this.A0B = r13;
        this.A07 = r9;
        this.A03 = r8;
        this.A0C = r14;
        this.A0A = r12;
        this.A05 = r4;
        this.A08 = r10;
        this.A09 = r11;
    }

    public static Pair A07(String str, String str2) {
        String[] strArr;
        String str3;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (isEmpty) {
            strArr = new String[]{str2};
            str3 = "id=?";
        } else if (!isEmpty2) {
            strArr = new String[]{str, str2};
            str3 = "key_id=? OR id=?";
        } else {
            strArr = new String[]{str};
            str3 = "key_id=?";
        }
        return new Pair(str3, strArr);
    }

    public static Pair A08(String str, String str2) {
        String[] strArr;
        String str3;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (isEmpty) {
            strArr = new String[]{str2};
            str3 = "id=?";
        } else if (!isEmpty2) {
            strArr = new String[]{str, str, str2};
            str3 = "key_id=? OR interop_id=? OR id=?";
        } else {
            strArr = new String[]{str, str};
            str3 = "key_id=? OR interop_id=?";
        }
        return new Pair(str3, strArr);
    }

    public static ArrayList A0B(Cursor cursor, AnonymousClass1QR r6, String str) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            try {
                arrayList.add(A09(cursor, r6));
            } catch (AnonymousClass11T e) {
                AnonymousClass1QE r2 = r6.A04;
                StringBuilder sb = new StringBuilder();
                sb.append("PaymentTransactionStore/");
                sb.append(str);
                sb.append("/InvalidJidException- Skipped pending transaction with invalid JID");
                r2.A0A(sb.toString(), e);
            }
        }
        return arrayList;
    }

    public void A0a(String str, int i, int i2, long j, long j2) {
        AW0 A0M;
        BD1 A022;
        if (!TextUtils.isEmpty(str) && i > 0 && j > 0 && j2 > 0 && i2 > 0 && (A0M = A0M(str)) != null) {
            AnonymousClass8pG r5 = A0M.A0A;
            if (!(r5 == null && ((A022 = this.A00.A02(A0M.A0G, A0M.A0I)) == null || (r5 = A022.BdL()) == null))) {
                r5.A0N(A0M.A03);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, Integer.valueOf(i));
            contentValues.put("init_timestamp", Integer.valueOf((int) (j / 1000)));
            contentValues.put("status", Integer.valueOf(i2));
            contentValues.put("timestamp", Integer.valueOf((int) (j2 / 1000)));
            String[] strArr = {str};
            C28791au A052 = this.A03.A05();
            try {
                ((C28801av) A052).A02.A02(contentValues, "pay_transaction", "id=?", "updateTransactionTypeStatusTimestampsByIdV2/UPDATE_PAY_TRANSACTION", strArr);
                A052.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }
}
