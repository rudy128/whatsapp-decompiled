package X;

import android.app.Activity;
import android.widget.Button;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public class ALS implements C22415B6x {
    public final C22415B6x A00 = new C26970DNs();
    public final A6L A01;

    public static HashMap A0B(Map map) {
        String obj;
        String obj2;
        String obj3;
        if (map == null) {
            return null;
        }
        HashMap A11 = C17880vN.A11();
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object value = A16.getValue();
            Object key = A16.getKey();
            boolean z = key instanceof Number;
            if (value == null) {
                if (z || key != null) {
                    obj3 = key.toString();
                } else {
                    obj3 = null;
                }
                A11.put(obj3, (Object) null);
            } else {
                if (z || key != null) {
                    obj = key.toString();
                } else {
                    obj = null;
                }
                Object value2 = A16.getValue();
                if ((value2 instanceof Number) || value2 != null) {
                    obj2 = value2.toString();
                } else {
                    obj2 = null;
                }
                A11.put(obj, obj2);
            }
        }
        return A11;
    }

    public static final int A00(DFL dfl) {
        if (dfl == null) {
            return 32;
        }
        String str = "adjust_pan";
        String A0D = dfl.A0D(38);
        if (A0D != null) {
            str = A0D;
        }
        switch (str.hashCode()) {
            case -1009740956:
                if (str.equals("adjust_resize")) {
                    return 16;
                }
                break;
            case -205076707:
                if (str.equals("adjust_nothing")) {
                    return 48;
                }
                break;
            case 1976678381:
                if (str.equals("adjust_pan")) {
                    return 32;
                }
                break;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Unexpected soft input mode ");
        A10.append(str);
        C25913CoX.A01("WindowSoftInputUtils", AnonymousClass000.A0y("; using default instead", A10));
        return 32;
    }

    public static long A04(Long l, String str) {
        Calendar instance;
        if (str != null) {
            instance = Calendar.getInstance(TimeZone.getTimeZone(str));
        } else {
            instance = Calendar.getInstance();
        }
        instance.setTimeInMillis(l.longValue() * 1000);
        int i = instance.get(1);
        int i2 = instance.get(2);
        int A02 = AnonymousClass8BT.A02(instance);
        Calendar instance2 = Calendar.getInstance();
        instance2.set(i, i2, A02);
        return instance2.getTimeInMillis();
    }

    public static Activity A05(C23736Boh boh) {
        return (Activity) boh.A00.A02.A00().get(2131428249);
    }

    public static C23736Boh A06(Object obj) {
        if (obj instanceof C23736Boh) {
            return (C23736Boh) obj;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(obj, A10);
        A10.append("is not an instance of ");
        throw AnonymousClass000.A0o("BloksInterpreterEnvironment", A10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.DFL A07(X.DFL r4) {
        /*
            r3 = 15932(0x3e3c, float:2.2325E-41)
            int r1 = r4.A05
            r0 = 13784(0x35d8, float:1.9315E-41)
            if (r1 != r0) goto L_0x0029
            r0 = 42
            java.lang.Object r1 = X.DFL.A00(r4, r0)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x0029
            java.util.List r1 = (java.util.List) r1
        L_0x0014:
            java.util.Iterator r2 = r1.iterator()
        L_0x0018:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r2.next()
            X.DFL r1 = (X.DFL) r1
            int r0 = r1.A05
            if (r0 != r3) goto L_0x0018
            return r1
        L_0x0029:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0014
        L_0x002e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALS.A07(X.DFL):X.DFL");
    }

    public static String A08(DFL dfl) {
        String A0D;
        List emptyList;
        int i = dfl.A05;
        if (!AnonymousClass000.A1T(i, 13647)) {
            if (i == 13784) {
                Object A002 = DFL.A00(dfl, 42);
                if (A002 instanceof List) {
                    emptyList = (List) A002;
                } else {
                    emptyList = Collections.emptyList();
                }
                Iterator it = emptyList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DFL dfl2 = (DFL) it.next();
                    if (dfl2.A05 == 15855) {
                        A0D = dfl2.A0D(40);
                        break;
                    }
                }
            } else {
                throw AnonymousClass000.A0k("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
        }
        A0D = dfl.A0D(35);
        A0D.getClass();
        return A0D;
    }

    public static String A09(DFL dfl) {
        int i = dfl.A05;
        int i2 = 40;
        if (!AnonymousClass000.A1T(i, 13647)) {
            if (i == 13784) {
                i2 = 45;
            } else {
                throw AnonymousClass000.A0k("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
        }
        String A0D = dfl.A0D(i2);
        if (A0D != null) {
            return A0D;
        }
        return "0";
    }

    public static void A0C(Button button, DFL dfl) {
        String A0D;
        if (dfl != null && button != null && (A0D = dfl.A0D(46)) != null) {
            button.setTag(2131436043, A0D);
        }
    }

    public ALS(A6L a6l) {
        this.A01 = a6l;
    }

    public static int A01(AnonymousClass00H r0, int i) {
        return C20104A7i.A00(((C189769jo) r0.get()).A00, i).A01;
    }

    public static int A02(AnonymousClass00H r0, int i) {
        return C20104A7i.A00(((C695137m) r0.get()).A06, i).A00;
    }

    public static int A03(AnonymousClass00H r1, int i, int i2) {
        return ((C189769jo) r1.get()).A00(Integer.valueOf(i), i2);
    }

    public static HashMap A0A(Map map) {
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v114, resolved type: android.app.DatePickerDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v117, resolved type: android.app.ProgressDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v642, resolved type: com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v158, resolved type: android.app.DatePickerDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v159, resolved type: android.app.DatePickerDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: android.app.DatePickerDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: android.app.DatePickerDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: android.app.DatePickerDialog} */
    /* JADX WARNING: type inference failed for: r10v5, types: [X.ALJ, X.B4m, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v9, types: [X.A45, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [X.A45, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v7, types: [X.A45, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v14, types: [X.ALJ, X.B4m, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v157, types: [X.A45, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v31, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r13v28, types: [X.ALJ, X.B4m, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1000:0x1c9b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1001:0x1c9c, code lost:
        r5 = X.AnonymousClass8BT.A0t(r12, 0);
        r1 = A05(r3);
        X.C18070vi.A0d(r1, 0);
        ((X.C57622jN) r2.A0Y.get()).A00(r1, r5, (java.lang.String) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1002:0x1cb2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1003:0x1cb3, code lost:
        r5 = X.AnonymousClass8BR.A0G(r12.A00, 0);
        r2 = A05(r3);
        r1 = X.C26970DNs.A06(r3, r12, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1004:0x1cc1, code lost:
        if (r5 == null) goto L_0x1ccb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1005:0x1cc3, code lost:
        r0 = r5.A0A(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1006:0x1cc7, code lost:
        X.A8X.A03(r2, r1, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1007:0x1cca, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1008:0x1ccb, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1009:0x1ccd, code lost:
        r7 = r12.A00;
        r10 = X.C17880vN.A0w(r7, 0);
        r13 = X.AnonymousClass001.A0n(r7, 1);
        r9 = X.AnonymousClass001.A0n(r7, 2);
        r3 = X.AnonymousClass8BR.A16(r7, 3);
        r15 = X.AnonymousClass001.A0n(r7, 4);
        r11 = (java.util.ArrayList) r7.get(5);
        r12 = A0A(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x025f, code lost:
        r2 = r12.A00;
        r1 = X.C17880vN.A0w(r2, 0);
        r2 = X.C17880vN.A0w(r2, 1);
        r3 = A05(r3).getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1010:0x1cee, code lost:
        r5 = r12.A00;
        r7 = X.C17880vN.A0w(r5, 0);
        r6 = X.C17880vN.A0w(r5, 1);
        r5 = X.AnonymousClass8BT.A08(r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1011:0x1cfc, code lost:
        if (r5 == null) goto L_0x1d0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1012:0x1cfe, code lost:
        r1 = new X.C20522AOh(r5, 17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1013:0x1d05, code lost:
        r2.A04(A05(r3), r1, r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1014:0x1d0c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1015:0x1d0d, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1016:0x1d0f, code lost:
        r7 = r12.A00;
        r10 = X.C17880vN.A0w(r7, 0);
        r13 = X.AnonymousClass001.A0n(r7, 1);
        r5 = r7.get(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1017:0x1d1f, code lost:
        if ((r5 instanceof java.lang.Boolean) == false) goto L_0x1d4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1018:0x1d21, code lost:
        r9 = X.AnonymousClass000.A1Y(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1019:0x1d25, code lost:
        r3 = X.AnonymousClass8BR.A16(r7, 3);
        r11 = (java.util.ArrayList) r7.get(4);
        r12 = A0A(r3);
        r15 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0271, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1020:0x1d34, code lost:
        if (r9 == 1) goto L_0x1d4a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1021:0x1d36, code lost:
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1022:0x1d37, code lost:
        if (r9 == 2) goto L_0x1d3a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1023:0x1d39, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1024:0x1d3a, code lost:
        ((X.AnonymousClass18K) r2.A0k.get()).CC7(X.C123756Vs.A00(r10, r11, r12, r13, r14, r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1025:0x1d49, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1026:0x1d4a, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1027:0x1d4c, code lost:
        r9 = X.AnonymousClass000.A0M(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1028:0x1d51, code lost:
        r2 = r12.A00;
        r11 = X.C17880vN.A0w(r2, 0);
        r0 = X.C17880vN.A0w(r2, 1);
        r10 = X.C17880vN.A0w(r2, 2);
        r9 = X.C17880vN.A0w(r2, 3);
        r7 = X.C17880vN.A0w(r2, 4);
        r6 = X.AnonymousClass8BT.A08(r2, 5);
        r5 = X.AnonymousClass8BT.A08(r2, 6);
        r1 = X.AnonymousClass8BT.A08(r2, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1029:0x1d75, code lost:
        if (r6 == null) goto L_0x1dd9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0273, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1030:0x1d77, code lost:
        r8 = new java.lang.Object();
        r8.A00 = r3;
        r8.A01 = r6;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1031:0x1d80, code lost:
        if (r5 == null) goto L_0x1dd7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1032:0x1d82, code lost:
        r2 = new java.lang.Object();
        r2.A00 = r3;
        r2.A01 = r5;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1033:0x1d8b, code lost:
        if (r1 == null) goto L_0x1dd5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1034:0x1d8d, code lost:
        r6 = new java.lang.Object();
        r6.A00 = r3;
        r6.A01 = r1;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1035:0x1d96, code lost:
        r5 = (X.AnonymousClass1FB) A05(r3);
        r3 = X.AnonymousClass4a6.A00(r5);
        r3.A0k(r11);
        r3.A0j(r0);
        r3.A0i(r5, new X.C20338AGu(r8, 40), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1036:0x1db0, code lost:
        if (r9 == null) goto L_0x1dbc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1037:0x1db2, code lost:
        r3.A0h(r5, new X.C20338AGu(r2, 41), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1038:0x1dbc, code lost:
        if (r7 == null) goto L_0x1dd1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1039:0x1dbe, code lost:
        r2 = new X.C20338AGu(r6, 39);
        r1 = r3.A00;
        r0 = r3.A01;
        r1.A0K(r0, r7);
        r0.A01.A0A(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1040:0x1dd1, code lost:
        X.AnonymousClass3MY.A1G(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1041:0x1dd4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1042:0x1dd5, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1043:0x1dd7, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1044:0x1dd9, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1045:0x1ddb, code lost:
        r3 = r12.A00;
        r10 = A08(X.AnonymousClass8BR.A0G(r3, 0));
        r1 = X.AnonymousClass8BR.A16(r3, 1);
        r6 = X.AnonymousClass001.A0n(r3, 3);
        r3 = A0A(r1);
        r5 = (X.C185209cD) r2.A0f.get();
        r5.A00.A03(new X.ADL(X.C17890vO.A03(r6), "PRELOAD", false), new X.C21153AfO(r5, r10), true, r10, X.C108945cZ.A1G("params", r3), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1046:0x1e19, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1047:0x1e1a, code lost:
        r3 = r12.A00;
        ((X.C20000A2o) r2.A0C.get()).A05(new X.C178139By((X.C197789xG) r2.A0D.get(), A08(X.AnonymousClass8BR.A0G(r3, 0)), X.C108945cZ.A1G("params", A0A(X.AnonymousClass8BR.A16(r3, 1)))), "PRELOAD");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1048:0x1e4c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1049:0x1e4d, code lost:
        r0 = r12.A00;
        r5 = X.AnonymousClass8BR.A0G(r0, 0);
        r6 = X.AnonymousClass8BR.A0G(r0, 0);
        r2 = A0B(X.AnonymousClass8BR.A16(r0, 2));
        r1 = A08(r5);
        r12 = A09(r5);
        r10 = new java.lang.Object();
        r10.A02 = r1;
        r9 = X.C26235CvV.A00(r3, r6);
        r0 = new X.C187839gS();
        r0.A01 = r1;
        r0.A02 = r2;
        r8 = new X.C20368AHy(r0);
        r1 = A07(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0279, code lost:
        switch(r2.hashCode()) {
            case -891985903: goto L_0x02ba;
            case 64711720: goto L_0x02a9;
            case 97526364: goto L_0x0297;
            case 1958052158: goto L_0x0286;
            default: goto L_0x027c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1050:0x1e84, code lost:
        if (r1 == null) goto L_0x1eb2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1051:0x1e86, code lost:
        r1 = r1.A0A(40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1052:0x1e8c, code lost:
        if (r1 == null) goto L_0x1eb0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1053:0x1e8e, code lost:
        r2 = new X.ALW(r3, r1, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1054:0x1e94, code lost:
        r1 = com.whatsapp.voipcalling.CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
        r0 = r5.A0D(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1055:0x1e9a, code lost:
        if (r0 == null) goto L_0x1e9d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1056:0x1e9c, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1057:0x1e9d, code lost:
        X.A8X.A02(r3.A00.A00, r8, r9, r10, new X.C166548d4(r2, X.C25301Cd5.A00(r1), 32), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1058:0x1eaf, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1059:0x1eb0, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x027c, code lost:
        X.C17900vP.A0e("WABLOKS: getIntentParameter type not supported: ", r2, X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1060:0x1eb2, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1061:0x1eb4, code lost:
        r12 = r12.A00;
        r5 = X.C17880vN.A0w(r12, 0);
        r10 = X.AnonymousClass8BR.A16(r12, 1);
        r8 = X.AnonymousClass8BR.A0G(r12, 2);
        r0 = (java.util.List) r12.get(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1062:0x1ec8, code lost:
        if (r0 == null) goto L_0x1f86;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1063:0x1eca, code lost:
        r1 = r0.iterator();
        r9 = null;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1065:0x1ed4, code lost:
        if (r1.hasNext() == false) goto L_0x1ee6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1066:0x1ed6, code lost:
        r0 = (X.DFL) r1.next();
        r9 = r0.A0D(35);
        r12 = r0.A0D(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1067:0x1ee4, code lost:
        if (r9 == null) goto L_0x1ed0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1068:0x1ee6, code lost:
        r6 = r8.A0A(36);
        r11 = r8.A0A(35);
        r8 = X.C108945cZ.A1G("params", A0A(r10));
        r7 = new X.C20522AOh(r6, 14);
        r6 = new X.C20522AOh(r11, 15);
        r13 = (X.C54602eP) r2.A08.get();
        X.C18070vi.A0d(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1069:0x1f12, code lost:
        if (r5 == null) goto L_0x1f90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0285, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1071:0x1f18, code lost:
        if (r5.length() == 0) goto L_0x1f90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1072:0x1f1a, code lost:
        r0 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1073:0x1f1c, code lost:
        if (r0 == null) goto L_0x1f8d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1074:0x1f1e, code lost:
        r2 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1076:0x1f26, code lost:
        if (r2.hasNext() == false) goto L_0x1f65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1077:0x1f28, code lost:
        r1 = (X.C185429cZ) r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1078:0x1f34, code lost:
        if ("secure_v0".equals(r9) == false) goto L_0x1f22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1079:0x1f36, code lost:
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1080:0x1f38, code lost:
        if (r0 == null) goto L_0x1f8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1081:0x1f3a, code lost:
        r11 = (X.AnonymousClass6OZ) r0.get();
        r10 = new X.C21157AfS(r1, r7, r6, r3);
        r0 = r11.A00.A00.A00;
        r11.A01(r10, new X.C122266Oj(X.AnonymousClass3MY.A0N(r0), X.AnonymousClass10E.A6O(r0), X.AnonymousClass8BU.A0K(r0), r12), X.AnonymousClass8BR.A0B(r5, r8), 45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1082:0x1f65, code lost:
        r0 = r13.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1083:0x1f67, code lost:
        if (r0 == null) goto L_0x1fac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1084:0x1f69, code lost:
        r1 = (X.C185199cC) r0.get();
        r1.A00.A04((X.ADL) null, new X.AnonymousClass7OT(r3, r6, r1, r7, 1), (java.lang.Boolean) null, r5, r8, (java.lang.String) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1085:0x1f85, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1086:0x1f86, code lost:
        r12 = null;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1087:0x1f8a, code lost:
        r0 = "bloksPayloadIqHelperLazy";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1088:0x1f8d, code lost:
        r0 = "asyncActionWithDataManifestV2ActionHandlerSet";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1089:0x1f90, code lost:
        X.C17960vV.A0F(false, "null app id");
        r0 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x028c, code lost:
        if (r2.equals("integer") == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1090:0x1f98, code lost:
        if (r0 == null) goto L_0x1fa9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1091:0x1f9a, code lost:
        X.C17880vN.A0d(r0).CGP(new X.C21451AkI(r3, r6.A01, 15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1092:0x1fa8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1093:0x1fa9, code lost:
        r0 = "mainThreadHandler";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1094:0x1fac, code lost:
        r0 = "asyncActionHelperLazy";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1095:0x1fae, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1096:0x1fb1, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1097:0x1fb2, code lost:
        X.A8X.A05(r1, new X.ALW(r3, r2, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1098:0x1fba, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007d, code lost:
        if (r0 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1101:0x1fcb, code lost:
        return java.lang.Boolean.toString(X.C18020vd.A05(X.C18040vf.A02, X.C17880vN.A0P(r2.A05), r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1103:0x1fdc, code lost:
        return java.lang.Integer.toString(X.C18020vd.A00(X.C18040vf.A02, X.C17880vN.A0P(r2.A05), r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1105:0x1fe7, code lost:
        return X.C17880vN.A0P(r2.A05).A0I(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1106:0x1fe8, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1107:0x1fe9, code lost:
        r0 = "Bloks: WaBkGlobalInterpreterExtImpl/getAbPropValue/exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1108:0x1fed, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1109:0x1fee, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0296, code lost:
        return java.lang.Integer.toString(r3.getIntExtra(r1, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1110:0x1fef, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1111:0x1ff0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1112:0x1ff1, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1114:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1116:?, code lost:
        r1.A00(X.AnonymousClass00R.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1117:0x1ffb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1118:0x1ffc, code lost:
        r1.A00(X.AnonymousClass00R.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1119:0x2001, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1120:0x2002, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1122:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1123:0x2007, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1125:?, code lost:
        X.AnonymousClass0DT.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1126:0x200b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1127:0x200c, code lost:
        r1.A00(X.AnonymousClass00R.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1128:0x2011, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1129:0x2012, code lost:
        r0 = X.AnonymousClass00R.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x029d, code lost:
        if (r2.equals("float") == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1131:0x2015, code lost:
        r0 = X.AnonymousClass00R.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1133:0x2018, code lost:
        r0 = X.AnonymousClass00R.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1135:0x201a, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1136:0x201d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1138:0x2024, code lost:
        throw X.AnonymousClass000.A0n("Cannot unwind without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1139:0x2025, code lost:
        r1 = r2.A04;
        r0 = r1.A00;
        r3 = A03(r0, r9, r5);
        r5 = A01(r0, r5);
        r2 = (X.C695137m) r1.A01.get();
        r3 = new X.AnonymousClass2A6(r2.A00, r2, java.lang.Integer.valueOf(r3), r5);
        r3.A02 = r7;
        r3.A00 = -1;
        r5 = X.C17890vO.A0i(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1141:0x2052, code lost:
        if (r5.hasNext() == false) goto L_0x20f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1142:0x2054, code lost:
        r0 = X.AnonymousClass000.A16(r5);
        r2 = X.C17880vN.A0x(r0);
        r1 = r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1143:0x2062, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x206a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1144:0x2064, code lost:
        r1 = (java.lang.String) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1145:0x2066, code lost:
        r3.addPointData(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1147:0x206c, code lost:
        if ((r1 instanceof java.lang.Integer) == false) goto L_0x2076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1148:0x206e, code lost:
        r3.addPointData(r2, X.AnonymousClass000.A0M(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a8, code lost:
        return java.lang.Float.toString(r3.getFloatExtra(r1, 0.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1150:0x2078, code lost:
        if ((r1 instanceof java.lang.Long) == false) goto L_0x2082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1151:0x207a, code lost:
        r3.addPointData(r2, X.C17880vN.A05(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1153:0x2084, code lost:
        if ((r1 instanceof java.lang.Double) == false) goto L_0x208e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1154:0x2086, code lost:
        r3.addPointData(r2, X.AnonymousClass8BR.A00(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1156:0x2090, code lost:
        if ((r1 instanceof java.lang.Float) == false) goto L_0x209a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1157:0x2092, code lost:
        r3.addPointData(r2, X.AnonymousClass000.A04(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1159:0x209c, code lost:
        if ((r1 instanceof java.lang.Boolean) == false) goto L_0x20a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1160:0x209e, code lost:
        r3.addPointData(r2, X.AnonymousClass000.A1Y(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1162:0x20a8, code lost:
        if ((r1 instanceof int[]) == false) goto L_0x20b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1163:0x20aa, code lost:
        r3.addPointData(r2, (int[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1165:0x20b2, code lost:
        if ((r1 instanceof long[]) == false) goto L_0x20ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1166:0x20b4, code lost:
        r3.addPointData(r2, (long[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1168:0x20bc, code lost:
        if ((r1 instanceof java.lang.Object[]) == false) goto L_0x20c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02af, code lost:
        if (r2.equals("boolean") == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1170:0x20c0, code lost:
        if ((r1 instanceof java.lang.String[]) == false) goto L_0x20c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1171:0x20c2, code lost:
        r3.addPointData(r2, (java.lang.String[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1173:0x20ca, code lost:
        if ((r1 instanceof double[]) == false) goto L_0x20d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1174:0x20cc, code lost:
        r3.addPointData(r2, (double[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1176:0x20d5, code lost:
        if ((r1 instanceof float[]) == false) goto L_0x20de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1177:0x20d7, code lost:
        r3.addPointData(r2, (float[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1179:0x20e0, code lost:
        if ((r1 instanceof boolean[]) == false) goto L_0x20e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1180:0x20e2, code lost:
        r3.addPointData(r2, (boolean[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1181:0x20e9, code lost:
        if (r1 == null) goto L_0x204e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1182:0x20eb, code lost:
        r1 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1183:0x20f1, code lost:
        r3.pointEditingCompleted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1184:0x20f4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1186:?, code lost:
        r1.setPrimaryClip(android.content.ClipData.newPlainText(r3, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1187:0x20fc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1188:0x20fd, code lost:
        com.whatsapp.util.Log.e("bkinterpreter/clipboard/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b9, code lost:
        return X.AnonymousClass8BS.A0b(r3.getBooleanExtra(r1, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1190:0x2102, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1191:0x2103, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1192:0x2104, code lost:
        r0 = "Error during annotations map parse";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1193:0x2106, code lost:
        com.whatsapp.util.Log.e(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1194:0x2109, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1195:0x210a, code lost:
        ((X.A2V) r2.A0d.get()).A01(r6).A02(new X.AnonymousClass7NS(r5.A00()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1196:0x2122, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007f, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c0, code lost:
        if (r2.equals("string") == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c6, code lost:
        return r3.getStringExtra(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c7, code lost:
        X.C18070vi.A0d(r12, 0);
        X.C18070vi.A0d(r3, 1);
        r11 = r12.A00(0);
        X.C18070vi.A0z(r11, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        r11 = (X.DOZ) r11;
        r10 = r12.A00(1);
        X.AnonymousClass8BR.A1I(r10);
        r10 = (java.lang.String) r10;
        r1 = r12.A00(2);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.Number");
        r7 = X.AnonymousClass000.A0M(r1);
        r1 = r12.A00(3);
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.Number");
        r15 = X.AnonymousClass000.A0M(r1);
        r1 = r12.A00;
        r6 = X.AnonymousClass8BT.A08(r1, 4);
        r5 = X.AnonymousClass8BT.A08(r1, 5);
        r14 = r11.A00;
        r1 = new X.C190969lo(r11, r3, r6, r5);
        r11 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1244:?, code lost:
        return r10.A00.BKe(r12, r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1245:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1246:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1247:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1248:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1249:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x030b, code lost:
        if (r15 <= 0) goto L_0x200c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1250:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1251:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1252:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1253:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1254:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1255:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1256:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1257:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1258:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1259:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x030d, code lost:
        if (r7 <= 0) goto L_0x200c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1260:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1261:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1262:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1263:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1264:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1265:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1266:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1267:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1268:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1269:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1270:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1271:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1272:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1273:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1274:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1275:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1276:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1277:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1278:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1279:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r3 = X.C26215Cuu.A01(r10);
        r5 = r3.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1280:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1281:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1282:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1283:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1284:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1285:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1286:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1287:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1288:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1289:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0317, code lost:
        if (r5 != null) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1290:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1291:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1292:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1293:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1294:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1295:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1296:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1297:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1298:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1299:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0319, code lost:
        r1.A00(X.AnonymousClass00R.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0080, code lost:
        if (r6 == null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1300:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1301:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1302:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1303:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0320, code lost:
        r17 = X.C108945cZ.A17(r5);
        r5 = X.C26303CxM.A0M;
        r6 = new X.C26303CxM(r17.getCanonicalPath()).A0Z(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0336, code lost:
        if (r6 == 6) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x033a, code lost:
        if (r6 != 8) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x033c, code lost:
        r11 = r7;
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x033e, code lost:
        r8 = r14.getContentResolver().openInputStream(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0346, code lost:
        if (r8 != null) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0348, code lost:
        r1.A00(X.AnonymousClass00R.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r5 = new android.graphics.BitmapFactory.Options();
        r5.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeStream(r8, (android.graphics.Rect) null, r5);
        r12 = new android.graphics.Rect(0, 0, r5.outWidth, r5.outHeight);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0082, code lost:
        r9 = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r8.close();
        r6 = r12.width();
        r5 = r12.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x036d, code lost:
        if (r6 <= 0) goto L_0x1ffc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x036f, code lost:
        if (r5 <= 0) goto L_0x1ffc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0371, code lost:
        if (r6 > r7) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0373, code lost:
        if (r5 > r11) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0375, code lost:
        r7 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0377, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0379, code lost:
        X.AnonymousClass8BT.A19(r1.A01, r7, X.C18070vi.A0O(r3.toString(), X.AnonymousClass3MX.A1b(r1.A00, 0), 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x038e, code lost:
        r10 = new android.graphics.Rect(0, 0, r7, r11);
        r10 = java.lang.Math.max((((double) r12.width()) * 1.0d) / ((double) r10.width()), (((double) r12.height()) * 1.0d) / ((double) r10.height()));
        r10 = new android.graphics.Rect(0, 0, (int) (((double) r12.width()) / r10), (int) (((double) r12.height()) / r10));
        r8 = r14.getContentResolver().openInputStream(r3);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008a, code lost:
        if (r1 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03cd, code lost:
        if (r8 == null) goto L_0x1ff6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r7 = android.graphics.BitmapFactory.decodeStream(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03d3, code lost:
        if (r7 == null) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03d5, code lost:
        r6 = android.graphics.Bitmap.createScaledBitmap(r7, r10.width(), r10.height(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03e4, code lost:
        if (r6 == null) goto L_0x1ff6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03e6, code lost:
        r5 = ((X.C218617r) r2.A0Q.get()).A0a(X.AnonymousClass000.A0y(".jpg", X.C17900vP.A0G()));
        r3 = X.C108945cZ.A19(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008c, code lost:
        r9.setTimeInMillis(r1.longValue() * 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r6.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, r3);
        r3.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r3.close();
        r3 = new X.C26303CxM(r5.getCanonicalPath());
        r0 = new X.C26303CxM(r17.getCanonicalPath()).A0Z(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0423, code lost:
        if (r0 == 0) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0425, code lost:
        r3.A0c("Orientation", java.lang.String.valueOf(r0));
        r3.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x042f, code lost:
        r2 = android.net.Uri.fromFile(r5);
        X.C18070vi.A0d(r2, 0);
        r6 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0438, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x043a, code lost:
        X.AnonymousClass8BT.A19(r1.A01, r6, X.C18070vi.A0O(r2.toString(), X.AnonymousClass3MX.A1b(r1.A00, 0), 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0450, code lost:
        r0 = (android.app.Dialog) r3.A00.A02.A00().get(2131428251);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0461, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0463, code lost:
        r0.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0466, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0467, code lost:
        X.C18070vi.A0d(r12, 0);
        X.C18070vi.A0d(r3, 1);
        r6 = r12.A00(0);
        X.C18070vi.A0z(r6, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        r6 = (X.DOZ) r6;
        r5 = r12.A00(1);
        X.C18070vi.A0z(r5, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r5 = (X.DFL) r5;
        r8 = r5.A0A(35);
        r5 = r5.A0D(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x048b, code lost:
        if (r5 == null) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0491, code lost:
        if (r5.isEmpty() != false) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0497, code lost:
        switch(r5.hashCode()) {
            case -1367751899: goto L_0x04cd;
            case -196315310: goto L_0x04b9;
            case -94789412: goto L_0x04ae;
            default: goto L_0x049a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x049a, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x049b, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009b, code lost:
        switch(r12.hashCode()) {
            case -1160567386: goto L_0x00d4;
            case 3076014: goto L_0x00cb;
            case 3560141: goto L_0x00b4;
            default: goto L_0x009e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x049d, code lost:
        r2.A03(A05(r3), new X.C20520AOf(r6, r3, r8), new java.lang.String[]{r7});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04ad, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04b4, code lost:
        if (r5.equals("read_contacts") == false) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04b6, code lost:
        r7 = "android.permission.READ_CONTACTS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04bf, code lost:
        if (r5.equals("gallery") == false) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04c5, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04c7, code lost:
        r7 = "android.permission.READ_MEDIA_IMAGES";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009e, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Unexpected picker mode: ");
        r1.append(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04ca, code lost:
        r7 = "android.permission.WRITE_EXTERNAL_STORAGE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04d3, code lost:
        if (r5.equals("camera") == false) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04d5, code lost:
        r7 = "android.permission.CAMERA";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04d8, code lost:
        r0 = ((X.CTN) r2.A09.get()).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04e3, code lost:
        r0 = ((X.CTN) r2.A09.get()).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04ed, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04ef, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04f2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04f3, code lost:
        r2 = r3.A00;
        r1 = r12.A00;
        r5 = X.C17880vN.A0w(r1, 0);
        r1.get(1);
        r1 = r2.A00;
        X.C18070vi.A0d(r5, 1);
        r7 = X.C20101A7f.A03(X.C20101A7f.A00(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00aa, code lost:
        X.C25913CoX.A01("CDSDateTimePickerUtils", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x050b, code lost:
        if (r7 == null) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0511, code lost:
        if (r7.isEmpty() != false) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0513, code lost:
        r6 = X.AnonymousClass000.A13();
        r1 = X.AnonymousClass3MX.A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x051b, code lost:
        if (r1 < 0) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x051d, code lost:
        r3 = r1 - 1;
        r2 = (androidx.fragment.app.Fragment) r7.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0527, code lost:
        if ((r2 instanceof com.whatsapp.bloks.components.BkCdsBottomSheetFragment) == false) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x052b, code lost:
        if ((r2 instanceof androidx.fragment.app.DialogFragment) == false) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x052d, code lost:
        r2 = (androidx.fragment.app.DialogFragment) r2;
        r6.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0538, code lost:
        if (((com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r2).A2F(r5) == false) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x053e, code lost:
        if (X.C17880vN.A1X(r6) == false) goto L_0x201e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0540, code lost:
        r8 = r6.size() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0546, code lost:
        if (r9 >= r8) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0548, code lost:
        r7 = (androidx.fragment.app.DialogFragment) r6.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x054e, code lost:
        if (r7 == null) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0550, code lost:
        r7 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r7;
        r3 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A00(r7);
        r3.A09 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x055c, code lost:
        if (r3.A06 != X.C0B.A05) goto L_0x056e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x055e, code lost:
        r3.A0A = true;
        r3.A00 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0562, code lost:
        r1 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0564, code lost:
        if (r1 == null) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0566, code lost:
        com.whatsapp.avatar.editor.AvatarEditorLauncherFSActivity.A0V(r1.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x056b, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x056e, code lost:
        r1 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0570, code lost:
        if (r1 == null) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0572, code lost:
        r3.A0A = true;
        r3.A00 = 1;
        r1.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x057a, code lost:
        if (r3 < 0) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x057c, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x057e, code lost:
        r6 = X.AnonymousClass000.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ba, code lost:
        if (r12.equals("time") == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0583, code lost:
        r1 = (androidx.fragment.app.DialogFragment) r6.get(r6.size() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x058f, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0591, code lost:
        r1 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r1;
        r3 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A00(r1);
        r2 = r1.A14();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05a1, code lost:
        if (r3.A0C.size() == 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05a3, code lost:
        r3.A07(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05a6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05a7, code lost:
        r12.A00(0);
        A05(r3);
        r1 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05b3, code lost:
        if (r1.A07() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05b5, code lost:
        r1.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x05be, code lost:
        throw X.AnonymousClass000.A0s("routeToNativeScreen");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bc, code lost:
        X.AnonymousClass9OQ.A00(r14, r7, r3, r19, r15, r9, r7.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05bf, code lost:
        r12.A00(0);
        r3 = r12.A00;
        r3.get(1);
        r3.get(2);
        r1 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05d0, code lost:
        if (r1.A07() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05d2, code lost:
        r1.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05db, code lost:
        throw X.AnonymousClass000.A0s("editBusinessName");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05dc, code lost:
        ((X.C138826xl) r2.A0B.get()).A00(A05(r3));
        r1 = X.C138816xk.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05f1, code lost:
        if (r1.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05f3, code lost:
        r0 = ((androidx.fragment.app.Fragment) r1.peek()).A1E();
        X.C18070vi.A0X(r0);
        r0.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0603, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0604, code lost:
        r5 = r12.A00;
        r6 = X.AnonymousClass001.A0n(r5, 0);
        r3 = X.AnonymousClass001.A0n(r5, 1);
        r5.get(2);
        r2 = r2.A04;
        r0 = r2.A00;
        r5 = A03(r0, r3, r6);
        r3 = A01(r0, r6);
        r1 = r2.A01;
        r2 = X.A47.A00(r2, A02(r1, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0627, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ca, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0629, code lost:
        r2.markerStart(r3, r5);
        r2.markerAnnotate(r3, r5, "bloks_display_name", X.C20104A7i.A00(((X.C695137m) r1.get()).A06, r6).A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x063f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0640, code lost:
        r1 = r12.A00;
        r7 = X.C17880vN.A0w(r1, 0);
        r6 = X.AnonymousClass000.A1Y(r1.get(1));
        r5 = (android.app.ProgressDialog) r3.A00.A02.A00().get(2131428251);
        r3 = A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0663, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0669, code lost:
        if (r5.isShowing() == false) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x066b, code lost:
        r5.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x066e, code lost:
        r5.setMessage(r7);
        r5.setIndeterminate(true);
        r5.setCanceledOnTouchOutside(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0677, code lost:
        if (r6 == false) goto L_0x0688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0679, code lost:
        r5.setCancelable(true);
        r5.setOnCancelListener(new X.A9N(r3, r2, 1));
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0684, code lost:
        r5.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0687, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0688, code lost:
        r5.setCancelable(false);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x068c, code lost:
        r3 = r12.A00;
        r3.get(0);
        r3.get(1);
        r3.get(2);
        r1 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x069d, code lost:
        if (r1.A07() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x069f, code lost:
        r1.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06a8, code lost:
        throw X.AnonymousClass000.A0s("launchWebViewWithOnChange");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x06a9, code lost:
        r6 = X.AnonymousClass8BT.A07(r12.A00, 0);
        r1 = A05(r3);
        r5 = new X.C20522AOh(r6, 19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x06bc, code lost:
        if ((r1 instanceof com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity) == false) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x06be, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cf, code lost:
        if (r12.equals("date") == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x06c1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06c2, code lost:
        r3 = r1 instanceof com.whatsapp.wabloks.ui.WaBloksActivity;
        ((X.C138826xl) r2.A0B.get()).A00(r1);
        r1 = X.C138816xk.A01;
        r0 = r1.isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x06d5, code lost:
        if (r3 == false) goto L_0x06e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x06d7, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06d9, code lost:
        r0 = (com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment) r1.peek();
        r0.A01 = r5;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x06e1, code lost:
        r0.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x06e4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06e5, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06e7, code lost:
        r0 = (androidx.fragment.app.DialogFragment) r1.peek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06ee, code lost:
        r3 = java.util.Collections.unmodifiableList(r12.A00);
        r5 = new java.lang.StringBuilder("[Bloks logging] ");
        r2 = X.C17880vN.A0w(r3, 0);
        r5.append(X.C17880vN.A0w(r3, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d1, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x070a, code lost:
        if (r3.get(2) == null) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x070c, code lost:
        r3 = X.AnonymousClass000.A15(X.AnonymousClass8BR.A16(r3, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0718, code lost:
        if (r3.hasNext() == false) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x071a, code lost:
        r1 = X.AnonymousClass000.A16(r3);
        r5.append(" ");
        r5.append(X.C17880vN.A0x(r1));
        r5.append(" : ");
        r1 = r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0735, code lost:
        if ((r1 instanceof java.lang.Number) != false) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0737, code lost:
        if (r1 != null) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0739, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x073a, code lost:
        r5.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x073e, code lost:
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0743, code lost:
        r3 = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x074b, code lost:
        switch(r2.hashCode()) {
            case 97: goto L_0x075b;
            case 100: goto L_0x0767;
            case 101: goto L_0x076a;
            case 105: goto L_0x0773;
            case 118: goto L_0x077f;
            case 119: goto L_0x0788;
            default: goto L_0x074e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x074e, code lost:
        X.C17900vP.A0e("[Bloks logging] incorrect level: ", r2, X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0757, code lost:
        com.whatsapp.util.Log.e(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x075a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0761, code lost:
        if (r2.equals("a") == false) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0763, code lost:
        com.whatsapp.util.Log.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0766, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0767, code lost:
        r0 = "d";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        if (r12.equals("date_and_time") == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0770, code lost:
        if (r2.equals("e") != false) goto L_0x0757;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0779, code lost:
        if (r2.equals("i") == false) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x077b, code lost:
        com.whatsapp.util.Log.i(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x077e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x077f, code lost:
        r0 = "v";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0785, code lost:
        if (r2.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x078e, code lost:
        if (r2.equals("w") == false) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0790, code lost:
        com.whatsapp.util.Log.w(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0793, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0794, code lost:
        r5 = r12.A00;
        r9 = X.AnonymousClass001.A0n(r5, 0);
        r3 = X.AnonymousClass001.A0n(r5, 1);
        r7 = X.C17880vN.A0w(r5, 2);
        r6 = r2.A04;
        r0 = r6.A00;
        r5 = A03(r0, r3, r9);
        r3 = A01(r0, r9);
        r0 = r6.A01;
        r0.get();
        r1 = X.AnonymousClass8BU.A06(r5, r3);
        r0 = A02(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x07bb, code lost:
        if (r7 == null) goto L_0x07c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x07bd, code lost:
        r0 = X.A47.A01(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07c1, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x07c3, code lost:
        r0.flowEndCancel(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07c6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07c7, code lost:
        r0 = X.A47.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00de, code lost:
        r0 = r7.A03;
        r12 = r10.equals("wheels");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07cb, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07cd, code lost:
        r0.markerEnd(r3, r5, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x07d0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x07d1, code lost:
        r1 = r12.A00;
        r2 = X.C17880vN.A0w(r1, 0);
        r1 = X.C17880vN.A0w(r1, 1);
        r6 = A05(r3);
        r5 = new android.content.Intent("android.intent.action.VIEW", X.C26215Cuu.A01(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07ea, code lost:
        if (r1 == null) goto L_0x0830;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x07f0, code lost:
        if (r1.isEmpty() != false) goto L_0x0830;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07f2, code lost:
        r7 = X.C26215Cuu.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07f6, code lost:
        if (r7 == null) goto L_0x0801;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07f8, code lost:
        r5.setPackage(r7.getQueryParameter(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e6, code lost:
        if (r12 != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0801, code lost:
        r3 = r6.getApplicationContext().getPackageManager().queryIntentActivities(r5, 65536).iterator();
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0818, code lost:
        if (r3.hasNext() == false) goto L_0x0832;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x081a, code lost:
        r1 = r3.next().activityInfo.applicationInfo.packageName;
        r0 = X.BVK.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x082c, code lost:
        if (X.C180939On.A00(r1) == false) goto L_0x0814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x082e, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0830, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0832, code lost:
        if (r2 != false) goto L_0x0844;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0834, code lost:
        X.A5E.A00().A01().A05(r6.getApplicationContext(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0843, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0844, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0846, code lost:
        X.AnonymousClass8BT.A14(r6, r7, "android.intent.action.VIEW");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0849, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x084a, code lost:
        r3 = r12.A00;
        r5 = X.AnonymousClass001.A0n(r3, 0);
        r9 = X.AnonymousClass001.A0n(r3, 1);
        r7 = X.C17880vN.A0w(r3, 2);
        r0 = X.AnonymousClass8BR.A16(r3, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x085c, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x085e, code lost:
        r6 = X.C17880vN.A11();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0862, code lost:
        if (r0 == null) goto L_0x2025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0864, code lost:
        r8 = X.AnonymousClass000.A15(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x086c, code lost:
        if (r8.hasNext() == false) goto L_0x2025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ec, code lost:
        if (r10.equals("calendar") != false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x086e, code lost:
        r3 = X.AnonymousClass000.A16(r8);
        r6.put(r3.getKey().toString(), r3.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0882, code lost:
        r1 = r12.A00;
        r5 = X.AnonymousClass001.A0n(r1, 0);
        r1 = X.AnonymousClass001.A0n(r1, 1);
        r3 = r2.A04;
        r0 = r3.A00;
        r2 = A03(r0, r1, r5);
        r1 = A01(r0, r5);
        r0 = r3.A01;
        r0.get();
        r1 = X.AnonymousClass8BU.A06(r2, r1);
        r0 = X.A47.A01(r3, A02(r0, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x08a9, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x08ab, code lost:
        r0.flowEndSuccess(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x08ae, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x08af, code lost:
        r5 = X.AnonymousClass8BT.A0t(r12, 0);
        r3 = A05(r3);
        r0 = ((X.AnonymousClass1QS) r2.A0W.get()).A06().BPH();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x08c7, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x08c9, code lost:
        r2 = X.AnonymousClass8BR.A07(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x08d7, code lost:
        if (r0.getName().equals("com.whatsapp.support.DescribeProblemActivity") == false) goto L_0x08e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08d9, code lost:
        r2.putExtra("com.whatsapp.support.DescribeProblemActivity.from", "payments:transaction");
        r2.putExtra("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ee, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Unexpected date picker style: ");
        r1.append(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x08e5, code lost:
        r2.putExtra("extra_transaction_id", r5);
        r3.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x08ed, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x08ee, code lost:
        r5 = r12.A00;
        r5.get(0);
        r5.get(1);
        r5.get(2);
        r12.A00(3);
        A05(r3);
        r1 = r2.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x090b, code lost:
        if (((X.C19880zA) r1.get()).A07() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x090d, code lost:
        ((X.C19880zA) r1.get()).A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x091c, code lost:
        throw X.AnonymousClass000.A0s("uploadProfilePicture");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x091d, code lost:
        r3 = r12.A00;
        r8 = X.AnonymousClass001.A0n(r3, 0);
        r7 = X.AnonymousClass001.A0n(r3, 1);
        r0 = X.AnonymousClass001.A0n(r3, 2);
        r3.get(3);
        r5 = r2.A04;
        r3 = (short) r0;
        r0 = r5.A00;
        r2 = A03(r0, r7, r8);
        r1 = A01(r0, r8);
        r0 = X.A47.A00(r5, A02(r5.A01, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0945, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0947, code lost:
        r0.markerEnd(r1, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x094a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fb, code lost:
        r9 = java.util.Calendar.getInstance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x094b, code lost:
        r5 = r12.A00;
        r2 = X.AnonymousClass8BR.A0G(r5, 0);
        r12 = (X.C26235CvV) r5.get(1);
        r10 = X.AnonymousClass8BR.A0G(r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x095b, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x095d, code lost:
        if (r12 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x095f, code lost:
        if (r10 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0961, code lost:
        r8 = r2.A0D(43);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0965, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0967, code lost:
        r15 = r2.A0D(38);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x096d, code lost:
        if (r15 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x096f, code lost:
        r7 = r2.A04(40, -1);
        r6 = r2.A0A(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x097a, code lost:
        if (r6 == null) goto L_0x09d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0100, code lost:
        r26 = 2132083087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x097c, code lost:
        r6 = (java.util.Map) X.C25974Cph.A00(r3, X.C20046A4p.A00(new X.C20046A4p(), r3.A00, 0), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x098d, code lost:
        r5 = r3.A00;
        r9 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A01(X.C26211Cup.A03(r5, (X.C23736Boh) null, r10), r8);
        r9.A01 = r5.A02;
        r1 = new X.C187839gS();
        r1.A01 = r8;
        r1.A00 = r7;
        r1.A04 = r6;
        r1.A06 = true;
        r11 = new X.C20368AHy(r1);
        r0 = new X.C185689cz();
        r0.A01 = r12;
        r0.A00 = r3;
        r13 = new java.lang.Object();
        r13.A01 = r12;
        r13.A00 = r3;
        r13.A02 = r0.A02;
        X.A8X.A06(r9, (X.AnonymousClass1FL) A05(r3), r11, r12, r13, new X.AnonymousClass8d6((X.E6P) null, A00(r2)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x09d6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x09d7, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x09d9, code lost:
        r1 = X.A6L.A01(A0A(X.AnonymousClass8BR.A16(r12.A00, 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x09eb, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x09ed, code lost:
        ((X.C184029aI) r2.A0E.get()).A01.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x09fa, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x09fb, code lost:
        r1 = r12.A00;
        r2 = X.AnonymousClass8BR.A16(r1, 0);
        r1 = r1.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0a05, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0103, code lost:
        if (r0 == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0a0b, code lost:
        if (r2.size() <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0a0d, code lost:
        r0 = "properties";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0a10, code lost:
        r1 = r12.A00;
        r5 = X.AnonymousClass8BR.A16(r1, 0);
        r1 = X.A45.A01(r3, r1, 1);
        r6 = X.A6L.A01(A0A(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0a26, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0a28, code lost:
        r5 = (X.C184029aI) r2.A0E.get();
        r5.A01.put(r6, new X.C194839sN(r1.A00, r1.A01, r5.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0a40, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0a41, code lost:
        r5 = r12.A00;
        r5.get(0);
        r5.get(1);
        r5.get(2);
        r3 = A05(r3);
        r1 = r2.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0a5c, code lost:
        if (((X.C19880zA) r1.get()).A07() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0a5e, code lost:
        ((X.C19880zA) r1.get()).A03();
        r3.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        r26 = 2132083086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        r4 = null;
        r12 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0a70, code lost:
        throw X.AnonymousClass000.A0s("sendData");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0a71, code lost:
        r1 = r12.A00;
        r2 = X.AnonymousClass8BR.A16(r1, 0);
        r1 = r1.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0a7b, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0a81, code lost:
        if (r2.size() <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0a83, code lost:
        r0 = "children";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0a85, code lost:
        r0 = X.AnonymousClass8BS.A0u(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0a89, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0a8b, code lost:
        r0 = r0.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0a8f, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0108, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0a91, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0a92, code lost:
        r3 = r12.A00;
        r8 = X.AnonymousClass001.A0n(r3, 0);
        r9 = X.AnonymousClass001.A0n(r3, 1);
        r3 = X.AnonymousClass8BR.A0G(r3, 2);
        r6 = "cancel".equals(r3.A0D(35));
        r7 = r3.A0D(36);
        r3.A04(38, -1);
        r5 = r2.A04;
        r0 = r5.A00;
        r2 = A03(r0, r9, r8);
        r1 = A01(r0, r8);
        r0 = r5.A01;
        r0.get();
        r2 = X.AnonymousClass8BU.A06(r2, r1);
        r1 = X.A47.A01(r5, A02(r0, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0ad1, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0ad3, code lost:
        r1.BLQ(new X.C58442kh(r7, r6), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0adb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0adc, code lost:
        r5 = r12.A00;
        r9 = X.AnonymousClass001.A0n(r5, 0);
        r3 = X.AnonymousClass001.A0n(r5, 1);
        r8 = X.C17880vN.A0w(r5, 2);
        r7 = X.C17880vN.A0w(r5, 3);
        r6 = r2.A04;
        r0 = r6.A00;
        r5 = A03(r0, r3, r9);
        r3 = A01(r0, r9);
        r0 = r6.A01;
        r0.get();
        r1 = X.AnonymousClass8BU.A06(r5, r3);
        r0 = A02(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0b07, code lost:
        if (r8 == null) goto L_0x0b13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0b09, code lost:
        r0 = X.A47.A01(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0b0d, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0b0f, code lost:
        r0.flowMarkError(r1, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010a, code lost:
        r26 = 2132083095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0b12, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0b13, code lost:
        r1 = X.A47.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0b17, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0b19, code lost:
        r1.markerEnd(r3, r5, 87);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0b1e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0b1f, code lost:
        r3 = r12.A00;
        r9 = X.AnonymousClass001.A0n(r3, 0);
        r8 = X.AnonymousClass001.A0n(r3, 1);
        r7 = X.C17880vN.A0w(r3, 2);
        r0 = X.AnonymousClass8BR.A0G(r3, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0b31, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0b33, code lost:
        if (r0 == null) goto L_0x0b55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0b35, code lost:
        r5 = r0.A0D(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0b39, code lost:
        r3 = r2.A04;
        r0 = r3.A00;
        r2 = A03(r0, r8, r9);
        r1 = A01(r0, r9);
        r0 = X.A47.A00(r3, A02(r3.A01, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010d, code lost:
        if (r0 == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0b4f, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0b51, code lost:
        r0.markerPoint(r1, r2, r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0b54, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0b55, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0b57, code lost:
        r5 = r12.A00;
        r5.get(0);
        r5.get(1);
        r5.get(2);
        A05(r3);
        r1 = r2.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0b71, code lost:
        if (((X.C19880zA) r1.get()).A07() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0b73, code lost:
        ((X.C19880zA) r1.get()).A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0b82, code lost:
        throw X.AnonymousClass000.A0s("openMediaGallery");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0b83, code lost:
        r3 = X.AnonymousClass8BT.A0t(r12, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0b8b, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0b93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010f, code lost:
        r26 = 2132083094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0b8d, code lost:
        r0 = "WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0b8f, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0b92, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0b93, code lost:
        r1 = ((X.AnonymousClass11C) r2.A0b.get()).A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0b9f, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0ba3, code lost:
        r3 = r12.A00;
        r9 = X.AnonymousClass001.A0n(r3, 0);
        r8 = X.AnonymousClass001.A0n(r3, 1);
        r7 = X.C17880vN.A0w(r3, 2);
        r5 = X.C17880vN.A0w(r3, 3);
        r3 = r2.A04;
        r0 = r3.A00;
        r2 = A03(r0, r8, r9);
        r1 = A01(r0, r9);
        r0 = r3.A01;
        r0.get();
        r1 = X.AnonymousClass8BU.A06(r2, r1);
        r0 = X.A47.A01(r3, A02(r0, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0bd2, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0bd4, code lost:
        r0.flowEndFail(r1, r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0bd7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0bd8, code lost:
        r3 = r12.A00;
        r13 = X.AnonymousClass001.A0n(r3, 0);
        r12 = X.AnonymousClass001.A0n(r3, 1);
        r5 = X.AnonymousClass8BR.A16(r3, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0be6, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0bec, code lost:
        if (r5.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:?, code lost:
        r15 = X.AnonymousClass000.A15(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0bf6, code lost:
        if (r15.hasNext() == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0bf8, code lost:
        r5 = X.AnonymousClass000.A16(r15);
        r3 = r5.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0c00, code lost:
        if (r3 != null) goto L_0x0c04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0c02, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0113, code lost:
        if (r6 == null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0c04, code lost:
        r11 = r3.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0c08, code lost:
        r3 = r5.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0c0c, code lost:
        if (r3 != null) goto L_0x0c0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0c0f, code lost:
        r10 = r3.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0c14, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0c15, code lost:
        if (r11 == null) goto L_0x0bf2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0c17, code lost:
        if (r10 == null) goto L_0x0bf2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0c19, code lost:
        r14 = r2.A04;
        r3 = r14.A00;
        r9 = A03(r3, r12, r13);
        r8 = A01(r3, r13);
        r5 = ((X.C695137m) r14.A01.get()).A06;
        r7 = 1;
        r3 = X.C20104A7i.A00(r5, r13).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0c36, code lost:
        if (r3 == null) goto L_0x0c3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        java.util.TimeZone.getTimeZone(r6).getDisplayName(java.util.Locale.US);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0c38, code lost:
        r3 = X.C108945cZ.A1D(r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0c3d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0c3e, code lost:
        r6 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0c3f, code lost:
        if (r3 == null) goto L_0x0c4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0c41, code lost:
        r3 = r3.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0c45, code lost:
        if (2 != r3) goto L_0x0c49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0c47, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0c49, code lost:
        if (1 != r3) goto L_0x0c4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0c4b, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0c4c, code lost:
        r5 = X.C20104A7i.A00(r5, r13).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011e, code lost:
        java.util.Locale.getDefault().getLanguage();
        r24 = new android.app.DatePickerDialog(r14, r26, new X.A9K(r14, r7, r3, r19, r15, r9, r9, r24, r0), r9.get(1), r9.get(2), r9.get(5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0c53, code lost:
        if (r5 == -1) goto L_0x0c5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0c55, code lost:
        if (r6 == 65535) goto L_0x0c5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0c57, code lost:
        if (r5 == 2) goto L_0x0c5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0c59, code lost:
        if (r6 != 2) goto L_0x0c5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0c5b, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0c5d, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0c5e, code lost:
        r3 = X.A47.A00(r14, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0c62, code lost:
        if (r3 == null) goto L_0x0bf2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0c64, code lost:
        r3.markerAnnotate(r8, r9, r11, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0c68, code lost:
        r1 = r12.A00;
        r5 = X.AnonymousClass001.A0n(r1, 0);
        r1 = X.AnonymousClass001.A0n(r1, 1);
        r3 = r2.A04;
        r0 = r3.A00;
        r2 = A03(r0, r1, r5);
        r1 = A01(r0, r5);
        r0 = X.A47.A00(r3, A02(r3.A01, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0153, code lost:
        if (r12 == false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0c88, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0c8a, code lost:
        r0.markerDrop(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0c8d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0c8e, code lost:
        r5 = X.AnonymousClass8BT.A0t(r12, 0);
        r3 = A05(r3);
        r0 = ((X.AnonymousClass1QS) r2.A0W.get()).A06().BYA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0ca6, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0ca8, code lost:
        r1 = X.AnonymousClass8BR.A07(r3, r0);
        r1.putExtra("extra_transaction_id", r5);
        r3.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0cb4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0cb5, code lost:
        r0 = X.AnonymousClass8BR.A0G(r12.A00, 0);
        r7 = new X.C20517AOc(r3, 0);
        r6 = A05(r3);
        r5 = new X.C20519AOe(r3, r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0ccb, code lost:
        if ((r6 instanceof X.AnonymousClass89W) == false) goto L_0x210a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0ccd, code lost:
        r1 = (X.AnonymousClass89W) r6;
        r1.CR1(r5);
        r1.CR2(r7, r5, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        switch(r15) {
            case 0: goto L_0x1eb4;
            case 1: goto L_0x1e4d;
            case 2: goto L_0x12b5;
            case 3: goto L_0x1e1a;
            case 4: goto L_0x0ce4;
            case 5: goto L_0x1ddb;
            case 6: goto L_0x1d51;
            case 7: goto L_0x0cb5;
            case 8: goto L_0x0c8e;
            case 9: goto L_0x0c68;
            case 10: goto L_0x0bd8;
            case 11: goto L_0x12b5;
            case 12: goto L_0x0ba3;
            case 13: goto L_0x002b;
            case 14: goto L_0x1d0f;
            case 15: goto L_0x1cee;
            case 16: goto L_0x0b83;
            case 17: goto L_0x0b57;
            case 18: goto L_0x002a;
            case 19: goto L_0x01d4;
            case 20: goto L_0x1ccd;
            case 21: goto L_0x1385;
            case 22: goto L_0x091d;
            case 23: goto L_0x04e3;
            case 24: goto L_0x0b1f;
            case 25: goto L_0x0604;
            case 26: goto L_0x1cb3;
            case 27: goto L_0x156a;
            case 28: goto L_0x0adc;
            case 29: goto L_0x14e4;
            case 30: goto L_0x1c9c;
            case 31: goto L_0x0a92;
            case 32: goto L_0x135f;
            case 33: goto L_0x14dc;
            case 34: goto L_0x140f;
            case 35: goto L_0x0a71;
            case 36: goto L_0x0a41;
            case 37: goto L_0x0a10;
            case 38: goto L_0x1346;
            case 39: goto L_0x1c43;
            case 40: goto L_0x1c2c;
            case 41: goto L_0x002a;
            case 42: goto L_0x1baa;
            case 43: goto L_0x1c9c;
            case 44: goto L_0x04d8;
            case 45: goto L_0x09fb;
            case 46: goto L_0x1b7e;
            case 47: goto L_0x09d9;
            case 48: goto L_0x1ac7;
            case 49: goto L_0x094b;
            case 50: goto L_0x1a9f;
            case 51: goto L_0x1a6f;
            case 52: goto L_0x091d;
            case 53: goto L_0x12c7;
            case 54: goto L_0x1a21;
            case 55: goto L_0x08ee;
            case 56: goto L_0x1983;
            case 57: goto L_0x002a;
            case 58: goto L_0x0467;
            case 59: goto L_0x193c;
            case 60: goto L_0x08af;
            case 61: goto L_0x0882;
            case 62: goto L_0x084a;
            case 63: goto L_0x1d0f;
            case 64: goto L_0x0450;
            case 65: goto L_0x12c4;
            case 66: goto L_0x14dc;
            case X.8cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER :int: goto L_0x1cb3;
            case X.8co.MESSAGE_ADD_ONS_FIELD_NUMBER :int: goto L_0x12fb;
            case 69: goto L_0x18d4;
            case 70: goto L_0x1ac7;
            case 71: goto L_0x1873;
            case 72: goto L_0x129c;
            case 73: goto L_0x14a3;
            case X.8cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER :int: goto L_0x07d1;
            case X.8cr.EVENT_MESSAGE_FIELD_NUMBER :int: goto L_0x1822;
            case X.8cr.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER :int: goto L_0x14b1;
            case X.8cr.COMMENT_MESSAGE_FIELD_NUMBER :int: goto L_0x05dc;
            case X.8cr.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER :int: goto L_0x14dc;
            case 79: goto L_0x025f;
            case X.8cr.PLACEHOLDER_MESSAGE_FIELD_NUMBER :int: goto L_0x02c7;
            case 81: goto L_0x0794;
            case X.8cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER :int: goto L_0x171a;
            case X.8cr.ALBUM_MESSAGE_FIELD_NUMBER :int: goto L_0x06ee;
            case 84: goto L_0x002a;
            case X.8cr.EVENT_COVER_IMAGE_FIELD_NUMBER :int: goto L_0x1707;
            case X.8cr.STICKER_PACK_MESSAGE_FIELD_NUMBER :int: goto L_0x0206;
            case X.8cr.STATUS_MENTION_MESSAGE_FIELD_NUMBER :int: goto L_0x06a9;
            case X.8cr.POLL_RESULT_SNAPSHOT_MESSAGE_FIELD_NUMBER :int: goto L_0x12e3;
            case 89: goto L_0x05bf;
            case 90: goto L_0x002a;
            case X.8cr.ASSOCIATED_CHILD_MESSAGE_FIELD_NUMBER :int: goto L_0x002a;
            case X.8cr.GROUP_STATUS_MENTION_MESSAGE_FIELD_NUMBER :int: goto L_0x05a7;
            case X.8cr.POLL_CREATION_MESSAGE_V4_FIELD_NUMBER :int: goto L_0x01ac;
            case X.8cr.POLL_CREATION_MESSAGE_V5_FIELD_NUMBER :int: goto L_0x1c9c;
            case 95: goto L_0x1482;
            case 96: goto L_0x0bd8;
            case 97: goto L_0x04f3;
            case 98: goto L_0x1654;
            case 99: goto L_0x068c;
            case 100: goto L_0x0640;
            case 101: goto L_0x1626;
            case 102: goto L_0x15ee;
            case 103: goto L_0x12cc;
            case 104: goto L_0x002a;
            case 105: goto L_0x0604;
            case 106: goto L_0x021e;
            case 107: goto L_0x15c2;
            default: goto L_0x0024;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0cd9, code lost:
        if ((r6 instanceof X.AnonymousClass8BI) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0cdb, code lost:
        ((com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity) ((X.AnonymousClass8BI) r6)).A02.A07 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0ce3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0ce4, code lost:
        r0 = r12.A00;
        r2 = (X.C26235CvV) r0.get(0);
        r1 = (X.DOZ) r0.get(2);
        X.C26272CwJ.A01(r1).A08(r2, (java.util.Map) null);
        r15 = X.CBy.A00(r1, r3, r2.A01);
        r14 = r15.A09(36);
        r13 = "";
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0d07, code lost:
        if (r14 == null) goto L_0x0d13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0d09, code lost:
        r19 = r13;
        r0 = r14.A0D(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0d0f, code lost:
        if (r0 == null) goto L_0x0d13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0d11, code lost:
        r19 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0d13, code lost:
        if (r14 == null) goto L_0x0e29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0d15, code lost:
        r12 = r14.A0D(46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0161, code lost:
        if ("com.facebook.stella.app.StellaApplication".equals(r14.getApplicationInfo().name) != false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0d1b, code lost:
        if (r14 == null) goto L_0x0e26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0d1d, code lost:
        r10 = r14.A0A(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0d21, code lost:
        r9 = r15.A09(38);
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0d29, code lost:
        if (r9 == null) goto L_0x0d35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0d2b, code lost:
        r18 = r13;
        r0 = r9.A0D(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0d31, code lost:
        if (r0 == null) goto L_0x0d35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0d33, code lost:
        r18 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0d35, code lost:
        if (r9 == null) goto L_0x0e23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0d37, code lost:
        r8 = r9.A0D(46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0d3d, code lost:
        if (r9 == null) goto L_0x0e20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0163, code lost:
        r24.getDatePicker().setDescendantFocusability(393216);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0d3f, code lost:
        r6 = r9.A0A(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0d43, code lost:
        r5 = r15.A09(44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0d49, code lost:
        if (r5 == null) goto L_0x0e1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0d4b, code lost:
        r0 = r5.A0D(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0d4f, code lost:
        if (r0 == null) goto L_0x0d52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0d51, code lost:
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0d52, code lost:
        if (r5 == null) goto L_0x0e1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0d54, code lost:
        r2 = r5.A0D(46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0d5a, code lost:
        if (r5 == null) goto L_0x0e17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0d5c, code lost:
        r7 = r5.A0A(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016c, code lost:
        if (r8 == null) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0d60, code lost:
        r17 = A05(r3);
        r1 = new X.C20517AOc(r3, 1);
        r16 = r15.A0D(40);
        r11 = r15.A0D(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0d74, code lost:
        if (r10 == null) goto L_0x0e14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0d76, code lost:
        r3 = new X.C20522AOh(r10, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0d7d, code lost:
        if (r14 == null) goto L_0x0e11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0d7f, code lost:
        r10 = new X.C20518AOd(r14, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0d85, code lost:
        if (r6 == null) goto L_0x0e0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0d87, code lost:
        r14 = new X.C20522AOh(r6, 21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0d8e, code lost:
        if (r9 == null) goto L_0x0e0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0d90, code lost:
        r6 = new X.C20518AOd(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0d96, code lost:
        if (r7 == null) goto L_0x0e0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016e, code lost:
        r24.getDatePicker().setMinDate(A04(r8, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0d98, code lost:
        r9 = new X.C20522AOh(r7, 13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0d9f, code lost:
        if (r5 == null) goto L_0x0e08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0da1, code lost:
        r7 = new X.C20518AOd(r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0da6, code lost:
        X.C18070vi.A0d(r17, 1);
        r5 = X.C73193Ri.A00(r17);
        r5.A0e(r16);
        r5.A0d(r11);
        r5.A0a(new X.A9Y(r10, r1, r3, 2), r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0dc2, code lost:
        if (r18 == null) goto L_0x0dcf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0dc4, code lost:
        r5.A0Y(new X.A9Y(r6, r1, r14, 3), r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0dcf, code lost:
        if (r13 == null) goto L_0x0dda;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0dd1, code lost:
        r5.A0Z(new X.A9Y(r7, r1, r9, 4), r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0dda, code lost:
        r0 = r5.create();
        r0.show();
        r3 = r0.A00;
        r1 = r3.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0de5, code lost:
        if (r12 == null) goto L_0x0def;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0179, code lost:
        if (r2 == null) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0de7, code lost:
        if (r1 == null) goto L_0x0def;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0de9, code lost:
        r1.setTag(2131436043, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0def, code lost:
        r1 = r3.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0df1, code lost:
        if (r8 == null) goto L_0x0dfb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0df3, code lost:
        if (r1 == null) goto L_0x0dfb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0df5, code lost:
        r1.setTag(2131436043, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0dfb, code lost:
        r1 = r3.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0dfd, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0dff, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0e01, code lost:
        r1.setTag(2131436043, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x017b, code lost:
        r24.getDatePicker().setMaxDate(A04(r2, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0e07, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0e08, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0e0a, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0e0c, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0e0e, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0e11, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0e14, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0e17, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0e1a, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0e1d, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0186, code lost:
        if (r11 == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0e20, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0e23, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0e26, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0e29, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0188, code lost:
        r24.setTitle(r14.getString(2131898846));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0192, code lost:
        r24.setButton(-1, r14.getString(2131898870), r24);
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019d, code lost:
        if (r15 == null) goto L_0x0684;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019f, code lost:
        if (r3 == null) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a1, code lost:
        r24.setOnCancelListener(new X.A9P(r7, r3, r15, 1));
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ac, code lost:
        r5 = r12.A00;
        r1 = X.C17880vN.A0w(r5, 0);
        r9 = X.C17880vN.A0w(r5, 1);
        r6 = A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01bc, code lost:
        if ((r6 instanceof X.AnonymousClass1FR) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01be, code lost:
        r0 = "[Bloks][bk.action.wa.extension.ReportItem] activity doesn't implement DialogInterface";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c4, code lost:
        if ((r6 instanceof X.AnonymousClass01E) != false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c6, code lost:
        r0 = "[Bloks][bk.action.wa.extension.ReportItem] activity is not instance of AppCompatActivity";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x124b, code lost:
        if (r4 == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x124f, code lost:
        r3 = new com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment();
        r3.A00 = new X.C143107Ca(r6, r7, r2, r9, 1);
        X.C20098A7b.A03(r3, ((X.AnonymousClass1FL) r6).getSupportFragmentManager(), X.C17890vO.A0U(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x126a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x126b, code lost:
        r0 = com.whatsapp.jid.UserJid.Companion;
        r12 = r0.A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x1271, code lost:
        if (r12 != null) goto L_0x1277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x1273, code lost:
        r12 = r0.A04(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x127b, code lost:
        if (android.text.TextUtils.isEmpty(r9) == false) goto L_0x1297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ca, code lost:
        r7 = X.AnonymousClass3MX.A0l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x127d, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x127e, code lost:
        X.C17890vO.A0u(new X.AnonymousClass6M4((X.AnonymousClass1FR) r10, r11, r12, r13, r2.A05, r2.A0P, r2.A0K, r17), X.AnonymousClass3MX.A0x(r2.A0j));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x1296, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x1297, code lost:
        r13 = X.AnonymousClass205.A01(r11, r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x12b4, code lost:
        return ((X.AnonymousClass16R) r2.A0H.get()).A00(X.AnonymousClass11S.A01((X.AnonymousClass11S) r2.A0T.get()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x12c3, code lost:
        return ((X.C31391fU) r2.A0X.get()).BX3().A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x12c4, code lost:
        return "CONSUMER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ce, code lost:
        if (r7 != null) goto L_0x124f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        r19 = ((X.C25488Cgj) r12.A00(0)).A00;
        r0 = (X.DFL) r12.A00(1);
        r7 = (X.DOZ) r12.A00(2);
        r11 = r12.A00;
        r1 = (java.lang.Number) r11.get(3);
        r6 = X.C17880vN.A0w(r11, 4);
        r8 = (java.lang.Long) r11.get(5);
        r2 = (java.lang.Long) r11.get(6);
        r15 = X.AnonymousClass8BT.A08(r11, 7);
        r9 = new X.C197619wz(r10);
        r14 = r7.A00;
        r12 = "date";
        r9 = r0.A0D(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x12cb, code lost:
        return X.C17890vO.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x12cc, code lost:
        r2 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:0x12e2, code lost:
        return java.lang.Boolean.valueOf(X.AnonymousClass8BU.A1V(X.C17880vN.A0w(r2, 0), java.util.regex.Pattern.compile(X.C17880vN.A0w(r2, 1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x12e3, code lost:
        r3 = r12.A00;
        r5 = X.C17880vN.A0w(r3, 0);
        r2 = X.AnonymousClass3MX.A02(r3, 1);
        r4 = new java.lang.String[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x12ef, code lost:
        if (r9 >= r2) goto L_0x1380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:0x12f1, code lost:
        r1 = r9 + 1;
        r4[r9] = r3.get(r1);
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x12fb, code lost:
        r6 = X.C26215Cuu.A01(X.AnonymousClass8BT.A0t(r12, 0));
        r5 = r6.getScheme();
        r3 = r6.getHost();
        r2 = r6.getPath();
        r1 = r6.getQueryParameterNames();
        r4 = X.C17880vN.A11();
        r4.put("scheme", r5);
        r4.put("host", r3);
        r4.put("path", r2);
        r3 = X.C17880vN.A11();
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:0x1332, code lost:
        if (r2.hasNext() == false) goto L_0x1340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x1334, code lost:
        r1 = X.C17880vN.A0v(r2);
        r3.put(r1, r6.getQueryParameter(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d0, code lost:
        r0 = "[Bloks][bk.action.wa.extension.ReportItem] failed to parse chat jid from string";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x1340, code lost:
        r4.put("url_params", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x1345, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x1346, code lost:
        r2 = X.AnonymousClass8BT.A0t(r12, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:?, code lost:
        java.lang.Integer.parseInt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x134e, code lost:
        X.C17900vP.A0e("NumberUtil/Invalid long value:", r2, X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x135f, code lost:
        r1 = r12.A00;
        r5 = X.C17880vN.A0w(r1, 0);
        r1 = (java.util.AbstractList) r1.get(1);
        r4 = new java.lang.String[r1.size()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d4, code lost:
        r10 = r12.A00;
        r7 = X.C17880vN.A0w(r10, 0);
        r17 = X.C17880vN.A0w(r10, 1);
        r9 = X.C17880vN.A0w(r10, 2);
        r5 = java.lang.Boolean.TRUE.equals(r10.get(3));
        r1 = X.C17880vN.A0w(r10, 4);
        r10 = A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:0x1375, code lost:
        if (r9 >= r1.size()) goto L_0x1380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x1377, code lost:
        r4[r9] = r1.get(r9);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x1384, code lost:
        return java.text.MessageFormat.format(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x1385, code lost:
        r10 = r12.A00;
        r4 = X.C17880vN.A0w(r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:?, code lost:
        r5 = java.lang.Long.parseLong(r4) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x1395, code lost:
        X.C17900vP.A0e("NumberUtil/Invalid long value:", r4, X.AnonymousClass000.A10());
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f6, code lost:
        if ((r10 instanceof X.AnonymousClass1FR) != false) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f8, code lost:
        r0 = "[Bloks][bk.action.wa.spam.ReportSpam] activity doesn't implement DialogInterface";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:0x13fa, code lost:
        r5 = java.lang.Double.valueOf(java.lang.Math.ceil(r2 / r0)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:0x140f, code lost:
        X.C18070vi.A0d(r12, 0);
        X.C18070vi.A0d(r3, 1);
        r8 = r12.A00(0);
        X.C18070vi.A0z(r8, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        r11 = r12.A00(1);
        X.AnonymousClass8BR.A1I(r11);
        r5 = r12.A00;
        r10 = new X.C190959ln((X.DOZ) r8, r3, X.AnonymousClass8BT.A08(r5, 2), X.AnonymousClass8BT.A08(r5, 3));
        r5 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:749:0x1438, code lost:
        if (r5 == null) goto L_0x1461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01fc, code lost:
        r11 = X.AnonymousClass3MX.A0l(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x143a, code lost:
        r8 = r5.A00;
        r12 = r8.getPackageManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:0x1440, code lost:
        if (r12 == null) goto L_0x1461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x1442, code lost:
        r11 = "front".equals(r11);
        r7 = r12.hasSystemFeature("android.hardware.camera.front");
        r5 = r12.hasSystemFeature("android.hardware.camera");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:0x1454, code lost:
        if (r11 == false) goto L_0x145e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:754:0x1456, code lost:
        if (r7 != false) goto L_0x1464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x1458, code lost:
        r0 = X.AnonymousClass00R.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:756:0x145a, code lost:
        r10.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:757:0x145d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x145e, code lost:
        if (r5 != false) goto L_0x1464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:759:0x1461, code lost:
        r0 = X.AnonymousClass00R.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0200, code lost:
        if (r11 != null) goto L_0x126b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:760:0x1464, code lost:
        r7 = A05(r3);
        X.C18070vi.A0X(r7);
        r2.A03(r7, new X.C20521AOg(r7, r8, r10, r2), new java.lang.String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:761:0x1481, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:762:0x1482, code lost:
        r3 = A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:764:?, code lost:
        ((X.C138826xl) r2.A0B.get()).A00(r3).A00((X.AnonymousClass1FL) r3, new X.C133336oa(X.AnonymousClass8BR.A0G(r12.A00, 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:765:0x14a2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:766:0x14a3, code lost:
        X.C108945cZ.A0a(r2.A0R).A0G(X.AnonymousClass8BT.A0t(r12, 0), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:767:0x14b0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:768:0x14b1, code lost:
        r5 = A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0202, code lost:
        r0 = "[Bloks][bk.action.wa.spam.ReportSpam] failed to parse chat jid from string";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:770:?, code lost:
        ((X.C138826xl) r2.A0B.get()).A00(r5).A00((X.AnonymousClass1FL) r5, new X.C168878jq((X.C26235CvV) r12.A00.get(0), r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:0x14d3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:772:0x14d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:773:0x14d5, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r0.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:774:0x14db, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:775:0x14dc, code lost:
        A05(r3).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:776:0x14e3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x14e4, code lost:
        r1 = A05(r3);
        r6 = X.AnonymousClass8BT.A0t(r12, 0);
        X.C18070vi.A0d(r1, 0);
        X.C18070vi.A0d(r6, 1);
        r2 = X.A8X.A00;
        r1 = X.C20101A7f.A03(X.C20101A7f.A00(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:778:0x14fc, code lost:
        if (r1 == null) goto L_0x1514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0206, code lost:
        X.C18070vi.A0d(r12, 0);
        X.C18070vi.A0d(r3, 1);
        r2 = X.AnonymousClass8BT.A08(r12.A00, 0);
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:780:0x1502, code lost:
        if (r1.isEmpty() != false) goto L_0x1514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:781:0x1504, code lost:
        r0 = X.A8X.A00(r2, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:782:0x1508, code lost:
        r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:783:0x150a, code lost:
        if (r0 != null) goto L_0x1516;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:784:0x150c, code lost:
        X.C25913CoX.A01("CDSBloksBottomSheetController", "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:785:0x1513, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:786:0x1514, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:787:0x1516, code lost:
        r1 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A00(r0).A0C;
        r0 = (X.CSC) r1.peekFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:788:0x1524, code lost:
        if (r0 == null) goto L_0x1564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0214, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:790:0x1530, code lost:
        if (r6.equals(r0.A04.BNW()) != false) goto L_0x1564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:791:0x1532, code lost:
        r3 = r1.iterator();
        X.C18070vi.A0X(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:793:0x153d, code lost:
        if (r3.hasNext() == false) goto L_0x1561;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:0x153f, code lost:
        r2 = (X.CSC) r3.next();
        r1 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:795:0x154f, code lost:
        if (r6.equals(r1.BNW()) == false) goto L_0x1539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:797:0x1553, code lost:
        if (r2.A00 == null) goto L_0x155a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:798:0x1555, code lost:
        r1.BIW();
        r2.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:799:0x155a, code lost:
        r1.destroy();
        r3.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0216, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0071, code lost:
        if (r9 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:800:0x1560, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:801:0x1561, code lost:
        r0 = "No screen found with target ID, so the screen was not removed.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:802:0x1564, code lost:
        r0 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:803:0x1566, code lost:
        X.C25913CoX.A01("CDSBloksBottomSheetDelegate", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:804:0x1569, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:805:0x156a, code lost:
        ((X.C190359ko) r2.A0S.get()).A00(new X.C20522AOh(((X.C25488Cgj) r12.A00(8)).A00, 18), r3, (java.lang.String) r12.A00(2), (java.lang.String) r12.A00(4), (java.lang.String) r12.A00(5), (java.lang.String) r12.A00(7), (java.util.List) r12.A00(1), (java.util.List) r12.A00(3), (java.util.Map) r12.A00(6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:806:0x15c1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:807:0x15c2, code lost:
        r2 = r12.A00;
        r1 = X.AnonymousClass001.A0n(r2, 0);
        r0 = X.AnonymousClass8BR.A16(r2, 1);
        r5 = A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:808:0x15d0, code lost:
        if (r0 == null) goto L_0x15ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:809:0x15d2, code lost:
        r3 = A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0218, code lost:
        if (r2 != null) goto L_0x1fb2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:810:0x15d6, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:811:0x15d7, code lost:
        if (r1 == 0) goto L_0x15da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:812:0x15d9, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:813:0x15da, code lost:
        r1 = r5.getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:814:0x15de, code lost:
        if (r3 == null) goto L_0x15e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:815:0x15e0, code lost:
        r1.putExtra("finish_activity_result", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:816:0x15e5, code lost:
        r5.setResult(r2, r1);
        r5.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:817:0x15eb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:818:0x15ec, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:819:0x15ee, code lost:
        r10 = r12.A00;
        r9 = X.C17880vN.A0w(r10, 0);
        r12 = X.AnonymousClass001.A0n(r10, 1);
        r7 = X.AnonymousClass001.A0n(r10, 2);
        r3 = X.AnonymousClass8BR.A16(r10, 3);
        r14 = X.AnonymousClass001.A0n(r10, 4);
        r10 = (java.util.ArrayList) r10.get(5);
        r11 = A0A(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021a, code lost:
        X.A8X.A05(r1, (X.E6P) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:820:0x160e, code lost:
        if (r7 == 1) goto L_0x1624;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:821:0x1610, code lost:
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:822:0x1611, code lost:
        if (r7 == 2) goto L_0x1614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:823:0x1613, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:824:0x1614, code lost:
        ((X.AnonymousClass18K) r2.A0k.get()).CC4(X.C123756Vs.A00(r9, r10, r11, r12, r13, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:825:0x1623, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:826:0x1624, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:827:0x1626, code lost:
        r0 = X.AnonymousClass8BR.A0G(r12.A00, 0);
        r8 = r0.A0D(36);
        r0 = r0.A09(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:828:0x1634, code lost:
        if (r0 == null) goto L_0x1651;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:829:0x1636, code lost:
        r6 = r0.A0D(36);
        r5 = r0.A0A(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:830:0x163e, code lost:
        if (r5 == null) goto L_0x164f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:831:0x1640, code lost:
        r1 = new X.C20522AOh(r5, 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:832:0x1647, code lost:
        r2.A04(A05(r3), r1, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:833:0x164e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:834:0x164f, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:835:0x1651, code lost:
        r5 = null;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:836:0x1654, code lost:
        r10 = r12.A00;
        r9 = X.AnonymousClass8BT.A07(r10, 0);
        r7 = X.AnonymousClass8BT.A07(r10, 1);
        r5 = X.AnonymousClass8BT.A07(r10, 2);
        ((java.lang.Number) r10.get(3)).intValue();
        r1 = X.C17880vN.A0w(r10, 4);
        r10 = X.A45.A00(r3, r9);
        r11 = X.A45.A00(r3, r7);
        r7 = X.A45.A00(r3, r5);
        r1 = "CAMERA".equalsIgnoreCase(r1);
        r6 = A05(r3);
        r5 = (X.C218417p) r2.A0U.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:837:0x168d, code lost:
        if (r1 == false) goto L_0x16c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:838:0x168f, code lost:
        if (r5 == null) goto L_0x16f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021e, code lost:
        r3 = r12.A00;
        r5 = X.AnonymousClass001.A0n(r3, 0);
        r7 = X.C17880vN.A0w(r3, 1);
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:840:0x1693, code lost:
        if ((r6 instanceof X.AnonymousClass01C) == false) goto L_0x16f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:841:0x1695, code lost:
        r5.A00(X.C64062u9.A02(r6, X.C1403270y.A00((X.C218617r) r2.A0Q.get(), (X.C18010vc) r2.A0Z.get(), X.C26551So.A0E, ".jpg", 1)), (X.AnonymousClass01C) r6, new X.C21533Alg(r10, r11, r7, r2, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:842:0x16c0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:843:0x16c1, code lost:
        if (r5 == null) goto L_0x16f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:845:0x16c5, code lost:
        if ((r6 instanceof X.AnonymousClass01C) == false) goto L_0x16f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:846:0x16c7, code lost:
        r9 = new X.C21533Alg(r10, r11, r7, r2, 2);
        r6 = (X.AnonymousClass01C) r6;
        X.C18070vi.A0d(r6, 0);
        r6.getLifecycle().A05(r5);
        r1 = r6.A04.A04(new X.AGH(r6, r5, r9), new java.lang.Object(), "mediapicker_rq#101");
        r5.A02 = r1;
        r1.A02((X.C1406772n) null, "image/*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:847:0x16f5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:848:0x16f6, code lost:
        r2 = X.AnonymousClass000.A13();
        r2.add("Unexpected parameters while opening media picker");
        A0D(r7.A01, r7.A00, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:849:0x1706, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:850:0x1707, code lost:
        r1 = X.AnonymousClass8BR.A16(r12.A00, 0);
        r0 = A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:851:0x1711, code lost:
        if (r1 == null) goto L_0x1716;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:852:0x1713, code lost:
        A0A(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:853:0x1716, code lost:
        r0.onBackPressed();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:854:0x1719, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:855:0x171a, code lost:
        r1 = X.AnonymousClass8BT.A0t(r12, 0);
        r7 = A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:857:?, code lost:
        r6 = X.A6L.A00(r2, r1);
        r3 = X.AnonymousClass17K.A04(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:858:0x172a, code lost:
        if (r3 == null) goto L_0x17f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:859:0x172c, code lost:
        r13 = ((X.AnonymousClass1M9) r2.A0L.get()).A0E(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r6 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:860:0x1738, code lost:
        if (r13 == null) goto L_0x1766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:862:0x1746, code lost:
        if (((X.AnonymousClass11S) r2.A0T.get()).A0O(r6) == false) goto L_0x1766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:863:0x1748, code lost:
        X.C18070vi.A0d(r7, 0);
        r5 = X.AnonymousClass3MZ.A06(((X.C133326oZ) r2.A06.get()).A00);
        r5.setClassName(r7.getPackageName(), "com.whatsapp.profile.ProfileInfoActivity");
        r7.startActivity(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:864:0x1765, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:865:0x1766, code lost:
        r8 = r3.replaceAll("\\D", "");
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:866:0x1773, code lost:
        if (r8.length() >= 5) goto L_0x177b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:867:0x1775, code lost:
        com.whatsapp.util.Log.w("bkextentionsimpl/converttointlformat/too-short-no-cc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:868:0x177b, code lost:
        r3 = X.AnonymousClass8BU.A0z(r8, "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:869:0x1785, code lost:
        if (r3.find() == false) goto L_0x17cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0231, code lost:
        if (r6 == -1808118735) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:870:0x1787, code lost:
        r10 = r3.group(1);
        X.C17960vV.A07(r10);
        r9 = r8.substring(r10.length());
        r3 = (X.AnonymousClass1LA) r2.A0N.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:871:0x17a2, code lost:
        if (X.C63942tw.A01(r3, r10, r9) != 1) goto L_0x17cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:872:0x17a4, code lost:
        r8 = java.lang.Integer.parseInt(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:874:?, code lost:
        r9 = r3.A03(r8, r9.replaceAll("\\D", ""));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:875:0x17b1, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:877:?, code lost:
        com.whatsapp.util.Log.w(X.AnonymousClass001.A1I("bkextentionsimpl/converttointlformat/trim/error ", X.AnonymousClass000.A10(), r8), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:886:0x1801, code lost:
        throw new X.AnonymousClass11T(X.AnonymousClass001.A1E(r6, "invalid jid ", X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:887:0x1802, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x1803, code lost:
        ((X.AnonymousClass190) r2.A0O.get()).A0G("bloks/openContactInfo - ", r3.getMessage(), true);
        X.C108945cZ.A0a(r2.A0R).A08(2131892931, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:889:0x1821, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0236, code lost:
        if (r6 == -672261858) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:890:0x1822, code lost:
        r7 = r12.A00;
        r8 = A0A(X.AnonymousClass8BR.A16(r7, 0));
        r11 = X.C17880vN.A0w(r7, 1);
        r0 = X.AnonymousClass8BT.A07(r7, 2);
        r6 = X.AnonymousClass8BT.A07(r7, 3);
        r5 = X.A45.A00(r3, r0);
        r0 = new java.lang.Object();
        r0.A01 = r6;
        r0.A00 = r3;
        r1 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:891:0x1847, code lost:
        if (r1 == null) goto L_0x1871;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:892:0x1849, code lost:
        r0 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:893:0x184b, code lost:
        if (r0 == null) goto L_0x1871;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:894:0x184d, code lost:
        r5 = new X.C131866ln(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:895:0x1852, code lost:
        if (r3 == null) goto L_0x186f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:896:0x1854, code lost:
        if (r6 == null) goto L_0x186f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:897:0x1856, code lost:
        r1 = new X.C131866ln(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:898:0x185b, code lost:
        X.AnonymousClass3MX.A0x(r2.A0j).CGF(new X.C21462AkT(r2, r8, r5, r1, r11, 14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:899:0x186e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0073, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:900:0x186f, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:901:0x1871, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:902:0x1873, code lost:
        r6 = r12.A00;
        r5 = X.C17880vN.A0w(r6, 0);
        r8 = r6.get(1);
        r7 = A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:904:?, code lost:
        r6 = X.A6L.A00(r2, r5);
        r5 = X.AnonymousClass17K.A04(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:905:0x1889, code lost:
        if (r5 == null) goto L_0x18a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:906:0x188b, code lost:
        r1 = new java.lang.Object[2];
        r1[0] = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:907:0x1891, code lost:
        if (r8 != null) goto L_0x1895;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:908:0x1893, code lost:
        r8 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:909:0x1895, code lost:
        ((X.AnonymousClass1L8) r2.A07.get()).CGU(r7, android.net.Uri.parse(X.AnonymousClass8BS.A0l(r8, "http://api.whatsapp.com/send?phone=%s&text=%s", r1, 1)), (X.AnonymousClass206) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x023b, code lost:
        if (r6 != 1729365000) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:910:0x18a8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:912:0x18b8, code lost:
        throw new X.AnonymousClass11T(X.AnonymousClass001.A1E(r6, "invalid jid ", X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:913:0x18b9, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:914:0x18ba, code lost:
        X.AnonymousClass8BS.A17((X.AnonymousClass190) r2.A0O.get(), "bloks/openchat", r5, true);
        X.C108945cZ.A0a(r2.A0R).A08(2131892931, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:915:0x18d3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:916:0x18d4, code lost:
        r6 = X.AnonymousClass8BT.A0t(r12, 0);
        r7 = A05(r3);
        r3 = (X.BDO) r2.A0a.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:917:0x18e6, code lost:
        if ((r7 instanceof com.whatsapp.wabloks.ui.WaBloksActivity) == false) goto L_0x1938;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:919:0x18ec, code lost:
        if (r3.BgR() == false) goto L_0x1938;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x023d, code lost:
        r6 = r7.equals("Boolean");
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:921:0x18f6, code lost:
        if (((X.ANI) r3).A06.A01(r6) == false) goto L_0x1938;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:922:0x18f8, code lost:
        r7 = (com.whatsapp.wabloks.ui.WaBloksActivity) r7;
        r7.A4P(new X.AM0(r2, r7, r6));
        r3 = X.C17880vN.A12();
        X.C17890vO.A1D(r3, 55);
        r2.A0i.get();
        r3 = X.C17880vN.A10(r3);
        r2 = X.C72483Me.A0B(r7, "com.whatsapp.contact.picker.ContactPicker", 1);
        r2.putExtra("send", true);
        r2.putExtra("skip_preview", true);
        r2.putExtra("message_types", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:923:0x192d, code lost:
        if (r6 == null) goto L_0x1934;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:924:0x192f, code lost:
        r2.putExtra("android.intent.extra.TEXT", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:925:0x1934, code lost:
        r7.startActivityForResult(r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:926:0x1937, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:927:0x1938, code lost:
        X.A6L.A02(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:928:0x193b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:929:0x193c, code lost:
        r7 = r12.A00;
        r6 = X.C17880vN.A0w(r7, 0);
        r5 = X.AnonymousClass8BT.A07(r7, 1);
        r0 = X.AnonymousClass8BT.A07(r7, 2);
        r7 = X.A45.A00(r3, r5);
        r1 = X.A45.A00(r3, r0);
        r6 = new java.io.File(java.net.URI.create(((X.C20049A4s) r2.A0F.get()).A02(r6)));
        r5 = new X.AnonymousClass7S8(r1, r7, 11);
        r3 = (X.C202911o) r2.A0A.get();
        X.AnonymousClass3MW.A1X(r3.A05, new com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1(r3, r6, (X.C30391dr) null, r5), r3.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0245, code lost:
        r6 = r7.equals("Integer");
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:930:0x1982, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:931:0x1983, code lost:
        r2 = X.AnonymousClass8BR.A0G(r12.A00, 0);
        r12 = X.C26970DNs.A06(r3, r12, 2);
        r8 = new android.app.AlertDialog.Builder(A05(r3)).setTitle(r2.A0D(40)).setMessage(r2.A0D(35));
        r6 = r2.A09(36);
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:932:0x19ae, code lost:
        if (r6 == null) goto L_0x19c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:933:0x19b0, code lost:
        r5 = r1;
        r0 = r6.A0D(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:934:0x19b5, code lost:
        if (r0 == null) goto L_0x19b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:935:0x19b7, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:936:0x19b8, code lost:
        r8.setPositiveButton(r5, new X.C20142A9e(r12, r3, r6, r10, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:937:0x19c6, code lost:
        r5 = r2.A09(38);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:938:0x19cc, code lost:
        if (r5 == null) goto L_0x19e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:939:0x19ce, code lost:
        r9 = r1;
        r0 = r5.A0D(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024d, code lost:
        r6 = r7.equals("String");
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:940:0x19d3, code lost:
        if (r0 == null) goto L_0x19d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:941:0x19d5, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:942:0x19d6, code lost:
        r8.setNegativeButton(r9, new X.C20142A9e(r12, r3, r5, r10, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:943:0x19e4, code lost:
        r2 = r2.A09(44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:944:0x19ea, code lost:
        if (r2 == null) goto L_0x1a01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:945:0x19ec, code lost:
        r0 = r2.A0D(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:946:0x19f0, code lost:
        if (r0 == null) goto L_0x19f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:947:0x19f2, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:948:0x19f3, code lost:
        r8.setNeutralButton(r1, new X.C20142A9e(r12, r3, r2, r10, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:949:0x1a01, code lost:
        r1 = r8.create();
        r1.show();
        A0C(r1.getButton(-1), r6);
        A0C(r1.getButton(-2), r5);
        A0C(r1.getButton(-3), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0254, code lost:
        if (r6 != false) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:950:0x1a20, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:951:0x1a21, code lost:
        r6 = r12.A00;
        r5 = X.AnonymousClass000.A1Y(r6.get(1));
        r3 = A05(r3);
        r7 = new X.C133336oa(X.AnonymousClass8BR.A0G(r6, 0));
        r6 = ((X.C138826xl) r2.A0B.get()).A00(r3);
        r2 = X.AnonymousClass000.A10();
        r2.append("bottom_sheet_fragment_tag");
        r3 = X.C17890vO.A0V(java.util.UUID.randomUUID(), r2);
        ((com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment) X.C138816xk.A01.peek()).A2M(com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment.A06.A00(r7, (X.C20000A2o) X.C18070vi.A0E(r6.A00), r3, r5), r3, r5, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:952:0x1a6e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:953:0x1a6f, code lost:
        r1 = r12.A00;
        r6 = X.C17880vN.A0w(r1, 0);
        r5 = X.C17880vN.A0w(r1, 1);
        r3 = A05(r3);
        r1 = ((X.AnonymousClass1FU) r3).A3T();
        r2.A0i.get();
        r1 = X.AnonymousClass1LU.A0P(r3.getApplicationContext(), r1, (android.os.Parcelable) null, (java.lang.String) null, false);
        r1.putExtra("extra_custom_bloks_use_case", r6);
        r1.putExtra("extra_custom_bloks_param", r5);
        r3.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:954:0x1a9e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:955:0x1a9f, code lost:
        r6 = r12.A00;
        r5 = X.C17880vN.A0w(r6, 0);
        r0 = X.AnonymousClass8BR.A16(r6, 1);
        r6.get(2);
        r3 = A05(r3);
        r1 = X.C108945cZ.A1G("params", A0A(r0));
        r2.A0i.get();
        r3.startActivity(X.AnonymousClass1LU.A1T(r3, r5, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:956:0x1ac6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:957:0x1ac7, code lost:
        r2 = r12.A00;
        r5 = X.AnonymousClass8BR.A0G(r2, 0);
        r7 = X.AnonymousClass8BR.A0G(r2, 1);
        r6 = A0B(X.AnonymousClass8BR.A16(r2, 2));
        r2 = A08(r5);
        r14 = A09(r5);
        r12 = new java.lang.Object();
        r12.A02 = r2;
        r8 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A01(X.C26211Cup.A03((X.DOZ) null, r3, r7), r2);
        r8.A01 = r3.A00.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:958:0x1af8, code lost:
        if (r7 == null) goto L_0x1b72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0256, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:960:0x1afe, code lost:
        if (r7.A0A(44) == null) goto L_0x1b72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:961:0x1b00, code lost:
        r0 = (java.util.Map) X.C25974Cph.A00(r3, X.C199029zJ.A01, r7.A0A(44));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:962:0x1b0c, code lost:
        r1 = new X.C187839gS();
        r1.A01 = r2;
        r1.A02 = r6;
        r1.A05 = r0;
        r1.A00 = 812974081;
        r10 = new X.C20368AHy(r1);
        r1 = A07(r5);
        r6 = A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:963:0x1b29, code lost:
        if (r1 == null) goto L_0x1b70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:964:0x1b2b, code lost:
        r1 = r1.A0A(40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:965:0x1b31, code lost:
        if (r1 == null) goto L_0x1b6e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:966:0x1b33, code lost:
        r2 = new X.ALW(r3, r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:967:0x1b39, code lost:
        r1 = A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:968:0x1b3f, code lost:
        if ((r1 instanceof com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity) == false) goto L_0x1b49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:969:0x1b41, code lost:
        ((com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity) r1).A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0257, code lost:
        if (r3 == 0) goto L_0x1fdd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:970:0x1b49, code lost:
        r9 = (X.AnonymousClass1FL) A05(r3);
        r13 = new X.AnonymousClass8d6(r2, r6);
        r2 = r5.A05;
        r0 = 43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:971:0x1b5a, code lost:
        if (r2 == 13647) goto L_0x1b62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:973:0x1b5e, code lost:
        if (r2 != 13784) goto L_0x1b77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:974:0x1b60, code lost:
        r0 = 38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:975:0x1b62, code lost:
        X.A8X.A06(r8, r9, r10, X.C26235CvV.A00(r3, r5.A09(r0)), r12, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:976:0x1b6d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:977:0x1b6e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:978:0x1b70, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:979:0x1b72, code lost:
        r0 = X.C17880vN.A11();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0259, code lost:
        if (r3 == 1) goto L_0x1fcc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:981:0x1b7d, code lost:
        throw X.AnonymousClass000.A0k("screen should be an instance of BloksScreenData or BloksScreenV2Data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:982:0x1b7e, code lost:
        r1 = r12.A00;
        r5 = X.C17880vN.A0w(r1, 0);
        r0 = X.AnonymousClass8BR.A16(r1, 1);
        r3 = A05(r3);
        r0 = X.C108945cZ.A1G("params", A0A(r0));
        r3 = ((X.AnonymousClass1FL) r3).getSupportFragmentManager();
        r1 = new com.whatsapp.wabloks.ext.WaBkGlobalInterpreterExtImpl$5(r2, r5, r0);
        r1.A28();
        r1.A2C(r3, "bloks-dialog");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:983:0x1ba9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:984:0x1baa, code lost:
        r5 = r12.A00;
        r9 = X.C17880vN.A0w(r5, 0);
        r8 = X.C17880vN.A0w(r5, 1);
        r7 = X.AnonymousClass000.A13();
        r6 = ((java.util.List) r5.get(2)).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:986:0x1bc6, code lost:
        if (r6.hasNext() == false) goto L_0x1bd7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:987:0x1bc8, code lost:
        r7.add(new X.C20518AOd((X.DFL) r6.next(), 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:988:0x1bd7, code lost:
        r6 = A05(r3);
        r5 = (X.C20000A2o) r2.A0C.get();
        r10 = X.C18070vi.A17(r5, r9);
        X.C18070vi.A0d(r8, 2);
        r3 = X.C17880vN.A0D();
        r1 = X.AnonymousClass000.A10();
        r1.append("action_sheet_buttons");
        r1 = X.C17880vN.A0t(r1, r7.hashCode());
        r3.putString("action_sheet_buttons", r1);
        r3.putString("action_sheet_title", r9);
        r3.putString("action_sheet_message", r8);
        r3.putBoolean("action_sheet_has_buttons", r10);
        r5.A04(X.C178149Bz.A00(r1), r7, "action_sheet_buttons");
        r2 = new com.whatsapp.wabloks.ui.BkActionBottomSheet();
        r2.A1R(r3);
        r2.A2C(((X.AnonymousClass1FL) r6).getSupportFragmentManager(), "bloks_action_sheet_tag");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:989:0x1c2b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x025b, code lost:
        if (r3 != 2) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:990:0x1c2c, code lost:
        X.A8X.A04(A05(r3), new X.C166558d5((java.lang.Integer) null), X.AnonymousClass8BR.A0G(r12.A00, 0).A0D(35));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:991:0x1c42, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:992:0x1c43, code lost:
        r1 = r12.A00;
        r5 = X.C17880vN.A0w(r1, 0);
        r0 = X.AnonymousClass8BR.A16(r1, 1);
        r3 = A05(r3);
        r6 = X.C108945cZ.A1G("params", A0A(r0));
        r1 = X.C17890vO.A0h(r2.A0h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:994:0x1c65, code lost:
        if (r1.hasNext() == false) goto L_0x1c8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:995:0x1c67, code lost:
        r1.next();
        X.C18070vi.A0d(r5, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:996:0x1c73, code lost:
        if (X.AnonymousClass1YE.A0A(r5, "com.bloks.www.csf", false) == false) goto L_0x1c61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:997:0x1c75, code lost:
        X.C18070vi.A0d(r3, 0);
        r1 = X.C17880vN.A0A();
        r1.setClassName(r3, "com.whatsapp.inappsupport.ui.SupportBloksActivity");
        r1.putExtra("screen_name", r5);
        r1.putExtra("screen_params", r6);
        r3.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:998:0x1c8e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:999:0x1c8f, code lost:
        r2.A0i.get();
        r3.startActivity(X.AnonymousClass1LU.A1T(r3, r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0074, code lost:
        r10 = "calendar";
        r0 = r0.A0D(35);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BKe(X.C199029zJ r32, X.C25681CkC r33, java.lang.String r34) {
        /*
            r31 = this;
            r3 = r33
            X.Boh r3 = (X.C23736Boh) r3
            r10 = r31
            X.A6L r2 = r10.A01
            r14 = r34
            int r4 = r14.hashCode()
            r13 = 43
            r5 = 5
            r8 = 4
            r7 = 36
            r11 = 35
            r6 = 3
            r1 = 2
            r0 = 1
            r9 = 0
            switch(r4) {
                case -2140546951: goto L_0x1244;
                case -2140338357: goto L_0x123c;
                case -2112667275: goto L_0x1234;
                case -2068088578: goto L_0x122c;
                case -2067649951: goto L_0x1224;
                case -1838906086: goto L_0x121c;
                case -1787809934: goto L_0x1214;
                case -1604504565: goto L_0x120c;
                case -1578886175: goto L_0x1203;
                case -1556410467: goto L_0x11fa;
                case -1507852311: goto L_0x11f1;
                case -1481223638: goto L_0x11e8;
                case -1330718402: goto L_0x11df;
                case -1276146114: goto L_0x11d6;
                case -1242219886: goto L_0x11cd;
                case -1221103914: goto L_0x11c4;
                case -1182895194: goto L_0x11ba;
                case -1175213076: goto L_0x11b0;
                case -1174424168: goto L_0x11a6;
                case -1158334287: goto L_0x119c;
                case -1086615993: goto L_0x1192;
                case -1030847255: goto L_0x1188;
                case -1003291191: goto L_0x117e;
                case -996698686: goto L_0x1174;
                case -993097054: goto L_0x116a;
                case -990185100: goto L_0x1160;
                case -962969547: goto L_0x1156;
                case -942664798: goto L_0x114c;
                case -921635786: goto L_0x1142;
                case -884670392: goto L_0x1138;
                case -809454050: goto L_0x112e;
                case -782725013: goto L_0x1124;
                case -780036552: goto L_0x111a;
                case -773489556: goto L_0x1110;
                case -760967806: goto L_0x1106;
                case -746705348: goto L_0x10fc;
                case -703852509: goto L_0x10f2;
                case -647944134: goto L_0x10e8;
                case -629460340: goto L_0x10de;
                case -606722934: goto L_0x10d4;
                case -563655164: goto L_0x10ca;
                case -541608891: goto L_0x10c0;
                case -534326238: goto L_0x10b6;
                case -531827055: goto L_0x10ac;
                case -424766062: goto L_0x10a2;
                case -363552265: goto L_0x1098;
                case -347836657: goto L_0x108e;
                case -331653351: goto L_0x1084;
                case -306959749: goto L_0x107a;
                case -300488230: goto L_0x1070;
                case -269742372: goto L_0x1066;
                case -224564602: goto L_0x105c;
                case -188753299: goto L_0x1052;
                case -161320099: goto L_0x1048;
                case -149567034: goto L_0x103e;
                case -139112662: goto L_0x1034;
                case -136229627: goto L_0x102a;
                case -78052800: goto L_0x1020;
                case -58496533: goto L_0x1016;
                case -26836955: goto L_0x100c;
                case 5923458: goto L_0x1002;
                case 136195447: goto L_0x0ff8;
                case 156743102: goto L_0x0fee;
                case 227600558: goto L_0x0fe4;
                case 243158640: goto L_0x0fda;
                case 313766265: goto L_0x0fd0;
                case 361006941: goto L_0x0fc6;
                case 458561021: goto L_0x0fbc;
                case 529905318: goto L_0x0fb2;
                case 538167952: goto L_0x0fa8;
                case 573843845: goto L_0x0f9e;
                case 598814056: goto L_0x0f94;
                case 610178701: goto L_0x0f8a;
                case 683144274: goto L_0x0f80;
                case 710140428: goto L_0x0f76;
                case 787721193: goto L_0x0f6c;
                case 830091698: goto L_0x0f62;
                case 840594967: goto L_0x0f58;
                case 878253942: goto L_0x0f4e;
                case 889592555: goto L_0x0f44;
                case 941474804: goto L_0x0f3a;
                case 959076350: goto L_0x0f30;
                case 1002037470: goto L_0x0f26;
                case 1073657643: goto L_0x0f1c;
                case 1093292105: goto L_0x0f12;
                case 1172555497: goto L_0x0f08;
                case 1179677309: goto L_0x0efe;
                case 1246727742: goto L_0x0ef4;
                case 1281868444: goto L_0x0eea;
                case 1293022601: goto L_0x0ee0;
                case 1293733961: goto L_0x0ed6;
                case 1323560766: goto L_0x0ecc;
                case 1351005683: goto L_0x0ec2;
                case 1418508999: goto L_0x0eb8;
                case 1445303016: goto L_0x0eae;
                case 1457845398: goto L_0x0ea4;
                case 1559677690: goto L_0x0e9a;
                case 1593718455: goto L_0x0e90;
                case 1613528829: goto L_0x0e86;
                case 1630315771: goto L_0x0e7c;
                case 1643041589: goto L_0x0e72;
                case 1703102103: goto L_0x0e68;
                case 1727518169: goto L_0x0e5e;
                case 1856118462: goto L_0x0e54;
                case 1866424912: goto L_0x0e4a;
                case 1914861328: goto L_0x0e40;
                case 2085194283: goto L_0x0e36;
                case 2094846105: goto L_0x0e2c;
                default: goto L_0x001d;
            }
        L_0x001d:
            r15 = -1
        L_0x001e:
            r4 = 0
            r12 = r32
            switch(r15) {
                case 0: goto L_0x1eb4;
                case 1: goto L_0x1e4d;
                case 2: goto L_0x12b5;
                case 3: goto L_0x1e1a;
                case 4: goto L_0x0ce4;
                case 5: goto L_0x1ddb;
                case 6: goto L_0x1d51;
                case 7: goto L_0x0cb5;
                case 8: goto L_0x0c8e;
                case 9: goto L_0x0c68;
                case 10: goto L_0x0bd8;
                case 11: goto L_0x12b5;
                case 12: goto L_0x0ba3;
                case 13: goto L_0x002b;
                case 14: goto L_0x1d0f;
                case 15: goto L_0x1cee;
                case 16: goto L_0x0b83;
                case 17: goto L_0x0b57;
                case 18: goto L_0x002a;
                case 19: goto L_0x01d4;
                case 20: goto L_0x1ccd;
                case 21: goto L_0x1385;
                case 22: goto L_0x091d;
                case 23: goto L_0x04e3;
                case 24: goto L_0x0b1f;
                case 25: goto L_0x0604;
                case 26: goto L_0x1cb3;
                case 27: goto L_0x156a;
                case 28: goto L_0x0adc;
                case 29: goto L_0x14e4;
                case 30: goto L_0x1c9c;
                case 31: goto L_0x0a92;
                case 32: goto L_0x135f;
                case 33: goto L_0x14dc;
                case 34: goto L_0x140f;
                case 35: goto L_0x0a71;
                case 36: goto L_0x0a41;
                case 37: goto L_0x0a10;
                case 38: goto L_0x1346;
                case 39: goto L_0x1c43;
                case 40: goto L_0x1c2c;
                case 41: goto L_0x002a;
                case 42: goto L_0x1baa;
                case 43: goto L_0x1c9c;
                case 44: goto L_0x04d8;
                case 45: goto L_0x09fb;
                case 46: goto L_0x1b7e;
                case 47: goto L_0x09d9;
                case 48: goto L_0x1ac7;
                case 49: goto L_0x094b;
                case 50: goto L_0x1a9f;
                case 51: goto L_0x1a6f;
                case 52: goto L_0x091d;
                case 53: goto L_0x12c7;
                case 54: goto L_0x1a21;
                case 55: goto L_0x08ee;
                case 56: goto L_0x1983;
                case 57: goto L_0x002a;
                case 58: goto L_0x0467;
                case 59: goto L_0x193c;
                case 60: goto L_0x08af;
                case 61: goto L_0x0882;
                case 62: goto L_0x084a;
                case 63: goto L_0x1d0f;
                case 64: goto L_0x0450;
                case 65: goto L_0x12c4;
                case 66: goto L_0x14dc;
                case 67: goto L_0x1cb3;
                case 68: goto L_0x12fb;
                case 69: goto L_0x18d4;
                case 70: goto L_0x1ac7;
                case 71: goto L_0x1873;
                case 72: goto L_0x129c;
                case 73: goto L_0x14a3;
                case 74: goto L_0x07d1;
                case 75: goto L_0x1822;
                case 76: goto L_0x14b1;
                case 77: goto L_0x05dc;
                case 78: goto L_0x14dc;
                case 79: goto L_0x025f;
                case 80: goto L_0x02c7;
                case 81: goto L_0x0794;
                case 82: goto L_0x171a;
                case 83: goto L_0x06ee;
                case 84: goto L_0x002a;
                case 85: goto L_0x1707;
                case 86: goto L_0x0206;
                case 87: goto L_0x06a9;
                case 88: goto L_0x12e3;
                case 89: goto L_0x05bf;
                case 90: goto L_0x002a;
                case 91: goto L_0x002a;
                case 92: goto L_0x05a7;
                case 93: goto L_0x01ac;
                case 94: goto L_0x1c9c;
                case 95: goto L_0x1482;
                case 96: goto L_0x0bd8;
                case 97: goto L_0x04f3;
                case 98: goto L_0x1654;
                case 99: goto L_0x068c;
                case 100: goto L_0x0640;
                case 101: goto L_0x1626;
                case 102: goto L_0x15ee;
                case 103: goto L_0x12cc;
                case 104: goto L_0x002a;
                case 105: goto L_0x0604;
                case 106: goto L_0x021e;
                case 107: goto L_0x15c2;
                default: goto L_0x0024;
            }
        L_0x0024:
            X.B6x r0 = r10.A00
            java.lang.Object r4 = r0.BKe(r12, r3, r14)
        L_0x002a:
            return r4
        L_0x002b:
            java.lang.Object r2 = r12.A00(r9)
            X.Cgj r2 = (X.C25488Cgj) r2
            X.E8A r2 = r2.A00
            r19 = r2
            java.lang.Object r0 = r12.A00(r0)
            X.DFL r0 = (X.DFL) r0
            java.lang.Object r7 = r12.A00(r1)
            X.DOZ r7 = (X.DOZ) r7
            java.util.List r11 = r12.A00
            java.lang.Object r1 = r11.get(r6)
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.String r6 = X.C17880vN.A0w(r11, r8)
            java.lang.Object r8 = r11.get(r5)
            java.lang.Long r8 = (java.lang.Long) r8
            r2 = 6
            java.lang.Object r2 = r11.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r9 = 7
            X.E8A r15 = X.AnonymousClass8BT.A08(r11, r9)
            X.9wz r18 = new X.9wz
            r9 = r18
            r9.<init>(r10)
            android.content.Context r14 = r7.A00
            java.lang.String r13 = "date"
            r9 = 36
            r12 = r13
            java.lang.String r9 = r0.A0D(r9)
            if (r9 == 0) goto L_0x0074
            r12 = r9
        L_0x0074:
            java.lang.String r11 = "calendar"
            r9 = 35
            r10 = r11
            java.lang.String r0 = r0.A0D(r9)
            if (r0 == 0) goto L_0x0080
            r10 = r0
        L_0x0080:
            if (r6 == 0) goto L_0x00fb
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r6)
            java.util.Calendar r9 = java.util.Calendar.getInstance(r0)
        L_0x008a:
            if (r1 == 0) goto L_0x0097
            long r0 = r1.longValue()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r16
            r9.setTimeInMillis(r0)
        L_0x0097:
            int r0 = r12.hashCode()
            switch(r0) {
                case -1160567386: goto L_0x00d4;
                case 3076014: goto L_0x00cb;
                case 3560141: goto L_0x00b4;
                default: goto L_0x009e;
            }
        L_0x009e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected picker mode: "
            r1.append(r0)
            r1.append(r12)
        L_0x00aa:
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "CDSDateTimePickerUtils"
            X.C25913CoX.A01(r0, r1)
            return r4
        L_0x00b4:
            java.lang.String r0 = "time"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x009e
            boolean r0 = r7.A03
            r10 = r14
            r11 = r7
            r12 = r3
            r13 = r19
            r14 = r15
            r15 = r9
            r16 = r0
            X.AnonymousClass9OQ.A00(r10, r11, r12, r13, r14, r15, r16)
            return r4
        L_0x00cb:
            boolean r0 = r12.equals(r13)
            if (r0 == 0) goto L_0x009e
            r24 = 0
            goto L_0x00de
        L_0x00d4:
            java.lang.String r0 = "date_and_time"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x009e
            r24 = 1
        L_0x00de:
            boolean r0 = r7.A03
            java.lang.String r1 = "wheels"
            boolean r12 = r10.equals(r1)
            if (r12 != 0) goto L_0x010a
            boolean r1 = r10.equals(r11)
            if (r1 != 0) goto L_0x0100
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected date picker style: "
            r1.append(r0)
            r1.append(r10)
            goto L_0x00aa
        L_0x00fb:
            java.util.Calendar r9 = java.util.Calendar.getInstance()
            goto L_0x008a
        L_0x0100:
            r26 = 2132083087(0x7f15018f, float:1.9806306E38)
            if (r0 == 0) goto L_0x0108
            r26 = 2132083086(0x7f15018e, float:1.9806304E38)
        L_0x0108:
            r11 = 0
            goto L_0x0113
        L_0x010a:
            r26 = 2132083095(0x7f150197, float:1.9806323E38)
            if (r0 == 0) goto L_0x0112
            r26 = 2132083094(0x7f150196, float:1.980632E38)
        L_0x0112:
            r11 = 1
        L_0x0113:
            if (r6 == 0) goto L_0x011e
            java.util.TimeZone r10 = java.util.TimeZone.getTimeZone(r6)
            java.util.Locale r1 = java.util.Locale.US
            r10.getDisplayName(r1)
        L_0x011e:
            java.util.Locale r1 = java.util.Locale.getDefault()
            r1.getLanguage()
            r1 = 1
            X.A9K r16 = new X.A9K
            r20 = r19
            r21 = r15
            r22 = r18
            r23 = r9
            r25 = r0
            r17 = r14
            r18 = r7
            r19 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            int r28 = r9.get(r1)
            r0 = 2
            int r29 = r9.get(r0)
            int r30 = r9.get(r5)
            android.app.DatePickerDialog r5 = new android.app.DatePickerDialog
            r24 = r5
            r25 = r14
            r27 = r16
            r24.<init>(r25, r26, r27, r28, r29, r30)
            if (r12 == 0) goto L_0x016c
            android.content.pm.ApplicationInfo r0 = r14.getApplicationInfo()
            java.lang.String r1 = r0.name
            java.lang.String r0 = "com.facebook.stella.app.StellaApplication"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016c
            android.widget.DatePicker r1 = r5.getDatePicker()
            r0 = 393216(0x60000, float:5.51013E-40)
            r1.setDescendantFocusability(r0)
        L_0x016c:
            if (r8 == 0) goto L_0x0179
            android.widget.DatePicker r9 = r5.getDatePicker()
            long r0 = A04(r8, r6)
            r9.setMinDate(r0)
        L_0x0179:
            if (r2 == 0) goto L_0x0186
            android.widget.DatePicker r8 = r5.getDatePicker()
            long r0 = A04(r2, r6)
            r8.setMaxDate(r0)
        L_0x0186:
            if (r11 == 0) goto L_0x0192
            r0 = 2131898846(0x7f1231de, float:1.9432621E38)
            java.lang.String r0 = r14.getString(r0)
            r5.setTitle(r0)
        L_0x0192:
            r1 = -1
            r0 = 2131898870(0x7f1231f6, float:1.943267E38)
            java.lang.String r0 = r14.getString(r0)
            r5.setButton(r1, r0, r5)
            if (r15 == 0) goto L_0x0684
            if (r3 == 0) goto L_0x0684
            r1 = 1
            X.A9P r0 = new X.A9P
            r0.<init>(r7, r3, r15, r1)
            r5.setOnCancelListener(r0)
            goto L_0x0684
        L_0x01ac:
            java.util.List r5 = r12.A00
            java.lang.String r1 = X.C17880vN.A0w(r5, r9)
            java.lang.String r9 = X.C17880vN.A0w(r5, r0)
            android.app.Activity r6 = A05(r3)
            boolean r0 = r6 instanceof X.AnonymousClass1FR
            if (r0 != 0) goto L_0x01c2
            java.lang.String r0 = "[Bloks][bk.action.wa.extension.ReportItem] activity doesn't implement DialogInterface"
            goto L_0x0b8f
        L_0x01c2:
            boolean r0 = r6 instanceof X.AnonymousClass01E
            if (r0 != 0) goto L_0x01ca
            java.lang.String r0 = "[Bloks][bk.action.wa.extension.ReportItem] activity is not instance of AppCompatActivity"
            goto L_0x0b8f
        L_0x01ca:
            X.1BI r7 = X.AnonymousClass3MX.A0l(r1)
            if (r7 != 0) goto L_0x124f
            java.lang.String r0 = "[Bloks][bk.action.wa.extension.ReportItem] failed to parse chat jid from string"
            goto L_0x0b8f
        L_0x01d4:
            java.util.List r10 = r12.A00
            java.lang.String r7 = X.C17880vN.A0w(r10, r9)
            java.lang.String r17 = X.C17880vN.A0w(r10, r0)
            java.lang.String r9 = X.C17880vN.A0w(r10, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r10.get(r6)
            boolean r5 = r1.equals(r0)
            java.lang.String r1 = X.C17880vN.A0w(r10, r8)
            android.app.Activity r10 = A05(r3)
            boolean r0 = r10 instanceof X.AnonymousClass1FR
            if (r0 != 0) goto L_0x01fc
            java.lang.String r0 = "[Bloks][bk.action.wa.spam.ReportSpam] activity doesn't implement DialogInterface"
            goto L_0x0b8f
        L_0x01fc:
            X.1BI r11 = X.AnonymousClass3MX.A0l(r7)
            if (r11 != 0) goto L_0x126b
            java.lang.String r0 = "[Bloks][bk.action.wa.spam.ReportSpam] failed to parse chat jid from string"
            goto L_0x0b8f
        L_0x0206:
            X.C18070vi.A0d(r12, r9)
            X.C18070vi.A0d(r3, r0)
            java.util.List r0 = r12.A00
            X.E8A r2 = X.AnonymousClass8BT.A08(r0, r9)
            X.DOZ r0 = r3.A00
            if (r0 == 0) goto L_0x002a
            android.content.Context r1 = r0.A00
            if (r2 != 0) goto L_0x1fb2
            X.A8X.A05(r1, r4)
            return r4
        L_0x021e:
            java.util.List r3 = r12.A00
            int r5 = X.AnonymousClass001.A0n(r3, r9)
            java.lang.String r7 = X.C17880vN.A0w(r3, r0)
            java.lang.String r4 = "null"
            int r6 = r7.hashCode()     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            r3 = -1808118735(0xffffffff943a4c31, float:-9.405626E-27)
            if (r6 == r3) goto L_0x024d
            r3 = -672261858(0xffffffffd7ee191e, float:-5.2358329E14)
            if (r6 == r3) goto L_0x0245
            r3 = 1729365000(0x67140408, float:6.989846E23)
            if (r6 != r3) goto L_0x0256
            java.lang.String r3 = "Boolean"
            boolean r6 = r7.equals(r3)     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            r3 = 2
            goto L_0x0254
        L_0x0245:
            java.lang.String r3 = "Integer"
            boolean r6 = r7.equals(r3)     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            r3 = 1
            goto L_0x0254
        L_0x024d:
            java.lang.String r3 = "String"
            boolean r6 = r7.equals(r3)     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            r3 = 0
        L_0x0254:
            if (r6 != 0) goto L_0x0257
        L_0x0256:
            r3 = -1
        L_0x0257:
            if (r3 == 0) goto L_0x1fdd
            if (r3 == r0) goto L_0x1fcc
            if (r3 != r1) goto L_0x002a
            goto L_0x1fbb
        L_0x025f:
            java.util.List r2 = r12.A00
            java.lang.String r1 = X.C17880vN.A0w(r2, r9)
            java.lang.String r2 = X.C17880vN.A0w(r2, r0)
            android.app.Activity r0 = A05(r3)
            android.content.Intent r3 = r0.getIntent()
            if (r1 == 0) goto L_0x002a
            if (r2 == 0) goto L_0x002a
            int r0 = r2.hashCode()
            switch(r0) {
                case -891985903: goto L_0x02ba;
                case 64711720: goto L_0x02a9;
                case 97526364: goto L_0x0297;
                case 1958052158: goto L_0x0286;
                default: goto L_0x027c;
            }
        L_0x027c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WABLOKS: getIntentParameter type not supported: "
            X.C17900vP.A0e(r0, r2, r1)
            return r4
        L_0x0286:
            java.lang.String r0 = "integer"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x027c
            int r0 = r3.getIntExtra(r1, r9)
            java.lang.String r4 = java.lang.Integer.toString(r0)
            return r4
        L_0x0297:
            java.lang.String r0 = "float"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x027c
            r0 = 0
            float r0 = r3.getFloatExtra(r1, r0)
            java.lang.String r4 = java.lang.Float.toString(r0)
            return r4
        L_0x02a9:
            java.lang.String r0 = "boolean"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x027c
            boolean r0 = r3.getBooleanExtra(r1, r9)
            java.lang.String r4 = X.AnonymousClass8BS.A0b(r0)
            return r4
        L_0x02ba:
            java.lang.String r0 = "string"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x027c
            java.lang.String r4 = r3.getStringExtra(r1)
            return r4
        L_0x02c7:
            X.C18070vi.A0d(r12, r9)
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r11 = r12.A00(r9)
            java.lang.String r7 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            X.C18070vi.A0z(r11, r7)
            X.DOZ r11 = (X.DOZ) r11
            java.lang.Object r10 = r12.A00(r0)
            X.AnonymousClass8BR.A1I(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r12.A00(r1)
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.Number"
            X.C18070vi.A0z(r1, r13)
            int r7 = X.AnonymousClass000.A0M(r1)
            java.lang.Object r1 = r12.A00(r6)
            X.C18070vi.A0z(r1, r13)
            int r15 = X.AnonymousClass000.A0M(r1)
            java.util.List r1 = r12.A00
            X.E8A r6 = X.AnonymousClass8BT.A08(r1, r8)
            X.E8A r5 = X.AnonymousClass8BT.A08(r1, r5)
            android.content.Context r14 = r11.A00
            X.9lo r1 = new X.9lo
            r1.<init>(r11, r3, r6, r5)
            r11 = r15
            if (r15 <= 0) goto L_0x200c
            if (r7 <= 0) goto L_0x200c
            android.net.Uri r3 = X.C26215Cuu.A01(r10)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.lang.String r5 = r3.getPath()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            if (r5 != 0) goto L_0x0320
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r1.A00(r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            goto L_0x1fed
        L_0x0320:
            java.io.File r17 = X.C108945cZ.A17(r5)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            boolean r5 = X.C26303CxM.A0M     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.lang.String r6 = r17.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            X.CxM r5 = new X.CxM     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r5.<init>((java.lang.String) r6)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.lang.String r13 = "Orientation"
            int r6 = r5.A0Z(r9)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r5 = 6
            if (r6 == r5) goto L_0x033c
            r5 = 8
            if (r6 != r5) goto L_0x033e
        L_0x033c:
            r11 = r7
            r7 = r15
        L_0x033e:
            android.content.ContentResolver r5 = r14.getContentResolver()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.io.InputStream r8 = r5.openInputStream(r3)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            if (r8 != 0) goto L_0x034f
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r1.A00(r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            goto L_0x1fee
        L_0x034f:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x2002 }
            r5.<init>()     // Catch:{ all -> 0x2002 }
            r5.inJustDecodeBounds = r0     // Catch:{ all -> 0x2002 }
            android.graphics.BitmapFactory.decodeStream(r8, r4, r5)     // Catch:{ all -> 0x2002 }
            int r6 = r5.outWidth     // Catch:{ all -> 0x2002 }
            int r5 = r5.outHeight     // Catch:{ all -> 0x2002 }
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch:{ all -> 0x2002 }
            r12.<init>(r9, r9, r6, r5)     // Catch:{ all -> 0x2002 }
            r8.close()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            int r6 = r12.width()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            int r5 = r12.height()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            if (r6 <= 0) goto L_0x1ffc
            if (r5 <= 0) goto L_0x1ffc
            if (r6 > r7) goto L_0x038e
            if (r5 > r11) goto L_0x038e
            X.E8A r7 = r1.A03     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            if (r7 == 0) goto L_0x002a
            X.DOZ r2 = r1.A00     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            X.Boh r6 = r1.A01     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.lang.Object[] r5 = X.AnonymousClass3MX.A1b(r2, r9)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.lang.String r2 = r3.toString()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.util.List r0 = X.C18070vi.A0O(r2, r5, r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            X.AnonymousClass8BT.A19(r6, r7, r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            goto L_0x1fef
        L_0x038e:
            android.graphics.Rect r10 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r10.<init>(r9, r9, r7, r11)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            int r5 = r12.width()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            double r7 = (double) r5     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 * r15
            int r5 = r10.width()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            double r5 = (double) r5     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            double r7 = r7 / r5
            int r5 = r12.height()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            double r5 = (double) r5     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            double r5 = r5 * r15
            int r10 = r10.height()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            double r10 = (double) r10     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            double r5 = r5 / r10
            double r10 = java.lang.Math.max(r7, r5)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            int r5 = r12.width()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            double r5 = (double) r5     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            double r5 = r5 / r10
            int r8 = (int) r5     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            int r5 = r12.height()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            double r5 = (double) r5     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            double r5 = r5 / r10
            int r7 = (int) r5     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            android.graphics.Rect r10 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r10.<init>(r9, r9, r8, r7)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            android.content.ContentResolver r5 = r14.getContentResolver()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.io.InputStream r8 = r5.openInputStream(r3)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r6 = 0
            if (r8 == 0) goto L_0x1ff6
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ all -> 0x2002 }
            if (r7 == 0) goto L_0x03e1
            int r5 = r10.width()     // Catch:{ all -> 0x2002 }
            int r3 = r10.height()     // Catch:{ all -> 0x2002 }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r7, r5, r3, r0)     // Catch:{ all -> 0x2002 }
        L_0x03e1:
            r8.close()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            if (r6 == 0) goto L_0x1ff6
            java.lang.StringBuilder r3 = X.C17900vP.A0G()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.lang.String r0 = ".jpg"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            X.00H r0 = r2.A0Q     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.lang.Object r0 = r0.get()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            X.17r r0 = (X.C218617r) r0     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.io.File r5 = r0.A0a(r3)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r5)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x1ff1 }
            r0 = 100
            r6.compress(r2, r0, r3)     // Catch:{ all -> 0x1ff1 }
            r3.flush()     // Catch:{ all -> 0x1ff1 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.lang.String r0 = r5.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            X.CxM r3 = new X.CxM     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r3.<init>((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.lang.String r2 = r17.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            X.CxM r0 = new X.CxM     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r0.<init>((java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            int r0 = r0.A0Z(r9)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            if (r0 == 0) goto L_0x042f
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r3.A0c(r13, r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r3.A0b()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
        L_0x042f:
            android.net.Uri r2 = android.net.Uri.fromFile(r5)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            X.C18070vi.A0d(r2, r9)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            X.E8A r6 = r1.A03     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            if (r6 == 0) goto L_0x002a
            X.DOZ r0 = r1.A00     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            X.Boh r5 = r1.A01     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.lang.Object[] r3 = X.AnonymousClass3MX.A1b(r0, r9)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r0 = 1
            java.util.List r0 = X.C18070vi.A0O(r2, r3, r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            X.AnonymousClass8BT.A19(r5, r6, r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            goto L_0x1ff0
        L_0x0450:
            X.DOZ r0 = r3.A00
            X.CXY r0 = r0.A02
            android.util.SparseArray r1 = r0.A00()
            r0 = 2131428251(0x7f0b039b, float:1.8478141E38)
            java.lang.Object r0 = r1.get(r0)
            android.app.Dialog r0 = (android.app.Dialog) r0
            if (r0 == 0) goto L_0x002a
            r0.dismiss()
            return r4
        L_0x0467:
            X.C18070vi.A0d(r12, r9)
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r6 = r12.A00(r9)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            X.C18070vi.A0z(r6, r1)
            X.DOZ r6 = (X.DOZ) r6
            java.lang.Object r5 = r12.A00(r0)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.C18070vi.A0z(r5, r1)
            X.DFL r5 = (X.DFL) r5
            X.E8A r8 = r5.A0A(r11)
            java.lang.String r5 = r5.A0D(r7)
            if (r5 == 0) goto L_0x049a
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x049a
            int r1 = r5.hashCode()
            switch(r1) {
                case -1367751899: goto L_0x04cd;
                case -196315310: goto L_0x04b9;
                case -94789412: goto L_0x04ae;
                default: goto L_0x049a;
            }
        L_0x049a:
            r7 = r4
        L_0x049b:
            if (r7 == 0) goto L_0x002a
            android.app.Activity r5 = A05(r3)
            java.lang.String[] r1 = new java.lang.String[r0]
            r1[r9] = r7
            X.AOf r0 = new X.AOf
            r0.<init>(r6, r3, r8)
            r2.A03(r5, r0, r1)
            return r4
        L_0x04ae:
            java.lang.String r1 = "read_contacts"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x049a
            java.lang.String r7 = "android.permission.READ_CONTACTS"
            goto L_0x049b
        L_0x04b9:
            java.lang.String r1 = "gallery"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x049a
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r5 < r1) goto L_0x04ca
            java.lang.String r7 = "android.permission.READ_MEDIA_IMAGES"
            goto L_0x049b
        L_0x04ca:
            java.lang.String r7 = "android.permission.WRITE_EXTERNAL_STORAGE"
            goto L_0x049b
        L_0x04cd:
            java.lang.String r1 = "camera"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x049a
            java.lang.String r7 = "android.permission.CAMERA"
            goto L_0x049b
        L_0x04d8:
            X.00H r0 = r2.A09
            java.lang.Object r0 = r0.get()
            X.CTN r0 = (X.CTN) r0
            X.0vk r0 = r0.A02
            goto L_0x04ed
        L_0x04e3:
            X.00H r0 = r2.A09
            java.lang.Object r0 = r0.get()
            X.CTN r0 = (X.CTN) r0
            X.0vk r0 = r0.A03
        L_0x04ed:
            if (r0 == 0) goto L_0x002a
            r0.invoke()
            return r4
        L_0x04f3:
            X.DOZ r2 = r3.A00
            java.util.List r1 = r12.A00
            java.lang.String r5 = X.C17880vN.A0w(r1, r9)
            r1.get(r0)
            android.content.Context r1 = r2.A00
            X.C18070vi.A0d(r5, r0)
            android.app.Activity r1 = X.C20101A7f.A00(r1)
            java.util.List r7 = X.C20101A7f.A03(r1)
            if (r7 == 0) goto L_0x057e
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x057e
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            int r1 = X.AnonymousClass3MX.A01(r7)
            if (r1 < 0) goto L_0x057e
        L_0x051d:
            int r3 = r1 + -1
            java.lang.Object r2 = r7.get(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r1 = r2 instanceof com.whatsapp.bloks.components.BkCdsBottomSheetFragment
            if (r1 == 0) goto L_0x057a
            boolean r1 = r2 instanceof androidx.fragment.app.DialogFragment
            if (r1 == 0) goto L_0x057a
            androidx.fragment.app.DialogFragment r2 = (androidx.fragment.app.DialogFragment) r2
            r6.add(r2)
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r2 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r2
            boolean r1 = r2.A2F(r5)
            if (r1 == 0) goto L_0x057a
        L_0x053a:
            boolean r1 = X.C17880vN.A1X(r6)
            if (r1 == 0) goto L_0x201e
            int r1 = r6.size()
            int r8 = r1 + -1
        L_0x0546:
            if (r9 >= r8) goto L_0x0583
            java.lang.Object r7 = r6.get(r9)
            androidx.fragment.app.DialogFragment r7 = (androidx.fragment.app.DialogFragment) r7
            if (r7 == 0) goto L_0x056b
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r7 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r7
            X.D8A r3 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A00(r7)
            r3.A09 = r4
            X.C0B r2 = r3.A06
            X.C0B r1 = X.C0B.FULL_SCREEN
            if (r2 != r1) goto L_0x056e
            r3.A0A = r0
            r3.A00 = r0
        L_0x0562:
            X.9WU r1 = r7.A00
            if (r1 == 0) goto L_0x056b
            com.whatsapp.avatar.editor.AvatarEditorLauncherFSActivity r1 = r1.A00
            com.whatsapp.avatar.editor.AvatarEditorLauncherFSActivity.A0V(r1)
        L_0x056b:
            int r9 = r9 + 1
            goto L_0x0546
        L_0x056e:
            X.BEZ r1 = r3.A05
            if (r1 == 0) goto L_0x0562
            r3.A0A = r0
            r3.A00 = r0
            r1.dismiss()
            goto L_0x0562
        L_0x057a:
            if (r3 < 0) goto L_0x057e
            r1 = r3
            goto L_0x051d
        L_0x057e:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            goto L_0x053a
        L_0x0583:
            int r1 = r6.size()
            int r1 = r1 + -1
            java.lang.Object r1 = r6.get(r1)
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            if (r1 == 0) goto L_0x002a
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r1 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r1
            X.D8A r3 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A00(r1)
            android.content.Context r2 = r1.A14()
            java.util.Deque r1 = r3.A0C
            int r1 = r1.size()
            if (r1 == r0) goto L_0x002a
            r3.A07(r2, r5)
            return r4
        L_0x05a7:
            r12.A00(r9)
            A05(r3)
            X.0zA r1 = r2.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002a
            r1.A03()
            java.lang.String r0 = "routeToNativeScreen"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x05bf:
            r12.A00(r9)
            java.util.List r3 = r12.A00
            r3.get(r0)
            r3.get(r1)
            X.0zA r1 = r2.A02
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002a
            r1.A03()
            java.lang.String r0 = "editBusinessName"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x05dc:
            android.app.Activity r1 = A05(r3)
            X.00H r0 = r2.A0B
            java.lang.Object r0 = r0.get()
            X.6xl r0 = (X.C138826xl) r0
            r0.A00(r1)
            java.util.Stack r1 = X.C138816xk.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x002a
            java.lang.Object r0 = r1.peek()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1GP r0 = r0.A1E()
            X.C18070vi.A0X(r0)
            r0.A0b()
            return r4
        L_0x0604:
            java.util.List r5 = r12.A00
            int r6 = X.AnonymousClass001.A0n(r5, r9)
            int r3 = X.AnonymousClass001.A0n(r5, r0)
            r5.get(r1)
            X.A47 r2 = r2.A04
            X.00H r0 = r2.A00
            int r5 = A03(r0, r3, r6)
            int r3 = A01(r0, r6)
            X.00H r1 = r2.A01
            int r0 = A02(r1, r6)
            X.19T r2 = X.A47.A00(r2, r0)
            if (r2 == 0) goto L_0x002a
            r2.markerStart(r3, r5)
            java.lang.Object r0 = r1.get()
            X.37m r0 = (X.C695137m) r0
            X.A7i r0 = r0.A06
            X.9fy r0 = X.C20104A7i.A00(r0, r6)
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "bloks_display_name"
            r2.markerAnnotate((int) r3, (int) r5, (java.lang.String) r0, (java.lang.String) r1)
            return r4
        L_0x0640:
            java.util.List r1 = r12.A00
            java.lang.String r7 = X.C17880vN.A0w(r1, r9)
            java.lang.Object r1 = r1.get(r0)
            boolean r6 = X.AnonymousClass000.A1Y(r1)
            X.DOZ r1 = r3.A00
            X.CXY r1 = r1.A02
            android.util.SparseArray r5 = r1.A00()
            r1 = 2131428251(0x7f0b039b, float:1.8478141E38)
            java.lang.Object r5 = r5.get(r1)
            android.app.ProgressDialog r5 = (android.app.ProgressDialog) r5
            android.app.Activity r3 = A05(r3)
            if (r5 == 0) goto L_0x002a
            boolean r1 = r5.isShowing()
            if (r1 == 0) goto L_0x066e
            r5.dismiss()
        L_0x066e:
            r5.setMessage(r7)
            r5.setIndeterminate(r0)
            r5.setCanceledOnTouchOutside(r9)
            if (r6 == 0) goto L_0x0688
            r5.setCancelable(r0)
            X.A9N r1 = new X.A9N
            r1.<init>(r3, r2, r0)
            r5.setOnCancelListener(r1)
        L_0x0684:
            r5.show()
            return r4
        L_0x0688:
            r5.setCancelable(r9)
            goto L_0x0684
        L_0x068c:
            java.util.List r3 = r12.A00
            r3.get(r9)
            r3.get(r0)
            r3.get(r1)
            X.0zA r1 = r2.A03
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002a
            r1.A03()
            java.lang.String r0 = "launchWebViewWithOnChange"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x06a9:
            java.util.List r0 = r12.A00
            X.E8A r6 = X.AnonymousClass8BT.A07(r0, r9)
            android.app.Activity r1 = A05(r3)
            r0 = 19
            X.AOh r5 = new X.AOh
            r5.<init>(r6, r0)
            boolean r0 = r1 instanceof com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity
            if (r0 == 0) goto L_0x06c2
            r1.finish()
            return r4
        L_0x06c2:
            boolean r3 = r1 instanceof com.whatsapp.wabloks.ui.WaBloksActivity
            X.00H r0 = r2.A0B
            java.lang.Object r0 = r0.get()
            X.6xl r0 = (X.C138826xl) r0
            r0.A00(r1)
            java.util.Stack r1 = X.C138816xk.A01
            boolean r0 = r1.isEmpty()
            if (r3 == 0) goto L_0x06e5
            if (r0 != 0) goto L_0x002a
            java.lang.Object r0 = r1.peek()
            com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment r0 = (com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment) r0
            r0.A01 = r5
        L_0x06e1:
            r0.A28()
            return r4
        L_0x06e5:
            if (r0 != 0) goto L_0x002a
            java.lang.Object r0 = r1.peek()
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            goto L_0x06e1
        L_0x06ee:
            java.util.List r2 = r12.A00
            java.util.List r3 = java.util.Collections.unmodifiableList(r2)
            java.lang.String r2 = "[Bloks logging] "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r2 = X.C17880vN.A0w(r3, r9)
            java.lang.String r0 = X.C17880vN.A0w(r3, r0)
            r5.append(r0)
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0743
            java.util.Map r0 = X.AnonymousClass8BR.A16(r3, r1)
            java.util.Iterator r3 = X.AnonymousClass000.A15(r0)
        L_0x0714:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0743
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r3)
            java.lang.String r0 = " "
            r5.append(r0)
            java.lang.String r0 = X.C17880vN.A0x(r1)
            r5.append(r0)
            java.lang.String r0 = " : "
            r5.append(r0)
            java.lang.Object r1 = r1.getValue()
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto L_0x073e
            if (r1 != 0) goto L_0x073e
            r0 = 0
        L_0x073a:
            r5.append(r0)
            goto L_0x0714
        L_0x073e:
            java.lang.String r0 = r1.toString()
            goto L_0x073a
        L_0x0743:
            java.lang.String r3 = r5.toString()
            int r0 = r2.hashCode()
            switch(r0) {
                case 97: goto L_0x075b;
                case 100: goto L_0x0767;
                case 101: goto L_0x076a;
                case 105: goto L_0x0773;
                case 118: goto L_0x077f;
                case 119: goto L_0x0788;
                default: goto L_0x074e;
            }
        L_0x074e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "[Bloks logging] incorrect level: "
            X.C17900vP.A0e(r0, r2, r1)
        L_0x0757:
            com.whatsapp.util.Log.e((java.lang.String) r3)
            return r4
        L_0x075b:
            java.lang.String r0 = "a"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x074e
            com.whatsapp.util.Log.a((java.lang.String) r3)
            return r4
        L_0x0767:
            java.lang.String r0 = "d"
            goto L_0x0781
        L_0x076a:
            java.lang.String r0 = "e"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0757
            goto L_0x074e
        L_0x0773:
            java.lang.String r0 = "i"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x074e
            com.whatsapp.util.Log.i((java.lang.String) r3)
            return r4
        L_0x077f:
            java.lang.String r0 = "v"
        L_0x0781:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x002a
            goto L_0x074e
        L_0x0788:
            java.lang.String r0 = "w"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x074e
            com.whatsapp.util.Log.w((java.lang.String) r3)
            return r4
        L_0x0794:
            java.util.List r5 = r12.A00
            int r9 = X.AnonymousClass001.A0n(r5, r9)
            int r3 = X.AnonymousClass001.A0n(r5, r0)
            java.lang.String r7 = X.C17880vN.A0w(r5, r1)
            X.A47 r6 = r2.A04
            X.00H r0 = r6.A00
            int r5 = A03(r0, r3, r9)
            int r3 = A01(r0, r9)
            X.00H r0 = r6.A01
            r0.get()
            long r1 = X.AnonymousClass8BU.A06(r5, r3)
            int r0 = A02(r0, r9)
            if (r7 == 0) goto L_0x07c7
            X.1dL r0 = X.A47.A01(r6, r0)
            if (r0 == 0) goto L_0x002a
            r0.flowEndCancel(r1, r7)
            return r4
        L_0x07c7:
            X.19T r0 = X.A47.A00(r6, r0)
            if (r0 == 0) goto L_0x002a
            r0.markerEnd(r3, r5, r8)
            return r4
        L_0x07d1:
            java.util.List r1 = r12.A00
            java.lang.String r2 = X.C17880vN.A0w(r1, r9)
            java.lang.String r1 = X.C17880vN.A0w(r1, r0)
            android.app.Activity r6 = A05(r3)
            android.net.Uri r0 = X.C26215Cuu.A01(r2)
            java.lang.String r8 = "android.intent.action.VIEW"
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r8, r0)
            if (r1 == 0) goto L_0x0830
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0830
            android.net.Uri r7 = X.C26215Cuu.A01(r1)
            if (r7 == 0) goto L_0x0801
            java.lang.String r0 = "id"
            java.lang.String r0 = r7.getQueryParameter(r0)
            r5.setPackage(r0)
        L_0x0801:
            android.content.Context r0 = r6.getApplicationContext()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r1.queryIntentActivities(r5, r0)
            java.util.Iterator r3 = r0.iterator()
            r2 = 1
        L_0x0814:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0832
            java.lang.Object r0 = r3.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            java.lang.String r1 = r0.packageName
            java.util.Set r0 = X.BVK.A03
            boolean r0 = X.C180939On.A00(r1)
            if (r0 == 0) goto L_0x0814
            r2 = 0
            goto L_0x0814
        L_0x0830:
            r7 = 0
            goto L_0x0801
        L_0x0832:
            if (r2 != 0) goto L_0x0844
            X.A5E r0 = X.A5E.A00()
            X.8Qa r1 = r0.A01()
            android.content.Context r0 = r6.getApplicationContext()
            r1.A05(r0, r5)
            return r4
        L_0x0844:
            if (r7 == 0) goto L_0x002a
            X.AnonymousClass8BT.A14(r6, r7, r8)
            return r4
        L_0x084a:
            java.util.List r3 = r12.A00
            int r5 = X.AnonymousClass001.A0n(r3, r9)
            int r9 = X.AnonymousClass001.A0n(r3, r0)
            java.lang.String r7 = X.C17880vN.A0w(r3, r1)
            java.util.Map r0 = X.AnonymousClass8BR.A16(r3, r6)
            if (r7 == 0) goto L_0x002a
            java.util.HashMap r6 = X.C17880vN.A11()
            if (r0 == 0) goto L_0x2025
            java.util.Iterator r8 = X.AnonymousClass000.A15(r0)
        L_0x0868:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x2025
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r8)
            java.lang.Object r0 = r3.getKey()
            java.lang.String r1 = r0.toString()
            java.lang.Object r0 = r3.getValue()
            r6.put(r1, r0)
            goto L_0x0868
        L_0x0882:
            java.util.List r1 = r12.A00
            int r5 = X.AnonymousClass001.A0n(r1, r9)
            int r1 = X.AnonymousClass001.A0n(r1, r0)
            X.A47 r3 = r2.A04
            X.00H r0 = r3.A00
            int r2 = A03(r0, r1, r5)
            int r1 = A01(r0, r5)
            X.00H r0 = r3.A01
            r0.get()
            long r1 = X.AnonymousClass8BU.A06(r2, r1)
            int r0 = A02(r0, r5)
            X.1dL r0 = X.A47.A01(r3, r0)
            if (r0 == 0) goto L_0x002a
            r0.flowEndSuccess(r1)
            return r4
        L_0x08af:
            java.lang.String r5 = X.AnonymousClass8BT.A0t(r12, r9)
            android.app.Activity r3 = A05(r3)
            X.00H r0 = r2.A0W
            java.lang.Object r0 = r0.get()
            X.1QS r0 = (X.AnonymousClass1QS) r0
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BPH()
            if (r0 == 0) goto L_0x002a
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r3, r0)
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x08e5
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.from"
            java.lang.String r0 = "payments:transaction"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId"
            r2.putExtra(r0, r5)
        L_0x08e5:
            java.lang.String r0 = "extra_transaction_id"
            r2.putExtra(r0, r5)
            r3.startActivity(r2)
            return r4
        L_0x08ee:
            java.util.List r5 = r12.A00
            r5.get(r9)
            r5.get(r0)
            r5.get(r1)
            r12.A00(r6)
            A05(r3)
            X.00H r1 = r2.A0g
            java.lang.Object r0 = r1.get()
            X.0zA r0 = (X.C19880zA) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r1.get()
            X.0zA r0 = (X.C19880zA) r0
            r0.A03()
            java.lang.String r0 = "uploadProfilePicture"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x091d:
            java.util.List r3 = r12.A00
            int r8 = X.AnonymousClass001.A0n(r3, r9)
            int r7 = X.AnonymousClass001.A0n(r3, r0)
            int r0 = X.AnonymousClass001.A0n(r3, r1)
            r3.get(r6)
            X.A47 r5 = r2.A04
            short r3 = (short) r0
            X.00H r0 = r5.A00
            int r2 = A03(r0, r7, r8)
            int r1 = A01(r0, r8)
            X.00H r0 = r5.A01
            int r0 = A02(r0, r8)
            X.19T r0 = X.A47.A00(r5, r0)
            if (r0 == 0) goto L_0x002a
            r0.markerEnd(r1, r2, r3)
            return r4
        L_0x094b:
            java.util.List r5 = r12.A00
            X.DFL r2 = X.AnonymousClass8BR.A0G(r5, r9)
            java.lang.Object r12 = r5.get(r0)
            X.CvV r12 = (X.C26235CvV) r12
            X.DFL r10 = X.AnonymousClass8BR.A0G(r5, r1)
            if (r2 == 0) goto L_0x002a
            if (r12 == 0) goto L_0x002a
            if (r10 == 0) goto L_0x002a
            java.lang.String r8 = r2.A0D(r13)
            if (r8 == 0) goto L_0x002a
            r1 = 38
            java.lang.String r15 = r2.A0D(r1)
            if (r15 == 0) goto L_0x002a
            r5 = 40
            r1 = -1
            int r7 = r2.A04(r5, r1)
            X.E8A r6 = r2.A0A(r11)
            if (r6 == 0) goto L_0x09d7
            X.A4p r5 = new X.A4p
            r5.<init>()
            X.DOZ r1 = r3.A00
            X.9zJ r1 = X.C20046A4p.A00(r5, r1, r9)
            java.lang.Object r6 = X.C25974Cph.A00(r3, r1, r6)
            java.util.Map r6 = (java.util.Map) r6
        L_0x098d:
            X.DOZ r5 = r3.A00
            X.D8F r1 = X.C26211Cup.A03(r5, r4, r10)
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r9 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A01(r1, r8)
            X.CXY r1 = r5.A02
            r9.A01 = r1
            X.9gS r1 = new X.9gS
            r1.<init>()
            r1.A01 = r8
            r1.A00 = r7
            r1.A04 = r6
            r1.A06 = r0
            X.AHy r11 = new X.AHy
            r11.<init>(r1)
            X.9cz r0 = new X.9cz
            r0.<init>()
            r0.A01 = r12
            r0.A00 = r3
            X.ALJ r13 = new X.ALJ
            r13.<init>()
            r13.A01 = r12
            r13.A00 = r3
            java.lang.String r0 = r0.A02
            r13.A02 = r0
            int r1 = A00(r2)
            android.app.Activity r10 = A05(r3)
            X.1FL r10 = (X.AnonymousClass1FL) r10
            X.8d6 r0 = new X.8d6
            r0.<init>(r4, r1)
            r14 = r0
            X.A8X.A06(r9, r10, r11, r12, r13, r14, r15)
            return r4
        L_0x09d7:
            r6 = r4
            goto L_0x098d
        L_0x09d9:
            java.util.List r0 = r12.A00
            java.util.Map r0 = X.AnonymousClass8BR.A16(r0, r9)
            java.util.HashMap r0 = A0A(r0)
            java.lang.String r1 = X.A6L.A01(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x002a
            X.00H r0 = r2.A0E
            java.lang.Object r0 = r0.get()
            X.9aI r0 = (X.C184029aI) r0
            java.util.HashMap r0 = r0.A01
            r0.remove(r1)
            return r4
        L_0x09fb:
            java.util.List r1 = r12.A00
            java.util.Map r2 = X.AnonymousClass8BR.A16(r1, r9)
            java.lang.Object r1 = r1.get(r0)
            if (r2 == 0) goto L_0x002a
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x002a
            java.lang.String r0 = "properties"
            goto L_0x0a85
        L_0x0a10:
            java.util.List r1 = r12.A00
            java.util.Map r5 = X.AnonymousClass8BR.A16(r1, r9)
            X.A45 r1 = X.A45.A01(r3, r1, r0)
            java.util.HashMap r0 = A0A(r5)
            java.lang.String r6 = X.A6L.A01(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x002a
            X.00H r0 = r2.A0E
            java.lang.Object r5 = r0.get()
            X.9aI r5 = (X.C184029aI) r5
            X.Boh r3 = r1.A00
            X.9k6 r2 = r5.A00
            X.E8A r0 = r1.A01
            X.9sN r1 = new X.9sN
            r1.<init>(r3, r0, r2)
            java.util.HashMap r0 = r5.A01
            r0.put(r6, r1)
            return r4
        L_0x0a41:
            java.util.List r5 = r12.A00
            r5.get(r9)
            r5.get(r0)
            r5.get(r1)
            android.app.Activity r3 = A05(r3)
            X.00H r1 = r2.A0G
            java.lang.Object r0 = r1.get()
            X.0zA r0 = (X.C19880zA) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r1.get()
            X.0zA r0 = (X.C19880zA) r0
            r0.A03()
            r3.getApplicationContext()
            java.lang.String r0 = "sendData"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0a71:
            java.util.List r1 = r12.A00
            java.util.Map r2 = X.AnonymousClass8BR.A16(r1, r9)
            java.lang.Object r1 = r1.get(r0)
            if (r2 == 0) goto L_0x002a
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x002a
            java.lang.String r0 = "children"
        L_0x0a85:
            java.util.Map r0 = X.AnonymousClass8BS.A0u(r0, r2)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x002a
            return r0
        L_0x0a92:
            java.util.List r3 = r12.A00
            int r8 = X.AnonymousClass001.A0n(r3, r9)
            int r9 = X.AnonymousClass001.A0n(r3, r0)
            X.DFL r3 = X.AnonymousClass8BR.A0G(r3, r1)
            java.lang.String r1 = r3.A0D(r11)
            java.lang.String r0 = "cancel"
            boolean r6 = r0.equals(r1)
            java.lang.String r7 = r3.A0D(r7)
            r1 = 38
            r0 = -1
            r3.A04(r1, r0)
            X.A47 r5 = r2.A04
            X.00H r0 = r5.A00
            int r2 = A03(r0, r9, r8)
            int r1 = A01(r0, r8)
            X.00H r0 = r5.A01
            r0.get()
            long r2 = X.AnonymousClass8BU.A06(r2, r1)
            int r0 = A02(r0, r8)
            X.1dL r1 = X.A47.A01(r5, r0)
            if (r1 == 0) goto L_0x002a
            X.2kh r0 = new X.2kh
            r0.<init>(r7, r6)
            r1.BLQ(r0, r2)
            return r4
        L_0x0adc:
            java.util.List r5 = r12.A00
            int r9 = X.AnonymousClass001.A0n(r5, r9)
            int r3 = X.AnonymousClass001.A0n(r5, r0)
            java.lang.String r8 = X.C17880vN.A0w(r5, r1)
            java.lang.String r7 = X.C17880vN.A0w(r5, r6)
            X.A47 r6 = r2.A04
            X.00H r0 = r6.A00
            int r5 = A03(r0, r3, r9)
            int r3 = A01(r0, r9)
            X.00H r0 = r6.A01
            r0.get()
            long r1 = X.AnonymousClass8BU.A06(r5, r3)
            int r0 = A02(r0, r9)
            if (r8 == 0) goto L_0x0b13
            X.1dL r0 = X.A47.A01(r6, r0)
            if (r0 == 0) goto L_0x002a
            r0.flowMarkError(r1, r8, r7)
            return r4
        L_0x0b13:
            X.19T r1 = X.A47.A00(r6, r0)
            if (r1 == 0) goto L_0x002a
            r0 = 87
            r1.markerEnd(r3, r5, r0)
            return r4
        L_0x0b1f:
            java.util.List r3 = r12.A00
            int r9 = X.AnonymousClass001.A0n(r3, r9)
            int r8 = X.AnonymousClass001.A0n(r3, r0)
            java.lang.String r7 = X.C17880vN.A0w(r3, r1)
            X.DFL r0 = X.AnonymousClass8BR.A0G(r3, r6)
            if (r7 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x0b55
            java.lang.String r5 = r0.A0D(r11)
        L_0x0b39:
            X.A47 r3 = r2.A04
            X.00H r0 = r3.A00
            int r2 = A03(r0, r8, r9)
            int r1 = A01(r0, r9)
            X.00H r0 = r3.A01
            int r0 = A02(r0, r9)
            X.19T r0 = X.A47.A00(r3, r0)
            if (r0 == 0) goto L_0x002a
            r0.markerPoint((int) r1, (int) r2, (java.lang.String) r7, (java.lang.String) r5)
            return r4
        L_0x0b55:
            r5 = 0
            goto L_0x0b39
        L_0x0b57:
            java.util.List r5 = r12.A00
            r5.get(r9)
            r5.get(r0)
            r5.get(r1)
            A05(r3)
            X.00H r1 = r2.A0g
            java.lang.Object r0 = r1.get()
            X.0zA r0 = (X.C19880zA) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r1.get()
            X.0zA r0 = (X.C19880zA) r0
            r0.A03()
            java.lang.String r0 = "openMediaGallery"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0b83:
            java.lang.String r3 = X.AnonymousClass8BT.A0t(r12, r9)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0b93
            java.lang.String r0 = "WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty"
        L_0x0b8f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        L_0x0b93:
            X.00H r0 = r2.A0b
            java.lang.Object r0 = r0.get()
            X.11C r0 = (X.AnonymousClass11C) r0
            android.content.ClipboardManager r1 = r0.A09()
            if (r1 == 0) goto L_0x002a
            goto L_0x20f5
        L_0x0ba3:
            java.util.List r3 = r12.A00
            int r9 = X.AnonymousClass001.A0n(r3, r9)
            int r8 = X.AnonymousClass001.A0n(r3, r0)
            java.lang.String r7 = X.C17880vN.A0w(r3, r1)
            java.lang.String r5 = X.C17880vN.A0w(r3, r6)
            X.A47 r3 = r2.A04
            X.00H r0 = r3.A00
            int r2 = A03(r0, r8, r9)
            int r1 = A01(r0, r9)
            X.00H r0 = r3.A01
            r0.get()
            long r1 = X.AnonymousClass8BU.A06(r2, r1)
            int r0 = A02(r0, r9)
            X.1dL r0 = X.A47.A01(r3, r0)
            if (r0 == 0) goto L_0x002a
            r0.flowEndFail(r1, r7, r5)
            return r4
        L_0x0bd8:
            java.util.List r3 = r12.A00
            int r13 = X.AnonymousClass001.A0n(r3, r9)
            int r12 = X.AnonymousClass001.A0n(r3, r0)
            java.util.Map r5 = X.AnonymousClass8BR.A16(r3, r1)
            if (r5 == 0) goto L_0x002a
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L_0x002a
            java.util.Iterator r15 = X.AnonymousClass000.A15(r5)     // Catch:{ ConcurrentModificationException -> 0x2103 }
        L_0x0bf2:
            boolean r3 = r15.hasNext()     // Catch:{ ConcurrentModificationException -> 0x2103 }
            if (r3 == 0) goto L_0x002a
            java.util.Map$Entry r5 = X.AnonymousClass000.A16(r15)     // Catch:{ ConcurrentModificationException -> 0x2103 }
            java.lang.Object r3 = r5.getKey()     // Catch:{ ConcurrentModificationException -> 0x2103 }
            if (r3 != 0) goto L_0x0c04
            r11 = 0
            goto L_0x0c08
        L_0x0c04:
            java.lang.String r11 = r3.toString()     // Catch:{ ConcurrentModificationException -> 0x2103 }
        L_0x0c08:
            java.lang.Object r3 = r5.getValue()     // Catch:{ ConcurrentModificationException -> 0x2103 }
            if (r3 != 0) goto L_0x0c0f
            goto L_0x0c14
        L_0x0c0f:
            java.lang.String r10 = r3.toString()     // Catch:{ ConcurrentModificationException -> 0x2103 }
            goto L_0x0c15
        L_0x0c14:
            r10 = 0
        L_0x0c15:
            if (r11 == 0) goto L_0x0bf2
            if (r10 == 0) goto L_0x0bf2
            X.A47 r14 = r2.A04     // Catch:{ ConcurrentModificationException -> 0x2103 }
            X.00H r3 = r14.A00     // Catch:{ ConcurrentModificationException -> 0x2103 }
            int r9 = A03(r3, r12, r13)     // Catch:{ ConcurrentModificationException -> 0x2103 }
            int r8 = A01(r3, r13)     // Catch:{ ConcurrentModificationException -> 0x2103 }
            X.00H r3 = r14.A01     // Catch:{ ConcurrentModificationException -> 0x2103 }
            java.lang.Object r3 = r3.get()     // Catch:{ ConcurrentModificationException -> 0x2103 }
            X.37m r3 = (X.C695137m) r3     // Catch:{ ConcurrentModificationException -> 0x2103 }
            X.A7i r5 = r3.A06     // Catch:{ ConcurrentModificationException -> 0x2103 }
            r7 = 1
            X.9fy r3 = X.C20104A7i.A00(r5, r13)     // Catch:{ ConcurrentModificationException -> 0x2103 }
            java.util.concurrent.ConcurrentHashMap r3 = r3.A03     // Catch:{ ConcurrentModificationException -> 0x2103 }
            if (r3 == 0) goto L_0x0c3d
            java.lang.Number r3 = X.C108945cZ.A1D(r11, r3)     // Catch:{ ConcurrentModificationException -> 0x2103 }
            goto L_0x0c3e
        L_0x0c3d:
            r3 = 0
        L_0x0c3e:
            r6 = -1
            if (r3 == 0) goto L_0x0c4c
            int r3 = r3.intValue()     // Catch:{ ConcurrentModificationException -> 0x2103 }
            if (r1 != r3) goto L_0x0c49
            r6 = 2
            goto L_0x0c4c
        L_0x0c49:
            if (r0 != r3) goto L_0x0c4c
            r6 = 1
        L_0x0c4c:
            X.9fy r3 = X.C20104A7i.A00(r5, r13)     // Catch:{ ConcurrentModificationException -> 0x2103 }
            int r5 = r3.A00     // Catch:{ ConcurrentModificationException -> 0x2103 }
            r3 = -1
            if (r5 == r3) goto L_0x0c5d
            if (r6 == r3) goto L_0x0c5d
            if (r5 == r1) goto L_0x0c5b
            if (r6 != r1) goto L_0x0c5e
        L_0x0c5b:
            r7 = 2
            goto L_0x0c5e
        L_0x0c5d:
            r7 = -1
        L_0x0c5e:
            X.19T r3 = X.A47.A00(r14, r7)     // Catch:{ ConcurrentModificationException -> 0x2103 }
            if (r3 == 0) goto L_0x0bf2
            r3.markerAnnotate((int) r8, (int) r9, (java.lang.String) r11, (java.lang.String) r10)     // Catch:{ ConcurrentModificationException -> 0x2103 }
            goto L_0x0bf2
        L_0x0c68:
            java.util.List r1 = r12.A00
            int r5 = X.AnonymousClass001.A0n(r1, r9)
            int r1 = X.AnonymousClass001.A0n(r1, r0)
            X.A47 r3 = r2.A04
            X.00H r0 = r3.A00
            int r2 = A03(r0, r1, r5)
            int r1 = A01(r0, r5)
            X.00H r0 = r3.A01
            int r0 = A02(r0, r5)
            X.19T r0 = X.A47.A00(r3, r0)
            if (r0 == 0) goto L_0x002a
            r0.markerDrop(r1, r2)
            return r4
        L_0x0c8e:
            java.lang.String r5 = X.AnonymousClass8BT.A0t(r12, r9)
            android.app.Activity r3 = A05(r3)
            X.00H r0 = r2.A0W
            java.lang.Object r0 = r0.get()
            X.1QS r0 = (X.AnonymousClass1QS) r0
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BYA()
            if (r0 == 0) goto L_0x002a
            android.content.Intent r1 = X.AnonymousClass8BR.A07(r3, r0)
            java.lang.String r0 = "extra_transaction_id"
            r1.putExtra(r0, r5)
            r3.startActivity(r1)
            return r4
        L_0x0cb5:
            java.util.List r0 = r12.A00
            X.DFL r0 = X.AnonymousClass8BR.A0G(r0, r9)
            X.AOc r7 = new X.AOc
            r7.<init>(r3, r9)
            android.app.Activity r6 = A05(r3)
            X.AOe r5 = new X.AOe
            r5.<init>(r3, r0, r10)
            boolean r0 = r6 instanceof X.AnonymousClass89W
            if (r0 == 0) goto L_0x210a
            r1 = r6
            X.89W r1 = (X.AnonymousClass89W) r1
            r1.CR1(r5)
            r0 = 1
            r1.CR2(r7, r5, r0)
            boolean r0 = r6 instanceof X.AnonymousClass8BI
            if (r0 == 0) goto L_0x002a
            X.8BI r6 = (X.AnonymousClass8BI) r6
            com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity r6 = (com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity) r6
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r0 = r6.A02
            r0.A07 = r7
            return r4
        L_0x0ce4:
            java.util.List r0 = r12.A00
            java.lang.Object r2 = r0.get(r9)
            X.CvV r2 = (X.C26235CvV) r2
            java.lang.Object r1 = r0.get(r1)
            X.DOZ r1 = (X.DOZ) r1
            X.DNk r0 = X.C26272CwJ.A01(r1)
            r0.A08(r2, r4)
            X.DFL r0 = r2.A01
            X.DFL r15 = X.CBy.A00(r1, r3, r0)
            X.DFL r14 = r15.A09(r7)
            java.lang.String r13 = ""
            r19 = r4
            if (r14 == 0) goto L_0x0d13
            r19 = r13
            java.lang.String r0 = r14.A0D(r7)
            if (r0 == 0) goto L_0x0d13
            r19 = r0
        L_0x0d13:
            if (r14 == 0) goto L_0x0e29
            r0 = 46
            java.lang.String r12 = r14.A0D(r0)
        L_0x0d1b:
            if (r14 == 0) goto L_0x0e26
            X.E8A r10 = r14.A0A(r11)
        L_0x0d21:
            r0 = 38
            X.DFL r9 = r15.A09(r0)
            r18 = r4
            if (r9 == 0) goto L_0x0d35
            r18 = r13
            java.lang.String r0 = r9.A0D(r7)
            if (r0 == 0) goto L_0x0d35
            r18 = r0
        L_0x0d35:
            if (r9 == 0) goto L_0x0e23
            r0 = 46
            java.lang.String r8 = r9.A0D(r0)
        L_0x0d3d:
            if (r9 == 0) goto L_0x0e20
            X.E8A r6 = r9.A0A(r11)
        L_0x0d43:
            r0 = 44
            X.DFL r5 = r15.A09(r0)
            if (r5 == 0) goto L_0x0e1d
            java.lang.String r0 = r5.A0D(r7)
            if (r0 == 0) goto L_0x0d52
            r13 = r0
        L_0x0d52:
            if (r5 == 0) goto L_0x0e1a
            r0 = 46
            java.lang.String r2 = r5.A0D(r0)
        L_0x0d5a:
            if (r5 == 0) goto L_0x0e17
            X.E8A r7 = r5.A0A(r11)
        L_0x0d60:
            android.app.Activity r17 = A05(r3)
            r0 = 1
            X.AOc r1 = new X.AOc
            r1.<init>(r3, r0)
            r3 = 40
            java.lang.String r16 = r15.A0D(r3)
            java.lang.String r11 = r15.A0D(r11)
            if (r10 == 0) goto L_0x0e14
            r15 = 20
            X.AOh r3 = new X.AOh
            r3.<init>(r10, r15)
        L_0x0d7d:
            if (r14 == 0) goto L_0x0e11
            r15 = 3
            X.AOd r10 = new X.AOd
            r10.<init>(r14, r15)
        L_0x0d85:
            if (r6 == 0) goto L_0x0e0e
            r15 = 21
            X.AOh r14 = new X.AOh
            r14.<init>(r6, r15)
        L_0x0d8e:
            if (r9 == 0) goto L_0x0e0c
            r15 = 0
            X.AOd r6 = new X.AOd
            r6.<init>(r9, r15)
        L_0x0d96:
            if (r7 == 0) goto L_0x0e0a
            r15 = 13
            X.AOh r9 = new X.AOh
            r9.<init>(r7, r15)
        L_0x0d9f:
            if (r5 == 0) goto L_0x0e08
            X.AOd r7 = new X.AOd
            r7.<init>(r5, r0)
        L_0x0da6:
            r5 = r17
            X.C18070vi.A0d(r5, r0)
            X.3Ri r5 = X.C73193Ri.A00(r17)
            r0 = r16
            r5.A0e(r0)
            r5.A0d(r11)
            r0 = 2
            X.A9Y r11 = new X.A9Y
            r11.<init>(r10, r1, r3, r0)
            r0 = r19
            r5.A0a(r11, r0)
            if (r18 == 0) goto L_0x0dcf
            r0 = 3
            X.A9Y r3 = new X.A9Y
            r3.<init>(r6, r1, r14, r0)
            r0 = r18
            r5.A0Y(r3, r0)
        L_0x0dcf:
            if (r13 == 0) goto L_0x0dda
            r3 = 4
            X.A9Y r0 = new X.A9Y
            r0.<init>(r7, r1, r9, r3)
            r5.A0Z(r0, r13)
        L_0x0dda:
            X.05w r0 = r5.create()
            r0.show()
            X.0QH r3 = r0.A00
            android.widget.Button r1 = r3.A0H
            if (r12 == 0) goto L_0x0def
            if (r1 == 0) goto L_0x0def
            r0 = 2131436043(0x7f0b220b, float:1.8493945E38)
            r1.setTag(r0, r12)
        L_0x0def:
            android.widget.Button r1 = r3.A0F
            if (r8 == 0) goto L_0x0dfb
            if (r1 == 0) goto L_0x0dfb
            r0 = 2131436043(0x7f0b220b, float:1.8493945E38)
            r1.setTag(r0, r8)
        L_0x0dfb:
            android.widget.Button r1 = r3.A0G
            if (r2 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            r0 = 2131436043(0x7f0b220b, float:1.8493945E38)
            r1.setTag(r0, r2)
            return r4
        L_0x0e08:
            r7 = r4
            goto L_0x0da6
        L_0x0e0a:
            r9 = r4
            goto L_0x0d9f
        L_0x0e0c:
            r6 = r4
            goto L_0x0d96
        L_0x0e0e:
            r14 = r4
            goto L_0x0d8e
        L_0x0e11:
            r10 = r4
            goto L_0x0d85
        L_0x0e14:
            r3 = r4
            goto L_0x0d7d
        L_0x0e17:
            r7 = r4
            goto L_0x0d60
        L_0x0e1a:
            r2 = r4
            goto L_0x0d5a
        L_0x0e1d:
            r13 = r4
            goto L_0x0d52
        L_0x0e20:
            r6 = r4
            goto L_0x0d43
        L_0x0e23:
            r8 = r4
            goto L_0x0d3d
        L_0x0e26:
            r10 = r4
            goto L_0x0d21
        L_0x0e29:
            r12 = r4
            goto L_0x0d1b
        L_0x0e2c:
            java.lang.String r4 = "wa.action.FinishActivityWithResult"
            boolean r4 = r14.equals(r4)
            r15 = 107(0x6b, float:1.5E-43)
            goto L_0x124b
        L_0x0e36:
            java.lang.String r4 = "wa.action.GetAbPropValue"
            boolean r4 = r14.equals(r4)
            r15 = 106(0x6a, float:1.49E-43)
            goto L_0x124b
        L_0x0e40:
            java.lang.String r4 = "bk.action.qpl.MarkerStartV2"
            boolean r4 = r14.equals(r4)
            r15 = 105(0x69, float:1.47E-43)
            goto L_0x124b
        L_0x0e4a:
            java.lang.String r4 = "wa.action.bloks.LaunchDialog"
            boolean r4 = r14.equals(r4)
            r15 = 104(0x68, float:1.46E-43)
            goto L_0x124b
        L_0x0e54:
            java.lang.String r4 = "bk.action.string.MatchesRegex"
            boolean r4 = r14.equals(r4)
            r15 = 103(0x67, float:1.44E-43)
            goto L_0x124b
        L_0x0e5e:
            java.lang.String r4 = "bk.action.wa.wam.SendFieldstatWithSkipServerSampling"
            boolean r4 = r14.equals(r4)
            r15 = 102(0x66, float:1.43E-43)
            goto L_0x124b
        L_0x0e68:
            java.lang.String r4 = "bk.action.io.ShowSnackbar"
            boolean r4 = r14.equals(r4)
            r15 = 101(0x65, float:1.42E-43)
            goto L_0x124b
        L_0x0e72:
            java.lang.String r4 = "wa.action.ShowProgressBar"
            boolean r4 = r14.equals(r4)
            r15 = 100
            goto L_0x124b
        L_0x0e7c:
            java.lang.String r4 = "bk.action.WebViewWithOnChange"
            boolean r4 = r14.equals(r4)
            r15 = 99
            goto L_0x124b
        L_0x0e86:
            java.lang.String r4 = "bk.fx.action.media.OpenMediaPicker"
            boolean r4 = r14.equals(r4)
            r15 = 98
            goto L_0x124b
        L_0x0e90:
            java.lang.String r4 = "bk.action.cds.UnwindToScreen"
            boolean r4 = r14.equals(r4)
            r15 = 97
            goto L_0x124b
        L_0x0e9a:
            java.lang.String r4 = "bk.action.qpl.MarkerAnnotate"
            boolean r4 = r14.equals(r4)
            r15 = 96
            goto L_0x124b
        L_0x0ea4:
            java.lang.String r4 = "bk.action.bloks.OpenBottomSheet"
            boolean r4 = r14.equals(r4)
            r15 = 95
            goto L_0x124b
        L_0x0eae:
            java.lang.String r4 = "bk.action.OpenUniversalLink"
            boolean r4 = r14.equals(r4)
            r15 = 94
            goto L_0x124b
        L_0x0eb8:
            java.lang.String r4 = "bk.action.wa.extension.ReportItem"
            boolean r4 = r14.equals(r4)
            r15 = 93
            goto L_0x124b
        L_0x0ec2:
            java.lang.String r4 = "wa.action.RouteToNativeScreen"
            boolean r4 = r14.equals(r4)
            r15 = 92
            goto L_0x124b
        L_0x0ecc:
            java.lang.String r4 = "wa.action.DismissDialog"
            boolean r4 = r14.equals(r4)
            r15 = 91
            goto L_0x124b
        L_0x0ed6:
            java.lang.String r4 = "bk.action.io.DebugToast"
            boolean r4 = r14.equals(r4)
            r15 = 90
            goto L_0x124b
        L_0x0ee0:
            java.lang.String r4 = "bk.action.nme.mv4wa.EditBusinessName"
            boolean r4 = r14.equals(r4)
            r15 = 89
            goto L_0x124b
        L_0x0eea:
            java.lang.String r4 = "wa.action.FormatString"
            boolean r4 = r14.equals(r4)
            r15 = 88
            goto L_0x124b
        L_0x0ef4:
            java.lang.String r4 = "bk.action.bloks.DismissBottomSheet"
            boolean r4 = r14.equals(r4)
            r15 = 87
            goto L_0x124b
        L_0x0efe:
            java.lang.String r4 = "bk.action.cds.UpdateBackButtonOverride"
            boolean r4 = r14.equals(r4)
            r15 = 86
            goto L_0x124b
        L_0x0f08:
            java.lang.String r4 = "wa.action.PopScreen"
            boolean r4 = r14.equals(r4)
            r15 = 85
            goto L_0x124b
        L_0x0f12:
            java.lang.String r4 = "wa.action.GetFieldStatEventId"
            boolean r4 = r14.equals(r4)
            r15 = 84
            goto L_0x124b
        L_0x0f1c:
            java.lang.String r4 = "wa.action.Logging"
            boolean r4 = r14.equals(r4)
            r15 = 83
            goto L_0x124b
        L_0x0f26:
            java.lang.String r4 = "wa.action.navigation.OpenContactInfo"
            boolean r4 = r14.equals(r4)
            r15 = 82
            goto L_0x124b
        L_0x0f30:
            java.lang.String r4 = "bk.action.qpl.userflow.EndFlowCancelV2"
            boolean r4 = r14.equals(r4)
            r15 = 81
            goto L_0x124b
        L_0x0f3a:
            java.lang.String r4 = "bk.action.foa.media.ResizeImage"
            boolean r4 = r14.equals(r4)
            r15 = 80
            goto L_0x124b
        L_0x0f44:
            java.lang.String r4 = "wa.action.GetIntentParameter"
            boolean r4 = r14.equals(r4)
            r15 = 79
            goto L_0x124b
        L_0x0f4e:
            java.lang.String r4 = "wa.action.FinishActivity"
            boolean r4 = r14.equals(r4)
            r15 = 78
            goto L_0x124b
        L_0x0f58:
            java.lang.String r4 = "bk.action.bloks.PopBottomSheet"
            boolean r4 = r14.equals(r4)
            r15 = 77
            goto L_0x124b
        L_0x0f62:
            java.lang.String r4 = "bk.action.bloks.OpenBottomSheetV2"
            boolean r4 = r14.equals(r4)
            r15 = 76
            goto L_0x124b
        L_0x0f6c:
            java.lang.String r4 = "bk.action.commerce.GetPaymentToken"
            boolean r4 = r14.equals(r4)
            r15 = 75
            goto L_0x124b
        L_0x0f76:
            java.lang.String r4 = "bk.action.DeeplinkToOtherAppOrDirectToAppStore"
            boolean r4 = r14.equals(r4)
            r15 = 74
            goto L_0x124b
        L_0x0f80:
            java.lang.String r4 = "bk.action.io.Toast"
            boolean r4 = r14.equals(r4)
            r15 = 73
            goto L_0x124b
        L_0x0f8a:
            java.lang.String r4 = "bk.action.session_store.Get"
            boolean r4 = r14.equals(r4)
            r15 = 72
            goto L_0x124b
        L_0x0f94:
            java.lang.String r4 = "wa.action.navigation.OpenChat"
            boolean r4 = r14.equals(r4)
            r15 = 71
            goto L_0x124b
        L_0x0f9e:
            java.lang.String r4 = "bk.action.cds.OpenScreen"
            boolean r4 = r14.equals(r4)
            r15 = 70
            goto L_0x124b
        L_0x0fa8:
            java.lang.String r4 = "wa.action.share.Text"
            boolean r4 = r14.equals(r4)
            r15 = 69
            goto L_0x124b
        L_0x0fb2:
            java.lang.String r4 = "bk.action.string.ParseUrl"
            boolean r4 = r14.equals(r4)
            r15 = 68
            goto L_0x124b
        L_0x0fbc:
            java.lang.String r4 = "bk.action.cds.DismissCdsBottomSheet"
            boolean r4 = r14.equals(r4)
            r15 = 67
            goto L_0x124b
        L_0x0fc6:
            java.lang.String r4 = "bk.action.navigation.CloseScreen"
            boolean r4 = r14.equals(r4)
            r15 = 66
            goto L_0x124b
        L_0x0fd0:
            java.lang.String r4 = "wa.action.GetAppType"
            boolean r4 = r14.equals(r4)
            r15 = 65
            goto L_0x124b
        L_0x0fda:
            java.lang.String r4 = "wa.action.DismissProgressBar"
            boolean r4 = r14.equals(r4)
            r15 = 64
            goto L_0x124b
        L_0x0fe4:
            java.lang.String r4 = "wa.action.SendFieldStatV2"
            boolean r4 = r14.equals(r4)
            r15 = 63
            goto L_0x124b
        L_0x0fee:
            java.lang.String r4 = "bk.action.qpl.userflow.MarkPointV2"
            boolean r4 = r14.equals(r4)
            r15 = 62
            goto L_0x124b
        L_0x0ff8:
            java.lang.String r4 = "bk.action.qpl.userflow.EndFlowSuccessV2"
            boolean r4 = r14.equals(r4)
            r15 = 61
            goto L_0x124b
        L_0x1002:
            java.lang.String r4 = "wa.action.care.OpenContactSupport"
            boolean r4 = r14.equals(r4)
            r15 = 60
            goto L_0x124b
        L_0x100c:
            java.lang.String r4 = "wa.action.media.UploadMedia"
            boolean r4 = r14.equals(r4)
            r15 = 59
            goto L_0x124b
        L_0x1016:
            java.lang.String r4 = "bk.action.RequestPermission"
            boolean r4 = r14.equals(r4)
            r15 = 58
            goto L_0x124b
        L_0x1020:
            java.lang.String r4 = "wa.action.ResetFieldStats"
            boolean r4 = r14.equals(r4)
            r15 = 57
            goto L_0x124b
        L_0x102a:
            java.lang.String r4 = "bk.action.dialog.OpenDialog"
            boolean r4 = r14.equals(r4)
            r15 = 56
            goto L_0x124b
        L_0x1034:
            java.lang.String r4 = "wa.action.UploadProfilePicture"
            boolean r4 = r14.equals(r4)
            r15 = 55
            goto L_0x124b
        L_0x103e:
            java.lang.String r4 = "bk.action.bloks.PushBottomSheet"
            boolean r4 = r14.equals(r4)
            r15 = 54
            goto L_0x124b
        L_0x1048:
            java.lang.String r4 = "wa.action.GetFieldStatElapsedTime"
            boolean r4 = r14.equals(r4)
            r15 = 53
            goto L_0x124b
        L_0x1052:
            java.lang.String r4 = "bk.action.qpl.MarkerEnd"
            boolean r4 = r14.equals(r4)
            r15 = 52
            goto L_0x124b
        L_0x105c:
            java.lang.String r4 = "bk.wa.ReportABug"
            boolean r4 = r14.equals(r4)
            r15 = 51
            goto L_0x124b
        L_0x1066:
            java.lang.String r4 = "wa.action.navigation.OpenScreenWithOptions"
            boolean r4 = r14.equals(r4)
            r15 = 50
            goto L_0x124b
        L_0x1070:
            java.lang.String r4 = "bk.action.fx.OpenSyncScreen"
            boolean r4 = r14.equals(r4)
            r15 = 49
            goto L_0x124b
        L_0x107a:
            java.lang.String r4 = "bk.action.cds.OpenCdsBottomSheet"
            boolean r4 = r14.equals(r4)
            r15 = 48
            goto L_0x124b
        L_0x1084:
            java.lang.String r4 = "wa.action.DeregDeeplinkListener"
            boolean r4 = r14.equals(r4)
            r15 = 47
            goto L_0x124b
        L_0x108e:
            java.lang.String r4 = "bk.action.bloks.LaunchDialog"
            boolean r4 = r14.equals(r4)
            r15 = 46
            goto L_0x124b
        L_0x1098:
            java.lang.String r4 = "wa.action.GetAttributeValue"
            boolean r4 = r14.equals(r4)
            r15 = 45
            goto L_0x124b
        L_0x10a2:
            java.lang.String r4 = "bk.action.avatar.PauseAutogenCamera"
            boolean r4 = r14.equals(r4)
            r15 = 44
            goto L_0x124b
        L_0x10ac:
            java.lang.String r4 = "wa.action.OpenUrl"
            boolean r4 = r14.equals(r4)
            r15 = 43
            goto L_0x124b
        L_0x10b6:
            java.lang.String r4 = "wa.action.navigation.OpenNativeActionSheet"
            boolean r4 = r14.equals(r4)
            r15 = 42
            goto L_0x124b
        L_0x10c0:
            java.lang.String r4 = "wa.action.StartFieldStatTimer"
            boolean r4 = r14.equals(r4)
            r15 = 41
            goto L_0x124b
        L_0x10ca:
            java.lang.String r4 = "bk.action.cds.PopCdsBottomSheet"
            boolean r4 = r14.equals(r4)
            r15 = 40
            goto L_0x124b
        L_0x10d4:
            java.lang.String r4 = "bk.action.bloks.OpenScreen"
            boolean r4 = r14.equals(r4)
            r15 = 39
            goto L_0x124b
        L_0x10de:
            java.lang.String r4 = "wa.action.HandleError"
            boolean r4 = r14.equals(r4)
            r15 = 38
            goto L_0x124b
        L_0x10e8:
            java.lang.String r4 = "wa.action.RegDeeplinkListener"
            boolean r4 = r14.equals(r4)
            r15 = 37
            goto L_0x124b
        L_0x10f2:
            java.lang.String r4 = "bk.action.flipper.SendData"
            boolean r4 = r14.equals(r4)
            r15 = 36
            goto L_0x124b
        L_0x10fc:
            java.lang.String r4 = "wa.action.GetChildNode"
            boolean r4 = r14.equals(r4)
            r15 = 35
            goto L_0x124b
        L_0x1106:
            java.lang.String r4 = "bk.action.foa.media.OpenCamera"
            boolean r4 = r14.equals(r4)
            r15 = 34
            goto L_0x124b
        L_0x1110:
            java.lang.String r4 = "bk.action.bloks.CloseScreenV2"
            boolean r4 = r14.equals(r4)
            r15 = 33
            goto L_0x124b
        L_0x111a:
            java.lang.String r4 = "wa.action.FormatStringV2"
            boolean r4 = r14.equals(r4)
            r15 = 32
            goto L_0x124b
        L_0x1124:
            java.lang.String r4 = "bk.action.qpl.userflow.StartFlowV2"
            boolean r4 = r14.equals(r4)
            r15 = 31
            goto L_0x124b
        L_0x112e:
            java.lang.String r4 = "bk.action.navigation.OpenUrl"
            boolean r4 = r14.equals(r4)
            r15 = 30
            goto L_0x124b
        L_0x1138:
            java.lang.String r4 = "bk.action.cds.internal.RemoveCdsBottomSheet"
            boolean r4 = r14.equals(r4)
            r15 = 29
            goto L_0x124b
        L_0x1142:
            java.lang.String r4 = "bk.action.qpl.userflow.MarkErrorV2"
            boolean r4 = r14.equals(r4)
            r15 = 28
            goto L_0x124b
        L_0x114c:
            java.lang.String r4 = "bk.action.inapppurchase.FetchPriceAndBuy"
            boolean r4 = r14.equals(r4)
            r15 = 27
            goto L_0x124b
        L_0x1156:
            java.lang.String r4 = "bk.action.cds.CloseScreen"
            boolean r4 = r14.equals(r4)
            r15 = 26
            goto L_0x124b
        L_0x1160:
            java.lang.String r4 = "bk.action.qpl.MarkerStart"
            boolean r4 = r14.equals(r4)
            r15 = 25
            goto L_0x124b
        L_0x116a:
            java.lang.String r4 = "bk.action.qpl.MarkerPoint"
            boolean r4 = r14.equals(r4)
            r15 = 24
            goto L_0x124b
        L_0x1174:
            java.lang.String r4 = "bk.action.avatar.CaptureAutogenCamera"
            boolean r4 = r14.equals(r4)
            r15 = 23
            goto L_0x124b
        L_0x117e:
            java.lang.String r4 = "bk.action.qpl.MarkerEndV2"
            boolean r4 = r14.equals(r4)
            r15 = 22
            goto L_0x124b
        L_0x1188:
            java.lang.String r4 = "wa.action.TimeInFuture"
            boolean r4 = r14.equals(r4)
            r15 = 21
            goto L_0x124b
        L_0x1192:
            java.lang.String r4 = "bk.action.wa.wam.SendFieldstatV3"
            boolean r4 = r14.equals(r4)
            r15 = 20
            goto L_0x124b
        L_0x119c:
            java.lang.String r4 = "bk.action.wa.spam.ReportSpam"
            boolean r4 = r14.equals(r4)
            r15 = 19
            goto L_0x124b
        L_0x11a6:
            java.lang.String r4 = "bk.action.logging.LogEvent"
            boolean r4 = r14.equals(r4)
            r15 = 18
            goto L_0x124b
        L_0x11b0:
            java.lang.String r4 = "wa.action.OpenMediaGallery"
            boolean r4 = r14.equals(r4)
            r15 = 17
            goto L_0x124b
        L_0x11ba:
            java.lang.String r4 = "bk.action.io.clipboard.SetString"
            boolean r4 = r14.equals(r4)
            r15 = 16
            goto L_0x124b
        L_0x11c4:
            java.lang.String r4 = "wa.action.ShowSnackbar"
            boolean r4 = r14.equals(r4)
            r15 = 15
            goto L_0x124b
        L_0x11cd:
            java.lang.String r4 = "wa.action.SendFieldStat"
            boolean r4 = r14.equals(r4)
            r15 = 14
            goto L_0x124b
        L_0x11d6:
            java.lang.String r4 = "bk.action.cds.OpenDateTimePickerV2"
            boolean r4 = r14.equals(r4)
            r15 = 13
            goto L_0x124b
        L_0x11df:
            java.lang.String r4 = "bk.action.qpl.userflow.EndFlowFailureV2"
            boolean r4 = r14.equals(r4)
            r15 = 12
            goto L_0x124b
        L_0x11e8:
            java.lang.String r4 = "bk.fx.action.GetFamilyDeviceId"
            boolean r4 = r14.equals(r4)
            r15 = 11
            goto L_0x124b
        L_0x11f1:
            java.lang.String r4 = "bk.action.qpl.userflow.AnnotateV2"
            boolean r4 = r14.equals(r4)
            r15 = 10
            goto L_0x124b
        L_0x11fa:
            java.lang.String r4 = "bk.action.qpl.MarkerDrop"
            boolean r4 = r14.equals(r4)
            r15 = 9
            goto L_0x124b
        L_0x1203:
            java.lang.String r4 = "wa.action.care.OpenReportThisPayment"
            boolean r4 = r14.equals(r4)
            r15 = 8
            goto L_0x124b
        L_0x120c:
            java.lang.String r4 = "bk.action.navigation.SetNavBar"
            boolean r4 = r14.equals(r4)
            r15 = 7
            goto L_0x124b
        L_0x1214:
            java.lang.String r4 = "wa.action.dialog.ShowDialogWithClientData"
            boolean r4 = r14.equals(r4)
            r15 = 6
            goto L_0x124b
        L_0x121c:
            java.lang.String r4 = "bk.action.preload.RequestPreloadScreenV2"
            boolean r4 = r14.equals(r4)
            r15 = 5
            goto L_0x124b
        L_0x1224:
            java.lang.String r4 = "bk.action.dialog.OpenDialogV2"
            boolean r4 = r14.equals(r4)
            r15 = 4
            goto L_0x124b
        L_0x122c:
            java.lang.String r4 = "bk.action.preload.InvalidatePreloadScreenV2"
            boolean r4 = r14.equals(r4)
            r15 = 3
            goto L_0x124b
        L_0x1234:
            java.lang.String r4 = "bk.action.caa.login.GetUniqueDeviceId"
            boolean r4 = r14.equals(r4)
            r15 = 2
            goto L_0x124b
        L_0x123c:
            java.lang.String r4 = "bk.action.cds.PushCdsBottomSheet"
            boolean r4 = r14.equals(r4)
            r15 = 1
            goto L_0x124b
        L_0x1244:
            java.lang.String r4 = "bk.action.bloks.AsyncActionWithDataManifestV2"
            boolean r4 = r14.equals(r4)
            r15 = 0
        L_0x124b:
            if (r4 != 0) goto L_0x001e
            goto L_0x001d
        L_0x124f:
            com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment r3 = new com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment
            r3.<init>()
            r10 = 1
            X.7Ca r5 = new X.7Ca
            r8 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r3.A00 = r5
            X.1FL r6 = (X.AnonymousClass1FL) r6
            X.1GP r1 = r6.getSupportFragmentManager()
            java.lang.String r0 = X.C17890vO.A0U(r3)
            X.C20098A7b.A03(r3, r1, r0)
            return r4
        L_0x126b:
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r12 = r0.A04(r1)
            if (r12 != 0) goto L_0x1277
            com.whatsapp.jid.UserJid r12 = r0.A04(r7)
        L_0x1277:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x1297
            r13 = 0
        L_0x127e:
            X.00H r0 = r2.A0j
            X.10I r1 = X.AnonymousClass3MX.A0x(r0)
            X.00H r14 = r2.A05
            X.1FR r10 = (X.AnonymousClass1FR) r10
            X.00H r15 = r2.A0P
            X.00H r0 = r2.A0K
            X.6M4 r9 = new X.6M4
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            X.C17890vO.A0u(r9, r1)
            return r4
        L_0x1297:
            X.205 r13 = X.AnonymousClass205.A01(r11, r9, r5)
            goto L_0x127e
        L_0x129c:
            X.00H r0 = r2.A0T
            java.lang.Object r0 = r0.get()
            X.11S r0 = (X.AnonymousClass11S) r0
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A01(r0)
            X.00H r0 = r2.A0H
            java.lang.Object r0 = r0.get()
            X.16R r0 = (X.AnonymousClass16R) r0
            java.util.Map r4 = r0.A00(r1)
            return r4
        L_0x12b5:
            X.00H r0 = r2.A0X
            java.lang.Object r0 = r0.get()
            X.1fU r0 = (X.C31391fU) r0
            X.2iV r0 = r0.BX3()
            java.lang.String r4 = r0.A01
            return r4
        L_0x12c4:
            java.lang.String r4 = "CONSUMER"
            return r4
        L_0x12c7:
            java.lang.Long r4 = X.C17890vO.A0L()
            return r4
        L_0x12cc:
            java.util.List r2 = r12.A00
            java.lang.String r1 = X.C17880vN.A0w(r2, r9)
            java.lang.String r0 = X.C17880vN.A0w(r2, r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            boolean r0 = X.AnonymousClass8BU.A1V(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x12e3:
            java.util.List r3 = r12.A00
            java.lang.String r5 = X.C17880vN.A0w(r3, r9)
            int r2 = X.AnonymousClass3MX.A02(r3, r0)
            java.lang.String[] r4 = new java.lang.String[r2]
        L_0x12ef:
            if (r9 >= r2) goto L_0x1380
            int r1 = r9 + 1
            java.lang.Object r0 = r3.get(r1)
            r4[r9] = r0
            r9 = r1
            goto L_0x12ef
        L_0x12fb:
            java.lang.String r0 = X.AnonymousClass8BT.A0t(r12, r9)
            android.net.Uri r6 = X.C26215Cuu.A01(r0)
            java.lang.String r5 = r6.getScheme()
            java.lang.String r3 = r6.getHost()
            java.lang.String r2 = r6.getPath()
            java.util.Set r1 = r6.getQueryParameterNames()
            java.util.HashMap r4 = X.C17880vN.A11()
            java.lang.String r0 = "scheme"
            r4.put(r0, r5)
            java.lang.String r0 = "host"
            r4.put(r0, r3)
            java.lang.String r0 = "path"
            r4.put(r0, r2)
            java.util.HashMap r3 = X.C17880vN.A11()
            java.util.Iterator r2 = r1.iterator()
        L_0x132e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1340
            java.lang.String r1 = X.C17880vN.A0v(r2)
            java.lang.String r0 = r6.getQueryParameter(r1)
            r3.put(r1, r0)
            goto L_0x132e
        L_0x1340:
            java.lang.String r0 = "url_params"
            r4.put(r0, r3)
            return r4
        L_0x1346:
            java.lang.String r2 = X.AnonymousClass8BT.A0t(r12, r9)
            java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x134e }
            goto L_0x1357
        L_0x134e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NumberUtil/Invalid long value:"
            X.C17900vP.A0e(r0, r2, r1)
        L_0x1357:
            A05(r3)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            return r4
        L_0x135f:
            java.util.List r1 = r12.A00
            java.lang.String r5 = X.C17880vN.A0w(r1, r9)
            java.lang.Object r1 = r1.get(r0)
            java.util.AbstractList r1 = (java.util.AbstractList) r1
            int r0 = r1.size()
            java.lang.String[] r4 = new java.lang.String[r0]
        L_0x1371:
            int r0 = r1.size()
            if (r9 >= r0) goto L_0x1380
            java.lang.Object r0 = r1.get(r9)
            r4[r9] = r0
            int r9 = r9 + 1
            goto L_0x1371
        L_0x1380:
            java.lang.String r4 = java.text.MessageFormat.format(r5, r4)
            return r4
        L_0x1385:
            java.util.List r10 = r12.A00
            java.lang.String r4 = X.C17880vN.A0w(r10, r9)
            r7 = 0
            long r5 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x1395 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r3
            goto L_0x13a0
        L_0x1395:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "NumberUtil/Invalid long value:"
            X.C17900vP.A0e(r1, r4, r3)
            r5 = 0
        L_0x13a0:
            java.lang.String r3 = X.C17880vN.A0w(r10, r0)
            X.00H r0 = r2.A0c
            java.lang.Object r0 = r0.get()
            X.11P r0 = (X.AnonymousClass11P) r0
            long r0 = X.AnonymousClass11P.A01(r0)
            long r5 = r5 - r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x1408
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1074026988: goto L_0x13e9;
                case -906279820: goto L_0x13d7;
                case 3208676: goto L_0x13c5;
                default: goto L_0x13c0;
            }
        L_0x13c0:
            java.lang.String r4 = java.lang.String.valueOf(r5)
            return r4
        L_0x13c5:
            java.lang.String r0 = "hour"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x13c0
            double r2 = r1.doubleValue()
            r0 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            goto L_0x13fa
        L_0x13d7:
            java.lang.String r0 = "second"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x13c0
            double r2 = r1.doubleValue()
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x13fa
        L_0x13e9:
            java.lang.String r0 = "minute"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x13c0
            double r2 = r1.doubleValue()
            r0 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
        L_0x13fa:
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            long r5 = r0.longValue()
            goto L_0x13c0
        L_0x1408:
            r0 = -1
            java.lang.String r4 = java.lang.String.valueOf(r0)
            return r4
        L_0x140f:
            X.C18070vi.A0d(r12, r9)
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r8 = r12.A00(r9)
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            X.C18070vi.A0z(r8, r5)
            X.DOZ r8 = (X.DOZ) r8
            java.lang.Object r11 = r12.A00(r0)
            X.AnonymousClass8BR.A1I(r11)
            java.util.List r5 = r12.A00
            X.E8A r7 = X.AnonymousClass8BT.A08(r5, r1)
            X.E8A r5 = X.AnonymousClass8BT.A08(r5, r6)
            X.9ln r10 = new X.9ln
            r10.<init>(r8, r3, r7, r5)
            X.DOZ r5 = r3.A00
            if (r5 == 0) goto L_0x1461
            android.content.Context r8 = r5.A00
            android.content.pm.PackageManager r12 = r8.getPackageManager()
            if (r12 == 0) goto L_0x1461
            java.lang.String r5 = "front"
            boolean r11 = r5.equals(r11)
            java.lang.String r5 = "android.hardware.camera.front"
            boolean r7 = r12.hasSystemFeature(r5)
            java.lang.String r5 = "android.hardware.camera"
            boolean r5 = r12.hasSystemFeature(r5)
            if (r11 == 0) goto L_0x145e
            if (r7 != 0) goto L_0x1464
        L_0x1458:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x145a:
            r10.A00(r0)
            return r4
        L_0x145e:
            if (r5 != 0) goto L_0x1464
            goto L_0x1458
        L_0x1461:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            goto L_0x145a
        L_0x1464:
            android.app.Activity r7 = A05(r3)
            X.C18070vi.A0X(r7)
            java.lang.String[] r5 = new java.lang.String[r6]
            java.lang.String r3 = "android.permission.CAMERA"
            r5[r9] = r3
            java.lang.String r3 = "android.permission.READ_EXTERNAL_STORAGE"
            r5[r0] = r3
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r5[r1] = r0
            X.AOg r0 = new X.AOg
            r0.<init>(r7, r8, r10, r2)
            r2.A03(r7, r0, r5)
            return r4
        L_0x1482:
            android.app.Activity r3 = A05(r3)
            java.util.List r0 = r12.A00
            X.DFL r0 = X.AnonymousClass8BR.A0G(r0, r9)
            X.6oa r1 = new X.6oa
            r1.<init>(r0)
            X.00H r0 = r2.A0B     // Catch:{ 6SR -> 0x14d4 }
            java.lang.Object r0 = r0.get()     // Catch:{ 6SR -> 0x14d4 }
            X.6xl r0 = (X.C138826xl) r0     // Catch:{ 6SR -> 0x14d4 }
            X.6xk r0 = r0.A00(r3)     // Catch:{ 6SR -> 0x14d4 }
            X.1FL r3 = (X.AnonymousClass1FL) r3     // Catch:{ 6SR -> 0x14d4 }
            r0.A00(r3, r1)     // Catch:{ 6SR -> 0x14d4 }
            return r4
        L_0x14a3:
            java.lang.String r1 = X.AnonymousClass8BT.A0t(r12, r9)
            X.00H r0 = r2.A0R
            X.1KB r0 = X.C108945cZ.A0a(r0)
            r0.A0G(r1, r9)
            return r4
        L_0x14b1:
            android.app.Activity r5 = A05(r3)
            java.util.List r0 = r12.A00
            java.lang.Object r0 = r0.get(r9)
            X.CvV r0 = (X.C26235CvV) r0
            X.8jq r1 = new X.8jq
            r1.<init>(r0, r3)
            X.00H r0 = r2.A0B     // Catch:{ 6SR -> 0x14d4 }
            java.lang.Object r0 = r0.get()     // Catch:{ 6SR -> 0x14d4 }
            X.6xl r0 = (X.C138826xl) r0     // Catch:{ 6SR -> 0x14d4 }
            X.6xk r0 = r0.A00(r5)     // Catch:{ 6SR -> 0x14d4 }
            X.1FL r5 = (X.AnonymousClass1FL) r5     // Catch:{ 6SR -> 0x14d4 }
            r0.A00(r5, r1)     // Catch:{ 6SR -> 0x14d4 }
            return r4
        L_0x14d4:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0.getMessage()
            return r4
        L_0x14dc:
            android.app.Activity r0 = A05(r3)
            r0.finish()
            return r4
        L_0x14e4:
            android.app.Activity r1 = A05(r3)
            java.lang.String r6 = X.AnonymousClass8BT.A0t(r12, r9)
            X.C18070vi.A0d(r1, r9)
            X.C18070vi.A0d(r6, r0)
            X.A8X r2 = X.A8X.A00
            android.app.Activity r0 = X.C20101A7f.A00(r1)
            java.util.List r1 = X.C20101A7f.A03(r0)
            if (r1 == 0) goto L_0x1514
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x1514
            androidx.fragment.app.DialogFragment r0 = X.A8X.A00(r2, r6, r1)
        L_0x1508:
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            if (r0 != 0) goto L_0x1516
            java.lang.String r1 = "CDSBloksBottomSheetController"
            java.lang.String r0 = "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID"
            X.C25913CoX.A01(r1, r0)
            return r4
        L_0x1514:
            r0 = 0
            goto L_0x1508
        L_0x1516:
            X.D8A r0 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A00(r0)
            java.util.Deque r1 = r0.A0C
            java.lang.Object r0 = r1.peekFirst()
            X.CSC r0 = (X.CSC) r0
            java.lang.String r5 = "CDSBloksBottomSheetDelegate"
            if (r0 == 0) goto L_0x1564
            X.EAQ r0 = r0.A04
            java.lang.String r0 = r0.BNW()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x1564
            java.util.Iterator r3 = r1.iterator()
            X.C18070vi.A0X(r3)
        L_0x1539:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1561
            java.lang.Object r2 = r3.next()
            X.CSC r2 = (X.CSC) r2
            X.EAQ r1 = r2.A04
            java.lang.String r0 = r1.BNW()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x1539
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L_0x155a
            r1.BIW()
            r2.A00 = r4
        L_0x155a:
            r1.destroy()
            r3.remove()
            return r4
        L_0x1561:
            java.lang.String r0 = "No screen found with target ID, so the screen was not removed."
            goto L_0x1566
        L_0x1564:
            java.lang.String r0 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead."
        L_0x1566:
            X.C25913CoX.A01(r5, r0)
            return r4
        L_0x156a:
            java.lang.Object r9 = r12.A00(r0)
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r12.A00(r1)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r12.A00(r6)
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r8 = r12.A00(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r13 = r12.A00(r5)
            java.lang.String r13 = (java.lang.String) r13
            r0 = 6
            java.lang.Object r7 = r12.A00(r0)
            java.util.Map r7 = (java.util.Map) r7
            r0 = 7
            java.lang.Object r6 = r12.A00(r0)
            java.lang.String r6 = (java.lang.String) r6
            r0 = 8
            java.lang.Object r0 = r12.A00(r0)
            X.Cgj r0 = (X.C25488Cgj) r0
            X.E8A r5 = r0.A00
            r0 = 18
            X.AOh r1 = new X.AOh
            r1.<init>(r5, r0)
            X.00H r0 = r2.A0S
            java.lang.Object r0 = r0.get()
            X.9ko r0 = (X.C190359ko) r0
            r14 = r10
            r15 = r8
            r16 = r13
            r17 = r6
            r18 = r9
            r19 = r11
            r20 = r7
            r11 = r0
            r12 = r1
            r13 = r3
            r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r4
        L_0x15c2:
            java.util.List r2 = r12.A00
            int r1 = X.AnonymousClass001.A0n(r2, r9)
            java.util.Map r0 = X.AnonymousClass8BR.A16(r2, r0)
            android.app.Activity r5 = A05(r3)
            if (r0 == 0) goto L_0x15ec
            java.util.HashMap r3 = A0A(r0)
        L_0x15d6:
            r2 = 0
            if (r1 == 0) goto L_0x15da
            r2 = -1
        L_0x15da:
            android.content.Intent r1 = r5.getIntent()
            if (r3 == 0) goto L_0x15e5
            java.lang.String r0 = "finish_activity_result"
            r1.putExtra(r0, r3)
        L_0x15e5:
            r5.setResult(r2, r1)
            r5.finish()
            return r4
        L_0x15ec:
            r3 = r4
            goto L_0x15d6
        L_0x15ee:
            java.util.List r10 = r12.A00
            java.lang.String r9 = X.C17880vN.A0w(r10, r9)
            int r12 = X.AnonymousClass001.A0n(r10, r0)
            int r7 = X.AnonymousClass001.A0n(r10, r1)
            java.util.Map r3 = X.AnonymousClass8BR.A16(r10, r6)
            int r14 = X.AnonymousClass001.A0n(r10, r8)
            java.lang.Object r10 = r10.get(r5)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.HashMap r11 = A0A(r3)
            if (r7 == r0) goto L_0x1624
            r13 = 2
            if (r7 == r1) goto L_0x1614
            r13 = 0
        L_0x1614:
            X.62C r1 = X.C123756Vs.A00(r9, r10, r11, r12, r13, r14)
            X.00H r0 = r2.A0k
            java.lang.Object r0 = r0.get()
            X.18K r0 = (X.AnonymousClass18K) r0
            r0.CC4(r1)
            return r4
        L_0x1624:
            r13 = 1
            goto L_0x1614
        L_0x1626:
            java.util.List r0 = r12.A00
            X.DFL r0 = X.AnonymousClass8BR.A0G(r0, r9)
            java.lang.String r8 = r0.A0D(r7)
            X.DFL r0 = r0.A09(r11)
            if (r0 == 0) goto L_0x1651
            java.lang.String r6 = r0.A0D(r7)
            X.E8A r5 = r0.A0A(r11)
        L_0x163e:
            if (r5 == 0) goto L_0x164f
            r0 = 16
            X.AOh r1 = new X.AOh
            r1.<init>(r5, r0)
        L_0x1647:
            android.app.Activity r0 = A05(r3)
            r2.A04(r0, r1, r8, r6)
            return r4
        L_0x164f:
            r1 = r4
            goto L_0x1647
        L_0x1651:
            r5 = r4
            r6 = r4
            goto L_0x163e
        L_0x1654:
            java.util.List r10 = r12.A00
            X.E8A r9 = X.AnonymousClass8BT.A07(r10, r9)
            X.E8A r7 = X.AnonymousClass8BT.A07(r10, r0)
            X.E8A r5 = X.AnonymousClass8BT.A07(r10, r1)
            java.lang.Object r0 = r10.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            java.lang.String r1 = X.C17880vN.A0w(r10, r8)
            X.A45 r10 = X.A45.A00(r3, r9)
            X.A45 r11 = X.A45.A00(r3, r7)
            X.A45 r7 = X.A45.A00(r3, r5)
            java.lang.String r0 = "CAMERA"
            boolean r1 = r0.equalsIgnoreCase(r1)
            android.app.Activity r6 = A05(r3)
            X.00H r0 = r2.A0U
            java.lang.Object r5 = r0.get()
            X.17p r5 = (X.C218417p) r5
            if (r1 == 0) goto L_0x16c1
            if (r5 == 0) goto L_0x16f6
            boolean r0 = r6 instanceof X.AnonymousClass01C
            if (r0 == 0) goto L_0x16f6
            r14 = 3
            X.Alg r9 = new X.Alg
            r12 = r7
            r13 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            r8 = r6
            X.01C r8 = (X.AnonymousClass01C) r8
            X.00H r0 = r2.A0Q
            java.lang.Object r7 = r0.get()
            X.17r r7 = (X.C218617r) r7
            X.00H r0 = r2.A0Z
            java.lang.Object r3 = r0.get()
            X.0vc r3 = (X.C18010vc) r3
            X.1So r2 = X.C26551So.A0E
            java.lang.String r1 = ".jpg"
            r0 = 1
            java.io.File r0 = X.C1403270y.A00(r7, r3, r2, r1, r0)
            android.net.Uri r0 = X.C64062u9.A02(r6, r0)
            r5.A00(r0, r8, r9)
            return r4
        L_0x16c1:
            if (r5 == 0) goto L_0x16f6
            boolean r0 = r6 instanceof X.AnonymousClass01C
            if (r0 == 0) goto L_0x16f6
            r14 = 2
            X.Alg r9 = new X.Alg
            r12 = r7
            r13 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            X.01C r6 = (X.AnonymousClass01C) r6
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.1Fv r0 = r6.getLifecycle()
            r0.A05(r5)
            X.01M r3 = r6.A04
            X.05s r2 = new X.05s
            r2.<init>()
            X.AGH r1 = new X.AGH
            r1.<init>(r6, r5, r9)
            java.lang.String r0 = "mediapicker_rq#101"
            X.05q r1 = r3.A04(r1, r2, r0)
            r5.A02 = r1
            java.lang.String r0 = "image/*"
            r1.A02(r4, r0)
            return r4
        L_0x16f6:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.lang.String r0 = "Unexpected parameters while opening media picker"
            r2.add(r0)
            X.Boh r1 = r7.A00
            X.E8A r0 = r7.A01
            X.AnonymousClass8BT.A19(A06(r1), r0, r2)
            return r4
        L_0x1707:
            java.util.List r0 = r12.A00
            java.util.Map r1 = X.AnonymousClass8BR.A16(r0, r9)
            android.app.Activity r0 = A05(r3)
            if (r1 == 0) goto L_0x1716
            A0A(r1)
        L_0x1716:
            r0.onBackPressed()
            return r4
        L_0x171a:
            java.lang.String r1 = X.AnonymousClass8BT.A0t(r12, r9)
            android.app.Activity r7 = A05(r3)
            com.whatsapp.jid.UserJid r6 = X.A6L.A00(r2, r1)     // Catch:{ 11T -> 0x1802 }
            java.lang.String r3 = X.AnonymousClass17K.A04(r6)     // Catch:{ 11T -> 0x1802 }
            if (r3 == 0) goto L_0x17f2
            X.00H r1 = r2.A0L     // Catch:{ 11T -> 0x1802 }
            java.lang.Object r1 = r1.get()     // Catch:{ 11T -> 0x1802 }
            X.1M9 r1 = (X.AnonymousClass1M9) r1     // Catch:{ 11T -> 0x1802 }
            X.1E7 r13 = r1.A0E(r6)     // Catch:{ 11T -> 0x1802 }
            if (r13 == 0) goto L_0x1766
            X.00H r1 = r2.A0T     // Catch:{ 11T -> 0x1802 }
            java.lang.Object r1 = r1.get()     // Catch:{ 11T -> 0x1802 }
            X.11S r1 = (X.AnonymousClass11S) r1     // Catch:{ 11T -> 0x1802 }
            boolean r1 = r1.A0O(r6)     // Catch:{ 11T -> 0x1802 }
            if (r1 == 0) goto L_0x1766
            X.00H r1 = r2.A06     // Catch:{ 11T -> 0x1802 }
            java.lang.Object r1 = r1.get()     // Catch:{ 11T -> 0x1802 }
            X.6oZ r1 = (X.C133326oZ) r1     // Catch:{ 11T -> 0x1802 }
            X.C18070vi.A0d(r7, r9)     // Catch:{ 11T -> 0x1802 }
            X.00H r1 = r1.A00     // Catch:{ 11T -> 0x1802 }
            android.content.Intent r5 = X.AnonymousClass3MZ.A06(r1)     // Catch:{ 11T -> 0x1802 }
            java.lang.String r3 = r7.getPackageName()     // Catch:{ 11T -> 0x1802 }
            java.lang.String r1 = "com.whatsapp.profile.ProfileInfoActivity"
            r5.setClassName(r3, r1)     // Catch:{ 11T -> 0x1802 }
            r7.startActivity(r5)     // Catch:{ 11T -> 0x1802 }
            return r4
        L_0x1766:
            java.lang.String r12 = "\\D"
            java.lang.String r11 = ""
            java.lang.String r8 = r3.replaceAll(r12, r11)     // Catch:{ 11T -> 0x1802 }
            int r1 = r8.length()     // Catch:{ 11T -> 0x1802 }
            r14 = 0
            if (r1 >= r5) goto L_0x177b
            java.lang.String r1 = "bkextentionsimpl/converttointlformat/too-short-no-cc"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 11T -> 0x1802 }
            goto L_0x17cc
        L_0x177b:
            java.lang.String r1 = "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$"
            java.util.regex.Matcher r3 = X.AnonymousClass8BU.A0z(r8, r1)     // Catch:{ 11T -> 0x1802 }
            boolean r1 = r3.find()     // Catch:{ 11T -> 0x1802 }
            if (r1 == 0) goto L_0x17cc
            java.lang.String r10 = r3.group(r0)     // Catch:{ 11T -> 0x1802 }
            X.C17960vV.A07(r10)     // Catch:{ 11T -> 0x1802 }
            int r1 = r10.length()     // Catch:{ 11T -> 0x1802 }
            java.lang.String r9 = r8.substring(r1)     // Catch:{ 11T -> 0x1802 }
            X.00H r1 = r2.A0N     // Catch:{ 11T -> 0x1802 }
            java.lang.Object r3 = r1.get()     // Catch:{ 11T -> 0x1802 }
            X.1LA r3 = (X.AnonymousClass1LA) r3     // Catch:{ 11T -> 0x1802 }
            int r1 = X.C63942tw.A01(r3, r10, r9)     // Catch:{ 11T -> 0x1802 }
            if (r1 != r0) goto L_0x17cc
            int r8 = java.lang.Integer.parseInt(r10)     // Catch:{ 11T -> 0x1802 }
            java.lang.String r1 = r9.replaceAll(r12, r11)     // Catch:{ Exception -> 0x17b1 }
            java.lang.String r9 = r3.A03(r8, r1)     // Catch:{ Exception -> 0x17b1 }
            goto L_0x17bf
        L_0x17b1:
            r5 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 11T -> 0x1802 }
            java.lang.String r1 = "bkextentionsimpl/converttointlformat/trim/error "
            java.lang.String r1 = X.AnonymousClass001.A1I(r1, r3, r8)     // Catch:{ 11T -> 0x1802 }
            com.whatsapp.util.Log.w(r1, r5)     // Catch:{ 11T -> 0x1802 }
        L_0x17bf:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 11T -> 0x1802 }
            java.lang.String r1 = "+"
            X.C17890vO.A10(r1, r10, r9, r3)     // Catch:{ 11T -> 0x1802 }
            java.lang.String r14 = r3.toString()     // Catch:{ 11T -> 0x1802 }
        L_0x17cc:
            if (r13 != 0) goto L_0x17e5
            if (r14 == 0) goto L_0x17e5
            X.00H r1 = r2.A0j     // Catch:{ 11T -> 0x1802 }
            X.10I r3 = X.AnonymousClass3MX.A0x(r1)     // Catch:{ 11T -> 0x1802 }
            r15 = 49
            X.AkN r1 = new X.AkN     // Catch:{ 11T -> 0x1802 }
            r10 = r1
            r11 = r2
            r12 = r7
            r13 = r6
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ 11T -> 0x1802 }
            r3.CGF(r1)     // Catch:{ 11T -> 0x1802 }
            return r4
        L_0x17e5:
            X.00H r1 = r2.A0i     // Catch:{ 11T -> 0x1802 }
            r1.get()     // Catch:{ 11T -> 0x1802 }
            android.content.Intent r1 = X.AnonymousClass1LU.A1D(r7, r6, r4, r0, r0)     // Catch:{ 11T -> 0x1802 }
            r7.startActivity(r1)     // Catch:{ 11T -> 0x1802 }
            return r4
        L_0x17f2:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 11T -> 0x1802 }
            java.lang.String r1 = "invalid jid "
            java.lang.String r3 = X.AnonymousClass001.A1E(r6, r1, r3)     // Catch:{ 11T -> 0x1802 }
            X.11T r1 = new X.11T     // Catch:{ 11T -> 0x1802 }
            r1.<init>((java.lang.String) r3)     // Catch:{ 11T -> 0x1802 }
            throw r1     // Catch:{ 11T -> 0x1802 }
        L_0x1802:
            r3 = move-exception
            X.00H r1 = r2.A0O
            java.lang.Object r5 = r1.get()
            X.190 r5 = (X.AnonymousClass190) r5
            java.lang.String r3 = r3.getMessage()
            java.lang.String r1 = "bloks/openContactInfo - "
            r5.A0G(r1, r3, r0)
            r3 = 2131892931(0x7f121ac3, float:1.9420624E38)
            X.00H r0 = r2.A0R
            X.1KB r1 = X.C108945cZ.A0a(r0)
            r0 = 0
            r1.A08(r3, r0)
            return r4
        L_0x1822:
            java.util.List r7 = r12.A00
            java.util.Map r5 = X.AnonymousClass8BR.A16(r7, r9)
            java.util.HashMap r8 = A0A(r5)
            java.lang.String r11 = X.C17880vN.A0w(r7, r0)
            X.E8A r0 = X.AnonymousClass8BT.A07(r7, r1)
            X.E8A r6 = X.AnonymousClass8BT.A07(r7, r6)
            X.A45 r5 = X.A45.A00(r3, r0)
            X.A45 r0 = new X.A45
            r0.<init>()
            r0.A01 = r6
            r0.A00 = r3
            X.Boh r1 = r5.A00
            if (r1 == 0) goto L_0x1871
            X.E8A r0 = r5.A01
            if (r0 == 0) goto L_0x1871
            X.6ln r5 = new X.6ln
            r5.<init>(r1, r0)
        L_0x1852:
            if (r3 == 0) goto L_0x186f
            if (r6 == 0) goto L_0x186f
            X.6ln r1 = new X.6ln
            r1.<init>(r3, r6)
        L_0x185b:
            X.00H r0 = r2.A0j
            X.10I r0 = X.AnonymousClass3MX.A0x(r0)
            r12 = 14
            X.AkT r6 = new X.AkT
            r7 = r2
            r9 = r5
            r10 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.CGF(r6)
            return r4
        L_0x186f:
            r1 = 0
            goto L_0x185b
        L_0x1871:
            r5 = 0
            goto L_0x1852
        L_0x1873:
            java.util.List r6 = r12.A00
            java.lang.String r5 = X.C17880vN.A0w(r6, r9)
            java.lang.Object r8 = r6.get(r0)
            android.app.Activity r7 = A05(r3)
            com.whatsapp.jid.UserJid r6 = X.A6L.A00(r2, r5)     // Catch:{ 11T -> 0x18b9 }
            java.lang.String r5 = X.AnonymousClass17K.A04(r6)     // Catch:{ 11T -> 0x18b9 }
            if (r5 == 0) goto L_0x18a9
            java.lang.String r3 = "http://api.whatsapp.com/send?phone=%s&text=%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ 11T -> 0x18b9 }
            r1[r9] = r5     // Catch:{ 11T -> 0x18b9 }
            if (r8 != 0) goto L_0x1895
            java.lang.String r8 = ""
        L_0x1895:
            java.lang.String r5 = X.AnonymousClass8BS.A0l(r8, r3, r1, r0)     // Catch:{ 11T -> 0x18b9 }
            X.00H r1 = r2.A07     // Catch:{ 11T -> 0x18b9 }
            java.lang.Object r3 = r1.get()     // Catch:{ 11T -> 0x18b9 }
            X.1L8 r3 = (X.AnonymousClass1L8) r3     // Catch:{ 11T -> 0x18b9 }
            android.net.Uri r1 = android.net.Uri.parse(r5)     // Catch:{ 11T -> 0x18b9 }
            r3.CGU(r7, r1, r4)     // Catch:{ 11T -> 0x18b9 }
            return r4
        L_0x18a9:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 11T -> 0x18b9 }
            java.lang.String r1 = "invalid jid "
            java.lang.String r3 = X.AnonymousClass001.A1E(r6, r1, r3)     // Catch:{ 11T -> 0x18b9 }
            X.11T r1 = new X.11T     // Catch:{ 11T -> 0x18b9 }
            r1.<init>((java.lang.String) r3)     // Catch:{ 11T -> 0x18b9 }
            throw r1     // Catch:{ 11T -> 0x18b9 }
        L_0x18b9:
            r5 = move-exception
            X.00H r1 = r2.A0O
            java.lang.Object r3 = r1.get()
            X.190 r3 = (X.AnonymousClass190) r3
            java.lang.String r1 = "bloks/openchat"
            X.AnonymousClass8BS.A17(r3, r1, r5, r0)
            r1 = 2131892931(0x7f121ac3, float:1.9420624E38)
            X.00H r0 = r2.A0R
            X.1KB r0 = X.C108945cZ.A0a(r0)
            r0.A08(r1, r9)
            return r4
        L_0x18d4:
            java.lang.String r6 = X.AnonymousClass8BT.A0t(r12, r9)
            android.app.Activity r7 = A05(r3)
            X.00H r1 = r2.A0a
            java.lang.Object r3 = r1.get()
            X.BDO r3 = (X.BDO) r3
            boolean r1 = r7 instanceof com.whatsapp.wabloks.ui.WaBloksActivity
            if (r1 == 0) goto L_0x1938
            boolean r1 = r3.BgR()
            if (r1 == 0) goto L_0x1938
            X.ANI r3 = (X.ANI) r3
            X.9zF r1 = r3.A06
            boolean r1 = r1.A01(r6)
            if (r1 == 0) goto L_0x1938
            com.whatsapp.wabloks.ui.WaBloksActivity r7 = (com.whatsapp.wabloks.ui.WaBloksActivity) r7
            X.AM0 r1 = new X.AM0
            r1.<init>(r2, r7, r6)
            r7.A4P(r1)
            java.util.HashSet r3 = X.C17880vN.A12()
            r1 = 55
            X.C17890vO.A1D(r3, r1)
            X.00H r1 = r2.A0i
            r1.get()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.util.ArrayList r3 = X.C17880vN.A10(r3)
            java.lang.String r1 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r2 = X.C72483Me.A0B(r7, r1, r0)
            java.lang.String r1 = "send"
            r2.putExtra(r1, r5)
            java.lang.String r1 = "skip_preview"
            r2.putExtra(r1, r5)
            java.lang.String r1 = "message_types"
            r2.putExtra(r1, r3)
            if (r6 == 0) goto L_0x1934
            java.lang.String r1 = "android.intent.extra.TEXT"
            r2.putExtra(r1, r6)
        L_0x1934:
            r7.startActivityForResult(r2, r0)
            return r4
        L_0x1938:
            X.A6L.A02(r7, r6)
            return r4
        L_0x193c:
            java.util.List r7 = r12.A00
            java.lang.String r6 = X.C17880vN.A0w(r7, r9)
            X.E8A r5 = X.AnonymousClass8BT.A07(r7, r0)
            X.E8A r0 = X.AnonymousClass8BT.A07(r7, r1)
            X.A45 r7 = X.A45.A00(r3, r5)
            X.A45 r1 = X.A45.A00(r3, r0)
            X.00H r0 = r2.A0F
            java.lang.Object r0 = r0.get()
            X.A4s r0 = (X.C20049A4s) r0
            java.lang.String r0 = r0.A02(r6)
            java.net.URI r0 = java.net.URI.create(r0)
            java.io.File r6 = new java.io.File
            r6.<init>(r0)
            r0 = 11
            X.7S8 r5 = new X.7S8
            r5.<init>(r1, r7, r0)
            X.00H r0 = r2.A0A
            java.lang.Object r3 = r0.get()
            X.11o r3 = (X.C202911o) r3
            X.1OX r2 = r3.A06
            X.0wl r1 = r3.A05
            com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1 r0 = new com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1
            r0.<init>(r3, r6, r4, r5)
            X.AnonymousClass3MW.A1X(r1, r0, r2)
            return r4
        L_0x1983:
            java.util.List r0 = r12.A00
            X.DFL r2 = X.AnonymousClass8BR.A0G(r0, r9)
            X.DOZ r12 = X.C26970DNs.A06(r3, r12, r1)
            android.app.Activity r0 = A05(r3)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            r0 = 40
            java.lang.String r0 = r2.A0D(r0)
            android.app.AlertDialog$Builder r1 = r1.setTitle(r0)
            java.lang.String r0 = r2.A0D(r11)
            android.app.AlertDialog$Builder r8 = r1.setMessage(r0)
            X.DFL r6 = r2.A09(r7)
            java.lang.String r1 = ""
            if (r6 == 0) goto L_0x19c6
            r5 = r1
            java.lang.String r0 = r6.A0D(r7)
            if (r0 == 0) goto L_0x19b8
            r5 = r0
        L_0x19b8:
            r16 = 0
            X.A9e r0 = new X.A9e
            r14 = r6
            r15 = r10
            r11 = r0
            r13 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r8.setPositiveButton(r5, r0)
        L_0x19c6:
            r0 = 38
            X.DFL r5 = r2.A09(r0)
            if (r5 == 0) goto L_0x19e4
            r9 = r1
            java.lang.String r0 = r5.A0D(r7)
            if (r0 == 0) goto L_0x19d6
            r9 = r0
        L_0x19d6:
            r16 = 1
            X.A9e r0 = new X.A9e
            r14 = r5
            r15 = r10
            r11 = r0
            r13 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r8.setNegativeButton(r9, r0)
        L_0x19e4:
            r0 = 44
            X.DFL r2 = r2.A09(r0)
            if (r2 == 0) goto L_0x1a01
            java.lang.String r0 = r2.A0D(r7)
            if (r0 == 0) goto L_0x19f3
            r1 = r0
        L_0x19f3:
            r16 = 2
            X.A9e r0 = new X.A9e
            r14 = r2
            r15 = r10
            r11 = r0
            r13 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r8.setNeutralButton(r1, r0)
        L_0x1a01:
            android.app.AlertDialog r1 = r8.create()
            r1.show()
            r0 = -1
            android.widget.Button r0 = r1.getButton(r0)
            A0C(r0, r6)
            r0 = -2
            android.widget.Button r0 = r1.getButton(r0)
            A0C(r0, r5)
            r0 = -3
            android.widget.Button r0 = r1.getButton(r0)
            A0C(r0, r2)
            return r4
        L_0x1a21:
            java.util.List r6 = r12.A00
            java.lang.Object r1 = r6.get(r0)
            boolean r5 = X.AnonymousClass000.A1Y(r1)
            android.app.Activity r3 = A05(r3)
            X.DFL r1 = X.AnonymousClass8BR.A0G(r6, r9)
            X.6oa r7 = new X.6oa
            r7.<init>(r1)
            X.00H r1 = r2.A0B
            java.lang.Object r1 = r1.get()
            X.6xl r1 = (X.C138826xl) r1
            X.6xk r6 = r1.A00(r3)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "bottom_sheet_fragment_tag"
            r2.append(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r3 = X.C17890vO.A0V(r1, r2)
            X.6kl r2 = com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment.A06
            X.00H r1 = r6.A00
            java.lang.Object r1 = X.C18070vi.A0E(r1)
            X.A2o r1 = (X.C20000A2o) r1
            com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment r2 = r2.A00(r7, r1, r3, r5)
            java.util.Stack r1 = X.C138816xk.A01
            java.lang.Object r1 = r1.peek()
            com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment r1 = (com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment) r1
            r1.A2M(r2, r3, r5, r0)
            return r4
        L_0x1a6f:
            java.util.List r1 = r12.A00
            java.lang.String r6 = X.C17880vN.A0w(r1, r9)
            java.lang.String r5 = X.C17880vN.A0w(r1, r0)
            android.app.Activity r3 = A05(r3)
            r0 = r3
            X.1FU r0 = (X.AnonymousClass1FU) r0
            android.net.Uri r1 = r0.A3T()
            X.00H r0 = r2.A0i
            r0.get()
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Intent r1 = X.AnonymousClass1LU.A0P(r0, r1, r4, r4, r9)
            java.lang.String r0 = "extra_custom_bloks_use_case"
            r1.putExtra(r0, r6)
            java.lang.String r0 = "extra_custom_bloks_param"
            r1.putExtra(r0, r5)
            r3.startActivity(r1)
            return r4
        L_0x1a9f:
            java.util.List r6 = r12.A00
            java.lang.String r5 = X.C17880vN.A0w(r6, r9)
            java.util.Map r0 = X.AnonymousClass8BR.A16(r6, r0)
            r6.get(r1)
            android.app.Activity r3 = A05(r3)
            java.util.HashMap r1 = A0A(r0)
            java.lang.String r0 = "params"
            java.lang.String r1 = X.C108945cZ.A1G(r0, r1)
            X.00H r0 = r2.A0i
            r0.get()
            android.content.Intent r0 = X.AnonymousClass1LU.A1T(r3, r5, r1)
            r3.startActivity(r0)
            return r4
        L_0x1ac7:
            java.util.List r2 = r12.A00
            X.DFL r5 = X.AnonymousClass8BR.A0G(r2, r9)
            X.DFL r7 = X.AnonymousClass8BR.A0G(r2, r0)
            java.util.Map r0 = X.AnonymousClass8BR.A16(r2, r1)
            java.util.HashMap r6 = A0B(r0)
            java.lang.String r2 = A08(r5)
            java.lang.String r14 = A09(r5)
            X.ALJ r12 = new X.ALJ
            r12.<init>()
            r12.A02 = r2
            X.D8F r0 = X.C26211Cup.A03(r4, r3, r7)
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r8 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A01(r0, r2)
            X.DOZ r0 = r3.A00
            X.CXY r0 = r0.A02
            r8.A01 = r0
            r1 = 44
            if (r7 == 0) goto L_0x1b72
            X.E8A r0 = r7.A0A(r1)
            if (r0 == 0) goto L_0x1b72
            X.E8A r1 = r7.A0A(r1)
            X.9zJ r0 = X.C199029zJ.A01
            java.lang.Object r0 = X.C25974Cph.A00(r3, r0, r1)
            java.util.Map r0 = (java.util.Map) r0
        L_0x1b0c:
            X.9gS r1 = new X.9gS
            r1.<init>()
            r1.A01 = r2
            r1.A02 = r6
            r1.A05 = r0
            r0 = 812974081(0x30750001, float:8.9130486E-10)
            r1.A00 = r0
            X.AHy r10 = new X.AHy
            r10.<init>(r1)
            X.DFL r1 = A07(r5)
            int r6 = A00(r1)
            if (r1 == 0) goto L_0x1b70
            r0 = 40
            X.E8A r1 = r1.A0A(r0)
        L_0x1b31:
            if (r1 == 0) goto L_0x1b6e
            r0 = 1
            X.ALW r2 = new X.ALW
            r2.<init>(r3, r1, r0)
        L_0x1b39:
            android.app.Activity r1 = A05(r3)
            boolean r0 = r1 instanceof com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity
            if (r0 == 0) goto L_0x1b49
            com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity r1 = (com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity) r1
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
        L_0x1b49:
            android.app.Activity r9 = A05(r3)
            X.1FL r9 = (X.AnonymousClass1FL) r9
            X.8d6 r13 = new X.8d6
            r13.<init>(r2, r6)
            int r2 = r5.A05
            r1 = 13647(0x354f, float:1.9124E-41)
            r0 = 43
            if (r2 == r1) goto L_0x1b62
            r0 = 13784(0x35d8, float:1.9315E-41)
            if (r2 != r0) goto L_0x1b77
            r0 = 38
        L_0x1b62:
            X.DFL r0 = r5.A09(r0)
            X.CvV r11 = X.C26235CvV.A00(r3, r0)
            X.A8X.A06(r8, r9, r10, r11, r12, r13, r14)
            return r4
        L_0x1b6e:
            r2 = r4
            goto L_0x1b39
        L_0x1b70:
            r1 = r4
            goto L_0x1b31
        L_0x1b72:
            java.util.HashMap r0 = X.C17880vN.A11()
            goto L_0x1b0c
        L_0x1b77:
            java.lang.String r0 = "screen should be an instance of BloksScreenData or BloksScreenV2Data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x1b7e:
            java.util.List r1 = r12.A00
            java.lang.String r5 = X.C17880vN.A0w(r1, r9)
            java.util.Map r0 = X.AnonymousClass8BR.A16(r1, r0)
            android.app.Activity r3 = A05(r3)
            java.util.HashMap r1 = A0A(r0)
            java.lang.String r0 = "params"
            java.lang.String r0 = X.C108945cZ.A1G(r0, r1)
            X.1FL r3 = (X.AnonymousClass1FL) r3
            X.1GP r3 = r3.getSupportFragmentManager()
            com.whatsapp.wabloks.ext.WaBkGlobalInterpreterExtImpl$5 r1 = new com.whatsapp.wabloks.ext.WaBkGlobalInterpreterExtImpl$5
            r1.<init>(r2, r5, r0)
            r1.A28()
            java.lang.String r0 = "bloks-dialog"
            r1.A2C(r3, r0)
            return r4
        L_0x1baa:
            java.util.List r5 = r12.A00
            java.lang.String r9 = X.C17880vN.A0w(r5, r9)
            java.lang.String r8 = X.C17880vN.A0w(r5, r0)
            java.lang.Object r0 = r5.get(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r0.iterator()
        L_0x1bc2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x1bd7
            java.lang.Object r5 = r6.next()
            X.DFL r5 = (X.DFL) r5
            X.AOd r0 = new X.AOd
            r0.<init>(r5, r1)
            r7.add(r0)
            goto L_0x1bc2
        L_0x1bd7:
            android.app.Activity r6 = A05(r3)
            X.00H r0 = r2.A0C
            java.lang.Object r5 = r0.get()
            X.A2o r5 = (X.C20000A2o) r5
            boolean r10 = X.C18070vi.A17(r5, r9)
            X.C18070vi.A0d(r8, r1)
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r2 = "action_sheet_buttons"
            r1.append(r2)
            int r0 = r7.hashCode()
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)
            r3.putString(r2, r1)
            java.lang.String r0 = "action_sheet_title"
            r3.putString(r0, r9)
            java.lang.String r0 = "action_sheet_message"
            r3.putString(r0, r8)
            java.lang.String r0 = "action_sheet_has_buttons"
            r3.putBoolean(r0, r10)
            X.BwP r0 = X.C178149Bz.A00(r1)
            r5.A04(r0, r7, r2)
            com.whatsapp.wabloks.ui.BkActionBottomSheet r2 = new com.whatsapp.wabloks.ui.BkActionBottomSheet
            r2.<init>()
            r2.A1R(r3)
            X.1FL r6 = (X.AnonymousClass1FL) r6
            X.1GP r1 = r6.getSupportFragmentManager()
            java.lang.String r0 = "bloks_action_sheet_tag"
            r2.A2C(r1, r0)
            return r4
        L_0x1c2c:
            java.util.List r0 = r12.A00
            X.DFL r0 = X.AnonymousClass8BR.A0G(r0, r9)
            java.lang.String r2 = r0.A0D(r11)
            android.app.Activity r1 = A05(r3)
            X.8d5 r0 = new X.8d5
            r0.<init>(r4)
            X.A8X.A04(r1, r0, r2)
            return r4
        L_0x1c43:
            java.util.List r1 = r12.A00
            java.lang.String r5 = X.C17880vN.A0w(r1, r9)
            java.util.Map r0 = X.AnonymousClass8BR.A16(r1, r0)
            android.app.Activity r3 = A05(r3)
            java.util.HashMap r1 = A0A(r0)
            java.lang.String r0 = "params"
            java.lang.String r6 = X.C108945cZ.A1G(r0, r1)
            X.00H r0 = r2.A0h
            java.util.Iterator r1 = X.C17890vO.A0h(r0)
        L_0x1c61:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1c8f
            r1.next()
            X.C18070vi.A0d(r5, r9)
            java.lang.String r0 = "com.bloks.www.csf"
            boolean r0 = X.AnonymousClass1YE.A0A(r5, r0, r9)
            if (r0 == 0) goto L_0x1c61
            X.C18070vi.A0d(r3, r9)
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.SupportBloksActivity"
            r1.setClassName(r3, r0)
            java.lang.String r0 = "screen_name"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "screen_params"
            r1.putExtra(r0, r6)
            r3.startActivity(r1)
            return r4
        L_0x1c8f:
            X.00H r0 = r2.A0i
            r0.get()
            android.content.Intent r0 = X.AnonymousClass1LU.A1T(r3, r5, r6)
            r3.startActivity(r0)
            return r4
        L_0x1c9c:
            java.lang.String r5 = X.AnonymousClass8BT.A0t(r12, r9)
            android.app.Activity r1 = A05(r3)
            X.00H r0 = r2.A0Y
            java.lang.Object r0 = r0.get()
            X.2jN r0 = (X.C57622jN) r0
            X.C18070vi.A0d(r1, r9)
            r0.A00(r1, r5, r4, r9)
            return r4
        L_0x1cb3:
            java.util.List r0 = r12.A00
            X.DFL r5 = X.AnonymousClass8BR.A0G(r0, r9)
            android.app.Activity r2 = A05(r3)
            X.DOZ r1 = X.C26970DNs.A06(r3, r12, r1)
            if (r5 == 0) goto L_0x1ccb
            X.E8A r0 = r5.A0A(r11)
        L_0x1cc7:
            X.A8X.A03(r2, r1, r5, r0)
            return r4
        L_0x1ccb:
            r0 = r4
            goto L_0x1cc7
        L_0x1ccd:
            java.util.List r7 = r12.A00
            java.lang.String r10 = X.C17880vN.A0w(r7, r9)
            int r13 = X.AnonymousClass001.A0n(r7, r0)
            int r9 = X.AnonymousClass001.A0n(r7, r1)
            java.util.Map r3 = X.AnonymousClass8BR.A16(r7, r6)
            int r15 = X.AnonymousClass001.A0n(r7, r8)
            java.lang.Object r11 = r7.get(r5)
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.HashMap r12 = A0A(r3)
            goto L_0x1d34
        L_0x1cee:
            java.util.List r5 = r12.A00
            java.lang.String r7 = X.C17880vN.A0w(r5, r9)
            java.lang.String r6 = X.C17880vN.A0w(r5, r0)
            X.E8A r5 = X.AnonymousClass8BT.A08(r5, r1)
            if (r5 == 0) goto L_0x1d0d
            r0 = 17
            X.AOh r1 = new X.AOh
            r1.<init>(r5, r0)
        L_0x1d05:
            android.app.Activity r0 = A05(r3)
            r2.A04(r0, r1, r7, r6)
            return r4
        L_0x1d0d:
            r1 = r4
            goto L_0x1d05
        L_0x1d0f:
            java.util.List r7 = r12.A00
            java.lang.String r10 = X.C17880vN.A0w(r7, r9)
            int r13 = X.AnonymousClass001.A0n(r7, r0)
            java.lang.Object r5 = r7.get(r1)
            boolean r3 = r5 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x1d4c
            boolean r9 = X.AnonymousClass000.A1Y(r5)
        L_0x1d25:
            java.util.Map r3 = X.AnonymousClass8BR.A16(r7, r6)
            java.lang.Object r11 = r7.get(r8)
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.HashMap r12 = A0A(r3)
            r15 = -1
        L_0x1d34:
            if (r9 == r0) goto L_0x1d4a
            r14 = 2
            if (r9 == r1) goto L_0x1d3a
            r14 = 0
        L_0x1d3a:
            X.62C r1 = X.C123756Vs.A00(r10, r11, r12, r13, r14, r15)
            X.00H r0 = r2.A0k
            java.lang.Object r0 = r0.get()
            X.18K r0 = (X.AnonymousClass18K) r0
            r0.CC7(r1)
            return r4
        L_0x1d4a:
            r14 = 1
            goto L_0x1d3a
        L_0x1d4c:
            int r9 = X.AnonymousClass000.A0M(r5)
            goto L_0x1d25
        L_0x1d51:
            java.util.List r2 = r12.A00
            java.lang.String r11 = X.C17880vN.A0w(r2, r9)
            java.lang.String r0 = X.C17880vN.A0w(r2, r0)
            java.lang.String r10 = X.C17880vN.A0w(r2, r1)
            java.lang.String r9 = X.C17880vN.A0w(r2, r6)
            java.lang.String r7 = X.C17880vN.A0w(r2, r8)
            X.E8A r6 = X.AnonymousClass8BT.A08(r2, r5)
            r1 = 6
            X.E8A r5 = X.AnonymousClass8BT.A08(r2, r1)
            r1 = 7
            X.E8A r1 = X.AnonymousClass8BT.A08(r2, r1)
            if (r6 == 0) goto L_0x1dd9
            X.A45 r8 = new X.A45
            r8.<init>()
            r8.A00 = r3
            r8.A01 = r6
        L_0x1d80:
            if (r5 == 0) goto L_0x1dd7
            X.A45 r2 = new X.A45
            r2.<init>()
            r2.A00 = r3
            r2.A01 = r5
        L_0x1d8b:
            if (r1 == 0) goto L_0x1dd5
            X.A45 r6 = new X.A45
            r6.<init>()
            r6.A00 = r3
            r6.A01 = r1
        L_0x1d96:
            android.app.Activity r5 = A05(r3)
            X.1FB r5 = (X.AnonymousClass1FB) r5
            X.3Rj r3 = X.AnonymousClass4a6.A00(r5)
            r3.A0k(r11)
            r3.A0S(r0)
            r1 = 40
            X.AGu r0 = new X.AGu
            r0.<init>(r8, r1)
            r3.A0i(r5, r0, r10)
            if (r9 == 0) goto L_0x1dbc
            r1 = 41
            X.AGu r0 = new X.AGu
            r0.<init>(r2, r1)
            r3.A0h(r5, r0, r9)
        L_0x1dbc:
            if (r7 == 0) goto L_0x1dd1
            r0 = 39
            X.AGu r2 = new X.AGu
            r2.<init>(r6, r0)
            androidx.appcompat.app.AlertDialog$Builder r1 = r3.A00
            X.4av r0 = r3.A01
            r1.A0K(r0, r7)
            X.1DT r0 = r0.A01
            r0.A0A(r5, r2)
        L_0x1dd1:
            X.AnonymousClass3MY.A1G(r3)
            return r4
        L_0x1dd5:
            r6 = r4
            goto L_0x1d96
        L_0x1dd7:
            r2 = r4
            goto L_0x1d8b
        L_0x1dd9:
            r8 = r4
            goto L_0x1d80
        L_0x1ddb:
            java.util.List r3 = r12.A00
            X.DFL r1 = X.AnonymousClass8BR.A0G(r3, r9)
            java.lang.String r10 = A08(r1)
            java.util.Map r1 = X.AnonymousClass8BR.A16(r3, r0)
            int r6 = X.AnonymousClass001.A0n(r3, r6)
            java.util.HashMap r3 = A0A(r1)
            X.00H r1 = r2.A0f
            java.lang.Object r5 = r1.get()
            X.9cD r5 = (X.C185209cD) r5
            java.lang.String r1 = "params"
            java.lang.String r11 = X.C108945cZ.A1G(r1, r3)
            long r1 = X.C17890vO.A03(r6)
            java.lang.String r3 = "PRELOAD"
            X.ADL r7 = new X.ADL
            r7.<init>(r1, r3, r9)
            X.A2i r6 = r5.A00
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            X.AfO r8 = new X.AfO
            r8.<init>(r5, r10)
            r12 = r4
            r6.A03(r7, r8, r9, r10, r11, r12)
            return r4
        L_0x1e1a:
            java.util.List r3 = r12.A00
            X.DFL r1 = X.AnonymousClass8BR.A0G(r3, r9)
            java.lang.String r5 = A08(r1)
            java.util.Map r0 = X.AnonymousClass8BR.A16(r3, r0)
            java.util.HashMap r3 = A0A(r0)
            X.00H r0 = r2.A0D
            java.lang.Object r1 = r0.get()
            X.9xG r1 = (X.C197789xG) r1
            java.lang.String r0 = "params"
            java.lang.String r0 = X.C108945cZ.A1G(r0, r3)
            X.9By r3 = new X.9By
            r3.<init>(r1, r5, r0)
            X.00H r0 = r2.A0C
            java.lang.Object r1 = r0.get()
            X.A2o r1 = (X.C20000A2o) r1
            java.lang.String r0 = "PRELOAD"
            r1.A05(r3, r0)
            return r4
        L_0x1e4d:
            java.util.List r0 = r12.A00
            X.DFL r5 = X.AnonymousClass8BR.A0G(r0, r9)
            X.DFL r6 = X.AnonymousClass8BR.A0G(r0, r9)
            java.util.Map r0 = X.AnonymousClass8BR.A16(r0, r1)
            java.util.HashMap r2 = A0B(r0)
            java.lang.String r1 = A08(r5)
            java.lang.String r12 = A09(r5)
            X.ALJ r10 = new X.ALJ
            r10.<init>()
            r10.A02 = r1
            X.CvV r9 = X.C26235CvV.A00(r3, r6)
            X.9gS r0 = new X.9gS
            r0.<init>()
            r0.A01 = r1
            r0.A02 = r2
            X.AHy r8 = new X.AHy
            r8.<init>(r0)
            X.DFL r1 = A07(r5)
            if (r1 == 0) goto L_0x1eb2
            r0 = 40
            X.E8A r1 = r1.A0A(r0)
        L_0x1e8c:
            if (r1 == 0) goto L_0x1eb0
            r0 = 2
            X.ALW r2 = new X.ALW
            r2.<init>(r3, r1, r0)
        L_0x1e94:
            java.lang.String r1 = "default"
            java.lang.String r0 = r5.A0D(r7)
            if (r0 == 0) goto L_0x1e9d
            r1 = r0
        L_0x1e9d:
            java.lang.Integer r1 = X.C25301Cd5.A00(r1)
            X.DOZ r0 = r3.A00
            android.content.Context r7 = r0.A00
            r0 = 32
            X.8d4 r11 = new X.8d4
            r11.<init>(r2, r1, r0)
            X.A8X.A02(r7, r8, r9, r10, r11, r12)
            return r4
        L_0x1eb0:
            r2 = r4
            goto L_0x1e94
        L_0x1eb2:
            r1 = r4
            goto L_0x1e8c
        L_0x1eb4:
            java.util.List r12 = r12.A00
            java.lang.String r5 = X.C17880vN.A0w(r12, r9)
            java.util.Map r10 = X.AnonymousClass8BR.A16(r12, r0)
            X.DFL r8 = X.AnonymousClass8BR.A0G(r12, r1)
            java.lang.Object r0 = r12.get(r6)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x1f86
            java.util.Iterator r1 = r0.iterator()
            r9 = r4
            r12 = r4
        L_0x1ed0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1ee6
            java.lang.Object r0 = r1.next()
            X.DFL r0 = (X.DFL) r0
            java.lang.String r9 = r0.A0D(r11)
            java.lang.String r12 = r0.A0D(r7)
            if (r9 == 0) goto L_0x1ed0
        L_0x1ee6:
            X.E8A r6 = r8.A0A(r7)
            X.E8A r11 = r8.A0A(r11)
            java.util.HashMap r1 = A0A(r10)
            java.lang.String r0 = "params"
            java.lang.String r8 = X.C108945cZ.A1G(r0, r1)
            r0 = 14
            X.AOh r7 = new X.AOh
            r7.<init>(r6, r0)
            r10 = 15
            X.AOh r6 = new X.AOh
            r6.<init>(r11, r10)
            X.00H r0 = r2.A08
            java.lang.Object r13 = r0.get()
            X.2eP r13 = (X.C54602eP) r13
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            if (r5 == 0) goto L_0x1f90
            int r0 = r5.length()
            if (r0 == 0) goto L_0x1f90
            java.util.Set r0 = r13.A02
            if (r0 == 0) goto L_0x1f8d
            java.util.Iterator r2 = r0.iterator()
        L_0x1f22:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1f65
            java.lang.Object r1 = r2.next()
            X.9cZ r1 = (X.C185429cZ) r1
            java.lang.String r0 = "secure_v0"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x1f22
            X.00H r0 = r1.A01
            if (r0 == 0) goto L_0x1f8a
            java.lang.Object r11 = r0.get()
            X.6OZ r11 = (X.AnonymousClass6OZ) r11
            X.AfS r10 = new X.AfS
            r10.<init>(r1, r7, r6, r3)
            X.9W8 r0 = r11.A00
            X.10H r0 = r0.A00
            X.10E r0 = r0.A00
            X.11P r9 = X.AnonymousClass10E.A6O(r0)
            X.190 r1 = X.AnonymousClass3MY.A0N(r0)
            X.1OZ r0 = X.AnonymousClass8BU.A0K(r0)
            X.6Oj r2 = new X.6Oj
            r2.<init>(r1, r9, r0, r12)
            X.0yx r1 = X.AnonymousClass8BR.A0B(r5, r8)
            r0 = 45
            r11.A01(r10, r2, r1, r0)
        L_0x1f65:
            X.00H r0 = r13.A00
            if (r0 == 0) goto L_0x1fac
            java.lang.Object r1 = r0.get()
            X.9cC r1 = (X.C185199cC) r1
            X.A2i r0 = r1.A00
            r16 = 1
            X.7OT r11 = new X.7OT
            r12 = r3
            r13 = r6
            r14 = r1
            r15 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            r12 = r4
            r15 = r4
            r9 = r0
            r10 = r4
            r13 = r5
            r14 = r8
            r9.A04(r10, r11, r12, r13, r14, r15, r16)
            return r4
        L_0x1f86:
            r12 = r4
            r9 = r4
            goto L_0x1ee6
        L_0x1f8a:
            java.lang.String r0 = "bloksPayloadIqHelperLazy"
            goto L_0x1fae
        L_0x1f8d:
            java.lang.String r0 = "asyncActionWithDataManifestV2ActionHandlerSet"
            goto L_0x1fae
        L_0x1f90:
            java.lang.String r1 = "null app id"
            r0 = 0
            X.C17960vV.A0F(r0, r1)
            X.00H r0 = r13.A01
            if (r0 == 0) goto L_0x1fa9
            X.11A r2 = X.C17880vN.A0d(r0)
            java.lang.Object r1 = r6.A01
            X.AkI r0 = new X.AkI
            r0.<init>(r3, r1, r10)
            r2.CGP(r0)
            return r4
        L_0x1fa9:
            java.lang.String r0 = "mainThreadHandler"
            goto L_0x1fae
        L_0x1fac:
            java.lang.String r0 = "asyncActionHelperLazy"
        L_0x1fae:
            X.C18070vi.A11(r0)
            throw r4
        L_0x1fb2:
            X.ALW r0 = new X.ALW
            r0.<init>(r3, r2, r9)
            X.A8X.A05(r1, r0)
            return r4
        L_0x1fbb:
            X.00H r0 = r2.A05     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            X.0vd r1 = X.C17880vN.A0P(r0)     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            boolean r0 = X.C18020vd.A05(r0, r1, r5)     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            java.lang.String r4 = java.lang.Boolean.toString(r0)     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            return r4
        L_0x1fcc:
            X.00H r0 = r2.A05     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            X.0vd r1 = X.C17880vN.A0P(r0)     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            int r0 = X.C18020vd.A00(r0, r1, r5)     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            java.lang.String r4 = java.lang.Integer.toString(r0)     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            return r4
        L_0x1fdd:
            X.00H r0 = r2.A05     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            X.0vd r0 = X.C17880vN.A0P(r0)     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            java.lang.String r4 = r0.A0I(r5)     // Catch:{ IllegalArgumentException -> 0x1fe8 }
            return r4
        L_0x1fe8:
            r1 = move-exception
            java.lang.String r0 = "Bloks: WaBkGlobalInterpreterExtImpl/getAbPropValue/exception"
            goto L_0x2106
        L_0x1fed:
            return r4
        L_0x1fee:
            return r4
        L_0x1fef:
            return r4
        L_0x1ff0:
            return r4
        L_0x1ff1:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x2007 }
            goto L_0x200b
        L_0x1ff6:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r1.A00(r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            return r4
        L_0x1ffc:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r1.A00(r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            return r4
        L_0x2002:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x2007 }
            goto L_0x200b
        L_0x2007:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
        L_0x200b:
            throw r2     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
        L_0x200c:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            r1.A00(r0)     // Catch:{ FileNotFoundException -> 0x2015, IOException -> 0x2012, SecurityException -> 0x2018 }
            return r4
        L_0x2012:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x201a
        L_0x2015:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x201a
        L_0x2018:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x201a:
            r1.A00(r0)
            return r4
        L_0x201e:
            java.lang.String r0 = "Cannot unwind without an existing bottom sheet."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x2025:
            X.A47 r1 = r2.A04
            X.00H r0 = r1.A00
            int r3 = A03(r0, r9, r5)
            int r5 = A01(r0, r5)
            X.00H r0 = r1.A01
            java.lang.Object r2 = r0.get()
            X.37m r2 = (X.C695137m) r2
            X.19A r1 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.2A6 r3 = new X.2A6
            r3.<init>(r1, r2, r0, r5)
            r3.A02 = r7
            r0 = -1
            r3.A00 = r0
            java.util.Iterator r5 = X.C17890vO.A0i(r6)
        L_0x204e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x20f1
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r5)
            java.lang.String r2 = X.C17880vN.A0x(r0)
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x206a
            java.lang.String r1 = (java.lang.String) r1
        L_0x2066:
            r3.addPointData((java.lang.String) r2, (java.lang.String) r1)
            goto L_0x204e
        L_0x206a:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x2076
            int r0 = X.AnonymousClass000.A0M(r1)
            r3.addPointData((java.lang.String) r2, (int) r0)
            goto L_0x204e
        L_0x2076:
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x2082
            long r0 = X.C17880vN.A05(r1)
            r3.addPointData((java.lang.String) r2, (long) r0)
            goto L_0x204e
        L_0x2082:
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x208e
            double r0 = X.AnonymousClass8BR.A00(r1)
            r3.addPointData((java.lang.String) r2, (double) r0)
            goto L_0x204e
        L_0x208e:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x209a
            float r0 = X.AnonymousClass000.A04(r1)
            r3.addPointData((java.lang.String) r2, (float) r0)
            goto L_0x204e
        L_0x209a:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x20a6
            boolean r0 = X.AnonymousClass000.A1Y(r1)
            r3.addPointData((java.lang.String) r2, (boolean) r0)
            goto L_0x204e
        L_0x20a6:
            boolean r0 = r1 instanceof int[]
            if (r0 == 0) goto L_0x20b0
            int[] r1 = (int[]) r1
            r3.addPointData((java.lang.String) r2, (int[]) r1)
            goto L_0x204e
        L_0x20b0:
            boolean r0 = r1 instanceof long[]
            if (r0 == 0) goto L_0x20ba
            long[] r1 = (long[]) r1
            r3.addPointData((java.lang.String) r2, (long[]) r1)
            goto L_0x204e
        L_0x20ba:
            boolean r0 = r1 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x20c8
            boolean r0 = r1 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x20c8
            java.lang.String[] r1 = (java.lang.String[]) r1
            r3.addPointData((java.lang.String) r2, (java.lang.String[]) r1)
            goto L_0x204e
        L_0x20c8:
            boolean r0 = r1 instanceof double[]
            if (r0 == 0) goto L_0x20d3
            double[] r1 = (double[]) r1
            r3.addPointData((java.lang.String) r2, (double[]) r1)
            goto L_0x204e
        L_0x20d3:
            boolean r0 = r1 instanceof float[]
            if (r0 == 0) goto L_0x20de
            float[] r1 = (float[]) r1
            r3.addPointData((java.lang.String) r2, (float[]) r1)
            goto L_0x204e
        L_0x20de:
            boolean r0 = r1 instanceof boolean[]
            if (r0 == 0) goto L_0x20e9
            boolean[] r1 = (boolean[]) r1
            r3.addPointData((java.lang.String) r2, (boolean[]) r1)
            goto L_0x204e
        L_0x20e9:
            if (r1 == 0) goto L_0x204e
            java.lang.String r1 = r1.toString()
            goto L_0x2066
        L_0x20f1:
            r3.pointEditingCompleted()
            return r4
        L_0x20f5:
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r3, r3)     // Catch:{ NullPointerException | SecurityException -> 0x20fd }
            r1.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x20fd }
            return r4
        L_0x20fd:
            java.lang.String r0 = "bkinterpreter/clipboard/"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        L_0x2103:
            r1 = move-exception
            java.lang.String r0 = "Error during annotations map parse"
        L_0x2106:
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x210a:
            X.00H r0 = r2.A0d
            java.lang.Object r0 = r0.get()
            X.A2V r0 = (X.A2V) r0
            X.A2X r2 = r0.A01(r6)
            java.lang.String r1 = r5.A00()
            X.7NS r0 = new X.7NS
            r0.<init>(r1)
            r2.A02(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALS.BKe(X.9zJ, X.CkC, java.lang.String):java.lang.Object");
    }
}
