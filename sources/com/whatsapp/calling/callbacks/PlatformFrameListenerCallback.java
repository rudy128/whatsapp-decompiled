package com.whatsapp.calling.callbacks;

import java.nio.ByteBuffer;

public interface PlatformFrameListenerCallback {
    void onRenderedFrame(String str, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j);
}
