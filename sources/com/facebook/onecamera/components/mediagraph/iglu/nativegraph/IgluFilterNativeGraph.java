package com.facebook.onecamera.components.mediagraph.iglu.nativegraph;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1A8;
import X.C26058CrU;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterWeakPtr;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor;
import com.facebook.jni.HybridData;

public class IgluFilterNativeGraph {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native void render();

    public native void attach(IgluConfigHolder igluConfigHolder);

    public native void detach();

    public native void setClearFramebuffer(boolean z);

    public native void setInputTexture(IgluIODescriptor igluIODescriptor);

    public native void setOutputTexture(IgluIODescriptor igluIODescriptor);

    public native void updateFilter(FilterWeakPtr filterWeakPtr);

    public native void useCurrentOutputFramebuffer(int i);

    static {
        AnonymousClass1A8.A06("onecamera-iglufilter-graph");
    }

    public void render(String str) {
        render();
        C26058CrU.A01(AnonymousClass001.A1H("[IgluFilterNativeGraph#render]", "IgluFilterRenderer", AnonymousClass000.A10()));
    }
}
