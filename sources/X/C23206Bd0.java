package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Bd0  reason: case insensitive filesystem */
public final class C23206Bd0 extends DJ0 {
    public static final byte[] A01 = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public static final Parcelable.Creator CREATOR = new Object();
    public final byte[][] A00;

    public static C23206Bd0 A00(JSONObject jSONObject, boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        try {
            if (jSONObject.has("eval")) {
                A13.add((Object) null);
                if (z) {
                    A13.add(A02(jSONObject.getJSONObject("eval")));
                } else {
                    A13.add(A03(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String A0v = C17880vN.A0v(keys);
                    byte[] bArr = null;
                    if (A0v != null) {
                        bArr = BE7.A1a(A0v);
                    }
                    A13.add(bArr);
                    if (z) {
                        A13.add(A02(jSONObject2.getJSONObject(A0v)));
                    } else {
                        A13.add(A03(jSONObject2.getJSONObject(A0v)));
                    }
                }
            }
            return new C23206Bd0((byte[][]) A13.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static byte[] A02(JSONObject jSONObject) {
        byte[] A1a;
        byte[] A1a2;
        String string = jSONObject.getString("first");
        if (string == null) {
            A1a = null;
        } else {
            A1a = BE7.A1a(string);
        }
        if (A1a.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        } else if (!jSONObject.has("second")) {
            return A1a;
        } else {
            String string2 = jSONObject.getString("second");
            if (string2 == null) {
                A1a2 = null;
            } else {
                A1a2 = BE7.A1a(string2);
            }
            if (A1a2.length == 32) {
                byte[][] bArr = new byte[2][];
                AnonymousClass001.A1Q(A1a, A1a2, bArr);
                return CBD.A00(bArr);
            }
            throw new JSONException("hashed PRF value with wrong length");
        }
    }

    public static byte[] A03(JSONObject jSONObject) {
        String string = jSONObject.getString("first");
        byte[] bArr = null;
        if (string != null) {
            bArr = BE7.A1a(string);
        }
        byte[] A04 = A04(bArr);
        if (!jSONObject.has("second")) {
            return A04;
        }
        byte[][] bArr2 = new byte[2][];
        bArr2[0] = A04;
        String string2 = jSONObject.getString("second");
        byte[] bArr3 = null;
        if (string2 != null) {
            bArr3 = BE7.A1a(string2);
        }
        bArr2[1] = A04(bArr3);
        return CBD.A00(bArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A04(byte[] r6) {
        /*
            X.E24 r2 = X.CFA.A00
            X.DJr r2 = (X.C26936DJr) r2
            boolean r0 = r2.zzc
            if (r0 == 0) goto L_0x0018
            java.security.MessageDigest r0 = r2.zza     // Catch:{ CloneNotSupportedException -> 0x0018 }
            java.lang.Object r1 = r0.clone()     // Catch:{ CloneNotSupportedException -> 0x0018 }
            java.security.MessageDigest r1 = (java.security.MessageDigest) r1     // Catch:{ CloneNotSupportedException -> 0x0018 }
            int r0 = r2.zzb     // Catch:{ CloneNotSupportedException -> 0x0018 }
            X.Bfi r5 = new X.Bfi     // Catch:{ CloneNotSupportedException -> 0x0018 }
            r5.<init>(r1, r0)     // Catch:{ CloneNotSupportedException -> 0x0018 }
            goto L_0x0029
        L_0x0018:
            java.security.MessageDigest r0 = r2.zza
            java.lang.String r0 = r0.getAlgorithm()
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0082 }
            int r0 = r2.zzb
            X.Bfi r5 = new X.Bfi
            r5.<init>(r1, r0)
        L_0x0029:
            byte[] r4 = A01
            if (r4 == 0) goto L_0x0080
            int r1 = r4.length
            boolean r0 = r5.A00
            r0 = r0 ^ 1
            java.lang.String r3 = "Cannot re-use a Hasher after calling hash() on it"
            if (r0 == 0) goto L_0x007b
            java.security.MessageDigest r2 = r5.A02
            r0 = 0
            r2.update(r4, r0, r1)
            if (r6 == 0) goto L_0x0080
            int r1 = r6.length
            boolean r0 = r5.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0076
            r0 = 0
            r2.update(r6, r0, r1)
            boolean r0 = r5.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0071
            r0 = 1
            r5.A00 = r0
            int r1 = r5.A01
            int r0 = r2.getDigestLength()
            if (r1 != r0) goto L_0x0068
            byte[] r1 = r2.digest()
        L_0x005e:
            X.Bfj r0 = new X.Bfj
            r0.<init>(r1)
            byte[] r0 = r0.A00()
            return r0
        L_0x0068:
            byte[] r0 = r2.digest()
            byte[] r1 = java.util.Arrays.copyOf(r0, r1)
            goto L_0x005e
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r3)
            throw r0
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r3)
            throw r0
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r3)
            throw r0
        L_0x0080:
            r0 = 0
            throw r0
        L_0x0082:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23206Bd0.A04(byte[]):byte[]");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23206Bd0)) {
            return false;
        }
        return Arrays.deepEquals(this.A00, ((C23206Bd0) obj).A00);
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.A00) {
            if (bArr != null) {
                i ^= AnonymousClass000.A0P(bArr, AnonymousClass3MW.A1a(), 0);
            }
        }
        return i;
    }

    public final String toString() {
        try {
            JSONObject A15 = C17880vN.A15();
            int i = 0;
            JSONObject jSONObject = null;
            while (true) {
                byte[][] bArr = this.A00;
                if (i < bArr.length) {
                    if (bArr[i] == null) {
                        A15.put("eval", A01(bArr[i + 1]));
                    } else {
                        if (jSONObject == null) {
                            jSONObject = C17880vN.A15();
                            A15.put("evalByCredential", jSONObject);
                        }
                        jSONObject.put(C19630ye.A00(bArr[i]), A01(bArr[i + 1]));
                    }
                    i += 2;
                } else {
                    String obj = A15.toString();
                    StringBuilder A10 = AnonymousClass000.A10();
                    C17890vO.A10("PrfExtension{", obj, "}", A10);
                    return A10.toString();
                }
            }
        } catch (JSONException e) {
            String message = e.getMessage();
            StringBuilder A102 = AnonymousClass000.A10();
            C17890vO.A10("PrfExtension{Exception:", message, "}", A102);
            return A102.toString();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[][] bArr = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0H(parcel, bArr, 1);
        C26293Cx2.A05(parcel, A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r6[r3] != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23206Bd0(byte[][] r6) {
        /*
            r5 = this;
            r5.<init>()
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1W(r6)
            X.C18210vx.A06(r0)
            int r4 = r6.length
            r0 = r4 & 1
            r1 = r0 ^ 1
            r0 = 1
            if (r2 == r1) goto L_0x0014
            r0 = 0
        L_0x0014:
            X.C18210vx.A06(r0)
            r3 = 0
        L_0x0018:
            if (r3 >= r4) goto L_0x0043
            if (r3 == 0) goto L_0x0021
            r1 = r6[r3]
            r0 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            X.C18210vx.A06(r0)
            int r1 = r3 + 1
            r0 = r6[r1]
            boolean r0 = X.AnonymousClass000.A1W(r0)
            X.C18210vx.A06(r0)
            r0 = r6[r1]
            int r2 = r0.length
            r0 = 32
            if (r2 == r0) goto L_0x003c
            r1 = 64
            r0 = 0
            if (r2 != r1) goto L_0x003d
        L_0x003c:
            r0 = 1
        L_0x003d:
            X.C18210vx.A06(r0)
            int r3 = r3 + 2
            goto L_0x0018
        L_0x0043:
            r5.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23206Bd0.<init>(byte[][]):void");
    }

    public static JSONObject A01(byte[] bArr) {
        JSONObject A15 = C17880vN.A15();
        if (bArr.length == 32) {
            A15.put("first", AnonymousClass8BT.A0x(bArr));
            return A15;
        }
        A15.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        A15.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return A15;
    }
}
