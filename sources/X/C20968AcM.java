package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.AcM  reason: case insensitive filesystem */
public final class C20968AcM implements AnonymousClass1O5 {
    public final AnonymousClass190 A00;
    public final C31761g5 A01;

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        AnonymousClass8BT.A1P(C30691eM.A00(new AnonymousClass9L7(str)), this.A01);
    }

    public void C7Z(C29621ca r18, String str) {
        C29621ca r1 = r18;
        boolean A16 = C18070vi.A16(str, r1);
        ArrayList A13 = AnonymousClass000.A13();
        C29621ca A0K = r1.A0K("sub_groups");
        if (A0K != null) {
            Iterator A0r = AnonymousClass8BW.A0r(A0K, "group");
            while (true) {
                if (A0r.hasNext()) {
                    C29621ca A0a = C17880vN.A0a(A0r);
                    try {
                        AnonymousClass1EC A02 = C22971Dz.A02(AnonymousClass8BT.A0u(A0a, PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null));
                        C18070vi.A0X(A02);
                        String A0Q = A0a.A0Q("subject", (String) null);
                        long A022 = C20099A7c.A02(A0a.A0Q("s_t", (String) null));
                        int A023 = A8d.A02(A0a);
                        if (A023 == 0) {
                            A023 = 2;
                        }
                        if (A0Q == null) {
                            A0Q = "";
                        }
                        A13.add(new A2B(A02, (Integer) null, (Integer) null, (Long) null, A0Q, A023, A022));
                    } catch (AnonymousClass11T e) {
                        C17960vV.A0B(e);
                        this.A00.A0G("Connection/handleInvalidJidReceived", "invalid-jid-received", A16);
                        AnonymousClass8BT.A1P(C108945cZ.A1J(e), this.A01);
                    }
                } else {
                    AnonymousClass8BT.A1P(A13, this.A01);
                    return;
                }
            }
        }
    }

    public C20968AcM(AnonymousClass190 r1, C31761g5 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Bt9(C29621ca r3, String str) {
        C18070vi.A0h(str, r3);
        AnonymousClass8BT.A1P(C30691eM.A00(new C122936Sm(r3, str)), this.A01);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
