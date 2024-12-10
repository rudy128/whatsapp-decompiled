package com.facebook.tigon.iface;

import X.C108945cZ;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C3J;

public final class FacebookLoggingRequestInfo extends C3J {
    public final String analyticsTag;
    public final String callerClass;
    public final String logName;

    public static /* synthetic */ FacebookLoggingRequestInfo copy$default(FacebookLoggingRequestInfo facebookLoggingRequestInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = facebookLoggingRequestInfo.logName;
        }
        if ((i & 2) != 0) {
            str2 = facebookLoggingRequestInfo.analyticsTag;
        }
        if ((i & 4) != 0) {
            str3 = facebookLoggingRequestInfo.callerClass;
        }
        return facebookLoggingRequestInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.logName;
    }

    public final String component2() {
        return this.analyticsTag;
    }

    public final String component3() {
        return this.callerClass;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FacebookLoggingRequestInfo) {
                FacebookLoggingRequestInfo facebookLoggingRequestInfo = (FacebookLoggingRequestInfo) obj;
                if (!C18070vi.A18(this.logName, facebookLoggingRequestInfo.logName) || !C18070vi.A18(this.analyticsTag, facebookLoggingRequestInfo.analyticsTag) || !C18070vi.A18(this.callerClass, facebookLoggingRequestInfo.callerClass)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public final String getAnalyticsTag() {
        return this.analyticsTag;
    }

    public final String getCallerClass() {
        return this.callerClass;
    }

    public final String getLogName() {
        return this.logName;
    }

    public int hashCode() {
        return C108945cZ.A09(this.callerClass, C17890vO.A02(this.analyticsTag, C17880vN.A03(this.logName)));
    }

    public FacebookLoggingRequestInfo(String str, String str2, String str3) {
        C18070vi.A0o(str, str2, str3);
        this.logName = str;
        this.analyticsTag = str2;
        this.callerClass = str3;
    }

    public final FacebookLoggingRequestInfo copy(String str, String str2, String str3) {
        C18070vi.A0n(str, str2, str3);
        return new FacebookLoggingRequestInfo(str, str2, str3);
    }
}
