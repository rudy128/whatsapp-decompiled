package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9FS  reason: invalid class name */
public final class AnonymousClass9FS extends AnonymousClass9CP implements B6J {
    public final List A00;
    public final C29621ca A01;
    public final AnonymousClass9DG A02;

    public AnonymousClass9FS(C29621ca r43, AnonymousClass9F6 r44) {
        StringBuilder A10;
        AnonymousClass9F6 r0 = r44;
        C18070vi.A0d(r0, 2);
        C29621ca r2 = r43;
        C29621ca A002 = AnonymousClass9F6.A00(r2, r0);
        C62672rm A0s = AnonymousClass8BR.A0s();
        Class<String> cls = String.class;
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        C62672rm r21 = A0s;
        r21.A05(r2, cls, A0i, A0j, "true", new String[]{"integrator_list", "opted_in"}, false);
        C18070vi.A0d(A8H.A00, 0);
        C18070vi.A0d(A002, 1);
        AnonymousClass9DG A012 = A8H.A01(r2, A002, A0s);
        if (A012 != null) {
            this.A02 = A012;
            String[] strArr = {"integrator_list", "integrator"};
            C29621ca A0Q = AnonymousClass8BS.A0Q(r2, strArr, 0);
            if (A0Q == null) {
                A10 = AnonymousClass000.A10();
                AnonymousClass8BY.A12(r2, A10, strArr, 0);
            } else {
                String str = strArr[1];
                List A0R = A0Q.A0R(str);
                ArrayList A0t = C108965cb.A0t(A0R);
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    C29621ca A0R2 = AnonymousClass8BW.A0R(it, 1);
                    if (A0s.A09(A0R2, "integrator")) {
                        String[] strArr2 = new String[3];
                        strArr2[0] = "active";
                        strArr2[1] = "onboarding";
                        String A07 = A0s.A07(A0R2, C18070vi.A0O("removed", strArr2, 2), new String[]{"status"});
                        if (A07 != null) {
                            String[] strArr3 = new String[3];
                            strArr3[0] = "email";
                            strArr3[1] = "pn";
                            String A072 = A0s.A07(A0R2, C18070vi.A0O("username", strArr3, 2), new String[]{"identifier_type"});
                            String[] A1W = AnonymousClass8BS.A1W(1, 0);
                            Class cls2 = Long.TYPE;
                            Long A0X = C108975cc.A0X();
                            C62672rm r27 = A0s;
                            C29621ca r28 = A0R2;
                            Number number = (Number) r27.A05(r28, cls2, A0X, 999L, (Object) null, A1W, false);
                            if (number != null) {
                                long longValue = number.longValue();
                                Class<String> cls3 = cls;
                                String str2 = (String) r27.A05(r28, cls3, A0X, AnonymousClass8BV.A0f(), (Object) null, AnonymousClass8BS.A1T(1), false);
                                if (str2 != null) {
                                    String str3 = (String) r27.A05(r28, cls3, A0i, A0j, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ICON}, false);
                                    if (str3 != null) {
                                        A0t.add(new C827649z(A0R2, A07, A072, str2, str3, (String) r21.A05(A0R2, cls, A0i, A0j, "true", new String[]{"opted_in"}, false), longValue));
                                    }
                                }
                            }
                        }
                    }
                }
                if (AnonymousClass8BR.A06(A0t) < 0) {
                    A10 = AnonymousClass000.A10();
                    AnonymousClass8BY.A1K(str, A10, A0t);
                    A10.append(0);
                } else if (AnonymousClass8BR.A06(A0t) > 999) {
                    A10 = AnonymousClass000.A10();
                    AnonymousClass8BY.A1J(str, A10, A0t);
                    A10.append(999);
                } else {
                    this.A00 = A0t;
                    this.A00 = r2;
                    String str4 = new String[]{"integrator_list"}[0];
                    List A0R3 = r2.A0R(str4);
                    ArrayList A0t2 = C108965cb.A0t(A0R3);
                    Iterator it2 = A0R3.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass8BX.A1M(A0t2, it2);
                    }
                    if (AnonymousClass8BR.A06(A0t2) < 1) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        AnonymousClass8BY.A1K(str4, A102, A0t2);
                        throw C198999zG.A01(A102);
                    } else if (AnonymousClass8BR.A06(A0t2) <= 1) {
                        this.A01 = AnonymousClass8BR.A0m(A0t2, 0);
                        return;
                    } else {
                        StringBuilder A103 = AnonymousClass000.A10();
                        AnonymousClass8BY.A1J(str4, A103, A0t2);
                        throw C198999zG.A01(A103);
                    }
                }
                A10.append('.');
            }
            throw AnonymousClass1UI.A01(A10.toString());
        }
        throw AnonymousClass1O9.A00(A0s);
    }
}
