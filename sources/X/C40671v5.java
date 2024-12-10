package X;

import java.util.List;

/* renamed from: X.1v5  reason: invalid class name and case insensitive filesystem */
public class C40671v5 implements C40521uq {
    public final C40561uu A00;
    public final C40561uu A01;

    public C26049CrJ BHA() {
        return new C22733BMw(new C26049CrJ(this.A00.A00), new C26049CrJ(this.A01.A00));
    }

    public List BTm() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public boolean BgZ() {
        if (!this.A00.BgZ() || !this.A01.BgZ()) {
            return false;
        }
        return true;
    }

    public C40671v5(C40561uu r1, C40561uu r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
