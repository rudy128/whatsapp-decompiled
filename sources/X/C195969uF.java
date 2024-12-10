package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9uF  reason: invalid class name and case insensitive filesystem */
public final class C195969uF {
    public final AnonymousClass1QS A00;
    public final AnonymousClass00H A01;
    public final C18030ve A02;

    public final boolean A03() {
        C18030ve r2 = this.A02;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 4781) || !C18020vd.A05(r1, r2, 7024)) {
            return false;
        }
        return true;
    }

    public C195969uF(C18030ve r1, AnonymousClass1QS r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final List A00(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            C20284AEs aEs = (C20284AEs) next;
            if (aEs instanceof AnonymousClass8pM) {
                AnonymousClass8pM r2 = (AnonymousClass8pM) aEs;
                C18070vi.A0d(r2, 0);
                if (A03() && C18070vi.A18(C63572tK.A0E, r2.A07)) {
                    if ("pix_key".equals(r2.A00) || "pix_key".equals(C20284AEs.A02(r2))) {
                        A13.add(next);
                    }
                }
            }
        }
        ArrayList A0D = C29351c6.A0D(A13);
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            C20284AEs A0P = AnonymousClass8BR.A0P(it);
            C18070vi.A0z(A0P, "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentMethodNonNative");
            AnonymousClass8pM r3 = (AnonymousClass8pM) A0P;
            C18070vi.A0d(r3, 0);
            C23624Bmt A0N = C165448bA.DEFAULT_INSTANCE.A0N();
            String str = r3.A0A;
            C165448bA r1 = (C165448bA) C17880vN.A0G(A0N);
            str.getClass();
            r1.bitField0_ |= 1;
            r1.credentialId_ = str;
            String str2 = r3.A07.A03;
            C165448bA r12 = (C165448bA) C17880vN.A0G(A0N);
            r12.bitField0_ |= 2;
            r12.country_ = str2;
            String str3 = r3.A00;
            if (TextUtils.isEmpty(str3)) {
                C1418477e r0 = r3.A09;
                if (r0 != null) {
                    str3 = (String) r0.A00;
                } else {
                    str3 = null;
                }
            }
            C165448bA r13 = (C165448bA) C17880vN.A0G(A0N);
            str3.getClass();
            r13.bitField0_ |= 4;
            r13.type_ = str3;
            C170278pb r14 = r3.A08;
            if (r14 instanceof AnonymousClass8pV) {
                C18070vi.A0z(r14, "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentCustomMethodCountryData");
                Iterator A0i = C17890vO.A0i(((AnonymousClass8pV) r14).A03);
                while (A0i.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A0i);
                    C23624Bmt A0N2 = C164678Zt.DEFAULT_INSTANCE.A0N();
                    String A0x = C17880vN.A0x(A16);
                    C164678Zt r15 = (C164678Zt) C17880vN.A0G(A0N2);
                    A0x.getClass();
                    r15.bitField0_ |= 1;
                    r15.key_ = A0x;
                    String str4 = ((ADJ) A16.getValue()).A00;
                    C164678Zt r16 = (C164678Zt) C17880vN.A0G(A0N2);
                    r16.bitField0_ |= 2;
                    r16.value_ = str4;
                    C23577Bm6 A09 = AnonymousClass8BS.A09(A0N2, A0N);
                    C165448bA r22 = (C165448bA) A0N.A00;
                    A09.getClass();
                    EE9 ee9 = r22.metadata_;
                    if (!((C27296DbR) ee9).A00) {
                        ee9 = C23577Bm6.A09(ee9);
                        r22.metadata_ = ee9;
                    }
                    ee9.add(A09);
                }
            }
            A0D.add(A0N.A0C());
        }
        return A0D;
    }

    public final void A01() {
        if (A03()) {
            C20735AWq.A00(C17880vN.A0V(this.A01), 41);
        }
    }

    public final void A02(String str) {
        List A0A;
        if (A03()) {
            AnonymousClass2LR r4 = (AnonymousClass2LR) this.A01.get();
            AnonymousClass1KH A0R = AnonymousClass8BR.A0R(this.A00);
            C18070vi.A0X(A0R);
            if (!A0R.A09) {
                Log.e("Payment store cannot be initialized for device sync!");
                A0A = C18460wS.A00;
            } else {
                A0A = A0R.A0A();
            }
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : A0A) {
                AnonymousClass3MZ.A1V(next, A13, C18070vi.A18(((C20284AEs) next).A0A, str) ? 1 : 0);
            }
            List A002 = A00(A13);
            C18070vi.A0d(A002, 0);
            C17890vO.A0s(r4, A002, 26);
        }
    }
}
