package X;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: X.DwM  reason: case insensitive filesystem */
public final class C28263DwM extends UploadDataProvider {
    public final ByteBuffer A00;

    public long getLength() {
        return (long) this.A00.limit();
    }

    public void rewind(UploadDataSink uploadDataSink) {
        this.A00.position(0);
        uploadDataSink.onRewindSucceeded();
    }

    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.remaining() >= this.A00.remaining()) {
                byteBuffer.put(this.A00);
            } else {
                int limit = this.A00.limit();
                ByteBuffer byteBuffer2 = this.A00;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.A00);
                this.A00.limit(limit);
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }

    public /* synthetic */ C28263DwM(ByteBuffer byteBuffer, DYO dyo) {
        this(byteBuffer);
    }

    public C28263DwM(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }
}
