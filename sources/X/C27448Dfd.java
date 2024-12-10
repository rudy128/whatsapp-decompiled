package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.Dfd  reason: case insensitive filesystem */
public final /* synthetic */ class C27448Dfd extends AnonymousClass1JJ implements AnonymousClass1OS {
    public static final C27448Dfd A00 = new C27448Dfd();

    public C27448Dfd() {
        super(2, CIR.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        long A05 = C17880vN.A05(obj);
        C28244Du5 du5 = (C28244Du5) obj2;
        int i = CIR.A01;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C35951n6.A01;
        C27178DXn dXn = du5.A00;
        C18070vi.A0b(dXn);
        return new C28244Du5(dXn, du5, 0, A05);
    }
}
