package X;

import org.json.JSONArray;
import org.json.JSONObject;

public final class B1N extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $humanReadable;
    public final /* synthetic */ String $indent;
    public final /* synthetic */ JSONObject $this_keysToString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1N(String str, JSONObject jSONObject, boolean z) {
        super(1);
        this.$this_keysToString = jSONObject;
        this.$humanReadable = z;
        this.$indent = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        StringBuilder A11;
        String str = (String) obj;
        Object obj2 = this.$this_keysToString.get(str);
        if (obj2 instanceof JSONObject) {
            A11 = AnonymousClass000.A11(str);
            A11.append(' ');
            boolean z = this.$humanReadable;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(this.$indent);
            A11.append(C181379Qg.A00(AnonymousClass000.A0y("  ", A10), (JSONObject) obj2, z));
        } else if (!(obj2 instanceof JSONArray)) {
            return str;
        } else {
            A11 = AnonymousClass000.A11(str);
            A11.append(" [");
            A11.append(((JSONArray) obj2).length());
            A11.append(']');
        }
        return A11.toString();
    }
}
