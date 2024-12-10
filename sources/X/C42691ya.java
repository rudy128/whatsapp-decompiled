package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.1ya  reason: invalid class name and case insensitive filesystem */
public class C42691ya implements Serializable {
    public static final long serialVersionUID = 1;
    public final int actualActors;
    public final int hostStorage;
    public final long privacyModeTs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C42691ya r7 = (C42691ya) obj;
            if (!(this.hostStorage == r7.hostStorage && this.actualActors == r7.actualActors && this.privacyModeTs == r7.privacyModeTs)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.hostStorage), Integer.valueOf(this.actualActors), Long.valueOf(this.privacyModeTs)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivacyMode{hostStorage=");
        sb.append(this.hostStorage);
        sb.append(", actualActors=");
        sb.append(this.actualActors);
        sb.append(", privacyModeTs=");
        sb.append(this.privacyModeTs);
        sb.append('}');
        return sb.toString();
    }

    public C42691ya(C42691ya r3) {
        long j;
        if (r3 == null) {
            this.hostStorage = 0;
            this.actualActors = 0;
            j = 0;
        } else {
            this.hostStorage = r3.hostStorage;
            this.actualActors = r3.actualActors;
            j = r3.privacyModeTs;
        }
        this.privacyModeTs = j;
    }

    public C42691ya(String str, String str2, String str3) {
        this.hostStorage = C42681yZ.A01(str);
        this.actualActors = C42681yZ.A00(str2);
        this.privacyModeTs = C20099A7c.A04(str3, 0);
    }

    public C42691ya(int i, long j, int i2) {
        this.hostStorage = i;
        this.actualActors = i2;
        this.privacyModeTs = j;
    }

    public C42691ya() {
        this.hostStorage = 0;
        this.actualActors = 0;
        this.privacyModeTs = 0;
    }
}
