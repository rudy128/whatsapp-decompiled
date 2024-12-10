package X;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;

/* renamed from: X.9vD  reason: invalid class name and case insensitive filesystem */
public abstract class C196529vD {
    public static void A00(BAS bas, C58372ka r7, String str) {
        String str2;
        JsonReader jsonReader;
        if (r7 != null) {
            r7.A00("START_PARSE");
        }
        try {
            jsonReader = new JsonReader(new StringReader(str));
            ALN aln = new ALN(jsonReader);
            aln.BkN();
            C17890vO.A0D().post(new C21455AkM(C25529ChR.A00(aln), bas, r7, 40));
            jsonReader.close();
            return;
        } catch (IOException e) {
            bas.Bt0(e.getMessage());
            if (r7 == null) {
                return;
            }
            r7.A00("END_PARSE_FAIL");
            return;
        } catch (OutOfMemoryError e2) {
            if (e2.getMessage() != null) {
                str2 = e2.getMessage();
            } else {
                str2 = "OutOfMemoryError";
            }
            bas.Bt0(str2);
            if (r7 == null) {
                return;
            }
            r7.A00("END_PARSE_FAIL");
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static void A01(BAT bat, C58372ka r6, String str) {
        JsonReader jsonReader;
        if (r6 != null) {
            r6.A00("START_PARSE");
        }
        try {
            jsonReader = new JsonReader(new StringReader(str));
            ALN aln = new ALN(jsonReader);
            aln.BkN();
            C17890vO.A0D().post(new C21455AkM(C25529ChR.A00(aln), bat, r6, 39));
            jsonReader.close();
            return;
        } catch (IOException e) {
            bat.Bt0(e.getMessage());
            if (r6 != null) {
                r6.A00("END_PARSE_FAIL");
                return;
            }
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }
}
