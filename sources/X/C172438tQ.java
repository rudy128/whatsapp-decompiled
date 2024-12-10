package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8tQ  reason: invalid class name and case insensitive filesystem */
public final class C172438tQ extends AnonymousClass7IA {
    public final C193349pw A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172438tQ(X.AnonymousClass181 r13, X.C193349pw r14, X.C19830z4 r15, X.C18030ve r16, X.AnonymousClass00H r17) {
        /*
            r12 = this;
            r1 = r13
            r2 = r15
            r3 = r16
            X.C18070vi.A0o(r3, r13, r15)
            r0 = 4
            r5 = r17
            X.C18070vi.A0d(r5, r0)
            X.AlQ r8 = X.C21517AlQ.A00(r0)
            r0 = 5
            X.AlQ r9 = X.C21517AlQ.A00(r0)
            r4 = 0
            r10 = 5094142160706930(0x12191865ec9d72, double:2.5168406366367925E-308)
            r0 = r12
            r6 = r4
            r7 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.A00 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172438tQ.<init>(X.181, X.9pw, X.0z4, X.0ve, X.00H):void");
    }

    public void A0A(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        C193349pw r7 = this.A00;
        JSONObject A15 = C17880vN.A15();
        List<C193339pv> list = r7.A01;
        ArrayList A0D = C29351c6.A0D(list);
        for (C193339pv r3 : list) {
            JSONObject A152 = C17880vN.A15();
            A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3.A00);
            A152.put("version", r3.A01);
            A0D.add(A152);
        }
        A15.put("model_request_metadatas", new JSONArray(A0D));
        C195099sn r5 = r7.A00;
        JSONObject A153 = C17880vN.A15();
        A153.put("bytecodeVersion", new JSONArray(r5.A00));
        A153.put("cachedModelAssets", new JSONArray(r5.A01));
        List list2 = r5.A02;
        ArrayList A0E = C29351c6.A0E(list2);
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0s("toJson");
        }
        A153.put("cachedModelMetadatas", new JSONArray(A0E));
        List list3 = r5.A03;
        ArrayList A0E2 = C29351c6.A0E(list3);
        Iterator it2 = list3.iterator();
        if (it2.hasNext()) {
            it2.next();
            throw AnonymousClass000.A0s("toJson");
        }
        A153.put("operators", new JSONArray(A0E2));
        A153.put("operatorsHash", (Object) null);
        List<ARRequestAsset$CompressionMethod> list4 = r5.A04;
        ArrayList A0E3 = C29351c6.A0E(list4);
        for (ARRequestAsset$CompressionMethod compressionMethod : list4) {
            A0E3.add(compressionMethod.getCompressionMethod());
        }
        A153.put("supportedCompressions", new JSONArray(A0E3));
        A153.put("vulkan_version", (Object) null);
        AnonymousClass8BT.A1N(A153, "client_capability_metadata", A15, jSONObject);
    }
}
