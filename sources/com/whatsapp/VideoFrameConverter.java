package com.whatsapp;

import java.nio.ByteBuffer;

public class VideoFrameConverter {
    public static native void convertAndroid420toARGB(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer4);

    public static native void convertAndroid420toI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer4);

    public static native long create();

    public static native void scalePlane(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5, int i6);

    public static native void setLogFilePath(String str);

    public VideoFrameConverter() {
        create();
    }
}
