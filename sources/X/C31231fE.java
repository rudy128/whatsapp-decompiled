package X;

import java.util.Collection;

/* renamed from: X.1fE  reason: invalid class name and case insensitive filesystem */
public final class C31231fE implements AnonymousClass00S {
    public final C31221fD A00;
    public final AnonymousClass10E A01;
    public final int A02;

    public C31231fE(C31221fD r1, AnonymousClass10E r2, int i) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = i;
    }

    public Object get() {
        switch (this.A02) {
            case 0:
                return C199410f.copyOf((Collection) this.A01.A00.ATZ());
            case 1:
                return new AnonymousClass9VW(this);
            case 2:
                return new AnonymousClass9VX(this);
            case 3:
                return new AnonymousClass9VY(this);
            case 4:
                return new AnonymousClass9VZ(this);
            case 5:
                return new C182609Va(this);
            default:
                AnonymousClass10E r1 = this.A01;
                return new C57332iu((C18030ve) r1.A04.get(), (C218217n) r1.AeP.get());
        }
    }
}
