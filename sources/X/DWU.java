package X;

import com.whatsapp.unity.UnityLib;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class DWU implements C18080vj, C18090vk {
    public final int A00;

    public DWU(int i) {
        this.A00 = i;
    }

    public final Object invoke() {
        switch (this.A00) {
            case 3:
                return new C25490Cgl(false);
            case 4:
                throw AnonymousClass000.A0n("CompositionLocal not present for LocalColors. This is likely because WdsTheme has not been included in your Compose hierarchy.");
            case 5:
                throw AnonymousClass000.A0n("CompositionLocal not present for LocalDimension. This is likely because WaRoot has not been included in your Compose hierarchy.");
            case 6:
                throw AnonymousClass000.A0n("CompositionLocal not present for LocalShapes. This is likely because WaRoot has not been included in your Compose hierarchy.");
            case 7:
                throw AnonymousClass000.A0n("CompositionLocal not present for LocalTypography. This is likely because WaRoot has not been included in your Compose hierarchy.");
            case 8:
                Locale[] localeArr = new Locale[4];
                localeArr[0] = Locale.CHINA;
                localeArr[1] = Locale.TAIWAN;
                localeArr[2] = Locale.JAPAN;
                return BE6.A15(Locale.KOREA, localeArr, 3);
            case 25:
                AnonymousClass1D6[] r2 = new AnonymousClass1D6[6];
                C72463Mc.A1H(C24099BvR.A00, C24352Bzn.UNKNOWN, r2);
                C108985cd.A1G(C24094BvM.A00, C24352Bzn.ENGLISH, r2);
                C72463Mc.A1I(C24098BvQ.A00, C24352Bzn.SPANISH, r2);
                C72463Mc.A1J(C24096BvO.A00, C24352Bzn.PORTUGUESE, r2);
                AnonymousClass8BW.A1L(C24097BvP.A00, C24352Bzn.RUSSIAN, r2);
                BE9.A1E(C24095BvN.A00, C24352Bzn.HINDI, r2);
                return AnonymousClass1D7.A0B(r2);
            case 26:
                Set entrySet = AnonymousClass3MW.A12(C24352Bzn.A01).entrySet();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(entrySet));
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(it);
                    linkedHashMap.put(A16.getValue(), A16.getKey());
                }
                return linkedHashMap;
            case 27:
                AnonymousClass4XD r0 = UnityLib.A00;
                AnonymousClass1A8.A06("unityjni");
                break;
        }
        return C27621Wu.A00;
    }
}
