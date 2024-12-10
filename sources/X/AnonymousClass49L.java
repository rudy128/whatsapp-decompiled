package X;

import com.whatsapp.settings.SettingsPrivacy;
import java.util.Map;

/* renamed from: X.49L  reason: invalid class name */
public class AnonymousClass49L extends A34 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C60112nP A01;
    public final /* synthetic */ SettingsPrivacy A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass49L(AnonymousClass1F9 r2, C60112nP r3, SettingsPrivacy settingsPrivacy, String str, Map map, int i) {
        super(r2, true);
        this.A02 = settingsPrivacy;
        this.A01 = r3;
        this.A00 = i;
        this.A04 = map;
        this.A03 = str;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        return Integer.valueOf(this.A01.A03().size());
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C18000vb r4;
        int i;
        String A0K;
        int i2;
        Number number = (Number) obj;
        int i3 = this.A00;
        int intValue = number.intValue();
        SettingsPrivacy settingsPrivacy = this.A02;
        if (i3 == 3) {
            if (intValue == 0) {
                i2 = 2131894757;
            } else {
                r4 = settingsPrivacy.A00;
                i = 2131755159;
                long j = (long) intValue;
                A0K = r4.A0K(new Object[]{number}, i, j);
                Map map = this.A04;
                String str = this.A03;
                map.put(str, A0K);
                SettingsPrivacy.A0t(settingsPrivacy, str, A0K);
            }
        } else if (intValue == 0) {
            i2 = 2131894760;
        } else {
            r4 = settingsPrivacy.A00;
            i = 2131755343;
            long j2 = (long) intValue;
            A0K = r4.A0K(new Object[]{number}, i, j2);
            Map map2 = this.A04;
            String str2 = this.A03;
            map2.put(str2, A0K);
            SettingsPrivacy.A0t(settingsPrivacy, str2, A0K);
        }
        A0K = settingsPrivacy.getString(i2);
        Map map22 = this.A04;
        String str22 = this.A03;
        map22.put(str22, A0K);
        SettingsPrivacy.A0t(settingsPrivacy, str22, A0K);
    }
}
