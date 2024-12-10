package X;

import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.AiF  reason: case insensitive filesystem */
public class C21330AiF implements Closeable {
    public boolean A00;
    public final JsonWriter A01;
    public final C201110w A02;
    public final ZipOutputStream A03;

    public void close() {
        if (!this.A00) {
            JsonWriter jsonWriter = this.A01;
            jsonWriter.endObject();
            jsonWriter.flush();
            this.A03.closeEntry();
            this.A00 = true;
        }
    }

    public C21330AiF(Map map, ZipOutputStream zipOutputStream) {
        this.A02 = C201110w.copyOf(map);
        this.A03 = zipOutputStream;
        zipOutputStream.putNextEntry(new ZipEntry("metadata.json"));
        JsonWriter jsonWriter = new JsonWriter(new BufferedWriter(new OutputStreamWriter(zipOutputStream)));
        this.A01 = jsonWriter;
        jsonWriter.beginObject();
    }
}
