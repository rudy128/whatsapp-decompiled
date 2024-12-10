package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterWeakPtr;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.SingleFilterFactory;

public interface EAA {
    void createFilter(SingleFilterFactory singleFilterFactory);

    FilterWeakPtr getFilterWeakPtr();

    void release();

    void setBoolParameter(String str, boolean z);

    void setFloatArrayParameter(String str, float[] fArr);

    void setFloatParameter(String str, float f);

    void setIntParameter(String str, int i);

    void setStringParameter(String str, String str2);

    void unsetFilterInput(String str);
}
