package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.966  reason: invalid class name */
public class AnonymousClass966 extends AnonymousClass96K {
    public static final AnonymousClass1KJ A0K = AnonymousClass1KL.A0B;
    public final AnonymousClass11P A00;
    public final C31061ex A01;
    public final A8C A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public void A0h(List list) {
        AnonymousClass9O4 r4;
        AnonymousClass9NU r1 = this.A06;
        C17960vV.A07(r1);
        AW0 aw0 = r1.A01;
        C170318pf A0C2 = AnonymousClass8BS.A0C(aw0);
        boolean A1W = AnonymousClass000.A1W(this.A0G);
        C20284AEs aEs = r1.A00;
        C196219ue r0 = A0C2.A0H;
        List list2 = list;
        if (r0 != null && (r4 = r0.A0C) != null && "UNKNOWN".equals(r4.A08) && "INIT".equals(r4.A09) && A1W) {
            boolean A1P = AnonymousClass000.A1P((this.A02.A06(this.A0H, false) > A0C2.A0H.A01 ? 1 : (this.A02.A06(this.A0H, false) == A0C2.A0H.A01 ? 0 : -1)));
            boolean equals = C20061A5k.A00(this.A0A, "moneyStringValue").equals(A0C2.A0H.A09);
            if (A1P && equals) {
                this.A08.A0F(new C198789yu(114));
                A0v(aw0, A0C2, list);
                A0z(aw0, list);
                A0w(aw0, A0C2, list);
                C1767195h r12 = new C1767195h();
                r12.A02 = this.A06;
                r12.A01 = this;
                r12.A00 = AnonymousClass8BU.A0U(this.A0c).BQ8();
                list.add(r12);
                A0x(aw0, A0C2, list);
                A0j(list);
                C161588Gc.A05(list);
                A0u(aEs, aw0, A0C2, list2, A1W);
                C161588Gc.A05(list);
                A0p(list);
                C161588Gc.A05(list);
                list.add(new C183409Yd(1007));
            }
        }
        A0y(aw0, A0C2, list, true);
        A0v(aw0, A0C2, list);
        A0z(aw0, list);
        A0w(aw0, A0C2, list);
        C1767195h r122 = new C1767195h();
        r122.A02 = this.A06;
        r122.A01 = this;
        r122.A00 = AnonymousClass8BU.A0U(this.A0c).BQ8();
        list.add(r122);
        A0x(aw0, A0C2, list);
        A0j(list);
        C161588Gc.A05(list);
        A0u(aEs, aw0, A0C2, list2, A1W);
        C161588Gc.A05(list);
        A0p(list);
        C161588Gc.A05(list);
        list.add(new C183409Yd(1007));
    }

    public boolean A0s() {
        return false;
    }

    public AnonymousClass966(Bundle bundle, AnonymousClass1KB r4, AnonymousClass11S r5, AnonymousClass18O r6, C26911Ty r7, C37551pj r8, AnonymousClass1M9 r9, AnonymousClass11C r10, AnonymousClass11P r11, AnonymousClass118 r12, C18000vb r13, AnonymousClass122 r14, C26021Qn r15, C58842lL r16, AnonymousClass1QR r17, AnonymousClass1KI r18, AnonymousClass1KH r19, C18030ve r20, AnonymousClass1OZ r21, C196199uc r22, C20752AXh aXh, A7U a7u, AXS axs, C20080A6g a6g, C33301ib r27, AnonymousClass1QL r28, C33711jG r29, AnonymousClass1QD r30, AnonymousClass2L2 r31, C31061ex r32, AnonymousClass1QO r33, AnonymousClass1QS r34, C33651jA r35, A27 a27, BD4 bd4, AQF aqf, C33351ig r39, C85754Op r40, A56 a56, AnonymousClass90Z r42, A4C a4c, A8C a8c, C30931ek r45, AnonymousClass1R2 r46, C30951em r47, AnonymousClass10I r48) {
        super(bundle, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, aXh, a7u, axs, a6g, r27, r28, r29, r30, r31, r32, r33, r34, r35, a27, bd4, aqf, r39, r40, a56, r42, a4c, a8c, r45, r46, r47, r48);
        String A0y;
        String A0y2;
        String A0y3;
        this.A00 = r11;
        this.A02 = a8c;
        this.A01 = r32;
        this.A0C = bundle.getString("extra_new_mandate_transaction_ref");
        String string = bundle.getString("extra_new_mandate_payee_name");
        string.getClass();
        this.A09 = string;
        String string2 = bundle.getString("extra_new_mandate_preset_amount");
        string2.getClass();
        this.A0A = string2;
        this.A08 = bundle.getString("extra_new_mandate_merchant_code");
        String string3 = bundle.getString("extra_new_mandate_purpose_code");
        string3.getClass();
        this.A0B = string3;
        String string4 = bundle.getString("extra_new_mandate_vpa");
        string4.getClass();
        this.A0J = string4;
        String string5 = bundle.getString("extra_new_mandate_amount_rule");
        if (string5 == null) {
            A0y = null;
        } else {
            A0y = C108955ca.A0y(string5);
        }
        this.A03 = A0y;
        this.A07 = bundle.getString("extra_new_mandate_mandate_name");
        String string6 = bundle.getString("extra_new_mandate_validity_start");
        string6.getClass();
        this.A0I = string6;
        String string7 = bundle.getString("extra_new_mandate_validity_end");
        string7.getClass();
        this.A0H = string7;
        String string8 = bundle.getString("extra_new_mandate_frequency");
        if (string8 == null) {
            A0y2 = null;
        } else {
            A0y2 = C108955ca.A0y(string8);
        }
        A0y2.getClass();
        this.A05 = A0y2;
        this.A0C = bundle.getString("extra_new_mandate_recurrence_day");
        String string9 = bundle.getString("extra_new_mandate_recurrence_rule");
        if (string9 == null) {
            A0y3 = null;
        } else {
            A0y3 = C108955ca.A0y(string9);
        }
        this.A0D = A0y3;
        this.A0E = bundle.getString("extra_new_mandate_rev");
        this.A0F = bundle.getString("extra_new_mandate_share");
        this.A0G = bundle.getString("extra_new_mandate_unique_mandate_number");
        this.A04 = bundle.getString("extra_update_mandate_transaction_id");
        this.A06 = bundle.getString("extra_new_mandate_initiation_mode");
    }
}
