package X;

import java.util.LinkedHashMap;

/* renamed from: X.AvE  reason: case insensitive filesystem */
public final class C21950AvE extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C190149kS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21950AvE(C190149kS r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Integer num;
        C190149kS r8 = this.this$0;
        LinkedHashMap A13 = C17880vN.A13();
        for (C179279Hi r3 : C179279Hi.values()) {
            r8.A00.get();
            int A04 = C108955ca.A04(r3, 0);
            if (A04 == 0) {
                num = AnonymousClass00R.A00;
            } else if (A04 == 1) {
                num = AnonymousClass00R.A01;
            } else {
                throw AnonymousClass3MW.A14();
            }
            A13.put(r3, C18150vq.A01(new C21516AlP(num, 11)));
        }
        return AnonymousClass1D7.A0F(A13);
    }
}
