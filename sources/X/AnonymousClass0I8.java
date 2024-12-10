package X;

/* renamed from: X.0I8  reason: invalid class name */
public final class AnonymousClass0I8 {
    public final C05780Vr A00;
    public final Integer A01;

    public AnonymousClass0I8(C05780Vr r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AnimationResult(endReason=");
        if (this.A01.intValue() != 0) {
            str = "Finished";
        } else {
            str = "BoundReached";
        }
        A10.append(str);
        A10.append(", endState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
