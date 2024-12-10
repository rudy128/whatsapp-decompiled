package X;

import com.whatsapp.ml.v2.MLModelDownloaderManagerV2;
import com.whatsapp.ml.v2.MLModelUtilV2;
import com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* renamed from: X.82t  reason: invalid class name and case insensitive filesystem */
public final class C1589782t extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass8AS $mlQplLogger;
    public final /* synthetic */ AnonymousClass8Ak $provider;
    public final /* synthetic */ MLModelDownloadWorkerV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1589782t(AnonymousClass8AS r2, AnonymousClass8Ak r3, MLModelDownloadWorkerV2 mLModelDownloadWorkerV2) {
        super(1);
        this.this$0 = mLModelDownloadWorkerV2;
        this.$provider = r3;
        this.$mlQplLogger = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1D6 A01;
        String str;
        String message;
        Throwable th = (Throwable) obj;
        C18070vi.A0d(th, 0);
        MLModelDownloaderManagerV2 mLModelDownloaderManagerV2 = this.this$0.A02;
        AnonymousClass8Ak r4 = this.$provider;
        AnonymousClass8AS r2 = this.$mlQplLogger;
        C18070vi.A0j(r4, r2);
        Log.e("MLModelDownloaderManagerV2/processException", th);
        C134406qX r5 = (C134406qX) C18070vi.A0E(mLModelDownloaderManagerV2.A00);
        MLModelUtilV2 mLModelUtilV2 = (MLModelUtilV2) C18070vi.A0E(mLModelDownloaderManagerV2.A01);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(mLModelUtilV2, 3);
        String A00 = MLModelUtilV2.A00(r4.BV1());
        C18070vi.A0d(A00, 0);
        C127536eW r7 = r5.A00;
        String A0y = AnonymousClass000.A0y("_cancel", AnonymousClass000.A11(A00));
        C18070vi.A0d(A0y, 0);
        if (C17880vN.A0C(r7.A01).getBoolean(A0y, false) || (!(th instanceof C119846Ad) && !(th instanceof AnonymousClass6SH) && !(th instanceof UnknownHostException) && !(th instanceof SocketException) && !(th instanceof SocketTimeoutException) && (!(th instanceof IOException) || (message = th.getMessage()) == null || !message.equals("closed")))) {
            r5.A02(MLModelUtilV2.A00(r4.BV1()));
            AnonymousClass708 BV1 = r4.BV1();
            String A03 = mLModelUtilV2.A03(BV1);
            File A17 = C108945cZ.A17(mLModelUtilV2.A04(BV1));
            C64062u9.A0Q(C108945cZ.A17(A03));
            C64062u9.A0Q(A17);
            String str2 = "";
            if (th instanceof FileNotFoundException) {
                String message2 = th.getMessage();
                if (message2 != null) {
                    str2 = message2;
                }
                str = "FileNotFoundException";
            } else if (th instanceof NoSuchAlgorithmException) {
                String message3 = th.getMessage();
                if (message3 != null) {
                    str2 = message3;
                }
                str = "NoSuchAlgorithmException";
            } else {
                if (th instanceof C119856Ae) {
                    A01 = AnonymousClass1D6.A01("ModelNotFound", ((C119856Ae) th).reason);
                } else if (th instanceof SecurityException) {
                    String message4 = th.getMessage();
                    if (message4 != null) {
                        str2 = message4;
                    }
                    str = "SecurityException";
                } else if (th instanceof AnonymousClass6SF) {
                    String message5 = th.getMessage();
                    if (message5 != null) {
                        str2 = message5;
                    }
                    str = "LowStorageException";
                } else if (th instanceof AnonymousClass6SI) {
                    String message6 = th.getMessage();
                    if (message6 != null) {
                        str2 = message6;
                    }
                    str = "RenameFileException";
                } else if (th instanceof AnonymousClass6SE) {
                    String message7 = th.getMessage();
                    if (message7 != null) {
                        str2 = message7;
                    }
                    str = "DecompressionFailed";
                } else if (th instanceof AnonymousClass6SG) {
                    String message8 = th.getMessage();
                    if (message8 != null) {
                        str2 = message8;
                    }
                    str = "MaxRetriesExhausted";
                } else {
                    String message9 = th.getMessage();
                    if (message9 != null) {
                        str2 = message9;
                    }
                    A01 = AnonymousClass1D6.A01("Unknown", str2);
                }
                String str3 = (String) A01.first;
                String str4 = (String) A01.second;
                r2.Bir("fail_ex", str3);
                r2.Bir("fail_message", str4);
                r2.Bis("enabled_when_ex", r4.isEnabled());
                r2.Biu(3);
                C192939pH r22 = new C192939pH();
                Map map = r22.A00;
                map.put("MODEL_DOWNLOADING_ERROR_KEY", str3);
                map.put("MODEL_DOWNLOADING_ERROR_REASON_KEY", str4);
                return new C162168Jj(r22.A00());
            }
            A01 = AnonymousClass1D6.A01(str, str2);
            String str32 = (String) A01.first;
            String str42 = (String) A01.second;
            r2.Bir("fail_ex", str32);
            r2.Bir("fail_message", str42);
            r2.Bis("enabled_when_ex", r4.isEnabled());
            r2.Biu(3);
            C192939pH r222 = new C192939pH();
            Map map2 = r222.A00;
            map2.put("MODEL_DOWNLOADING_ERROR_KEY", str32);
            map2.put("MODEL_DOWNLOADING_ERROR_REASON_KEY", str42);
            return new C162168Jj(r222.A00());
        }
        r5.A02(MLModelUtilV2.A00(r4.BV1()));
        r2.Biu(53);
        return new Object();
    }
}
