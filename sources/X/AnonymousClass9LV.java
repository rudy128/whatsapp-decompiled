package X;

import android.text.TextUtils;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9LV  reason: invalid class name */
public class AnonymousClass9LV extends Exception {
    public static final Set A00;
    public final Map mAdditionalAnnotations;
    public String mStatusCode;
    public final C179629Is mType;

    public String A00() {
        String message;
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            jsonWriter.name("error_domain").value(this.mType.name());
            if (!TextUtils.isEmpty(this.mStatusCode)) {
                jsonWriter.name("error_code").value(this.mStatusCode);
            }
            if (!TextUtils.isEmpty(getMessage())) {
                JsonWriter name = jsonWriter.name("description");
                if (getMessage().length() > 200) {
                    message = AnonymousClass8BS.A0o(getMessage(), 200);
                } else {
                    message = getMessage();
                }
                name.value(message);
            }
            Map map = this.mAdditionalAnnotations;
            if (map != null && !map.isEmpty()) {
                Iterator A15 = AnonymousClass000.A15(this.mAdditionalAnnotations);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    if (!A00.contains(A16.getKey())) {
                        jsonWriter.name(C17880vN.A0x(A16)).value(AnonymousClass8BR.A10(A16));
                    }
                }
            }
            jsonWriter.endObject();
            return stringWriter.toString();
        } catch (IOException unused) {
            return "";
        }
    }

    static {
        String[] A1b = AnonymousClass8BR.A1b();
        A1b[0] = "error_code";
        A1b[1] = "error_domain";
        A00 = C17900vP.A0I("description", A1b, 2);
    }

    public AnonymousClass9LV(C179629Is r1, String str, String str2, Throwable th, Map map) {
        super(str, th);
        this.mType = r1;
        this.mStatusCode = str2;
        this.mAdditionalAnnotations = map;
    }
}
