package X;

/* renamed from: X.9Kb  reason: invalid class name and case insensitive filesystem */
public enum C179829Kb implements E68 {
    Connected(0),
    Rejected(1),
    Cancelled(2),
    AcceptedElsewhere(3),
    Missed(4),
    Invalid(5),
    Unavailable(6),
    Upcoming(7),
    Failed(8),
    Abandoned(9),
    Ongoing(10);
    
    public final int value;

    /* access modifiers changed from: public */
    C179829Kb(int i) {
        this.value = i;
    }

    public static C179829Kb A00(int i) {
        switch (i) {
            case 0:
                return Connected;
            case 1:
                return Rejected;
            case 2:
                return Cancelled;
            case 3:
                return AcceptedElsewhere;
            case 4:
                return Missed;
            case 5:
                return Invalid;
            case 6:
                return Unavailable;
            case 7:
                return Upcoming;
            case 8:
                return Failed;
            case 9:
                return Abandoned;
            case 10:
                return Ongoing;
            default:
                return null;
        }
    }

    public final int BVW() {
        return this.value;
    }
}
