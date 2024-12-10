package X;

import java.util.Map;

/* renamed from: X.CZo  reason: case insensitive filesystem */
public final class C25138CZo {
    public final Map A00;

    public C25138CZo(Map map) {
        C18070vi.A0d(map, 1);
        this.A00 = map;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25138CZo) && C18070vi.A18(this.A00, ((C25138CZo) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Snapshot(memorySnapshot=");
        Map map = this.A00;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("Snapshot(snapshot=");
        return AnonymousClass001.A1F(AnonymousClass001.A1F(map, A102), A10);
    }
}
