package org.npci.upi.security.pinactivitycomponent;

import X.AFL;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8Do;
import X.B6S;
import X.BDB;
import X.C17890vO;
import X.C180719Nq;
import X.C192349oE;
import X.C21336AiM;
import X.C21429Ajw;
import X.C24261Jm;
import X.C72463Mc;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import java.util.ArrayList;

public class w extends s implements B6S {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public View A04 = null;
    public LinearLayout A05;
    public LinearLayout A06;
    public LinearLayout A07;
    public LinearLayout A08 = null;
    public ViewFlipper A09 = null;
    public C21336AiM A0A;
    public Boolean A0B = false;
    public Boolean A0C = false;
    public Boolean A0D = false;
    public Boolean A0E = false;
    public Boolean A0F = false;
    public String A0G = "";
    public C180719Nq A0H;
    public boolean A0I = false;
    public boolean A0J = false;

    /* JADX WARNING: type inference failed for: r3v9, types: [X.8DP, android.widget.FrameLayout, android.view.View, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:7|8|9|10|11|12|13|14|(2:17|15)|33|18|19|20|(1:22)(1:23)|24|25|26|(2:27|28)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x008e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0124 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009c A[Catch:{  }, LOOP:0: B:15:0x0092->B:17:0x009c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c3 A[Catch:{ Exception -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c5 A[Catch:{ Exception -> 0x0124 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r15, android.view.View r16) {
        /*
            r14 = this;
            r7 = r14
            r0 = r16
            r14.A04 = r0
            super.A21(r15, r0)
            android.content.Context r1 = r14.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            X.9Nq r1 = r1.A0D
            r14.A0H = r1
            r1 = 2131432247(0x7f0b1337, float:1.8486246E38)
            android.widget.LinearLayout r1 = X.AnonymousClass8BR.A0A(r0, r1)
            r14.A06 = r1
            r1 = 2131432248(0x7f0b1338, float:1.8486248E38)
            android.widget.LinearLayout r1 = X.AnonymousClass8BR.A0A(r0, r1)
            r14.A05 = r1
            r1 = 2131434202(0x7f0b1ada, float:1.8490211E38)
            android.widget.LinearLayout r1 = X.AnonymousClass8BR.A0A(r0, r1)
            r14.A07 = r1
            r1 = 2131434204(0x7f0b1adc, float:1.8490215E38)
            android.widget.LinearLayout r1 = X.AnonymousClass8BR.A0A(r0, r1)
            r14.A08 = r1
            android.content.Context r1 = r14.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            X.9Nq r1 = r1.A0D
            java.lang.Boolean r1 = r1.A02
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0048
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()
            r14.A0C = r1
        L_0x0048:
            r1 = 2131436824(0x7f0b2518, float:1.849553E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ViewFlipper r1 = (android.widget.ViewFlipper) r1
            r14.A09 = r1
            X.9Nq r1 = r14.A0H
            boolean r1 = r1.A00()
            r12 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            if (r1 == 0) goto L_0x0158
            android.content.Context r1 = r14.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            X.9Nq r1 = r1.A0D
            boolean r1 = r1.A0J
            if (r1 == 0) goto L_0x0158
            org.json.JSONArray r4 = X.AnonymousClass8BR.A1A()
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{  }
            java.lang.String r2 = "type"
            java.lang.String r1 = "CARD"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = "subtype"
            java.lang.String r1 = "CARDDETAILS"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = "dType"
            java.lang.String r1 = "NUM"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = "dLength"
            java.lang.String r1 = "6"
            r3.put(r2, r1)     // Catch:{ Exception -> 0x008e }
        L_0x008e:
            r4.put(r12, r3)     // Catch:{  }
            r3 = 0
        L_0x0092:
            X.9Nq r1 = r14.A0H     // Catch:{  }
            org.json.JSONArray r1 = r1.A08     // Catch:{  }
            int r1 = r1.length()     // Catch:{  }
            if (r3 >= r1) goto L_0x00ac
            int r2 = r3 + 1
            X.9Nq r1 = r14.A0H     // Catch:{  }
            org.json.JSONArray r1 = r1.A08     // Catch:{  }
            java.lang.Object r1 = r1.get(r3)     // Catch:{  }
            r4.put(r2, r1)     // Catch:{  }
            int r3 = r3 + 1
            goto L_0x0092
        L_0x00ac:
            X.9Nq r1 = r14.A0H     // Catch:{  }
            r1.A08 = r4     // Catch:{  }
            java.lang.String r3 = "dLength"
            r1 = 1
            org.json.JSONObject r4 = r4.getJSONObject(r12)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r2 = "subtype"
            java.lang.String r11 = r4.getString(r2)     // Catch:{ Exception -> 0x0124 }
            int r2 = r4.optInt(r3)     // Catch:{ Exception -> 0x0124 }
            if (r2 != 0) goto L_0x00c5
            r13 = 6
            goto L_0x00c9
        L_0x00c5:
            int r13 = r4.optInt(r3)     // Catch:{ Exception -> 0x0124 }
        L_0x00c9:
            r6 = 2131898769(0x7f123191, float:1.9432465E38)
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1b()     // Catch:{ Exception -> 0x0124 }
            X.9Nq r3 = r14.A0H     // Catch:{ Exception -> 0x0124 }
            java.lang.String r2 = r3.A06     // Catch:{ Exception -> 0x0124 }
            r5[r12] = r2     // Catch:{ Exception -> 0x0124 }
            java.lang.String r2 = r3.A05     // Catch:{ Exception -> 0x0124 }
            java.lang.String r2 = X.AnonymousClass3MX.A16(r14, r2, r5, r1, r6)     // Catch:{ Exception -> 0x0124 }
            r14.A0G = r2     // Catch:{ Exception -> 0x0124 }
            r2 = 2131898770(0x7f123192, float:1.9432467E38)
            java.lang.String r9 = r14.A1H(r2)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r10 = r14.A0G     // Catch:{ Exception -> 0x0124 }
            java.lang.Boolean r8 = r14.A0C     // Catch:{ Exception -> 0x0124 }
            X.8Do r3 = r7.A25(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0124 }
            r2 = 2131898768(0x7f123190, float:1.9432463E38)
            java.lang.String r9 = r14.A1H(r2)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r10 = r14.A0G     // Catch:{ Exception -> 0x0124 }
            java.lang.Boolean r8 = r14.A0C     // Catch:{ Exception -> 0x0124 }
            r13 = 4
            X.8Do r2 = r7.A25(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0124 }
            java.util.ArrayList r5 = X.C108965cb.A0s(r3)     // Catch:{ Exception -> 0x0124 }
            r5.add(r2)     // Catch:{ Exception -> 0x0124 }
            X.1FL r2 = r14.A1B()     // Catch:{ Exception -> 0x0124 }
            X.8DP r3 = new X.8DP     // Catch:{ Exception -> 0x0124 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0124 }
            r3.A00(r5, r14)     // Catch:{ Exception -> 0x0124 }
            r3.A02 = r4     // Catch:{ Exception -> 0x0124 }
            java.util.ArrayList r2 = r14.A04     // Catch:{ Exception -> 0x0124 }
            r2.add(r3)     // Catch:{ Exception -> 0x0124 }
            r2 = 2131429821(0x7f0b09bd, float:1.8481326E38)
            r14.A00(r2, r12)     // Catch:{ Exception -> 0x0124 }
            android.widget.LinearLayout r2 = X.AnonymousClass8BR.A0A(r0, r2)     // Catch:{ Exception -> 0x0124 }
            r2.addView(r3)     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            java.util.ArrayList r2 = r14.A04     // Catch:{  }
            java.lang.Object r4 = r2.get(r12)     // Catch:{  }
            X.BDB r4 = (X.BDB) r4     // Catch:{  }
            X.1FL r3 = r14.A1B()     // Catch:{  }
            r2 = 2131231133(0x7f08019d, float:1.8078338E38)
            android.graphics.drawable.Drawable r6 = X.C24261Jm.A00(r3, r2)     // Catch:{  }
            X.1FL r3 = r14.A1B()     // Catch:{  }
            r2 = 2131231134(0x7f08019e, float:1.807834E38)
            android.graphics.drawable.Drawable r5 = X.C24261Jm.A00(r3, r2)     // Catch:{  }
            r8 = 30
            X.78E r3 = new X.78E     // Catch:{  }
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{  }
            r2 = 2131898931(0x7f123233, float:1.9432794E38)
            java.lang.String r7 = r14.A1H(r2)     // Catch:{ JSONException -> 0x015e }
            r8 = r1
            r5 = r6
            r6 = r3
            r9 = r1
            r4.BAJ(r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x015e }
            goto L_0x015e
        L_0x0158:
            A01(r0, r2, r14)
            A02(r14, r12)
        L_0x015e:
            r1 = 2
            java.util.ArrayList r0 = r0.getFocusables(r1)
            X.AnonymousClass8BU.A1M(r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.w.A21(android.os.Bundle, android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r5v12, types: [X.8DP, android.widget.FrameLayout, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0251, code lost:
        r15 = r5.optString("value", r15);
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03cc A[Catch:{ Exception -> 0x04a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x049b A[Catch:{ Exception -> 0x04a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01e5 A[Catch:{ Exception -> 0x04a9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.view.View r27, java.lang.Integer r28, org.npci.upi.security.pinactivitycomponent.w r29) {
        /*
            java.lang.String r19 = "mobileNumber"
            java.lang.String r18 = "dLength"
            java.lang.String r17 = "subtype"
            java.lang.String r16 = "MPIN"
            r3 = r29
            X.9Nq r0 = r3.A0H
            org.json.JSONArray r0 = r0.A08
            if (r0 == 0) goto L_0x04cd
            int r2 = r28.intValue()
        L_0x0014:
            X.9Nq r0 = r3.A0H
            org.json.JSONArray r0 = r0.A08
            int r0 = r0.length()
            r6 = 0
            r5 = 1
            if (r2 >= r0) goto L_0x04ad
            X.9Nq r0 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r0 = r0.A08     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONObject r4 = r0.getJSONObject(r2)     // Catch:{ Exception -> 0x04a9 }
            r0 = r17
            java.lang.String r1 = r4.getString(r0)     // Catch:{ Exception -> 0x04a9 }
            r0 = r18
            int r7 = r4.optInt(r0)     // Catch:{ Exception -> 0x04a9 }
            r0 = 6
            if (r7 == 0) goto L_0x003d
            r0 = r18
            int r0 = r4.optInt(r0)     // Catch:{ Exception -> 0x04a9 }
        L_0x003d:
            java.lang.String r7 = "securePinUrl"
            boolean r7 = r4.has(r7)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r13 = "ATMPIN"
            if (r7 != 0) goto L_0x008b
            boolean r7 = r13.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r7 == 0) goto L_0x008b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x04a9 }
            r3.A0F = r7     // Catch:{ Exception -> 0x04a9 }
            r7 = 2131899276(0x7f12338c, float:1.9433493E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x04a9 }
            X.C17880vN.A1T(r5, r0, r6)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r8 = r3.A1I(r7, r5)     // Catch:{ Exception -> 0x04a9 }
            r5 = 2131898936(0x7f123238, float:1.9432804E38)
            java.lang.String r9 = r3.A1H(r5)     // Catch:{ Exception -> 0x04a9 }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04a9 }
            r6 = r3
            r7 = r5
            r10 = r1
            r11 = r2
            r12 = r0
            X.8Do r5 = r6.A25(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x04a9 }
            r5.A0C = r4     // Catch:{ Exception -> 0x04a9 }
            java.util.ArrayList r1 = r3.A04     // Catch:{ Exception -> 0x04a9 }
            r1.add(r5)     // Catch:{ Exception -> 0x04a9 }
            r4 = 2131435968(0x7f0b21c0, float:1.8493793E38)
            r3.A00(r4, r2)     // Catch:{ Exception -> 0x04a9 }
            r1 = r27
            android.widget.LinearLayout r1 = X.AnonymousClass8BR.A0A(r1, r4)     // Catch:{ Exception -> 0x04a9 }
            r1.addView(r5)     // Catch:{ Exception -> 0x04a9 }
            r3.A02 = r0     // Catch:{ Exception -> 0x04a9 }
            goto L_0x04a9
        L_0x008b:
            r5 = r16
            boolean r21 = r1.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r20 = "SIGNATURE"
            java.lang.String r12 = "TOTP"
            java.lang.String r11 = "HOTP"
            java.lang.String r10 = "EMAIL"
            java.lang.String r9 = "SMS"
            java.lang.String r8 = "OTP"
            java.lang.String r7 = "AADHAAR"
            java.lang.String r14 = "NMPIN"
            if (r21 != 0) goto L_0x00e3
            boolean r5 = r1.equals(r14)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r13.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r8.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r9.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r10.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r11.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r12.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x00e3
            boolean r5 = r7.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x00e3
            java.lang.String r5 = "CARDDETAILS"
            boolean r5 = r5.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x00e3
            r5 = r20
            boolean r5 = r5.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x04a9
        L_0x00e3:
            boolean r5 = r1.equals(r14)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x00f3
            if (r21 == 0) goto L_0x019c
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            boolean r5 = r5.A00()     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x019c
        L_0x00f3:
            r5 = 2131898939(0x7f12323b, float:1.943281E38)
            java.lang.String r5 = r3.A1H(r5)     // Catch:{ Exception -> 0x04a9 }
            r3.A0G = r5     // Catch:{ Exception -> 0x04a9 }
            boolean r5 = r3.A0J     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x0164
            r7 = 2131899281(0x7f123391, float:1.9433504E38)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x04a9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r11 = X.AnonymousClass3MX.A16(r3, r8, r5, r6, r7)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r7 = r3.A0G     // Catch:{ Exception -> 0x04a9 }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04a9 }
            r9 = r3
            r10 = r5
            r12 = r7
            r13 = r1
            r14 = r2
            r15 = r0
            X.8Do r9 = r9.A25(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x04a9 }
            r5 = 2131899279(0x7f12338f, float:1.94335E38)
            java.lang.String r22 = X.AnonymousClass3MY.A0o(r3, r8, r6, r5)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r7 = r3.A0G     // Catch:{ Exception -> 0x04a9 }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04a9 }
            r20 = r3
            r21 = r5
            r23 = r7
            r24 = r1
            r25 = r2
            r26 = r0
            X.8Do r0 = r20.A25(r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x04a9 }
            r3.A0J = r6     // Catch:{ Exception -> 0x04a9 }
        L_0x0139:
            java.util.ArrayList r1 = X.C108965cb.A0s(r9)     // Catch:{ Exception -> 0x04a9 }
            r1.add(r0)     // Catch:{ Exception -> 0x04a9 }
            X.1FL r0 = r3.A1B()     // Catch:{ Exception -> 0x04a9 }
            X.8DP r5 = new X.8DP     // Catch:{ Exception -> 0x04a9 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x04a9 }
            r5.A00(r1, r3)     // Catch:{ Exception -> 0x04a9 }
            r5.A02 = r4     // Catch:{ Exception -> 0x04a9 }
            java.util.ArrayList r0 = r3.A04     // Catch:{ Exception -> 0x04a9 }
            r0.add(r5)     // Catch:{ Exception -> 0x04a9 }
            r1 = 2131435967(0x7f0b21bf, float:1.8493791E38)
            r3.A00(r1, r2)     // Catch:{ Exception -> 0x04a9 }
            r0 = r27
            android.widget.LinearLayout r0 = X.AnonymousClass8BR.A0A(r0, r1)     // Catch:{ Exception -> 0x04a9 }
        L_0x015f:
            r0.addView(r5)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x04a9
        L_0x0164:
            r5 = 1
            r7 = 2131899284(0x7f123394, float:1.943351E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x04a9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r11 = X.AnonymousClass3MX.A16(r3, r8, r5, r6, r7)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r7 = r3.A0G     // Catch:{ Exception -> 0x04a9 }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04a9 }
            r9 = r3
            r10 = r5
            r12 = r7
            r13 = r1
            r14 = r2
            r15 = r0
            X.8Do r9 = r9.A25(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x04a9 }
            r5 = 2131899278(0x7f12338e, float:1.9433497E38)
            java.lang.String r22 = X.AnonymousClass3MY.A0o(r3, r8, r6, r5)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r6 = r3.A0G     // Catch:{ Exception -> 0x04a9 }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04a9 }
            r20 = r3
            r21 = r5
            r23 = r6
            r24 = r1
            r25 = r2
            r26 = r0
            X.8Do r0 = r20.A25(r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x0139
        L_0x019c:
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x04a9 }
            int r6 = r5.length()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r15 = ""
            r5 = 1
            if (r6 <= r5) goto L_0x01ac
            if (r21 == 0) goto L_0x01ac
            goto L_0x01ae
        L_0x01ac:
            r6 = r15
            goto L_0x01df
        L_0x01ae:
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A08     // Catch:{ Exception -> 0x04a9 }
            r6 = r5
            int r5 = r2 + 1
            org.json.JSONObject r5 = r6.getJSONObject(r5)     // Catch:{ Exception -> 0x04a9 }
            r6 = r17
            java.lang.String r5 = r5.getString(r6)     // Catch:{ Exception -> 0x04a9 }
            boolean r5 = r5.equals(r14)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x01ac
            r5 = 1
            r3.A0J = r5     // Catch:{ Exception -> 0x04a9 }
            r6 = 2131899282(0x7f123392, float:1.9433506E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x04a9 }
            X.AnonymousClass000.A1L(r5, r0)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r6 = r3.A1I(r6, r5)     // Catch:{ Exception -> 0x04a9 }
            r5 = 2131898939(0x7f12323b, float:1.943281E38)
            java.lang.String r5 = r3.A1H(r5)     // Catch:{ Exception -> 0x04a9 }
            r3.A0G = r5     // Catch:{ Exception -> 0x04a9 }
            r3.A00 = r0     // Catch:{ Exception -> 0x04a9 }
        L_0x01df:
            boolean r5 = r6.equals(r15)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x03b0
            if (r21 == 0) goto L_0x037c
            r6 = 2131899280(0x7f123390, float:1.9433502E38)
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1a()     // Catch:{ Exception -> 0x04a9 }
            X.AnonymousClass000.A1L(r5, r0)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r6 = r3.A1I(r6, r5)     // Catch:{ Exception -> 0x04a9 }
            X.9Nq r9 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONObject r8 = r9.A0E     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = "credType"
            org.json.JSONArray r5 = r8.getJSONArray(r5)     // Catch:{ Exception -> 0x04a9 }
            r9.A0A = r5     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r10 = "mandate"
            r9 = r10
            r8 = 0
        L_0x0205:
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04a9 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r13 = "value"
            java.lang.String r12 = "name"
            if (r8 >= r5) goto L_0x022e
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r11 = X.AnonymousClass8BV.A0t(r12, r5, r8)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = "mandateSubType"
            boolean r5 = r11.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x022b
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r9 = X.AnonymousClass8BV.A0t(r13, r5, r8)     // Catch:{ Exception -> 0x04a9 }
        L_0x022b:
            int r8 = r8 + 1
            goto L_0x0205
        L_0x022e:
            r11 = 0
        L_0x022f:
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04a9 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x04a9 }
            if (r11 >= r5) goto L_0x028d
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r8 = X.AnonymousClass8BV.A0t(r12, r5, r11)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = "payeeName"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x0256
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONObject r5 = X.AnonymousClass8BR.A1B(r5, r11)     // Catch:{ Exception -> 0x04a9 }
        L_0x0251:
            java.lang.String r15 = r5.optString(r13, r15)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x028d
        L_0x0256:
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r8 = X.AnonymousClass8BV.A0t(r12, r5, r11)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = "account"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x026f
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONObject r5 = X.AnonymousClass8BR.A1B(r5, r11)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x0251
        L_0x026f:
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A09     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r8 = X.AnonymousClass8BV.A0t(r12, r5, r11)     // Catch:{ Exception -> 0x04a9 }
            r5 = r19
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x028a
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r8 = r5.A09     // Catch:{ Exception -> 0x04a9 }
            r5 = r19
            java.lang.String r15 = X.AnonymousClass8BV.A0t(r5, r8, r11)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x028d
        L_0x028a:
            int r11 = r11 + 1
            goto L_0x022f
        L_0x028d:
            r11 = 0
        L_0x028e:
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A0A     // Catch:{ Exception -> 0x04a9 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x04a9 }
            if (r11 >= r5) goto L_0x0379
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A0A     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r8 = r5.getString(r11)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = "pay"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x036c
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A0A     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r8 = r5.getString(r11)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = "collect"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x036c
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A0A     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = r5.getString(r11)     // Catch:{ Exception -> 0x04a9 }
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x036c
            X.9Nq r5 = r3.A0H     // Catch:{ Exception -> 0x04a9 }
            org.json.JSONArray r5 = r5.A0A     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = r5.getString(r11)     // Catch:{ Exception -> 0x04a9 }
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x0363
            int r5 = r9.hashCode()     // Catch:{ Exception -> 0x04a9 }
            switch(r5) {
                case -1352294148: goto L_0x034f;
                case -1068795718: goto L_0x02eb;
                case -934343034: goto L_0x0327;
                case -690213213: goto L_0x0313;
                case -280604931: goto L_0x033b;
                case 106440182: goto L_0x02ff;
                default: goto L_0x02db;
            }     // Catch:{ Exception -> 0x04a9 }
        L_0x02db:
            r5 = 1
            r12 = 2131898942(0x7f12323e, float:1.9432816E38)
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x04a9 }
            r5 = 0
            java.lang.String r5 = X.AnonymousClass3MX.A16(r3, r15, r8, r5, r12)     // Catch:{ Exception -> 0x04a9 }
        L_0x02e6:
            r3.A0G = r5     // Catch:{ Exception -> 0x04a9 }
            int r11 = r11 + 1
            goto L_0x028e
        L_0x02eb:
            java.lang.String r5 = "modify"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x02db
            r8 = 2131898944(0x7f123240, float:1.943282E38)
            java.lang.Object[] r5 = X.AnonymousClass8BV.A1b(r15)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = r3.A1I(r8, r5)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x02e6
        L_0x02ff:
            java.lang.String r5 = "pause"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x02db
            r8 = 2131898945(0x7f123241, float:1.9432822E38)
            java.lang.Object[] r5 = X.AnonymousClass8BV.A1b(r15)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = r3.A1I(r8, r5)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x02e6
        L_0x0313:
            java.lang.String r5 = "register"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x02db
            r8 = 2131898946(0x7f123242, float:1.9432824E38)
            java.lang.Object[] r5 = X.AnonymousClass8BV.A1b(r15)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = r3.A1I(r8, r5)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x02e6
        L_0x0327:
            java.lang.String r5 = "revoke"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x02db
            r8 = 2131898947(0x7f123243, float:1.9432826E38)
            java.lang.Object[] r5 = X.AnonymousClass8BV.A1b(r15)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = r3.A1I(r8, r5)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x02e6
        L_0x033b:
            java.lang.String r5 = "unpause"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x02db
            r8 = 2131898948(0x7f123244, float:1.9432828E38)
            java.lang.Object[] r5 = X.AnonymousClass8BV.A1b(r15)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = r3.A1I(r8, r5)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x02e6
        L_0x034f:
            java.lang.String r5 = "create"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x02db
            r8 = 2131898943(0x7f12323f, float:1.9432818E38)
            java.lang.Object[] r5 = X.AnonymousClass8BV.A1b(r15)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = r3.A1I(r8, r5)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x02e6
        L_0x0363:
            r5 = 2131898939(0x7f12323b, float:1.943281E38)
            java.lang.String r5 = r3.A1H(r5)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x02e6
        L_0x036c:
            r8 = 2131898941(0x7f12323d, float:1.9432814E38)
            java.lang.Object[] r5 = X.AnonymousClass8BV.A1b(r15)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = r3.A1I(r8, r5)     // Catch:{ Exception -> 0x04a9 }
            r3.A0G = r5     // Catch:{ Exception -> 0x04a9 }
        L_0x0379:
            r3.A00 = r0     // Catch:{ Exception -> 0x04a9 }
            goto L_0x03b0
        L_0x037c:
            boolean r5 = r8.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r8 = " "
            if (r5 != 0) goto L_0x042e
            boolean r5 = r9.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x042e
            boolean r5 = r10.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x042e
            boolean r5 = r11.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x042e
            boolean r5 = r12.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x042e
            boolean r5 = r13.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x03da
            r6 = 2131899276(0x7f12338c, float:1.9433493E38)
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1a()     // Catch:{ Exception -> 0x04a9 }
            X.AnonymousClass000.A1L(r5, r0)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r6 = r3.A1I(r6, r5)     // Catch:{ Exception -> 0x04a9 }
        L_0x03b0:
            java.lang.String r8 = r3.A0G     // Catch:{ Exception -> 0x04a9 }
            java.lang.Boolean r5 = r3.A0C     // Catch:{ Exception -> 0x04a9 }
            r9 = r3
            r10 = r5
            r11 = r6
            r12 = r8
            r13 = r1
            r14 = r2
            r15 = r0
            X.8Do r5 = r9.A25(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x04a9 }
            r5.A0C = r4     // Catch:{ Exception -> 0x04a9 }
            java.util.ArrayList r0 = r3.A04     // Catch:{ Exception -> 0x04a9 }
            r0.add(r5)     // Catch:{ Exception -> 0x04a9 }
            boolean r0 = r7.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r0 == 0) goto L_0x049b
            r1 = 2131435968(0x7f0b21c0, float:1.8493793E38)
            r3.A00(r1, r2)     // Catch:{ Exception -> 0x04a9 }
            r0 = r27
            android.widget.LinearLayout r0 = X.AnonymousClass8BR.A0A(r0, r1)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x015f
        L_0x03da:
            boolean r5 = r7.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x0424
            r5 = 1
            r3.A06 = r5     // Catch:{ Exception -> 0x04a9 }
            r6 = 2131899275(0x7f12338b, float:1.9433491E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x04a9 }
            X.AnonymousClass000.A1L(r5, r0)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r6 = r3.A1I(r6, r5)     // Catch:{ Exception -> 0x04a9 }
            r5 = 2131898935(0x7f123237, float:1.9432802E38)
            java.lang.String r9 = r3.A1H(r5)     // Catch:{ Exception -> 0x04a9 }
            r3.A0G = r9     // Catch:{ Exception -> 0x04a9 }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A11(r8)     // Catch:{ Exception -> 0x04a9 }
            r5 = 2131898640(0x7f123110, float:1.9432203E38)
            java.lang.String r5 = r3.A1H(r5)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = X.AnonymousClass000.A0y(r5, r8)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = r9.concat(r5)     // Catch:{ Exception -> 0x04a9 }
            r3.A0G = r5     // Catch:{ Exception -> 0x04a9 }
            r3.A01 = r0     // Catch:{ Exception -> 0x04a9 }
            X.1FL r8 = r3.A1B()     // Catch:{ Exception -> 0x04a9 }
            boolean r5 = r8 instanceof org.npci.upi.security.pinactivitycomponent.GetCredential     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x03b0
            org.npci.upi.security.pinactivitycomponent.GetCredential r8 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r8     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = "android.permission.READ_SMS"
            int r5 = r8.checkCallingOrSelfPermission(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x03b0
            int r9 = r3.A01     // Catch:{ Exception -> 0x04a9 }
            goto L_0x0472
        L_0x0424:
            r5 = r20
            boolean r5 = r5.equals(r1)     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x03b0
            goto L_0x04ad
        L_0x042e:
            r6 = 2131899277(0x7f12338d, float:1.9433495E38)
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1a()     // Catch:{ Exception -> 0x04a9 }
            X.AnonymousClass000.A1L(r5, r0)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r6 = r3.A1I(r6, r5)     // Catch:{ Exception -> 0x04a9 }
            r5 = 2131898937(0x7f123239, float:1.9432806E38)
            java.lang.String r9 = r3.A1H(r5)     // Catch:{ Exception -> 0x04a9 }
            r3.A0G = r9     // Catch:{ Exception -> 0x04a9 }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A11(r8)     // Catch:{ Exception -> 0x04a9 }
            r5 = 2131898723(0x7f123163, float:1.9432372E38)
            java.lang.String r5 = r3.A1H(r5)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = X.AnonymousClass000.A0y(r5, r8)     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = r9.concat(r5)     // Catch:{ Exception -> 0x04a9 }
            r3.A0G = r5     // Catch:{ Exception -> 0x04a9 }
            r3.A00 = r2     // Catch:{ Exception -> 0x04a9 }
            r3.A01 = r0     // Catch:{ Exception -> 0x04a9 }
            X.1FL r8 = r3.A1B()     // Catch:{ Exception -> 0x04a9 }
            boolean r5 = r8 instanceof org.npci.upi.security.pinactivitycomponent.GetCredential     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x03b0
            org.npci.upi.security.pinactivitycomponent.GetCredential r8 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r8     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r5 = "android.permission.READ_SMS"
            int r5 = r8.checkCallingOrSelfPermission(r5)     // Catch:{ Exception -> 0x04a9 }
            if (r5 != 0) goto L_0x03b0
            int r9 = r3.A01     // Catch:{ Exception -> 0x04a9 }
        L_0x0472:
            X.1FL r8 = r3.A1B()     // Catch:{ Exception -> 0x04a9 }
            if (r8 == 0) goto L_0x0481
            boolean r5 = r8 instanceof org.npci.upi.security.pinactivitycomponent.GetCredential     // Catch:{ Exception -> 0x04a9 }
            if (r5 == 0) goto L_0x0481
            r5 = r8
            org.npci.upi.security.pinactivitycomponent.GetCredential r5 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r5     // Catch:{ Exception -> 0x04a9 }
            r5.A01 = r9     // Catch:{ Exception -> 0x04a9 }
        L_0x0481:
            org.npci.upi.security.pinactivitycomponent.u r5 = new org.npci.upi.security.pinactivitycomponent.u     // Catch:{ Exception -> 0x04a9 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x04a9 }
            java.util.Timer r10 = new java.util.Timer     // Catch:{ Exception -> 0x04a9 }
            r10.<init>()     // Catch:{ Exception -> 0x04a9 }
            r3.A05 = r10     // Catch:{ Exception -> 0x04a9 }
            X.Amt r11 = new X.Amt     // Catch:{ Exception -> 0x04a9 }
            r11.<init>(r3, r5, r9)     // Catch:{ Exception -> 0x04a9 }
            r12 = 100
            r14 = 2000(0x7d0, double:9.88E-321)
            r10.scheduleAtFixedRate(r11, r12, r14)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x03b0
        L_0x049b:
            r1 = 2131435966(0x7f0b21be, float:1.849379E38)
            r3.A00(r1, r2)     // Catch:{ Exception -> 0x04a9 }
            r0 = r27
            android.widget.LinearLayout r0 = X.AnonymousClass8BR.A0A(r0, r1)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x015f
        L_0x04a9:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x04ad:
            r1 = 1
            java.lang.Boolean r0 = r3.A0D
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04cd
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A0E = r0
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r3.A0D = r0
            android.widget.ViewFlipper r0 = r3.A09
            r0.showNext()
            int r0 = r3.A03
            int r0 = r0 + 1
            r3.A03 = r0
        L_0x04cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.w.A01(android.view.View, java.lang.Integer, org.npci.upi.security.pinactivitycomponent.w):void");
    }

    public static void A02(w wVar, int i) {
        String str;
        w wVar2 = wVar;
        int i2 = wVar2.A00;
        if (i2 != -1) {
            ArrayList arrayList = wVar2.A04;
            if (wVar2.A06) {
                i2--;
            }
            if (arrayList.get(i2) instanceof AnonymousClass8Do) {
                AnonymousClass8Do A1C = AnonymousClass8BR.A1C(arrayList, i2);
                wVar2.A28(A1C);
                A1C.A0I = true;
                try {
                    str = new C192349oE(wVar2.A02).A01.getString("otp_type_bank", "");
                } catch (Exception unused) {
                    str = null;
                }
                if (!str.isEmpty()) {
                    C17890vO.A0D().postDelayed(new C21429Ajw(wVar2, 25), 1500);
                }
            }
        }
        ArrayList arrayList2 = wVar2.A04;
        int size = arrayList2.size();
        for (int i3 = i; i3 < size; i3++) {
            boolean z = wVar2.A06;
            int i4 = wVar2.A00;
            int i5 = i4;
            if (z) {
                i4--;
            }
            if (i3 != i4) {
                if (i5 != -1 && (arrayList2.get(i3) instanceof AnonymousClass8Do)) {
                    BDB bdb = (BDB) arrayList2.get(i3);
                    if (!(bdb instanceof AnonymousClass8Do) || !((AnonymousClass8Do) bdb).A0F.equals("SMS") || !wVar2.A06) {
                        BDB bdb2 = (BDB) arrayList2.get(i3);
                        if ((bdb2 instanceof AnonymousClass8Do) && ((AnonymousClass8Do) bdb2).A0F.equals("AADHAAR")) {
                        }
                    }
                }
                BDB bdb3 = (BDB) arrayList2.get(i3);
                Drawable A002 = C24261Jm.A00(wVar2.A1B(), 2131232418);
                Drawable A003 = C24261Jm.A00(wVar2.A1B(), 2131232415);
                Drawable A004 = C24261Jm.A00(wVar2.A1B(), 2131232416);
                String A1H = wVar2.A1H(2131898675);
                String A1H2 = wVar2.A1H(2131898681);
                bdb3.BAJ(A003, new AFL(bdb3, A004, A002, wVar2, A1H, A1H2, 1), A1H2, false, false);
            }
        }
    }

    private void A00(int i, int i2) {
        LinearLayout.LayoutParams A0R = C72463Mc.A0R();
        LinearLayout linearLayout = new LinearLayout(A1B());
        linearLayout.setLayoutParams(A0R);
        linearLayout.setDividerDrawable(AnonymousClass3MZ.A09(this).getDrawable(2131231515));
        linearLayout.setPadding(16, 0, 16, 0);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setId(i);
        this.A09.addView(linearLayout, i2);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625384);
    }
}
