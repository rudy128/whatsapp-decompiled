package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;

public abstract class A9B {
    public static String A00 = "";

    public static int A00(String str, String str2) {
        int length;
        int length2;
        if (str == null || str2 == null || (length = str.length()) < 6 || (length2 = str2.length()) < 6) {
            return -1;
        }
        int i = length - 6;
        int i2 = length2 - 6;
        int i3 = 0;
        int i4 = 0;
        do {
            if (str.charAt(i + i3) != str2.charAt(i2 + i3)) {
                i4++;
            }
            i3++;
        } while (i3 < 6);
        return i4;
    }

    public static SpannableStringBuilder A04(Object obj, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        for (StyleSpan styleSpan : (StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(styleSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(styleSpan);
            int i3 = i;
            if (((URLSpan[]) spannableStringBuilder.getSpans(spanStart, spanEnd, URLSpan.class)).length > 0) {
                i3 = i2;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), spanStart, spanEnd, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r4.A05 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C010105w A06(X.AnonymousClass1L9 r21, X.AnonymousClass1FU r22, X.AnonymousClass1KB r23, X.C132216mP r24, X.C18000vb r25, X.AnonymousClass1MB r26, X.ADM r27, java.lang.Runnable r28, java.lang.String r29, java.lang.String r30) {
        /*
            r3 = 0
            r4 = r27
            if (r27 == 0) goto L_0x00bc
            java.lang.String r0 = r4.A04
        L_0x0007:
            int r7 = X.C83884Ha.A00(r0)
            r15 = 0
            if (r27 == 0) goto L_0x0013
            boolean r0 = r4.A05
            r8 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r8 = 0
        L_0x0014:
            r9 = r28
            boolean r6 = X.AnonymousClass000.A1W(r9)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegistrationUtils/createSMBUsersIsBannedViewPolicyDialog/ban cancelable="
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r6)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r5 = r25
            r13 = r29
            r14 = r30
            java.lang.String r2 = A0G(r5, r13, r14)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)
            java.lang.String r0 = "\n\n"
            r1.append(r0)
            r10 = r22
            X.C17880vN.A1A(r10, r1, r7)
            android.text.SpannableString r2 = X.AnonymousClass8BY.A0B(r1, r2)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r10)
            r0 = 2131626075(0x7f0e085b, float:1.8879376E38)
            android.view.View r1 = r1.inflate(r0, r3)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r10)
            r3.A0S(r2)
            r3.A0c(r1)
            r3.A0T(r6)
            r0 = 2131428581(0x7f0b04e5, float:1.847881E38)
            android.widget.TextView r6 = X.AnonymousClass3MW.A0J(r1, r0)
            r0 = 2131428579(0x7f0b04e3, float:1.8478806E38)
            android.widget.TextView r2 = X.AnonymousClass3MW.A0J(r1, r0)
            r0 = 2131428580(0x7f0b04e4, float:1.8478808E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r1, r0)
            r6.setVisibility(r15)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            r6.setText(r0)
            r2.setVisibility(r15)
            r0 = 2131895061(0x7f122315, float:1.9424944E38)
            r2.setText(r0)
            r1.setVisibility(r15)
            r0 = 2131895062(0x7f122316, float:1.9424946E38)
            if (r8 == 0) goto L_0x008d
            r0 = 2131898818(0x7f1231c2, float:1.9432564E38)
        L_0x008d:
            r1.setText(r0)
            r0 = 25
            X.C90024dP.A00(r6, r10, r9, r0)
            r22 = 6
            X.78H r0 = new X.78H
            r19 = r21
            r21 = r23
            r18 = r5
            r20 = r10
            r17 = r4
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.setOnClickListener(r0)
            X.AFL r8 = new X.AFL
            r11 = r24
            r12 = r26
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1.setOnClickListener(r8)
            X.05w r0 = r3.create()
            return r0
        L_0x00bc:
            r0 = r3
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9B.A06(X.1L9, X.1FU, X.1KB, X.6mP, X.0vb, X.1MB, X.ADM, java.lang.Runnable, java.lang.String, java.lang.String):X.05w");
    }

    public static C010105w A08(AnonymousClass1FU r11, C132216mP r12, C18000vb r13, AnonymousClass1MB r14, Runnable runnable, String str, String str2) {
        boolean A1W = AnonymousClass000.A1W(runnable);
        Log.w(C17900vP.A0D("RegistrationUtils/createUserIsBannedDialog/ban cancelable=", AnonymousClass000.A10(), A1W));
        String str3 = str;
        String str4 = str2;
        String A0G = A0G(r13, str3, str4);
        StringBuilder A11 = AnonymousClass000.A11(A0G);
        A11.append("\n\n");
        C17880vN.A1A(r11, A11, 2131895036);
        SpannableString A0B = AnonymousClass8BY.A0B(A11, A0G);
        C73203Rj A002 = AnonymousClass4a6.A00(r11);
        A002.A0S(A0B);
        A002.A0T(A1W);
        String string = r11.getString(2131898766);
        A002.A00.A0J(new C20153A9p(runnable, r11, 23), string);
        String string2 = r11.getString(2131895062);
        A002.A0L(new C20147A9j(r11, r12, r14, runnable, str3, str4), string2);
        return A002.create();
    }

    public static void A0M(Context context, Intent intent, C27301Vn r7, String str, String str2, String str3) {
        PendingIntent A002 = C1408573i.A00(context, 1, intent, 0);
        C1409673t A03 = C217217d.A03(context);
        A03.A0M = "critical_app_alerts@1";
        A03.A0F(str);
        A03.A09(System.currentTimeMillis());
        A03.A06(3);
        C17890vO.A0m(A03, str2, str3, true);
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
        notificationCompat$BigTextStyle.A07(str3);
        A03.A0B(notificationCompat$BigTextStyle);
        A03.A0A = A002;
        C17880vN.A1G(A03);
        r7.BkR(1, A03.A05());
    }

    public static long A02(String str, long j) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
                Log.w((Throwable) e);
            }
        }
        return j;
    }

    public static ProgressDialog A03(Context context, CharSequence charSequence) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        AnonymousClass8BX.A0x(progressDialog, charSequence);
        return progressDialog;
    }

    public static C010105w A05(Context context) {
        Log.i("RegistrationUtils/createVerificationCompleteDialog");
        if (AnonymousClass1L9.A00(context).isFinishing()) {
            return null;
        }
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0c(View.inflate(context, 2131625101, (ViewGroup) null));
        return A002.create();
    }

    public static C010105w A07(AnonymousClass1FU r5, C132216mP r6, AnonymousClass11E r7, AnonymousClass11C r8, C219217x r9, AnonymousClass1MB r10, AnonymousClass1LU r11, A98 a98, AnonymousClass10I r13) {
        Log.i("RegistrationUtils/createCannotConnectDialog");
        C73203Rj A002 = AnonymousClass4a6.A00(r5);
        C108955ca.A1D(r5, A002, 2131895032);
        A002.A0L(new C20150A9m(r5, r6, r7, r8, r9, r10, r11, a98, r13), r5.getString(2131888273));
        String string = r5.getString(2131898766);
        A002.A00.A0J(new C20152A9o(r5, 2), string);
        A002.A0G(new A9M(1));
        return A002.create();
    }

    public static C010105w A09(AnonymousClass1FU r10, C132216mP r11, AnonymousClass1MB r12, String str, String str2) {
        Log.w("RegistrationUtils/createUnderageAccountBannedDialog/underage-ban cancelable=");
        C73203Rj A002 = AnonymousClass4a6.A00(r10);
        A002.A0k(r10.getString(2131897300));
        C108955ca.A1D(r10, A002, 2131897299);
        A002.A0T(false);
        A002.A0L(new C20152A9o(r10, 4), r10.getString(2131898766));
        String string = r10.getString(2131894985);
        AnonymousClass1MB r5 = r12;
        A002.A00.A0K(new C20146A9i(r5, r11, r10, str, str2, 2), string);
        return A002.create();
    }

    public static String A0D(AnonymousClass1LA r3, String str, String str2) {
        String str3;
        String replaceAll = str2.replaceAll("\\D", "");
        try {
            str3 = r3.A03(Integer.parseInt(str), replaceAll);
        } catch (IOException e) {
            Log.e("RegistrationUtils/prettyPrintFromSim/number/trim/error", e);
            str3 = null;
        }
        if (str3 != null) {
            return A0H(str, replaceAll.substring(str.length()));
        }
        return replaceAll;
    }

    public static String A0F(C19830z4 r2, AnonymousClass19D r3) {
        if (r3 == null || r2 == null || !C18020vd.A05(C18040vf.A02, r3, 7440)) {
            return null;
        }
        return r2.A0a();
    }

    public static String A0H(String str, String str2) {
        String str3;
        if (str == null || str2 == null) {
            Log.e("RegistrationUtils/prettyPrintFullPhoneNumber/cc-or-phnum-is-null");
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("+");
        A10.append(str);
        String A1H = AnonymousClass001.A1H(" ", str2, A10);
        C42771yi A002 = C42771yi.A00();
        try {
            return A002.A0J(A002.A0H(C17900vP.A0H("+", str, str2).toString(), "ZZ"), AnonymousClass00R.A01);
        } catch (Exception e) {
            e = e;
            str3 = "RegistrationUtils/prettyPrintFullPhoneNumber/formatter-exception";
            Log.e(str3, e);
            return A1H;
        } catch (ExceptionInInitializerError e2) {
            e = e2;
            str3 = "RegistrationUtils/prettyPrintFullPhoneNumber/formatter-init-exception";
            Log.e(str3, e);
            return A1H;
        }
    }

    public static void A0K(Activity activity, C19830z4 r7, AnonymousClass11O r8, Runnable runnable, String str) {
        Log.i("RegistrationUtils/showLoginFailedDialog");
        C73203Rj A002 = AnonymousClass4a6.A00(activity);
        A002.A0T(false);
        A002.A0E(2131886461);
        A002.A0S(AnonymousClass6VI.A00(C17880vN.A0q(activity, r7.A0i(), AnonymousClass3MW.A1a(), 0, 2131886458)));
        C20152A9o.A00(A002, runnable, 1, 2131886460);
        A002.A0X(new C20144A9g(activity, r7, r8, runnable, str), 2131886459);
        A002.A0C();
    }

    public static void A0O(Context context, C27301Vn r10, int i) {
        Log.i("RegistrationUtils/notifyNotVerified");
        long currentTimeMillis = System.currentTimeMillis();
        String A0q = C17880vN.A0q(context, context.getString(2131899103), new Object[1], 0, 2131896236);
        String string = context.getString(2131896240);
        String string2 = context.getString(2131896238);
        Intent A07 = AnonymousClass8BR.A07(context, context.getClass());
        if (i != -1) {
            A07.putExtra("com.whatsapp.verifynumber.dialog", i);
        }
        A07.addFlags(536870912);
        PendingIntent A072 = C17880vN.A07(context, A07, 0);
        C1409673t A03 = C217217d.A03(context);
        A03.A0M = "critical_app_alerts@1";
        A03.A0F(A0q);
        A03.A09(currentTimeMillis);
        A03.A06(3);
        C17890vO.A0m(A03, string, string2, true);
        A03.A0A = A072;
        C17880vN.A1G(A03);
        r10.BkR(1, A03.A05());
    }

    public static void A0P(Context context, C27301Vn r10, C33841jT r11, boolean z) {
        Intent A03;
        Log.i("RegistrationUtils/notifyVerified");
        long currentTimeMillis = System.currentTimeMillis();
        String A0q = C17880vN.A0q(context, context.getString(2131899103), new Object[1], 0, 2131896237);
        String string = context.getString(2131896241);
        String string2 = context.getString(2131896239);
        if (z) {
            A03 = AnonymousClass1LU.A0A(context);
        } else {
            A03 = AnonymousClass1LU.A03(context);
            C33841jT.A03(r11, 2, true);
        }
        PendingIntent A002 = C1408573i.A00(context, 1, A03, 0);
        C1409673t A032 = C217217d.A03(context);
        A032.A0M = "other_notifications@1";
        A032.A0F(A0q);
        A032.A09(currentTimeMillis);
        A032.A06(3);
        C17890vO.A0m(A032, string, string2, true);
        A032.A0A = A002;
        C17880vN.A1G(A032);
        r10.BkR(1, A032.A05());
    }

    public static void A0R(AnonymousClass1FU r5, int i) {
        C134126q5 r4 = new C134126q5(r5);
        r4.A01 = 2131232814;
        r4.A01(new String[]{"android.permission.RECEIVE_SMS"});
        r4.A02 = 2131894394;
        r4.A06 = true;
        r5.CNh(r4.A00(), i);
    }

    public static void A0T(AnonymousClass1FY r3, AnonymousClass19D r4, int i) {
        if (C18020vd.A05(C18040vf.A02, r4, 6290)) {
            C72463Mc.A0y(r3, AnonymousClass3MW.A0I(r3, i), 2130971949, 2131103049);
        }
    }

    public static void A0U(C19830z4 r1, String str) {
        A00 = str;
        C17880vN.A1E(C19830z4.A00(r1), "registration_failure_reason", str);
    }

    public static int A01(String str, boolean z) {
        switch (str.hashCode()) {
            case -1423466756:
                if (str.equals("acc_tr")) {
                    return 10;
                }
                break;
            case -795576526:
                if (AnonymousClass8BR.A1W(str)) {
                    return 2;
                }
                break;
            case -792038226:
                if (str.equals("passkey")) {
                    return 8;
                }
                break;
            case 114009:
                if (AnonymousClass8BR.A1U(str)) {
                    if (z) {
                        return 5;
                    }
                    return 6;
                }
                break;
            case 97513456:
                if (AnonymousClass8BR.A1V(str)) {
                    return 4;
                }
                break;
            case 112386354:
                if (str.equals("voice")) {
                    return 7;
                }
                break;
            case 601452370:
                if (str.equals("silent_auth")) {
                    return 9;
                }
                break;
            case 1439178067:
                if (str.equals("autoconf")) {
                    return 1;
                }
                break;
            case 2120743944:
                if (AnonymousClass8BR.A1X(str)) {
                    return 3;
                }
                break;
        }
        return -1;
    }

    public static C010105w A0A(AnonymousClass1FU r6, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(r6), 2131626075);
        C73203Rj A002 = AnonymousClass4a6.A00(r6);
        A002.A0D(2131895037);
        A002.A0c(A0D);
        A002.A0T(false);
        TextView A0J = AnonymousClass3MW.A0J(A0D, 2131428581);
        TextView A0J2 = AnonymousClass3MW.A0J(A0D, 2131428579);
        TextView A0J3 = AnonymousClass3MW.A0J(A0D, 2131428580);
        A0J.setVisibility(0);
        A0J.setText(2131898766);
        C90024dP.A00(A0J, r6, runnable, 26);
        A0J3.setVisibility(0);
        A0J3.setText(2131898874);
        C72463Mc.A0y(r6, A0J3, 2130970925, 2131102369);
        C90024dP.A00(A0J3, r6, runnable3, 27);
        A0J2.setVisibility(0);
        A0J2.setText(2131890221);
        C90024dP.A00(A0J2, r6, runnable2, 28);
        return A002.create();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9zb, X.99F] */
    public static AnonymousClass99F A0B(C19830z4 r3, AnonymousClass19D r4) {
        int i = C17890vO.A0B(r3).getInt("reg_attempts_generate_code", 0) + 1;
        C17900vP.A0M(r3, "reg_attempts_generate_code", i);
        return new C199199zb(i, A0F(r3, r4));
    }

    public static CharSequence A0C(Context context, C18000vb r9, String str, int i, long j, boolean z) {
        if (j > 3600000) {
            Spanned fromHtml = Html.fromHtml(C72473Md.A0k(context.getResources(), (int) Math.ceil(((double) j) / 3600000.0d), i));
            String obj = fromHtml.toString();
            SpannableString spannableString = new SpannableString(obj);
            for (Object obj2 : fromHtml.getSpans(0, obj.length(), Object.class)) {
                spannableString.setSpan(new StyleSpan(1), fromHtml.getSpanStart(obj2), fromHtml.getSpanEnd(obj2), 18);
            }
            return spannableString;
        }
        Locale A0N = r9.A0N();
        if (z) {
            Object[] A1a = AnonymousClass8BR.A1a();
            A1a[0] = str;
            A1a[1] = "  ";
            A1a[2] = C64052u8.A0D(r9, (String) null, C17880vN.A04(j));
            return String.format(A0N, "%s%s%s", A1a);
        }
        return Html.fromHtml(String.format(A0N, str, new Object[]{C64052u8.A0D(r9, (String) null, C17880vN.A04(j))}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r6.equals(r5) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0E(X.AnonymousClass1LA r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r4 = 0
            if (r0 != 0) goto L_0x004e
            int r1 = r12.length()
            int r0 = r11.length()
            if (r1 < r0) goto L_0x004e
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r6 = r12.replaceAll(r1, r0)
            java.lang.String r1 = r10.replaceAll(r1, r0)
            java.lang.String r7 = X.C63942tw.A03(r9, r11, r1)
            java.lang.String r5 = X.C63942tw.A03(r9, r11, r6)
            java.lang.String r8 = X.C17900vP.A0A(r11, r7)
            int r0 = A00(r7, r5)
            if (r0 != 0) goto L_0x004f
            boolean r0 = r5.equals(r7)
            if (r0 != 0) goto L_0x004e
            boolean r0 = r5.equals(r8)
            if (r0 != 0) goto L_0x004e
            boolean r0 = X.C63942tw.A07(r6, r7, r5, r11)
            if (r0 != 0) goto L_0x004e
            boolean r0 = r1.endsWith(r5)
            if (r0 == 0) goto L_0x004f
            int r1 = X.C63942tw.A00(r9, r4, r11, r5)
            r0 = 5
            if (r1 != r0) goto L_0x004f
        L_0x004e:
            return r4
        L_0x004f:
            r3 = 1
            r2 = 0
            if (r5 == 0) goto L_0x005a
            boolean r0 = r6.equals(r5)
            r1 = 1
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            boolean r0 = A0W(r9, r6, r11, r8, r3)
            if (r0 == 0) goto L_0x0062
            return r6
        L_0x0062:
            if (r1 == 0) goto L_0x006b
            boolean r0 = A0W(r9, r5, r11, r8, r3)
            if (r0 == 0) goto L_0x006b
            return r5
        L_0x006b:
            boolean r0 = A0W(r9, r6, r11, r7, r2)
            if (r0 == 0) goto L_0x007a
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0o(r11, r6)
        L_0x0075:
            java.lang.String r0 = r0.toString()
            return r0
        L_0x007a:
            if (r1 == 0) goto L_0x004e
            boolean r0 = A0W(r9, r5, r11, r7, r2)
            if (r0 == 0) goto L_0x004e
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0o(r11, r5)
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9B.A0E(X.1LA, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String A0G(C18000vb r1, String str, String str2) {
        return r1.A0G(A0H(str, str2));
    }

    public static void A0I(Activity activity, C29491cN r2, C19830z4 r3, AnonymousClass11O r4) {
        if (!TextUtils.isEmpty(r3.A0i())) {
            A0K(activity, r3, r4, (Runnable) null, (String) null);
        } else {
            r2.A0C(activity, true);
        }
    }

    public static void A0J(Activity activity, C19830z4 r4, AnonymousClass11O r5) {
        if (!TextUtils.isEmpty(r4.A0i())) {
            A0K(activity, r4, r5, (Runnable) null, (String) null);
            return;
        }
        A0L(activity, (Runnable) null, (String) null, r5.A01(), r4.A0E());
    }

    public static void A0L(Activity activity, Runnable runnable, String str, String str2, int i) {
        C73203Rj A0E = AnonymousClass8BW.A0E(activity);
        A0E.A0E(2131886456);
        A0E.A0D(2131886453);
        C20152A9o.A00(A0E, runnable, 5, 2131886455);
        A0E.A0X(new C20145A9h(activity, runnable, str, str2, i), 2131886454);
        A0E.A0C();
    }

    public static void A0N(Context context, AnonymousClass1FL r11, WaTextView waTextView, C36531o3 r13, AnonymousClass11C r14, C18030ve r15, C36401np r16, Runnable runnable, String str, String str2, String str3) {
        Context context2 = context;
        int A002 = AnonymousClass1YL.A00(context, 2130971981, 2131103159);
        C21456AkN akN = new C21456AkN(r13, r11, runnable, str3, 43);
        SpannableStringBuilder A06 = r16.A06(context2, akN, str2, str, A002);
        AnonymousClass3Ma.A1I(waTextView, r15);
        AnonymousClass3MZ.A1Q(waTextView, r14);
        waTextView.setText(A06);
    }

    public static void A0Q(View view, AnonymousClass1FU r4, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        AnonymousClass1Y3 r0;
        WDSToolbar wDSToolbar = (WDSToolbar) AnonymousClass1HF.A06(view, i);
        wDSToolbar.setVisibility(0);
        C003401n A0K = AnonymousClass3MY.A0K(r4, wDSToolbar);
        if (A0K != null) {
            A0K.A0W(z);
            A0K.A0Y(false);
        }
        if (z3) {
            wDSToolbar.setNavigationIcon(r4.getResources().getDrawable(2131231814));
            wDSToolbar.setNavigationOnClickListener(new AFD(r4, 47));
            i2 = 2131898783;
        } else if (z2) {
            wDSToolbar.setNavigationIcon(r4.getResources().getDrawable(2131231675));
            wDSToolbar.setNavigationOnClickListener(new AFD(r4, 48));
            i2 = 2131898718;
        } else {
            i2 = -1;
        }
        if (C28281Zt.A0B(r4)) {
            r0 = AnonymousClass2QJ.A00;
        } else {
            r0 = AnonymousClass1YM.A00;
        }
        wDSToolbar.setIconSet(r0);
        if (i2 != -1) {
            wDSToolbar.setNavigationContentDescription(i2);
        }
    }

    public static void A0S(AnonymousClass1FU r3, AnonymousClass00H r4) {
        A0I(r3, (C29491cN) r4.get(), r3.A0A, r3.A0B);
    }

    public static boolean A0V(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return C108975cc.A19(((((float) displayMetrics.heightPixels) / displayMetrics.density) > 500.0f ? 1 : ((((float) displayMetrics.heightPixels) / displayMetrics.density) == 500.0f ? 0 : -1)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0W(X.AnonymousClass1LA r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r7 = 0
            if (r0 != 0) goto L_0x0058
            int r1 = r9.length()
            int r4 = r10.length()
            if (r1 < r4) goto L_0x0058
            r3 = 1
            int r6 = r11.length()
            int r0 = r6 - r1
            int r0 = java.lang.Math.abs(r0)
            r5 = 0
            if (r0 != r3) goto L_0x005f
            r2 = r9
            if (r6 >= r1) goto L_0x0023
            r2 = r11
        L_0x0023:
            boolean r0 = r2.equals(r11)
            if (r0 == 0) goto L_0x002a
            r11 = r9
        L_0x002a:
            int r0 = r2.length()
            if (r5 >= r0) goto L_0x007f
            char r1 = r2.charAt(r5)
            char r0 = r11.charAt(r5)
            if (r1 == r0) goto L_0x005c
            int r0 = r5 + 1
            java.lang.String r1 = r11.substring(r0)
            java.lang.String r0 = r2.substring(r5)
        L_0x0044:
            boolean r0 = r1.equals(r0)
        L_0x0048:
            if (r12 == 0) goto L_0x0059
            if (r0 == 0) goto L_0x0058
            java.lang.String r9 = r9.substring(r4)
        L_0x0050:
            r0 = 0
            int r0 = X.C63942tw.A00(r8, r0, r10, r9)
            if (r0 != r3) goto L_0x0058
            r7 = 1
        L_0x0058:
            return r7
        L_0x0059:
            if (r0 == 0) goto L_0x0058
            goto L_0x0050
        L_0x005c:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x005f:
            if (r0 != 0) goto L_0x0081
            r2 = 0
        L_0x0062:
            if (r2 >= r6) goto L_0x0081
            char r1 = r11.charAt(r2)
            char r0 = r9.charAt(r2)
            if (r1 == r0) goto L_0x007c
            int r6 = r6 - r3
            if (r2 == r6) goto L_0x007f
            int r0 = r2 + 1
            java.lang.String r1 = r11.substring(r0)
            java.lang.String r0 = r9.substring(r0)
            goto L_0x0044
        L_0x007c:
            int r2 = r2 + 1
            goto L_0x0062
        L_0x007f:
            r0 = 1
            goto L_0x0048
        L_0x0081:
            r0 = 0
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9B.A0W(X.1LA, java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }

    public static boolean A0X(String str, String str2) {
        Matcher A0z = AnonymousClass8BU.A0z(str, str2);
        String replaceAll = str2.replaceAll("\\D", "");
        int length = str.length();
        int i = length - 7;
        int lastIndexOf = str.lastIndexOf(replaceAll, i - 1);
        if (!A0z.matches() || length < replaceAll.length() + 7 || lastIndexOf == -1) {
            return false;
        }
        return str.substring(lastIndexOf, i).equals(replaceAll);
    }

    public static byte[] A0Y(String str) {
        try {
            UUID fromString = UUID.fromString(str);
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putLong(fromString.getMostSignificantBits());
            allocate.putLong(fromString.getLeastSignificantBits());
            return allocate.array();
        } catch (IllegalArgumentException unused) {
            C17900vP.A0e("RegistrationUtils/getBytesFromUUIDString/invalid-input ", str, AnonymousClass000.A10());
            return new byte[0];
        }
    }
}
