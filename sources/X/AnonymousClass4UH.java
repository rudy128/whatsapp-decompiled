package X;

/* renamed from: X.4UH  reason: invalid class name */
public final class AnonymousClass4UH {
    public final long A00;
    public final long A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UH) {
                AnonymousClass4UH r8 = (AnonymousClass4UH) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01 && C18070vi.A18(this.A02, r8.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A01, AnonymousClass000.A0I(this.A00) * 31) + AnonymousClass001.A0k(this.A02);
    }

    public AnonymousClass4UH(Long l, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ScheduledReminder(messageRowId=");
        A10.append(this.A00);
        A10.append(", scheduledTimestampMs=");
        A10.append(this.A01);
        A10.append(", chatRowId=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
