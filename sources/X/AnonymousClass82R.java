package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.82R  reason: invalid class name */
public final class AnonymousClass82R extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $shapes;
    public final /* synthetic */ C1196569h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82R(C1196569h r2, List list) {
        super(1);
        this.this$0 = r2;
        this.$shapes = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        JSONArray jSONArray = (JSONArray) obj;
        C18070vi.A0d(jSONArray, 0);
        List<C123436Ul> list = this.this$0.A00;
        List list2 = this.$shapes;
        for (C123436Ul r3 : list) {
            JSONObject A15 = C17880vN.A15();
            C1409773u r1 = r3.A00;
            C18070vi.A0d(list2, 0);
            A15.put("shape_index", list2.indexOf(r1));
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r3.A00());
            r3.A02(list2, A15);
            jSONArray.put(A15);
        }
        return C27621Wu.A00;
    }
}
