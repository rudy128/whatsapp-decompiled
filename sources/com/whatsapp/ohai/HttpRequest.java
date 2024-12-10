package com.whatsapp.ohai;

import X.AnonymousClass000;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import java.util.Arrays;
import java.util.Map;

public final class HttpRequest {
    public final byte[] body;
    public final boolean forceHostHeader;
    public final Map headers;
    public final String method;
    public final String url;

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, Map map, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = httpRequest.method;
        }
        if ((i & 2) != 0) {
            str2 = httpRequest.url;
        }
        if ((i & 4) != 0) {
            map = httpRequest.headers;
        }
        if ((i & 8) != 0) {
            bArr = httpRequest.body;
        }
        if ((i & 16) != 0) {
            z = httpRequest.forceHostHeader;
        }
        return httpRequest.copy(str, str2, map, bArr, z);
    }

    public final String component1() {
        return this.method;
    }

    public final String component2() {
        return this.url;
    }

    public final Map component3() {
        return this.headers;
    }

    public final byte[] component4() {
        return this.body;
    }

    public final boolean component5() {
        return this.forceHostHeader;
    }

    public final HttpRequest copy(String str, String str2, Map map, byte[] bArr, boolean z) {
        C18070vi.A0d(str, 0);
        C18070vi.A0o(str2, map, bArr);
        return new HttpRequest(str, str2, map, bArr, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HttpRequest) {
                HttpRequest httpRequest = (HttpRequest) obj;
                if (!C18070vi.A18(this.method, httpRequest.method) || !C18070vi.A18(this.url, httpRequest.url) || !C18070vi.A18(this.headers, httpRequest.headers) || !C18070vi.A18(this.body, httpRequest.body) || this.forceHostHeader != httpRequest.forceHostHeader) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((AnonymousClass000.A0N(this.headers, C17890vO.A02(this.url, C17880vN.A03(this.method))) + Arrays.hashCode(this.body)) * 31, this.forceHostHeader);
    }

    public HttpRequest(String str, String str2, Map map, byte[] bArr, boolean z) {
        C18070vi.A0s(str, str2, map, bArr);
        this.method = str;
        this.url = str2;
        this.headers = map;
        this.body = bArr;
        this.forceHostHeader = z;
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final boolean getForceHostHeader() {
        return this.forceHostHeader;
    }

    public final Map getHeaders() {
        return this.headers;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HttpRequest(method=");
        A10.append(this.method);
        A10.append(", url=");
        A10.append(this.url);
        A10.append(", headers=");
        A10.append(this.headers);
        A10.append(", body=");
        C17890vO.A1C(A10, this.body);
        A10.append(", forceHostHeader=");
        return C17900vP.A0F(A10, this.forceHostHeader);
    }
}
