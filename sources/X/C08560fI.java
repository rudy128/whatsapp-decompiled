package X;

/* renamed from: X.0fI  reason: invalid class name and case insensitive filesystem */
public final class C08560fI extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass0AK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08560fI(AnonymousClass0AK r2) {
        super(0);
        this.this$0 = r2;
    }

    public final void A00() {
        C04700Ok r0 = this.this$0.A0P;
        r0.A02 = 0;
        C06970a9 A0F = r0.A0F.A0F();
        int i = A0F.A00;
        if (i > 0) {
            Object[] objArr = A0F.A01;
            int i2 = 0;
            do {
                AnonymousClass0AK r2 = ((AnonymousClass0XV) objArr[i2]).A0Q.A0G;
                r2.A03 = r2.A02;
                r2.A02 = Integer.MAX_VALUE;
                r2.A09 = false;
                if (r2.A05 == AnonymousClass00R.A01) {
                    r2.A05 = AnonymousClass00R.A0C;
                }
                i2++;
            } while (i2 < i);
        }
        this.this$0.BLV(C12190lM.A00);
        this.this$0.BT2().A0c().CBj();
        AnonymousClass0XV r6 = this.this$0.A0P.A0F;
        C06970a9 A0F2 = r6.A0F();
        int i3 = A0F2.A00;
        if (i3 > 0) {
            Object[] objArr2 = A0F2.A01;
            int i4 = 0;
            do {
                AnonymousClass0XV r22 = (AnonymousClass0XV) objArr2[i4];
                AnonymousClass0AK r02 = r22.A0Q.A0G;
                if (r02.A03 != r02.A02) {
                    r6.A0Y();
                    r6.A0T();
                    AnonymousClass0AK r23 = r22.A0Q.A0G;
                    if (r23.A02 == Integer.MAX_VALUE) {
                        AnonymousClass0AK.A03(r23);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
        this.this$0.BLV(C12200lN.A00);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        A00();
        return C27621Wu.A00;
    }
}
