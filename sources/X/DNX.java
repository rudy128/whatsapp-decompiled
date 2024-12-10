package X;

import java.util.Map;

public final class DNX implements E6F {
    public final Map A00;

    public CO9 COx(String str) {
        return (CO9) this.A00.get(str);
    }

    public boolean equals(Object obj) {
        Map map = this.A00;
        if (!(obj instanceof DNX) || !C18070vi.A18(map, ((DNX) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        Map map = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Snapshot(snapshot=");
        return AnonymousClass001.A1F(map, A10);
    }

    public /* synthetic */ DNX(Map map) {
        this.A00 = map;
    }
}
