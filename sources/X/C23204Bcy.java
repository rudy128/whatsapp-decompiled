package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.Bcy  reason: case insensitive filesystem */
public class C23204Bcy extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C23174BcU A00;
    public final C23230Bdg A01;
    public final C23231Bdh A02;
    public final C23229Bdf A03;
    public final DSS A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r3 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        X.C18210vx.A07(r2, "Must provide id and rawId if not an error response.");
        r4.A05 = r9;
        r4.A06 = r10;
        r4.A04 = r3;
        r4.A02 = r7;
        r4.A01 = r6;
        r4.A03 = r8;
        r4.A00 = r5;
        r4.A07 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r8 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        if (r6 == null) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r8 != null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        X.C18210vx.A07(r1, "Must provide a response object.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r8 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r9 == null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23204Bcy(X.C23174BcU r5, X.C23230Bdg r6, X.C23231Bdh r7, X.C23229Bdf r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, byte[] r12) {
        /*
            r4 = this;
            if (r12 != 0) goto L_0x0037
            r3 = 0
        L_0x0003:
            r4.<init>()
            r2 = 1
            if (r7 == 0) goto L_0x0031
            if (r6 != 0) goto L_0x000d
        L_0x000b:
            if (r8 == 0) goto L_0x0035
        L_0x000d:
            r1 = 0
        L_0x000e:
            java.lang.String r0 = "Must provide a response object."
            X.C18210vx.A07(r1, r0)
            if (r8 != 0) goto L_0x0019
            if (r9 == 0) goto L_0x002f
            if (r3 == 0) goto L_0x002f
        L_0x0019:
            java.lang.String r0 = "Must provide id and rawId if not an error response."
            X.C18210vx.A07(r2, r0)
            r4.A05 = r9
            r4.A06 = r10
            r4.A04 = r3
            r4.A02 = r7
            r4.A01 = r6
            r4.A03 = r8
            r4.A00 = r5
            r4.A07 = r11
            return
        L_0x002f:
            r2 = 0
            goto L_0x0019
        L_0x0031:
            if (r6 != 0) goto L_0x000b
            if (r8 == 0) goto L_0x000d
        L_0x0035:
            r1 = 1
            goto L_0x000e
        L_0x0037:
            int r0 = r12.length
            X.Bfo r3 = X.DSS.A01(r12, r0)
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23204Bcy.<init>(X.BcU, X.Bdg, X.Bdh, X.Bdf, java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public static DSA A00(DVL dvl, long j) {
        return (DSA) dvl.get(new C23366Bfs(j));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C23204Bcy) {
            C23204Bcy bcy = (C23204Bcy) obj;
            if (!C25332Cdd.A01(this.A05, bcy.A05) || !C25332Cdd.A01(this.A06, bcy.A06) || !C25332Cdd.A01(this.A04, bcy.A04) || !C25332Cdd.A01(this.A02, bcy.A02) || !C25332Cdd.A01(this.A01, bcy.A01) || !C25332Cdd.A01(this.A03, bcy.A03) || !C25332Cdd.A01(this.A00, bcy.A00) || !C25332Cdd.A01(this.A07, bcy.A07)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A05, 8);
        A1b[1] = this.A06;
        A1b[2] = this.A04;
        A1b[3] = this.A01;
        A1b[4] = this.A02;
        A1b[5] = this.A03;
        A1b[6] = this.A00;
        return AnonymousClass000.A0P(this.A07, A1b, 7);
    }

    public final String toString() {
        byte[] A0N = DJ0.A0N(this.A04);
        String str = this.A06;
        String str2 = this.A05;
        C23231Bdh bdh = this.A02;
        C23230Bdg bdg = this.A01;
        C23229Bdf bdf = this.A03;
        C23174BcU bcU = this.A00;
        String str3 = this.A07;
        String A002 = C19630ye.A00(A0N);
        String valueOf = String.valueOf(bdh);
        String valueOf2 = String.valueOf(bdg);
        String valueOf3 = String.valueOf(bdf);
        String valueOf4 = String.valueOf(bcU);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PublicKeyCredential{\n id='");
        A10.append(str2);
        A10.append("', \n type='");
        A10.append(str);
        A10.append("', \n rawId=");
        A10.append(A002);
        A10.append(", \n registerResponse=");
        A10.append(valueOf);
        A10.append(", \n signResponse=");
        A10.append(valueOf2);
        A10.append(", \n errorResponse=");
        A10.append(valueOf3);
        A10.append(", \n extensionsClientOutputs=");
        A10.append(valueOf4);
        A10.append(", \n authenticatorAttachment='");
        A10.append(str3);
        return AnonymousClass000.A0y("'}", A10);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C26934DJp.A01.A00.CTC();
        C25472CgR.A0A.CTC();
        throw null;
    }

    public static void A01(DSS dss, String str, JSONObject jSONObject) {
        jSONObject.put(str, C19630ye.A00(dss.A04()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x028a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x028f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02b6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r2 = new java.lang.IllegalArgumentException("failed to parse attestation object", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02bf, code lost:
        r2 = new java.lang.IllegalArgumentException("failed to parse COSE key", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x028e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:169:0x02b5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0179 */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0267 A[Catch:{ JSONException -> 0x02c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x028f A[ExcHandler: BxK | C1e (r1v20 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:67:0x012f] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02b6 A[ExcHandler: BxK | C1e (r1v12 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:42:0x00ab] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:85:0x0179=Splitter:B:85:0x0179, B:147:0x028e=Splitter:B:147:0x028e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02() {
        /*
            r24 = this;
            org.json.JSONObject r9 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x031f }
            r8 = r24
            X.DSS r1 = r8.A04     // Catch:{ JSONException -> 0x031f }
            if (r1 == 0) goto L_0x0016
            byte[] r0 = r1.A04()     // Catch:{ JSONException -> 0x031f }
            int r0 = r0.length     // Catch:{ JSONException -> 0x031f }
            if (r0 <= 0) goto L_0x0016
            java.lang.String r0 = "rawId"
            A01(r1, r0, r9)     // Catch:{ JSONException -> 0x031f }
        L_0x0016:
            java.lang.String r1 = r8.A07     // Catch:{ JSONException -> 0x031f }
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "authenticatorAttachment"
            r9.put(r0, r1)     // Catch:{ JSONException -> 0x031f }
        L_0x001f:
            java.lang.String r1 = r8.A06     // Catch:{ JSONException -> 0x031f }
            if (r1 == 0) goto L_0x002c
            X.Bdf r0 = r8.A03     // Catch:{ JSONException -> 0x031f }
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "type"
            r9.put(r0, r1)     // Catch:{ JSONException -> 0x031f }
        L_0x002c:
            java.lang.String r1 = r8.A05     // Catch:{ JSONException -> 0x031f }
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = "id"
            r9.put(r0, r1)     // Catch:{ JSONException -> 0x031f }
        L_0x0035:
            java.lang.String r23 = "response"
            X.Bdg r2 = r8.A01     // Catch:{ JSONException -> 0x031f }
            r22 = 1
            if (r2 == 0) goto L_0x0061
            org.json.JSONObject r7 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x02f6 }
            java.lang.String r1 = "clientDataJSON"
            X.DSS r0 = r2.A01     // Catch:{ JSONException -> 0x02f6 }
            A01(r0, r1, r7)     // Catch:{ JSONException -> 0x02f6 }
            java.lang.String r1 = "authenticatorData"
            X.DSS r0 = r2.A02     // Catch:{ JSONException -> 0x02f6 }
            A01(r0, r1, r7)     // Catch:{ JSONException -> 0x02f6 }
            java.lang.String r1 = "signature"
            X.DSS r0 = r2.A03     // Catch:{ JSONException -> 0x02f6 }
            A01(r0, r1, r7)     // Catch:{ JSONException -> 0x02f6 }
            X.DSS r1 = r2.A04     // Catch:{ JSONException -> 0x02f6 }
            if (r1 == 0) goto L_0x02ff
            java.lang.String r0 = "userHandle"
            A01(r1, r0, r7)     // Catch:{ JSONException -> 0x02f6 }
            goto L_0x02ff
        L_0x0061:
            X.Bdh r6 = r8.A02     // Catch:{ JSONException -> 0x031f }
            if (r6 == 0) goto L_0x02cf
            org.json.JSONObject r7 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x02c7 }
            X.DSS r1 = r6.A01     // Catch:{ JSONException -> 0x02c7 }
            if (r1 == 0) goto L_0x0072
            java.lang.String r0 = "clientDataJSON"
            A01(r1, r0, r7)     // Catch:{ JSONException -> 0x02c7 }
        L_0x0072:
            X.DSS r5 = r6.A02     // Catch:{ JSONException -> 0x02c7 }
            if (r5 == 0) goto L_0x007b
            java.lang.String r0 = "attestationObject"
            A01(r5, r0, r7)     // Catch:{ JSONException -> 0x02c7 }
        L_0x007b:
            org.json.JSONArray r4 = X.AnonymousClass8BR.A1A()     // Catch:{ JSONException -> 0x02c7 }
            r11 = 0
            r3 = 0
        L_0x0081:
            java.lang.String[] r2 = r6.A03     // Catch:{ JSONException -> 0x02c7 }
            int r0 = r2.length     // Catch:{ JSONException -> 0x02c7 }
            if (r3 >= r0) goto L_0x00a2
            r1 = r2[r3]     // Catch:{ JSONException -> 0x02c7 }
            com.google.android.gms.fido.common.Transport r0 = com.google.android.gms.fido.common.Transport.HYBRID     // Catch:{ JSONException -> 0x02c7 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x02c7 }
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x02c7 }
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = "hybrid"
            r4.put(r3, r0)     // Catch:{ JSONException -> 0x02c7 }
            goto L_0x009f
        L_0x009a:
            r0 = r2[r3]     // Catch:{ JSONException -> 0x02c7 }
            r4.put(r3, r0)     // Catch:{ JSONException -> 0x02c7 }
        L_0x009f:
            int r3 = r3 + 1
            goto L_0x0081
        L_0x00a2:
            java.lang.String r0 = "transports"
            r7.put(r0, r4)     // Catch:{ JSONException -> 0x02c7 }
            byte[] r1 = r5.A04()     // Catch:{ JSONException -> 0x02c7 }
            int r0 = r1.length     // Catch:{ BxK | C1e -> 0x02b6 }
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ BxK | C1e -> 0x02b6 }
            java.io.ByteArrayInputStream r0 = X.BE6.A0h(r0)     // Catch:{ BxK | C1e -> 0x02b6 }
            X.DRI r1 = new X.DRI     // Catch:{ BxK | C1e -> 0x02b6 }
            r1.<init>(r0)     // Catch:{ BxK | C1e -> 0x02b6 }
            X.DSA r0 = X.C23231Bdh.A00(r1, r0)     // Catch:{ all -> 0x02b1 }
            r1.close()     // Catch:{ IOException -> 0x00c0, BxK | C1e -> 0x02b6 }
        L_0x00c0:
            java.lang.Class<X.Bfv> r3 = X.C23369Bfv.class
            X.DSA r0 = X.DSA.A00(r0, r3)     // Catch:{ BxK | C1e -> 0x02b6 }
            X.Bfv r0 = (X.C23369Bfv) r0     // Catch:{ BxK | C1e -> 0x02b6 }
            X.BfY r2 = r0.A01     // Catch:{ C1e -> 0x02a8 }
            java.lang.String r1 = "authData"
            X.Bft r0 = new X.Bft     // Catch:{ C1e -> 0x02a8 }
            r0.<init>(r1)     // Catch:{ C1e -> 0x02a8 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ C1e -> 0x02a8 }
            X.DSA r0 = (X.DSA) r0     // Catch:{ C1e -> 0x02a8 }
            if (r0 == 0) goto L_0x02a1
            java.lang.Class<X.Bfr> r10 = X.C23365Bfr.class
            X.DSA r0 = X.DSA.A00(r0, r10)     // Catch:{ C1e -> 0x02a8 }
            X.Bfr r0 = (X.C23365Bfr) r0     // Catch:{ C1e -> 0x02a8 }
            X.DSS r0 = r0.A00     // Catch:{ C1e -> 0x02a8 }
            r21 = r0
            r6 = r21
            X.Bfo r6 = (X.C23362Bfo) r6     // Catch:{ JSONException -> 0x02c7 }
            byte[] r2 = r6.zza     // Catch:{ JSONException -> 0x02c7 }
            boolean r5 = r6 instanceof X.C23361Bfn     // Catch:{ JSONException -> 0x02c7 }
            if (r5 == 0) goto L_0x0101
            r0 = r6
            X.Bfn r0 = (X.C23361Bfn) r0     // Catch:{ JSONException -> 0x02c7 }
            int r1 = r0.zzc     // Catch:{ JSONException -> 0x02c7 }
        L_0x00f4:
            int r0 = r6.A03()     // Catch:{ JSONException -> 0x02c7 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2, r1, r0)     // Catch:{ JSONException -> 0x02c7 }
            java.nio.ByteBuffer r1 = r0.asReadOnlyBuffer()     // Catch:{ JSONException -> 0x02c7 }
            goto L_0x0103
        L_0x0101:
            r1 = 0
            goto L_0x00f4
        L_0x0103:
            int r0 = r1.position()     // Catch:{ IllegalArgumentException -> 0x0298 }
            r12 = 32
            int r0 = r0 + 32
            r1.position(r0)     // Catch:{ IllegalArgumentException -> 0x0298 }
            byte r0 = r1.get()     // Catch:{ IllegalArgumentException -> 0x0298 }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0291
            int r0 = r1.position()     // Catch:{ IllegalArgumentException -> 0x0298 }
            int r0 = r0 + 4
            r1.position(r0)     // Catch:{ IllegalArgumentException -> 0x0298 }
            int r0 = r1.position()     // Catch:{ IllegalArgumentException -> 0x0298 }
            int r0 = r0 + 16
            r1.position(r0)     // Catch:{ IllegalArgumentException -> 0x0298 }
            short r0 = r1.getShort()     // Catch:{ IllegalArgumentException -> 0x0298 }
            X.BE8.A1G(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0298 }
            int r4 = r1.position()     // Catch:{ BxK | C1e -> 0x028f }
            int r1 = r21.A03()     // Catch:{ BxK | C1e -> 0x028f }
            int r0 = r6.A03()     // Catch:{ BxK | C1e -> 0x028f }
            int r2 = X.DSS.A00(r4, r1, r0)     // Catch:{ BxK | C1e -> 0x028f }
            if (r2 != 0) goto L_0x0161
            X.DSS r5 = X.DSS.A00     // Catch:{ BxK | C1e -> 0x028f }
        L_0x0143:
            X.Bfo r5 = (X.C23362Bfo) r5     // Catch:{ BxK | C1e -> 0x028f }
            byte[] r4 = r5.zza     // Catch:{ BxK | C1e -> 0x028f }
            boolean r0 = r5 instanceof X.C23361Bfn     // Catch:{ BxK | C1e -> 0x028f }
            if (r0 == 0) goto L_0x015f
            r0 = r5
            X.Bfn r0 = (X.C23361Bfn) r0     // Catch:{ BxK | C1e -> 0x028f }
            int r2 = r0.zzc     // Catch:{ BxK | C1e -> 0x028f }
        L_0x0150:
            int r1 = r5.A03()     // Catch:{ BxK | C1e -> 0x028f }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ BxK | C1e -> 0x028f }
            r0.<init>(r4, r2, r1)     // Catch:{ BxK | C1e -> 0x028f }
            X.DRI r1 = new X.DRI     // Catch:{ BxK | C1e -> 0x028f }
            r1.<init>(r0)     // Catch:{ BxK | C1e -> 0x028f }
            goto L_0x0172
        L_0x015f:
            r2 = 0
            goto L_0x0150
        L_0x0161:
            byte[] r1 = r6.zza     // Catch:{ BxK | C1e -> 0x028f }
            if (r5 == 0) goto L_0x0170
            X.Bfn r6 = (X.C23361Bfn) r6     // Catch:{ BxK | C1e -> 0x028f }
            int r0 = r6.zzc     // Catch:{ BxK | C1e -> 0x028f }
        L_0x0169:
            int r0 = r0 + r4
            X.Bfn r5 = new X.Bfn     // Catch:{ BxK | C1e -> 0x028f }
            r5.<init>(r1, r0, r2)     // Catch:{ BxK | C1e -> 0x028f }
            goto L_0x0143
        L_0x0170:
            r0 = 0
            goto L_0x0169
        L_0x0172:
            X.DSA r0 = X.C23231Bdh.A00(r1, r0)     // Catch:{ all -> 0x028a }
            r1.close()     // Catch:{ IOException -> 0x0179, BxK | C1e -> 0x028f }
        L_0x0179:
            X.DSA r0 = X.DSA.A00(r0, r3)     // Catch:{ BxK | C1e -> 0x028f }
            X.Bfv r0 = (X.C23369Bfv) r0     // Catch:{ BxK | C1e -> 0x028f }
            X.BfY r6 = r0.A01     // Catch:{ JSONException -> 0x02c7 }
            r0 = 3
            X.DSA r0 = A00(r6, r0)     // Catch:{ JSONException -> 0x02c7 }
            r4 = 1
            X.DSA r1 = A00(r6, r4)     // Catch:{ JSONException -> 0x02c7 }
            java.lang.String r20 = "COSE key missing required fields"
            if (r0 == 0) goto L_0x0285
            if (r1 == 0) goto L_0x0285
            java.lang.Class<X.Bfs> r13 = X.C23366Bfs.class
            X.DSA r0 = X.DSA.A00(r0, r13)     // Catch:{ C1e -> 0x027c }
            X.Bfs r0 = (X.C23366Bfs) r0     // Catch:{ C1e -> 0x027c }
            long r14 = r0.A00     // Catch:{ C1e -> 0x027c }
            X.DSA r0 = X.DSA.A00(r1, r13)     // Catch:{ C1e -> 0x027c }
            X.Bfs r0 = (X.C23366Bfs) r0     // Catch:{ C1e -> 0x027c }
            long r2 = r0.A00     // Catch:{ C1e -> 0x027c }
            r18 = 2
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01b1
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0258
            r2 = 2
        L_0x01b1:
            r0 = -1
            X.DSA r0 = A00(r6, r0)     // Catch:{ C1e -> 0x027c }
            if (r0 == 0) goto L_0x0272
            X.DSA r0 = X.DSA.A00(r0, r13)     // Catch:{ C1e -> 0x027c }
            X.Bfs r0 = (X.C23366Bfs) r0     // Catch:{ C1e -> 0x027c }
            long r0 = r0.A00     // Catch:{ C1e -> 0x027c }
            r13 = 2
            java.lang.String r17 = "COSE coordinates are the wrong size"
            int r16 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r16 != 0) goto L_0x0219
            int r16 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x0219
            r0 = -2
            X.DSA r2 = A00(r6, r0)     // Catch:{ C1e -> 0x027c }
            r0 = -3
            X.DSA r1 = A00(r6, r0)     // Catch:{ C1e -> 0x027c }
            if (r2 == 0) goto L_0x0277
            if (r1 == 0) goto L_0x0277
            X.DSA r0 = X.DSA.A00(r2, r10)     // Catch:{ C1e -> 0x027c }
            X.Bfr r0 = (X.C23365Bfr) r0     // Catch:{ C1e -> 0x027c }
            X.DSS r4 = r0.A00     // Catch:{ C1e -> 0x027c }
            X.DSA r0 = X.DSA.A00(r1, r10)     // Catch:{ C1e -> 0x027c }
            X.Bfr r0 = (X.C23365Bfr) r0     // Catch:{ C1e -> 0x027c }
            X.DSS r3 = r0.A00     // Catch:{ C1e -> 0x027c }
            int r0 = r4.A03()     // Catch:{ C1e -> 0x027c }
            if (r0 != r12) goto L_0x0214
            int r0 = r3.A03()     // Catch:{ C1e -> 0x027c }
            if (r0 != r12) goto L_0x0214
            java.lang.String r0 = "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE"
            byte[] r2 = android.util.Base64.decode(r0, r11)     // Catch:{ C1e -> 0x027c }
            r0 = 3
            byte[][] r1 = new byte[r0][]     // Catch:{ C1e -> 0x027c }
            r1[r11] = r2     // Catch:{ C1e -> 0x027c }
            byte[] r0 = r4.A04()     // Catch:{ C1e -> 0x027c }
            r1[r22] = r0     // Catch:{ C1e -> 0x027c }
            byte[] r0 = r3.A04()     // Catch:{ C1e -> 0x027c }
            r1[r13] = r0     // Catch:{ C1e -> 0x027c }
            byte[] r2 = X.CBD.A00(r1)     // Catch:{ C1e -> 0x027c }
            goto L_0x0259
        L_0x0214:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r17)     // Catch:{ C1e -> 0x027c }
            goto L_0x027b
        L_0x0219:
            int r16 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x0258
            r3 = 6
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0258
            r0 = -2
            X.DSA r0 = A00(r6, r0)     // Catch:{ C1e -> 0x027c }
            if (r0 == 0) goto L_0x0253
            X.DSA r0 = X.DSA.A00(r0, r10)     // Catch:{ C1e -> 0x027c }
            X.Bfr r0 = (X.C23365Bfr) r0     // Catch:{ C1e -> 0x027c }
            X.DSS r2 = r0.A00     // Catch:{ C1e -> 0x027c }
            int r0 = r2.A03()     // Catch:{ C1e -> 0x027c }
            if (r0 != r12) goto L_0x024e
            java.lang.String r0 = "MCowBQYDK2VwAyEA"
            byte[] r0 = android.util.Base64.decode(r0, r11)     // Catch:{ C1e -> 0x027c }
            byte[][] r1 = new byte[r13][]     // Catch:{ C1e -> 0x027c }
            r1[r11] = r0     // Catch:{ C1e -> 0x027c }
            byte[] r0 = r2.A04()     // Catch:{ C1e -> 0x027c }
            r1[r22] = r0     // Catch:{ C1e -> 0x027c }
            byte[] r2 = X.CBD.A00(r1)     // Catch:{ C1e -> 0x027c }
            goto L_0x0259
        L_0x024e:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r17)     // Catch:{ C1e -> 0x027c }
            goto L_0x027b
        L_0x0253:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r20)     // Catch:{ C1e -> 0x027c }
            goto L_0x027b
        L_0x0258:
            r2 = 0
        L_0x0259:
            java.lang.String r1 = "authenticatorData"
            r0 = r21
            A01(r0, r1, r7)     // Catch:{ JSONException -> 0x02c7 }
            java.lang.String r0 = "publicKeyAlgorithm"
            r7.put(r0, r14)     // Catch:{ JSONException -> 0x02c7 }
            if (r2 == 0) goto L_0x02ff
            java.lang.String r1 = "publicKey"
            java.lang.String r0 = X.AnonymousClass8BT.A0x(r2)     // Catch:{ JSONException -> 0x02c7 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x02c7 }
            goto L_0x02ff
        L_0x0272:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r20)     // Catch:{ C1e -> 0x027c }
            goto L_0x027b
        L_0x0277:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r20)     // Catch:{ C1e -> 0x027c }
        L_0x027b:
            throw r0     // Catch:{ C1e -> 0x027c }
        L_0x027c:
            r1 = move-exception
            java.lang.String r0 = "COSE key ill-formed"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x02c7 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x02c7 }
            goto L_0x02c6
        L_0x0285:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r20)     // Catch:{ JSONException -> 0x02c7 }
            throw r0     // Catch:{ JSONException -> 0x02c7 }
        L_0x028a:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x028e, BxK | C1e -> 0x028f }
        L_0x028e:
            throw r0     // Catch:{ BxK | C1e -> 0x028f }
        L_0x028f:
            r1 = move-exception
            goto L_0x02bf
        L_0x0291:
            java.lang.String r0 = "authData does not include credential data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ IllegalArgumentException -> 0x0298 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0298 }
        L_0x0298:
            r1 = move-exception
            java.lang.String r0 = "ill-formed authenticator data"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x02c7 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x02c7 }
            goto L_0x02c6
        L_0x02a1:
            java.lang.String r0 = "attestation object missing authData"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ C1e -> 0x02a8 }
            throw r0     // Catch:{ C1e -> 0x02a8 }
        L_0x02a8:
            r1 = move-exception
            java.lang.String r0 = "authData value has wrong type"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x02c7 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x02c7 }
            goto L_0x02c6
        L_0x02b1:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x02b5, BxK | C1e -> 0x02b6 }
        L_0x02b5:
            throw r0     // Catch:{ BxK | C1e -> 0x02b6 }
        L_0x02b6:
            r1 = move-exception
            java.lang.String r0 = "failed to parse attestation object"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x02c7 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x02c7 }
            goto L_0x02c6
        L_0x02bf:
            java.lang.String r0 = "failed to parse COSE key"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x02c7 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x02c7 }
        L_0x02c6:
            throw r2     // Catch:{ JSONException -> 0x02c7 }
        L_0x02c7:
            r1 = move-exception
            java.lang.String r0 = "Error encoding AuthenticatorAttestationResponse to JSON object"
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)     // Catch:{ JSONException -> 0x031f }
            goto L_0x02fd
        L_0x02cf:
            X.Bdf r2 = r8.A03     // Catch:{ JSONException -> 0x031f }
            r22 = 0
            if (r2 == 0) goto L_0x02fe
            org.json.JSONObject r7 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x02ee }
            java.lang.String r1 = "code"
            X.C0X r0 = r2.A00     // Catch:{ JSONException -> 0x02ee }
            int r0 = r0.zzb     // Catch:{ JSONException -> 0x02ee }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x02ee }
            java.lang.String r1 = r2.A01     // Catch:{ JSONException -> 0x02ee }
            if (r1 == 0) goto L_0x02eb
            java.lang.String r0 = "message"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x02ee }
        L_0x02eb:
            java.lang.String r23 = "error"
            goto L_0x02ff
        L_0x02ee:
            r1 = move-exception
            java.lang.String r0 = "Error encoding AuthenticatorErrorResponse to JSON object"
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)     // Catch:{ JSONException -> 0x031f }
            goto L_0x02fd
        L_0x02f6:
            r1 = move-exception
            java.lang.String r0 = "Error encoding AuthenticatorAssertionResponse to JSON object"
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)     // Catch:{ JSONException -> 0x031f }
        L_0x02fd:
            throw r0     // Catch:{ JSONException -> 0x031f }
        L_0x02fe:
            r7 = 0
        L_0x02ff:
            if (r7 == 0) goto L_0x0306
            r0 = r23
            r9.put(r0, r7)     // Catch:{ JSONException -> 0x031f }
        L_0x0306:
            X.BcU r0 = r8.A00     // Catch:{ JSONException -> 0x031f }
            java.lang.String r1 = "clientExtensionResults"
            if (r0 == 0) goto L_0x0311
            org.json.JSONObject r0 = r0.A00()     // Catch:{ JSONException -> 0x031f }
            goto L_0x0317
        L_0x0311:
            if (r22 == 0) goto L_0x031a
            org.json.JSONObject r0 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x031f }
        L_0x0317:
            r9.put(r1, r0)     // Catch:{ JSONException -> 0x031f }
        L_0x031a:
            java.lang.String r0 = r9.toString()
            return r0
        L_0x031f:
            r1 = move-exception
            java.lang.String r0 = "Error encoding PublicKeyCredential to JSON object"
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23204Bcy.A02():java.lang.String");
    }
}
