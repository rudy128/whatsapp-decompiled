package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.20S  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass20S {
    public static List A00(AnonymousClass20O r5, JSONArray jSONArray) {
        AnonymousClass3Gu r4 = new AnonymousClass3Gu(r5, 0);
        if (jSONArray == null) {
            return C18460wS.A00;
        }
        C25411Oc A08 = C28851b7.A08(0, jSONArray.length());
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            JSONObject optJSONObject = jSONArray.optJSONObject(((AnonymousClass20T) it).A00());
            if (optJSONObject != null) {
                arrayList.add(optJSONObject);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object invoke : arrayList) {
            Object invoke2 = r4.invoke(invoke);
            if (invoke2 != null) {
                arrayList2.add(invoke2);
            }
        }
        return arrayList2;
    }

    public static JSONArray A01(AnonymousClass20O r4, List list) {
        if (list.isEmpty()) {
            return null;
        }
        C21728Are are = new C21728Are(r4, 12);
        JSONArray jSONArray = new JSONArray();
        ArrayList<Object> arrayList = new ArrayList<>();
        for (Object invoke : list) {
            arrayList.add(are.invoke(invoke));
        }
        for (Object put : arrayList) {
            jSONArray.put(put);
        }
        return jSONArray;
    }
}
