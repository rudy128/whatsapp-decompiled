package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import X.C108945cZ;
import X.C199610h;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ResponseHandler;

public class HTTPClientResponseHandler implements ResponseHandler {
    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPResponse, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        ? obj = new Object();
        StatusLine statusLine = httpResponse.getStatusLine();
        C199610h.A04(statusLine);
        obj.statusCode = statusLine.getStatusCode();
        Header[] allHeaders = httpResponse.getAllHeaders();
        if (allHeaders == null) {
            obj.headerNames = new String[0];
            obj.headerValues = new String[0];
        } else {
            int length = allHeaders.length;
            String[] strArr = new String[length];
            String[] strArr2 = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = allHeaders[i].getName();
                strArr2[i] = allHeaders[i].getValue();
            }
            obj.headerNames = strArr;
            obj.headerValues = strArr2;
        }
        InputStream content = httpResponse.getEntity().getContent();
        ByteArrayOutputStream A15 = C108945cZ.A15();
        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
        while (true) {
            int read = content.read(bArr, 0, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            if (read != -1) {
                A15.write(bArr, 0, read);
            } else {
                A15.flush();
                content.close();
                obj.content = A15.toByteArray();
                return obj;
            }
        }
    }
}
