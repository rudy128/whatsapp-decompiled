package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9FH  reason: invalid class name */
public final class AnonymousClass9FH extends AnonymousClass9CP {
    public final C29621ca A00;
    public final AnonymousClass9DB A01;
    public final byte[] A02;

    public AnonymousClass9FH(C29621ca r16, AnonymousClass9F5 r17) {
        AnonymousClass9F5 r0 = r17;
        C18070vi.A0d(r0, 2);
        C29621ca r8 = r16;
        C29621ca A03 = C20121A8g.A03(r8, r0);
        C62672rm A0s = AnonymousClass8BR.A0s();
        String[] strArr = new String[2];
        strArr[0] = "image";
        if (A0s.A07(r8, C18070vi.A0O("preview", strArr, 1), new String[]{"picture", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE}) != null) {
            A0s.A07(r8, AnonymousClass8BX.A0n(1), new String[]{"picture", "has_staging"});
            if (A0s.A05(r8, String.class, 1L, AnonymousClass8BV.A0e(), (Object) null, new String[]{"picture", PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false) != null) {
                String[] strArr2 = new String[2];
                AnonymousClass8BR.A1K(strArr2, 0, 1, "picture");
                byte[] bArr = (byte[]) A0s.A04(r8, byte[].class, 1L, AnonymousClass8BU.A0j(), (Object) null, strArr2);
                if (bArr != null) {
                    this.A02 = bArr;
                    C18070vi.A0d(C20022A3o.A00, 0);
                    C18070vi.A0d(A03, 1);
                    AnonymousClass9DB A002 = C20022A3o.A00(r8, A03, A0s);
                    if (A002 != null) {
                        this.A01 = A002;
                        this.A00 = r8;
                        String str = new String[]{"picture"}[0];
                        List A0R = r8.A0R(str);
                        ArrayList A0t = C108965cb.A0t(A0R);
                        Iterator it = A0R.iterator();
                        while (it.hasNext()) {
                            AnonymousClass8BX.A1M(A0t, it);
                        }
                        if (AnonymousClass8BR.A06(A0t) < 1) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            AnonymousClass8BY.A1K(str, A10, A0t);
                            throw C198999zG.A01(A10);
                        } else if (AnonymousClass8BR.A06(A0t) <= 1) {
                            this.A00 = AnonymousClass8BR.A0m(A0t, 0);
                        } else {
                            StringBuilder A102 = AnonymousClass000.A10();
                            AnonymousClass8BY.A1J(str, A102, A0t);
                            throw C198999zG.A01(A102);
                        }
                    } else {
                        throw AnonymousClass1O9.A00(A0s);
                    }
                } else {
                    throw AnonymousClass1O9.A00(A0s);
                }
            } else {
                throw AnonymousClass1O9.A00(A0s);
            }
        } else {
            throw AnonymousClass1O9.A00(A0s);
        }
    }
}
