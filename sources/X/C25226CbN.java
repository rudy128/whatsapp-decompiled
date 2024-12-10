package X;

import java.util.List;

/* renamed from: X.CbN  reason: case insensitive filesystem */
public final class C25226CbN {
    public final List A00;
    public final List A01;
    public final List A02;
    public final C24444C4e A03;
    public final CZX A04;
    public final C5L A05;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.CZX, java.lang.Object] */
    public /* synthetic */ C25226CbN(List list, List list2, C24444C4e c4e, C5L c5l) {
        E34[] e34Arr = new E34[2];
        e34Arr[0] = DY8.A00;
        List A0O = C18070vi.A0O(DY9.A00, e34Arr, 1);
        ? obj = new Object();
        this.A02 = list;
        this.A00 = list2;
        this.A01 = A0O;
        this.A03 = c4e;
        this.A04 = obj;
        this.A05 = c5l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25226CbN) {
                C25226CbN cbN = (C25226CbN) obj;
                if (Float.compare(0.0f, 0.0f) != 0 || Float.compare(22.0f, 22.0f) != 0 || Float.compare(0.9f, 0.9f) != 0 || !C18070vi.A18(this.A02, cbN.A02) || !C18070vi.A18(this.A00, cbN.A00) || !C18070vi.A18(this.A01, cbN.A01) || !C18070vi.A18(this.A03, cbN.A03) || !C18070vi.A18(this.A04, cbN.A04) || !C18070vi.A18(this.A05, cbN.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A05, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A03, (AnonymousClass001.A0K(1500, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(11160, 0.0f), 22.0f), 0.9f))))) + 1) * 31) * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE8.A1F(A10, "Party(angle=");
        A10.append(", spread=");
        A10.append(360);
        A10.append(", speed=");
        A10.append(0.0f);
        A10.append(", maxSpeed=");
        A10.append(22.0f);
        A10.append(", damping=");
        A10.append(0.9f);
        A10.append(", size=");
        A10.append(this.A02);
        A10.append(", colors=");
        A10.append(this.A00);
        A10.append(", shapes=");
        A10.append(this.A01);
        A10.append(", timeToLive=");
        A10.append(1500);
        C108975cc.A16(A10, ", fadeOutEnabled=");
        A10.append(", position=");
        A10.append(this.A03);
        BE8.A1F(A10, ", delay=");
        A10.append(", rotation=");
        A10.append(this.A04);
        A10.append(", emitter=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
