package X;

import com.whatsapp.voipcalling.camera.VoipLiteCamera;

/* renamed from: X.Cm1  reason: case insensitive filesystem */
public final class C25790Cm1 {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25790Cm1) {
                C25790Cm1 cm1 = (C25790Cm1) obj;
                if (!(this.A01 == cm1.A01 && this.A00 == cm1.A00 && this.A02 == cm1.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass0DV.A00((((((((((0 + this.A01) * 31) + this.A00) * 31) - 1) * 31) - 1) * 31) - 1) * 31 * 31, this.A02) + 1237) * 31) + 1231) * 31) + 1231;
    }

    public C25790Cm1(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE8.A1F(A10, "VirtualVideoPlayerConfiguration(resizeMode=");
        A10.append(", targetWidth=");
        A10.append(this.A01);
        A10.append(", targetHeight=");
        A10.append(this.A00);
        A10.append(", startTimeInMs=");
        A10.append(-1);
        A10.append(", endTimeInMs=");
        A10.append(-1);
        A10.append(", seekTimeMs=");
        A10.append(-1);
        C108975cc.A17(A10, ", debugMessage=");
        A10.append(", shouldLoop=");
        A10.append(this.A02);
        C108975cc.A15(A10, ", useSurfaceView=");
        C108975cc.A16(A10, ", handleOutViewLifecycle=");
        A10.append(", shouldAdjustView=");
        return C17900vP.A0F(A10, true);
    }

    public C25790Cm1() {
        this(VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT, VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH, true);
    }
}
