package X;

import android.util.JsonReader;
import com.whatsapp.util.Log;
import java.io.Closeable;

/* renamed from: X.AiH  reason: case insensitive filesystem */
public abstract class C21332AiH implements Closeable {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final JsonReader A04;

    public void close() {
        this.A01 = true;
        this.A04.close();
    }

    public boolean A01() {
        if (!this.A01) {
            JsonReader jsonReader = this.A04;
            if (this.A00 != null) {
                return true;
            }
            if (!this.A02) {
                if (!this.A03) {
                    jsonReader.beginObject();
                    while (true) {
                        if (!jsonReader.hasNext()) {
                            break;
                        } else if ("files".equals(jsonReader.nextName())) {
                            jsonReader.beginArray();
                            this.A03 = true;
                            break;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    this.A02 = true;
                }
                while (jsonReader.hasNext()) {
                    C173618vN r8 = (C173618vN) this;
                    jsonReader.beginObject();
                    C193889qp r7 = null;
                    long j = -1;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (nextName.equals("path")) {
                            str = jsonReader.nextString();
                        } else if (!nextName.equals("size")) {
                            Log.e("GoogleMigrateFileData/parseFileDataObject/field not recognized");
                            jsonReader.skipValue();
                        } else {
                            j = jsonReader.nextLong();
                        }
                    }
                    jsonReader.endObject();
                    if (str != null) {
                        r7 = new C193889qp(r8.A00.A02(str), j);
                    } else {
                        Log.e("GoogleMigrateFileData/parseFileDataObject/file path is null or empty");
                    }
                    this.A00 = r7;
                    if (r7 != null) {
                        return true;
                    }
                }
                this.A02 = true;
            }
            return false;
        }
        throw C17880vN.A0f("Closed.");
    }

    public C21332AiH(JsonReader jsonReader) {
        this.A04 = jsonReader;
    }
}
