package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sH  reason: invalid class name and case insensitive filesystem */
public final class C171788sH extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;

    public C171788sH() {
        super(2896, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(47, this.A01);
        r3.CHf(48, this.A02);
        r3.CHf(49, this.A0N);
        r3.CHf(50, this.A03);
        r3.CHf(51, this.A04);
        r3.CHf(52, this.A05);
        r3.CHf(20, this.A0O);
        r3.CHf(42, this.A06);
        r3.CHf(21, this.A07);
        r3.CHf(38, this.A08);
        r3.CHf(39, this.A00);
        r3.CHf(34, this.A0P);
        r3.CHf(35, this.A0Q);
        r3.CHf(36, this.A0R);
        r3.CHf(2, this.A09);
        r3.CHf(26, this.A0G);
        r3.CHf(3, this.A0A);
        r3.CHf(17, this.A0B);
        r3.CHf(4, this.A0C);
        r3.CHf(16, this.A0D);
        r3.CHf(32, this.A0H);
        r3.CHf(1, this.A0S);
        r3.CHf(10, this.A0I);
        r3.CHf(8, this.A0J);
        r3.CHf(9, this.A0K);
        r3.CHf(5, this.A0E);
        r3.CHf(14, this.A0L);
        r3.CHf(11, this.A0M);
        r3.CHf(6, this.A0T);
        r3.CHf(18, this.A0F);
        r3.CHf(15, this.A0U);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(47, this.A01);
        A13.put(48, this.A02);
        A13.put(49, this.A0N);
        A13.put(50, this.A03);
        A13.put(AnonymousClass8BS.A0V(), this.A04);
        A13.put(52, this.A05);
        Object A0R2 = AnonymousClass184.A0R(A13, 40);
        C17880vN.A1O(A0R2, A13, 41);
        A13.put(AnonymousClass184.A0M(45, A0R2, A13), this.A0O);
        A13.put(AnonymousClass184.A0N(42, this.A06, A13), this.A07);
        A13.put(38, this.A08);
        A13.put(C108975cc.A0S(AnonymousClass8BV.A0Z(AnonymousClass8BV.A0Y(AnonymousClass8BV.A0X(39, this.A00, A13), this.A0P, A13), this.A0Q, A13), this.A0R, A13), this.A09);
        Object A0R3 = AnonymousClass184.A0R(A13, 43);
        C17880vN.A1O(A0R3, A13, 44);
        C17880vN.A1O(A0R3, A13, 29);
        A13.put(AnonymousClass8BV.A0R(C108975cc.A0U(C108975cc.A0W(AnonymousClass184.A0Q(AnonymousClass184.A0P(AnonymousClass184.A0O(30, A0R3, A13), A0R3, A13), A0R3, A13), A0R3, A13), A0R3, A13), A0R3, A13), this.A0G);
        AnonymousClass184.A0X(A13, 19);
        A13.put(AnonymousClass8BV.A0V(AnonymousClass184.A0I(AnonymousClass184.A06(AnonymousClass184.A0J(C17880vN.A0j(), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0H);
        AnonymousClass184.A0X(A13, 33);
        A13.put(C17880vN.A0h(), this.A0S);
        AnonymousClass184.A0X(A13, 46);
        A13.put(AnonymousClass8BS.A0U(), this.A0I);
        AnonymousClass184.A0X(A13, 27);
        A13.put(AnonymousClass184.A0D(AnonymousClass8BV.A0T(AnonymousClass184.A0E(AnonymousClass184.A0G(AnonymousClass184.A07(AnonymousClass184.A0B(AnonymousClass3MY.A0g(), this.A0J, A13), this.A0K, A13), this.A0E, A13), this.A0L, A13), (Object) null, A13), (Object) null, A13), this.A0M);
        AnonymousClass184.A0X(A13, 13);
        A13.put(C17880vN.A0m(), this.A0T);
        AnonymousClass184.A0X(A13, 7);
        A13.put(AnonymousClass184.A0H(18, this.A0F, A13), this.A0U);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDirectoryBusinessSearchConsumerClient {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "bizDirectoryEventDestination", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "bizDirectoryEventEmitter", A10);
        AnonymousClass186.A00(this.A0N, "bizDirectoryEventMetadata", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "bizDirectoryEventSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "bizDirectoryEventType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "bizDirectoryVariant", A10);
        AnonymousClass186.A00(this.A0O, "directoryBackendRankingLogicVer", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "directoryBusinessBrowsingViewType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "directoryBusinessListScreenSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "directoryBusinessListScreenType", A10);
        AnonymousClass186.A00(this.A00, "directoryFilterByDistance", A10);
        AnonymousClass186.A00(this.A0P, "directoryFilterCatalog", A10);
        AnonymousClass186.A00(this.A0Q, "directoryFilterOpeningHours", A10);
        AnonymousClass186.A00(this.A0R, "directoryFilterSelectedSubcategories", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "directoryLocationType", A10);
        AnonymousClass186.A00(this.A0G, "directoryQuerySearchVersion", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "directorySearchEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "directorySearchErrorType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0C), "directorySearchEventType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0D), "directorySearchLocationState", A10);
        AnonymousClass186.A00(this.A0H, "directorySearchLoggingVersion", A10);
        AnonymousClass186.A00(this.A0S, "directorySessionId", A10);
        AnonymousClass186.A00(this.A0I, "numberOfBusiness", A10);
        AnonymousClass186.A00(this.A0J, "numberOfRootCategory", A10);
        AnonymousClass186.A00(this.A0K, "numberOfSubCategory", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0E), "popupAllowLocationSourceScreen", A10);
        AnonymousClass186.A00(this.A0L, "rankOfSelectedBusiness", A10);
        AnonymousClass186.A00(this.A0M, "rankOfSelectedRootCategory", A10);
        AnonymousClass186.A00(this.A0T, "selectedRootCategory", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0F), "setLocationSource", A10);
        return AnonymousClass184.A0S(this.A0U, "subCategoryFilters", A10);
    }
}
