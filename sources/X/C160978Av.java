package X;

import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Av  reason: invalid class name and case insensitive filesystem */
public interface C160978Av {
    void BEp();

    void BEu();

    void BIe(C92364hB r1);

    void BJw(C107855aj r1, BCO bco, C92384hD r3);

    void BLS(float f, float f2);

    boolean BeH();

    boolean Beu();

    boolean Bf2();

    boolean Bga();

    boolean Bgi();

    boolean Bgt();

    boolean Bk9();

    void BkL();

    String BkM();

    void CFx();

    void CG0();

    int CLV(int i);

    void COO(File file, int i);

    void COZ();

    void COa(Runnable runnable, Runnable runnable2);

    boolean COq();

    void CP2(E8C e8c, int i);

    void CPa();

    void CQR(C92374hC r1);

    int getCameraApi();

    int getCameraFacing();

    int getCameraType();

    String getFlashMode();

    List getFlashModes();

    int getMaxZoom();

    int getNumberOfCameras();

    long getPictureResolution();

    int getStoredFlashModeCount();

    long getVideoResolution();

    int getZoomLevel();

    boolean isRecording();

    void pause();

    void setCameraCallback(C28598E9p e9p);

    void setCameraSwitchedCallback(Runnable runnable);

    void setFlashMode(String str);

    void setQrDecodeHints(Map map);

    void setShouldStoreCameraFacingMode(boolean z);
}
