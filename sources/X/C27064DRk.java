package X;

import java.io.Serializable;

/* renamed from: X.DRk  reason: case insensitive filesystem */
public final class C27064DRk implements Serializable {
    public static final long serialVersionUID = 6776230050133633619L;
    public final int minBufferMs;
    public final int minRebufferMs;

    public boolean equals(Object obj) {
        if (obj instanceof C27064DRk) {
            C27064DRk dRk = (C27064DRk) obj;
            if (this.minBufferMs == dRk.minBufferMs && this.minRebufferMs == dRk.minRebufferMs) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.minBufferMs * 31) + this.minRebufferMs;
    }

    public C27064DRk(int i, int i2) {
        this.minBufferMs = i;
        this.minRebufferMs = i2;
    }
}
