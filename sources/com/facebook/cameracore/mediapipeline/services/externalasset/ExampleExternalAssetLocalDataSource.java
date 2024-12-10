package com.facebook.cameracore.mediapipeline.services.externalasset;

import X.AnonymousClass0DT;
import X.C108945cZ;
import com.facebook.native_bridge.NativeDataPromise;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ExampleExternalAssetLocalDataSource implements ExternalAssetLocalDataSource {
    private String getLocalFilePath(String str) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URI(str).toURL();
            String protocol = url.getProtocol();
            if (protocol != null && protocol.equals("file")) {
                return url.getPath();
            }
        } catch (MalformedURLException | URISyntaxException unused) {
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetResponse, java.lang.Object] */
    public boolean getAsset(NativeDataPromise nativeDataPromise, String str, String str2) {
        DataInputStream dataInputStream;
        String localFilePath = getLocalFilePath(str);
        if (localFilePath == null) {
            return false;
        }
        File file = new File(localFilePath);
        byte[] bArr = new byte[((int) file.length())];
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(C108945cZ.A18(file)));
            dataInputStream.readFully(bArr);
            ? obj = new Object();
            obj.buffer = bArr;
            obj.length = (int) file.length();
            obj.completed = true;
            nativeDataPromise.setValue(obj);
            dataInputStream.close();
            return true;
        } catch (IOException unused) {
            nativeDataPromise.setException("ExampleExternalAssetLocalDataSource fails to load file.");
            return false;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getStreamingURI(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r5.hashCode()
            switch(r0) {
                case -384488815: goto L_0x003d;
                case 452781974: goto L_0x0032;
                case 1911932022: goto L_0x0027;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
        L_0x0009:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r2 = 0
            if (r1 != r0) goto L_0x0048
            java.lang.String r0 = r3.getLocalFilePath(r4)
            if (r0 == 0) goto L_0x0048
            java.io.File r1 = X.C108945cZ.A17(r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x0048
            java.net.URI r0 = r1.toURI()
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0027:
            java.lang.String r0 = "image/*"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            goto L_0x0009
        L_0x0032:
            java.lang.String r0 = "video/*"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x0009
        L_0x003d:
            java.lang.String r0 = "model/gltf-binary"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x0009
        L_0x0048:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.externalasset.ExampleExternalAssetLocalDataSource.getStreamingURI(java.lang.String, java.lang.String):java.lang.String");
    }
}
