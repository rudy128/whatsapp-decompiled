package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.PaymentConfiguration;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1KH  reason: invalid class name */
public class AnonymousClass1KH implements C218517q {
    public AnonymousClass2Di A00;
    public PaymentConfiguration A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass118 A04;
    public final AnonymousClass1CP A05;
    public final AnonymousClass1CO A06;
    public final C18030ve A07;
    public final AnonymousClass1KI A08;
    public volatile boolean A09;

    public static boolean A05(List list) {
        int A052;
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C20284AEs aEs = (C20284AEs) it.next();
                if (aEs != null) {
                    if (TextUtils.isEmpty(aEs.A0A) || (A052 = aEs.A05()) == 0) {
                        Log.w("PAY: PaymentsHelper sanitizePaymentMethods got empty credential id or account type");
                        return false;
                    }
                    if (C20061A5k.A02(aEs.A09)) {
                        aEs.A0B(C20284AEs.A03(A052));
                    }
                    C63572tK r0 = C63572tK.A0E;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ca, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.AnonymousClass8pI A06(com.whatsapp.jid.UserJid r11, com.whatsapp.jid.UserJid r12) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            com.whatsapp.payments.PaymentConfiguration r2 = r10.A01     // Catch:{ all -> 0x00cb }
            X.1yi r0 = X.C42771yi.A00()     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = X.AnonymousClass17K.A00(r0, r11)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = X.C20056A5f.A02(r0)     // Catch:{ all -> 0x00cb }
            X.2tK r0 = X.C63572tK.A01(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x00cb }
            r1 = 0
            X.2is r0 = r2.A00(r0)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00c9
            X.BD1 r0 = r0.A00(r1)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00c9
            X.8pI r3 = r0.BdI()     // Catch:{ all -> 0x00cb }
            X.8pI r5 = r0.BdI()     // Catch:{ all -> 0x00cb }
            if (r3 == 0) goto L_0x00c9
            if (r5 == 0) goto L_0x00c9
            X.0ve r2 = r10.A07     // Catch:{ all -> 0x00cb }
            r1 = 5143(0x1417, float:7.207E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00cb }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x00cb }
            r4 = r11
            r1 = r12
            if (r0 == 0) goto L_0x003f
            r1 = r11
            r4 = r12
        L_0x003f:
            r10.A04(r3, r4)     // Catch:{ all -> 0x00cb }
            r10.A04(r5, r1)     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x00a5
            com.whatsapp.jid.UserJid r0 = r5.A03     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00a5
            java.lang.String r8 = "jid=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = r1.getRawString()     // Catch:{ all -> 0x00a3 }
            r0 = 0
            r7[r0] = r1     // Catch:{ all -> 0x00a3 }
            X.2Di r0 = r10.A00     // Catch:{ all -> 0x00a3 }
            X.1au r6 = r0.A06()     // Catch:{ all -> 0x00a3 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0099 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "contacts"
            java.lang.String r0 = "PaymentStore/removeOneContact/DELETE_SCHEMA_PAY_CONTACTS"
            int r2 = r2.A04(r1, r8, r0, r7)     // Catch:{ all -> 0x0099 }
            if (r2 < 0) goto L_0x0081
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r1.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "PAY: PaymentStore removeOneContact deleted num rows: "
            r1.append(r0)     // Catch:{ all -> 0x0099 }
            r1.append(r2)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0099 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0099 }
            goto L_0x0095
        L_0x0081:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r1.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "PAY: PaymentStore removeOneContact could not delete all rows: "
            r1.append(r0)     // Catch:{ all -> 0x0099 }
            r1.append(r2)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0099 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0099 }
        L_0x0095:
            r6.close()     // Catch:{ all -> 0x00a3 }
            goto L_0x00a5
        L_0x0099:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x009e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00a3 }
        L_0x00a2:
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00a5:
            com.whatsapp.jid.UserJid r0 = r3.A03     // Catch:{ all -> 0x00cb }
            if (r0 != 0) goto L_0x00b3
            com.whatsapp.jid.UserJid r0 = r5.A03     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00b3
            r5.A03 = r4     // Catch:{ all -> 0x00cb }
            r10.A0J(r5, r11, r12)     // Catch:{ all -> 0x00cb }
            r3 = r5
        L_0x00b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cb }
            r1.<init>()     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "PAY: PaymentStore readContactInfo returned: "
            r1.append(r0)     // Catch:{ all -> 0x00cb }
            r1.append(r3)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00cb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00cb }
            monitor-exit(r9)
            return r3
        L_0x00c9:
            monitor-exit(r9)
            return r1
        L_0x00cb:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KH.A06(com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid):X.8pI");
    }

    public C20284AEs A08(String str) {
        Cursor A0A;
        C20284AEs aEs = null;
        if (str == null) {
            Log.e("PAY: PaymentStore/readPaymentMethodByCredId credId is null");
            return null;
        }
        C28781at A052 = this.A00.get();
        try {
            A0A = ((C28801av) A052).A02.A0A(C50902Wf.A00, "readPaymentMethodByCredId/QUERY_SCHEMA_PAY_METHODS", new String[]{str});
            if (A0A.moveToLast()) {
                aEs = A00(A0A, this);
            }
            A0A.close();
            A052.close();
            return aEs;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public synchronized ArrayList A0C() {
        return A0D((int[]) null, 0);
    }

    public synchronized ArrayList A0D(int[] iArr, int i) {
        ArrayList arrayList;
        Cursor A0A;
        BD1 bd1;
        AnonymousClass8pI r0;
        arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (iArr != null) {
            for (int i2 : iArr) {
                arrayList2.add(Long.toString((long) (i2 << (i * 4))));
            }
        }
        C28781at A052 = this.A00.get();
        try {
            C23141Ev r6 = ((C28801av) A052).A02;
            long j = 15 << (i * 4);
            boolean z = false;
            if (i == 0) {
                z = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT ");
            sb.append(C43501zu.A00(", ", C50762Vr.A00));
            sb.append(" FROM ");
            sb.append("contacts");
            sb.append(C60792oc.A00(arrayList2, j, z));
            A0A = r6.A0A(sb.toString(), "readAllContactInfos/QUERY_SCHEMA_PAY_CONTACTS", (String[]) null);
            while (A0A.moveToNext()) {
                UserJid A042 = UserJid.Companion.A04(A0A.getString(A0A.getColumnIndexOrThrow("jid")));
                if (A042 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("PAY: PaymentTransactionStore/readContactInfos: Skipping Jid because it is not valid: ");
                    sb2.append(A0A.getString(A0A.getColumnIndexOrThrow("jid")));
                    Log.i(sb2.toString());
                } else {
                    C57312is A002 = this.A01.A00(C63572tK.A01(C20056A5f.A02(AnonymousClass17K.A00(C42771yi.A00(), A042))).A03);
                    if (A002 != null) {
                        bd1 = A002.A00((String) null);
                    } else {
                        bd1 = null;
                    }
                    if (bd1 != null) {
                        r0 = bd1.BdI();
                    } else {
                        r0 = null;
                    }
                    if (r0 != null) {
                        A03(A0A, r0, A042);
                        arrayList.add(r0);
                    }
                }
            }
            A0A.close();
            A052.close();
            if (iArr != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int valueOf : iArr) {
                    arrayList3.add(Integer.valueOf(valueOf));
                }
            }
        } catch (Throwable th) {
            try {
                A052.close();
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
            throw th;
        }
        return arrayList;
        throw th;
    }

    public synchronized List A0E() {
        List emptyList;
        C28781at A052 = this.A00.get();
        try {
            emptyList = Collections.emptyList();
            A052.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        return emptyList;
        throw th;
    }

    public synchronized void A0G(UserJid userJid, UserJid userJid2) {
        AnonymousClass8pI A062;
        if (this.A01 != null) {
            String str = C63572tK.A01(C20056A5f.A02(AnonymousClass17K.A00(C42771yi.A00(), userJid))).A03;
            if (!TextUtils.isEmpty(str) && !str.equals("UNSET") && (A062 = A06(userJid, userJid2)) != null && A062.A03 != null) {
                A062.A00 = AnonymousClass11P.A01(this.A02) + TimeUnit.DAYS.toMillis(1);
                A0J(A062, userJid, userJid2);
            }
        }
    }

    public synchronized void A0H(PaymentConfiguration paymentConfiguration) {
        this.A01 = paymentConfiguration;
        if (!this.A09) {
            this.A00 = new AnonymousClass2Di(this.A04.A00, this.A03, this.A05, this.A06, Collections.singleton(new C675830b(this)));
            this.A09 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r4 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013b, code lost:
        if (r3 != false) goto L_0x013d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0K(com.whatsapp.jid.UserJid r12, com.whatsapp.jid.UserJid r13, java.lang.Boolean r14, java.lang.String r15, java.util.HashMap r16, java.util.HashMap r17) {
        /*
            r11 = this;
            monitor-enter(r11)
            X.1yi r0 = X.C42771yi.A00()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = X.AnonymousClass17K.A00(r0, r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = X.C20056A5f.A02(r0)     // Catch:{ all -> 0x0142 }
            X.2tK r0 = X.C63572tK.A01(r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x0142 }
            com.whatsapp.payments.PaymentConfiguration r0 = r11.A01     // Catch:{ all -> 0x0142 }
            r3 = 0
            if (r0 == 0) goto L_0x0140
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x0140
            java.lang.String r0 = "UNSET"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x0140
            X.8pI r4 = r11.A06(r12, r13)     // Catch:{ all -> 0x0142 }
            if (r4 == 0) goto L_0x0030
            com.whatsapp.jid.UserJid r0 = r4.A03     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x006d
        L_0x0030:
            com.whatsapp.payments.PaymentConfiguration r2 = r11.A01     // Catch:{ all -> 0x0142 }
            X.1yi r0 = X.C42771yi.A00()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = X.AnonymousClass17K.A00(r0, r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = X.C20056A5f.A02(r0)     // Catch:{ all -> 0x0142 }
            X.2tK r0 = X.C63572tK.A01(r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0142 }
            r1 = 0
            X.2is r0 = r2.A00(r0)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x006b
            X.BD1 r0 = r0.A00(r1)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x006b
            X.8pI r4 = r0.BdI()     // Catch:{ all -> 0x0142 }
            if (r4 == 0) goto L_0x0140
            X.0ve r2 = r11.A07     // Catch:{ all -> 0x0142 }
            r1 = 5143(0x1417, float:7.207E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0142 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0068
            if (r13 == 0) goto L_0x0068
            r4.A03 = r13     // Catch:{ all -> 0x0142 }
            goto L_0x006d
        L_0x0068:
            r4.A03 = r12     // Catch:{ all -> 0x0142 }
            goto L_0x006d
        L_0x006b:
            if (r4 == 0) goto L_0x0140
        L_0x006d:
            if (r14 == 0) goto L_0x008d
            boolean r0 = r4.A0F()     // Catch:{ all -> 0x0142 }
            boolean r1 = r14.booleanValue()     // Catch:{ all -> 0x0142 }
            if (r0 != r1) goto L_0x0081
            java.lang.String r0 = r4.A04     // Catch:{ all -> 0x0142 }
            boolean r0 = X.C42171xk.A00(r0, r15)     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x008d
        L_0x0081:
            r4.A0E(r1)     // Catch:{ all -> 0x0142 }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x008c
            r4.A04 = r15     // Catch:{ all -> 0x0142 }
        L_0x008c:
            r3 = 1
        L_0x008d:
            if (r16 == 0) goto L_0x00e6
            boolean r0 = r16.isEmpty()     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x00e6
            java.util.Set r0 = r16.entrySet()     // Catch:{ all -> 0x0142 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0142 }
        L_0x009d:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0142 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0142 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x0142 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0142 }
            int r1 = r2.intValue()     // Catch:{ all -> 0x0142 }
            java.lang.Object r7 = r0.getValue()     // Catch:{ all -> 0x0142 }
            X.0yx r7 = (X.C19760yx) r7     // Catch:{ all -> 0x0142 }
            java.lang.Object r0 = r7.A00     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0142 }
            int r9 = X.AnonymousClass9QL.A00(r0)     // Catch:{ all -> 0x0142 }
            X.9xK r3 = X.AnonymousClass8pI.A01(r4)     // Catch:{ all -> 0x0142 }
            int r8 = r1 * 4
            r5 = 15
            long r5 = r5 << r8
            r0 = -1
            long r5 = r5 ^ r0
            long r0 = r3.A00     // Catch:{ all -> 0x0142 }
            long r5 = r5 & r0
            int r9 = r9 << r8
            long r0 = (long) r9     // Catch:{ all -> 0x0142 }
            long r0 = r0 | r5
            r3.A00 = r0     // Catch:{ all -> 0x0142 }
            java.lang.Object r1 = r7.A01     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0142 }
            X.9xK r0 = X.AnonymousClass8pI.A01(r4)     // Catch:{ all -> 0x0142 }
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x0142 }
            r0.put(r2, r1)     // Catch:{ all -> 0x0142 }
            goto L_0x009d
        L_0x00e5:
            r3 = 1
        L_0x00e6:
            if (r17 == 0) goto L_0x013b
            boolean r0 = r17.isEmpty()     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x013b
            java.util.Set r0 = r17.entrySet()     // Catch:{ all -> 0x0142 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0142 }
        L_0x00f6:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0139
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0142 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0142 }
            java.lang.Object r3 = r0.getKey()     // Catch:{ all -> 0x0142 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0142 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0142 }
            X.0yx r2 = (X.C19760yx) r2     // Catch:{ all -> 0x0142 }
            java.lang.Object r1 = r2.A00     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x00f6
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0142 }
            X.9xL r0 = r4.A01     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x011f
            X.9xL r0 = new X.9xL     // Catch:{ all -> 0x0142 }
            r0.<init>()     // Catch:{ all -> 0x0142 }
            r4.A01 = r0     // Catch:{ all -> 0x0142 }
        L_0x011f:
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x0142 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0142 }
            java.lang.Object r1 = r2.A01     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0142 }
            X.9xL r0 = r4.A01     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x0133
            X.9xL r0 = new X.9xL     // Catch:{ all -> 0x0142 }
            r0.<init>()     // Catch:{ all -> 0x0142 }
            r4.A01 = r0     // Catch:{ all -> 0x0142 }
        L_0x0133:
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x0142 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0142 }
            goto L_0x00f6
        L_0x0139:
            r3 = 1
            goto L_0x013d
        L_0x013b:
            if (r3 == 0) goto L_0x0140
        L_0x013d:
            r11.A0J(r4, r12, r13)     // Catch:{ all -> 0x0142 }
        L_0x0140:
            monitor-exit(r11)
            return r3
        L_0x0142:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KH.A0K(com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid, java.lang.Boolean, java.lang.String, java.util.HashMap, java.util.HashMap):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.8pW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.8pY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: X.8pW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: X.8pW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: X.8pW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: X.8pW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: X.8pV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: X.8pY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: X.8pY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: X.8pW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: X.8pW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: X.8pW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: X.8pW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: X.8pW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: X.8pW} */
    /* JADX WARNING: type inference failed for: r9v4, types: [X.AEs, X.8pP] */
    /* JADX WARNING: type inference failed for: r4v18, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C20284AEs A00(android.database.Cursor r22, X.AnonymousClass1KH r23) {
        /*
            java.lang.String r0 = "country"
            r9 = r22
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r15 = r9.getString(r0)
            java.lang.String r0 = "type"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r16 = r9.getInt(r0)
            java.lang.String r0 = "credential_id"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r8 = r9.getString(r0)
            X.2tK r7 = X.C63572tK.A00(r15)
            java.lang.String r0 = "country_data"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r11 = r9.getString(r0)
            java.lang.String r0 = "readable_name"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r6 = r9.getString(r0)
            java.lang.String r0 = "issuer_name"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r14 = r9.getString(r0)
            java.lang.String r0 = "subtype"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r21 = r9.getInt(r0)
            java.lang.String r0 = "creation_ts"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            long r2 = (long) r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            java.lang.String r0 = "updated_ts"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            long r0 = (long) r0
            long r0 = r0 * r4
            java.lang.String r4 = "debit_mode"
            int r4 = r9.getColumnIndexOrThrow(r4)
            int r13 = r9.getInt(r4)
            java.lang.String r4 = "credit_mode"
            int r4 = r9.getColumnIndexOrThrow(r4)
            int r12 = r9.getInt(r4)
            java.lang.String r4 = "p2m_debit_mode"
            int r4 = r9.getColumnIndexOrThrow(r4)
            int r19 = r9.getInt(r4)
            java.lang.String r4 = "p2m_credit_mode"
            int r4 = r9.getColumnIndexOrThrow(r4)
            int r20 = r9.getInt(r4)
            java.lang.String r4 = "icon"
            int r4 = r9.getColumnIndexOrThrow(r4)
            byte[] r5 = r9.getBlob(r4)
            r17 = r23
            r4 = r17
            com.whatsapp.payments.PaymentConfiguration r10 = r4.A01
            r4 = 0
            X.2is r10 = r10.A00(r15)
            if (r10 == 0) goto L_0x00b0
            X.BD1 r10 = r10.A00(r4)
        L_0x00ac:
            switch(r16) {
                case 1: goto L_0x0183;
                case 2: goto L_0x015a;
                case 3: goto L_0x0107;
                case 4: goto L_0x0183;
                case 5: goto L_0x00c7;
                case 6: goto L_0x0183;
                case 7: goto L_0x0183;
                case 8: goto L_0x0183;
                case 9: goto L_0x00b2;
                default: goto L_0x00af;
            }
        L_0x00af:
            return r4
        L_0x00b0:
            r10 = 0
            goto L_0x00ac
        L_0x00b2:
            if (r10 == 0) goto L_0x00c4
            X.8pV r4 = r10.BdJ()
            if (r4 == 0) goto L_0x00c4
            r4.A06(r11)
            java.lang.String r0 = r4.A02
        L_0x00bf:
            X.8pM r9 = X.AnonymousClass9QM.A00(r7, r4, r0, r8, r6)
            return r9
        L_0x00c4:
            java.lang.String r0 = ""
            goto L_0x00bf
        L_0x00c7:
            if (r10 == 0) goto L_0x0101
            X.8pX r5 = r10.BdK()
            if (r5 == 0) goto L_0x00ff
            r5.A06(r11)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00de
            java.util.List r0 = r17.A0E()
            r5.A0D = r0
        L_0x00de:
            java.lang.String r3 = r5.A09
            boolean r2 = r5.A0E
            boolean r1 = r5.A0F
            java.lang.String r4 = r5.A08
            int r0 = r5.A00
        L_0x00e8:
            X.8pO r9 = new X.8pO
            r10 = r3
            r11 = r4
            r12 = r0
            r13 = r2
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            X.C17960vV.A07(r7)
            r9.A07 = r7
            r9.A0A = r8
            r9.A08 = r5
            r9.A0B(r6)
            return r9
        L_0x00ff:
            r3 = r4
            goto L_0x0103
        L_0x0101:
            r3 = r4
            r5 = r4
        L_0x0103:
            r2 = 0
            r1 = 0
            r0 = 0
            goto L_0x00e8
        L_0x0107:
            java.lang.String r0 = "balance_1000"
            int r0 = r9.getColumnIndexOrThrow(r0)
            long r0 = r9.getLong(r0)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0)
            r0 = -3
            java.math.BigDecimal r2 = r2.scaleByPowerOfTen(r0)
            java.lang.String r0 = "balance_ts"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r1 = r9.getInt(r0)
            if (r10 == 0) goto L_0x0135
            X.8pU r0 = r10.BdM()
            if (r0 == 0) goto L_0x0135
            java.lang.String r1 = "fromDBString"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0135:
            X.8pP r9 = new X.8pP
            r9.<init>()
            r9.A01 = r4
            X.C17960vV.A07(r7)
            r9.A07 = r7
            r9.A08(r13)
            r9.A07(r12)
            r9.A0A = r8
            r9.A0B(r6)
            r9.A0D(r7, r2)
            r9.A08 = r4
            r9.A0B = r14
            long r2 = (long) r1
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r9.A00 = r2
            goto L_0x019c
        L_0x015a:
            if (r10 == 0) goto L_0x0165
            X.8pW r4 = r10.BdG()
            if (r4 == 0) goto L_0x0165
            r4.A06(r11)
        L_0x0165:
            X.8pN r9 = new X.8pN
            r9.<init>()
            X.C17960vV.A07(r7)
            r9.A07 = r7
            r9.A05 = r2
            r9.A06 = r0
            r9.A00 = r12
            r9.A01 = r13
            r9.A0A = r8
            r9.A0B(r6)
            r9.A0B = r14
            r9.A0D = r5
            r9.A08 = r4
            return r9
        L_0x0183:
            if (r10 == 0) goto L_0x018e
            X.8pY r4 = r10.BdH()
            if (r4 == 0) goto L_0x018e
            r4.A06(r11)
        L_0x018e:
            r22 = r2
            r17 = r13
            r18 = r12
            r15 = r6
            r14 = r8
            r13 = r4
            r12 = r7
            X.8pK r9 = X.C20085A6m.A02(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x019c:
            r9.A0D = r5
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KH.A00(android.database.Cursor, X.1KH):X.AEs");
    }

    public static void A03(Cursor cursor, AnonymousClass8pI r4, UserJid userJid) {
        r4.A03 = userJid;
        boolean z = true;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("merchant")) != 1) {
            z = false;
        }
        r4.A0E(z);
        AnonymousClass8pI.A01(r4).A00 = cursor.getLong(cursor.getColumnIndexOrThrow("consumer_status"));
        r4.A0A(cursor.getInt(cursor.getColumnIndexOrThrow("default_payment_type")));
        r4.A06(cursor.getString(cursor.getColumnIndexOrThrow("country_data")));
    }

    private void A04(AnonymousClass8pI r7, UserJid userJid) {
        Cursor A0A;
        if (userJid != null) {
            C28781at A052 = this.A00.get();
            try {
                A0A = ((C28801av) A052).A02.A0A(C60792oc.A00, "readContactInfo/QUERY_SCHEMA_PAY_CONTACTS", new String[]{userJid.getRawString()});
                while (A0A.moveToNext()) {
                    A03(A0A, r7, userJid);
                }
                A0A.close();
                A052.close();
                StringBuilder sb = new StringBuilder();
                sb.append("PAY: PaymentStore readContactInfoFromDatabase returned: ");
                sb.append(r7);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                try {
                    A052.close();
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

    public ArrayList A09() {
        Cursor A0A;
        ArrayList arrayList = new ArrayList();
        C28781at A052 = this.A00.get();
        try {
            A0A = ((C28801av) A052).A02.A0A(C50902Wf.A01, "readMerchantMethods/QUERY_SCHEMA_PAY_METHODS", new String[]{String.valueOf(5)});
            while (A0A.moveToNext()) {
                C20284AEs A002 = A00(A0A, this);
                if (A002 != null) {
                    arrayList.add((AnonymousClass8pO) A002);
                }
            }
            A0A.close();
            A052.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public ArrayList A0A() {
        Cursor A0A;
        ArrayList arrayList = new ArrayList();
        C28781at A052 = this.A00.get();
        try {
            A0A = ((C28801av) A052).A02.A0A(C50902Wf.A03, "readPaymentAndMerchantMethods/QUERY_SCHEMA_PAY_METHODS", (String[]) null);
            while (A0A.moveToNext()) {
                C20284AEs A002 = A00(A0A, this);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
            A0A.close();
            A052.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public ArrayList A0B() {
        Cursor A0A;
        ArrayList arrayList = new ArrayList();
        C28781at A052 = this.A00.get();
        try {
            A0A = ((C28801av) A052).A02.A0A(C50902Wf.A02, "readPaymentMethods/QUERY_SCHEMA_PAY_METHODS", new String[]{String.valueOf(5), String.valueOf(9)});
            while (A0A.moveToNext()) {
                C20284AEs A002 = A00(A0A, this);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
            A0A.close();
            A052.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0F(AnonymousClass8pG r9, String str) {
        Cursor A0A;
        C28781at A052 = this.A00.get();
        try {
            A0A = ((C28801av) A052).A02.A0A(C50782Vt.A00, "readPaymentTransactionTmpInfo/QUERY_SCHEMA_PAY_TRANSACTIONS_TMP", new String[]{str});
            while (A0A.moveToNext()) {
                String string = A0A.getString(A0A.getColumnIndexOrThrow("tmp_metadata"));
                long j = ((long) A0A.getInt(A0A.getColumnIndexOrThrow("tmp_ts"))) * 1000;
                r9.A0S(str);
                r9.A06(string);
                if (j > -1) {
                    r9.A0O(j);
                }
            }
            A0A.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0I() {
        C28791au A062 = this.A00.A06();
        try {
            int A042 = ((C28801av) A062).A02.A04("methods", (String) null, "removeAllPaymentMethods/DELETE_SCHEMA_PAY_METHODS", (String[]) null);
            if (A042 >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("PAY: PaymentStore removeAllPaymentMethods deleted num rows: ");
                sb.append(A042);
                Log.i(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PAY: PaymentStore removeAllPaymentMethods could not delete all rows: ");
                sb2.append(A042);
                Log.w(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("PAY: PaymentStore removeAllPaymentMethods deleted num payout rows: ");
            sb3.append(0);
            Log.i(sb3.toString());
            boolean z = false;
            if (A042 >= 0) {
                z = true;
            }
            A062.close();
            return z;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r1 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0J(X.AnonymousClass8pI r17, com.whatsapp.jid.UserJid r18, com.whatsapp.jid.UserJid r19) {
        /*
            r16 = this;
            r1 = r18
            r2 = r16
            monitor-enter(r2)
            r4 = r17
            com.whatsapp.jid.UserJid r0 = r4.A03     // Catch:{ all -> 0x00d2 }
            r9 = 0
            if (r0 == 0) goto L_0x00d0
            X.2Di r0 = r2.A00     // Catch:{ all -> 0x00d2 }
            X.1au r8 = r0.A06()     // Catch:{ all -> 0x00d2 }
            X.1xA r7 = r8.BD0()     // Catch:{ all -> 0x00c6 }
            if (r18 != 0) goto L_0x001d
            com.whatsapp.jid.UserJid r1 = r4.A03     // Catch:{ all -> 0x00bc }
            r6 = 0
            if (r1 == 0) goto L_0x0023
        L_0x001d:
            r0 = r19
            X.8pI r6 = r2.A06(r1, r0)     // Catch:{ all -> 0x00bc }
        L_0x0023:
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x00bc }
            r11.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "country_data"
            java.lang.String r0 = r4.A04()     // Catch:{ all -> 0x00bc }
            r11.put(r1, r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "merchant"
            boolean r0 = r4.A0F()     // Catch:{ all -> 0x00bc }
            r3 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00bc }
            r11.put(r1, r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r5 = "consumer_status"
            X.9xK r0 = X.AnonymousClass8pI.A01(r4)     // Catch:{ all -> 0x00bc }
            long r0 = r0.A00     // Catch:{ all -> 0x00bc }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00bc }
            r11.put(r5, r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "default_payment_type"
            int r0 = r4.A08()     // Catch:{ all -> 0x00bc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00bc }
            r11.put(r1, r0)     // Catch:{ all -> 0x00bc }
            if (r6 == 0) goto L_0x005e
            goto L_0x0077
        L_0x005e:
            java.lang.String r1 = "jid"
            com.whatsapp.jid.UserJid r0 = r4.A03     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00bc }
            r11.put(r1, r0)     // Catch:{ all -> 0x00bc }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00bc }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "contacts"
            java.lang.String r0 = "storeOneContact/INSERT_SCHEMA_PAY_CONTACTS_TABLE"
            r5.A05(r1, r0, r11)     // Catch:{ all -> 0x00bc }
            goto L_0x009d
        L_0x0077:
            com.whatsapp.jid.UserJid r0 = r6.A03     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x005e
            java.lang.String r1 = "jid"
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00bc }
            r11.put(r1, r0)     // Catch:{ all -> 0x00bc }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00bc }
            X.1Ev r10 = r0.A02     // Catch:{ all -> 0x00bc }
            java.lang.String r12 = "contacts"
            java.lang.String r13 = "jid=?"
            java.lang.String[] r15 = new java.lang.String[r3]     // Catch:{ all -> 0x00bc }
            com.whatsapp.jid.UserJid r0 = r4.A03     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00bc }
            r15[r9] = r0     // Catch:{ all -> 0x00bc }
            java.lang.String r14 = "storeOneContact/UPDATE_SCHEMA_PAY_CONTACTS"
            r10.A02(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00bc }
        L_0x009d:
            r7.A00()     // Catch:{ all -> 0x00bc }
            r7.close()     // Catch:{ all -> 0x00c6 }
            r8.close()     // Catch:{ all -> 0x00d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r1.<init>()     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "PAY: PaymentStore storeOneContact stored: "
            r1.append(r0)     // Catch:{ all -> 0x00d2 }
            r1.append(r4)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r2)
            return r3
        L_0x00bc:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00c1 }
            goto L_0x00c5
        L_0x00c1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00c6 }
        L_0x00c5:
            throw r1     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00cb }
            goto L_0x00cf
        L_0x00cb:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00d2 }
        L_0x00cf:
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00d0:
            monitor-exit(r2)
            return r9
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KH.A0J(X.8pI, com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8 A[Catch:{ all -> 0x021a, all -> 0x021f, all -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7 A[Catch:{ all -> 0x021a, all -> 0x021f, all -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0139 A[Catch:{ all -> 0x021a, all -> 0x021f, all -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0158 A[Catch:{ all -> 0x021a, all -> 0x021f, all -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0161 A[Catch:{ all -> 0x021a, all -> 0x021f, all -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0168 A[Catch:{ all -> 0x021a, all -> 0x021f, all -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0181 A[Catch:{ all -> 0x021a, all -> 0x021f, all -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0194 A[Catch:{ all -> 0x021a, all -> 0x021f, all -> 0x0224 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ba A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(java.util.List r31) {
        /*
            r30 = this;
            r24 = 0
            r29 = r31
            int r0 = r29.size()
            if (r0 > 0) goto L_0x0021
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PAY: PaymentStore storePaymentMethods got newMethods: "
            r1.append(r0)
            r0 = r29
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r24
        L_0x0021:
            r0 = r30
            java.util.ArrayList r23 = r0.A0A()
            X.2Di r0 = r0.A00
            X.1au r22 = r0.A06()
            X.1xA r21 = r22.BD0()     // Catch:{ all -> 0x0224 }
            java.util.Iterator r20 = r29.iterator()     // Catch:{ all -> 0x021a }
            r19 = 0
        L_0x0037:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r12 = r20.next()     // Catch:{ all -> 0x021a }
            X.AEs r12 = (X.C20284AEs) r12     // Catch:{ all -> 0x021a }
            java.lang.String r11 = r12.A0A     // Catch:{ all -> 0x021a }
            X.2tK r0 = r12.A07     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x021a }
            r28 = r0
            X.77e r14 = r12.A09     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r12.A0B     // Catch:{ all -> 0x021a }
            r27 = r0
            long r6 = r12.A05     // Catch:{ all -> 0x021a }
            long r4 = r12.A06     // Catch:{ all -> 0x021a }
            X.8pb r0 = r12.A08     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x005e
            java.lang.String r13 = r0.A04()     // Catch:{ all -> 0x021a }
            goto L_0x005f
        L_0x005e:
            r13 = 0
        L_0x005f:
            if (r11 == 0) goto L_0x0195
            if (r14 == 0) goto L_0x0195
            int r10 = r12.A05()     // Catch:{ all -> 0x021a }
            int r0 = r12.A01     // Catch:{ all -> 0x021a }
            r26 = r0
            int r0 = r12.A00     // Catch:{ all -> 0x021a }
            r25 = r0
            r1 = 3
            r17 = 0
            r0 = 1
            if (r10 == r0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            r0 = r12
            X.8pK r0 = (X.AnonymousClass8pK) r0     // Catch:{ all -> 0x021a }
            int r9 = r0.A01     // Catch:{ all -> 0x021a }
            r2 = 0
            goto L_0x0090
        L_0x007e:
            if (r10 == r1) goto L_0x0092
            r0 = 4
            if (r10 == r0) goto L_0x0076
            r0 = 6
            if (r10 == r0) goto L_0x0076
            r0 = 7
            if (r10 == r0) goto L_0x0076
            r0 = 8
            if (r10 == r0) goto L_0x0076
            r2 = 0
            r9 = 0
        L_0x0090:
            r8 = 0
            goto L_0x00ab
        L_0x0092:
            r1 = r12
            X.8pP r1 = (X.AnonymousClass8pP) r1     // Catch:{ all -> 0x021a }
            r1.A0C()     // Catch:{ all -> 0x021a }
            X.1KN r0 = r1.A0C()     // Catch:{ all -> 0x021a }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x0134
            X.1KN r0 = r1.A0C()     // Catch:{ all -> 0x021a }
            java.math.BigDecimal r8 = r0.A00     // Catch:{ all -> 0x021a }
        L_0x00a8:
            long r2 = r1.A00     // Catch:{ all -> 0x021a }
            r9 = 0
        L_0x00ab:
            r0 = r23
            X.AEs r16 = A01(r11, r0)     // Catch:{ all -> 0x021a }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x021a }
            r1.<init>()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "credential_id"
            r1.put(r0, r11)     // Catch:{ all -> 0x021a }
            java.lang.String r15 = "country"
            r0 = r28
            r1.put(r15, r0)     // Catch:{ all -> 0x021a }
            boolean r0 = X.C20061A5k.A02(r14)     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x00d1
            java.lang.Object r14 = r14.A00     // Catch:{ all -> 0x021a }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "readable_name"
            r1.put(r0, r14)     // Catch:{ all -> 0x021a }
        L_0x00d1:
            boolean r0 = android.text.TextUtils.isEmpty(r27)     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x00de
            java.lang.String r14 = "issuer_name"
            r0 = r27
            r1.put(r14, r0)     // Catch:{ all -> 0x021a }
        L_0x00de:
            java.lang.String r14 = "type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x021a }
            r1.put(r14, r0)     // Catch:{ all -> 0x021a }
            java.lang.String r14 = "subtype"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x021a }
            r1.put(r14, r0)     // Catch:{ all -> 0x021a }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r14
            int r0 = (int) r6     // Catch:{ all -> 0x021a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "creation_ts"
            r1.put(r0, r6)     // Catch:{ all -> 0x021a }
            long r4 = r4 / r14
            int r0 = (int) r4     // Catch:{ all -> 0x021a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "updated_ts"
            r1.put(r0, r4)     // Catch:{ all -> 0x021a }
            java.lang.String r4 = "debit_mode"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x021a }
            r1.put(r4, r0)     // Catch:{ all -> 0x021a }
            java.lang.String r4 = "credit_mode"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x021a }
            r1.put(r4, r0)     // Catch:{ all -> 0x021a }
            int r0 = r12.A03     // Catch:{ all -> 0x021a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "p2m_debit_mode"
            r1.put(r0, r4)     // Catch:{ all -> 0x021a }
            int r0 = r12.A02     // Catch:{ all -> 0x021a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "p2m_credit_mode"
            r1.put(r0, r4)     // Catch:{ all -> 0x021a }
            goto L_0x0137
        L_0x0134:
            r8 = 0
            goto L_0x00a8
        L_0x0137:
            if (r8 == 0) goto L_0x0156
            r0 = 3
            java.math.BigDecimal r0 = r8.scaleByPowerOfTen(r0)     // Catch:{ all -> 0x021a }
            long r4 = r0.longValue()     // Catch:{ all -> 0x021a }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "balance_1000"
            r1.put(r0, r4)     // Catch:{ all -> 0x021a }
            long r2 = r2 / r14
            int r0 = (int) r2     // Catch:{ all -> 0x021a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "balance_ts"
            r1.put(r0, r2)     // Catch:{ all -> 0x021a }
        L_0x0156:
            if (r13 == 0) goto L_0x015d
            java.lang.String r0 = "country_data"
            r1.put(r0, r13)     // Catch:{ all -> 0x021a }
        L_0x015d:
            byte[] r2 = r12.A0D     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x0166
            java.lang.String r0 = "icon"
            r1.put(r0, r2)     // Catch:{ all -> 0x021a }
        L_0x0166:
            if (r16 == 0) goto L_0x0181
            r0 = r22
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x021a }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x021a }
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x021a }
            r0[r24] = r11     // Catch:{ all -> 0x021a }
            java.lang.String r6 = "storePaymentMethods/UPDATE_SCHEMA_PAY_METHODS"
            java.lang.String r4 = "methods"
            java.lang.String r5 = "credential_id=?"
            r3 = r1
            r7 = r0
            int r2 = r2.A02(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x021a }
            goto L_0x0192
        L_0x0181:
            r0 = r22
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x021a }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x021a }
            java.lang.String r2 = "methods"
            java.lang.String r0 = "storePaymentMethods/INSERT_SCHEMA_PAY_METHODS_TABLE"
            long r0 = r3.A05(r2, r0, r1)     // Catch:{ all -> 0x021a }
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
        L_0x0192:
            if (r2 < 0) goto L_0x01ba
            goto L_0x0197
        L_0x0195:
            r2 = 0
            goto L_0x01ac
        L_0x0197:
            r2 = 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021a }
            r1.<init>()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "PAY: PaymentStore storePaymentMethods stored account type: "
            r1.append(r0)     // Catch:{ all -> 0x021a }
            r1.append(r10)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x021a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x021a }
        L_0x01ac:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x01ce
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x021a }
            r19 = r19 | r0
            goto L_0x0037
        L_0x01ba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021a }
            r1.<init>()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "PAY: PaymentStore storePaymentMethods could not store: "
            r1.append(r0)     // Catch:{ all -> 0x021a }
            r1.append(r10)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x021a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x021a }
        L_0x01ce:
            r21.close()     // Catch:{ all -> 0x0224 }
            r22.close()
            return r24
        L_0x01d5:
            java.util.Iterator r5 = r23.iterator()     // Catch:{ all -> 0x021a }
        L_0x01d9:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x0210
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x021a }
            X.AEs r2 = (X.C20284AEs) r2     // Catch:{ all -> 0x021a }
            java.lang.String r1 = r2.A0A     // Catch:{ all -> 0x021a }
            r0 = r29
            X.AEs r0 = A01(r1, r0)     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x01d9
            java.lang.String r1 = r2.A0A     // Catch:{ all -> 0x021a }
            java.lang.String r4 = "storePaymentMethods/DELETE_SCHEMA_PAY_METHODS"
            r0 = r22
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x021a }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x021a }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x021a }
            r2[r24] = r1     // Catch:{ all -> 0x021a }
            java.lang.String r1 = "methods"
            java.lang.String r0 = "credential_id=?"
            int r1 = r3.A04(r1, r0, r4, r2)     // Catch:{ all -> 0x021a }
            r0 = 0
            if (r1 <= 0) goto L_0x020b
            r0 = 1
        L_0x020b:
            r0 = r0 | r19
            r19 = r0
            goto L_0x01d9
        L_0x0210:
            r21.A00()     // Catch:{ all -> 0x021a }
            r21.close()     // Catch:{ all -> 0x0224 }
            r22.close()
            return r19
        L_0x021a:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x021f }
            goto L_0x0223
        L_0x021f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0224 }
        L_0x0223:
            throw r1     // Catch:{ all -> 0x0224 }
        L_0x0224:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x0229 }
            throw r1
        L_0x0229:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KH.A0M(java.util.List):boolean");
    }

    public AnonymousClass1KH(AnonymousClass190 r1, AnonymousClass11P r2, AnonymousClass118 r3, AnonymousClass1KI r4, AnonymousClass1CP r5, AnonymousClass1CO r6, C18030ve r7) {
        C17960vV.A07(r3);
        this.A04 = r3;
        this.A07 = r7;
        this.A03 = r1;
        C17960vV.A07(r2);
        this.A02 = r2;
        this.A06 = r6;
        this.A05 = r5;
        this.A08 = r4;
    }

    public static C20284AEs A01(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20284AEs aEs = (C20284AEs) it.next();
            if (str.equals(aEs.A0A)) {
                return aEs;
            }
        }
        return null;
    }

    public static C20284AEs A02(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20284AEs aEs = (C20284AEs) it.next();
            if (aEs.A01 == 2) {
                return aEs;
            }
        }
        return null;
    }

    public C20284AEs A07() {
        Iterator it = A0B().iterator();
        while (it.hasNext()) {
            C20284AEs aEs = (C20284AEs) it.next();
            if (aEs.A01 == 2) {
                return aEs;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0053, code lost:
        if (r2 >= 0) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r6 = 0
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = "PAY: PaymentStore removePaymentMethod called with empty credentialId"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r6
        L_0x000d:
            X.2Di r0 = r7.A00
            X.1au r5 = r0.A06()
            java.lang.String r4 = "removePaymentMethod/DELETE_SCHEMA_PAY_METHODS"
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x005a }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x005a }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x005a }
            r2[r6] = r8     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "methods"
            java.lang.String r0 = "credential_id=?"
            int r2 = r3.A04(r1, r0, r4, r2)     // Catch:{ all -> 0x005a }
            r0 = 1
            if (r2 != r0) goto L_0x003f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            r1.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "PAY: PaymentStore removePaymentMethod deleted: "
            r1.append(r0)     // Catch:{ all -> 0x005a }
            r1.append(r8)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x005a }
            goto L_0x0055
        L_0x003f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            r1.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "PAY: PaymentStore removePaymentMethod could not delete: "
            r1.append(r0)     // Catch:{ all -> 0x005a }
            r1.append(r8)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x005a }
            if (r2 < 0) goto L_0x0056
        L_0x0055:
            r6 = 1
        L_0x0056:
            r5.close()
            return r6
        L_0x005a:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x005f }
            throw r1
        L_0x005f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KH.A0L(java.lang.String):boolean");
    }
}
