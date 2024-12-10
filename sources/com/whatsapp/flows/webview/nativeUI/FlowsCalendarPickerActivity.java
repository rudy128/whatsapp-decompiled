package com.whatsapp.flows.webview.nativeUI;

import X.AEO;
import X.AGB;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.C137116uw;
import X.C17880vN;
import X.C63662tU;
import X.C63932tv;
import android.content.Intent;

public final class FlowsCalendarPickerActivity extends AnonymousClass1FY {
    public AEO A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.AJN, android.os.Parcelable, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0175, code lost:
        if (r2.compareTo(r8.A05.A06) <= 0) goto L_0x0177;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            super.onCreate(r1)
            android.view.Window r2 = r0.getWindow()
            r1 = 2131102739(0x7f060c13, float:1.7817924E38)
            int r1 = X.C19740yt.A00(r0, r1)
            r2.setStatusBarColor(r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r1 = 1
            if (r3 != r2) goto L_0x001d
            r1 = -1
        L_0x001d:
            r0.setRequestedOrientation(r1)
            android.os.Bundle r3 = X.AnonymousClass3MY.A09(r0)
            r2 = 0
            if (r3 == 0) goto L_0x002d
            java.lang.String r1 = "input_json"
            java.lang.String r2 = r3.getString(r1, r2)
        L_0x002d:
            java.text.SimpleDateFormat r1 = X.C197479wl.A01
            org.json.JSONObject r2 = X.C17880vN.A16(r2)
            java.lang.String r1 = "data"
            org.json.JSONObject r3 = r2.optJSONObject(r1)
            if (r3 == 0) goto L_0x00b7
            java.lang.String r1 = "params"
            org.json.JSONObject r7 = r3.optJSONObject(r1)
            java.lang.String r1 = "input_name"
            java.lang.String r11 = r3.optString(r1)
        L_0x0047:
            java.lang.String r2 = ""
            if (r11 != 0) goto L_0x004c
            r11 = r2
        L_0x004c:
            if (r3 == 0) goto L_0x0056
            java.lang.String r1 = "input_type"
            java.lang.String r12 = r3.optString(r1)
            if (r12 != 0) goto L_0x0057
        L_0x0056:
            r12 = r2
        L_0x0057:
            if (r7 == 0) goto L_0x00b5
            java.lang.String r1 = "title"
            java.lang.String r13 = r7.optString(r1)
        L_0x005f:
            java.lang.String r1 = "initial_date"
            java.text.SimpleDateFormat r8 = X.C197479wl.A01
            java.util.Date r14 = X.C197479wl.A00(r1, r8, r7)
            java.lang.String r1 = "min_date"
            java.util.Date r15 = X.C197479wl.A00(r1, r8, r7)
            java.lang.String r1 = "max_date"
            java.util.Date r16 = X.C197479wl.A00(r1, r8, r7)
            java.lang.String r2 = "focus_date"
            java.text.SimpleDateFormat r1 = X.C197479wl.A00
            java.util.Date r17 = X.C197479wl.A00(r2, r1, r7)
            X.DcQ r9 = X.AnonymousClass1ZT.A01()
            if (r7 == 0) goto L_0x00ba
            java.lang.String r1 = "unavailable_dates"
            org.json.JSONArray r6 = r7.optJSONArray(r1)
            if (r6 == 0) goto L_0x00ba
            int r5 = r6.length()
            r4 = 0
        L_0x008e:
            if (r4 >= r5) goto L_0x00ba
            java.lang.String r3 = r6.optString(r4)
            X.C18070vi.A0X(r3)
            java.util.Date r1 = r8.parse(r3)     // Catch:{ ParseException -> 0x00a1 }
            if (r1 == 0) goto L_0x00b2
            r9.add(r1)
            goto L_0x00b2
        L_0x00a1:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "FlowsLogger/getCalendarPickerInputParams/"
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = " is not a valid date format"
            X.C17890vO.A19(r2, r1)
        L_0x00b2:
            int r4 = r4 + 1
            goto L_0x008e
        L_0x00b5:
            r13 = 0
            goto L_0x005f
        L_0x00b7:
            r7 = 0
            r11 = 0
            goto L_0x0047
        L_0x00ba:
            X.DcQ r18 = X.AnonymousClass1ZT.A02(r9)
            X.DcQ r5 = X.AnonymousClass1ZT.A01()
            if (r7 == 0) goto L_0x00dd
            java.lang.String r1 = "include_days"
            org.json.JSONArray r4 = r7.optJSONArray(r1)
            if (r4 == 0) goto L_0x00dd
            int r3 = r4.length()
            r2 = 0
        L_0x00d1:
            if (r2 >= r3) goto L_0x00dd
            java.lang.String r1 = r4.optString(r2)
            r5.add(r1)
            int r2 = r2 + 1
            goto L_0x00d1
        L_0x00dd:
            X.DcQ r19 = X.AnonymousClass1ZT.A02(r5)
            X.AEO r10 = new X.AEO
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.A00 = r10
            X.AJN r5 = new X.AJN
            r5.<init>()
            r4 = 0
            r6 = r4
            r9 = r4
            r3 = 2132083309(0x7f15026d, float:1.9806757E38)
            java.lang.String r2 = r10.A02
            if (r2 == 0) goto L_0x00fe
            int r1 = r2.length()
            if (r1 == 0) goto L_0x00fe
            r6 = r2
        L_0x00fe:
            java.util.Date r1 = r10.A04
            if (r1 == 0) goto L_0x0106
            java.lang.Long r9 = X.AnonymousClass8BU.A0m(r1)
        L_0x0106:
            r12 = 0
            long r16 = X.C197469wk.A01
            long r14 = X.C197469wk.A00
            X.AEu r11 = new X.AEu
            r11.<init>(r10)
            java.util.Date r1 = r10.A03
            if (r1 == 0) goto L_0x0118
            java.lang.Long r12 = X.AnonymousClass8BU.A0m(r1)
        L_0x0118:
            r13 = 0
            X.ADU r8 = X.C197469wk.A00(r11, r12, r13, r14, r16)
            r7 = 2131899211(0x7f12334b, float:1.9433362E38)
            if (r9 == 0) goto L_0x013b
            long r1 = r9.longValue()
            java.util.Calendar r9 = X.A8Y.A07(r4)
            r9.setTimeInMillis(r1)
            java.util.Calendar r1 = X.A8Y.A06(r9)
            long r1 = r1.getTimeInMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5.A01 = r1
        L_0x013b:
            X.Aie r1 = r8.A00
            if (r1 != 0) goto L_0x0179
            java.util.ArrayList r1 = X.AnonymousClass8BX.A0i(r5)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01f7
            java.util.ArrayList r1 = X.AnonymousClass8BX.A0i(r5)
            java.util.Iterator r1 = r1.iterator()
            long r1 = X.C17890vO.A07(r1)
            java.util.Calendar r9 = X.A8Y.A07(r4)
            r9.setTimeInMillis(r1)
            X.Aie r10 = new X.Aie
            r10.<init>(r9)
            X.Aie r1 = r8.A06
            java.util.Calendar r2 = r10.A06
            java.util.Calendar r1 = r1.A06
            int r1 = r2.compareTo(r1)
            if (r1 < 0) goto L_0x01f7
            X.Aie r1 = r8.A05
            java.util.Calendar r1 = r1.A06
            int r1 = r2.compareTo(r1)
            if (r1 > 0) goto L_0x01f7
        L_0x0177:
            r8.A00 = r10
        L_0x0179:
            com.google.android.material.datepicker.MaterialDatePicker r9 = new com.google.android.material.datepicker.MaterialDatePicker
            r9.<init>()
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r1 = "OVERRIDE_THEME_RES_ID"
            r2.putInt(r1, r3)
            java.lang.String r1 = "DATE_SELECTOR_KEY"
            r2.putParcelable(r1, r5)
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            r2.putParcelable(r1, r8)
            java.lang.String r1 = "DAY_VIEW_DECORATOR_KEY"
            r2.putParcelable(r1, r4)
            java.lang.String r1 = "TITLE_TEXT_RES_ID_KEY"
            r2.putInt(r1, r7)
            java.lang.String r1 = "TITLE_TEXT_KEY"
            r2.putCharSequence(r1, r6)
            java.lang.String r1 = "INPUT_MODE_KEY"
            r2.putInt(r1, r13)
            java.lang.String r1 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            r2.putInt(r1, r13)
            java.lang.String r1 = "POSITIVE_BUTTON_TEXT_KEY"
            r2.putCharSequence(r1, r4)
            java.lang.String r1 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            r2.putInt(r1, r13)
            java.lang.String r1 = "NEGATIVE_BUTTON_TEXT_KEY"
            r2.putCharSequence(r1, r4)
            r9.A1R(r2)
            X.1GP r2 = r0.getSupportFragmentManager()
            java.lang.String r1 = "FlowsCalendarPicker"
            r9.A2C(r2, r1)
            r1 = 11
            X.A9Q r2 = new X.A9Q
            r2.<init>(r0, r1)
            java.util.LinkedHashSet r1 = r9.A0L
            r1.add(r2)
            r1 = 4
            X.A9w r2 = X.C20160A9w.A00(r0, r1)
            java.util.LinkedHashSet r1 = r9.A0M
            r1.add(r2)
            r1 = 14
            X.4dH r2 = new X.4dH
            r2.<init>(r0, r1)
            java.util.LinkedHashSet r1 = r9.A0N
            r1.add(r2)
            X.B0r r2 = new X.B0r
            r2.<init>(r9, r0)
            X.AJP r1 = new X.AJP
            r1.<init>(r2)
            java.util.LinkedHashSet r0 = r9.A0O
            r0.add(r1)
            return
        L_0x01f7:
            java.util.Calendar r1 = X.A8Y.A05()
            X.Aie r10 = new X.Aie
            r10.<init>(r1)
            X.Aie r9 = r8.A06
            java.util.Calendar r2 = r10.A06
            java.util.Calendar r1 = r9.A06
            int r1 = r2.compareTo(r1)
            if (r1 < 0) goto L_0x0218
            X.Aie r1 = r8.A05
            java.util.Calendar r1 = r1.A06
            int r1 = r2.compareTo(r1)
            if (r1 > 0) goto L_0x0218
            goto L_0x0177
        L_0x0218:
            r10 = r9
            goto L_0x0177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity.onCreate(android.os.Bundle):void");
    }

    public FlowsCalendarPickerActivity(int i) {
        this.A01 = false;
        AGB.A00(this, 40);
    }

    public static final void A03(FlowsCalendarPickerActivity flowsCalendarPickerActivity) {
        String str;
        Intent A0A = C17880vN.A0A();
        AEO aeo = flowsCalendarPickerActivity.A00;
        if (aeo != null) {
            str = aeo.A00;
        } else {
            str = null;
        }
        A0A.putExtra("input_name", str);
        flowsCalendarPickerActivity.setResult(0, A0A);
    }

    public void finish() {
        if (!isFinishing()) {
            super.finish();
        }
    }

    public FlowsCalendarPickerActivity() {
        this(0);
    }
}
