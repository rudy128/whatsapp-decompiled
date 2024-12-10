package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.370  reason: invalid class name */
public final class AnonymousClass370 implements AnonymousClass1O5 {
    public final AnonymousClass00H A00;
    public final C37531ph A01;
    public final AnonymousClass11P A02;

    public void BrD(String str) {
    }

    public void Bt9(C29621ca r8, String str) {
        long A05;
        TimeUnit timeUnit;
        long j;
        C18070vi.A0d(r8, 1);
        int A002 = C60482o6.A00(r8);
        C37531ph r6 = this.A01;
        if (A002 == 404) {
            r6.A01(-1);
            return;
        }
        int A003 = C17890vO.A00(C37531ph.A00(r6), "biz_block_reasons_api_back_off_days");
        if (A003 == 0) {
            r6.A01(1);
            A05 = AnonymousClass11P.A01(this.A02);
            timeUnit = TimeUnit.DAYS;
            j = 1;
        } else if (1 <= A003 && A003 < 16) {
            r6.A01(A003 * 2);
            A05 = C17890vO.A05(C37531ph.A00(r6), "biz_block_reasons_api_cooling_timestamp");
            timeUnit = TimeUnit.DAYS;
            j = (long) A003;
        } else {
            return;
        }
        C17880vN.A1D(C37531ph.A00(r6).edit(), "biz_block_reasons_api_cooling_timestamp", A05 + timeUnit.toMillis(j));
    }

    public void C7Z(C29621ca r12, String str) {
        String A0M;
        C18070vi.A0d(r12, 1);
        C29621ca A0K = r12.A0K("mobile_config");
        if (A0K != null) {
            C29621ca A0K2 = A0K.A0K("list");
            if (!(A0K2 == null || A0K2.A02 == null || !"biz_block_reasons".equals(A0K2.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null)))) {
                int A012 = C20099A7c.A01(A0K2.A0Q("v", (String) null), 0);
                String A0Q = A0K2.A0Q("language", (String) null);
                if (A012 > 0 && A0Q != null) {
                    List A0R = A0K2.A0R("item");
                    C18070vi.A0X(A0R);
                    ArrayList A13 = AnonymousClass000.A13();
                    Iterator it = A0R.iterator();
                    while (it.hasNext()) {
                        C29621ca A0a = C17880vN.A0a(it);
                        String A0Q2 = A0a.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                        if (!(A0Q2 == null || (A0M = A0a.A0M()) == null)) {
                            AnonymousClass1D6.A02(A0Q2, A0M, A13);
                        }
                    }
                    Map A0D = AnonymousClass1D7.A0D(A13);
                    if (!A0D.isEmpty()) {
                        String A0Q3 = A0K2.A0Q("country", (String) null);
                        C37531ph r5 = this.A01;
                        C17880vN.A1C(C37531ph.A00(r5).edit(), "biz_block_reasons_version", A012);
                        C17880vN.A1E(C37531ph.A00(r5).edit(), "biz_block_reasons_language", A0Q);
                        C17880vN.A1E(C37531ph.A00(r5).edit(), "biz_block_reasons_country", A0Q3);
                        C17880vN.A1E(C37531ph.A00(r5).edit(), "biz_block_reasons", new JSONObject(A0D).toString());
                    }
                }
            }
            C37531ph r0 = this.A01;
            r0.A01(0);
            C17880vN.A1D(C37531ph.A00(r0).edit(), "biz_block_reasons_api_cooling_timestamp", 0);
        }
    }

    public AnonymousClass370(C37531ph r1, AnonymousClass11P r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r1;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
