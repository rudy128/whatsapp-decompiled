package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;

public final class Step {
    public final CarText mCue = null;
    public final List mLanes = Collections.emptyList();
    public final CarIcon mLanesImage = null;
    public final Maneuver mManeuver = null;
    public final CarText mRoad = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Step)) {
            return false;
        }
        Step step = (Step) obj;
        return AnonymousClass026.A00(this.mManeuver, step.mManeuver) && AnonymousClass026.A00(this.mLanes, step.mLanes) && AnonymousClass026.A00(this.mLanesImage, step.mLanesImage) && AnonymousClass026.A00(this.mCue, step.mCue) && AnonymousClass026.A00(this.mRoad, step.mRoad);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mManeuver;
        objArr[1] = this.mLanes;
        objArr[2] = this.mLanesImage;
        objArr[3] = this.mCue;
        return AnonymousClass000.A0P(this.mRoad, objArr, 4);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[maneuver: ");
        A10.append(this.mManeuver);
        A10.append(", lane count: ");
        A10.append(AnonymousClass001.A0m(this.mLanes));
        A10.append(", lanes image: ");
        A10.append(this.mLanesImage);
        A10.append(", cue: ");
        AnonymousClass000.A1B(this.mCue, A10);
        A10.append(", road: ");
        AnonymousClass000.A1B(this.mRoad, A10);
        return AnonymousClass000.A0z(A10);
    }
}
