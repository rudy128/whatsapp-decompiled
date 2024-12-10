package X;

import java.util.Map;

/* renamed from: X.DqI  reason: case insensitive filesystem */
public final class C28043DqI extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ EAA $manager;
    public final /* synthetic */ CZ1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28043DqI(EAA eaa, CZ1 cz1) {
        super(1);
        this.$manager = eaa;
        this.this$0 = cz1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry A0p = BE8.A0p(obj);
        String A0x = C17880vN.A0x(A0p);
        try {
            this.$manager.setStringParameter(A0x, AnonymousClass8BR.A10(A0p));
            return C27621Wu.A00;
        } catch (Exception e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("setStringParameter() failed! Filter: ");
            A10.append(this.this$0.A01.A03);
            throw BE6.A0o(AnonymousClass001.A1H(" Key: ", A0x, A10), e);
        }
    }
}
