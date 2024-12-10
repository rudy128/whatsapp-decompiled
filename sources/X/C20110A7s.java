package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.A7s  reason: case insensitive filesystem */
public class C20110A7s {
    public final C191089m0 A00;
    public final BD4 A01;
    public final AnonymousClass1QE A02 = AnonymousClass1QE.A00("PaymentsCommonErrorHelper", "payment", "COMMON");

    public static Integer A02(int i) {
        int i2;
        if (!(i == 6 || i == 7)) {
            switch (i) {
                case -2:
                    break;
                case 400:
                case 500:
                case 503:
                case 4002:
                    i2 = 2131893867;
                    break;
                case 403:
                case 2826001:
                    i2 = 2131894030;
                    break;
                case 443:
                    i2 = 2131894180;
                    break;
                case 10702:
                    i2 = 2131893805;
                    break;
                case 2826004:
                    i2 = 2131894011;
                    break;
                case 2826007:
                    i2 = 2131894010;
                    break;
                case 2826009:
                    i2 = 2131894013;
                    break;
                case 2826012:
                    i2 = 2131894012;
                    break;
                default:
                    return null;
            }
        }
        i2 = 2131892931;
        return Integer.valueOf(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        if (r4 != null) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C010105w A05(android.content.Context r7, android.content.DialogInterface.OnDismissListener r8, android.content.DialogInterface.OnDismissListener r9, int r10) {
        /*
            r6 = this;
            r5 = 0
            r4 = 0
            r0 = 440(0x1b8, float:6.17E-43)
            r2 = 0
            if (r10 == r0) goto L_0x0049
            r0 = 446(0x1be, float:6.25E-43)
            if (r10 == r0) goto L_0x003e
            r0 = 2826026(0x2b1f2a, float:3.960106E-39)
            if (r10 == r0) goto L_0x0033
            r0 = 2826046(0x2b1f3e, float:3.960134E-39)
            if (r10 != r0) goto L_0x0028
            r0 = 2131889183(0x7f120c1f, float:1.9413022E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131889182(0x7f120c1e, float:1.941302E38)
        L_0x001f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0028
            r2 = 1
            r4 = r1
            r5 = r0
        L_0x0028:
            r3 = 0
            if (r2 != 0) goto L_0x0030
            java.lang.Integer r5 = A02(r10)
            r4 = r3
        L_0x0030:
            if (r5 != 0) goto L_0x0054
            return r3
        L_0x0033:
            r0 = 2131897117(0x7f122b1d, float:1.9429114E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131897116(0x7f122b1c, float:1.9429112E38)
            goto L_0x001f
        L_0x003e:
            r0 = 2131893929(0x7f121ea9, float:1.9422648E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131893928(0x7f121ea8, float:1.9422646E38)
            goto L_0x001f
        L_0x0049:
            r0 = 2131896067(0x7f122703, float:1.9426985E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131896958(0x7f122a7e, float:1.9428792E38)
            goto L_0x001f
        L_0x0054:
            int r0 = r5.intValue()
            java.lang.String r2 = r6.A03(r7, r10, r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r10 == r0) goto L_0x0091
            r0 = 403(0x193, float:5.65E-43)
            if (r10 == r0) goto L_0x0091
            r0 = 2826001(0x2b1f11, float:3.960071E-39)
            if (r10 == r0) goto L_0x0091
        L_0x0069:
            if (r4 != 0) goto L_0x0081
            r1 = 2826007(0x2b1f17, float:3.960079E-39)
            r0 = 2131889358(0x7f120cce, float:1.9413377E38)
            if (r10 == r1) goto L_0x007b
            r0 = 2826009(0x2b1f19, float:3.960082E-39)
            if (r10 != r0) goto L_0x0093
            r0 = 2131894174(0x7f121f9e, float:1.9423145E38)
        L_0x007b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r4 == 0) goto L_0x0093
        L_0x0081:
            int r0 = r4.intValue()
            java.lang.String r0 = r7.getString(r0)
            r6.A04(r10, r0, r2)
            X.05w r0 = A01(r7, r9, r0, r2)
            return r0
        L_0x0091:
            r9 = r8
            goto L_0x0069
        L_0x0093:
            r6.A04(r10, r3, r2)
            X.05w r0 = A00(r7, r9, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20110A7s.A05(android.content.Context, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, int):X.05w");
    }

    private String A03(Context context, int i, int i2) {
        String A002 = this.A00.A00(i);
        if (A002 == null) {
            return context.getString(i2);
        }
        return A002;
    }

    private void A04(int i, String str, String str2) {
        BD4 bd4 = this.A01;
        if (bd4 != null) {
            C171858sO BHN = bd4.BHN();
            BHN.A08 = C17880vN.A0k();
            BHN.A0b = "error";
            BHN.A0S = String.valueOf(i);
            BHN.A0T = str2;
            if (str != null) {
                BHN.A0U = str;
            }
            AnonymousClass8BX.A1D(this.A02, bd4, "PaymentUserActionEvent errorMapLoggingEvent: ", AnonymousClass000.A10());
            bd4.BiH(BHN);
        }
    }

    public C010105w A06(Context context, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2, int i) {
        int i2;
        if (i == 8 || i == 9 || i == 444 || i == 478) {
            i2 = 2131893867;
            onDismissListener2 = onDismissListener;
        } else if (i != 1448) {
            return null;
        } else {
            i2 = 2131893867;
        }
        String A03 = A03(context, i, i2);
        A04(i, (String) null, A03);
        return A00(context, onDismissListener2, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r9 != 2826008) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (r9 != 12750) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        A04(r9, r2, r4.getString(2131893975));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r2 == null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        A04(r9, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r1 = A03(r4, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r4.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        r1 = A03(r4, r9, r0);
        r0 = 2131894174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        r2 = r4.getString(r0);
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
        r2 = r4.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        if (r1 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e8, code lost:
        return A00(r4, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return A01(r4, r7, r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C010105w A07(android.content.Context r4, android.content.DialogInterface.OnDismissListener r5, android.content.DialogInterface.OnDismissListener r6, android.content.DialogInterface.OnDismissListener r7, java.lang.String r8, int r9) {
        /*
            r3 = this;
            r0 = 405(0x195, float:5.68E-43)
            r1 = 2131893962(0x7f121eca, float:1.9422715E38)
            if (r9 == r0) goto L_0x00ce
            r0 = 406(0x196, float:5.69E-43)
            r1 = 2131893959(0x7f121ec7, float:1.942271E38)
            if (r9 == r0) goto L_0x00ce
            r0 = 409(0x199, float:5.73E-43)
            if (r9 == r0) goto L_0x00cb
            r0 = 410(0x19a, float:5.75E-43)
            r1 = 2131893961(0x7f121ec9, float:1.9422713E38)
            if (r9 == r0) goto L_0x00ce
            r0 = 426(0x1aa, float:5.97E-43)
            r1 = 2131893958(0x7f121ec6, float:1.9422707E38)
            if (r9 == r0) goto L_0x00ce
            r0 = 460(0x1cc, float:6.45E-43)
            r1 = 2131893963(0x7f121ecb, float:1.9422717E38)
            if (r9 == r0) goto L_0x00ce
            r0 = 2826008(0x2b1f18, float:3.96008E-39)
            if (r9 == r0) goto L_0x00cb
        L_0x002c:
            X.05w r0 = r3.A06(r4, r6, r7, r9)
            if (r0 != 0) goto L_0x0057
            X.05w r0 = r3.A05(r4, r6, r7, r9)
            if (r0 != 0) goto L_0x0057
            r2 = 0
            switch(r9) {
                case 2001: goto L_0x005c;
                case 2304: goto L_0x0067;
                case 2321: goto L_0x0067;
                case 10010: goto L_0x006b;
                case 10775: goto L_0x0073;
                case 12750: goto L_0x007e;
                case 2826003: goto L_0x0089;
                case 2826006: goto L_0x0098;
                case 2826015: goto L_0x00a3;
                case 2826018: goto L_0x00a7;
                case 2896003: goto L_0x00b7;
                case 2896004: goto L_0x00b7;
                default: goto L_0x003c;
            }
        L_0x003c:
            r0 = 2131893867(0x7f121e6b, float:1.9422523E38)
            java.lang.String r1 = r3.A03(r4, r9, r0)
        L_0x0043:
            r0 = 12750(0x31ce, float:1.7867E-41)
            if (r9 != r0) goto L_0x0058
            r0 = 2131893975(0x7f121ed7, float:1.9422742E38)
            java.lang.String r0 = r4.getString(r0)
            r3.A04(r9, r2, r0)
        L_0x0051:
            if (r2 == 0) goto L_0x00e4
            X.05w r0 = A01(r4, r7, r2, r1)
        L_0x0057:
            return r0
        L_0x0058:
            r3.A04(r9, r2, r1)
            goto L_0x0051
        L_0x005c:
            r0 = 2131893896(0x7f121e88, float:1.9422581E38)
            java.lang.String r1 = r3.A03(r4, r9, r0)
            r0 = 2131893897(0x7f121e89, float:1.9422583E38)
            goto L_0x0093
        L_0x0067:
            r0 = 2131893611(0x7f121d6b, float:1.9422003E38)
            goto L_0x006e
        L_0x006b:
            r0 = 2131893825(0x7f121e41, float:1.9422437E38)
        L_0x006e:
            java.lang.String r1 = r3.A03(r4, r9, r0)
            goto L_0x00c5
        L_0x0073:
            r0 = 2131893714(0x7f121dd2, float:1.9422212E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131893715(0x7f121dd3, float:1.9422214E38)
            goto L_0x00b1
        L_0x007e:
            r0 = 2131893975(0x7f121ed7, float:1.9422742E38)
            java.lang.String r1 = X.C72473Md.A0j(r4, r8, r0)
            r0 = 2131893976(0x7f121ed8, float:1.9422744E38)
            goto L_0x00c1
        L_0x0089:
            r0 = 2131893833(0x7f121e49, float:1.9422454E38)
            java.lang.String r1 = r3.A03(r4, r9, r0)
            r0 = 2131894174(0x7f121f9e, float:1.9423145E38)
        L_0x0093:
            java.lang.String r2 = r4.getString(r0)
            goto L_0x00c6
        L_0x0098:
            r0 = 2131894031(0x7f121f0f, float:1.9422855E38)
            java.lang.String r1 = r3.A03(r4, r9, r0)
            r0 = 2131893930(0x7f121eaa, float:1.942265E38)
            goto L_0x00c1
        L_0x00a3:
            r0 = 2131893722(0x7f121dda, float:1.9422229E38)
            goto L_0x00aa
        L_0x00a7:
            r0 = 2131893723(0x7f121ddb, float:1.942223E38)
        L_0x00aa:
            java.lang.String r1 = r3.A03(r4, r9, r0)
            r0 = 2131894174(0x7f121f9e, float:1.9423145E38)
        L_0x00b1:
            java.lang.String r2 = r4.getString(r0)
            r5 = r7
            goto L_0x00c6
        L_0x00b7:
            r0 = 2131891306(0x7f12146a, float:1.9417328E38)
            java.lang.String r1 = r3.A03(r4, r9, r0)
            r0 = 2131891307(0x7f12146b, float:1.941733E38)
        L_0x00c1:
            java.lang.String r2 = r4.getString(r0)
        L_0x00c5:
            r5 = r6
        L_0x00c6:
            if (r1 == 0) goto L_0x003c
            r7 = r5
            goto L_0x0043
        L_0x00cb:
            r1 = 2131893960(0x7f121ec8, float:1.9422711E38)
        L_0x00ce:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x002c
            int r0 = r0.intValue()
            X.C17960vV.A07(r8)
            java.lang.String r0 = X.C72473Md.A0j(r4, r8, r0)
            X.05w r0 = A00(r4, r6, r0)
            return r0
        L_0x00e4:
            X.05w r0 = A00(r4, r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20110A7s.A07(android.content.Context, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, java.lang.String, int):X.05w");
    }

    public C20110A7s(C191089m0 r4, BD4 bd4) {
        this.A00 = r4;
        this.A01 = bd4;
    }

    public static C010105w A00(Context context, DialogInterface.OnDismissListener onDismissListener, String str) {
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0S(str);
        C73203Rj.A06(A002);
        C010105w create = A002.create();
        create.setOnDismissListener(onDismissListener);
        return create;
    }

    public static C010105w A01(Context context, DialogInterface.OnDismissListener onDismissListener, String str, String str2) {
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0k(str);
        A002.A0S(str2);
        C73203Rj.A06(A002);
        C010105w create = A002.create();
        create.setOnDismissListener(onDismissListener);
        return create;
    }
}
