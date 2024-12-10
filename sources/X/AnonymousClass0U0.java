package X;

/* renamed from: X.0U0  reason: invalid class name */
public final class AnonymousClass0U0 implements C17190uG {
    public final float A00;
    public final Object A01;

    public static final AnonymousClass0D0 A00(C16590sg r0, Object obj) {
        if (obj == null) {
            return null;
        }
        return (AnonymousClass0D0) r0.BPS().invoke(obj);
    }

    public /* bridge */ /* synthetic */ C16830tI CRk(C16590sg r4) {
        return new AnonymousClass0U7(A00(r4, this.A01), this.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0U0)) {
            return false;
        }
        AnonymousClass0U0 r4 = (AnonymousClass0U0) obj;
        if (r4.A00 != this.A00 || !C18070vi.A18(r4.A01, this.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass001.A0l(this.A01) * 31, 1.0f), this.A00);
    }

    public AnonymousClass0U0(Object obj, float f) {
        this.A00 = f;
        this.A01 = obj;
    }

    public static AnonymousClass0U0 A01(Object obj) {
        return new AnonymousClass0U0(obj, 1500.0f);
    }

    public AnonymousClass0U0() {
        this((Object) null, 1500.0f);
    }
}
