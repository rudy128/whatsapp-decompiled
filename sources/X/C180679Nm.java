package X;

import android.util.JsonWriter;

/* renamed from: X.9Nm  reason: invalid class name and case insensitive filesystem */
public final class C180679Nm {
    public long A00;
    public String A01;
    public boolean A02;

    public final void A00(JsonWriter jsonWriter) {
        jsonWriter.beginObject();
        jsonWriter.name("relative_path").value(this.A01);
        jsonWriter.name("size").value(this.A00);
        jsonWriter.name("required").value(this.A02);
        jsonWriter.endObject();
    }
}
