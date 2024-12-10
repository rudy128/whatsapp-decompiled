package com.facebook.android.exoplayer2.decoder;

import X.BEA;
import X.BOY;
import X.C26667D8q;
import java.nio.ByteBuffer;

public class SimpleOutputBuffer extends BOY {
    public ByteBuffer data;
    public final C26667D8q owner;

    public void clear() {
        this.A00 = 0;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j, int i) {
        this.A01 = j;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = BEA.A0u(i);
        }
        this.data.position(0);
        this.data.limit(i);
        return this.data;
    }

    public void release() {
        this.owner.A05(this);
    }

    public SimpleOutputBuffer(C26667D8q d8q) {
        this.owner = d8q;
    }
}
