package com.whatsapp.superpack;

import X.C54542eJ;
import android.content.res.AssetFileDescriptor;
import java.io.Closeable;

public class WhatsAppOpenboxArchive implements Closeable {
    public long archiveReaderPtr = 0;
    public final AssetFileDescriptor assetFd;

    public static native void closeNative(long j);

    public static native int getFileCountNative(long j);

    public static native long getFilePtrNative(long j, int i);

    public static native long getFileSizeNative(long j, int i);

    public static native long openNative(int i, long j, long j2);

    private void ensureArchiveReaderInitialized() {
        if (this.archiveReaderPtr == 0) {
            synchronized (this) {
                if (this.archiveReaderPtr == 0) {
                    this.archiveReaderPtr = openNative(this.assetFd.getParcelFileDescriptor().getFd(), this.assetFd.getStartOffset(), this.assetFd.getLength());
                }
            }
        }
    }

    public void close() {
        long j = this.archiveReaderPtr;
        if (j != 0) {
            closeNative(j);
        }
        AssetFileDescriptor assetFileDescriptor = this.assetFd;
        if (assetFileDescriptor != null) {
            assetFileDescriptor.close();
        }
    }

    public C54542eJ getFile(int i) {
        if (i >= 0) {
            ensureArchiveReaderInitialized();
            ensureArchiveReaderInitialized();
            if (i < getFileCountNative(this.archiveReaderPtr)) {
                return new C54542eJ(this, getFilePtrNative(this.archiveReaderPtr, i), getFileSizeNative(this.archiveReaderPtr, i));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public WhatsAppOpenboxArchive(AssetFileDescriptor assetFileDescriptor) {
        this.assetFd = assetFileDescriptor;
    }
}
