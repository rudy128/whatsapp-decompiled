package androidx.car.app.model;

import X.AnonymousClass000;

public final class DurationSpan extends CarSpan {
    public final long mDurationSeconds = 0;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.mDurationSeconds);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[seconds: ");
        A10.append(this.mDurationSeconds);
        return AnonymousClass000.A0z(A10);
    }
}
