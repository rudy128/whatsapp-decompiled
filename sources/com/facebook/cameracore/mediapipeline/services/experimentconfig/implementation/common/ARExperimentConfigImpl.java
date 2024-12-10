package com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common;

import X.AnonymousClass00R;
import X.C18070vi;
import X.C24326BzN;
import X.C24728CHq;
import X.E94;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.jni.HybridData;

public final class ARExperimentConfigImpl extends ARExperimentConfig {
    public final E94 arExperimentUtil;

    private final native HybridData initHybrid();

    public String getString(int i, String str) {
        C18070vi.A0d(str, 1);
        E94 e94 = this.arExperimentUtil;
        if (e94 != null) {
            e94.BZm(str);
        }
        return str;
    }

    public boolean getBool(int i, boolean z) {
        C24326BzN bzN;
        E94 e94 = this.arExperimentUtil;
        if (e94 == null) {
            return z;
        }
        if (i >= 0) {
            C24326BzN[] bzNArr = C24728CHq.A00;
            if (i < bzNArr.length) {
                bzN = bzNArr[i];
                return e94.BNa(bzN, z);
            }
        }
        bzN = C24326BzN.Dummy;
        return e94.BNa(bzN, z);
    }

    public boolean getBoolWithoutLogging(int i, boolean z) {
        C24326BzN bzN;
        E94 e94 = this.arExperimentUtil;
        if (e94 == null) {
            return z;
        }
        if (i >= 0) {
            C24326BzN[] bzNArr = C24728CHq.A00;
            if (i < bzNArr.length) {
                bzN = bzNArr[i];
                return e94.BNb(bzN, z);
            }
        }
        bzN = C24326BzN.Dummy;
        return e94.BNb(bzN, z);
    }

    public double getDouble(int i, double d) {
        Integer num;
        E94 e94 = this.arExperimentUtil;
        if (e94 == null) {
            return d;
        }
        if (i >= 0) {
            Integer[] numArr = C24728CHq.A01;
            if (i < numArr.length) {
                num = numArr[i];
                return e94.BQo(num, d);
            }
        }
        num = AnonymousClass00R.A00;
        return e94.BQo(num, d);
    }

    public ARExperimentConfigImpl(E94 e94) {
        this.mHybridData = initHybrid();
        this.arExperimentUtil = e94;
    }

    public long getLong(int i, long j) {
        return j;
    }

    public ARExperimentConfigImpl() {
        this((E94) null);
    }
}
