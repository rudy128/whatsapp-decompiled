package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.AhO  reason: case insensitive filesystem */
public final class C21277AhO implements C22470B9c {
    public static final C21277AhO A00 = new C21277AhO();

    public final Object BCF(C29621ca r21, C62672rm r22) {
        C29621ca r5 = r21;
        C62672rm r4 = r22;
        int A17 = C18070vi.A17(r5, r4);
        if (!r4.A09(r5, "config")) {
            return null;
        }
        String[] strArr = new String[41];
        strArr[0] = "1019394685547802";
        strArr[A17] = "105910932827969";
        strArr[2] = "124024574287414";
        strArr[3] = "134692073335995";
        strArr[4] = "1464225827161561";
        strArr[5] = "1546062975675674";
        strArr[6] = "1711196729025634";
        strArr[7] = "173847642670370";
        strArr[8] = "180813502049746";
        strArr[9] = "181425161904154";
        strArr[10] = "1931350367173590";
        strArr[11] = "220512758076565";
        strArr[12] = "2220391788200892";
        strArr[13] = "2259778240752974";
        strArr[14] = "256002347743983";
        strArr[15] = "260352717816449";
        strArr[16] = "265002623618499";
        strArr[17] = "267929034378503";
        strArr[18] = "275254692598279";
        strArr[19] = "2786197261644303";
        strArr[20] = "330211543730728";
        strArr[21] = "338624972879457";
        strArr[22] = "350685531728";
        strArr[23] = "3534234083363713";
        strArr[24] = "386226551805820";
        strArr[25] = "3965760973453145";
        strArr[26] = "437626316973788";
        strArr[27] = "451384735309667";
        strArr[28] = "462062864670721";
        strArr[29] = "567067343352427";
        strArr[30] = "581956559359077";
        strArr[31] = "606306547673172";
        strArr[32] = "638638284359690";
        strArr[33] = "6628568379";
        strArr[34] = "673098596976877";
        strArr[35] = "759456018252168";
        strArr[36] = "770089894047039";
        strArr[37] = "772021112871879";
        strArr[38] = "867848743379534";
        strArr[39] = "882766346203812";
        List A0O = C18070vi.A0O("905593853150754", strArr, 40);
        String[] strArr2 = new String[A17];
        strArr2[0] = PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        if (r4.A07(r5, A0O, strArr2) == null) {
            return null;
        }
        String[] strArr3 = new String[A17];
        strArr3[0] = "deviceid";
        Class<String> cls = String.class;
        if (r4.A05(r5, cls, 16L, 36L, (Object) null, strArr3, false) == null) {
            return null;
        }
        String[] strArr4 = new String[A17];
        if (r4.A05(r5, cls, AnonymousClass8BW.A0Z("platform", strArr4, 0), AnonymousClass8BU.A0j(), "fb", strArr4, false) != null) {
            return new AnonymousClass9EN(r5);
        }
        return null;
    }
}
