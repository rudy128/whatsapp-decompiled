package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3za  reason: invalid class name and case insensitive filesystem */
public final class C81653za extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public C81653za() {
        super(2350, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(3, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(4, this.A05);
        r3.CHf(1, this.A06);
        r3.CHf(7, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A03(AnonymousClass184.A06(AnonymousClass184.A04(AnonymousClass184.A05(AnonymousClass184.A07(C17880vN.A0m(), this.A03, A13), this.A04, A13), this.A00, A13), this.A01, A13), this.A05, A13), this.A06, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStorageManagement {");
        AnonymousClass186.A00(this.A03, "storageManagementDeletedNumFiles", A10);
        AnonymousClass186.A00(this.A04, "storageManagementDeletedSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "storageManagementEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "storageManagementEventType", A10);
        AnonymousClass186.A00(this.A05, "storageManagementOverallSize", A10);
        AnonymousClass186.A00(this.A06, "storageManagementSessionId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "storageManagementVersion", A10);
    }
}
