package X;

import java.util.Map;

/* renamed from: X.Clh  reason: case insensitive filesystem */
public final class C25770Clh {
    public static final C25770Clh A01 = new C25770Clh(C108975cc.A0h("wifi", AnonymousClass1D7.A0I()));
    public final Map A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25770Clh) && C18070vi.A18(this.A00, ((C25770Clh) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C25770Clh(Map map) {
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LiveEditingNetworkConfig(serializedNetworkConfig=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
