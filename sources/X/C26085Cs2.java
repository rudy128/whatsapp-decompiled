package X;

import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URLConnection;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;

/* renamed from: X.Cs2  reason: case insensitive filesystem */
public class C26085Cs2 {
    public static Map A00 = Collections.synchronizedMap(new WeakHashMap());

    public static Collection A00(URI uri, CertificateFactory certificateFactory) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", uri.toString());
        try {
            byte[] bArr = (byte[]) new InitialDirContext(hashtable).getAttributes("").get("certificateRevocationList;binary").get();
            if (bArr != null && bArr.length != 0) {
                return certificateFactory.generateCRLs(BE6.A0h(bArr));
            }
            throw new CRLException(AnonymousClass001.A1E(uri, "no CRL returned from: ", AnonymousClass000.A10()));
        } catch (NamingException e) {
            throw new CRLException(BEA.A0j(uri, "issue connecting to: ", AnonymousClass000.A10()), e);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.DSI] */
    public static synchronized DSI A01(URI uri, CertificateFactory certificateFactory, Date date) {
        DSI dsi;
        Collection<? extends CRL> generateCRLs;
        DSI dsi2;
        synchronized (C26085Cs2.class) {
            Map map = A00;
            WeakReference weakReference = (WeakReference) map.get(uri);
            if (weakReference != null && (dsi2 = (DSI) weakReference.get()) != null) {
                Iterator A0y = AnonymousClass8BV.A0y(dsi2.A00);
                while (true) {
                    if (A0y.hasNext()) {
                        Date nextUpdate = ((X509CRL) A0y.next()).getNextUpdate();
                        if (nextUpdate != null && nextUpdate.before(date)) {
                            break;
                        }
                    } else {
                        dsi = dsi2;
                        break;
                    }
                }
            }
            if (uri.getScheme().equals("ldap")) {
                generateCRLs = A00(uri, certificateFactory);
            } else {
                URLConnection openConnection = uri.toURL().openConnection();
                openConnection.setConnectTimeout(15000);
                openConnection.setReadTimeout(15000);
                InputStream inputStream = openConnection.getInputStream();
                generateCRLs = certificateFactory.generateCRLs(inputStream);
                inputStream.close();
            }
            ArrayList A10 = C17880vN.A10(generateCRLs);
            ? obj = new Object();
            obj.A00 = C17880vN.A10(C17880vN.A10(A10));
            map.put(uri, AnonymousClass3MW.A0z(obj));
            dsi = obj;
        }
        return dsi;
    }
}
