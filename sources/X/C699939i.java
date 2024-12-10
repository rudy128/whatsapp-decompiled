package X;

import com.whatsapp.util.Log;

/* renamed from: X.39i  reason: invalid class name and case insensitive filesystem */
public final class C699939i implements AnonymousClass3ML {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public void CCZ(AnonymousClass206 r7, C49702Rn r8) {
        boolean z;
        C18070vi.A0d(r7, 0);
        AW0 A002 = AnonymousClass25B.A00(r7);
        if (A002 != null) {
            synchronized (A002) {
                z = A002.A0O;
            }
            if (z) {
                AnonymousClass1QS r0 = (AnonymousClass1QS) this.A03.get();
                AnonymousClass1QS.A00(r0);
                AnonymousClass1QR r1 = r0.A04;
                C18070vi.A0X(r1);
                r1.A0P(r7, true);
                A002.A0E(false);
                ((A0E) this.A02.get()).A01(r7);
                AnonymousClass8pG r02 = A002.A0A;
                if (!(r02 == null || r02.A02 == null || 200 != A002.A03)) {
                    C17960vV.A01();
                    AnonymousClass8pG r2 = A002.A0A;
                    C17960vV.A07(r2);
                    C18070vi.A0X(r2);
                    C20280AEo aEo = r2.A02;
                    C17960vV.A07(aEo);
                    AnonymousClass21K A012 = ((C26021Qn) this.A01.get()).A01(aEo.A02);
                    if (A012 != null) {
                        C20285AEt BPK = A012.BPK();
                        C17960vV.A07(BPK);
                        C18070vi.A0X(BPK);
                        C17960vV.A07(BPK);
                        C20279AEn aEn = BPK.A02;
                        if (aEn != null) {
                            String str = A002.A0K;
                            String str2 = aEn.A08;
                            if (str2 == null || str2.length() == 0 || !str2.equals(str)) {
                                aEn.A08 = str;
                                ((C25951Qg) this.A00.get()).A0F(A012, ((AnonymousClass206) A012).A0x);
                            }
                        } else {
                            Log.e("PaymentsDatabaseInserterPostProcessor/updateCheckoutMessageWithTransactionInfo -> checkoutInfoContent is null PAY");
                        }
                    }
                }
                if (r8 != null) {
                    throw C17900vP.A07(C699939i.class);
                }
            }
        }
    }

    public C699939i(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A03 = r1;
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
    }
}
