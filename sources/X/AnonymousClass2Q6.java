package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Q6  reason: invalid class name */
public final class AnonymousClass2Q6 extends C24861Ly {
    public C18000vb A00;
    public final AnonymousClass190 A01;
    public final C18030ve A02;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r9.A01 == 1) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(X.AnonymousClass1E7 r9, X.C28791au r10, java.util.Map r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            r7 = 0
            r2 = 1
            X.C18070vi.A0d(r9, r2)
            X.2lf r4 = r9.A0H
            if (r4 == 0) goto L_0x0037
            java.lang.String r0 = r4.A01
            java.lang.Object r5 = r11.get(r0)
            X.9i3 r5 = (X.C188829i3) r5
            if (r5 == 0) goto L_0x0037
            com.whatsapp.jid.UserJid r6 = r5.A0D
            if (r6 == 0) goto L_0x0037
            if (r13 == 0) goto L_0x001e
            int r0 = r9.A01
            r3 = 0
            if (r0 != r2) goto L_0x001f
        L_0x001e:
            r3 = 1
        L_0x001f:
            if (r12 == 0) goto L_0x0038
            X.1BI r0 = r9.A0J
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0038
            int r0 = r5.A04
            boolean r1 = r9.A10
            if (r0 == 0) goto L_0x0035
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            if (r0 != r1) goto L_0x0038
        L_0x0035:
            if (r3 == 0) goto L_0x0038
        L_0x0037:
            return
        L_0x0038:
            r0 = 3
            android.content.ContentValues r3 = X.C17880vN.A09(r0)
            java.lang.String r1 = "jid"
            java.lang.String r0 = r6.getRawString()
            r3.put(r1, r0)
            int r0 = r5.A04
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_whatsapp_user"
            r3.put(r0, r1)
            java.lang.String r0 = "is_contact_synced"
            X.C17880vN.A18(r3, r0, r2)
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r0 = r4.A01
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = ""
        L_0x0062:
            r2[r7] = r0
            java.lang.String r1 = "wa_address_book"
            java.lang.String r0 = "number = ?"
            X.C24861Ly.A01(r3, r10, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Q6.A0J(X.1E7, X.1au, java.util.Map, boolean, boolean):void");
    }

    public static final long A04(AnonymousClass1E7 r9, C28791au r10) {
        long j;
        String[] strArr;
        String str;
        String str2;
        C59042lf r1 = r9.A0H;
        if (r1 == null) {
            j = 0;
        } else {
            j = r1.A00;
        }
        if (j >= 1) {
            strArr = new String[1];
            C17880vN.A1V(strArr, 0, j);
            str = "raw_contact_id = ?";
        } else if (r1 == null || (str2 = r1.A01) == null || AnonymousClass1YF.A0T(str2)) {
            AnonymousClass1BI r0 = r9.A0J;
            if (r0 == null) {
                return 0;
            }
            strArr = new String[1];
            C17880vN.A1J(r0, strArr, 0);
            str = "jid = ?";
        } else {
            strArr = new String[]{str2};
            str = "number = ?";
        }
        return C24861Ly.A02(r10, "wa_address_book", str, strArr);
    }

    public static final ContentValues A06(AnonymousClass1E7 r3) {
        long j;
        String str;
        ContentValues A09 = C17880vN.A09(8);
        A09.put("given_name", r3.A0T);
        A09.put("family_name", r3.A0S);
        A09.put("display_name", r3.A0K());
        A09.put("is_whatsapp_user", AnonymousClass000.A0i());
        A09.put("sync_policy", Integer.valueOf(r3.A09));
        C59042lf r0 = r3.A0H;
        if (r0 == null) {
            j = 0;
        } else {
            j = r0.A00;
        }
        A09.put("raw_contact_id", Long.valueOf(j));
        C59042lf r02 = r3.A0H;
        if (!(r02 == null || (str = r02.A01) == null)) {
            A09.put("number", str);
        }
        A09.put("is_contact_synced", Integer.valueOf(r3.A01));
        return A09;
    }

    public static final void A07(ContentValues contentValues, AnonymousClass1E7 r9, C28791au r10) {
        long j;
        String[] strArr;
        String str;
        String str2;
        String str3;
        C59042lf r7 = r9.A0H;
        if (r7 == null) {
            j = 0;
        } else {
            j = r7.A00;
        }
        if (j >= 1) {
            strArr = new String[1];
            C17880vN.A1V(strArr, 0, j);
            str = "wa_address_book";
            str2 = "raw_contact_id = ?";
        } else if (r7 == null || (str3 = r7.A01) == null) {
            AnonymousClass1BI r0 = r9.A0J;
            if (r0 != null) {
                strArr = new String[1];
                C17880vN.A1J(r0, strArr, 0);
                str = "wa_address_book";
                str2 = "jid = ?";
            } else {
                return;
            }
        } else {
            strArr = new String[]{str3};
            str = "wa_address_book";
            str2 = "number = ?";
        }
        C24861Ly.A01(contentValues, r10, str, str2, strArr);
    }

    public final ContentValues A0I(AnonymousClass1E7 r6, UserJid userJid) {
        String str;
        ContentValues A09 = C17880vN.A09(17);
        if (userJid != null) {
            A09.put("jid", userJid.getRawString());
        }
        A09.put("is_whatsapp_user", Boolean.valueOf(r6.A10));
        C59042lf r0 = r6.A0H;
        Long l = null;
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = null;
        }
        A09.put("number", str);
        C59042lf r02 = r6.A0H;
        if (r02 != null) {
            l = Long.valueOf(r02.A00);
        }
        A09.put("raw_contact_id", l);
        if (r6.A0o) {
            C17880vN.A19(A09, "raw_contact_id", -4);
        }
        A09.put("display_name", r6.A0K());
        A09.put("phone_type", r6.A0N);
        A09.put("phone_label", r6.A0X);
        A09.put("given_name", r6.A0T);
        A09.put("family_name", r6.A0S);
        A09.put("sort_name", r6.A0Y);
        A09.put("nickname", r6.A0W);
        A09.put("company", r6.A0Q);
        A09.put("title", r6.A0b);
        A09.put("is_starred", Boolean.valueOf(r6.A0s));
        if (C18020vd.A05(C18040vf.A02, this.A02, 5868)) {
            A09.put("sync_policy", Integer.valueOf(r6.A09));
            A09.put("is_contact_synced", Integer.valueOf(r6.A01));
        }
        return A09;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Q6(AnonymousClass190 r1, C18030ve r2, C24811Lt r3) {
        super(r3);
        C18070vi.A0o(r3, r2, r1);
        this.A02 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d6, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.AnonymousClass2Q6 r14, java.util.Collection r15, boolean r16) {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AddressBookStore/addContactsInternal "
            r1.append(r0)
            int r0 = r15.size()
            X.C17900vP.A0o(r1, r0)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r15.iterator()
        L_0x0018:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0018
            r6.add(r1)
            goto L_0x0018
        L_0x002f:
            X.1Lt r0 = r14.A00
            X.1au r5 = r0.A06()
            X.1xA r7 = r5.BD0()     // Catch:{ all -> 0x00d3 }
            java.util.Iterator r13 = r6.iterator()     // Catch:{ all -> 0x00cc }
        L_0x003d:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x008d
            X.1E7 r12 = X.C17880vN.A0O(r13)     // Catch:{ all -> 0x00cc }
            X.2lf r11 = r12.A0H     // Catch:{ all -> 0x00cc }
            if (r11 == 0) goto L_0x003d
            long r0 = r11.A00     // Catch:{ all -> 0x00cc }
            r3 = 1
            r9 = 0
            r10 = 1
            java.lang.String r8 = "wa_address_book"
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0063
            java.lang.String[] r2 = new java.lang.String[r10]     // Catch:{ all -> 0x00cc }
            X.C17880vN.A1V(r2, r9, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "raw_contact_id = ?"
        L_0x005f:
            X.C24861Ly.A02(r5, r8, r0, r2)     // Catch:{ all -> 0x00cc }
            goto L_0x003d
        L_0x0063:
            r3 = -5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0083
            X.1BI r1 = r12.A0J     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x0077
            java.lang.String[] r2 = new java.lang.String[r10]     // Catch:{ all -> 0x00cc }
            X.C17880vN.A1J(r1, r2, r9)     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "jid = ?"
            goto L_0x005f
        L_0x0077:
            if (r0 == 0) goto L_0x003d
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x00cc }
            r1[r9] = r0     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "number = ?"
            X.C24861Ly.A02(r5, r8, r0, r1)     // Catch:{ all -> 0x00cc }
            goto L_0x003d
        L_0x0083:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00cc }
            java.lang.String r2 = "AddressBookStore/addContactsInternalDeleteContact invalid rawContactId "
            X.C17900vP.A0l(r2, r3, r0)     // Catch:{ all -> 0x00cc }
            goto L_0x003d
        L_0x008d:
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x00cc }
        L_0x0091:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00cc }
            r4 = 0
            if (r0 == 0) goto L_0x00c2
            X.1E7 r3 = X.C17880vN.A0O(r6)     // Catch:{ all -> 0x00cc }
            X.1BI r2 = r3.A0J     // Catch:{ all -> 0x00cc }
            boolean r0 = X.C22971Dz.A0d(r2)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "wa_address_book"
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r2, r0)     // Catch:{ all -> 0x00cc }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x00cc }
            android.content.ContentValues r0 = r14.A0I(r3, r2)     // Catch:{ all -> 0x00cc }
            X.C24861Ly.A00(r0, r5, r1)     // Catch:{ all -> 0x00cc }
            goto L_0x0091
        L_0x00b6:
            if (r2 != 0) goto L_0x0091
            if (r16 == 0) goto L_0x0091
            android.content.ContentValues r0 = r14.A0I(r3, r4)     // Catch:{ all -> 0x00cc }
            X.C24861Ly.A00(r0, r5, r1)     // Catch:{ all -> 0x00cc }
            goto L_0x0091
        L_0x00c2:
            r7.A00()     // Catch:{ all -> 0x00cc }
            r7.close()     // Catch:{ all -> 0x00d3 }
            r5.close()
            return
        L_0x00cc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Q6.A08(X.2Q6, java.util.Collection, boolean):void");
    }
}
