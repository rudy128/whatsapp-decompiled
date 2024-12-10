package X;

import java.util.List;

/* renamed from: X.9sn  reason: invalid class name and case insensitive filesystem */
public final class C195099sn {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195099sn) {
                C195099sn r5 = (C195099sn) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)))) * 31);
    }

    public C195099sn(List list, List list2, List list3, List list4, List list5) {
        C18070vi.A0s(list, list2, list3, list4);
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ClientCapabilityMetadata(bytecodeVersion=");
        A10.append(this.A00);
        A10.append(", cachedModelAssets=");
        A10.append(this.A01);
        A10.append(", cachedModelMetadatas=");
        A10.append(this.A02);
        A10.append(", operators=");
        A10.append(this.A03);
        C108975cc.A17(A10, ", operatorsHash=");
        A10.append(", supportedCompressions=");
        A10.append(this.A04);
        A10.append(", vulkanVersion=");
        return C17900vP.A0B((String) null, A10);
    }
}
