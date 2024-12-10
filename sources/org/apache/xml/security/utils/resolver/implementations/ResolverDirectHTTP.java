package org.apache.xml.security.utils.resolver.implementations;

import X.BE6;
import X.BE8;
import X.BEA;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.apache.xml.utils.URI;
import org.w3c.dom.Attr;

public class ResolverDirectHTTP extends ResourceResolverSpi {
    public static Log d;
    public static Class e;
    public static final String[] f = {"http.proxy.host", "http.proxy.port", "http.proxy.username", "http.proxy.password", "http.basic.username", "http.basic.password"};

    static {
        Class c = c("org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP");
        e = c;
        d = LogFactory.getLog(c.getName());
    }

    private URI a(String str, String str2) {
        return (str2 == null || "".equals(str2)) ? new URI(str) : new URI(new URI(str2), str);
    }

    public boolean a() {
        return true;
    }

    public boolean b(Attr attr, String str) {
        Log log;
        String str2;
        if (attr == null) {
            log = d;
            str2 = "quick fail, uri == null";
        } else {
            String nodeValue = attr.getNodeValue();
            if (nodeValue.equals("") || nodeValue.charAt(0) == '#') {
                log = d;
                str2 = "quick fail for empty URIs and local ones";
            } else {
                if (d.isDebugEnabled()) {
                    BEA.A1O("I was asked whether I can resolve ", nodeValue, BE6.A0s(), d);
                }
                if (!nodeValue.startsWith("http:") && (str == null || !str.startsWith("http:"))) {
                    if (d.isDebugEnabled()) {
                        BEA.A1O("I state that I can't resolve ", nodeValue, BE6.A0s(), d);
                        return false;
                    }
                    return false;
                } else if (!d.isDebugEnabled()) {
                    return true;
                } else {
                    BEA.A1O("I state that I can resolve ", nodeValue, BE6.A0s(), d);
                    return true;
                }
            }
        }
        log.debug(str2);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        if (r3 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r11 == null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.xml.security.signature.XMLSignatureInput a(org.w3c.dom.Attr r21, java.lang.String r22) {
        /*
            r20 = this;
            java.lang.String r4 = "generic.EmptyMessage"
            r19 = r21
            r5 = r22
            java.lang.String[] r18 = f     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r0 = 0
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r1 = r20
            java.lang.String r12 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r0 = 1
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r11 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            if (r12 == 0) goto L_0x001e
            r17 = 1
            if (r11 != 0) goto L_0x0020
        L_0x001e:
            r17 = 0
        L_0x0020:
            java.lang.String r13 = ":"
            java.lang.String r10 = "http.proxyPort"
            java.lang.String r9 = "http.proxyHost"
            java.lang.String r8 = "http.proxySet"
            if (r17 == 0) goto L_0x005b
            org.apache.commons.logging.Log r0 = d     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            if (r0 == 0) goto L_0x0043
            org.apache.commons.logging.Log r3 = d     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.StringBuffer r2 = X.BE6.A0s()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r0 = "Use of HTTP proxy enabled: "
            r2.append(r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r2.append(r12)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            X.BEA.A1O(r13, r11, r2, r3)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
        L_0x0043:
            java.lang.String r7 = java.lang.System.getProperty(r8)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r6 = java.lang.System.getProperty(r9)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r3 = java.lang.System.getProperty(r10)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r0 = "true"
            java.lang.System.setProperty(r8, r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.System.setProperty(r9, r12)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.System.setProperty(r10, r11)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            goto L_0x005f
        L_0x005b:
            r7 = 0
            r6 = 0
            r3 = 0
            goto L_0x0067
        L_0x005f:
            if (r7 == 0) goto L_0x0067
            if (r6 == 0) goto L_0x0067
            r16 = 1
            if (r3 != 0) goto L_0x0069
        L_0x0067:
            r16 = 0
        L_0x0069:
            java.lang.String r0 = r19.getNodeValue()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            org.apache.xml.utils.URI r11 = r1.a((java.lang.String) r0, (java.lang.String) r5)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            org.apache.xml.utils.URI r2 = new org.apache.xml.utils.URI     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r2.<init>(r11)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r0 = 0
            r2.setFragment(r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r0 = r2.toString()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.net.URL r14 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r14.<init>(r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.net.URLConnection r12 = r14.openConnection()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r0 = 2
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r15 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r0 = 3
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r2 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            if (r15 == 0) goto L_0x00ae
            if (r2 == 0) goto L_0x00ae
            java.lang.StringBuffer r0 = X.BE8.A0i(r15)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r0 = X.BE9.A0p(r13, r2, r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            byte[] r0 = r0.getBytes()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r2 = org.apache.xml.security.utils.Base64.b((byte[]) r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r0 = "Proxy-Authorization"
            r12.setRequestProperty(r0, r2)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
        L_0x00ae:
            java.lang.String r0 = "WWW-Authenticate"
            java.lang.String r2 = r12.getHeaderField(r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            if (r2 == 0) goto L_0x00f3
            java.lang.String r0 = "Basic"
            boolean r0 = r2.startsWith(r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            if (r0 == 0) goto L_0x00f3
            r0 = 4
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r2 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r0 = 5
            r0 = r18[r0]     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r1 = r1.a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            if (r2 == 0) goto L_0x00f3
            if (r1 == 0) goto L_0x00f3
            java.net.URLConnection r12 = r14.openConnection()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.StringBuffer r0 = X.BE8.A0i(r2)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r0 = X.BE9.A0p(r13, r1, r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            byte[] r0 = r0.getBytes()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r13 = org.apache.xml.security.utils.Base64.b((byte[]) r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r2 = "Authorization"
            java.lang.StringBuffer r1 = X.BE6.A0s()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r0 = "Basic "
            java.lang.String r0 = X.BE9.A0p(r0, r13, r1)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r12.setRequestProperty(r2, r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
        L_0x00f3:
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = r12.getHeaderField(r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.io.InputStream r15 = r12.getInputStream()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.io.ByteArrayOutputStream r12 = X.C108945cZ.A15()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r0]     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r14 = 0
        L_0x0106:
            int r1 = r15.read(r13)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            if (r1 < 0) goto L_0x0112
            r0 = 0
            r12.write(r13, r0, r1)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            int r14 = r14 + r1
            goto L_0x0106
        L_0x0112:
            org.apache.commons.logging.Log r13 = d     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.StringBuffer r1 = X.BE6.A0s()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r0 = "Fetched "
            r1.append(r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r1.append(r14)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r0 = " bytes from URI "
            r1.append(r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r0 = r11.toString()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            X.BE9.A1I(r0, r1, r13)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            org.apache.commons.logging.Log r0 = org.apache.xml.security.signature.XMLSignatureInput.a     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            byte[] r0 = r12.toByteArray()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            org.apache.xml.security.signature.XMLSignatureInput r1 = new org.apache.xml.security.signature.XMLSignatureInput     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r1.<init>((byte[]) r0)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.String r0 = r11.toString()     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r1.n = r0     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            r1.m = r2     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            if (r17 == 0) goto L_0x014c
            if (r16 == 0) goto L_0x014c
            java.lang.System.setProperty(r8, r7)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.System.setProperty(r9, r6)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
            java.lang.System.setProperty(r10, r3)     // Catch:{ MalformedURLException -> 0x0156, IOException -> 0x014d }
        L_0x014c:
            return r1
        L_0x014d:
            r1 = move-exception
            org.apache.xml.security.utils.resolver.ResourceResolverException r2 = new org.apache.xml.security.utils.resolver.ResourceResolverException
            r0 = r19
            r2.<init>((java.lang.String) r4, (java.lang.Exception) r1, (org.w3c.dom.Attr) r0, (java.lang.String) r5)
            throw r2
        L_0x0156:
            r1 = move-exception
            org.apache.xml.security.utils.resolver.ResourceResolverException r2 = new org.apache.xml.security.utils.resolver.ResourceResolverException
            r0 = r19
            r2.<init>((java.lang.String) r4, (java.lang.Exception) r1, (org.w3c.dom.Attr) r0, (java.lang.String) r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP.a(org.w3c.dom.Attr, java.lang.String):org.apache.xml.security.signature.XMLSignatureInput");
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw BE8.A0l(e2);
        }
    }
}
