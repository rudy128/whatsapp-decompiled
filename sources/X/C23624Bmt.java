package X;

/* renamed from: X.Bmt  reason: case insensitive filesystem */
public abstract class C23624Bmt extends DND {
    public C23577Bm6 A00;
    public final C23577Bm6 A01;

    /* renamed from: A0B */
    public C23624Bmt clone() {
        C23624Bmt bmt = (C23624Bmt) this.A01.A0P(AnonymousClass00R.A0Y, (Object) null);
        C23577Bm6 bm6 = this.A00;
        if (AnonymousClass000.A1O(bm6.memoizedSerializedSize & Integer.MIN_VALUE)) {
            bm6.A0Q();
        }
        bmt.A00 = this.A00;
        return bmt;
    }

    public final C23577Bm6 A0C() {
        C23577Bm6 bm6 = this.A00;
        if (AnonymousClass000.A1O(bm6.memoizedSerializedSize & Integer.MIN_VALUE)) {
            bm6.A0Q();
        }
        C23577Bm6 bm62 = this.A00;
        if (C23577Bm6.A0F(bm62)) {
            return bm62;
        }
        throw new C27219DZx();
    }

    public final void A0D() {
        C23577Bm6 bm6 = this.A01;
        if (!AnonymousClass000.A1O(bm6.memoizedSerializedSize & Integer.MIN_VALUE)) {
            this.A00 = DNC.A0I(bm6);
            return;
        }
        throw AnonymousClass000.A0k("Default instance must be immutable.");
    }

    public final void A0E() {
        if (!AnonymousClass000.A1O(this.A00.memoizedSerializedSize & Integer.MIN_VALUE)) {
            C23577Bm6 A0I = DNC.A0I(this.A01);
            BE9.A0U(A0I).Bjk(A0I, this.A00);
            this.A00 = A0I;
        }
    }

    public void A0F(C23577Bm6 bm6) {
        if (!this.A01.equals(bm6)) {
            C23577Bm6 A0G = C17880vN.A0G(this);
            BE9.A0U(A0G).Bjk(A0G, bm6);
        }
    }

    public C23624Bmt(C23577Bm6 bm6) {
        this.A01 = bm6;
        if (!AnonymousClass000.A1O(bm6.memoizedSerializedSize & Integer.MIN_VALUE)) {
            this.A00 = DNC.A0I(bm6);
            return;
        }
        throw AnonymousClass000.A0k("Default instance must be immutable.");
    }
}
