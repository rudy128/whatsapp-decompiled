package X;

import android.app.Activity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ALR implements C22415B6x {
    public final C22415B6x A00;
    public final C19974A1j A01;
    public final C191649mw A02;

    public static Activity A00(C23736Boh boh) {
        return (Activity) boh.A00.A02.A00().get(2131428249);
    }

    public ALR(C22415B6x b6x, C19974A1j a1j, C191649mw r3) {
        this.A02 = r3;
        this.A00 = b6x;
        this.A01 = a1j;
    }

    private HashMap A01(Map map) {
        HashMap hashMap;
        HashMap A11 = C17880vN.A11();
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            String str = null;
            try {
                Map map2 = (Map) A16.getValue();
                if (A16.getValue() != null) {
                    hashMap = A01(map2);
                } else {
                    hashMap = null;
                }
                A11.put(key, hashMap);
            } catch (ClassCastException unused) {
                if (A16.getValue() != null) {
                    str = A16.getValue().toString();
                }
                A11.put(key, str);
            }
        }
        return A11;
    }

    public static HashMap A02(Map map) {
        String obj;
        HashMap A11 = C17880vN.A11();
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            boolean z = A16.getValue() instanceof Number;
            Object key = A16.getKey();
            if (z || A16.getValue() != null) {
                obj = A16.getValue().toString();
            } else {
                obj = null;
            }
            A11.put(key, obj);
        }
        return A11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v51, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v35, types: [X.9R3, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x026b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026c, code lost:
        r2 = X.AnonymousClass8BR.A16(r10.A00, 0);
        r3 = A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0276, code lost:
        if (r2 == null) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0278, code lost:
        r2 = A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027c, code lost:
        r1 = (X.B7W) r3;
        r3.onBackPressed();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0282, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0284, code lost:
        ((java.util.AbstractMap) ((X.AnonymousClass8k7) r1).A0A.A02.peek()).putAll(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0293, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0294, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0296, code lost:
        r6 = X.AnonymousClass8BT.A0t(r10, 0);
        r4 = (X.AnonymousClass8k7) ((X.B7W) A00(r1));
        r5 = (androidx.fragment.app.DialogFragment) r4.getSupportFragmentManager().A0Q("bloks-dialog");
        r4 = r4.A0A;
        r1 = r4.A01;
        r2 = (X.C194839sN) r1.get("dialog");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        r1 = new byte[8];
        r2.A03.nextBytes(r1);
        r0 = X.C17970vW.A06(r1);
        r2.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ba, code lost:
        if (r5 == null) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02bc, code lost:
        r5.A28();
        X.C19974A1j.A00(r1);
        r4.A02.pop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02c7, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02c9, code lost:
        r2.A00 = true;
        r2.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ce, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02cf, code lost:
        r2 = r10.A00;
        r9 = X.C17880vN.A0w(r2, 0);
        r8 = (java.lang.Boolean) r2.get(1);
        r2 = r1.A00.A02;
        r6 = r7.A02;
        r5 = A00(r1);
        r4 = (android.app.ProgressDialog) r2.A06.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ed, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02f3, code lost:
        if (r4.isShowing() == false) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02f5, code lost:
        r4.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02f8, code lost:
        r4.setMessage(r9);
        r4.setIndeterminate(true);
        r4.setCanceledOnTouchOutside(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0306, code lost:
        if (r8.booleanValue() == false) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0308, code lost:
        r4.setCancelable(true);
        r4.setOnCancelListener(new X.A9N(r5, r6, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0313, code lost:
        r4.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0316, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0317, code lost:
        r4.setCancelable(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r0 = r10.A00;
        r2 = X.C17880vN.A0w(r0, 0);
        r3 = X.C17880vN.A0w(r0, 1);
        r6 = ((android.app.Activity) r1.A00.A02.A04.get()).getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006c, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        switch(r3.hashCode()) {
            case -891985903: goto L_0x00b9;
            case 64711720: goto L_0x00a8;
            case 97526364: goto L_0x0096;
            case 1958052158: goto L_0x0085;
            default: goto L_0x0077;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04bb, code lost:
        if (r0 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04bf, code lost:
        r5 = ((X.AnonymousClass91q) ((X.C22538BBv) A00(r1))).A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04cf, code lost:
        if (r5.A00 <= 0) goto L_0x04df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04d1, code lost:
        r2 = X.AnonymousClass11P.A01(r5.A01) - r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04de, code lost:
        return java.lang.Long.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04df, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04e2, code lost:
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f0, code lost:
        return r2.A02.A00(X.AnonymousClass11S.A01(r2.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04f1, code lost:
        r6 = r10.A00;
        r4 = X.C17880vN.A0w(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        android.util.Log.d("", X.AnonymousClass001.A1H("PAY: BloksActivity/getIntentParameter type not supported: ", r3, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04f7, code lost:
        if (r4 == null) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04fd, code lost:
        if (r4.length() == 0) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04ff, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r4 = java.lang.Long.parseLong(r4);
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0504, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0505, code lost:
        android.util.Log.d("Whatsapp", X.AnonymousClass001.A1H("NumberUtil/Invalid long value:", r4, X.AnonymousClass000.A10()), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0575, code lost:
        r4 = java.lang.Double.valueOf(java.lang.Math.ceil(r2 / r0)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0586, code lost:
        r0 = r10.A00;
        r5 = X.C17880vN.A0w(r0, 0);
        r1 = (java.util.AbstractList) r0.get(1);
        r2 = new java.lang.String[r1.size()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x059c, code lost:
        if (r4 >= r1.size()) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x059e, code lost:
        r2[r4] = r1.get(r4);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05a7, code lost:
        r0 = ((X.C22538BBv) A00(r1)).BcG(X.C196539vE.A00(X.AnonymousClass8BT.A0t(r10, 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r3.equals("integer") == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05ba, code lost:
        r2 = r10.A00;
        r0 = X.AnonymousClass8BR.A16(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05d2, code lost:
        return ((X.C22538BBv) A00(r1)).CBa(X.C17880vN.A0w(r2, 1), A02(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05d3, code lost:
        ((X.AnonymousClass91q) ((X.C22538BBv) A00(r1))).A0J.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05e0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05e1, code lost:
        r6 = r10.A00;
        r5 = X.C17880vN.A0w(r6, 0);
        r3 = X.AnonymousClass3MX.A02(r6, 1);
        r2 = new java.lang.String[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05ed, code lost:
        if (r4 >= r3) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05ef, code lost:
        r1 = r4 + 1;
        r2[r4] = r6.get(r1);
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05fd, code lost:
        return java.text.MessageFormat.format(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05fe, code lost:
        r0 = r10.A00;
        r0 = X.AnonymousClass8BU.A1V(X.C17880vN.A0w(r0, 0), java.util.regex.Pattern.compile(X.C17880vN.A0w(r0, 1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0614, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0615, code lost:
        r3 = ((X.AnonymousClass91q) ((X.C22538BBv) A00(r1))).A0J;
        r3.A02 = null;
        r3.A00 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0625, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0626, code lost:
        A00(r1).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x062d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x062e, code lost:
        r2 = r10.A00;
        r4 = X.AnonymousClass8BR.A16(r2, 0);
        r7 = X.A45.A01(r1, r2, 1);
        r2 = A00(r1);
        r6 = A02(r4);
        r5 = r6.remove("case");
        X.C17960vV.A07(r5);
        r5 = (java.lang.String) r5;
        ((X.C22538BBv) r2).CBV(((X.AnonymousClass8k7) ((X.B7W) r2)).A0A.A01(r7.A00, r7.A01, r5), r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x065f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0660, code lost:
        r5 = r10.A00;
        r8 = X.C17880vN.A0w(r5, 0);
        r4 = r5.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x066c, code lost:
        if ((r4 instanceof java.lang.Boolean) == false) goto L_0x06a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        return java.lang.Integer.toString(r6.getIntExtra(r2, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x066e, code lost:
        r11 = X.AnonymousClass000.A1Y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0672, code lost:
        r4 = r5.get(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0678, code lost:
        if ((r4 instanceof java.lang.Boolean) == false) goto L_0x06a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x067a, code lost:
        r1 = X.AnonymousClass000.A1Y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x067e, code lost:
        if (r1 == 1) goto L_0x06a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0680, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0681, code lost:
        if (r1 == 2) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0683, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0684, code lost:
        r2 = X.AnonymousClass8BR.A16(r5, 3);
        r7.A02.A07.CC7(X.C123756Vs.A00(r8, (java.util.ArrayList) r5.get(4), A02(r2), r11, r12, -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x06a0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x06a1, code lost:
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x06a3, code lost:
        r1 = X.AnonymousClass000.A0M(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x06a8, code lost:
        r11 = X.AnonymousClass000.A0M(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x06ad, code lost:
        r5 = r10.A00;
        r2 = X.AnonymousClass8BR.A16(r5, 0);
        r8 = X.A45.A01(r1, r5, 1);
        r3 = r7.A02;
        r1 = A00(r1);
        r6 = A02(r2);
        r7 = new X.C184109aQ(((X.AnonymousClass8k7) ((X.B7W) r1)).A0A, r3.A06);
        r2 = r8.A00.A00.A02;
        r5 = r6.get("message");
        X.C17960vV.A07(r5);
        r5 = (java.lang.String) r5;
        r3 = X.C108945cZ.A1G("title", r6);
        r4 = new androidx.appcompat.app.AlertDialog$Builder((android.content.Context) r2.A04.get()).create();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x06fa, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x06ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x06fc, code lost:
        r4.setTitle(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x06ff, code lost:
        r1 = r4.A00;
        r1.A0R = r5;
        r1 = r1.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0705, code lost:
        if (r1 == null) goto L_0x070a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0707, code lost:
        r1.setText(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x070a, code lost:
        r4.setCanceledOnTouchOutside(false);
        r5 = r7.A00.A01(r8.A00, r8.A01, "alert_dialog");
        r2 = X.C108945cZ.A1G("button_info", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        if (r3.equals("float") == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0725, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x077d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0727, code lost:
        r7 = r2.split("\\|");
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0731, code lost:
        if (r6 > (r7.length - 2)) goto L_0x0790;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0733, code lost:
        r3 = r7[r6 + 1];
        r2 = new X.C20153A9p(r4, r5, 5);
        r8 = r7[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0743, code lost:
        switch(r8.hashCode()) {
            case -518392103: goto L_0x076c;
            case 1820734407: goto L_0x075c;
            case 2113821835: goto L_0x074d;
            default: goto L_0x0746;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0746, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0747, code lost:
        r4.A08(r1, r3, r2);
        r6 = r6 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0753, code lost:
        if (r8.equals("positive_btn_label") == false) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0755, code lost:
        r2 = new X.C20153A9p(r4, r5, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0762, code lost:
        if (r8.equals("negative_btn_label") == false) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0764, code lost:
        r2 = new X.C20153A9p(r4, r5, 7);
        r1 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0772, code lost:
        if (r8.equals("neutral_btn_label") == false) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0774, code lost:
        r2 = new X.C20153A9p(r4, r5, 8);
        r1 = -3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x077d, code lost:
        r4.A08(-1, r7.A01.A09(2131899286), new X.C20153A9p(r4, r5, 9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0790, code lost:
        r4.setOnKeyListener(new X.C20161A9x(r5, 0));
        r4.setOnDismissListener(X.C20160A9w.A00(r5, 0));
        r4.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07a3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        return java.lang.Float.toString(r6.getFloatExtra(r2, 0.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x07a4, code lost:
        X.AnonymousClass8BT.A14(A00(r1), android.net.Uri.parse(X.AnonymousClass8BT.A0t(r10, 0)), "android.intent.action.VIEW");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x07b5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x07b6, code lost:
        r2 = r10.A00;
        r5 = X.C17880vN.A0w(r2, 0);
        r3 = X.AnonymousClass8BR.A16(r2, 1);
        r8 = X.A45.A00(r1, (X.E8A) null);
        r7 = r1.A00.A02;
        r6 = A00(r1);
        r3 = A02(r3);
        X.C180529Mx.A00 = r5;
        X.C180529Mx.A01 = r3;
        r4 = (X.B7W) r6;
        r2 = r4.getIntent().getExtras();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x07df, code lost:
        if (r2 == null) goto L_0x07e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x07e1, code lost:
        r2.putString("screen_name", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x07e6, code lost:
        r4 = (X.AnonymousClass8k7) r4;
        X.C181129Pg.A00(r6, r4.A0A, r8, r3);
        r4.A04 = com.whatsapp.bloks.ui.BloksDialogFragment.A00(r5, r3);
        r3 = new X.C34001jj((X.AnonymousClass1GP) r7.A05.get());
        r3.A09(r4.A04, 2131428247);
        X.AnonymousClass8BU.A19(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x080b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x080c, code lost:
        r6 = r10.A00;
        r5 = X.C17880vN.A0w(r6, 0);
        r3 = X.AnonymousClass8BR.A16(r6, 1);
        r8 = X.A45.A01(r1, r6, 2);
        r7 = r1.A00.A02;
        r6 = A00(r1);
        r3 = A02(r3);
        X.C180529Mx.A00 = r5;
        X.C180529Mx.A01 = r3;
        r4 = (X.B7W) r6;
        r2 = r4.getIntent().getExtras();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0835, code lost:
        if (r2 == null) goto L_0x083c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0837, code lost:
        r2.putString("screen_name", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x083c, code lost:
        r4 = (X.AnonymousClass8k7) r4;
        X.C181129Pg.A00(r6, r4.A0A, r8, r3);
        r4.A04 = com.whatsapp.bloks.ui.BloksDialogFragment.A00(r5, r3);
        r3 = new X.C34001jj((X.AnonymousClass1GP) r7.A05.get());
        r3.A09(r4.A04, 2131428247);
        X.AnonymousClass8BU.A19(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0861, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0862, code lost:
        r2 = r10.A00;
        r7.A02.A00(A00(r1), X.A45.A00(r1, (X.E8A) null), r1.A00.A02, X.C17880vN.A0w(r2, 0), A02(X.AnonymousClass8BR.A16(r2, 1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0881, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0882, code lost:
        r7 = java.util.Collections.unmodifiableList(r10.A00);
        r5 = new java.lang.StringBuilder("[Bloks logging] ");
        r6 = 0;
        r4 = X.C17880vN.A0w(r7, 0);
        r5.append(X.C17880vN.A0w(r7, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x089f, code lost:
        if (r7.get(2) == null) goto L_0x08ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x08a1, code lost:
        r5.append(" ");
        r5.append(r7.get(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x08b1, code lost:
        switch(r4.hashCode()) {
            case 97: goto L_0x08f7;
            case 100: goto L_0x08ef;
            case 101: goto L_0x08e7;
            case 105: goto L_0x08df;
            case 118: goto L_0x08d7;
            case 119: goto L_0x08cf;
            default: goto L_0x08b4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x08b4, code lost:
        r6 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ae, code lost:
        if (r3.equals("boolean") == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x08b7, code lost:
        switch(r6) {
            case 0: goto L_0x08c7;
            case 1: goto L_0x08c7;
            case 2: goto L_0x08c7;
            case 3: goto L_0x0910;
            case 4: goto L_0x0908;
            case 5: goto L_0x0900;
            default: goto L_0x08ba;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x08ba, code lost:
        android.util.Log.d("Whatsapp", X.AnonymousClass001.A1H("[Bloks logging] incorrect level: ", r4, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x08c7, code lost:
        android.util.Log.d("Whatsapp", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x08ce, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x08cf, code lost:
        r1 = r4.equals("w");
        r6 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x08d7, code lost:
        r1 = r4.equals("v");
        r6 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x08df, code lost:
        r1 = r4.equals("i");
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x08e7, code lost:
        r1 = r4.equals("e");
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x08ef, code lost:
        r1 = r4.equals("d");
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x08f7, code lost:
        r1 = r4.equals("a");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x08fd, code lost:
        if (r1 != false) goto L_0x08b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0900, code lost:
        android.util.Log.w("Whatsapp", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0907, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0908, code lost:
        android.util.Log.v("Whatsapp", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x090f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0910, code lost:
        android.util.Log.i("Whatsapp", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0917, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0918, code lost:
        r7.A02.A00.A0G(X.AnonymousClass8BT.A0t(r10, 0), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0923, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        return X.AnonymousClass8BS.A0b(r6.getBooleanExtra(r2, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0924, code lost:
        r5 = r10.A00;
        r7.A02.A00(A00(r1), X.A45.A01(r1, r5, 2), r1.A00.A02, X.C17880vN.A0w(r5, 0), A02(X.AnonymousClass8BR.A16(r5, 1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0943, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0944, code lost:
        r2 = r10.A00;
        r6 = X.AnonymousClass001.A0n(r2, 0);
        r2 = X.AnonymousClass8BR.A16(r2, 1);
        r5 = A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0952, code lost:
        if (r2 == null) goto L_0x096e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0954, code lost:
        r4 = A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0958, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0959, code lost:
        if (r6 == 0) goto L_0x095c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x095b, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x095c, code lost:
        r2 = r5.getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0960, code lost:
        if (r4 == null) goto L_0x0967;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0962, code lost:
        r2.putExtra("finish_activity_result", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0967, code lost:
        r5.setResult(r3, r2);
        r5.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x096d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x096e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x097a, code lost:
        return X.C108945cZ.A1G(r2, (java.util.AbstractMap) r1.peek());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        r2.setPrimaryClip(android.content.ClipData.newPlainText(r3, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0982, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0983, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        if (r3.equals("string") == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0984, code lost:
        com.whatsapp.util.Log.e("bkinterpreter/clipboard/", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0989, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x098a, code lost:
        r3 = X.AnonymousClass000.A10();
        r1 = "WaExtensions/GetChildNode Cannot find the child node [";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0991, code lost:
        r3 = X.AnonymousClass000.A10();
        r1 = "WaExtensions/GetChildNode Cannot find the attribute [";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0997, code lost:
        r3.append(r1);
        r3.append(r2);
        r3.append("] on a null or empty parent node");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x09a1, code lost:
        r3 = X.AnonymousClass000.A10();
        r3.append("WaExtensions/Bloks function: [");
        r3.append(r6);
        r3.append("] not implemented on client");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x09b2, code lost:
        android.util.Log.d("", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x09b9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x09ba, code lost:
        r5 = X.C17880vN.A0v(X.C17890vO.A0k(r4));
        r4 = r4.get(r5);
        X.C18070vi.A0z(r4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        r5 = X.A71.A00(r8, r7, r5, (java.util.Map) r4);
        r18 = r8.A01;
        r16 = X.C17890vO.A0T(r18);
        r4 = new X.AnonymousClass1MD[4];
        X.C17880vN.A1I(X.C173438v4.A00, "to", r4, 0);
        X.C17880vN.A1Q(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r11, r4, 1);
        X.C17880vN.A1Q(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID, r16, r4, 2);
        X.C17880vN.A1Q("xmlns", r10, r4, 3);
        X.C17880vN.A0U(r18).A0I(new X.C20993Acl(r7, r9, r8, 6), X.AnonymousClass8BT.A0a(r5, r4), r16, 204, X.C17890vO.A03(r17));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0a0a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        return r2.BKe(r10, r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c5, code lost:
        return r6.getStringExtra(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        r2 = X.AnonymousClass8BT.A0t(r10, 0);
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        r1 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d4, code lost:
        if (r1.isEmpty() == false) goto L_0x0970;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        r7 = r19;
        r10 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        r6 = r10.A00;
        r5 = (java.util.List) r6.get(0);
        r0 = r6.get(1);
        r7 = X.AnonymousClass8BT.A07(r6, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        if (r5.size() == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ee, code lost:
        r6 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f6, code lost:
        if (r6.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        r5 = r6.next();
        r2 = new X.C20046A4p();
        r2.A03(r0, 0);
        r0 = X.C25974Cph.A00(r1, X.C20046A4p.A00(r2, r5, 1), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
        r0 = r10.A00;
        r8 = (java.util.AbstractList) r0.get(0);
        r7 = X.AnonymousClass8BT.A07(r0, 1);
        r0 = X.C108975cc.A0g(r8);
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0122, code lost:
        if (r6 >= r8.size()) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0124, code lost:
        r5 = new X.C20046A4p();
        r5.A03(java.lang.Integer.valueOf(r6), 0);
        r0.add(X.C25974Cph.A00(r1, X.C20046A4p.A00(r5, r8.get(r6), 1), r7));
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        switch(r9) {
            case 0: goto L_0x0032;
            case 1: goto L_0x062e;
            case 2: goto L_0x010d;
            case 3: goto L_0x0660;
            case 4: goto L_0x0142;
            case 5: goto L_0x04f1;
            case 6: goto L_0x06ad;
            case 7: goto L_0x07a4;
            case 8: goto L_0x0586;
            case 9: goto L_0x015e;
            case 10: goto L_0x05a7;
            case 11: goto L_0x07b6;
            case 12: goto L_0x05d3;
            case 13: goto L_0x07a4;
            case 14: goto L_0x080c;
            case 15: goto L_0x0173;
            case 16: goto L_0x0185;
            case 17: goto L_0x0862;
            case 18: goto L_0x04bf;
            case 19: goto L_0x01a6;
            case 20: goto L_0x0615;
            case 21: goto L_0x00d8;
            case 22: goto L_0x0660;
            case 23: goto L_0x0219;
            case 24: goto L_0x0032;
            case 25: goto L_0x04e2;
            case 26: goto L_0x0918;
            case 27: goto L_0x022b;
            case 28: goto L_0x05ba;
            case 29: goto L_0x0626;
            case 30: goto L_0x0051;
            case 31: goto L_0x00c6;
            case 32: goto L_0x0032;
            case 33: goto L_0x0882;
            case 34: goto L_0x0033;
            case 35: goto L_0x026c;
            case 36: goto L_0x05e1;
            case 37: goto L_0x0032;
            case 38: goto L_0x0296;
            case 39: goto L_0x07a4;
            case 40: goto L_0x02cf;
            case 41: goto L_0x05fe;
            case 42: goto L_0x0924;
            case 43: goto L_0x0944;
            default: goto L_0x002a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0142, code lost:
        r3 = X.AnonymousClass8BT.A0t(r10, 0);
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014c, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014e, code lost:
        com.whatsapp.util.Log.e("WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0153, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0154, code lost:
        r2 = r2.A04.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015a, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015e, code lost:
        r1 = r10.A00;
        r4 = X.AnonymousClass8BR.A16(r1, 0);
        r2 = r1.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0168, code lost:
        if (r4 == null) goto L_0x098a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016e, code lost:
        if (r4.size() <= 0) goto L_0x098a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        r2 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0170, code lost:
        r1 = "children";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0173, code lost:
        r1 = X.AnonymousClass8BR.A16(r10.A00, 0);
        r2 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017b, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017d, code lost:
        r2.A02(A02(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0184, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0185, code lost:
        r1 = r10.A00;
        r4 = X.AnonymousClass8BR.A16(r1, 0);
        r2 = r1.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018f, code lost:
        if (r4 == null) goto L_0x0991;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0195, code lost:
        if (r4.size() <= 0) goto L_0x0991;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0197, code lost:
        r1 = "properties";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r2 == null) goto L_0x09a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0199, code lost:
        r1 = X.AnonymousClass8BS.A0u(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019d, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019f, code lost:
        r1 = r1.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a3, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a5, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a6, code lost:
        r5 = r10.A00;
        r11 = X.C17880vN.A0w(r5, 0);
        r10 = X.C17880vN.A0w(r5, 1);
        r13 = X.C17880vN.A0w(r5, 2);
        r4 = X.AnonymousClass8BR.A16(r5, 3);
        r3 = X.A45.A01(r1, r5, 4);
        r8 = r7.A02;
        r12 = A00(r1);
        r4 = A01(r4);
        r12 = (X.B7W) r12;
        r6 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cc, code lost:
        if (r6 == null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ce, code lost:
        r9 = ((X.AnonymousClass8k7) r12).A0A.A01(r3.A00, r6, "case");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01db, code lost:
        r8 = r8.A03;
        r17 = java.lang.Integer.parseInt(r13);
        r12 = (X.AnonymousClass91q) r12;
        r3 = r12.A06;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e5, code lost:
        if (r3 != null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e7, code lost:
        r3 = new java.lang.Object();
        r12.A06 = r3;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ee, code lost:
        r7 = new X.C184699bN(r12.A05, r3);
        X.C18070vi.A0d(r11, 0);
        X.C18070vi.A0d(r10, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0208, code lost:
        if (X.A71.A02.contains(r10) != false) goto L_0x09ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x020a, code lost:
        com.whatsapp.util.Log.e("Bloks: IQRequestHelper/sendIQRequest: Invalid XMLNS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020f, code lost:
        if (r9 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0211, code lost:
        r9.A00("on_failure");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0216, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0217, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0219, code lost:
        r1 = (android.app.Dialog) r1.A00.A02.A06.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0225, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r2 = ((X.AnonymousClass91q) ((X.C22538BBv) A00(r1))).A0J;
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0227, code lost:
        r1.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x022b, code lost:
        r5 = r10.A00;
        r2 = X.C17880vN.A0w(r5, 0);
        r6 = X.C17880vN.A0w(r5, 1);
        r5 = A00(r1);
        r3 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0256, code lost:
        if (r5.getApplicationContext().getPackageManager().queryIntentActivities(r3, 65536).size() <= 0) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0258, code lost:
        r5.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x025b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x025c, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0262, code lost:
        if (r6.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0264, code lost:
        X.AnonymousClass8BT.A14(r5, android.net.Uri.parse(r6), "android.intent.action.VIEW");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (r0 != null) goto L_?;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BKe(X.C199029zJ r20, X.C25681CkC r21, java.lang.String r22) {
        /*
            r19 = this;
            r1 = r21
            X.Boh r1 = (X.C23736Boh) r1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WaGlobalExtensions evaluate: action="
            r6 = r22
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r6, r2)
            java.lang.String r5 = ""
            android.util.Log.d(r5, r0)
            int r0 = r6.hashCode()
            r2 = 2
            r3 = 1
            r4 = 0
            switch(r0) {
                case -1747557034: goto L_0x031b;
                case -1551525849: goto L_0x0324;
                case -1483567756: goto L_0x032d;
                case -1242219886: goto L_0x0336;
                case -1182895194: goto L_0x033f;
                case -1030847255: goto L_0x0348;
                case -877110701: goto L_0x0351;
                case -809454050: goto L_0x035a;
                case -780036552: goto L_0x0363;
                case -746705348: goto L_0x036d;
                case -629460340: goto L_0x0377;
                case -606722934: goto L_0x0381;
                case -541608891: goto L_0x038b;
                case -531827055: goto L_0x0395;
                case -444732597: goto L_0x039f;
                case -384355952: goto L_0x03a9;
                case -363552265: goto L_0x03b3;
                case -347836657: goto L_0x03bd;
                case -161320099: goto L_0x03c7;
                case -131830477: goto L_0x03d1;
                case -78052800: goto L_0x03db;
                case 151157378: goto L_0x03e5;
                case 227600558: goto L_0x03ef;
                case 243158640: goto L_0x03f9;
                case 598814056: goto L_0x0403;
                case 610178701: goto L_0x040d;
                case 683144274: goto L_0x0417;
                case 710140428: goto L_0x0421;
                case 764653078: goto L_0x042b;
                case 878253942: goto L_0x0435;
                case 889592555: goto L_0x043e;
                case 902242951: goto L_0x0447;
                case 1002037470: goto L_0x0450;
                case 1073657643: goto L_0x0459;
                case 1093292105: goto L_0x0462;
                case 1172555497: goto L_0x046b;
                case 1281868444: goto L_0x0474;
                case 1293733961: goto L_0x047d;
                case 1323560766: goto L_0x0486;
                case 1445303016: goto L_0x048f;
                case 1643041589: goto L_0x0498;
                case 1856118462: goto L_0x04a1;
                case 1866424912: goto L_0x04aa;
                case 2094846105: goto L_0x04b3;
                default: goto L_0x001f;
            }
        L_0x001f:
            r9 = -1
        L_0x0020:
            java.lang.String r8 = "] on a null or empty parent node"
            r0 = 0
            r7 = r19
            r10 = r20
            switch(r9) {
                case 0: goto L_0x0032;
                case 1: goto L_0x062e;
                case 2: goto L_0x010d;
                case 3: goto L_0x0660;
                case 4: goto L_0x0142;
                case 5: goto L_0x04f1;
                case 6: goto L_0x06ad;
                case 7: goto L_0x07a4;
                case 8: goto L_0x0586;
                case 9: goto L_0x015e;
                case 10: goto L_0x05a7;
                case 11: goto L_0x07b6;
                case 12: goto L_0x05d3;
                case 13: goto L_0x07a4;
                case 14: goto L_0x080c;
                case 15: goto L_0x0173;
                case 16: goto L_0x0185;
                case 17: goto L_0x0862;
                case 18: goto L_0x04bf;
                case 19: goto L_0x01a6;
                case 20: goto L_0x0615;
                case 21: goto L_0x00d8;
                case 22: goto L_0x0660;
                case 23: goto L_0x0219;
                case 24: goto L_0x0032;
                case 25: goto L_0x04e2;
                case 26: goto L_0x0918;
                case 27: goto L_0x022b;
                case 28: goto L_0x05ba;
                case 29: goto L_0x0626;
                case 30: goto L_0x0051;
                case 31: goto L_0x00c6;
                case 32: goto L_0x0032;
                case 33: goto L_0x0882;
                case 34: goto L_0x0033;
                case 35: goto L_0x026c;
                case 36: goto L_0x05e1;
                case 37: goto L_0x0032;
                case 38: goto L_0x0296;
                case 39: goto L_0x07a4;
                case 40: goto L_0x02cf;
                case 41: goto L_0x05fe;
                case 42: goto L_0x0924;
                case 43: goto L_0x0944;
                default: goto L_0x002a;
            }
        L_0x002a:
            X.B6x r2 = r7.A00
            if (r2 == 0) goto L_0x09a1
            java.lang.Object r0 = r2.BKe(r10, r1, r6)
        L_0x0032:
            return r0
        L_0x0033:
            android.app.Activity r0 = A00(r1)
            X.BBv r0 = (X.C22538BBv) r0
            X.91q r0 = (X.AnonymousClass91q) r0
            X.A4a r2 = r0.A0J
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto L_0x0032
            r0 = 8
            byte[] r1 = new byte[r0]
            java.util.Random r0 = r2.A03
            r0.nextBytes(r1)
            java.lang.String r0 = X.C17970vW.A06(r1)
            r2.A02 = r0
            return r0
        L_0x0051:
            java.util.List r0 = r10.A00
            java.lang.String r2 = X.C17880vN.A0w(r0, r4)
            java.lang.String r3 = X.C17880vN.A0w(r0, r3)
            X.DOZ r0 = r1.A00
            X.CXY r0 = r0.A02
            java.lang.ref.WeakReference r0 = r0.A04
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.Intent r6 = r0.getIntent()
            r0 = 0
            if (r2 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            int r1 = r3.hashCode()
            switch(r1) {
                case -891985903: goto L_0x00b9;
                case 64711720: goto L_0x00a8;
                case 97526364: goto L_0x0096;
                case 1958052158: goto L_0x0085;
                default: goto L_0x0077;
            }
        L_0x0077:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PAY: BloksActivity/getIntentParameter type not supported: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r3, r2)
            android.util.Log.d(r5, r1)
            return r0
        L_0x0085:
            java.lang.String r1 = "integer"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0077
            int r0 = r6.getIntExtra(r2, r4)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L_0x0096:
            java.lang.String r1 = "float"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0077
            r0 = 0
            float r0 = r6.getFloatExtra(r2, r0)
            java.lang.String r0 = java.lang.Float.toString(r0)
            return r0
        L_0x00a8:
            java.lang.String r1 = "boolean"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0077
            boolean r0 = r6.getBooleanExtra(r2, r4)
            java.lang.String r0 = X.AnonymousClass8BS.A0b(r0)
            return r0
        L_0x00b9:
            java.lang.String r1 = "string"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = r6.getStringExtra(r2)
            return r0
        L_0x00c6:
            java.lang.String r2 = X.AnonymousClass8BT.A0t(r10, r4)
            X.A1j r1 = r7.A01
            if (r1 == 0) goto L_0x0032
            java.util.Stack r1 = r1.A02
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0970
            r0 = 0
            return r0
        L_0x00d8:
            java.util.List r6 = r10.A00
            java.lang.Object r5 = r6.get(r4)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r6.get(r3)
            X.E8A r7 = X.AnonymousClass8BT.A07(r6, r2)
            int r2 = r5.size()
            if (r2 == 0) goto L_0x0032
            java.util.Iterator r6 = r5.iterator()
        L_0x00f2:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r5 = r6.next()
            X.A4p r2 = new X.A4p
            r2.<init>()
            r2.A03(r0, r4)
            X.9zJ r0 = X.C20046A4p.A00(r2, r5, r3)
            java.lang.Object r0 = X.C25974Cph.A00(r1, r0, r7)
            goto L_0x00f2
        L_0x010d:
            java.util.List r0 = r10.A00
            java.lang.Object r8 = r0.get(r4)
            java.util.AbstractList r8 = (java.util.AbstractList) r8
            X.E8A r7 = X.AnonymousClass8BT.A07(r0, r3)
            java.util.ArrayList r0 = X.C108975cc.A0g(r8)
            r6 = 0
        L_0x011e:
            int r2 = r8.size()
            if (r6 >= r2) goto L_0x0032
            X.A4p r5 = new X.A4p
            r5.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r5.A03(r2, r4)
            java.lang.Object r2 = r8.get(r6)
            X.9zJ r2 = X.C20046A4p.A00(r5, r2, r3)
            java.lang.Object r2 = X.C25974Cph.A00(r1, r2, r7)
            r0.add(r2)
            int r6 = r6 + 1
            goto L_0x011e
        L_0x0142:
            java.lang.String r3 = X.AnonymousClass8BT.A0t(r10, r4)
            X.9mw r2 = r7.A02
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x0154
            java.lang.String r1 = "WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return r0
        L_0x0154:
            X.11C r1 = r2.A04
            android.content.ClipboardManager r2 = r1.A09()
            if (r2 == 0) goto L_0x0032
            goto L_0x097b
        L_0x015e:
            java.util.List r1 = r10.A00
            java.util.Map r4 = X.AnonymousClass8BR.A16(r1, r4)
            java.lang.Object r2 = r1.get(r3)
            if (r4 == 0) goto L_0x098a
            int r1 = r4.size()
            if (r1 <= 0) goto L_0x098a
            java.lang.String r1 = "children"
            goto L_0x0199
        L_0x0173:
            java.util.List r1 = r10.A00
            java.util.Map r1 = X.AnonymousClass8BR.A16(r1, r4)
            X.A1j r2 = r7.A01
            if (r2 == 0) goto L_0x0032
            java.util.HashMap r1 = A02(r1)
            r2.A02(r1)
            return r0
        L_0x0185:
            java.util.List r1 = r10.A00
            java.util.Map r4 = X.AnonymousClass8BR.A16(r1, r4)
            java.lang.Object r2 = r1.get(r3)
            if (r4 == 0) goto L_0x0991
            int r1 = r4.size()
            if (r1 <= 0) goto L_0x0991
            java.lang.String r1 = "properties"
        L_0x0199:
            java.util.Map r1 = X.AnonymousClass8BS.A0u(r1, r4)
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x0032
            return r1
        L_0x01a6:
            java.util.List r5 = r10.A00
            java.lang.String r11 = X.C17880vN.A0w(r5, r4)
            java.lang.String r10 = X.C17880vN.A0w(r5, r3)
            java.lang.String r13 = X.C17880vN.A0w(r5, r2)
            r3 = 3
            java.util.Map r4 = X.AnonymousClass8BR.A16(r5, r3)
            r3 = 4
            X.A45 r3 = X.A45.A01(r1, r5, r3)
            X.9mw r8 = r7.A02
            android.app.Activity r12 = A00(r1)
            java.util.HashMap r4 = r7.A01(r4)
            X.B7W r12 = (X.B7W) r12
            X.E8A r6 = r3.A01
            if (r6 == 0) goto L_0x0217
            r1 = r12
            X.8k7 r1 = (X.AnonymousClass8k7) r1
            X.A1j r5 = r1.A0A
            X.Boh r3 = r3.A00
            java.lang.String r1 = "case"
            X.9sN r9 = r5.A01(r3, r6, r1)
        L_0x01db:
            X.A71 r8 = r8.A03
            int r17 = java.lang.Integer.parseInt(r13)
            X.91q r12 = (X.AnonymousClass91q) r12
            X.9R3 r3 = r12.A06
            if (r3 != 0) goto L_0x01ee
            X.9R3 r3 = new X.9R3
            r3.<init>()
            r12.A06 = r3
        L_0x01ee:
            X.1Mn r1 = r12.A05
            X.9bN r7 = new X.9bN
            r7.<init>(r1, r3)
            java.lang.String r14 = "type"
            r13 = 0
            X.C18070vi.A0d(r11, r13)
            java.lang.String r12 = "xmlns"
            r3 = 1
            X.C18070vi.A0d(r10, r3)
            r6 = 3
            java.util.List r1 = X.A71.A02
            boolean r1 = r1.contains(r10)
            if (r1 != 0) goto L_0x09ba
            java.lang.String r1 = "Bloks: IQRequestHelper/sendIQRequest: Invalid XMLNS"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            if (r9 == 0) goto L_0x0032
            java.lang.String r1 = "on_failure"
            r9.A00(r1)
            return r0
        L_0x0217:
            r9 = 0
            goto L_0x01db
        L_0x0219:
            X.DOZ r1 = r1.A00
            X.CXY r1 = r1.A02
            java.lang.ref.WeakReference r1 = r1.A06
            java.lang.Object r1 = r1.get()
            android.app.Dialog r1 = (android.app.Dialog) r1
            if (r1 == 0) goto L_0x0032
            r1.dismiss()
            return r0
        L_0x022b:
            java.util.List r5 = r10.A00
            java.lang.String r2 = X.C17880vN.A0w(r5, r4)
            java.lang.String r6 = X.C17880vN.A0w(r5, r3)
            android.app.Activity r5 = A00(r1)
            android.net.Uri r1 = android.net.Uri.parse(r2)
            java.lang.String r4 = "android.intent.action.VIEW"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r4, r1)
            android.content.Context r1 = r5.getApplicationContext()
            android.content.pm.PackageManager r2 = r1.getPackageManager()
            r1 = 65536(0x10000, float:9.18355E-41)
            java.util.List r1 = r2.queryIntentActivities(r3, r1)
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x025c
            r5.startActivity(r3)
            return r0
        L_0x025c:
            if (r6 == 0) goto L_0x0032
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0032
            android.net.Uri r1 = android.net.Uri.parse(r6)
            X.AnonymousClass8BT.A14(r5, r1, r4)
            return r0
        L_0x026c:
            java.util.List r2 = r10.A00
            java.util.Map r2 = X.AnonymousClass8BR.A16(r2, r4)
            android.app.Activity r3 = A00(r1)
            if (r2 == 0) goto L_0x0294
            java.util.HashMap r2 = A02(r2)
        L_0x027c:
            r1 = r3
            X.B7W r1 = (X.B7W) r1
            r3.onBackPressed()
            if (r2 == 0) goto L_0x0032
            X.8k7 r1 = (X.AnonymousClass8k7) r1
            X.A1j r1 = r1.A0A
            java.util.Stack r1 = r1.A02
            java.lang.Object r1 = r1.peek()
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            r1.putAll(r2)
            return r0
        L_0x0294:
            r2 = r0
            goto L_0x027c
        L_0x0296:
            java.lang.String r6 = X.AnonymousClass8BT.A0t(r10, r4)
            android.app.Activity r4 = A00(r1)
            X.B7W r4 = (X.B7W) r4
            X.8k7 r4 = (X.AnonymousClass8k7) r4
            X.1GP r2 = r4.getSupportFragmentManager()
            java.lang.String r1 = "bloks-dialog"
            androidx.fragment.app.Fragment r5 = r2.A0Q(r1)
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            X.A1j r4 = r4.A0A
            java.lang.String r2 = "dialog"
            java.util.HashMap r1 = r4.A01
            java.lang.Object r2 = r1.get(r2)
            X.9sN r2 = (X.C194839sN) r2
            if (r5 == 0) goto L_0x02c7
            r5.A28()
            X.C19974A1j.A00(r1)
            java.util.Stack r1 = r4.A02
            r1.pop()
        L_0x02c7:
            if (r2 == 0) goto L_0x0032
            r2.A00 = r3
            r2.A00(r6)
            return r0
        L_0x02cf:
            java.util.List r2 = r10.A00
            java.lang.String r9 = X.C17880vN.A0w(r2, r4)
            java.lang.Object r8 = r2.get(r3)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            X.DOZ r2 = r1.A00
            X.CXY r2 = r2.A02
            X.9mw r6 = r7.A02
            android.app.Activity r5 = A00(r1)
            java.lang.ref.WeakReference r1 = r2.A06
            java.lang.Object r4 = r1.get()
            android.app.ProgressDialog r4 = (android.app.ProgressDialog) r4
            if (r4 == 0) goto L_0x0032
            boolean r1 = r4.isShowing()
            if (r1 == 0) goto L_0x02f8
            r4.dismiss()
        L_0x02f8:
            r4.setMessage(r9)
            r4.setIndeterminate(r3)
            r2 = 0
            r4.setCanceledOnTouchOutside(r2)
            boolean r1 = r8.booleanValue()
            if (r1 == 0) goto L_0x0317
            r4.setCancelable(r3)
            X.A9N r1 = new X.A9N
            r1.<init>(r5, r6, r2)
            r4.setOnCancelListener(r1)
        L_0x0313:
            r4.show()
            return r0
        L_0x0317:
            r4.setCancelable(r2)
            goto L_0x0313
        L_0x031b:
            java.lang.String r0 = "wa.action.perf.TrackPerformance"
            boolean r0 = r6.equals(r0)
            r9 = 0
            goto L_0x04bb
        L_0x0324:
            java.lang.String r0 = "wa.action.AsyncRequest"
            boolean r0 = r6.equals(r0)
            r9 = 1
            goto L_0x04bb
        L_0x032d:
            java.lang.String r0 = "bk.action.array.Map"
            boolean r0 = r6.equals(r0)
            r9 = 2
            goto L_0x04bb
        L_0x0336:
            java.lang.String r0 = "wa.action.SendFieldStat"
            boolean r0 = r6.equals(r0)
            r9 = 3
            goto L_0x04bb
        L_0x033f:
            java.lang.String r0 = "bk.action.io.clipboard.SetString"
            boolean r0 = r6.equals(r0)
            r9 = 4
            goto L_0x04bb
        L_0x0348:
            java.lang.String r0 = "wa.action.TimeInFuture"
            boolean r0 = r6.equals(r0)
            r9 = 5
            goto L_0x04bb
        L_0x0351:
            java.lang.String r0 = "wa.action.ShowAlertDialog"
            boolean r0 = r6.equals(r0)
            r9 = 6
            goto L_0x04bb
        L_0x035a:
            java.lang.String r0 = "bk.action.navigation.OpenUrl"
            boolean r0 = r6.equals(r0)
            r9 = 7
            goto L_0x04bb
        L_0x0363:
            java.lang.String r0 = "wa.action.FormatStringV2"
            boolean r0 = r6.equals(r0)
            r9 = 8
            goto L_0x04bb
        L_0x036d:
            java.lang.String r0 = "wa.action.GetChildNode"
            boolean r0 = r6.equals(r0)
            r9 = 9
            goto L_0x04bb
        L_0x0377:
            java.lang.String r0 = "wa.action.HandleError"
            boolean r0 = r6.equals(r0)
            r9 = 10
            goto L_0x04bb
        L_0x0381:
            java.lang.String r0 = "bk.action.bloks.OpenScreen"
            boolean r0 = r6.equals(r0)
            r9 = 11
            goto L_0x04bb
        L_0x038b:
            java.lang.String r0 = "wa.action.StartFieldStatTimer"
            boolean r0 = r6.equals(r0)
            r9 = 12
            goto L_0x04bb
        L_0x0395:
            java.lang.String r0 = "wa.action.OpenUrl"
            boolean r0 = r6.equals(r0)
            r9 = 13
            goto L_0x04bb
        L_0x039f:
            java.lang.String r0 = "wa.action.bloks.OpenScreenWithBackpress"
            boolean r0 = r6.equals(r0)
            r9 = 14
            goto L_0x04bb
        L_0x03a9:
            java.lang.String r0 = "wa.action.SaveScreenParam"
            boolean r0 = r6.equals(r0)
            r9 = 15
            goto L_0x04bb
        L_0x03b3:
            java.lang.String r0 = "wa.action.GetAttributeValue"
            boolean r0 = r6.equals(r0)
            r9 = 16
            goto L_0x04bb
        L_0x03bd:
            java.lang.String r0 = "bk.action.bloks.LaunchDialog"
            boolean r0 = r6.equals(r0)
            r9 = 17
            goto L_0x04bb
        L_0x03c7:
            java.lang.String r0 = "wa.action.GetFieldStatElapsedTime"
            boolean r0 = r6.equals(r0)
            r9 = 18
            goto L_0x04bb
        L_0x03d1:
            java.lang.String r0 = "wa.action.IQRequest"
            boolean r0 = r6.equals(r0)
            r9 = 19
            goto L_0x04bb
        L_0x03db:
            java.lang.String r0 = "wa.action.ResetFieldStats"
            boolean r0 = r6.equals(r0)
            r9 = 20
            goto L_0x04bb
        L_0x03e5:
            java.lang.String r0 = "wa.action.array.Foldl"
            boolean r0 = r6.equals(r0)
            r9 = 21
            goto L_0x04bb
        L_0x03ef:
            java.lang.String r0 = "wa.action.SendFieldStatV2"
            boolean r0 = r6.equals(r0)
            r9 = 22
            goto L_0x04bb
        L_0x03f9:
            java.lang.String r0 = "wa.action.DismissProgressBar"
            boolean r0 = r6.equals(r0)
            r9 = 23
            goto L_0x04bb
        L_0x0403:
            java.lang.String r0 = "wa.action.navigation.OpenChat"
            boolean r0 = r6.equals(r0)
            r9 = 24
            goto L_0x04bb
        L_0x040d:
            java.lang.String r0 = "bk.action.session_store.Get"
            boolean r0 = r6.equals(r0)
            r9 = 25
            goto L_0x04bb
        L_0x0417:
            java.lang.String r0 = "bk.action.io.Toast"
            boolean r0 = r6.equals(r0)
            r9 = 26
            goto L_0x04bb
        L_0x0421:
            java.lang.String r0 = "bk.action.DeeplinkToOtherAppOrDirectToAppStore"
            boolean r0 = r6.equals(r0)
            r9 = 27
            goto L_0x04bb
        L_0x042b:
            java.lang.String r0 = "wa.action.GetProcessedData"
            boolean r0 = r6.equals(r0)
            r9 = 28
            goto L_0x04bb
        L_0x0435:
            java.lang.String r0 = "wa.action.FinishActivity"
            boolean r0 = r6.equals(r0)
            r9 = 29
            goto L_0x04bb
        L_0x043e:
            java.lang.String r0 = "wa.action.GetIntentParameter"
            boolean r0 = r6.equals(r0)
            r9 = 30
            goto L_0x04bb
        L_0x0447:
            java.lang.String r0 = "wa.action.LoadScreenParam"
            boolean r0 = r6.equals(r0)
            r9 = 31
            goto L_0x04bb
        L_0x0450:
            java.lang.String r0 = "wa.action.navigation.OpenContactInfo"
            boolean r0 = r6.equals(r0)
            r9 = 32
            goto L_0x04bb
        L_0x0459:
            java.lang.String r0 = "wa.action.Logging"
            boolean r0 = r6.equals(r0)
            r9 = 33
            goto L_0x04bb
        L_0x0462:
            java.lang.String r0 = "wa.action.GetFieldStatEventId"
            boolean r0 = r6.equals(r0)
            r9 = 34
            goto L_0x04bb
        L_0x046b:
            java.lang.String r0 = "wa.action.PopScreen"
            boolean r0 = r6.equals(r0)
            r9 = 35
            goto L_0x04bb
        L_0x0474:
            java.lang.String r0 = "wa.action.FormatString"
            boolean r0 = r6.equals(r0)
            r9 = 36
            goto L_0x04bb
        L_0x047d:
            java.lang.String r0 = "bk.action.io.DebugToast"
            boolean r0 = r6.equals(r0)
            r9 = 37
            goto L_0x04bb
        L_0x0486:
            java.lang.String r0 = "wa.action.DismissDialog"
            boolean r0 = r6.equals(r0)
            r9 = 38
            goto L_0x04bb
        L_0x048f:
            java.lang.String r0 = "bk.action.OpenUniversalLink"
            boolean r0 = r6.equals(r0)
            r9 = 39
            goto L_0x04bb
        L_0x0498:
            java.lang.String r0 = "wa.action.ShowProgressBar"
            boolean r0 = r6.equals(r0)
            r9 = 40
            goto L_0x04bb
        L_0x04a1:
            java.lang.String r0 = "bk.action.string.MatchesRegex"
            boolean r0 = r6.equals(r0)
            r9 = 41
            goto L_0x04bb
        L_0x04aa:
            java.lang.String r0 = "wa.action.bloks.LaunchDialog"
            boolean r0 = r6.equals(r0)
            r9 = 42
            goto L_0x04bb
        L_0x04b3:
            java.lang.String r0 = "wa.action.FinishActivityWithResult"
            boolean r0 = r6.equals(r0)
            r9 = 43
        L_0x04bb:
            if (r0 != 0) goto L_0x0020
            goto L_0x001f
        L_0x04bf:
            android.app.Activity r0 = A00(r1)
            X.BBv r0 = (X.C22538BBv) r0
            X.91q r0 = (X.AnonymousClass91q) r0
            X.A4a r5 = r0.A0J
            long r3 = r5.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04df
            X.11P r0 = r5.A01
            long r2 = X.AnonymousClass11P.A01(r0)
            long r0 = r5.A00
            long r2 = r2 - r0
        L_0x04da:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            return r0
        L_0x04df:
            r2 = -1
            goto L_0x04da
        L_0x04e2:
            X.9mw r2 = r7.A02
            X.11S r0 = r2.A01
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A01(r0)
            X.16R r0 = r2.A02
            java.util.Map r0 = r0.A00(r1)
            return r0
        L_0x04f1:
            java.util.List r6 = r10.A00
            java.lang.String r4 = X.C17880vN.A0w(r6, r4)
            if (r4 == 0) goto L_0x0514
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0514
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0504 }
            goto L_0x0516
        L_0x0504:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NumberUtil/Invalid long value:"
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r4, r1)
            java.lang.String r0 = "Whatsapp"
            android.util.Log.d(r0, r1, r2)
        L_0x0514:
            r4 = 0
        L_0x0516:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            java.lang.String r3 = X.C17880vN.A0w(r6, r3)
            X.9mw r0 = r7.A02
            X.11P r0 = r0.A05
            long r0 = X.AnonymousClass11P.A01(r0)
            long r4 = r4 - r0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0583
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1074026988: goto L_0x0540;
                case -906279820: goto L_0x0552;
                case 3208676: goto L_0x0564;
                default: goto L_0x0537;
            }
        L_0x0537:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x0540:
            java.lang.String r0 = "minute"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0537
            double r2 = r1.doubleValue()
            r0 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            goto L_0x0575
        L_0x0552:
            java.lang.String r0 = "second"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0537
            double r2 = r1.doubleValue()
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x0575
        L_0x0564:
            java.lang.String r0 = "hour"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0537
            double r2 = r1.doubleValue()
            r0 = 4704985352480227328(0x414b774000000000, double:3600000.0)
        L_0x0575:
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            long r4 = r0.longValue()
            goto L_0x0537
        L_0x0583:
            r4 = -1
            goto L_0x0537
        L_0x0586:
            java.util.List r0 = r10.A00
            java.lang.String r5 = X.C17880vN.A0w(r0, r4)
            java.lang.Object r1 = r0.get(r3)
            java.util.AbstractList r1 = (java.util.AbstractList) r1
            int r0 = r1.size()
            java.lang.String[] r2 = new java.lang.String[r0]
        L_0x0598:
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x05f9
            java.lang.Object r0 = r1.get(r4)
            r2[r4] = r0
            int r4 = r4 + 1
            goto L_0x0598
        L_0x05a7:
            java.lang.String r0 = X.AnonymousClass8BT.A0t(r10, r4)
            int r2 = X.C196539vE.A00(r0)
            android.app.Activity r0 = A00(r1)
            X.BBv r0 = (X.C22538BBv) r0
            boolean r0 = r0.BcG(r2)
            goto L_0x0610
        L_0x05ba:
            java.util.List r2 = r10.A00
            java.util.Map r0 = X.AnonymousClass8BR.A16(r2, r4)
            java.lang.String r2 = X.C17880vN.A0w(r2, r3)
            android.app.Activity r1 = A00(r1)
            java.util.HashMap r0 = A02(r0)
            X.BBv r1 = (X.C22538BBv) r1
            java.lang.String r0 = r1.CBa(r2, r0)
            return r0
        L_0x05d3:
            android.app.Activity r1 = A00(r1)
            X.BBv r1 = (X.C22538BBv) r1
            X.91q r1 = (X.AnonymousClass91q) r1
            X.A4a r1 = r1.A0J
            r1.A02()
            return r0
        L_0x05e1:
            java.util.List r6 = r10.A00
            java.lang.String r5 = X.C17880vN.A0w(r6, r4)
            int r3 = X.AnonymousClass3MX.A02(r6, r3)
            java.lang.String[] r2 = new java.lang.String[r3]
        L_0x05ed:
            if (r4 >= r3) goto L_0x05f9
            int r1 = r4 + 1
            java.lang.Object r0 = r6.get(r1)
            r2[r4] = r0
            r4 = r1
            goto L_0x05ed
        L_0x05f9:
            java.lang.String r0 = java.text.MessageFormat.format(r5, r2)
            return r0
        L_0x05fe:
            java.util.List r0 = r10.A00
            java.lang.String r1 = X.C17880vN.A0w(r0, r4)
            java.lang.String r0 = X.C17880vN.A0w(r0, r3)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            boolean r0 = X.AnonymousClass8BU.A1V(r1, r0)
        L_0x0610:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0615:
            android.app.Activity r1 = A00(r1)
            X.BBv r1 = (X.C22538BBv) r1
            X.91q r1 = (X.AnonymousClass91q) r1
            X.A4a r3 = r1.A0J
            r3.A02 = r0
            r1 = 0
            r3.A00 = r1
            return r0
        L_0x0626:
            android.app.Activity r1 = A00(r1)
            r1.finish()
            return r0
        L_0x062e:
            java.util.List r2 = r10.A00
            java.util.Map r4 = X.AnonymousClass8BR.A16(r2, r4)
            X.A45 r7 = X.A45.A01(r1, r2, r3)
            android.app.Activity r2 = A00(r1)
            java.util.HashMap r6 = A02(r4)
            java.lang.String r1 = "case"
            java.lang.Object r5 = r6.remove(r1)
            X.C17960vV.A07(r5)
            java.lang.String r5 = (java.lang.String) r5
            r4 = r2
            X.BBv r4 = (X.C22538BBv) r4
            X.B7W r2 = (X.B7W) r2
            X.8k7 r2 = (X.AnonymousClass8k7) r2
            X.A1j r3 = r2.A0A
            X.Boh r2 = r7.A00
            X.E8A r1 = r7.A01
            X.9sN r1 = r3.A01(r2, r1, r5)
            r4.CBV(r1, r5, r6)
            return r0
        L_0x0660:
            java.util.List r5 = r10.A00
            java.lang.String r8 = X.C17880vN.A0w(r5, r4)
            java.lang.Object r4 = r5.get(r3)
            boolean r1 = r4 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x06a8
            boolean r11 = X.AnonymousClass000.A1Y(r4)
        L_0x0672:
            java.lang.Object r4 = r5.get(r2)
            boolean r1 = r4 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x06a3
            boolean r1 = X.AnonymousClass000.A1Y(r4)
        L_0x067e:
            if (r1 == r3) goto L_0x06a1
            r12 = 2
            if (r1 == r2) goto L_0x0684
            r12 = 0
        L_0x0684:
            r1 = 3
            java.util.Map r2 = X.AnonymousClass8BR.A16(r5, r1)
            r1 = 4
            java.lang.Object r9 = r5.get(r1)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            X.9mw r1 = r7.A02
            java.util.HashMap r10 = A02(r2)
            r13 = -1
            X.62C r2 = X.C123756Vs.A00(r8, r9, r10, r11, r12, r13)
            X.18K r1 = r1.A07
            r1.CC7(r2)
            return r0
        L_0x06a1:
            r12 = 1
            goto L_0x0684
        L_0x06a3:
            int r1 = X.AnonymousClass000.A0M(r4)
            goto L_0x067e
        L_0x06a8:
            int r11 = X.AnonymousClass000.A0M(r4)
            goto L_0x0672
        L_0x06ad:
            java.util.List r5 = r10.A00
            java.util.Map r2 = X.AnonymousClass8BR.A16(r5, r4)
            X.A45 r8 = X.A45.A01(r1, r5, r3)
            X.9mw r3 = r7.A02
            android.app.Activity r1 = A00(r1)
            java.util.HashMap r6 = A02(r2)
            X.B7W r1 = (X.B7W) r1
            X.8k7 r1 = (X.AnonymousClass8k7) r1
            X.A1j r2 = r1.A0A
            X.0vb r1 = r3.A06
            X.9aQ r7 = new X.9aQ
            r7.<init>(r2, r1)
            X.Boh r1 = r8.A00
            X.DOZ r1 = r1.A00
            X.CXY r2 = r1.A02
            java.lang.String r1 = "message"
            java.lang.Object r5 = r6.get(r1)
            X.C17960vV.A07(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = "title"
            java.lang.String r3 = X.C108945cZ.A1G(r1, r6)
            java.lang.ref.WeakReference r1 = r2.A04
            java.lang.Object r2 = r1.get()
            android.content.Context r2 = (android.content.Context) r2
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            r1.<init>(r2)
            X.05w r4 = r1.create()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x06ff
            r4.setTitle(r3)
        L_0x06ff:
            X.0QH r1 = r4.A00
            r1.A0R = r5
            android.widget.TextView r1 = r1.A0L
            if (r1 == 0) goto L_0x070a
            r1.setText(r5)
        L_0x070a:
            r1 = 0
            r4.setCanceledOnTouchOutside(r1)
            X.A1j r5 = r7.A00
            X.Boh r3 = r8.A00
            X.E8A r2 = r8.A01
            java.lang.String r1 = "alert_dialog"
            X.9sN r5 = r5.A01(r3, r2, r1)
            java.lang.String r1 = "button_info"
            java.lang.String r2 = X.C108945cZ.A1G(r1, r6)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            r6 = -1
            if (r1 != 0) goto L_0x077d
            java.lang.String r1 = "\\|"
            java.lang.String[] r7 = r2.split(r1)
            r6 = 0
        L_0x072e:
            int r2 = r7.length
            r1 = 2
            int r2 = r2 - r1
            if (r6 > r2) goto L_0x0790
            int r1 = r6 + 1
            r3 = r7[r1]
            r1 = 5
            X.A9p r2 = new X.A9p
            r2.<init>(r4, r5, r1)
            r8 = r7[r6]
            int r1 = r8.hashCode()
            switch(r1) {
                case -518392103: goto L_0x076c;
                case 1820734407: goto L_0x075c;
                case 2113821835: goto L_0x074d;
                default: goto L_0x0746;
            }
        L_0x0746:
            r1 = -1
        L_0x0747:
            r4.A08(r1, r3, r2)
            int r6 = r6 + 2
            goto L_0x072e
        L_0x074d:
            java.lang.String r1 = "positive_btn_label"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0746
            r1 = 6
            X.A9p r2 = new X.A9p
            r2.<init>(r4, r5, r1)
            goto L_0x0746
        L_0x075c:
            java.lang.String r1 = "negative_btn_label"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0746
            r1 = 7
            X.A9p r2 = new X.A9p
            r2.<init>(r4, r5, r1)
            r1 = -2
            goto L_0x0747
        L_0x076c:
            java.lang.String r1 = "neutral_btn_label"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0746
            r1 = 8
            X.A9p r2 = new X.A9p
            r2.<init>(r4, r5, r1)
            r1 = -3
            goto L_0x0747
        L_0x077d:
            X.0vb r2 = r7.A01
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            java.lang.String r3 = r2.A09(r1)
            r2 = 9
            X.A9p r1 = new X.A9p
            r1.<init>(r4, r5, r2)
            r4.A08(r6, r3, r1)
        L_0x0790:
            r2 = 0
            X.A9x r1 = new X.A9x
            r1.<init>(r5, r2)
            r4.setOnKeyListener(r1)
            X.A9w r1 = X.C20160A9w.A00(r5, r2)
            r4.setOnDismissListener(r1)
            r4.show()
            return r0
        L_0x07a4:
            java.lang.String r4 = X.AnonymousClass8BT.A0t(r10, r4)
            android.app.Activity r3 = A00(r1)
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r1 = android.net.Uri.parse(r4)
            X.AnonymousClass8BT.A14(r3, r1, r2)
            return r0
        L_0x07b6:
            java.util.List r2 = r10.A00
            java.lang.String r5 = X.C17880vN.A0w(r2, r4)
            java.util.Map r3 = X.AnonymousClass8BR.A16(r2, r3)
            X.A45 r8 = X.A45.A00(r1, r0)
            X.DOZ r2 = r1.A00
            X.CXY r7 = r2.A02
            android.app.Activity r6 = A00(r1)
            java.util.HashMap r3 = A02(r3)
            X.C180529Mx.A00 = r5
            X.C180529Mx.A01 = r3
            r4 = r6
            X.B7W r4 = (X.B7W) r4
            android.content.Intent r1 = r4.getIntent()
            android.os.Bundle r2 = r1.getExtras()
            if (r2 == 0) goto L_0x07e6
            java.lang.String r1 = "screen_name"
            r2.putString(r1, r5)
        L_0x07e6:
            X.8k7 r4 = (X.AnonymousClass8k7) r4
            X.A1j r1 = r4.A0A
            X.C181129Pg.A00(r6, r1, r8, r3)
            com.whatsapp.bloks.ui.BloksDialogFragment r1 = com.whatsapp.bloks.ui.BloksDialogFragment.A00(r5, r3)
            r4.A04 = r1
            java.lang.ref.WeakReference r1 = r7.A05
            java.lang.Object r1 = r1.get()
            X.1GP r1 = (X.AnonymousClass1GP) r1
            X.1jj r3 = new X.1jj
            r3.<init>(r1)
            r2 = 2131428247(0x7f0b0397, float:1.8478133E38)
            com.whatsapp.bloks.ui.BloksDialogFragment r1 = r4.A04
            r3.A09(r1, r2)
            X.AnonymousClass8BU.A19(r3, r5)
            return r0
        L_0x080c:
            java.util.List r6 = r10.A00
            java.lang.String r5 = X.C17880vN.A0w(r6, r4)
            java.util.Map r3 = X.AnonymousClass8BR.A16(r6, r3)
            X.A45 r8 = X.A45.A01(r1, r6, r2)
            X.DOZ r2 = r1.A00
            X.CXY r7 = r2.A02
            android.app.Activity r6 = A00(r1)
            java.util.HashMap r3 = A02(r3)
            X.C180529Mx.A00 = r5
            X.C180529Mx.A01 = r3
            r4 = r6
            X.B7W r4 = (X.B7W) r4
            android.content.Intent r1 = r4.getIntent()
            android.os.Bundle r2 = r1.getExtras()
            if (r2 == 0) goto L_0x083c
            java.lang.String r1 = "screen_name"
            r2.putString(r1, r5)
        L_0x083c:
            X.8k7 r4 = (X.AnonymousClass8k7) r4
            X.A1j r1 = r4.A0A
            X.C181129Pg.A00(r6, r1, r8, r3)
            com.whatsapp.bloks.ui.BloksDialogFragment r1 = com.whatsapp.bloks.ui.BloksDialogFragment.A00(r5, r3)
            r4.A04 = r1
            java.lang.ref.WeakReference r1 = r7.A05
            java.lang.Object r1 = r1.get()
            X.1GP r1 = (X.AnonymousClass1GP) r1
            X.1jj r3 = new X.1jj
            r3.<init>(r1)
            r2 = 2131428247(0x7f0b0397, float:1.8478133E38)
            com.whatsapp.bloks.ui.BloksDialogFragment r1 = r4.A04
            r3.A09(r1, r2)
            X.AnonymousClass8BU.A19(r3, r5)
            return r0
        L_0x0862:
            java.util.List r2 = r10.A00
            java.lang.String r8 = X.C17880vN.A0w(r2, r4)
            java.util.Map r2 = X.AnonymousClass8BR.A16(r2, r3)
            X.A45 r6 = X.A45.A00(r1, r0)
            X.9mw r4 = r7.A02
            android.app.Activity r5 = A00(r1)
            X.DOZ r1 = r1.A00
            X.CXY r7 = r1.A02
            java.util.HashMap r9 = A02(r2)
            r4.A00(r5, r6, r7, r8, r9)
            return r0
        L_0x0882:
            java.util.List r1 = r10.A00
            java.util.List r7 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r1 = "[Bloks logging] "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r6 = 0
            java.lang.String r4 = X.C17880vN.A0w(r7, r4)
            java.lang.String r1 = X.C17880vN.A0w(r7, r3)
            r5.append(r1)
            java.lang.Object r1 = r7.get(r2)
            if (r1 == 0) goto L_0x08ad
            java.lang.String r1 = " "
            r5.append(r1)
            java.lang.Object r1 = r7.get(r2)
            r5.append(r1)
        L_0x08ad:
            int r1 = r4.hashCode()
            switch(r1) {
                case 97: goto L_0x08f7;
                case 100: goto L_0x08ef;
                case 101: goto L_0x08e7;
                case 105: goto L_0x08df;
                case 118: goto L_0x08d7;
                case 119: goto L_0x08cf;
                default: goto L_0x08b4;
            }
        L_0x08b4:
            r6 = -1
        L_0x08b5:
            java.lang.String r3 = "Whatsapp"
            switch(r6) {
                case 0: goto L_0x08c7;
                case 1: goto L_0x08c7;
                case 2: goto L_0x08c7;
                case 3: goto L_0x0910;
                case 4: goto L_0x0908;
                case 5: goto L_0x0900;
                default: goto L_0x08ba;
            }
        L_0x08ba:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "[Bloks logging] incorrect level: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r4, r2)
            android.util.Log.d(r3, r1)
        L_0x08c7:
            java.lang.String r1 = r5.toString()
            android.util.Log.d(r3, r1)
            return r0
        L_0x08cf:
            java.lang.String r1 = "w"
            boolean r1 = r4.equals(r1)
            r6 = 5
            goto L_0x08fd
        L_0x08d7:
            java.lang.String r1 = "v"
            boolean r1 = r4.equals(r1)
            r6 = 4
            goto L_0x08fd
        L_0x08df:
            java.lang.String r1 = "i"
            boolean r1 = r4.equals(r1)
            r6 = 3
            goto L_0x08fd
        L_0x08e7:
            java.lang.String r1 = "e"
            boolean r1 = r4.equals(r1)
            r6 = 2
            goto L_0x08fd
        L_0x08ef:
            java.lang.String r1 = "d"
            boolean r1 = r4.equals(r1)
            r6 = 1
            goto L_0x08fd
        L_0x08f7:
            java.lang.String r1 = "a"
            boolean r1 = r4.equals(r1)
        L_0x08fd:
            if (r1 != 0) goto L_0x08b5
            goto L_0x08b4
        L_0x0900:
            java.lang.String r1 = r5.toString()
            android.util.Log.w(r3, r1)
            return r0
        L_0x0908:
            java.lang.String r1 = r5.toString()
            android.util.Log.v(r3, r1)
            return r0
        L_0x0910:
            java.lang.String r1 = r5.toString()
            android.util.Log.i(r3, r1)
            return r0
        L_0x0918:
            java.lang.String r2 = X.AnonymousClass8BT.A0t(r10, r4)
            X.9mw r1 = r7.A02
            X.1KB r1 = r1.A00
            r1.A0G(r2, r4)
            return r0
        L_0x0924:
            java.util.List r5 = r10.A00
            java.lang.String r8 = X.C17880vN.A0w(r5, r4)
            java.util.Map r3 = X.AnonymousClass8BR.A16(r5, r3)
            X.A45 r6 = X.A45.A01(r1, r5, r2)
            X.9mw r4 = r7.A02
            android.app.Activity r5 = A00(r1)
            X.DOZ r1 = r1.A00
            X.CXY r7 = r1.A02
            java.util.HashMap r9 = A02(r3)
            r4.A00(r5, r6, r7, r8, r9)
            return r0
        L_0x0944:
            java.util.List r2 = r10.A00
            int r6 = X.AnonymousClass001.A0n(r2, r4)
            java.util.Map r2 = X.AnonymousClass8BR.A16(r2, r3)
            android.app.Activity r5 = A00(r1)
            if (r2 == 0) goto L_0x096e
            java.util.HashMap r4 = A02(r2)
        L_0x0958:
            r3 = 0
            if (r6 == 0) goto L_0x095c
            r3 = -1
        L_0x095c:
            android.content.Intent r2 = r5.getIntent()
            if (r4 == 0) goto L_0x0967
            java.lang.String r1 = "finish_activity_result"
            r2.putExtra(r1, r4)
        L_0x0967:
            r5.setResult(r3, r2)
            r5.finish()
            return r0
        L_0x096e:
            r4 = r0
            goto L_0x0958
        L_0x0970:
            java.lang.Object r0 = r1.peek()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.String r0 = X.C108945cZ.A1G(r2, r0)
            return r0
        L_0x097b:
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r3, r3)     // Catch:{ NullPointerException | SecurityException -> 0x0983 }
            r2.setPrimaryClip(r1)     // Catch:{ NullPointerException | SecurityException -> 0x0983 }
            return r0
        L_0x0983:
            r2 = move-exception
            java.lang.String r1 = "bkinterpreter/clipboard/"
            com.whatsapp.util.Log.e(r1, r2)
            return r0
        L_0x098a:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "WaExtensions/GetChildNode Cannot find the child node ["
            goto L_0x0997
        L_0x0991:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "WaExtensions/GetChildNode Cannot find the attribute ["
        L_0x0997:
            r3.append(r1)
            r3.append(r2)
            r3.append(r8)
            goto L_0x09b2
        L_0x09a1:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "WaExtensions/Bloks function: ["
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = "] not implemented on client"
            r3.append(r1)
        L_0x09b2:
            java.lang.String r1 = r3.toString()
            android.util.Log.d(r5, r1)
            return r0
        L_0x09ba:
            java.util.Iterator r1 = X.C17890vO.A0k(r4)
            java.lang.String r5 = X.C17880vN.A0v(r1)
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"
            X.C18070vi.A0z(r4, r1)
            java.util.Map r4 = (java.util.Map) r4
            X.1ca r5 = X.A71.A00(r8, r7, r5, r4)
            X.00H r1 = r8.A01
            r18 = r1
            java.lang.String r16 = X.C17890vO.A0T(r18)
            r1 = 4
            X.1MD[] r4 = new X.AnonymousClass1MD[r1]
            X.8v4 r15 = X.C173438v4.A00
            java.lang.String r1 = "to"
            X.C17880vN.A1I(r15, r1, r4, r13)
            X.C17880vN.A1Q(r14, r11, r4, r3)
            java.lang.String r3 = "id"
            r1 = r16
            X.C17880vN.A1Q(r3, r1, r4, r2)
            X.C17880vN.A1Q(r12, r10, r4, r6)
            X.1ca r5 = X.AnonymousClass8BT.A0a(r5, r4)
            X.1OZ r3 = X.C17880vN.A0U(r18)
            r2 = 6
            X.Acl r1 = new X.Acl
            r1.<init>(r7, r9, r8, r2)
            long r8 = X.C17890vO.A03(r17)
            r7 = 204(0xcc, float:2.86E-43)
            r4 = r1
            r6 = r16
            r3.A0I(r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALR.BKe(X.9zJ, X.CkC, java.lang.String):java.lang.Object");
    }
}
