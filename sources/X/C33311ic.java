package X;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ic  reason: invalid class name and case insensitive filesystem */
public class C33311ic {
    public final C24621La A00;
    public final AnonymousClass1KH A01;
    public final AnonymousClass1QE A02 = AnonymousClass1QE.A00("PaymentMethodUpdateNotification", "notification", "COMMON");
    public final AnonymousClass10I A03;
    public final AnonymousClass118 A04;
    public final C27301Vn A05;
    public final C18000vb A06;
    public final AnonymousClass1Cd A07;
    public final AnonymousClass1QO A08;
    public final AnonymousClass1QS A09;
    public final AnonymousClass1Nb A0A;

    private synchronized void A01(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A02.A05("removeUnreadPaymentMethodUpdate empty credentialId");
        } else {
            C24621La r8 = this.A00;
            String A022 = r8.A02("unread_payment_method_credential_ids");
            if (A022 == null) {
                A022 = "";
            }
            String[] split = TextUtils.split(A022, ";");
            HashSet hashSet = new HashSet();
            for (String str2 : split) {
                if (!TextUtils.equals(TextUtils.split(str2, ":")[0], str)) {
                    hashSet.add(str2);
                } else {
                    AnonymousClass1QE r2 = this.A02;
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeUnreadPaymentMethodUpdate/removed credentialId:");
                    sb.append(str);
                    r2.A06(sb.toString());
                }
            }
            r8.A06("unread_payment_method_credential_ids", TextUtils.join(";", hashSet));
        }
    }

    public synchronized void A03(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A01((String) it.next());
        }
        if (TextUtils.isEmpty(this.A00.A02("unread_payment_method_credential_ids"))) {
            this.A05.BEJ(22, "PaymentMethodUpdateNotification4");
        }
    }

    /* JADX WARNING: type inference failed for: r0v72, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026e, code lost:
        r2.A0F(r1);
        r2.A0D(r1);
        r0 = new X.AnonymousClass72G();
        r0.A07(r1);
        r2.A0B(r0);
        r2.A0A = r8.A00(r6, r7, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0289, code lost:
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) null) != false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x028b, code lost:
        r2.A08(2131231807, (java.lang.CharSequence) null, r8.A00(r6, r7, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0186, code lost:
        r1 = r8.A00.getResources().getQuantityString(2131755290, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0197, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0199, code lost:
        r3.A02.A06("no available payment notification text");
        r3.A01(r7.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01dd, code lost:
        r13[0] = r1;
        r1 = r15.getString(r14, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ed, code lost:
        if (r12.equals(r0) == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f1, code lost:
        if ((r7 instanceof X.AnonymousClass8pO) == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f3, code lost:
        r0 = (X.AnonymousClass8pX) r7.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f7, code lost:
        if (r0 == null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f9, code lost:
        r13 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ff, code lost:
        if (android.text.TextUtils.isEmpty(r13) == false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0201, code lost:
        r13 = r8.A02.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0207, code lost:
        r0 = r7.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0209, code lost:
        if (r0 == null) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020b, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0213, code lost:
        if ("MERCHANT_VERIFIED".equals(r12) == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0215, code lost:
        r15 = r8.A00;
        r14 = 2131887415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021a, code lost:
        r0 = new java.lang.Object[]{r1};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021e, code lost:
        r1 = r15.getString(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x022a, code lost:
        if ("MERCHANT_VERIFICATION_FAILURE".equals(r12) == false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022c, code lost:
        r15 = r8.A00;
        r14 = 2131887414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0238, code lost:
        if ("MERCHANT_DISABLED".equals(r12) == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x023a, code lost:
        r15 = r8.A00;
        r14 = 2131887412;
        r0 = new java.lang.Object[]{r13};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0244, code lost:
        r13 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0247, code lost:
        r1 = "";
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C33311ic r17) {
        /*
            r3 = r17
            X.1QO r1 = r3.A08
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x001b
            X.1Cd r0 = r3.A07
            r0.A06()
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x001c
            X.1QE r1 = r3.A02
            java.lang.String r0 = "message store not yet ready"
        L_0x0018:
            r1.A06(r0)
        L_0x001b:
            return
        L_0x001c:
            monitor-enter(r3)
            X.1La r13 = r3.A00     // Catch:{ all -> 0x0349 }
            java.lang.String r1 = "unread_payment_method_credential_ids"
            java.lang.String r5 = r13.A02(r1)     // Catch:{ all -> 0x0349 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0349 }
            if (r0 == 0) goto L_0x0033
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0349 }
            r9.<init>()     // Catch:{ all -> 0x0349 }
            goto L_0x0103
        L_0x0033:
            java.lang.String r0 = ";"
            java.lang.String[] r0 = android.text.TextUtils.split(r5, r0)     // Catch:{ all -> 0x0349 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0349 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0349 }
            r7.<init>()     // Catch:{ all -> 0x0349 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0349 }
        L_0x0046:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0349 }
            if (r0 == 0) goto L_0x005f
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0349 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0349 }
            java.lang.String r0 = ":"
            java.lang.String[] r2 = android.text.TextUtils.split(r2, r0)     // Catch:{ all -> 0x0349 }
            r0 = 0
            r0 = r2[r0]     // Catch:{ all -> 0x0349 }
            r7.add(r0)     // Catch:{ all -> 0x0349 }
            goto L_0x0046
        L_0x005f:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0349 }
            if (r0 != 0) goto L_0x00fe
            X.1KH r5 = r3.A01     // Catch:{ all -> 0x0349 }
            boolean r0 = r5.A09     // Catch:{ all -> 0x0349 }
            if (r0 == 0) goto L_0x00fe
            X.2Di r0 = r5.A00     // Catch:{ all -> 0x0349 }
            X.1at r8 = r0.get()     // Catch:{ all -> 0x0349 }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x033e }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x033e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x033e }
            r2.<init>()     // Catch:{ all -> 0x033e }
            java.lang.String r0 = "SELECT "
            r2.append(r0)     // Catch:{ all -> 0x033e }
            java.lang.String r4 = ", "
            java.lang.String[] r0 = X.C50772Vs.A00     // Catch:{ all -> 0x033e }
            java.lang.String r0 = X.C43501zu.A00(r4, r0)     // Catch:{ all -> 0x033e }
            r2.append(r0)     // Catch:{ all -> 0x033e }
            java.lang.String r0 = " FROM "
            r2.append(r0)     // Catch:{ all -> 0x033e }
            java.lang.String r0 = "methods"
            r2.append(r0)     // Catch:{ all -> 0x033e }
            java.lang.String r0 = " WHERE "
            r2.append(r0)     // Catch:{ all -> 0x033e }
            java.lang.String r0 = "credential_id IN (\""
            r2.append(r0)     // Catch:{ all -> 0x033e }
            java.lang.String r0 = "\", \""
            java.lang.String r0 = X.AnonymousClass2SU.A00(r0, r7)     // Catch:{ all -> 0x033e }
            r2.append(r0)     // Catch:{ all -> 0x033e }
            java.lang.String r0 = "\")"
            r2.append(r0)     // Catch:{ all -> 0x033e }
            java.lang.String r0 = " LIMIT 100"
            r2.append(r0)     // Catch:{ all -> 0x033e }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x033e }
            java.lang.String r2 = "readPaymentMethodByCredentialIds/QUERY_SCHEMA_PAY_METHODS"
            r0 = 0
            android.database.Cursor r4 = r6.A0A(r4, r2, r0)     // Catch:{ all -> 0x033e }
            int r0 = r4.getCount()     // Catch:{ all -> 0x0332 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0332 }
            r9.<init>(r0)     // Catch:{ all -> 0x0332 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x00f2
            X.AEs r0 = X.AnonymousClass1KH.A00(r4, r5)     // Catch:{ all -> 0x0332 }
            r9.add(r0)     // Catch:{ all -> 0x0332 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0332 }
            r2.<init>()     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = "PAY: PaymentTransactionStore readPaymentMethodByCredentialIds returned: "
            r2.append(r0)     // Catch:{ all -> 0x0332 }
            int r0 = r9.size()     // Catch:{ all -> 0x0332 }
            r2.append(r0)     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0332 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
            r4.close()     // Catch:{ all -> 0x033e }
            r8.close()     // Catch:{ all -> 0x0349 }
            goto L_0x0103
        L_0x00f2:
            r4.close()     // Catch:{ all -> 0x033e }
            r8.close()     // Catch:{ all -> 0x0349 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0349 }
            r9.<init>()     // Catch:{ all -> 0x0349 }
            goto L_0x0103
        L_0x00fe:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0349 }
            r9.<init>()     // Catch:{ all -> 0x0349 }
        L_0x0103:
            monitor-exit(r3)
            X.118 r0 = r3.A04
            android.content.Context r6 = r0.A00
            X.1QS r0 = r3.A09
            X.BD1 r0 = r0.A06()
            X.9mX r8 = r0.BWn()
            boolean r0 = r9.isEmpty()
            r5 = 22
            if (r0 != 0) goto L_0x0325
            if (r8 == 0) goto L_0x0325
            X.73t r2 = X.C217217d.A03(r6)
            java.lang.String r16 = "status"
            r0 = r16
            r2.A0L = r0
            r10 = 1
            r2.A03 = r10
            r2.A0G(r10)
            r0 = 4
            r2.A06(r0)
            android.app.Notification r0 = r2.A08
            r17 = r0
            r4 = 2131231578(0x7f08035a, float:1.807924E38)
            r0.icon = r4
            int r0 = r9.size()
            r4 = 0
            r11 = 0
            if (r0 != r10) goto L_0x024e
            java.lang.Object r7 = r9.get(r4)
            X.AEs r7 = (X.C20284AEs) r7
            java.lang.String r12 = r7.A0A
            java.lang.String r1 = r13.A02(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x024b
            java.lang.String r0 = ";"
            java.lang.String[] r0 = android.text.TextUtils.split(r1, r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x0162:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x024b
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ":"
            java.lang.String[] r1 = android.text.TextUtils.split(r1, r0)
            r0 = r1[r4]
            boolean r0 = android.text.TextUtils.equals(r0, r12)
            if (r0 == 0) goto L_0x0162
            r12 = r1[r10]
        L_0x017e:
            r1 = 0
            int r0 = r12.hashCode()
            switch(r0) {
                case -1573204880: goto L_0x01a6;
                case -945151213: goto L_0x01c0;
                case -863506419: goto L_0x01c3;
                case -188177059: goto L_0x01e4;
                case 1084491615: goto L_0x01e7;
                default: goto L_0x0186;
            }
        L_0x0186:
            android.content.Context r0 = r8.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755290(0x7f10011a, float:1.9141455E38)
            java.lang.String r1 = r1.getQuantityString(r0, r10)
        L_0x0193:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x026e
            X.1QE r1 = r3.A02
            java.lang.String r0 = "no available payment notification text"
            r1.A06(r0)
            java.lang.String r0 = r7.A0A
            r3.A01(r0)
            return
        L_0x01a6:
            java.lang.String r0 = "MERCHANT_LINKED"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0186
            boolean r0 = r7 instanceof X.AnonymousClass8pO
            if (r0 == 0) goto L_0x0186
            X.77e r0 = r7.A09
            android.content.Context r15 = r8.A00
            r14 = 2131887413(0x7f120535, float:1.9409432E38)
            java.lang.Object[] r13 = new java.lang.Object[r10]
            if (r0 == 0) goto L_0x01dd
            java.lang.Object r1 = r0.A00
            goto L_0x01dd
        L_0x01c0:
            java.lang.String r0 = "MERCHANT_DISABLED"
            goto L_0x01e9
        L_0x01c3:
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0186
            boolean r0 = r7 instanceof X.AnonymousClass8pK
            if (r0 == 0) goto L_0x0186
            r0 = r7
            X.8pK r0 = (X.AnonymousClass8pK) r0
            android.content.Context r15 = r8.A00
            r14 = 2131887416(0x7f120538, float:1.9409438E38)
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.String r1 = X.A8e.A02(r15, r0)
        L_0x01dd:
            r13[r4] = r1
            java.lang.String r1 = r15.getString(r14, r13)
            goto L_0x0193
        L_0x01e4:
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            goto L_0x01e9
        L_0x01e7:
            java.lang.String r0 = "MERCHANT_VERIFIED"
        L_0x01e9:
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0186
            boolean r0 = r7 instanceof X.AnonymousClass8pO
            if (r0 == 0) goto L_0x0186
            X.8pb r0 = r7.A08
            X.8pX r0 = (X.AnonymousClass8pX) r0
            if (r0 == 0) goto L_0x0244
            java.lang.String r13 = r0.A03
        L_0x01fb:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x0207
            X.11S r0 = r8.A02
            java.lang.String r13 = r0.A0D()
        L_0x0207:
            X.77e r0 = r7.A09
            if (r0 == 0) goto L_0x020d
            java.lang.Object r1 = r0.A00
        L_0x020d:
            java.lang.String r0 = "MERCHANT_VERIFIED"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0224
            android.content.Context r15 = r8.A00
            r14 = 2131887415(0x7f120537, float:1.9409436E38)
        L_0x021a:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r4] = r1
        L_0x021e:
            java.lang.String r1 = r15.getString(r14, r0)
            goto L_0x0193
        L_0x0224:
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0232
            android.content.Context r15 = r8.A00
            r14 = 2131887414(0x7f120536, float:1.9409434E38)
            goto L_0x021a
        L_0x0232:
            java.lang.String r0 = "MERCHANT_DISABLED"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0247
            android.content.Context r15 = r8.A00
            r14 = 2131887412(0x7f120534, float:1.940943E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r4] = r13
            goto L_0x021e
        L_0x0244:
            java.lang.String r13 = ""
            goto L_0x01fb
        L_0x0247:
            java.lang.String r1 = ""
            goto L_0x0193
        L_0x024b:
            r12 = r11
            goto L_0x017e
        L_0x024e:
            int r7 = r9.size()
            X.0vb r14 = r3.A06
            r13 = 2131755290(0x7f10011a, float:1.9141455E38)
            long r0 = (long) r7
            java.lang.Object[] r12 = new java.lang.Object[r10]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12[r4] = r7
            java.lang.String r0 = r14.A0K(r12, r13, r0)
            r2.A0D(r0)
            android.app.PendingIntent r0 = r8.A00(r6, r11, r11)
            r2.A0A = r0
            goto L_0x0295
        L_0x026e:
            r2.A0F(r1)
            r2.A0D(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A07(r1)
            r2.A0B(r0)
            android.app.PendingIntent r0 = r8.A00(r6, r7, r12)
            r2.A0A = r0
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x0295
            r1 = 2131231807(0x7f08043f, float:1.8079705E38)
            android.app.PendingIntent r0 = r8.A00(r6, r7, r12)
            r2.A08(r1, r11, r0)
        L_0x0295:
            X.73t r7 = X.C217217d.A03(r6)
            r0 = r16
            r7.A0L = r0
            r7.A03 = r10
            X.0vb r13 = r3.A06
            r12 = 2131755290(0x7f10011a, float:1.9141455E38)
            int r0 = r9.size()
            long r0 = (long) r0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10[r4] = r9
            java.lang.String r0 = r13.A0K(r10, r12, r0)
            r7.A0D(r0)
            r9 = 2131231807(0x7f08043f, float:1.8079705E38)
            android.content.Context r1 = r8.A00
            r0 = 2131897860(0x7f122e04, float:1.9430621E38)
            java.lang.String r1 = r1.getString(r0)
            android.app.PendingIntent r0 = r8.A00(r6, r11, r11)
            r7.A08(r9, r1, r0)
            android.app.Notification r0 = r7.A05()
            r7.A09 = r0
            android.app.Notification r1 = r7.A08
            r0 = 2131231578(0x7f08035a, float:1.807924E38)
            r1.icon = r0
            java.lang.Class<X.26B> r0 = X.AnonymousClass26B.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6, r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = X.C1408573i.A01(r6, r5, r1, r0)
            r0 = r17
            r0.deleteIntent = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0301
            X.1Nb r0 = r3.A0A
            X.1yM r0 = r0.A0W()
            X.1zz r0 = (X.C43551zz) r0
            java.lang.String r0 = r0.A0E()
            r2.A0M = r0
        L_0x0301:
            android.app.Notification r2 = r2.A05()
            X.1QE r1 = r3.A02     // Catch:{ SecurityException -> 0x0312 }
            java.lang.String r0 = "NotificationManager/notify"
            r1.A06(r0)     // Catch:{ SecurityException -> 0x0312 }
            X.1Vn r0 = r3.A05     // Catch:{ SecurityException -> 0x0312 }
            r0.BkR(r5, r2)     // Catch:{ SecurityException -> 0x0312 }
            goto L_0x0348
        L_0x0312:
            r2 = move-exception
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier"
            X.C17960vV.A0F(r4, r0)
            java.lang.String r0 = "android.permission.UPDATE_APP_OPS_STATS"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x001b
            throw r2
        L_0x0325:
            X.1Vn r1 = r3.A05
            java.lang.String r0 = "PaymentMethodUpdateNotification1"
            r1.BEJ(r5, r0)
            X.1QE r1 = r3.A02
            java.lang.String r0 = "no unread payment notifications"
            goto L_0x0018
        L_0x0332:
            r1 = move-exception
            if (r4 == 0) goto L_0x033d
            r4.close()     // Catch:{ all -> 0x0339 }
            goto L_0x033d
        L_0x0339:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x033e }
        L_0x033d:
            throw r1     // Catch:{ all -> 0x033e }
        L_0x033e:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0343 }
            goto L_0x0347
        L_0x0343:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0349 }
        L_0x0347:
            throw r1     // Catch:{ all -> 0x0349 }
        L_0x0348:
            return
        L_0x0349:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33311ic.A00(X.1ic):void");
    }

    public void A02() {
        C24621La r2 = this.A00;
        if (!TextUtils.isEmpty(r2.A02("unread_payment_method_credential_ids"))) {
            r2.A06("unread_payment_method_credential_ids", "");
            this.A05.BEJ(22, "PaymentMethodUpdateNotification3");
        }
    }

    public C33311ic(AnonymousClass118 r4, C27301Vn r5, C18000vb r6, AnonymousClass1Cd r7, C24621La r8, AnonymousClass1KH r9, AnonymousClass1QO r10, AnonymousClass1QS r11, AnonymousClass1Nb r12, AnonymousClass10I r13) {
        this.A04 = r4;
        this.A03 = r13;
        this.A01 = r9;
        this.A06 = r6;
        this.A09 = r11;
        this.A0A = r12;
        this.A00 = r8;
        this.A07 = r7;
        this.A08 = r10;
        this.A05 = r5;
    }
}
