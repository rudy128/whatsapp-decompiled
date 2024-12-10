package X;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* renamed from: X.AmB  reason: case insensitive filesystem */
public class C21564AmB implements HttpRequestInterceptor {
    public int A00;
    public final AnonymousClass181 A01;

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        StringBuilder sb;
        this.A00++;
        if (httpRequest instanceof EntityEnclosingRequestWrapper) {
            EntityEnclosingRequestWrapper entityEnclosingRequestWrapper = (EntityEnclosingRequestWrapper) httpRequest;
            HttpEntity entity = entityEnclosingRequestWrapper.getEntity();
            if (entity == null) {
                httpRequest.getRequestLine();
                return;
            }
            long contentLength = entity.getContentLength();
            if (contentLength <= 0) {
                sb = AnonymousClass000.A10();
                sb.append("gdrive-api/request-interceptor/process/length/");
                sb.append(contentLength);
            } else {
                entityEnclosingRequestWrapper.setEntity(new C21563AmA(this, entity));
                return;
            }
        } else if (!(httpRequest instanceof RequestWrapper)) {
            sb = AnonymousClass000.A10();
            sb.append("gdrive-request-interceptor/process/request-is-not-a-wrapper ");
            sb.append(httpRequest);
        } else {
            return;
        }
        C17890vO.A0w(sb);
    }

    public C21564AmB(AnonymousClass181 r1) {
        this.A01 = r1;
    }
}
