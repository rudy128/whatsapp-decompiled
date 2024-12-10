package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Hf  reason: invalid class name and case insensitive filesystem */
public final class C47132Hf extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;

    public C47132Hf() {
        super(5944, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A03);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A00 == null) {
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("contextual_age_collection_action_taken", "contextual_age_collection_event", C18460wS.A00));
        } else {
            arrayList = null;
        }
        if (this.A02 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("contextual_age_collection_current_screen", "contextual_age_collection_event", C18460wS.A00), arrayList);
        }
        if (this.A03 == null) {
            C59552mU A002 = AnonymousClass184.A00("contextual_age_collection_event_name", "contextual_age_collection_event", C18460wS.A00);
            if (arrayList != null) {
                arrayList.add(A002);
                return arrayList;
            }
            arrayList = AnonymousClass184.A0U(A002);
        }
        if (arrayList == null) {
            return C18460wS.A00;
        }
        return arrayList;
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamContextualAgeCollectionEvent {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "contextualAgeCollectionActionTaken", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "contextualAgeCollectionClientErrorType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "contextualAgeCollectionCurrentScreen", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "contextualAgeCollectionEventName", A10);
    }
}
