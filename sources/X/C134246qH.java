package X;

/* renamed from: X.6qH  reason: invalid class name and case insensitive filesystem */
public final class C134246qH {
    public final C123596Vb A00 = new Object();

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134246qH) && C18070vi.A18(this.A00, ((C134246qH) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, -1788117204) + 85213;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A16(A10, "MerlinViewBasedComponentConfig(shouldLogPrimaryChannel=");
        C108975cc.A15(A10, ", shouldLogSecondaryChannel=");
        A10.append(", primaryChannelVisibilityFramework=");
        A10.append("ViewPoint");
        A10.append(", secondChannelVisibilityFramework=");
        A10.append("None");
        A10.append(", viewpointConfig=");
        A10.append(this.A00);
        A10.append(", loggingMode=");
        return C17900vP.A0B("VPV", A10);
    }
}
