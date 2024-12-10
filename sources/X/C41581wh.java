package X;

/* renamed from: X.1wh  reason: invalid class name and case insensitive filesystem */
public class C41581wh extends C30501e3 implements C30401ds {
    public final C30391dr A00;

    public C41581wh(C30391dr r2, C18560wh r3) {
        super(r3, true);
        this.A00 = r2;
    }

    public final boolean A0v() {
        return true;
    }

    public void A0k(Object obj) {
        C30391dr A02 = C30581eB.A02(this.A00);
        if (obj instanceof C30681eL) {
            obj = C30691eM.A00(((C30681eL) obj).A00);
        }
        C30621eF.A00(obj, A02);
    }

    public void A12(Object obj) {
        C30391dr r1 = this.A00;
        if (obj instanceof C30681eL) {
            obj = C30691eM.A00(((C30681eL) obj).A00);
        }
        r1.resumeWith(obj);
    }

    public final C30401ds getCallerFrame() {
        C30391dr r1 = this.A00;
        if (r1 instanceof C30401ds) {
            return (C30401ds) r1;
        }
        return null;
    }
}
