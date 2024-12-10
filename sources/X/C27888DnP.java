package X;

import java.lang.ref.Reference;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.DnP  reason: case insensitive filesystem */
public final class C27888DnP extends AnonymousClass11G implements C18090vk {
    public static final C27888DnP A00 = new C27888DnP();

    public C27888DnP() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        while (true) {
            Reference poll = C27260Dam.A03.poll();
            if (poll == null) {
                return C27621Wu.A00;
            }
            C27260Dam dam = (C27260Dam) poll;
            while (true) {
                AtomicLong atomicLong = dam.A01;
                long j = atomicLong.get();
                if (j == 0) {
                    break;
                } else if (atomicLong.compareAndSet(j, 0)) {
                    dam.A02.invoke(Long.valueOf(j));
                }
            }
            C27260Dam.A04.remove(poll);
        }
    }
}
