package X;

/* renamed from: X.0ee  reason: invalid class name and case insensitive filesystem */
public final class C08160ee extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C04920Pn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08160ee(C04920Pn r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        do {
            C04920Pn r5 = this.this$0;
            synchronized (r5.A05) {
                if (!r5.A03) {
                    r5.A03 = true;
                    try {
                        C06970a9 r0 = r5.A05;
                        int i = r0.A00;
                        if (i > 0) {
                            Object[] objArr = r0.A01;
                            int i2 = 0;
                            do {
                                ((C04680Oi) objArr[i2]).A03();
                                i2++;
                            } while (i2 < i);
                        }
                    } finally {
                        r5.A03 = false;
                    }
                }
            }
        } while (C04920Pn.A03(this.this$0));
        return C27621Wu.A00;
    }
}
