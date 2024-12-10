package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.74O  reason: invalid class name */
public abstract class AnonymousClass74O {
    public static final Map A00;

    static {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        HashMap hashMap = new HashMap(4);
        int[] iArr = new int[6];
        iArr[0] = 2131894404;
        boolean A09 = AnonymousClass112.A09();
        if (A09) {
            i = 2131894406;
        } else {
            i = 2131894405;
            if (Build.VERSION.SDK_INT < 30) {
                i = 2131894403;
            }
        }
        iArr[1] = i;
        iArr[2] = 2131894439;
        if (A09) {
            i2 = 2131894441;
        } else {
            i2 = 2131894440;
            if (Build.VERSION.SDK_INT < 30) {
                i2 = 2131894438;
            }
        }
        iArr[3] = i2;
        iArr[4] = 2131894292;
        iArr[5] = 2131894271;
        C108955ca.A1V(iArr, hashMap, 30);
        C108955ca.A1V(iArr, hashMap, 29);
        int[] iArr2 = new int[6];
        iArr2[0] = 2131894396;
        boolean A092 = AnonymousClass112.A09();
        if (A092) {
            i3 = 2131894398;
        } else {
            i3 = 2131894397;
            if (Build.VERSION.SDK_INT < 30) {
                i3 = 2131894395;
            }
        }
        iArr2[1] = i3;
        iArr2[2] = 2131894427;
        if (A092) {
            i4 = 2131894429;
        } else {
            i4 = 2131894428;
            if (Build.VERSION.SDK_INT < 30) {
                i4 = 2131894426;
            }
        }
        iArr2[3] = i4;
        iArr2[4] = 2131894273;
        iArr2[5] = 2131894272;
        hashMap.put(31, iArr2);
        Integer A0j = C108955ca.A0j();
        int[] iArr3 = new int[6];
        iArr3[0] = 2131894400;
        boolean A093 = AnonymousClass112.A09();
        if (A093) {
            i5 = 2131894402;
        } else {
            i5 = 2131894401;
            if (Build.VERSION.SDK_INT < 30) {
                i5 = 2131894399;
            }
        }
        iArr3[1] = i5;
        iArr3[2] = 2131894431;
        if (A093) {
            i6 = 2131894433;
        } else {
            i6 = 2131894432;
            if (Build.VERSION.SDK_INT < 30) {
                i6 = 2131894430;
            }
        }
        iArr3[3] = i6;
        iArr3[4] = 2131894275;
        iArr3[5] = 2131894274;
        hashMap.put(A0j, iArr3);
        int[] iArr4 = new int[6];
        iArr4[0] = 2131894408;
        boolean A094 = AnonymousClass112.A09();
        if (A094) {
            i7 = 2131894433;
        } else {
            i7 = 2131894409;
            if (Build.VERSION.SDK_INT < 30) {
                i7 = 2131894407;
            }
        }
        iArr4[1] = i7;
        iArr4[2] = 2131894451;
        if (A094) {
            i8 = 2131894453;
        } else {
            i8 = 2131894452;
            if (Build.VERSION.SDK_INT < 30) {
                i8 = 2131894450;
            }
        }
        iArr4[3] = i8;
        iArr4[4] = 2131894300;
        iArr4[5] = 2131894299;
        hashMap.put(33, iArr4);
        A00 = Collections.unmodifiableMap(hashMap);
    }

