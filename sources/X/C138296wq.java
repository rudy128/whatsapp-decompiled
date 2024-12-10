package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.6wq  reason: invalid class name and case insensitive filesystem */
public final class C138296wq {
    public final C19830z4 A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public static final void A00(AnonymousClass89C r18, C138296wq r19, AnonymousClass1NV r20, boolean z) {
        String str;
        C138296wq r2 = r19;
        AnonymousClass00H r7 = r2.A03;
        String A0T = C17890vO.A0T(r7);
        boolean z2 = z;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        String A0j = r2.A00.A0j();
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "false";
        List A0O = C18070vi.A0O("true", A1Z, 1);
        C29591cX A0Y = C108955ca.A0Y();
        C108995ce.A1E(A0Y);
        C29591cX.A01(A0Y, "xmlns", "urn:xmpp:whatsapp:account");
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        if (C29601cY.A04(A0T, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T);
        }
        C29591cX A0t = C108945cZ.A0t("first_party_migration");
        if (A0j != null && C29601cY.A04(A0j, 0, 9007199254740991L, true)) {
            C29591cX.A01(A0t, "device_id", A0j);
        }
        A0t.A09(str, "intent", A0O);
        C17880vN.A0U(r7).A0I(new AnonymousClass7LW(r18, r2, r20, z2), C29591cX.A00(A0t, A0Y), A0T, 357, 32000);
    }

    public C138296wq(C19830z4 r1, AnonymousClass10I r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r3, r1, r4);
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = r1;
        this.A02 = r4;
    }
}
