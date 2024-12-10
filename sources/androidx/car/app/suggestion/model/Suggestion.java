package androidx.car.app.suggestion.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import android.app.PendingIntent;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;

public final class Suggestion {
    public final PendingIntent mAction = null;
    public final CarIcon mIcon = null;
    public final String mIdentifier = "";
    public final CarText mSubtitle = null;
    public final CarText mTitle = new CarText((CharSequence) "");

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        return AnonymousClass026.A00(this.mIdentifier, suggestion.mIdentifier) && AnonymousClass026.A00(this.mTitle, suggestion.mTitle) && AnonymousClass026.A00(this.mSubtitle, suggestion.mSubtitle) && AnonymousClass026.A00(this.mAction, suggestion.mAction) && AnonymousClass026.A00(this.mIcon, suggestion.mIcon);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mIdentifier;
        objArr[1] = this.mTitle;
        objArr[2] = this.mSubtitle;
        objArr[3] = this.mIcon;
        return AnonymousClass000.A0P(this.mAction, objArr, 4);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[id: ");
        A10.append(this.mIdentifier);
        A10.append(", title: ");
        AnonymousClass000.A1B(this.mTitle, A10);
        A10.append(", subtitle: ");
        AnonymousClass000.A1B(this.mSubtitle, A10);
        A10.append(", pendingIntent: ");
        A10.append(this.mAction);
        A10.append(", icon: ");
        return AnonymousClass001.A1G(this.mIcon, A10);
    }
}
