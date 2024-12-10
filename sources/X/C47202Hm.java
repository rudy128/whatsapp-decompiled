package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Hm  reason: invalid class name and case insensitive filesystem */
public final class C47202Hm extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;

    public C47202Hm() {
        super(5966, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A07);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A08);
        r3.CHf(4, this.A09);
        r3.CHf(5, this.A0A);
        r3.CHf(6, this.A00);
        r3.CHf(7, this.A01);
        r3.CHf(8, this.A0B);
        r3.CHf(9, this.A04);
        r3.CHf(10, this.A0C);
        r3.CHf(11, this.A05);
        r3.CHf(12, this.A0D);
        r3.CHf(13, this.A06);
        r3.CHf(14, this.A02);
        r3.CHf(15, this.A0E);
        r3.CHf(16, this.A0F);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A07 == null) {
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("app_session_id", "md_syncd_bundle", C18460wS.A00));
        } else {
            arrayList = null;
        }
        if (this.A03 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("bundle_version", "md_syncd_bundle", C18460wS.A00), arrayList);
        }
        if (this.A08 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("companion_session_ids", "md_syncd_bundle", C18460wS.A00), arrayList);
        }
        if (this.A09 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("computed_lthash", "md_syncd_bundle", C18460wS.A00), arrayList);
        }
        if (this.A00 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("mutation_bundle", "md_syncd_bundle", C18460wS.A00), arrayList);
        }
        if (this.A01 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("mutation_direction", "md_syncd_bundle", C18460wS.A00), arrayList);
        }
        if (this.A05 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("seq_number", "md_syncd_bundle", C18460wS.A00), arrayList);
        }
        if (this.A0D == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("snapshot_mac", "md_syncd_bundle", C18460wS.A00), arrayList);
        }
        if (this.A02 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("syncd_collection", "md_syncd_bundle", C18460wS.A00), arrayList);
        }
        if (this.A0E == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("syncd_keyhash", "md_syncd_bundle", C18460wS.A00), arrayList);
        }
        if (this.A0F == null) {
            C59552mU A002 = AnonymousClass184.A00("syncd_keyid", "md_syncd_bundle", C18460wS.A00);
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
        A13.put(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A07, A13), this.A03, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A00, A13), this.A01, A13), this.A0B, A13), this.A04, A13), this.A0C, A13), this.A05, A13), this.A0D, A13), this.A06, A13), this.A02, A13), this.A0E, A13), this.A0F);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdSyncdBundle {");
        AnonymousClass186.A00(this.A07, "appSessionId", A10);
        AnonymousClass186.A00(this.A03, "bundleVersion", A10);
        AnonymousClass186.A00(this.A08, "companionSessionIds", A10);
        AnonymousClass186.A00(this.A09, "computedLthash", A10);
        AnonymousClass186.A00(this.A0A, "expectedMac", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "mutationBundle", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "mutationDirection", A10);
        AnonymousClass186.A00(this.A0B, "patchMac", A10);
        AnonymousClass186.A00(this.A04, "patchSize", A10);
        AnonymousClass186.A00(this.A0C, "processingErrorMessage", A10);
        AnonymousClass186.A00(this.A05, "seqNumber", A10);
        AnonymousClass186.A00(this.A0D, "snapshotMac", A10);
        AnonymousClass186.A00(this.A06, "snapshotSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "syncdCollection", A10);
        AnonymousClass186.A00(this.A0E, "syncdKeyhash", A10);
        return AnonymousClass184.A0S(this.A0F, "syncdKeyid", A10);
    }
}
