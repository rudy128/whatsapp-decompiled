package com.facebook.msys.mci;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0DT;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BW;
import X.C108945cZ;
import X.C28111Yx;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.wamsys.Hex;
import com.whatsapp.wamsys.SecureUriParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class DefaultCrypto implements Crypto {
    public static final int BUFFER_SIZE = 8192;
    public static final String HMAC_SHA256 = "HmacSHA256";
    public static final Class TAG = DefaultCrypto.class;
    public static final String UTF_8 = "UTF-8";
    public static final Crypto mCrypto = new Object();

    private String computeSHA256Impl(String str, String str2) {
        Throwable th;
        FileInputStream fileInputStream;
        int read;
        String str3 = str;
        try {
            Uri parseEncodedRFC2396 = SecureUriParser.parseEncodedRFC2396(str3);
            String scheme = parseEncodedRFC2396.getScheme();
            if (TextUtils.isEmpty(scheme)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Invalid fileUrlString: ");
                th = AnonymousClass001.A12(str3, A10);
            } else if (scheme.equalsIgnoreCase("file")) {
                String path = parseEncodedRFC2396.getPath();
                if (!TextUtils.isEmpty(path)) {
                    File A17 = C108945cZ.A17(path);
                    if (A17.exists()) {
                        String path2 = A17.getPath();
                        try {
                            fileInputStream = new FileInputStream(path2);
                            File A172 = C108945cZ.A17(path2);
                            byte[] bArr = new byte[BUFFER_SIZE];
                            long length = A172.length();
                            Mac instance = Mac.getInstance(HMAC_SHA256);
                            instance.init(new SecretKeySpec(str2.getBytes(), HMAC_SHA256));
                            long j = length;
                            long j2 = 0;
                            boolean z = true;
                            while (j > 0 && (read = fileInputStream.read(bArr)) != -1) {
                                int i = 0;
                                while (z && i < 8192) {
                                    z = AnonymousClass000.A1P(bArr[i]);
                                    i++;
                                }
                                int min = Math.min((int) j, read);
                                instance.update(bArr, 0, min);
                                j2 += (long) read;
                                j -= (long) min;
                            }
                            if (!z && j2 == length && j == 0) {
                                String A0n = AnonymousClass8BS.A0n(Hex.encodeHex(instance.doFinal(), false));
                                fileInputStream.close();
                                return A0n;
                            }
                            throw AnonymousClass8BR.A0w("Unable to read all bytes from file");
                        } catch (NoSuchAlgorithmException e) {
                            throw new RuntimeException("HMAC SHA256 algorithm is not found.", e);
                        } catch (UnsupportedEncodingException e2) {
                            throw new RuntimeException("UTF_8 encoding is not supported.", e2);
                        } catch (InvalidKeyException e3) {
                            throw new RuntimeException("Invalid secret key.", e3);
                        } catch (IOException e4) {
                            throw new RuntimeException("Couldn't read the content.", e4);
                        } catch (IllegalStateException e5) {
                            throw new RuntimeException("Couldn't update the hash.", e5);
                        } catch (IllegalArgumentException e6) {
                            throw new RuntimeException("Invalid arguments", e6);
                        } catch (Exception e7) {
                            throw new RuntimeException("Unexpected exception", e7);
                        } catch (Throwable th2) {
                            AnonymousClass0DT.A00(th, th2);
                        }
                    } else {
                        th = new FileNotFoundException(AnonymousClass001.A1H("File does not exist. Url: ", str3, AnonymousClass000.A10()));
                    }
                } else {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("Invalid input file Url: ");
                    th = AnonymousClass001.A12(str3, A102);
                }
            } else {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("Url MUST be of 'file:' scheme. Found: ");
                th = AnonymousClass001.A12(scheme, A103);
            }
            throw th;
            throw th;
        } catch (FileNotFoundException | IllegalArgumentException | SecurityException e8) {
            throw new RuntimeException("Exception while parsing fileUrl", e8);
        }
    }

    public byte[] computeMd5(byte[] bArr) {
        try {
            byte[] A1W = AnonymousClass8BW.A1W(bArr, "MD5");
            StringBuilder A10 = AnonymousClass000.A10();
            for (byte valueOf : A1W) {
                A10.append(AnonymousClass8BS.A0l(Byte.valueOf(valueOf), "%02x", AnonymousClass3MW.A1a(), 0));
            }
            return A10.toString().getBytes();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm was not found. Should not happen", e);
        }
    }

    public byte[] computeMd5V2(byte[] bArr) {
        try {
            return AnonymousClass8BS.A0n(Hex.encodeHex(AnonymousClass8BW.A1W(bArr, "MD5"), false)).getBytes();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm was not found. Should not happen", e);
        }
    }

    public String computeSHA256(byte[] bArr, String str) {
        C28111Yx.A03(bArr, "file bytes can not be null");
        try {
            Mac instance = Mac.getInstance(HMAC_SHA256);
            instance.init(new SecretKeySpec(str.getBytes(UTF_8), HMAC_SHA256));
            return AnonymousClass8BS.A0n(Hex.encodeHex(instance.doFinal(bArr), false));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("HMAC SHA256 algorithm is not found.", e);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF_8 encoding is not supported.", e2);
        } catch (InvalidKeyException e3) {
            throw new RuntimeException("Invalid secret key.", e3);
        }
    }

    public static Crypto get() {
        return mCrypto;
    }

    public String computeSHA256(String str, String str2) {
        try {
            return computeSHA256Impl(str, str2);
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
