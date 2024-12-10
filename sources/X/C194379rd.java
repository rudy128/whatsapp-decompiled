package X;

/* renamed from: X.9rd  reason: invalid class name and case insensitive filesystem */
public class C194379rd {
    public Long A00;
    public final AnonymousClass1BI A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C194379rd r4 = (C194379rd) obj;
            if (this.A01.equals(r4.A01)) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0L(this.A01));
    }

    public C194379rd(AnonymousClass1BI r1, Long l) {
        this.A01 = r1;
        this.A02 = l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MutedChat{chatJid=");
        A10.append(this.A01);
        A10.append(", muteEndTimestampMs=");
        return AnonymousClass8BX.A0c(this.A02, A10);
    }
}
