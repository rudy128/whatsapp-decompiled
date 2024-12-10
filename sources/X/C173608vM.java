package X;

import android.util.JsonReader;
import com.whatsapp.util.Log;

/* renamed from: X.8vM  reason: invalid class name and case insensitive filesystem */
public abstract class C173608vM extends C21332AiH {
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.9Nm] */
    public static C180679Nm A00(JsonReader jsonReader) {
        jsonReader.beginObject();
        long j = 0;
        String str = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -393139297:
                    if (!nextName.equals("required")) {
                        break;
                    } else {
                        z = jsonReader.nextBoolean();
                        break;
                    }
                case 3530753:
                    if (!nextName.equals("size")) {
                        break;
                    } else {
                        j = jsonReader.nextLong();
                        break;
                    }
                case 2114191800:
                    if (!nextName.equals("relative_path")) {
                        break;
                    } else {
                        str = jsonReader.nextString();
                        break;
                    }
            }
        }
        jsonReader.endObject();
        if (str == null) {
            Log.e("EncFileInfo/fromJson; file path is null, skipping...");
            return null;
        } else if (j == 0) {
            return null;
        } else {
            ? obj = new Object();
            obj.A01 = str;
            obj.A00 = j;
            obj.A02 = z;
            return obj;
        }
    }
}
