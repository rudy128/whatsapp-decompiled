package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Ay  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C142827Ay implements C38591rZ {
    public final /* synthetic */ C38631rd A00;
    public final /* synthetic */ AnonymousClass6RF A01;
    public final /* synthetic */ C1407472v A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ AtomicInteger A04;
    public final /* synthetic */ AnonymousClass1JD A05;
    public final /* synthetic */ C98474rD A06;

    public final void onResult(Object obj) {
        C38631rd r7 = this.A00;
        Map map = this.A03;
        AnonymousClass6RF r5 = this.A01;
        AtomicInteger atomicInteger = this.A04;
        C1407472v r3 = this.A02;
        AnonymousClass1JD r2 = this.A05;
        C98474rD r1 = this.A06;
        C18070vi.A0h(r7, map);
        C18070vi.A0d(atomicInteger, 3);
        C72473Md.A1J(r2, r1);
        r7.A0K((C39801tf) obj);
        map.put(r5, r7);
        atomicInteger.getAndDecrement();
        if (atomicInteger.get() == 0) {
            AnonymousClass1JD r0 = r3.A04;
            r0.addAll(r2);
            if (r1.element == r0.size()) {
                C1407472v.A02(r3);
            }
        }
    }

    public /* synthetic */ C142827Ay(C38631rd r1, AnonymousClass6RF r2, C1407472v r3, Map map, AtomicInteger atomicInteger, AnonymousClass1JD r6, C98474rD r7) {
        this.A00 = r1;
        this.A03 = map;
        this.A01 = r2;
        this.A04 = atomicInteger;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
    }
}
