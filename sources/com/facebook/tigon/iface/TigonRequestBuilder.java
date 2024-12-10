package com.facebook.tigon.iface;

import X.AnonymousClass000;
import X.BTE;
import X.C17880vN;
import X.CIK;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public class TigonRequestBuilder {
    public BTE A00;
    public Map A01;
    public Map A02;

    public class TigonRequestImpl implements TigonRequest {
        public final BTE A00;
        public final Map A01;
        public final Map A02;
        public final TigonAuthHandler mAuthHandler = null;
        public final HttpPriorityContext mHttpPriorityContext = null;

        public TigonAuthHandler authHandler() {
            return this.mAuthHandler;
        }

        public HttpPriorityContext httpPriorityContext() {
            return this.mHttpPriorityContext;
        }

        public TigonRequestImpl(TigonRequestBuilder tigonRequestBuilder) {
            this.A01 = Collections.unmodifiableMap(tigonRequestBuilder.A01);
            this.A00 = tigonRequestBuilder.A00;
            this.A02 = Collections.unmodifiableMap(tigonRequestBuilder.A02);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [com.facebook.tigon.iface.TigonRequestBuilder, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.BTE, java.lang.Object] */
    public static TigonRequest create(String str, String str2, String[] strArr, int i, boolean z, FacebookLoggingRequestInfo facebookLoggingRequestInfo) {
        ? obj = new Object();
        obj.A02 = C17880vN.A11();
        obj.A01 = C17880vN.A11();
        obj.A00 = new Object();
        int length = strArr.length;
        if ((length & 1) == 0) {
            for (int i2 = 0; i2 < length; i2 += 2) {
                String str3 = strArr[i2];
                String str4 = strArr[i2 + 1];
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    obj.A01.put(str3, str4);
                }
            }
            if (facebookLoggingRequestInfo != null) {
                obj.A02.put(CIK.A01, facebookLoggingRequestInfo);
            }
            return new TigonRequestImpl(obj);
        }
        throw AnonymousClass000.A0k("must have even number of flattened headers");
    }
}
