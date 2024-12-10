package X;

import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.OutputStreamWriter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.AiE  reason: case insensitive filesystem */
public class C21329AiE implements Closeable {
    public boolean A00;
    public final JsonWriter A01;
    public final ZipOutputStream A02;

    public void close() {
        if (!this.A00) {
            JsonWriter jsonWriter = this.A01;
            jsonWriter.endObject();
            jsonWriter.flush();
            this.A02.closeEntry();
            this.A00 = true;
        }
    }

    public C21329AiE(ZipOutputStream zipOutputStream) {
        this.A02 = zipOutputStream;
        zipOutputStream.putNextEntry(new ZipEntry("attempt.json"));
        JsonWriter jsonWriter = new JsonWriter(new BufferedWriter(new OutputStreamWriter(zipOutputStream)));
        this.A01 = jsonWriter;
        jsonWriter.beginObject();
    }
}
