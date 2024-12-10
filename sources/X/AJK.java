package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class AJK implements OnSuccessListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C33931jc A01;

    public final void onSuccess(Object obj) {
        List<C23073Bao> asList;
        C33931jc r9 = this.A01;
        int i = this.A00;
        C23084Baz baz = ((AJB) ((C22567BDg) ((C54) obj).A00)).A00;
        if (baz == null) {
            asList = Collections.emptyList();
        } else {
            asList = Arrays.asList(baz.A03);
        }
        int size = asList.size();
        ArrayList A13 = AnonymousClass000.A13();
        int i2 = 0;
        for (C23073Bao bao : asList) {
            if (i2 >= i) {
                break;
            }
            A13.add(new C186269dv(bao.A01, AnonymousClass1EG.A0G(bao.A02), bao.A00));
            i2++;
        }
        C33921jb r3 = r9.A03;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("sendmethods/sendSafetyNetVerifyAppsResult appsListSize=");
        A10.append(Integer.valueOf(A13.size()));
        A10.append(" errorCode=");
        A10.append(0);
        C17900vP.A0f(" errorMessage=", (String) null, A10);
        C29591cX A0t = C108945cZ.A0t("apps");
        C108965cb.A1H(A0t, "actual_count", size);
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            C186269dv r4 = (C186269dv) it.next();
            C29591cX A0t2 = C108945cZ.A0t("item");
            C29591cX.A01(A0t2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r4.A01);
            C29591cX.A01(A0t2, "hash", r4.A02);
            C108965cb.A1H(A0t2, "category", r4.A00);
            C108955ca.A1P(A0t2, A0t);
        }
        C29621ca A03 = A0t.A03();
        C29591cX A0t3 = C108945cZ.A0t("verify_apps");
        A0t3.A05(A03);
        C29621ca A032 = A0t3.A03();
        C29591cX A0t4 = C108945cZ.A0t("ib");
        A0t4.A05(A032);
        C17880vN.A0U(r3.A00).A0O(A0t4.A03(), 273);
    }

    public /* synthetic */ AJK(C33931jc r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
