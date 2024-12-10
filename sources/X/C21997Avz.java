package X;

import java.util.Map;

/* renamed from: X.Avz  reason: case insensitive filesystem */
public final class C21997Avz extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass00H $systemMessagePlatform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21997Avz(AnonymousClass00H r2) {
        super(0);
        this.$systemMessagePlatform = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C187969gf r2;
        C187269fX r5 = (C187269fX) this.$systemMessagePlatform.get();
        AnonymousClass20F A15 = AnonymousClass3MW.A15(C22576BDr.class);
        synchronized (r5) {
            Map map = r5.A02;
            Object obj = map.get(A15);
            if (obj == null) {
                C192649ok r1 = (C192649ok) r5.A03.getValue();
                C18070vi.A0X(r1);
                C185909dL r0 = (C185909dL) r5.A04.getValue();
                C18070vi.A0X(r0);
                obj = new C187969gf(r1, r0, A15);
                map.put(A15, obj);
            }
            r2 = (C187969gf) obj;
        }
        return r2;
    }
}
