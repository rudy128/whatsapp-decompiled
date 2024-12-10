package X;

import android.content.ContentProviderOperation;
import android.provider.ContactsContract;

/* renamed from: X.6yv  reason: invalid class name and case insensitive filesystem */
public final class C139486yv {
    public final AnonymousClass11C A00;
    public final C219217x A01;
    public final AnonymousClass00H A02;

    public static final ContentProviderOperation.Builder A00(Long l, String str) {
        ContentProviderOperation.Builder withValue;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != -5) {
                ContentProviderOperation.Builder newUpdate = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI);
                String[] A1Z = C17880vN.A1Z();
                C17880vN.A1V(A1Z, 0, longValue);
                A1Z[1] = str;
                withValue = newUpdate.withSelection("raw_contact_id = ? AND mimetype = ?", A1Z);
                C18070vi.A0X(withValue);
                return withValue;
            }
        }
        withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", str);
        C18070vi.A0X(withValue);
        return withValue;
    }

    public final boolean A02() {
        if (this.A01.A02("android.permission.GET_ACCOUNTS") != 0 || !C72463Mc.A1W(this.A02)) {
            return false;
        }
        return true;
    }

    public C139486yv(AnonymousClass11C r1, C219217x r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (r0.length() != 0) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        if (r6 == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        r2.withValue("data3", r8.A05);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C136426tn r8, X.C1606489j r9) {
        /*
            r7 = this;
            boolean r0 = r7.A02()
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "NativeContactDbHelper no contact permission"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            if (r9 == 0) goto L_0x0010
            r9.BkO()
        L_0x0010:
            return
        L_0x0011:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.Long r4 = r8.A00
            boolean r6 = X.AnonymousClass000.A1W(r4)
            java.lang.String r5 = r8.A01
            if (r5 == 0) goto L_0x003f
            java.lang.String r2 = r8.A02
            if (r2 == 0) goto L_0x003f
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r0)
            java.lang.String r0 = "account_type"
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r0, r2)
            java.lang.String r0 = "account_name"
            android.content.ContentProviderOperation$Builder r0 = r1.withValue(r0, r5)
            android.content.ContentProviderOperation r0 = r0.build()
            X.C18070vi.A0X(r0)
            r3.add(r0)
        L_0x003f:
            boolean r0 = X.AnonymousClass000.A1W(r4)
            java.lang.String r5 = "data2"
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = r8.A04
            if (r0 == 0) goto L_0x0051
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0088
        L_0x0051:
            java.lang.String r0 = r8.A05
            if (r0 == 0) goto L_0x005b
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0088
        L_0x005b:
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            android.content.ContentProviderOperation$Builder r1 = A00(r4, r0)
            java.lang.String r0 = r8.A06
            java.lang.String r2 = "data1"
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r2, r0)
            java.lang.Integer r0 = X.C17880vN.A0i()
            android.content.ContentProviderOperation$Builder r0 = r1.withValue(r5, r0)
            android.content.ContentProviderOperation r0 = r0.build()
            X.C18070vi.A0X(r0)
            r3.add(r0)
            if (r6 != 0) goto L_0x00bf
            java.lang.String r0 = r8.A03
            if (r0 == 0) goto L_0x00d5
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00bf
            goto L_0x00d5
        L_0x0088:
            java.lang.String r0 = "vnd.android.cursor.item/name"
            android.content.ContentProviderOperation$Builder r2 = A00(r4, r0)
            if (r6 != 0) goto L_0x00af
            java.lang.String r0 = r8.A04
            if (r0 == 0) goto L_0x009a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00af
        L_0x009a:
            java.lang.String r0 = r8.A05
            if (r0 == 0) goto L_0x00a4
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b7
        L_0x00a4:
            android.content.ContentProviderOperation r0 = r2.build()
            X.C18070vi.A0X(r0)
            r3.add(r0)
            goto L_0x005b
        L_0x00af:
            java.lang.String r0 = r8.A04
            r2.withValue(r5, r0)
            if (r6 != 0) goto L_0x00b7
            goto L_0x009a
        L_0x00b7:
            java.lang.String r1 = "data3"
            java.lang.String r0 = r8.A05
            r2.withValue(r1, r0)
            goto L_0x00a4
        L_0x00bf:
            java.lang.String r0 = "vnd.android.cursor.item/organization"
            android.content.ContentProviderOperation$Builder r1 = A00(r4, r0)
            java.lang.String r0 = r8.A03
            android.content.ContentProviderOperation$Builder r0 = r1.withValue(r2, r0)
            android.content.ContentProviderOperation r0 = r0.build()
            X.C18070vi.A0X(r0)
            r3.add(r0)
        L_0x00d5:
            X.11C r0 = r7.A00     // Catch:{ Exception -> 0x00f4 }
            X.11B r0 = r0.A0O()     // Catch:{ Exception -> 0x00f4 }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r2 = "com.android.contacts"
            java.util.ArrayList r1 = X.C17880vN.A10(r3)     // Catch:{ Exception -> 0x00f4 }
            android.content.ContentResolver r0 = X.AnonymousClass11B.A00(r0)     // Catch:{ Exception -> 0x00f4 }
            android.content.ContentProviderResult[] r0 = r0.applyBatch(r2, r1)     // Catch:{ Exception -> 0x00f4 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x00f4 }
        L_0x00ee:
            if (r9 == 0) goto L_0x0010
            r9.C4K()     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0108
        L_0x00f4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NativeContactDbHelper/unable to save contact "
            X.C108995ce.A1M(r0, r1, r2)
            if (r9 == 0) goto L_0x0010
            java.lang.String r0 = r2.getMessage()
            r9.C4G(r0)
            return
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139486yv.A01(X.6tn, X.89j):void");
    }
}
