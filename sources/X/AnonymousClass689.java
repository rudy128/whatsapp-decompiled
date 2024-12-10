package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.689  reason: invalid class name */
public class AnonymousClass689 extends C27091Ur {
    public long A00 = -1;
    public final AnonymousClass1L9 A01;

    public AnonymousClass689(AnonymousClass1L9 r11, AnonymousClass1RB r12, AnonymousClass11S r13, AnonymousClass11C r14, AnonymousClass11P r15, AnonymousClass118 r16, C19830z4 r17, C18030ve r18) {
        super(r12, r13, r14, r15, r16, r17, r18);
        this.A01 = r11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cb, code lost:
        if (r7 >= 702000000) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(android.content.Context r18, java.lang.String r19, java.lang.String r20, double r21, double r23) {
        /*
            r17 = this;
            java.lang.String r10 = "android.intent.action.VIEW"
            r3 = r23
            r5 = r21
            r12 = r19
            r13 = r20
            r11 = r18
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ ActivityNotFoundException -> 0x0090 }
            r2.append(r5)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            java.lang.String r1 = ","
            r2.append(r1)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            r2.append(r3)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            java.lang.String r0 = "?q="
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            if (r0 != 0) goto L_0x003f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)     // Catch:{ UnsupportedEncodingException -> 0x0039 }
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ UnsupportedEncodingException -> 0x0039 }
            java.lang.String r0 = java.net.URLEncoder.encode(r13, r0)     // Catch:{ UnsupportedEncodingException -> 0x0039 }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0039 }
            java.lang.String r2 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x0039 }
            goto L_0x0050
        L_0x0039:
            java.lang.String r0 = "app/failed-url-encode"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            goto L_0x0050
        L_0x003f:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r2)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            r0.append(r5)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            r0.append(r1)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            r0.append(r3)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            java.lang.String r2 = r0.toString()     // Catch:{ ActivityNotFoundException -> 0x0090 }
        L_0x0050:
            if (r19 == 0) goto L_0x0074
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)     // Catch:{ UnsupportedEncodingException -> 0x006e }
            java.lang.String r0 = "("
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x006e }
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ UnsupportedEncodingException -> 0x006e }
            java.lang.String r0 = java.net.URLEncoder.encode(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x006e }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x006e }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x006e }
            java.lang.String r2 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x006e }
            goto L_0x0074
        L_0x006e:
            r1 = move-exception
            java.lang.String r0 = "LocationUtils/failed-url-encode"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ ActivityNotFoundException -> 0x0090 }
        L_0x0074:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ ActivityNotFoundException -> 0x0090 }
            r1.<init>()     // Catch:{ ActivityNotFoundException -> 0x0090 }
            java.lang.String r0 = "geo"
            android.net.Uri$Builder r0 = r1.scheme(r0)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            android.net.Uri$Builder r0 = r0.encodedOpaquePart(r2)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            android.net.Uri r1 = r0.build()     // Catch:{ ActivityNotFoundException -> 0x0090 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0090 }
            r0.<init>(r10, r1)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            r11.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0090 }
            return
        L_0x0090:
            r14 = r17
            X.1L9 r9 = r14.A01
            long r7 = r14.A00
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ae
            java.lang.String r2 = "com.google.android.apps.maps"
            long r7 = X.C24211Jh.A00(r11, r2)
            r14.A00 = r7
            r15 = -1
            int r2 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x00ae
            r14.A00 = r0
            r7 = 0
        L_0x00ae:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.DecimalFormatSymbols r0 = java.text.DecimalFormatSymbols.getInstance(r0)
            char r1 = r0.getDecimalSeparator()
            r0 = 44
            if (r1 != r0) goto L_0x00cd
            r1 = 700000000(0x29b92700, double:3.45845952E-315)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00cd
            r1 = 702000000(0x29d7ab80, double:3.468340834E-315)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r14 = 1
            if (r0 < 0) goto L_0x00ce
        L_0x00cd:
            r14 = 0
        L_0x00ce:
            java.lang.String r7 = "maps"
            java.lang.String r2 = "maps.google.com"
            java.lang.String r1 = "https"
            java.lang.String r15 = ","
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.scheme(r1)
            android.net.Uri$Builder r0 = r0.authority(r2)
            android.net.Uri$Builder r8 = r0.path(r7)
            if (r14 == 0) goto L_0x0118
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "q=loc:("
            r1.append(r0)
            r1.append(r5)
            r1.append(r15)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            android.net.Uri$Builder r2 = r8.encodedQuery(r0)
            java.lang.String r1 = "z"
            java.lang.String r0 = "16"
            android.net.Uri$Builder r8 = r2.appendQueryParameter(r1, r0)
        L_0x010b:
            android.net.Uri r1 = r8.build()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r10, r1)
            r9.A08(r11, r0)
            return
        L_0x0118:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            java.lang.String r14 = ")"
            java.lang.String r7 = "("
            java.lang.String r0 = ""
            java.lang.String r2 = "q"
            if (r1 != 0) goto L_0x0153
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r13)
            if (r19 == 0) goto L_0x0134
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r7, r12, r14)
            java.lang.String r0 = r0.toString()
        L_0x0134:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.net.Uri$Builder r2 = r8.appendQueryParameter(r2, r0)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            r0.append(r5)
            r0.append(r15)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "sll"
            r2.appendQueryParameter(r0, r1)
            goto L_0x010b
        L_0x0153:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r13 = "loc:"
            r1.append(r13)
            r1.append(r5)
            r1.append(r15)
            r1.append(r3)
            if (r19 == 0) goto L_0x016f
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r7, r12, r14)
            java.lang.String r0 = r0.toString()
        L_0x016f:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r8.appendQueryParameter(r2, r0)
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass689.A09(android.content.Context, java.lang.String, java.lang.String, double, double):void");
    }

    public void A07(Activity activity, AnonymousClass1BI r8) {
        String str;
        boolean A06 = A06(activity);
        Context applicationContext = activity.getApplicationContext();
        String rawString = r8.getRawString();
        C18070vi.A0d(applicationContext, 0);
        Intent A07 = AnonymousClass3MZ.A07(rawString, 1);
        A07.putExtra("jid", rawString);
        A07.putExtra("mode", 3);
        String packageName = applicationContext.getPackageName();
        if (A06) {
            str = "com.whatsapp.location.LocationPicker2";
        } else {
            str = "com.whatsapp.location.LocationPicker";
        }
        A07.setClassName(packageName, str);
        activity.startActivityForResult(A07, 100);
    }

    public void A08(Context context, AnonymousClass1BI r7, UserJid userJid) {
        String str;
        boolean A06 = A06(context);
        String rawString = r7.getRawString();
        String A062 = C22971Dz.A06(userJid);
        Intent A0A = C17880vN.A0A();
        A0A.putExtra("jid", rawString);
        A0A.putExtra("target", A062);
        String packageName = context.getPackageName();
        if (A06) {
            str = "com.whatsapp.location.GroupChatLiveLocationsActivity2";
        } else {
            str = "com.whatsapp.location.GroupChatLiveLocationsActivity";
        }
        A0A.setClassName(packageName, str);
        context.startActivity(A0A);
    }
}
