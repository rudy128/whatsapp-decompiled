package X;

import org.json.JSONArray;
import org.json.JSONException;

public final class A4M {
    public static final String A00(String str) {
        C18070vi.A0d(str, 0);
        try {
            return new JSONArray(str).getString(0);
        } catch (JSONException e) {
            throw new IllegalArgumentException("SyncMutationData/getValidMutationName: corrupt index", e);
        }
    }

    public final A6U A02(C62382rJ r20, C19999A2n a2n, byte[] bArr, byte[] bArr2) {
        Integer num;
        String str;
        C166378cn r7;
        DSQ dsq;
        byte[] bArr3 = bArr;
        C18070vi.A0d(bArr3, 2);
        C62382rJ r5 = r20;
        byte[] bArr4 = bArr2;
        try {
            C165438b9 r4 = (C165438b9) C23577Bm6.A07(C165438b9.DEFAULT_INSTANCE, bArr3);
            if (r4 != null) {
                int i = r4.bitField0_;
                if (AnonymousClass000.A1O(i & 8)) {
                    num = Integer.valueOf(r4.version_);
                } else {
                    num = null;
                }
                if ((i & 1) == 0 || (dsq = r4.index_) == null) {
                    str = null;
                } else {
                    str = dsq.A04();
                }
                if ((r4.bitField0_ & 2) == 0 || ((r7 = r4.value_) == null && (r7 = C166378cn.DEFAULT_INSTANCE) == null)) {
                    r7 = null;
                }
                C19999A2n a2n2 = a2n;
                if (num == null) {
                    throw new AnonymousClass2E2(r5, a2n2, r7, str, (Throwable) null, bArr4, 3, 0);
                } else if (str != null) {
                    if (r7 == null) {
                        if (r5 != C62382rJ.A02) {
                            throw new AnonymousClass2E2(r5, a2n2, (C166378cn) null, str, (Throwable) null, bArr4, 2, num.intValue());
                        }
                    } else if (!AnonymousClass8BW.A1Q(r7.bitField0_) && r5 != C62382rJ.A02) {
                        throw new AnonymousClass2E2(r5, a2n2, r7, str, (Throwable) null, bArr4, 7, num.intValue());
                    }
                    try {
                        return new A6U(r5, a2n2, r7, str, bArr4, A01(str), num.intValue());
                    } catch (IllegalArgumentException e) {
                        throw new AnonymousClass2E2(r5, a2n2, r7, str, e, bArr4, 4, num.intValue());
                    } catch (JSONException e2) {
                        throw new AnonymousClass2E2(r5, a2n2, r7, str, e2, bArr4, 4, num.intValue());
                    }
                } else {
                    throw new AnonymousClass2E2(r5, a2n2, r7, (String) null, (Throwable) null, bArr4, 1, num.intValue());
                }
            } else {
                throw new AnonymousClass2E2(r5, (C19999A2n) null, (C166378cn) null, (String) null, (Throwable) null, bArr4, 0, 0);
            }
        } catch (AnonymousClass1PN e3) {
            throw new AnonymousClass2E2(r5, (C19999A2n) null, (C166378cn) null, (String) null, e3, bArr4, 0, 0);
        }
    }

    public static final String[] A01(String str) {
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = "";
        }
        int length2 = jSONArray.length();
        for (int i2 = 0; i2 < length2; i2++) {
            String string = jSONArray.getString(i2);
            if (string == null || string.length() == 0) {
                throw AnonymousClass001.A13("SyncMutationData/getValidKeyArrayIndex: The key is empty in the keyArray at position: ", AnonymousClass000.A10(), i2);
            }
            strArr[i2] = string;
        }
        if (length > 0) {
            return strArr;
        }
        throw AnonymousClass000.A0k("SyncMutationData/getValidKeyArrayIndex: keyArray length should have action name");
    }
}
