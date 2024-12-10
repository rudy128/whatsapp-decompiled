package androidx.car.app;

import X.AnonymousClass000;
import X.C199410f;
import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Arrays;

public class SessionInfo {
    public static final C199410f A00 = C199410f.of(NavigationTemplate.class);
    public static final C199410f A01 = C199410f.of();
    public final int mDisplayType = 0;
    public final String mSessionId = "main";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SessionInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return this.mSessionId.equals(sessionInfo.mSessionId) && this.mDisplayType == sessionInfo.mDisplayType;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mSessionId;
        AnonymousClass000.A1M(objArr, this.mDisplayType);
        return Arrays.hashCode(objArr);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(String.valueOf(this.mDisplayType));
        A10.append('/');
        return AnonymousClass000.A0y(this.mSessionId, A10);
    }
}
