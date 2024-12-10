package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.CmB  reason: case insensitive filesystem */
public final class C25799CmB {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final Map A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25799CmB) {
                C25799CmB cmB = (C25799CmB) obj;
                if (!C18070vi.A18(this.A04, cmB.A04) || !C18070vi.A18(this.A00, cmB.A00) || !C18070vi.A18(this.A01, cmB.A01) || !C18070vi.A18(this.A02, cmB.A02) || !C18070vi.A18(this.A03, cmB.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A04, 0))))) * 31 * 31;
    }

    public C25799CmB(List list, List list2, List list3, List list4, Map map) {
        C18070vi.A0p(map, list, list2);
        C72473Md.A1J(list3, list4);
        this.A04 = map;
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass000.A1G(A10, "PrefetchQplData(nativeQueueSize=");
        A10.append(", priorityNativeQueueSizeMap=");
        A10.append(this.A04);
        A10.append(", surfaceTypes=");
        A10.append(this.A00);
        A10.append(", surfaceTypesCounts=");
        A10.append(this.A01);
        A10.append(", triggers=");
        A10.append(this.A02);
        A10.append(", triggersCounts=");
        A10.append(this.A03);
        AnonymousClass000.A1G(A10, ", currentTime=");
        AnonymousClass000.A1G(A10, ", timeInNativeQueueAvg=");
        A10.append(", timeInNativeQueueP90=");
        return AnonymousClass001.A1F((Object) null, A10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25799CmB() {
        /*
            r6 = this;
            X.1CQ r5 = X.AnonymousClass1D7.A0I()
            X.0wS r1 = X.C18460wS.A00
            r0 = r6
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25799CmB.<init>():void");
    }
}
