package X;

import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.6Wv  reason: invalid class name and case insensitive filesystem */
public abstract class C124046Wv {
    public static final Exception A00(A6Y a6y) {
        String A03 = a6y.A03("MODEL_DOWNLOADING_ERROR_KEY");
        if (A03 == null) {
            return new Exception("Error Type is Unknown");
        }
        String A032 = a6y.A03("MODEL_DOWNLOADING_ERROR_REASON_KEY");
        if (A032 == null) {
            A032 = "Unknown Error";
        }
        switch (A03.hashCode()) {
            case -1962008936:
                if (A03.equals("ModelNotFound")) {
                    return new C119856Ae(A032);
                }
                break;
            case -965937564:
                if (A03.equals("FileNotFoundException")) {
                    return new FileNotFoundException(A032);
                }
                break;
            case -887763096:
                if (A03.equals("LowStorageException")) {
                    return new AnonymousClass6SF(A032);
                }
                break;
            case -552505849:
                if (A03.equals("MaxRetriesExhausted")) {
                    return new AnonymousClass6SG(A032);
                }
                break;
            case 872080066:
                if (A03.equals("DecompressionFailed")) {
                    return new AnonymousClass6SE(A032);
                }
                break;
            case 1009115343:
                if (A03.equals("SecurityException")) {
                    return new SecurityException(A032);
                }
                break;
            case 1329093493:
                if (A03.equals("RenameFileException")) {
                    return new AnonymousClass6SI(A032);
                }
                break;
            case 1367593608:
                if (A03.equals("NoSuchAlgorithmException")) {
                    return new NoSuchAlgorithmException(A032);
                }
                break;
            case 1379812394:
                if (A03.equals("Unknown")) {
                    return new Exception(A032);
                }
                break;
        }
        return new Exception(A032);
    }
}
