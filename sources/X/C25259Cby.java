package X;

/* renamed from: X.Cby  reason: case insensitive filesystem */
public abstract class C25259Cby {
    public abstract int getCount();

    public abstract Object getElement();

    public boolean equals(Object obj) {
        if (!(obj instanceof C25259Cby)) {
            return false;
        }
        C25259Cby cby = (C25259Cby) obj;
        if (getCount() != cby.getCount() || !C24604CBi.A00(getElement(), cby.getElement())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0k(getElement()) ^ getCount();
    }

    public String toString() {
        String valueOf = String.valueOf(getElement());
        int count = getCount();
        if (count != 1) {
            return AnonymousClass001.A1I(" x ", AnonymousClass000.A11(valueOf), count);
        }
        return valueOf;
    }
}
