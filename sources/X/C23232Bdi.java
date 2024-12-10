package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.Bdi  reason: case insensitive filesystem */
public class C23232Bdi extends C23025Ba1 {
    public static final Parcelable.Creator CREATOR = new Object();
    public ResultReceiver A00;
    public final C24366C0b A01;
    public final C23169BcP A02;
    public final C23173BcT A03;
    public final C23153Bc9 A04;
    public final C23158BcE A05;
    public final C23129Bbi A06;
    public final Double A07;
    public final Integer A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final byte[] A0C;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: X.Ba3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: X.Ba3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: X.Ba3} */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.CXT, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C23232Bdi A00(org.json.JSONObject r29) {
        /*
            X.CXT r5 = new X.CXT
            r5.<init>()
            java.lang.String r0 = "rp"
            r6 = r29
            org.json.JSONObject r1 = r6.getJSONObject(r0)
            java.lang.String r13 = "id"
            java.lang.String r4 = r1.getString(r13)
            java.lang.String r3 = "name"
            java.lang.String r2 = r1.getString(r3)
            java.lang.String r8 = "icon"
            boolean r0 = r1.has(r8)
            r7 = 0
            if (r0 == 0) goto L_0x00ab
            java.lang.String r1 = r1.optString(r8)
        L_0x0026:
            X.Bc9 r0 = new X.Bc9
            r0.<init>(r4, r2, r1)
            r5.A03 = r0
            java.lang.String r0 = "user"
            org.json.JSONObject r1 = r6.getJSONObject(r0)
            java.lang.String r0 = r1.getString(r13)
            if (r0 != 0) goto L_0x00a6
            r4 = 0
        L_0x003a:
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r0 = "displayName"
            java.lang.String r2 = r1.optString(r0)
            boolean r0 = r1.has(r8)
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = r1.optString(r8)
        L_0x004e:
            X.BcE r0 = new X.BcE
            r0.<init>(r3, r1, r2, r4)
            r5.A04 = r0
            java.lang.String r0 = "challenge"
            java.lang.String r1 = r6.getString(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0062
            byte[] r0 = X.BE7.A1a(r1)
        L_0x0062:
            X.C18210vx.A00(r0)
            r5.A08 = r0
            java.lang.String r0 = "pubKeyCredParams"
            org.json.JSONArray r8 = r6.getJSONArray(r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r12 = 0
            r3 = 0
        L_0x0073:
            int r0 = r8.length()
            if (r3 >= r0) goto L_0x00ae
            org.json.JSONObject r1 = r8.getJSONObject(r3)
            java.lang.String r0 = "type"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ IllegalArgumentException -> 0x0094 }
            java.lang.String r0 = "alg"
            int r1 = r1.getInt(r0)     // Catch:{ IllegalArgumentException -> 0x0094 }
            X.Bc3 r0 = new X.Bc3     // Catch:{ IllegalArgumentException -> 0x0094 }
            r0.<init>(r2, r1)     // Catch:{ IllegalArgumentException -> 0x0094 }
            X.BfO r1 = new X.BfO     // Catch:{ IllegalArgumentException -> 0x0094 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0094 }
            goto L_0x0096
        L_0x0094:
            X.BfP r1 = X.C23337BfP.A00
        L_0x0096:
            boolean r0 = r1 instanceof X.C23336BfO
            if (r0 == 0) goto L_0x00a1
            X.BfO r1 = (X.C23336BfO) r1
            java.lang.Object r0 = r1.zza
            r4.add(r0)
        L_0x00a1:
            int r3 = r3 + 1
            goto L_0x0073
        L_0x00a4:
            r1 = r7
            goto L_0x004e
        L_0x00a6:
            byte[] r4 = X.BE7.A1a(r0)
            goto L_0x003a
        L_0x00ab:
            r1 = r7
            goto L_0x0026
        L_0x00ae:
            r5.A06 = r4
            java.lang.String r1 = "timeout"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x00c8
            double r2 = r6.getDouble(r1)
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r5.A05 = r0
        L_0x00c8:
            java.lang.String r1 = "excludeCredentials"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x0147
            org.json.JSONArray r11 = r6.getJSONArray(r1)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
        L_0x00d8:
            int r0 = r11.length()
            if (r12 >= r0) goto L_0x0145
            org.json.JSONObject r2 = r11.getJSONObject(r12)
            android.os.Parcelable$Creator r0 = X.C23157BcD.CREATOR
            java.lang.String r0 = "type"
            java.lang.String r9 = r2.getString(r0)
            java.lang.String r0 = r2.getString(r13)
            byte[] r8 = X.BE7.A1a(r0)
            java.lang.String r1 = "transports"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x0143
            org.json.JSONArray r4 = r2.getJSONArray(r1)
            if (r4 != 0) goto L_0x010c
            r1 = 0
        L_0x0101:
            X.BcD r0 = new X.BcD
            r0.<init>(r9, r1, r8)
            r10.add(r0)
            int r12 = r12 + 1
            goto L_0x00d8
        L_0x010c:
            int r0 = r4.length()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r0)
            r2 = 0
        L_0x0116:
            int r0 = r4.length()
            if (r2 >= r0) goto L_0x013e
            java.lang.String r1 = r4.getString(r2)
            if (r1 == 0) goto L_0x013b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x013b
            com.google.android.gms.fido.common.Transport r0 = com.google.android.gms.fido.common.Transport.A00(r1)     // Catch:{ C1V -> 0x0130 }
            r3.add(r0)     // Catch:{ C1V -> 0x0130 }
            goto L_0x013b
        L_0x0130:
            java.lang.String r0 = "Ignoring unrecognized transport "
            java.lang.String r1 = r0.concat(r1)
            java.lang.String r0 = "Transport"
            android.util.Log.w(r0, r1)
        L_0x013b:
            int r2 = r2 + 1
            goto L_0x0116
        L_0x013e:
            java.util.ArrayList r1 = X.C17880vN.A10(r3)
            goto L_0x0101
        L_0x0143:
            r1 = 0
            goto L_0x0101
        L_0x0145:
            r5.A07 = r10
        L_0x0147:
            java.lang.String r1 = "authenticatorSelection"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x018e
            org.json.JSONObject r8 = r6.getJSONObject(r1)
            java.lang.String r1 = "authenticatorAttachment"
            boolean r0 = r8.has(r1)
            if (r0 == 0) goto L_0x024d
            java.lang.String r4 = r8.optString(r1)
        L_0x015f:
            java.lang.String r1 = "residentKey"
            boolean r0 = r8.has(r1)
            if (r0 == 0) goto L_0x024a
            java.lang.String r3 = r8.optString(r1)
        L_0x016b:
            java.lang.String r1 = "requireResidentKey"
            boolean r0 = r8.has(r1)
            if (r0 == 0) goto L_0x0247
            boolean r0 = r8.optBoolean(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x017b:
            java.lang.String r1 = "userVerification"
            boolean r0 = r8.has(r1)
            if (r0 == 0) goto L_0x0187
            java.lang.String r7 = r8.optString(r1)
        L_0x0187:
            X.BcT r0 = new X.BcT
            r0.<init>(r2, r4, r7, r3)
            r5.A02 = r0
        L_0x018e:
            java.lang.String r1 = "extensions"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x0325
            org.json.JSONObject r4 = r6.getJSONObject(r1)
            r3 = 0
            r15 = 0
            r8 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r23 = 0
            r10 = 0
            r9 = 0
            r20 = 0
            r2 = 0
            r19 = 0
            java.lang.String r0 = "fidoAppIdExtension"
            boolean r7 = r4.has(r0)
            java.lang.String r1 = "appid"
            if (r7 == 0) goto L_0x01c0
            org.json.JSONObject r0 = r4.getJSONObject(r0)
            java.lang.String r0 = r0.getString(r1)
            X.Bbx r3 = new X.Bbx
            r3.<init>(r0)
        L_0x01c0:
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x01cf
            java.lang.String r0 = r4.getString(r1)
            X.Bbx r3 = new X.Bbx
            r3.<init>(r0)
        L_0x01cf:
            java.lang.String r1 = "prf"
            boolean r11 = r4.has(r1)
            r7 = 0
            java.lang.String r0 = "prfAlreadyHashed"
            if (r11 == 0) goto L_0x0237
            boolean r0 = r4.has(r0)
            if (r0 != 0) goto L_0x0250
            org.json.JSONObject r0 = r4.getJSONObject(r1)
            X.Bd0 r20 = X.C23206Bd0.A00(r0, r7)
        L_0x01e8:
            java.lang.String r0 = "cableAuthenticationExtension"
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto L_0x025d
            org.json.JSONArray r16 = r4.getJSONArray(r0)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
        L_0x01f8:
            int r0 = r16.length()
            if (r7 >= r0) goto L_0x0258
            r0 = r16
            org.json.JSONObject r8 = r0.getJSONObject(r7)
            java.lang.String r0 = "version"
            long r28 = r8.getLong(r0)
            java.lang.String r0 = "clientEid"
            java.lang.String r11 = r8.getString(r0)
            r0 = 11
            byte[] r25 = android.util.Base64.decode(r11, r0)
            java.lang.String r11 = "authenticatorEid"
            java.lang.String r11 = r8.getString(r11)
            byte[] r26 = android.util.Base64.decode(r11, r0)
            java.lang.String r11 = "sessionPreKey"
            java.lang.String r8 = r8.getString(r11)
            byte[] r27 = android.util.Base64.decode(r8, r0)
            X.Bbm r0 = new X.Bbm
            r24 = r0
            r24.<init>(r25, r26, r27, r28)
            r1.add(r0)
            int r7 = r7 + 1
            goto L_0x01f8
        L_0x0237:
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto L_0x01e8
            org.json.JSONObject r1 = r4.getJSONObject(r0)
            r0 = 1
            X.Bd0 r20 = X.C23206Bd0.A00(r1, r0)
            goto L_0x01e8
        L_0x0247:
            r2 = r7
            goto L_0x017b
        L_0x024a:
            r3 = r7
            goto L_0x016b
        L_0x024d:
            r4 = r7
            goto L_0x015f
        L_0x0250:
            java.lang.String r1 = "both prf and prfAlreadyHashed extensions found"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x0258:
            X.Bbb r8 = new X.Bbb
            r8.<init>(r1)
        L_0x025d:
            java.lang.String r0 = "userVerificationMethodExtension"
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto L_0x0274
            org.json.JSONObject r1 = r4.getJSONObject(r0)
            java.lang.String r0 = "uvm"
            boolean r0 = r1.getBoolean(r0)
            X.BbV r15 = new X.BbV
            r15.<init>(r0)
        L_0x0274:
            java.lang.String r0 = "google_multiAssertionExtension"
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto L_0x028b
            org.json.JSONObject r1 = r4.getJSONObject(r0)
            java.lang.String r0 = "requestForMultiAssertion"
            boolean r0 = r1.getBoolean(r0)
            X.Bbc r14 = new X.Bbc
            r14.<init>(r0)
        L_0x028b:
            java.lang.String r0 = "google_sessionIdExtension"
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto L_0x02a3
            org.json.JSONObject r1 = r4.getJSONObject(r0)
            java.lang.String r0 = "sessionId"
            int r0 = r1.getInt(r0)
            long r0 = (long) r0
            X.BbX r13 = new X.BbX
            r13.<init>(r0)
        L_0x02a3:
            java.lang.String r0 = "google_silentVerificationExtension"
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto L_0x02ba
            org.json.JSONObject r1 = r4.getJSONObject(r0)
            java.lang.String r0 = "silentVerification"
            boolean r0 = r1.getBoolean(r0)
            X.BbY r12 = new X.BbY
            r12.<init>(r0)
        L_0x02ba:
            java.lang.String r0 = "devicePublicKeyExtension"
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto L_0x02d0
            org.json.JSONObject r1 = r4.getJSONObject(r0)
            java.lang.String r0 = "devicePublicKey"
            r1.getBoolean(r0)
            X.Ba3 r23 = new X.Ba3
            r23.<init>()
        L_0x02d0:
            java.lang.String r0 = "google_tunnelServerIdExtension"
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto L_0x02e7
            org.json.JSONObject r1 = r4.getJSONObject(r0)
            java.lang.String r0 = "tunnelServerId"
            java.lang.String r0 = r1.getString(r0)
            X.BbZ r10 = new X.BbZ
            r10.<init>(r0)
        L_0x02e7:
            java.lang.String r0 = "google_thirdPartyPaymentExtension"
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto L_0x02fe
            org.json.JSONObject r1 = r4.getJSONObject(r0)
            java.lang.String r0 = "thirdPartyPayment"
            boolean r0 = r1.getBoolean(r0)
            X.BbU r9 = new X.BbU
            r9.<init>(r0)
        L_0x02fe:
            java.lang.String r0 = "txAuthSimple"
            boolean r1 = r4.has(r0)
            if (r1 == 0) goto L_0x030f
            java.lang.String r0 = r4.getString(r0)
            X.Bba r2 = new X.Bba
            r2.<init>(r0)
        L_0x030f:
            X.BcP r0 = new X.BcP
            r21 = r2
            r22 = r8
            r24 = r14
            r18 = r10
            r17 = r12
            r16 = r13
            r14 = r9
            r13 = r3
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5.A01 = r0
        L_0x0325:
            java.lang.String r1 = "attestation"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x0344
            java.lang.String r0 = r6.getString(r1)     // Catch:{ C1X -> 0x0338 }
            X.C0b r0 = X.C24366C0b.A00(r0)     // Catch:{ C1X -> 0x0338 }
            r5.A00 = r0     // Catch:{ C1X -> 0x0338 }
            goto L_0x0344
        L_0x0338:
            r2 = move-exception
            java.lang.String r1 = "PKCCreationOptions"
            java.lang.String r0 = "Invalid AttestationConveyancePreference"
            android.util.Log.w(r1, r0, r2)
            X.C0b r0 = X.C24366C0b.NONE
            r5.A00 = r0
        L_0x0344:
            X.Bdi r0 = r5.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23232Bdi.A00(org.json.JSONObject):X.Bdi");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C23232Bdi) {
            C23232Bdi bdi = (C23232Bdi) obj;
            if (C25332Cdd.A01(this.A04, bdi.A04) && C25332Cdd.A01(this.A05, bdi.A05) && Arrays.equals(this.A0C, bdi.A0C) && C25332Cdd.A01(this.A07, bdi.A07)) {
                List list = this.A0A;
                List list2 = bdi.A0A;
                if (list.containsAll(list2) && list2.containsAll(list)) {
                    List list3 = this.A0B;
                    List list4 = bdi.A0B;
                    if (list3 != null ? !(list4 == null || !list3.containsAll(list4) || !list4.containsAll(list3)) : list4 == null) {
                        if (!C25332Cdd.A01(this.A03, bdi.A03) || !C25332Cdd.A01(this.A08, bdi.A08) || !C25332Cdd.A01(this.A06, bdi.A06) || !C25332Cdd.A01(this.A01, bdi.A01) || !C25332Cdd.A01(this.A02, bdi.A02) || !C25332Cdd.A01(this.A09, bdi.A09)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A04, 12);
        A1b[1] = this.A05;
        AnonymousClass3Ma.A1S(A1b, Arrays.hashCode(this.A0C));
        A1b[3] = this.A0A;
        A1b[4] = this.A07;
        A1b[5] = this.A0B;
        A1b[6] = this.A03;
        A1b[7] = this.A08;
        A1b[8] = this.A06;
        A1b[9] = this.A01;
        A1b[10] = this.A02;
        return AnonymousClass000.A0P(this.A09, A1b, 11);
    }

    public final String toString() {
        C23169BcP bcP = this.A02;
        C24366C0b c0b = this.A01;
        C23129Bbi bbi = this.A06;
        C23173BcT bcT = this.A03;
        List list = this.A0B;
        List list2 = this.A0A;
        byte[] bArr = this.A0C;
        C23158BcE bcE = this.A05;
        String valueOf = String.valueOf(this.A04);
        String valueOf2 = String.valueOf(bcE);
        String A002 = C19630ye.A00(bArr);
        String valueOf3 = String.valueOf(list2);
        String valueOf4 = String.valueOf(list);
        String valueOf5 = String.valueOf(bcT);
        String valueOf6 = String.valueOf(bbi);
        String valueOf7 = String.valueOf(c0b);
        String valueOf8 = String.valueOf(bcP);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PublicKeyCredentialCreationOptions{\n rp=");
        A10.append(valueOf);
        A10.append(", \n user=");
        A10.append(valueOf2);
        A10.append(", \n challenge=");
        A10.append(A002);
        A10.append(", \n parameters=");
        A10.append(valueOf3);
        A10.append(", \n timeoutSeconds=");
        A10.append(this.A07);
        A10.append(", \n excludeList=");
        A10.append(valueOf4);
        A10.append(", \n authenticatorSelection=");
        A10.append(valueOf5);
        A10.append(", \n requestId=");
        A10.append(this.A08);
        A10.append(", \n tokenBinding=");
        A10.append(valueOf6);
        A10.append(", \n attestationConveyancePreference=");
        A10.append(valueOf7);
        A10.append(", \n authenticationExtensions=");
        return BEA.A0n(valueOf8, A10);
    }

    public C23232Bdi(String str) {
        try {
            C23232Bdi A002 = A00(C17880vN.A16(str));
            this.A04 = A002.A04;
            this.A05 = A002.A05;
            this.A0C = A002.A0C;
            this.A0A = A002.A0A;
            this.A07 = A002.A07;
            this.A0B = A002.A0B;
            this.A03 = A002.A03;
            this.A08 = A002.A08;
            this.A06 = A002.A06;
            this.A01 = A002.A01;
            this.A02 = A002.A02;
            this.A09 = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0J = DJ0.A0J(parcel, this.A04, i);
        C26293Cx2.A09(parcel, this.A05, 3, i, A0J);
        C26293Cx2.A0D(parcel, this.A0C, 4, A0J);
        C26293Cx2.A0C(parcel, this.A0A, 5, A0J);
        Double d = this.A07;
        if (d != null) {
            parcel.writeInt(524294);
            parcel.writeDouble(d.doubleValue());
        }
        C26293Cx2.A0C(parcel, this.A0B, 7, A0J);
        C26293Cx2.A09(parcel, this.A03, 8, i, A0J);
        Integer num = this.A08;
        if (num != null) {
            parcel.writeInt(262153);
            parcel.writeInt(num.intValue());
        }
        C26293Cx2.A09(parcel, this.A06, 10, i, A0J);
        C26293Cx2.A0A(parcel, C17900vP.A08(this.A01), 11, A0J);
        C26293Cx2.A09(parcel, this.A02, 12, i, A0J);
        C26293Cx2.A0A(parcel, this.A09, 13, A0J);
        C26293Cx2.A09(parcel, this.A00, 14, i, A0J);
        C26293Cx2.A05(parcel, A002);
    }

    public C23232Bdi(ResultReceiver resultReceiver, C23169BcP bcP, C23173BcT bcT, C23153Bc9 bc9, C23158BcE bcE, C23129Bbi bbi, Double d, Integer num, String str, String str2, List list, List list2, byte[] bArr) {
        this.A00 = resultReceiver;
        if (str2 != null) {
            try {
                C23232Bdi A002 = A00(C17880vN.A16(str2));
                this.A04 = A002.A04;
                this.A05 = A002.A05;
                this.A0C = A002.A0C;
                this.A0A = A002.A0A;
                this.A07 = A002.A07;
                this.A0B = A002.A0B;
                this.A03 = A002.A03;
                this.A08 = A002.A08;
                this.A06 = A002.A06;
                this.A01 = A002.A01;
                this.A02 = A002.A02;
                this.A09 = str2;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            C18210vx.A00(bc9);
            this.A04 = bc9;
            C18210vx.A00(bcE);
            this.A05 = bcE;
            C18210vx.A00(bArr);
            this.A0C = bArr;
            C18210vx.A00(list);
            this.A0A = list;
            this.A07 = d;
            this.A0B = list2;
            this.A03 = bcT;
            this.A08 = num;
            this.A06 = bbi;
            if (str != null) {
                try {
                    this.A01 = C24366C0b.A00(str);
                } catch (C1X e2) {
                    throw new IllegalArgumentException(e2);
                }
            } else {
                this.A01 = null;
            }
            this.A02 = bcP;
            this.A09 = null;
        }
    }
}
