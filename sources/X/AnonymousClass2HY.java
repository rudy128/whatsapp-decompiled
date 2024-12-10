package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2HY  reason: invalid class name */
public final class AnonymousClass2HY extends AnonymousClass184 {
    public Integer A00;
    public Long A01;

    public AnonymousClass2HY() {
        super(6088, AnonymousClass184.A01(), 1, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A01);
        r3.CHf(1, this.A00);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A01 == null) {
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("restore_contacts_realtime_event_timestamp", "restore_contacts_realtime_event", C18460wS.A00));
        } else {
            arrayList = null;
        }
        if (this.A00 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("restore_contacts_realtime_event_type", "restore_contacts_realtime_event", C18460wS.A00), arrayList);
        }
        return AnonymousClass184.A0V(AnonymousClass184.A00("rrestore_contacts_realtime_event_timestamp", "restore_contacts_realtime_event", C18460wS.A00), arrayList);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(C17880vN.A0j(), this.A01, A13), this.A00);
        AnonymousClass184.A0X(A13, 2);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamRestoreContactsRealtimeEvent {");
        AnonymousClass186.A00(this.A01, "restoreContactsRealtimeEventTimestamp", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "restoreContactsRealtimeEventType", A10);
    }
}
