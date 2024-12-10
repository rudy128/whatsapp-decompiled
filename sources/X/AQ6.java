package X;

import java.util.regex.Pattern;

public class AQ6 implements AnonymousClass11J {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AQ6(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void Bps(C59732mn r6) {
        Object obj;
        Object obj2;
        AnonymousClass10I r2;
        int i;
        if (this.A00 != 0) {
            obj = this.A02;
            obj2 = this.A03;
            Pattern pattern = C198759yr.A0G;
            C18070vi.A0d(obj, 1);
            r2 = ((C198759yr) this.A01).A0D;
            i = 33;
        } else {
            C188499hW r0 = (C188499hW) this.A01;
            obj = this.A02;
            obj2 = this.A03;
            C18070vi.A0h(r0, obj);
            r2 = r0.A09;
            i = 30;
        }
        r2.CGF(new C21453AkK(obj, obj2, i));
    }
}
