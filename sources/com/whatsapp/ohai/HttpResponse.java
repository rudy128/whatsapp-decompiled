package com.whatsapp.ohai;

import X.AnonymousClass000;
import X.C17900vP;
import X.C18070vi;
import java.util.Arrays;
import java.util.Map;

public final class HttpResponse {
    public final byte[] body;
    public final Map headers;
    public final short statusCode;

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, short s, Map map, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            s = httpResponse.statusCode;
        }
        if ((i & 2) != 0) {
            map = httpResponse.headers;
        }
        if ((i & 4) != 0) {
            bArr = httpResponse.body;
        }
        return httpResponse.copy(s, map, bArr);
    }

    public final short component1() {
        return this.statusCode;
    }

    public final Map component2() {
        return this.headers;
    }

    public final byte[] component3() {
        return this.body;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HttpResponse) {
                HttpResponse httpResponse = (HttpResponse) obj;
                if (this.statusCode != httpResponse.statusCode || !C18070vi.A18(this.headers, httpResponse.headers) || !C18070vi.A18(this.body, httpResponse.body)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.headers, this.statusCode * 31) + Arrays.hashCode(this.body);
    }

    public HttpResponse(short s, Map map, byte[] bArr) {
        C18070vi.A0k(map, bArr);
        this.statusCode = s;
        this.headers = map;
        this.body = bArr;
    }

    public final HttpResponse copy(short s, Map map, byte[] bArr) {
        C18070vi.A0j(map, bArr);
        return new HttpResponse(s, map, bArr);
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final Map getHeaders() {
        return this.headers;
    }

    public final short getStatusCode() {
        return this.statusCode;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HttpResponse(statusCode=");
        A10.append(this.statusCode);
        A10.append(", headers=");
        A10.append(this.headers);
        A10.append(", body=");
        return C17900vP.A0B(Arrays.toString(this.body), A10);
    }
}
