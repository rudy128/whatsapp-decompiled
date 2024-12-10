package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder;

import X.AnonymousClass000;
import X.AnonymousClass1A8;
import X.AnonymousClass8BR;
import X.BE6;
import X.C17890vO;
import X.C28111Yx;
import X.C28418E0j;
import X.C28419E0k;
import X.D3R;
import X.EAA;
import android.util.SparseArray;
import com.facebook.jni.HybridData;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FilterManagerImpl implements EAA {
    public static final FilterManagerImpl $redex_init_class = null;
    public D3R mCachedModel;
    public FilterWeakPtr mFilterWeakPtr;
    public Boolean mForceGlslEs3;
    public final HybridData mHybridData;
    public final ConcurrentHashMap mNamedSubFilterMangerMap = AnonymousClass8BR.A17();
    public final SparseArray mSubFilterMangerMap = BE6.A0Q();

    private native void createFilterChainNative();

    private native void createFilterGroupNative();

    private native void createFilterNative(SingleFilterFactory singleFilterFactory);

    private native FilterWeakPtr createFilterWeakPtrNative();

    private native void createSplitScreenFilterNative();

    public static native HybridData initHybrid(boolean z);

    private native void releaseNative();

    private void releaseResources() {
        SparseArray sparseArray;
        this.mFilterWeakPtr = null;
        int size = this.mSubFilterMangerMap.size();
        int i = 0;
        while (true) {
            sparseArray = this.mSubFilterMangerMap;
            if (i >= size) {
                break;
            }
            Object valueAt = sparseArray.valueAt(i);
            C28111Yx.A02(valueAt);
            ((EAA) valueAt).release();
            i++;
        }
        sparseArray.clear();
        Iterator A0j = C17890vO.A0j(this.mNamedSubFilterMangerMap);
        while (A0j.hasNext()) {
            Object next = A0j.next();
            C28111Yx.A02(next);
            ((EAA) next).release();
        }
        this.mNamedSubFilterMangerMap.clear();
        releaseNative();
    }

    private native void setBoolParameterNative(String str, boolean z);

    private native void setDefaultInputNative(int i, int i2, int i3, int i4, int i5, int i6, TextureLoaderWeakPtr textureLoaderWeakPtr);

    private native void setFilterChainInputTextureNative(int i, int i2, int i3, int i4, int i5, int i6, TextureLoaderWeakPtr textureLoaderWeakPtr);

    private native void setFilterChainOutputSizeNative(int i, int i2, int i3);

    private native void setFilterChainPositionEnabledNative(int i, boolean z);

    private native void setFilterGroupPositionEnabledNative(int i, boolean z);

    private native void setFilterInputNative(String str, FilterWeakPtr filterWeakPtr);

    private native void setFilterUseInputFromGroupNative(int i, boolean z);

    private native void setFilterUseOutputFromGroupNative(int i, boolean z);

    private native void setFloatArrayParameterNative(String str, float[] fArr);

    private native void setFloatParameterNative(String str, float f);

    private native void setGraphNodeBoolParameterNative(String str, String str2, boolean z);

    private native void setGraphNodeFloatArrayParameterNative(String str, String str2, float[] fArr);

    private native void setGraphNodeFloatParameterNative(String str, String str2, float f);

    private native void setGraphNodeIntParameterNative(String str, String str2, int i);

    private native void setIntParameterNative(String str, int i);

    private native void setSplitScreenValueNative(float f);

    private native void setStringParameterNative(String str, String str2);

    private native void setTextureInputNative(String str, int i, int i2, int i3, int i4, TextureLoaderWeakPtr textureLoaderWeakPtr);

    private native void setTextureInputPathNative(String str, String str2, TextureLoaderWeakPtr textureLoaderWeakPtr, int i);

    private native void setUseInputFromChainNative(boolean z);

    private native void setUseOutputFromChainNative(boolean z);

    private native void updateFilterChainPositionNative(int i, FilterWeakPtr filterWeakPtr);

    private native void updateFilterGroupPositionNative(int i, FilterWeakPtr filterWeakPtr);

    private native void updateSplitScreenFilterPositionNative(int i, FilterWeakPtr filterWeakPtr);

    public void release() {
        this.mCachedModel = null;
        releaseResources();
    }

    static {
        AnonymousClass1A8.A06("mediapipeline-iglufilter-holder");
    }

    public FilterWeakPtr getFilterWeakPtr() {
        FilterWeakPtr filterWeakPtr = this.mFilterWeakPtr;
        if (filterWeakPtr != null) {
            return filterWeakPtr;
        }
        FilterWeakPtr createFilterWeakPtrNative = createFilterWeakPtrNative();
        this.mFilterWeakPtr = createFilterWeakPtrNative;
        return createFilterWeakPtrNative;
    }

    public void unsetFilterInput(String str) {
        if (this.mNamedSubFilterMangerMap.remove(str) != null) {
            setFilterInputNative(str, (FilterWeakPtr) null);
        }
    }

    public FilterManagerImpl(C28419E0k e0k, C28418E0j e0j, Boolean bool) {
        this.mHybridData = initHybrid(bool.booleanValue());
        this.mForceGlslEs3 = bool;
    }

    public void createFilter(SingleFilterFactory singleFilterFactory) {
        releaseResources();
        createFilterNative(singleFilterFactory);
    }

    public void setStringParameter(String str, String str2) {
        C28111Yx.A03(Boolean.valueOf(AnonymousClass000.A1R(str2.length())), "setStringParameter requires valid string");
        setStringParameterNative(str, str2);
    }

    public void setBoolParameter(String str, boolean z) {
        setBoolParameterNative(str, z);
    }

    public void setFloatArrayParameter(String str, float[] fArr) {
        setFloatArrayParameterNative(str, fArr);
    }

    public void setFloatParameter(String str, float f) {
        setFloatParameterNative(str, f);
    }

    public void setIntParameter(String str, int i) {
        setIntParameterNative(str, i);
    }
}
