package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63E  reason: invalid class name */
public final class AnonymousClass63E extends AnonymousClass184 {
    public Boolean A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public AnonymousClass63E() {
        super(2810, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(1, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(3, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(AnonymousClass184.A06(AnonymousClass184.A03(C108975cc.A0S(C17880vN.A0l(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamArchiveStateDaily {");
        AnonymousClass186.A00(this.A00, "settingsKeepChatsArchived", A10);
        AnonymousClass186.A00(this.A01, "totalGroupArchivedChats", A10);
        AnonymousClass186.A00(this.A02, "totalIndividualArchivedChats", A10);
        AnonymousClass186.A00(this.A03, "totalUnreadGroupArchivedChats", A10);
        return AnonymousClass184.A0S(this.A04, "totalUnreadIndividualArchivedChats", A10);
    }
}
