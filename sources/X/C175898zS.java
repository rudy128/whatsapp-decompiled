package X;

import android.content.Context;

/* renamed from: X.8zS  reason: invalid class name and case insensitive filesystem */
public class C175898zS extends C175498yo {
    public final /* synthetic */ C190669lK A00;
    public final /* synthetic */ C175638z2 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175898zS(Context context, AnonymousClass1KB r8, C190669lK r9, C33711jG r10, C196259ui r11, C175638z2 r12, String str, String str2, boolean z) {
        super(context, r8, r10, r11, str);
        this.A01 = r12;
        this.A00 = r9;
        this.A03 = z;
        this.A02 = str2;
    }

    public void A04(A7B a7b) {
        super.A04(a7b);
        this.A00.A00(a7b, this.A03);
    }

    public void A05(A7B a7b) {
        super.A05(a7b);
        this.A00.A00(a7b, this.A03);
    }

    public void A06(C29621ca r5) {
        super.A06(r5);
        C196199uc r2 = this.A01.A03;
        C1418477e A0L = AnonymousClass8BT.A0L(AnonymousClass8BR.A0Z(), this.A02);
        boolean z = this.A03;
        r2.A02(A0L, z);
        C190669lK r22 = this.A00;
        C17900vP.A0n("PAY: IndiaUpiBlockListManager/on-success blocked: ", AnonymousClass000.A10(), z);
        r22.A01.A01.A0B((AnonymousClass1FR) r22.A00);
        r22.A02.C3f((A7B) null);
    }
}
