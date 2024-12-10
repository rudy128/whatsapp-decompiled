package X;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.1AR  reason: invalid class name */
public class AnonymousClass1AR implements AnonymousClass1AQ {
    public File A00;
    public FileInputStream A01;
    public FileChannel A02;

    public int CDK(ByteBuffer byteBuffer, long j) {
        return this.A02.read(byteBuffer, j);
    }

    public void close() {
        this.A01.close();
    }

    public boolean isOpen() {
        return this.A02.isOpen();
    }

    public int read(ByteBuffer byteBuffer) {
        return this.A02.read(byteBuffer);
    }

    public int write(ByteBuffer byteBuffer) {
        return this.A02.write(byteBuffer);
    }
}
