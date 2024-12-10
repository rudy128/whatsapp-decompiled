package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A8n  reason: case insensitive filesystem */
public abstract class C20128A8n {
    public static final C20128A8n $redex_init_class = null;

    public static String A03(int i) {
        if (i == 6) {
            return "deposit";
        }
        if (i == 7) {
            return "refund";
        }
        if (i == 8) {
            return "withdrawal";
        }
        if (i == 100 || i == 200) {
            return "p2m";
        }
        return "p2p";
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x013e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(int r9, int r10) {
        /*
            r0 = 1
            java.lang.String r8 = "SENT_TO_SELLER"
            java.lang.String r7 = "FAILED_DA"
            java.lang.String r6 = "PENDING"
            java.lang.String r5 = "EXPIRED"
            java.lang.String r4 = "IN_REVIEW"
            java.lang.String r3 = "CANCELLED"
            java.lang.String r2 = "FAILED"
            java.lang.String r1 = "SUCCESS"
            if (r9 == r0) goto L_0x00b5
            r0 = 2
            if (r9 == r0) goto L_0x0082
            r0 = 6
            if (r9 == r0) goto L_0x013f
            r0 = 8
            if (r9 == r0) goto L_0x0059
            r0 = 10
            if (r9 == r0) goto L_0x002f
            r0 = 20
            if (r9 == r0) goto L_0x002f
            r0 = 100
            if (r9 == r0) goto L_0x00b5
            r0 = 200(0xc8, float:2.8E-43)
            if (r9 == r0) goto L_0x0082
        L_0x002d:
            r0 = 0
            return r0
        L_0x002f:
            r0 = 12
            if (r10 != r0) goto L_0x0036
            java.lang.String r0 = "COLLECT_SUCCESS"
            return r0
        L_0x0036:
            r0 = 13
            if (r10 != r0) goto L_0x003d
            java.lang.String r0 = "COLLECT_FAILED"
            return r0
        L_0x003d:
            r0 = 14
            if (r10 != r0) goto L_0x0044
            java.lang.String r0 = "COLLECT_FAILED_RISK"
            return r0
        L_0x0044:
            r0 = 15
            if (r10 != r0) goto L_0x004b
            java.lang.String r0 = "COLLECT_REJECTED"
            return r0
        L_0x004b:
            r0 = 16
            if (r10 != r0) goto L_0x0052
            java.lang.String r0 = "COLLECT_EXPIRED"
            return r0
        L_0x0052:
            r0 = 18
            if (r10 != r0) goto L_0x002d
            java.lang.String r0 = "COLLECT_CANCELED"
            return r0
        L_0x0059:
            r0 = 602(0x25a, float:8.44E-43)
            if (r10 != r0) goto L_0x0060
            java.lang.String r0 = "PENDING_CODE"
            return r0
        L_0x0060:
            r0 = 603(0x25b, float:8.45E-43)
            if (r10 == r0) goto L_0x0155
            r0 = 604(0x25c, float:8.46E-43)
            if (r10 == r0) goto L_0x0158
            r0 = 605(0x25d, float:8.48E-43)
            if (r10 == r0) goto L_0x0157
            r0 = 606(0x25e, float:8.49E-43)
            if (r10 == r0) goto L_0x0153
            r0 = 607(0x25f, float:8.5E-43)
            if (r10 == r0) goto L_0x0156
            r0 = 608(0x260, float:8.52E-43)
            if (r10 != r0) goto L_0x007b
            java.lang.String r0 = "WITHDRAWAL_ACTIVE"
            return r0
        L_0x007b:
            r0 = 609(0x261, float:8.53E-43)
            if (r10 != r0) goto L_0x002d
            java.lang.String r0 = "PENDING_CANCELLATION"
            return r0
        L_0x0082:
            r0 = 102(0x66, float:1.43E-43)
            if (r10 != r0) goto L_0x0089
            java.lang.String r0 = "PENDING_SETUP"
            return r0
        L_0x0089:
            r0 = 103(0x67, float:1.44E-43)
            if (r10 == r0) goto L_0x0159
            r0 = 104(0x68, float:1.46E-43)
            if (r10 != r0) goto L_0x0094
            java.lang.String r0 = "FAILED_PROCESSING"
            return r0
        L_0x0094:
            r0 = 106(0x6a, float:1.49E-43)
            if (r10 == r0) goto L_0x0158
            r0 = 105(0x69, float:1.47E-43)
            if (r10 == r0) goto L_0x0157
            r0 = 107(0x6b, float:1.5E-43)
            if (r10 == r0) goto L_0x0156
            r0 = 109(0x6d, float:1.53E-43)
            if (r10 != r0) goto L_0x00a7
            java.lang.String r0 = "WITHDRAWAL_PROCESSING"
            return r0
        L_0x00a7:
            r0 = 110(0x6e, float:1.54E-43)
            if (r10 != r0) goto L_0x00ae
            java.lang.String r0 = "WITHDRAWAL_FAILURE"
            return r0
        L_0x00ae:
            r0 = 111(0x6f, float:1.56E-43)
            if (r10 != r0) goto L_0x0136
            java.lang.String r0 = "WITHDRAWAL_PERMANENT_FAILED"
            return r0
        L_0x00b5:
            r0 = 402(0x192, float:5.63E-43)
            if (r10 != r0) goto L_0x00bc
            java.lang.String r0 = "PENDING_RECEIVER_SETUP"
            return r0
        L_0x00bc:
            r0 = 403(0x193, float:5.65E-43)
            if (r10 == r0) goto L_0x0159
            r0 = 404(0x194, float:5.66E-43)
            if (r10 != r0) goto L_0x00c7
            java.lang.String r0 = "REFUND_FAILED_DA"
            return r0
        L_0x00c7:
            r0 = 407(0x197, float:5.7E-43)
            if (r10 != r0) goto L_0x00ce
            java.lang.String r0 = "FAILED_RISK"
            return r0
        L_0x00ce:
            r0 = 405(0x195, float:5.68E-43)
            if (r10 == r0) goto L_0x0158
            r0 = 406(0x196, float:5.69E-43)
            if (r10 == r0) goto L_0x0157
            r0 = 408(0x198, float:5.72E-43)
            if (r10 != r0) goto L_0x00dd
            java.lang.String r0 = "REFUNDED"
            return r0
        L_0x00dd:
            r0 = 409(0x199, float:5.73E-43)
            if (r10 != r0) goto L_0x00e4
            java.lang.String r0 = "REFUND_FAILED"
            return r0
        L_0x00e4:
            r0 = 410(0x19a, float:5.75E-43)
            if (r10 != r0) goto L_0x00eb
            java.lang.String r0 = "FAILED_RECEIVER_PROCESSING"
            return r0
        L_0x00eb:
            r0 = 411(0x19b, float:5.76E-43)
            if (r10 != r0) goto L_0x00f2
            java.lang.String r0 = "REFUND_FAILED_PROCESSING"
            return r0
        L_0x00f2:
            r0 = 412(0x19c, float:5.77E-43)
            if (r10 != r0) goto L_0x00f9
            java.lang.String r0 = "FAILED_DA_FINAL"
            return r0
        L_0x00f9:
            r0 = 413(0x19d, float:5.79E-43)
            if (r10 != r0) goto L_0x0100
            java.lang.String r0 = "AUTH_CANCEL_FAILED_PROCESSING"
            return r0
        L_0x0100:
            r0 = 414(0x19e, float:5.8E-43)
            if (r10 != r0) goto L_0x0107
            java.lang.String r0 = "AUTH_CANCEL_FAILED"
            return r0
        L_0x0107:
            r0 = 415(0x19f, float:5.82E-43)
            if (r10 != r0) goto L_0x010e
            java.lang.String r0 = "AUTH_CANCELED"
            return r0
        L_0x010e:
            r0 = 416(0x1a0, float:5.83E-43)
            if (r10 == r0) goto L_0x0156
            r0 = 419(0x1a3, float:5.87E-43)
            if (r10 == r0) goto L_0x0155
            r0 = 420(0x1a4, float:5.89E-43)
            if (r10 == r0) goto L_0x0154
            r0 = 421(0x1a5, float:5.9E-43)
            if (r10 == r0) goto L_0x0153
            r0 = 422(0x1a6, float:5.91E-43)
            if (r10 != r0) goto L_0x0125
            java.lang.String r0 = "REVERSAL_SUCCESS"
            return r0
        L_0x0125:
            r0 = 423(0x1a7, float:5.93E-43)
            if (r10 != r0) goto L_0x012c
            java.lang.String r0 = "REVERSAL_PENDING"
            return r0
        L_0x012c:
            r0 = 424(0x1a8, float:5.94E-43)
            if (r10 != r0) goto L_0x0133
            java.lang.String r0 = "REFUND_PENDING"
            return r0
        L_0x0133:
            r0 = 425(0x1a9, float:5.96E-43)
            goto L_0x013c
        L_0x0136:
            r0 = 112(0x70, float:1.57E-43)
            if (r10 == r0) goto L_0x0153
            r0 = 113(0x71, float:1.58E-43)
        L_0x013c:
            if (r10 != r0) goto L_0x002d
            return r8
        L_0x013f:
            r0 = 701(0x2bd, float:9.82E-43)
            if (r10 == r0) goto L_0x0154
            r0 = 702(0x2be, float:9.84E-43)
            if (r10 == r0) goto L_0x0155
            r0 = 703(0x2bf, float:9.85E-43)
            if (r10 == r0) goto L_0x0158
            r0 = 704(0x2c0, float:9.87E-43)
            if (r10 == r0) goto L_0x0157
            r0 = 705(0x2c1, float:9.88E-43)
            if (r10 != r0) goto L_0x002d
        L_0x0153:
            return r3
        L_0x0154:
            return r6
        L_0x0155:
            return r4
        L_0x0156:
            return r5
        L_0x0157:
            return r2
        L_0x0158:
            return r1
        L_0x0159:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20128A8n.A04(int, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r0 = r4.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(X.AW0 r4) {
        /*
            r3 = 1
            if (r4 == 0) goto L_0x001d
            int r2 = r4.A03
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 0
            if (r2 != r1) goto L_0x000b
            return r0
        L_0x000b:
            r0 = 4
            if (r2 == r0) goto L_0x001d
            X.1KN r0 = r4.A09
            if (r0 == 0) goto L_0x001d
            java.math.BigDecimal r1 = r0.A00
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            int r0 = r1.compareTo(r0)
            if (r0 <= 0) goto L_0x001d
            r3 = 0
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20128A8n.A07(X.AW0):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(int r17, java.lang.String r18) {
        /*
            r13 = r18
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r1 = 0
            if (r0 != 0) goto L_0x0045
            r0 = 1
            java.lang.String r18 = "FAILURE"
            java.lang.String r14 = "FAILED_RISK"
            java.lang.String r12 = "AUTH_CANCELED"
            java.lang.String r11 = "FAILED_DA"
            java.lang.String r10 = "EXPIRED"
            java.lang.String r9 = "IN_REVIEW"
            java.lang.String r8 = "PENDING"
            java.lang.String r7 = "CANCELLED"
            java.lang.String r6 = "FAILED"
            java.lang.String r5 = "COMPLETED"
            java.lang.String r4 = "SUCCESS"
            r15 = r17
            if (r15 == r0) goto L_0x01aa
            r0 = 2
            r17 = 106(0x6a, float:1.49E-43)
            if (r15 == r0) goto L_0x011e
            r16 = 15
            java.lang.String r3 = "COLLECT_EXPIRED"
            java.lang.String r2 = "COLLECT_REJECTED"
            java.lang.String r1 = "COLLECT_SUCCESS"
            r0 = 20
            if (r15 == r0) goto L_0x00d4
            r0 = 40
            if (r15 == r0) goto L_0x00c0
            r0 = 100
            if (r15 == r0) goto L_0x01aa
            r0 = 200(0xc8, float:2.8E-43)
            if (r15 == r0) goto L_0x011e
            switch(r15) {
                case 6: goto L_0x0046;
                case 7: goto L_0x019d;
                case 8: goto L_0x0072;
                case 9: goto L_0x011e;
                case 10: goto L_0x00d4;
                default: goto L_0x0044;
            }
        L_0x0044:
            r1 = 0
        L_0x0045:
            return r1
        L_0x0046:
            boolean r0 = r8.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x004f
            r1 = 701(0x2bd, float:9.82E-43)
            return r1
        L_0x004f:
            boolean r0 = r9.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0058
            r1 = 702(0x2be, float:9.84E-43)
            return r1
        L_0x0058:
            boolean r0 = r4.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0061
            r1 = 703(0x2bf, float:9.85E-43)
            return r1
        L_0x0061:
            boolean r0 = r6.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x006a
            r1 = 704(0x2c0, float:9.87E-43)
            return r1
        L_0x006a:
            boolean r0 = r7.equalsIgnoreCase(r13)
            r1 = 705(0x2c1, float:9.88E-43)
            goto L_0x0295
        L_0x0072:
            java.lang.String r0 = "PENDING_CODE"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x029f
            boolean r0 = r8.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x029f
            boolean r0 = r9.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0089
            r1 = 603(0x25b, float:8.45E-43)
            return r1
        L_0x0089:
            boolean r0 = r4.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x029c
            boolean r0 = r5.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x029c
            boolean r0 = r6.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x0299
            java.lang.String r0 = "DECLINED"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x0299
            boolean r0 = r7.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x00ac
            r1 = 606(0x25e, float:8.49E-43)
            return r1
        L_0x00ac:
            boolean r0 = r10.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x00b5
            r1 = 607(0x25f, float:8.5E-43)
            return r1
        L_0x00b5:
            java.lang.String r0 = "WITHDRAWAL_ACTIVE"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x028d
            r1 = 608(0x260, float:8.52E-43)
            return r1
        L_0x00c0:
            boolean r0 = r1.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x00c9
            r1 = 20
            return r1
        L_0x00c9:
            java.lang.String r0 = "AUTH_SUCCESS"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0109
            r1 = 417(0x1a1, float:5.84E-43)
            return r1
        L_0x00d4:
            boolean r0 = r1.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x00dd
            r1 = 12
            return r1
        L_0x00dd:
            java.lang.String r0 = "COLLECT_FAILED"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x00e8
            r1 = 13
            return r1
        L_0x00e8:
            java.lang.String r0 = "COLLECT_FAILED_RISK"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x00f3
            r1 = 14
            return r1
        L_0x00f3:
            boolean r0 = r2.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02a2
            boolean r0 = r3.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "COLLECT_CANCELED"
            boolean r0 = r0.equalsIgnoreCase(r13)
            r1 = 18
            goto L_0x0295
        L_0x0109:
            boolean r0 = r12.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02a6
            boolean r0 = r2.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02a2
            boolean r0 = r3.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0044
        L_0x011b:
            r1 = 16
            return r1
        L_0x011e:
            java.lang.String r0 = "PENDING_SETUP"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0129
            r1 = 102(0x66, float:1.43E-43)
            return r1
        L_0x0129:
            boolean r0 = r11.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0132
            r1 = 103(0x67, float:1.44E-43)
            return r1
        L_0x0132:
            java.lang.String r0 = "FAILED_PROCESSING"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x013d
            r1 = 104(0x68, float:1.46E-43)
            return r1
        L_0x013d:
            boolean r0 = r4.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x01a9
            boolean r0 = r5.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x01a9
            r0 = r18
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r6.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r10.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0160
            r1 = 107(0x6b, float:1.5E-43)
            return r1
        L_0x0160:
            boolean r0 = r14.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0169
            r1 = 108(0x6c, float:1.51E-43)
            return r1
        L_0x0169:
            java.lang.String r0 = "WITHDRAWAL_PROCESSING"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0174
            r1 = 109(0x6d, float:1.53E-43)
            return r1
        L_0x0174:
            java.lang.String r0 = "WITHDRAWAL_FAILURE"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x017f
            r1 = 110(0x6e, float:1.54E-43)
            return r1
        L_0x017f:
            java.lang.String r0 = "WITHDRAWAL_PERMANENT_FAILED"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x018a
            r1 = 111(0x6f, float:1.56E-43)
            return r1
        L_0x018a:
            boolean r0 = r7.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0193
            r1 = 112(0x70, float:1.57E-43)
            return r1
        L_0x0193:
            java.lang.String r0 = "SENT_TO_SELLER"
            boolean r0 = r0.equalsIgnoreCase(r13)
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x0295
        L_0x019d:
            boolean r0 = r4.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x01a9
            boolean r0 = r5.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0044
        L_0x01a9:
            return r17
        L_0x01aa:
            java.lang.String r0 = "PENDING_RECEIVER_SETUP"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x01b5
            r1 = 402(0x192, float:5.63E-43)
            return r1
        L_0x01b5:
            boolean r0 = r11.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x01be
            r1 = 403(0x193, float:5.65E-43)
            return r1
        L_0x01be:
            java.lang.String r0 = "REFUND_FAILED_DA"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x01c9
            r1 = 404(0x194, float:5.66E-43)
            return r1
        L_0x01c9:
            boolean r0 = r14.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x01d2
            r1 = 407(0x197, float:5.7E-43)
            return r1
        L_0x01d2:
            java.lang.String r0 = "INITIAL"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x01dd
            r1 = 401(0x191, float:5.62E-43)
            return r1
        L_0x01dd:
            boolean r0 = r4.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02ac
            boolean r0 = r5.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02ac
            r0 = r18
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02a9
            boolean r0 = r6.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02a9
            java.lang.String r0 = "REFUNDED"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0202
            r1 = 408(0x198, float:5.72E-43)
            return r1
        L_0x0202:
            java.lang.String r0 = "REFUND_FAILED"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x020d
            r1 = 409(0x199, float:5.73E-43)
            return r1
        L_0x020d:
            java.lang.String r0 = "FAILED_RECEIVER_PROCESSING"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0218
            r1 = 410(0x19a, float:5.75E-43)
            return r1
        L_0x0218:
            java.lang.String r0 = "REFUND_FAILED_PROCESSING"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0223
            r1 = 411(0x19b, float:5.76E-43)
            return r1
        L_0x0223:
            java.lang.String r0 = "FAILED_DA_FINAL"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x022e
            r1 = 412(0x19c, float:5.77E-43)
            return r1
        L_0x022e:
            java.lang.String r0 = "AUTH_CANCEL_FAILED_PROCESSING"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0239
            r1 = 413(0x19d, float:5.79E-43)
            return r1
        L_0x0239:
            java.lang.String r0 = "AUTH_CANCEL_FAILED"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0244
            r1 = 414(0x19e, float:5.8E-43)
            return r1
        L_0x0244:
            boolean r0 = r12.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02a6
            boolean r0 = r10.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0253
            r1 = 416(0x1a0, float:5.83E-43)
            return r1
        L_0x0253:
            boolean r0 = r9.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x025c
            r1 = 419(0x1a3, float:5.87E-43)
            return r1
        L_0x025c:
            boolean r0 = r8.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0265
            r1 = 420(0x1a4, float:5.89E-43)
            return r1
        L_0x0265:
            boolean r0 = r7.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x026e
            r1 = 421(0x1a5, float:5.9E-43)
            return r1
        L_0x026e:
            java.lang.String r0 = "REVERSAL_SUCCESS"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0279
            r1 = 422(0x1a6, float:5.91E-43)
            return r1
        L_0x0279:
            java.lang.String r0 = "REVERSAL_PENDING"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x0284
            r1 = 423(0x1a7, float:5.93E-43)
            return r1
        L_0x0284:
            java.lang.String r0 = "REFUND_PENDING"
            boolean r0 = r0.equalsIgnoreCase(r13)
            r1 = 424(0x1a8, float:5.94E-43)
            goto L_0x0295
        L_0x028d:
            java.lang.String r0 = "PENDING_CANCELLATION"
            boolean r0 = r0.equalsIgnoreCase(r13)
            r1 = 609(0x261, float:8.53E-43)
        L_0x0295:
            if (r0 != 0) goto L_0x0045
            goto L_0x0044
        L_0x0299:
            r1 = 605(0x25d, float:8.48E-43)
            return r1
        L_0x029c:
            r1 = 604(0x25c, float:8.46E-43)
            return r1
        L_0x029f:
            r1 = 602(0x25a, float:8.44E-43)
            return r1
        L_0x02a2:
            return r16
        L_0x02a3:
            r1 = 105(0x69, float:1.47E-43)
            return r1
        L_0x02a6:
            r1 = 415(0x19f, float:5.82E-43)
            return r1
        L_0x02a9:
            r1 = 406(0x196, float:5.69E-43)
            return r1
        L_0x02ac:
            r1 = 405(0x195, float:5.68E-43)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20128A8n.A00(int, java.lang.String):int");
    }

    public static AW0 A01(long j) {
        C63572tK r0 = C63572tK.A0E;
        return new AW0("UNSET", 4, 1, 0, j);
    }

    static {
        C63572tK r0 = C63572tK.A0E;
    }

    public static AW0 A02(AnonymousClass1KJ r25, AnonymousClass1KN r26, UserJid userJid, UserJid userJid2, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, long j) {
        ArrayList A13 = AnonymousClass000.A13();
        int i6 = i5;
        if (i6 == 1) {
            A13.add("feature_bip");
        }
        String str4 = str3;
        int i7 = 1;
        if (!TextUtils.isEmpty(str4) && AnonymousClass9U8.A00.containsKey(str4)) {
            if (A13.isEmpty()) {
                i7 = C196679vS.A00(str4);
            } else {
                Integer A01 = C196679vS.A01(str4, (String) Collections.max(A13, new C21480Akl(str4, 2)));
                if (A01 != null) {
                    i7 = A01.intValue();
                }
            }
        }
        return new AW0(r25, r26, userJid, userJid2, str, (String) null, (String) null, (String) null, (String) null, str2, str4, i, i2, Math.max(i7, i3), i4, i6, j, 0);
    }

    public static String A05(List list) {
        if (list.size() <= 0) {
            return null;
        }
        JSONArray A1A = AnonymousClass8BR.A1A();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1A.put(A06((C185879dI) it.next(), false));
        }
        return A1A.toString();
    }

    public static JSONObject A06(C185879dI r4, boolean z) {
        Object obj;
        JSONObject A15 = C17880vN.A15();
        try {
            C20284AEs aEs = r4.A01;
            A15.put("t", aEs.A05());
            A15.put("st", (Object) null);
            A15.put("cc", aEs.A07.A03);
            if (!z) {
                A15.put("c", aEs.A0A);
                C1418477e r0 = aEs.A09;
                if (r0 != null) {
                    obj = r0.A00;
                } else {
                    obj = null;
                }
                A15.put("n", obj);
                AnonymousClass8BS.A1C(r4.A02, "a", A15);
            }
            if (aEs instanceof AnonymousClass8pK) {
                A15.put("ci", ((AnonymousClass8pK) aEs).A01);
            }
            A15.put("sd", r4.A00);
            return A15;
        } catch (JSONException e) {
            if (z) {
                return null;
            }
            Log.w("PAY: PaymentTransaction:Source:toJsonString threw creating json string: ", e);
            return null;
        }
    }

    public static boolean A08(String str) {
        if (TextUtils.isEmpty(str) || "UNSET".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean A09(String str, int i) {
        AbstractMap abstractMap;
        Number number;
        int i2 = 1;
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = AnonymousClass9U8.A00;
            if (!(!hashMap.containsKey(str) || (abstractMap = (AbstractMap) hashMap.get(str)) == null || (number = (Number) Collections.max(abstractMap.values())) == null)) {
                i2 = number.intValue();
            }
        }
        return C108975cc.A1C(i2, i);
    }
}
