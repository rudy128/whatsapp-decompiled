package X;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: X.DwN  reason: case insensitive filesystem */
public final class C28264DwN extends UploadDataProvider {
    public final Object A00;
    public final E6y A01;
    public volatile FileChannel A02;

    private FileChannel A00() {
        if (this.A02 == null) {
            synchronized (this.A00) {
                if (this.A02 == null) {
                    this.A02 = this.A01.BOT();
                }
            }
        }
        return this.A02;
    }

    public void close() {
        FileChannel fileChannel = this.A02;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    public long getLength() {
        return A00().size();
    }

    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            FileChannel A002 = A00();
            int i = 0;
            while (i == 0) {
                int read = A002.read(byteBuffer);
                if (read == -1) {
                    break;
                }
                i += read;
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }

    public void rewind(UploadDataSink uploadDataSink) {
        A00().position(0);
        uploadDataSink.onRewindSucceeded();
    }

    public /* synthetic */ C28264DwN(E6y e6y, DYO dyo) {
        this(e6y);
    }

    public C28264DwN(E6y e6y) {
        this.A00 = new Object();
        this.A01 = e6y;
    }
}
