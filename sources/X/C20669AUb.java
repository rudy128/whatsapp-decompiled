package X;

import android.os.ConditionVariable;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.AUb  reason: case insensitive filesystem */
public class C20669AUb implements C22554BCn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C20669AUb(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    public /* synthetic */ void Bpi(String str) {
        if (1 - this.A00 == 0) {
            C18070vi.A0d(str, 0);
        }
    }

    public void Bt0(String str) {
        String substring;
        switch (this.A00) {
            case 0:
                if (AnonymousClass1EG.A0H(str)) {
                    substring = "";
                } else {
                    substring = str.substring(0, Math.min(str.length(), 500));
                }
                AnonymousClass190 r4 = ((A8A) this.A01).A01;
                StringBuilder A10 = AnonymousClass000.A10();
                File file = (File) this.A02;
                A10.append(file.length());
                r4.A0G("voip-time-series-upload-fail", AnonymousClass001.A1H(":uploadServiceError:", substring, A10), false);
                StringBuilder A102 = AnonymousClass000.A10();
                AnonymousClass8BV.A1J(file, "app/VoipTimeSeriesLogger: failed upload of ", A102);
                AnonymousClass8BV.A1I(file, " with size ", A102);
                A102.append("reason: ");
                A102.append(substring);
                A102.append(" using Whatson API: ");
                AnonymousClass8BW.A1N(this.A03, A102);
                return;
            case 1:
                C17900vP.A0e("IdvImageUploader/upload/OnError: ", str, AnonymousClass000.A10());
                C197969xZ.A00((C197969xZ) ((C188149gx) this.A03).A02.get(), "mv_idv_upload_tag", false);
                ((File) this.A02).delete();
                C31761g5 r1 = (C31761g5) this.A01;
                if (r1.Be2()) {
                    r1.resumeWith(C30691eM.A00(AnonymousClass8BR.A0w(str)));
                    return;
                }
                return;
            default:
                C17900vP.A0e("debug-builder/uploadLogsInternal Error received: ", str, AnonymousClass000.A10());
                return;
        }
    }

    public void C3W(String str, Map map) {
        Object A002;
        switch (this.A00) {
            case 0:
                AnonymousClass190 r4 = ((A8A) this.A01).A01;
                File file = (File) this.A02;
                r4.A0G("voip-time-series-upload-success", String.valueOf(file.length()), false);
                StringBuilder A10 = AnonymousClass000.A10();
                AnonymousClass8BV.A1J(file, "app/VoipTimeSeriesLogger: successful upload of ", A10);
                AnonymousClass8BV.A1I(file, " with size ", A10);
                A10.append(" using Whatson API: ");
                C17900vP.A0b(this.A03, A10);
                return;
            case 1:
                ((File) this.A02).delete();
                C31761g5 r3 = (C31761g5) this.A01;
                if (r3.Be2()) {
                    if (str == null || str.length() == 0) {
                        C197969xZ.A00((C197969xZ) ((C188149gx) this.A03).A02.get(), "mv_idv_upload_tag", false);
                        A002 = C30691eM.A00(AnonymousClass8BR.A0w("empty response"));
                    } else {
                        C197969xZ.A00((C197969xZ) ((C188149gx) this.A03).A02.get(), "mv_idv_upload_tag", true);
                        JSONObject A16 = C17880vN.A16(str);
                        A16.getBoolean("success");
                        A002 = C18070vi.A0J("file_handle1", A16);
                    }
                    r3.resumeWith(A002);
                    return;
                }
                return;
            default:
                Iterator A15 = AnonymousClass000.A15(map);
                while (A15.hasNext()) {
                    A15.next();
                }
                List A0t = AnonymousClass8BS.A0t("X-Uploaded-File-Id", map);
                if (A0t != null && !A0t.isEmpty()) {
                    ((StringBuffer) this.A02).append((String) C108955ca.A0p(A0t));
                }
                ((ConditionVariable) this.A03).open();
                return;
        }
    }

    public /* synthetic */ void Bpq() {
    }

    public /* synthetic */ void Bqr(long j) {
    }
}
