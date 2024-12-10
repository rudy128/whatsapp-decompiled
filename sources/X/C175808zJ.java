package X;

import android.content.Context;

/* renamed from: X.8zJ  reason: invalid class name and case insensitive filesystem */
public class C175808zJ extends C197889xR {
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1OZ A02;
    public final AXS A03;
    public final C33711jG A04;
    public final C195859u1 A05;
    public final AZ6 A06;
    public final A0B A07;
    public final C30931ek A08;

    public C175808zJ(Context context, AnonymousClass1KB r3, AnonymousClass1OZ r4, A7U a7u, AXS axs, C33711jG r7, C31061ex r8, C195859u1 r9, AZ6 az6, A0B a0b, C30931ek r12) {
        super(a7u.A04, r8);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r4;
        this.A08 = r12;
        this.A07 = a0b;
        this.A05 = r9;
        this.A06 = az6;
        this.A04 = r7;
        this.A03 = axs;
    }

    public static void A00(C1418477e r15, C1418477e r16, AnonymousClass8pS r17, C22451B8j b8j, C175808zJ r19, String str, String str2) {
        C175808zJ r14 = r19;
        C196259ui r12 = r14.A00;
        r12.A02("upi-generate-otp");
        AnonymousClass1OZ r1 = r14.A02;
        String A0B = r1.A0B();
        AnonymousClass9F5 r2 = new AnonymousClass9F5(A0B, AnonymousClass8BS.A0h(r15), str, r14.A08.A01(), (String) AnonymousClass8BT.A0q(r17.A05), (String) AnonymousClass8BT.A0q(r16), r14.A03.A0G(), r14.A07.A01(), str2);
        AnonymousClass8BW.A1B(r1, new C175968zZ(r14.A00, r14.A01, r14.A04, r12, b8j, r14, r2), r2.BVP(), A0B);
    }

    public void A01(C1418477e r16, AnonymousClass8pS r17, C22451B8j b8j, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: IndiaUpiOtpAction requestOtp withCallback: ");
        C17900vP.A0r(A10, true);
        this.A06.COK();
        AnonymousClass8pS r4 = r17;
        String str2 = r4.A0E;
        C1418477e r3 = r16;
        C22451B8j b8j2 = b8j;
        String str3 = str;
        if (C20061A5k.A02(r4.A08)) {
            this.A05.A02(this.A00, (C196259ui) null, new AYC(r3, r4, b8j2, this, str3));
        } else {
            A00(r4.A08, r3, r4, b8j2, this, str2, str3);
        }
    }
}
