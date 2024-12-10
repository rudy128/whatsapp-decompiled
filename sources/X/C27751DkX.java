package X;

import java.io.InputStream;

/* renamed from: X.DkX  reason: case insensitive filesystem */
public final class C27751DkX extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CQZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27751DkX(CQZ cqz) {
        super(0);
        this.this$0 = cqz;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        InputStream open = this.this$0.A01.A00.getAssets().open("argo-wire-type-store.argo");
        byte[] bArr = new byte[open.available()];
        open.read(bArr);
        open.close();
        Object A00 = CD9.A00(new C25171CaN(bArr));
        if (!(A00 instanceof AnonymousClass1IU)) {
            A00 = new C25826Cmd((C25846Cn2) A00);
        }
        C30691eM.A01(A00);
        C25826Cmd cmd = (C25826Cmd) A00;
        C25846Cn2 cn2 = cmd.A00;
        C26032Cqs cqs = cn2.A01;
        Object A01 = cqs.A00.A01();
        boolean z = !(A01 instanceof AnonymousClass1IU);
        C25767Cle cle = A01;
        if (z) {
            try {
                long A05 = C17880vN.A05(A01);
                if (A05 == 2) {
                    C25767Cle cle2 = new C25767Cle((DVO) null, (AnonymousClass1Y1) null, 1);
                    for (long A002 = C26032Cqs.A00(cqs); A002 > 0; A002--) {
                        String A003 = C25846Cn2.A00(cn2);
                        Object A012 = cmd.A01();
                        C30691eM.A01(A012);
                        cle2.A00.put(A003, new C25175CaR((DPJ) A012, A003));
                    }
                    cle = cle2;
                } else {
                    throw new C23994Btb(A05);
                }
            } catch (Throwable th) {
                cle = C108945cZ.A1J(th);
            }
        }
        C30691eM.A01(cle);
        return cle;
    }
}
