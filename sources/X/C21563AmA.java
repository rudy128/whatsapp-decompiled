package X;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* renamed from: X.AmA  reason: case insensitive filesystem */
public class C21563AmA implements HttpEntity {
    public final /* synthetic */ C21564AmB A00;
    public final /* synthetic */ HttpEntity A01;

    public C21563AmA(C21564AmB amB, HttpEntity httpEntity) {
        this.A00 = amB;
        this.A01 = httpEntity;
    }

    public void consumeContent() {
        this.A01.consumeContent();
    }

    public InputStream getContent() {
        InputStream content = this.A01.getContent();
        AnonymousClass181 r2 = this.A00.A01;
        Integer A0j = C17880vN.A0j();
        return new C179229Hb(r2, content, A0j, A0j);
    }

    public Header getContentEncoding() {
        return this.A01.getContentEncoding();
    }

    public long getContentLength() {
        return this.A01.getContentLength();
    }

    public Header getContentType() {
        return this.A01.getContentType();
    }

    public boolean isChunked() {
        return this.A01.isChunked();
    }

    public boolean isRepeatable() {
        return this.A01.isRepeatable();
    }

    public boolean isStreaming() {
        return this.A01.isStreaming();
    }

    public void writeTo(OutputStream outputStream) {
        HttpEntity httpEntity = this.A01;
        AnonymousClass181 r2 = this.A00.A01;
        Integer A0j = C17880vN.A0j();
        httpEntity.writeTo(new C179259He(r2, outputStream, A0j, A0j));
    }
}
