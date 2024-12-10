package X;

import java.util.List;

/* renamed from: X.Afo  reason: case insensitive filesystem */
public final class C21179Afo implements C22470B9c {
    public static final C21179Afo A00 = new C21179Afo();

    public final Object BCF(C29621ca r8, C62672rm r9) {
        char A17 = C18070vi.A17(r8, r9);
        if (!r9.A09(r8, "pay")) {
            return null;
        }
        String[] strArr = new String[8];
        strArr[0] = "ADDITIONAL_KYC_REQUIRED";
        strArr[A17] = "COMPLETED";
        strArr[2] = "FAILED";
        strArr[3] = "ONBOARDING_COMPLETED";
        strArr[4] = "PENDING";
        strArr[5] = "PROCESSING";
        strArr[6] = "REJECTED";
        List A0O = C18070vi.A0O("UPLOADING", strArr, 7);
        String[] strArr2 = new String[2];
        strArr2[0] = "kyc";
        strArr2[A17] = "state";
        if (r9.A07(r8, A0O, strArr2) != null) {
            return new C178549Dn(r8);
        }
        return null;
    }
}
