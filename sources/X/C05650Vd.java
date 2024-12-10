package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0Vd  reason: invalid class name and case insensitive filesystem */
public final class C05650Vd implements C17860vL {
    public Throwable A00;
    public List A01;
    public List A02;
    public final Object A03;
    public final C18090vk A04;

    public C05650Vd() {
        this((C18090vk) null, (AnonymousClass1Y1) null, 1);
    }

    public /* synthetic */ C05650Vd(C18090vk r2, AnonymousClass1Y1 r3, int i) {
        this((C18090vk) null);
    }

    public /* synthetic */ C23801Hr getKey() {
        return AnonymousClass0EJ.A00();
    }

    private final void A03(Throwable th) {
        synchronized (this.A03) {
            if (this.A00 == null) {
                this.A00 = th;
                List list = this.A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C03440Ie) list.get(i)).A00().resumeWith(C30691eM.A00(th));
                }
                this.A01.clear();
            }
        }
    }

    public final void A04(long j) {
        synchronized (this.A03) {
            List list = this.A01;
            this.A01 = this.A02;
            this.A02 = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C03440Ie) list.get(i)).A01(j);
            }
            list.clear();
        }
    }

    public final boolean A05() {
        boolean A1a;
        synchronized (this.A03) {
            A1a = AnonymousClass000.A1a(this.A01);
        }
        return A1a;
    }

    public Object CSE(C30391dr r7, C22821Di r8) {
        C18090vk A022;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r5 = new C31781g7(1, C30581eB.A02(r7));
        r5.A0F();
        C98494rF r4 = new C98494rF();
        synchronized (this.A03) {
            Throwable th = this.A00;
            if (th != null) {
                r5.resumeWith(C30691eM.A00(th));
            } else {
                r4.element = new C03440Ie(r5, r8);
                boolean A1a = AnonymousClass000.A1a(this.A01);
                List list = this.A01;
                Object obj = r4.element;
                if (obj == null) {
                    C18070vi.A11("awaiter");
                    throw null;
                }
                list.add((C03440Ie) obj);
                boolean z = !A1a;
                r5.Bdu(new C11000jK(this, r4));
                if (z && (A022 = this.A04) != null) {
                    try {
                        A022.invoke();
                    } catch (Throwable th2) {
                        A03(th2);
                    }
                }
            }
        }
        return r5.A0C();
    }

    public Object fold(Object obj, AnonymousClass1OS r3) {
        return C04770Os.A00(this, obj, r3);
    }

    public C18570wi get(C23801Hr r2) {
        return C04770Os.A01(this, r2);
    }

    public C18560wh minusKey(C23801Hr r2) {
        return C04770Os.A02(this, r2);
    }

    public C18560wh plus(C18560wh r2) {
        return C04770Os.A03(this, r2);
    }

    public C05650Vd(C18090vk r2) {
        this.A04 = r2;
        this.A03 = new Object();
        this.A01 = AnonymousClass000.A13();
        this.A02 = AnonymousClass000.A13();
    }
}
