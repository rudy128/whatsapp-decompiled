package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

public class ALO implements C28595E9m {
    public Boolean A00;
    public String A01;
    public final JsonToken A02;

    public static IOException A00(ALO alo) {
        StringBuilder sb = new StringBuilder();
        sb.append("type mis matching");
        sb.append(alo.A02);
        return new IOException(sb.toString());
    }

    public boolean BDH() {
        Boolean bool = this.A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw A00(this);
    }

    public int Bdi() {
        String str = this.A01;
        if (str != null) {
            return Integer.valueOf(str).intValue();
        }
        throw A00(this);
    }

    public boolean Bfe() {
        return AnonymousClass000.A1Z(this.A02, JsonToken.NULL);
    }

    public long Bid() {
        String str = this.A01;
        if (str != null) {
            return Long.valueOf(str).longValue();
        }
        throw A00(this);
    }

    public Number BkY() {
        String str = this.A01;
        if (str != null) {
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(str);
            }
        } else {
            throw A00(this);
        }
    }

    public String COi() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        throw A00(this);
    }

    public ALO(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        this.A02 = peek;
        int i = AnonymousClass9TH.A00[peek.ordinal()];
        if (i == 1) {
            this.A00 = Boolean.valueOf(jsonReader.nextBoolean());
        } else if (i == 2) {
            jsonReader.nextNull();
        } else if (i == 3 || i == 4) {
            this.A01 = jsonReader.nextString();
        } else {
            throw AnonymousClass000.A0n("can't read value");
        }
    }
}
