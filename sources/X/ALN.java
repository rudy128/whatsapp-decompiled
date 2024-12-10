package X;

import android.util.JsonReader;
import android.util.JsonToken;

public class ALN implements E9W {
    public ALO A00;
    public Integer A01;
    public String A02;
    public final JsonReader A03;

    public Integer BkN() {
        Integer num;
        this.A02 = null;
        this.A00 = null;
        JsonReader jsonReader = this.A03;
        JsonToken peek = jsonReader.peek();
        int[] iArr = AnonymousClass9TG.A00;
        switch (iArr[peek.ordinal()]) {
            case 1:
                num = AnonymousClass00R.A0Y;
                break;
            case 2:
                num = AnonymousClass00R.A15;
                break;
            case 3:
                num = AnonymousClass00R.A19;
                break;
            case 4:
                num = AnonymousClass00R.A00;
                break;
            case 5:
                num = AnonymousClass00R.A01;
                break;
            case 6:
                num = AnonymousClass00R.A0C;
                break;
            case 7:
                num = AnonymousClass00R.A0N;
                break;
            case 8:
                num = AnonymousClass00R.A02;
                break;
            case 9:
                num = AnonymousClass00R.A18;
                break;
            case 10:
                num = AnonymousClass00R.A0j;
                break;
            default:
                throw AnonymousClass000.A0n(AnonymousClass001.A1E(peek, "unknown JsonToken ", AnonymousClass000.A10()));
        }
        this.A01 = num;
        switch (iArr[jsonReader.peek().ordinal()]) {
            case 1:
                this.A02 = jsonReader.nextName();
                break;
            case 2:
            case 3:
            case 9:
            case 10:
                this.A00 = new ALO(jsonReader);
                break;
            case 4:
                jsonReader.beginArray();
                break;
            case 5:
                jsonReader.endArray();
                break;
            case 6:
                jsonReader.beginObject();
                break;
            case 7:
                jsonReader.endObject();
                break;
            case 8:
                break;
            default:
                throw AnonymousClass000.A0n("unknown JsonToken ");
        }
        return this.A01;
    }

    public void CNS() {
        Integer num = this.A01;
        Integer num2 = AnonymousClass00R.A00;
        if (num == num2 || num == AnonymousClass00R.A0C) {
            int i = 1;
            while (true) {
                Integer BkN = BkN();
                if (BkN == num2 || BkN == AnonymousClass00R.A0C) {
                    i++;
                } else if (BkN == AnonymousClass00R.A01 || BkN == AnonymousClass00R.A0N) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public ALN(JsonReader jsonReader) {
        this.A03 = jsonReader;
    }

    public String CBN() {
        return this.A02;
    }

    public Integer CBO() {
        return this.A01;
    }

    public C28595E9m CBP() {
        return this.A00;
    }
}
