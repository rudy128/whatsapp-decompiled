package X;

import com.facebook.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Map;

public class BPM extends BPN {
    public final Map headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public BPM(C26115Csd csd, Map map, int i) {
        super(csd, (IOException) null, AnonymousClass001.A1I("Response code: ", AnonymousClass000.A10(), i), 2004);
        byte[] bArr = Util.A08;
        this.responseCode = i;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
