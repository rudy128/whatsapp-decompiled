package X;

/* renamed from: X.11D  reason: invalid class name */
public abstract class AnonymousClass11D extends AnonymousClass10T {
    public final AnonymousClass00H A00;
    public final C18100vl A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass11D(AnonymousClass00H r3) {
        this(r3, C18150vq.A00(), false);
        C18070vi.A0d(r3, 1);
    }

    public void ensureNotWorkerThreadObserver(Object obj) {
    }

    public void runObserver(Object obj, C23691Hg r5) {
        C18070vi.A0d(obj, 0);
        C18070vi.A0d(r5, 1);
        if (obj instanceof C23971Ii) {
            ((C200710s) this.A01.getValue()).execute(new C448825d(r5, obj, 13));
            C24691Lh r0 = this.observerCounter;
            if (r0 != null) {
                r0.A01();
                return;
            }
            return;
        }
        r5.CGE(obj);
        C24691Lh r02 = this.observerCounter;
        if (r02 != null) {
            r02.A00();
        }
    }

    public void checkThread() {
        C17960vV.A02();
    }

    public /* synthetic */ AnonymousClass11D(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass1Y1 r5, int i, boolean z) {
        this(r3, C18150vq.A00(), false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass11D(AnonymousClass00H r3, AnonymousClass00H r4, boolean z) {
        super(r4, z);
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        this.A00 = r3;
        this.A01 = new C18110vm(new AnonymousClass11H(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass11D(AnonymousClass00H r2, AnonymousClass00H r3) {
        this(r2, r3, false);
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
    }
}
