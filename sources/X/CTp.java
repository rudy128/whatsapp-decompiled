package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CTp {
    public int A00;
    public int A01;
    public ArrayList A02 = AnonymousClass000.A13();
    public final AnonymousClass181 A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass1D9 A05;
    public final File A06;
    public final String A07;
    public final List A08;

    public CTp(AnonymousClass181 r4, AnonymousClass11P r5, AnonymousClass118 r6, AnonymousClass1D9 r7, String str) {
        String[] strArr = new String[41];
        strArr[0] = "es-AR";
        strArr[1] = "en-AU";
        strArr[2] = "de-AT";
        strArr[3] = "nl-BE";
        strArr[4] = "fr-BE";
        strArr[5] = "pt-BR";
        strArr[6] = "en-CA";
        strArr[7] = "fr-CA";
        strArr[8] = "es-CL";
        strArr[9] = "da-DK";
        strArr[10] = "fi-FI";
        strArr[11] = "fr-FR";
        strArr[12] = "de-DE";
        strArr[13] = "zh-HK";
        strArr[14] = "en-IN";
        strArr[15] = "en-ID";
        strArr[16] = "en-IE";
        strArr[17] = "it-IT";
        strArr[18] = "ja-JP";
        strArr[19] = "ko-KR";
        strArr[20] = "en-MY";
        strArr[21] = "es-MX";
        strArr[22] = "nl-NL";
        strArr[23] = "en-NZ";
        strArr[24] = "no-NO";
        strArr[25] = "zh-CN";
        strArr[26] = "pl-PL";
        strArr[27] = "pt-PT";
        strArr[28] = "en-PH";
        strArr[29] = "ru-RU";
        strArr[30] = "ar-SA";
        strArr[31] = "en-ZA";
        strArr[32] = "es-ES";
        strArr[33] = "sv-SE";
        strArr[34] = "fr-CH";
        strArr[35] = "de-CH";
        strArr[36] = "zh-TW";
        strArr[37] = "tr-TR";
        strArr[38] = "en-GB";
        strArr[39] = "en-US";
        this.A08 = AnonymousClass8BR.A15("es-US", strArr, 40);
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r7;
        this.A07 = str;
        File A0e = C17880vN.A0e(r6.A00.getCacheDir(), "Bing");
        this.A06 = A0e;
        if (!A0e.mkdirs()) {
            Log.e("WebImageSearcher/failed to create cache dir");
        }
    }
}
