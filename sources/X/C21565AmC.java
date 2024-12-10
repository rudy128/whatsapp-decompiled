package X;

import java.util.AbstractList;
import org.npci.upi.security.pinactivitycomponent.GetCredential;

/* renamed from: X.AmC  reason: case insensitive filesystem */
public class C21565AmC implements C1604288l {
    public final /* synthetic */ GetCredential A00;

    public C21565AmC(GetCredential getCredential) {
        this.A00 = getCredential;
    }

    /* JADX WARNING: type inference failed for: r0v41, types: [X.9js, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023f, code lost:
        if (X.AnonymousClass8BR.A1C(r2, r4).A00 != A00(r2, r4)) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0259, code lost:
        if (r0 == false) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f0, code lost:
        if (X.AnonymousClass8BR.A1C(r4, r2).A00 != A00(r4, r2)) goto L_0x00f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BAK(int r20) {
        /*
            r19 = this;
            r0 = r19
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = r0.A00
            r7 = 0
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r2 = r20
            r0.<init>(r7, r2)
            r1.dispatchKeyEvent(r0)
            r0 = 66
            if (r2 != r0) goto L_0x03a8
            org.npci.upi.security.pinactivitycomponent.s r12 = r1.A0F
            if (r12 == 0) goto L_0x0445
            org.npci.upi.security.pinactivitycomponent.w r12 = (org.npci.upi.security.pinactivitycomponent.w) r12
            android.content.Context r0 = r12.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.9Nq r0 = r0.A0D
            boolean r0 = r0.A00()
            r3 = 1
            if (r0 == 0) goto L_0x007e
            java.util.ArrayList r2 = r12.A04
            int r0 = r2.size()
            java.lang.String r5 = "AADHAAR"
            if (r0 != r3) goto L_0x0168
            int r0 = r12.A03
            java.lang.Object r0 = r2.get(r0)
            X.BDB r0 = (X.BDB) r0
            boolean r0 = r0.BAI()
            if (r0 == 0) goto L_0x03f6
            int r0 = r12.A01     // Catch:{ Exception -> 0x0445 }
            if (r0 >= 0) goto L_0x0063
            int r0 = r12.A03     // Catch:{ Exception -> 0x0445 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ Exception -> 0x0445 }
            X.BDB r2 = (X.BDB) r2     // Catch:{ Exception -> 0x0445 }
            r0 = r2
            X.8Do r0 = (X.AnonymousClass8Do) r0     // Catch:{ Exception -> 0x0445 }
            java.lang.String r0 = r0.A0F     // Catch:{ Exception -> 0x0445 }
            boolean r1 = r0.equals(r5)     // Catch:{ Exception -> 0x0445 }
            r0 = 2131898724(0x7f123164, float:1.9432374E38)
            if (r1 == 0) goto L_0x005b
            r0 = 2131898641(0x7f123111, float:1.9432205E38)
        L_0x005b:
            java.lang.String r0 = r12.A1H(r0)     // Catch:{ Exception -> 0x0445 }
            r2.BAH(r0)     // Catch:{ Exception -> 0x0445 }
            return
        L_0x0063:
            java.lang.Boolean r0 = r12.A0E     // Catch:{ Exception -> 0x0445 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0445 }
            if (r0 != 0) goto L_0x0445
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0445 }
            r12.A0D = r0     // Catch:{ Exception -> 0x0445 }
            android.view.View r1 = r12.A04     // Catch:{ Exception -> 0x0445 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0445 }
            org.npci.upi.security.pinactivitycomponent.w.A01(r1, r0, r12)     // Catch:{ Exception -> 0x0445 }
            org.npci.upi.security.pinactivitycomponent.w.A02(r12, r3)     // Catch:{ Exception -> 0x0445 }
            return
        L_0x007e:
            java.util.ArrayList r4 = r12.A04
            int r0 = r4.size()
            boolean r2 = X.AnonymousClass000.A1T(r0, r3)
            X.9Nq r0 = r12.A0H
            org.json.JSONArray r0 = r0.A08
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "SIGNATURE"
            boolean r0 = r1.contains(r0)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00c9
            int r2 = r12.A03
            X.8Do r0 = X.AnonymousClass8BR.A1C(r4, r2)
            int r1 = r0.A00
            int r0 = A00(r4, r2)
            if (r1 != r0) goto L_0x00f2
            int r0 = r12.A03
            java.lang.Object r0 = r4.get(r0)
            X.BDB r0 = (X.BDB) r0
            boolean r0 = r0.BAI()
            if (r0 == 0) goto L_0x0445
            android.content.Context r0 = r12.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.A7M r1 = r0.A0E
            java.lang.Object r0 = r4.get(r7)
            X.BDB r0 = (X.BDB) r0
            java.lang.String r0 = r0.getInputValue()
            r1.A05(r0)
            return
        L_0x00c9:
            int r0 = r4.size()
            int r2 = r12.A03
            if (r0 != r3) goto L_0x00e4
            X.8Do r0 = X.AnonymousClass8BR.A1C(r4, r2)
            int r1 = r0.A00
            int r0 = A00(r4, r2)
            if (r1 != r0) goto L_0x00f2
            int r0 = r12.A03
            java.lang.Object r0 = r4.get(r0)
            goto L_0x0105
        L_0x00e4:
            if (r2 != 0) goto L_0x00f8
            X.8Do r0 = X.AnonymousClass8BR.A1C(r4, r2)
            int r1 = r0.A00
            int r0 = A00(r4, r2)
            if (r1 == r0) goto L_0x0268
        L_0x00f2:
            int r0 = r12.A03
            r4.get(r0)
            goto L_0x015d
        L_0x00f8:
            if (r2 != r3) goto L_0x0445
            java.lang.Object r0 = r4.get(r2)
            goto L_0x0105
        L_0x00ff:
            if (r4 != r6) goto L_0x0445
        L_0x0101:
            java.lang.Object r0 = r2.get(r4)
        L_0x0105:
            X.BDB r0 = (X.BDB) r0
            boolean r0 = r0.BAI()
            if (r0 == 0) goto L_0x0445
            int r2 = r12.A00
            r0 = -1
            if (r2 == r0) goto L_0x013c
            java.util.ArrayList r1 = r12.A04
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x011a
            int r2 = r2 + -1
        L_0x011a:
            java.lang.Object r0 = r1.get(r2)
            boolean r0 = r0 instanceof X.AnonymousClass8Do
            if (r0 == 0) goto L_0x013c
            X.8Do r2 = X.AnonymousClass8BR.A1C(r1, r2)
            java.lang.String r0 = r2.getInputValue()
            if (r0 == 0) goto L_0x0134
            int r1 = r0.length()
            int r0 = r2.A00
            if (r1 == r0) goto L_0x013c
        L_0x0134:
            r0 = 2131899097(0x7f1232d9, float:1.943313E38)
            java.lang.String r0 = r12.A1H(r0)
            goto L_0x019e
        L_0x013c:
            r4 = 0
        L_0x013d:
            java.util.ArrayList r6 = r12.A04
            int r0 = r6.size()
            if (r4 >= r0) goto L_0x0274
            java.lang.Object r0 = r6.get(r4)
            boolean r0 = r0 instanceof X.AnonymousClass8Do
            if (r0 == 0) goto L_0x0165
            X.8Do r2 = X.AnonymousClass8BR.A1C(r6, r4)
            java.lang.String r0 = r2.getInputValue()
            int r1 = r0.length()
            int r0 = r2.A00
            if (r1 == r0) goto L_0x0165
        L_0x015d:
            r2 = 2131898963(0x7f123253, float:1.9432859E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r0 = r12.A00
            goto L_0x0197
        L_0x0165:
            int r4 = r4 + 1
            goto L_0x013d
        L_0x0168:
            int r4 = r2.size()
            r0 = 4
            r6 = 3
            r1 = 2
            if (r4 != r0) goto L_0x01a2
            int r4 = r12.A03
            if (r4 == r3) goto L_0x021b
            if (r4 != r1) goto L_0x00ff
            java.lang.Boolean r0 = r12.A0F
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0445
        L_0x017f:
            X.8Do r0 = X.AnonymousClass8BR.A1C(r2, r4)
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 == r0) goto L_0x0268
            int r0 = r12.A03
            r2.get(r0)
            r2 = 2131898958(0x7f12324e, float:1.9432848E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r0 = r12.A02
        L_0x0197:
            X.C17880vN.A1T(r1, r0, r7)
            java.lang.String r0 = r12.A1I(r2, r1)
        L_0x019e:
            r12.A26(r0)
            return
        L_0x01a2:
            int r0 = r2.size()
            if (r0 != r6) goto L_0x020d
            int r4 = r12.A03
            if (r4 != 0) goto L_0x01e3
            X.8Do r0 = X.AnonymousClass8BR.A1C(r2, r4)
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 != r0) goto L_0x0247
            android.widget.ViewFlipper r1 = r12.A09
            int r0 = r12.A03
            int r0 = r0 + 1
            r1.setDisplayedChild(r0)
            int r0 = r12.A03
            int r0 = r0 + 1
            r12.A03 = r0
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x0445
            r12.A07 = r7
            android.content.Context r0 = r12.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.9Nq r0 = r0.A0D
            int r0 = r0.A00
            r12.A01 = r0
            int r0 = r12.A00
            X.8Do r0 = X.AnonymousClass8BR.A1C(r2, r0)
            r12.A28(r0)
            r0.A0I = r3
            return
        L_0x01e3:
            if (r4 != r3) goto L_0x0264
            java.lang.Boolean r0 = r12.A0F
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x017f
            boolean r1 = r12.A06
            java.lang.Object r0 = r2.get(r4)
            if (r1 == 0) goto L_0x0231
            X.8Do r0 = (X.AnonymousClass8Do) r0
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 != r0) goto L_0x0247
            android.widget.ViewFlipper r0 = r12.A09
            r0.showNext()
            int r0 = r12.A03
            int r0 = r0 + 1
            r12.A03 = r0
            r12.A06 = r7
            return
        L_0x020d:
            int r0 = r2.size()
            if (r0 != r1) goto L_0x007e
            int r4 = r12.A03
            if (r4 == 0) goto L_0x021b
            if (r4 != r3) goto L_0x0445
            goto L_0x0101
        L_0x021b:
            X.8Do r0 = X.AnonymousClass8BR.A1C(r2, r4)
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 != r0) goto L_0x0241
            android.widget.ViewFlipper r1 = r12.A09
            int r0 = r12.A03
            int r0 = r0 + 1
            r1.setDisplayedChild(r0)
            goto L_0x026d
        L_0x0231:
            boolean r0 = r0 instanceof X.AnonymousClass8Do
            if (r0 == 0) goto L_0x0268
            X.8Do r0 = X.AnonymousClass8BR.A1C(r2, r4)
            int r1 = r0.A00
            int r0 = A00(r2, r4)
            if (r1 == r0) goto L_0x0268
        L_0x0241:
            int r0 = r12.A03
            r2.get(r0)
            goto L_0x025b
        L_0x0247:
            int r0 = r12.A03
            r2.get(r0)
            X.8Do r0 = X.AnonymousClass8BR.A1C(r2, r0)
            java.lang.String r0 = r0.A0F
            boolean r0 = r0.equals(r5)
            r2 = 2131898957(0x7f12324d, float:1.9432846E38)
            if (r0 != 0) goto L_0x025e
        L_0x025b:
            r2 = 2131898959(0x7f12324f, float:1.943285E38)
        L_0x025e:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r0 = r12.A01
            goto L_0x0197
        L_0x0264:
            if (r4 != r1) goto L_0x0445
            goto L_0x0101
        L_0x0268:
            android.widget.ViewFlipper r0 = r12.A09
            r0.showNext()
        L_0x026d:
            int r0 = r12.A03
            int r0 = r0 + 1
            r12.A03 = r0
            return
        L_0x0274:
            boolean r0 = r12.A0I
            if (r0 != 0) goto L_0x0445
            r12.A0I = r3
            r5 = 0
        L_0x027b:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x0340
            java.lang.Object r0 = r6.get(r5)     // Catch:{ Exception -> 0x033c }
            X.BDB r0 = (X.BDB) r0     // Catch:{ Exception -> 0x033c }
            java.lang.Object r1 = r0.getFormDataTag()     // Catch:{ Exception -> 0x033c }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ Exception -> 0x033c }
            java.lang.String r0 = "type"
            java.lang.String r16 = r1.getString(r0)     // Catch:{ Exception -> 0x033c }
            java.lang.String r0 = "subtype"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ Exception -> 0x033c }
            X.9Nq r0 = r12.A0H     // Catch:{ Exception -> 0x033c }
            org.json.JSONObject r2 = r0.A0E     // Catch:{ Exception -> 0x033c }
            java.lang.String r1 = "credential"
            java.lang.Object r0 = r6.get(r5)     // Catch:{ Exception -> 0x033c }
            X.BDB r0 = (X.BDB) r0     // Catch:{ Exception -> 0x033c }
            java.lang.String r0 = r0.getInputValue()     // Catch:{ Exception -> 0x033c }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x033c }
            X.9Nq r0 = r12.A0H     // Catch:{ Exception -> 0x033c }
            org.json.JSONObject r9 = r0.A0E     // Catch:{ Exception -> 0x033c }
            org.json.JSONArray r8 = X.AnonymousClass8BR.A1A()     // Catch:{ Exception -> 0x033c }
            r2 = 0
        L_0x02b5:
            X.9Nq r0 = r12.A0H     // Catch:{ Exception -> 0x033c }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ Exception -> 0x033c }
            int r0 = r0.length()     // Catch:{ Exception -> 0x033c }
            if (r2 >= r0) goto L_0x032b
            java.lang.String r1 = "txnId"
            X.9Nq r0 = r12.A0H     // Catch:{ Exception -> 0x033c }
            org.json.JSONArray r0 = r0.A0B     // Catch:{ Exception -> 0x033c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x033c }
            r9.put(r1, r0)     // Catch:{ Exception -> 0x033c }
            java.lang.String r1 = "credType"
            X.9Nq r0 = r12.A0H     // Catch:{ Exception -> 0x033c }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ Exception -> 0x033c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x033c }
            r9.put(r1, r0)     // Catch:{ Exception -> 0x033c }
            android.content.Context r0 = r12.A02     // Catch:{ Exception -> 0x033c }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x033c }
            X.9Nq r0 = r0.A0D     // Catch:{ Exception -> 0x033c }
            X.9Nz r0 = r0.A0G     // Catch:{ Exception -> 0x033c }
            X.9Nl r0 = r0.A0A     // Catch:{ Exception -> 0x033c }
            java.lang.String r0 = r0.A00(r9)     // Catch:{ Exception -> 0x033c }
            r8.put(r0)     // Catch:{ Exception -> 0x033c }
            android.content.Context r0 = r12.A02     // Catch:{ Exception -> 0x033c }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x033c }
            X.9Nq r0 = r0.A0D     // Catch:{ Exception -> 0x033c }
            X.9Nz r0 = r0.A0G     // Catch:{ Exception -> 0x033c }
            X.9Ny r13 = r0.A01()     // Catch:{ Exception -> 0x033c }
            java.lang.String r15 = r8.getString(r2)     // Catch:{ Exception -> 0x033c }
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x033c }
            r18 = r9
            r17 = r4
            X.AiM r0 = r13.A00(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x033c }
            r12.A0A = r0     // Catch:{ Exception -> 0x033c }
            if (r0 == 0) goto L_0x0328
            android.content.Context r0 = r12.A02     // Catch:{ Exception -> 0x033c }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x033c }
            X.9Nq r11 = r0.A0D     // Catch:{ Exception -> 0x033c }
            X.9Nq r0 = r12.A0H     // Catch:{ Exception -> 0x033c }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ Exception -> 0x033c }
            java.lang.String r10 = r0.getString(r2)     // Catch:{ Exception -> 0x033c }
            X.AiM r1 = r12.A0A     // Catch:{ Exception -> 0x033c }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x033c }
            X.C181919Si.A00(r1, r0)     // Catch:{ Exception -> 0x033c }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x033c }
            org.json.JSONObject r0 = r11.A0F     // Catch:{ Exception -> 0x033c }
            r0.put(r10, r1)     // Catch:{ Exception -> 0x033c }
        L_0x0328:
            int r2 = r2 + 1
            goto L_0x02b5
        L_0x032b:
            android.content.Context r0 = r12.A02     // Catch:{ Exception -> 0x033c }
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0     // Catch:{ Exception -> 0x033c }
            X.9Nq r2 = r0.A0D     // Catch:{ Exception -> 0x033c }
            org.json.JSONObject r0 = r2.A0F     // Catch:{ Exception -> 0x033c }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x033c }
            java.util.HashMap r0 = r2.A07     // Catch:{ Exception -> 0x033c }
            r0.put(r4, r1)     // Catch:{ Exception -> 0x033c }
        L_0x033c:
            int r5 = r5 + 1
            goto L_0x027b
        L_0x0340:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            X.9Nq r0 = r12.A0H
            org.json.JSONObject r2 = r0.A0C
            if (r2 == 0) goto L_0x0356
            java.lang.String r1 = "getDeviceDetails"
            java.lang.String r0 = "false"
            java.lang.String r0 = r2.optString(r1, r0)
            java.lang.Boolean r1 = X.AnonymousClass8BU.A0g(r0)
        L_0x0356:
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x038a
            android.content.Context r1 = r12.A02
            X.9js r0 = new X.9js
            r0.<init>()
            r0.A00 = r1
            java.lang.String r2 = r0.A01()
            X.9Nq r0 = r12.A0H
            org.json.JSONObject r1 = r0.A0E
            android.content.Context r0 = r12.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.9Nq r0 = r0.A0D
            X.9Nz r0 = r0.A0G
            X.9Ny r0 = r0.A01()
            java.lang.String r2 = r0.A01(r2, r1)
            android.content.Context r0 = r12.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.9Nq r0 = r0.A0D
            java.lang.String r1 = "det"
            java.util.HashMap r0 = r0.A07
            r0.put(r1, r2)
        L_0x038a:
            android.os.Bundle r2 = X.C17880vN.A0D()
            android.content.Context r0 = r12.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.9Nq r0 = r0.A0D
            java.util.HashMap r1 = r0.A07
            java.lang.String r0 = "credBlocks"
            r2.putSerializable(r0, r1)
            android.os.ResultReceiver r0 = X.C188559hc.A0B
            r0.send(r3, r2)
            X.1FL r0 = r12.A1B()
            r0.finish()
            return
        L_0x03a8:
            r0 = 67
            if (r2 != r0) goto L_0x0445
            org.npci.upi.security.pinactivitycomponent.s r3 = r1.A0F
            org.npci.upi.security.pinactivitycomponent.w r3 = (org.npci.upi.security.pinactivitycomponent.w) r3
            java.lang.Boolean r0 = r3.A0B
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0445
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r3.A0B = r0
            X.1FL r2 = r3.A1B()
            r1 = 24
            X.Ajw r0 = new X.Ajw
            r0.<init>(r3, r1)
            r2.runOnUiThread(r0)
            java.util.ArrayList r2 = r3.A04
            boolean r1 = r3.A06
            int r0 = r3.A00
            if (r1 == 0) goto L_0x03d6
            int r0 = r0 + -1
        L_0x03d6:
            int r0 = X.AnonymousClass8BY.A04(r2, r3, r0)
            X.8Do r2 = X.AnonymousClass8BR.A1C(r2, r0)
            X.1FL r1 = r3.A1B()
            r0 = 2131232353(0x7f080661, float:1.8080813E38)
            android.graphics.drawable.Drawable r1 = X.C24261Jm.A00(r1, r0)
            if (r1 == 0) goto L_0x03f0
            android.widget.ImageView r0 = r2.A05
            r0.setImageDrawable(r1)
        L_0x03f0:
            android.widget.ImageView r0 = r2.A05
            r2.A00(r0, r7)
            return
        L_0x03f6:
            int r0 = r12.A03
            java.lang.Object r9 = r2.get(r0)
            X.BDB r9 = (X.BDB) r9
            X.1FL r1 = r12.A1B()
            r0 = 2131231877(0x7f080485, float:1.8079847E38)
            android.graphics.drawable.Drawable r3 = X.C24261Jm.A00(r1, r0)
            X.1FL r1 = r12.A1B()
            r0 = 2131231133(0x7f08019d, float:1.8078338E38)
            android.graphics.drawable.Drawable r11 = X.C24261Jm.A00(r1, r0)
            X.1FL r1 = r12.A1B()
            r0 = 2131231134(0x7f08019e, float:1.807834E38)
            android.graphics.drawable.Drawable r10 = X.C24261Jm.A00(r1, r0)
            X.1FL r2 = r12.A1B()
            android.content.Context r0 = r12.A02
            X.8Do r1 = new X.8Do
            r1.<init>(r2, r0)
            r13 = 29
            X.78E r8 = new X.78E
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = 2131898931(0x7f123233, float:1.9432794E38)
            java.lang.String r4 = r12.A1H(r0)
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x0446
            r10 = r3
        L_0x043d:
            r5 = 1
            r1 = r9
            r2 = r10
            r3 = r8
            r6 = r5
            r1.BAJ(r2, r3, r4, r5, r6)
        L_0x0445:
            return
        L_0x0446:
            boolean r0 = r9.getToggleCheckBox()
            if (r0 != 0) goto L_0x043d
            r10 = r11
            goto L_0x043d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21565AmC.BAK(int):void");
    }

    public static int A00(AbstractList abstractList, int i) {
        return ((BDB) abstractList.get(i)).getInputValue().length();
    }
}
