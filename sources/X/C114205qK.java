package X;

import android.util.JsonReader;
import com.whatsapp.util.Log;
import java.io.StringReader;

/* renamed from: X.5qK  reason: invalid class name and case insensitive filesystem */
public final class C114205qK extends DID {
    public final /* synthetic */ C23188Bci A00;
    public final /* synthetic */ C25959CpR A01;

    public C114205qK(C23188Bci bci, C25959CpR cpR) {
        this.A00 = bci;
        this.A01 = cpR;
    }

    public final /* bridge */ /* synthetic */ void BkV(Object obj) {
        String str;
        C25959CpR cpR = this.A01;
        AnonymousClass73G r4 = ((C138796xi) obj).A00;
        C136296ta r1 = r4.A02;
        if (r1.A05 == null) {
            r1.A05 = C108955ca.A0m();
        }
        int i = cpR.A03;
        if (i == 1) {
            C138996y2 r8 = (C138996y2) r4.A0G.getValue();
            AnonymousClass6J2 r5 = r4.A0B;
            C18070vi.A0d(r5, 1);
            byte[] bArr = cpR.A07;
            if (bArr != null) {
                JsonReader jsonReader = new JsonReader(new StringReader(C108955ca.A13(bArr)));
                jsonReader.beginObject();
                String str2 = "";
                long j = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (C18070vi.A18(nextName, "payload_id")) {
                        j = jsonReader.nextLong();
                    } else if (C18070vi.A18(nextName, "file_name")) {
                        str2 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                if (j == 0 || str2.length() == 0) {
                    str = "thunderstorm_logs: ThunderstormMediaContentManager/ handleBytePayload/ not able to get necessary information from byte payload";
                } else {
                    String A012 = r8.A01(str2);
                    if (A012.length() == 0) {
                        str = "thunderstorm_logs: ThunderstormMediaContentManager/ handleBytePayload/ invalid file name";
                    } else {
                        r5.A01.put(Long.valueOf(j), A012);
                        return;
                    }
                }
            } else {
                return;
            }
        } else if (i != 2) {
            str = AnonymousClass001.A1I("thunderstorm_logs: ThunderstormManager/ unsupported payload type: ", AnonymousClass000.A10(), i);
        } else {
            r4.A0B.A04.put(Long.valueOf(cpR.A04), cpR);
            return;
        }
        Log.w(str);
    }
}
