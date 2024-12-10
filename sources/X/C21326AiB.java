package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.AiB  reason: case insensitive filesystem */
public final class C21326AiB implements Closeable {
    public final InputStream[] A00;
    public final /* synthetic */ AiK A01;

    public C21326AiB(AiK aiK, InputStream[] inputStreamArr) {
        this.A01 = aiK;
        this.A00 = inputStreamArr;
    }

    public void close() {
        InputStream[] inputStreamArr = this.A00;
        int length = inputStreamArr.length;
        for (int i = 0; i < length; i = 1) {
            AiK.A06(inputStreamArr[i]);
        }
    }
}
