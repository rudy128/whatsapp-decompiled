package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.CfZ  reason: case insensitive filesystem */
public abstract class C25427CfZ {
    public static Map A00 = Collections.synchronizedMap(new WeakHashMap());

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.Dwk, X.1Bx] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.Dx3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.Dwi, X.1By] */
    /* JADX WARNING: type inference failed for: r0v55, types: [java.lang.Object, X.1Bx, X.DxM] */
    public static C28288Dww A00(URI uri, X509Certificate x509Certificate, List list, C28278Dwm dwm, C25597Cic cic, E3R e3r) {
        Map map;
        Throwable A002;
        C28288Dww dww;
        C28338Dxk dxk;
        Map map2 = A00;
        URI uri2 = uri;
        Reference reference = (Reference) map2.get(uri2);
        if (reference != null) {
            map = (Map) reference.get();
        } else {
            map = null;
        }
        int i = 0;
        C28278Dwm dwm2 = dwm;
        C25597Cic cic2 = cic;
        if (!(map == null || (dww = (C28288Dww) map.get(dwm2)) == null)) {
            C28339Dxl dxl = C28311DxJ.A01(C28297Dx5.A01(C28342Dxo.A05(dww.A01.A01)).A02).A02;
            for (int i2 = 0; i2 != dxl.A0K(); i2++) {
                C28299Dx7 A01 = C28299Dx7.A01(dxl.A0M(i2));
                if (dwm2.equals(A01.A02) && (dxk = A01.A00) != null) {
                    try {
                        if (new Date(cic2.A04.getTime()).after(dxk.A0L())) {
                            map.remove(dwm2);
                            dww = null;
                        }
                    } catch (ParseException unused) {
                        map.remove(dwm2);
                    }
                }
            }
            if (dww != null) {
                return dww;
            }
        }
        try {
            URL url = uri2.toURL();
            C26135Csy csy = new C26135Csy();
            ? obj = new Object();
            obj.A00 = dwm2;
            csy.A02(obj);
            C26135Csy csy2 = new C26135Csy();
            byte[] bArr = null;
            while (true) {
                List list2 = list;
                if (i == list2.size()) {
                    break;
                }
                Extension extension = (Extension) list2.get(i);
                byte[] value = extension.getValue();
                if ("1.3.6.1.5.5.7.48.1.2".equals(extension.getId())) {
                    bArr = value;
                }
                AnonymousClass1C0 r0 = C28314DxM.A03;
                AnonymousClass1C0 A19 = BE6.A19(extension.getId());
                boolean isCritical = extension.isCritical();
                C28327DxZ dxZ = new C28327DxZ(value);
                ? obj2 = new Object();
                obj2.A00 = A19;
                obj2.A02 = isCritical;
                obj2.A01 = dxZ;
                csy2.A02(obj2);
                i++;
            }
            C28337Dxj dxj = C28295Dx3.A03;
            C28357Dy3 dy3 = new C28357Dy3(csy);
            C28309DxH A02 = C28309DxH.A02(new C28357Dy3(csy2));
            ? obj3 = new Object();
            obj3.A00 = C28295Dx3.A03;
            obj3.A01 = dy3;
            obj3.A02 = A02;
            try {
                ? obj4 = new Object();
                obj4.A00 = obj3;
                byte[] A0B = obj4.A0B();
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-type", "application/ocsp-request");
                httpURLConnection.setRequestProperty("Content-length", String.valueOf(A0B.length));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(A0B);
                outputStream.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength < 0) {
                    contentLength = 32768;
                }
                ByteArrayOutputStream A15 = C108945cZ.A15();
                long j = (long) contentLength;
                byte[] bArr2 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                long j2 = 0;
                while (true) {
                    int read = inputStream.read(bArr2, 0, ZipDecompressor.UNZIP_BUFFER_SIZE);
                    if (read >= 0) {
                        long j3 = (long) read;
                        if (j - j2 < j3) {
                            A002 = new C24198BxA();
                            break;
                        }
                        j2 += j3;
                        A15.write(bArr2, 0, read);
                    } else {
                        C28288Dww A012 = C28288Dww.A01(A15.toByteArray());
                        C28275Dwj dwj = A012.A00;
                        if (dwj.A00.A0K() == 0) {
                            C28289Dwx A013 = C28289Dwx.A01(A012.A01);
                            if (A013.A00.A0J(EB8.A02)) {
                                if (DZC.A03(x509Certificate, C28297Dx5.A01(A013.A01.A00), cic2, e3r, bArr)) {
                                    Reference reference2 = (Reference) map2.get(uri2);
                                    if (reference2 != null) {
                                        ((Map) reference2.get()).put(dwm2, A012);
                                        return A012;
                                    }
                                    HashMap A11 = C17880vN.A11();
                                    A11.put(dwm2, A012);
                                    map2.put(uri2, AnonymousClass3MW.A0z(A11));
                                    return A012;
                                }
                            }
                            A002 = C25597Cic.A00("OCSP response failed to validate", (Throwable) null, cic2);
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("OCSP responder failed: ");
                            A002 = C25597Cic.A00(C17890vO.A0V(new BigInteger(dwj.A00.A00), A10), (Throwable) null, cic2);
                        }
                    }
                }
                throw A002;
            } catch (IOException e) {
                throw C25597Cic.A00(C17900vP.A0C("configuration error: ", AnonymousClass000.A10(), e), e, cic2);
            }
        } catch (MalformedURLException e2) {
            throw C25597Cic.A00(C17900vP.A0C("configuration error: ", AnonymousClass000.A10(), e2), e2, cic2);
        }
    }
}
