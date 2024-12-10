package com.whatsapp.util;

import java.io.FileDescriptor;
import java.net.Socket;

public final class NativeUtils {
    public static final native int getBytesInSocketOutputQueue(int i);

    public static final native int getFileDescriptorForFileDescriptor(FileDescriptor fileDescriptor);

    public static final native int getFileDescriptorForSocket(Socket socket);

    public static final native void mprotectCode();

    public static final native void nativeInit();

    static {
        nativeInit();
    }
}
