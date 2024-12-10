package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0xE  reason: invalid class name and case insensitive filesystem */
public class C18830xE {
    public File A00;
    public final C18220vy A01;

    private File A00() {
        if (this.A00 == null) {
            synchronized (this) {
                if (this.A00 == null) {
                    C18220vy r3 = this.A01;
                    C18220vy.A02(r3);
                    File filesDir = r3.A00.getFilesDir();
                    StringBuilder sb = new StringBuilder();
                    sb.append("PersistedInstallation.");
                    sb.append(r3.A04());
                    sb.append(".json");
                    this.A00 = new File(filesDir, sb.toString());
                }
            }
        }
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.CXF, java.lang.Object] */
    public C23572Bm0 A01() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(A00());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        C24686CFk cFk = C24686CFk.A00;
        ? obj = new Object();
        obj.A02 = 0L;
        obj.A00 = AnonymousClass00R.A00;
        obj.A01 = 0L;
        obj.A04 = optString;
        Integer num = AnonymousClass00R.A00(5)[optInt];
        if (num != null) {
            obj.A00 = num;
            obj.A03 = optString2;
            obj.A06 = optString3;
            obj.A02 = Long.valueOf(optLong);
            obj.A01 = Long.valueOf(optLong2);
            obj.A05 = optString4;
            return obj.A00();
        }
        throw new NullPointerException("Null registrationStatus");
        throw th;
    }

    public void A02(C24686CFk cFk) {
        try {
            JSONObject jSONObject = new JSONObject();
            C23572Bm0 bm0 = (C23572Bm0) cFk;
            jSONObject.put("Fid", bm0.A04);
            jSONObject.put("Status", bm0.A02.intValue());
            jSONObject.put("AuthToken", bm0.A03);
            jSONObject.put("RefreshToken", bm0.A06);
            jSONObject.put("TokenCreationEpochInSecs", bm0.A01);
            jSONObject.put("ExpiresInSecs", bm0.A00);
            jSONObject.put("FisError", bm0.A05);
            C18220vy r0 = this.A01;
            C18220vy.A02(r0);
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", r0.A00.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(DefaultCrypto.UTF_8));
            fileOutputStream.close();
            if (!createTempFile.renameTo(A00())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public C18830xE(C18220vy r1) {
        this.A01 = r1;
    }
}
