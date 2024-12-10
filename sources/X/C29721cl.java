package X;

import java.io.Serializable;

/* renamed from: X.1cl  reason: invalid class name and case insensitive filesystem */
public class C29721cl implements Serializable {
    public static final long serialVersionUID = 1;
    public final int disappearingMessagesInitiator;
    public final long ephemeralSettingTimestamp;
    public final int expiration;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C29721cl r7 = (C29721cl) obj;
            return this.expiration == r7.expiration && this.disappearingMessagesInitiator == r7.disappearingMessagesInitiator && this.ephemeralSettingTimestamp == r7.ephemeralSettingTimestamp;
        }
        return false;
    }

    public int hashCode() {
        long j = this.ephemeralSettingTimestamp;
        return (((this.expiration * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.disappearingMessagesInitiator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EphemeralInfo{expiration=");
        sb.append(this.expiration);
        sb.append(", ephemeralSettingTimestamp=");
        sb.append(this.ephemeralSettingTimestamp);
        sb.append(", disappearingMessagesInitiator=");
        sb.append(this.disappearingMessagesInitiator);
        sb.append('}');
        return sb.toString();
    }

    public C29721cl(int i, long j, int i2) {
        this.expiration = i;
        this.ephemeralSettingTimestamp = j;
        this.disappearingMessagesInitiator = i2;
    }
}
