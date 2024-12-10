package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: X.6MW  reason: invalid class name */
public class AnonymousClass6MW extends A34 {
    public ProgressDialog A00;
    public final Bundle A01;
    public final C132216mP A02;
    public final AnonymousClass18O A03;
    public final AnonymousClass181 A04;
    public final C18000vb A05;
    public final C20284AEs A06;
    public final AW0 A07;
    public final AnonymousClass1D9 A08;
    public final AnonymousClass1LU A09;
    public final AnonymousClass1QJ A0A;
    public final AnonymousClass1QE A0B = AnonymousClass1QE.A00("PaymentSupportTask", "payment-settings", "COMMON");
    public final String A0C;
    public final WeakReference A0D;

    public void A0F() {
        Context A0F = C108945cZ.A0F(this.A0D);
        if (A0F != null) {
            if (this.A00 == null) {
                ProgressDialog progressDialog = new ProgressDialog(A0F);
                this.A00 = progressDialog;
                progressDialog.setOnCancelListener(new C1411674o(this, 8));
                this.A00.setCanceledOnTouchOutside(false);
            }
            if (!this.A00.isShowing()) {
                this.A00.setMessage(A0F.getString(2131891192));
                this.A00.setIndeterminate(true);
                this.A00.show();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x017e A[Catch:{ all -> 0x01cd, all -> 0x01d2, all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018e A[Catch:{ all -> 0x01cd, all -> 0x01d2, all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c4 A[Catch:{ all -> 0x01cd, all -> 0x01d2, all -> 0x01d7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r30) {
        /*
            r29 = this;
            r2 = r29
            java.lang.ref.WeakReference r0 = r2.A0D
            java.lang.Object r0 = r0.get()
            r17 = 0
            if (r0 == 0) goto L_0x01f3
            org.json.JSONObject r5 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r9 = "platform"
            java.lang.String r0 = "android"
            r5.put(r9, r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            X.1QJ r1 = r2.A0A     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            X.2tK r0 = r1.A02()     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            if (r0 == 0) goto L_0x00d8
            X.2tK r0 = r1.A02()     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r1 = r0.A03     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
        L_0x0025:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "country"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
        L_0x0030:
            X.0vb r0 = r2.A05     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r0 = r0.A05()     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r8 = "lang"
            r5.put(r8, r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r1 = "context"
            java.lang.String r0 = r2.A0C     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r4 = "version"
            java.lang.String r0 = "v2"
            org.json.JSONObject r3 = X.C108965cb.A0x(r0, r4, r5)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            X.AW0 r6 = r2.A07     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            if (r6 == 0) goto L_0x0093
            java.lang.String r0 = r6.A0J     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            if (r0 != 0) goto L_0x005d
            java.lang.String r1 = r6.A0J     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r0 = "error_code"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
        L_0x005d:
            int r0 = r6.A03     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r1 = X.C20128A8n.A03(r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            int r1 = r6.A03     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            int r0 = r6.A02     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r1 = X.C20128A8n.A04(r1, r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "transaction_status"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
        L_0x007b:
            X.AEs r1 = r2.A06     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            if (r1 == 0) goto L_0x008e
            java.lang.String r0 = r1.A0B     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            if (r0 != 0) goto L_0x008e
            java.lang.String r1 = r1.A0B     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r0 = "bank_name"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
        L_0x008e:
            java.lang.String r0 = "transaction_info"
            r5.put(r0, r3)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
        L_0x0093:
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            r3.<init>()     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r0 = "https"
            r3.scheme(r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r0 = "faq.whatsapp.com"
            r3.authority(r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r0 = "inappsupport"
            r3.appendPath(r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r0 = "payments"
            r3.appendPath(r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            X.1D9 r1 = r2.A08     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            android.net.Uri r0 = r3.build()     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r20 = r0.toString()     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            java.lang.String r21 = r5.toString()     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            r0 = 14
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            r10 = 0
            r16 = 1
            r24 = r17
            r25 = r17
            r28 = r10
            r22 = r17
            r26 = r16
            r27 = r10
            r23 = r17
            r18 = r1
            X.AUZ r3 = X.AnonymousClass1D9.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            goto L_0x00db
        L_0x00d8:
            r1 = 0
            goto L_0x0025
        L_0x00db:
            X.181 r5 = r2.A04     // Catch:{ all -> 0x01d7 }
            r1 = 20
            r0 = r17
            X.9Hb r1 = X.C108955ca.A0N(r5, r3, r0, r1)     // Catch:{ all -> 0x01d7 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x01d7 }
            r0.<init>(r1)     // Catch:{ all -> 0x01d7 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x01d7 }
            r5.<init>(r0)     // Catch:{ all -> 0x01d7 }
            r0 = 2048(0x800, float:2.87E-42)
            char[] r7 = new char[r0]     // Catch:{ all -> 0x01cd }
            int r6 = r5.read(r7, r10, r0)     // Catch:{ all -> 0x01cd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01cd }
        L_0x00fb:
            r0 = -1
            if (r6 == r0) goto L_0x0108
            r1.append(r7, r10, r6)     // Catch:{ all -> 0x01cd }
            r0 = 2048(0x800, float:2.87E-42)
            int r6 = r5.read(r7, r10, r0)     // Catch:{ all -> 0x01cd }
            goto L_0x00fb
        L_0x0108:
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x01cd }
            X.1QE r6 = r2.A0B     // Catch:{ all -> 0x01cd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = "result="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r10, r1)     // Catch:{ all -> 0x01cd }
            r6.A07(r0)     // Catch:{ all -> 0x01cd }
            r7 = 0
            if (r10 != 0) goto L_0x0121
            r0 = r7
            goto L_0x01c6
        L_0x0121:
            org.json.JSONObject r10 = X.C17880vN.A16(r10)     // Catch:{ all -> 0x01cd }
            boolean r0 = r10.has(r4)     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0173
            int r12 = r10.getInt(r4)     // Catch:{ all -> 0x01cd }
        L_0x012f:
            java.lang.String r1 = "payment_faqs"
            boolean r0 = r10.has(r1)     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0175
            org.json.JSONArray r15 = r10.getJSONArray(r1)     // Catch:{ all -> 0x01cd }
            int r0 = r15.length()     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0175
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x01cd }
            r14 = 0
        L_0x0146:
            int r0 = r15.length()     // Catch:{ all -> 0x01cd }
            if (r14 >= r0) goto L_0x0176
            org.json.JSONObject r1 = r15.getJSONObject(r14)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = "title"
            java.lang.String r13 = r1.getString(r0)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = "description"
            java.lang.String r11 = r1.getString(r0)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = "url"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = "id"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ all -> 0x01cd }
            X.77D r0 = new X.77D     // Catch:{ all -> 0x01cd }
            r0.<init>(r13, r11, r4, r1)     // Catch:{ all -> 0x01cd }
            r6.add(r0)     // Catch:{ all -> 0x01cd }
            int r14 = r14 + 1
            goto L_0x0146
        L_0x0173:
            r12 = 1
            goto L_0x012f
        L_0x0175:
            r6 = r7
        L_0x0176:
            java.lang.String r1 = "topics"
            boolean r0 = r10.has(r1)     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x01c4
            org.json.JSONArray r0 = r10.getJSONArray(r1)     // Catch:{ all -> 0x01cd }
            java.util.ArrayList r4 = r2.A00(r0, r12)     // Catch:{ all -> 0x01cd }
        L_0x0186:
            java.lang.String r1 = "mapped_faq"
            boolean r0 = r10.has(r1)     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x01be
            org.json.JSONObject r7 = r10.getJSONObject(r1)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = "title"
            java.lang.String r10 = r7.optString(r0)     // Catch:{ all -> 0x01cd }
            r7.optString(r9)     // Catch:{ all -> 0x01cd }
            r7.optString(r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = "url"
            java.lang.String r11 = r7.optString(r0)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = "id"
            java.lang.String r12 = r7.optString(r0)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = "description"
            java.lang.String r13 = r7.optString(r0)     // Catch:{ all -> 0x01cd }
            java.lang.String r1 = "open_flow"
            r0 = r16
            boolean r14 = r7.optBoolean(r1, r0)     // Catch:{ all -> 0x01cd }
            X.6iM r7 = new X.6iM     // Catch:{ all -> 0x01cd }
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01cd }
        L_0x01be:
            X.6gQ r0 = new X.6gQ     // Catch:{ all -> 0x01cd }
            r0.<init>(r7, r6, r4)     // Catch:{ all -> 0x01cd }
            goto L_0x01c6
        L_0x01c4:
            r4 = r7
            goto L_0x0186
        L_0x01c6:
            r5.close()     // Catch:{ all -> 0x01d7 }
            r3.close()     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
            return r0
        L_0x01cd:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x01d2 }
            goto L_0x01d6
        L_0x01d2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01d7 }
        L_0x01d6:
            throw r1     // Catch:{ all -> 0x01d7 }
        L_0x01d7:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x01dc }
            goto L_0x01e0
        L_0x01dc:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
        L_0x01e0:
            throw r1     // Catch:{ JSONException -> 0x01e3, IOException -> 0x01e1 }
        L_0x01e1:
            r3 = move-exception
            goto L_0x01e4
        L_0x01e3:
            r3 = move-exception
        L_0x01e4:
            X.1QE r2 = r2.A0B
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "error e="
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r3)
            r2.A0A(r0, r3)
        L_0x01f3:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MW.A0G(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r15) {
        /*
            r14 = this;
            X.6gQ r15 = (X.C128626gQ) r15
            java.lang.ref.WeakReference r0 = r14.A0D
            X.1FU r8 = X.C108945cZ.A0Z(r0)
            if (r8 == 0) goto L_0x0062
            if (r15 == 0) goto L_0x00ba
            X.6iM r4 = r15.A00
            r3 = 48
            if (r4 == 0) goto L_0x0063
            android.os.Bundle r7 = r14.A01
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.type"
            r0 = 3
            r7.putInt(r1, r0)
            java.lang.String r6 = r4.A02
            java.lang.String r2 = r4.A00
            java.lang.String r0 = r4.A03
            java.lang.String r5 = r4.A01
            boolean r4 = r4.A04
            java.lang.String r1 = r14.A0C
            android.content.Intent r2 = X.C109005cf.A08(r8, r6, r2, r0)
            java.lang.String r0 = "article_id"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "show_contact_support_button"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "contact_us_context"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "describe_problem_fields"
            r2.putExtra(r0, r7)
            if (r4 == 0) goto L_0x0047
            java.lang.String r1 = "payments_support_topics"
            java.util.ArrayList r0 = r15.A02
            r2.putParcelableArrayListExtra(r1, r0)
        L_0x0047:
            r8.CNh(r2, r3)
            r1 = 2130772058(0x7f01005a, float:1.7147224E38)
            r0 = 2130772061(0x7f01005d, float:1.714723E38)
            r8.overridePendingTransition(r1, r0)
        L_0x0053:
            android.app.ProgressDialog r0 = r14.A00
            if (r0 == 0) goto L_0x0062
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0062
            android.app.ProgressDialog r0 = r14.A00
            r0.cancel()
        L_0x0062:
            return
        L_0x0063:
            java.util.ArrayList r7 = r15.A01
            if (r7 == 0) goto L_0x00a7
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00a7
            java.lang.String r6 = r14.A0C
            android.os.Bundle r5 = r14.A01
            java.util.ArrayList r4 = r15.A02
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.from"
            r2.putExtra(r0, r6)
            java.lang.String r1 = "com.whatsapp.support.faq.SearchFAQ.count"
            int r0 = r7.size()
            r2.putExtra(r1, r0)
            java.lang.String r0 = "describe_problem_bundle"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "payments_support_faqs"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "payments_support_topics"
            r2.putExtra(r0, r4)
            java.lang.String r1 = "com.whatsapp.support.faq.SearchFAQ.usePaymentsFlow"
            r0 = 1
            r2.putExtra(r1, r0)
        L_0x00a3:
            r8.CNh(r2, r3)
            goto L_0x0053
        L_0x00a7:
            java.util.ArrayList r2 = r15.A02
            if (r2 == 0) goto L_0x00ba
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00ba
            X.1LU r1 = r14.A09
            android.os.Bundle r0 = r14.A01
            android.content.Intent r2 = r1.A1t(r8, r0, r2)
            goto L_0x00a3
        L_0x00ba:
            X.18O r1 = r14.A03
            X.18R r0 = X.AnonymousClass18O.A0S
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x00cb
            r0 = 2131893832(0x7f121e48, float:1.9422452E38)
            r8.BhQ(r0)
            goto L_0x0053
        L_0x00cb:
            X.6mP r7 = r14.A02
            java.lang.String r11 = r14.A0C
            java.lang.Integer r10 = X.C17880vN.A0j()
            r12 = 0
            android.os.Bundle r9 = r14.A01
            r13 = r12
            android.content.Intent r1 = r7.A00(r8, r9, r10, r11, r12, r13)
            r1.putExtras(r9)
            r0 = 48
            r8.CNh(r1, r0)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MW.A0H(java.lang.Object):void");
    }

    public AnonymousClass6MW(Bundle bundle, AnonymousClass1FU r5, C132216mP r6, AnonymousClass18O r7, AnonymousClass181 r8, C18000vb r9, C20284AEs aEs, AW0 aw0, AnonymousClass1D9 r12, AnonymousClass1LU r13, AnonymousClass1QJ r14, String str) {
        this.A0D = AnonymousClass3MW.A0z(r5);
        this.A09 = r13;
        this.A04 = r8;
        this.A03 = r7;
        this.A02 = r6;
        this.A05 = r9;
        this.A08 = r12;
        this.A0A = r14;
        this.A0C = str;
        this.A06 = aEs;
        this.A07 = aw0;
        this.A01 = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r2.getBoolean("children_skippable") == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r15 == 2) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList A00(org.json.JSONArray r14, int r15) {
        /*
            r13 = this;
            int r0 = r14.length()
            r10 = 0
            if (r0 != 0) goto L_0x0008
            return r10
        L_0x0008:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r3 = 0
        L_0x000d:
            int r0 = r14.length()
            if (r3 >= r0) goto L_0x00a4
            org.json.JSONObject r2 = r14.getJSONObject(r3)
            java.lang.String r0 = "id"
            java.lang.String r7 = r2.getString(r0)
            java.lang.String r0 = "title"
            java.lang.String r8 = r2.getString(r0)
            java.lang.String r1 = "children"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x00a2
            org.json.JSONArray r0 = r2.getJSONArray(r1)
            java.util.ArrayList r11 = r13.A00(r0, r15)
        L_0x0033:
            java.lang.String r1 = "children_skippable"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x0042
            boolean r0 = r2.getBoolean(r1)
            r12 = 1
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r12 = 0
        L_0x0043:
            r5 = 2
            if (r15 != r5) goto L_0x008b
            java.lang.String r1 = "description"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r9 = r2.getString(r1)
        L_0x0052:
            java.lang.String r1 = "chat_support"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x008f
            org.json.JSONObject r6 = r2.getJSONObject(r1)
            java.lang.String r0 = "auth_required"
            boolean r5 = r6.getBoolean(r0)
            java.lang.String r1 = "required_data"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x0091
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            org.json.JSONArray r6 = r6.getJSONArray(r1)
            r1 = 0
        L_0x0075:
            int r0 = r6.length()
            if (r1 >= r0) goto L_0x0085
            java.lang.String r0 = r6.getString(r1)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0085:
            X.4cD r6 = new X.4cD
            r6.<init>(r2, r5)
            goto L_0x0096
        L_0x008b:
            r9 = r10
            if (r15 != r5) goto L_0x008f
            goto L_0x0052
        L_0x008f:
            r6 = r10
            goto L_0x0096
        L_0x0091:
            X.4cD r6 = new X.4cD
            r6.<init>(r10, r5)
        L_0x0096:
            X.4cU r5 = new X.4cU
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.add(r5)
            int r3 = r3 + 1
            goto L_0x000d
        L_0x00a2:
            r11 = r10
            goto L_0x0033
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MW.A00(org.json.JSONArray, int):java.util.ArrayList");
    }
}