    public static final Intent A02(Context context, int i, int i2, boolean z) {
        C134126q5 r3 = new C134126q5(context);
        r3.A01 = 2131231834;
        r3.A01(new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"});
        r3.A02 = i;
        r3.A0A = null;
        r3.A03 = i2;
        r3.A08 = null;
        r3.A06 = z;
        return r3.A00();
    }

    public static final Intent A03(Context context, int i, int i2, boolean z) {
        C18070vi.A0d(context, 0);
        C134126q5 r1 = new C134126q5(context);
        r1.A01 = 2131231920;
        r1.A01(AnonymousClass73I.A04());
        r1.A02 = i;
        r1.A03 = i2;
        r1.A06 = z;
        return r1.A00();
    }

    public static final Intent A04(Context context, C219217x r8, int i) {
        int A17 = C18070vi.A17(context, r8);
        int[] iArr = (int[]) AnonymousClass000.A0w(A00, i);
        boolean A1Z = AnonymousClass000.A1Z(r8.A05(), AnonymousClass00R.A01);
        boolean A1O = AnonymousClass000.A1O(r8.A02("android.permission.CAMERA"));
        if (iArr == null) {
            C17900vP.A0i("conversation/check/camera/storage/permissions/unexpected request code ", AnonymousClass000.A10(), i);
        } else if (A1O) {
            C134126q5 r3 = new C134126q5(context);
            if (A1Z) {
                int[] iArr2 = new int[3];
                iArr2[0] = 2131231920;
                iArr2[A17] = 2131231658;
                iArr2[2] = 2131232198;
                r3.A09 = iArr2;
                r3.A01(AnonymousClass73I.A00());
                r3.A02 = iArr[0];
                r3.A03 = iArr[A17];
            } else {
                r3.A01 = 2131232198;
                r3.A02 = iArr[4];
                r3.A03 = iArr[5];
                String[] strArr = new String[A17];
                strArr[0] = "android.permission.CAMERA";
                r3.A01(strArr);
            }
            r3.A06 = false;
            return r3.A00();
        } else if (A1Z) {
            return A00(context, C123636Vf.A00());
        }
        return null;
    }

    public static final void A07(Activity activity, int i) {
        C18070vi.A0d(activity, 0);
        if (!activity.isFinishing()) {
            activity.startActivityForResult(A00(activity, C123636Vf.A00()), i);
        }
    }

    public static final void A08(Activity activity, int i, int i2) {
        C18070vi.A0d(activity, 0);
        if (!activity.isFinishing()) {
            activity.startActivityForResult(A03(activity, i, i2, false), 151);
        }
    }

    public static final void A09(Activity activity, int i, int i2, int i3) {
        C18070vi.A0d(activity, 0);
        if (!activity.isFinishing()) {
            activity.startActivityForResult(A03(activity, i, i2, false), i3);
        }
    }

    public static final void A0D(Activity activity, C219217x r8) {
        C134126q5 r2;
        Intent A002;
        C18070vi.A0d(r8, 1);
        if (!activity.isFinishing()) {
            boolean z = true;
            if (r8.A02("android.permission.SEND_SMS") == 0) {
                z = false;
            }
            boolean z2 = !r8.A0I();
            if (!z) {
                r2 = new C134126q5(activity);
                r2.A01 = 2131231757;
                r2.A01(C17890vO.A1b(C219217x.A00(), 0));
                r2.A02 = 2131894503;
                r2.A03 = 2131894502;
                r2.A06 = false;
                A002 = r2.A00();
            } else if (z2) {
                ArrayList A0s = C108965cb.A0s("android.permission.SEND_SMS");
                A0s.addAll(C219217x.A00());
                C134126q5 r5 = new C134126q5(activity);
                r5.A09 = new int[]{2131232814, 2131231658, 2131231757};
                r5.A01(C17890vO.A1b(A0s, 0));
                r5.A02 = 2131894392;
                r5.A03 = 2131894391;
                r5.A06 = false;
                A002 = r5.A00();
            } else {
                r2 = new C134126q5(activity);
                r2.A01 = 2131232814;
                r2.A01(new String[]{"android.permission.SEND_SMS"});
                r2.A02 = 2131894390;
                r2.A03 = 2131894389;
                r2.A06 = false;
                A002 = r2.A00();
            }
            activity.startActivityForResult(A002, 153);
        }
    }

    public static final void A0E(Activity activity, C219217x r7, int i, boolean z) {
        int i2;
        C18070vi.A0d(r7, 1);
        if (!activity.isFinishing() && (!r7.A0C())) {
            ArrayList A0m = C29431cG.A0m(C219217x.A00());
            C134126q5 r3 = new C134126q5(activity);
            if (Build.VERSION.SDK_INT >= 28) {
                A0m.add("android.permission.READ_CALL_LOG");
                A0m.add("android.permission.ANSWER_PHONE_CALLS");
                r3.A01(C17890vO.A1b(A0m, 0));
                r3.A02 = 2131894337;
                i2 = 2131894336;
            } else {
                A0m.add("android.permission.CALL_PHONE");
                r3.A01(C17890vO.A1b(A0m, 0));
                r3.A02 = 2131894339;
                i2 = 2131894338;
            }
            r3.A03 = i2;
            r3.A04 = 2131894335;
            r3.A06 = true;
            r3.A06 = true;
            r3.A07 = z;
            activity.startActivityForResult(r3.A00(), i);
        }
    }

    public static final void A0F(Fragment fragment, int i, int i2) {
        if (fragment.A1n() != null) {
            fragment.startActivityForResult(A02(fragment.A14(), i, i2, false), 150);
        }
    }

    public static final void A0H(C19830z4 r8, String[] strArr) {
        for (String str : strArr) {
            C17880vN.A1F(C19830z4.A00(r8), str, true);
            String[] strArr2 = C27091Ur.A09;
            int i = 0;
            while (true) {
                if (!AnonymousClass026.A00(str, strArr2[i])) {
                    i++;
                    if (i >= 2) {
                        break;
                    }
                } else {
                    r8.A24(true);
                    C17880vN.A1F(C19830z4.A00(r8), "nearby_location_new_user", true);
                    break;
                }
            }
        }
    }

    public static final boolean A0J(Activity activity, C219217x r4, int i) {
        boolean A17 = C18070vi.A17(activity, r4);
        Intent A04 = A04(activity, r4, i);
        if (A04 == null) {
            return A17;
        }
        activity.startActivityForResult(A04, i);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
        if (r4 == null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0M(android.app.Activity r5, X.AnonymousClass00H r6, java.lang.String r7, int[] r8, int r9, int r10, int r11, int r12, boolean r13, boolean r14) {
        /*
            r2 = 0
            r0 = 9
            X.C18070vi.A0d(r6, r0)
            r3 = 1
            if (r13 == 0) goto L_0x003c
            if (r14 == 0) goto L_0x0037
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            r1.add(r0)
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            r1.add(r0)
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            r1.add(r0)
            java.lang.String[] r0 = X.AnonymousClass73I.A04()
            X.C29401cD.A0L(r1, r0)
            java.lang.String[] r4 = X.C17890vO.A1b(r1, r2)
        L_0x0029:
            if (r4 != 0) goto L_0x004e
        L_0x002b:
            java.lang.Object r1 = r6.get()
            X.A8V r1 = (X.A8V) r1
            java.lang.String r0 = "permissions_already_granted"
            r1.A0F(r7, r0)
            return r3
        L_0x0037:
            java.lang.String[] r4 = X.AnonymousClass73I.A04()
            goto L_0x0029
        L_0x003c:
            if (r14 == 0) goto L_0x002b
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            r4[r2] = r0
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            r4[r3] = r0
            r1 = 2
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            r4[r1] = r0
        L_0x004e:
            int r0 = r8.length
            X.6q5 r1 = new X.6q5
            r1.<init>(r5)
            if (r0 != r3) goto L_0x0071
            r0 = r8[r2]
            r1.A01 = r0
        L_0x005a:
            r1.A0C = r4
            r1.A02 = r11
            r1.A04 = r10
            r1.A00 = r12
            r1.A06 = r3
            android.content.Intent r1 = r1.A00()
            java.lang.String r0 = "permission_requester_screen"
            r1.putExtra(r0, r7)
            r5.startActivityForResult(r1, r9)
            return r2
        L_0x0071:
            r1.A09 = r8
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74O.A0M(android.app.Activity, X.00H, java.lang.String, int[], int, int, int, int, boolean, boolean):boolean");
    }

    public static final boolean A0N(Activity activity, String[] strArr) {
        C18070vi.A0d(strArr, 1);
        for (String A0C : strArr) {
            if (!C110885hR.A0C(activity, A0C)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0O(Context context, C219217x r4) {
        boolean A17 = C18070vi.A17(context, r4);
        if (!(!r4.A0D())) {
            return A17;
        }
        context.startActivity(A00(context, C123636Vf.A00()));
        return false;
    }

    public static final boolean A0P(Context context, C219217x r5) {
        int i;
        boolean A17 = C18070vi.A17(context, r5);
        if (AnonymousClass112.A07() || r5.A0G()) {
            return A17;
        }
        if (!AnonymousClass112.A07()) {
            i = 2131894422;
        } else {
            i = 2131894384;
            if (!AnonymousClass112.A09()) {
                i = 2131894424;
            }
        }
        context.startActivity(A01(context, 2131894383, i));
        return false;
    }

    public static final boolean A0R(Fragment fragment, C219217x r4, int i) {
        C18070vi.A0d(r4, 1);
        Intent A04 = A04(fragment.A14(), r4, i);
        if (A04 == null) {
            return true;
        }
        fragment.startActivityForResult(A04, i);
        return false;
    }

    public static final boolean A0S(C19830z4 r5, String[] strArr) {
        boolean A17 = C18070vi.A17(r5, strArr);
        for (String A2a : strArr) {
            if (r5.A2a(A2a)) {
                return false;
            }
        }
        return A17;
    }

    public static final C134126q5 A05(Activity activity, String str) {
        C134126q5 r3 = new C134126q5(activity);
        r3.A01 = 2131232445;
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "android.permission.NEARBY_WIFI_DEVICES";
        r3.A0C = A1Y;
        r3.A04 = 2131888232;
        r3.A05 = str;
        return r3;
    }

    public static final void A06(Activity activity) {
        if (!activity.isFinishing()) {
            C134126q5 r2 = new C134126q5(activity);
            r2.A01 = 2131231757;
            r2.A01(C17890vO.A1b(C219217x.A00(), 0));
            r2.A02 = 2131894386;
            r2.A03 = 2131894385;
            r2.A06 = true;
            activity.startActivityForResult(r2.A00(), 155);
        }
    }

    public static final void A0B(Activity activity, AnonymousClass1KB r12, C219217x r13, AnonymousClass1DC r14, boolean z) {
        boolean z2;
        int i;
        C134126q5 r5;
        String[] strArr;
        int A0G = C72453Mb.A0G(r12, r14, 1);
        C18070vi.A0d(r13, 3);
        boolean z3 = !r13.A0E();
        if (!z || !r14.BcY() || (Build.VERSION.SDK_INT >= 23 ? r13.A02("android.permission.CAMERA") == 0 : r13.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("request/permission/checkCameraAndMicPermissionsForVoipCall needMicPerm = ");
        A10.append(z3);
        C17900vP.A0n(", needCameraPerm = ", A10, z2);
        if (Build.VERSION.SDK_INT >= 23) {
            if (z2) {
                if (z3) {
                    ArrayList A06 = AnonymousClass1ZU.A06(C17880vN.A1b("android.permission.CAMERA", "android.permission.RECORD_AUDIO", A0G, 1));
                    r5 = new C134126q5(activity);
                    int[] iArr = new int[3];
                    iArr[0] = 2131232106;
                    iArr[1] = 2131231658;
                    iArr[A0G] = 2131232198;
                    r5.A09 = iArr;
                    r5.A01(C17890vO.A1b(A06, 0));
                    r5.A02 = 2131894370;
                    r5.A03 = 2131894369;
                } else {
                    r5 = new C134126q5(activity);
                    r5.A01 = 2131232198;
                    r5.A02 = 2131894289;
                    r5.A03 = 2131894288;
                    strArr = new String[]{"android.permission.CAMERA"};
                    r5.A01(strArr);
                }
            } else if (z3) {
                ArrayList A062 = AnonymousClass1ZU.A06("android.permission.RECORD_AUDIO");
                r5 = new C134126q5(activity);
                r5.A01 = 2131232106;
                r5.A02 = 2131894362;
                r5.A03 = 2131894353;
                strArr = C17890vO.A1b(A062, 0);
                r5.A01(strArr);
            } else {
                return;
            }
            r5.A06 = true;
            activity.startActivityForResult(r5.A00(), 152);
            return;
        }
        if (z2) {
            i = 2131887898;
            if (z3) {
                i = 2131887899;
            }
        } else if (z3) {
            i = 2131887902;
        } else {
            return;
        }
        r12.A06(i, 1);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0C(android.app.Activity r9, X.AnonymousClass1KB r10, boolean r11, boolean r12, boolean r13) {
        /*
            r3 = 813(0x32d, float:1.139E-42)
            r7 = 0
            boolean r2 = X.C18070vi.A17(r9, r10)
            if (r11 != 0) goto L_0x000e
            if (r12 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "request/permission/requestPermissionsForRecordingPushToVideo needMicPerm = "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", needCameraPermission = "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", needStoragePermission = "
            X.C17900vP.A0n(r0, r1, r13)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x0055
            if (r11 == 0) goto L_0x0046
            if (r12 == 0) goto L_0x003d
            r0 = 2131887891(0x7f120713, float:1.9410402E38)
            if (r13 == 0) goto L_0x0039
            r0 = 2131887892(0x7f120714, float:1.9410404E38)
        L_0x0039:
            r10.A06(r0, r2)
            return
        L_0x003d:
            r0 = 2131887893(0x7f120715, float:1.9410406E38)
            if (r13 == 0) goto L_0x0039
            r0 = 2131887894(0x7f120716, float:1.9410408E38)
            goto L_0x0039
        L_0x0046:
            if (r12 == 0) goto L_0x0051
            r0 = 2131887895(0x7f120717, float:1.941041E38)
            if (r13 == 0) goto L_0x0039
            r0 = 2131887896(0x7f120718, float:1.9410412E38)
            goto L_0x0039
        L_0x0051:
            r0 = 2131887897(0x7f120719, float:1.9410414E38)
            goto L_0x0039
        L_0x0055:
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            if (r11 == 0) goto L_0x0060
            java.lang.String r0 = "android.permission.CAMERA"
            r1.add(r0)
        L_0x0060:
            if (r12 == 0) goto L_0x0067
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            r1.add(r0)
        L_0x0067:
            if (r13 == 0) goto L_0x0070
            java.lang.String[] r0 = X.AnonymousClass73I.A04()
            X.C29401cD.A0L(r1, r0)
        L_0x0070:
            java.lang.String[] r4 = X.C17890vO.A1b(r1, r7)
            r6 = 33
            r5 = 30
            r8 = 2
            if (r11 == 0) goto L_0x00f1
            if (r12 == 0) goto L_0x00cf
            if (r13 == 0) goto L_0x00bc
            r0 = 3
            int[] r1 = new int[r0]
            r0 = 2131232198(0x7f0805c6, float:1.8080498E38)
            r1[r7] = r0
            r0 = 2131232106(0x7f08056a, float:1.8080312E38)
            r1[r2] = r0
            r0 = 2131231658(0x7f0803aa, float:1.8079403E38)
            r1[r8] = r0
            r7 = 2131894296(0x7f122018, float:1.9423393E38)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r5) goto L_0x00b3
            r5 = 2131894295(0x7f122017, float:1.942339E38)
        L_0x009b:
            X.6q5 r0 = new X.6q5
            r0.<init>(r9)
            r0.A09 = r1
            r0.A02 = r7
            r0.A03 = r5
            r0.A01(r4)
            r0.A06 = r2
            android.content.Intent r0 = r0.A00()
            r9.startActivityForResult(r0, r3)
            return
        L_0x00b3:
            r5 = 2131894298(0x7f12201a, float:1.9423397E38)
            if (r0 >= r6) goto L_0x009b
            r5 = 2131894297(0x7f122019, float:1.9423395E38)
            goto L_0x009b
        L_0x00bc:
            int[] r1 = new int[r8]
            r0 = 2131232198(0x7f0805c6, float:1.8080498E38)
            r1[r7] = r0
            r0 = 2131232106(0x7f08056a, float:1.8080312E38)
            r1[r2] = r0
            r7 = 2131894294(0x7f122016, float:1.9423389E38)
            r5 = 2131894293(0x7f122015, float:1.9423387E38)
            goto L_0x009b
        L_0x00cf:
            if (r13 == 0) goto L_0x0115
            int[] r1 = new int[r8]
            r0 = 2131232198(0x7f0805c6, float:1.8080498E38)
            r1[r7] = r0
            r0 = 2131231658(0x7f0803aa, float:1.8079403E38)
            r1[r2] = r0
            r7 = 2131894304(0x7f122020, float:1.942341E38)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r5) goto L_0x00e8
            r5 = 2131894303(0x7f12201f, float:1.9423407E38)
            goto L_0x009b
        L_0x00e8:
            r5 = 2131894306(0x7f122022, float:1.9423413E38)
            if (r0 >= r6) goto L_0x009b
            r5 = 2131894305(0x7f122021, float:1.9423411E38)
            goto L_0x009b
        L_0x00f1:
            if (r12 == 0) goto L_0x0115
            if (r13 == 0) goto L_0x0115
            int[] r1 = new int[r8]
            r0 = 2131232106(0x7f08056a, float:1.8080312E38)
            r1[r7] = r0
            r0 = 2131231658(0x7f0803aa, float:1.8079403E38)
            r1[r2] = r0
            r7 = 2131894376(0x7f122068, float:1.9423555E38)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r5) goto L_0x010c
            r5 = 2131894375(0x7f122067, float:1.9423553E38)
            goto L_0x009b
        L_0x010c:
            r5 = 2131894378(0x7f12206a, float:1.942356E38)
            if (r0 >= r6) goto L_0x009b
            r5 = 2131894377(0x7f122069, float:1.9423557E38)
            goto L_0x009b
        L_0x0115:
            int[] r1 = new int[r2]
            if (r11 == 0) goto L_0x0126
            r0 = 2131232198(0x7f0805c6, float:1.8080498E38)
            r1[r7] = r0
            r7 = 2131894302(0x7f12201e, float:1.9423405E38)
            r5 = 2131894301(0x7f12201d, float:1.9423403E38)
            goto L_0x009b
        L_0x0126:
            if (r12 == 0) goto L_0x0135
            r0 = 2131232106(0x7f08056a, float:1.8080312E38)
            r1[r7] = r0
            r7 = 2131894374(0x7f122066, float:1.942355E38)
            r5 = 2131894373(0x7f122065, float:1.9423549E38)
            goto L_0x009b
        L_0x0135:
            r0 = 2131231658(0x7f0803aa, float:1.8079403E38)
            r1[r7] = r0
            r7 = 2131894498(0x7f1220e2, float:1.9423802E38)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r5) goto L_0x0146
            r5 = 2131894497(0x7f1220e1, float:1.94238E38)
            goto L_0x009b
        L_0x0146:
            r5 = 2131894500(0x7f1220e4, float:1.9423807E38)
            if (r0 >= r6) goto L_0x009b
            r5 = 2131894499(0x7f1220e3, float:1.9423804E38)
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74O.A0C(android.app.Activity, X.1KB, boolean, boolean, boolean):void");
    }

    public static final boolean A0I(Activity activity, C219217x r7) {
        if (r7.A0G()) {
            return true;
        }
        int i = 2131894412;
        if (Build.VERSION.SDK_INT < 30) {
            i = 2131894410;
        }
        activity.startActivityForResult(A03(activity, 2131894411, i, false), 151);
        return false;
    }

    public static final boolean A0Q(Fragment fragment, C219217x r8) {
        if (r8.A0G()) {
            return true;
        }
        Context A14 = fragment.A14();
        int i = 2131894412;
        if (Build.VERSION.SDK_INT < 30) {
            i = 2131894410;
        }
        fragment.startActivityForResult(A03(A14, 2131894411, i, false), 151);
        return false;
    }

    public static final Intent A00(Context context, int i) {
        String[] A02 = AnonymousClass73I.A02();
        C134126q5 r1 = new C134126q5(context);
        r1.A01 = 2131231920;
        r1.A01(A02);
        r1.A02 = 2131894471;
        r1.A03 = i;
        r1.A06 = false;
        return r1.A00();
    }

    public static final Intent A01(Context context, int i, int i2) {
        String[] A03 = AnonymousClass73I.A03();
        C134126q5 r1 = new C134126q5(context);
        r1.A01 = 2131231920;
        r1.A01(A03);
        r1.A02 = i;
        r1.A03 = i2;
        r1.A06 = false;
        return r1.A00();
    }

    public static final void A0A(Activity activity, int i, int i2, int i3, boolean z) {
        if (!activity.isFinishing()) {
            activity.startActivityForResult(A02(activity, i, i2, z), i3);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.76m, java.lang.Object] */
    public static final void A0G(Fragment fragment, C19830z4 r3, String[] strArr) {
        C18070vi.A0j(r3, strArr);
        A0H(r3, strArr);
        if (fragment.A0G != null) {
            AnonymousClass1GP A1F = fragment.A1F();
            if (A1F.A02 != null) {
                String str = fragment.A0V;
                ? obj = new Object();
                obj.A01 = str;
                obj.A00 = 100;
                A1F.A0C.addLast(obj);
                A1F.A02.A02((C1406772n) null, strArr);
                return;
            }
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Fragment ");
        A10.append(fragment);
        throw AnonymousClass000.A0o(" not attached to Activity", A10);
    }

    public static final boolean A0K(Activity activity, C219217x r4, int i, int i2, int i3) {
        C18070vi.A0h(activity, r4);
        String[] strArr = C27091Ur.A09;
        C18070vi.A0Z(strArr);
        if (r4.A06()) {
            return true;
        }
        C134126q5 r1 = new C134126q5(activity);
        r1.A01 = 2131232061;
        r1.A0C = strArr;
        r1.A03 = i2;
        r1.A02 = i;
        activity.startActivityForResult(r1.A00(), i3);
        return false;
    }

    public static final boolean A0L(Activity activity, C219217x r5, C19830z4 r6, int i) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0j(r5, r6);
        String[] strArr = C27091Ur.A09;
        C18070vi.A0Z(strArr);
        if (A0S(r6, strArr) || A0N(activity, strArr)) {
            return A0K(activity, r5, 2131894346, 0, i);
        }
        return true;
    }
}
