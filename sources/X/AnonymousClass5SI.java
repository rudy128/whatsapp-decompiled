package X;

import org.json.JSONArray;

/* renamed from: X.5SI  reason: invalid class name */
public final class AnonymousClass5SI extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ JSONArray $clientFiltersJSON;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SI(JSONArray jSONArray) {
        super(1);
        this.$clientFiltersJSON = jSONArray;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        String string = this.$clientFiltersJSON.getString(A0M);
        C18070vi.A0X(string);
        for (AnonymousClass4DT r1 : AnonymousClass4DT.values()) {
            if (C18070vi.A18(r1.label, string)) {
                return r1;
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Not a valid client filter: ");
        throw AnonymousClass001.A12(this.$clientFiltersJSON.getString(A0M), A10);
    }
}
