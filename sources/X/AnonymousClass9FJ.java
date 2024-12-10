package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9FJ  reason: invalid class name */
public final class AnonymousClass9FJ extends AnonymousClass9CP {
    public final String A00;
    public final String A01;
    public final C29621ca A02;
    public final AnonymousClass9DG A03;

    public AnonymousClass9FJ(C29621ca r26, AnonymousClass9F6 r27) {
        C29621ca r5 = r26;
        C29621ca A002 = AnonymousClass9F6.A00(r5, r27);
        C62672rm A0s = AnonymousClass8BR.A0s();
        String[] strArr = {"account", "action"};
        Class<String> cls = String.class;
        String[] strArr2 = new String[2];
        strArr2[0] = "account";
        Long A0Z = AnonymousClass8BW.A0Z("action", strArr2, 1);
        Long A0j = AnonymousClass8BU.A0j();
        Object A05 = A0s.A05(A002, cls, A0Z, A0j, (Object) null, strArr2, false);
        if (A05 != null) {
            C62672rm r17 = A0s;
            C29621ca r18 = r5;
            Class<String> cls2 = cls;
            if (r17.A05(r18, cls2, A0Z, A0j, A05, strArr, true) != null) {
                String str = (String) r17.A05(r18, cls2, 1L, AnonymousClass8BV.A0l(), (Object) null, new String[]{"account", "hpp_payment_link", "value"}, false);
                if (str != null) {
                    this.A00 = str;
                    String[] A1b = C17880vN.A1b("account", "hpp_payment_link", 3, 1);
                    A1b[2] = "success_url";
                    Long A0j2 = AnonymousClass8BV.A0j();
                    if (r17.A05(r18, cls2, 1L, A0j2, (Object) null, A1b, false) != null) {
                        String str2 = (String) r17.A05(r18, cls2, 1L, A0j2, (Object) null, new String[]{"account", "transaction", PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
                        if (str2 != null) {
                            this.A01 = str2;
                            C18070vi.A0d(A8Z.A00, 0);
                            C18070vi.A0d(A002, 1);
                            AnonymousClass9DG A003 = A8Z.A00(r5, A002, A0s);
                            if (A003 != null) {
                                this.A03 = A003;
                                this.A00 = r5;
                                String[] A1b2 = C17880vN.A1b("account", "hpp_payment_link", 2, 1);
                                C29621ca A0L = r5.A0L(A1b2[0]);
                                String str3 = A1b2[1];
                                List A0R = A0L.A0R(str3);
                                ArrayList A0t = C108965cb.A0t(A0R);
                                Iterator it = A0R.iterator();
                                while (it.hasNext()) {
                                    AnonymousClass8BX.A1M(A0t, it);
                                }
                                if (AnonymousClass8BR.A06(A0t) < 1) {
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    AnonymousClass8BY.A1K(str3, A10, A0t);
                                    throw C198999zG.A01(A10);
                                } else if (AnonymousClass8BR.A06(A0t) <= 1) {
                                    this.A02 = AnonymousClass8BR.A0m(A0t, 0);
                                } else {
                                    StringBuilder A102 = AnonymousClass000.A10();
                                    AnonymousClass8BY.A1J(str3, A102, A0t);
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
            } else {
                throw AnonymousClass1O9.A00(A0s);
            }
        } else {
            throw AnonymousClass1O9.A00(A0s);
        }
    }
}
