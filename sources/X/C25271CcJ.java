package X;

import java.io.File;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CcJ  reason: case insensitive filesystem */
public class C25271CcJ {
    public final int A00;
    public final long A01;
    public final long A02;
    public final A5W A03;
    public final C24250By8 A04;
    public final File A05;
    public final URL A06;

    public boolean equals(Object obj) {
        URL url;
        File file;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25271CcJ ccJ = (C25271CcJ) obj;
            if (this.A02 != ccJ.A02 || this.A01 != ccJ.A01 || this.A00 != ccJ.A00) {
                return false;
            }
            File file2 = this.A05;
            if ((file2 != null || ccJ.A05 != null) && file2 != (file = ccJ.A05) && (file2 == null || !file2.equals(file))) {
                return false;
            }
            URL url2 = this.A06;
            if (!((url2 == null && ccJ.A06 == null) || url2 == (url = ccJ.A06) || (url2 != null && url2.equals(url))) || !this.A03.equals(ccJ.A03) || !this.A04.equals(ccJ.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.A05;
        objArr[1] = this.A06;
        objArr[2] = this.A03;
        C17890vO.A1O(objArr, this.A02);
        C17890vO.A1P(objArr, this.A01);
        AnonymousClass3Ma.A1U(objArr, this.A00);
        return AnonymousClass000.A0P(this.A04, objArr, 6);
    }

    public CXD A00() {
        CXD cxd = new CXD(this.A05);
        cxd.A06 = this.A06;
        cxd.A03 = this.A03;
        cxd.A02 = this.A02;
        cxd.A00 = this.A00;
        cxd.A01 = this.A01;
        cxd.A04 = this.A04;
        return cxd;
    }

    public boolean A02(boolean z) {
        File file = this.A05;
        if (file == null) {
            return false;
        }
        if (this.A02 >= 0 || C180949Oo.A00(file.getPath(), "video/mp4", z).contains("image")) {
            return true;
        }
        return false;
    }

    public C25271CcJ(CXD cxd) {
        this.A05 = cxd.A05;
        A5W a5w = cxd.A03;
        C28111Yx.A02(a5w);
        this.A03 = a5w;
        this.A02 = cxd.A02;
        this.A01 = cxd.A01;
        this.A00 = cxd.A00;
        this.A06 = cxd.A06;
        this.A04 = cxd.A04;
    }

    public JSONObject A01() {
        JSONObject A15 = C17880vN.A15();
        File file = this.A05;
        if (file != null) {
            A15.put("mSourceFile", file.getPath());
        }
        URL url = this.A06;
        if (url != null) {
            A15.put("mUrl", url.toString());
        }
        A15.put("mSourceTimeRange", this.A03.A04());
        A15.put("mPhotoDurationUs", this.A02);
        A15.put("mMediaOriginalDurationMs", this.A01);
        A15.put("mOutputFps", this.A00);
        A15.put("mInputMediaType", this.A04.name());
        return A15;
    }

    public String toString() {
        try {
            return A01().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
