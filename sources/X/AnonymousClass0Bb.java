package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;

/* renamed from: X.0Bb  reason: invalid class name */
public final class AnonymousClass0Bb extends AnonymousClass0HF implements C17380uZ {
    public final AndroidEdgeEffectOverscrollEffect A00;

    public /* synthetic */ boolean BC2(C22821Di r2) {
        return AnonymousClass0LD.A01(this, r2);
    }

    public /* synthetic */ Object BLT(Object obj, AnonymousClass1OS r3) {
        return AnonymousClass0LD.A00(this, obj, r3);
    }

    public /* synthetic */ C17090tj CP5(C17090tj r2) {
        return AnonymousClass0EW.A00(this, r2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0Bb)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((AnonymousClass0Bb) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass0Bb(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C22821Di r2) {
        super(r2);
        this.A00 = androidEdgeEffectOverscrollEffect;
    }

    public void BJM(C17480uj r2) {
        r2.BJR();
        this.A00.A0F(r2);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DrawOverscrollModifier(overscrollEffect=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
