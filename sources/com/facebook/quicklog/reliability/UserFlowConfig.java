package com.facebook.quicklog.reliability;

import X.AnonymousClass000;
import X.C17890vO;

public class UserFlowConfig {
    public final boolean mCancelOnBackground;
    public final String mTriggerSource;
    public long mTtlMs;

    public class UserFlowConfigBuilder {
        public final boolean mCancelOnBackground;
        public final String mTriggerSource;
        public long mTtlMs = -1;

        public UserFlowConfig build() {
            UserFlowConfig userFlowConfig = new UserFlowConfig(this.mTriggerSource, this.mCancelOnBackground);
            userFlowConfig.mTtlMs = this.mTtlMs;
            return userFlowConfig;
        }

        public UserFlowConfigBuilder(String str, boolean z) {
            this.mTriggerSource = str;
            this.mCancelOnBackground = z;
        }

        public UserFlowConfigBuilder setTtlMs(long j) {
            this.mTtlMs = j;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserFlowConfig)) {
            return false;
        }
        UserFlowConfig userFlowConfig = (UserFlowConfig) obj;
        return userFlowConfig.mTriggerSource.equals(this.mTriggerSource) && userFlowConfig.mCancelOnBackground == this.mCancelOnBackground && userFlowConfig.mTtlMs == this.mTtlMs;
    }

    public static UserFlowConfigBuilder builder(String str, boolean z) {
        return new UserFlowConfigBuilder(str, z);
    }

    public static UserFlowConfig create(String str, boolean z) {
        return new UserFlowConfig(str, z);
    }

    public final int hashCode() {
        return AnonymousClass000.A0N(Long.valueOf(this.mTtlMs), C17890vO.A02(this.mTriggerSource, 589)) + (this.mCancelOnBackground ? 1 : 0);
    }

    public String getTriggerSource() {
        return this.mTriggerSource;
    }

    public long getTtlMs() {
        return this.mTtlMs;
    }

    public boolean isCancelOnBackground() {
        return this.mCancelOnBackground;
    }

    public UserFlowConfig(String str, boolean z) {
        this.mTtlMs = -1;
        this.mTriggerSource = str;
        this.mCancelOnBackground = z;
    }
}
