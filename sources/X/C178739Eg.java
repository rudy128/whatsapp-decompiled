package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.9Eg  reason: invalid class name and case insensitive filesystem */
public final class C178739Eg extends C178869Et {
    public final C29621ca A00;
    public final List A01;
    public final List A02;
    public final List A03 = AnonymousClass8BX.A0o("0", "1", 2, 1);

    public C178739Eg(C178759Ei r21, C178749Eh r22, C178749Eh r23, C178749Eh r24, C178749Eh r25, C178749Eh r26, C178749Eh r27, C178749Eh r28, C178749Eh r29, C178749Eh r30, C178749Eh r31, C178859Es r32, AnonymousClass4A4 r33, C178699Ec r34, String str, String str2, long j) {
        C178859Es r5 = r32;
        C18070vi.A0d(r5, 21);
        String[] strArr = new String[2];
        strArr[0] = "0";
        this.A02 = C18070vi.A0O("1", strArr, 1);
        String[] strArr2 = new String[2];
        strArr2[0] = "view_once_expired";
        List A0O = C18070vi.A0O("view_once_opened", strArr2, 1);
        this.A01 = A0O;
        C29591cX A0S = AnonymousClass8BS.A0S();
        long j2 = j;
        if (C29601cY.A03(Long.valueOf(j2), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0S, "t", j2);
        }
        String str3 = str;
        AnonymousClass8BW.A1F(A0S, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, C29601cY.A04(str3, 0, 9007199254740991L, false) ? 1 : 0);
        A0S.A08(str2, "deleted_reason", A0O);
        A0S.A05(r34.BVP());
        AnonymousClass8BV.A1G(A0S, r22);
        AnonymousClass8BW.A1E(A0S, r21);
        AnonymousClass8BV.A1G(A0S, r23);
        AnonymousClass8BV.A1G(A0S, r24);
        AnonymousClass8BV.A1G(A0S, r25);
        AnonymousClass8BV.A1G(A0S, r26);
        AnonymousClass8BV.A1G(A0S, r27);
        AnonymousClass8BV.A1G(A0S, r28);
        AnonymousClass8BV.A1G(A0S, r29);
        AnonymousClass8BV.A1G(A0S, r30);
        AnonymousClass4A4 r0 = r33;
        if (r33 != null) {
            C20121A8g.A09(A0S, r0);
        }
        AnonymousClass8BV.A1G(A0S, r31);
        C20121A8g.A0A(A0S, r5);
        this.A00 = A0S.A03();
    }

    public C29621ca BVP() {
        return this.A00;
    }
}
