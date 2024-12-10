package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.9uc  reason: invalid class name and case insensitive filesystem */
public class C196199uc {
    public long A00 = -1;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass118 A03;
    public final A7U A04;
    public final AXS A05;
    public final AnonymousClass1QD A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final Set A09 = C17880vN.A12();
    public final C37491pd A0A;

    public synchronized HashSet A00() {
        HashSet A12;
        A12 = C17880vN.A12();
        for (C192269o5 r0 : this.A09) {
            A12.add((String) r0.A00.A00);
        }
        return A12;
    }

    public synchronized void A02(C1418477e r6, boolean z) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: IndiaUpiBlockListManager before block vpa: ");
        A10.append(r6);
        C17900vP.A0n(" blocked: ", A10, z);
        if (z) {
            C192269o5 r2 = new C192269o5(r6, this);
            Set<C192269o5> set = this.A09;
            if (!set.contains(r2)) {
                set.add(r2);
                C17900vP.A0Y(r2, "PAY: IndiaUpiBlockListManager add vpa: ", AnonymousClass000.A10());
                AnonymousClass1QD r3 = this.A06;
                HashSet A12 = C17880vN.A12();
                for (C192269o5 r0 : set) {
                    A12.add(r0.A00.A00);
                }
                r3.A0L(TextUtils.join(";", A12));
            }
        } else {
            C192269o5 r22 = new C192269o5(r6, this);
            Set<C192269o5> set2 = this.A09;
            if (set2.contains(r22)) {
                set2.remove(r22);
                C17900vP.A0Y(r22, "PAY: IndiaUpiBlockListManager remove vpa: ", AnonymousClass000.A10());
                AnonymousClass1QD r32 = this.A06;
                HashSet A122 = C17880vN.A12();
                for (C192269o5 r02 : set2) {
                    A122.add(r02.A00.A00);
                }
                r32.A0L(TextUtils.join(";", A122));
            }
        }
    }

    public synchronized boolean A03() {
        return AnonymousClass000.A1O((this.A00 > -1 ? 1 : (this.A00 == -1 ? 0 : -1)));
    }

    public synchronized boolean A04(C1418477e r3) {
        return this.A09.contains(new C192269o5(r3, this));
    }

    public void A01(Activity activity, B8Y b8y, C31061ex r29, String str, boolean z) {
        String str2;
        String str3;
        int i;
        C37491pd r2 = this.A0A;
        AnonymousClass11E r1 = r2.A01;
        boolean z2 = z;
        if (!r1.A09()) {
            if (AnonymousClass11E.A02(r1.A01.A00)) {
                i = 2131892945;
                if (z) {
                    i = 2131892939;
                }
            } else {
                i = 2131892944;
                if (z) {
                    i = 2131892938;
                }
            }
            r2.A00.A08(i, 0);
            return;
        }
        Activity activity2 = activity;
        r2.A00.A0D((AnonymousClass1FR) activity2);
        Context context = this.A03.A00;
        AnonymousClass1KB r4 = this.A01;
        AnonymousClass1KB r11 = r4;
        Context context2 = context;
        C175638z2 r9 = new C175638z2(context2, r11, C17880vN.A0U(this.A07), this, this.A04, AnonymousClass8BR.A0a(this.A08), r29);
        C190669lK r14 = new C190669lK(activity2, this, b8y);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: blockNonWaVpa called vpa: ");
        String str4 = str;
        A10.append(C20088A6q.A02(str4));
        C17900vP.A0n(" block: ", A10, z2);
        if (z) {
            str2 = "upi-block-vpa";
        } else {
            str2 = "upi-unblock-vpa";
        }
        C196259ui A042 = C197889xR.A04(r9, str2);
        AnonymousClass1OZ r10 = r9.A02;
        String A0B = r10.A0B();
        String A0v = AnonymousClass8BT.A0v(str4);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        AnonymousClass8BW.A1F(A0Y, A0v, A0B, AnonymousClass8BU.A1Z(A0B, 0, false) ? 1 : 0);
        C29591cX A0R = AnonymousClass8BS.A0R();
        if (z) {
            str3 = "upi-block-vpa";
        } else {
            str3 = "upi-unblock-vpa";
        }
        C29591cX.A01(A0R, "action", str3);
        if (C29601cY.A04(str4, 0, 100, false)) {
            C29591cX.A01(A0R, "vpa", str4);
        }
        String str5 = str2;
        C175638z2 r17 = r9;
        AnonymousClass1OZ r19 = r10;
        r19.A0I(new C175898zS(r9.A00, r9.A01, r14, r9.A04, A042, r17, str5, str4, z2), C29591cX.A00(A0R, A0Y), A0B, 204, 0);
    }

    public C196199uc(C37491pd r7, AnonymousClass1KB r8, AnonymousClass11P r9, AnonymousClass118 r10, A7U a7u, AXS axs, AnonymousClass1QD r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        this.A03 = r10;
        this.A02 = r9;
        this.A0A = r7;
        this.A01 = r8;
        this.A07 = r14;
        this.A06 = r13;
        this.A04 = a7u;
        this.A08 = r15;
        this.A05 = axs;
        this.A00 = r13.A03().getLong("payments_block_list_last_sync_time", -1);
        String string = r13.A03().getString("payments_block_list", "");
        if (!TextUtils.isEmpty(string)) {
            for (String A0L : string.split(";")) {
                this.A09.add(new C192269o5(AnonymousClass8BT.A0L(AnonymousClass8BR.A0Z(), A0L), this));
            }
        }
    }
}
