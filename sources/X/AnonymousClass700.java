package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.700  reason: invalid class name */
public class AnonymousClass700 {
    public final AnonymousClass1KB A00;
    public final C26811To A01;
    public final AnonymousClass1M9 A02;
    public final C24671Lf A03;
    public final C24921Me A04;
    public final C678831f A05;
    public final AnonymousClass11P A06;
    public final C30801eX A07;
    public final AnonymousClass1LU A08;
    public final AnonymousClass11S A09;
    public final AnonymousClass12E A0A;
    public final AnonymousClass11C A0B;
    public final C18030ve A0C;
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;

    public void A02(Context context, UserJid userJid, String str) {
        A01(context, userJid, (Integer) null, str, (String) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025e, code lost:
        if (r11 == false) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0260, code lost:
        r7.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02fe, code lost:
        r0 = r1.getAsString("data3");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0302, code lost:
        r8.putExtra(r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A00(android.app.Activity r15, android.graphics.Bitmap r16, X.AnonymousClass73C r17, boolean r18) {
        /*
            if (r18 == 0) goto L_0x0066
            java.lang.String r1 = "android.intent.action.INSERT"
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r1, r0)
        L_0x000b:
            java.lang.String r1 = "finishActivityOnSaveCompleted"
            r0 = 1
            r8.putExtra(r1, r0)
            r12 = r17
            X.6oE r0 = r12.A0A
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "name"
            r8.putExtra(r0, r1)
            android.content.res.Resources r2 = r15.getResources()
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.List r0 = r12.A06
            java.lang.String r6 = "data3"
            java.lang.String r11 = "data2"
            java.lang.String r5 = "data1"
            java.lang.String r9 = "mimetype"
            if (r0 == 0) goto L_0x0072
            java.util.Iterator r10 = r0.iterator()
        L_0x0034:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r4 = r10.next()
            X.6ib r4 = (X.C129926ib) r4
            android.content.ContentValues r3 = X.C17880vN.A08()
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            r3.put(r9, r0)
            java.lang.String r0 = r4.A02
            r3.put(r5, r0)
            int r0 = r4.A00
            X.C17880vN.A18(r3, r11, r0)
            int r1 = r4.A00
            java.lang.String r0 = r4.A03
            java.lang.CharSequence r0 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(r2, r1, r0)
            java.lang.String r0 = r0.toString()
            r3.put(r6, r0)
            r7.add(r3)
            goto L_0x0034
        L_0x0066:
            java.lang.String r0 = "android.intent.action.INSERT_OR_EDIT"
            android.content.Intent r8 = X.C108945cZ.A0G(r0)
            java.lang.String r0 = "vnd.android.cursor.item/contact"
            r8.setType(r0)
            goto L_0x000b
        L_0x0072:
            java.util.List r0 = r12.A03
            java.lang.String r4 = "data4"
            if (r0 == 0) goto L_0x0110
            java.util.Iterator r13 = r0.iterator()
        L_0x007c:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.Object r3 = r13.next()
            X.6jA r3 = (X.C130276jA) r3
            java.lang.Class r10 = r3.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r10 != r0) goto L_0x00b4
            android.content.ContentValues r10 = X.C17880vN.A08()
            java.lang.String r0 = "vnd.android.cursor.item/email_v2"
            r10.put(r9, r0)
            java.lang.String r0 = r3.A02
            r10.put(r5, r0)
            int r0 = r3.A00
            X.C17880vN.A18(r10, r11, r0)
            int r1 = r3.A00
            java.lang.String r0 = r3.A03
            java.lang.CharSequence r0 = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(r2, r1, r0)
        L_0x00a9:
            java.lang.String r0 = r0.toString()
            r10.put(r6, r0)
            r7.add(r10)
            goto L_0x007c
        L_0x00b4:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r10 != r0) goto L_0x00fe
            android.content.ContentValues r10 = X.C17880vN.A08()
            java.lang.String r0 = "vnd.android.cursor.item/postal-address_v2"
            r10.put(r9, r0)
            X.6z2 r0 = r3.A04
            java.lang.String r0 = r0.A03
            java.lang.String r0 = X.C139556z2.A00(r0)
            r10.put(r4, r0)
            X.6z2 r0 = r3.A04
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "data7"
            r10.put(r0, r1)
            X.6z2 r0 = r3.A04
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "data8"
            r10.put(r0, r1)
            X.6z2 r0 = r3.A04
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "data9"
            r10.put(r0, r1)
            X.6z2 r0 = r3.A04
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "data10"
            r10.put(r0, r1)
            int r0 = r3.A00
            X.C17880vN.A18(r10, r11, r0)
            int r1 = r3.A00
            java.lang.String r0 = r3.A03
            java.lang.CharSequence r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(r2, r1, r0)
            goto L_0x00a9
        L_0x00fe:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Im> r0 = android.provider.ContactsContract.CommonDataKinds.Im.class
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r10 != r0) goto L_0x010d
            java.lang.String r0 = "sharecontactutil "
        L_0x0108:
            X.C17900vP.A0X(r3, r0, r1)
            goto L_0x007c
        L_0x010d:
            java.lang.String r0 = "sharecontactutil/type/unknown "
            goto L_0x0108
        L_0x0110:
            java.util.List r0 = r12.A05
            java.lang.String r3 = "data5"
            r10 = 0
            if (r0 == 0) goto L_0x0154
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0154
            java.util.List r0 = r12.A05
            java.lang.Object r13 = r0.get(r10)
            X.6fb r13 = (X.C128196fb) r13
            java.lang.String r1 = r13.A00
            java.lang.String r0 = " "
            int r14 = r1.lastIndexOf(r0)
            if (r14 <= 0) goto L_0x0133
            java.lang.String r1 = r1.substring(r10, r14)
        L_0x0133:
            android.content.ContentValues r2 = X.C17880vN.A08()
            java.lang.String r0 = "vnd.android.cursor.item/organization"
            r2.put(r9, r0)
            r2.put(r5, r1)
            if (r14 <= 0) goto L_0x014c
            java.lang.String r1 = r13.A00
            int r0 = r14 + 1
            java.lang.String r0 = r1.substring(r0)
            r2.put(r3, r0)
        L_0x014c:
            java.lang.String r0 = r13.A01
            r2.put(r4, r0)
            r7.add(r2)
        L_0x0154:
            java.util.List r0 = r12.A07
            if (r0 == 0) goto L_0x0187
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0187
            java.util.List r0 = r12.A07
            java.util.Iterator r13 = r0.iterator()
        L_0x0164:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0187
            java.lang.Object r2 = r13.next()
            X.6fc r2 = (X.C128206fc) r2
            android.content.ContentValues r1 = X.C17880vN.A08()
            java.lang.String r0 = "vnd.android.cursor.item/website"
            r1.put(r9, r0)
            int r0 = r2.A00
            X.C17880vN.A18(r1, r11, r0)
            java.lang.String r0 = r2.A01
            r1.put(r5, r0)
            r7.add(r1)
            goto L_0x0164
        L_0x0187:
            java.util.Map r0 = r12.A08
            if (r0 == 0) goto L_0x021a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r15 = r0.iterator()
        L_0x0193:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x021a
            java.lang.String r13 = X.C17880vN.A0v(r15)
            java.lang.String r0 = "NICKNAME"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01ba
            android.content.ContentValues r1 = X.C17880vN.A08()
            java.lang.String r0 = "vnd.android.cursor.item/nickname"
            r1.put(r9, r0)
            X.6tl r0 = X.C108995ce.A0i(r13, r12)
            java.lang.String r0 = r0.A02
            r1.put(r5, r0)
            r7.add(r1)
        L_0x01ba:
            java.lang.String r0 = "BDAY"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01db
            android.content.ContentValues r1 = X.C17880vN.A08()
            java.lang.String r0 = "vnd.android.cursor.item/contact_event"
            r1.put(r9, r0)
            r0 = 3
            X.C17880vN.A18(r1, r11, r0)
            X.6tl r0 = X.C108995ce.A0i(r13, r12)
            java.lang.String r0 = r0.A02
            r1.put(r5, r0)
            r7.add(r1)
        L_0x01db:
            java.util.HashMap r14 = X.AnonymousClass73C.A0E
            boolean r0 = r14.containsKey(r13)
            if (r0 == 0) goto L_0x0193
            X.6tl r1 = X.C108995ce.A0i(r13, r12)
            android.content.ContentValues r2 = X.C17880vN.A08()
            java.lang.String r0 = "vnd.android.cursor.item/im"
            r2.put(r9, r0)
            java.lang.Object r0 = r14.get(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.put(r3, r0)
            X.6tl r0 = X.C108995ce.A0i(r13, r12)
            java.lang.String r0 = r0.A02
            r2.put(r5, r0)
            java.util.Set r1 = r1.A04
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0215
            java.lang.Object[] r0 = r1.toArray()
            r0 = r0[r10]
            java.lang.String r0 = (java.lang.String) r0
            r2.put(r11, r0)
        L_0x0215:
            r7.add(r2)
            goto L_0x0193
        L_0x021a:
            r2 = r16
            if (r16 == 0) goto L_0x023e
            java.io.ByteArrayOutputStream r10 = X.C108945cZ.A15()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 100
            byte[] r2 = X.C108955ca.A1a(r1, r2, r10, r0)
            android.content.ContentValues r1 = X.C17880vN.A08()
            java.lang.String r0 = "vnd.android.cursor.item/photo"
            r1.put(r9, r0)
            java.lang.String r0 = "data15"
            r1.put(r0, r2)
            r7.add(r1)
            r10.close()     // Catch:{ IOException -> 0x023e }
        L_0x023e:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0263
            r2 = 0
            java.lang.Object r1 = r7.get(r2)
            android.content.ContentValues r1 = (android.content.ContentValues) r1
            java.lang.String r9 = r1.getAsString(r9)
            int r0 = r9.hashCode()
            r11 = 0
            r10 = -1
            switch(r0) {
                case -1569536764: goto L_0x0354;
                case -1328682538: goto L_0x0349;
                case -601229436: goto L_0x033e;
                case 684173810: goto L_0x0333;
                case 689862072: goto L_0x0328;
                case 905843021: goto L_0x031d;
                case 950831081: goto L_0x0312;
                case 2034973555: goto L_0x0307;
                default: goto L_0x0258;
            }
        L_0x0258:
            java.lang.String r9 = ", "
            switch(r10) {
                case 0: goto L_0x02f3;
                case 1: goto L_0x025e;
                case 2: goto L_0x02ad;
                case 3: goto L_0x02a1;
                case 4: goto L_0x027a;
                case 5: goto L_0x025e;
                case 6: goto L_0x0269;
                case 7: goto L_0x025e;
                default: goto L_0x025d;
            }
        L_0x025d:
            r11 = 1
        L_0x025e:
            if (r11 == 0) goto L_0x0263
            r7.remove(r2)
        L_0x0263:
            java.lang.String r0 = "data"
            r8.putParcelableArrayListExtra(r0, r7)
            return r8
        L_0x0269:
            java.lang.String r4 = "im_protocol"
            java.lang.String r0 = r1.getAsString(r3)
            r8.putExtra(r4, r0)
            java.lang.String r3 = "im_handle"
            java.lang.String r0 = r1.getAsString(r5)
            goto L_0x0302
        L_0x027a:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r0 = r1.getAsString(r5)
            r6.append(r0)
            java.lang.String r0 = r1.getAsString(r3)
            if (r0 == 0) goto L_0x0291
            r6.append(r9)
            r6.append(r0)
        L_0x0291:
            java.lang.String r3 = "company"
            java.lang.String r0 = r6.toString()
            r8.putExtra(r3, r0)
            java.lang.String r3 = "job_title"
            java.lang.String r0 = r1.getAsString(r4)
            goto L_0x0302
        L_0x02a1:
            java.lang.String r3 = "phone"
            java.lang.String r0 = r1.getAsString(r5)
            r8.putExtra(r3, r0)
            java.lang.String r3 = "phone_type"
            goto L_0x02fe
        L_0x02ad:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = r1.getAsString(r4)
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "data7"
            java.lang.String r0 = r1.getAsString(r0)
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "data8"
            java.lang.String r0 = r1.getAsString(r0)
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            java.lang.String r0 = "data9"
            java.lang.String r0 = r1.getAsString(r0)
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "data10"
            java.lang.String r0 = r1.getAsString(r0)
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r3)
            java.lang.String r0 = "postal"
            r8.putExtra(r0, r3)
            java.lang.String r3 = "postal_type"
            goto L_0x02fe
        L_0x02f3:
            java.lang.String r3 = "email"
            java.lang.String r0 = r1.getAsString(r5)
            r8.putExtra(r3, r0)
            java.lang.String r3 = "email_type"
        L_0x02fe:
            java.lang.String r0 = r1.getAsString(r6)
        L_0x0302:
            r8.putExtra(r3, r0)
            goto L_0x025d
        L_0x0307:
            java.lang.String r0 = "vnd.android.cursor.item/nickname"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0258
            r10 = 7
            goto L_0x0258
        L_0x0312:
            java.lang.String r0 = "vnd.android.cursor.item/im"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0258
            r10 = 6
            goto L_0x0258
        L_0x031d:
            java.lang.String r0 = "vnd.android.cursor.item/photo"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0258
            r10 = 5
            goto L_0x0258
        L_0x0328:
            java.lang.String r0 = "vnd.android.cursor.item/organization"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0258
            r10 = 4
            goto L_0x0258
        L_0x0333:
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0258
            r10 = 3
            goto L_0x0258
        L_0x033e:
            java.lang.String r0 = "vnd.android.cursor.item/postal-address_v2"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0258
            r10 = 2
            goto L_0x0258
        L_0x0349:
            java.lang.String r0 = "vnd.android.cursor.item/contact_event"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0258
            r10 = 1
            goto L_0x0258
        L_0x0354:
            java.lang.String r0 = "vnd.android.cursor.item/email_v2"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0258
            r10 = 0
            goto L_0x0258
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass700.A00(android.app.Activity, android.graphics.Bitmap, X.73C, boolean):android.content.Intent");
    }

    public void A01(Context context, UserJid userJid, Integer num, String str, String str2, String str3) {
        Intent A062;
        UserJid userJid2 = userJid;
        AnonymousClass1E7 A0H = this.A02.A0H(userJid);
        if (A0H.A0D()) {
            ((C132176mK) this.A0F.get()).A00 = C17880vN.A0h();
        }
        AnonymousClass10I r1 = this.A0D;
        C108955ca.A1R(r1, this, userJid, 33);
        Context context2 = context;
        if (A0H.A0u || TextUtils.isEmpty(str)) {
            if (!A0H.A0B() && !A0H.A0z && !A0H.A0u) {
                C108955ca.A1R(r1, this, userJid, 34);
            }
            String str4 = str2;
            if (str2 != null) {
                A062 = this.A08.A1z(context2, userJid2, str4, 0, true, true, true);
            } else {
                A062 = AnonymousClass3MY.A06(context, this.A08, userJid);
            }
            C60442o2.A00(A062, this.A06, "ShareContactUtil");
            if (num != null) {
                A062.putExtra("bot_metrics_entrypoint", C196839vj.A01(num));
            }
            String str5 = str3;
            if (str3 != null) {
                A062.putExtra("bot_metrics_destination_id", str5);
            }
        } else {
            A062 = C17880vN.A0A().setClassName(context.getPackageName(), "com.whatsapp.conversation.conversationrow.ContactSyncActivity").putExtra("user_jid", C22971Dz.A06(userJid)).addFlags(335544320);
        }
        context.startActivity(A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        if (r12 != null) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.String r23, java.lang.String r24, java.util.ArrayList r25, java.util.List r26) {
        /*
            r22 = this;
            r9 = r22
            X.0ve r8 = r9.A0C
            r1 = 449(0x1c1, float:6.29E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x0031
            r11 = r25
            int r1 = r11.size()
            r10 = r26
            int r0 = r10.size()
            if (r1 == r0) goto L_0x0032
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sharecontactutil/phones_jids_list_size_mismatch: "
            X.C17890vO.A14(r0, r1, r11)
            java.lang.String r0 = ", "
            X.C17890vO.A15(r0, r1, r10)
            java.lang.String r0 = r1.toString()
        L_0x002e:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0031:
            return
        L_0x0032:
            X.11S r0 = r9.A09
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "sharecontactutil/on-activity-result/companion should not be adding contacts"
            goto L_0x002e
        L_0x003d:
            X.00H r0 = r9.A0G
            boolean r0 = X.C72463Mc.A1W(r0)
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = "sharecontactutil/on-activity-result/access to contacts denied"
            goto L_0x002e
        L_0x0048:
            r15 = 0
            r7 = 0
            r14 = 0
        L_0x004b:
            int r0 = r11.size()
            r6 = 1
            if (r7 >= r0) goto L_0x010b
            java.lang.String r5 = X.C108945cZ.A1H(r11, r7)
            X.1BI r4 = X.C108945cZ.A0i(r10, r7)
            if (r4 == 0) goto L_0x0106
            X.1M9 r0 = r9.A02
            X.1M2 r0 = r0.A04
            java.util.ArrayList r3 = r0.A0N(r4)
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0106
            java.util.Iterator r13 = r3.iterator()
            r12 = 0
        L_0x006f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00fc
            X.1E7 r2 = X.C17880vN.A0O(r13)
            X.1BI r0 = r2.A0J
            if (r0 == 0) goto L_0x006f
            X.2lf r0 = r2.A0H
            if (r0 != 0) goto L_0x006f
            X.1BI r0 = r2.A0J
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = r4.user
            boolean r0 = android.telephony.PhoneNumberUtils.compare(r5, r0)
            if (r0 == 0) goto L_0x00e8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sharecontactutil/unknown_contact_update:"
            r1.append(r0)
            X.1BI r0 = r2.A0J
            X.C17900vP.A0b(r0, r1)
            X.11C r0 = r9.A0B
            X.11B r16 = r0.A0O()
            android.net.Uri r17 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r0 = "raw_contact_id"
            r1[r15] = r0
            java.lang.String[] r20 = X.C17880vN.A1Z()
            r20[r15] = r5
            java.lang.String r12 = "com.whatsapp"
            r20[r6] = r12
            r21 = 0
            java.lang.String r19 = "data1 =? AND account_type =?"
            r18 = r1
            android.database.Cursor r12 = r16.A03(r17, r18, r19, r20, r21)
            if (r12 == 0) goto L_0x00ce
            boolean r1 = r12.moveToFirst()     // Catch:{ all -> 0x0130 }
            if (r1 == 0) goto L_0x00ce
            java.lang.String r0 = X.C17890vO.A0S(r12, r0)     // Catch:{ all -> 0x0130 }
            goto L_0x00d2
        L_0x00ce:
            r0 = r24
            if (r12 == 0) goto L_0x00d5
        L_0x00d2:
            r12.close()
        L_0x00d5:
            long r0 = java.lang.Long.parseLong(r0)
            X.2lf r12 = new X.2lf
            r12.<init>(r0, r5)
            r2.A0H = r12
            r0 = r23
            r2.A0R = r0
            r12 = 1
            r2.A10 = r6
            goto L_0x006f
        L_0x00e8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sharecontactutil/false_match: "
            r1.append(r0)
            X.1BI r0 = r2.A0J
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x006f
        L_0x00fc:
            if (r12 == 0) goto L_0x0107
            X.10I r1 = r9.A0D
            r0 = 32
            X.C108955ca.A1R(r1, r9, r3, r0)
            goto L_0x0107
        L_0x0106:
            r14 = 1
        L_0x0107:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x010b:
            if (r14 == 0) goto L_0x0031
            java.lang.String r0 = "sharecontactutil/new_number/need_delta_sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2R1 r2 = X.AnonymousClass2R1.A0B
            r0 = 0
            X.2sh r1 = new X.2sh
            r1.<init>(r2, r0)
            X.2qq r0 = X.C62132qq.A0C
            r1.A00 = r0
            boolean r0 = X.AnonymousClass3MX.A1W(r8)
            if (r0 == 0) goto L_0x0126
            r1.A03 = r6
        L_0x0126:
            X.2re r1 = r1.A02()
            X.12E r0 = r9.A0A
            X.AnonymousClass12E.A00(r0, r1, r6)
            return
        L_0x0130:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0135 }
            throw r1
        L_0x0135:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass700.A03(java.lang.String, java.lang.String, java.util.ArrayList, java.util.List):void");
    }

    public AnonymousClass700(AnonymousClass1KB r2, AnonymousClass11S r3, C26811To r4, AnonymousClass1M9 r5, C24671Lf r6, C24921Me r7, C678831f r8, AnonymousClass12E r9, AnonymousClass11C r10, AnonymousClass11P r11, C30801eX r12, C18030ve r13, AnonymousClass1LU r14, AnonymousClass10I r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18) {
        this.A06 = r11;
        this.A0C = r13;
        this.A00 = r2;
        this.A09 = r3;
        this.A08 = r14;
        this.A0D = r15;
        this.A01 = r4;
        this.A0F = r17;
        this.A02 = r5;
        this.A0B = r10;
        this.A04 = r7;
        this.A03 = r6;
        this.A05 = r8;
        this.A0A = r9;
        this.A0G = r16;
        this.A0E = r18;
        this.A07 = r12;
    }
}
