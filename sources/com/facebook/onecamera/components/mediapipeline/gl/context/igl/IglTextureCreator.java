package com.facebook.onecamera.components.mediapipeline.gl.context.igl;

import X.AnonymousClass1A8;
import X.AnonymousClass8BR;
import X.C18070vi;
import X.C9X;
import X.CZB;
import X.E9R;

public final class IglTextureCreator {
    public static final C9X Companion = new Object();
    public final IglContext iglContext;

    public IglTextureCreator(IglContext iglContext2) {
        C18070vi.A0d(iglContext2, 1);
        this.iglContext = iglContext2;
    }

    private final native IglFrameBuffer createFrameBufferNative(IglContext iglContext2, boolean z, int i, int i2, int i3, int i4);

    private final native IglTexture createOesTextureNative(IglContext iglContext2, int i, int i2);

    public final E9R createFrameBuffer(int i, int i2, CZB czb, boolean z) {
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        if (czb != null) {
            i3 = czb.A00;
            i4 = czb.A01;
            czb.A00(i, i2);
        } else {
            i3 = -1;
            i4 = -1;
        }
        IglFrameBuffer createFrameBufferNative = createFrameBufferNative(this.iglContext, z, i5, i6, i3, i4);
        if (createFrameBufferNative != null) {
            return createFrameBufferNative;
        }
        throw AnonymousClass8BR.A0w("failed to create framebuffer natively");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C9X, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("mediapipeline-igl-context");
    }

    public static /* synthetic */ IglTexture createOesTexture$default(IglTextureCreator iglTextureCreator, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return iglTextureCreator.createOesTexture(i, i2);
    }

    public final IglTexture createOesTexture(int i, int i2) {
        IglTexture createOesTextureNative = createOesTextureNative(this.iglContext, i, i2);
        if (createOesTextureNative != null) {
            return createOesTextureNative;
        }
        throw AnonymousClass8BR.A0w("failed to create oes texture natively");
    }
}
